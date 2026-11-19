package p280x;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import p011a9.C0062y;
import p011a9.InterfaceC0042e;
import p011a9.InterfaceC0043f;

/* renamed from: x.b */
/* loaded from: classes3.dex */
public final class C9825b implements InterfaceC0043f, Function1 {

    /* renamed from: a */
    public final InterfaceC0042e f17385a;

    /* renamed from: b */
    public final CancellableContinuation f17386b;

    public C9825b(InterfaceC0042e interfaceC0042e, CancellableContinuation cancellableContinuation) {
        this.f17385a = interfaceC0042e;
        this.f17386b = cancellableContinuation;
    }

    @Override // p011a9.InterfaceC0043f
    /* renamed from: a */
    public void mo110a(InterfaceC0042e interfaceC0042e, C0062y c0062y) {
        this.f17386b.resumeWith(Result.m24299constructorimpl(c0062y));
    }

    @Override // p011a9.InterfaceC0043f
    /* renamed from: b */
    public void mo111b(InterfaceC0042e interfaceC0042e, IOException iOException) {
        if (interfaceC0042e.isCanceled()) {
            return;
        }
        CancellableContinuation cancellableContinuation = this.f17386b;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m24299constructorimpl(ResultKt.createFailure(iOException)));
    }

    /* renamed from: c */
    public void m16447c(Throwable th) {
        try {
            this.f17385a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m16447c((Throwable) obj);
        return Unit.INSTANCE;
    }
}
