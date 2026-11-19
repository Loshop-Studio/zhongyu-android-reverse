package com.friday.document.view.share;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.friday.common.helper.C5963c;
import com.friday.document.R$id;
import com.friday.document.R$layout;
import com.friday.document.databinding.FragmentStudentShareBinding;
import com.friday.document.model.ShareFile;
import com.friday.document.view.share.StudentShareFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p200j2.InterfaceC9669i;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class StudentShareFragment extends Hilt_StudentShareFragment<FragmentStudentShareBinding> implements InterfaceC9669i {

    /* renamed from: i */
    public final String[] f7666i = {"全部", "按教师"};

    /* renamed from: j */
    public List f7667j = new ArrayList();

    /* renamed from: A */
    public static final void m6104A(StudentShareFragment studentShareFragment, ShareFile shareFile) {
        AbstractC9979u.m20291d(shareFile);
        studentShareFragment.m6113w(shareFile);
    }

    /* renamed from: x */
    public static final void m6110x(StudentShareFragment studentShareFragment, int i10, ShareFile shareFile) {
        Object obj = studentShareFragment.f7667j.get(i10);
        ShareListFragment shareListFragment = obj instanceof ShareListFragment ? (ShareListFragment) obj : null;
        if (shareListFragment != null) {
            shareListFragment.m6070X(shareFile);
        }
    }

    /* renamed from: y */
    public static final void m6111y(View view) {
        C5963c.f6084a.m5316o();
    }

    /* renamed from: z */
    public static final void m6112z(StudentShareFragment studentShareFragment, TabLayout.Tab tab, int i10) {
        AbstractC9979u.m20294g(tab, "tab");
        tab.setText(studentShareFragment.f7666i[i10]);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.fragment_student_share;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        initView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.friday.common.base.BaseFragment
    public void initView() {
        super.initView();
        this.f7667j = AbstractC10978w.m24141s(new ShareListFragment(), new ShareByTeacherFragment());
        FragmentStateAdapter fragmentStateAdapter = new FragmentStateAdapter() { // from class: com.friday.document.view.share.StudentShareFragment$initView$tabAdapter$1
            {
                super(this.f7669a);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                Fragment fragment = (Fragment) AbstractC10947g0.m23947p0(this.f7669a.f7667j, i10);
                return fragment == null ? (Fragment) AbstractC10947g0.m23944m0(this.f7669a.f7667j) : fragment;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return 2;
            }
        };
        ((FragmentStudentShareBinding) getMBinding()).f6455g.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.friday.document.view.share.StudentShareFragment.initView.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                super.onPageSelected(i10);
                Object objM23947p0 = AbstractC10947g0.m23947p0(StudentShareFragment.this.f7667j, i10);
                AbstractC9979u.m20292e(objM23947p0, "null cannot be cast to non-null type com.friday.common.service.IShare");
                ((InterfaceC9669i) objM23947p0).mo6068l();
            }
        });
        ((FragmentStudentShareBinding) getMBinding()).f6451c.setOnClickListener(new View.OnClickListener() { // from class: x2.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentShareFragment.m6111y(view);
            }
        });
        ((FragmentStudentShareBinding) getMBinding()).f6455g.setAdapter(fragmentStateAdapter);
        ((FragmentStudentShareBinding) getMBinding()).f6455g.setUserInputEnabled(false);
        new TabLayoutMediator(((FragmentStudentShareBinding) getMBinding()).f6454f, ((FragmentStudentShareBinding) getMBinding()).f6455g, new TabLayoutMediator.TabConfigurationStrategy() { // from class: x2.y
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i10) {
                StudentShareFragment.m6112z(this.f27962a, tab, i10);
            }
        }).attach();
        getChildFragmentManager().beginTransaction().add(R$id.preview_container, new StudentSharePreviewFragment()).commitAllowingStateLoss();
        LiveEventBus.get("ShareSearchToDetailPath", ShareFile.class).observe(getViewLifecycleOwner(), new Observer() { // from class: x2.z
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentShareFragment.m6104A(this.f27963c, (ShareFile) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p200j2.InterfaceC9669i
    /* renamed from: l */
    public void mo6068l() {
        Object objM23947p0 = AbstractC10947g0.m23947p0(this.f7667j, ((FragmentStudentShareBinding) getMBinding()).f6455g.getCurrentItem());
        InterfaceC9669i interfaceC9669i = objM23947p0 instanceof InterfaceC9669i ? (InterfaceC9669i) objM23947p0 : null;
        if (interfaceC9669i != null) {
            interfaceC9669i.mo6068l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public final void m6113w(final ShareFile shareFile) {
        final int i10 = 0;
        if (((FragmentStudentShareBinding) getMBinding()).f6455g.getCurrentItem() != 0) {
            ((FragmentStudentShareBinding) getMBinding()).f6455g.setCurrentItem(0, true);
        }
        ((FragmentStudentShareBinding) getMBinding()).f6455g.postDelayed(new Runnable() { // from class: x2.a0
            @Override // java.lang.Runnable
            public final void run() {
                StudentShareFragment.m6110x(this.f27938c, i10, shareFile);
            }
        }, 300L);
    }
}
