package com.zykj.view.board.board;

import com.zykj.view.databinding.ViewItemSketchRecordBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$4$1$1$2", m17801f = "BoardFragment.kt", m17802l = {466}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardFragment$initExtraClickListener$4$1$1$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14867a;

    /* renamed from: b */
    public /* synthetic */ Object f14868b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10574p f14869c;

    /* renamed from: d */
    public final /* synthetic */ ViewItemSketchRecordBinding f14870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initExtraClickListener$4$1$1$2(InterfaceC10574p interfaceC10574p, ViewItemSketchRecordBinding viewItemSketchRecordBinding, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14869c = interfaceC10574p;
        this.f14870d = viewItemSketchRecordBinding;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(String str, InterfaceC9324c interfaceC9324c) {
        return ((BoardFragment$initExtraClickListener$4$1$1$2) create(str, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BoardFragment$initExtraClickListener$4$1$1$2 boardFragment$initExtraClickListener$4$1$1$2 = new BoardFragment$initExtraClickListener$4$1$1$2(this.f14869c, this.f14870d, interfaceC9324c);
        boardFragment$initExtraClickListener$4$1$1$2.f14868b = obj;
        return boardFragment$initExtraClickListener$4$1$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = (String) this.f14868b;
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14867a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC10574p interfaceC10574p = this.f14869c;
            this.f14868b = AbstractC9543h.m17814a(str);
            this.f14867a = 1;
            if (interfaceC10574p.invoke(str, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f14870d.f15512a.setEnabled(true);
        return C8736p.f16368a;
    }
}
