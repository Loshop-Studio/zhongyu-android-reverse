package com.zykj.study.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.zykj.base.BaseDialogFragment;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.databinding.DialogExerciseFinishBinding;
import com.zykj.study.databinding.ItemStuTabBinding;
import com.zykj.study.dialog.ExerciseFinishDialog;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;
import com.zykj.view.R$dimen;
import kotlin.AbstractC9078a;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.AbstractC8354c;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ExerciseFinishDialog extends BaseDialogFragment<DialogExerciseFinishBinding> {

    /* renamed from: d */
    public static final C7720a f11187d = new C7720a(null);

    /* renamed from: e */
    public static final int f11188e = 8;

    /* renamed from: a */
    public final InterfaceC8724d f11189a = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: p4.q
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return Float.valueOf(ExerciseFinishDialog.m10273s(this.f19351a));
        }
    });

    /* renamed from: b */
    public final InterfaceC8724d f11190b = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: p4.r
        @Override // p300x7.InterfaceC10559a
        public final Object invoke() {
            return Float.valueOf(ExerciseFinishDialog.m10274t(this.f19352a));
        }
    });

    /* renamed from: c */
    public final InterfaceC8724d f11191c;

    /* renamed from: com.zykj.study.dialog.ExerciseFinishDialog$a */
    public static final class C7720a {
        public /* synthetic */ C7720a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final ExerciseFinishDialog m10279a() {
            return new ExerciseFinishDialog();
        }

        public C7720a() {
        }
    }

    /* renamed from: com.zykj.study.dialog.ExerciseFinishDialog$b */
    public static final class C7721b implements TabLayout.OnTabSelectedListener {
        public C7721b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            TextView textView;
            AbstractC9133u.m16133g(tab, "tab");
            View customView = tab.getCustomView();
            if (customView == null || (textView = (TextView) customView.findViewById(R$id.tvContent)) == null) {
                return;
            }
            textView.setTextSize(0, ExerciseFinishDialog.this.m10275m());
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView;
            AbstractC9133u.m16133g(tab, "tab");
            View customView = tab.getCustomView();
            if (customView == null || (textView = (TextView) customView.findViewById(R$id.tvContent)) == null) {
                return;
            }
            textView.setTextSize(0, ExerciseFinishDialog.this.m10276n());
        }
    }

    public ExerciseFinishDialog() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f11191c = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ExerciseStatisticsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.dialog.ExerciseFinishDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.ExerciseFinishDialog$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a2 = interfaceC10559a;
                return (interfaceC10559a2 == null || (creationExtras = (CreationExtras) interfaceC10559a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.ExerciseFinishDialog$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: q */
    public static final void m10271q(ExerciseFinishDialog exerciseFinishDialog, TabLayout.Tab tab, int i10) {
        AbstractC9133u.m16133g(tab, "tab");
        ItemStuTabBinding itemStuTabBindingInflate = ItemStuTabBinding.inflate(exerciseFinishDialog.getLayoutInflater());
        AbstractC9133u.m16132f(itemStuTabBindingInflate, "inflate(...)");
        tab.setCustomView(itemStuTabBindingInflate.getRoot());
        itemStuTabBindingInflate.tvContent.setTextSize(0, exerciseFinishDialog.m10276n());
        itemStuTabBindingInflate.tvContent.setText(i10 == 0 ? exerciseFinishDialog.requireContext().getString(R$string.exercise_finish, Integer.valueOf(exerciseFinishDialog.m10277o().m12122n(true).size())) : exerciseFinishDialog.requireContext().getString(R$string.exercise_unfinish, Integer.valueOf(exerciseFinishDialog.m10277o().m12122n(false).size())));
    }

    /* renamed from: r */
    public static final C8736p m10272r(ExerciseFinishDialog exerciseFinishDialog, View it) {
        AbstractC9133u.m16133g(it, "it");
        exerciseFinishDialog.dismiss();
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final float m10273s(ExerciseFinishDialog exerciseFinishDialog) {
        return exerciseFinishDialog.getResources().getDimension(R$dimen.text_9);
    }

    /* renamed from: t */
    public static final float m10274t(ExerciseFinishDialog exerciseFinishDialog) {
        return exerciseFinishDialog.getResources().getDimension(R$dimen.text_8);
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m10278p();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_exercise_finish;
    }

    /* renamed from: m */
    public final float m10275m() {
        return ((Number) this.f11189a.getValue()).floatValue();
    }

    /* renamed from: n */
    public final float m10276n() {
        return ((Number) this.f11190b.getValue()).floatValue();
    }

    /* renamed from: o */
    public final ExerciseStatisticsViewModel m10277o() {
        return (ExerciseStatisticsViewModel) this.f11191c.getValue();
    }

    /* renamed from: p */
    public final void m10278p() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        setCancelable(false);
        ViewPager2 viewPager2 = getMBindView().viewPagerRead;
        final FragmentManager childFragmentManager = getChildFragmentManager();
        final Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        viewPager2.setAdapter(new FragmentStateAdapter(childFragmentManager, lifecycle) { // from class: com.zykj.study.dialog.ExerciseFinishDialog$initUI$2
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                return i10 == 0 ? ExerciseFinishDetailFragment.f11184b.m10263a(this.f11197a.m10277o().m12122n(true)) : ExerciseFinishDetailFragment.f11184b.m10263a(this.f11197a.m10277o().m12122n(false));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return 2;
            }
        });
        new TabLayoutMediator(getMBindView().tabLayout, getMBindView().viewPagerRead, new TabLayoutMediator.TabConfigurationStrategy() { // from class: p4.o
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i10) {
                ExerciseFinishDialog.m10271q(this.f19349a, tab, i10);
            }
        }).attach();
        getMBindView().tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C7721b());
        TabLayout.Tab tabAt = getMBindView().tabLayout.getTabAt(getMBindView().tabLayout.getSelectedTabPosition());
        if (tabAt != null) {
            getMBindView().tabLayout.selectTab(tabAt);
        }
        AppCompatImageView ivClose = getMBindView().ivClose;
        AbstractC9133u.m16132f(ivClose, "ivClose");
        AbstractC8354c.m13615r(ivClose, new InterfaceC10570l() { // from class: p4.p
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ExerciseFinishDialog.m10272r(this.f19350a, (View) obj);
            }
        });
    }
}
