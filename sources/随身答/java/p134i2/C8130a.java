package p134i2;

/* renamed from: i2.a */
/* loaded from: classes4.dex */
public class C8130a implements InterfaceC8131b {

    /* renamed from: a */
    public static String f13901a;

    /* renamed from: b */
    public static Object f13902b = new Object();

    /* renamed from: i2.a$b */
    public static class b {

        /* renamed from: a */
        public static final C8130a f13903a = new C8130a();
    }

    /* renamed from: b */
    public static C8130a m13025b() {
        return b.f13903a;
    }

    @Override // p134i2.InterfaceC8131b
    /* renamed from: a */
    public void mo13026a(String str) {
        synchronized (f13902b) {
            f13901a = str;
        }
    }

    public C8130a() {
    }
}
