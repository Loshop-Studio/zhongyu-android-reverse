package com.zykj.study.p065ui.home.p066my;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment$CourseDeauthorized$courseDeauthorized$1", m17801f = "CourseContentFragment.kt", m17802l = {132}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseContentFragment$CourseDeauthorized$courseDeauthorized$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12820a;

    /* renamed from: b */
    public final /* synthetic */ CourseContentFragment f12821b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentFragment$CourseDeauthorized$courseDeauthorized$1(CourseContentFragment courseContentFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12821b = courseContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseContentFragment$CourseDeauthorized$courseDeauthorized$1(this.f12821b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseContentFragment$CourseDeauthorized$courseDeauthorized$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12820a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC9270g interfaceC9270gM11225q = this.f12821b.m11225q();
            Boolean boolM17796a = AbstractC9536a.m17796a(true);
            this.f12820a = 1;
            if (interfaceC9270gM11225q.emit(boolM17796a, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
