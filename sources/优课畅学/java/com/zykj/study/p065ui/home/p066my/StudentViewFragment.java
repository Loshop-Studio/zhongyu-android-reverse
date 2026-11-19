package com.zykj.study.p065ui.home.p066my;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.SuperviseGroupAddAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.course.CourseBean;
import com.zykj.study.bean.teach.CourseBindBean;
import com.zykj.study.databinding.FragmentStudentViewBinding;
import com.zykj.study.p065ui.home.p066my.StudentViewFragment;
import com.zykj.study.viewmodels.StudentViewViewModel;
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
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class StudentViewFragment extends Hilt_StudentViewFragment<FragmentStudentViewBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13369f;

    /* renamed from: g */
    public final InterfaceC8724d f13370g;

    /* renamed from: com.zykj.study.ui.home.my.StudentViewFragment$a */
    public static final class C8068a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13384a;

        public C8068a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13384a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13384a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13384a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentViewFragment", m17801f = "StudentViewFragment.kt", m17802l = {36}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.StudentViewFragment$initData$1 */
    public static final class C80691 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13389a;

        /* renamed from: c */
        public int f13391c;

        public C80691(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13389a = obj;
            this.f13391c |= Integer.MIN_VALUE;
            return StudentViewFragment.this.initData(this);
        }
    }

    public StudentViewFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: b5.g4
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return StudentViewFragment.m11647x(this.f2162a);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f13369f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(TeachDetailsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$4
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        this.f13370g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(StudentViewViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a4 = interfaceC10559a2;
                if (interfaceC10559a4 != null && (creationExtras = (CreationExtras) interfaceC10559a4.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
    }

    /* renamed from: p */
    public static final void m11639p(SuperviseGroupAddAdapter superviseGroupAddAdapter, StudentViewFragment studentViewFragment, MaterialDialog dialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(dialog, "dialog");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        List listM10132d = superviseGroupAddAdapter.m10132d();
        if (listM10132d.isEmpty() || AbstractC8778f0.m14568n0(listM10132d) == null) {
            AbstractC8366o.m13652d(XToastUtils.INSTANCE, "请选择学员组");
            return;
        }
        CourseBindBean courseBindBean = (CourseBindBean) AbstractC8778f0.m14568n0(listM10132d);
        if (courseBindBean != null) {
            LifecycleOwner viewLifecycleOwner = studentViewFragment.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new StudentViewFragment$addSuperviseGroup$1$dialog$2$1$1$1(studentViewFragment, courseBindBean, dialog, null), 3, null);
        }
    }

    /* renamed from: q */
    public static final void m11640q(MaterialDialog dialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(dialog, "dialog");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final StudentViewViewModel m11641r() {
        return (StudentViewViewModel) this.f13370g.getValue();
    }

    /* renamed from: s */
    private final TeachDetailsViewModel m11642s() {
        return (TeachDetailsViewModel) this.f13369f.getValue();
    }

    /* renamed from: t */
    public static final C8736p m11643t(StudentViewFragment studentViewFragment, Integer num) {
        studentViewFragment.m11641r().m12273h().setValue(num);
        LifecycleOwnerKt.getLifecycleScope(studentViewFragment).launchWhenResumed(new StudentViewFragment$initData$2$1(studentViewFragment, null));
        return C8736p.f16368a;
    }

    /* renamed from: u */
    public static final C8736p m11644u(StudentViewFragment studentViewFragment, CourseBean courseBean) {
        studentViewFragment.m11641r().m12267b().setValue(courseBean);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public static final C8736p m11645v(final StudentViewFragment studentViewFragment, List list) {
        if (list.isEmpty()) {
            View viewInflate = LayoutInflater.from(studentViewFragment.requireContext()).inflate(R$layout.layout_status_no_supervise_group, (ViewGroup) null, false);
            ((Button) viewInflate.findViewById(R$id.btn_create)).setOnClickListener(new View.OnClickListener() { // from class: b5.k4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StudentViewFragment.m11646w(this.f2186a, view);
                }
            });
            ((FragmentStudentViewBinding) studentViewFragment.getMBindView()).multipleStatusView.m7161h(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        } else {
            ((FragmentStudentViewBinding) studentViewFragment.getMBindView()).multipleStatusView.m7157d();
        }
        return C8736p.f16368a;
    }

    /* renamed from: w */
    public static final void m11646w(StudentViewFragment studentViewFragment, View view) {
        studentViewFragment.m11648o();
    }

    /* renamed from: x */
    public static final ViewModelStoreOwner m11647x(StudentViewFragment studentViewFragment) {
        Fragment fragmentRequireParentFragment = studentViewFragment.requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.StudentViewFragment.C80691
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.StudentViewFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.StudentViewFragment.C80691) r0
            int r1 = r0.f13391c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13391c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.StudentViewFragment$initData$1 r0 = new com.zykj.study.ui.home.my.StudentViewFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13389a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13391c
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
            r0.f13391c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.viewmodels.TeachDetailsViewModel r5 = r4.m11642s()
            androidx.lifecycle.MutableLiveData r5 = r5.m12302f()
            b5.i4 r0 = new b5.i4
            r0.<init>()
            com.zykj.study.ui.home.my.StudentViewFragment$a r1 = new com.zykj.study.ui.home.my.StudentViewFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            com.zykj.study.viewmodels.TeachDetailsViewModel r5 = r4.m11642s()
            androidx.lifecycle.MutableLiveData r5 = r5.m12297a()
            b5.j4 r0 = new b5.j4
            r0.<init>()
            com.zykj.study.ui.home.my.StudentViewFragment$a r1 = new com.zykj.study.ui.home.my.StudentViewFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.StudentViewFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentViewFragment.smali:791
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentStudentViewBinding) getMBindView()).setEntity(m11641r());
        m11641r().m12272g().observe(getViewLifecycleOwner(), new C8068a(new InterfaceC10570l() { // from class: b5.h4
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return StudentViewFragment.m11645v(this.f2165a, (List) obj);
            }
        }));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_student_view;
    }

    /* renamed from: o */
    public final void m11648o() {
        Resources resources;
        List list = (List) m11641r().m12268c().getValue();
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SelectModel(false, (CourseBindBean) it.next()));
            }
            final SuperviseGroupAddAdapter superviseGroupAddAdapter = new SuperviseGroupAddAdapter(AbstractC8778f0.m14544U0(arrayList));
            MaterialDialog.C6913g c6913gM6738I = new MaterialDialog.C6913g(requireContext()).m6737H("选择学员组").m6738I(GravityEnum.CENTER);
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((CourseBindBean) it2.next()).getName());
            }
            Window window = c6913gM6738I.m6756q(AbstractC8778f0.m14544U0(arrayList2)).m6741b(false).m6740a(superviseGroupAddAdapter, new LinearLayoutManager(requireContext(), 1, false)).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.l4
                @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
                /* renamed from: a */
                public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                    StudentViewFragment.m11639p(superviseGroupAddAdapter, this, materialDialog, dialogAction);
                }
            }).m6761v(new MaterialDialog.InterfaceC6915i() { // from class: b5.m4
                @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
                /* renamed from: a */
                public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                    StudentViewFragment.m11640q(materialDialog, dialogAction);
                }
            }).m6765z(R$string.sure).m6759t(R$string.cancel).m6734E().getWindow();
            if (window != null) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Context context = getContext();
                attributes.width = (context == null || (resources = context.getResources()) == null) ? ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION : (int) resources.getDimension(R$dimen.view_250);
                window.setAttributes(attributes);
            }
        }
    }
}
