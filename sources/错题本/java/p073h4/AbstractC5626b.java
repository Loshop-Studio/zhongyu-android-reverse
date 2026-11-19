package p073h4;

import android.app.Application;

/* renamed from: h4.b */
/* loaded from: classes3.dex */
public abstract class AbstractC5626b {

    /* renamed from: a */
    public static final Application f8757a;

    static {
        try {
            Object objM4949i = AbstractC5625a.m4949i();
            f8757a = (Application) objM4949i.getClass().getMethod("getApplication", null).invoke(objM4949i, null);
        } catch (Throwable th) {
            throw new IllegalStateException("Can not access Application context by magic code, boom!", th);
        }
    }
}
