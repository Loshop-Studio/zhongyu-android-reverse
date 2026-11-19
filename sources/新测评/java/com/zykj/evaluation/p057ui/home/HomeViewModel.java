package com.zykj.evaluation.p057ui.home;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.CachedPagingDataKt;
import com.zykj.evaluation.base.AbstractC6856a;
import com.zykj.evaluation.base.BaseViewModel;
import com.zykj.evaluation.bean.GetTaskListReq;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.home.AbstractC6930c;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.message.server.bean.UserInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p112h7.InterfaceC7632b;
import p178n5.C8632a;
import p178n5.InterfaceC8634b;
import p200p5.InterfaceC8843j;
import p234s6.C9269c1;
import p234s6.C9270d;
import p234s6.C9272d1;
import p245t6.AbstractC9454q0;
import p245t6.C9450o0;
import p245t6.C9452p0;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fH\u0082@¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020&¢\u0006\u0004\b+\u0010)J\u001d\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001b2\b\b\u0002\u00101\u001a\u00020-¢\u0006\u0004\b2\u00100J+\u00108\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u001b2\u0006\u00105\u001a\u0002042\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f06¢\u0006\u0004\b8\u00109J!\u0010=\u001a\u00020\u000f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000f0:¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b?\u0010%J!\u0010B\u001a\u00020\u000f2\b\u0010@\u001a\u0004\u0018\u00010&2\b\u0010A\u001a\u0004\u0018\u00010&¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u000f¢\u0006\u0004\bD\u0010\u0011J\r\u0010E\u001a\u00020\u000f¢\u0006\u0004\bE\u0010\u0011J\r\u0010F\u001a\u00020\u000f¢\u0006\u0004\bF\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR+\u0010X\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u001b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020Y0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010HR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020Y0\\8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020b0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010HR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020b0\\8\u0006¢\u0006\f\n\u0004\be\u0010^\u001a\u0004\bf\u0010`R\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020h0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010HR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR&\u0010p\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010H¨\u0006q"}, m13558d2 = {"Lcom/zykj/evaluation/ui/home/HomeViewModel;", "Lcom/zykj/evaluation/base/BaseViewModel;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfoFlow", "Lp5/j;", NotificationCompat.CATEGORY_SERVICE, "Lh7/b;", "versionApi", "Lcom/zykj/evaluation/di/AppDatabase;", "database", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "submitTaskManger", "<init>", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lh7/b;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V", "", "M", "()V", "Lcom/zykj/evaluation/ui/home/a;", "page", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lt6/o0;", "D", "(Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;", "homeDataInfo", "", "", "Lt6/p0;", "map", "C", "(Lt6/o0;Ljava/util/Map;)Lt6/o0;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zykj/evaluation/ui/home/c;", "filterType", "I", "(Lcom/zykj/evaluation/ui/home/c;)V", "", "newText", ExifInterface.LONGITUDE_EAST, "(Ljava/lang/String;)V", "keyword", "J", "examTaskId", "", "isFavorite", "R", "(JZ)V", "isRead", ExifInterface.LATITUDE_SOUTH, "taskId", "", "taskState", "Lkotlin/Function0;", "failedCallback", "Q", "(JILkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lcom/zykj/evaluation/version/VersionResult;", "needUpdateCallback", "G", "(Lkotlin/jvm/functions/Function1;)V", "F", "start", "end", ExifInterface.LONGITUDE_WEST, "(Ljava/lang/String;Ljava/lang/String;)V", "L", "K", "H", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "d", "Lp5/j;", "e", "Lh7/b;", "f", "Lcom/zykj/evaluation/di/AppDatabase;", "g", "Lcom/zykj/evaluation/submit/SubmitTaskManger;", "<set-?>", "h", "Lkotlin/properties/ReadWriteProperty;", "P", "()J", "U", "(J)V", "_userId", "Lcom/zykj/evaluation/ui/home/HomeViewState;", "i", "_mainUiState", "Lkotlinx/coroutines/flow/StateFlow;", "j", "Lkotlinx/coroutines/flow/StateFlow;", "O", "()Lkotlinx/coroutines/flow/StateFlow;", "mainUiState", "Lcom/zykj/evaluation/ui/home/HomeFilterState;", "k", "_filterUiState", "l", "N", "filterUiState", "Lcom/zykj/evaluation/bean/GetTaskListReq;", "m", "_taskListReq", "Lkotlinx/coroutines/Job;", "n", "Lkotlinx/coroutines/Job;", "databaseFlowJob", "o", "_modificationEvents", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,5:716\n230#2,3:722\n233#2,2:731\n189#3:721\n1563#4:725\n1634#4,2:726\n1869#4,2:728\n1636#4:730\n1869#4:733\n1563#4:734\n1634#4,3:735\n1870#4:738\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel\n*L\n282#1:716,5\n494#1:722,3\n494#1:731,2\n423#1:721\n496#1:725\n496#1:726,2\n506#1:728,2\n496#1:730\n647#1:733\n650#1:734\n650#1:735,3\n647#1:738\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel extends BaseViewModel {

    /* renamed from: p */
    public static final /* synthetic */ KProperty[] f9765p = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(HomeViewModel.class, "_userId", "get_userId()J", 0))};

    /* renamed from: q */
    public static final int f9766q = 8;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableStateFlow userInfoFlow;

    /* renamed from: d, reason: from kotlin metadata */
    public final InterfaceC8843j service;

    /* renamed from: e, reason: from kotlin metadata */
    public final InterfaceC7632b versionApi;

    /* renamed from: f, reason: from kotlin metadata */
    public final AppDatabase database;

    /* renamed from: g, reason: from kotlin metadata */
    public final SubmitTaskManger submitTaskManger;

    /* renamed from: h, reason: from kotlin metadata */
    public final ReadWriteProperty _userId;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableStateFlow _mainUiState;

    /* renamed from: j, reason: from kotlin metadata */
    public final StateFlow mainUiState;

    /* renamed from: k, reason: from kotlin metadata */
    public final MutableStateFlow _filterUiState;

    /* renamed from: l, reason: from kotlin metadata */
    public final StateFlow filterUiState;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableStateFlow _taskListReq;

    /* renamed from: n, reason: from kotlin metadata */
    public Job databaseFlowJob;

    /* renamed from: o, reason: from kotlin metadata */
    public final MutableStateFlow _modificationEvents;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.evaluation.ui.home.HomeViewModel$1 */
    public static final class C69261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f9785a;

        /* renamed from: b */
        public /* synthetic */ Object f9786b;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$1$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        @SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:723\n1563#3:719\n1634#3,3:720\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$1\n*L\n137#1:716,3\n137#1:723,2\n139#1:719\n139#1:720,3\n*E\n"})
        /* renamed from: com.zykj.evaluation.ui.home.HomeViewModel$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f9788a;

            /* renamed from: b */
            public final /* synthetic */ HomeViewModel f9789b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HomeViewModel homeViewModel, Continuation continuation) {
                super(2, continuation);
                this.f9789b = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f9789b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                HomeViewState homeViewState;
                ArrayList arrayList;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f9788a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = this.f9789b._mainUiState;
                HomeViewModel homeViewModel = this.f9789b;
                do {
                    value = mutableStateFlow.getValue();
                    homeViewState = (HomeViewState) value;
                    List<AbstractC6928a> listM10074a = AbstractC6929b.m10074a();
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM10074a, 10));
                    for (AbstractC6928a abstractC6928a : listM10074a) {
                        arrayList.add(new C9269c1(0, abstractC6928a.m10072a(), homeViewModel.m10047D(abstractC6928a)));
                    }
                } while (!mutableStateFlow.compareAndSet(value, HomeViewState.copy$default(homeViewState, null, null, null, arrayList, 7, null)));
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$1$2", m13596f = "HomeViewModel.kt", m13597i = {0}, m13598l = {150}, m13599m = "invokeSuspend", m13600n = {"$this$launch"}, m13601s = {"L$0"})
        /* renamed from: com.zykj.evaluation.ui.home.HomeViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f9790a;

            /* renamed from: b */
            public /* synthetic */ Object f9791b;

            /* renamed from: c */
            public final /* synthetic */ HomeViewModel f9792c;

            @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13558d2 = {"<anonymous>", "", "userInfo", "Lcom/zykj/message/server/bean/UserInfo;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$1$2$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,715:1\n230#2,5:716\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1\n*L\n153#1:716,5\n*E\n"})
            /* renamed from: com.zykj.evaluation.ui.home.HomeViewModel$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<UserInfo, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f9793a;

                /* renamed from: b */
                public /* synthetic */ Object f9794b;

                /* renamed from: c */
                public final /* synthetic */ HomeViewModel f9795c;

                /* renamed from: d */
                public final /* synthetic */ CoroutineScope f9796d;

                @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
                @DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$1$2$1$2", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {163}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                /* renamed from: com.zykj.evaluation.ui.home.HomeViewModel$1$2$1$2, reason: invalid class name and collision with other inner class name */
                public static final class C101352 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* renamed from: a */
                    public int f9797a;

                    /* renamed from: b */
                    public final /* synthetic */ HomeViewModel f9798b;

                    /* renamed from: c */
                    public final /* synthetic */ UserInfo f9799c;

                    @Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m13558d2 = {"", "Ln5/a;", "list", "", "<anonymous>", "(Ljava/util/List;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
                    @DebugMetadata(m13595c = "com.zykj.evaluation.ui.home.HomeViewModel$1$2$1$2$1", m13596f = "HomeViewModel.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
                    @SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,3:716\n233#2,2:721\n1869#3,2:719\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1\n*L\n165#1:716,3\n165#1:721,2\n167#1:719,2\n*E\n"})
                    /* renamed from: com.zykj.evaluation.ui.home.HomeViewModel$1$2$1$2$1, reason: invalid class name and collision with other inner class name */
                    public static final class C101361 extends SuspendLambda implements Function2<List<? extends C8632a>, Continuation<? super Unit>, Object> {

                        /* renamed from: a */
                        public int f9800a;

                        /* renamed from: b */
                        public /* synthetic */ Object f9801b;

                        /* renamed from: c */
                        public final /* synthetic */ HomeViewModel f9802c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C101361(HomeViewModel homeViewModel, Continuation continuation) {
                            super(2, continuation);
                            this.f9802c = homeViewModel;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Object invoke(List list, Continuation continuation) {
                            return ((C101361) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            C101361 c101361 = new C101361(this.f9802c, continuation);
                            c101361.f9801b = obj;
                            return c101361;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                            /*
                                r12 = this;
                                java.lang.Object r0 = r12.f9801b
                                java.util.List r0 = (java.util.List) r0
                                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r1 = r12.f9800a
                                if (r1 != 0) goto L99
                                kotlin.ResultKt.throwOnFailure(r13)
                                com.zykj.evaluation.ui.home.HomeViewModel r13 = r12.f9802c
                                kotlinx.coroutines.flow.MutableStateFlow r13 = com.zykj.evaluation.p057ui.home.HomeViewModel.m10042w(r13)
                            L14:
                                java.lang.Object r1 = r13.getValue()
                                r2 = r1
                                java.util.Map r2 = (java.util.Map) r2
                                java.util.Map r2 = kotlin.collections.MapsKt.toMutableMap(r2)
                                java.util.Iterator r3 = r0.iterator()
                            L23:
                                boolean r4 = r3.hasNext()
                                if (r4 == 0) goto L90
                                java.lang.Object r4 = r3.next()
                                n5.a r4 = (p178n5.C8632a) r4
                                int r5 = r4.m14223d()
                                m5.e$c r6 = p167m5.AbstractC8555e.c.f14191b
                                int r6 = r6.m14097a()
                                if (r5 != r6) goto L3f
                                t6.q0$b$c r5 = p245t6.AbstractC9454q0.b.c.f16511d
                            L3d:
                                r8 = r5
                                goto L5f
                            L3f:
                                m5.e$b r6 = p167m5.AbstractC8555e.b.f14190b
                                int r6 = r6.m14097a()
                                if (r5 != r6) goto L4a
                                t6.q0$b$b r5 = p245t6.AbstractC9454q0.b.C10160b.f16510d
                                goto L3d
                            L4a:
                                m5.e$a r6 = p167m5.AbstractC8555e.a.f14189b
                                int r6 = r6.m14097a()
                                r7 = 0
                                if (r5 != r6) goto L5e
                                boolean r5 = r4.m14225f()
                                if (r5 == 0) goto L5b
                                r5 = r7
                                goto L3d
                            L5b:
                                t6.q0$b$a r5 = p245t6.AbstractC9454q0.b.a.f16509d
                                goto L3d
                            L5e:
                                r8 = r7
                            L5f:
                                long r5 = r4.m14227h()
                                java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
                                long r6 = r4.m14227h()
                                java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
                                java.lang.Object r4 = r2.get(r4)
                                r6 = r4
                                t6.p0 r6 = (p245t6.C9452p0) r6
                                if (r6 == 0) goto L82
                                r10 = 5
                                r11 = 0
                                r7 = 0
                                r9 = 0
                                t6.p0 r4 = p245t6.C9452p0.m15755b(r6, r7, r8, r9, r10, r11)
                                if (r4 != 0) goto L8c
                            L82:
                                t6.p0 r6 = new t6.p0
                                r10 = 5
                                r11 = 0
                                r7 = 0
                                r9 = 0
                                r6.<init>(r7, r8, r9, r10, r11)
                                r4 = r6
                            L8c:
                                r2.put(r5, r4)
                                goto L23
                            L90:
                                boolean r1 = r13.compareAndSet(r1, r2)
                                if (r1 == 0) goto L14
                                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                                return r13
                            L99:
                                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r13.<init>(r0)
                                throw r13
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.home.HomeViewModel.C69261.AnonymousClass2.AnonymousClass1.C101352.C101361.invokeSuspend(java.lang.Object):java.lang.Object"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/home/HomeViewModel$1$2$1$2$1.smali:143
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C101352(HomeViewModel homeViewModel, UserInfo userInfo, Continuation continuation) {
                        super(2, continuation);
                        this.f9798b = homeViewModel;
                        this.f9799c = userInfo;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C101352(this.f9798b, this.f9799c, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return invoke2(coroutineScope, (Continuation) continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i10 = this.f9797a;
                        if (i10 == 0) {
                            ResultKt.throwOnFailure(obj);
                            InterfaceC8634b interfaceC8634bMo8675g = this.f9798b.database.mo8675g();
                            Long lM10602a = this.f9799c.m10602a();
                            Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
                            Flow flowMo8712e = interfaceC8634bMo8675g.mo8712e(lM10602a.longValue());
                            C101361 c101361 = new C101361(this.f9798b, null);
                            this.f9797a = 1;
                            if (FlowKt.collectLatest(flowMo8712e, c101361, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                        return ((C101352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(HomeViewModel homeViewModel, CoroutineScope coroutineScope, Continuation continuation) {
                    super(2, continuation);
                    this.f9795c = homeViewModel;
                    this.f9796d = coroutineScope;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(UserInfo userInfo, Continuation continuation) {
                    return ((AnonymousClass1) create(userInfo, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9795c, this.f9796d, continuation);
                    anonymousClass1.f9794b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object value;
                    String strM10603b;
                    String strM10604c;
                    Job job;
                    UserInfo userInfo = (UserInfo) this.f9794b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f9793a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    HomeViewModel homeViewModel = this.f9795c;
                    Long lM10602a = userInfo.m10602a();
                    Intrinsics.checkNotNullExpressionValue(lM10602a, "getId(...)");
                    homeViewModel.m10063U(lM10602a.longValue());
                    MutableStateFlow mutableStateFlow = this.f9795c._mainUiState;
                    do {
                        value = mutableStateFlow.getValue();
                        strM10603b = userInfo.m10603b();
                        Intrinsics.checkNotNullExpressionValue(strM10603b, "getPhoto(...)");
                        strM10604c = userInfo.m10604c();
                        Intrinsics.checkNotNullExpressionValue(strM10604c, "getRealName(...)");
                    } while (!mutableStateFlow.compareAndSet(value, HomeViewState.copy$default((HomeViewState) value, new C9272d1(strM10603b, strM10604c), null, null, null, 14, null)));
                    Job job2 = this.f9795c.databaseFlowJob;
                    if (job2 != null && job2.isActive() && (job = this.f9795c.databaseFlowJob) != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    HomeViewModel homeViewModel2 = this.f9795c;
                    homeViewModel2.databaseFlowJob = BuildersKt__Builders_commonKt.launch$default(this.f9796d, null, null, new C101352(homeViewModel2, userInfo, null), 3, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HomeViewModel homeViewModel, Continuation continuation) {
                super(2, continuation);
                this.f9792c = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f9792c, continuation);
                anonymousClass2.f9791b = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineScope coroutineScope = (CoroutineScope) this.f9791b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f9790a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow mutableStateFlow = this.f9792c.userInfoFlow;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f9792c, coroutineScope, null);
                    this.f9791b = SpillingKt.nullOutSpilledVariable(coroutineScope);
                    this.f9790a = 1;
                    if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C69261(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C69261 c69261 = HomeViewModel.this.new C69261(continuation);
            c69261.f9786b = obj;
            return c69261;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f9786b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f9785a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(HomeViewModel.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(HomeViewModel.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C69261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HomeViewModel(MutableStateFlow userInfoFlow, InterfaceC8843j service, InterfaceC7632b versionApi, AppDatabase database, SubmitTaskManger submitTaskManger) {
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(versionApi, "versionApi");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(submitTaskManger, "submitTaskManger");
        this.userInfoFlow = userInfoFlow;
        this.service = service;
        this.versionApi = versionApi;
        this.database = database;
        this.submitTaskManger = submitTaskManger;
        this._userId = Delegates.INSTANCE.notNull();
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new HomeViewState(null, null, null, null, 15, null));
        this._mainUiState = MutableStateFlow;
        this.mainUiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new HomeFilterState(null, 1, null));
        this._filterUiState = MutableStateFlow2;
        this.filterUiState = FlowKt.asStateFlow(MutableStateFlow2);
        this._taskListReq = StateFlowKt.MutableStateFlow(new GetTaskListReq(0, 0, 0, null, null, null, null, null, null, null, 1023, null));
        this._modificationEvents = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        m10056M();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C69261(null), 3, null);
    }

    /* renamed from: T */
    public static /* synthetic */ void m10031T(HomeViewModel homeViewModel, long j10, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z9 = true;
        }
        homeViewModel.m10062S(j10, z9);
    }

    /* renamed from: C */
    public final C9450o0 m10046C(C9450o0 homeDataInfo, Map map) {
        C9452p0 c9452p0 = (C9452p0) map.get(Long.valueOf(homeDataInfo.m15738f()));
        if (c9452p0 != null) {
            Boolean boolM15758d = c9452p0.m15758d();
            boolean zBooleanValue = boolM15758d != null ? boolM15758d.booleanValue() : homeDataInfo.m15747o();
            AbstractC9454q0 abstractC9454q0M15757c = c9452p0.m15757c();
            if (abstractC9454q0M15757c == null) {
                abstractC9454q0M15757c = homeDataInfo.m15737e();
            }
            AbstractC9454q0 abstractC9454q0 = abstractC9454q0M15757c;
            Boolean boolM15759e = c9452p0.m15759e();
            C9450o0 c9450o0M15733b = C9450o0.m15733b(homeDataInfo, 0L, null, null, false, false, false, 0, null, zBooleanValue, abstractC9454q0, boolM15759e != null ? boolM15759e.booleanValue() : homeDataInfo.m15754v(), false, false, false, 0, false, false, 0, null, 0L, 0, 2095359, null);
            if (c9450o0M15733b != null) {
                return c9450o0M15733b;
            }
        }
        return homeDataInfo;
    }

    /* renamed from: D */
    public final Flow m10047D(AbstractC6928a page) {
        return CachedPagingDataKt.cachedIn(FlowKt.flowCombine(CachedPagingDataKt.cachedIn(FlowKt.transformLatest(this._taskListReq, new HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1(null, this, page)), ViewModelKt.getViewModelScope(this)), this._modificationEvents, new HomeViewModel$buildDataInfo$2(this, null)), ViewModelKt.getViewModelScope(this));
    }

    /* renamed from: E */
    public final void m10048E(String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        MutableStateFlow mutableStateFlow = this._mainUiState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            String str = newText;
            if (mutableStateFlow.compareAndSet(value, HomeViewState.copy$default((HomeViewState) value, null, null, str, null, 11, null))) {
                return;
            } else {
                newText = str;
            }
        }
    }

    /* renamed from: F */
    public final void m10049F(AbstractC6930c filterType) {
        Object value;
        HomeFilterState homeFilterState;
        ArrayList arrayList;
        List listListOf;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        MutableStateFlow mutableStateFlow = this._filterUiState;
        do {
            value = mutableStateFlow.getValue();
            homeFilterState = (HomeFilterState) value;
            List<C9270d> filterDataList = homeFilterState.getFilterDataList();
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterDataList, 10));
            for (C9270d c9270dM15534b : filterDataList) {
                if (c9270dM15534b.m15537d().contains(filterType)) {
                    if (c9270dM15534b.m15540g() instanceof AbstractC6930c.d) {
                        AbstractC6930c.d.a aVar = AbstractC6930c.d.a.f9897d;
                        if (Intrinsics.areEqual(filterType, aVar)) {
                            listListOf = CollectionsKt.listOf(aVar);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            boolean z9 = false;
                            for (AbstractC6930c abstractC6930c : c9270dM15534b.m15536c()) {
                                if (!Intrinsics.areEqual(abstractC6930c, AbstractC6930c.d.a.f9897d)) {
                                    if (Intrinsics.areEqual(abstractC6930c, filterType)) {
                                        z9 = true;
                                    } else {
                                        arrayList2.add(abstractC6930c);
                                    }
                                }
                            }
                            if (!z9) {
                                arrayList2.add(filterType);
                            }
                            Unit unit = Unit.INSTANCE;
                            listListOf = arrayList2;
                        }
                    } else {
                        listListOf = CollectionsKt.listOf(filterType);
                    }
                    c9270dM15534b = C9270d.m15534b(c9270dM15534b, null, null, listListOf, 3, null);
                }
                arrayList.add(c9270dM15534b);
            }
        } while (!mutableStateFlow.compareAndSet(value, homeFilterState.copy(arrayList)));
    }

    /* renamed from: G */
    public final void m10050G(Function1 needUpdateCallback) {
        Intrinsics.checkNotNullParameter(needUpdateCallback, "needUpdateCallback");
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$checkVersion$1(this, needUpdateCallback, null), 29, null);
    }

    /* renamed from: H */
    public final void m10051H() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$cleanEventsOnRefresh$1(this, null), 3, null);
    }

    /* renamed from: I */
    public final void m10052I(AbstractC6930c filterType) {
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$clearFilterType$1(filterType, this, null), 29, null);
    }

    /* renamed from: J */
    public final void m10053J(String keyword) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$confirmSearchText$1(keyword, this, null), 29, null);
    }

    /* renamed from: K */
    public final void m10054K() {
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$filterConfirm$1(this, null), 29, null);
    }

    /* renamed from: L */
    public final void m10055L() {
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$filterReset$1(this, null), 29, null);
    }

    /* renamed from: M */
    public final void m10056M() {
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$getFilterList$1(this, null), 29, null);
    }

    /* renamed from: N, reason: from getter */
    public final StateFlow getFilterUiState() {
        return this.filterUiState;
    }

    /* renamed from: O, reason: from getter */
    public final StateFlow getMainUiState() {
        return this.mainUiState;
    }

    /* renamed from: P */
    public final long m10059P() {
        return ((Number) this._userId.getValue(this, f9765p[0])).longValue();
    }

    /* renamed from: Q */
    public final void m10060Q(long taskId, int taskState, Function0 failedCallback) {
        Intrinsics.checkNotNullParameter(failedCallback, "failedCallback");
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$recommitFailedData$1(this, taskId, taskState, failedCallback, null), 29, null);
    }

    /* renamed from: R */
    public final void m10061R(long examTaskId, boolean isFavorite) {
        BaseViewModel.m8644f(this, null, null, null, null, null, new HomeViewModel$setFavorite$1(this, examTaskId, isFavorite, null), 31, null);
    }

    /* renamed from: S */
    public final void m10062S(long examTaskId, boolean isRead) {
        BaseViewModel.m8644f(this, null, null, null, null, null, new HomeViewModel$setRead$1(this, examTaskId, isRead, null), 31, null);
    }

    /* renamed from: U */
    public final void m10063U(long j10) {
        this._userId.setValue(this, f9765p[0], Long.valueOf(j10));
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.util.ArrayList, java.util.Collection] */
    /* renamed from: V */
    public final Object m10064V(Continuation continuation) {
        HomeFilterState homeFilterState = (HomeFilterState) this.filterUiState.getValue();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Long lM10077b = null;
        Integer numM10076b = null;
        Integer numM10078b = null;
        String str = null;
        String strM10080b = null;
        for (C9270d c9270d : homeFilterState.getFilterDataList()) {
            if (!c9270d.m15536c().contains(CollectionsKt.first(c9270d.m15537d()))) {
                AbstractC6930c abstractC6930cM15540g = c9270d.m15540g();
                if (abstractC6930cM15540g instanceof AbstractC6930c.d) {
                    List<AbstractC6930c> listM15536c = c9270d.m15536c();
                    ?? arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM15536c, 10));
                    for (AbstractC6930c abstractC6930c : listM15536c) {
                        Intrinsics.checkNotNull(abstractC6930c, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.Subject");
                        arrayList.add(Boxing.boxLong(((AbstractC6930c.d) abstractC6930c).m10079b()));
                    }
                    objectRef.element = arrayList;
                } else if (abstractC6930cM15540g instanceof AbstractC6930c.b) {
                    Object objFirst = CollectionsKt.first((List<? extends Object>) c9270d.m15536c());
                    Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.Grade");
                    lM10077b = ((AbstractC6930c.b) objFirst).m10077b();
                } else if (abstractC6930cM15540g instanceof AbstractC6930c.a) {
                    Object objFirst2 = CollectionsKt.first((List<? extends Object>) c9270d.m15536c());
                    Intrinsics.checkNotNull(objFirst2, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.EvaluationType");
                    numM10076b = ((AbstractC6930c.a) objFirst2).m10076b();
                } else if (abstractC6930cM15540g instanceof AbstractC6930c.c) {
                    Object objFirst3 = CollectionsKt.first((List<? extends Object>) c9270d.m15536c());
                    Intrinsics.checkNotNull(objFirst3, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.OverdueType");
                    numM10078b = ((AbstractC6930c.c) objFirst3).m10078b();
                } else {
                    if (!(abstractC6930cM15540g instanceof AbstractC6930c.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objFirst4 = CollectionsKt.first((List<? extends Object>) c9270d.m15536c());
                    Intrinsics.checkNotNull(objFirst4, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.Time");
                    AbstractC6930c.e eVar = (AbstractC6930c.e) objFirst4;
                    String strM10081c = eVar.m10081c();
                    strM10080b = eVar.m10080b();
                    str = strM10081c;
                }
            }
        }
        Object objEmit = this._taskListReq.emit(new GetTaskListReq(0, 0, 0, (List) objectRef.element, lM10077b, numM10076b, numM10078b, str, strM10080b, null, 519, null), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
    }

    /* renamed from: W */
    public final void m10065W(String start, String end) {
        BaseViewModel.m8644f(this, null, AbstractC6856a.a.f8697c, null, null, null, new HomeViewModel$updateCustomTime$1(this, start, end, null), 29, null);
    }
}
