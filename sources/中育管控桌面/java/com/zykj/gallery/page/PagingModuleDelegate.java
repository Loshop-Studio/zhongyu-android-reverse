package com.zykj.gallery.page;

import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingSource;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p049e3.InterfaceC6268a;

/* loaded from: classes2.dex */
public final class PagingModuleDelegate {

    /* renamed from: a */
    public final InterfaceC6268a f5766a;

    /* renamed from: b */
    public final int f5767b;

    /* renamed from: c */
    public final CoroutineScope f5768c;

    /* renamed from: d */
    public final MutableStateFlow f5769d;

    /* renamed from: e */
    public final Flow f5770e;

    /* renamed from: com.zykj.gallery.page.PagingModuleDelegate$a */
    public static final class C6025a implements Function0 {

        /* renamed from: b */
        public final /* synthetic */ Object f5776b;

        public C6025a(Object obj) {
            this.f5776b = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PagingSource invoke() {
            return PagingModuleDelegate.this.f5766a.create(this.f5776b);
        }
    }

    public PagingModuleDelegate(InterfaceC6268a pagingSourceFactory, Object initialParams, int i6, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(initialParams, "initialParams");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f5766a = pagingSourceFactory;
        this.f5767b = i6;
        this.f5768c = scope;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new Pair(initialParams, 0L));
        this.f5769d = MutableStateFlow;
        this.f5770e = CachedPagingDataKt.cachedIn(FlowKt.transformLatest(MutableStateFlow, new PagingModuleDelegate$special$$inlined$flatMapLatest$1(null, this)), scope);
    }

    /* renamed from: c */
    public final void m5020c() {
        this.f5769d.setValue(new Pair(((Pair) this.f5769d.getValue()).getFirst(), Long.valueOf(((Number) ((Pair) this.f5769d.getValue()).getSecond()).longValue() + 1)));
    }

    /* renamed from: d */
    public final Flow m5021d() {
        return this.f5770e;
    }
}
