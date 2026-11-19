package com.xuexiang.xui.widget.popupwindow;

import android.content.Context;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.Utils;

/* loaded from: classes.dex */
public class PopWindow extends PopupWindow {
    private int mPopupHeight;
    private int mPopupWidth;

    public PopWindow(View view) {
        this(view, -2, -2);
    }

    public static void dismissPopWindow(PopWindow popWindow) {
        if (popWindow != null) {
            popWindow.dismiss();
        }
    }

    private void init(Context context) {
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(context.getResources().getDrawable(C2042R.drawable.xui_bg_center_popwindow));
        measurePopWindowSize();
    }

    private void initContentView(Context context, int i4, int i5, int i6) {
        setContentView(View.inflate(context, i4, null));
        setWidth(i5);
        setHeight(i6);
    }

    protected <T extends View> T findView(int i4) {
        return (T) getContentView().findViewById(i4);
    }

    public View findViewById(int i4) {
        return getContentView().findViewById(i4);
    }

    public Context getContext() {
        return getContentView().getContext();
    }

    public void measurePopWindowSize() {
        getContentView().measure(0, 0);
        this.mPopupHeight = getContentView().getMeasuredHeight();
        this.mPopupWidth = getContentView().getMeasuredWidth();
    }

    public void onClick(View view) {
        if (isShowing()) {
            dismiss();
        } else {
            showAsDropDown(view);
        }
    }

    public void onClickUp(View view) {
        if (isShowing()) {
            dismiss();
        } else {
            showUp(view);
        }
    }

    public void onClickUp2(View view) {
        if (isShowing()) {
            dismiss();
        } else {
            showUp2(view);
        }
    }

    public void showUp(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, 0, (iArr[0] + (view.getWidth() / 2)) - (this.mPopupWidth / 2), (iArr[1] - (view.getHeight() / 2)) - this.mPopupHeight);
    }

    public void showUp2(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, 0, iArr[0] - (this.mPopupWidth / 2), iArr[1] - this.mPopupHeight);
    }

    public void updatePopWindowHeight(ListView listView) {
        this.mPopupHeight = Utils.getListViewHeightBasedOnChildren(listView);
    }

    public PopWindow(Context context, int i4) {
        this(context, i4, -2, -2);
    }

    public PopWindow(View view, int i4, int i5) {
        super(view, i4, i5, false);
        init(view.getContext());
    }

    public void onClick(View view, int i4, int i5) {
        if (isShowing()) {
            dismiss();
        } else {
            showAsDropDown(view, i4, i5);
        }
    }

    public PopWindow(Context context, int i4, int i5, int i6) {
        initContentView(context, i4, i5, i6);
        init(context);
    }
}
