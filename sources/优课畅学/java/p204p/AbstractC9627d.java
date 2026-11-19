package p204p;

import java.io.File;
import p204p.InterfaceC9624a;

/* renamed from: p.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9627d implements InterfaceC9624a.a {

    /* renamed from: a */
    public final long f19249a;

    /* renamed from: b */
    public final a f19250b;

    /* renamed from: p.d$a */
    public interface a {
        /* renamed from: a */
        File mo18176a();
    }

    public AbstractC9627d(a aVar, long j10) {
        this.f19249a = j10;
        this.f19250b = aVar;
    }

    @Override // p204p.InterfaceC9624a.a
    public InterfaceC9624a build() {
        File fileMo18176a = this.f19250b.mo18176a();
        if (fileMo18176a == null) {
            return null;
        }
        if (fileMo18176a.isDirectory() || fileMo18176a.mkdirs()) {
            return C9628e.m18177c(fileMo18176a, this.f19249a);
        }
        return null;
    }
}
