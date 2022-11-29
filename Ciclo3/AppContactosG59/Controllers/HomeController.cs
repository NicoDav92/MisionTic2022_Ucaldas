using System.Diagnostics;
using Microsoft.AspNetCore.Mvc;
using AppContactosG59.Data; // 1 Instruccion
using AppContactosG59.Models; // 2 Instruccion
using Microsoft.EntityFrameworkCore; // 3 Instruccion

namespace AppContactosG59.Controllers;

public class HomeController : Controller
{
    private readonly AppDBContext _contexto; // 4 Instruccion

    public HomeController(AppDBContext contexto) // 5 Instruccion
    {
        _contexto = contexto;
    }

    ///  Consultar todos los registros  ////

    [HttpGet]
    public async Task<IActionResult> Index() // 6 Instruccion
    {
        return View(await _contexto.Contacto.ToListAsync());
    }

    ///  Crear un registro  ////

    public IActionResult Crear() // 7 Instruccion
    {
        return View();
    }

    [HttpPost]
    [ValidateAntiForgeryToken]
    public async Task<IActionResult> Crear(Contacto contacto) // 7 Instruccion
    {
        if (ModelState.IsValid)
        {
            _contexto.Contacto.Add(contacto); // Insert
            await _contexto.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }
        return View();
    }

    ///  Editar  ////

    [HttpGet]
    public IActionResult Editar(int? id)
    {
        if (id == null)
        {
            return NotFound();
        }

        // SELECT * FROM contacto WHERE id = 2
        var contacto = _contexto.Contacto.Find(id);

        if (contacto == null)
        {
            return NotFound();
        }

        return View(contacto);
    }

    [HttpPost]
    [ValidateAntiForgeryToken]
    public async Task<IActionResult> Editar(Contacto contacto) //
    {
        if (ModelState.IsValid)
        {
            _contexto.Contacto.Update(contacto); // Update
            await _contexto.SaveChangesAsync();
            return RedirectToAction(nameof(Index));
        }

        return View();
    }

    ///  Detalle  ////

    [HttpGet]
    public IActionResult Detalle(int? id)
    {
        if (id == null)
        {
            return NotFound();
        }

        // SELECT * FROM contacto WHERE id = 2
        var contacto = _contexto.Contacto.Find(id);

        if (contacto == null)
        {
            return NotFound();
        }

        return View(contacto);
    }

    ///  Borrar  ////

    [HttpGet]
    public IActionResult Borrar(int? id)
    {
        if (id == null)
        {
            return NotFound();
        }

        // SELECT * FROM contacto WHERE id = 2
        var contacto = _contexto.Contacto.Find(id);

        if (contacto == null)
        {
            return NotFound();
        }

        return View(contacto);
    }

    [HttpPost, ActionName("Borrar")]
    [ValidateAntiForgeryToken]
    public async Task<IActionResult> BorrarContacto(int? id)
    {
        var contacto = await _contexto.Contacto.FindAsync(id);

        if (contacto == null)
        {
            return View();
        }

        _contexto.Contacto.Remove(contacto); // Delete
        await _contexto.SaveChangesAsync();

        return RedirectToAction(nameof(Index));
    }

    ///  ----  ////

    public IActionResult Privacy()
    {
        return View();
    }

    [ResponseCache(Duration = 0, Location = ResponseCacheLocation.None, NoStore = true)]
    public IActionResult Error()
    {
        return View(
            new ErrorViewModel { RequestId = Activity.Current?.Id ?? HttpContext.TraceIdentifier }
        );
    }
}
