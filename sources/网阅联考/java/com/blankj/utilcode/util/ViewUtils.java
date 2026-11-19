package com.blankj.utilcode.util;

import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;

/* loaded from: classes2.dex */
public class ViewUtils {
    public static void fixScrollViewTopping(View view) {
        view.setFocusable(false);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            childAt.setFocusable(false);
            if (childAt instanceof ViewGroup) {
                fixScrollViewTopping(childAt);
            }
        }
    }

    public static boolean isLayoutRtl() {
        return TextUtils.getLayoutDirectionFromLocale(Build.VERSION.SDK_INT >= 24 ? Utils.getApp().getResources().getConfiguration().getLocales().get(0) : Utils.getApp().getResources().getConfiguration().locale) == 1;
    }

    public static View layoutId2View(@LayoutRes int i4) {
        return ((LayoutInflater) Utils.getApp().getSystemService("layout_inflater")).inflate(i4, (ViewGroup) null);
    }

    public static void runOnUiThread(Runnable runnable) {
        UtilsBridge.runOnUiThread(runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j4) {
        UtilsBridge.runOnUiThreadDelayed(runnable, j4);
    }

    public static void setViewEnabled(View view, boolean z3) {
        setViewEnabled(view, z3, null);
    }

    public static void setViewEnabled(View view, boolean z3, View... viewArr) {
        if (view == null) {
            return;
        }
        if (viewArr != null) {
            for (View view2 : viewArr) {
                if (view == view2) {
                    return;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                setViewEnabled(viewGroup.getChildAt(i4), z3, viewArr);
            }
        }
        view.setEnabled(z3);
    }
}
