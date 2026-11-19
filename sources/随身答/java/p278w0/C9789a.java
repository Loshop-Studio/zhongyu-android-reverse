package p278w0;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p122h0.C8084d;
import p152k0.InterfaceC8259j;
import p238s0.C9464b;

/* renamed from: w0.a */
/* loaded from: classes3.dex */
public class C9789a implements InterfaceC9793e {

    /* renamed from: a */
    public final Bitmap.CompressFormat f17413a;

    /* renamed from: b */
    public final int f17414b;

    public C9789a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p278w0.InterfaceC9793e
    /* renamed from: a */
    public InterfaceC8259j mo16593a(InterfaceC8259j interfaceC8259j, C8084d c8084d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC8259j.get()).compress(this.f17413a, this.f17414b, byteArrayOutputStream);
        interfaceC8259j.recycle();
        return new C9464b(byteArrayOutputStream.toByteArray());
    }

    public C9789a(Bitmap.CompressFormat compressFormat, int i9) {
        this.f17413a = compressFormat;
        this.f17414b = i9;
    }
}
