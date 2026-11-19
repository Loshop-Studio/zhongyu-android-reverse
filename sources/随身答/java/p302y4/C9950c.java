package p302y4;

import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y4.c */
/* loaded from: classes4.dex */
public final class C9950c {

    /* renamed from: a */
    public final RectF f17908a;

    /* renamed from: b */
    public final RectF f17909b;

    /* renamed from: c */
    public final RectF f17910c;

    /* renamed from: d */
    public final RectF f17911d;

    /* renamed from: e */
    public final RectF f17912e;

    public C9950c(RectF editRectF, RectF writeStrokeRectF, RectF textSizeRectF, RectF colorRectF, RectF customColorRectF) {
        Intrinsics.checkNotNullParameter(editRectF, "editRectF");
        Intrinsics.checkNotNullParameter(writeStrokeRectF, "writeStrokeRectF");
        Intrinsics.checkNotNullParameter(textSizeRectF, "textSizeRectF");
        Intrinsics.checkNotNullParameter(colorRectF, "colorRectF");
        Intrinsics.checkNotNullParameter(customColorRectF, "customColorRectF");
        this.f17908a = editRectF;
        this.f17909b = writeStrokeRectF;
        this.f17910c = textSizeRectF;
        this.f17911d = colorRectF;
        this.f17912e = customColorRectF;
    }

    /* renamed from: a */
    public final RectF m17195a() {
        return this.f17911d;
    }

    /* renamed from: b */
    public final RectF m17196b() {
        return this.f17912e;
    }

    /* renamed from: c */
    public final RectF m17197c() {
        return this.f17908a;
    }

    /* renamed from: d */
    public final RectF m17198d() {
        return this.f17910c;
    }

    /* renamed from: e */
    public final RectF m17199e() {
        return this.f17909b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9950c)) {
            return false;
        }
        C9950c c9950c = (C9950c) obj;
        return Intrinsics.areEqual(this.f17908a, c9950c.f17908a) && Intrinsics.areEqual(this.f17909b, c9950c.f17909b) && Intrinsics.areEqual(this.f17910c, c9950c.f17910c) && Intrinsics.areEqual(this.f17911d, c9950c.f17911d) && Intrinsics.areEqual(this.f17912e, c9950c.f17912e);
    }

    public int hashCode() {
        return (((((((this.f17908a.hashCode() * 31) + this.f17909b.hashCode()) * 31) + this.f17910c.hashCode()) * 31) + this.f17911d.hashCode()) * 31) + this.f17912e.hashCode();
    }

    public String toString() {
        return "FunctionBackgroundRectF(editRectF=" + this.f17908a + ", writeStrokeRectF=" + this.f17909b + ", textSizeRectF=" + this.f17910c + ", colorRectF=" + this.f17911d + ", customColorRectF=" + this.f17912e + ')';
    }

    public /* synthetic */ C9950c(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? new RectF() : rectF, (i9 & 2) != 0 ? new RectF() : rectF2, (i9 & 4) != 0 ? new RectF() : rectF3, (i9 & 8) != 0 ? new RectF() : rectF4, (i9 & 16) != 0 ? new RectF() : rectF5);
    }
}
