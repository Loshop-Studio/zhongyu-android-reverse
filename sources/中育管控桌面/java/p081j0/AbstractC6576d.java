package p081j0;

import java.io.File;
import p081j0.InterfaceC6573a;

/* renamed from: j0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6576d implements InterfaceC6573a.a {

    /* renamed from: a */
    public final long f8521a;

    /* renamed from: b */
    public final a f8522b;

    /* renamed from: j0.d$a */
    public interface a {
        /* renamed from: a */
        File mo7445a();
    }

    public AbstractC6576d(a aVar, long j6) {
        this.f8521a = j6;
        this.f8522b = aVar;
    }

    @Override // p081j0.InterfaceC6573a.a
    public InterfaceC6573a build() {
        File fileMo7445a = this.f8522b.mo7445a();
        if (fileMo7445a == null) {
            return null;
        }
        if (fileMo7445a.isDirectory() || fileMo7445a.mkdirs()) {
            return C6577e.m7446c(fileMo7445a, this.f8521a);
        }
        return null;
    }
}
