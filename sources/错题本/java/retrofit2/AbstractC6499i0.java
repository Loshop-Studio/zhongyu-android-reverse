package retrofit2;

/* renamed from: retrofit2.i0 */
/* loaded from: classes4.dex */
public abstract class AbstractC6499i0 {

    /* renamed from: a */
    public static final ExecutorC6482a f10702a;

    /* renamed from: b */
    public static final C6484b f10703b;

    /* renamed from: c */
    public static final C6484b f10704c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f10702a = null;
            f10703b = new C6484b(7);
            f10704c = new C6484b(6);
        } else if (property.equals("Dalvik")) {
            f10702a = new ExecutorC6482a(0);
            f10703b = new C6501j0(0);
            f10704c = new C6488d(6);
        } else {
            f10702a = null;
            f10703b = new C6501j0(1);
            f10704c = new C6488d(6);
        }
    }
}
