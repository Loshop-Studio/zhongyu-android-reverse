package p076d2;

import android.annotation.SuppressLint;
import android.app.Application;

/* renamed from: d2.b */
/* loaded from: classes.dex */
public class C2453b {

    /* renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static final Application f10031a;

    static {
        try {
            Object objM8197c = C2452a.m8197c();
            f10031a = (Application) objM8197c.getClass().getMethod("getApplication", new Class[0]).invoke(objM8197c, new Object[0]);
        } catch (Throwable th) {
            throw new IllegalStateException("Can not access Application context by magic code, boom!", th);
        }
    }

    /* renamed from: a */
    public static Application m8199a() {
        return f10031a;
    }
}
