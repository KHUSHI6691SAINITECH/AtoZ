package in.iNeuron.ai;

public class Demo1 {
  public static void main(String[] args) {
    
    //loops*****
	  //A
	  int n= 5;
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<n;j++) {
			  if((j==0 && i!=0) || (j==(n-1) && i!=0) || i==(n-1)/2 || (i==0 && j!=0 && j!=(n-1))) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  //B
	  int a= 5;
	  for(int i=0;i<a;i++) {
		  for(int j=0;j<a;j++) {
			  if((j==0) || (j==(a-1) && i!=0 && i!=(a-1)) || i==(a-1)/2 || (i==0 && j!=0 && j!=(a-1)) || (i==(a-1) && j!=(a-1))) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  //C
	  int b= 5;
	  for(int i=0;i<b;i++) {
		  for(int j=0;j<b;j++) {
			  if((i==0 && j!=0) || (j==0 && i!=0 && i!=(b-1)) || (i==(b-1) && j!=0)) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  //D
	  int c= 5;
	  for(int i=0;i<c;i++) {
		  for(int j=0;j<c;j++) {
			  if((i==0 && j!=(c-1))|| j==0 || (i==(c-1) && j!=(c-1)) || (j==(c-1)&& i!=(n-1) && i!=0) ) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  //E
	  int e= 5;
	  for(int i=0;i<e;i++) {
		  for(int j=0;j<e;j++) {
			  if(i==0|| j==0 || i==(e-1) || i==(e-1)/2 ) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	//F
	  int f= 5;
	  for(int i=0;i<f;i++) {
		  for(int j=0;j<f;j++) {
			  if(i==0|| j==0 || i==(f-1)/2 ) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	//H
	  int h= 5;
	  for(int i=0;i<h;i++) {
		  for(int j=0;j<h;j++) {
			  if( j==0 || j==(h-1) || i==(h-1)/2 ) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	//I
	  int I= 5;
	  for(int i=0;i<I;i++) {
		  for(int j=0;j<I;j++) {
			  if( j==(I-1)/2 || i==(I-1) || i==0 ) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  
	//J
	  int J= 5;
	  for(int i=0;i<J;i++) {
		  for(int j=0;j<J;j++) {
			  if( i==0 || (i==(J-1)&& j<(J-1)/2 && j!=0) || j==(J-1)/2 || (i==(J-2) && j==0)  ) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	  }
	  
	  
	  
  }
}
