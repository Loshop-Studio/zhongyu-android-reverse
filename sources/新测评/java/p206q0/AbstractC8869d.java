package p206q0;

import java.io.File;
import p206q0.InterfaceC8866a;

/* renamed from: q0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC8869d implements InterfaceC8866a.a {

    /* renamed from: a */
    public final long f15076a;

    /* renamed from: b */
    public final a f15077b;

    /* renamed from: q0.d$a */
    public interface a {
        /* renamed from: a */
        File mo14874a();
    }

    public AbstractC8869d(a aVar, long j10) {
        this.f15076a = j10;
        this.f15077b = aVar;
    }

    @Override // p206q0.InterfaceC8866a.a
    public InterfaceC8866a build() {
        File fileMo14874a = this.f15077b.mo14874a();
        if (fileMo14874a == null) {
            return null;
        }
        if (fileMo14874a.isDirectory() || fileMo14874a.mkdirs()) {
            return C8870e.m14875c(fileMo14874a, this.f15076a);
        }
        return null;
    }
}
