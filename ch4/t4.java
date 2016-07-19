import java.lang.Integer;
public class t4{
	public static void main(String[] args){

		// String s1 = "你是中国人";
		String s1 = args[0];
		int splitSplitLen = Integer.parseInt(args[1]);
		splitString(s1,splitSplitLen);
		
	}

	public static void splitString(String src, int splitLen){
		String splitStr;
		if(null ==src){
			System.out.println("No String input!");
		} else {
			// 源字符长度
			// (关键点)将String转换成byte字节数组
			byte bt[] = src.getBytes();
			// System.out.println(bt.length);
			//字符截半的话字节对于的ASC码是小于0的值 
	
			if(bt[splitLen]<0){
				// 对于后截半的处理
				splitLen=splitLen+1;
			}
			if(splitLen>bt.length){
				// 切的字符长度不能大于字节长度
				splitLen=bt.length;
			}
// 重新构造一个新的截断字符串
			splitStr = new String(bt,0,splitLen);
			System.out.println("splitStr = "+ splitStr);


		}
	}
}