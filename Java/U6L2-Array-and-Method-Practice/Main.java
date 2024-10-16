/*
Group Members:
uhZ nosniW
Derek Tang
Dominic Tran
*/
class Main {
  public static void main(String[] args)
  {
    System.out.println();
    //Question #1
    int[] ques1 = {1,2,3,4,5,6,7,8,9,10};
    printIntArray(ques1);

    //Question #2
    int[] ques2 = {9,8,7,6,5,4,3,2,1,0};
    printIntArray(ques2);

    //Question #3
    int[] ques3 = {0,2,4,6,8,10,12,14,16,18,20};
    printIntArray(ques3);

    //Question #4
    int[] ques4 = {1,4,9,16,25,36,49,64,81,100};
    printIntArray(ques4);

    //Question #5
    int[] arr1 = {1, 2, 6};
    System.out.println(firstLast6(arr1));
    int[] arr2 = {6, 1, 2, 3};
    System.out.println(firstLast6(arr2));
    int[] arr3 = {13, 6, 1, 2, 3};
    System.out.println(firstLast6(arr3));   
  }

  //printIntArray Method
  public static void printIntArray(int[] arr)
  {
		for(int i = 0; i < arr.length; i++)
    {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
  }
  //Question #5 Method
  public static boolean firstLast6(int[] arr)
  {
    if(arr.length<1)
      return false;
    else if(arr[0]==6||arr[arr.length-1]==6)
      return true;
    else
      return false;
  }
}

