package p229l0;

import java.io.File;
import p229l0.InterfaceC10094a;

/* renamed from: l0.d */
/* loaded from: classes3.dex */
public abstract class AbstractC10097d implements InterfaceC10094a.a {

    /* renamed from: a */
    public final long f24120a;

    /* renamed from: b */
    public final a f24121b;

    /* renamed from: l0.d$a */
    public interface a {
        /* renamed from: a */
        File mo21112a();
    }

    public AbstractC10097d(a aVar, long j10) {
        this.f24120a = j10;
        this.f24121b = aVar;
    }

    @Override // p229l0.InterfaceC10094a.a
    public InterfaceC10094a build() {
        File fileMo21112a = this.f24121b.mo21112a();
        if (fileMo21112a == null) {
            return null;
        }
        if (fileMo21112a.isDirectory() || fileMo21112a.mkdirs()) {
            return C10098e.m21113c(fileMo21112a, this.f24120a);
        }
        return null;
    }
}
