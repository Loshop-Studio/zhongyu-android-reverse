package com.zykj.study.p065ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9270g;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeAuthFail$2", m17801f = "MainActivity.kt", m17802l = {126}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class MainActivity$observeAuthFail$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11618a;

    /* renamed from: b */
    public final /* synthetic */ MainActivity f11619b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeAuthFail$2$1", m17801f = "MainActivity.kt", m17802l = {127}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.MainActivity$observeAuthFail$2$1 */
    public static final class C77581 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11620a;

        /* renamed from: b */
        public final /* synthetic */ MainActivity f11621b;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.MainActivity$observeAuthFail$2$1$1", m17801f = "MainActivity.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.MainActivity$observeAuthFail$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11622a;

            /* renamed from: b */
            public /* synthetic */ boolean f11623b;

            /* renamed from: c */
            public final /* synthetic */ MainActivity f11624c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11624c = mainActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11624c, interfaceC9324c);
                anonymousClass1.f11623b = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (InterfaceC9324c) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                boolean z10 = this.f11623b;
                AbstractC9434a.m17291f();
                if (this.f11622a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                if (z10) {
                    this.f11624c.m10449C().show();
                }
                return C8736p.f16368a;
            }

            public final Object invoke(boolean z10, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(Boolean.valueOf(z10), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77581(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11621b = mainActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77581(this.f11621b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77581) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11620a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9270g interfaceC9270gM10450D = this.f11621b.m10450D();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11621b, null);
                this.f11620a = 1;
                if (AbstractC9268e.m17019i(interfaceC9270gM10450D, anonymousClass1, this) == objM17291f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainActivity$observeAuthFail$2(MainActivity mainActivity, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11619b = mainActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new MainActivity$observeAuthFail$2(this.f11619b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((MainActivity$observeAuthFail$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11618a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            MainActivity mainActivity = this.f11619b;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C77581 c77581 = new C77581(mainActivity, null);
            this.f11618a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(mainActivity, state, c77581, this) == objM17291f) {
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
