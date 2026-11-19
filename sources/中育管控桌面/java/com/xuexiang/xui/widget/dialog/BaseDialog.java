package com.xuexiang.xui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialog;
import com.xuexiang.xui.utils.AbstractC5858f;
import com.xuexiang.xui.utils.AbstractC5861i;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC5856d;

/* loaded from: classes3.dex */
public class BaseDialog extends AppCompatDialog {

    /* renamed from: a */
    public View f4772a;

    /* renamed from: b */
    public boolean f4773b;

    /* renamed from: com.xuexiang.xui.widget.dialog.BaseDialog$a */
    public class C5881a implements AbstractC5858f.a {
        public C5881a() {
        }

        @Override // com.xuexiang.xui.utils.AbstractC5858f.a
        /* renamed from: a */
        public void mo4374a(Window window) {
            BaseDialog.this.mo4579b();
        }
    }

    /* renamed from: b */
    public void mo4579b() {
        super.show();
    }

    /* renamed from: c */
    public void m4580c(boolean z6) {
        if (!z6) {
            mo4579b();
        } else {
            if (AbstractC5858f.m4370b(AbstractC5861i.m4410a(getContext()), getWindow(), new C5881a())) {
                return;
            }
            mo4579b();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public View findViewById(int i6) {
        return this.f4772a.findViewById(i6);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC5856d.m4350a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void show() {
        m4580c(this.f4773b);
    }
}
