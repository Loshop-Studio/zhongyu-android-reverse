package p102o;

import java.io.File;
import p102o.InterfaceC4410a;

/* renamed from: o.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4413d implements InterfaceC4410a.a {

    /* renamed from: a */
    public final long f4952a;

    /* renamed from: b */
    public final a f4953b;

    /* renamed from: o.d$a */
    public interface a {
        /* renamed from: a */
        File mo5503a();
    }

    public AbstractC4413d(a aVar, long j4) {
        this.f4952a = j4;
        this.f4953b = aVar;
    }

    @Override // p102o.InterfaceC4410a.a
    public InterfaceC4410a build() {
        File fileMo5503a = this.f4953b.mo5503a();
        if (fileMo5503a == null) {
            return null;
        }
        if (fileMo5503a.mkdirs() || (fileMo5503a.exists() && fileMo5503a.isDirectory())) {
            return C4414e.m5504c(fileMo5503a, this.f4952a);
        }
        return null;
    }
}
