package br.com.fiap.api_rest.dto;

import br.com.fiap.api_rest.model.Livro;
import org.hibernate.annotations.processing.Pattern;

public class LivroRequest {
    @NotBlank(message = "O título não pode ser nulo ou vazio")
    @Size(min = 3, max = 254, message = "O título deve ser entre 3 e 254 caracteres")
    private String titulo;
    @NotBlank(message = "O autor não pode ser nulo ou vazio")
    @Size(min = 3, max = 254, message = "O autor deve ser entre 3 e 254 caracteres")
    private String autor;
    @Min(value = 1, message = "O preço deve ser no mínimo 1")
    @Max(value = 99, message = "O preço deve ser no máximo 99")
    private int preco;
    @NotNull(message = "A categoria é obrigatória")
    private Livro.Categoria categoria;
    @Pattern(regexp = "^970\\d{10}$|^970\\d{7}$")
    private String isbn;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Livro.Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Livro.Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
