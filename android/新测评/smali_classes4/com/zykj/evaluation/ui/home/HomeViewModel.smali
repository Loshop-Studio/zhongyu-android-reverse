.class public final Lcom/zykj/evaluation/ui/home/HomeViewModel;
.super Lcom/zykj/evaluation/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B7\u0008\u0007\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J+\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00162\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008$\u0010%J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010\'\u001a\u00020&\u00a2\u0006\u0004\u0008(\u0010)J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020&\u00a2\u0006\u0004\u0008+\u0010)J\u001d\u0010/\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008/\u00100J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u001b2\u0008\u0008\u0002\u00101\u001a\u00020-\u00a2\u0006\u0004\u00082\u00100J+\u00108\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u001b2\u0006\u00105\u001a\u0002042\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000f06\u00a2\u0006\u0004\u00088\u00109J!\u0010=\u001a\u00020\u000f2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000f0:\u00a2\u0006\u0004\u0008=\u0010>J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\"\u00a2\u0006\u0004\u0008?\u0010%J!\u0010B\u001a\u00020\u000f2\u0008\u0010@\u001a\u0004\u0018\u00010&2\u0008\u0010A\u001a\u0004\u0018\u00010&\u00a2\u0006\u0004\u0008B\u0010CJ\r\u0010D\u001a\u00020\u000f\u00a2\u0006\u0004\u0008D\u0010\u0011J\r\u0010E\u001a\u00020\u000f\u00a2\u0006\u0004\u0008E\u0010\u0011J\r\u0010F\u001a\u00020\u000f\u00a2\u0006\u0004\u0008F\u0010\u0011R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR+\u0010X\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u001b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR\u001a\u0010[\u001a\u0008\u0012\u0004\u0012\u00020Y0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010HR\u001d\u0010a\u001a\u0008\u0012\u0004\u0012\u00020Y0\\8\u0006\u00a2\u0006\u000c\n\u0004\u0008]\u0010^\u001a\u0004\u0008_\u0010`R\u001a\u0010d\u001a\u0008\u0012\u0004\u0012\u00020b0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010HR\u001d\u0010g\u001a\u0008\u0012\u0004\u0012\u00020b0\\8\u0006\u00a2\u0006\u000c\n\u0004\u0008e\u0010^\u001a\u0004\u0008f\u0010`R\u001a\u0010j\u001a\u0008\u0012\u0004\u0012\u00020h0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008i\u0010HR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR&\u0010p\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010H\u00a8\u0006q"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/home/HomeViewModel;",
        "Lcom/zykj/evaluation/base/BaseViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfoFlow",
        "Lp5/j;",
        "service",
        "Lh7/b;",
        "versionApi",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "submitTaskManger",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lh7/b;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V",
        "",
        "M",
        "()V",
        "Lcom/zykj/evaluation/ui/home/a;",
        "page",
        "Lkotlinx/coroutines/flow/Flow;",
        "Landroidx/paging/PagingData;",
        "Lt6/o0;",
        "D",
        "(Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;",
        "homeDataInfo",
        "",
        "",
        "Lt6/p0;",
        "map",
        "C",
        "(Lt6/o0;Ljava/util/Map;)Lt6/o0;",
        "V",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/evaluation/ui/home/c;",
        "filterType",
        "I",
        "(Lcom/zykj/evaluation/ui/home/c;)V",
        "",
        "newText",
        "E",
        "(Ljava/lang/String;)V",
        "keyword",
        "J",
        "examTaskId",
        "",
        "isFavorite",
        "R",
        "(JZ)V",
        "isRead",
        "S",
        "taskId",
        "",
        "taskState",
        "Lkotlin/Function0;",
        "failedCallback",
        "Q",
        "(JILkotlin/jvm/functions/Function0;)V",
        "Lkotlin/Function1;",
        "Lcom/zykj/evaluation/version/VersionResult;",
        "needUpdateCallback",
        "G",
        "(Lkotlin/jvm/functions/Function1;)V",
        "F",
        "start",
        "end",
        "W",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "L",
        "K",
        "H",
        "c",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "d",
        "Lp5/j;",
        "e",
        "Lh7/b;",
        "f",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "g",
        "Lcom/zykj/evaluation/submit/SubmitTaskManger;",
        "<set-?>",
        "h",
        "Lkotlin/properties/ReadWriteProperty;",
        "P",
        "()J",
        "U",
        "(J)V",
        "_userId",
        "Lcom/zykj/evaluation/ui/home/HomeViewState;",
        "i",
        "_mainUiState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "j",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "O",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "mainUiState",
        "Lcom/zykj/evaluation/ui/home/HomeFilterState;",
        "k",
        "_filterUiState",
        "l",
        "N",
        "filterUiState",
        "Lcom/zykj/evaluation/bean/GetTaskListReq;",
        "m",
        "_taskListReq",
        "Lkotlinx/coroutines/Job;",
        "n",
        "Lkotlinx/coroutines/Job;",
        "databaseFlowJob",
        "o",
        "_modificationEvents",
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
        "SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,715:1\n230#2,5:716\n230#2,3:722\n233#2,2:731\n189#3:721\n1563#4:725\n1634#4,2:726\n1869#4,2:728\n1636#4:730\n1869#4:733\n1563#4:734\n1634#4,3:735\n1870#4:738\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/zykj/evaluation/ui/home/HomeViewModel\n*L\n282#1:716,5\n494#1:722,3\n494#1:731,2\n423#1:721\n496#1:725\n496#1:726,2\n506#1:728,2\n496#1:730\n647#1:733\n650#1:734\n650#1:735,3\n647#1:738\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic p:[Lkotlin/reflect/KProperty;

