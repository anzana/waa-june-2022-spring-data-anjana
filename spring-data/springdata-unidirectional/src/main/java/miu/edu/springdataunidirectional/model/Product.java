package miu.edu.springdataunidirectional.model;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;
    private double rating;
    @OneToOne
    private Category category;
}""
