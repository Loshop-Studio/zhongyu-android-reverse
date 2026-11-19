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

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$3$1$2", m26211f = "BoardFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardFragment$initExtraClickListener$3$3$1$2 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20063c;

    /* renamed from: d */
    public /* synthetic */ Object f20064d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC9540l f20065e;

    /* renamed from: f */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f20066f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$3$1$2(InterfaceC9540l interfaceC9540l, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20065e = interfaceC9540l;
        this.f20066f = viewItemSketchRecordAudioBinding;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        BoardFragment$initExtraClickListener$3$3$1$2 boardFragment$initExtraClickListener$3$3$1$2 = new BoardFragment$initExtraClickListener$3$3$1$2(this.f20065e, this.f20066f, interfaceC11588c);
        boardFragment$initExtraClickListener$3$3$1$2.f20064d = obj;
        return boardFragment$initExtraClickListener$3$3$1$2;
    }

    @Override // p181hd.InterfaceC9544p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, InterfaceC11588c interfaceC11588c) {
        return ((BoardFragment$initExtraClickListener$3$3$1$2) create(str, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f20064d;
        AbstractC11725a.m25952f();
        if (this.f20063c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        this.f20065e.invoke(str);
        this.f20066f.f20712e.setEnabled(true);
        return C10786q.f26013a;
    }
}
