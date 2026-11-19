package com.zykj.study.dialog;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.CatalogGradeAdapter;
import com.zykj.study.adapter.CatalogPeriodAdapter;
import com.zykj.study.adapter.CatalogSubjectAdapter;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.GradeEntity;
import com.zykj.study.data.PeriodEntity;
import com.zykj.study.data.SubjectEntity;
import com.zykj.study.databinding.DialogCatalogBinding;
import com.zykj.study.dialog.CatalogDialog;
import com.zykj.study.viewmodels.CatalogViewModel;
import com.zykj.study.viewmodels.DictViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.AbstractC8366o;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8811w;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class CatalogDialog extends Hilt_CatalogDialog<DialogCatalogBinding> {

    /* renamed from: i */
    public static final C7706a f11149i = new C7706a(null);

    /* renamed from: j */
    public static final int f11150j = 8;

    /* renamed from: f */
    public final InterfaceC8724d f11151f;

    /* renamed from: g */
    public final InterfaceC8724d f11152g;

    /* renamed from: h */
    public final NavArgsLazy f11153h;

    /* renamed from: com.zykj.study.dialog.CatalogDialog$a */
    public static final class C7706a {
        public /* synthetic */ C7706a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7706a() {
        }
    }

    /* renamed from: com.zykj.study.dialog.CatalogDialog$b */
    public static final class C7707b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f11165a;

        public C7707b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f11165a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f11165a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11165a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.dialog.CatalogDialog$c */
    public static final class C7708c implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11166a;

        public C7708c(Fragment fragment) {
            this.f11166a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11166a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11166a + " has null arguments");
        }
    }

    public CatalogDialog() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f11151f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f11152g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(CatalogViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a3 = interfaceC10559a;
                if (interfaceC10559a3 != null && (creationExtras = (CreationExtras) interfaceC10559a3.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.dialog.CatalogDialog$special$$inlined$viewModels$default$5
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
        this.f11153h = new NavArgsLazy(AbstractC9137y.m16154b(CatalogDialogArgs.class), new C7708c(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    public static final void m10224m(CatalogDialog catalogDialog, View view) {
        Integer num = (Integer) catalogDialog.m10227j().m12031c().getValue();
        if (num != null && num.intValue() == 0) {
            AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.please_choice_subject);
            return;
        }
        FragmentKt.setFragmentResult(catalogDialog, "subject_id", BundleKt.bundleOf(AbstractC8726f.m14230a("subject_id", catalogDialog.m10227j().m12031c().getValue())));
        FragmentKt.setFragmentResult(catalogDialog, "period_id", BundleKt.bundleOf(AbstractC8726f.m14230a("period_id", catalogDialog.m10227j().m12030b().getValue())));
        FragmentKt.setFragmentResult(catalogDialog, "grade_id", BundleKt.bundleOf(AbstractC8726f.m14230a("grade_id", catalogDialog.m10227j().m12029a().getValue())));
        androidx.navigation.fragment.FragmentKt.findNavController(catalogDialog).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final C8736p m10225n(CatalogDialog catalogDialog, Integer num) {
        RecyclerView recyclerViewGrade = ((DialogCatalogBinding) catalogDialog.getMBindView()).recyclerViewGrade;
        AbstractC9133u.m16132f(recyclerViewGrade, "recyclerViewGrade");
        catalogDialog.m10230o(recyclerViewGrade);
        return C8736p.f16368a;
    }

    /* renamed from: i */
    public final CatalogDialogArgs m10226i() {
        return (CatalogDialogArgs) this.f11153h.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        Window window;
        ((DialogCatalogBinding) getMBindView()).setEntity(m10227j());
        m10227j().m12031c().setValue(AbstractC9536a.m17798c(m10226i().m10234c()));
        m10227j().m12030b().setValue(AbstractC9536a.m17798c(m10226i().m10233b()));
        m10227j().m12029a().setValue(AbstractC9536a.m17798c(m10226i().m10232a()));
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        ((DialogCatalogBinding) getMBindView()).tvSure.setOnClickListener(new View.OnClickListener() { // from class: p4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CatalogDialog.m10224m(this.f19338a, view);
            }
        });
        RecyclerView recyclerView = ((DialogCatalogBinding) getMBindView()).recyclerViewSubject;
        List<SubjectEntity> listM12080l = m10228k().m12080l();
        if (listM12080l != null) {
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM12080l, 10));
            for (SubjectEntity subjectEntity : listM12080l) {
                int id = subjectEntity.getId();
                Integer num = (Integer) m10227j().m12031c().getValue();
                arrayList.add(new SelectModel(num != null && id == num.intValue(), subjectEntity));
            }
            recyclerView.setAdapter(new CatalogSubjectAdapter(m10227j(), arrayList));
        }
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 8));
        AbstractC9133u.m16130d(recyclerView);
        m10229l(recyclerView);
        RecyclerView recyclerView2 = ((DialogCatalogBinding) getMBindView()).recyclerViewPeriod;
        List<PeriodEntity> listM12078j = m10228k().m12078j();
        if (listM12078j != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(listM12078j, 10));
            for (PeriodEntity periodEntity : listM12078j) {
                int id2 = periodEntity.getId();
                Integer num2 = (Integer) m10227j().m12030b().getValue();
                arrayList2.add(new SelectModel(num2 != null && id2 == num2.intValue(), periodEntity));
            }
            recyclerView2.setAdapter(new CatalogPeriodAdapter(m10227j(), arrayList2));
        }
        recyclerView2.setLayoutManager(new GridLayoutManager(requireContext(), 8));
        AbstractC9133u.m16130d(recyclerView2);
        m10229l(recyclerView2);
        RecyclerView recyclerView3 = ((DialogCatalogBinding) getMBindView()).recyclerViewGrade;
        AbstractC9133u.m16130d(recyclerView3);
        m10230o(recyclerView3);
        recyclerView3.setLayoutManager(new GridLayoutManager(requireContext(), 6));
        m10229l(recyclerView3);
        m10227j().m12030b().observe(getViewLifecycleOwner(), new C7707b(new InterfaceC10570l() { // from class: p4.c
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return CatalogDialog.m10225n(this.f19339a, (Integer) obj);
            }
        }));
        return C8736p.f16368a;
    }

    /* renamed from: j */
    public final CatalogViewModel m10227j() {
        return (CatalogViewModel) this.f11152g.getValue();
    }

    /* renamed from: k */
    public final DictViewModel m10228k() {
        return (DictViewModel) this.f11151f.getValue();
    }

    /* renamed from: l */
    public final void m10229l(RecyclerView recyclerView) {
        Drawable drawable = ResourcesCompat.getDrawable(recyclerView.getResources(), R$drawable.divider, null);
        if (drawable != null) {
            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(requireContext(), 0);
            dividerItemDecoration.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration);
            DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(requireContext(), 1);
            dividerItemDecoration2.setDrawable(drawable);
            recyclerView.addItemDecoration(dividerItemDecoration2);
        }
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_catalog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final void m10230o(RecyclerView recyclerView) {
        List listM12076h = m10228k().m12076h();
        if (listM12076h != null) {
            ArrayList<GradeEntity> arrayList = new ArrayList();
            for (Object obj : listM12076h) {
                int parentId = ((GradeEntity) obj).getParentId();
                Integer num = (Integer) m10227j().m12030b().getValue();
                if (num != null && parentId == num.intValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
            for (GradeEntity gradeEntity : arrayList) {
                int id = gradeEntity.getId();
                Integer num2 = (Integer) m10227j().m12029a().getValue();
                arrayList2.add(new SelectModel(num2 != null && id == num2.intValue(), gradeEntity));
            }
            recyclerView.setAdapter(new CatalogGradeAdapter(m10227j(), arrayList2));
        }
    }
}
