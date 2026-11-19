package p115m4;

import java.io.File;
import kotlin.jvm.internal.AbstractC5830k;
import p007a6.AbstractC0018a;

/* renamed from: m4.c */
/* loaded from: classes3.dex */
public final class C6105c extends AbstractC0018a {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6106d f9747b;

    public C6105c(InterfaceC6106d interfaceC6106d) {
        this.f9747b = interfaceC6106d;
    }

    @Override // p145q5.InterfaceC6436g
    public final void onError(Throwable e) {
        AbstractC5830k.m5330g(e, "e");
        this.f9747b.mo2172d();
    }

    @Override // p145q5.InterfaceC6436g
    public final void onNext(Object obj) {
        File file = (File) obj;
        AbstractC5830k.m5330g(file, "file");
        this.f9747b.mo2171c(file);
    }

    @Override // p145q5.InterfaceC6436g
    public final void onComplete() {
    }
}
