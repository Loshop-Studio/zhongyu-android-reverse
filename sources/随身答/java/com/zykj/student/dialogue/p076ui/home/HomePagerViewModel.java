package com.zykj.student.dialogue.p076ui.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.PagingData;
import androidx.paging.PagingDataTransforms__PagingDataTransformsKt;
import androidx.paging.PagingSource;
import com.zykj.student.dialogue.base.BaseViewModel;
import com.zykj.student.dialogue.p076ui.home.AbstractC7636p;
import java.util.ArrayList;
import java.util.List;
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
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
import p128h6.AbstractC8103b;
import p158k6.InterfaceC8287g;
import p244s6.C9526k0;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001c0*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R$\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R \u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010$R)\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017088\u0006¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\f\u001a\u0004\b;\u0010<¨\u0006?"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/HomePagerViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "<init>", "(Lk6/g;)V", "Lcom/zykj/student/dialogue/ui/home/p;", "homePagingEvents", "", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/zykj/student/dialogue/ui/home/p;)V", "t", "()V", "", "", "ids", "catalogId", "y", "(Ljava/util/List;J)V", "Ls6/k0;", "filterConditions", "x", "(Ls6/k0;)V", "Landroidx/paging/PagingData;", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "paging", "s", "(Landroidx/paging/PagingData;Lcom/zykj/student/dialogue/ui/home/p;)Landroidx/paging/PagingData;", "Lcom/zykj/student/dialogue/ui/home/r;", NotificationCompat.CATEGORY_EVENT, "z", "(Lcom/zykj/student/dialogue/ui/home/r;)V", "c", "Lk6/g;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "e", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_pagerEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "f", "Lkotlinx/coroutines/flow/SharedFlow;", "w", "()Lkotlinx/coroutines/flow/SharedFlow;", "pagerEvent", "g", "Ljava/lang/Long;", "u", "()Ljava/lang/Long;", "B", "(Ljava/lang/Long;)V", "h", "modificationEvents", "Lkotlinx/coroutines/flow/Flow;", "i", "Lkotlinx/coroutines/flow/Flow;", "v", "()Lkotlinx/coroutines/flow/Flow;", "getDataFlow$annotations", "dataFlow", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHomePagerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomePagerViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomePagerViewModel\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,192:1\n189#2:193\n*S KotlinDebug\n*F\n+ 1 HomePagerViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomePagerViewModel\n*L\n75#1:193\n*E\n"})
/* loaded from: classes5.dex */
public final class HomePagerViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final MutableStateFlow uiState;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableSharedFlow _pagerEvent;

    /* renamed from: f, reason: from kotlin metadata */
    public final SharedFlow pagerEvent;

    /* renamed from: g, reason: from kotlin metadata */
    public Long catalogId;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableStateFlow modificationEvents;

    /* renamed from: i, reason: from kotlin metadata */
    public final Flow dataFlow;

    /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerViewModel$a */
    public static final class C7580a implements Function0 {

        /* renamed from: b */
        public final /* synthetic */ C9526k0 f11562b;

        /* renamed from: c */
        public final /* synthetic */ long f11563c;

        /* renamed from: com.zykj.student.dialogue.ui.home.HomePagerViewModel$a$a */
        public static final class a implements Function1 {

            /* renamed from: a */
            public final /* synthetic */ HomePagerViewModel f11564a;

            public a(HomePagerViewModel homePagerViewModel) {
                this.f11564a = homePagerViewModel;
            }

            /* renamed from: a */
            public final void m10788a(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f11564a.m9922g(new AbstractC8103b.a.C10073a(throwable));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10788a((Throwable) obj);
                return Unit.INSTANCE;
            }
        }

        public C7580a(C9526k0 c9526k0, long j9) {
            this.f11562b = c9526k0;
            this.f11563c = j9;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PagingSource invoke() {
            return new HomePagingSource(HomePagerViewModel.this.dialogueApi, this.f11562b.m15729o(this.f11563c), new a(HomePagerViewModel.this));
        }
    }

    public HomePagerViewModel(InterfaceC8287g dialogueApi) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        this.dialogueApi = dialogueApi;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C9526k0(null, null, null, null, null, null, null, null, null, 511, null));
        this.uiState = MutableStateFlow;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._pagerEvent = mutableSharedFlowMutableSharedFlow$default;
        this.pagerEvent = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new ArrayList());
        this.modificationEvents = MutableStateFlow2;
        this.dataFlow = FlowKt.flowCombine(CachedPagingDataKt.cachedIn(FlowKt.transformLatest(MutableStateFlow, new HomePagerViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope(this)), MutableStateFlow2, new HomePagerViewModel$dataFlow$2(this, null));
    }

    /* renamed from: A */
    public final void m10778A(AbstractC7636p homePagingEvents) {
        Intrinsics.checkNotNullParameter(homePagingEvents, "homePagingEvents");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomePagerViewModel$onPagingEdit$1(this, homePagingEvents, null), 3, null);
    }

    /* renamed from: B */
    public final void m10779B(Long l9) {
        this.catalogId = l9;
    }

    /* renamed from: s */
    public final PagingData m10780s(PagingData paging, AbstractC7636p homePagingEvents) {
        if (homePagingEvents instanceof AbstractC7636p.b) {
            return PagingDataTransforms__PagingDataTransformsKt.map(paging, new HomePagerViewModel$applyEvents$1(homePagingEvents, null));
        }
        if (homePagingEvents instanceof AbstractC7636p.a) {
            return PagingDataTransforms__PagingDataTransformsKt.filter(paging, new HomePagerViewModel$applyEvents$2(homePagingEvents, null));
        }
        if (homePagingEvents instanceof AbstractC7636p.c) {
            return PagingDataTransforms__PagingDataTransformsKt.map(paging, new HomePagerViewModel$applyEvents$5(homePagingEvents, null));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: t */
    public final void m10781t() {
        this.modificationEvents.setValue(CollectionsKt.emptyList());
    }

    /* renamed from: u, reason: from getter */
    public final Long getCatalogId() {
        return this.catalogId;
    }

    /* renamed from: v, reason: from getter */
    public final Flow getDataFlow() {
        return this.dataFlow;
    }

    /* renamed from: w, reason: from getter */
    public final SharedFlow getPagerEvent() {
        return this.pagerEvent;
    }

    /* renamed from: x */
    public final void m10785x(C9526k0 filterConditions) {
        Intrinsics.checkNotNullParameter(filterConditions, "filterConditions");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomePagerViewModel$initData$1(this, filterConditions, null), 3, null);
    }

    /* renamed from: y */
    public final void m10786y(List ids, long catalogId) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        BaseViewModel.m9917f(this, "移动失败", false, null, null, null, new HomePagerViewModel$moveQuestion$1(this, ids, catalogId, null), 30, null);
    }

    /* renamed from: z */
    public final void m10787z(AbstractC7638r event) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomePagerViewModel$onEvent$1(this, event, null), 3, null);
    }
}
