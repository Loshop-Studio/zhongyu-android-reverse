package com.zykj.view.board.board;

import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$5$1$1", m26211f = "BoardFragment.kt", m26212l = {445}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardFragment$initExtraClickListener$3$5$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20074c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC9544p f20075d;

    /* renamed from: e */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f20076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$5$1$1(InterfaceC9544p interfaceC9544p, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20075d = interfaceC9544p;
        this.f20076e = viewItemSketchRecordAudioBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardFragment$initExtraClickListener$3$5$1$1(this.f20075d, this.f20076e, interfaceC11588c);
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC11588c interfaceC11588c) {
        return ((BoardFragment$initExtraClickListener$3$5$1$1) create(th, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20074c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC9544p interfaceC9544p = this.f20075d;
            this.f20074c = 1;
            if (interfaceC9544p.invoke(null, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f20076e.f20717j.setEnabled(true);
        return C10786q.f26013a;
    }
}
