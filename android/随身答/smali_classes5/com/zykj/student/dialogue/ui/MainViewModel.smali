.class public final Lcom/zykj/student/dialogue/ui/MainViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000f\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/MainViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "headerLiveData",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "userInfoFlow",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "ossTaskManger",
        "<init>",
        "(Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "serverInfo",
        "",
        "d",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V",
        "userInfo",
        "e",
        "(Lcom/zykj/message/server/bean/UserInfo;)V",
        "f",
        "()V",
        "a",
        "Lcom/zykj/http/bean/HeaderLiveData;",
        "c",
        "()Lcom/zykj/http/bean/HeaderLiveData;",
        "b",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
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


# instance fields
.field public final a:Lcom/zykj/http/bean/HeaderLiveData;

.field public final b:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final c:Lcom/zykj/student/dialogue/upload/OssTaskManger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/http/bean/HeaderLiveData;Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V
    .locals 1

    .line 1
    const-string v0, "headerLiveData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userInfoFlow"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ossTaskManger"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/MainViewModel;->a:Lcom/zykj/http/bean/HeaderLiveData;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/MainViewModel;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/MainViewModel;->c:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/student/dialogue/ui/MainViewModel;)Lcom/zykj/student/dialogue/upload/OssTaskManger;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/MainViewModel;->c:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/student/dialogue/ui/MainViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/MainViewModel;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c()Lcom/zykj/http/bean/HeaderLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainViewModel;->a:Lcom/zykj/http/bean/HeaderLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/MainViewModel$updateServerInfo$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/student/dialogue/ui/MainViewModel$updateServerInfo$1;-><init>(Lcom/zykj/message/server/bean/ServerInfo;Lcom/zykj/student/dialogue/ui/MainViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final e(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/MainViewModel$updateUserInfo$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/zykj/student/dialogue/ui/MainViewModel$updateUserInfo$1;-><init>(Lcom/zykj/message/server/bean/UserInfo;Lcom/zykj/student/dialogue/ui/MainViewModel;Lkotlin/coroutines/Continuation;)V

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

.method public final f()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/student/dialogue/ui/MainViewModel$uploadLog$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/zykj/student/dialogue/ui/MainViewModel$uploadLog$1;-><init>(Lcom/zykj/student/dialogue/ui/MainViewModel;Lkotlin/coroutines/Continuation;)V

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
