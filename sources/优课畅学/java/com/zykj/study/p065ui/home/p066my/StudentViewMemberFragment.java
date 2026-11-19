package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6874d;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.StudentViewMemberAdapter;
import com.zykj.study.adapter.StudentViewMemberSearchAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.bean.teach.SuperviseGroup;
import com.zykj.study.bean.teach.SuperviseGroupMember;
import com.zykj.study.bean.teach.SuperviseGroupSelectBean;
import com.zykj.study.databinding.FragmentStudentViewMemberBinding;
import com.zykj.study.p065ui.home.p066my.StudentViewMemberFragment;
import com.zykj.study.viewmodels.StudentViewViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p135i8.AbstractC8839h;
import p173m1.C9293a;
import p173m1.C9295c;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p207p2.AbstractC9642d;
import p209p4.C9670v;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class StudentViewMemberFragment extends Hilt_StudentViewMemberFragment<FragmentStudentViewMemberBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13394f;

    /* renamed from: g */
    public StudentViewMemberAdapter f13395g;

    /* renamed from: h */
    public StudentViewMemberSearchAdapter f13396h;

    /* renamed from: i */
    public C9670v f13397i;

    /* renamed from: j */
    public Gson f13398j;

    /* renamed from: com.zykj.study.ui.home.my.StudentViewMemberFragment$a */
    public static final class C8070a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13405a;

        public C8070a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13405a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13405a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13405a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentViewMemberFragment", m17801f = "StudentViewMemberFragment.kt", m17802l = {47}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.my.StudentViewMemberFragment$initData$1 */
    public static final class C80711 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f13406a;

        /* renamed from: c */
        public int f13408c;

        public C80711(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13406a = obj;
            this.f13408c |= Integer.MIN_VALUE;
            return StudentViewMemberFragment.this.initData(this);
        }
    }

    public StudentViewMemberFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: b5.v4
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return StudentViewMemberFragment.m11655K(this.f2268a);
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewMemberFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f13394f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(StudentViewViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewMemberFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewMemberFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.StudentViewMemberFragment$special$$inlined$viewModels$default$4
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
        this.f13398j = new Gson();
    }

    /* renamed from: B */
    public static final void m11649B(StudentViewMemberFragment studentViewMemberFragment, C9295c c9295c, C9293a c9293a, int i10) {
        SuperviseGroup superviseGroupM18237D;
        C9670v c9670v;
        SuperviseGroup superviseGroupM18237D2;
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        if (i10 != 0) {
            if (i10 != 1 || (c9670v = studentViewMemberFragment.f13397i) == null || (superviseGroupM18237D2 = c9670v.m18237D()) == null) {
                return;
            }
            studentViewMemberFragment.m11679I(superviseGroupM18237D2);
            return;
        }
        C9670v c9670v2 = studentViewMemberFragment.f13397i;
        if (c9670v2 == null || (superviseGroupM18237D = c9670v2.m18237D()) == null) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = studentViewMemberFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new StudentViewMemberFragment$initMenuPopup$1$1$1(studentViewMemberFragment, superviseGroupM18237D, null), 3, null);
    }

    /* renamed from: C */
    public static final void m11650C(StudentViewMemberFragment studentViewMemberFragment, View view) {
        Fragment fragmentRequireParentFragment = studentViewMemberFragment.requireParentFragment();
        if (fragmentRequireParentFragment instanceof StudentViewFragment) {
            ((StudentViewFragment) fragmentRequireParentFragment).m11648o();
        }
    }

    /* renamed from: D */
    public static final boolean m11651D(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6436e(textView);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public static final boolean m11652F(StudentViewMemberFragment studentViewMemberFragment, View view, MotionEvent motionEvent) {
        if (!AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6437f(((FragmentStudentViewMemberBinding) studentViewMemberFragment.getMBindView()).etSearch, motionEvent)) {
            return false;
        }
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6436e(((FragmentStudentViewMemberBinding) studentViewMemberFragment.getMBindView()).etSearch);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    public static final void m11653G(StudentViewMemberFragment studentViewMemberFragment, View view) {
        if (AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6439h(studentViewMemberFragment.getActivity())) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6436e(((FragmentStudentViewMemberBinding) studentViewMemberFragment.getMBindView()).etSearch);
        }
    }

    /* renamed from: J */
    public static final void m11654J(StudentViewMemberFragment studentViewMemberFragment, SuperviseGroup superviseGroup, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        LifecycleOwner viewLifecycleOwner = studentViewMemberFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new StudentViewMemberFragment$showRemoveGroupDialog$1$1(studentViewMemberFragment, superviseGroup, null), 3, null);
    }

    /* renamed from: K */
    public static final ViewModelStoreOwner m11655K(StudentViewMemberFragment studentViewMemberFragment) {
        Fragment fragmentRequireParentFragment = studentViewMemberFragment.requireParentFragment();
        AbstractC9133u.m16132f(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final StudentViewViewModel m11670u() {
        return (StudentViewViewModel) this.f13394f.getValue();
    }

    /* renamed from: v */
    public static final C8736p m11671v(StudentViewMemberFragment studentViewMemberFragment, View view, SuperviseGroup item) {
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(item, "item");
        LifecycleOwner viewLifecycleOwner = studentViewMemberFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new StudentViewMemberFragment$initData$2$1(studentViewMemberFragment, view, item, null));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final C8736p m11672w(StudentViewMemberFragment studentViewMemberFragment, SuperviseGroup group, SuperviseGroupMember member) {
        AbstractC9133u.m16133g(group, "group");
        AbstractC9133u.m16133g(member, "member");
        studentViewMemberFragment.m11670u().m12269d().setValue(new SuperviseGroupSelectBean(group, member));
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6436e(((FragmentStudentViewMemberBinding) studentViewMemberFragment.getMBindView()).etSearch);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public static final C8736p m11673x(StudentViewMemberFragment studentViewMemberFragment, String str) {
        List listM10119e;
        Object next;
        List listM10119e2;
        Object next2;
        SelectModel selectModel;
        Object next3;
        List<SuperviseGroup> list = (List) studentViewMemberFragment.m11670u().m12272g().getValue();
        if (list != null) {
            if (str == null || str.length() == 0) {
                StudentViewMemberSearchAdapter studentViewMemberSearchAdapter = studentViewMemberFragment.f13396h;
                if (studentViewMemberSearchAdapter != null && (listM10119e = studentViewMemberSearchAdapter.m10119e()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listM10119e) {
                        if (((SelectModel) obj).isSelectModel()) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
                    for (SuperviseGroup superviseGroup : list) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((SuperviseGroup) ((SelectModel) next).getData()).getId() == superviseGroup.getId()) {
                                break;
                            }
                        }
                        SelectModel selectModel2 = (SelectModel) next;
                        arrayList2.add(new SelectModel(selectModel2 != null ? selectModel2.isSelectModel() : false, superviseGroup));
                    }
                    List listM14544U0 = AbstractC8778f0.m14544U0(arrayList2);
                    StudentViewMemberAdapter studentViewMemberAdapter = studentViewMemberFragment.f13395g;
                    if (studentViewMemberAdapter != null) {
                        studentViewMemberAdapter.m10107l(listM14544U0);
                    }
                    StudentViewMemberAdapter studentViewMemberAdapter2 = studentViewMemberFragment.f13395g;
                    if (studentViewMemberAdapter2 != null) {
                        SuperviseGroupSelectBean superviseGroupSelectBean = (SuperviseGroupSelectBean) studentViewMemberFragment.m11670u().m12269d().getValue();
                        studentViewMemberAdapter2.m10108m(superviseGroupSelectBean != null ? superviseGroupSelectBean.getSuperviseGroupMember() : null);
                    }
                }
                StudentViewMemberSearchAdapter studentViewMemberSearchAdapter2 = studentViewMemberFragment.f13396h;
                if (studentViewMemberSearchAdapter2 != null) {
                    studentViewMemberSearchAdapter2.m10122j(AbstractC8809v.m14771n());
                }
            } else {
                StudentViewMemberSearchAdapter studentViewMemberSearchAdapter3 = studentViewMemberFragment.f13396h;
                if (studentViewMemberSearchAdapter3 != null && (listM10119e2 = studentViewMemberSearchAdapter3.m10119e()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listM10119e2) {
                        if (((SelectModel) obj2).isSelectModel()) {
                            arrayList3.add(obj2);
                        }
                    }
                    Object objFromJson = studentViewMemberFragment.f13398j.fromJson(studentViewMemberFragment.f13398j.toJson(list), (Class<Object>) SuperviseGroup[].class);
                    AbstractC9133u.m16132f(objFromJson, "fromJson(...)");
                    List listM14667A1 = AbstractC8801r.m14667A1((Object[]) objFromJson);
                    ArrayList<SuperviseGroup> arrayList4 = new ArrayList();
                    for (Object obj3 : listM14667A1) {
                        SuperviseGroup superviseGroup2 = (SuperviseGroup) obj3;
                        List listM14547X0 = AbstractC8778f0.m14547X0(superviseGroup2.getMemberList());
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj4 : listM14547X0) {
                            if (AbstractC8661c0.m13973S(((SuperviseGroupMember) obj4).getUserName(), str, false, 2, null)) {
                                arrayList5.add(obj4);
                            }
                        }
                        superviseGroup2.setMemberList(arrayList5);
                        if (!superviseGroup2.getMemberList().isEmpty()) {
                            arrayList4.add(obj3);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(AbstractC8811w.m14786x(arrayList4, 10));
                    for (SuperviseGroup superviseGroup3 : arrayList4) {
                        Iterator it2 = arrayList3.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it2.next();
                            if (((SuperviseGroup) ((SelectModel) next3).getData()).getId() == superviseGroup3.getId()) {
                                break;
                            }
                        }
                        SelectModel selectModel3 = (SelectModel) next3;
                        arrayList6.add(new SelectModel(selectModel3 != null ? selectModel3.isSelectModel() : false, superviseGroup3));
                    }
                    List listM14544U02 = AbstractC8778f0.m14544U0(arrayList6);
                    Iterator it3 = listM14544U02.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        if (((SelectModel) next2).isSelectModel()) {
                            break;
                        }
                    }
                    if (((SelectModel) next2) == null && (selectModel = (SelectModel) AbstractC8778f0.m14568n0(listM14544U02)) != null) {
                        selectModel.setSelectModel(true);
                    }
                    if (listM14544U02.isEmpty()) {
                        ((FragmentStudentViewMemberBinding) studentViewMemberFragment.getMBindView()).multipleStatusView.m7159f();
                    } else {
                        ((FragmentStudentViewMemberBinding) studentViewMemberFragment.getMBindView()).multipleStatusView.m7157d();
                    }
                    StudentViewMemberSearchAdapter studentViewMemberSearchAdapter4 = studentViewMemberFragment.f13396h;
                    if (studentViewMemberSearchAdapter4 != null) {
                        studentViewMemberSearchAdapter4.m10122j(listM14544U02);
                    }
                    StudentViewMemberAdapter studentViewMemberAdapter3 = studentViewMemberFragment.f13395g;
                    if (studentViewMemberAdapter3 != null) {
                        SuperviseGroupSelectBean superviseGroupSelectBean2 = (SuperviseGroupSelectBean) studentViewMemberFragment.m11670u().m12269d().getValue();
                        studentViewMemberAdapter3.m10108m(superviseGroupSelectBean2 != null ? superviseGroupSelectBean2.getSuperviseGroupMember() : null);
                    }
                }
            }
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public static final C8736p m11674y(StudentViewMemberFragment studentViewMemberFragment, SuperviseGroup group, SuperviseGroupMember member) {
        AbstractC9133u.m16133g(group, "group");
        AbstractC9133u.m16133g(member, "member");
        studentViewMemberFragment.m11670u().m12269d().setValue(new SuperviseGroupSelectBean(group, member));
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6436e(((FragmentStudentViewMemberBinding) studentViewMemberFragment.getMBindView()).etSearch);
        return C8736p.f16368a;
    }

    /* renamed from: z */
    public static final C8736p m11675z(StudentViewMemberFragment studentViewMemberFragment, List list) {
        List listM10104f;
        Object next;
        StudentViewMemberAdapter studentViewMemberAdapter = studentViewMemberFragment.f13395g;
        if (studentViewMemberAdapter != null && (listM10104f = studentViewMemberAdapter.m10104f()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM10104f) {
                if (((SelectModel) obj).isSelectModel()) {
                    arrayList.add(obj);
                }
            }
            AbstractC9133u.m16130d(list);
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SuperviseGroup superviseGroup = (SuperviseGroup) it.next();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (((SuperviseGroup) ((SelectModel) next).getData()).getId() == superviseGroup.getId()) {
                        break;
                    }
                }
                SelectModel selectModel = (SelectModel) next;
                arrayList2.add(new SelectModel(selectModel != null ? selectModel.isSelectModel() : false, superviseGroup));
            }
            List listM14544U0 = AbstractC8778f0.m14544U0(arrayList2);
            StudentViewMemberAdapter studentViewMemberAdapter2 = studentViewMemberFragment.f13395g;
            if (studentViewMemberAdapter2 != null) {
                studentViewMemberAdapter2.m10107l(listM14544U0);
            }
        }
        return C8736p.f16368a;
    }

    /* renamed from: A */
    public final void m11676A() {
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        this.f13397i = (C9670v) ((C9670v) new C9670v(contextRequireContext, AbstractC8809v.m14774q(new C9293a(getString(R$string.refresh_member)), new C9293a(getString(R$string.remove_group_member)))).m18233z(getResources().getDimensionPixelSize(R$dimen.view_70), 0, new AbstractC9642d.b() { // from class: b5.y4
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                StudentViewMemberFragment.m11649B(this.f2283a, c9295c, c9293a, i10);
            }
        })).m18231B(true);
    }

    /* renamed from: E */
    public final void m11677E(View view) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: b5.z4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return StudentViewMemberFragment.m11652F(this.f2290a, view2, motionEvent);
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: b5.p4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StudentViewMemberFragment.m11653G(this.f2227a, view2);
            }
        });
    }

    /* renamed from: H */
    public final void m11678H(View view, SuperviseGroup superviseGroup) {
        C9670v c9670v = this.f13397i;
        if (c9670v != null) {
            c9670v.m18238E(superviseGroup);
        }
        C9670v c9670v2 = this.f13397i;
        if (c9670v2 != null) {
            c9670v2.mo18229v(view);
        }
    }

    /* renamed from: I */
    public final void m11679I(final SuperviseGroup superviseGroup) {
        new MaterialDialog.C6913g(requireContext()).m6737H(getString(R$string.hint)).m6738I(GravityEnum.CENTER).m6749j(getString(R$string.remove_group_member_hint)).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.q4
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                StudentViewMemberFragment.m11654J(this.f2235a, superviseGroup, materialDialog, dialogAction);
            }
        }).m6765z(R$string.sure).m6759t(R$string.cancel).m6734E();
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.p066my.StudentViewMemberFragment.C80711
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.my.StudentViewMemberFragment$initData$1 r0 = (com.zykj.study.p065ui.home.p066my.StudentViewMemberFragment.C80711) r0
            int r1 = r0.f13408c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13408c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.my.StudentViewMemberFragment$initData$1 r0 = new com.zykj.study.ui.home.my.StudentViewMemberFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13406a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f13408c
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
            r0.f13408c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            com.zykj.study.adapter.StudentViewMemberAdapter r5 = new com.zykj.study.adapter.StudentViewMemberAdapter
            b5.o4 r0 = new b5.o4
            r0.<init>()
            b5.r4 r1 = new b5.r4
            r1.<init>()
            r5.<init>(r0, r1)
            r4.f13395g = r5
            com.zykj.study.adapter.StudentViewMemberSearchAdapter r5 = new com.zykj.study.adapter.StudentViewMemberSearchAdapter
            b5.s4 r0 = new b5.s4
            r0.<init>()
            r5.<init>(r0)
            r4.f13396h = r5
            com.zykj.study.viewmodels.StudentViewViewModel r5 = r4.m11670u()
            androidx.lifecycle.MutableLiveData r5 = r5.m12272g()
            b5.t4 r0 = new b5.t4
            r0.<init>()
            com.zykj.study.ui.home.my.StudentViewMemberFragment$a r1 = new com.zykj.study.ui.home.my.StudentViewMemberFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            com.zykj.study.viewmodels.StudentViewViewModel r5 = r4.m11670u()
            androidx.lifecycle.MutableLiveData r5 = r5.m12271f()
            b5.u4 r0 = new b5.u4
            r0.<init>()
            com.zykj.study.ui.home.my.StudentViewMemberFragment$a r1 = new com.zykj.study.ui.home.my.StudentViewMemberFragment$a
            r1.<init>(r0)
            r5.observe(r4, r1)
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.StudentViewMemberFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/StudentViewMemberFragment.smali:2737
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentStudentViewMemberBinding) getMBindView()).setViewModel(m11670u());
        RecyclerView recyclerView = ((FragmentStudentViewMemberBinding) getMBindView()).recycler;
        recyclerView.setAdapter(this.f13395g);
        AbstractC9133u.m16130d(recyclerView);
        m11677E(recyclerView);
        RecyclerView recyclerView2 = ((FragmentStudentViewMemberBinding) getMBindView()).recyclerSearch;
        recyclerView2.setAdapter(this.f13396h);
        AbstractC9133u.m16130d(recyclerView2);
        m11677E(recyclerView2);
        m11676A();
        ((FragmentStudentViewMemberBinding) getMBindView()).btnCreate.setOnClickListener(new View.OnClickListener() { // from class: b5.w4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentViewMemberFragment.m11650C(this.f2274a, view);
            }
        });
        ((FragmentStudentViewMemberBinding) getMBindView()).etSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: b5.x4
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return StudentViewMemberFragment.m11651D(textView, i10, keyEvent);
            }
        });
        View root = ((FragmentStudentViewMemberBinding) getMBindView()).getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        m11677E(root);
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_student_view_member;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6439h(getActivity())) {
            AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6444m();
        }
    }
}
