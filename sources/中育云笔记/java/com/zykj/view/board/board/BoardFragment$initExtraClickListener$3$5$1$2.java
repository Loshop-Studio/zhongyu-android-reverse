package com.zykj.view.board.board;

import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11833h;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$5$1$2", m26211f = "BoardFragment.kt", m26212l = {441}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardFragment$initExtraClickListener$3$5$1$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20077c;

    /* renamed from: d */
    public /* synthetic */ Object f20078d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9544p f20079e;

    /* renamed from: f */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f20080f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$5$1$2(InterfaceC9544p interfaceC9544p, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20079e = interfaceC9544p;
        this.f20080f = viewItemSketchRecordAudioBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BoardFragment$initExtraClickListener$3$5$1$2 boardFragment$initExtraClickListener$3$5$1$2 = new BoardFragment$initExtraClickListener$3$5$1$2(this.f20079e, this.f20080f, interfaceC11588c);
        boardFragment$initExtraClickListener$3$5$1$2.f20078d = obj;
        return boardFragment$initExtraClickListener$3$5$1$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, InterfaceC11588c interfaceC11588c) {
        return ((BoardFragment$initExtraClickListener$3$5$1$2) create(str, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f20078d;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20077c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC9544p interfaceC9544p = this.f20079e;
            this.f20078d = AbstractC11833h.m26224a(str);
            this.f20077c = 1;
            if (interfaceC9544p.invoke(str, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        this.f20080f.f20717j.setEnabled(true);
        return C10786q.f26013a;
    }
}
