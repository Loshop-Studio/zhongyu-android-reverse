.class public final Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;
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
        Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB-\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ4\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00120\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;",
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
        "SMAP\nSubmitCorrectSelfWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitCorrectSelfWork.kt\ncom/zykj/evaluation/submit/SubmitCorrectSelfWork\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,86:1\n49#2:87\n51#2:91\n46#3:88\n51#3:90\n105#4:89\n*S KotlinDebug\n*F\n+ 1 SubmitCorrectSelfWork.kt\ncom/zykj/evaluation/submit/SubmitCorrectSelfWork\n*L\n61#1:87\n61#1:91\n61#1:88\n61#1:90\n61#1:89\n*E\n"
    }
.end annotation


# static fields
.field public static final h:Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;

.field public static final i:I


# instance fields
.field public final f:Lp5/j;

.field public final g:Lcom/zykj/evaluation/di/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->h:Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->i:I

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
    iput-object p3, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->f:Lp5/j;

    .line 25
    .line 26
    iput-object p4, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2
    .line 3
    return-object p1
.end method

.method public g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ln5/a;->i()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {p0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ln5/a;->h()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v6, "TASK_STATE"

    .line 28
    .line 29
    const/4 v7, -0x1

    .line 30
    invoke-virtual {v0, v6, v7}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    move-object v7, p1

    .line 35
    invoke-interface/range {v1 .. v7}, Ln5/p;->a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    instance-of v0, p1, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->d:I

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
    iput v1, v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;-><init>(Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->d:I

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
    goto :goto_1

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
    iget-object p1, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->f:Lp5/j;

    .line 62
    .line 63
    iput-wide v4, v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->a:J

    .line 64
    .line 65
    iput v3, v0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$submitTask$1;->d:I

    .line 66
    .line 67
    invoke-interface {p1, v4, v5, v0}, Lp5/j;->i(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    if-ne p1, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 75
    .line 76
    invoke-static {p1}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p1
.end method

.method public o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p6, p0, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {p6}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

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
    invoke-interface/range {v0 .. v5}, Ln5/p;->e(JJI)Lkotlinx/coroutines/flow/Flow;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1;

    .line 15
    .line 16
    invoke-direct {p2, p1}, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$uploadCommitStateList$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    .line 17
    .line 18
    .line 19
    return-object p2
.end method
