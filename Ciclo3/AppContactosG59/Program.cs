using Microsoft.EntityFrameworkCore;
using AppContactosG59.Data; 
var builder = WebApplication.CreateBuilder(args);

//Configuramos la cadena de conexion con SQL
builder.Services.AddDbContext<AppDBContext>(opciones =>
opciones.UseSqlServer(builder.Configuration.GetConnectionString("ConnectionSqlServer"))
);

// Add services to the container.
builder.Services.AddControllersWithViews().AddRazorRuntimeCompilation();

var app = builder.Build(); 

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();
