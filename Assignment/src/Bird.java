class Bird extends Animal {
    boolean isWingsClipped = false;
    void fly() {
        if (!isWingsClipped){
            System.out.println("I am flying");
        } else {
            System.out.println("I can't fly");
        }

    }

    public void sing() {
        System.out.println("I am singing");
    }

    void setWingsClipped(Boolean isWingsClipped){
        this.isWingsClipped = isWingsClipped;
    }
}