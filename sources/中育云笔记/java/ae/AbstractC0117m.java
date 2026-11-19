package ae;

import kotlinx.coroutines.selects.TrySelectDetailedResult;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p410xd.C11839c0;
import sd.InterfaceC11125j;

/* renamed from: ae.m */
/* loaded from: classes6.dex */
public abstract class AbstractC0117m {

    /* renamed from: a */
    public static final InterfaceC9545q f128a = a.f134c;

    /* renamed from: b */
    public static final C11839c0 f129b = new C11839c0("STATE_REG");

    /* renamed from: c */
    public static final C11839c0 f130c = new C11839c0("STATE_COMPLETED");

    /* renamed from: d */
    public static final C11839c0 f131d = new C11839c0("STATE_CANCELLED");

    /* renamed from: e */
    public static final C11839c0 f132e = new C11839c0("NO_RESULT");

    /* renamed from: f */
    public static final C11839c0 f133f = new C11839c0("PARAM_CLAUSE_0");

    /* renamed from: ae.m$a */
    public static final class a implements InterfaceC9545q {

        /* renamed from: c */
        public static final a f134c = new a();

        @Override // p181hd.InterfaceC9545q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj, Object obj2, Object obj3) {
            return null;
        }
    }

    /* renamed from: a */
    public static final TrySelectDetailedResult m288a(int i10) {
        if (i10 == 0) {
            return TrySelectDetailedResult.f24033c;
        }
        if (i10 == 1) {
            return TrySelectDetailedResult.f24034d;
        }
        if (i10 == 2) {
            return TrySelectDetailedResult.f24035e;
        }
        if (i10 == 3) {
            return TrySelectDetailedResult.f24036f;
        }
        throw new IllegalStateException(("Unexpected internal result: " + i10).toString());
    }

    /* renamed from: i */
    public static final C11839c0 m296i() {
        return f133f;
    }

    /* renamed from: j */
    public static final boolean m297j(InterfaceC11125j interfaceC11125j, InterfaceC9545q interfaceC9545q) {
        Object objMo20533r = interfaceC11125j.mo20533r(C10786q.f26013a, null, interfaceC9545q);
        if (objMo20533r == null) {
            return false;
        }
        interfaceC11125j.mo20502D(objMo20533r);
        return true;
    }
}
