package com.xuexiang.xui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.xuexiang.xui.utils.ViewTreeObserverOnGlobalLayoutListenerC8039e;

/* loaded from: classes5.dex */
public class BaseDialog extends AppCompatDialog {

    /* renamed from: c */
    public View f15819c;

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public View findViewById(int i10) {
        return this.f15819c.findViewById(i10);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewTreeObserverOnGlobalLayoutListenerC8039e.m12194b(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }
}
