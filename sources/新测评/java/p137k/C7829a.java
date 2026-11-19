package p137k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import p030c0.AbstractC5075a;

/* renamed from: k.a */
/* loaded from: classes3.dex */
public final class C7829a implements InterfaceC7838j {

    /* renamed from: a */
    public final Bitmap f13563a;

    /* renamed from: b */
    public final boolean f13564b;

    public C7829a(Bitmap bitmap, boolean z9) {
        this.f13563a = bitmap;
        this.f13564b = z9;
    }

    @Override // p137k.InterfaceC7838j
    /* renamed from: a */
    public boolean mo13296a() {
        return this.f13564b;
    }

    /* renamed from: b */
    public final Bitmap m13297b() {
        return this.f13563a;
    }

    @Override // p137k.InterfaceC7838j
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.f13563a, 0.0f, 0.0f, (Paint) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7829a)) {
            return false;
        }
        C7829a c7829a = (C7829a) obj;
        return Intrinsics.areEqual(this.f13563a, c7829a.f13563a) && this.f13564b == c7829a.f13564b;
    }

    @Override // p137k.InterfaceC7838j
    public int getHeight() {
        return this.f13563a.getHeight();
    }

    @Override // p137k.InterfaceC7838j
    public long getSize() {
        return AbstractC5075a.m2662a(this.f13563a);
    }

    @Override // p137k.InterfaceC7838j
    public int getWidth() {
        return this.f13563a.getWidth();
    }

    public int hashCode() {
        return (this.f13563a.hashCode() * 31) + Boolean.hashCode(this.f13564b);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.f13563a + ", shareable=" + this.f13564b + ')';
    }
}
