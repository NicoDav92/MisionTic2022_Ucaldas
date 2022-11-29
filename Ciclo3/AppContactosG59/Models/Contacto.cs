using System;
using System.ComponentModel.DataAnnotations;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace AppContactosG59.Models
{
    public class Contacto
    {
        [Key]    //Llave primaria 
        public int Id { get;  set; }
        [Required(ErrorMessage ="El nombre es obligatorio")] 
        public string Nombre { get;  set; }
        [Required(ErrorMessage ="El Telefono es obligatorio")] 
        public  string Telefono { get; set; }
        [Required(ErrorMessage ="El Celular es obligatorio")] 
        public string Celular  { get; set; }
        [Required(ErrorMessage ="El Celular es obligatorio")] 
        public string  Email { get; set; }

        
    }
}