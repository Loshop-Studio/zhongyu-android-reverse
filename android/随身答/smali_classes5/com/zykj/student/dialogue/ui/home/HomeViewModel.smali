# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/student/dialogue/ui/home/HomeViewModel;
.super Lcom/zykj/student/dialogue/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\r\u00a2\u0006\u0004\u0008!\u0010\u0011J\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\r\u00a2\u0006\u0004\u0008\"\u0010\u0011J\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&J\u0015\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\'\u00a2\u0006\u0004\u0008+\u0010*J\r\u0010,\u001a\u00020\u000f\u00a2\u0006\u0004\u0008,\u0010\u0013J\u0015\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00103\u001a\u00020\u000f2\u0008\u00102\u001a\u0004\u0018\u000101\u00a2\u0006\u0004\u00083\u00104J\u001d\u00107\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\r2\u0006\u00106\u001a\u00020\r\u00a2\u0006\u0004\u00087\u00108J\r\u00109\u001a\u00020\u000f\u00a2\u0006\u0004\u00089\u0010\u0013J6\u0010?\u001a\u00020\u000f2\'\u0008\u0002\u0010>\u001a!\u0012\u0015\u0012\u0013\u0018\u00010-\u00a2\u0006\u000c\u0008;\u0012\u0008\u0008<\u0012\u0004\u0008\u0008(=\u0012\u0004\u0012\u00020\u000f\u0018\u00010:\u00a2\u0006\u0004\u0008?\u0010@J&\u0010D\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020-2\u000c\u0010C\u001a\u0008\u0012\u0004\u0012\u00020\u000f0BH\u0086@\u00a2\u0006\u0004\u0008D\u0010EJ\u0018\u0010F\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020-H\u0086@\u00a2\u0006\u0004\u0008F\u0010GJ4\u0010H\u001a\u00020\u000f2%\u0008\u0002\u0010>\u001a\u001f\u0012\u0013\u0012\u00110-\u00a2\u0006\u000c\u0008;\u0012\u0008\u0008<\u0012\u0004\u0008\u0008(=\u0012\u0004\u0012\u00020\u000f\u0018\u00010:\u00a2\u0006\u0004\u0008H\u0010@J+\u0010L\u001a\u0008\u0012\u0004\u0012\u0002010I2\u000c\u0010J\u001a\u0008\u0012\u0004\u0012\u0002010I2\u0006\u0010K\u001a\u000201H\u0002\u00a2\u0006\u0004\u0008L\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008P\u0010Q\u001a\u0004\u0008R\u0010SR\u001f\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008T\u0010U\u001a\u0004\u0008V\u0010WR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u001a\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020Z0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010UR\u001d\u0010b\u001a\u0008\u0012\u0004\u0012\u00020Z0]8\u0006\u00a2\u0006\u000c\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010aR\u001a\u0010e\u001a\u0008\u0012\u0004\u0012\u00020c0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010UR\u001d\u0010h\u001a\u0008\u0012\u0004\u0012\u00020c0]8\u0006\u00a2\u0006\u000c\n\u0004\u0008f\u0010_\u001a\u0004\u0008g\u0010aR\u001a\u0010l\u001a\u0008\u0012\u0004\u0012\u00020#0i8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008j\u0010kR\u001d\u0010r\u001a\u0008\u0012\u0004\u0012\u00020#0m8\u0006\u00a2\u0006\u000c\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010qR\u001c\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0i8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008t\u0010kR\u001f\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010s0m8\u0006\u00a2\u0006\u000c\n\u0004\u0008v\u0010o\u001a\u0004\u0008w\u0010qR!\u0010~\u001a\u0008\u0012\u0004\u0012\u00020-0y8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008z\u0010{\u001a\u0004\u0008|\u0010}\u00a8\u0006\u007f"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;",
        "Lcom/zykj/student/dialogue/base/BaseViewModel;",
        "Lk6/g;",
        "dialogueApi",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "headerLiveData",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfoFlow",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Lk6/g;Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Landroid/app/Application;)V",
        "",
        "baseUrl",
        "",
        "w",
        "(Ljava/lang/String;)V",
        "z",
        "()V",
        "Lcom/zykj/student/dialogue/bean/resp/CatalogResp;",
        "catalogResp",
        "v",
        "(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V",
        "Ls6/l0;",
        "filterUiState",
        "S",
        "(Ls6/l0;)V",
        "Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;",
        "sortType",
        "W",
        "(Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)V",
        "text",
        "M",
        "L",
        "Lcom/zykj/student/dialogue/ui/home/b;",
        "event",
        "K",
        "(Lcom/zykj/student/dialogue/ui/home/b;)V",
        "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;",
        "questionResp",
        "V",
        "(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;)V",
        "N",
        "x",
        "",
        "isShown",
        "U",
        "(Z)V",
        "",
        "catalogId",
        "R",
        "(Ljava/lang/Long;)V",
        "userName",
        "avatar",
        "T",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "O",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "available",
        "callback",
        "H",
        "(Lkotlin/jvm/functions/Function1;)V",
        "isAvailable",
        "Lkotlin/Function0;",
        "showDialog",
        "G",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "P",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "J",
        "",
        "editList",
        "id",
        "Q",
        "(Ljava/util/List;J)Ljava/util/List;",
        "c",
        "Lk6/g;",
        "d",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "C",
        "()Lcom/zykj/http/bean/HeaderLiveData;",
        "e",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "F",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "f",
        "Landroid/app/Application;",
        "Ls6/k0;",
        "g",
        "_filterConditions",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "h",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "A",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "filterConditions",
        "Ls6/s2;",
        "i",
        "_homeUiState",
        "j",
        "E",
        "homeUiState",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "k",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "_homeEvent",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "l",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "D",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "homeEvent",
        "Lcom/zykj/student/dialogue/bean/resp/VersionResult;",
        "m",
        "_hasNewVersion",
        "n",
        "B",
        "hasNewVersion",
        "Landroidx/datastore/preferences/core/Preferences$Key;",
        "o",
        "Lkotlin/Lazy;",
        "y",
        "()Landroidx/datastore/preferences/core/Preferences$Key;",
        "cameraPermissionKey",
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
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,509:1\n230#2,5:510\n49#3:515\n51#3:519\n46#4:516\n51#4:518\n105#5:517\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/student/dialogue/ui/home/HomeViewModel\n*L\n305#1:510,5\n364#1:515\n364#1:519\n364#1:516\n364#1:518\n364#1:517\n*E\n"
    }
