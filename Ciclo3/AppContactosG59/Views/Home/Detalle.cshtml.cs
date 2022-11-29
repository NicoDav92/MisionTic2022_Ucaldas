using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Logging;

namespace AppContactosG59.Views.Home
{
    public class Detalle : PageModel
    {
        private readonly ILogger<Detalle> _logger;

        public Detalle(ILogger<Detalle> logger)
        {
            _logger = logger;
        }

        public void OnGet()
        {
        }
    }
}