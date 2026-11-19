package p200z5;

import java.util.concurrent.Executor;
import p200z5.C7956c;
import p200z5.C7983x;

/* renamed from: z5.w */
/* loaded from: classes4.dex */
public abstract class AbstractC7982w {

    /* renamed from: a */
    public static final Executor f10862a;

    /* renamed from: b */
    public static final C7983x f10863b;

    /* renamed from: c */
    public static final C7956c f10864c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f10862a = null;
            f10863b = new C7983x();
            f10864c = new C7956c();
        } else if (property.equals("Dalvik")) {
            f10862a = new ExecutorC7952a();
            f10863b = new C7983x.a();
            f10864c = new C7956c.a();
        } else {
            f10862a = null;
            f10863b = new C7983x.b();
            f10864c = new C7956c.a();
        }
    }
}
