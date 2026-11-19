.class public final Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;
.super Lcom/zykj/student/dialogue/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \'2\u00020\u0001:\u0001(B\u0019\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0017\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001d\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001d0!8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;",
        "Lcom/zykj/student/dialogue/base/BaseViewModel;",
        "Lk6/g;",
        "dialogueApi",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "ossTaskManger",
        "<init>",
        "(Lk6/g;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V",
        "Lcom/zykj/student/dialogue/bean/resp/CollectSession;",
        "collectSession",
        "",
        "o",
        "(Lcom/zykj/student/dialogue/bean/resp/CollectSession;)V",
        "",
        "imageUrl",
        "q",
        "(Ljava/lang/String;)V",
        "sessionId",
        "",
        "collected",
        "r",
        "(Ljava/lang/String;Z)V",
        "fileAbsolutePath",
        "s",
        "c",
        "Lk6/g;",
        "d",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lm6/k0;",
        "e",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "_uiState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "f",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "p",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "uiState",
        "g",
        "a",
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


# static fields
.field public static final g:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$a;

.field public static final h:I


# instance fields
.field public final c:Lk6/g;

.field public final d:Lcom/zykj/student/dialogue/upload/OssTaskManger;

.field public final e:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final f:Lkotlinx/coroutines/flow/StateFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->g:Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->h:I

    return-void
.end method

.method public constructor <init>(Lk6/g;Lcom/zykj/student/dialogue/upload/OssTaskManger;)V
    .locals 1

    .line 1
    const-string v0, "dialogueApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ossTaskManger"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/student/dialogue/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->c:Lk6/g;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->d:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 17
    .line 18
    new-instance p1, Lm6/k0;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-direct {p1, p2, v0, p2}, Lm6/k0;-><init>(Lkotlin/Result;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 30
    .line 31
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->f:Lkotlinx/coroutines/flow/StateFlow;

    .line 36
    .line 37
    return-void
.end method

.method public static final synthetic m(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;)Lk6/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->c:Lk6/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final o(Lcom/zykj/student/dialogue/bean/resp/CollectSession;)V
    .locals 10

    .line 1
    const-string v0, "collectSession"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p1, p0, v0}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$changeCollect$1;-><init>(Lcom/zykj/student/dialogue/bean/resp/CollectSession;Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v8, 0x1f

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v9}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final p()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->f:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q(Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "imageUrl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v7, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v7, p0, p1, v0}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$searchQuestions$1;-><init>(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/16 v8, 0x1d

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x1

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v9}, Lcom/zykj/student/dialogue/base/BaseViewModel;->f(Lcom/zykj/student/dialogue/base/BaseViewModel;Ljava/lang/String;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final r(Ljava/lang/String;Z)V
    .locals 7

    .line 1
    const-string v0, "sessionId"

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
    new-instance v4, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, p2, v0}, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel$updateLocalCollectState$1;-><init>(Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

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

.method public final s(Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "fileAbsolutePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/ask/SearchQuestionViewModel;->d:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 7
    .line 8
    const/16 v7, 0x1c

    .line 9
    .line 10
    const/4 v8, 0x0

    .line 11
    const-string v2, "UPLOAD_SEARCH_IMAGE_WORK_NAME"

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v3, p1

    .line 17
    invoke-static/range {v1 .. v8}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->f(Lcom/zykj/student/dialogue/upload/OssTaskManger;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest;

    .line 18
    .line 19
    .line 20
    return-void
.end method
