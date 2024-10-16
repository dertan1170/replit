class Main {
  public static void main(String[] args) {
    
    //Checkerboard
    int[][] zerosAndOnes = new int[8][8];
    for(int i=0;i<8;i++){
      for(int j=0;j<8;j++){
        if(i%2==0){
          if(j%2==0)
            zerosAndOnes[i][j]=0;
          else
            zerosAndOnes[i][j]=1;
        }
        else{
          if(j%2==0)
            zerosAndOnes[i][j]=1;
          else
            zerosAndOnes[i][j]=0;
        }
      }
    }
    for(int i=0;i<8;i++){
      for(int j=0;j<8;j++){
      System.out.print(zerosAndOnes[i][j]+" ");
      }
      System.out.println();
    }
    
    // Tic-Tac-Toe Board
    String[][] tictac = {{"x","o"," "},{"x","o","x"},{"o"," ","x"}};
    tictac[0][2]="x";
    for(int i1=0;i1<3;i1++){
      for(int j1=0;j1<3;j1++){
        if(j1<2)
          System.out.print(tictac[i1][j1]+" | ");
        else
          System.out.print(tictac[i1][j1]);
      }
      if(i1<2)
        System.out.println("\n---------");
    }
    System.out.println();
    System.out.println("Diagonal Values: "+tictac[0][0]+" "+tictac[1][1]+" "+tictac[2][2]);


    
  }
}