.field public static final q:I


# instance fields
.field public final c:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final d:Lp5/j;

.field public final e:Lh7/b;

.field public final f:Lcom/zykj/evaluation/di/AppDatabase;

.field public final g:Lcom/zykj/evaluation/submit/SubmitTaskManger;

.field public final h:Lkotlin/properties/ReadWriteProperty;

.field public final i:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final j:Lkotlinx/coroutines/flow/StateFlow;

.field public final k:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final l:Lkotlinx/coroutines/flow/StateFlow;

.field public final m:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public n:Lkotlinx/coroutines/Job;

.field public final o:Lkotlinx/coroutines/flow/MutableStateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    const-class v1, Lcom/zykj/evaluation/ui/home/HomeViewModel;

    const-string v2, "_userId"

    const-string v3, "get_userId()J"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lkotlin/reflect/KProperty;

    aput-object v0, v1, v4

    sput-object v1, Lcom/zykj/evaluation/ui/home/HomeViewModel;->p:[Lkotlin/reflect/KProperty;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->q:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lp5/j;Lh7/b;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/submit/SubmitTaskManger;)V
    .locals 17

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
    move-object/from16 v5, p5

    .line 12
    .line 13
    const-string v6, "userInfoFlow"

    .line 14
    .line 15
    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v6, "service"

    .line 19
    .line 20
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v6, "versionApi"

    .line 24
    .line 25
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v6, "database"

    .line 29
    .line 30
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v6, "submitTaskManger"

    .line 34
    .line 35
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Lcom/zykj/evaluation/base/BaseViewModel;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 42
    .line 43
    iput-object v2, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->d:Lp5/j;

    .line 44
    .line 45
    iput-object v3, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->e:Lh7/b;

    .line 46
    .line 47
    iput-object v4, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->f:Lcom/zykj/evaluation/di/AppDatabase;

    .line 48
    .line 49
    iput-object v5, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->g:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 50
    .line 51
    sget-object v1, Lkotlin/properties/Delegates;->INSTANCE:Lkotlin/properties/Delegates;

    .line 52
    .line 53
    invoke-virtual {v1}, Lkotlin/properties/Delegates;->notNull()Lkotlin/properties/ReadWriteProperty;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 58
    .line 59
    new-instance v2, Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 60
    .line 61
    const/16 v7, 0xf

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v3, 0x0

    .line 65
    const/4 v4, 0x0

    .line 66
    const/4 v5, 0x0

    .line 67
    const/4 v6, 0x0

    .line 68
    invoke-direct/range {v2 .. v8}, Lcom/zykj/evaluation/ui/home/HomeViewState;-><init>(Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->i:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 76
    .line 77
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->j:Lkotlinx/coroutines/flow/StateFlow;

    .line 82
    .line 83
    new-instance v1, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 84
    .line 85
    const/4 v2, 0x1

    .line 86
    invoke-direct {v1, v3, v2, v3}, Lcom/zykj/evaluation/ui/home/HomeFilterState;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 94
    .line 95
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->l:Lkotlinx/coroutines/flow/StateFlow;

    .line 100
    .line 101
    new-instance v4, Lcom/zykj/evaluation/bean/GetTaskListReq;

    .line 102
    .line 103
    const/16 v15, 0x3ff

    .line 104
    .line 105
    const/16 v16, 0x0

    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v6, 0x0

    .line 109
    const/4 v7, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v12, 0x0

    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    invoke-direct/range {v4 .. v16}, Lcom/zykj/evaluation/bean/GetTaskListReq;-><init>(IIILjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v4}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 124
    .line 125
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iput-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 134
    .line 135
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->M()V

    .line 136
    .line 137
    .line 138
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    new-instance v7, Lcom/zykj/evaluation/ui/home/HomeViewModel$1;

    .line 143
    .line 144
    invoke-direct {v7, v0, v3}, Lcom/zykj/evaluation/ui/home/HomeViewModel$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 145
    .line 146
    .line 147
    const/4 v8, 0x3

    .line 148
    const/4 v5, 0x0

    .line 149
    const/4 v6, 0x0

    .line 150
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 151
    .line 152
    .line 153
    return-void
.end method

.method public static final synthetic A(Lcom/zykj/evaluation/ui/home/HomeViewModel;J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->U(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic B(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->V(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic T(Lcom/zykj/evaluation/ui/home/HomeViewModel;JZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->S(JZ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic m(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lt6/o0;Ljava/util/Map;)Lt6/o0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->C(Lt6/o0;Ljava/util/Map;)Lt6/o0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->D(Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lcom/zykj/evaluation/di/AppDatabase;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->f:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/Job;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->n:Lkotlinx/coroutines/Job;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lp5/j;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->d:Lp5/j;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic r(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lcom/zykj/evaluation/submit/SubmitTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->g:Lcom/zykj/evaluation/submit/SubmitTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lh7/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->e:Lh7/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic v(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->i:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic w(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic x(Lcom/zykj/evaluation/ui/home/HomeViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(Lcom/zykj/evaluation/ui/home/HomeViewModel;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/home/HomeViewModel;->P()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic z(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlinx/coroutines/Job;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->n:Lkotlinx/coroutines/Job;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public final C(Lt6/o0;Ljava/util/Map;)Lt6/o0;
    .locals 28

    .line 1
    invoke-virtual/range {p1 .. p1}, Lt6/o0;->f()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object/from16 v1, p2

    .line 10
    .line 11
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lt6/p0;

    .line 16
    .line 17
    if-eqz v0, :cond_4

    .line 18
    .line 19
    invoke-virtual {v0}, Lt6/p0;->d()Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    :goto_0
    move v12, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lt6/o0;->o()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    invoke-virtual {v0}, Lt6/p0;->c()Lt6/q0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_1

    .line 41
    .line 42
    invoke-virtual/range {p1 .. p1}, Lt6/o0;->e()Lt6/q0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    :cond_1
    move-object v13, v1

    .line 47
    invoke-virtual {v0}, Lt6/p0;->e()Ljava/lang/Boolean;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    :goto_2
    move v14, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lt6/o0;->v()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    goto :goto_2

    .line 64
    :goto_3
    const v26, 0x1ff8ff

    .line 65
    .line 66
    .line 67
    const/16 v27, 0x0

    .line 68
    .line 69
    const-wide/16 v3, 0x0

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    const/4 v6, 0x0

    .line 73
    const/4 v7, 0x0

    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x0

    .line 77
    const/4 v11, 0x0

    .line 78
    const/4 v15, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const/16 v17, 0x0

    .line 82
    .line 83
    const/16 v18, 0x0

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    const/16 v20, 0x0

    .line 88
    .line 89
    const/16 v21, 0x0

    .line 90
    .line 91
    const/16 v22, 0x0

    .line 92
    .line 93
    const-wide/16 v23, 0x0

    .line 94
    .line 95
    const/16 v25, 0x0

    .line 96
    .line 97
    move-object/from16 v2, p1

    .line 98
    .line 99
    invoke-static/range {v2 .. v27}, Lt6/o0;->b(Lt6/o0;JLjava/lang/String;Ljava/lang/String;ZZZILjava/lang/String;ZLt6/q0;ZZZZIZZILjava/lang/String;JIILjava/lang/Object;)Lt6/o0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    if-nez v0, :cond_3

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_3
    return-object v0

    .line 107
    :cond_4
    :goto_4
    return-object p1
.end method

.method public final D(Lcom/zykj/evaluation/ui/home/a;)Lkotlinx/coroutines/flow/Flow;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, p0, p1}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$$inlined$flatMapLatest$1;-><init>(Lkotlin/coroutines/Continuation;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lcom/zykj/evaluation/ui/home/a;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlinx/coroutines/flow/FlowKt;->transformLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1, v0}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/flow/Flow;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->o:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    new-instance v1, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, Lcom/zykj/evaluation/ui/home/HomeViewModel$buildDataInfo$2;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, v1}, Lkotlinx/coroutines/flow/FlowKt;->flowCombine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {p1, v0}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/flow/Flow;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public final E(Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "newText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->i:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    :goto_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 14
    .line 15
    const/16 v7, 0xb

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v5, p1

    .line 22
    invoke-static/range {v2 .. v8}, Lcom/zykj/evaluation/ui/home/HomeViewState;->copy$default(Lcom/zykj/evaluation/ui/home/HomeViewState;Ls6/d1;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/home/HomeViewState;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {v0, v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    move-object p1, v5

    .line 34
    goto :goto_0
.end method

.method public final F(Lcom/zykj/evaluation/ui/home/c;)V
    .locals 12

    .line 1
    const-string v0, "filterType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->k:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    :cond_0
    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->getFilterDataList()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    new-instance v4, Ljava/util/ArrayList;

    .line 20
    .line 21
    const/16 v5, 0xa

    .line 22
    .line 23
    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_8

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    move-object v6, v5

    .line 45
    check-cast v6, Ls6/d;

    .line 46
    .line 47
    invoke-virtual {v6}, Ls6/d;->d()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-interface {v5, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_7

    .line 56
    .line 57
    invoke-virtual {v6}, Ls6/d;->g()Lcom/zykj/evaluation/ui/home/c;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    instance-of v5, v5, Lcom/zykj/evaluation/ui/home/c$d;

    .line 62
    .line 63
    if-eqz v5, :cond_6

    .line 64
    .line 65
    sget-object v5, Lcom/zykj/evaluation/ui/home/c$d$a;->d:Lcom/zykj/evaluation/ui/home/c$d$a;

    .line 66
    .line 67
    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    :goto_1
    move-object v9, v5

    .line 78
    goto :goto_3

    .line 79
    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Ls6/d;->c()Ljava/util/List;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    const/4 v8, 0x0

    .line 93
    :cond_2
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    if-eqz v9, :cond_4

    .line 98
    .line 99
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v9

    .line 103
    check-cast v9, Lcom/zykj/evaluation/ui/home/c;

    .line 104
    .line 105
    sget-object v10, Lcom/zykj/evaluation/ui/home/c$d$a;->d:Lcom/zykj/evaluation/ui/home/c$d$a;

    .line 106
    .line 107
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v10

    .line 111
    if-nez v10, :cond_2

    .line 112
    .line 113
    invoke-static {v9, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_3

    .line 118
    .line 119
    const/4 v8, 0x1

    .line 120
    goto :goto_2

    .line 121
    :cond_3
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_2

    .line 125
    :cond_4
    if-nez v8, :cond_5

    .line 126
    .line 127
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_5
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_6
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    goto :goto_1

    .line 138
    :goto_3
    const/4 v10, 0x3

    .line 139
    const/4 v11, 0x0

    .line 140
    const/4 v7, 0x0

    .line 141
    const/4 v8, 0x0

    .line 142
    invoke-static/range {v6 .. v11}, Ls6/d;->b(Ls6/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Ls6/d;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    :cond_7
    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_8
    invoke-virtual {v2, v4}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->copy(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_0

    .line 159
    .line 160
    return-void
.end method

.method public final G(Lkotlin/jvm/functions/Function1;)V
    .locals 10

    .line 1
    const-string v0, "needUpdateCallback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v3, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 7
    .line 8
    new-instance v7, Lcom/zykj/evaluation/ui/home/HomeViewModel$checkVersion$1;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel$checkVersion$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    const/16 v8, 0x1d

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p0

    .line 22
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final H()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/evaluation/ui/home/HomeViewModel$cleanEventsOnRefresh$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final I(Lcom/zykj/evaluation/ui/home/c;)V
    .locals 10

    .line 1
    const-string v0, "filterType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v3, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 7
    .line 8
    new-instance v7, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v7, p1, p0, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel$clearFilterType$1;-><init>(Lcom/zykj/evaluation/ui/home/c;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    const/16 v8, 0x1d

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p0

    .line 22
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final J(Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "keyword"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v3, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 7
    .line 8
    new-instance v7, Lcom/zykj/evaluation/ui/home/HomeViewModel$confirmSearchText$1;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v7, p1, p0, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel$confirmSearchText$1;-><init>(Ljava/lang/String;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    const/16 v8, 0x1d

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v1, p0

    .line 22
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final K()V
    .locals 9

    .line 1
    sget-object v2, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 2
    .line 3
    new-instance v6, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterConfirm$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    const/16 v7, 0x1d

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v0, p0

    .line 17
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final L()V
    .locals 9

    .line 1
    sget-object v2, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 2
    .line 3
    new-instance v6, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterReset$1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel$filterReset$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    const/16 v7, 0x1d

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v0, p0

    .line 17
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final M()V
    .locals 9

    .line 1
    sget-object v2, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 2
    .line 3
    new-instance v6, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {v6, p0, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel$getFilterList$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    const/16 v7, 0x1d

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v0, p0

    .line 17
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final N()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->l:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->j:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P()J
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/home/HomeViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/ReadWriteProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    return-wide v0
.end method

.method public final Q(JILkotlin/jvm/functions/Function0;)V
    .locals 11

    .line 1
    const-string v0, "failedCallback"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v3, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 7
    .line 8
    new-instance v4, Lcom/zykj/evaluation/ui/home/HomeViewModel$recommitFailedData$1;

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    move-object v5, p0

    .line 12
    move-wide v6, p1

    .line 13
    move v8, p3

    .line 14
    move-object v9, p4

    .line 15
    invoke-direct/range {v4 .. v10}, Lcom/zykj/evaluation/ui/home/HomeViewModel$recommitFailedData$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;JILkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    .line 18
    const/16 v8, 0x1d

    .line 19
    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    move-object v7, v4

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    move-object v1, p0

    .line 27
    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final R(JZ)V
    .locals 9

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v2, p1

    .line 6
    move v4, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/home/HomeViewModel$setFavorite$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;JZLkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    .line 10
    const/16 v7, 0x1f

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v6, v0

    .line 18
    move-object v0, p0

    .line 19
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final S(JZ)V
    .locals 9

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeViewModel$setRead$1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-wide v2, p1

    .line 6
    move v4, p3

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/home/HomeViewModel$setRead$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;JZLkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    .line 10
    const/16 v7, 0x1f

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    move-object v6, v0

    .line 18
    move-object v0, p0

    .line 19
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final U(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->h:Lkotlin/properties/ReadWriteProperty;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/ui/home/HomeViewModel;->p:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/ReadWriteProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final V(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->l:Lkotlinx/coroutines/flow/StateFlow;

    .line 4
    .line 5
    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    .line 10
    .line 11
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 12
    .line 13
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->getFilterDataList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v3, 0x0

    .line 25
    move-object v9, v3

    .line 26
    move-object v10, v9

    .line 27
    move-object v11, v10

    .line 28
    move-object v12, v11

    .line 29
    move-object v13, v12

    .line 30
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_7

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    check-cast v3, Ls6/d;

    .line 41
    .line 42
    invoke-virtual {v3}, Ls6/d;->c()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v3}, Ls6/d;->d()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_0

    .line 59
    .line 60
    invoke-virtual {v3}, Ls6/d;->g()Lcom/zykj/evaluation/ui/home/c;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    instance-of v5, v4, Lcom/zykj/evaluation/ui/home/c$d;

    .line 65
    .line 66
    if-eqz v5, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3}, Ls6/d;->c()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v4, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v5, 0xa

    .line 75
    .line 76
    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    check-cast v5, Lcom/zykj/evaluation/ui/home/c;

    .line 98
    .line 99
    const-string v6, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.Subject"

    .line 100
    .line 101
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    check-cast v5, Lcom/zykj/evaluation/ui/home/c$d;

    .line 105
    .line 106
    invoke-virtual {v5}, Lcom/zykj/evaluation/ui/home/c$d;->b()J

    .line 107
    .line 108
    .line 109
    move-result-wide v5

    .line 110
    invoke-static {v5, v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_1
    iput-object v4, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    instance-of v5, v4, Lcom/zykj/evaluation/ui/home/c$b;

    .line 122
    .line 123
    if-eqz v5, :cond_3

    .line 124
    .line 125
    invoke-virtual {v3}, Ls6/d;->c()Ljava/util/List;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v4, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.Grade"

    .line 134
    .line 135
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    check-cast v3, Lcom/zykj/evaluation/ui/home/c$b;

    .line 139
    .line 140
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/c$b;->b()Ljava/lang/Long;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    move-object v9, v3

    .line 145
    goto :goto_0

    .line 146
    :cond_3
    instance-of v5, v4, Lcom/zykj/evaluation/ui/home/c$a;

    .line 147
    .line 148
    if-eqz v5, :cond_4

    .line 149
    .line 150
    invoke-virtual {v3}, Ls6/d;->c()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    const-string v4, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.EvaluationType"

    .line 159
    .line 160
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    check-cast v3, Lcom/zykj/evaluation/ui/home/c$a;

    .line 164
    .line 165
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/c$a;->b()Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    move-object v10, v3

    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_4
    instance-of v5, v4, Lcom/zykj/evaluation/ui/home/c$c;

    .line 173
    .line 174
    if-eqz v5, :cond_5

    .line 175
    .line 176
    invoke-virtual {v3}, Ls6/d;->c()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    const-string v4, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.OverdueType"

    .line 185
    .line 186
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    check-cast v3, Lcom/zykj/evaluation/ui/home/c$c;

    .line 190
    .line 191
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/c$c;->b()Ljava/lang/Integer;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    move-object v11, v3

    .line 196
    goto/16 :goto_0

    .line 197
    .line 198
    :cond_5
    instance-of v4, v4, Lcom/zykj/evaluation/ui/home/c$e;

    .line 199
    .line 200
    if-eqz v4, :cond_6

    .line 201
    .line 202
    invoke-virtual {v3}, Ls6/d;->c()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    const-string v4, "null cannot be cast to non-null type com.zykj.evaluation.ui.home.FilterType.Time"

    .line 211
    .line 212
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    check-cast v3, Lcom/zykj/evaluation/ui/home/c$e;

    .line 216
    .line 217
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/c$e;->c()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    invoke-virtual {v3}, Lcom/zykj/evaluation/ui/home/c$e;->b()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    move-object v13, v3

    .line 226
    move-object v12, v4

    .line 227
    goto/16 :goto_0

    .line 228
    .line 229
    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 230
    .line 231
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 232
    .line 233
    .line 234
    throw v1

    .line 235
    :cond_7
    iget-object v1, v0, Lcom/zykj/evaluation/ui/home/HomeViewModel;->m:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 236
    .line 237
    new-instance v4, Lcom/zykj/evaluation/bean/GetTaskListReq;

    .line 238
    .line 239
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 240
    .line 241
    move-object v8, v2

    .line 242
    check-cast v8, Ljava/util/List;

    .line 243
    .line 244
    const/16 v15, 0x207

    .line 245
    .line 246
    const/16 v16, 0x0

    .line 247
    .line 248
    const/4 v5, 0x0

    .line 249
    const/4 v6, 0x0

    .line 250
    const/4 v7, 0x0

    .line 251
    const/4 v14, 0x0

    .line 252
    invoke-direct/range {v4 .. v16}, Lcom/zykj/evaluation/bean/GetTaskListReq;-><init>(IIILjava/util/List;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v2, p1

    .line 256
    .line 257
    invoke-interface {v1, v4, v2}, Lkotlinx/coroutines/flow/MutableSharedFlow;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    if-ne v1, v2, :cond_8

    .line 266
    .line 267
    return-object v1

    .line 268
    :cond_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 269
    .line 270
    return-object v1
.end method

.method public final W(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    sget-object v2, Lcom/zykj/evaluation/base/a$a;->c:Lcom/zykj/evaluation/base/a$a;

    .line 2
    .line 3
    new-instance v6, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {v6, p0, p1, p2, v0}, Lcom/zykj/evaluation/ui/home/HomeViewModel$updateCustomTime$1;-><init>(Lcom/zykj/evaluation/ui/home/HomeViewModel;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    const/16 v7, 0x1d

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x0

    .line 16
    move-object v0, p0

    .line 17
    invoke-static/range {v0 .. v8}, Lcom/zykj/evaluation/base/BaseViewModel;->f(Lcom/zykj/evaluation/base/BaseViewModel;Ljava/lang/String;Lcom/zykj/evaluation/base/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
