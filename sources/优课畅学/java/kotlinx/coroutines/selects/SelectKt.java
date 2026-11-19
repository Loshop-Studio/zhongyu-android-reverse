package kotlinx.coroutines.selects;

import p123h7.C8736p;
import p135i8.InterfaceC8845j;
import p191n8.C9442d0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

/* loaded from: classes5.dex */
public abstract class SelectKt {

    /* renamed from: a */
    public static final InterfaceC10575q f18153a = new InterfaceC10575q() { // from class: kotlinx.coroutines.selects.SelectKt$DUMMY_PROCESS_RESULT_FUNCTION$1
        @Override // p300x7.InterfaceC10575q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    };

    /* renamed from: b */
    public static final C9442d0 f18154b = new C9442d0("STATE_REG");

    /* renamed from: c */
    public static final C9442d0 f18155c = new C9442d0("STATE_COMPLETED");

    /* renamed from: d */
    public static final C9442d0 f18156d = new C9442d0("STATE_CANCELLED");

    /* renamed from: e */
    public static final C9442d0 f18157e = new C9442d0("NO_RESULT");

    /* renamed from: f */
    public static final C9442d0 f18158f = new C9442d0("PARAM_CLAUSE_0");

    /* renamed from: a */
    public static final TrySelectDetailedResult m16861a(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.f18160a;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.f18161b;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.f18162c;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.f18163d;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* renamed from: i */
    public static final C9442d0 m16869i() {
        return f18158f;
    }

    /* renamed from: j */
    public static final boolean m16870j(InterfaceC8845j interfaceC8845j, InterfaceC10570l interfaceC10570l) {
        Object objMo14874t = interfaceC8845j.mo14874t(C8736p.f16368a, null, interfaceC10570l);
        if (objMo14874t == null) {
            return false;
        }
        interfaceC8845j.mo14875w(objMo14874t);
        return true;
    }
}
