package p151k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import p090e0.AbstractC7803a;

/* renamed from: k.a */
/* loaded from: classes3.dex */
public final class C8230a implements InterfaceC8239j {

    /* renamed from: a */
    public final Bitmap f14298a;

    /* renamed from: b */
    public final boolean f14299b;

    public C8230a(Bitmap bitmap, boolean z9) {
        this.f14298a = bitmap;
        this.f14299b = z9;
    }

    @Override // p151k.InterfaceC8239j
    /* renamed from: a */
    public boolean mo12a() {
        return this.f14299b;
    }

    /* renamed from: b */
    public final Bitmap m13266b() {
        return this.f14298a;
    }

    @Override // p151k.InterfaceC8239j
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.f14298a, 0.0f, 0.0f, (Paint) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8230a)) {
            return false;
        }
        C8230a c8230a = (C8230a) obj;
        return Intrinsics.areEqual(this.f14298a, c8230a.f14298a) && this.f14299b == c8230a.f14299b;
    }

    @Override // p151k.InterfaceC8239j
    public int getHeight() {
        return this.f14298a.getHeight();
    }

    @Override // p151k.InterfaceC8239j
    public long getSize() {
        return AbstractC7803a.m12170a(this.f14298a);
    }

    @Override // p151k.InterfaceC8239j
    public int getWidth() {
        return this.f14298a.getWidth();
    }

    public int hashCode() {
        return (this.f14298a.hashCode() * 31) + Boolean.hashCode(this.f14299b);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.f14298a + ", shareable=" + this.f14299b + ')';
    }
}
