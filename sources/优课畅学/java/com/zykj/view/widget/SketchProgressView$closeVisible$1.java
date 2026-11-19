package com.zykj.view.widget;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.widget.SketchProgressView$closeVisible$1", m17801f = "SketchProgressView.kt", m17802l = {370}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SketchProgressView$closeVisible$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15626a;

    /* renamed from: b */
    public final /* synthetic */ SketchProgressView f15627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchProgressView$closeVisible$1(SketchProgressView sketchProgressView, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15627b = sketchProgressView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SketchProgressView$closeVisible$1(this.f15627b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SketchProgressView$closeVisible$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f15626a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            this.f15626a = 1;
            if (DelayKt.m16227b(2000L, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        this.f15627b.f15622l = false;
        this.f15627b.m13347l();
        return C8736p.f16368a;
    }
}
