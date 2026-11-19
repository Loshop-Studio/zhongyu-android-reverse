package com.zykj.study.p065ui.home.p066my;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
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
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.xuexiang.xui.widget.tabbar.TabControlView;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$array;
import com.zykj.study.R$color;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.bean.teach.CourseProgress;
import com.zykj.study.bean.teach.GroupMemberProgress;
import com.zykj.study.databinding.FragmentTeachDetailsBinding;
import com.zykj.study.p065ui.home.p066my.TeachDetailsFragment;
import com.zykj.study.viewmodels.TeachDetailsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8811w;
import p173m1.C9293a;
import p173m1.C9295c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p207p2.AbstractC9642d;
import p209p4.C9673y;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class TeachDetailsFragment extends Hilt_TeachDetailsFragment<FragmentTeachDetailsBinding> {

    /* renamed from: f */
    public final NavArgsLazy f13451f = new NavArgsLazy(AbstractC9137y.m16154b(TeachDetailsFragmentArgs.class), new C8081b(this));

    /* renamed from: g */
    public final InterfaceC8724d f13452g;

    /* renamed from: h */
    public C9673y f13453h;

    /* renamed from: com.zykj.study.ui.home.my.TeachDetailsFragment$a */
    public static final class C8080a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13461a;

        public C8080a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13461a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13461a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13461a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.TeachDetailsFragment$b */
    public static final class C8081b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f13462a;

        public C8081b(Fragment fragment) {
            this.f13462a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f13462a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f13462a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.TeachDetailsFragment", m17801f = "TeachDetailsFragment.kt", m17802l = {37}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.TeachDetailsFragment$initData$1 */
    public static final class C80821 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13463a;

        /* renamed from: c */
        public int f13465c;

        public C80821(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13463a = obj;
            this.f13465c |= Integer.MIN_VALUE;
            return TeachDetailsFragment.this.initData(this);
        }
    }

    public TeachDetailsFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f13452g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TeachDetailsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachDetailsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachDetailsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a2;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.TeachDetailsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* renamed from: o */
    public static final void m11706o(TeachDetailsFragment teachDetailsFragment, View view) {
        FragmentKt.findNavController(teachDetailsFragment).navigateUp();
    }

    /* renamed from: p */
    public static final C8736p m11707p(final TeachDetailsFragment teachDetailsFragment, final CourseProgress courseProgress) {
        Context contextRequireContext = teachDetailsFragment.requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        List<GroupMemberProgress> groupProgress = courseProgress.getGroupProgress();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(groupProgress, 10));
        Iterator<T> it = groupProgress.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9293a(((GroupMemberProgress) it.next()).getGroupName()));
        }
        C9673y c9673y = (C9673y) ((C9673y) new C9673y(contextRequireContext, AbstractC8778f0.m14544U0(arrayList)).m18233z(teachDetailsFragment.getResources().getDimensionPixelSize(R$dimen.view_100), 0, new AbstractC9642d.b() { // from class: b5.k5
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                TeachDetailsFragment.m11708q(this.f2187a, courseProgress, c9295c, c9293a, i10);
            }
        })).m18231B(true);
        teachDetailsFragment.f13453h = c9673y;
        if (c9673y != null) {
            c9673y.m18226s(2);
        }
        C9673y c9673y2 = teachDetailsFragment.f13453h;
        if (c9673y2 != null) {
            c9673y2.m18218n(new PopupWindow.OnDismissListener() { // from class: b5.l5
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    TeachDetailsFragment.m11709r(this.f2197a);
                }
            });
        }
        return C8736p.f16368a;
    }

    /* renamed from: q */
    public static final void m11708q(TeachDetailsFragment teachDetailsFragment, CourseProgress courseProgress, C9295c c9295c, C9293a c9293a, int i10) {
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        teachDetailsFragment.m11713n().m12299c().setValue(courseProgress.getGroupProgress().get(i10));
    }

    /* renamed from: r */
    public static final void m11709r(TeachDetailsFragment teachDetailsFragment) {
        teachDetailsFragment.m11713n().m12304h().setValue(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final void m11710s(TabControlView tabControlView, TeachDetailsFragment teachDetailsFragment, String title, String str) throws Resources.NotFoundException {
        AbstractC9133u.m16133g(title, "title");
        AbstractC9133u.m16133g(str, "<unused var>");
        String[] stringArray = tabControlView.getResources().getStringArray(R$array.teach_menu);
        AbstractC9133u.m16132f(stringArray, "getStringArray(...)");
        int iM14679H0 = AbstractC8801r.m14679H0(stringArray, title);
        ((FragmentTeachDetailsBinding) teachDetailsFragment.getMBindView()).viewPager.setCurrentItem(iM14679H0);
        teachDetailsFragment.m11713n().m12301e().setValue(Integer.valueOf(iM14679H0));
    }

    /* renamed from: t */
    public static final void m11711t(TeachDetailsFragment teachDetailsFragment, View view) {
        teachDetailsFragment.m11713n().m12304h().setValue(Boolean.TRUE);
        C9673y c9673y = teachDetailsFragment.f13453h;
        if (c9673y != null) {
            c9673y.mo18229v(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initData(p179m7.InterfaceC9324c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.TeachDetailsFragment.C80821
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.TeachDetailsFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.TeachDetailsFragment.C80821) r0
            int r1 = r0.f13465c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13465c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.TeachDetailsFragment$initData$1 r0 = new com.zykj.study.ui.home.my.TeachDetailsFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13463a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13465c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.AbstractC9079b.m15926b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.AbstractC9079b.m15926b(r5)
            r0.f13465c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.TeachDetailsViewModel r5 = r4.m11713n()
            androidx.lifecycle.MutableLiveData r5 = r5.m12302f()
            com.zykj.study.ui.home.my.TeachDetailsFragmentArgs r0 = r4.m11712m()
            int r0 = r0.m11716b()
            java.lang.Integer r0 = p201o7.AbstractC9536a.m17798c(r0)
            r5.setValue(r0)
            com.zykj.study.viewmodels.TeachDetailsViewModel r5 = r4.m11713n()
            androidx.lifecycle.MutableLiveData r5 = r5.m12297a()
            com.zykj.study.ui.home.my.TeachDetailsFragmentArgs r0 = r4.m11712m()
            com.zykj.study.bean.course.CourseBean r0 = r0.m11715a()
            r5.setValue(r0)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.TeachDetailsFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/TeachDetailsFragment.smali:718
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentTeachDetailsBinding) getMBindView()).setViewModel(m11713n());
        ((FragmentTeachDetailsBinding) getMBindView()).toolbar.m6535p(getString(R$string.arrow_left_return)).m6537r(getResources().getColor(R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6533n(new View.OnClickListener() { // from class: b5.g5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeachDetailsFragment.m11706o(this.f2163a, view);
            }
        });
        try {
            View viewInflate = LayoutInflater.from(requireContext()).inflate(R$layout.view_tab_control_teach_details_title, (ViewGroup) null, false);
            final TabControlView tabControlView = (TabControlView) viewInflate.findViewById(R$id.control_view);
            tabControlView.m7182h(new TabControlView.InterfaceC7012b() { // from class: b5.h5
                @Override // com.xuexiang.xui.widget.tabbar.TabControlView.InterfaceC7012b
                /* renamed from: a */
                public final void mo2088a(String str, String str2) throws Resources.NotFoundException {
                    TeachDetailsFragment.m11710s(tabControlView, this, str, str2);
                }
            });
            Integer num = (Integer) m11713n().m12301e().getValue();
            if (num != null) {
                tabControlView.m7180f(num.intValue());
            }
            ((FragmentTeachDetailsBinding) getMBindView()).toolbar.m6532m(viewInflate);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ViewPager2 viewPager2 = ((FragmentTeachDetailsBinding) getMBindView()).viewPager;
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOffscreenPageLimit(2);
        viewPager2.setAdapter(new FragmentStateAdapter(this) { // from class: com.zykj.study.ui.home.my.TeachDetailsFragment$initView$4$1
            {
                super(this);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter
            public Fragment createFragment(int i10) {
                return i10 == 0 ? new CourseViewFragment() : new StudentViewFragment();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return 2;
            }
        });
        ((FragmentTeachDetailsBinding) getMBindView()).tvCourseProgress.setOnClickListener(new View.OnClickListener() { // from class: b5.i5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TeachDetailsFragment.m11711t(this.f2174a, view);
            }
        });
        m11713n().m12298b().observe(getViewLifecycleOwner(), new C8080a(new InterfaceC10570l() { // from class: b5.j5
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return TeachDetailsFragment.m11707p(this.f2181a, (CourseProgress) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_teach_details;
    }

    /* renamed from: m */
    public final TeachDetailsFragmentArgs m11712m() {
        return (TeachDetailsFragmentArgs) this.f13451f.getValue();
    }

    /* renamed from: n */
    public final TeachDetailsViewModel m11713n() {
        return (TeachDetailsViewModel) this.f13452g.getValue();
    }
}
