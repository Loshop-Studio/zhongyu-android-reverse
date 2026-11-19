package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.Lambda;
import p123h7.InterfaceC8721a;
import p123h7.InterfaceC8724d;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1 */
    public static final class C00921 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00921(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2 */
    public static final class C00932 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00932(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3 */
    public static final class C00943 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00943(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p300x7.InterfaceC10559a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4 */
    public static final class C00954 extends Lambda implements InterfaceC10559a {
        final /* synthetic */ InterfaceC10559a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00954(InterfaceC10559a interfaceC10559a, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = interfaceC10559a;
            this.$this_viewModels = componentActivity;
        }

        @Override // p300x7.InterfaceC10559a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC10559a interfaceC10559a = this.$extrasProducer;
            return (interfaceC10559a == null || (creationExtras = (CreationExtras) interfaceC10559a.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @InterfaceC8721a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d viewModels(ComponentActivity componentActivity, InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(componentActivity, "<this>");
        if (interfaceC10559a == null) {
            interfaceC10559a = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC9133u.m16139m(4, "VM");
        return new ViewModelLazy(AbstractC9137y.m16154b(ViewModel.class), new C00921(componentActivity), interfaceC10559a, new C00932(componentActivity));
    }

    public static /* synthetic */ InterfaceC8724d viewModels$default(ComponentActivity componentActivity, InterfaceC10559a interfaceC10559a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = null;
        }
        AbstractC9133u.m16133g(componentActivity, "<this>");
        if (interfaceC10559a == null) {
            interfaceC10559a = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC9133u.m16139m(4, "VM");
        return new ViewModelLazy(AbstractC9137y.m16154b(ViewModel.class), new C00921(componentActivity), interfaceC10559a, new C00932(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC8724d viewModels(ComponentActivity componentActivity, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
        AbstractC9133u.m16133g(componentActivity, "<this>");
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC9133u.m16139m(4, "VM");
        return new ViewModelLazy(AbstractC9137y.m16154b(ViewModel.class), new C00943(componentActivity), interfaceC10559a2, new C00954(interfaceC10559a, componentActivity));
    }

    public static /* synthetic */ InterfaceC8724d viewModels$default(ComponentActivity componentActivity, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10559a = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC10559a2 = null;
        }
        AbstractC9133u.m16133g(componentActivity, "<this>");
        if (interfaceC10559a2 == null) {
            interfaceC10559a2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC9133u.m16139m(4, "VM");
        return new ViewModelLazy(AbstractC9137y.m16154b(ViewModel.class), new C00943(componentActivity), interfaceC10559a2, new C00954(interfaceC10559a, componentActivity));
    }
}
