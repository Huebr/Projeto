package br.com.projeto.models;

public class LivroImpl implements Livro {
    private String isbn;
    private String author;
    private String title;
    private String resumo;
    private String imgUrl;
    private Double price;
    private String placeholder;


	public LivroImpl() {
    }

    public LivroImpl(String isbn, String author, String title, Double price,String resumo,String imgUrl) {
        this.isbn  = isbn;
        this.author= author;
        this.title = title;
        this.price = price;
        this.resumo= resumo;
        this.imgUrl= imgUrl;
        placeholder = "http://via.placeholder.com/600x600";
    }

    @Override
    public String getIsbn() {
        return isbn;
    }

    @Override
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

	@Override
	public String getResumo() {
		// TODO Auto-generated method stub
		return resumo;
	}

	@Override
	public void setResumo(String resumo) {
		// TODO Auto-generated method stub
		this.resumo=resumo;
	}

	@Override
	public void setImgUrl(String url) {
		this.imgUrl=url;
		
	}

	@Override
	public String getImgUrl() {
		if(imgUrl.equals("")) {
			return placeholder;
		}
		return imgUrl;
	}
}
