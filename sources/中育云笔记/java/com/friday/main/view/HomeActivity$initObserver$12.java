package com.friday.main.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.lib.error.code.ErrorCode;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$12", m26211f = "HomeActivity.kt", m26212l = {414}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeActivity$initObserver$12 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9397c;

    /* renamed from: d */
    public final /* synthetic */ HomeActivity f9398d;

    @InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$12$1", m26211f = "HomeActivity.kt", m26212l = {415}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.HomeActivity$initObserver$12$1 */
    public static final class C62131 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9399c;

        /* renamed from: d */
        public final /* synthetic */ HomeActivity f9400d;

        @InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$12$1$1", m26211f = "HomeActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
        /* renamed from: com.friday.main.view.HomeActivity$initObserver$12$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {

            /* renamed from: c */
            public int f9401c;

            /* renamed from: d */
            public /* synthetic */ Object f9402d;

            /* renamed from: e */
            public final /* synthetic */ HomeActivity f9403e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
                super(2, interfaceC11588c);
                this.f9403e = homeActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9403e, interfaceC11588c);
                anonymousClass1.f9402d = obj;
                return anonymousClass1;
            }

            @Override // p181hd.InterfaceC9544p
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(ErrorCode errorCode, InterfaceC11588c interfaceC11588c) {
                return ((AnonymousClass1) create(errorCode, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                ErrorCode errorCode = (ErrorCode) this.f9402d;
                AbstractC11725a.m25952f();
                if (this.f9401c != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                if (errorCode != ErrorCode.NET_TOKEN_ERROR) {
                    return C10786q.f26013a;
                }
                ToastUtils.showLong("登录已过期,请重新登录", new Object[0]);
                if (AppUtils.isAppInstalled("com.zykj.manage")) {
                    HomeActivity homeActivity = this.f9403e;
                    homeActivity.startActivity(homeActivity.getPackageManager().getLaunchIntentForPackage("com.zykj.manage"));
                } else {
                    AbstractC11958b.m26588i("用户中心未安装");
                }
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62131(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9400d = homeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return new C62131(this.f9400d, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.f9399c;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11602k interfaceC11602kM7262u = this.f9400d.m7142w0().m7262u();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9400d, null);
                this.f9399c = 1;
                if (AbstractC11596e.m25559i(interfaceC11602kM7262u, anonymousClass1, this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C62131) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$initObserver$12(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9398d = homeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeActivity$initObserver$12(this.f9398d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9397c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            HomeActivity homeActivity = this.f9398d;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C62131 c62131 = new C62131(homeActivity, null);
            this.f9397c = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(homeActivity, state, c62131, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
        return ((HomeActivity$initObserver$12) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
