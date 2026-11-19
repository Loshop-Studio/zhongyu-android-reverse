package p133j6;

import androidx.compose.p013ui.text.AnnotatedString;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6.h */
/* loaded from: classes4.dex */
public final class C7804h {

    /* renamed from: a */
    public final long f13485a;

    /* renamed from: b */
    public final AbstractC7813q f13486b;

    /* renamed from: c */
    public final String f13487c;

    /* renamed from: d */
    public final boolean f13488d;

    /* renamed from: e */
    public final boolean f13489e;

    /* renamed from: f */
    public final AnnotatedString f13490f;

    /* renamed from: g */
    public final String f13491g;

    public C7804h(long j10, AbstractC7813q questionState, String name, boolean z9, boolean z10, AnnotatedString originScore, String score) {
        Intrinsics.checkNotNullParameter(questionState, "questionState");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(originScore, "originScore");
        Intrinsics.checkNotNullParameter(score, "score");
        this.f13485a = j10;
        this.f13486b = questionState;
        this.f13487c = name;
        this.f13488d = z9;
        this.f13489e = z10;
        this.f13490f = originScore;
        this.f13491g = score;
    }

    /* renamed from: a */
    public final boolean m13210a() {
        return this.f13488d;
    }

    /* renamed from: b */
    public final boolean m13211b() {
        return this.f13489e;
    }

    /* renamed from: c */
    public final String m13212c() {
        return this.f13487c;
    }

    /* renamed from: d */
    public final AnnotatedString m13213d() {
        return this.f13490f;
    }

    /* renamed from: e */
    public final long m13214e() {
        return this.f13485a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7804h)) {
            return false;
        }
        C7804h c7804h = (C7804h) obj;
        return this.f13485a == c7804h.f13485a && Intrinsics.areEqual(this.f13486b, c7804h.f13486b) && Intrinsics.areEqual(this.f13487c, c7804h.f13487c) && this.f13488d == c7804h.f13488d && this.f13489e == c7804h.f13489e && Intrinsics.areEqual(this.f13490f, c7804h.f13490f) && Intrinsics.areEqual(this.f13491g, c7804h.f13491g);
    }

    /* renamed from: f */
    public final AbstractC7813q m13215f() {
        return this.f13486b;
    }

    /* renamed from: g */
    public final String m13216g() {
        return this.f13491g;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.f13485a) * 31) + this.f13486b.hashCode()) * 31) + this.f13487c.hashCode()) * 31) + Boolean.hashCode(this.f13488d)) * 31) + Boolean.hashCode(this.f13489e)) * 31) + this.f13490f.hashCode()) * 31) + this.f13491g.hashCode();
    }

    public String toString() {
        long j10 = this.f13485a;
        AbstractC7813q abstractC7813q = this.f13486b;
        String str = this.f13487c;
        boolean z9 = this.f13488d;
        boolean z10 = this.f13489e;
        AnnotatedString annotatedString = this.f13490f;
        return "GuideQuestionState(questionId=" + j10 + ", questionState=" + abstractC7813q + ", name=" + str + ", askForHelp=" + z9 + ", microClass=" + z10 + ", originScore=" + ((Object) annotatedString) + ", score=" + this.f13491g + ")";
    }
}
