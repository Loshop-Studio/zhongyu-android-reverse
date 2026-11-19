package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;

/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1 */
    public static final class C01561 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01561(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2 */
    public static final class C01572 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01572(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3 */
    public static final class C01583 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01583(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p181hd.InterfaceC9529a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4 */
    public static final class C01594 extends Lambda implements InterfaceC9529a {
        final /* synthetic */ InterfaceC9529a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01594(InterfaceC9529a interfaceC9529a, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = interfaceC9529a;
            this.$this_viewModels = componentActivity;
        }

        @Override // p181hd.InterfaceC9529a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC9529a interfaceC9529a = this.$extrasProducer;
            return (interfaceC9529a == null || (creationExtras = (CreationExtras) interfaceC9529a.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @InterfaceC10770a
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d viewModels(ComponentActivity componentActivity, InterfaceC9529a interfaceC9529a) {
        AbstractC9979u.m20294g(componentActivity, "<this>");
        if (interfaceC9529a == null) {
            interfaceC9529a = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC9979u.m20300m(4, "VM");
        return new ViewModelLazy(AbstractC9983y.m20315b(ViewModel.class), new C01561(componentActivity), interfaceC9529a, new C01572(componentActivity));
    }

    public static /* synthetic */ InterfaceC10773d viewModels$default(ComponentActivity componentActivity, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        AbstractC9979u.m20294g(componentActivity, "<this>");
        if (interfaceC9529a == null) {
            interfaceC9529a = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC9979u.m20300m(4, "VM");
        return new ViewModelLazy(AbstractC9983y.m20315b(ViewModel.class), new C01561(componentActivity), interfaceC9529a, new C01572(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> InterfaceC10773d viewModels(ComponentActivity componentActivity, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        AbstractC9979u.m20294g(componentActivity, "<this>");
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC9979u.m20300m(4, "VM");
        return new ViewModelLazy(AbstractC9983y.m20315b(ViewModel.class), new C01583(componentActivity), interfaceC9529a2, new C01594(interfaceC9529a, componentActivity));
    }

    public static /* synthetic */ InterfaceC10773d viewModels$default(ComponentActivity componentActivity, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9529a = null;
        }
        if ((i10 & 2) != 0) {
            interfaceC9529a2 = null;
        }
        AbstractC9979u.m20294g(componentActivity, "<this>");
        if (interfaceC9529a2 == null) {
            interfaceC9529a2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC9979u.m20300m(4, "VM");
        return new ViewModelLazy(AbstractC9983y.m20315b(ViewModel.class), new C01583(componentActivity), interfaceC9529a2, new C01594(interfaceC9529a, componentActivity));
    }
}
