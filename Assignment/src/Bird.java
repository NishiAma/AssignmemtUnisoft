class Bird extends Animal {
    boolean isWingsClipped = false;
    boolean fly() {
        if (!isWingsClipped){
            System.out.println("I am flying");
            return true;
        } else {
            System.out.println("I can't fly");
            return false;
        }

    }


    void setWingsClipped(Boolean isWingsClipped){
        this.isWingsClipped = isWingsClipped;
    }
}