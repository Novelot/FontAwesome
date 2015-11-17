package com.novelot.fontawesome;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 字体管理
 *
 * @author V
 */
public class FontManager {

    /**
     * awesome字体
     */
    public static final String FONT_AWESOME = "fonts/fontawesome-webfont.ttf";

    /**
     * 从asset获取字体
     *
     * @param context 上下文
     * @param font    asset中的字体路径
     * @return 字体
     */
    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }

    /**
     * 递归使用指定字体
     *
     * @param v        父View
     * @param typeface 字体
     */
    public static void markAsIconContainer(View v, Typeface typeface) {
        if (v instanceof ViewGroup) {
            ViewGroup vg = (ViewGroup) v;
            for (int i = 0; i < vg.getChildCount(); i++) {
                View child = vg.getChildAt(i);
                markAsIconContainer(child, typeface);
            }
        } else if (v instanceof TextView) {
            ((TextView) v).setTypeface(typeface);
        }
    }
}