package com.zykj.study.p065ui.home.p066my;

import com.blankj.utilcode.util.NetworkUtils;
import com.zykj.base.utils.XToastUtils;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8841h1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$3$onItemLongClick$1", m17801f = "MyCourseDetailsFragment.kt", m17802l = {166}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MyCourseDetailsFragment$initView$3$onItemLongClick$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13235a;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$3$onItemLongClick$1$1", m17801f = "MyCourseDetailsFragment.kt", m17802l = {168}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$3$onItemLongClick$1$1 */
    public static final class C80451 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13236a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$3$onItemLongClick$1$1$1", m17801f = "MyCourseDetailsFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$3$onItemLongClick$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13237a;

            public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.f13237a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                XToastUtils.INSTANCE.warning("网络未连接");
                return C8736p.f16368a;
            }
        }

        public C80451(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C80451(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80451) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13236a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                if (NetworkUtils.m2356c()) {
                    return C8736p.f16368a;
                }
                AbstractC8841h1 abstractC8841h1M14868c = C8843i0.m14868c();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.f13236a = 1;
                if (AbstractC8833f.m14848g(abstractC8841h1M14868c, anonymousClass1, this) == objM17291f) {
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

    public MyCourseDetailsFragment$initView$3$onItemLongClick$1(InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MyCourseDetailsFragment$initView$3$onItemLongClick$1(interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MyCourseDetailsFragment$initView$3$onItemLongClick$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13235a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            CoroutineDispatcher coroutineDispatcherM14867b = C8843i0.m14867b();
            C80451 c80451 = new C80451(null);
            this.f13235a = 1;
            if (AbstractC8833f.m14848g(coroutineDispatcherM14867b, c80451, this) == objM17291f) {
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
