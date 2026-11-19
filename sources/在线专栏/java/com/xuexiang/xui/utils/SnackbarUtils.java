package com.xuexiang.xui.utils;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.logs.UILog;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class SnackbarUtils {
    private static final String TAG = "SnackbarUtils";
    private static WeakReference<Snackbar> mSnackbarWeakRef = null;
    private static int sColorConfirm = -11751346;
    private static int sColorDanger = -769226;
    private static int sColorInfo = -14049565;
    private static int sColorWarning = -81915;

    private SnackbarUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static SnackbarUtils Custom(View view, String str, int i4) {
        return new SnackbarUtils(new WeakReference(Snackbar.make(view, str, -1).setDuration(i4))).backColor(-13487566);
    }

    public static SnackbarUtils Indefinite(View view, String str) {
        return new SnackbarUtils(new WeakReference(Snackbar.make(view, str, -2))).backColor(-13487566);
    }

    public static SnackbarUtils Long(View view, String str) {
        return new SnackbarUtils(new WeakReference(Snackbar.make(view, str, 0))).backColor(-13487566);
    }

    public static SnackbarUtils Short(View view, String str) {
        return new SnackbarUtils(new WeakReference(Snackbar.make(view, str, -1))).backColor(-13487566);
    }

    private int calculateSnackBarHeight() {
        int iDp2px = DensityUtils.dp2px(getSnackbar().getView().getContext(), 28.0f) + DensityUtils.sp2px(getSnackbar().getView().getContext(), 14.0f);
        UILog.dTag(TAG, "直接获取MessageView高度:" + getSnackbar().getView().findViewById(C2042R.id.snackbar_text).getHeight());
        return iDp2px;
    }

    private GradientDrawable getRadiusDrawable(Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            return (GradientDrawable) drawable;
        }
        if (!(drawable instanceof ColorDrawable)) {
            return null;
        }
        int color = ((ColorDrawable) drawable).getColor();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    public static void setColorConfirm(int i4) {
        sColorConfirm = i4;
    }

    public static void setColorDanger(int i4) {
        sColorDanger = i4;
    }

    public static void setColorInfo(int i4) {
        sColorInfo = i4;
    }

    public static void setColorWarning(int i4) {
        sColorWarning = i4;
    }

    public SnackbarUtils above(View view, int i4, int i5, int i6) {
        if (getSnackbar() != null) {
            int iMax = Math.max(i5, 0);
            int iMax2 = Math.max(i6, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            UILog.dTag(TAG, "距离屏幕左侧:" + iArr[0] + "==距离屏幕顶部:" + iArr[1]);
            int iCalculateSnackBarHeight = calculateSnackBarHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("Snackbar高度:");
            sb.append(iCalculateSnackBarHeight);
            UILog.dTag(TAG, sb.toString());
            if (iArr[1] >= i4 + iCalculateSnackBarHeight) {
                gravityFrameLayout(80);
                ViewGroup.LayoutParams layoutParams = getSnackbar().getView().getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iMax, 0, iMax2, getSnackbar().getView().getResources().getDisplayMetrics().heightPixels - iArr[1]);
                getSnackbar().getView().setLayoutParams(layoutParams);
            }
        }
        return this;
    }

    public SnackbarUtils aboveCoordinatorLayout(View view, int i4, int i5, int i6) {
        if (getSnackbar() != null) {
            int iMax = Math.max(i5, 0);
            int iMax2 = Math.max(i6, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            UILog.dTag(TAG, "距离屏幕左侧:" + iArr[0] + "==距离屏幕顶部:" + iArr[1]);
            int iCalculateSnackBarHeight = calculateSnackBarHeight();
            StringBuilder sb = new StringBuilder();
            sb.append("Snackbar高度:");
            sb.append(iCalculateSnackBarHeight);
            UILog.dTag(TAG, sb.toString());
            if (iArr[1] >= i4 + iCalculateSnackBarHeight) {
                gravityCoordinatorLayout(80);
                ViewGroup.LayoutParams layoutParams = getSnackbar().getView().getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iMax, 0, iMax2, getSnackbar().getView().getResources().getDisplayMetrics().heightPixels - iArr[1]);
                getSnackbar().getView().setLayoutParams(layoutParams);
            }
        }
        return this;
    }

    public SnackbarUtils actionColor(int i4) {
        if (getSnackbar() != null) {
            ((Button) getSnackbar().getView().findViewById(C2042R.id.snackbar_action)).setTextColor(i4);
        }
        return this;
    }

    public SnackbarUtils addView(int i4, int i5) {
        return getSnackbar() != null ? addView(LayoutInflater.from(getSnackbar().getView().getContext()).inflate(i4, (ViewGroup) null), i5) : this;
    }

    public SnackbarUtils alpha(float f4) {
        if (getSnackbar() != null) {
            getSnackbar().getView().setAlpha(f4 < 1.0f ? Math.max(f4, IGoodView.DEFAULT_TO_ALPHA) : 1.0f);
        }
        return this;
    }

    public SnackbarUtils backColor(int i4) {
        if (getSnackbar() != null) {
            getSnackbar().getView().setBackgroundColor(i4);
        }
        return this;
    }

    public SnackbarUtils bellow(View view, int i4, int i5, int i6) {
        if (getSnackbar() != null) {
            int iMax = Math.max(i5, 0);
            int iMax2 = Math.max(i6, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int iCalculateSnackBarHeight = calculateSnackBarHeight();
            int screenHeight = Utils.getScreenHeight(getSnackbar().getView().getContext());
            if (iArr[1] + view.getHeight() >= i4 && iArr[1] + view.getHeight() + iCalculateSnackBarHeight + 2 <= screenHeight) {
                gravityFrameLayout(80);
                ViewGroup.LayoutParams layoutParams = getSnackbar().getView().getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iMax, 0, iMax2, screenHeight - (((iArr[1] + view.getHeight()) + iCalculateSnackBarHeight) + 2));
                getSnackbar().getView().setLayoutParams(layoutParams);
            }
        }
        return this;
    }

    public SnackbarUtils bellowCoordinatorLayout(View view, int i4, int i5, int i6) {
        if (getSnackbar() != null) {
            int iMax = Math.max(i5, 0);
            int iMax2 = Math.max(i6, 0);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int iCalculateSnackBarHeight = calculateSnackBarHeight();
            int screenHeight = Utils.getScreenHeight(getSnackbar().getView().getContext());
            if (iArr[1] + view.getHeight() >= i4 && iArr[1] + view.getHeight() + iCalculateSnackBarHeight + 2 <= screenHeight) {
                gravityCoordinatorLayout(80);
                ViewGroup.LayoutParams layoutParams = getSnackbar().getView().getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iMax, 0, iMax2, screenHeight - (((iArr[1] + view.getHeight()) + iCalculateSnackBarHeight) + 2));
                getSnackbar().getView().setLayoutParams(layoutParams);
            }
        }
        return this;
    }

    public SnackbarUtils colors(int i4, int i5, int i6) {
        if (getSnackbar() != null) {
            getSnackbar().getView().setBackgroundColor(i4);
            ((TextView) getSnackbar().getView().findViewById(C2042R.id.snackbar_text)).setTextColor(i5);
            ((Button) getSnackbar().getView().findViewById(C2042R.id.snackbar_action)).setTextColor(i6);
        }
        return this;
    }

    public SnackbarUtils confirm() {
        if (getSnackbar() != null) {
            getSnackbar().getView().setBackgroundColor(sColorConfirm);
        }
        return this;
    }

    public SnackbarUtils danger() {
        if (getSnackbar() != null) {
            getSnackbar().getView().setBackgroundColor(sColorDanger);
        }
        return this;
    }

    public Snackbar getSnackbar() {
        WeakReference<Snackbar> weakReference = mSnackbarWeakRef;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return mSnackbarWeakRef.get();
    }

    public SnackbarUtils gravityCoordinatorLayout(int i4) {
        if (getSnackbar() != null) {
            CoordinatorLayout.C0305e c0305e = new CoordinatorLayout.C0305e(getSnackbar().getView().getLayoutParams().width, getSnackbar().getView().getLayoutParams().height);
            c0305e.f2581c = i4;
            getSnackbar().getView().setLayoutParams(c0305e);
        }
        return this;
    }

    public SnackbarUtils gravityFrameLayout(int i4) {
        if (getSnackbar() != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getSnackbar().getView().getLayoutParams().width, getSnackbar().getView().getLayoutParams().height);
            layoutParams.gravity = i4;
            getSnackbar().getView().setLayoutParams(layoutParams);
        }
        return this;
    }

    public SnackbarUtils info() {
        if (getSnackbar() != null) {
            getSnackbar().getView().setBackgroundColor(sColorInfo);
        }
        return this;
    }

    public SnackbarUtils leftAndRightDrawable(Integer num, Integer num2) throws Resources.NotFoundException {
        Drawable drawable;
        if (getSnackbar() == null) {
            return this;
        }
        Drawable drawable2 = null;
        if (num != null) {
            try {
                drawable = getSnackbar().getView().getResources().getDrawable(num.intValue());
            } catch (Exception unused) {
            }
        } else {
            drawable = null;
        }
        if (num2 != null) {
            try {
                drawable2 = getSnackbar().getView().getResources().getDrawable(num2.intValue());
            } catch (Exception unused2) {
            }
        }
        return leftAndRightDrawable(drawable, drawable2);
    }

    public SnackbarUtils margins(int i4) {
        return getSnackbar() != null ? margins(i4, i4, i4, i4) : this;
    }

    @TargetApi(17)
    public SnackbarUtils messageCenter() {
        if (getSnackbar() != null) {
            TextView textView = (TextView) getSnackbar().getView().findViewById(C2042R.id.snackbar_text);
            textView.setTextAlignment(1);
            textView.setGravity(17);
        }
        return this;
    }

    public SnackbarUtils messageColor(int i4) {
        if (getSnackbar() != null) {
            ((TextView) getSnackbar().getView().findViewById(C2042R.id.snackbar_text)).setTextColor(i4);
        }
        return this;
    }

    @TargetApi(17)
    public SnackbarUtils messageRight() {
        if (getSnackbar() != null) {
            TextView textView = (TextView) getSnackbar().getView().findViewById(C2042R.id.snackbar_text);
            textView.setTextAlignment(1);
            textView.setGravity(21);
        }
        return this;
    }

    public SnackbarUtils radius(float f4) {
        GradientDrawable radiusDrawable;
        if (getSnackbar() != null && (radiusDrawable = getRadiusDrawable(getSnackbar().getView().getBackground())) != null) {
            if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
                f4 = 12.0f;
            }
            radiusDrawable.setCornerRadius(f4);
            getSnackbar().getView().setBackgroundDrawable(radiusDrawable);
        }
        return this;
    }

    public SnackbarUtils setAction(int i4, View.OnClickListener onClickListener) {
        return getSnackbar() != null ? setAction(getSnackbar().getView().getResources().getText(i4), onClickListener) : this;
    }

    public SnackbarUtils setCallback(Snackbar.Callback callback) {
        if (getSnackbar() != null) {
            getSnackbar().setCallback(callback);
        }
        return this;
    }

    public void show() {
        if (getSnackbar() != null) {
            getSnackbar().show();
        } else {
            UILog.dTag(TAG, "已经被回收");
        }
    }

    public SnackbarUtils warning() {
        if (getSnackbar() != null) {
            getSnackbar().getView().setBackgroundColor(sColorWarning);
        }
        return this;
    }

    private SnackbarUtils(WeakReference<Snackbar> weakReference) {
        mSnackbarWeakRef = weakReference;
    }

    public SnackbarUtils margins(int i4, int i5, int i6, int i7) {
        if (getSnackbar() != null) {
            ViewGroup.LayoutParams layoutParams = getSnackbar().getView().getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(i4, i5, i6, i7);
            getSnackbar().getView().setLayoutParams(layoutParams);
        }
        return this;
    }

    public SnackbarUtils setAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        if (getSnackbar() != null) {
            getSnackbar().setAction(charSequence, onClickListener);
        }
        return this;
    }

    public SnackbarUtils addView(View view, int i4) {
        if (getSnackbar() != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            view.setLayoutParams(layoutParams);
            ((SnackbarContentLayout) ((Snackbar.SnackbarLayout) getSnackbar().getView()).getChildAt(0)).addView(view, i4);
        }
        return this;
    }

    public SnackbarUtils leftAndRightDrawable(Drawable drawable, Drawable drawable2) {
        if (getSnackbar() != null) {
            TextView textView = (TextView) getSnackbar().getView().findViewById(C2042R.id.snackbar_text);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
            textView.setLayoutParams(new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height, IGoodView.DEFAULT_TO_ALPHA));
            textView.setCompoundDrawablePadding(textView.getPaddingLeft());
            int textSize = (int) textView.getTextSize();
            UILog.dTag(TAG, "textSize:" + textSize);
            if (drawable != null) {
                drawable.setBounds(0, 0, textSize, textSize);
            }
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, textSize, textSize);
            }
            textView.setCompoundDrawables(drawable, null, drawable2, null);
            ((Snackbar.SnackbarLayout) getSnackbar().getView()).addView(new Space(getSnackbar().getView().getContext()), 1, new LinearLayout.LayoutParams(-2, -2, 1.0f));
        }
        return this;
    }

    public SnackbarUtils radius(int i4, int i5, int i6) {
        GradientDrawable radiusDrawable;
        if (getSnackbar() != null && (radiusDrawable = getRadiusDrawable(getSnackbar().getView().getBackground())) != null) {
            if (i4 <= 0) {
                i4 = 12;
            }
            if (i5 <= 0) {
                i5 = 1;
            } else if (i5 >= getSnackbar().getView().findViewById(C2042R.id.snackbar_text).getPaddingTop()) {
                i5 = 2;
            }
            radiusDrawable.setCornerRadius(i4);
            radiusDrawable.setStroke(i5, i6);
            getSnackbar().getView().setBackgroundDrawable(radiusDrawable);
        }
        return this;
    }
}
