package p133j6;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j6.p */
/* loaded from: classes4.dex */
public final class C7812p {

    /* renamed from: a */
    public final boolean f13510a;

    /* renamed from: b */
    public final List f13511b;

    /* renamed from: c */
    public final boolean f13512c;

    public C7812p(boolean z9, List questionGroup, boolean z10) {
        Intrinsics.checkNotNullParameter(questionGroup, "questionGroup");
        this.f13510a = z9;
        this.f13511b = questionGroup;
        this.f13512c = z10;
    }

    /* renamed from: b */
    public static /* synthetic */ C7812p m13231b(C7812p c7812p, boolean z9, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = c7812p.f13510a;
        }
        if ((i10 & 2) != 0) {
            list = c7812p.f13511b;
        }
        if ((i10 & 4) != 0) {
            z10 = c7812p.f13512c;
        }
        return c7812p.m13232a(z9, list, z10);
    }

    /* renamed from: a */
    public final C7812p m13232a(boolean z9, List questionGroup, boolean z10) {
        Intrinsics.checkNotNullParameter(questionGroup, "questionGroup");
        return new C7812p(z9, questionGroup, z10);
    }

    /* renamed from: c */
    public final List m13233c() {
        return this.f13511b;
    }

    /* renamed from: d */
    public final boolean m13234d() {
        return this.f13510a;
    }

    /* renamed from: e */
    public final boolean m13235e() {
        return this.f13512c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7812p)) {
            return false;
        }
        C7812p c7812p = (C7812p) obj;
        return this.f13510a == c7812p.f13510a && Intrinsics.areEqual(this.f13511b, c7812p.f13511b) && this.f13512c == c7812p.f13512c;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f13510a) * 31) + this.f13511b.hashCode()) * 31) + Boolean.hashCode(this.f13512c);
    }

    public String toString() {
        return "GuideViewState(isAllCompleted=" + this.f13510a + ", questionGroup=" + this.f13511b + ", isCommitFailed=" + this.f13512c + ")";
    }

    public /* synthetic */ C7812p(boolean z9, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z9, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? false : z10);
    }
}
