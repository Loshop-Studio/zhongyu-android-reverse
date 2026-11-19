package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Handler;
import android.widget.Toast;
import java.lang.reflect.Field;

/* renamed from: com.blankj.utilcode.util.w */
/* loaded from: classes2.dex */
public final class C3403w extends AbstractC3400t {
    public C3403w(C3404x c3404x) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super(c3404x);
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this.f2178a);
                Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                Handler handler = (Handler) declaredField2.get(obj);
                HandlerC3388h handlerC3388h = new HandlerC3388h();
                handlerC3388h.f2163b = handler;
                declaredField2.set(obj, handlerC3388h);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.blankj.utilcode.util.AbstractC3400t
    /* renamed from: d */
    public final void mo2354d() {
        Toast toast = this.f2178a;
        if (toast == null) {
            return;
        }
        toast.setDuration(0);
        this.f2178a.show();
    }
}
