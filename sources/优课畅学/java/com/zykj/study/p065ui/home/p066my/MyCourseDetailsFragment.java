package com.zykj.study.p065ui.home.p066my;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
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
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.NetworkUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.dialog.materialdialog.DialogAction;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;
import com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog;
import com.zykj.http.bean.HeaderBean;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$drawable;
import com.zykj.study.R$layout;
import com.zykj.study.R$mipmap;
import com.zykj.study.R$string;
import com.zykj.study.adapter.CatalogEditAdapter;
import com.zykj.study.bean.course.CatalogBean;
import com.zykj.study.data.MyCourseEntity;
import com.zykj.study.databinding.FragmentMyCourseDetailsBinding;
import com.zykj.study.p065ui.home.p066my.MyCourseDetailsFragment;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.MyCourseDetailsViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.C8356e;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9271h;
import p173m1.C9293a;
import p173m1.C9295c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p207p2.AbstractC9642d;
import p209p4.C9649a;
import p209p4.C9673y;
import p227r0.AbstractC9901b;
import p238s0.InterfaceC9966e;
import p238s0.InterfaceC9967f;
import p249t0.C10085a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MyCourseDetailsFragment extends Hilt_MyCourseDetailsFragment<FragmentMyCourseDetailsBinding> {

    /* renamed from: f */
    public final NavArgsLazy f13193f = new NavArgsLazy(AbstractC9137y.m16154b(MyCourseDetailsFragmentArgs.class), new C8042f(this));

    /* renamed from: g */
    public final InterfaceC8724d f13194g;

    /* renamed from: h */
    public final InterfaceC8724d f13195h;

    /* renamed from: i */
    public C9673y f13196i;

    /* renamed from: j */
    public C9673y f13197j;

    /* renamed from: k */
    public C9649a f13198k;

    /* renamed from: l */
    public C9649a f13199l;

    /* renamed from: m */
    public List f13200m;

    /* renamed from: n */
    public List f13201n;

    /* renamed from: o */
    public List f13202o;

    /* renamed from: p */
    public List f13203p;

    /* renamed from: q */
    public final C8037a f13204q;

    /* renamed from: r */
    public final InterfaceC8724d f13205r;

    /* renamed from: s */
    public Pair f13206s;

    /* renamed from: t */
    public View f13207t;

    /* renamed from: u */
    public Integer f13208u;

    /* renamed from: v */
    public final InterfaceC8724d f13209v;

    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$a */
    public static final class C8037a implements CatalogEditAdapter.InterfaceC7602b {
        public C8037a() {
        }

        @Override // com.zykj.study.adapter.CatalogEditAdapter.InterfaceC7602b
        /* renamed from: a */
        public void mo9929a(View view, CatalogBean item) {
            AbstractC9133u.m16133g(view, "view");
            AbstractC9133u.m16133g(item, "item");
            if (item.isLeaf()) {
                C9649a c9649a = MyCourseDetailsFragment.this.f13199l;
                if (c9649a != null) {
                    c9649a.m18236E(item);
                }
                C9649a c9649a2 = MyCourseDetailsFragment.this.f13199l;
                if (c9649a2 != null) {
                    c9649a2.mo18229v(view);
                    return;
                }
                return;
            }
            C9649a c9649a3 = MyCourseDetailsFragment.this.f13198k;
            if (c9649a3 != null) {
                c9649a3.m18236E(item);
            }
            C9649a c9649a4 = MyCourseDetailsFragment.this.f13198k;
            if (c9649a4 != null) {
                c9649a4.mo18229v(view);
            }
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$b */
    public static final class C8038b extends TitleBar.AbstractC6882b {
        public C8038b(int i10) {
            super(i10);
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: a */
        public void mo6542a(View view) {
            C9673y c9673y = MyCourseDetailsFragment.this.f13196i;
            if (c9673y != null) {
                c9673y.mo18229v(view);
            }
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$c */
    public static final class C8039c extends TitleBar.AbstractC6882b {
        public C8039c(int i10) {
            super(i10);
        }

        @Override // com.xuexiang.xui.widget.actionbar.TitleBar.InterfaceC6881a
        /* renamed from: a */
        public void mo6542a(View view) {
            C9673y c9673y = MyCourseDetailsFragment.this.f13196i;
            if (c9673y != null) {
                c9673y.mo18229v(view);
            }
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$d */
    public static final class C8040d implements NetworkUtils.InterfaceC5340b {
        public C8040d() {
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.InterfaceC5340b
        /* renamed from: a */
        public void mo2372a(NetworkUtils.NetworkType networkType) {
            MyCourseDetailsFragment.this.m11529Z().m3511r().m18839s(true);
        }

        @Override // com.blankj.utilcode.util.NetworkUtils.InterfaceC5340b
        /* renamed from: b */
        public void mo2373b() {
            MyCourseDetailsFragment.this.m11529Z().m3511r().m18839s(false);
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$e */
    public static final class C8041e implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13225a;

        public C8041e(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13225a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13225a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13225a.invoke(obj);
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$f */
    public static final class C8042f implements InterfaceC10559a {

        /* renamed from: a */
        public final /* synthetic */ Fragment f13226a;

        public C8042f(Fragment fragment) {
            this.f13226a = fragment;
        }

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f13226a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f13226a + " has null arguments");
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$2", m17801f = "MyCourseDetailsFragment.kt", m17802l = {145}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$2 */
    public static final class C80432 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13229a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$2$1", m17801f = "MyCourseDetailsFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13231a;

            /* renamed from: b */
            public /* synthetic */ Object f13232b;

            /* renamed from: c */
            public final /* synthetic */ MyCourseDetailsFragment f13233c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MyCourseDetailsFragment myCourseDetailsFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13233c = myCourseDetailsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13233c, interfaceC9324c);
                anonymousClass1.f13232b = ((Result) obj).m15916j();
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Result) obj).m15916j(), (InterfaceC9324c) obj2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object obj2 = this.f13232b;
                AbstractC9434a.m17291f();
                if (this.f13231a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                if (Result.m15914h(obj2)) {
                    Collection collection = (Collection) (Result.m15913g(obj2) ? null : obj2);
                    if (collection == null || collection.isEmpty()) {
                        ((FragmentMyCourseDetailsBinding) this.f13233c.getMBindView()).courseCatalog.multipleStatusView.m7159f();
                    } else {
                        ((FragmentMyCourseDetailsBinding) this.f13233c.getMBindView()).courseCatalog.multipleStatusView.m7157d();
                        CatalogEditAdapter catalogEditAdapterM11529Z = this.f13233c.m11529Z();
                        if (Result.m15913g(obj2)) {
                            obj2 = null;
                        }
                        catalogEditAdapterM11529Z.mo3459R((Collection) obj2);
                    }
                } else {
                    ((FragmentMyCourseDetailsBinding) this.f13233c.getMBindView()).courseCatalog.multipleStatusView.m7162i();
                }
                return C8736p.f16368a;
            }

            public final Object invoke(Object obj, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(Result.m15908a(obj), interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }
        }

        public C80432(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyCourseDetailsFragment.this.new C80432(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80432) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13229a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9271h interfaceC9271hM12208f = MyCourseDetailsFragment.this.m11532d0().m12208f();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MyCourseDetailsFragment.this, null);
                this.f13229a = 1;
                if (AbstractC9268e.m17019i(interfaceC9271hM12208f, anonymousClass1, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$7", m17801f = "MyCourseDetailsFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$7 */
    public static final class C80477 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13244a;

        public C80477(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyCourseDetailsFragment.this.new C80477(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80477) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f13244a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            MyCourseDetailsFragment.this.m11534l0();
            return C8736p.f16368a;
        }
    }

    public MyCourseDetailsFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13194g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(DictViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a2.invoke();
            }
        });
        this.f13195h = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MyCourseDetailsViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$special$$inlined$viewModels$default$5
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
        this.f13200m = new ArrayList();
        this.f13201n = new ArrayList();
        this.f13202o = new ArrayList();
        this.f13203p = new ArrayList();
        this.f13204q = new C8037a();
        this.f13205r = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: b5.u2
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MyCourseDetailsFragment.m11477O(this.f2261a);
            }
        });
        this.f13206s = new Pair(null, null);
        this.f13209v = AbstractC9078a.m15924b(new InterfaceC10559a() { // from class: b5.v2
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return MyCourseDetailsFragment.m11518x0(this.f2266a);
            }
        });
    }

    /* renamed from: B0 */
    public static final void m11463B0(MyCourseDetailsFragment myCourseDetailsFragment, MaterialDialog materialDialog, CharSequence charSequence) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12205c(myCourseDetailsFragment.m11528Y().m11543a().getId(), charSequence.toString(), 0, false);
    }

    /* renamed from: D0 */
    public static final void m11466D0(MyCourseDetailsFragment myCourseDetailsFragment, int i10, MaterialDialog materialDialog, CharSequence charSequence) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12205c(myCourseDetailsFragment.m11528Y().m11543a().getId(), charSequence.toString(), i10, true);
    }

    /* renamed from: O */
    public static final CatalogEditAdapter m11477O(final MyCourseDetailsFragment myCourseDetailsFragment) {
        CatalogEditAdapter catalogEditAdapter = new CatalogEditAdapter(myCourseDetailsFragment.m11532d0().m12213k(), myCourseDetailsFragment.f13204q, new InterfaceC10570l() { // from class: b5.y2
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseDetailsFragment.m11478P(this.f2281a, (CatalogBean) obj);
            }
        });
        catalogEditAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
        return catalogEditAdapter;
    }

    /* renamed from: P */
    public static final C8736p m11478P(MyCourseDetailsFragment myCourseDetailsFragment, CatalogBean catalogBean) {
        AbstractC9133u.m16133g(catalogBean, "catalogBean");
        FragmentKt.findNavController(myCourseDetailsFragment).navigate(AbstractC8103i.f13562a.m11803b((MyCourseEntity) myCourseDetailsFragment.m11532d0().m12212j().getValue(), true, null, C8356e.f15876a.m13621c() + "?token=" + ((HeaderBean) myCourseDetailsFragment.m11532d0().m12211i().getValue()).getAccessToken() + "&url=" + ((HeaderBean) myCourseDetailsFragment.m11532d0().m12211i().getValue()).getServerUrl() + "#/?entry=mine&catalogId=" + catalogBean.getId() + "&courseId=" + myCourseDetailsFragment.m11528Y().m11543a().getId(), catalogBean.getTitle()));
        return C8736p.f16368a;
    }

    /* renamed from: R */
    public static final void m11479R(MyCourseDetailsFragment myCourseDetailsFragment, int i10, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12206d(i10);
    }

    /* renamed from: T */
    public static final void m11480T(MyCourseDetailsFragment myCourseDetailsFragment, int i10, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12206d(i10);
    }

    /* renamed from: V */
    public static final void m11481V(MyCourseDetailsFragment myCourseDetailsFragment, CatalogBean catalogBean, MaterialDialog materialDialog, CharSequence charSequence) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12220r(catalogBean.getId(), charSequence.toString());
    }

    /* renamed from: X */
    public static final void m11482X(MyCourseDetailsFragment myCourseDetailsFragment, CatalogBean catalogBean, MaterialDialog materialDialog, CharSequence charSequence) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12220r(catalogBean.getId(), charSequence.toString());
    }

    /* renamed from: a0 */
    private final DictViewModel m11483a0() {
        return (DictViewModel) this.f13194g.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f0 */
    private final void m11484f0() {
        ((FragmentMyCourseDetailsBinding) getMBindView()).courseCatalog.ivAdd.setOnClickListener(new View.OnClickListener() { // from class: b5.z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCourseDetailsFragment.m11486g0(this.f2287a, view);
            }
        });
        ((FragmentMyCourseDetailsBinding) getMBindView()).courseSynopsis.btUndercarriage.setOnClickListener(new View.OnClickListener() { // from class: b5.a3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCourseDetailsFragment.m11488h0(this.f2122a, view);
            }
        });
        ((FragmentMyCourseDetailsBinding) getMBindView()).courseSynopsis.btGrounding.setOnClickListener(new View.OnClickListener() { // from class: b5.b3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCourseDetailsFragment.m11492j0(this.f2128a, view);
            }
        });
    }

    /* renamed from: g0 */
    public static final void m11486g0(MyCourseDetailsFragment myCourseDetailsFragment, View view) {
        C9673y c9673y = myCourseDetailsFragment.f13197j;
        if (c9673y != null) {
            c9673y.mo18229v(view);
        }
    }

    /* renamed from: h0 */
    public static final void m11488h0(final MyCourseDetailsFragment myCourseDetailsFragment, View view) {
        new MaterialDialog.C6913g(myCourseDetailsFragment.requireContext()).m6749j("是否下架课程").m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.r2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                MyCourseDetailsFragment.m11490i0(this.f2241a, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* renamed from: i0 */
    public static final void m11490i0(MyCourseDetailsFragment myCourseDetailsFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12219q(myCourseDetailsFragment.m11528Y().m11543a().getId());
    }

    /* renamed from: j0 */
    public static final void m11492j0(final MyCourseDetailsFragment myCourseDetailsFragment, View view) {
        new MaterialDialog.C6913g(myCourseDetailsFragment.requireContext()).m6749j("是否上架课程").m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.k2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                MyCourseDetailsFragment.m11494k0(this.f2184a, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* renamed from: k0 */
    public static final void m11494k0(MyCourseDetailsFragment myCourseDetailsFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        myCourseDetailsFragment.m11532d0().m12215m(myCourseDetailsFragment.m11528Y().m11543a().getId());
    }

    /* renamed from: m0 */
    public static final void m11497m0(final MyCourseDetailsFragment myCourseDetailsFragment, C9295c c9295c, C9293a c9293a, int i10) {
        MyCourseEntity myCourseEntity;
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        if (i10 == 0) {
            FragmentKt.findNavController(myCourseDetailsFragment).navigate(AbstractC8103i.f13562a.m11804c((MyCourseEntity) myCourseDetailsFragment.m11532d0().m12212j().getValue()));
            return;
        }
        if (i10 == 1) {
            new MaterialDialog.C6913g(myCourseDetailsFragment.requireContext()).m6749j(myCourseDetailsFragment.getString(R$string.delete_course_hint)).m6765z(R$string.sure).m6763x(myCourseDetailsFragment.getResources().getColor(R$color.xui_config_color_red)).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.m2
                @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
                /* renamed from: a */
                public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                    MyCourseDetailsFragment.m11499n0(this.f2207a, materialDialog, dialogAction);
                }
            }).m6734E();
            return;
        }
        if (i10 == 2) {
            FragmentKt.findNavController(myCourseDetailsFragment).navigate(AbstractC8103i.f13562a.m11805d(myCourseDetailsFragment.m11528Y().m11543a().getId()));
        } else if (i10 == 3 && (myCourseEntity = (MyCourseEntity) myCourseDetailsFragment.m11532d0().m12212j().getValue()) != null) {
            FragmentKt.findNavController(myCourseDetailsFragment).navigate(AbstractC8103i.f13562a.m11802a(myCourseEntity.getId()));
        }
    }

    /* renamed from: n0 */
    public static final void m11499n0(MyCourseDetailsFragment myCourseDetailsFragment, MaterialDialog materialDialog, DialogAction dialogAction) {
        AbstractC9133u.m16133g(materialDialog, "<unused var>");
        AbstractC9133u.m16133g(dialogAction, "<unused var>");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(myCourseDetailsFragment), null, null, new MyCourseDetailsFragment$initPopup$1$1$1(myCourseDetailsFragment, null), 3, null);
    }

    /* renamed from: o0 */
    public static final void m11501o0(MyCourseDetailsFragment myCourseDetailsFragment, C9295c c9295c, C9293a c9293a, int i10) {
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        if (i10 == 0) {
            myCourseDetailsFragment.m11521A0();
        } else {
            if (i10 != 1) {
                return;
            }
            myCourseDetailsFragment.m11522C0(0);
        }
    }

    /* renamed from: p0 */
    public static final void m11503p0(MyCourseDetailsFragment myCourseDetailsFragment, C9295c c9295c, C9293a c9293a, int i10) {
        CatalogBean catalogBeanM18235D;
        CatalogBean catalogBeanM18235D2;
        C9649a c9649a;
        CatalogBean catalogBeanM18235D3;
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        if (i10 == 0) {
            C9649a c9649a2 = myCourseDetailsFragment.f13198k;
            if (c9649a2 == null || (catalogBeanM18235D = c9649a2.m18235D()) == null) {
                return;
            }
            myCourseDetailsFragment.m11526U(catalogBeanM18235D);
            return;
        }
        if (i10 != 1) {
            if (i10 != 2 || (c9649a = myCourseDetailsFragment.f13198k) == null || (catalogBeanM18235D3 = c9649a.m18235D()) == null) {
                return;
            }
            myCourseDetailsFragment.m11524Q(catalogBeanM18235D3.getId());
            return;
        }
        C9649a c9649a3 = myCourseDetailsFragment.f13198k;
        if (c9649a3 == null || (catalogBeanM18235D2 = c9649a3.m18235D()) == null) {
            return;
        }
        myCourseDetailsFragment.m11522C0(catalogBeanM18235D2.getId());
    }

    /* renamed from: q0 */
    public static final void m11505q0(MyCourseDetailsFragment myCourseDetailsFragment, C9295c c9295c, C9293a c9293a, int i10) {
        CatalogBean catalogBeanM18235D;
        C9649a c9649a;
        CatalogBean catalogBeanM18235D2;
        AbstractC9133u.m16133g(c9293a, "<unused var>");
        if (i10 != 0) {
            if (i10 != 1 || (c9649a = myCourseDetailsFragment.f13199l) == null || (catalogBeanM18235D2 = c9649a.m18235D()) == null) {
                return;
            }
            myCourseDetailsFragment.m11525S(catalogBeanM18235D2.getId());
            return;
        }
        C9649a c9649a2 = myCourseDetailsFragment.f13199l;
        if (c9649a2 == null || (catalogBeanM18235D = c9649a2.m18235D()) == null) {
            return;
        }
        myCourseDetailsFragment.m11527W(catalogBeanM18235D);
    }

    /* renamed from: s0 */
    public static final void m11508s0(MyCourseDetailsFragment myCourseDetailsFragment, View view) {
        FragmentKt.findNavController(myCourseDetailsFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t0 */
    public static final C8736p m11510t0(final MyCourseDetailsFragment myCourseDetailsFragment, MyCourseEntity myCourseEntity) {
        if (myCourseEntity != null) {
            TitleBar titleBarM6533n = ((FragmentMyCourseDetailsBinding) myCourseDetailsFragment.getMBindView()).toolbar2.m6539t(myCourseEntity.getTitle()).m6535p(myCourseDetailsFragment.getString(R$string.arrow_left_return)).m6534o(R$drawable.ic_arrow_left).m6537r(myCourseDetailsFragment.getResources().getColor(com.zykj.study.R$color.toolbar_back_icon_color)).m6538s(myCourseDetailsFragment.getResources().getDimensionPixelSize(R$dimen.text_9)).m6541v(myCourseDetailsFragment.getResources().getDimensionPixelSize(R$dimen.text_9)).m6536q(false).m6531l(true).m6533n(new View.OnClickListener() { // from class: b5.n2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyCourseDetailsFragment.m11512u0(this.f2213a, view);
                }
            });
            AbstractC9133u.m16132f(titleBarM6533n, "setLeftClickListener(...)");
            titleBarM6533n.m6529j();
            titleBarM6533n.m6523a(myCourseDetailsFragment.new C8039c(R$drawable.ic_menu));
        }
        return C8736p.f16368a;
    }

    /* renamed from: u0 */
    public static final void m11512u0(MyCourseDetailsFragment myCourseDetailsFragment, View view) {
        FragmentKt.findNavController(myCourseDetailsFragment).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v0 */
    public static final C8736p m11514v0(MyCourseDetailsFragment myCourseDetailsFragment, MyCourseEntity myCourseEntity) {
        if (myCourseEntity != null) {
            ((FragmentMyCourseDetailsBinding) myCourseDetailsFragment.getMBindView()).courseSynopsis.expandTextView.setText(myCourseEntity.getDescription());
        }
        return C8736p.f16368a;
    }

    /* renamed from: w0 */
    public static final void m11516w0(MyCourseDetailsFragment myCourseDetailsFragment, View view) {
        myCourseDetailsFragment.m11532d0().m12209g(myCourseDetailsFragment.m11528Y().m11543a().getId());
    }

    /* renamed from: x0 */
    public static final C8040d m11518x0(MyCourseDetailsFragment myCourseDetailsFragment) {
        return myCourseDetailsFragment.new C8040d();
    }

    /* renamed from: A0 */
    public final void m11521A0() {
        new MaterialDialog.C6913g(requireContext()).m6749j("章节名").m6750k(GravityEnum.CENTER).m6753n("请输入章节名称", "", false, new MaterialDialog.InterfaceC6914h() { // from class: b5.s2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6914h
            /* renamed from: a */
            public final void mo2095a(MaterialDialog materialDialog, CharSequence charSequence) {
                MyCourseDetailsFragment.m11463B0(this.f2249a, materialDialog, charSequence);
            }
        }).m6754o(0, 15).m6765z(R$string.sure).m6759t(R$string.cancel).m6734E();
    }

    /* renamed from: C0 */
    public final void m11522C0(final int i10) {
        new MaterialDialog.C6913g(requireContext()).m6749j("知识点名称").m6750k(GravityEnum.CENTER).m6753n("请输入知识点名称", "", false, new MaterialDialog.InterfaceC6914h() { // from class: b5.q2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6914h
            /* renamed from: a */
            public final void mo2095a(MaterialDialog materialDialog, CharSequence charSequence) {
                MyCourseDetailsFragment.m11466D0(this.f2232a, i10, materialDialog, charSequence);
            }
        }).m6754o(0, 15).m6765z(R$string.sure).m6759t(R$string.cancel).m6744e(false).m6734E();
    }

    /* renamed from: E0 */
    public final List m11523E0(List list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            CatalogBean catalogBean = (CatalogBean) obj;
            List<CatalogBean> children = catalogBean.getChildren();
            if (children != null) {
                arrayList = new ArrayList(AbstractC8811w.m14786x(children, 10));
                int i12 = 0;
                for (Object obj2 : children) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        AbstractC8809v.m14780w();
                    }
                    arrayList.add(CatalogBean.copy$default((CatalogBean) obj2, 0, null, false, 0, null, null, i13, null, false, 0, 0, 1983, null));
                    i12 = i13;
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(CatalogBean.copy$default(catalogBean, 0, null, false, 0, arrayList, null, i11, null, false, 0, 0, 1967, null));
            i10 = i11;
        }
        return arrayList2;
    }

    /* renamed from: Q */
    public final void m11524Q(final int i10) {
        new MaterialDialog.C6913g(requireContext()).m6749j("是否删除章节？").m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.l2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                MyCourseDetailsFragment.m11479R(this.f2192a, i10, materialDialog, dialogAction);
            }
        }).m6744e(false).m6734E();
    }

    /* renamed from: S */
    public final void m11525S(final int i10) {
        new MaterialDialog.C6913g(requireContext()).m6749j("是否删除知识点？").m6765z(R$string.sure).m6759t(R$string.cancel).m6762w(new MaterialDialog.InterfaceC6915i() { // from class: b5.j2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6915i
            /* renamed from: a */
            public final void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction) {
                MyCourseDetailsFragment.m11480T(this.f2177a, i10, materialDialog, dialogAction);
            }
        }).m6734E();
    }

    /* renamed from: U */
    public final void m11526U(final CatalogBean catalogBean) {
        new MaterialDialog.C6913g(requireContext()).m6749j("编辑章节名").m6750k(GravityEnum.CENTER).m6753n("请输入章节名称", catalogBean.getTitle(), false, new MaterialDialog.InterfaceC6914h() { // from class: b5.o2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6914h
            /* renamed from: a */
            public final void mo2095a(MaterialDialog materialDialog, CharSequence charSequence) {
                MyCourseDetailsFragment.m11481V(this.f2218a, catalogBean, materialDialog, charSequence);
            }
        }).m6754o(0, 15).m6765z(R$string.sure).m6759t(R$string.cancel).m6744e(false).m6734E();
    }

    /* renamed from: W */
    public final void m11527W(final CatalogBean catalogBean) {
        new MaterialDialog.C6913g(requireContext()).m6749j("编辑知识点").m6750k(GravityEnum.CENTER).m6753n("请输入知识点名称", catalogBean.getTitle(), false, new MaterialDialog.InterfaceC6914h() { // from class: b5.t2
            @Override // com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog.InterfaceC6914h
            /* renamed from: a */
            public final void mo2095a(MaterialDialog materialDialog, CharSequence charSequence) {
                MyCourseDetailsFragment.m11482X(this.f2254a, catalogBean, materialDialog, charSequence);
            }
        }).m6754o(0, 15).m6765z(R$string.sure).m6759t(R$string.cancel).m6744e(false).m6734E();
    }

    /* renamed from: Y */
    public final MyCourseDetailsFragmentArgs m11528Y() {
        return (MyCourseDetailsFragmentArgs) this.f13193f.getValue();
    }

    /* renamed from: Z */
    public final CatalogEditAdapter m11529Z() {
        return (CatalogEditAdapter) this.f13205r.getValue();
    }

    /* renamed from: b0 */
    public final View m11530b0() {
        return this.f13207t;
    }

    /* renamed from: c0 */
    public final Pair m11531c0() {
        return this.f13206s;
    }

    /* renamed from: d0 */
    public final MyCourseDetailsViewModel m11532d0() {
        return (MyCourseDetailsViewModel) this.f13195h.getValue();
    }

    /* renamed from: e0 */
    public final C8040d m11533e0() {
        return (C8040d) this.f13209v.getValue();
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        this.f13200m.clear();
        this.f13200m.add(new C9293a(getString(R$string.modify_course_info), R$drawable.ic_edit));
        this.f13200m.add(new C9293a(getString(R$string.course_delete), R$drawable.ic_delete));
        this.f13200m.add(new C9293a(getString(R$string.subscribe_management), R$drawable.ic_subscribe));
        this.f13200m.add(new C9293a(getString(R$string.authorized_use), R$drawable.ic_authorized));
        this.f13201n.clear();
        this.f13201n.add(new C9293a(getString(R$string.add_chapter), R$mipmap.icon_chapter));
        this.f13201n.add(new C9293a(getString(R$string.add_knowledge), R$mipmap.icon_knowledge));
        this.f13203p.clear();
        this.f13203p.add(new C9293a(getString(R$string.edit_chapter), R$mipmap.icon_edit));
        this.f13203p.add(new C9293a(getString(R$string.add_knowledge), R$mipmap.icon_knowledge));
        this.f13203p.add(new C9293a(getString(R$string.delete_chapter), R$mipmap.icon_delete));
        this.f13202o.clear();
        this.f13202o.add(new C9293a(getString(R$string.edit_knowledge), R$mipmap.icon_edit));
        this.f13202o.add(new C9293a(getString(R$string.delete_knowledge), R$mipmap.icon_delete));
        m11532d0().m12216n(m11528Y().m11543a().getId());
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        m11535r0();
        NetworkUtils.m2362i(m11533e0());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C80432(null), 3, null);
        m11529Z().m3501T(new InterfaceC9967f() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment.initView.3
            @Override // p238s0.InterfaceC9967f
            /* renamed from: a */
            public boolean mo11539a(BaseQuickAdapter adapter, View view, int i10) {
                AbstractC9133u.m16133g(adapter, "adapter");
                AbstractC9133u.m16133g(view, "view");
                LifecycleOwner viewLifecycleOwner2 = MyCourseDetailsFragment.this.getViewLifecycleOwner();
                AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new MyCourseDetailsFragment$initView$3$onItemLongClick$1(null), 3, null);
                return false;
            }
        });
        final C10085a c10085aM3511r = m11529Z().m3511r();
        c10085aM3511r.m18839s(true);
        c10085aM3511r.m18823c().m3523b(3);
        c10085aM3511r.m18840t(new ItemTouchHelper(new DragAndSwipeCallback(c10085aM3511r) { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$4$1
            @Override // com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                AbstractC9133u.m16133g(recyclerView, "recyclerView");
                AbstractC9133u.m16133g(viewHolder, "viewHolder");
                return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
            }

            @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
            public void onChildDraw(Canvas c10, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
                AbstractC9133u.m16133g(c10, "c");
                AbstractC9133u.m16133g(recyclerView, "recyclerView");
                AbstractC9133u.m16133g(viewHolder, "viewHolder");
                if (i10 == 2 && z10 && viewHolder.getItemViewType() == 1) {
                    float top2 = viewHolder.itemView.getTop() + f11;
                    View viewM11530b0 = this.m11530b0();
                    if (viewM11530b0 != null) {
                        viewM11530b0.setBackgroundResource(0);
                    }
                    int childCount = recyclerView.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        this.m11536y0(recyclerView.getChildAt(i11));
                        View viewM11530b02 = this.m11530b0();
                        AbstractC9133u.m16130d(viewM11530b02);
                        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(viewM11530b02);
                        if (AbstractC9133u.m16128b(this.m11530b0(), viewHolder.itemView) || this.m11529Z().getItemViewType(childViewHolder.getBindingAdapterPosition()) == 1) {
                            this.m11537z0(new Pair(null, null));
                        } else if (StrictMath.abs(viewHolder.getBindingAdapterPosition() - childViewHolder.getBindingAdapterPosition()) == 1) {
                            AbstractC9133u.m16130d(this.m11530b0());
                            if (StrictMath.abs(r5.getTop() - top2) >= 20.0f) {
                                float bottom = viewHolder.itemView.getBottom() + f11;
                                AbstractC9133u.m16130d(this.m11530b0());
                                if (StrictMath.abs(bottom - r7.getBottom()) < 20.0f) {
                                }
                            }
                            MyCourseDetailsFragment myCourseDetailsFragment = this;
                            myCourseDetailsFragment.m11537z0(new Pair((CatalogBean) myCourseDetailsFragment.m11529Z().getItem(childViewHolder.getBindingAdapterPosition()), (CatalogBean) this.m11529Z().getItem(viewHolder.getBindingAdapterPosition())));
                            View viewM11530b03 = this.m11530b0();
                            if (viewM11530b03 != null) {
                                viewM11530b03.setBackgroundColor(Color.parseColor("#664876FF"));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                super.onChildDraw(c10, recyclerView, viewHolder, f10, f11, i10, z10);
            }

            @Override // com.chad.library.adapter.base.dragswipe.DragAndSwipeCallback, androidx.recyclerview.widget.ItemTouchHelper.Callback
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
                AbstractC9133u.m16133g(recyclerView, "recyclerView");
                AbstractC9133u.m16133g(source, "source");
                AbstractC9133u.m16133g(target, "target");
                return true;
            }
        }));
        m11529Z().m3511r().m18842v(new InterfaceC9966e() { // from class: com.zykj.study.ui.home.my.MyCourseDetailsFragment.initView.5
            @Override // p238s0.InterfaceC9966e
            /* renamed from: a */
            public void mo11540a(RecyclerView.ViewHolder viewHolder, int i10) {
                ArrayList arrayList;
                List listM14529F0;
                List<CatalogBean> children;
                View view;
                if (viewHolder != null && (view = viewHolder.itemView) != null) {
                    view.setBackgroundColor(-1);
                }
                CatalogBean catalogBean = (CatalogBean) MyCourseDetailsFragment.this.m11531c0().m15906e();
                CatalogBean catalogBean2 = (CatalogBean) MyCourseDetailsFragment.this.m11531c0().m15907g();
                View viewM11530b0 = MyCourseDetailsFragment.this.m11530b0();
                boolean z10 = false;
                if ((viewM11530b0 != null ? viewM11530b0.getBackground() : null) == null || catalogBean == null || catalogBean2 == null) {
                    Integer num = MyCourseDetailsFragment.this.f13208u;
                    if (num != null && num.intValue() == i10) {
                        MyCourseDetailsFragment.this.f13208u = null;
                        return;
                    }
                    Object objM15916j = ((Result) MyCourseDetailsFragment.this.m11532d0().m12208f().getValue()).m15916j();
                    List listM14771n = AbstractC8809v.m14771n();
                    if (Result.m15913g(objM15916j)) {
                        objM15916j = listM14771n;
                    }
                    List<CatalogBean> listM14547X0 = AbstractC8778f0.m14547X0((Collection) objM15916j);
                    AbstractC9901b abstractC9901b = (AbstractC9901b) MyCourseDetailsFragment.this.m11529Z().m3517x(i10);
                    if (abstractC9901b instanceof CatalogBean) {
                        CatalogBean catalogBean3 = (CatalogBean) MyCourseDetailsFragment.this.m11529Z().m3517x(i10 + 1);
                        CatalogBean catalogBean4 = i10 == 0 ? null : (CatalogBean) MyCourseDetailsFragment.this.m11529Z().m3517x(i10 - 1);
                        if (listM14547X0 == null || !listM14547X0.isEmpty()) {
                            Iterator it = listM14547X0.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (AbstractC9133u.m16128b((CatalogBean) it.next(), abstractC9901b)) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(listM14547X0, 10));
                        for (CatalogBean catalogBeanCopy$default : listM14547X0) {
                            if (!z10 && (children = catalogBeanCopy$default.getChildren()) != null && children.contains(abstractC9901b)) {
                                catalogBeanCopy$default = CatalogBean.copy$default(catalogBeanCopy$default, 0, null, false, 0, AbstractC8778f0.m14528E0(catalogBeanCopy$default.getChildren(), abstractC9901b), null, 0, null, false, 0, 0, 2031, null);
                            }
                            arrayList2.add(catalogBeanCopy$default);
                        }
                        ArrayList<CatalogBean> arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (!AbstractC9133u.m16128b((CatalogBean) obj, abstractC9901b)) {
                                arrayList3.add(obj);
                            }
                        }
                        if (catalogBean4 == null) {
                            listM14529F0 = AbstractC8778f0.m14529F0(AbstractC8807u.m14755e(abstractC9901b), arrayList3);
                        } else if (catalogBean3 == null) {
                            listM14529F0 = AbstractC8778f0.m14530G0(arrayList3, abstractC9901b);
                        } else if (catalogBean3.isChild()) {
                            if (catalogBean4.isChild()) {
                                arrayList = new ArrayList(AbstractC8811w.m14786x(arrayList3, 10));
                                for (CatalogBean catalogBeanCopy$default2 : arrayList3) {
                                    List<CatalogBean> children2 = catalogBeanCopy$default2.getChildren();
                                    if (children2 != null && children2.contains(catalogBean3)) {
                                        List<CatalogBean> children3 = catalogBeanCopy$default2.getChildren();
                                        ArrayList arrayList4 = new ArrayList();
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj2 : children3) {
                                            if (((CatalogBean) obj2).getSort() < catalogBean3.getSort()) {
                                                arrayList4.add(obj2);
                                            } else {
                                                arrayList5.add(obj2);
                                            }
                                        }
                                        Pair pair = new Pair(arrayList4, arrayList5);
                                        catalogBeanCopy$default2 = CatalogBean.copy$default(catalogBeanCopy$default2, 0, null, false, 0, AbstractC8778f0.m14529F0(AbstractC8778f0.m14530G0((Collection) pair.m15906e(), abstractC9901b), (Iterable) pair.m15907g()), null, 0, null, false, 0, 0, 2031, null);
                                    }
                                    arrayList.add(catalogBeanCopy$default2);
                                }
                            } else {
                                arrayList = new ArrayList(AbstractC8811w.m14786x(arrayList3, 10));
                                for (CatalogBean catalogBeanCopy$default3 : arrayList3) {
                                    List<CatalogBean> children4 = catalogBeanCopy$default3.getChildren();
                                    if (children4 != null && children4.contains(catalogBean3)) {
                                        catalogBeanCopy$default3 = CatalogBean.copy$default(catalogBeanCopy$default3, 0, null, false, 0, AbstractC8778f0.m14529F0(AbstractC8807u.m14755e(abstractC9901b), catalogBeanCopy$default3.getChildren()), null, 0, null, false, 0, 0, 2031, null);
                                    }
                                    arrayList.add(catalogBeanCopy$default3);
                                }
                            }
                            listM14529F0 = arrayList;
                        } else {
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj3 : arrayList3) {
                                if (((CatalogBean) obj3).getSort() < catalogBean3.getSort()) {
                                    arrayList6.add(obj3);
                                } else {
                                    arrayList7.add(obj3);
                                }
                            }
                            Pair pair2 = new Pair(arrayList6, arrayList7);
                            listM14529F0 = AbstractC8778f0.m14529F0(AbstractC8778f0.m14530G0((Collection) pair2.m15906e(), abstractC9901b), (Iterable) pair2.m15907g());
                        }
                        MyCourseDetailsFragment.this.m11532d0().m12217o(MyCourseDetailsFragment.this.m11523E0(listM14529F0));
                    }
                } else {
                    LifecycleOwner viewLifecycleOwner2 = MyCourseDetailsFragment.this.getViewLifecycleOwner();
                    AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new MyCourseDetailsFragment$initView$5$onItemDragEnd$1(MyCourseDetailsFragment.this, catalogBean, catalogBean2, null), 3, null);
                    View viewM11530b02 = MyCourseDetailsFragment.this.m11530b0();
                    if (viewM11530b02 != null) {
                        viewM11530b02.setBackgroundResource(0);
                    }
                }
                MyCourseDetailsFragment.this.f13208u = null;
            }

            @Override // p238s0.InterfaceC9966e
            /* renamed from: b */
            public void mo11541b(RecyclerView.ViewHolder viewHolder, int i10, RecyclerView.ViewHolder viewHolder2, int i11) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p238s0.InterfaceC9966e
            /* renamed from: c */
            public void mo11542c(RecyclerView.ViewHolder viewHolder, int i10) {
                AbstractC9133u.m16133g(viewHolder, "viewHolder");
                AbstractC9901b abstractC9901b = (AbstractC9901b) MyCourseDetailsFragment.this.m11529Z().getItem(i10);
                if ((abstractC9901b instanceof CatalogBean) && !((CatalogBean) abstractC9901b).isLeaf()) {
                    for (int iM14773p = AbstractC8809v.m14773p(MyCourseDetailsFragment.this.m11529Z().m3509o()); -1 < iM14773p; iM14773p--) {
                        AbstractC9901b abstractC9901b2 = (AbstractC9901b) MyCourseDetailsFragment.this.m11529Z().getItem(iM14773p);
                        if (abstractC9901b2 instanceof CatalogBean) {
                            CatalogBean catalogBean = (CatalogBean) abstractC9901b2;
                            if (!catalogBean.isLeaf() && catalogBean.isExpanded()) {
                                MyCourseDetailsFragment.this.m11529Z().m3466r0(abstractC9901b2, new ArrayList());
                                MyCourseDetailsFragment.this.m11532d0().m12213k().remove(Integer.valueOf(catalogBean.getId()));
                            }
                        }
                    }
                }
                MyCourseDetailsFragment myCourseDetailsFragment = MyCourseDetailsFragment.this;
                myCourseDetailsFragment.f13208u = Integer.valueOf(((FragmentMyCourseDetailsBinding) myCourseDetailsFragment.getMBindView()).courseCatalog.recycle.getChildViewHolder(viewHolder.itemView).getBindingAdapterPosition());
                viewHolder.itemView.setBackgroundColor(ContextCompat.getColor(MyCourseDetailsFragment.this.requireContext(), com.zykj.study.R$color.subscribe_tab_bg_select));
            }
        });
        ((FragmentMyCourseDetailsBinding) getMBindView()).courseCatalog.recycle.setAdapter(m11529Z());
        ((FragmentMyCourseDetailsBinding) getMBindView()).setDetailsEntity(m11532d0());
        ((FragmentMyCourseDetailsBinding) getMBindView()).setDictViewModel(m11483a0());
        m11484f0();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenResumed(new C80477(null));
        m11532d0().m12212j().observe(getViewLifecycleOwner(), new C8041e(new InterfaceC10570l() { // from class: b5.e2
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseDetailsFragment.m11514v0(this.f2144a, (MyCourseEntity) obj);
            }
        }));
        ((FragmentMyCourseDetailsBinding) getMBindView()).courseCatalog.multipleStatusView.setOnRetryClickListener(new View.OnClickListener() { // from class: b5.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCourseDetailsFragment.m11516w0(this.f2225a, view);
            }
        });
        return C8736p.f16368a;
    }

    /* renamed from: l0 */
    public final void m11534l0() {
        Context contextRequireContext = requireContext();
        AbstractC9133u.m16132f(contextRequireContext, "requireContext(...)");
        this.f13196i = (C9673y) ((C9673y) new C9673y(contextRequireContext, this.f13200m).m18233z(getResources().getDimensionPixelSize(R$dimen.view_70), 0, new AbstractC9642d.b() { // from class: b5.f2
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                MyCourseDetailsFragment.m11497m0(this.f2154a, c9295c, c9293a, i10);
            }
        })).m18231B(true);
        Context contextRequireContext2 = requireContext();
        AbstractC9133u.m16132f(contextRequireContext2, "requireContext(...)");
        this.f13197j = (C9673y) ((C9673y) new C9673y(contextRequireContext2, this.f13201n).m18233z(getResources().getDimensionPixelSize(R$dimen.view_70), 0, new AbstractC9642d.b() { // from class: b5.g2
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                MyCourseDetailsFragment.m11501o0(this.f2160a, c9295c, c9293a, i10);
            }
        })).m18231B(true);
        Context contextRequireContext3 = requireContext();
        AbstractC9133u.m16132f(contextRequireContext3, "requireContext(...)");
        this.f13198k = (C9649a) ((C9649a) new C9649a(contextRequireContext3, this.f13203p).m18233z(getResources().getDimensionPixelSize(R$dimen.view_70), 0, new AbstractC9642d.b() { // from class: b5.h2
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                MyCourseDetailsFragment.m11503p0(this.f2164a, c9295c, c9293a, i10);
            }
        })).m18231B(true);
        Context contextRequireContext4 = requireContext();
        AbstractC9133u.m16132f(contextRequireContext4, "requireContext(...)");
        this.f13199l = (C9649a) ((C9649a) new C9649a(contextRequireContext4, this.f13202o).m18233z(getResources().getDimensionPixelSize(R$dimen.view_70), 0, new AbstractC9642d.b() { // from class: b5.i2
            @Override // p207p2.AbstractC9642d.b
            /* renamed from: a */
            public final void mo2081a(C9295c c9295c, C9293a c9293a, int i10) {
                MyCourseDetailsFragment.m11505q0(this.f2171a, c9295c, c9293a, i10);
            }
        })).m18231B(true);
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_my_course_details;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        NetworkUtils.m2363j(m11533e0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r0 */
    public final void m11535r0() {
        ((FragmentMyCourseDetailsBinding) getMBindView()).toolbar2.m6535p(getString(R$string.arrow_left_return)).m6534o(R$drawable.ic_arrow_left).m6537r(getResources().getColor(com.zykj.study.R$color.toolbar_back_icon_color)).m6538s(getResources().getDimensionPixelSize(R$dimen.text_9)).m6541v(getResources().getDimensionPixelSize(R$dimen.text_9)).m6536q(false).m6531l(true).m6533n(new View.OnClickListener() { // from class: b5.w2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyCourseDetailsFragment.m11508s0(this.f2272a, view);
            }
        }).m6523a(new C8038b(R$drawable.ic_menu));
        m11532d0().m12212j().observe(getViewLifecycleOwner(), new C8041e(new InterfaceC10570l() { // from class: b5.x2
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return MyCourseDetailsFragment.m11510t0(this.f2277a, (MyCourseEntity) obj);
            }
        }));
    }

    /* renamed from: y0 */
    public final void m11536y0(View view) {
        this.f13207t = view;
    }

    /* renamed from: z0 */
    public final void m11537z0(Pair pair) {
        AbstractC9133u.m16133g(pair, "<set-?>");
        this.f13206s = pair;
    }
}
