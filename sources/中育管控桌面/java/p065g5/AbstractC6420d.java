package p065g5;

import androidx.collection.SieveCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import p058f5.C6361d;

/* renamed from: g5.d */
/* loaded from: classes4.dex */
public abstract class AbstractC6420d {
    /* renamed from: a */
    public static final C6361d m6942a(C6361d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new C6361d(aVar.m6649f(), aVar.m6650g(), aVar.m6646c(), -1, false, false, false, aVar.m6647d(), aVar.m6648e(), aVar.m6652i(), aVar.m6651h(), aVar.m6645b(), null);
    }

    /* renamed from: b */
    public static final int m6943b(long j6) {
        if (j6 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return (int) j6;
    }

    /* renamed from: c */
    public static final C6361d m6944c(C6361d.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        C6361d.a aVarM6655l = new C6361d.a().m6655l();
        Duration.Companion companion = Duration.INSTANCE;
        return aVarM6655l.m6653j(DurationKt.toDuration(Integer.MAX_VALUE, DurationUnit.SECONDS)).m6644a();
    }

    /* renamed from: d */
    public static final C6361d m6945d(C6361d.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new C6361d.a().m6654k().m6644a();
    }

    /* renamed from: e */
    public static final C6361d.a m6946e(C6361d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.m6656m(true);
        return aVar;
    }

    /* renamed from: f */
    public static final C6361d.a m6947f(C6361d.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.m6657n(true);
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
    public static final p058f5.C6361d m6948g(p058f5.C6361d.b r30, p058f5.C6383v r31) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p065g5.AbstractC6420d.m6948g(f5.d$b, f5.v):f5.d");
    }

    /* renamed from: h */
    public static final String m6949h(C6361d c6361d) {
        Intrinsics.checkNotNullParameter(c6361d, "<this>");
        String strM6630a = c6361d.m6630a();
        if (strM6630a != null) {
            return strM6630a;
        }
        StringBuilder sb = new StringBuilder();
        if (c6361d.m6638i()) {
            sb.append("no-cache, ");
        }
        if (c6361d.m6639j()) {
            sb.append("no-store, ");
        }
        if (c6361d.m6634e() != -1) {
            sb.append("max-age=");
            sb.append(c6361d.m6634e());
            sb.append(", ");
        }
        if (c6361d.m6642m() != -1) {
            sb.append("s-maxage=");
            sb.append(c6361d.m6642m());
            sb.append(", ");
        }
        if (c6361d.m6632c()) {
            sb.append("private, ");
        }
        if (c6361d.m6633d()) {
            sb.append("public, ");
        }
        if (c6361d.m6637h()) {
            sb.append("must-revalidate, ");
        }
        if (c6361d.m6635f() != -1) {
            sb.append("max-stale=");
            sb.append(c6361d.m6635f());
            sb.append(", ");
        }
        if (c6361d.m6636g() != -1) {
            sb.append("min-fresh=");
            sb.append(c6361d.m6636g());
            sb.append(", ");
        }
        if (c6361d.m6641l()) {
            sb.append("only-if-cached, ");
        }
        if (c6361d.m6640k()) {
            sb.append("no-transform, ");
        }
        if (c6361d.m6631b()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        Intrinsics.checkNotNullExpressionValue(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
        String string = sb.toString();
        c6361d.m6643n(string);
        return string;
    }

    /* renamed from: i */
    public static final int m6950i(String str, String str2, int i6) {
        int length = str.length();
        while (i6 < length) {
            if (StringsKt.contains$default((CharSequence) str2, str.charAt(i6), false, 2, (Object) null)) {
                return i6;
            }
            i6++;
        }
        return str.length();
    }
}
