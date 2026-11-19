# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001BK\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\r\u0010\u001f\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u001f\u0010\u0016J\r\u0010 \u001a\u00020\u0014\u00a2\u0006\u0004\u0008 \u0010\u0016J\r\u0010!\u001a\u00020\u0014\u00a2\u0006\u0004\u0008!\u0010\u0016J\r\u0010\"\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\"\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010(\u001a\u0004\u0008*\u0010+R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R!\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00180/8FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u001a\u00109\u001a\u0008\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108R\u001d\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00180/8\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u00103R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00108R\u001d\u0010B\u001a\u0008\u0012\u0004\u0012\u00020\u00180/8\u0006\u00a2\u0006\u000c\n\u0004\u0008@\u0010;\u001a\u0004\u0008A\u00103R\u001a\u0010D\u001a\u0008\u0012\u0004\u0012\u00020\u0007058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008C\u00108R\u001d\u0010G\u001a\u0008\u0012\u0004\u0012\u00020\u00070/8\u0006\u00a2\u0006\u000c\n\u0004\u0008E\u0010;\u001a\u0004\u0008F\u00103R#\u0010L\u001a\u0008\u0012\u0004\u0012\u00020H0/8\u0006\u00a2\u0006\u0012\n\u0004\u0008I\u0010;\u0012\u0004\u0008K\u0010\u0016\u001a\u0004\u0008J\u00103R\u001d\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\t0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008M\u0010;\u001a\u0004\u0008N\u00103R\u001a\u0010R\u001a\u0008\u0012\u0004\u0012\u00020P058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u00108R\u001d\u0010U\u001a\u0008\u0012\u0004\u0012\u00020P0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008S\u0010;\u001a\u0004\u0008T\u00103R\u001a\u0010X\u001a\u0008\u0012\u0004\u0012\u00020V058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u00108R\u001d\u0010[\u001a\u0008\u0012\u0004\u0012\u00020V0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008Y\u0010;\u001a\u0004\u0008Z\u00103R \u0010_\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020]0\\058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u00108R#\u0010b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020]0\\0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008`\u0010;\u001a\u0004\u0008a\u00103R\u001a\u0010d\u001a\u0008\u0012\u0004\u0012\u00020\u0018058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u00108R\u001d\u0010f\u001a\u0008\u0012\u0004\u0012\u00020\u00180/8\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u0010;\u001a\u0004\u0008e\u00103R\u001a\u0010i\u001a\u0008\u0012\u0004\u0012\u0002060g8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010hR\u001d\u0010n\u001a\u0008\u0012\u0004\u0012\u0002060j8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010k\u001a\u0004\u0008l\u0010mR\u001a\u0010p\u001a\u0008\u0012\u0004\u0012\u00020o0/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010;R\u001d\u0010r\u001a\u0008\u0012\u0004\u0012\u00020V0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008l\u0010;\u001a\u0004\u0008q\u00103R\u001f\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008T\u0010;\u001a\u0004\u0008t\u00103R\u001f\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010;\u001a\u0004\u0008v\u00103R\u001f\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0/8\u0006\u00a2\u0006\u000c\n\u0004\u0008F\u0010;\u001a\u0004\u0008x\u00103R\u001a\u0010z\u001a\u0008\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008a\u00108R\u001d\u0010|\u001a\u0008\u0012\u0004\u0012\u00020\u00180/8\u0006\u00a2\u0006\u000c\n\u0004\u0008{\u0010;\u001a\u0004\u0008{\u00103R\u001a\u0010}\u001a\u0008\u0012\u0004\u0012\u000206058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u00108R\u001d\u0010\u007f\u001a\u0008\u0012\u0004\u0012\u00020\u00180/8\u0006\u00a2\u0006\u000c\n\u0004\u0008~\u0010;\u001a\u0004\u0008~\u00103\u00a8\u0006\u0080\u0001"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Lcom/zykj/huiwei/launcher/repository/HomeRepository;",
        "homeRepository",
        "Lcom/zykj/huiwei/launcher/repository/NotificationRepository;",
        "notificationRepository",
        "Landroidx/datastore/core/DataStore;",
        "Lcom/zykj/huiwei/launcher/proto/g;",
        "studentDataStore",
        "Lcom/zykj/huiwei/launcher/proto/m;",
        "userDataStore",
        "Lcom/zykj/huiwei/launcher/proto/a;",
        "serverDataStore",
        "Lw3/b;",
        "gatewayRepository",
        "<init>",
        "(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Lcom/zykj/huiwei/launcher/repository/NotificationRepository;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lw3/b;)V",
        "Lcom/zykj/huiwei/launcher/bean/Location;",
        "z",
        "()Lcom/zykj/huiwei/launcher/bean/Location;",
        "",
        "X",
        "()V",
        "P",
        "",
        "O",
        "()Ljava/lang/String;",
        "city",
        "W",
        "(Ljava/lang/String;)V",
        "I",
        "y",
        "C",
        "w",
        "x",
        "a",
        "Lcom/zykj/huiwei/launcher/repository/HomeRepository;",
        "b",
        "Lcom/zykj/huiwei/launcher/repository/NotificationRepository;",
        "c",
        "Landroidx/datastore/core/DataStore;",
        "d",
        "getUserDataStore",
        "()Landroidx/datastore/core/DataStore;",
        "e",
        "f",
        "Lw3/b;",
        "Landroidx/lifecycle/LiveData;",
        "g",
        "Lkotlin/Lazy;",
        "M",
        "()Landroidx/lifecycle/LiveData;",
        "versionName",
        "Landroidx/lifecycle/MutableLiveData;",
        "",
        "h",
        "Landroidx/lifecycle/MutableLiveData;",
        "_unReadMessageCount",
        "i",
        "Landroidx/lifecycle/LiveData;",
        "J",
        "unReadMessageCount",
        "j",
        "_unReadNoticeCount",
        "k",
        "K",
        "unReadNoticeCount",
        "l",
        "_studentInfo",
        "m",
        "D",
        "studentInfo",
        "Lcom/zykj/huiwei/launcher/bean/resp/TodoResp;",
        "n",
        "G",
        "getTodoResp$annotations",
        "todoResp",
        "o",
        "L",
        "userCacheBean",
        "Lcom/zykj/huiwei/launcher/bean/HomeTime;",
        "p",
        "_showHomeTime",
        "q",
        "B",
        "showHomeTime",
        "",
        "r",
        "_isMsgDotVisible",
        "s",
        "T",
        "isMsgDotVisible",
        "",
        "Lcom/zykj/huiwei/launcher/bean/TaskInfo;",
        "t",
        "_todoItems",
        "u",
        "E",
        "todoItems",
        "v",
        "_weatherLocation",
        "Q",
        "weatherLocation",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "_navigateToResetPwd",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "A",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "navigateToResetPwd",
        "Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;",
        "_weatherData",
        "U",
        "isShowWeather",
        "Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;",
        "R",
        "weatherToady",
        "S",
        "weatherTomorrow",
        "N",
        "weatherAfterTomorrow",
        "_todoItemsNum",
        "F",
        "todoItemsNum",
        "_todoUrgeNum",
        "H",
        "todoUrgeNum",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,373:1\n49#2:374\n51#2:378\n49#2:379\n51#2:383\n49#2:385\n51#2:389\n49#2:390\n51#2:394\n46#3:375\n51#3:377\n46#3:380\n51#3:382\n46#3:386\n51#3:388\n46#3:391\n51#3:393\n105#4:376\n105#4:381\n105#4:387\n105#4:392\n189#5:384\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/huiwei/launcher/viewmodels/HomeViewModel\n*L\n77#1:374\n77#1:378\n92#1:379\n92#1:383\n308#1:385\n308#1:389\n323#1:390\n323#1:394\n77#1:375\n77#1:377\n92#1:380\n92#1:382\n308#1:386\n308#1:388\n323#1:391\n323#1:393\n77#1:376\n92#1:381\n308#1:387\n323#1:392\n110#1:384\n*E\n"
    }
