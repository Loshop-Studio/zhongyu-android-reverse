package p055f0;

import java.io.File;
import p001a0.C0002b;
import p172u0.C6610b;
import p202y.C6763f;

/* renamed from: f0.c */
/* loaded from: classes2.dex */
public final class C5495c implements InterfaceC5511p {

    /* renamed from: a */
    public final /* synthetic */ int f8499a;

    /* renamed from: b */
    public final Object f8500b;

    public /* synthetic */ C5495c(Object obj, int i) {
        this.f8499a = i;
        this.f8500b = obj;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        switch (this.f8499a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        switch (this.f8499a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C5510o(new C6610b(bArr), new C5506k(1, bArr, (C5492a0) this.f8500b));
            case 1:
                return new C5510o(new C6610b(obj), new C0002b(1, obj.toString(), (C5492a0) this.f8500b));
            default:
                File file = (File) obj;
                return new C5510o(new C6610b(file), new C0002b(2, file, (C5492a0) this.f8500b));
        }
    }
}
