package darktower.solarflow.controllers;

import darktower.solarflow.entities.Invoice;
import darktower.solarflow.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @PostMapping
    public String createInvoice(@RequestBody Invoice invoiceRequest) {
        return invoiceService.createInvoice(invoiceRequest);
    }
}
