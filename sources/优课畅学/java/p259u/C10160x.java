package p259u;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import p116h0.AbstractC8697a;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;

/* renamed from: u.x */
/* loaded from: classes3.dex */
public final class C10160x implements InterfaceC9231e {

    /* renamed from: a */
    public final C10140e f20284a = new C10140e();

    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(InputStream inputStream, int i10, int i11, C9230d c9230d) {
        return this.f20284a.m18994c(ImageDecoder.createSource(AbstractC8697a.m14149b(inputStream)), i10, i11, c9230d);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(InputStream inputStream, C9230d c9230d) {
        return true;
    }
}
