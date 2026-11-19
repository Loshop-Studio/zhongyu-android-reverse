package android.view;

import android.view.ViewModel;
import android.view.ViewModelStore;
import android.view.viewmodel.CreationExtras;
import androidx.annotation.MainThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Lambda;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, m5110d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/activity/ComponentActivity;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Ld6/e;", "viewModels", "(Landroidx/activity/ComponentActivity;Lr6/a;)Ld6/e;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "(Landroidx/activity/ComponentActivity;Lr6/a;Lr6/a;)Ld6/e;", "activity_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1 */
    public static final class C00501 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00501(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p152r6.InterfaceC6469a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2 */
    public static final class C00512 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00512(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p152r6.InterfaceC6469a
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3 */
    public static final class C00523 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00523(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p152r6.InterfaceC6469a
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m5110d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = 176)
    /* renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4 */
    public static final class C00534 extends Lambda implements InterfaceC6469a {
        final /* synthetic */ InterfaceC6469a $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00534(InterfaceC6469a interfaceC6469a, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = interfaceC6469a;
            this.$this_viewModels = componentActivity;
        }

        @Override // p152r6.InterfaceC6469a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC6469a interfaceC6469a = this.$extrasProducer;
            return (interfaceC6469a == null || (creationExtras = (CreationExtras) interfaceC6469a.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    @MainThread
    public static final <VM extends ViewModel> InterfaceC5429e viewModels(ComponentActivity componentActivity, InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(componentActivity, "<this>");
        if (interfaceC6469a == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    public static InterfaceC5429e viewModels$default(ComponentActivity componentActivity, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC6469a = null;
        }
        AbstractC5830k.m5330g(componentActivity, "<this>");
        if (interfaceC6469a == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC5429e viewModels(ComponentActivity componentActivity, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2) {
        AbstractC5830k.m5330g(componentActivity, "<this>");
        if (interfaceC6469a2 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    public static InterfaceC5429e viewModels$default(ComponentActivity componentActivity, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC6469a2 = null;
        }
        AbstractC5830k.m5330g(componentActivity, "<this>");
        if (interfaceC6469a2 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC5830k.m5338o();
        throw null;
    }
}
