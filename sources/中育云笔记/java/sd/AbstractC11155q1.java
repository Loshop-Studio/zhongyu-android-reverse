package sd;

import p410xd.C11839c0;

/* renamed from: sd.q1 */
/* loaded from: classes6.dex */
public abstract class AbstractC11155q1 {

    /* renamed from: a */
    public static final C11839c0 f26814a = new C11839c0("COMPLETING_ALREADY");

    /* renamed from: b */
    public static final C11839c0 f26815b = new C11839c0("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c */
    public static final C11839c0 f26816c = new C11839c0("COMPLETING_RETRY");

    /* renamed from: d */
    public static final C11839c0 f26817d = new C11839c0("TOO_LATE_TO_CANCEL");

    /* renamed from: e */
    public static final C11839c0 f26818e = new C11839c0("SEALED");

    /* renamed from: f */
    public static final C11172w0 f26819f = new C11172w0(false);

    /* renamed from: g */
    public static final C11172w0 f26820g = new C11172w0(true);

    /* renamed from: g */
    public static final Object m24796g(Object obj) {
        return obj instanceof InterfaceC11127j1 ? new C11131k1((InterfaceC11127j1) obj) : obj;
    }

    /* renamed from: h */
    public static final Object m24797h(Object obj) {
        InterfaceC11127j1 interfaceC11127j1;
        C11131k1 c11131k1 = obj instanceof C11131k1 ? (C11131k1) obj : null;
        return (c11131k1 == null || (interfaceC11127j1 = c11131k1.f26796a) == null) ? obj : interfaceC11127j1;
    }
}
