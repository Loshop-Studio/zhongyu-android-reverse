package com.zykj.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.LayoutRes;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.AbstractC5380q;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@Keep
/* loaded from: classes4.dex */
public abstract class BaseFragment<T extends ViewDataBinding> extends Fragment {
    public T mBindView;

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseFragment$onCreate$1", m17801f = "BaseFragment.kt", m17802l = {24}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseFragment$onCreate$1 */
    public static final class C70351 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f8609a;

        public C70351(InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C70351(interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70351) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f8609a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                BaseFragment baseFragment = BaseFragment.this;
                this.f8609a = 1;
                if (baseFragment.initData(this) == objM17291f) {
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

    @InterfaceC9539d(m17800c = "com.zykj.base.BaseFragment$onViewCreated$1", m17801f = "BaseFragment.kt", m17802l = {42}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.base.BaseFragment$onViewCreated$1 */
    public static final class C70361 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f8611a;

        /* renamed from: c */
        public final /* synthetic */ Bundle f8613c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C70361(Bundle bundle, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f8613c = bundle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C70361(this.f8613c, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C70361) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f8611a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                BaseFragment baseFragment = BaseFragment.this;
                Bundle bundle = this.f8613c;
                this.f8611a = 1;
                if (baseFragment.initView(bundle, this) == objM17291f) {
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

    public static /* synthetic */ <T extends ViewDataBinding> Object initData$suspendImpl(BaseFragment<T> baseFragment, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return C8736p.f16368a;
    }

    public T getMBindView() {
        T t10 = this.mBindView;
        if (t10 != null) {
            return t10;
        }
        AbstractC9133u.m16151y("mBindView");
        return null;
    }

    public Object initData(InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return initData$suspendImpl(this, interfaceC9324c);
    }

    public abstract Object initView(Bundle bundle, InterfaceC9324c<? super C8736p> interfaceC9324c);

    @LayoutRes
    public abstract int layoutId();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C70351(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC9133u.m16133g(inflater, "inflater");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(inflater, layoutId(), viewGroup, false);
        AbstractC9133u.m16132f(viewDataBindingInflate, "inflate(...)");
        setMBindView(viewDataBindingInflate);
        getMBindView().setLifecycleOwner(this);
        return getMBindView().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC9133u.m16133g(view, "view");
        super.onViewCreated(view, bundle);
        AbstractC5380q.m2613i("当前的fragment是" + getClass().getSimpleName() + ",视图已就绪");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC8839h.m14861d(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C70361(bundle, null), 3, null);
    }

    public void setMBindView(T t10) {
        AbstractC9133u.m16133g(t10, "<set-?>");
        this.mBindView = t10;
    }
}
