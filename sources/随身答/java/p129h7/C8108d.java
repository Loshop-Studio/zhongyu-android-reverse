package p129h7;

import androidx.core.view.ViewCompat;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h7.d */
/* loaded from: classes5.dex */
public final class C8108d {

    /* renamed from: a */
    public final boolean f13851a;

    /* renamed from: b */
    public final boolean f13852b;

    /* renamed from: c */
    public final boolean f13853c;

    /* renamed from: d */
    public final boolean f13854d;

    /* renamed from: e */
    public final boolean f13855e;

    /* renamed from: f */
    public final boolean f13856f;

    /* renamed from: g */
    public final boolean f13857g;

    /* renamed from: h */
    public final List f13858h;

    /* renamed from: i */
    public final List f13859i;

    public C8108d(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List colors, List strokeWidths) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(strokeWidths, "strokeWidths");
        this.f13851a = z9;
        this.f13852b = z10;
        this.f13853c = z11;
        this.f13854d = z12;
        this.f13855e = z13;
        this.f13856f = z14;
        this.f13857g = z15;
        this.f13858h = colors;
        this.f13859i = strokeWidths;
    }

    /* renamed from: a */
    public final boolean m12969a() {
        return this.f13855e;
    }

    /* renamed from: b */
    public final boolean m12970b() {
        return this.f13856f;
    }

    /* renamed from: c */
    public final boolean m12971c() {
        return this.f13857g;
    }

    /* renamed from: d */
    public final boolean m12972d() {
        return this.f13851a;
    }

    /* renamed from: e */
    public final boolean m12973e() {
        return this.f13854d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8108d)) {
            return false;
        }
        C8108d c8108d = (C8108d) obj;
        return this.f13851a == c8108d.f13851a && this.f13852b == c8108d.f13852b && this.f13853c == c8108d.f13853c && this.f13854d == c8108d.f13854d && this.f13855e == c8108d.f13855e && this.f13856f == c8108d.f13856f && this.f13857g == c8108d.f13857g && Intrinsics.areEqual(this.f13858h, c8108d.f13858h) && Intrinsics.areEqual(this.f13859i, c8108d.f13859i);
    }

    /* renamed from: f */
    public final boolean m12974f() {
        return this.f13852b;
    }

    /* renamed from: g */
    public final boolean m12975g() {
        return this.f13853c;
    }

    /* renamed from: h */
    public final List m12976h() {
        return this.f13858h;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f13851a) * 31) + Boolean.hashCode(this.f13852b)) * 31) + Boolean.hashCode(this.f13853c)) * 31) + Boolean.hashCode(this.f13854d)) * 31) + Boolean.hashCode(this.f13855e)) * 31) + Boolean.hashCode(this.f13856f)) * 31) + Boolean.hashCode(this.f13857g)) * 31) + this.f13858h.hashCode()) * 31) + this.f13859i.hashCode();
    }

    /* renamed from: i */
    public final List m12977i() {
        return this.f13859i;
    }

    public String toString() {
        return "SimpleBoardSelectionConfig(canMove=" + this.f13851a + ", canScale=" + this.f13852b + ", canStretch=" + this.f13853c + ", canRotate=" + this.f13854d + ", canDelete=" + this.f13855e + ", canEditColor=" + this.f13856f + ", canEditWidth=" + this.f13857g + ", colors=" + this.f13858h + ", strokeWidths=" + this.f13859i + ")";
    }

    public /* synthetic */ C8108d(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, List list, List list2, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? true : z9, (i9 & 2) != 0 ? true : z10, (i9 & 4) != 0 ? true : z11, (i9 & 8) != 0 ? true : z12, (i9 & 16) != 0 ? true : z13, (i9 & 32) != 0 ? false : z14, (i9 & 64) != 0 ? false : z15, (i9 & 128) != 0 ? CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), -15370497, -46799}) : list, (i9 & 256) != 0 ? CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f)}) : list2);
    }
}
