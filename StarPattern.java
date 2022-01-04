package assignment1;
//SquarePatter
//---------------
public class StarPattern {
int i=5;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//	}
//	}
//}

//TrianglePattern
//-----------------
//public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//}
//}

//DecreasingTriangle
//----------------------
//public static void main(String[] args) {
//	for(int i=1;i<=5;i++) {
//		for(int j=i;j<=5;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//}
//}

//RightSidedTriangle
//--------------------
public static void main(String[] args) {
	for(int i=1;i<=5;i--) {
		for(int j=i;j>5;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}