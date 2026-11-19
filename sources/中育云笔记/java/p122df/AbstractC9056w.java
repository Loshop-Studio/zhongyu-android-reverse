package p122df;

import java.util.concurrent.Executor;
import p122df.C9030c;
import p122df.C9057x;

/* renamed from: df.w */
/* loaded from: classes6.dex */
public abstract class AbstractC9056w {

    /* renamed from: a */
    public static final Executor f21210a;

    /* renamed from: b */
    public static final C9057x f21211b;

    /* renamed from: c */
    public static final C9030c f21212c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f21210a = null;
            f21211b = new C9057x();
            f21212c = new C9030c();
        } else if (property.equals("Dalvik")) {
            f21210a = new ExecutorC9026a();
            f21211b = new C9057x.a();
            f21212c = new C9030c.a();
        } else {
            f21210a = null;
            f21211b = new C9057x.b();
            f21212c = new C9030c.a();
        }
    }
}
