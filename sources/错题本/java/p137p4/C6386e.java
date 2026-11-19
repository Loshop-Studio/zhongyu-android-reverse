package p137p4;

import androidx.collection.AbstractC0584a;
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.view.board.play.C5353b;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5773a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p061g.AbstractC5535a;
import p118m7.AbstractC6191y0;

@StabilityInferred(parameters = 0)
@Serializable
/* renamed from: p4.e */
/* loaded from: classes3.dex */
public final class C6386e {

    @NotNull
    public static final C6385d Companion = new C6385d();

    /* renamed from: l */
    public static final InterfaceC5429e[] f10466l = {null, null, null, null, null, null, null, null, null, null, AbstractC5773a.m5116a(LazyThreadSafetyMode.PUBLICATION, new C5353b(21))};

    /* renamed from: a */
    public final int f10467a;

    /* renamed from: b */
    public final long f10468b;

    /* renamed from: c */
    public final String f10469c;

    /* renamed from: d */
    public final String f10470d;

    /* renamed from: e */
    public final String f10471e;

    /* renamed from: f */
    public final String f10472f;

    /* renamed from: g */
    public final boolean f10473g;

    /* renamed from: h */
    public final boolean f10474h;

    /* renamed from: i */
    public final boolean f10475i;

    /* renamed from: j */
    public final boolean f10476j;

    /* renamed from: k */
    public final List f10477k;

    public C6386e(int i, int i8, long j7, String str, String str2, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11, List list) {
        if (1 != (i & 1)) {
            AbstractC6191y0.m5841k(C6384c.f10465a.getDescriptor(), i, 1);
            throw null;
        }
        this.f10467a = i8;
        if ((i & 2) == 0) {
            this.f10468b = 0L;
        } else {
            this.f10468b = j7;
        }
        if ((i & 4) == 0) {
            this.f10469c = "";
        } else {
            this.f10469c = str;
        }
        if ((i & 8) == 0) {
            this.f10470d = "";
        } else {
            this.f10470d = str2;
        }
        if ((i & 16) == 0) {
            this.f10471e = "";
        } else {
            this.f10471e = str3;
        }
        if ((i & 32) == 0) {
            this.f10472f = "";
        } else {
            this.f10472f = str4;
        }
        if ((i & 64) == 0) {
            this.f10473g = false;
        } else {
            this.f10473g = z8;
        }
        if ((i & 128) == 0) {
            this.f10474h = false;
        } else {
            this.f10474h = z9;
        }
        if ((i & 256) == 0) {
            this.f10475i = true;
        } else {
            this.f10475i = z10;
        }
        if ((i & 512) == 0) {
            this.f10476j = false;
        } else {
            this.f10476j = z11;
        }
        if ((i & 1024) == 0) {
            this.f10477k = EmptyList.INSTANCE;
        } else {
            this.f10477k = list;
        }
    }

    /* renamed from: a */
    public static C6386e m6034a(C6386e c6386e, long j7, String str, String str2, String str3, String str4, ArrayList arrayList, int i) {
        int i8 = c6386e.f10467a;
        if ((i & 2) != 0) {
            j7 = c6386e.f10468b;
        }
        long j8 = j7;
        String subject = (i & 4) != 0 ? c6386e.f10469c : str;
        String examName = (i & 8) != 0 ? c6386e.f10470d : str2;
        String title = (i & 16) != 0 ? c6386e.f10471e : str3;
        String stemShoot = (i & 32) != 0 ? c6386e.f10472f : str4;
        boolean z8 = c6386e.f10473g;
        boolean z9 = c6386e.f10474h;
        boolean z10 = c6386e.f10475i;
        boolean z11 = c6386e.f10476j;
        c6386e.getClass();
        AbstractC5830k.m5330g(subject, "subject");
        AbstractC5830k.m5330g(examName, "examName");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(stemShoot, "stemShoot");
        return new C6386e(i8, j8, subject, examName, title, stemShoot, z8, z9, z10, z11, arrayList);
    }

    /* renamed from: b */
    public final String m6035b() {
        return this.f10472f;
    }

    /* renamed from: c */
    public final String m6036c() {
        return this.f10469c;
    }

    /* renamed from: d */
    public final List m6037d() {
        return this.f10477k;
    }

    /* renamed from: e */
    public final String m6038e() {
        return this.f10471e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6386e)) {
            return false;
        }
        C6386e c6386e = (C6386e) obj;
        return this.f10467a == c6386e.f10467a && this.f10468b == c6386e.f10468b && AbstractC5830k.m5325b(this.f10469c, c6386e.f10469c) && AbstractC5830k.m5325b(this.f10470d, c6386e.f10470d) && AbstractC5830k.m5325b(this.f10471e, c6386e.f10471e) && AbstractC5830k.m5325b(this.f10472f, c6386e.f10472f) && this.f10473g == c6386e.f10473g && this.f10474h == c6386e.f10474h && this.f10475i == c6386e.f10475i && this.f10476j == c6386e.f10476j && AbstractC5830k.m5325b(this.f10477k, c6386e.f10477k);
    }

    /* renamed from: f */
    public final long m6039f() {
        return this.f10468b;
    }

    public final int hashCode() {
        return this.f10477k.hashCode() + AbstractC0584a.m908i(this.f10476j, AbstractC0584a.m908i(this.f10475i, AbstractC0584a.m908i(this.f10474h, AbstractC0584a.m908i(this.f10473g, AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m903d(AbstractC0584a.m897B(this.f10468b, Integer.hashCode(this.f10467a) * 31, 31), 31, this.f10469c), 31, this.f10470d), 31, this.f10471e), 31, this.f10472f), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MistakeNavItem(itemId=");
        sb.append(this.f10467a);
        sb.append(", topicId=");
        sb.append(this.f10468b);
        AbstractC1923c.m1060x(sb, ", subject=", this.f10469c, ", examName=", this.f10470d);
        AbstractC1923c.m1060x(sb, ", title=", this.f10471e, ", stemShoot=", this.f10472f);
        AbstractC5535a.m4900g(", isCustomMistake=", ", isRelatedQstGroup=", sb, this.f10473g, this.f10474h);
        AbstractC5535a.m4900g(", hasStem=", ", isMastered=", sb, this.f10475i, this.f10476j);
        sb.append(", tags=");
        sb.append(this.f10477k);
        sb.append(")");
        return sb.toString();
    }

    public C6386e(int i, long j7, String subject, String examName, String title, String stemShoot, boolean z8, boolean z9, boolean z10, boolean z11, List tags) {
        AbstractC5830k.m5330g(subject, "subject");
        AbstractC5830k.m5330g(examName, "examName");
        AbstractC5830k.m5330g(title, "title");
        AbstractC5830k.m5330g(stemShoot, "stemShoot");
        AbstractC5830k.m5330g(tags, "tags");
        this.f10467a = i;
        this.f10468b = j7;
        this.f10469c = subject;
        this.f10470d = examName;
        this.f10471e = title;
        this.f10472f = stemShoot;
        this.f10473g = z8;
        this.f10474h = z9;
        this.f10475i = z10;
        this.f10476j = z11;
        this.f10477k = tags;
    }

    public C6386e(int i, long j7, String str, String str2, String str3, String str4, boolean z8, boolean z9, boolean z10, List list, int i8) {
        this(i, j7, str, str2, str3, str4, z8, z9, z10, false, (i8 & 1024) != 0 ? EmptyList.INSTANCE : list);
    }
}
