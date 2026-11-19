package p368v0;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p168h0.C9438e;
import p198j0.InterfaceC9657j;
import p313r0.C10833b;

/* renamed from: v0.a */
/* loaded from: classes3.dex */
public class C11403a implements InterfaceC11407e {

    /* renamed from: a */
    public final Bitmap.CompressFormat f27223a;

    /* renamed from: b */
    public final int f27224b;

    public C11403a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p368v0.InterfaceC11407e
    /* renamed from: a */
    public InterfaceC9657j mo25360a(InterfaceC9657j interfaceC9657j, C9438e c9438e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC9657j.get()).compress(this.f27223a, this.f27224b, byteArrayOutputStream);
        interfaceC9657j.recycle();
        return new C10833b(byteArrayOutputStream.toByteArray());
    }

    public C11403a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f27223a = compressFormat;
        this.f27224b = i10;
    }
}
