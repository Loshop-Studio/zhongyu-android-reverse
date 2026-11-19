.class public final Lcom/zykj/evaluation/ui/MainViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B?\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0008\u0001\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010!R\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00080\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/MainViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/http/bean/HeaderBean;",
        "headerBeanFlow",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/zykj/lib/error/code/ErrorCode;",
        "unauthorizedFlow",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "_userFlow",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "workManger",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "serverInfo",
        "",
        "g",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V",
        "userInfo",
        "h",
        "(Lcom/zykj/message/server/bean/UserInfo;)V",
        "i",
        "()V",
        "a",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "d",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "b",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "e",
        "()Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "c",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "f",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "userFlow",
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
        "SMAP\nMainViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewModel.kt\ncom/zykj/evaluation/ui/MainViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,106:1\n230#2,5:107\n*S KotlinDebug\n*F\n+ 1 MainViewModel.kt\ncom/zykj/evaluation/ui/MainViewModel\n*L\n45#1:107,5\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final b:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final c:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final d:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final e:Lkotlinx/coroutines/flow/StateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/evaluation/upload/OssTaskManger;)V
    .locals 7

    .line 1
    const-string v0, "headerBeanFlow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "unauthorizedFlow"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "_userFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "workManger"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/evaluation/ui/MainViewModel;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/evaluation/ui/MainViewModel;->b:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/zykj/evaluation/ui/MainViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/zykj/evaluation/ui/MainViewModel;->d:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 31
    .line 32
    new-instance p1, Ls5/q3;

    .line 33
    .line 34
    invoke-direct {p1}, Ls5/q3;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {p3, p1}, Lkotlinx/coroutines/flow/FlowKt;->distinctUntilChangedBy(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/Flow;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    sget-object v0, Lkotlinx/coroutines/flow/SharingStarted;->Companion:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 46
    .line 47
    const/4 v5, 0x2

    .line 48
    const/4 v6, 0x0

    .line 49
    const-wide/16 v1, 0x1388

    .line 50
    .line 51
    const-wide/16 v3, 0x0

    .line 52
    .line 53
    invoke-static/range {v0 .. v6}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->WhileSubscribed$default(Lkotlinx/coroutines/flow/SharingStarted$Companion;JJILjava/lang/Object;)Lkotlinx/coroutines/flow/SharingStarted;

    .line 54
    .line 55
    .line 56
    move-result-object p3

    .line 57
    new-instance p4, Lcom/zykj/message/server/bean/UserInfo;

    .line 58
    .line 59
    invoke-direct {p4}, Lcom/zykj/message/server/bean/UserInfo;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, p2, p3, p4}, Lkotlinx/coroutines/flow/FlowKt;->stateIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lcom/zykj/evaluation/ui/MainViewModel;->e:Lkotlinx/coroutines/flow/StateFlow;

    .line 67
    .line 68
    return-void
.end method

.method public static synthetic a(Lcom/zykj/message/server/bean/UserInfo;)Ljava/lang/Long;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/MainViewModel;->j(Lcom/zykj/message/server/bean/UserInfo;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/ui/MainViewModel;)Lcom/zykj/evaluation/upload/OssTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/MainViewModel;->d:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/evaluation/ui/MainViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/ui/MainViewModel;->c:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final j(Lcom/zykj/message/server/bean/UserInfo;)Ljava/lang/Long;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final d()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/MainViewModel;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/MainViewModel;->b:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/MainViewModel;->e:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 10

    .line 1
    const-string v0, "serverInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/evaluation/ui/MainViewModel;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

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
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {p1}, Lcom/zykj/message/server/bean/ServerInfo;->c()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    const/16 v8, 0x13

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    invoke-static/range {v2 .. v9}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v0, v1, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    return-void
.end method

.method public final h(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 7

    .line 1
    const-string v0, "userInfo"

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
    new-instance v4, Lcom/zykj/evaluation/ui/MainViewModel$update$2;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/evaluation/ui/MainViewModel$update$2;-><init>(Lcom/zykj/evaluation/ui/MainViewModel;Lcom/zykj/message/server/bean/UserInfo;Lkotlin/coroutines/Continuation;)V

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

.method public final i()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/evaluation/ui/MainViewModel$uploadLog$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/evaluation/ui/MainViewModel$uploadLog$1;-><init>(Lcom/zykj/evaluation/ui/MainViewModel;Lkotlin/coroutines/Continuation;)V

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
