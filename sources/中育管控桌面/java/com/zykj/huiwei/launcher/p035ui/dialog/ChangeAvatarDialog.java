package com.zykj.huiwei.launcher.p035ui.dialog;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.zykj.huiwei.launcher.bean.AvatarItem;
import com.zykj.huiwei.launcher.databinding.HwDialogChangeAvatarBinding;
import com.zykj.huiwei.launcher.p035ui.adapter.AvatarAdapter;
import com.zykj.huiwei.launcher.p035ui.dialog.ChangeAvatarDialog;
import com.zykj.huiwei.launcher.proto.C6075m;
import com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel;
import com.zykj.manage.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0012\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog;", "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;", "Lcom/zykj/huiwei/launcher/databinding/HwDialogChangeAvatarBinding;", "<init>", "()V", "", "layoutId", "()I", "", "g", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;", "Lkotlin/Lazy;", "u", "()Lcom/zykj/huiwei/launcher/viewmodels/ChangeAvatarViewModel;", "viewModel", "Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;", "h", "Landroidx/navigation/NavArgsLazy;", "s", "()Lcom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialogArgs;", "args", "Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;", "i", "t", "()Lcom/zykj/huiwei/launcher/ui/adapter/AvatarAdapter;", "avatarAdapter", "j", "a", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nChangeAvatarDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeAvatarDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n106#2,15:88\n42#3,3:103\n360#4,7:106\n295#4,2:113\n*S KotlinDebug\n*F\n+ 1 ChangeAvatarDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/ChangeAvatarDialog\n*L\n21#1:88,15\n22#1:103,3\n42#1:106,7\n63#1:113,2\n*E\n"})
/* loaded from: classes4.dex */
public final class ChangeAvatarDialog extends Hilt_ChangeAvatarDialog<HwDialogChangeAvatarBinding> {

    /* renamed from: k */
    public static final int f6417k = 8;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: h, reason: from kotlin metadata */
    public final NavArgsLazy args;

    /* renamed from: i, reason: from kotlin metadata */
    public final Lazy avatarAdapter;

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$b */
    public static final class C6108b implements Observer, FunctionAdapter {

        /* renamed from: a */
        public final /* synthetic */ Function1 f6428a;

        public C6108b(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f6428a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function getFunctionDelegate() {
            return this.f6428a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f6428a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$c */
    public static final class C6109c implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f6429a;

        public C6109c(Fragment fragment) {
            this.f6429a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f6429a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f6429a + " has null arguments");
        }
    }

    public ChangeAvatarDialog() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(ChangeAvatarViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM16978viewModels$lambda1 = FragmentViewModelLazyKt.m16978viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM16978viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM16978viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(ChangeAvatarDialogArgs.class), new C6109c(this));
        this.avatarAdapter = LazyKt.lazy(new Function0() { // from class: b4.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChangeAvatarDialog.m5635r();
            }
        });
    }

    /* renamed from: r */
    public static final AvatarAdapter m5635r() {
        return new AvatarAdapter();
    }

    /* renamed from: v */
    public static final void m5636v(ChangeAvatarDialog changeAvatarDialog, BaseQuickAdapter baseQuickAdapter, View view, int i6) {
        Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Iterator<AvatarItem> it = changeAvatarDialog.m5640t().getData().iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            } else if (it.next().getId() == changeAvatarDialog.m5640t().getSelectId()) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 != i6) {
            changeAvatarDialog.m5640t().m5606h(changeAvatarDialog.m5640t().getItem(i6).getId());
            if (i7 >= 0) {
                changeAvatarDialog.m5640t().notifyItemChanged(i7);
            }
            changeAvatarDialog.m5640t().notifyItemChanged(i6);
        }
    }

    /* renamed from: w */
    public static final Unit m5637w(ChangeAvatarDialog changeAvatarDialog, List list) {
        Object next;
        AvatarAdapter avatarAdapterM5640t = changeAvatarDialog.m5640t();
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(changeAvatarDialog.m5639s().getUrl(), ((AvatarItem) next).getUrl())) {
                break;
            }
        }
        AvatarItem avatarItem = (AvatarItem) next;
        avatarAdapterM5640t.m5606h(avatarItem != null ? avatarItem.getId() : -1L);
        changeAvatarDialog.m5640t().setNewInstance(list);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m5638x(ChangeAvatarDialog changeAvatarDialog, C6075m c6075m) {
        FragmentKt.findNavController(changeAvatarDialog).navigateUp();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment
    /* renamed from: g */
    public void mo5279g() {
        ((HwDialogChangeAvatarBinding) getMBindView()).setVm(m5641u());
        ((HwDialogChangeAvatarBinding) getMBindView()).setOnClickListener(this);
        ((HwDialogChangeAvatarBinding) getMBindView()).rvAvatar.setHasFixedSize(true);
        m5640t().setOnItemClickListener(new OnItemClickListener() { // from class: b4.e
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i6) {
                ChangeAvatarDialog.m5636v(this.f1313a, baseQuickAdapter, view, i6);
            }
        });
        ((HwDialogChangeAvatarBinding) getMBindView()).rvAvatar.setAdapter(m5640t());
        ((HwDialogChangeAvatarBinding) getMBindView()).rvAvatar.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.zykj.huiwei.launcher.ui.dialog.ChangeAvatarDialog$initView$2
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                Intrinsics.checkNotNullParameter(outRect, "outRect");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(parent, "parent");
                Intrinsics.checkNotNullParameter(state, "state");
                outRect.top = this.f6430a.getResources().getDimensionPixelSize(R.dimen.pt14);
            }
        });
        m5641u().getAvatarItems().observe(getViewLifecycleOwner(), new C6108b(new Function1() { // from class: b4.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeAvatarDialog.m5637w(this.f1314a, (List) obj);
            }
        }));
        m5641u().getUserCacheBean().observe(getViewLifecycleOwner(), new C6108b(new Function1() { // from class: b4.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChangeAvatarDialog.m5638x(this.f1315a, (C6075m) obj);
            }
        }));
        m5641u().m6043b();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.hw_dialog_change_avatar;
    }

    @Override // com.zykj.huiwei.launcher.base.CommonDialogFragment, android.view.View.OnClickListener
    public void onClick(View v6) {
        super.onClick(v6);
        Integer numValueOf = v6 != null ? Integer.valueOf(v6.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.ivClose) {
            FragmentKt.findNavController(this).navigateUp();
        } else {
            if (numValueOf == null || numValueOf.intValue() != R.id.tvModify || m5640t().getSelectId() == -1) {
                return;
            }
            m5641u().m6047f(m5640t().getSelectId());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public final ChangeAvatarDialogArgs m5639s() {
        return (ChangeAvatarDialogArgs) this.args.getValue();
    }

    /* renamed from: t */
    public final AvatarAdapter m5640t() {
        return (AvatarAdapter) this.avatarAdapter.getValue();
    }

    /* renamed from: u */
    public final ChangeAvatarViewModel m5641u() {
        return (ChangeAvatarViewModel) this.viewModel.getValue();
    }
}
