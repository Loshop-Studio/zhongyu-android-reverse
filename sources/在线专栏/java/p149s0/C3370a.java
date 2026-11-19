package p149s0;

/* renamed from: s0.a */
/* loaded from: classes.dex */
public final class C3370a implements InterfaceC3374e {

    /* renamed from: a */
    private final String f11841a;

    /* renamed from: b */
    private final Object[] f11842b;

    public C3370a(String str, Object[] objArr) {
        this.f11841a = str;
        this.f11842b = objArr;
    }

    /* renamed from: c */
    private static void m10257c(InterfaceC3373d interfaceC3373d, int i4, Object obj) {
        if (obj == null) {
            interfaceC3373d.mo3489k(i4);
            return;
        }
        if (obj instanceof byte[]) {
            interfaceC3373d.mo3486C(i4, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            interfaceC3373d.mo3490l(i4, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            interfaceC3373d.mo3490l(i4, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            interfaceC3373d.mo3491w(i4, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            interfaceC3373d.mo3491w(i4, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            interfaceC3373d.mo3491w(i4, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            interfaceC3373d.mo3491w(i4, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            interfaceC3373d.mo3488c(i4, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC3373d.mo3491w(i4, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i4 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    /* renamed from: d */
    public static void m10258d(InterfaceC3373d interfaceC3373d, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i4 = 0;
        while (i4 < length) {
            Object obj = objArr[i4];
            i4++;
            m10257c(interfaceC3373d, i4, obj);
        }
    }

    @Override // p149s0.InterfaceC3374e
    /* renamed from: a */
    public String mo10088a() {
        return this.f11841a;
    }

    @Override // p149s0.InterfaceC3374e
    /* renamed from: b */
    public void mo10089b(InterfaceC3373d interfaceC3373d) {
        m10258d(interfaceC3373d, this.f11842b);
    }

    public C3370a(String str) {
        this(str, null);
    }
}
