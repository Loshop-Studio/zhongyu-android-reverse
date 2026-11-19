package com.friday.paint.view.six;

import java.io.File;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p141f2.C9167d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.paint.view.six.NewPaintFragment$copyNote$1$2$2$2$1$result$1", m26211f = "NewPaintFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class NewPaintFragment$copyNote$1$2$2$2$1$result$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f10148c;

    /* renamed from: d */
    public final /* synthetic */ File f10149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewPaintFragment$copyNote$1$2$2$2$1$result$1(File file, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f10149d = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new NewPaintFragment$copyNote$1$2$2$2$1$result$1(this.f10149d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f10148c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        C9167d c9167d = C9167d.f21407a;
        String absolutePath = this.f10149d.getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "getAbsolutePath(...)");
        return c9167d.m18066d(absolutePath);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((NewPaintFragment$copyNote$1$2$2$2$1$result$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
