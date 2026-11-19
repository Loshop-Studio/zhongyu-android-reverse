.class public final Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;
.super Lcom/zykj/student/dialogue/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0011\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J?\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000c2\u0006\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u000c2\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u001a2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ,\u0010#\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u001f0!2\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001fH\u0086@\u00a2\u0006\u0004\u0008#\u0010$J\u001e\u0010\'\u001a\u00020\u00112\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u000c0%H\u0086@\u00a2\u0006\u0004\u0008\'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u00101\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u00103\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00100R$\u0010\u0010\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u001d\u0010C\u001a\u0008\u0012\u0004\u0012\u00020:0>8\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010B\u00a8\u0006D"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;",
        "Lcom/zykj/student/dialogue/base/BaseViewModel;",
        "Lk6/g;",
        "dialogueApi",
        "Landroidx/work/WorkManager;",
        "workManager",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "ossTaskManger",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Lk6/g;Landroidx/work/WorkManager;Lcom/zykj/student/dialogue/upload/OssTaskManger;Landroid/app/Application;)V",
        "",
        "r",
        "()Ljava/lang/String;",
        "",
        "previewImageAdded",
        "",
        "u",
        "(Z)V",
        "sessionId",
        "contentUrl",
        "screenshotUrl",
        "o",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "courseId",
        "",
        "answerUserIds",
        "summary",
        "p",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V",
        "",
        "imagePathList",
        "Lkotlinx/coroutines/flow/Flow;",
        "Landroidx/work/WorkInfo;",
        "v",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "imageUrls",
        "t",
        "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "c",
        "Lk6/g;",
        "d",
        "Landroidx/work/WorkManager;",
        "e",
        "Lcom/zykj/student/dialogue/upload/OssTaskManger;",
        "f",
        "Ljava/lang/String;",
        "dirName",
        "g",
        "filePath",
        "value",
        "h",
        "Z",
        "s",
        "()Z",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/zykj/student/dialogue/ui/detail/viewmodel/c;",
        "i",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "_event",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "j",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "q",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "event",
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
        "SMAP\nNewAnswerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewAnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,193:1\n1563#2:194\n1634#2,3:195\n1563#2:198\n1634#2,3:199\n*S KotlinDebug\n*F\n+ 1 NewAnswerViewModel.kt\ncom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel\n*L\n120#1:194\n120#1:195,3\n166#1:198\n166#1:199,3\n*E\n"
    }
.end annotation


# instance fields
.field public final c:Lk6/g;

.field public final d:Landroidx/work/WorkManager;

.field public final e:Lcom/zykj/student/dialogue/upload/OssTaskManger;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public h:Z

.field public final i:Lkotlinx/coroutines/flow/MutableSharedFlow;

.field public final j:Lkotlinx/coroutines/flow/SharedFlow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lk6/g;Landroidx/work/WorkManager;Lcom/zykj/student/dialogue/upload/OssTaskManger;Landroid/app/Application;)V
    .locals 1

    .line 1
    const-string v0, "dialogueApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workManager"

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
    const-string v0, "application"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/zykj/student/dialogue/base/BaseViewModel;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->c:Lk6/g;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->d:Landroidx/work/WorkManager;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->e:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 29
    .line 30
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const-string p2, "toString(...)"

    .line 39
    .line 40
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->f:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p4}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    const/4 p3, 0x0

    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-object p2, p3

    .line 58
    :goto_0
    new-instance p4, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string p2, "/Dialogue/lesson/"

    .line 67
    .line 68
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->g:Ljava/lang/String;

    .line 79
    .line 80
    const/4 p1, 0x7

    .line 81
    const/4 p2, 0x0

    .line 82
    invoke-static {p2, p2, p3, p1, p3}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->i:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 87
    .line 88
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->j:Lkotlinx/coroutines/flow/SharedFlow;

    .line 93
    .line 94
    return-void
.end method

