package p003a1;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import p162m0.C8539d;
import p184o0.InterfaceC8690j;
import p271w0.C9726b;

/* renamed from: a1.a */
/* loaded from: classes3.dex */
public class C0008a implements InterfaceC0012e {

    /* renamed from: a */
    public final Bitmap.CompressFormat f9a;

    /* renamed from: b */
    public final int f10b;

    public C0008a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // p003a1.InterfaceC0012e
    /* renamed from: a */
    public InterfaceC8690j mo16a(InterfaceC8690j interfaceC8690j, C8539d c8539d) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC8690j.get()).compress(this.f9a, this.f10b, byteArrayOutputStream);
        interfaceC8690j.recycle();
        return new C9726b(byteArrayOutputStream.toByteArray());
    }

    public C0008a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f9a = compressFormat;
        this.f10b = i10;
    }
}
