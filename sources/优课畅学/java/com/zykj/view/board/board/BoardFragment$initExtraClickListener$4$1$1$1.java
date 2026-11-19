package com.zykj.view.board.board;

import com.zykj.view.databinding.ViewItemSketchRecordBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$4$1$1$1", m17801f = "BoardFragment.kt", m17802l = {470}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardFragment$initExtraClickListener$4$1$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14864a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10574p f14865b;

    /* renamed from: c */
    public final /* synthetic */ ViewItemSketchRecordBinding f14866c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$4$1$1$1(InterfaceC10574p interfaceC10574p, ViewItemSketchRecordBinding viewItemSketchRecordBinding, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14865b = interfaceC10574p;
        this.f14866c = viewItemSketchRecordBinding;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Throwable th, InterfaceC9324c interfaceC9324c) {
        return ((BoardFragment$initExtraClickListener$4$1$1$1) create(th, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardFragment$initExtraClickListener$4$1$1$1(this.f14865b, this.f14866c, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14864a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC10574p interfaceC10574p = this.f14865b;
            this.f14864a = 1;
            if (interfaceC10574p.invoke(null, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f14866c.f15512a.setEnabled(true);
        return C8736p.f16368a;
    }
}
