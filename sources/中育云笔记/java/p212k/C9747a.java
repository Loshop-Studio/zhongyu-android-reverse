package p212k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.AbstractC9979u;
import p001a0.AbstractC0003a;

/* renamed from: k.a */
/* loaded from: classes3.dex */
public final class C9747a implements InterfaceC9756j {

    /* renamed from: a */
    public final Bitmap f22911a;

    /* renamed from: b */
    public final boolean f22912b;

    public C9747a(Bitmap bitmap, boolean z10) {
        this.f22911a = bitmap;
        this.f22912b = z10;
    }

    @Override // p212k.InterfaceC9756j
    /* renamed from: a */
    public boolean mo19675a() {
        return this.f22912b;
    }

    /* renamed from: b */
    public final Bitmap m19676b() {
        return this.f22911a;
    }

    @Override // p212k.InterfaceC9756j
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.f22911a, 0.0f, 0.0f, (Paint) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9747a)) {
            return false;
        }
        C9747a c9747a = (C9747a) obj;
        return AbstractC9979u.m20289b(this.f22911a, c9747a.f22911a) && this.f22912b == c9747a.f22912b;
    }

    @Override // p212k.InterfaceC9756j
    public int getHeight() {
        return this.f22911a.getHeight();
    }

    @Override // p212k.InterfaceC9756j
    public long getSize() {
        return AbstractC0003a.m3a(this.f22911a);
    }

    @Override // p212k.InterfaceC9756j
    public int getWidth() {
        return this.f22911a.getWidth();
    }

    public int hashCode() {
        return (this.f22911a.hashCode() * 31) + Boolean.hashCode(this.f22912b);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.f22911a + ", shareable=" + this.f22912b + ')';
    }
}
