package com.friday.main.view;

import com.friday.main.viewmodel.HomeViewModel;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p375v7.InterfaceC11548a;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$9", m26211f = "HomeActivity.kt", m26212l = {371}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeActivity$initObserver$9 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9404c;

    /* renamed from: d */
    public final /* synthetic */ HomeActivity f9405d;

    @InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$9$1", m26211f = "HomeActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.HomeActivity$initObserver$9$1 */
    public static final class C62141 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9406c;

        /* renamed from: d */
        public /* synthetic */ Object f9407d;

        /* renamed from: e */
        public final /* synthetic */ HomeActivity f9408e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62141(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9408e = homeActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C62141 c62141 = new C62141(this.f9408e, interfaceC11588c);
            c62141.f9407d = obj;
            return c62141;
        }

        @Override // p181hd.InterfaceC9544p
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC11548a interfaceC11548a, InterfaceC11588c interfaceC11588c) {
            return ((C62141) create(interfaceC11548a, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11548a interfaceC11548a = (InterfaceC11548a) this.f9407d;
            AbstractC11725a.m25952f();
            if (this.f9406c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            if (interfaceC11548a != null) {
                HomeActivity homeActivity = this.f9408e;
                HomeViewModel homeViewModelM7142w0 = homeActivity.m7142w0();
                String packageName = homeActivity.getPackageName();
                AbstractC9979u.m20293f(packageName, "getPackageName(...)");
                homeViewModelM7142w0.m7255m(packageName);
            }
            return C10786q.f26013a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$initObserver$9(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9405d = homeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeActivity$initObserver$9(this.f9405d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9404c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11603l interfaceC11603lM7259r = this.f9405d.m7142w0().m7259r();
            C62141 c62141 = new C62141(this.f9405d, null);
            this.f9404c = 1;
            if (AbstractC11596e.m25559i(interfaceC11603lM7259r, c62141, this) == objM25952f) {
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
        return ((HomeActivity$initObserver$9) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
