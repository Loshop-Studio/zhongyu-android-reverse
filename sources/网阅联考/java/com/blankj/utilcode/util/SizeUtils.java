package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class SizeUtils {

    public interface OnGetSizeListener {
        void onGetSize(View view);
    }

    private SizeUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static float applyDimension(float f4, int i4) {
        float f5;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (i4 == 0) {
            return f4;
        }
        if (i4 == 1) {
            f5 = displayMetrics.density;
        } else if (i4 == 2) {
            f5 = displayMetrics.scaledDensity;
        } else if (i4 == 3) {
            f4 *= displayMetrics.xdpi;
            f5 = 0.013888889f;
        } else if (i4 == 4) {
            f5 = displayMetrics.xdpi;
        } else {
            if (i4 != 5) {
                return 0.0f;
            }
            f4 *= displayMetrics.xdpi;
            f5 = 0.03937008f;
        }
        return f4 * f5;
    }

    public static int dp2px(float f4) {
        return (int) ((f4 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static void forceGetViewSize(final View view, final OnGetSizeListener onGetSizeListener) {
        view.post(new Runnable() { // from class: com.blankj.utilcode.util.SizeUtils.1
            @Override // java.lang.Runnable
            public void run() {
                OnGetSizeListener onGetSizeListener2 = onGetSizeListener;
                if (onGetSizeListener2 != null) {
                    onGetSizeListener2.onGetSize(view);
                }
            }
        });
    }

    public static int getMeasuredHeight(View view) {
        return measureView(view)[1];
    }

    public static int getMeasuredWidth(View view) {
        return measureView(view)[0];
    }

    public static int[] measureView(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i4 = layoutParams.height;
        view.measure(childMeasureSpec, i4 > 0 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static int px2dp(float f4) {
        return (int) ((f4 / Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }

    public static int px2sp(float f4) {
        return (int) ((f4 / Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    public static int sp2px(float f4) {
        return (int) ((f4 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
    }
}
