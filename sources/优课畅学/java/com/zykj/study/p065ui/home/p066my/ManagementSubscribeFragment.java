package com.zykj.study.p065ui.home.p066my;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.internal.view.SupportMenu;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavDirections;
import androidx.navigation.ViewKt;
import androidx.navigation.fragment.FragmentKt;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.smtt.sdk.TbsListener;
import com.xuexiang.xui.widget.actionbar.TitleBar;
import com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.adapter.FreeSubscribeAdapter;
import com.zykj.study.adapter.SubscribeTabListAdapter;
import com.zykj.study.bean.FreeSubscribeReq;
import com.zykj.study.bean.OtherSubscribe;
import com.zykj.study.databinding.FragmentManagementSubscribeBinding;
import com.zykj.study.p065ui.home.p066my.ManagementSubscribeFragment;
import com.zykj.study.viewmodels.ManagementSubscribeViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9129q;
import p086e5.AbstractC8366o;
import p121h5.C8716c;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p123h7.InterfaceC8724d;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p179m7.InterfaceC9324c;
import p187n4.C9398o0;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9543h;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class ManagementSubscribeFragment extends Hilt_ManagementSubscribeFragment<FragmentManagementSubscribeBinding> {

    /* renamed from: p */
    public static final C8028a f13132p = new C8028a(null);

    /* renamed from: q */
    public static final int f13133q = 8;

    /* renamed from: f */
    public final InterfaceC8724d f13134f;

    /* renamed from: g */
    public final InterfaceC8724d f13135g;

    /* renamed from: i */
    public C9398o0 f13137i;

    /* renamed from: j */
    public SubscribeTabListAdapter f13138j;

    /* renamed from: n */
    public int f13142n;

    /* renamed from: o */
    public boolean f13143o;

    /* renamed from: h */
    public final FreeSubscribeAdapter f13136h = new FreeSubscribeAdapter();

    /* renamed from: k */
    public final MutableLiveData f13139k = new MutableLiveData();

    /* renamed from: l */
    public String f13140l = "";

    /* renamed from: m */
    public String f13141m = "";

    /* renamed from: com.zykj.study.ui.home.my.ManagementSubscribeFragment$a */
    public static final class C8028a {
        public /* synthetic */ C8028a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C8028a() {
        }
    }

    /* renamed from: com.zykj.study.ui.home.my.ManagementSubscribeFragment$b */
    public static final class C8029b implements Observer, InterfaceC9129q {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f13152a;

        public C8029b(InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            this.f13152a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return this.f13152a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f13152a.invoke(obj);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initData$3", m17801f = "ManagementSubscribeFragment.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.ManagementSubscribeFragment$initData$3 */
    public static final class C80303 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13153a;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initData$3$1", m17801f = "ManagementSubscribeFragment.kt", m17802l = {78}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.ManagementSubscribeFragment$initData$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13155a;

            /* renamed from: b */
            public /* synthetic */ Object f13156b;

            /* renamed from: c */
            public final /* synthetic */ ManagementSubscribeFragment f13157c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ManagementSubscribeFragment managementSubscribeFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13157c = managementSubscribeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f13157c, interfaceC9324c);
                anonymousClass1.f13156b = obj;
                return anonymousClass1;
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(PagingData pagingData, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                PagingData pagingData = (PagingData) this.f13156b;
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13155a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    FreeSubscribeAdapter freeSubscribeAdapter = this.f13157c.f13136h;
                    this.f13156b = AbstractC9543h.m17814a(pagingData);
                    this.f13155a = 1;
                    if (freeSubscribeAdapter.submitData(pagingData, this) == objM17291f) {
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

        public C80303(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return ManagementSubscribeFragment.this.new C80303(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80303) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13153a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM12187d = ManagementSubscribeFragment.this.m11455A().m12187d();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ManagementSubscribeFragment.this, null);
                this.f13153a = 1;
                if (AbstractC9268e.m17019i(interfaceC9266cM12187d, anonymousClass1, this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment", m17801f = "ManagementSubscribeFragment.kt", m17802l = {TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "initView")
    /* renamed from: com.zykj.study.ui.home.my.ManagementSubscribeFragment$initView$1 */
    public static final class C80311 extends ContinuationImpl {

        /* renamed from: a */
        public Object f13168a;

        /* renamed from: b */
        public Object f13169b;

        /* renamed from: c */
        public Object f13170c;

        /* renamed from: d */
        public int f13171d;

        /* renamed from: e */
        public long f13172e;

        /* renamed from: f */
        public /* synthetic */ Object f13173f;

        /* renamed from: h */
        public int f13175h;

        public C80311(InterfaceC9324c interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13173f = obj;
            this.f13175h |= Integer.MIN_VALUE;
            return ManagementSubscribeFragment.this.initView(null, this);
        }
    }

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$initView$10", m17801f = "ManagementSubscribeFragment.kt", m17802l = {253}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.ManagementSubscribeFragment$initView$10 */
    public static final class C803210 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public Object f13176a;

        /* renamed from: b */
        public Object f13177b;

        /* renamed from: c */
        public int f13178c;

        /* renamed from: d */
        public int f13179d;

        /* renamed from: e */
        public int f13180e;

        /* renamed from: g */
        public final /* synthetic */ ArrayList f13182g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C803210(ArrayList arrayList, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f13182g = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return ManagementSubscribeFragment.this.new C803210(this.f13182g, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C803210) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ManagementSubscribeFragment managementSubscribeFragment;
            ArrayList arrayList;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f13180e;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Bundle arguments = ManagementSubscribeFragment.this.getArguments();
                if (arguments != null) {
                    int i11 = arguments.getInt("courseId");
                    managementSubscribeFragment = ManagementSubscribeFragment.this;
                    ArrayList arrayList2 = this.f13182g;
                    this.f13176a = managementSubscribeFragment;
                    this.f13177b = arrayList2;
                    this.f13178c = i11;
                    this.f13179d = 0;
                    this.f13180e = 1;
                    obj = managementSubscribeFragment.m11455A().m12192i(i11, this);
                    if (obj == objM17291f) {
                        return objM17291f;
                    }
                    arrayList = arrayList2;
                }
                return C8736p.f16368a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList = (ArrayList) this.f13177b;
            managementSubscribeFragment = (ManagementSubscribeFragment) this.f13176a;
            AbstractC9079b.m15926b(obj);
            List<OtherSubscribe> list = (List) obj;
            if (list != null) {
                for (OtherSubscribe otherSubscribe : list) {
                    otherSubscribe.setName(otherSubscribe.getName() + "的学员 (授权)");
                }
                arrayList.addAll(list);
                SubscribeTabListAdapter subscribeTabListAdapter = managementSubscribeFragment.f13138j;
                if (subscribeTabListAdapter == null) {
                    AbstractC9133u.m16151y("subscribeTabListAdapter");
                    subscribeTabListAdapter = null;
                }
                subscribeTabListAdapter.notifyDataSetChanged();
            }
            return C8736p.f16368a;
        }
    }

    public ManagementSubscribeFragment() {
        final InterfaceC10559a interfaceC10559a = null;
        this.f13134f = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(ManagementSubscribeViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ManagementSubscribeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ManagementSubscribeFragment$special$$inlined$activityViewModels$default$2
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ManagementSubscribeFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
        this.f13135g = FragmentViewModelLazyKt.createViewModelLazy(this, AbstractC9137y.m16154b(LoginViewModel.class), new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ManagementSubscribeFragment$special$$inlined$activityViewModels$default$4
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ManagementSubscribeFragment$special$$inlined$activityViewModels$default$5
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
        }, new InterfaceC10559a() { // from class: com.zykj.study.ui.home.my.ManagementSubscribeFragment$special$$inlined$activityViewModels$default$6
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: C */
    public static final C8736p m11420C(ManagementSubscribeFragment managementSubscribeFragment, CombinedLoadStates it) {
        AbstractC9133u.m16133g(it, "it");
        LoadState refresh = it.getRefresh();
        if (refresh instanceof LoadState.Loading) {
            managementSubscribeFragment.f13139k.postValue(Boolean.TRUE);
        } else {
            if (!(refresh instanceof LoadState.NotLoading) && !(refresh instanceof LoadState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            managementSubscribeFragment.f13139k.postValue(Boolean.FALSE);
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static final C8736p m11421D(ManagementSubscribeFragment managementSubscribeFragment, Boolean bool) {
        if (!bool.booleanValue()) {
            if (managementSubscribeFragment.f13136h.getItemCount() == 0) {
                FreeSubscribeReq freeSubscribeReqM12188e = managementSubscribeFragment.m11455A().m12188e();
                String name = freeSubscribeReqM12188e.getName();
                boolean z10 = true;
                boolean z11 = (name == null || name.length() == 0) & (freeSubscribeReqM12188e.getRoleType() == null);
                String learnDateTimeStart = freeSubscribeReqM12188e.getLearnDateTimeStart();
                boolean z12 = z11 & (learnDateTimeStart == null || learnDateTimeStart.length() == 0);
                String learnDateTimeEnd = freeSubscribeReqM12188e.getLearnDateTimeEnd();
                if (learnDateTimeEnd != null && learnDateTimeEnd.length() != 0) {
                    z10 = false;
                }
                if (z12 && z10) {
                    ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.getRoot().setVisibility(8);
                    ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberListEmpty.getRoot().setVisibility(0);
                } else {
                    ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.getRoot().setVisibility(0);
                    ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberListEmpty.getRoot().setVisibility(8);
                    ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.rvFreeSubscriberList.setVisibility(8);
                    ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.llSearchEmpty.setVisibility(0);
                }
            } else {
                ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.getRoot().setVisibility(0);
                ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberListEmpty.getRoot().setVisibility(8);
                ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.llSearchEmpty.setVisibility(8);
                ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.rvFreeSubscriberList.setVisibility(0);
            }
            managementSubscribeFragment.m11455A().m12195l();
            SubscribeTabListAdapter subscribeTabListAdapter = managementSubscribeFragment.f13138j;
            if (subscribeTabListAdapter == null) {
                AbstractC9133u.m16151y("subscribeTabListAdapter");
                subscribeTabListAdapter = null;
            }
            subscribeTabListAdapter.notifyDataSetChanged();
            if (managementSubscribeFragment.f13143o) {
                ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.rvFreeSubscriberList.scrollToPosition(0);
                managementSubscribeFragment.f13143o = false;
            }
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public static final C8736p m11422F(ManagementSubscribeFragment managementSubscribeFragment, String str, Bundle bundle) {
        String strSubstring;
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        managementSubscribeFragment.f13140l = AbstractC9133u.m16128b(String.valueOf(bundle.getString("START_DATE")), "null") ? "" : String.valueOf(bundle.getString("START_DATE"));
        managementSubscribeFragment.f13141m = AbstractC9133u.m16128b(String.valueOf(bundle.getString("END_DATE")), "null") ? "" : String.valueOf(bundle.getString("END_DATE"));
        StringBuffer stringBuffer = new StringBuffer();
        String string = bundle.getString("START_DATE");
        String strSubstring2 = null;
        if (string == null || string.length() == 0) {
            stringBuffer.append("不限  ~");
        } else {
            String string2 = bundle.getString("START_DATE");
            if (string2 != null) {
                strSubstring = string2.substring(0, 10);
                AbstractC9133u.m16132f(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            stringBuffer.append(strSubstring + "~");
        }
        String string3 = bundle.getString("END_DATE");
        if (string3 == null || string3.length() == 0) {
            stringBuffer.append("  不限");
        } else {
            String string4 = bundle.getString("END_DATE");
            if (string4 != null) {
                strSubstring2 = string4.substring(0, 10);
                AbstractC9133u.m16132f(strSubstring2, "substring(...)");
            }
            stringBuffer.append(strSubstring2);
        }
        ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.tvDateSelect.setText(stringBuffer);
        return C8736p.f16368a;
    }

    /* renamed from: G */
    public static final C8736p m11423G(ManagementSubscribeFragment managementSubscribeFragment, String str, Bundle bundle) {
        Bundle arguments;
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "bundle");
        String string = bundle.getString("accountId");
        if (string != null && string.length() > 0 && (arguments = managementSubscribeFragment.getArguments()) != null) {
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(managementSubscribeFragment), null, null, new ManagementSubscribeFragment$initFragmentListener$2$1$1$1(managementSubscribeFragment, arguments.getInt("courseId"), string, null), 3, null);
        }
        return C8736p.f16368a;
    }

    /* renamed from: H */
    public static final C8736p m11424H(ManagementSubscribeFragment managementSubscribeFragment, String str, Bundle bundle) {
        AbstractC9133u.m16133g(str, "<unused var>");
        AbstractC9133u.m16133g(bundle, "<unused var>");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(managementSubscribeFragment), null, null, new ManagementSubscribeFragment$initFragmentListener$3$1(managementSubscribeFragment, null), 3, null);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: I */
    public static final void m11425I(ManagementSubscribeFragment managementSubscribeFragment, View view) {
        managementSubscribeFragment.m11455A().m12188e().setLearnDateTimeStart(managementSubscribeFragment.f13140l);
        managementSubscribeFragment.m11455A().m12188e().setLearnDateTimeEnd(managementSubscribeFragment.f13141m);
        managementSubscribeFragment.m11455A().m12188e().setRoleType(Integer.valueOf(managementSubscribeFragment.f13142n));
        managementSubscribeFragment.m11455A().m12188e().setName(String.valueOf(((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.tvSearch.getText()));
        managementSubscribeFragment.f13136h.refresh();
        managementSubscribeFragment.f13143o = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: J */
    public static final void m11426J(ManagementSubscribeFragment managementSubscribeFragment, View view) {
        ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.spRoleSelect.m7152v(0);
        ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.tvSearch.setText((CharSequence) null);
        ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.tvDateSelect.setText(managementSubscribeFragment.getString(R$string.free_subscriber_search_date));
        FreeSubscribeReq freeSubscribeReqM12188e = managementSubscribeFragment.m11455A().m12188e();
        freeSubscribeReqM12188e.setName(null);
        freeSubscribeReqM12188e.setLearnDateTimeEnd(null);
        freeSubscribeReqM12188e.setLearnDateTimeStart(null);
        freeSubscribeReqM12188e.setRoleType(null);
        managementSubscribeFragment.f13140l = "";
        managementSubscribeFragment.f13141m = "";
        managementSubscribeFragment.f13142n = 0;
        managementSubscribeFragment.f13136h.refresh();
        managementSubscribeFragment.f13143o = true;
    }

    /* renamed from: K */
    public static final void m11427K(final ManagementSubscribeFragment managementSubscribeFragment, View view) {
        C8716c.f16341b.m14220a(new InterfaceC10559a() { // from class: b5.q1
            @Override // p300x7.InterfaceC10559a
            public final Object invoke() {
                return ManagementSubscribeFragment.m11428L(this.f2231a);
            }
        });
    }

    /* renamed from: L */
    public static final C8736p m11428L(ManagementSubscribeFragment managementSubscribeFragment) {
        FragmentKt.findNavController(managementSubscribeFragment).navigate(AbstractC8102h.f13554a.m11799a(managementSubscribeFragment.f13140l, managementSubscribeFragment.f13141m));
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    public static final C8736p m11429M(ManagementSubscribeFragment managementSubscribeFragment, int i10, OtherSubscribe item) {
        AbstractC9133u.m16133g(item, "item");
        FragmentManagementSubscribeBinding fragmentManagementSubscribeBinding = (FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView();
        View root = fragmentManagementSubscribeBinding.freeSubscriberListEmpty.getRoot();
        AbstractC9133u.m16132f(root, "getRoot(...)");
        View root2 = fragmentManagementSubscribeBinding.freeSubscriberList.getRoot();
        AbstractC9133u.m16132f(root2, "getRoot(...)");
        View root3 = fragmentManagementSubscribeBinding.selfCourseSubscriberList.getRoot();
        AbstractC9133u.m16132f(root3, "getRoot(...)");
        View root4 = fragmentManagementSubscribeBinding.otherCourseSubscriberList.getRoot();
        AbstractC9133u.m16132f(root4, "getRoot(...)");
        managementSubscribeFragment.m11458S(root, root2, root3, root4);
        if (i10 == 0) {
            managementSubscribeFragment.f13136h.refresh();
        } else if (i10 != 1) {
            AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(managementSubscribeFragment), null, null, new ManagementSubscribeFragment$initView$9$2(managementSubscribeFragment, item, null), 3, null);
            ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).otherCourseSubscriberList.getRoot().setVisibility(0);
        } else {
            managementSubscribeFragment.m11459T();
        }
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: N */
    public static final C8736p m11430N(ManagementSubscribeFragment managementSubscribeFragment, Integer num) {
        ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).otherCourseSubscriberList.setPeople(num);
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: O */
    public static final C8736p m11431O(ManagementSubscribeFragment managementSubscribeFragment, Integer num) {
        String str = "共" + num + "人";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(SupportMenu.CATEGORY_MASK), 1, str.length() - 1, 33);
        ((FragmentManagementSubscribeBinding) managementSubscribeFragment.getMBindView()).freeSubscriberList.freeSubNumber.setText(spannableStringBuilder);
        return C8736p.f16368a;
    }

    /* renamed from: P */
    public static final void m11432P(TitleBar titleBar, View view) {
        AbstractC9133u.m16130d(titleBar);
        ViewKt.findNavController(titleBar).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: Q */
    public static final void m11433Q(ManagementSubscribeFragment managementSubscribeFragment, View view) {
        Integer num = (Integer) managementSubscribeFragment.m11455A().m12193j().getValue();
        if (num != null && num.intValue() == 0) {
            AbstractC8366o.m13651c(XToastUtils.INSTANCE, R$string.batch_delete_error_message);
            return;
        }
        NavDirections navDirectionsM11800b = AbstractC8102h.f13554a.m11800b(String.valueOf(managementSubscribeFragment.m11455A().m12193j().getValue()));
        AbstractC9133u.m16130d(view);
        ViewKt.findNavController(view).navigate(navDirectionsM11800b);
    }

    /* renamed from: R */
    public static final void m11434R(ManagementSubscribeFragment managementSubscribeFragment, MaterialSpinner materialSpinner, int i10, long j10, Object obj) {
        AbstractC9133u.m16133g(materialSpinner, "<unused var>");
        AbstractC9133u.m16133g(obj, "<unused var>");
        managementSubscribeFragment.f13142n = i10;
    }

    /* renamed from: A */
    public final ManagementSubscribeViewModel m11455A() {
        return (ManagementSubscribeViewModel) this.f13134f.getValue();
    }

    /* renamed from: B */
    public final LoginViewModel m11456B() {
        return (LoginViewModel) this.f13135g.getValue();
    }

    /* renamed from: E */
    public final void m11457E() {
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "REQUEST_DATE", new InterfaceC10574p() { // from class: b5.r1
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return ManagementSubscribeFragment.m11422F(this.f2240a, (String) obj, (Bundle) obj2);
            }
        });
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "DELETE_SUB_SING", new InterfaceC10574p() { // from class: b5.s1
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return ManagementSubscribeFragment.m11423G(this.f2248a, (String) obj, (Bundle) obj2);
            }
        });
        androidx.fragment.app.FragmentKt.setFragmentResultListener(this, "DELETE_SUB_BATCH", new InterfaceC10574p() { // from class: b5.t1
            @Override // p300x7.InterfaceC10574p
            public final Object invoke(Object obj, Object obj2) {
                return ManagementSubscribeFragment.m11424H(this.f2253a, (String) obj, (Bundle) obj2);
            }
        });
    }

    /* renamed from: S */
    public final void m11458S(View... viewArr) {
        for (View view : viewArr) {
            view.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public final void m11459T() {
        ((FragmentManagementSubscribeBinding) getMBindView()).selfCourseSubscriberList.getRoot().setVisibility(0);
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ManagementSubscribeFragment$showSelfList$1(this, null), 3, null);
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(InterfaceC9324c interfaceC9324c) {
        if (getArguments() != null) {
            m11455A().m12194k(new FreeSubscribeReq(r13.getInt("courseId"), null, null, null, null, 0, 0, 96, null));
        }
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C80303(null), 3, null);
        this.f13136h.addLoadStateListener(new InterfaceC10570l() { // from class: b5.c2
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ManagementSubscribeFragment.m11420C(this.f2132a, (CombinedLoadStates) obj);
            }
        });
        this.f13139k.observe(this, new C8029b(new InterfaceC10570l() { // from class: b5.p1
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return ManagementSubscribeFragment.m11421D(this.f2224a, (Boolean) obj);
            }
        }));
        m11457E();
        return C8736p.f16368a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.zykj.base.BaseFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object initView(android.os.Bundle r11, p179m7.InterfaceC9324c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.study.p065ui.home.p066my.ManagementSubscribeFragment.initView(android.os.Bundle, m7.c):java.lang.Object"); // DEX body: android/优课畅学/smali_classes5/com/zykj/study/ui/home/my/ManagementSubscribeFragment.smali:3054
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R$layout.fragment_management_subscribe;
    }
}
