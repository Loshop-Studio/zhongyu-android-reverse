package p120i4;

import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4.c */
/* loaded from: classes4.dex */
public final class C7663c {

    /* renamed from: a */
    public final RectF f12945a;

    /* renamed from: b */
    public final RectF f12946b;

    /* renamed from: c */
    public final RectF f12947c;

    /* renamed from: d */
    public final RectF f12948d;

    /* renamed from: e */
    public final RectF f12949e;

    public C7663c(RectF editRectF, RectF writeStrokeRectF, RectF textSizeRectF, RectF colorRectF, RectF customColorRectF) {
        Intrinsics.checkNotNullParameter(editRectF, "editRectF");
        Intrinsics.checkNotNullParameter(writeStrokeRectF, "writeStrokeRectF");
        Intrinsics.checkNotNullParameter(textSizeRectF, "textSizeRectF");
        Intrinsics.checkNotNullParameter(colorRectF, "colorRectF");
        Intrinsics.checkNotNullParameter(customColorRectF, "customColorRectF");
        this.f12945a = editRectF;
        this.f12946b = writeStrokeRectF;
        this.f12947c = textSizeRectF;
        this.f12948d = colorRectF;
        this.f12949e = customColorRectF;
    }

    /* renamed from: a */
    public final RectF m12773a() {
        return this.f12948d;
    }

    /* renamed from: b */
    public final RectF m12774b() {
        return this.f12949e;
    }

    /* renamed from: c */
    public final RectF m12775c() {
        return this.f12945a;
    }

    /* renamed from: d */
    public final RectF m12776d() {
        return this.f12947c;
    }

    /* renamed from: e */
    public final RectF m12777e() {
        return this.f12946b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7663c)) {
            return false;
        }
        C7663c c7663c = (C7663c) obj;
        return Intrinsics.areEqual(this.f12945a, c7663c.f12945a) && Intrinsics.areEqual(this.f12946b, c7663c.f12946b) && Intrinsics.areEqual(this.f12947c, c7663c.f12947c) && Intrinsics.areEqual(this.f12948d, c7663c.f12948d) && Intrinsics.areEqual(this.f12949e, c7663c.f12949e);
    }

    public int hashCode() {
        return (((((((this.f12945a.hashCode() * 31) + this.f12946b.hashCode()) * 31) + this.f12947c.hashCode()) * 31) + this.f12948d.hashCode()) * 31) + this.f12949e.hashCode();
    }

    public String toString() {
        return "FunctionBackgroundRectF(editRectF=" + this.f12945a + ", writeStrokeRectF=" + this.f12946b + ", textSizeRectF=" + this.f12947c + ", colorRectF=" + this.f12948d + ", customColorRectF=" + this.f12949e + ')';
    }

    public /* synthetic */ C7663c(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new RectF() : rectF, (i10 & 2) != 0 ? new RectF() : rectF2, (i10 & 4) != 0 ? new RectF() : rectF3, (i10 & 8) != 0 ? new RectF() : rectF4, (i10 & 16) != 0 ? new RectF() : rectF5);
    }
}
