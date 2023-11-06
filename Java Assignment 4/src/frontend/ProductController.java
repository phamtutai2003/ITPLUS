package frontend;

public class ProductController {
    @GetMapping("/")
    public String showAllProducts() {
        // TODO: Implement this method to get all products from the ProductService and display them in a view
    }

    @GetMapping("/product/{id}")
    public String showProduct(@PathVariable("id") int id) {
        // TODO: Implement this method to get a product by its ID from the ProductService and display it in a view
    }

    @PostMapping("/product")
    public void saveProduct(@RequestBody Product product) {
        // TODO: Implement this method to save a product to the ProductService
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product product) {
        // TODO: Implement this method to update a product in the ProductService
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        // TODO: Implement this method to delete a product by its ID from the ProductService
    }
}
