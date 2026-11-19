package com.zykj.view.board.board;

import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$3$1$1", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardFragment$initExtraClickListener$3$3$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20060c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9540l f20061d;

    /* renamed from: e */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f20062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$3$1$1(InterfaceC9540l interfaceC9540l, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20061d = interfaceC9540l;
        this.f20062e = viewItemSketchRecordAudioBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardFragment$initExtraClickListener$3$3$1$1(this.f20061d, this.f20062e, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((BoardFragment$initExtraClickListener$3$3$1$1) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f20060c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f20061d.invoke(null);
        this.f20062e.f20712e.setEnabled(true);
        return C10786q.f26013a;
    }
}