.method public static final synthetic m(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lk6/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->c:Lk6/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->i:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "sessionId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentUrl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "screenshotUrl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p0

    .line 24
    move-object v4, p1

    .line 25
    move-object v6, p2

    .line 26
    move-object v5, p3

    .line 27
    invoke-direct/range {v2 .. v7}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$addAnswer$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x3

    .line 31
    const/4 v6, 0x0

    .line 32
    move-object v4, v2

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    .line 1
    const-string v0, "courseId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "contentUrl"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "screenshotUrl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    move-object v3, p0

    .line 24
    move-object v5, p1

    .line 25
    move-object v7, p2

    .line 26
    move-object v6, p3

    .line 27
    move-object v4, p4

    .line 28
    move-object v8, p5

    .line 29
    invoke-direct/range {v2 .. v9}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$createSession$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 30
    .line 31
    .line 32
    const/4 v5, 0x3

    .line 33
    const/4 v6, 0x0

    .line 34
    move-object v4, v2

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final q()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->j:Lkotlinx/coroutines/flow/SharedFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final t(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->e:I

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
    iput v1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->e:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/util/Set;

    .line 41
    .line 42
    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 60
    .line 61
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->c:Lk6/g;

    .line 62
    .line 63
    new-instance v2, Lcom/zykj/student/dialogue/bean/req/MonitorPictureReq;

    .line 64
    .line 65
    const-string v4, "\u968f\u8eab\u7b54"

    .line 66
    .line 67
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppPackageName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-string v6, "getAppPackageName(...)"

    .line 72
    .line 73
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    move-object v6, p1

    .line 77
    check-cast v6, Ljava/lang/Iterable;

    .line 78
    .line 79
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-direct {v2, v4, v5, v6}, Lcom/zykj/student/dialogue/bean/req/MonitorPictureReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->a:Ljava/lang/Object;

    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    iput p1, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->b:I

    .line 94
    .line 95
    iput v3, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$monitorPictures$1;->e:I

    .line 96
    .line 97
    invoke-interface {p2, v2, v0}, Lk6/g;->i(Lcom/zykj/student/dialogue/bean/req/MonitorPictureReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    if-ne p2, v1, :cond_3

    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_3
    :goto_1
    check-cast p2, Lcom/zykj/student/dialogue/network/BaseResponse;

    .line 105
    .line 106
    invoke-static {p2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :goto_2
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 111
    .line 112
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p1
.end method

.method public final u(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method public final v(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->j:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->j:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;-><init>(Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->h:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->j:I

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/16 v6, 0xa

    .line 39
    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    if-ne v4, v7, :cond_1

    .line 44
    .line 45
    iget-object v3, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->e:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 48
    .line 49
    iget-object v4, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->d:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Ljava/io/File;

    .line 52
    .line 53
    iget-object v4, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->c:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v4, Ljava/util/List;

    .line 56
    .line 57
    iget-object v7, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, Ljava/util/List;

    .line 60
    .line 61
    iget-object v2, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->a:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Ljava/util/List;

    .line 64
    .line 65
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :catchall_0
    move-exception v0

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0

    .line 81
    :cond_2
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    new-instance v4, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    new-instance v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    move-object/from16 v8, p1

    .line 92
    .line 93
    invoke-static {v8, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 94
    .line 95
    .line 96
    move-result v9

    .line 97
    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v10

    .line 108
    if-eqz v10, :cond_3

    .line 109
    .line 110
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    move-object v12, v10

    .line 115
    check-cast v12, Ljava/lang/String;

    .line 116
    .line 117
    iget-object v11, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->e:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 118
    .line 119
    const-string v10, "ADDED_IMAGE"

    .line 120
    .line 121
    filled-new-array {v10}, [Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v16

    .line 125
    const/16 v17, 0xc

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v15, 0x0

    .line 131
    move-object v13, v12

    .line 132
    invoke-static/range {v11 .. v18}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->f(Lcom/zykj/student/dialogue/upload/OssTaskManger;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_3
    invoke-interface {v4, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 141
    .line 142
    .line 143
    new-instance v0, Ljava/io/File;

    .line 144
    .line 145
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->r()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    const-string v10, "page_router.bin"

    .line 150
    .line 151
    invoke-direct {v0, v9, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 155
    .line 156
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 157
    .line 158
    .line 159
    :try_start_1
    sget-object v10, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 160
    .line 161
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    new-instance v11, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$requestList$1$2$1;

    .line 166
    .line 167
    invoke-direct {v11, v0, v9, v1, v5}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$requestList$1$2$1;-><init>(Ljava/io/File;Lkotlin/jvm/internal/Ref$ObjectRef;Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;Lkotlin/coroutines/Continuation;)V

    .line 168
    .line 169
    .line 170
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    iput-object v8, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->a:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v4, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->b:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v4, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->c:Ljava/lang/Object;

    .line 179
    .line 180
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iput-object v0, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->d:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v9, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->e:Ljava/lang/Object;

    .line 187
    .line 188
    const/4 v0, 0x0

    .line 189
    iput v0, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->f:I

    .line 190
    .line 191
    iput v0, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->g:I

    .line 192
    .line 193
    iput v7, v2, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$1;->j:I

    .line 194
    .line 195
    invoke-static {v10, v11, v2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 199
    if-ne v0, v3, :cond_4

    .line 200
    .line 201
    return-object v3

    .line 202
    :cond_4
    move-object v7, v4

    .line 203
    move-object v3, v9

    .line 204
    :goto_2
    :try_start_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 205
    .line 206
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    goto :goto_4

    .line 211
    :catchall_1
    move-exception v0

    .line 212
    move-object v7, v4

    .line 213
    move-object v3, v9

    .line 214
    :goto_3
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 215
    .line 216
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isSuccess-impl(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-eqz v2, :cond_5

    .line 229
    .line 230
    move-object v2, v0

    .line 231
    check-cast v2, Lkotlin/Unit;

    .line 232
    .line 233
    iget-object v2, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 234
    .line 235
    move-object v9, v2

    .line 236
    check-cast v9, Ljava/lang/String;

    .line 237
    .line 238
    if-eqz v9, :cond_5

    .line 239
    .line 240
    iget-object v8, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->e:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 241
    .line 242
    const-string v2, "SCREENSHOT"

    .line 243
    .line 244
    filled-new-array {v2}, [Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v13

    .line 248
    const/16 v14, 0xc

    .line 249
    .line 250
    const/4 v15, 0x0

    .line 251
    const/4 v11, 0x0

    .line 252
    const/4 v12, 0x0

    .line 253
    move-object v10, v9

    .line 254
    invoke-static/range {v8 .. v15}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->f(Lcom/zykj/student/dialogue/upload/OssTaskManger;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    :cond_5
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_6

    .line 266
    .line 267
    new-instance v0, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$requestList$1$4$1;

    .line 268
    .line 269
    invoke-direct {v0, v5}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel$uploadFile$requestList$1$4$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 270
    .line 271
    .line 272
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    return-object v0

    .line 277
    :cond_6
    iget-object v8, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->e:Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 278
    .line 279
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->r()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->r()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v10

    .line 287
    const-string v0, "ZIP"

    .line 288
    .line 289
    filled-new-array {v0}, [Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    const/16 v14, 0x8

    .line 294
    .line 295
    const/4 v15, 0x0

    .line 296
    const/4 v11, 0x1

    .line 297
    const/4 v12, 0x0

    .line 298
    invoke-static/range {v8 .. v15}, Lcom/zykj/student/dialogue/upload/OssTaskManger;->f(Lcom/zykj/student/dialogue/upload/OssTaskManger;Ljava/lang/String;Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    iget-object v0, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->d:Landroidx/work/WorkManager;

    .line 306
    .line 307
    invoke-virtual {v0, v7}, Landroidx/work/WorkManager;->enqueue(Ljava/util/List;)Landroidx/work/Operation;

    .line 308
    .line 309
    .line 310
    iget-object v0, v1, Lcom/zykj/student/dialogue/ui/detail/viewmodel/NewAnswerViewModel;->d:Landroidx/work/WorkManager;

    .line 311
    .line 312
    sget-object v2, Landroidx/work/WorkQuery$Builder;->Companion:Landroidx/work/WorkQuery$Builder$Companion;

    .line 313
    .line 314
    new-instance v3, Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 317
    .line 318
    .line 319
    move-result v4

    .line 320
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    if-eqz v5, :cond_7

    .line 332
    .line 333
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    check-cast v5, Landroidx/work/OneTimeWorkRequest;

    .line 338
    .line 339
    invoke-virtual {v5}, Landroidx/work/WorkRequest;->getId()Ljava/util/UUID;

    .line 340
    .line 341
    .line 342
    move-result-object v5

    .line 343
    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_7
    invoke-virtual {v2, v3}, Landroidx/work/WorkQuery$Builder$Companion;->fromIds(Ljava/util/List;)Landroidx/work/WorkQuery$Builder;

    .line 348
    .line 349
    .line 350
    move-result-object v2

    .line 351
    invoke-virtual {v2}, Landroidx/work/WorkQuery$Builder;->build()Landroidx/work/WorkQuery;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v0, v2}, Landroidx/work/WorkManager;->getWorkInfosLiveData(Landroidx/work/WorkQuery;)Landroidx/lifecycle/LiveData;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Lkotlinx/coroutines/flow/Flow;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    return-object v0
.end method
