package com.xuexiang.xui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialog;
import com.xuexiang.xui.utils.AbstractC6876f;
import com.xuexiang.xui.utils.AbstractC6879i;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6874d;

/* loaded from: classes4.dex */
public class BaseDialog extends AppCompatDialog {

    /* renamed from: a */
    public View f7429a;

    /* renamed from: b */
    public boolean f7430b;

    /* renamed from: com.xuexiang.xui.widget.dialog.BaseDialog$a */
    public class C6903a implements AbstractC6876f.a {
        public C6903a() {
        }

        @Override // com.xuexiang.xui.utils.AbstractC6876f.a
        /* renamed from: a */
        public void mo6466a(Window window) {
            BaseDialog.this.mo6702b();
        }
    }

    /* renamed from: b */
    public void mo6702b() {
        super.show();
    }

    /* renamed from: c */
    public void m6703c(boolean z10) {
        if (!z10) {
            mo6702b();
        } else {
            if (AbstractC6876f.m6462b(AbstractC6879i.m6503a(getContext()), getWindow(), new C6903a())) {
                return;
            }
            mo6702b();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public View findViewById(int i10) {
        return this.f7429a.findViewById(i10);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6432a(motionEvent, this);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public void show() {
        m6703c(this.f7430b);
    }
}
