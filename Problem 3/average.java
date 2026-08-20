public class average {
    public static void main(String[] args) {
        double array[]={2,3,4,5,6,12,32,15};
        int length=array.length;
        int sum=0;
        for(int i=0;i<length;i++){
            sum+=i;
        }
        double average=sum/length;
        System.out.println(average);
    }
    
}
