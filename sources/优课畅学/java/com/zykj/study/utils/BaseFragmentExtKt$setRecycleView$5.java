package com.zykj.study.utils;

import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.xuexiang.xui.widget.statelayout.MultipleStatusView;
import com.zykj.base.BaseFragment;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.utils.BaseFragmentExtKt$setRecycleView$5", m17801f = "BaseFragmentExt.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BaseFragmentExtKt$setRecycleView$5 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13710a;

    /* renamed from: b */
    public /* synthetic */ Object f13711b;

    /* renamed from: c */
    public final /* synthetic */ SwipeRefreshLayout f13712c;

    /* renamed from: d */
    public final /* synthetic */ BaseFragment f13713d;

    /* renamed from: e */
    public final /* synthetic */ PagingDataAdapter f13714e;

    /* renamed from: f */
    public final /* synthetic */ MultipleStatusView f13715f;

    /* renamed from: g */
    public final /* synthetic */ boolean f13716g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f13717h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFragmentExtKt$setRecycleView$5(SwipeRefreshLayout swipeRefreshLayout, BaseFragment baseFragment, PagingDataAdapter pagingDataAdapter, MultipleStatusView multipleStatusView, boolean z10, RecyclerView recyclerView, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13712c = swipeRefreshLayout;
        this.f13713d = baseFragment;
        this.f13714e = pagingDataAdapter;
        this.f13715f = multipleStatusView;
        this.f13716g = z10;
        this.f13717h = recyclerView;
    }

    @Override // p300x7.InterfaceC10574p
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CombinedLoadStates combinedLoadStates, InterfaceC9324c interfaceC9324c) {
        return ((BaseFragmentExtKt$setRecycleView$5) create(combinedLoadStates, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        BaseFragmentExtKt$setRecycleView$5 baseFragmentExtKt$setRecycleView$5 = new BaseFragmentExtKt$setRecycleView$5(this.f13712c, this.f13713d, this.f13714e, this.f13715f, this.f13716g, this.f13717h, interfaceC9324c);
        baseFragmentExtKt$setRecycleView$5.f13711b = obj;
        return baseFragmentExtKt$setRecycleView$5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) this.f13711b;
        AbstractC9434a.m17291f();
        if (this.f13710a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        SwipeRefreshLayout swipeRefreshLayout = this.f13712c;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(combinedLoadStates.getRefresh() instanceof LoadState.Loading);
        }
        if (combinedLoadStates.getRefresh() instanceof LoadState.Error) {
            LoadState refresh = combinedLoadStates.getRefresh();
            AbstractC9133u.m16131e(refresh, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            BaseFragmentExtKt.m11863a(this.f13713d, this.f13714e, this.f13715f, (LoadState.Error) refresh);
            return C8736p.f16368a;
        }
        if (combinedLoadStates.getAppend() instanceof LoadState.Error) {
            LoadState append = combinedLoadStates.getAppend();
            AbstractC9133u.m16131e(append, "null cannot be cast to non-null type androidx.paging.LoadState.Error");
            BaseFragmentExtKt.m11863a(this.f13713d, this.f13714e, this.f13715f, (LoadState.Error) append);
            return C8736p.f16368a;
        }
        if ((combinedLoadStates.getSource().getRefresh() instanceof LoadState.Loading) && this.f13716g) {
            MultipleStatusView multipleStatusView = this.f13715f;
            if (multipleStatusView != null) {
                multipleStatusView.m7165l();
            }
        } else if ((combinedLoadStates.getSource().getRefresh() instanceof LoadState.NotLoading) && combinedLoadStates.getAppend().getEndOfPaginationReached()) {
            if (this.f13714e.getItemCount() > 0) {
                MultipleStatusView multipleStatusView2 = this.f13715f;
                if (multipleStatusView2 != null) {
                    multipleStatusView2.m7157d();
                }
                RecyclerView recyclerView = this.f13717h;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                }
            } else {
                MultipleStatusView multipleStatusView3 = this.f13715f;
                if (multipleStatusView3 != null) {
                    multipleStatusView3.m7159f();
                }
            }
        }
        return C8736p.f16368a;
    }
}
