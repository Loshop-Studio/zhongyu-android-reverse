package com.zykj.view.board.board;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$updateExpandState$1", m26211f = "BoardViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$updateExpandState$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20201c;

    /* renamed from: d */
    public final /* synthetic */ BoardViewModel f20202d;

    /* renamed from: e */
    public final /* synthetic */ boolean f20203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$updateExpandState$1(BoardViewModel boardViewModel, boolean z10, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20202d = boardViewModel;
        this.f20203e = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardViewModel$updateExpandState$1(this.f20202d, this.f20203e, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        AbstractC11725a.m25952f();
        if (this.f20201c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        InterfaceC11603l interfaceC11603l = this.f20202d.f20163x;
        boolean z10 = this.f20203e;
        do {
            value = interfaceC11603l.getValue();
        } while (!interfaceC11603l.mo20870e(value, ((C8849k) value).m16974a(z10 ? AbstractC8850l.b.f20258b : AbstractC8850l.a.f20257b)));
        if (!this.f20203e) {
            InterfaceC11603l interfaceC11603l2 = this.f20202d.f20159t;
            do {
                value2 = interfaceC11603l2.getValue();
            } while (!interfaceC11603l2.mo20870e(value2, C8851m.m16977b((C8851m) value2, AbstractC8856r.d.f20302e, null, false, false, 0.0f, 0.0f, false, 0.0f, 0.0f, TypedValues.PositionType.TYPE_POSITION_TYPE, null)));
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BoardViewModel$updateExpandState$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
