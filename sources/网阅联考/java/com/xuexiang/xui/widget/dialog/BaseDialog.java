package com.xuexiang.xui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AppCompatDialog;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC3529d;

/* loaded from: classes2.dex */
public class BaseDialog extends AppCompatDialog {

    /* renamed from: a */
    public View f3388a;

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public View findViewById(int i4) {
        return this.f3388a.findViewById(i4);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC3529d.m4052a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }
}
