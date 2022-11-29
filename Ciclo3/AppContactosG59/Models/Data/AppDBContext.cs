using Microsoft.EntityFrameworkCore;
using AppContactosG59.Models;

namespace AppContactosG59.Data
{
    public class AppDBContext: DbContext
    {
        public AppDBContext(DbContextOptions<AppDBContext>options): base(options)
        {
            //Vacio 
        }
        public  DbSet<Contacto>? Contacto { get; set; }  
        
    }
}
