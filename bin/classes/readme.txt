
=========================================================================================
android:text="@string/userName"   text������
android:id="@+id/userName"		  id������


=========================================================================================
1)drawable-hdpi�����Ÿ߷ֱ��ʵ�ͼƬ,��WVGA (480x800),FWVGA (480x854)

2)drawable-mdpi�������еȷֱ��ʵ�ͼƬ,��HVGA (320x480)

3)drawable-ldpi�����ŵͷֱ��ʵ�ͼƬ,��QVGA (240x320)

ϵͳ����ݻ����ķֱ������ֱ��⼸���ļ�������ȥ�Ҷ�Ӧ��ͼƬ��

=========================================================================================

һ�����ַ�ʽ�Ĳ�ͬ�� 
Android�ֻ���Ļ��С��һ����480��320, 640��360, 800��480.����������App�Զ���Ӧ��ͬ����Ļ�أ� 

�ֱ��ʵĽ��ܣ� 
    Android�ֻ��ֱ�����Ҫ��240X320��320X480��480X800��480X854���֡� �ֱ���һ���ڸ�̨������֮
    Ϊ������(������Ϊ������һ�ʱ��ĸ�Ϊ��ȷ)��Ҳ������Ļͼ��ľ��ܶȡ��ֱ���Խ�����ʾ��Խ������ 


��ʵ�ܼ򵥣�ֻ��Ҫ��resĿ¼�´�����ͬ��layout�ļ��У�����layout-640��360,layout-800��480,����
��layout�ļ��ڱ���֮�󶼻�д��R.java���ϵͳ�������Ļ�Ĵ�С�Լ�ѡ����ʵ�layout����ʹ�á� 

����hdpi��mdpi��ldpi 

��֮ǰ�İ汾�У�ֻ��һ��drawable����2.1�汾����drawable-mdpi��drawable-ldpi��drawable-hdpi����
����������Ҫ��Ϊ��֧�ֶ�ֱ��ʡ� 
drawable- hdpi��drawable- mdpi��drawable-ldpi������ 
����(1)drawable-hdpi�����Ÿ߷ֱ��ʵ�ͼƬ,��WVGA (480��800),FWVGA (480��854) 
����(2)drawable-mdpi�������еȷֱ��ʵ�ͼƬ,��HVGA (320��480) 
����(3)drawable-ldpi�����ŵͷֱ��ʵ�ͼƬ,��QVGA (240��320) 
����     ϵͳ����ݻ����ķֱ������ֱ��⼸���ļ�������ȥ�Ҷ�Ӧ��ͼƬ�� 
����    �ڿ�������ʱΪ�˼��ݲ�ͬƽ̨��ͬ��Ļ����������ļ��и����������Ų�ͬ�汾ͼƬ,��ÿ���ļ����з�
   	   ����ͬͼƬ��ͬ�ֱ���
   	   
=========================================================================================

����ʶ����վ:http://cn.faceplusplus.com/uc/doc/toolsandsdk


����ͼƬ
<!--  android:src="@drawable/iv_after" -->

==========================================================================================
Intent��ͼ
	����ִ������Activty��
	//TextView tv=new TextView(this);
	//tv.setText("ϵͳ��¼����");
	//setContentView(tv);
	
==========================================================================================
AndroidTestCase
 *  1.AndroidTestCase�ĵ�Ԫ����������Junit,��Junit��Ԫ�����Ǽ̳�TestCase
 *  2.��Ԫ�����������ѭ��test��ͷ����:(testSave/testDelete)
 *  3.����̳�AndroidTestCase
 *  4.�ڲ��Ե�ʱ����Ҫ�Ҽ�ѡ��test��ͷ�Ĳ��������ִ�иò��Է���
 
 
 ���android.os.NetworkOnMainThreadException
 	http://my.eoe.cn/iceskysl/archive/4382.html
 	
��һ�ַ�����ֱ�Ӻ��ӣ�ǿ��ʹ�ã�ǿ�Ҳ��Ƽ��������޸ļ򵥣�
 	if (android.os.Build.VERSION.SDK_INT > 9) {
    	StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
  	    StrictMode.setThreadPolicy(policy);
	}
�ڶ��ַ�����ʹ��Thread��Runnable��Handler (�Ƽ�ʹ��)
	��Runnable����HTTP���󣬲�������UI�̡߳�
	
	
	