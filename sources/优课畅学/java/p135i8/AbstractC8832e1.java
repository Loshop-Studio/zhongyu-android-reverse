package p135i8;

import p191n8.C9442d0;

/* renamed from: i8.e1 */
/* loaded from: classes5.dex */
public abstract class AbstractC8832e1 {

    /* renamed from: a */
    public static final C9442d0 f16502a = new C9442d0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C9442d0 f16503b = new C9442d0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final C9442d0 f16504c = new C9442d0("COMPLETING_RETRY");

    /* renamed from: d */
    public static final C9442d0 f16505d = new C9442d0("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final C9442d0 f16506e = new C9442d0("SEALED");

    /* renamed from: f */
    public static final C8858n0 f16507f = new C8858n0(false);

    /* renamed from: g */
    public static final C8858n0 f16508g = new C8858n0(true);

    /* renamed from: g */
    public static final Object m14840g(Object obj) {
        return obj instanceof InterfaceC8882v0 ? new C8885w0((InterfaceC8882v0) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m14841h(Object obj) {
        InterfaceC8882v0 interfaceC8882v0;
        C8885w0 c8885w0 = obj instanceof C8885w0 ? (C8885w0) obj : null;
        return (c8885w0 == null || (interfaceC8882v0 = c8885w0.f16546a) == null) ? obj : interfaceC8882v0;
    }
}
