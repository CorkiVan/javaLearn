import java.lang.Double;
public class t5{
	public static void main(String[] args){

		// double d1 = 123456789.233;
		double d1 = Double.parseDouble(args[0]);
		// System.out.println(number[0]);
		// 将数字转换成人民大写数字
		conventNum(d1);
		}

		public static void conventNum(double d1){
			// 转为长整型
			long numZ = (long)d1;
			// System.out.println(numZ);
			// 这里只考虑小数点后两位的情况
			int numX =(int) Math.round((d1-numZ)*100);
			// System.out.println(numX);	
			String numZs = numZ+"";
			String str="";
			// System.out.println(numZs);
			// System.out.println(numZs.length());
			switch(numZs.length()){
				case 0:
				str = IntNum(0,numZs,numX);
				break;
				case 1://个
				str = IntNum(1,numZs,numX);
				break;
				case 2://十
				str = IntNum(2,numZs,numX);
				break;
				case 3://百
				str = IntNum(3,numZs,numX);
				break;
				case 4://千
				str = IntNum(4,numZs,numX);
				break;
				case 5://万
				str = IntNum(5,numZs,numX);
				break;
				case 6://十万
				str = IntNum(6,numZs,numX);
				break;
				case 7://百万
				str = IntNum(7,numZs,numX);
				break;
				case 8://千万
				str = IntNum(8,numZs,numX);
				break;
				case 9://亿
				str = IntNum(9,numZs,numX);
				break;
				default:
				System.out.println("输入数据有误，请重新输入！");
				break;
			}
			System.out.println(str);

	}

	public static String IntNum(int numZ,String numZs,int numX){
		String[] number = new String[]{"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
		String[] danwei = new String[]{"元","拾","佰","仟","万","十万","佰万","仟万","亿"};
		String[] xiaoshu = new String[]{"角","分"};
		String ling="";
		int lenNumzs =numZs.length();
		String str="";
		for(int i=0;i<numZ;i++){
			// 将字符转化为整型
			int num = (int)numZs.charAt(i)-48;
			String s = number[num];
			if(0==num){
				str=str+s;
			}else{
				str=str+s+danwei[lenNumzs-1];
			}
			lenNumzs=lenNumzs-1;
		}
		// 小数部分转化
		int n1 = numX/10;
		int n0 = numX%10;
		str=str+number[n1]+xiaoshu[0]+number[n0]+xiaoshu[1];
		return str;
	}
}