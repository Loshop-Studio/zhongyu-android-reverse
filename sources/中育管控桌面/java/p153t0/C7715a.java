package p153t0;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p053f0.C6285d;
import p067h0.InterfaceC6440j;
import p125p0.C7589b;

/* renamed from: t0.a */
/* loaded from: classes3.dex */
public class C7715a implements InterfaceC7719e {

    /* renamed from: a */
    public final Bitmap.CompressFormat f10194a;

    /* renamed from: b */
    public final int f10195b;

    public C7715a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p153t0.InterfaceC7719e
    /* renamed from: a */
    public InterfaceC6440j mo7679a(InterfaceC6440j interfaceC6440j, C6285d c6285d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC6440j.get()).compress(this.f10194a, this.f10195b, byteArrayOutputStream);
        interfaceC6440j.recycle();
        return new C7589b(byteArrayOutputStream.toByteArray());
    }

    public C7715a(Bitmap.CompressFormat compressFormat, int i6) {
        this.f10194a = compressFormat;
        this.f10195b = i6;
    }
}
