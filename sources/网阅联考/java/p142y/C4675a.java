package p142y;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p076j.C3794d;
import p093m.InterfaceC4361j;
import p126u.C4601b;

/* renamed from: y.a */
/* loaded from: classes2.dex */
public class C4675a implements InterfaceC4679e {

    /* renamed from: a */
    public final Bitmap.CompressFormat f5988a;

    /* renamed from: b */
    public final int f5989b;

    public C4675a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p142y.InterfaceC4679e
    /* renamed from: a */
    public InterfaceC4361j mo6605a(InterfaceC4361j interfaceC4361j, C3794d c3794d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC4361j.get()).compress(this.f5988a, this.f5989b, byteArrayOutputStream);
        interfaceC4361j.recycle();
        return new C4601b(byteArrayOutputStream.toByteArray());
    }

    public C4675a(Bitmap.CompressFormat compressFormat, int i4) {
        this.f5988a = compressFormat;
        this.f5989b = i4;
    }
}
