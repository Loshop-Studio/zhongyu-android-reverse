package com.zykj.view.board.play;

import androidx.lifecycle.CoroutineLiveDataKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.play.SketchPlayFragment$startControlBarJob$1", m17801f = "SketchPlayFragment.kt", m17802l = {798}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SketchPlayFragment$startControlBarJob$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15202a;

    /* renamed from: b */
    public final /* synthetic */ SketchPlayFragment f15203b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchPlayFragment$startControlBarJob$1(SketchPlayFragment sketchPlayFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15203b = sketchPlayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SketchPlayFragment$startControlBarJob$1(this.f15203b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SketchPlayFragment$startControlBarJob$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f15202a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            this.f15202a = 1;
            if (DelayKt.m16227b(CoroutineLiveDataKt.DEFAULT_TIMEOUT, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f15203b.m13133P();
        InterfaceC10559a interfaceC10559aM18736c = this.f15203b.f15168c.m18736c();
        if (interfaceC10559aM18736c != null) {
            interfaceC10559aM18736c.invoke();
        }
        return C8736p.f16368a;
    }
}
