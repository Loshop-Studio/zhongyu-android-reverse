package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.ViewKt;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.lib.login.proto.RoleType;
import com.zykj.lib.login.proto.UserBean;
import com.zykj.study.R$id;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentMyBinding;
import com.zykj.study.p065ui.home.p066my.MyFragment;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import p123h7.C8736p;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class MyFragment extends Hilt_MyFragment<FragmentMyBinding> {

    /* renamed from: f */
    public final InterfaceC8724d f13290f;

    /* renamed from: g */
    public Integer f13291g;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.MyFragment$initData$2", m17801f = "MyFragment.kt", m17802l = {33}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.MyFragment$initData$2 */
    public static final class C80552 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13296a;

        public C80552(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return MyFragment.this.new C80552(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80552) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13296a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c data = MyFragment.this.m11571m().m9295c().getData();
                this.f13296a = 1;
                obj = AbstractC9268e.m17036z(data, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            UserBean userBean = (UserBean) obj;
            if ((userBean != null ? userBean.getRole() : null) == RoleType.Teacher) {
                FragmentContainerView fragmentContainerMy = ((FragmentMyBinding) MyFragment.this.getMBindView()).fragmentContainerMy;
                AbstractC9133u.m16132f(fragmentContainerMy, "fragmentContainerMy");
                ViewKt.findNavController(fragmentContainerMy).navigate(R$id.action_global_myCourseFragment);
                MyFragment myFragment = MyFragment.this;
                myFragment.m11576r(AbstractC9536a.m17798c(((FragmentMyBinding) myFragment.getMBindView()).tvMyProduct.getId()));
            }
            return C8736p.f16368a;
        }
    }

    public MyFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13290f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(LoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.MyFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final LoginViewModel m11571m() {
        return (LoginViewModel) this.f13290f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final void m11572n(MyFragment myFragment, View view) {
        myFragment.m11576r(Integer.valueOf(view.getId()));
        FragmentContainerView fragmentContainerMy = ((FragmentMyBinding) myFragment.getMBindView()).fragmentContainerMy;
        AbstractC9133u.m16132f(fragmentContainerMy, "fragmentContainerMy");
        NavController navControllerFindNavController = ViewKt.findNavController(fragmentContainerMy);
        NavDestination currentDestination = navControllerFindNavController.getCurrentDestination();
        if (currentDestination == null || currentDestination.getId() != R$id.settingFragment) {
            navControllerFindNavController.navigate(R$id.action_global_settingFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public static final void m11573o(MyFragment myFragment, View view) {
        myFragment.m11576r(Integer.valueOf(view.getId()));
        FragmentContainerView fragmentContainerMy = ((FragmentMyBinding) myFragment.getMBindView()).fragmentContainerMy;
        AbstractC9133u.m16132f(fragmentContainerMy, "fragmentContainerMy");
        NavController navControllerFindNavController = Navigation.findNavController(fragmentContainerMy);
        NavDestination currentDestination = navControllerFindNavController.getCurrentDestination();
        if (currentDestination == null || currentDestination.getId() != R$id.myCourseFragment) {
            navControllerFindNavController.navigate(R$id.action_global_myCourseFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final void m11574p(MyFragment myFragment, View view) {
        myFragment.m11576r(Integer.valueOf(view.getId()));
        FragmentContainerView fragmentContainerMy = ((FragmentMyBinding) myFragment.getMBindView()).fragmentContainerMy;
        AbstractC9133u.m16132f(fragmentContainerMy, "fragmentContainerMy");
        NavController navControllerFindNavController = ViewKt.findNavController(fragmentContainerMy);
        NavDestination currentDestination = navControllerFindNavController.getCurrentDestination();
        if (currentDestination == null || currentDestination.getId() != R$id.teacherFragment) {
            navControllerFindNavController.navigate(R$id.action_global_teacherFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static final void m11575q(MyFragment myFragment) {
        ((FragmentMyBinding) myFragment.getMBindView()).swipe.setRefreshing(true);
        LifecycleOwner viewLifecycleOwner = myFragment.getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new MyFragment$initView$5$1(myFragment, null), 3, null);
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C80552(null), 3, null);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) {
        ((FragmentMyBinding) getMBindView()).setUserBean(FlowLiveDataConversions.asLiveData$default(m11571m().m9295c().getData(), (InterfaceC9100d) null, 0L, 3, (Object) null));
        ((FragmentMyBinding) getMBindView()).tvSetting.setOnClickListener(new View.OnClickListener() { // from class: b5.i3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyFragment.m11572n(this.f2172a, view);
            }
        });
        ((FragmentMyBinding) getMBindView()).tvMyProduct.setOnClickListener(new View.OnClickListener() { // from class: b5.j3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyFragment.m11573o(this.f2179a, view);
            }
        });
        ((FragmentMyBinding) getMBindView()).tvTeacher.setOnClickListener(new View.OnClickListener() { // from class: b5.k3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyFragment.m11574p(this.f2185a, view);
            }
        });
        ((FragmentMyBinding) getMBindView()).swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: b5.l3
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                MyFragment.m11575q(this.f2194a);
            }
        });
        Integer num = this.f13291g;
        if (num == null) {
            m11576r(AbstractC9536a.m17798c(((FragmentMyBinding) getMBindView()).tvSetting.getId()));
        } else {
            m11576r(num);
        }
        return C8736p.f16368a;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_my;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final void m11576r(Integer num) {
        boolean z10 = false;
        ((FragmentMyBinding) getMBindView()).tvSetting.setSelected(num != null && num.intValue() == ((FragmentMyBinding) getMBindView()).tvSetting.getId());
        ((FragmentMyBinding) getMBindView()).tvMyProduct.setSelected(num != null && num.intValue() == ((FragmentMyBinding) getMBindView()).tvMyProduct.getId());
        TextView textView = ((FragmentMyBinding) getMBindView()).tvTeacher;
        int id = ((FragmentMyBinding) getMBindView()).tvTeacher.getId();
        if (num != null && num.intValue() == id) {
            z10 = true;
        }
        textView.setSelected(z10);
        this.f13291g = num;
    }
}
