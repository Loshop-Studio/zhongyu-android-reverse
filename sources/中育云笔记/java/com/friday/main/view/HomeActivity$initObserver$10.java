package com.friday.main.view;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.friday.main.view.HomeActivity$initObserver$10;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11602k;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$10", m26211f = "HomeActivity.kt", m26212l = {378}, m26213m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class HomeActivity$initObserver$10 extends SuspendLambda implements InterfaceC9544p {

    /* renamed from: c */
    public int f9390c;

    /* renamed from: d */
    public final /* synthetic */ HomeActivity f9391d;

    @InterfaceC11829d(m26210c = "com.friday.main.view.HomeActivity$initObserver$10$1", m26211f = "HomeActivity.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.main.view.HomeActivity$initObserver$10$1 */
    public static final class C62121 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f9392c;

        /* renamed from: d */
        public /* synthetic */ boolean f9393d;

        /* renamed from: e */
        public final /* synthetic */ HomeActivity f9394e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C62121(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
            this.f9394e = homeActivity;
        }

        /* renamed from: m */
        public static final C10786q m7147m(HomeActivity homeActivity) {
            AbstractC11117h.m24726d(LifecycleOwnerKt.getLifecycleScope(homeActivity), C11157r0.m24799b(), null, new HomeActivity$initObserver$10$1$1$1(homeActivity, null), 2, null);
            return C10786q.f26013a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            C62121 c62121 = new C62121(this.f9394e, interfaceC11588c);
            c62121.f9393d = ((Boolean) obj).booleanValue();
            return c62121;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC11588c) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z10 = this.f9393d;
            AbstractC11725a.m25952f();
            if (this.f9392c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            if (z10 && this.f9394e.getSupportFragmentManager().findFragmentByTag(HuiweiAppUpdateDialog.class.getSimpleName()) == null) {
                HuiweiAppUpdateDialog huiweiAppUpdateDialog = new HuiweiAppUpdateDialog();
                final HomeActivity homeActivity = this.f9394e;
                huiweiAppUpdateDialog.m7155v(new InterfaceC9529a() { // from class: com.friday.main.view.a
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return HomeActivity$initObserver$10.C62121.m7147m(homeActivity);
                    }
                });
                FragmentManager supportFragmentManager = this.f9394e.getSupportFragmentManager();
                AbstractC9979u.m20293f(supportFragmentManager, "getSupportFragmentManager(...)");
                huiweiAppUpdateDialog.show(supportFragmentManager, HuiweiAppUpdateDialog.class.getSimpleName());
            }
            return C10786q.f26013a;
        }

        public final Object invoke(boolean z10, InterfaceC11588c interfaceC11588c) {
            return ((C62121) create(Boolean.valueOf(z10), interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivity$initObserver$10(HomeActivity homeActivity, InterfaceC11588c interfaceC11588c) {
        super(2, interfaceC11588c);
        this.f9391d = homeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
        return new HomeActivity$initObserver$10(this.f9391d, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.f9390c;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11602k interfaceC11602kM7261t = this.f9391d.m7142w0().m7261t();
            C62121 c62121 = new C62121(this.f9391d, null);
            this.f9390c = 1;
            if (AbstractC11596e.m25559i(interfaceC11602kM7261t, c62121, this) == objM25952f) {
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
        return ((HomeActivity$initObserver$10) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
