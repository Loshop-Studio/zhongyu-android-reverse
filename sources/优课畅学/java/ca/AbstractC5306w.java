package ca;

import ca.C5280c;
import ca.C5307x;
import java.util.concurrent.Executor;

/* renamed from: ca.w */
/* loaded from: classes5.dex */
public abstract class AbstractC5306w {

    /* renamed from: a */
    public static final Executor f2601a;

    /* renamed from: b */
    public static final C5307x f2602b;

    /* renamed from: c */
    public static final C5280c f2603c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f2601a = null;
            f2602b = new C5307x();
            f2603c = new C5280c();
        } else if (property.equals("Dalvik")) {
            f2601a = new ExecutorC5276a();
            f2602b = new C5307x.a();
            f2603c = new C5280c.a();
        } else {
            f2601a = null;
            f2602b = new C5307x.b();
            f2603c = new C5280c.a();
        }
    }
}
