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

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$4$1$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardFragment$initExtraClickListener$3$4$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14850a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10570l f14851b;

    /* renamed from: c */
    public final /* synthetic */ ViewItemSketchRecordAudioBinding f14852c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$3$4$1$1(InterfaceC10570l interfaceC10570l, ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14851b = interfaceC10570l;
        this.f14852c = viewItemSketchRecordAudioBinding;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC9324c interfaceC9324c) {
        return ((BoardFragment$initExtraClickListener$3$4$1$1) create(th, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardFragment$initExtraClickListener$3$4$1$1(this.f14851b, this.f14852c, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f14850a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        this.f14851b.invoke(null);
        this.f14852c.f15504f.setEnabled(true);
        return C8736p.f16368a;
    }
}
