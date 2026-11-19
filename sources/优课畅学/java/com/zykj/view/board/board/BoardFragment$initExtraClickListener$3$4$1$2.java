package com.zykj.view.board.board;

import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$4$1$2", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardFragment$initExtraClickListener$3$4$1$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14853a;

    /* renamed from: b */
    public /* synthetic */ Object f14854b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10570l f14855c;

    /* renamed from: d */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f14856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$4$1$2(InterfaceC10570l interfaceC10570l, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14855c = interfaceC10570l;
        this.f14856d = viewItemSketchRecordAudioBinding;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, InterfaceC9324c interfaceC9324c) {
        return ((BoardFragment$initExtraClickListener$3$4$1$2) create(str, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BoardFragment$initExtraClickListener$3$4$1$2 boardFragment$initExtraClickListener$3$4$1$2 = new BoardFragment$initExtraClickListener$3$4$1$2(this.f14855c, this.f14856d, interfaceC9324c);
        boardFragment$initExtraClickListener$3$4$1$2.f14854b = obj;
        return boardFragment$initExtraClickListener$3$4$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f14854b;
        AbstractC9434a.m17291f();
        if (this.f14853a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        this.f14855c.invoke(str);
        this.f14856d.f15504f.setEnabled(true);
        return C8736p.f16368a;
    }
}
