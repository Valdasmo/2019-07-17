package lt.bit.oop.op_repeat;

abstract class Building {
    private String name;
    private String address;
    private int floorCount;

    Building(){}

    public Building(String name, String address, int floorCount) {
        this.name = name;
        this.address = address;
        this.floorCount = floorCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloorCount(int floorCount) {
        this.floorCount = floorCount;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getFloorCount() {
        return floorCount;
    }

    abstract void make();
}
