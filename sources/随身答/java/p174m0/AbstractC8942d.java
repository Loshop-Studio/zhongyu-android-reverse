package p174m0;

import java.io.File;
import p174m0.InterfaceC8939a;

/* renamed from: m0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC8942d implements InterfaceC8939a.a {

    /* renamed from: a */
    public final long f14980a;

    /* renamed from: b */
    public final a f14981b;

    /* renamed from: m0.d$a */
    public interface a {
        /* renamed from: a */
        File mo14256a();
    }

    public AbstractC8942d(a aVar, long j9) {
        this.f14980a = j9;
        this.f14981b = aVar;
    }

    @Override // p174m0.InterfaceC8939a.a
    public InterfaceC8939a build() {
        File fileMo14256a = this.f14981b.mo14256a();
        if (fileMo14256a == null) {
            return null;
        }
        if (fileMo14256a.mkdirs() || (fileMo14256a.exists() && fileMo14256a.isDirectory())) {
            return C8943e.m14257c(fileMo14256a, this.f14980a);
        }
        return null;
    }
}
