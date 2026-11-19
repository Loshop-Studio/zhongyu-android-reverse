package p287x;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import p172l8.C8926y;
import p172l8.InterfaceC8906e;
import p172l8.InterfaceC8907f;

/* renamed from: x.b */
/* loaded from: classes3.dex */
public final class C9846b implements InterfaceC8907f, Function1 {

    /* renamed from: a */
    public final InterfaceC8906e f17576a;

    /* renamed from: b */
    public final CancellableContinuation f17577b;

    public C9846b(InterfaceC8906e interfaceC8906e, CancellableContinuation cancellableContinuation) {
        this.f17576a = interfaceC8906e;
        this.f17577b = cancellableContinuation;
    }

    @Override // p172l8.InterfaceC8907f
    /* renamed from: a */
    public void mo2463a(InterfaceC8906e interfaceC8906e, IOException iOException) {
        if (interfaceC8906e.isCanceled()) {
            return;
        }
        CancellableContinuation cancellableContinuation = this.f17577b;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m24758constructorimpl(ResultKt.createFailure(iOException)));
    }

    @Override // p172l8.InterfaceC8907f
    /* renamed from: b */
    public void mo2464b(InterfaceC8906e interfaceC8906e, C8926y c8926y) {
        this.f17577b.resumeWith(Result.m24758constructorimpl(c8926y));
    }

    /* renamed from: c */
    public void m16784c(Throwable th) {
        try {
            this.f17576a.cancel();
        } catch (Throwable unused) {
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m16784c((Throwable) obj);
        return Unit.INSTANCE;
    }
}