.end annotation


# instance fields
.field public final c:Lk6/g;

.field public final d:Lcom/zykj/http/bean/HeaderLiveData;

.field public final e:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final f:Landroid/app/Application;

.field public final g:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final h:Lkotlinx/coroutines/flow/StateFlow;

.field public final i:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final j:Lkotlinx/coroutines/flow/StateFlow;

.field public final k:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final l:Lkotlinx/coroutines/flow/SharedFlow;

.field public final m:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final n:Lkotlinx/coroutines/flow/SharedFlow;

.field public final o:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/g;Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Landroid/app/Application;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-object/from16 v4, p4

    .line 10
    .line 11
    const-string v5, "dialogueApi"

    .line 12
    .line 13
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v5, "headerLiveData"

    .line 17
    .line 18
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v5, "userInfoFlow"

    .line 22
    .line 23
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v5, "application"

    .line 27
    .line 28
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Lcom/zykj/student/dialogue/base/BaseViewModel;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->c:Lk6/g;

    .line 35
    .line 36
    iput-object v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->d:Lcom/zykj/http/bean/HeaderLiveData;

    .line 37
    .line 38
    iput-object v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 39
    .line 40
    iput-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->f:Landroid/app/Application;

    .line 41
    .line 42
    new-instance v6, Ls6/k0;

    .line 43
    .line 44
    const/16 v16, 0x1ff

    .line 45
    .line 46
    const/16 v17, 0x0

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    const/4 v8, 0x0

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    invoke-direct/range {v6 .. v17}, Ls6/k0;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v6}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->g:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 65
    .line 66
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->h:Lkotlinx/coroutines/flow/StateFlow;

    .line 71
    .line 72
    new-instance v2, Ls6/s2;

    .line 73
    .line 74
    const/16 v11, 0xff

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v8, 0x0

    .line 81
    invoke-direct/range {v2 .. v12}, Ls6/s2;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;ZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->i:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 89
    .line 90
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->j:Lkotlinx/coroutines/flow/StateFlow;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    const/4 v2, 0x0

    .line 98
    const/4 v3, 0x7

    .line 99
    invoke-static {v1, v1, v2, v3, v2}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iput-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->k:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 104
    .line 105
    invoke-static {v4}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    iput-object v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->l:Lkotlinx/coroutines/flow/SharedFlow;

    .line 110
    .line 111
    invoke-static {v1, v1, v2, v3, v2}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->m:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 116
    .line 117
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->n:Lkotlinx/coroutines/flow/SharedFlow;

    .line 122
    .line 123
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    new-instance v6, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1;

    .line 128
    .line 129
    invoke-direct {v6, v0, v2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 130
    .line 131
    .line 132
    const/4 v7, 0x3

    .line 133
    const/4 v8, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 136
    .line 137
    .line 138
    new-instance v1, Ls6/t2;

    .line 139
    .line 140
    invoke-direct {v1}, Ls6/t2;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    iput-object v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->o:Lkotlin/Lazy;

    .line 148
    .line 149
    return-void
.end method

.method public static synthetic I(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->H(Lkotlin/jvm/functions/Function1;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic m()Landroidx/datastore/preferences/core/Preferences$Key;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->u()Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic n(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Landroidx/datastore/preferences/core/Preferences$Key;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->y()Landroidx/datastore/preferences/core/Preferences$Key;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Lk6/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->c:Lk6/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->g:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->m:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->k:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->i:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Ljava/util/List;J)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->Q(Ljava/util/List;J)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final u()Landroidx/datastore/preferences/core/Preferences$Key;
    .locals 1

    .line 1
    const-string v0, "camera_permission"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/datastore/preferences/core/PreferencesKeys;->booleanKey(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final A()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->h:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->n:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Lcom/zykj/http/bean/HeaderLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->d:Lcom/zykj/http/bean/HeaderLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->l:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->j:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G(ZLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p3, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->f:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Ljava/lang/Boolean;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 48
    .line 49
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget-boolean p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->a:Z

    .line 62
    .line 63
    iget-object p2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->b:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p2, Lkotlin/jvm/functions/Function0;

    .line 66
    .line 67
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p3, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->f:Landroid/app/Application;

    .line 75
    .line 76
    invoke-static {p3}, Li6/b;->c(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    invoke-interface {p3}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    .line 81
    .line 82
    .line 83
    move-result-object p3

    .line 84
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$$inlined$map$1;

    .line 85
    .line 86
    invoke-direct {v2, p3, p0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;)V

    .line 87
    .line 88
    .line 89
    iput-object p2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->b:Ljava/lang/Object;

    .line 90
    .line 91
    iput-boolean p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->a:Z

    .line 92
    .line 93
    iput v4, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->f:I

    .line 94
    .line 95
    invoke-static {v2, v0}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    if-ne p3, v1, :cond_4

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_4
    :goto_1
    check-cast p3, Ljava/lang/Boolean;

    .line 103
    .line 104
    if-eqz p3, :cond_6

    .line 105
    .line 106
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_6

    .line 115
    .line 116
    iput-object p2, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->b:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    iput-object p3, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->c:Ljava/lang/Object;

    .line 123
    .line 124
    iput-boolean p1, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->a:Z

    .line 125
    .line 126
    iput v3, v0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$handleWaning$1;->f:I

    .line 127
    .line 128
    invoke-virtual {p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->P(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v1, :cond_5

    .line 133
    .line 134
    :goto_2
    return-object v1

    .line 135
    :cond_5
    move-object p1, p2

    .line 136
    :goto_3
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p1
.end method

.method public final H(Lkotlin/jvm/functions/Function1;)V
    .locals 9

    .line 1
    new-instance v5, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraAvailable$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v5, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraAvailable$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    new-instance v6, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraAvailable$2;

    .line 8
    .line 9
    invoke-direct {v6, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraAvailable$2;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v7, 0xf

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v0, p0

    .line 20
    invoke-static/range {v0 .. v8}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final J(Lkotlin/jvm/functions/Function1;)V
    .locals 9

    .line 1
    new-instance v5, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraSystemSettingAvailable$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v5, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraSystemSettingAvailable$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    new-instance v6, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraSystemSettingAvailable$2;

    .line 8
    .line 9
    invoke-direct {v6, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$isCameraSystemSettingAvailable$2;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v7, 0xf

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v0, p0

    .line 20
    invoke-static/range {v0 .. v8}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final K(Lcom/zykj/student/dialogue/ui/home/b;)V
    .locals 7

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$onEvent$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$onEvent$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lcom/zykj/student/dialogue/ui/home/b;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final L(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$onSearch$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$onSearch$1;-><init>(Ljava/lang/String;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final M(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$onTextChanged$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$onTextChanged$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final N(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;)V
    .locals 7

    .line 1
    const-string v0, "questionResp"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$openEditMode$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$openEditMode$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final O()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$resetAllFilterConditions$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$resetAllFilterConditions$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final P(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->f:Landroid/app/Application;

    .line 2
    .line 3
    invoke-static {v0}, Li6/b;->c(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$saveCameraPermission$2;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$saveCameraPermission$2;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    if-ne p1, p2, :cond_0

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p1
.end method

.method public final Q(Ljava/util/List;J)Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->minus(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final R(Ljava/lang/Long;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateCatalogUnreadCount$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateCatalogUnreadCount$1;-><init>(Ljava/lang/Long;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final S(Ls6/l0;)V
    .locals 14

    .line 1
    const-string v0, "filterUiState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->g:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Ls6/k0;

    .line 14
    .line 15
    invoke-virtual {p1}, Ls6/l0;->j()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p1}, Ls6/l0;->h()Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {p1}, Ls6/l0;->e()Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {p1}, Ls6/l0;->g()Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {p1}, Ls6/l0;->d()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-virtual {p1}, Ls6/l0;->i()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-virtual {p1}, Ls6/l0;->f()Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    invoke-virtual {p1}, Ls6/l0;->c()Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    const/16 v12, 0x100

    .line 48
    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v11, 0x0

    .line 51
    invoke-static/range {v2 .. v13}, Ls6/k0;->b(Ls6/k0;Ljava/util/List;Ljava/util/List;Lcom/zykj/student/dialogue/bean/resp/FilterType$QuestionState;Lcom/zykj/student/dialogue/bean/resp/FilterType$Subject;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$JoinedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$UpdatedTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Time$FavoriteTime;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Ljava/lang/String;ILjava/lang/Object;)Ls6/k0;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final T(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "userName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "avatar"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateNameAndAvatar$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, p1, p2, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateNameAndAvatar$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final U(Z)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->i:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Ls6/s2;

    .line 9
    .line 10
    const/16 v11, 0xdf

    .line 11
    .line 12
    const/4 v12, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    const/4 v7, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    move v8, p1

    .line 21
    invoke-static/range {v2 .. v12}, Ls6/s2;->b(Ls6/s2;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;ZLjava/util/List;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ls6/s2;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    move p1, v8

    .line 33
    goto :goto_0
.end method

.method public final V(Lcom/zykj/student/dialogue/bean/resp/QuestionResp;)V
    .locals 7

    .line 1
    const-string v0, "questionResp"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSelectedState$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lcom/zykj/student/dialogue/bean/resp/QuestionResp;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final W(Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;)V
    .locals 7

    .line 1
    const-string v0, "sortType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSortTypeCondition$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$updateSortTypeCondition$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lcom/zykj/student/dialogue/bean/resp/FilterType$Sort;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final v(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;)V
    .locals 7

    .line 1
    const-string v0, "catalogResp"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$catalogSwitch$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$catalogSwitch$1;-><init>(Lcom/zykj/student/dialogue/bean/resp/CatalogResp;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final w(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "baseUrl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$checkVersion$1;-><init>(Ljava/lang/String;Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final x()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$closeEditMode$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$closeEditMode$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final y()Landroidx/datastore/preferences/core/Preferences$Key;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/HomeViewModel;->o:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/datastore/preferences/core/Preferences$Key;

    .line 8
    .line 9
    return-object v0
.end method

.method public final z()V
    .locals 9

    .line 1
    new-instance v5, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$getCategories$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v5, p0, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$getCategories$1;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    new-instance v6, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$getCategories$2;

    .line 8
    .line 9
    invoke-direct {v6, p0, v0}, Lcom/zykj/student/dialogue/ui/home/HomeViewModel$getCategories$2;-><init>(Lcom/zykj/student/dialogue/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v7, 0xf

    .line 13
    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    move-object v0, p0

    .line 20
    invoke-static/range {v0 .. v8}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
