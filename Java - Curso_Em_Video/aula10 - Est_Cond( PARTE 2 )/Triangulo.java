class Triangulo{
    private int valorX;
    private int valorY;
    private int valorZ;
    private int soma;
    String sit = "";

    public Triangulo( int valorX, int valorY, int valorZ ){
        this.valorX = valorX;
        this.valorY = valorY;
        this.valorZ = valorZ;
    }

    public int getValorX(){
        return valorX;
    }
    public int getValorY(){
        return valorY;
    }
    public int getValorZ(){
        return valorZ;
    }
    public int getSoma(){
        soma = valorX + valorY + valorZ ;
        return soma;
    }
    public String getSit(){
        return sit;
    }

    public void setValorX( int valorX ) {
        this.valorX = valorX;
    }
    public void setValorY( int valorY ){
        this.valorY = valorY;
    }
    public void setValorZ( int valorZ ){
        this.valorZ = valorZ;
    }

    public void calcularTriangulo( ){
        if ( valorX == valorY && valorY == valorZ ){
            sit = "TRIÂNGULO: EQUILÁTERO";
        } else if ( valorX == valorY ||  valorX == valorZ  ||  valorZ == valorY  ) {
            sit = "TRIÂNGULO: ISÓSCELES";
        } else {
            sit = "TRIÂNGULO: ESCALENO";
        }
            System.out.println("VALOR X: " + valorX + " || VALOR Y: " + valorY + " || VALOR Z: " + valorZ );
            System.out.println( sit );
    }
}

