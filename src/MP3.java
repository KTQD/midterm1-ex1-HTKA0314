class MP3 extends Item {
    private final String duration;

    // Phương thức khởi tạo với đầy đủ thuộc tính
    public MP3(String name, String description, String ID, float price, String duration) {
        super(name, description, ID, price);
        this.duration = duration;
    }
    @Override
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + getDescription());
        System.out.println("ID: " + ID);
        System.out.println("Price: " + price);
        System.out.println("Duration: " + duration);
    }
}


  
