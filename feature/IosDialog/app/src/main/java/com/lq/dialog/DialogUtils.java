package com.lq.dialog;

import androidx.fragment.app.FragmentManager;

import com.mylhyl.circledialog.BaseCircleDialog;
import com.mylhyl.circledialog.CircleDialog;

public class DialogUtils {


    public static BaseCircleDialog showDialog(FragmentManager manager){
       return new CircleDialog.Builder()
                .setTitle("标题")
                //标题字体颜值 0x909090 or Color.parseColor("#909090")
//                .setTitleColor(@ColorInt color)
//                .setTitleIcon(@DrawableRes icon)//标题图标
//                .configTitle(ConfigTitle)//配置标题更多的属性
                //如果 ConfigTitle 不能满足你，此监听器可以帮助你
//                .setOnCreateTitleListener(OnCreateTitleListener)
                .setSubTitle("副标题")//副标题
                //副标题字体色值 0x909090 or Color.parseColor("#909090")
//                .setSubTitleColor(@ColorInt color)
//                .configSubTitle(ConfigSubTitle)//配置标题更多的属性
                .setText("内容内容内容内容内容内容内容内容内容内")//内容
//                .setTextColor(@ColorInt color)//内容字体色值
//                .configText(ConfigText)//配置内容更多的属性
                //如果 ConfigText 不能满足你，此监听器可以帮助你
//                .setOnCreateTextListener(OnCreateTextListener)
//                .setPositive("确定", OnClickListener)
//                .configPositive(ConfigButton)//配置确定按钮更多的属性
//                .setNegative("取消", OnClickListener)
//                .configNegative(ConfigButton)//配置取消按钮更多的属性
                .setNeutral("OK", null)
               .setCancelable(false)
               .setCanceledOnTouchOutside(false)
//                .configNeutral(ConfigButton)//配置中间按钮更多的属性
                //如果 configPositive configNegative configNeutral 不能满足你，此监听器可以帮助你
//                .setOnCreateButtonListener(OnCreateButtonListener)
                .show(manager);
    }
}
