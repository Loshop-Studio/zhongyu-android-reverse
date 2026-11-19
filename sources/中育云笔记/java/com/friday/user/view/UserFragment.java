package com.friday.user.view;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.helper.C5962b;
import com.friday.common.helper.C5963c;
import com.friday.common.widget.dialog.BaseDialog;
import com.friday.common.widget.dialog.C5975a;
import com.friday.user.R$array;
import com.friday.user.R$layout;
import com.friday.user.adapter.UserMenuAdapter;
import com.friday.user.adapter.UserViewPageAdapter;
import com.friday.user.databinding.UserFragmentBinding;
import com.friday.user.view.UserFragment;
import com.friday.user.viewmodel.UserViewModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import java.util.ArrayList;
import kotlin.AbstractC9923a;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p200j2.InterfaceC9670j;
import p215k2.AbstractC9804v;
import p268o1.InterfaceC10427d;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p309qc.InterfaceC10773d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import p429z1.AbstractC11958b;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class UserFragment extends Hilt_UserFragment<UserFragmentBinding> implements InterfaceC9670j {

    /* renamed from: i */
    public PersonalInfoFragment f10652i;

    /* renamed from: j */
    public AboutFragment f10653j;

    /* renamed from: k */
    public HelpFragment f10654k;

    /* renamed from: l */
    public final InterfaceC10773d f10655l = AbstractC9923a.m20068a(new InterfaceC9529a() { // from class: h4.r
        @Override // p181hd.InterfaceC9529a
        public final Object invoke() {
            return UserFragment.m7801K();
        }
    });

    /* renamed from: m */
    public ArrayList f10656m = new ArrayList();

    /* renamed from: n */
    public ArrayList f10657n = new ArrayList();

    /* renamed from: o */
    public UserViewPageAdapter f10658o;

    /* renamed from: p */
    public final InterfaceC10773d f10659p;

    /* renamed from: com.friday.user.view.UserFragment$a */
    public static final class C6328a implements Observer, InterfaceC9975q {

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9540l f10664c;

        public C6328a(InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            this.f10664c = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
            return this.f10664c;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10664c.invoke(obj);
        }
    }

    @InterfaceC11829d(m26210c = "com.friday.user.view.UserFragment$initData$1", m26211f = "UserFragment.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: com.friday.user.view.UserFragment$initData$1 */
    public static final class C63291 extends SuspendLambda implements InterfaceC9544p {

        /* renamed from: c */
        public int f10665c;

        public C63291(InterfaceC11588c interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c create(Object obj, InterfaceC11588c interfaceC11588c) {
            return UserFragment.this.new C63291(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.f10665c != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            UserFragment userFragment = UserFragment.this;
            userFragment.m7811E(userFragment.m7810C().getItem(0), 0);
            UserFragment.this.m7810C().m7751j(0);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c interfaceC11588c) {
            return ((C63291) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public UserFragment() {
        final InterfaceC9529a interfaceC9529a = null;
        this.f10659p = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9983y.m20315b(UserViewModel.class), new InterfaceC9529a() { // from class: com.friday.user.view.UserFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC9529a() { // from class: com.friday.user.view.UserFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                InterfaceC9529a interfaceC9529a2 = interfaceC9529a;
                return (interfaceC9529a2 == null || (creationExtras = (CreationExtras) interfaceC9529a2.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new InterfaceC9529a() { // from class: com.friday.user.view.UserFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A */
    private final UserViewModel m7796A() {
        return (UserViewModel) this.f10659p.getValue();
    }

    /* renamed from: D */
    public static final C10786q m7797D(UserFragment userFragment, Boolean bool) {
        userFragment.isShowLoading(false);
        return C10786q.f26013a;
    }

    /* renamed from: G */
    public static final void m7798G(final UserFragment userFragment, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        if (i10 == 0 || i10 == 1 || i10 == 2) {
            userFragment.m7811E(userFragment.m7810C().getItem(i10), i10);
            userFragment.m7810C().m7751j(i10);
            return;
        }
        if (i10 == 3) {
            if (userFragment.getActivity() != null) {
                BaseDialog baseDialogM5440s = C5975a.f6196a.m5440s(true, new InterfaceC9529a() { // from class: h4.u
                    @Override // p181hd.InterfaceC9529a
                    public final Object invoke() {
                        return UserFragment.m7799H(this.f21914c);
                    }
                });
                FragmentManager childFragmentManager = userFragment.getChildFragmentManager();
                AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
                baseDialogM5440s.show(childFragmentManager, RequestParameters.SUBRESOURCE_DELETE);
                return;
            }
            return;
        }
        if (i10 == 4 && userFragment.getActivity() != null) {
            BaseDialog baseDialogM5440s2 = C5975a.f6196a.m5440s(false, new InterfaceC9529a() { // from class: h4.v
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return UserFragment.m7800I(this.f21915c);
                }
            });
            FragmentManager childFragmentManager2 = userFragment.getChildFragmentManager();
            AbstractC9979u.m20293f(childFragmentManager2, "getChildFragmentManager(...)");
            baseDialogM5440s2.show(childFragmentManager2, "exit");
        }
    }

    /* renamed from: H */
    public static final C10786q m7799H(UserFragment userFragment) {
        userFragment.isShowLoading(true);
        AbstractC9804v.f23002a.m19815a("CacheClear");
        LiveEventBus.get("ClearCache").post(null);
        userFragment.m7796A().m7824m();
        return C10786q.f26013a;
    }

    /* renamed from: I */
    public static final C10786q m7800I(UserFragment userFragment) {
        C5962b.a aVar = C5962b.f6082a;
        aVar.m5299a().m5298z(aVar.m5299a().m5281i());
        aVar.m5299a().m5263A("");
        FragmentActivity activity = userFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        C5963c.f6084a.m5310f();
        return C10786q.f26013a;
    }

    /* renamed from: K */
    public static final UserMenuAdapter m7801K() {
        return new UserMenuAdapter();
    }

    /* renamed from: B */
    public final PersonalInfoFragment m7809B() {
        PersonalInfoFragment personalInfoFragment = this.f10652i;
        if (personalInfoFragment != null) {
            return personalInfoFragment;
        }
        AbstractC9979u.m20312y("personalInfoFragment");
        return null;
    }

    /* renamed from: C */
    public final UserMenuAdapter m7810C() {
        return (UserMenuAdapter) this.f10655l.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public final void m7811E(String str, int i10) {
        ((UserFragmentBinding) getMBinding()).f10617f.setText(str);
        if (i10 == 0) {
            m7796A().m7826o();
        }
        ((UserFragmentBinding) getMBinding()).f10619h.setCurrentItem(i10);
        ((UserFragmentBinding) getMBinding()).f10618g.setVisibility(8);
        ((UserFragmentBinding) getMBinding()).f10614c.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public final void m7812F() {
        RecyclerView recyclerView = ((UserFragmentBinding) getMBinding()).f10615d;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        int i10 = 0;
        if (C5962b.f6082a.m5299a().m5287o() == 1) {
            String[] strArrM26586g = AbstractC11958b.m26586g(R$array.student_menu);
            int length = strArrM26586g.length;
            while (i10 < length) {
                this.f10656m.add(strArrM26586g[i10]);
                i10++;
            }
        } else {
            String[] strArrM26586g2 = AbstractC11958b.m26586g(R$array.mine_menu);
            int length2 = strArrM26586g2.length;
            while (i10 < length2) {
                this.f10656m.add(strArrM26586g2[i10]);
                i10++;
            }
        }
        m7810C().setList(this.f10656m);
        m7813J();
        m7810C().setOnItemClickListener(new InterfaceC10427d() { // from class: h4.t
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i11) {
                UserFragment.m7798G(this.f21913a, baseQuickAdapter, view, i11);
            }
        });
        recyclerView.setAdapter(m7810C());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public final void m7813J() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC9979u.m20293f(childFragmentManager, "getChildFragmentManager(...)");
        this.f10658o = new UserViewPageAdapter(childFragmentManager, this.f10657n);
        ((UserFragmentBinding) getMBinding()).f10619h.setAdapter(this.f10658o);
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public int getLayoutId() {
        return R$layout.user_fragment;
    }

    @Override // com.friday.common.base.InterfaceC5929c
    public void initData() {
        super.initView();
        this.f10657n.clear();
        this.f10657n.add(m7809B());
        this.f10657n.add(m7814y());
        this.f10657n.add(m7815z());
        m7812F();
        initDataSource();
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new C63291(null));
    }

    @Override // com.friday.common.base.BaseFragment
    public void initDataSource() {
        super.initDataSource();
        m7796A().m7829r().observe(requireActivity(), new C6328a(new InterfaceC9540l() { // from class: h4.s
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return UserFragment.m7797D(this.f21912c, (Boolean) obj);
            }
        }));
    }

    /* renamed from: y */
    public final AboutFragment m7814y() {
        AboutFragment aboutFragment = this.f10653j;
        if (aboutFragment != null) {
            return aboutFragment;
        }
        AbstractC9979u.m20312y("aboutFragment");
        return null;
    }

    /* renamed from: z */
    public final HelpFragment m7815z() {
        HelpFragment helpFragment = this.f10654k;
        if (helpFragment != null) {
            return helpFragment;
        }
        AbstractC9979u.m20312y("helpFragment");
        return null;
    }
}
