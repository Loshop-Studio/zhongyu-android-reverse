package com.zykj.student.dialogue.p076ui.home;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import android.app.Application;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.ViewModelKt;
import com.zykj.http.bean.HeaderBean;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.student.dialogue.base.BaseViewModel;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p138i6.AbstractC8136b;
import p158k6.InterfaceC8287g;
import p244s6.C9526k0;
import p244s6.C9530l0;
import p244s6.C9560s2;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\r¢\u0006\u0004\b!\u0010\u0011J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\r¢\u0006\u0004\b\"\u0010\u0011J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\u000f¢\u0006\u0004\b,\u0010\u0013J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020\r¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\u000f¢\u0006\u0004\b9\u0010\u0013J6\u0010?\u001a\u00020\u000f2'\b\u0002\u0010>\u001a!\u0012\u0015\u0012\u0013\u0018\u00010-¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u000f\u0018\u00010:¢\u0006\u0004\b?\u0010@J&\u0010D\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020-2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u000f0BH\u0086@¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020-H\u0086@¢\u0006\u0004\bF\u0010GJ4\u0010H\u001a\u00020\u000f2%\b\u0002\u0010>\u001a\u001f\u0012\u0013\u0012\u00110-¢\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00020\u000f\u0018\u00010:¢\u0006\u0004\bH\u0010@J+\u0010L\u001a\b\u0012\u0004\u0012\u0002010I2\f\u0010J\u001a\b\u0012\u0004\u0012\u0002010I2\u0006\u0010K\u001a\u000201H\u0002¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010UR\u001d\u0010b\u001a\b\u0012\u0004\u0012\u00020Z0]8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u001a\u0010e\u001a\b\u0012\u0004\u0012\u00020c0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010UR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020c0]8\u0006¢\u0006\f\n\u0004\bf\u0010_\u001a\u0004\bg\u0010aR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020#0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020#0m8\u0006¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010qR\u001c\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010kR\u001f\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0m8\u0006¢\u0006\f\n\u0004\bv\u0010o\u001a\u0004\bw\u0010qR!\u0010~\u001a\b\u0012\u0004\u0012\u00020-0y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}¨\u0006\u007f"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "Lcom/zykj/student/dialogue/base/BaseViewModel;", "Lk6/g;", "dialogueApi", "Lcom/zykj/http/bean/HeaderLiveData;", "headerLiveData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/message/server/bean/UserInfo;", "userInfoFlow", "Landroid/app/Application;", "application", "<init>", "(Lk6/g;Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Landroid/app/Application;)V", "", "baseUrl", "", "w", "(Ljava/lang/String;)V", "z", "()V", "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;", "catalogResp", "v", "(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V", "Ls6/l0;", "filterUiState", ExifInterface.LATITUDE_SOUTH, "(Ls6/l0;)V", "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;", "sortType", ExifInterface.LONGITUDE_WEST, "(Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)V", "text", "M", "L", "Lcom/zykj/student/dialogue/ui/home/b;", NotificationCompat.CATEGORY_EVENT, "K", "(Lcom/zykj/student/dialogue/ui/home/b;)V", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;", "questionResp", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;)V", "N", "x", "", "isShown", "U", "(Z)V", "", "catalogId", "R", "(Ljava/lang/Long;)V", "userName", "avatar", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/String;Ljava/lang/String;)V", "O", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "available", "callback", "H", "(Lkotlin/jvm/functions/Function1;)V", "isAvailable", "Lkotlin/Function0;", "showDialog", "G", "(ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "P", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "J", "", "editList", "id", "Q", "(Ljava/util/List;J)Ljava/util/List;", "c", "Lk6/g;", "d", "Lcom/zykj/http/bean/HeaderLiveData;", "C", "()Lcom/zykj/http/bean/HeaderLiveData;", "e", "Lkotlinx/coroutines/flow/MutableStateFlow;", "F", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "f", "Landroid/app/Application;", "Ls6/k0;", "g", "_filterConditions", "Lkotlinx/coroutines/flow/StateFlow;", "h", "Lkotlinx/coroutines/flow/StateFlow;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lkotlinx/coroutines/flow/StateFlow;", "filterConditions", "Ls6/s2;", "i", "_homeUiState", "j", ExifInterface.LONGITUDE_EAST, "homeUiState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "k", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_homeEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "l", "Lkotlinx/coroutines/flow/SharedFlow;", "D", "()Lkotlinx/coroutines/flow/SharedFlow;", "homeEvent", "Lcom/zykj/student/dialogue/bean/resp/VersionResult;", "m", "_hasNewVersion", "n", "B", "hasNewVersion", "Landroidx/datastore/preferences/core/Preferences$Key;", "o", "Lkotlin/Lazy;", "y", "()Landroidx/datastore/preferences/core/Preferences$Key;", "cameraPermissionKey", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,509:1\n230#2,5:510\n49#3:515\n51#3:519\n46#4:516\n51#4:518\n105#5:517\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel\n*L\n305#1:510,5\n364#1:515\n364#1:519\n364#1:516\n364#1:518\n364#1:517\n*E\n"})
/* loaded from: classes5.dex */
public final class HomeViewModel extends BaseViewModel {

