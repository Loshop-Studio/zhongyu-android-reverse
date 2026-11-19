package com.zykj.huiwei.launcher.viewmodels;

// RE note 本类字节码直接引用的读写或显示接口包括DataStore。

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.datastore.core.DataStore;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelKt;
import com.zykj.base.BaseViewModel;
import com.zykj.huiwei.launcher.bean.resp.WeatherBean;
import com.zykj.huiwei.launcher.bean.resp.WeatherCityBean;
import com.zykj.huiwei.launcher.ext.ViewModelExtKt;
import com.zykj.huiwei.launcher.repository.HomeRepository;
import com.zykj.huiwei.launcher.repository.NotificationRepository;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p078i4.AbstractC6537g;
import p078i4.C6545o;
import p177w3.C7812b;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u0016J\r\u0010\u001f\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010\u0016J\r\u0010 \u001a\u00020\u0014¢\u0006\u0004\b \u0010\u0016J\r\u0010!\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\u0016J\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b*\u0010+R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R!\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u00103R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0006¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u00103R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0007058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00108R\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070/8\u0006¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\bF\u00103R#\u0010L\u001a\b\u0012\u0004\u0012\u00020H0/8\u0006¢\u0006\u0012\n\u0004\bI\u0010;\u0012\u0004\bK\u0010\u0016\u001a\u0004\bJ\u00103R\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020\t0/8\u0006¢\u0006\f\n\u0004\bM\u0010;\u001a\u0004\bN\u00103R\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020P058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u00108R\u001d\u0010U\u001a\b\u0012\u0004\u0012\u00020P0/8\u0006¢\u0006\f\n\u0004\bS\u0010;\u001a\u0004\bT\u00103R\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020V058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u00108R\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020V0/8\u0006¢\u0006\f\n\u0004\bY\u0010;\u001a\u0004\bZ\u00103R \u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\\058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u00108R#\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\\0/8\u0006¢\u0006\f\n\u0004\b`\u0010;\u001a\u0004\ba\u00103R\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u0018058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u00108R\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0006¢\u0006\f\n\u0004\b!\u0010;\u001a\u0004\be\u00103R\u001a\u0010i\u001a\b\u0012\u0004\u0012\u0002060g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010hR\u001d\u0010n\u001a\b\u0012\u0004\u0012\u0002060j8\u0006¢\u0006\f\n\u0004\b\u001f\u0010k\u001a\u0004\bl\u0010mR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020o0/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020V0/8\u0006¢\u0006\f\n\u0004\bl\u0010;\u001a\u0004\bq\u00103R\u001f\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0/8\u0006¢\u0006\f\n\u0004\bT\u0010;\u001a\u0004\bt\u00103R\u001f\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0/8\u0006¢\u0006\f\n\u0004\b \u0010;\u001a\u0004\bv\u00103R\u001f\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0/8\u0006¢\u0006\f\n\u0004\bF\u0010;\u001a\u0004\bx\u00103R\u001a\u0010z\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u00108R\u001d\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0006¢\u0006\f\n\u0004\b{\u0010;\u001a\u0004\b{\u00103R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00108R\u001d\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00180/8\u0006¢\u0006\f\n\u0004\b~\u0010;\u001a\u0004\b~\u00103¨\u0006\u0080\u0001"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;", "Lcom/zykj/base/BaseViewModel;", "Lcom/zykj/huiwei/launcher/repository/HomeRepository;", "homeRepository", "Lcom/zykj/huiwei/launcher/repository/NotificationRepository;", "notificationRepository", "Landroidx/datastore/core/DataStore;", "Lcom/zykj/huiwei/launcher/proto/g;", "studentDataStore", "Lcom/zykj/huiwei/launcher/proto/m;", "userDataStore", "Lcom/zykj/huiwei/launcher/proto/a;", "serverDataStore", "Lw3/b;", "gatewayRepository", "<init>", "(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Lcom/zykj/huiwei/launcher/repository/NotificationRepository;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lw3/b;)V", "Lcom/zykj/huiwei/launcher/bean/Location;", "z", "()Lcom/zykj/huiwei/launcher/bean/Location;", "", "X", "()V", "P", "", "O", "()Ljava/lang/String;", "city", ExifInterface.LONGITUDE_WEST, "(Ljava/lang/String;)V", "I", "y", "C", "w", "x", "a", "Lcom/zykj/huiwei/launcher/repository/HomeRepository;", "b", "Lcom/zykj/huiwei/launcher/repository/NotificationRepository;", "c", "Landroidx/datastore/core/DataStore;", "d", "getUserDataStore", "()Landroidx/datastore/core/DataStore;", "e", "f", "Lw3/b;", "Landroidx/lifecycle/LiveData;", "g", "Lkotlin/Lazy;", "M", "()Landroidx/lifecycle/LiveData;", "versionName", "Landroidx/lifecycle/MutableLiveData;", "", "h", "Landroidx/lifecycle/MutableLiveData;", "_unReadMessageCount", "i", "Landroidx/lifecycle/LiveData;", "J", "unReadMessageCount", "j", "_unReadNoticeCount", "k", "K", "unReadNoticeCount", "l", "_studentInfo", "m", "D", "studentInfo", "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;", "n", "G", "getTodoResp$annotations", "todoResp", "o", "L", "userCacheBean", "Lcom/zykj/huiwei/launcher/bean/HomeTime;", "p", "_showHomeTime", "q", "B", "showHomeTime", "", "r", "_isMsgDotVisible", "s", ExifInterface.GPS_DIRECTION_TRUE, "isMsgDotVisible", "", "Lcom/zykj/huiwei/launcher/bean/TaskInfo;", "t", "_todoItems", "u", ExifInterface.LONGITUDE_EAST, "todoItems", "v", "_weatherLocation", "Q", "weatherLocation", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_navigateToResetPwd", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lkotlinx/coroutines/flow/SharedFlow;", "navigateToResetPwd", "Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;", "_weatherData", "U", "isShowWeather", "Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;", "R", "weatherToady", ExifInterface.LATITUDE_SOUTH, "weatherTomorrow", "N", "weatherAfterTomorrow", "_todoItemsNum", "F", "todoItemsNum", "_todoUrgeNum", "H", "todoUrgeNum", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,373:1\n49#2:374\n51#2:378\n49#2:379\n51#2:383\n49#2:385\n51#2:389\n49#2:390\n51#2:394\n46#3:375\n51#3:377\n46#3:380\n51#3:382\n46#3:386\n51#3:388\n46#3:391\n51#3:393\n105#4:376\n105#4:381\n105#4:387\n105#4:392\n189#5:384\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel\n*L\n77#1:374\n77#1:378\n92#1:379\n92#1:383\n308#1:385\n308#1:389\n323#1:390\n323#1:394\n77#1:375\n77#1:377\n92#1:380\n92#1:382\n308#1:386\n308#1:388\n323#1:391\n323#1:393\n77#1:376\n92#1:381\n308#1:387\n323#1:392\n110#1:384\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeViewModel extends BaseViewModel {

    /* renamed from: A, reason: from kotlin metadata */
    public final LiveData isShowWeather;

    /* renamed from: B, reason: from kotlin metadata */
    public final LiveData weatherToady;

    /* renamed from: C, reason: from kotlin metadata */
    public final LiveData weatherTomorrow;

    /* renamed from: D, reason: from kotlin metadata */
    public final LiveData weatherAfterTomorrow;

    /* renamed from: E, reason: from kotlin metadata */
    public final MutableLiveData _todoItemsNum;

    /* renamed from: F, reason: from kotlin metadata */
    public final LiveData todoItemsNum;

    /* renamed from: G, reason: from kotlin metadata */
    public final MutableLiveData _todoUrgeNum;

    /* renamed from: H, reason: from kotlin metadata */
    public final LiveData todoUrgeNum;

    /* renamed from: a, reason: from kotlin metadata */
    public final HomeRepository homeRepository;

    /* renamed from: b, reason: from kotlin metadata */
    public final NotificationRepository notificationRepository;

    /* renamed from: c, reason: from kotlin metadata */
    public final DataStore studentDataStore;

    /* renamed from: d, reason: from kotlin metadata */
    public final DataStore userDataStore;

    /* renamed from: e, reason: from kotlin metadata */
    public final DataStore serverDataStore;

    /* renamed from: f, reason: from kotlin metadata */
    public final C7812b gatewayRepository;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy versionName;

    /* renamed from: h, reason: from kotlin metadata */
    public final MutableLiveData _unReadMessageCount;

    /* renamed from: i, reason: from kotlin metadata */
    public final LiveData unReadMessageCount;

    /* renamed from: j, reason: from kotlin metadata */
    public final MutableLiveData _unReadNoticeCount;

    /* renamed from: k, reason: from kotlin metadata */
    public final LiveData unReadNoticeCount;

    /* renamed from: l, reason: from kotlin metadata */
    public final MutableLiveData _studentInfo;

    /* renamed from: m, reason: from kotlin metadata */
    public final LiveData studentInfo;

    /* renamed from: n, reason: from kotlin metadata */
    public final LiveData todoResp;

    /* renamed from: o, reason: from kotlin metadata */
    public final LiveData userCacheBean;

    /* renamed from: p, reason: from kotlin metadata */
    public final MutableLiveData _showHomeTime;

    /* renamed from: q, reason: from kotlin metadata */
    public final LiveData showHomeTime;

    /* renamed from: r, reason: from kotlin metadata */
    public final MutableLiveData _isMsgDotVisible;

    /* renamed from: s, reason: from kotlin metadata */
    public final LiveData isMsgDotVisible;

    /* renamed from: t, reason: from kotlin metadata */
    public final MutableLiveData _todoItems;

    /* renamed from: u, reason: from kotlin metadata */
    public final LiveData todoItems;

    /* renamed from: v, reason: from kotlin metadata */
    public final MutableLiveData _weatherLocation;

    /* renamed from: w, reason: from kotlin metadata */
    public final LiveData weatherLocation;

    /* renamed from: x, reason: from kotlin metadata */
    public final MutableSharedFlow _navigateToResetPwd;

    /* renamed from: y, reason: from kotlin metadata */
    public final SharedFlow navigateToResetPwd;

    /* renamed from: z, reason: from kotlin metadata */
    public final LiveData _weatherData;

    public HomeViewModel(HomeRepository homeRepository, NotificationRepository notificationRepository, DataStore studentDataStore, DataStore userDataStore, DataStore serverDataStore, C7812b gatewayRepository) {
        Intrinsics.checkNotNullParameter(homeRepository, "homeRepository");
        Intrinsics.checkNotNullParameter(notificationRepository, "notificationRepository");
        Intrinsics.checkNotNullParameter(studentDataStore, "studentDataStore");
        Intrinsics.checkNotNullParameter(userDataStore, "userDataStore");
        Intrinsics.checkNotNullParameter(serverDataStore, "serverDataStore");
        Intrinsics.checkNotNullParameter(gatewayRepository, "gatewayRepository");
        this.homeRepository = homeRepository;
        this.notificationRepository = notificationRepository;
        this.studentDataStore = studentDataStore;
        this.userDataStore = userDataStore;
        this.serverDataStore = serverDataStore;
        this.gatewayRepository = gatewayRepository;
        this.versionName = LazyKt.lazy(new Function0() { // from class: l4.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HomeViewModel.m6054Y();
            }
        });
        MutableLiveData mutableLiveData = new MutableLiveData();
        this._unReadMessageCount = mutableLiveData;
        final Flow flowAsFlow = FlowLiveDataConversions.asFlow(mutableLiveData);
        this.unReadMessageCount = FlowLiveDataConversions.asLiveData$default(new Flow() { // from class: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1

            /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1$2 */
            public static final class C61792 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f7041a;

                @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1$2", m7918f = "HomeViewModel.kt", m7919i = {0, 0, 0, 0, 0}, m7920l = {50}, m7921m = "emit", m7922n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f7042a;

                    /* renamed from: b */
                    public int f7043b;

                    /* renamed from: c */
                    public Object f7044c;

                    /* renamed from: e */
                    public Object f7046e;

                    /* renamed from: f */
                    public Object f7047f;

                    /* renamed from: g */
                    public Object f7048g;

                    /* renamed from: h */
                    public int f7049h;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f7042a = obj;
                        this.f7043b |= Integer.MIN_VALUE;
                        return C61792.this.emit(null, this);
                    }
                }

                public C61792(FlowCollector flowCollector) {
                    this.f7041a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1.C61792.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1$2$1 r0 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1.C61792.AnonymousClass1) r0
                        int r1 = r0.f7043b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7043b = r1
                        goto L18
                    L13:
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1$2$1 r0 = new com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f7042a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f7043b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f7048g
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r7 = r0.f7046e
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1$2$1 r7 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1.C61792.AnonymousClass1) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L80
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f7041a
                        r2 = r7
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        if (r2 != 0) goto L44
                        goto L4d
                    L44:
                        int r4 = r2.intValue()
                        if (r4 != 0) goto L4d
                        java.lang.String r2 = "0"
                        goto L5c
                    L4d:
                        int r4 = r2.intValue()
                        r5 = 99
                        if (r4 <= r5) goto L58
                        java.lang.String r2 = "99+"
                        goto L5c
                    L58:
                        java.lang.String r2 = r2.toString()
                    L5c:
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7044c = r4
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                        r0.f7046e = r4
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7047f = r7
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                        r0.f7048g = r7
                        r7 = 0
                        r0.f7049h = r7
                        r0.f7043b = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L80
                        return r1
                    L80:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$1.C61792.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$1$2.smali:37
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow.collect(new C61792(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, (CoroutineContext) null, 0L, 3, (Object) null);
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this._unReadNoticeCount = mutableLiveData2;
        final Flow flowAsFlow2 = FlowLiveDataConversions.asFlow(mutableLiveData2);
        this.unReadNoticeCount = FlowLiveDataConversions.asLiveData$default(new Flow() { // from class: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2

            /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2$2 */
            public static final class C61802 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f7051a;

                @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2$2", m7918f = "HomeViewModel.kt", m7919i = {0, 0, 0, 0, 0}, m7920l = {50}, m7921m = "emit", m7922n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f7052a;

                    /* renamed from: b */
                    public int f7053b;

                    /* renamed from: c */
                    public Object f7054c;

                    /* renamed from: e */
                    public Object f7056e;

                    /* renamed from: f */
                    public Object f7057f;

                    /* renamed from: g */
                    public Object f7058g;

                    /* renamed from: h */
                    public int f7059h;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f7052a = obj;
                        this.f7053b |= Integer.MIN_VALUE;
                        return C61802.this.emit(null, this);
                    }
                }

                public C61802(FlowCollector flowCollector) {
                    this.f7051a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2.C61802.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2$2$1 r0 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2.C61802.AnonymousClass1) r0
                        int r1 = r0.f7053b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7053b = r1
                        goto L18
                    L13:
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2$2$1 r0 = new com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f7052a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f7053b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f7058g
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r7 = r0.f7056e
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2$2$1 r7 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2.C61802.AnonymousClass1) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L80
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f7051a
                        r2 = r7
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        if (r2 != 0) goto L44
                        goto L4d
                    L44:
                        int r4 = r2.intValue()
                        if (r4 != 0) goto L4d
                        java.lang.String r2 = "0"
                        goto L5c
                    L4d:
                        int r4 = r2.intValue()
                        r5 = 99
                        if (r4 <= r5) goto L58
                        java.lang.String r2 = "99+"
                        goto L5c
                    L58:
                        java.lang.String r2 = r2.toString()
                    L5c:
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7054c = r4
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                        r0.f7056e = r4
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7057f = r7
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                        r0.f7058g = r7
                        r7 = 0
                        r0.f7059h = r7
                        r0.f7053b = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L80
                        return r1
                    L80:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$2.C61802.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$2$2.smali:37
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow2.collect(new C61802(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, (CoroutineContext) null, 0L, 3, (Object) null);
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this._studentInfo = mutableLiveData3;
        this.studentInfo = mutableLiveData3;
        this.todoResp = FlowLiveDataConversions.asLiveData$default(FlowKt.transformLatest(FlowLiveDataConversions.asFlow(mutableLiveData3), new HomeViewModel$special$$inlined$flatMapLatest$1(null, this)), (CoroutineContext) null, 0L, 3, (Object) null);
        this.userCacheBean = FlowLiveDataConversions.asLiveData$default(userDataStore.getData(), (CoroutineContext) null, 0L, 3, (Object) null);
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this._showHomeTime = mutableLiveData4;
        this.showHomeTime = mutableLiveData4;
        MutableLiveData mutableLiveData5 = new MutableLiveData();
        this._isMsgDotVisible = mutableLiveData5;
        this.isMsgDotVisible = mutableLiveData5;
        MutableLiveData mutableLiveData6 = new MutableLiveData();
        this._todoItems = mutableLiveData6;
        this.todoItems = mutableLiveData6;
        MutableLiveData mutableLiveData7 = new MutableLiveData();
        this._weatherLocation = mutableLiveData7;
        this.weatherLocation = mutableLiveData7;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._navigateToResetPwd = mutableSharedFlowMutableSharedFlow$default;
        this.navigateToResetPwd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        LiveData liveDataSwitchMap = Transformations.switchMap(mutableLiveData7, new Function1() { // from class: l4.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.m6064g(this.f9309a, (String) obj);
            }
        });
        this._weatherData = liveDataSwitchMap;
        this.isShowWeather = Transformations.map(liveDataSwitchMap, new Function1() { // from class: l4.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(HomeViewModel.m6053V((WeatherBean) obj));
            }
        });
        this.weatherToady = Transformations.map(liveDataSwitchMap, new Function1() { // from class: l4.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.m6057a0((WeatherBean) obj);
            }
        });
        this.weatherTomorrow = Transformations.map(liveDataSwitchMap, new Function1() { // from class: l4.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.m6059b0((WeatherBean) obj);
            }
        });
        this.weatherAfterTomorrow = Transformations.map(liveDataSwitchMap, new Function1() { // from class: l4.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HomeViewModel.m6055Z((WeatherBean) obj);
            }
        });
        MutableLiveData mutableLiveData8 = new MutableLiveData();
        this._todoItemsNum = mutableLiveData8;
        final Flow flowAsFlow3 = FlowLiveDataConversions.asFlow(mutableLiveData8);
        this.todoItemsNum = FlowLiveDataConversions.asLiveData$default(new Flow() { // from class: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3

            /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3$2 */
            public static final class C61812 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f7061a;

                @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3$2", m7918f = "HomeViewModel.kt", m7919i = {0, 0, 0, 0, 0}, m7920l = {50}, m7921m = "emit", m7922n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f7062a;

                    /* renamed from: b */
                    public int f7063b;

                    /* renamed from: c */
                    public Object f7064c;

                    /* renamed from: e */
                    public Object f7066e;

                    /* renamed from: f */
                    public Object f7067f;

                    /* renamed from: g */
                    public Object f7068g;

                    /* renamed from: h */
                    public int f7069h;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f7062a = obj;
                        this.f7063b |= Integer.MIN_VALUE;
                        return C61812.this.emit(null, this);
                    }
                }

                public C61812(FlowCollector flowCollector) {
                    this.f7061a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3.C61812.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3$2$1 r0 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3.C61812.AnonymousClass1) r0
                        int r1 = r0.f7063b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7063b = r1
                        goto L18
                    L13:
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3$2$1 r0 = new com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f7062a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f7063b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f7068g
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r7 = r0.f7066e
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3$2$1 r7 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3.C61812.AnonymousClass1) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L80
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f7061a
                        r2 = r7
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        if (r2 != 0) goto L44
                        goto L4d
                    L44:
                        int r4 = r2.intValue()
                        if (r4 != 0) goto L4d
                        java.lang.String r2 = "0"
                        goto L5c
                    L4d:
                        int r4 = r2.intValue()
                        r5 = 99
                        if (r4 <= r5) goto L58
                        java.lang.String r2 = "99+"
                        goto L5c
                    L58:
                        java.lang.String r2 = r2.toString()
                    L5c:
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7064c = r4
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                        r0.f7066e = r4
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7067f = r7
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                        r0.f7068g = r7
                        r7 = 0
                        r0.f7069h = r7
                        r0.f7063b = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L80
                        return r1
                    L80:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$3.C61812.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$3$2.smali:37
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow3.collect(new C61812(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        MutableLiveData mutableLiveData9 = new MutableLiveData();
        this._todoUrgeNum = mutableLiveData9;
        final Flow flowAsFlow4 = FlowLiveDataConversions.asFlow(mutableLiveData9);
        this.todoUrgeNum = FlowLiveDataConversions.asLiveData$default(new Flow() { // from class: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4

            /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4$2 */
            public static final class C61822 implements FlowCollector {

                /* renamed from: a */
                public final /* synthetic */ FlowCollector f7071a;

                @Metadata(m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
                @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4$2", m7918f = "HomeViewModel.kt", m7919i = {0, 0, 0, 0, 0}, m7920l = {50}, m7921m = "emit", m7922n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m7923s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
                /* renamed from: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* renamed from: a */
                    public /* synthetic */ Object f7072a;

                    /* renamed from: b */
                    public int f7073b;

                    /* renamed from: c */
                    public Object f7074c;

                    /* renamed from: e */
                    public Object f7076e;

                    /* renamed from: f */
                    public Object f7077f;

                    /* renamed from: g */
                    public Object f7078g;

                    /* renamed from: h */
                    public int f7079h;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.f7072a = obj;
                        this.f7073b |= Integer.MIN_VALUE;
                        return C61822.this.emit(null, this);
                    }
                }

                public C61822(FlowCollector flowCollector) {
                    this.f7071a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4.C61822.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4$2$1 r0 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4.C61822.AnonymousClass1) r0
                        int r1 = r0.f7073b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f7073b = r1
                        goto L18
                    L13:
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4$2$1 r0 = new com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.f7072a
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f7073b
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.f7078g
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        java.lang.Object r7 = r0.f7076e
                        com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4$2$1 r7 = (com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4.C61822.AnonymousClass1) r7
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L80
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.f7071a
                        r2 = r7
                        java.lang.Integer r2 = (java.lang.Integer) r2
                        if (r2 != 0) goto L44
                        goto L4d
                    L44:
                        int r4 = r2.intValue()
                        if (r4 != 0) goto L4d
                        java.lang.String r2 = "0"
                        goto L5c
                    L4d:
                        int r4 = r2.intValue()
                        r5 = 99
                        if (r4 <= r5) goto L58
                        java.lang.String r2 = "99+"
                        goto L5c
                    L58:
                        java.lang.String r2 = r2.toString()
                    L5c:
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7074c = r4
                        java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                        r0.f7076e = r4
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r7)
                        r0.f7077f = r7
                        java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                        r0.f7078g = r7
                        r7 = 0
                        r0.f7079h = r7
                        r0.f7073b = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L80
                        return r1
                    L80:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel$special$$inlined$map$4.C61822.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$4$2.smali:37
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flowAsFlow4.collect(new C61822(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    /* renamed from: V */
    public static final boolean m6053V(WeatherBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List<WeatherCityBean> daily = it.getDaily();
        return daily != null && (daily.isEmpty() ^ true);
    }

    /* renamed from: Y */
    public static final MutableLiveData m6054Y() {
        return new MutableLiveData(AbstractC6537g.f8372a.m7310a());
    }

    /* renamed from: Z */
    public static final WeatherCityBean m6055Z(WeatherBean weatherBean) {
        Intrinsics.checkNotNullParameter(weatherBean, "weatherBean");
        List<WeatherCityBean> daily = weatherBean.getDaily();
        if (daily == null || daily.size() <= 2) {
            return null;
        }
        return daily.get(2);
    }

    /* renamed from: a0 */
    public static final WeatherCityBean m6057a0(WeatherBean weatherBean) {
        Intrinsics.checkNotNullParameter(weatherBean, "weatherBean");
        List<WeatherCityBean> daily = weatherBean.getDaily();
        if (daily == null || daily.isEmpty()) {
            return null;
        }
        return daily.get(0);
    }

    /* renamed from: b0 */
    public static final WeatherCityBean m6059b0(WeatherBean weatherBean) {
        Intrinsics.checkNotNullParameter(weatherBean, "weatherBean");
        List<WeatherCityBean> daily = weatherBean.getDaily();
        if (daily == null || daily.size() <= 1) {
            return null;
        }
        return daily.get(1);
    }

    /* renamed from: g */
    public static final LiveData m6064g(HomeViewModel homeViewModel, String location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return ViewModelExtKt.m5319b(homeViewModel, homeViewModel.homeRepository.m5420g(C6545o.f8377a.m7403a(location)), null, null, new HomeViewModel$_weatherData$1$1(null), 6, null);
    }

    /* renamed from: A, reason: from getter */
    public final SharedFlow getNavigateToResetPwd() {
        return this.navigateToResetPwd;
    }

    /* renamed from: B, reason: from getter */
    public final LiveData getShowHomeTime() {
        return this.showHomeTime;
    }

    /* renamed from: C */
    public final void m6082C() {
        ViewModelExtKt.m5322e(this, this.studentDataStore.getData(), null, null, new HomeViewModel$getStudentData$1(null), new HomeViewModel$getStudentData$2(this, null), 6, null);
    }

    /* renamed from: D, reason: from getter */
    public final LiveData getStudentInfo() {
        return this.studentInfo;
    }

    /* renamed from: E, reason: from getter */
    public final LiveData getTodoItems() {
        return this.todoItems;
    }

    /* renamed from: F, reason: from getter */
    public final LiveData getTodoItemsNum() {
        return this.todoItemsNum;
    }

    /* renamed from: G, reason: from getter */
    public final LiveData getTodoResp() {
        return this.todoResp;
    }

    /* renamed from: H, reason: from getter */
    public final LiveData getTodoUrgeNum() {
        return this.todoUrgeNum;
    }

    /* renamed from: I */
    public final void m6088I() {
        BaseViewModel.launchData$default(this, null, null, new HomeViewModel$getUnReadCount$1(this, null), 3, null);
    }

    /* renamed from: J, reason: from getter */
    public final LiveData getUnReadMessageCount() {
        return this.unReadMessageCount;
    }

    /* renamed from: K, reason: from getter */
    public final LiveData getUnReadNoticeCount() {
        return this.unReadNoticeCount;
    }

    /* renamed from: L, reason: from getter */
    public final LiveData getUserCacheBean() {
        return this.userCacheBean;
    }

    /* renamed from: M */
    public final LiveData m6092M() {
        return (LiveData) this.versionName.getValue();
    }

    /* renamed from: N, reason: from getter */
    public final LiveData getWeatherAfterTomorrow() {
        return this.weatherAfterTomorrow;
    }

    /* renamed from: O */
    public final String m6094O() {
        return this.homeRepository.m5419f();
    }

    /* renamed from: P */
    public final void m6095P() {
        ViewModelExtKt.m5322e(this, FlowKt.flow(new HomeViewModel$getWeatherData$1(this, null)), null, null, null, new HomeViewModel$getWeatherData$2(this, null), 14, null);
    }

    /* renamed from: Q, reason: from getter */
    public final LiveData getWeatherLocation() {
        return this.weatherLocation;
    }

    /* renamed from: R, reason: from getter */
    public final LiveData getWeatherToady() {
        return this.weatherToady;
    }

    /* renamed from: S, reason: from getter */
    public final LiveData getWeatherTomorrow() {
        return this.weatherTomorrow;
    }

    /* renamed from: T, reason: from getter */
    public final LiveData getIsMsgDotVisible() {
        return this.isMsgDotVisible;
    }

    /* renamed from: U, reason: from getter */
    public final LiveData getIsShowWeather() {
        return this.isShowWeather;
    }

    /* renamed from: W */
    public final void m6101W(String city) {
        Intrinsics.checkNotNullParameter(city, "city");
        this.homeRepository.m5421h(city);
    }

    /* renamed from: X */
    public final void m6102X() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$startShowHomeTime$1(this, null), 3, null);
    }

    /* renamed from: w */
    public final void m6103w() {
        BaseViewModel.launchData$default(this, null, null, new HomeViewModel$checkLocalServerInfo$1(this, null), 3, null);
    }

    /* renamed from: x */
    public final void m6104x() {
        launchData(getToastLiveData(), isDialogVisible(), new HomeViewModel$checkSecurityLevelAndNavigate$1(this, null));
    }

    /* renamed from: y */
    public final void m6105y() {
        ViewModelExtKt.m5322e(this, this.homeRepository.m5417d(), null, null, new HomeViewModel$getHomeWorks$1(null), new HomeViewModel$getHomeWorks$2(this, null), 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035 A[EXC_TOP_SPLITTER, PHI: r4
      0x0035: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v6 java.lang.String) binds: [B:3:0x002a, B:6:0x0033] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.zykj.huiwei.launcher.bean.Location m6106z() {
        /*
            r10 = this;
            com.zykj.huiwei.launcher.app.App$a r0 = com.zykj.huiwei.launcher.app.App.INSTANCE
            com.zykj.huiwei.launcher.app.App r1 = r0.m5206a()
            java.lang.String r2 = "location"
            java.lang.Object r1 = r1.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.location.LocationManager"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            r2 = 1
            java.util.List r2 = r1.getProviders(r2)
            java.lang.String r3 = "getProviders(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            com.zykj.huiwei.launcher.bean.Location r3 = new com.zykj.huiwei.launcher.bean.Location
            java.lang.String r4 = "北京市"
            r3.<init>(r4, r4)
            java.lang.String r4 = "gps"
            boolean r5 = r2.contains(r4)
            if (r5 == 0) goto L2d
            goto L35
        L2d:
            java.lang.String r4 = "network"
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L84
        L35:
            android.location.Location r1 = r1.getLastKnownLocation(r4)     // Catch: java.lang.Exception -> L80
            if (r1 == 0) goto L84
            android.location.Geocoder r4 = new android.location.Geocoder     // Catch: java.lang.Exception -> L80
            com.zykj.huiwei.launcher.app.App r0 = r0.m5206a()     // Catch: java.lang.Exception -> L80
            java.util.Locale r2 = java.util.Locale.CHINA     // Catch: java.lang.Exception -> L80
            r4.<init>(r0, r2)     // Catch: java.lang.Exception -> L80
            double r5 = r1.getLatitude()     // Catch: java.lang.Exception -> L80
            double r7 = r1.getLongitude()     // Catch: java.lang.Exception -> L80
            r9 = 1
            java.util.List r0 = r4.getFromLocation(r5, r7, r9)     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L84
            int r1 = r0.size()     // Catch: java.lang.Exception -> L80
            if (r1 <= 0) goto L5c
            goto L5d
        L5c:
            r0 = 0
        L5d:
            if (r0 == 0) goto L84
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L80
            android.location.Address r0 = (android.location.Address) r0     // Catch: java.lang.Exception -> L80
            if (r0 == 0) goto L84
            com.zykj.huiwei.launcher.bean.Location r1 = new com.zykj.huiwei.launcher.bean.Location     // Catch: java.lang.Exception -> L80
            java.lang.String r2 = r0.getAdminArea()     // Catch: java.lang.Exception -> L80
            java.lang.String r4 = "getAdminArea(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch: java.lang.Exception -> L80
            java.lang.String r0 = r0.getLocality()     // Catch: java.lang.Exception -> L80
            java.lang.String r4 = "getLocality(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)     // Catch: java.lang.Exception -> L80
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L80
            return r1
        L80:
            r0 = move-exception
            r0.printStackTrace()
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.viewmodels.HomeViewModel.m6106z():com.zykj.huiwei.launcher.bean.Location"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/viewmodels/HomeViewModel.smali:2008
    }
}
