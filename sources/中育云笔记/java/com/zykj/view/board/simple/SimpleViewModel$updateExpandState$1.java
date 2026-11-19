package com.zykj.view.board.simple;

import com.zykj.view.board.board.AbstractC8850l;
import com.zykj.view.board.board.AbstractC8856r;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.simple.SimpleViewModel$updateExpandState$1", m26211f = "SimpleViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class SimpleViewModel$updateExpandState$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20471c;

    /* renamed from: d */
    public final /* synthetic */ SimpleViewModel f20472d;

    /* renamed from: e */
    public final /* synthetic */ boolean f20473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleViewModel$updateExpandState$1(SimpleViewModel simpleViewModel, boolean z10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20472d = simpleViewModel;
        this.f20473e = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new SimpleViewModel$updateExpandState$1(this.f20472d, this.f20473e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        AbstractC11725a.m25952f();
        if (this.f20471c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11603l interfaceC11603l = this.f20472d.f20452a;
        boolean z10 = this.f20473e;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, C8887e.m17320b((C8887e) value, false, null, null, null, null, null, null, z10 ? AbstractC8850l.b.f20258b : AbstractC8850l.a.f20257b, 127, null)));
        if (!this.f20473e) {
            InterfaceC11603l interfaceC11603l2 = this.f20472d.f20452a;
            do {
                value2 = interfaceC11603l2.getValue();
            } while (!interfaceC11603l2.mo20870e(value2, C8887e.m17320b((C8887e) value2, false, null, AbstractC8856r.d.f20302e, null, null, null, null, null, 251, null)));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((SimpleViewModel$updateExpandState$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
