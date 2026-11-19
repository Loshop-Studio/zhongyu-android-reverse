package com.zykj.study.utils;

import android.view.LayoutInflater;
import androidx.databinding.DataBindingUtil;
import androidx.paging.LoadState;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.base.BaseFragment;
import com.zykj.base.bean.toast.ToastErrorCodeMessage;
import com.zykj.base.bean.toast.ToastErrorMessage;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.utils.ExceptionHandle;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.error.code.ErrorCodeHandler;
import com.zykj.lib.error.code.ErrorCodeInfo;
import com.zykj.study.R$layout;
import com.zykj.study.databinding.LayoutStatusErrorBinding;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p300x7.InterfaceC10559a;

/* loaded from: classes5.dex */
public abstract class BaseFragmentExtKt {

    /* renamed from: com.zykj.study.utils.BaseFragmentExtKt$a */
    public static final class C8131a implements InterfaceC10559a {

        /* renamed from: a */
        public static final C8131a f13707a = new C8131a();

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: com.zykj.study.utils.BaseFragmentExtKt$b */
    public static final class C8132b implements InterfaceC10559a {

        /* renamed from: a */
        public static final C8132b f13708a = new C8132b();

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: com.zykj.study.utils.BaseFragmentExtKt$c */
    public static final class C8133c implements InterfaceC10559a {

        /* renamed from: a */
        public static final C8133c f13709a = new C8133c();

        @Override // p300x7.InterfaceC10559a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    /* renamed from: a */
    public static final void m11863a(BaseFragment baseFragment, PagingDataAdapter adapter, MultipleStatusView multipleStatusView, LoadState.Error state) {
        AbstractC9133u.m16133g(baseFragment, "<this>");
        AbstractC9133u.m16133g(adapter, "adapter");
        AbstractC9133u.m16133g(state, "state");
        ErrorCodeInfo errorCodeInfo = ExceptionHandle.INSTANCE.handleException(state.getError()).getErrorCodeInfo();
        Integer messageResId = errorCodeInfo.getMessageResId();
        if (messageResId != null) {
            AbstractC8366o.m13651c(XToastUtils.INSTANCE, messageResId.intValue());
        }
        int code = errorCodeInfo.getCode();
        if (597 > code || code >= 600) {
            if (adapter.getItemCount() >= 1 || multipleStatusView == null) {
                return;
            }
            multipleStatusView.m7162i();
            return;
        }
        if (adapter.getItemCount() >= 1 || multipleStatusView == null) {
            return;
        }
        multipleStatusView.m7168o();
    }

    /* renamed from: b */
    public static final void m11864b(BaseFragment baseFragment, com.zykj.study.view.MultipleStatusView multipleStatusView, ToastMessage toastMessage) {
        AbstractC9133u.m16133g(baseFragment, "<this>");
        AbstractC9133u.m16133g(toastMessage, "toastMessage");
        if (toastMessage instanceof ToastErrorMessage) {
            LayoutStatusErrorBinding layoutStatusErrorBinding = (LayoutStatusErrorBinding) DataBindingUtil.inflate(LayoutInflater.from(baseFragment.getContext()), R$layout.layout_status_error, null, false);
            layoutStatusErrorBinding.setErrorMessage(toastMessage.getMessage());
            if (multipleStatusView != null) {
                multipleStatusView.m11960e(layoutStatusErrorBinding.getRoot());
                return;
            }
            return;
        }
        if (toastMessage instanceof ToastErrorCodeMessage) {
            ToastErrorCodeMessage toastErrorCodeMessage = (ToastErrorCodeMessage) toastMessage;
            int code = toastErrorCodeMessage.getErrorInfo().getCode();
            if (597 <= code && code < 600) {
                if (multipleStatusView != null) {
                    multipleStatusView.m11969n();
                    return;
                }
                return;
            }
            LayoutStatusErrorBinding layoutStatusErrorBinding2 = (LayoutStatusErrorBinding) DataBindingUtil.inflate(LayoutInflater.from(baseFragment.getContext()), R$layout.layout_status_error, null, false);
            ErrorCodeHandler.INSTANCE.getErrorCode(toastErrorCodeMessage.getErrorInfo().getCode());
            Integer messageResId = toastErrorCodeMessage.getErrorInfo().getMessageResId();
            if (messageResId != null) {
                layoutStatusErrorBinding2.setErrorMessage(baseFragment.getString(messageResId.intValue()));
                if (multipleStatusView != null) {
                    multipleStatusView.m11960e(layoutStatusErrorBinding2.getRoot());
                    return;
                }
                return;
            }
            String message = toastErrorCodeMessage.getErrorInfo().getMessage();
            if (message != null) {
                layoutStatusErrorBinding2.setErrorMessage(message);
                if (multipleStatusView != null) {
                    multipleStatusView.m11960e(layoutStatusErrorBinding2.getRoot());
                }
            }
        }
    }

    /* renamed from: c */
    public static final Object m11865c(BaseFragment baseFragment, PagingDataAdapter pagingDataAdapter, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, boolean z10, InterfaceC9324c interfaceC9324c) {
        Object objM17019i = AbstractC9268e.m17019i(pagingDataAdapter.getLoadStateFlow(), new BaseFragmentExtKt$setRecycleView$5((SwipeRefreshLayout) interfaceC10559a2.invoke(), baseFragment, pagingDataAdapter, (MultipleStatusView) interfaceC10559a.invoke(), z10, (RecyclerView) interfaceC10559a3.invoke(), null), interfaceC9324c);
        return objM17019i == AbstractC9434a.m17291f() ? objM17019i : C8736p.f16368a;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m11866d(BaseFragment baseFragment, PagingDataAdapter pagingDataAdapter, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, boolean z10, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC10559a = C8131a.f13707a;
        }
        InterfaceC10559a interfaceC10559a4 = interfaceC10559a;
        if ((i10 & 4) != 0) {
            interfaceC10559a2 = C8132b.f13708a;
        }
        InterfaceC10559a interfaceC10559a5 = interfaceC10559a2;
        if ((i10 & 8) != 0) {
            interfaceC10559a3 = C8133c.f13709a;
        }
        InterfaceC10559a interfaceC10559a6 = interfaceC10559a3;
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return m11865c(baseFragment, pagingDataAdapter, interfaceC10559a4, interfaceC10559a5, interfaceC10559a6, z10, interfaceC9324c);
    }
}
