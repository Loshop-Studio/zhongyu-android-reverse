package com.xuexiang.xui.widget.popupwindow.easypopup;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class BaseCustomPopup extends EasyPopup {
    protected BaseCustomPopup(Context context) {
        super(context);
    }

    protected abstract void initAttributes();

    protected abstract void initViews(View view);

    @Override // com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup
    public void onPopupWindowCreated(PopupWindow popupWindow) {
        super.onPopupWindowCreated(popupWindow);
        initAttributes();
    }

    @Override // com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup
    public void onPopupWindowDismiss() {
    }

    @Override // com.xuexiang.xui.widget.popupwindow.easypopup.EasyPopup
    public void onPopupWindowViewCreated(View view) {
        initViews(view);
    }
}
