package p226r9;

import java.util.concurrent.Executor;
import p226r9.C9056c;
import p226r9.C9083x;

/* renamed from: r9.w */
/* loaded from: classes5.dex */
public abstract class AbstractC9082w {

    /* renamed from: a */
    public static final Executor f15707a;

    /* renamed from: b */
    public static final C9083x f15708b;

    /* renamed from: c */
    public static final C9056c f15709c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f15707a = null;
            f15708b = new C9083x();
            f15709c = new C9056c();
        } else if (property.equals("Dalvik")) {
            f15707a = new ExecutorC9052a();
            f15708b = new C9083x.a();
            f15709c = new C9056c.a();
        } else {
            f15707a = null;
            f15708b = new C9083x.b();
            f15709c = new C9056c.a();
        }
    }
}
