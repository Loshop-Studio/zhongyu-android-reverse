package com.zykj.view.board.board;

import androidx.lifecycle.ViewModelKt;
import com.zykj.blackboard.core.edit.IBoardControl;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3", m17801f = "BoardViewModel.kt", m17802l = {1131}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardViewModel$getSavePath$3 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14964a;

    /* renamed from: b */
    public final /* synthetic */ BoardViewModel f14965b;

    /* renamed from: c */
    public final /* synthetic */ boolean f14966c;

    /* renamed from: d */
    public final /* synthetic */ boolean f14967d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC10574p f14968e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC10574p f14969f;

    @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardViewModel$getSavePath$3$1", m17801f = "BoardViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.board.BoardViewModel$getSavePath$3$1 */
    public static final class C82041 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f14970a;

        /* renamed from: b */
        public /* synthetic */ boolean f14971b;

        public C82041(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C82041 c82041 = new C82041(interfaceC9324c);
            c82041.f14971b = ((Boolean) obj).booleanValue();
            return c82041;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10 = this.f14971b;
            AbstractC9434a.m17291f();
            if (this.f14970a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            return AbstractC9536a.m17796a(z10);
        }

        public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
            return ((C82041) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardViewModel$getSavePath$3(BoardViewModel boardViewModel, boolean z10, boolean z11, InterfaceC10574p interfaceC10574p, InterfaceC10574p interfaceC10574p2, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14965b = boardViewModel;
        this.f14966c = z10;
        this.f14967d = z11;
        this.f14968e = interfaceC10574p;
        this.f14969f = interfaceC10574p2;
    }

    /* renamed from: k */
    public static final C8736p m12825k(BoardViewModel boardViewModel, InterfaceC10574p interfaceC10574p, String str) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(boardViewModel), C8843i0.m14868c(), null, new BoardViewModel$getSavePath$3$2$1(interfaceC10574p, str, null), 2, null);
        return C8736p.f16368a;
    }

    /* renamed from: l */
    public static final C8736p m12826l(BoardViewModel boardViewModel, InterfaceC10574p interfaceC10574p, Throwable th) {
        AbstractC8839h.m14861d(ViewModelKt.getViewModelScope(boardViewModel), C8843i0.m14868c(), null, new BoardViewModel$getSavePath$3$3$1(interfaceC10574p, th, null), 2, null);
        return C8736p.f16368a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardViewModel$getSavePath$3(this.f14965b, this.f14966c, this.f14967d, this.f14968e, this.f14969f, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardViewModel$getSavePath$3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14964a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9280q interfaceC9280qM12782Q = this.f14965b.m12782Q();
            C82041 c82041 = new C82041(null);
            this.f14964a = 1;
            if (AbstractC9268e.m17035y(interfaceC9280qM12782Q, c82041, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        IBoardControl iBoardControl = this.f14965b.f14925c;
        if (iBoardControl != null) {
            boolean z10 = this.f14966c;
            boolean z11 = this.f14967d;
            final BoardViewModel boardViewModel = this.f14965b;
            final InterfaceC10574p interfaceC10574p = this.f14968e;
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: com.zykj.view.board.board.e
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return BoardViewModel$getSavePath$3.m12825k(boardViewModel, interfaceC10574p, (String) obj2);
                }
            };
            final BoardViewModel boardViewModel2 = this.f14965b;
            final InterfaceC10574p interfaceC10574p2 = this.f14969f;
            iBoardControl.save(z10, z11, interfaceC10570l, new InterfaceC10570l() { // from class: com.zykj.view.board.board.f
                @Override // p300x7.InterfaceC10570l
                public final Object invoke(Object obj2) {
                    return BoardViewModel$getSavePath$3.m12826l(boardViewModel2, interfaceC10574p2, (Throwable) obj2);
                }
            });
        }
        return C8736p.f16368a;
    }
}
