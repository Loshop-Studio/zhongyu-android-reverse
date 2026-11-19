package com.zykj.view.board.board;

import androidx.lifecycle.ViewModelKt;
import com.zykj.blackboard.core.edit.IBoardControl;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3", m26211f = "BoardViewModel.kt", m26212l = {1131}, m26213m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BoardViewModel$getSavePath$3 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f20181c;

    /* renamed from: d */
    public final /* synthetic */ BoardViewModel f20182d;

    /* renamed from: e */
    public final /* synthetic */ boolean f20183e;

    /* renamed from: f */
    public final /* synthetic */ boolean f20184f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC9544p f20185g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC9544p f20186h;

    @InterfaceC11829d(m26210c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$1", m26211f = "BoardViewModel.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.board.BoardViewModel$getSavePath$3$1 */
    public static final class C88381 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f20187c;

        /* renamed from: d */
        public /* synthetic */ boolean f20188d;

        public C88381(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C88381 c88381 = new C88381(interfaceC11588c);
            c88381.f20188d = ((Boolean) obj).booleanValue();
            return c88381;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10 = this.f20188d;
            AbstractC11725a.m25952f();
            if (this.f20187c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(z10);
        }

        public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
            return ((C88381) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3(BoardViewModel boardViewModel, boolean z10, boolean z11, InterfaceC9544p interfaceC9544p, InterfaceC9544p interfaceC9544p2, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f20182d = boardViewModel;
        this.f20183e = z10;
        this.f20184f = z11;
        this.f20185g = interfaceC9544p;
        this.f20186h = interfaceC9544p2;
    }

    /* renamed from: n */
    public static final C10786q m16941n(BoardViewModel boardViewModel, InterfaceC9544p interfaceC9544p, String str) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(boardViewModel), C11157r0.m24800c(), null, new BoardViewModel$getSavePath$3$2$1(interfaceC9544p, str, null), 2, null);
        return C10786q.f26013a;
    }

    /* renamed from: p */
    public static final C10786q m16942p(BoardViewModel boardViewModel, InterfaceC9544p interfaceC9544p, Throwable th) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(boardViewModel), C11157r0.m24800c(), null, new BoardViewModel$getSavePath$3$3$1(interfaceC9544p, th, null), 2, null);
        return C10786q.f26013a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new BoardViewModel$getSavePath$3(this.f20182d, this.f20183e, this.f20184f, this.f20185g, this.f20186h, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f20181c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11612u interfaceC11612uM16894Q = this.f20182d.m16894Q();
            C88381 c88381 = new C88381(null);
            this.f20181c = 1;
            if (AbstractC11596e.m25573w(interfaceC11612uM16894Q, c88381, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        IBoardControl iBoardControl = this.f20182d.f20142c;
        if (iBoardControl != null) {
            boolean z10 = this.f20183e;
            boolean z11 = this.f20184f;
            final BoardViewModel boardViewModel = this.f20182d;
            final InterfaceC9544p interfaceC9544p = this.f20185g;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.view.board.board.e
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return BoardViewModel$getSavePath$3.m16941n(boardViewModel, interfaceC9544p, (String) obj2);
                }
            };
            final BoardViewModel boardViewModel2 = this.f20182d;
            final InterfaceC9544p interfaceC9544p2 = this.f20186h;
            iBoardControl.mo14432c(z10, z11, interfaceC9540l, new InterfaceC9540l() { // from class: com.zykj.view.board.board.f
                @Override // p181hd.InterfaceC9540l
                public final Object invoke(Object obj2) {
                    return BoardViewModel$getSavePath$3.m16942p(boardViewModel2, interfaceC9544p2, (Throwable) obj2);
                }
            });
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((BoardViewModel$getSavePath$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
