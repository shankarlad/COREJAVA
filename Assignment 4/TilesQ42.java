class Tile{
    private int lengthOfTile;

    Tile(int lengthOfTile){
        this.lengthOfTile = lengthOfTile; 
    }

    int area(){
        return  lengthOfTile * lengthOfTile;
    }
}

class Floor{
    private int lengthOfFloor;
    private int widthOfFloor;

    Floor(int lengthOfFloor, int widthOfFloor){
        this.lengthOfFloor = lengthOfFloor;
        this.widthOfFloor = widthOfFloor;
    }

    int totalTiles(Tile t){
        int noOfTiles;

        int area = lengthOfFloor * widthOfFloor;

        noOfTiles = area / t.area();

        return noOfTiles;
    }
}

class TilesQ42{
    public static void main(String args[]){
        Tile t = new Tile(5);
        Floor f = new Floor(10,15);

        int tTiles = f.totalTiles(t);

        System.out.println("Total tiles Required : " + tTiles);
    }
}