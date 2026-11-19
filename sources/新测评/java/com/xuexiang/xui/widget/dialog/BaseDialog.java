package com.xuexiang.xui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialog;
import com.xuexiang.xui.utils.AbstractC6481f;
import com.xuexiang.xui.utils.AbstractC6484i;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6479d;

/* loaded from: classes4.dex */
public class BaseDialog extends AppCompatDialog {

    /* renamed from: a */
    public View f6048a;

    /* renamed from: b */
    public boolean f6049b;

    /* renamed from: com.xuexiang.xui.widget.dialog.BaseDialog$a */
    public class C6503a implements AbstractC6481f.a {
        public C6503a() {
        }

        @Override // com.xuexiang.xui.utils.AbstractC6481f.a
        /* renamed from: a */
        public void mo5369a(Window window) {
            BaseDialog.this.mo5569b();
        }
    }

    /* renamed from: b */
    public void mo5569b() {
        super.show();
    }

    /* renamed from: c */
    public void m5570c(boolean z9) {
        if (!z9) {
            mo5569b();
        } else {
            if (AbstractC6481f.m5365b(AbstractC6484i.m5404a(getContext()), getWindow(), new C6503a())) {
                return;
            }
            mo5569b();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public View findViewById(int i10) {
        return this.f6048a.findViewById(i10);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6479d.m5345a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void show() {
        m5570c(this.f6049b);
    }
}
