package com.zykj.study.p065ui.home.find;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.zykj.base.utils.XToastUtils;
import com.zykj.image.QRCodeFragment;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.CourseFragmentAdapter;
import com.zykj.study.bean.ScanResult;
import com.zykj.study.databinding.FragmentFindBinding;
import com.zykj.study.p065ui.home.find.FindFragment;
import com.zykj.study.viewmodels.MicroCodeViewModel;
import java.util.List;
import kotlin.AbstractC9078a;
import kotlin.AbstractC9079b;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p086e5.AbstractC8366o;
import p121h5.C8716c;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p275v4.AbstractC10244c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class FindFragment extends Hilt_FindFragment<FragmentFindBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f12557f;

    /* renamed from: g */
    public final List f12558g;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.FindFragment", m17801f = "FindFragment.kt", m17802l = {40}, m17803m = "initData")
    /* renamed from: com.zykj.study.ui.home.find.FindFragment$initData$1 */
    public static final class C79371 extends ContinuationImpl {

        /* renamed from: a */
        public /* synthetic */ Object f12566a;

        /* renamed from: c */
        public int f12568c;

        public C79371(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f12566a = obj;
            this.f12568c |= Integer.MIN_VALUE;
            return FindFragment.this.initData(this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.find.FindFragment$initView$4", m17801f = "FindFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.find.FindFragment$initView$4 */
    public static final class C79384 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12572a;

        public C79384(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return FindFragment.this.new C79384(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C79384) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f12572a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            ViewPager2 viewPager2 = ((FragmentFindBinding) FindFragment.this.getMBindView()).viewPager;
            FindFragment findFragment = FindFragment.this;
            viewPager2.setUserInputEnabled(false);
            viewPager2.setAdapter(new CourseFragmentAdapter(findFragment, findFragment.f12558g));
            return C8736p.f16368a;
        }
    }

    public FindFragment() {
        final InterfaceC10559a interfaceC10559a = new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.FindFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC8724d interfaceC8724dM15923a = AbstractC9078a.m15923a(LazyThreadSafetyMode.f17345c, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.FindFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) interfaceC10559a.invoke();
            }
        });
        final InterfaceC10559a interfaceC10559a2 = null;
        this.f12557f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(MicroCodeViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.FindFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m27188viewModels$lambda1(interfaceC8724dM15923a).getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.FindFragment$special$$inlined$viewModels$default$4
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.find.FindFragment$special$$inlined$viewModels$default$5
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
        this.f12558g = AbstractC8809v.m14776s(new CourseFragment());
    }

    /* renamed from: o */
    public static final void m11052o(FindFragment findFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        try {
            ScanResult scanResult = (ScanResult) new Gson().fromJson(bundle.getString(QRCodeFragment.RESULT_QR_TEXT), ScanResult.class);
            if (scanResult.getCodeType() == 1) {
                AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(findFragment), null, null, new FindFragment$initData$2$1(findFragment, scanResult, null), 3, null);
            }
        } catch (JsonSyntaxException unused) {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = findFragment.getString(R$string.scan_study_qr_code);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
        }
    }

    /* renamed from: q */
    public static final void m11053q(final FindFragment findFragment, View view) {
        C8716c.f16341b.m14220a(new InterfaceC10559a() { // from class: y4.s
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return FindFragment.m11054r(this.f21102a);
            }
        });
    }

    /* renamed from: r */
    public static final C8736p m11054r(FindFragment findFragment) {
        try {
            FragmentKt.findNavController(findFragment).navigate(AbstractC10244c.f20434a.m19165h());
        } catch (Exception unused) {
        }
        return C8736p.f16368a;
    }

    /* renamed from: s */
    public static final void m11055s(final FindFragment findFragment, View view) {
        C8716c.f16341b.m14220a(new InterfaceC10559a() { // from class: y4.r
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return FindFragment.m11056t(this.f21101a);
            }
        });
    }

    /* renamed from: t */
    public static final C8736p m11056t(FindFragment findFragment) {
        try {
            FragmentKt.findNavController(findFragment).navigate(AbstractC10244c.f20434a.m19163f());
        } catch (Exception unused) {
        }
        return C8736p.f16368a;
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
            boolean r0 = r5 instanceof com.zykj.study.p065ui.home.find.FindFragment.C79371
            if (r0 == 0) goto L13
            r0 = r5
            com.zykj.study.ui.home.find.FindFragment$initData$1 r0 = (com.zykj.study.p065ui.home.find.FindFragment.C79371) r0
            int r1 = r0.f12568c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12568c = r1
            goto L18
        L13:
            com.zykj.study.ui.home.find.FindFragment$initData$1 r0 = new com.zykj.study.ui.home.find.FindFragment$initData$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12566a
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.f12568c
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
            r0.f12568c = r3
            java.lang.Object r5 = super.initData(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            androidx.fragment.app.Fragment r5 = r4.getParentFragment()
            if (r5 == 0) goto L53
            androidx.fragment.app.FragmentManager r5 = r5.getParentFragmentManager()
            if (r5 == 0) goto L53
            y4.o r0 = new y4.o
            r0.<init>()
            java.lang.String r1 = "qr_code_key"
            r5.setFragmentResultListener(r1, r4, r0)
        L53:
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.find.FindFragment.initData(m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/find/FindFragment.smali:519
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentFindBinding) getMBindView()).setMicroViewModel(m11057n());
        ((FragmentFindBinding) getMBindView()).tvSearch.setOnClickListener(new View.OnClickListener() { // from class: y4.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindFragment.m11053q(this.f21099a, view);
            }
        });
        ((FragmentFindBinding) getMBindView()).ivScan.setOnClickListener(new View.OnClickListener() { // from class: y4.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FindFragment.m11055s(this.f21100a, view);
            }
        });
        m11058p();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenResumed(new C79384(null));
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_find;
    }

    /* renamed from: n */
    public final MicroCodeViewModel m11057n() {
        return (MicroCodeViewModel) this.f12557f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public final void m11058p() {
        TabLayout.Tab tabNewTab = ((FragmentFindBinding) getMBindView()).tabLayout.newTab();
        AbstractC9133u.m16132f(tabNewTab, "newTab(...)");
        tabNewTab.setText(Editable.Factory.getInstance().newEditable(getString(R$string.all_course)));
        ((FragmentFindBinding) getMBindView()).tabLayout.addTab(tabNewTab);
    }
}
