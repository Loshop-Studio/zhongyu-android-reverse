package p087k;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import p023c0.AbstractC4455a;

/* renamed from: k.a */
/* loaded from: classes3.dex */
public final class C6602a implements InterfaceC6611j {

    /* renamed from: a */
    public final Bitmap f8640a;

    /* renamed from: b */
    public final boolean f8641b;

    public C6602a(Bitmap bitmap, boolean z6) {
        this.f8640a = bitmap;
        this.f8641b = z6;
    }

    @Override // p087k.InterfaceC6611j
    /* renamed from: a */
    public boolean mo7565a() {
        return this.f8641b;
    }

    /* renamed from: b */
    public final Bitmap m7566b() {
        return this.f8640a;
    }

    @Override // p087k.InterfaceC6611j
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.f8640a, 0.0f, 0.0f, (Paint) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6602a)) {
            return false;
        }
        C6602a c6602a = (C6602a) obj;
        return Intrinsics.areEqual(this.f8640a, c6602a.f8640a) && this.f8641b == c6602a.f8641b;
    }

    @Override // p087k.InterfaceC6611j
    public int getHeight() {
        return this.f8640a.getHeight();
    }

    @Override // p087k.InterfaceC6611j
    public long getSize() {
        return AbstractC4455a.m1519a(this.f8640a);
    }

    @Override // p087k.InterfaceC6611j
    public int getWidth() {
        return this.f8640a.getWidth();
    }

    public int hashCode() {
        return (this.f8640a.hashCode() * 31) + Boolean.hashCode(this.f8641b);
    }

    public String toString() {
        return "BitmapImage(bitmap=" + this.f8640a + ", shareable=" + this.f8641b + ')';
    }
}
