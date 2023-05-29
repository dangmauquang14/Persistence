package phonglogic.generic;

import java.util.Arrays;

/*
 *  1.	Viết chương trình thực hiện các công việc như sau :
	a.	Nhập một mảng 1 chiều tên gọi là a gồm n phần tử kiểu nguyên int.
	b.	In giá trị của các phần tử  của a.
	c.	Đếm số lượng phần tử lẻ có trong mảng a.
	d.	Tính tổng số dương lẻ của mảng a.
	e.	Nhập vào phần tử k, tìm xem k có xuất hiện trong mảng a không. Nếu có chỉ ra các vị trí của k trong mảng. (*)
	f.	Sắp sếp mảng a theo thứ tự tăng dần.
	g.	Đảo thứ tự các phần tử của mảng a (để a có thứ tự ngược lại. Đảo nội dung mảng chứ không phải in ra theo thứ tự ngược lại).
	h.	Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
	i.	Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).
	j.	Tìm giá trị lớn nhất và nhỏ nhất của mảng a. (Theo 2 cách: cách 1 dùng 2 vòng for. Cách 2 dùng 1 vòng for).
	k.	Tìm giá trị lớn nhì của mảng a. (Theo 2 cách: cách 1 dùng 2 vòng for. Cách 2 dùng 1 vòng for). (*)
	l.	Kiểm tra xem mảng a có phải là mảng đối xứng hay không. Giả định số lượng phần tử của mảng luôn là số lẻ.
	Vd: Mảng sau là mảng đối xứng {1, 2, 4, 7, 3, 7, 4, 2, 1}  đối xứng qua phần tử ở giữa.
	m.	Đếm số cặp số đối xứng trong mảng. Số lượng phần tử của mảng luôn là số lẻ.
	Vd: Mảng sau {1, 2, 8, 7, 3, 7, 4, 2, 1} có 3 cặp số đối xứng  đối xứng qua phần tử ở giữa.

 */
public class Array {
	public static void main(String[] args) {
		int[] a = {2, 3, 1, 3, 2};
		// a, b
		print(a);
		System.out.println();

		// c,d
//		int count = 0;
//		int sum = 0;
//		for(int i = 0; i < a.length; i++) {
//			if(a[i]%2 != 0) {
//				count++;
//				sum+=a[i];
//			}
//		}
//		System.out.println("Số phần tử lẻ trong mảng là: " + count);
//		System.out.println("Tổng phần tử trong mảng là: " + sum);
		
		
		//e
//		int k = 4;
//		for(int i = 0; i < a.length; i++) {
//			if(k == a[i]) {
//				System.out.print("k có tồn tại trong mảng, vị trí thứ ");
//				System.out.println(i + 1);
//			}
//		}
		
		// f. sap xep mang
//		for(int i = 0; i < a.length; i++) {
//			for(int j = 0; j < i; j++) {
//				if(a[i] < a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		for(int i = 0; i < a.length; i++) {
//			System.out.print(a[i] + " ");
//		}
		
		// g. dao nguoc mang
//		for (int j = 0; j < a.length / 2; j++) {
//		    int temp = a[j];
//		    a[j] = a[a.length - 1 - j];
//		    a[a.length - 1 - j] = temp;
//		}
//
//		for (int j = 0; j < a.length; j++) {
//		    System.out.print(a[j] + " ");
//		}
		
		// 	h.Xóa các phần tử trong mảng a có giá trị k được nhập vào từ bàn phím. (*)
//		int k = 4;
//		int[] result = new int[a.length];
//		int count = 0;
//		for(int i = 0; i < a.length; i++) {
//			if(a[i] == k) {
//				continue;
//			}
//			count++;
//			result[i] = a[i];
//		}
//		result = Arrays.copyOfRange(result, 0, count);
//		print(result);
//		print(Arrays.copyOfRange(result, 0, count));
		
		// i.Chèn 1 phần tử vào vị trí k bất kỳ (lưu ý: cần xóa bớt phần tử cuối cùng).
//		int index = 3;
//		int[] result = new int[a.length + 1];
//		for(int i = 0; i < result.length; i++) {
//			if(i < index) {
//				result[i] = a[i];
//			}else if( i == index) {
//				result[index] = 5;
//			}else {
//				result[i] = a[i - 1];
//			}
//		}
//		print(result);
//		
		
		// j.Tìm giá trị lớn nhất và nhỏ nhất của mảng a. (Theo 2 cách: cách 1 dùng 2 vòng for. Cách 2 dùng 1 vòng for).
        // Cach 1
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < a.length; i++) {
//		    if(a[i] < min) {
//		    	min = a[i];
//		    }
//		    if(a[i] > max) {
//		    	max = a[i];
//		    }
//		}
//		// Cach 2
//		for(int i = 0; i < a.length; i++) {
//			max = Math.max(max, a[i]);
//			min = Math.min(min, a[i]);
//		}
//				
//		for(int i = 0; i < a.length; i++) {
//			min = Math.min(min, a[i]);
//		}
//		
//		
//		System.out.println("Giá trị nhỏ nhất là: " + min);
//		System.out.println("Giá trị lớn nhất là: " + max);
	
	 	// k. Tìm giá trị lớn nhì của mảng a. (Theo 2 cách: cách 1 dùng 2 vòng for. Cách 2 dùng 1 vòng for). (*)
		int max = Integer.MIN_VALUE;
		int maxSecond = Integer.MIN_VALUE;
//		for (int i = 0; i < a.length; i++) {
//		    if(a[i] > max) {
//		    	max = a[i];
//		    }
//		}
//		for (int i = 0; i < a.length; i++) {
//			if(a[i] != max) {
//			    if(a[i] > maxSecond) {
//			    	maxSecond = a[i];
//			    }
//			}
//		}
		
		// cach 2
		for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < max && a[i] > maxSecond) {
            	maxSecond = a[i];
            }
        }
		System.out.println("Giá trị lớn nhì là: " + maxSecond);
		
		//	l.Kiểm tra xem mảng a có phải là mảng đối xứng hay không. Giả định số lượng phần tử của mảng luôn là số lẻ.
		boolean checkArr = true;
		for (int i = 0; i < a.length/2; i++) {
			if(a[i] != a[a.length - i - 1]) {
				checkArr = false;
				break;
			}
		}
		if(!checkArr) {
			System.out.println("a không phải là mảng đối xứng");
		} else {
			System.out.println("a là mảng đối xứng");
		}
		
		// m.Đếm số cặp số đối xứng trong mảng. Số lượng phần tử của mảng luôn là số lẻ
		int symmetry = 0;
		for (int i = 0; i < a.length/2; i++) {
			if(a[i] == a[a.length - i - 1]) {
				symmetry++;
			}
		}
		System.out.println("Số cặp đối xứng trong mảng là: " + symmetry);
	}

	public static void print(int[] a) {
//		for (int i = 0; i < a.length; i++) {
//		    System.out.print(a[i] + " ");
//		}
		System.out.println(Arrays.toString(a));
	}
}