    /* renamed from: c, reason: from kotlin metadata */
    public final InterfaceC8287g dialogueApi;

    /* renamed from: d, reason: from kotlin metadata */
    public final HeaderLiveData headerLiveData;

    /* renamed from: e, reason: from kotlin metadata */
    public final MutableStateFlow userInfoFlow;

    /* renamed from: f, reason: from kotlin metadata */
    public final Application application;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableStateFlow _filterConditions;

    /* renamed from: h, reason: from kotlin metadata */
    public final StateFlow filterConditions;

    /* renamed from: i, reason: from kotlin metadata */
    public final MutableStateFlow _homeUiState;

    /* renamed from: j, reason: from kotlin metadata */
    public final StateFlow homeUiState;

    /* renamed from: k, reason: from kotlin metadata */
    public final MutableSharedFlow _homeEvent;

    /* renamed from: l, reason: from kotlin metadata */
    public final SharedFlow homeEvent;

    /* renamed from: m, reason: from kotlin metadata */
    public final MutableSharedFlow _hasNewVersion;

    /* renamed from: n, reason: from kotlin metadata */
    public final SharedFlow hasNewVersion;

    /* renamed from: o, reason: from kotlin metadata */
    public final Lazy cameraPermissionKey;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$1", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {88}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    @SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,509:1\n24#2:510\n26#2:514\n46#3:511\n51#3:513\n105#4:512\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel$1\n*L\n86#1:510\n86#1:514\n86#1:511\n86#1:513\n86#1:512\n*E\n"})
    /* renamed from: com.zykj.student.dialogue.ui.home.HomeViewModel$1 */
    public static final class C75881 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11643a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/http/bean/HeaderBean;", "kotlin.jvm.PlatformType"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$1$3", m13451f = "HomeViewModel.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.home.HomeViewModel$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<HeaderBean, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11645a;

            /* renamed from: b */
            public final /* synthetic */ HomeViewModel f11646b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(HomeViewModel homeViewModel, Continuation continuation) {
                super(2, continuation);
                this.f11646b = homeViewModel;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(HeaderBean headerBean, Continuation continuation) {
                return ((AnonymousClass3) create(headerBean, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f11646b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f11645a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.f11646b.m10877z();
                HomeViewModel.m10841I(this.f11646b, null, 1, null);
                return Unit.INSTANCE;
            }
        }

        public C75881(Continuation continuation) {
            super(2, continuation);
        }

        /* renamed from: c */
        public static final String m10879c(HeaderBean headerBean) {
            return headerBean.getServerUrl();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HomeViewModel.this.new C75881(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f11643a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowAsFlow = FlowLiveDataConversions.asFlow(HomeViewModel.this.getHeaderLiveData());
                Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(new Flow() { // from class: com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1

                    /* renamed from: com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2 */
                    public static final class C75862 implements FlowCollector {

                        /* renamed from: a */
                        public final /* synthetic */ FlowCollector f11622a;

                        @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2", m13451f = "HomeViewModel.kt", m13452i = {0, 0, 0, 0, 0}, m13453l = {50}, m13454m = "emit", m13455n = {"value", "$completion", "value", "$this$filterNot_u24lambda_u241", "$i$a$-unsafeTransform-FlowKt__TransformKt$filterNot$1"}, m13456s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                        /* renamed from: com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {

                            /* renamed from: a */
                            public /* synthetic */ Object f11623a;

                            /* renamed from: b */
                            public int f11624b;

                            /* renamed from: c */
                            public Object f11625c;

                            /* renamed from: d */
                            public Object f11626d;

                            /* renamed from: f */
                            public Object f11628f;

                            /* renamed from: g */
                            public Object f11629g;

                            /* renamed from: h */
                            public int f11630h;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.f11623a = obj;
                                this.f11624b |= Integer.MIN_VALUE;
                                return C75862.this.emit(null, this);
                            }
                        }

                        public C75862(FlowCollector flowCollector) {
                            this.f11622a = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.zykj.student.dialogue.p076ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1.C75862.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1 r0 = (com.zykj.student.dialogue.p076ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1.C75862.AnonymousClass1) r0
                                int r1 = r0.f11624b
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f11624b = r1
                                goto L18
                            L13:
                                com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1 r0 = new com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f11623a
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f11624b
                                r3 = 1
                                if (r2 == 0) goto L39
                                if (r2 != r3) goto L31
                                java.lang.Object r5 = r0.f11629g
                                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                                java.lang.Object r5 = r0.f11626d
                                com.zykj.student.dialogue.ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2$1 r5 = (com.zykj.student.dialogue.p076ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1.C75862.AnonymousClass1) r5
                                kotlin.ResultKt.throwOnFailure(r6)
                                goto L6c
                            L31:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L39:
                                kotlin.ResultKt.throwOnFailure(r6)
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.f11622a
                                r2 = r5
                                com.zykj.http.bean.HeaderBean r2 = (com.zykj.http.bean.HeaderBean) r2
                                java.lang.String r2 = r2.getServerUrl()
                                if (r2 != 0) goto L48
                                goto L6c
                            L48:
                                java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                                r0.f11625c = r2
                                java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                                r0.f11626d = r2
                                java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
                                r0.f11628f = r2
                                java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
                                r0.f11629g = r2
                                r2 = 0
                                r0.f11630h = r2
                                r0.f11624b = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L6c
                                return r1
                            L6c:
                                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.HomeViewModel$1$invokeSuspend$$inlined$filterNot$1.C75862.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomeViewModel$1$invokeSuspend$$inlined$filterNot$1$2.smali:37
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flowAsFlow.collect(new C75862(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                }, new Function1() { // from class: com.zykj.student.dialogue.ui.home.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HomeViewModel.C75881.m10879c((HeaderBean) obj2);
                    }
                });
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(HomeViewModel.this, null);
                this.f11643a = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75881) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HomeViewModel(InterfaceC8287g dialogueApi, HeaderLiveData headerLiveData, MutableStateFlow userInfoFlow, Application application) {
        Intrinsics.checkNotNullParameter(dialogueApi, "dialogueApi");
        Intrinsics.checkNotNullParameter(headerLiveData, "headerLiveData");
        Intrinsics.checkNotNullParameter(userInfoFlow, "userInfoFlow");
        Intrinsics.checkNotNullParameter(application, "application");
        this.dialogueApi = dialogueApi;
        this.headerLiveData = headerLiveData;
        this.userInfoFlow = userInfoFlow;
        this.application = application;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C9526k0(null, null, null, null, null, null, null, null, null, 511, null));
        this._filterConditions = MutableStateFlow;
        this.filterConditions = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(new C9560s2(null, null, null, false, null, false, null, null, 255, null));
        this._homeUiState = MutableStateFlow2;
        this.homeUiState = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._homeEvent = mutableSharedFlowMutableSharedFlow$default;
        this.homeEvent = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._hasNewVersion = mutableSharedFlowMutableSharedFlow$default2;
        this.hasNewVersion = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C75881(null), 3, null);
        this.cameraPermissionKey = LazyKt.lazy(new Function0() { // from class: s6.t2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeViewModel.m10850u();
            }
        });
    }

    /* renamed from: I */
    public static /* synthetic */ void m10841I(HomeViewModel homeViewModel, Function1 function1, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            function1 = null;
        }
        homeViewModel.m10858H(function1);
    }

    /* renamed from: u */
    public static final Preferences.Key m10850u() {
        return PreferencesKeys.booleanKey("camera_permission");
    }

    /* renamed from: A, reason: from getter */
    public final StateFlow getFilterConditions() {
        return this.filterConditions;
    }

    /* renamed from: B, reason: from getter */
    public final SharedFlow getHasNewVersion() {
        return this.hasNewVersion;
    }

    /* renamed from: C, reason: from getter */
    public final HeaderLiveData getHeaderLiveData() {
        return this.headerLiveData;
    }

    /* renamed from: D, reason: from getter */
    public final SharedFlow getHomeEvent() {
        return this.homeEvent;
    }

    /* renamed from: E, reason: from getter */
    public final StateFlow getHomeUiState() {
        return this.homeUiState;
    }

    /* renamed from: F, reason: from getter */
    public final MutableStateFlow getUserInfoFlow() {
        return this.userInfoFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m10857G(boolean r6, kotlin.jvm.functions.Function0 r7, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.zykj.student.dialogue.p076ui.home.HomeViewModel$handleWaning$1
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.student.dialogue.ui.home.HomeViewModel$handleWaning$1 r0 = (com.zykj.student.dialogue.p076ui.home.HomeViewModel$handleWaning$1) r0
            int r1 = r0.f11675f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11675f = r1
            goto L18
        L13:
            com.zykj.student.dialogue.ui.home.HomeViewModel$handleWaning$1 r0 = new com.zykj.student.dialogue.ui.home.HomeViewModel$handleWaning$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f11673d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f11675f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f11672c
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Object r6 = r0.f11671b
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            kotlin.ResultKt.throwOnFailure(r8)
            goto L87
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            boolean r6 = r0.f11670a
            java.lang.Object r7 = r0.f11671b
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L65
        L46:
            kotlin.ResultKt.throwOnFailure(r8)
            android.app.Application r8 = r5.application
            androidx.datastore.core.DataStore r8 = p138i6.AbstractC8136b.m13035c(r8)
            kotlinx.coroutines.flow.Flow r8 = r8.getData()
            com.zykj.student.dialogue.ui.home.HomeViewModel$handleWaning$$inlined$map$1 r2 = new com.zykj.student.dialogue.ui.home.HomeViewModel$handleWaning$$inlined$map$1
            r2.<init>()
            r0.f11671b = r7
            r0.f11670a = r6
            r0.f11675f = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r2, r0)
            if (r8 != r1) goto L65
            goto L85
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L8a
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r8)
            if (r2 != 0) goto L8a
            r0.f11671b = r7
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.f11672c = r8
            r0.f11670a = r6
            r0.f11675f = r3
            java.lang.Object r6 = r5.m10865P(r6, r0)
            if (r6 != r1) goto L86
        L85:
            return r1
        L86:
            r6 = r7
        L87:
            r6.invoke()
        L8a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.HomeViewModel.m10857G(boolean, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomeViewModel.smali:717
    }

    /* renamed from: H */
    public final void m10858H(Function1 callback) {
        BaseViewModel.m9917f(this, null, false, null, null, new HomeViewModel$isCameraAvailable$1(callback, null), new HomeViewModel$isCameraAvailable$2(this, callback, null), 15, null);
    }

    /* renamed from: J */
    public final void m10859J(Function1 callback) {
        BaseViewModel.m9917f(this, null, false, null, null, new HomeViewModel$isCameraSystemSettingAvailable$1(null), new HomeViewModel$isCameraSystemSettingAvailable$2(this, callback, null), 15, null);
    }

    /* renamed from: K */
    public final void m10860K(AbstractC7594b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$onEvent$1(this, event, null), 3, null);
    }

    /* renamed from: L */
    public final void m10861L(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$onSearch$1(text, this, null), 3, null);
    }

    /* renamed from: M */
    public final void m10862M(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$onTextChanged$1(this, text, null), 3, null);
    }

    /* renamed from: N */
    public final void m10863N(QuestionResp questionResp) {
        Intrinsics.checkNotNullParameter(questionResp, "questionResp");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$openEditMode$1(this, questionResp, null), 3, null);
    }

    /* renamed from: O */
    public final void m10864O() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$resetAllFilterConditions$1(this, null), 3, null);
    }

    /* renamed from: P */
    public final Object m10865P(boolean z9, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(AbstractC8136b.m13035c(this.application), new HomeViewModel$saveCameraPermission$2(this, z9, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* renamed from: Q */
    public final List m10866Q(List editList, long id) {
        return editList.contains(Long.valueOf(id)) ? CollectionsKt.minus(editList, Long.valueOf(id)) : CollectionsKt.plus((Collection<? extends Long>) editList, Long.valueOf(id));
    }

    /* renamed from: R */
    public final void m10867R(Long catalogId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$updateCatalogUnreadCount$1(catalogId, this, null), 3, null);
    }

    /* renamed from: S */
    public final void m10868S(C9530l0 filterUiState) {
        Intrinsics.checkNotNullParameter(filterUiState, "filterUiState");
        MutableStateFlow mutableStateFlow = this._filterConditions;
        mutableStateFlow.setValue(C9526k0.m15715b((C9526k0) mutableStateFlow.getValue(), filterUiState.m15739j(), filterUiState.m15737h(), filterUiState.m15734e(), filterUiState.m15736g(), filterUiState.m15733d(), filterUiState.m15738i(), filterUiState.m15732c(), filterUiState.m15735f(), null, 256, null));
    }

    /* renamed from: T */
    public final void m10869T(String userName, String avatar) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$updateNameAndAvatar$1(this, userName, avatar, null), 3, null);
    }

    /* renamed from: U */
    public final void m10870U(boolean isShown) {
        MutableStateFlow mutableStateFlow = this._homeUiState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            boolean z9 = isShown;
            if (mutableStateFlow.compareAndSet(value, C9560s2.m15748b((C9560s2) value, null, null, null, false, null, z9, null, null, 223, null))) {
                return;
            } else {
                isShown = z9;
            }
        }
    }

    /* renamed from: V */
    public final void m10871V(QuestionResp questionResp) {
        Intrinsics.checkNotNullParameter(questionResp, "questionResp");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$updateSelectedState$1(this, questionResp, null), 3, null);
    }

    /* renamed from: W */
    public final void m10872W(FilterType.Sort sortType) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$updateSortTypeCondition$1(this, sortType, null), 3, null);
    }

    /* renamed from: v */
    public final void m10873v(CatalogResp catalogResp) {
        Intrinsics.checkNotNullParameter(catalogResp, "catalogResp");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$catalogSwitch$1(catalogResp, this, null), 3, null);
    }

    /* renamed from: w */
    public final void m10874w(String baseUrl) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$checkVersion$1(baseUrl, this, null), 3, null);
    }

    /* renamed from: x */
    public final void m10875x() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$closeEditMode$1(this, null), 3, null);
    }

    /* renamed from: y */
    public final Preferences.Key m10876y() {
        return (Preferences.Key) this.cameraPermissionKey.getValue();
    }

    /* renamed from: z */
    public final void m10877z() {
        BaseViewModel.m9917f(this, null, false, null, null, new HomeViewModel$getCategories$1(this, null), new HomeViewModel$getCategories$2(this, null), 15, null);
    }
}
