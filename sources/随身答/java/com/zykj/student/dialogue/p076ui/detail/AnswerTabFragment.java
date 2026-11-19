package com.zykj.student.dialogue.p076ui.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.zykj.base.R$dimen;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueAnswerTabLayoutBinding;
import com.zykj.student.dialogue.databinding.DialogueFragmentAnswerTabBinding;
import com.zykj.student.dialogue.p076ui.detail.AnswerTabFragment;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7538a;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.Tab;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p138i6.AbstractC8136b;
import p214p6.C9336k;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;", "f", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerTabBinding;", "binding", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "g", "Lkotlin/Lazy;", "j", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "viewModel", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnswerTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerTabFragment\n+ 2 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n*L\n1#1,123:1\n49#2,8:124\n*S KotlinDebug\n*F\n+ 1 AnswerTabFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerTabFragment\n*L\n29#1:124,8\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerTabFragment extends Hilt_AnswerTabFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public DialogueFragmentAnswerTabBinding binding;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerTabFragment$a */
    public static final class C7507a implements TabLayout.OnTabSelectedListener {
        public C7507a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            View customView = tab.getCustomView();
            if (customView != null) {
                AnswerTabFragment answerTabFragment = AnswerTabFragment.this;
                AppCompatTextView appCompatTextView = (AppCompatTextView) customView.findViewById(R.id.label);
                appCompatTextView.setTextSize(0, customView.getResources().getDimension(R$dimen.text_9));
                appCompatTextView.setTextColor(ContextCompat.getColor(answerTabFragment.requireContext(), R.color.color_primary));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            View customView = tab.getCustomView();
            if (customView != null) {
                AnswerTabFragment answerTabFragment = AnswerTabFragment.this;
                AppCompatTextView appCompatTextView = (AppCompatTextView) customView.findViewById(R.id.label);
                appCompatTextView.setTextSize(0, customView.getResources().getDimension(R$dimen.text_8));
                appCompatTextView.setTextColor(ContextCompat.getColor(answerTabFragment.requireContext(), R.color.color_646566));
            }
        }
    }

    public AnswerTabFragment() {
        final int i9 = R.id.dialogue_detail_main;
        final Lazy lazy = LazyKt.lazy(new Function0<NavBackStackEntry>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i9);
            }
        });
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AnswerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelCreationExtras();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerTabFragment$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelProviderFactory());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final AnswerViewModel m10295j() {
        return (AnswerViewModel) this.viewModel.getValue();
    }

    /* renamed from: k */
    public static final void m10296k(AnswerTabFragment answerTabFragment, TabLayout.Tab tab, int i9) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        View root = DialogueAnswerTabLayoutBinding.m9932a(answerTabFragment.getLayoutInflater()).getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        tab.setCustomView(root);
        View customView = tab.getCustomView();
        if (customView != null) {
            customView.setPadding(0, 0, 0, 0);
        }
        TextView textView = (TextView) root.findViewById(R.id.label);
        if (i9 == 0) {
            textView.setText(answerTabFragment.getString(R.string.dialogue_view_all));
        } else {
            textView.setText(answerTabFragment.getString(R.string.dialogue_only_public));
        }
    }

    /* renamed from: l */
    public static final Unit m10297l(AnswerTabFragment answerTabFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        answerTabFragment.m10295j().m10481w(new AbstractC7538a.d(false));
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBindingM9942a = DialogueFragmentAnswerTabBinding.m9942a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dialogueFragmentAnswerTabBindingM9942a, "inflate(...)");
        this.binding = dialogueFragmentAnswerTabBindingM9942a;
        if (dialogueFragmentAnswerTabBindingM9942a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerTabBindingM9942a = null;
        }
        View root = dialogueFragmentAnswerTabBindingM9942a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding = this.binding;
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding2 = null;
        if (dialogueFragmentAnswerTabBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerTabBinding = null;
        }
        dialogueFragmentAnswerTabBinding.f10439d.setUserInputEnabled(false);
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding3 = this.binding;
        if (dialogueFragmentAnswerTabBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerTabBinding3 = null;
        }
        dialogueFragmentAnswerTabBinding3.f10439d.setAdapter(new FragmentStateAdapter(getChildFragmentManager(), getViewLifecycleOwner().getLifecycle()) { // from class: com.zykj.student.dialogue.ui.detail.AnswerTabFragment.onViewCreated.1
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int position) {
                return DetailTabFragment.INSTANCE.m10321a(position == 1);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return 2;
            }
        });
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding4 = this.binding;
        if (dialogueFragmentAnswerTabBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerTabBinding4 = null;
        }
        dialogueFragmentAnswerTabBinding4.f10439d.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.zykj.student.dialogue.ui.detail.AnswerTabFragment.onViewCreated.2
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                if (position != ((C9336k) AnswerTabFragment.this.m10295j().getViewState().getValue()).m15242q().ordinal()) {
                    AnswerTabFragment.this.m10295j().m10481w(new AbstractC7538a.e(position == 0 ? Tab.f11245a : Tab.f11246b));
                }
            }
        });
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding5 = this.binding;
        if (dialogueFragmentAnswerTabBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerTabBinding5 = null;
        }
        dialogueFragmentAnswerTabBinding5.f10438c.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7507a());
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding6 = this.binding;
        if (dialogueFragmentAnswerTabBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerTabBinding6 = null;
        }
        TabLayout tabLayout = dialogueFragmentAnswerTabBinding6.f10438c;
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding7 = this.binding;
        if (dialogueFragmentAnswerTabBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerTabBinding7 = null;
        }
        new TabLayoutMediator(tabLayout, dialogueFragmentAnswerTabBinding7.f10439d, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o6.p
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i9) {
                AnswerTabFragment.m10296k(this.f15614a, tab, i9);
            }
        }).attach();
        DialogueFragmentAnswerTabBinding dialogueFragmentAnswerTabBinding8 = this.binding;
        if (dialogueFragmentAnswerTabBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogueFragmentAnswerTabBinding2 = dialogueFragmentAnswerTabBinding8;
        }
        ImageView ivRefresh = dialogueFragmentAnswerTabBinding2.f10437b;
        Intrinsics.checkNotNullExpressionValue(ivRefresh, "ivRefresh");
        AbstractC8136b.m13040h(ivRefresh, new Function1() { // from class: o6.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerTabFragment.m10297l(this.f15615a, (View) obj);
            }
        });
    }
}
