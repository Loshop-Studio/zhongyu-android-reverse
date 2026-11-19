package p314z;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p160l.C9230d;
import p182n.InterfaceC9357j;
import p270v.C10237b;

/* renamed from: z.a */
/* loaded from: classes3.dex */
public class C10684a implements InterfaceC10688e {

    /* renamed from: a */
    public final Bitmap.CompressFormat f21213a;

    /* renamed from: b */
    public final int f21214b;

    public C10684a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p314z.InterfaceC10688e
    /* renamed from: a */
    public InterfaceC9357j mo19979a(InterfaceC9357j interfaceC9357j, C9230d c9230d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC9357j.get()).compress(this.f21213a, this.f21214b, byteArrayOutputStream);
        interfaceC9357j.recycle();
        return new C10237b(byteArrayOutputStream.toByteArray());
    }

    public C10684a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f21213a = compressFormat;
        this.f21214b = i10;
    }
}
