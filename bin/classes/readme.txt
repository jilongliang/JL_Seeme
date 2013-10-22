
=========================================================================================
android:text="@string/userName"   text的引用
android:id="@+id/userName"		  id的引用


=========================================================================================
1)drawable-hdpi里面存放高分辨率的图片,如WVGA (480x800),FWVGA (480x854)

2)drawable-mdpi里面存放中等分辨率的图片,如HVGA (320x480)

3)drawable-ldpi里面存放低分辨率的图片,如QVGA (240x320)

系统会根据机器的分辨率来分别到这几个文件夹里面去找对应的图片。

=========================================================================================

一：布局方式的不同： 
Android手机屏幕大小不一，有480×320, 640×360, 800×480.怎样才能让App自动适应不同的屏幕呢？ 

分辨率的介绍： 
    Android手机分辨率主要有240X320、320X480、480X800、480X854几种。 分辨率一词在港台地区称之
    为解析度(个人认为解析度一词表达的更为精确)，也就是屏幕图像的精密度。分辨率越大的显示屏越清晰。 


其实很简单，只需要在res目录下创建不同的layout文件夹，比如layout-640×360,layout-800×480,所有
的layout文件在编译之后都会写入R.java里，而系统会根据屏幕的大小自己选择合适的layout进行使用。 

二：hdpi、mdpi、ldpi 

在之前的版本中，只有一个drawable，而2.1版本中有drawable-mdpi、drawable-ldpi、drawable-hdpi三个
，这三个主要是为了支持多分辨率。 
drawable- hdpi、drawable- mdpi、drawable-ldpi的区别： 
　　(1)drawable-hdpi里面存放高分辨率的图片,如WVGA (480×800),FWVGA (480×854) 
　　(2)drawable-mdpi里面存放中等分辨率的图片,如HVGA (320×480) 
　　(3)drawable-ldpi里面存放低分辨率的图片,如QVGA (240×320) 
　　     系统会根据机器的分辨率来分别到这几个文件夹里面去找对应的图片。 
　　    在开发程序时为了兼容不同平台不同屏幕，建议各自文件夹根据需求均存放不同版本图片,在每个文件夹中放
   	   置相同图片不同分辨率
   	   
=========================================================================================

人脸识别网站:http://cn.faceplusplus.com/uc/doc/toolsandsdk


引用图片
<!--  android:src="@drawable/iv_after" -->

==========================================================================================
Intent意图
	用于执行其他Activty类
	//TextView tv=new TextView(this);
	//tv.setText("系统登录界面");
	//setContentView(tv);
	
==========================================================================================
AndroidTestCase
 *  1.AndroidTestCase的单元测试类类似Junit,而Junit单元测试是继承TestCase
 *  2.单元测试类必须遵循以test开头例如:(testSave/testDelete)
 *  3.必须继承AndroidTestCase
 *  4.在测试的时候主要右键选择test开头的测试类就能执行该测试方法
 
 
 解决android.os.NetworkOnMainThreadException
 	http://my.eoe.cn/iceskysl/archive/4382.html
 	
第一种方法：直接忽视，强制使用（强烈不推荐，但是修改简单）
 	if (android.os.Build.VERSION.SDK_INT > 9) {
    	StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
  	    StrictMode.setThreadPolicy(policy);
	}
第二种方法：使用Thread、Runnable、Handler (推荐使用)
	在Runnable中做HTTP请求，不用阻塞UI线程～
	
	
	