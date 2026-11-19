package com.zykj.student.dialogue.p076ui.collect;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import androidx.paging.PagingSource;
import com.zykj.student.dialogue.base.BaseViewModel;
import com.zykj.student.dialogue.p076ui.collect.AbstractC7494b;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p128h6.AbstractC8103b;
import p158k6.InterfaceC8287g;
import p190n6.C9106g;
import p244s6.C9526k0;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0)8\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f040$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010'R)\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b078\u0006¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010\u001a\u001a\u0004\b:\u0010;¨\u0006>"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "<init>", "(Lk6/g;)V", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "homeViewModel", "", "u", "(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)V", "Ls6/k0;", "newFilter", "w", "(Ls6/k0;)V", "Lcom/zykj/student/dialogue/ui/collect/b;", "sampleViewEvents", "t", "(Lcom/zykj/student/dialogue/ui/collect/b;)V", "", "id", "", "newCollectState", "v", "(Ljava/lang/String;Z)V", "p", "()V", "Landroidx/paging/PagingData;", "Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "paging", "o", "(Landroidx/paging/PagingData;Lcom/zykj/student/dialogue/ui/collect/b;)Landroidx/paging/PagingData;", "c", "Lk6/g;", "r", "()Lk6/g;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Ln6/g;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "e", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "f", "_filterConditions", "g", "s", "filterConditions", "", "h", "modificationEvents", "Lkotlinx/coroutines/flow/Flow;", "i", "Lkotlinx/coroutines/flow/Flow;", "q", "()Lkotlinx/coroutines/flow/Flow;", "getDataFlow$annotations", "dataFlow", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCollectHistoryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectHistoryViewModel.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,132:1\n189#2:133\n*S KotlinDebug\n*F\n+ 1 CollectHistoryViewModel.kt\ncom/zykj/student/dialogue/ui/collect/CollectHistoryViewModel\n*L\n60#1:133\n*E\n"})
/* loaded from: classes5.dex */
public final class CollectHistoryViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow _uiState;

    /* renamed from: e, reason: from kotlin metadata */
    public final StateFlow uiState;

    /* renamed from: f, reason: from kotlin metadata */
    public final MutableStateFlow _filterConditions;

    /* renamed from: g, reason: from kotlin metadata */
    public final StateFlow filterConditions;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableStateFlow modificationEvents;

    /* renamed from: i, reason: from kotlin metadata */
    public final Flow dataFlow;

    /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$a */
    public static final class C7485a implements Function0 {

        /* renamed from: b */
        public final /* synthetic */ C9526k0 f10748b;

        /* renamed from: com.zykj.student.dialogue.ui.collect.CollectHistoryViewModel$a$a */
        public static final class a implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ CollectHistoryViewModel f10749a;

            public a(CollectHistoryViewModel collectHistoryViewModel) {
                this.f10749a = collectHistoryViewModel;
            }

            /* renamed from: a */
            public final void m10124a(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f10749a.m9922g(new AbstractC8103b.a.C10073a(throwable));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10124a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }

        public C7485a(C9526k0 c9526k0) {
            this.f10748b = c9526k0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PagingSource invoke() {
            return new CollectPagingSource(CollectHistoryViewModel.this.getDialogueApi(), this.f10748b.m15728n(), new a(CollectHistoryViewModel.this));
        }
    }

    public CollectHistoryViewModel(InterfaceC8287g dialogueApi) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        this.dialogueApi = dialogueApi;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C9106g(null, null, null, 7, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C9526k0(null, null, null, null, null, null, null, null, null, 511, null));
        this._filterConditions = MutableStateFlow2;
        this.filterConditions = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.modificationEvents = MutableStateFlow3;
        this.dataFlow = FlowKt.flowCombine(CachedPagingDataKt.cachedIn(FlowKt.transformLatest(MutableStateFlow2, new CollectHistoryViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope(this)), MutableStateFlow3, new CollectHistoryViewModel$dataFlow$2(this, null));
    }

    /* renamed from: o */
    public final PagingData m10115o(PagingData paging, AbstractC7494b sampleViewEvents) {
        if (sampleViewEvents instanceof AbstractC7494b.a) {
            return PagingDataTransforms__PagingDataTransformsKt.filter(paging, new CollectHistoryViewModel$applyEvents$1(sampleViewEvents, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: p */
    public final void m10116p() {
        this.modificationEvents.setValue(CollectionsKt.emptyList());
    }

    /* renamed from: q, reason: from getter */
    public final Flow getDataFlow() {
        return this.dataFlow;
    }

    /* renamed from: r, reason: from getter */
    public final InterfaceC8287g getDialogueApi() {
        return this.dialogueApi;
    }

    /* renamed from: s, reason: from getter */
    public final StateFlow getFilterConditions() {
        return this.filterConditions;
    }

    /* renamed from: t */
    public final void m10120t(AbstractC7494b sampleViewEvents) {
        Intrinsics.checkNotNullParameter(sampleViewEvents, "sampleViewEvents");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CollectHistoryViewModel$onPagingEdit$1(this, sampleViewEvents, null), 3, null);
    }

    /* renamed from: u */
    public final void m10121u(HomeViewModel homeViewModel) {
        Intrinsics.checkNotNullParameter(homeViewModel, "homeViewModel");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CollectHistoryViewModel$setHomeViewModel$1(homeViewModel, this, null), 3, null);
    }

    /* renamed from: v */
    public final void m10122v(String id, boolean newCollectState) {
        Intrinsics.checkNotNullParameter(id, "id");
        BaseViewModel.m9917f(this, null, false, null, null, null, new CollectHistoryViewModel$updateCollectState$1(this, id, newCollectState, null), 31, null);
    }

    /* renamed from: w */
    public final void m10123w(C9526k0 newFilter) {
        Intrinsics.checkNotNullParameter(newFilter, "newFilter");
        this._filterConditions.setValue(C9526k0.m15715b(newFilter, null, null, null, null, null, null, null, null, null, 511, null));
    }
}