.end annotation


# instance fields
.field public final A:Landroidx/lifecycle/LiveData;

.field public final B:Landroidx/lifecycle/LiveData;

.field public final C:Landroidx/lifecycle/LiveData;

.field public final D:Landroidx/lifecycle/LiveData;

.field public final E:Landroidx/lifecycle/MutableLiveData;

.field public final F:Landroidx/lifecycle/LiveData;

.field public final G:Landroidx/lifecycle/MutableLiveData;

.field public final H:Landroidx/lifecycle/LiveData;

.field public final a:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

.field public final b:Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

.field public final c:Landroidx/datastore/core/DataStore;

.field public final d:Landroidx/datastore/core/DataStore;

.field public final e:Landroidx/datastore/core/DataStore;

.field public final f:Lw3/b;

.field public final g:Lkotlin/Lazy;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/LiveData;

.field public final j:Landroidx/lifecycle/MutableLiveData;

.field public final k:Landroidx/lifecycle/LiveData;

.field public final l:Landroidx/lifecycle/MutableLiveData;

.field public final m:Landroidx/lifecycle/LiveData;

.field public final n:Landroidx/lifecycle/LiveData;

.field public final o:Landroidx/lifecycle/LiveData;

.field public final p:Landroidx/lifecycle/MutableLiveData;

