package com.friday.lecture.floatwindow.homework;

import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.ScreenUtils;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.lecture.floatwindow.homework.HomeworkLayout$initView$8$1$onResult$1$1$1", m26211f = "HomeworkLayout.kt", m26212l = {}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeworkLayout$initView$8$1$onResult$1$1$1 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f8765c;

    /* renamed from: d */
    public final /* synthetic */ String f8766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeworkLayout$initView$8$1$onResult$1$1$1(String str, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f8766d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeworkLayout$initView$8$1$onResult$1$1$1(this.f8766d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC11725a.m25952f();
        if (this.f8765c != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9924b.m20071b(obj);
        return ImageUtils.getBitmap(this.f8766d, ScreenUtils.getScreenWidth() * 2, ScreenUtils.getScreenHeight() * 2);
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeworkLayout$initView$8$1$onResult$1$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
