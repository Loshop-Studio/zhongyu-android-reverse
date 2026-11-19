package p180x;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import p058f5.C6362d0;
import p058f5.InterfaceC6363e;
import p058f5.InterfaceC6365f;

/* renamed from: x.b */
/* loaded from: classes3.dex */
public final class C7821b implements InterfaceC6365f, Function1 {

    /* renamed from: a */
    public final InterfaceC6363e f10382a;

    /* renamed from: b */
    public final CancellableContinuation f10383b;

    public C7821b(InterfaceC6363e interfaceC6363e, CancellableContinuation cancellableContinuation) {
        this.f10382a = interfaceC6363e;
        this.f10383b = cancellableContinuation;
    }

    @Override // p058f5.InterfaceC6365f
    /* renamed from: a */
    public void mo6711a(InterfaceC6363e interfaceC6363e, C6362d0 c6362d0) {
        this.f10383b.resumeWith(Result.m17183constructorimpl(c6362d0));
    }

    @Override // p058f5.InterfaceC6365f
    /* renamed from: b */
    public void mo6712b(InterfaceC6363e interfaceC6363e, IOException iOException) {
        if (interfaceC6363e.isCanceled()) {
            return;
        }
        CancellableContinuation cancellableContinuation = this.f10383b;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m17183constructorimpl(ResultKt.createFailure(iOException)));
    }

    /* renamed from: c */
    public void m9410c(Throwable th) {
        try {
            this.f10382a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m9410c((Throwable) obj);
        return Unit.INSTANCE;
    }
}
