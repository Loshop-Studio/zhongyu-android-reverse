package com.xuexiang.xui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6798d;

/* loaded from: classes4.dex */
public class BaseDialog extends AppCompatDialog {

    /* renamed from: a */
    public View f7303a;

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public View findViewById(int i9) {
        return this.f7303a.findViewById(i9);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6798d.m6446a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }
}
