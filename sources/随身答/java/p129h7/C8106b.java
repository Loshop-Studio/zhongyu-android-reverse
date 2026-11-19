package p129h7;

import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h7.b */
/* loaded from: classes5.dex */
public final class C8106b {

    /* renamed from: a */
    public final RectF f13840a;

    /* renamed from: b */
    public final RectF f13841b;

    public C8106b(RectF edit, RectF delete) {
        Intrinsics.checkNotNullParameter(edit, "edit");
        Intrinsics.checkNotNullParameter(delete, "delete");
        this.f13840a = edit;
        this.f13841b = delete;
    }

    /* renamed from: a */
    public final RectF m12954a() {
        return this.f13841b;
    }

    /* renamed from: b */
    public final RectF m12955b() {
        return this.f13840a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8106b)) {
            return false;
        }
        C8106b c8106b = (C8106b) obj;
        return Intrinsics.areEqual(this.f13840a, c8106b.f13840a) && Intrinsics.areEqual(this.f13841b, c8106b.f13841b);
    }

    public int hashCode() {
        return (this.f13840a.hashCode() * 31) + this.f13841b.hashCode();
    }

    public String toString() {
        return "SelectionButtons(edit=" + this.f13840a + ", delete=" + this.f13841b + ")";
    }
}
