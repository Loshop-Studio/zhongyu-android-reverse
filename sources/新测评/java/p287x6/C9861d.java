package p287x6;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p267v6.AbstractC9694l0;
import p267v6.AbstractC9707x;

/* renamed from: x6.d */
/* loaded from: classes4.dex */
public final class C9861d {

    /* renamed from: a */
    public final boolean f17432a;

    /* renamed from: b */
    public final int f17433b;

    /* renamed from: c */
    public final int f17434c;

    /* renamed from: d */
    public final boolean f17435d;

    /* renamed from: e */
    public final List f17436e;

    /* renamed from: f */
    public final long f17437f;

    /* renamed from: g */
    public final String f17438g;

    public C9861d(boolean z9, int i10, int i11, boolean z10, List options, long j10, String uuid) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.f17432a = z9;
        this.f17433b = i10;
        this.f17434c = i11;
        this.f17435d = z10;
        this.f17436e = options;
        this.f17437f = j10;
        this.f17438g = uuid;
    }

    /* renamed from: b */
    public static /* synthetic */ C9861d m16529b(C9861d c9861d, boolean z9, int i10, int i11, boolean z10, List list, long j10, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z9 = c9861d.f17432a;
        }
        if ((i12 & 2) != 0) {
            i10 = c9861d.f17433b;
        }
        if ((i12 & 4) != 0) {
            i11 = c9861d.f17434c;
        }
        if ((i12 & 8) != 0) {
            z10 = c9861d.f17435d;
        }
        if ((i12 & 16) != 0) {
            list = c9861d.f17436e;
        }
        if ((i12 & 32) != 0) {
            j10 = c9861d.f17437f;
        }
        if ((i12 & 64) != 0) {
            str = c9861d.f17438g;
        }
        String str2 = str;
        long j11 = j10;
        List list2 = list;
        int i13 = i11;
        return c9861d.m16530a(z9, i10, i13, z10, list2, j11, str2);
    }

    /* renamed from: a */
    public final C9861d m16530a(boolean z9, int i10, int i11, boolean z10, List options, long j10, String uuid) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new C9861d(z9, i10, i11, z10, options, j10, uuid);
    }

    /* renamed from: c */
    public final AbstractC9707x m16531c() {
        return m16536h() ? AbstractC9707x.b.f17038c : AbstractC9707x.a.f17037c;
    }

    /* renamed from: d */
    public final String m16532d() {
        String strValueOf;
        if (this.f17432a) {
            strValueOf = this.f17433b + "." + this.f17434c;
        } else {
            strValueOf = String.valueOf(this.f17433b);
        }
        return "第" + strValueOf + "题";
    }

    /* renamed from: e */
    public final List m16533e() {
        return this.f17436e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9861d)) {
            return false;
        }
        C9861d c9861d = (C9861d) obj;
        return this.f17432a == c9861d.f17432a && this.f17433b == c9861d.f17433b && this.f17434c == c9861d.f17434c && this.f17435d == c9861d.f17435d && Intrinsics.areEqual(this.f17436e, c9861d.f17436e) && this.f17437f == c9861d.f17437f && Intrinsics.areEqual(this.f17438g, c9861d.f17438g);
    }

    /* renamed from: f */
    public final long m16534f() {
        return this.f17437f;
    }

    /* renamed from: g */
    public final String m16535g() {
        return this.f17438g;
    }

    /* renamed from: h */
    public final boolean m16536h() {
        if (!this.f17435d) {
            return false;
        }
        List list = this.f17436e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C9860c) obj).m16528d() instanceof AbstractC9694l0.b) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() > 1;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.f17432a) * 31) + Integer.hashCode(this.f17433b)) * 31) + Integer.hashCode(this.f17434c)) * 31) + Boolean.hashCode(this.f17435d)) * 31) + this.f17436e.hashCode()) * 31) + Long.hashCode(this.f17437f)) * 31) + this.f17438g.hashCode();
    }

    /* renamed from: i */
    public final boolean m16537i() {
        return this.f17435d;
    }

    public String toString() {
        return "CorrectQuestion(isMulti=" + this.f17432a + ", numericalOrder=" + this.f17433b + ", order=" + this.f17434c + ", isSingle=" + this.f17435d + ", options=" + this.f17436e + ", questionId=" + this.f17437f + ", uuid=" + this.f17438g + ")";
    }
}
