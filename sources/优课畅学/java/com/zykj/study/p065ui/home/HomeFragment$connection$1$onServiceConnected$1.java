package com.zykj.study.p065ui.home;

import androidx.lifecycle.LifecycleOwnerKt;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.study.R$string;
import com.zykj.study.p065ui.home.HomeFragment$connection$1$onServiceConnected$1;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8839h;
import p135i8.AbstractC8841h1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p139j1.InterfaceC8994a;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.HomeFragment$connection$1$onServiceConnected$1", m17801f = "HomeFragment.kt", m17802l = {89}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class HomeFragment$connection$1$onServiceConnected$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11752a;

    /* renamed from: b */
    public final /* synthetic */ HomeFragment f11753b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.HomeFragment$connection$1$onServiceConnected$1$1", m17801f = "HomeFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.HomeFragment$connection$1$onServiceConnected$1$1 */
    public static final class C77771 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11754a;

        /* renamed from: b */
        public final /* synthetic */ HomeFragment f11755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77771(HomeFragment homeFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11755b = homeFragment;
        }

        /* renamed from: d */
        public static final void m10526d(HomeFragment homeFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(homeFragment), C8843i0.m14867b(), null, new HomeFragment$connection$1$onServiceConnected$1$1$1$1(homeFragment, null), 2, null);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C77771(this.f11755b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C77771) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f11754a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            MaterialDialog.C6913g c6913gM6765z = new MaterialDialog.C6913g(this.f11755b.requireContext()).m6747h(R$string.tips_upgrade_new_version).m6744e(false).m6745f(false).m6741b(false).m6765z(R$string.to_update);
            final HomeFragment homeFragment = this.f11755b;
            c6913gM6765z.m6762w(new MaterialDialog.InterfaceC6915i() { // from class: com.zykj.study.ui.home.a
                @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
                /* renamed from: a */
                public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                    HomeFragment$connection$1$onServiceConnected$1.C77771.m10526d(homeFragment, materialDialog, dialogAction);
                }
            }).m6734E();
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$connection$1$onServiceConnected$1(HomeFragment homeFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11753b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new HomeFragment$connection$1$onServiceConnected$1(this.f11753b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((HomeFragment$connection$1$onServiceConnected$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11752a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            InterfaceC8994a interfaceC8994a = this.f11753b.f11731f;
            if (interfaceC8994a != null && interfaceC8994a.mo15645b(this.f11753b.requireContext().getPackageName())) {
                AbstractC8841h1 abstractC8841h1M14868c = C8843i0.m14868c();
                C77771 c77771 = new C77771(this.f11753b, null);
                this.f11752a = 1;
                if (AbstractC8833f.m14848g(abstractC8841h1M14868c, c77771, this) == objM17291f) {
                    return objM17291f;
                }
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
