package p147j9;

import androidx.collection.SieveCacheKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.time.DurationUnit;
import p113g8.AbstractC8661c0;
import p124h8.AbstractC8740c;
import p124h8.C8738a;
import p136i9.C8902d;

/* renamed from: j9.d */
/* loaded from: classes5.dex */
public abstract class AbstractC9034d {
    /* renamed from: a */
    public static final C8902d m15700a(C8902d.a aVar) {
        AbstractC9133u.m16133g(aVar, "<this>");
        return new C8902d(aVar.m15112f(), aVar.m15113g(), aVar.m15109c(), -1, false, false, false, aVar.m15110d(), aVar.m15111e(), aVar.m15115i(), aVar.m15114h(), aVar.m15108b(), null);
    }

    /* renamed from: b */
    public static final int m15701b(long j10) {
        if (j10 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    /* renamed from: c */
    public static final C8902d m15702c(C8902d.b bVar) {
        AbstractC9133u.m16133g(bVar, "<this>");
        C8902d.a aVarM15118l = new C8902d.a().m15118l();
        C8738a.a aVar = C8738a.f16369b;
        return aVarM15118l.m15116j(AbstractC8740c.m14387s(Integer.MAX_VALUE, DurationUnit.f17530e)).m15107a();
    }

    /* renamed from: d */
    public static final C8902d m15703d(C8902d.b bVar) {
        AbstractC9133u.m16133g(bVar, "<this>");
        return new C8902d.a().m15117k().m15107a();
    }

    /* renamed from: e */
    public static final C8902d.a m15704e(C8902d.a aVar) {
        AbstractC9133u.m16133g(aVar, "<this>");
        aVar.m15119m(true);
        return aVar;
    }

    /* renamed from: f */
    public static final C8902d.a m15705f(C8902d.a aVar) {
        AbstractC9133u.m16133g(aVar, "<this>");
        aVar.m15120n(true);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p136i9.C8902d m15706g(p136i9.C8902d.b r30, p136i9.C8924v r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p147j9.AbstractC9034d.m15706g(i9.d$b, i9.v):i9.d");
    }

    /* renamed from: h */
    public static final String m15707h(C8902d c8902d) {
        AbstractC9133u.m16133g(c8902d, "<this>");
        String strM15093a = c8902d.m15093a();
        if (strM15093a != null) {
            return strM15093a;
        }
        StringBuilder sb = new StringBuilder();
        if (c8902d.m15101i()) {
            sb.append("no-cache, ");
        }
        if (c8902d.m15102j()) {
            sb.append("no-store, ");
        }
        if (c8902d.m15097e() != -1) {
            sb.append("max-age=");
            sb.append(c8902d.m15097e());
            sb.append(", ");
        }
        if (c8902d.m15105m() != -1) {
            sb.append("s-maxage=");
            sb.append(c8902d.m15105m());
            sb.append(", ");
        }
        if (c8902d.m15095c()) {
            sb.append("private, ");
        }
        if (c8902d.m15096d()) {
            sb.append("public, ");
        }
        if (c8902d.m15100h()) {
            sb.append("must-revalidate, ");
        }
        if (c8902d.m15098f() != -1) {
            sb.append("max-stale=");
            sb.append(c8902d.m15098f());
            sb.append(", ");
        }
        if (c8902d.m15099g() != -1) {
            sb.append("min-fresh=");
            sb.append(c8902d.m15099g());
            sb.append(", ");
        }
        if (c8902d.m15104l()) {
            sb.append("only-if-cached, ");
        }
        if (c8902d.m15103k()) {
            sb.append("no-transform, ");
        }
        if (c8902d.m15094b()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        AbstractC9133u.m16132f(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String string = sb.toString();
        c8902d.m15106n(string);
        return string;
    }

    /* renamed from: i */
    public static final int m15708i(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (AbstractC8661c0.m13971R(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
