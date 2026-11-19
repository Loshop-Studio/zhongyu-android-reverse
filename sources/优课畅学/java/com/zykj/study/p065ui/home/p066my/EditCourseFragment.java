package com.zykj.study.p065ui.home.p066my;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.CompoundButton;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.AbstractC5364g0;
import com.canhub.cropper.CropImageOptions;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC6874d;
import com.xuexiang.xui.widget.edittext.MultiLineEditText;
import com.xuexiang.xui.widget.textview.supertextview.SuperTextView;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.study.R$array;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.adapter.CoverAdapter;
import com.zykj.study.bean.ImageViewInfo;
import com.zykj.study.bean.SelectModel;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.databinding.FragmentEditCourseBinding;
import com.zykj.study.p065ui.home.p066my.AbstractC8101g;
import com.zykj.study.p065ui.home.p066my.EditCourseFragment;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.EditCourseViewModel;
import com.zykj.study.viewmodels.OssTokenViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p007a6.C0038l;
import p086e5.C8361j;
import p089e8.InterfaceC8375c;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p179m7.InterfaceC9324c;
import p201o7.AbstractC9536a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class EditCourseFragment extends Hilt_EditCourseFragment<FragmentEditCourseBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12932f;

    /* renamed from: g */
    public final InterfaceC8724d f12933g;

    /* renamed from: h */
    public final InterfaceC8724d f12934h;

    /* renamed from: i */
    public List f12935i;

    /* renamed from: j */
    public final NavArgsLazy f12936j;

    /* renamed from: k */
    public final C0038l f12937k;

    /* renamed from: com.zykj.study.ui.home.my.EditCourseFragment$a */
    public static final class C8003a implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f12956a;

        public C8003a(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f12956a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f12956a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f12956a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.EditCourseFragment$b */
    public static final class C8004b implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f12957a;

        public C8004b(Fragment fragment) {
            this.f12957a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f12957a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f12957a + " has null arguments");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditCourseFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f17345c;
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12932f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(EditCourseViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC10559a interfaceC10559a3 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a2 = AbstractC9078a.m15923a(lazyThreadSafetyMode, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a3.invoke();
            }
        });
        InterfaceC8375c interfaceC8375cM16154b = AbstractC9137y.m16154b(OssTokenViewModel.class);
        InterfaceC10559a interfaceC10559a4 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2).getViewModelStore();
            }
        };
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f12933g = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC8375cM16154b, interfaceC10559a4, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a5 = objArr;
                if (interfaceC10559a5 != null && (creationExtras = (CreationExtras) interfaceC10559a5.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM27188viewModels$lambda1 = FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM27188viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM27188viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$viewModels$default$10
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
        InterfaceC8375c interfaceC8375cM16154b2 = AbstractC9137y.m16154b(DictViewModel.class);
        InterfaceC10559a interfaceC10559a5 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        this.f12934h = FragmentViewModelLazyKt.createViewModelLazy(this, interfaceC8375cM16154b2, interfaceC10559a5, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC10559a interfaceC10559a6 = objArr2;
                return (interfaceC10559a6 == null || (creationExtras = (CreationExtras) interfaceC10559a6.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.EditCourseFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.f12936j = new NavArgsLazy(AbstractC9137y.m16154b(EditCourseFragmentArgs.class), new C8004b(this));
        this.f12937k = new C0038l(this, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* renamed from: A */
    public static final C8736p m11304A(EditCourseFragment editCourseFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        editCourseFragment.m11332u().m12084b().postValue(Integer.valueOf(bundle.getInt("grade_id")));
        return C8736p.f16368a;
    }

    /* renamed from: B */
    public static final C8736p m11305B(EditCourseFragment editCourseFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        editCourseFragment.m11332u().m12090h().postValue(Integer.valueOf(bundle.getInt("period_id")));
        return C8736p.f16368a;
    }

    /* renamed from: E */
    public static final void m11306E(EditCourseFragment editCourseFragment, View view) {
        FragmentKt.findNavController(editCourseFragment).navigateUp();
    }

    /* renamed from: F */
    public static final boolean m11307F(EditCourseFragment editCourseFragment, MenuItem menuItem) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(editCourseFragment), null, null, new EditCourseFragment$setClickAndTextWatch$2$1(editCourseFragment, null), 3, null);
        return true;
    }

    /* renamed from: G */
    public static final void m11308G(final EditCourseFragment editCourseFragment, View view) {
        CropImageOptions cropImageOptionsM91o = editCourseFragment.f12937k.m91o();
        cropImageOptionsM91o.f3441t = true;
        cropImageOptionsM91o.f3443u = 60;
        cropImageOptionsM91o.f3445v = 37;
        C0038l.m86w(editCourseFragment.f12937k, null, true, new InterfaceC10570l() { // from class: b5.w0
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return EditCourseFragment.m11309H(this.f2270a, (Uri) obj);
            }
        }, 1, null);
    }

    /* renamed from: H */
    public static final C8736p m11309H(EditCourseFragment editCourseFragment, Uri uri) {
        if (uri == null) {
            return C8736p.f16368a;
        }
        String absolutePath = AbstractC5364g0.m2472e(uri).getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "getAbsolutePath(...)");
        editCourseFragment.m11330K(absolutePath);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public static final C8736p m11310I(EditCourseFragment editCourseFragment) {
        AbstractC8101g.b bVar = AbstractC8101g.f13549a;
        T value = editCourseFragment.m11332u().m12090h().getValue();
        AbstractC9133u.m16130d(value);
        int iIntValue = ((Number) value).intValue();
        T value2 = editCourseFragment.m11332u().m12092j().getValue();
        AbstractC9133u.m16130d(value2);
        int iIntValue2 = ((Number) value2).intValue();
        T value3 = editCourseFragment.m11332u().m12084b().getValue();
        AbstractC9133u.m16130d(value3);
        FragmentKt.findNavController(editCourseFragment).navigate(bVar.m11798a(iIntValue, iIntValue2, ((Number) value3).intValue()));
        return C8736p.f16368a;
    }

    /* renamed from: J */
    public static final void m11311J(EditCourseFragment editCourseFragment, CompoundButton compoundButton, boolean z10) {
        editCourseFragment.m11332u().m12095m().setValue(Boolean.valueOf(z10));
    }

    /* renamed from: t */
    private final DictViewModel m11324t() {
        return (DictViewModel) this.f12934h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final OssTokenViewModel m11325v() {
        return (OssTokenViewModel) this.f12933g.getValue();
    }

    /* renamed from: x */
    private final void m11326x(RecyclerView recyclerView) {
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

    /* renamed from: z */
    public static final C8736p m11327z(EditCourseFragment editCourseFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        editCourseFragment.m11332u().m12092j().postValue(Integer.valueOf(bundle.getInt("subject_id")));
        return C8736p.f16368a;
    }

    /* renamed from: C */
    public final void m11328C() {
        List list = this.f12935i;
        if (list == null) {
            AbstractC9133u.m16151y("coverList");
            list = null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SelectModel) obj).isSelectModel()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SelectModel) it.next()).setSelectModel(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public final void m11329D() {
        String description;
        ((FragmentEditCourseBinding) getMBindView()).toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: b5.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCourseFragment.m11306E(this.f2216a, view);
            }
        });
        ((FragmentEditCourseBinding) getMBindView()).toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: b5.p0
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return EditCourseFragment.m11307F(this.f2223a, menuItem);
            }
        });
        ((FragmentEditCourseBinding) getMBindView()).rlCustomCover.setOnClickListener(new View.OnClickListener() { // from class: b5.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditCourseFragment.m11308G(this.f2230a, view);
            }
        });
        MultiLineEditText multiLineEditText = ((FragmentEditCourseBinding) getMBindView()).etDesc;
        MyCourseEntity myCourseEntityM11342a = m11331s().m11342a();
        if (myCourseEntityM11342a == null || (description = myCourseEntityM11342a.getDescription()) == null) {
            description = "";
        }
        multiLineEditText.setContentText(description);
        SuperTextView svCatalog = ((FragmentEditCourseBinding) getMBindView()).svCatalog;
        AbstractC9133u.m16132f(svCatalog, "svCatalog");
        BindingAdaptersKt.onClick(svCatalog, new InterfaceC10559a() { // from class: b5.r0
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return EditCourseFragment.m11310I(this.f2239a);
            }
        });
        ((FragmentEditCourseBinding) getMBindView()).etDesc.getEditText().addTextChangedListener(new C8361j());
        ((FragmentEditCourseBinding) getMBindView()).editText.addTextChangedListener(new C8361j());
        ((FragmentEditCourseBinding) getMBindView()).svPublic.m7229G(new CompoundButton.OnCheckedChangeListener() { // from class: b5.s0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                EditCourseFragment.m11311J(this.f2247a, compoundButton, z10);
            }
        });
    }

    /* renamed from: K */
    public final void m11330K(String str) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new EditCourseFragment$uploadImage$1(str, this, null), 3, null);
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        Object next;
        this.f12935i = m11333w();
        MyCourseEntity myCourseEntityM11342a = m11331s().m11342a();
        if (myCourseEntityM11342a != null) {
            m11332u().m12085c().setValue(AbstractC9536a.m17798c(myCourseEntityM11342a.getId()));
            List list = this.f12935i;
            Object obj = null;
            if (list == null) {
                AbstractC9133u.m16151y("coverList");
                list = null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC9133u.m16128b(((ImageViewInfo) ((SelectModel) next).getData()).getUrl(), myCourseEntityM11342a.getCover())) {
                    break;
                }
            }
            SelectModel selectModel = (SelectModel) next;
            if (selectModel != null) {
                m11328C();
                m11332u().m12097o().set(true);
                selectModel.setSelectModel(true);
                m11332u().m12093k().setValue(myCourseEntityM11342a.getCover());
            } else {
                String cover = myCourseEntityM11342a.getCover();
                if (cover == null || cover.length() == 0) {
                    m11332u().m12097o().set(true);
                    List list2 = this.f12935i;
                    if (list2 == null) {
                        AbstractC9133u.m16151y("coverList");
                        list2 = null;
                    }
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((SelectModel) next2).isSelectModel()) {
                            obj = next2;
                            break;
                        }
                    }
                    SelectModel selectModel2 = (SelectModel) obj;
                    if (selectModel2 != null) {
                        m11332u().m12093k().setValue(((ImageViewInfo) selectModel2.getData()).getUrl());
                    }
                } else {
                    m11332u().m12097o().set(false);
                    m11332u().m12088f().setValue(myCourseEntityM11342a.getCover());
                }
            }
            m11332u().m12094l().setValue(myCourseEntityM11342a.getTitle());
            m11332u().m12083a().setValue(myCourseEntityM11342a.getDescription());
            m11332u().m12090h().setValue(AbstractC9536a.m17798c(myCourseEntityM11342a.getPeriodId()));
            m11332u().m12084b().setValue(AbstractC9536a.m17798c(myCourseEntityM11342a.getGradeId()));
            m11332u().m12092j().setValue(AbstractC9536a.m17798c(myCourseEntityM11342a.getSubjectId()));
            m11332u().m12086d().setValue(AbstractC9536a.m17798c(myCourseEntityM11342a.getLearning()));
            m11332u().m12087e().setValue(AbstractC9536a.m17798c(myCourseEntityM11342a.getLikes()));
            m11332u().m12091i().setValue(myCourseEntityM11342a.getStatus());
            m11332u().m12095m().setValue(AbstractC9536a.m17796a(myCourseEntityM11342a.isPublic()));
            m11332u().m12096n().setValue(AbstractC9536a.m17796a(myCourseEntityM11342a.isSuperviser()));
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentEditCourseBinding) getMBindView()).setEditCourseViewModel(m11332u());
        ((FragmentEditCourseBinding) getMBindView()).setDictViewModel(m11324t());
        RecyclerView recyclerView = ((FragmentEditCourseBinding) getMBindView()).recycleViewSys;
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 4));
        AbstractC9133u.m16130d(recyclerView);
        m11326x(recyclerView);
        EditCourseViewModel editCourseViewModelM11332u = m11332u();
        List list = this.f12935i;
        if (list == null) {
            AbstractC9133u.m16151y("coverList");
            list = null;
        }
        recyclerView.setAdapter(new CoverAdapter(editCourseViewModelM11332u, list));
        Boolean bool = (Boolean) m11332u().m12095m().getValue();
        if (bool != null) {
            ((FragmentEditCourseBinding) getMBindView()).svPublic.m7230H(bool.booleanValue());
        }
        m11329D();
        m11334y();
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_edit_course;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        Window window;
        super.onDestroyView();
        FragmentActivity activity = getActivity();
        AbstractViewTreeObserverOnGlobalLayoutListenerC6874d.m6435d((activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView());
    }

    /* renamed from: s */
    public final EditCourseFragmentArgs m11331s() {
        return (EditCourseFragmentArgs) this.f12936j.getValue();
    }

    /* renamed from: u */
    public final EditCourseViewModel m11332u() {
        return (EditCourseViewModel) this.f12932f.getValue();
    }

    /* renamed from: w */
    public final List m11333w() throws Resources.NotFoundException {
        String[] stringArray = getResources().getStringArray(R$array.cover);
        AbstractC9133u.m16132f(stringArray, "getStringArray(...)");
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            AbstractC9133u.m16130d(str);
            arrayList.add(new SelectModel(false, new ImageViewInfo(str)));
        }
        ((SelectModel) AbstractC8778f0.m14566l0(arrayList)).setSelectModel(true);
        return arrayList;
    }

    /* renamed from: y */
    public final void m11334y() {
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "period_id", new InterfaceC10574p() { // from class: b5.t0
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return EditCourseFragment.m11305B(this.f2252a, (String) obj, (Bundle) obj2);
            }
        });
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "subject_id", new InterfaceC10574p() { // from class: b5.u0
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return EditCourseFragment.m11327z(this.f2259a, (String) obj, (Bundle) obj2);
            }
        });
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "grade_id", new InterfaceC10574p() { // from class: b5.v0
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return EditCourseFragment.m11304A(this.f2264a, (String) obj, (Bundle) obj2);
            }
        });
    }
}
