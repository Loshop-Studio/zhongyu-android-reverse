.class public final Lcom/zykj/evaluation/submit/SubmitNormalWork;
.super Lcom/zykj/evaluation/submit/SubmitWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/hilt/work/HiltWorker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/submit/SubmitNormalWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB-\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ4\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00120\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/evaluation/submit/SubmitNormalWork;",
        "Lcom/zykj/evaluation/submit/SubmitWork;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lp5/j;",
        "service",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;)V",
        "",
        "userId",
        "taskId",
        "",
        "taskState",
        "Lkotlinx/coroutines/flow/Flow;",
        "",
        "o",
        "(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "m",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "f",
        "g",
        "Lp5/j;",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "h",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSubmitNormalWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitNormalWork.kt\ncom/zykj/evaluation/submit/SubmitNormalWork\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,108:1\n49#2:109\n51#2:113\n46#3:110\n51#3:112\n105#4:111\n*S KotlinDebug\n*F\n+ 1 SubmitNormalWork.kt\ncom/zykj/evaluation/submit/SubmitNormalWork\n*L\n65#1:109\n65#1:113\n65#1:110\n65#1:112\n65#1:111\n*E\n"
    }
.end annotation


# static fields
.field public static final h:Lcom/zykj/evaluation/submit/SubmitNormalWork$a;

.field public static final i:I


# instance fields
.field public final f:Lp5/j;

.field public final g:Lcom/zykj/evaluation/di/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/submit/SubmitNormalWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/submit/SubmitNormalWork;->h:Lcom/zykj/evaluation/submit/SubmitNormalWork$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/submit/SubmitNormalWork;->i:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerParams"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "service"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "database"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p4}, Lcom/zykj/evaluation/submit/SubmitWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/di/AppDatabase;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork;->f:Lp5/j;

    .line 25
    .line 26
    iput-object p4, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ln5/a;->h()J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "TASK_STATE"

    .line 14
    .line 15
    const/4 v1, -0x1

    .line 16
    invoke-virtual {p1, v0, v1}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "USER_ID"

    .line 25
    .line 26
    const-wide/16 v2, -0x1

    .line 27
    .line 28
    invoke-virtual {v0, v1, v2, v3}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    new-instance v0, Lg7/e;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/zykj/evaluation/bean/GetTaskListKt;->convertToTaskState(I)Lcom/zykj/evaluation/bean/TaskState;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct/range {v0 .. v5}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 39
    .line 40
    .line 41
    sget-object p1, Lg7/e;->d:Lg7/e$a;

    .line 42
    .line 43
    invoke-virtual {p1}, Lg7/e$a;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {v0, p1}, Lg7/e;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p1
.end method

.method public g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "TASK_STATE"

    .line 6
    .line 7
    const/4 v2, -0x1

    .line 8
    invoke-virtual {v0, v1, v2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 9
    .line 10
    .line 11
    move-result v8

    .line 12
    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-virtual {p0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ln5/a;->i()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-virtual {p0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ln5/a;->h()J

    .line 31
    .line 32
    .line 33
    move-result-wide v6

    .line 34
    move-object v9, p1

    .line 35
    invoke-interface/range {v3 .. v9}, Ln5/w;->c(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-ne p1, v0, :cond_0

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p1
.end method

.method public m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p1, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->g:I

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
    iput v1, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;-><init>(Lcom/zykj/evaluation/submit/SubmitNormalWork;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->g:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ln5/a;->h()J

    .line 58
    .line 59
    .line 60
    move-result-wide v4

    .line 61
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v2, "TASK_STATE"

    .line 66
    .line 67
    const/4 v6, -0x1

    .line 68
    invoke-virtual {p1, v2, v6}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v6, "USER_ID"

    .line 77
    .line 78
    const-wide/16 v7, -0x1

    .line 79
    .line 80
    invoke-virtual {v2, v6, v7, v8}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 81
    .line 82
    .line 83
    move-result-wide v6

    .line 84
    sget-object v2, Lcom/zykj/evaluation/bean/TaskState$ToCorrect;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToCorrect;

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-ne p1, v2, :cond_3

    .line 91
    .line 92
    move v2, v3

    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/4 v2, 0x0

    .line 95
    :goto_1
    iget-object v8, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork;->f:Lp5/j;

    .line 96
    .line 97
    iput-wide v4, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->a:J

    .line 98
    .line 99
    iput p1, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->c:I

    .line 100
    .line 101
    iput-wide v6, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->b:J

    .line 102
    .line 103
    iput v2, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->d:I

    .line 104
    .line 105
    iput v3, v0, Lcom/zykj/evaluation/submit/SubmitNormalWork$submitTask$1;->g:I

    .line 106
    .line 107
    invoke-interface {v8, v4, v5, v2, v0}, Lp5/j;->m(JZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v1, :cond_4

    .line 112
    .line 113
    return-object v1

    .line 114
    :cond_4
    :goto_2
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 115
    .line 116
    invoke-static {p1}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p1
.end method

.method public o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p6, p0, Lcom/zykj/evaluation/submit/SubmitNormalWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {p6}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-wide v1, p1

    .line 8
    move-wide v3, p3

    .line 9
    move v5, p5

    .line 10
    invoke-interface/range {v0 .. v5}, Ln5/w;->e(JJI)Lkotlinx/coroutines/flow/Flow;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Lcom/zykj/evaluation/submit/SubmitNormalWork$uploadCommitStateList$$inlined$map$1;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Lcom/zykj/evaluation/submit/SubmitNormalWork$uploadCommitStateList$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    .line 17
    .line 18
    .line 19
    return-object p2
.end method