.field public final q:Landroidx/lifecycle/LiveData;

.field public final r:Landroidx/lifecycle/MutableLiveData;

.field public final s:Landroidx/lifecycle/LiveData;

.field public final t:Landroidx/lifecycle/MutableLiveData;

.field public final u:Landroidx/lifecycle/LiveData;

.field public final v:Landroidx/lifecycle/MutableLiveData;

.field public final w:Landroidx/lifecycle/LiveData;

.field public final x:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final y:Lkotlinx/coroutines/flow/SharedFlow;

.field public final z:Landroidx/lifecycle/LiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/huiwei/launcher/repository/HomeRepository;Lcom/zykj/huiwei/launcher/repository/NotificationRepository;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;Lw3/b;)V
    .locals 6

    .line 1
    const-string v0, "homeRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "notificationRepository"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "studentDataStore"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "userDataStore"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "serverDataStore"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "gatewayRepository"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->a:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->b:Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->d:Landroidx/datastore/core/DataStore;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->e:Landroidx/datastore/core/DataStore;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->f:Lw3/b;

    .line 45
    .line 46
    new-instance p1, Ll4/k;

    .line 47
    .line 48
    invoke-direct {p1}, Ll4/k;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->g:Lkotlin/Lazy;

    .line 56
    .line 57
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 58
    .line 59
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 63
    .line 64
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/Flow;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$1;

    .line 69
    .line 70
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    .line 71
    .line 72
    .line 73
    const/4 v4, 0x3

    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v1, 0x0

    .line 76
    const-wide/16 v2, 0x0

    .line 77
    .line 78
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->i:Landroidx/lifecycle/LiveData;

    .line 83
    .line 84
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 85
    .line 86
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 90
    .line 91
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/Flow;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$2;

    .line 96
    .line 97
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$2;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    .line 98
    .line 99
    .line 100
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->k:Landroidx/lifecycle/LiveData;

    .line 105
    .line 106
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 107
    .line 108
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 112
    .line 113
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->m:Landroidx/lifecycle/LiveData;

    .line 114
    .line 115
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/Flow;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    new-instance p2, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$flatMapLatest$1;

    .line 120
    .line 121
    const/4 p3, 0x0

    .line 122
    invoke-direct {p2, p3, p0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 123
    .line 124
    .line 125
    invoke-static {p1, p2}, Lkotlinx/coroutines/flow/FlowKt;->transformLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->n:Landroidx/lifecycle/LiveData;

    .line 134
    .line 135
    invoke-interface {p4}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->o:Landroidx/lifecycle/LiveData;

    .line 144
    .line 145
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 146
    .line 147
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 148
    .line 149
    .line 150
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->p:Landroidx/lifecycle/MutableLiveData;

    .line 151
    .line 152
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->q:Landroidx/lifecycle/LiveData;

    .line 153
    .line 154
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 155
    .line 156
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 157
    .line 158
    .line 159
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 160
    .line 161
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->s:Landroidx/lifecycle/LiveData;

    .line 162
    .line 163
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 164
    .line 165
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 166
    .line 167
    .line 168
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    .line 169
    .line 170
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->u:Landroidx/lifecycle/LiveData;

    .line 171
    .line 172
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 173
    .line 174
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 175
    .line 176
    .line 177
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 178
    .line 179
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->w:Landroidx/lifecycle/LiveData;

    .line 180
    .line 181
    const/4 p2, 0x0

    .line 182
    const/4 p4, 0x7

    .line 183
    invoke-static {p2, p2, p3, p4, p3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->x:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 188
    .line 189
    invoke-static {p2}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->y:Lkotlinx/coroutines/flow/SharedFlow;

    .line 194
    .line 195
    new-instance p2, Ll4/l;

    .line 196
    .line 197
    invoke-direct {p2, p0}, Ll4/l;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)V

    .line 198
    .line 199
    .line 200
    invoke-static {p1, p2}, Landroidx/lifecycle/Transformations;->switchMap(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->z:Landroidx/lifecycle/LiveData;

    .line 205
    .line 206
    new-instance p2, Ll4/m;

    .line 207
    .line 208
    invoke-direct {p2}, Ll4/m;-><init>()V

    .line 209
    .line 210
    .line 211
    invoke-static {p1, p2}, Landroidx/lifecycle/Transformations;->map(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->A:Landroidx/lifecycle/LiveData;

    .line 216
    .line 217
    new-instance p2, Ll4/n;

    .line 218
    .line 219
    invoke-direct {p2}, Ll4/n;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-static {p1, p2}, Landroidx/lifecycle/Transformations;->map(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->B:Landroidx/lifecycle/LiveData;

    .line 227
    .line 228
    new-instance p2, Ll4/o;

    .line 229
    .line 230
    invoke-direct {p2}, Ll4/o;-><init>()V

    .line 231
    .line 232
    .line 233
    invoke-static {p1, p2}, Landroidx/lifecycle/Transformations;->map(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->C:Landroidx/lifecycle/LiveData;

    .line 238
    .line 239
    new-instance p2, Ll4/p;

    .line 240
    .line 241
    invoke-direct {p2}, Ll4/p;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-static {p1, p2}, Landroidx/lifecycle/Transformations;->map(Landroidx/lifecycle/LiveData;Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/LiveData;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->D:Landroidx/lifecycle/LiveData;

    .line 249
    .line 250
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 251
    .line 252
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 253
    .line 254
    .line 255
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->E:Landroidx/lifecycle/MutableLiveData;

    .line 256
    .line 257
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/Flow;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$3;

    .line 262
    .line 263
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$3;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    .line 264
    .line 265
    .line 266
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    const/4 v4, 0x2

    .line 275
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 276
    .line 277
    .line 278
    move-result-object p1

    .line 279
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->F:Landroidx/lifecycle/LiveData;

    .line 280
    .line 281
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 282
    .line 283
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 284
    .line 285
    .line 286
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->G:Landroidx/lifecycle/MutableLiveData;

    .line 287
    .line 288
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/Flow;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$4;

    .line 293
    .line 294
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$special$$inlined$map$4;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    .line 295
    .line 296
    .line 297
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-interface {p1}, Lkotlinx/coroutines/CoroutineScope;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-static/range {v0 .. v5}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->H:Landroidx/lifecycle/LiveData;

    .line 310
    .line 311
    return-void
.end method

.method public static final V(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Z
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;->getDaily()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v1, 0x1

    .line 18
    xor-int/2addr p0, v1

    .line 19
    if-ne p0, v1, :cond_0

    .line 20
    .line 21
    return v1

    .line 22
    :cond_0
    return v0
.end method

.method public static final Y()Landroidx/lifecycle/MutableLiveData;
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    sget-object v1, Li4/g;->a:Li4/g$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Li4/g$a;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final Z(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 3

    .line 1
    const-string v0, "weatherBean"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;->getDaily()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x2

    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v0
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->Z(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    move-result-object p0

    return-object p0
.end method

.method public static final a0(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 2

    .line 1
    const-string v0, "weatherBean"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;->getDaily()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v0
.end method

.method public static synthetic b(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->g(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Ljava/lang/String;)Landroidx/lifecycle/LiveData;

    move-result-object p0

    return-object p0
.end method

.method public static final b0(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 3

    .line 1
    const-string v0, "weatherBean"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;->getDaily()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-le v1, v2, :cond_0

    .line 19
    .line 20
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    return-object v0
.end method

.method public static synthetic c()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->Y()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->a0(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->b0(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Lcom/zykj/huiwei/launcher/bean/resp/WeatherCityBean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->V(Lcom/zykj/huiwei/launcher/bean/resp/WeatherBean;)Z

    move-result p0

    return p0
.end method

.method public static final g(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .locals 8

    .line 1
    const-string v0, "location"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->a:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 7
    .line 8
    sget-object v1, Li4/o;->a:Li4/o;

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Li4/o;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->g(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-instance v5, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$_weatherData$1$1;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-direct {v5, p1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$_weatherData$1$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x6

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    move-object v1, p0

    .line 29
    invoke-static/range {v1 .. v7}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->b(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public static final synthetic h(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Lw3/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->f:Lw3/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Lcom/zykj/huiwei/launcher/repository/HomeRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->a:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Lcom/zykj/huiwei/launcher/bean/Location;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->z()Lcom/zykj/huiwei/launcher/bean/Location;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Lcom/zykj/huiwei/launcher/repository/NotificationRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->b:Lcom/zykj/huiwei/launcher/repository/NotificationRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/datastore/core/DataStore;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->e:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->x:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->p:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->t:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->E:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->G:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final A()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->y:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->q:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->c:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    new-instance v5, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getStudentData$1;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v5, v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getStudentData$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    new-instance v6, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getStudentData$2;

    .line 14
    .line 15
    invoke-direct {v6, p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getStudentData$2;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    const/4 v7, 0x6

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v1, p0

    .line 23
    invoke-static/range {v1 .. v8}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->e(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final D()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->m:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->u:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->F:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->n:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->H:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getUnReadCount$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final J()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->i:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->k:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->o:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/LiveData;

    .line 8
    .line 9
    return-object v0
.end method

.method public final N()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->D:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->a:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->f()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final P()V
    .locals 10

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getWeatherData$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getWeatherData$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v7, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getWeatherData$2;

    .line 12
    .line 13
    invoke-direct {v7, p0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getWeatherData$2;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/16 v8, 0xe

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v5, 0x0

    .line 21
    const/4 v6, 0x0

    .line 22
    move-object v2, p0

    .line 23
    invoke-static/range {v2 .. v9}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->e(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final Q()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->w:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final R()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->B:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final S()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->C:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final T()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->s:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final U()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->A:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "city"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->a:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final X()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$startShowHomeTime$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final w()V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkLocalServerInfo$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkSecurityLevelAndNavigate$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, v3}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$checkSecurityLevelAndNavigate$1;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final y()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;->a:Lcom/zykj/huiwei/launcher/repository/HomeRepository;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/repository/HomeRepository;->d()Lkotlinx/coroutines/flow/Flow;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    new-instance v5, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getHomeWorks$1;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-direct {v5, v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getHomeWorks$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    new-instance v6, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getHomeWorks$2;

    .line 14
    .line 15
    invoke-direct {v6, p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel$getHomeWorks$2;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    const/4 v7, 0x6

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    move-object v1, p0

    .line 23
    invoke-static/range {v1 .. v8}, Lcom/zykj/huiwei/launcher/ext/ViewModelExtKt;->e(Lcom/zykj/base/BaseViewModel;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final z()Lcom/zykj/huiwei/launcher/bean/Location;
    .locals 10

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "location"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "null cannot be cast to non-null type android.location.LocationManager"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v1, Landroid/location/LocationManager;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getProviders(Z)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, "getProviders(...)"

    .line 26
    .line 27
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Lcom/zykj/huiwei/launcher/bean/Location;

    .line 31
    .line 32
    const-string v4, "\u5317\u4eac\u5e02"

    .line 33
    .line 34
    invoke-direct {v3, v4, v4}, Lcom/zykj/huiwei/launcher/bean/Location;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v4, "gps"

    .line 38
    .line 39
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string v4, "network"

    .line 47
    .line 48
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    :goto_0
    :try_start_0
    invoke-virtual {v1, v4}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    new-instance v4, Landroid/location/Geocoder;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 67
    .line 68
    invoke-direct {v4, v0, v2}, Landroid/location/Geocoder;-><init>(Landroid/content/Context;Ljava/util/Locale;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    .line 72
    .line 73
    .line 74
    move-result-wide v5

    .line 75
    invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    const/4 v9, 0x1

    .line 80
    invoke-virtual/range {v4 .. v9}, Landroid/location/Geocoder;->getFromLocation(DDI)Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-lez v1, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    const/4 v0, 0x0

    .line 94
    :goto_1
    if-eqz v0, :cond_2

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Landroid/location/Address;

    .line 102
    .line 103
    if-eqz v0, :cond_2

    .line 104
    .line 105
    new-instance v1, Lcom/zykj/huiwei/launcher/bean/Location;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/location/Address;->getAdminArea()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const-string v4, "getAdminArea(...)"

    .line 112
    .line 113
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Landroid/location/Address;->getLocality()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    const-string v4, "getLocality(...)"

    .line 121
    .line 122
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-direct {v1, v2, v0}, Lcom/zykj/huiwei/launcher/bean/Location;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :catch_0
    move-exception v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 131
    .line 132
    .line 133
    :cond_2
    return-object v3
.end method
