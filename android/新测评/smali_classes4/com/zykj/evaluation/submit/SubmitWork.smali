.class public abstract Lcom/zykj/evaluation/submit/SubmitWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/submit/SubmitWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\'\u0018\u0000 ,2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ4\u0010\u0011\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u00a6@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0013H\u00a6@\u00a2\u0006\u0004\u0008\u0017\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0015J\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0004\u0008\u001f\u0010 J$\u0010\"\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\u001dH\u0082@\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R$\u0010+\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001a8\u0004@BX\u0084.\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\u00a8\u0006-"
    }
    d2 = {
        "Lcom/zykj/evaluation/submit/SubmitWork;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/di/AppDatabase;)V",
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
        "g",
        "f",
        "Landroidx/work/ListenableWorker$Result;",
        "doWork",
        "Ln5/a;",
        "k",
        "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "key",
        "n",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "extra",
        "i",
        "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "value",
        "b",
        "Ln5/a;",
        "l",
        "()Ln5/a;",
        "submitTask",
        "c",
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
        "SMAP\nSubmitWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork\n+ 2 Data.kt\nandroidx/work/DataKt\n*L\n1#1,206:1\n31#2,5:207\n31#2,5:212\n*S KotlinDebug\n*F\n+ 1 SubmitWork.kt\ncom/zykj/evaluation/submit/SubmitWork\n*L\n166#1:207,5\n203#1:212,5\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/evaluation/submit/SubmitWork$a;

.field public static final d:I

.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Lcom/zykj/evaluation/di/AppDatabase;

.field public b:Ln5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/evaluation/submit/SubmitWork$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/evaluation/submit/SubmitWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/evaluation/submit/SubmitWork;->c:Lcom/zykj/evaluation/submit/SubmitWork$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/zykj/evaluation/submit/SubmitWork;->d:I

    .line 12
    .line 13
    const-class v0, Lcom/zykj/evaluation/submit/SubmitWork;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "getSimpleName(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lcom/zykj/evaluation/submit/SubmitWork;->e:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/di/AppDatabase;)V
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
    const-string v0, "database"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lcom/zykj/evaluation/submit/SubmitWork;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 20
    .line 21
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/submit/SubmitWork;->i(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/evaluation/submit/SubmitWork;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/evaluation/submit/SubmitWork;->k(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/evaluation/submit/SubmitWork;Ln5/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitWork;->b:Ln5/a;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic e(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/submit/SubmitWork;->n(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/evaluation/submit/SubmitWork$doWork$2;-><init>(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, Lkotlinx/coroutines/CoroutineScopeKt;->coroutineScope(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/evaluation/submit/SubmitWork;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/submit/SubmitWork;->i(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: failedResult"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method


# virtual methods
.method public doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/zykj/evaluation/submit/SubmitWork;->h(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method

.method public abstract g(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method

.method public final i(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;-><init>(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->c:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    .line 38
    .line 39
    const/4 v9, 0x4

    .line 40
    const/4 v4, 0x3

    .line 41
    const/4 v10, 0x2

    .line 42
    const/4 v5, 0x1

    .line 43
    if-eqz v3, :cond_6

    .line 44
    .line 45
    if-eq v3, v5, :cond_5

    .line 46
    .line 47
    if-eq v3, v10, :cond_3

    .line 48
    .line 49
    if-eq v3, v4, :cond_2

    .line 50
    .line 51
    if-ne v3, v9, :cond_1

    .line 52
    .line 53
    iget-object v2, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_7

    .line 61
    .line 62
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw v1

    .line 70
    :cond_2
    iget-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 71
    .line 72
    iget-object v4, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_3
    iget-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 80
    .line 81
    iget-object v5, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 82
    .line 83
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    move-object v1, v3

    .line 87
    move-object v11, v5

    .line 88
    goto :goto_3

    .line 89
    :cond_5
    iget-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v5, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_6
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v0, Lcom/zykj/evaluation/submit/SubmitWork;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 107
    .line 108
    .line 109
    move-result-object v11

    .line 110
    sget-object v3, Lm5/e$a;->b:Lm5/e$a;

    .line 111
    .line 112
    invoke-virtual {v3}, Lm5/e;->a()I

    .line 113
    .line 114
    .line 115
    move-result v18

    .line 116
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v3}, Ln5/a;->c()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    add-int/lit8 v19, v3, 0x1

    .line 125
    .line 126
    const/16 v21, 0x4f

    .line 127
    .line 128
    const/16 v22, 0x0

    .line 129
    .line 130
    const-wide/16 v12, 0x0

    .line 131
    .line 132
    const-wide/16 v14, 0x0

    .line 133
    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v20, 0x0

    .line 139
    .line 140
    invoke-static/range {v11 .. v22}, Ln5/a;->b(Ln5/a;JJILjava/lang/String;IIZILjava/lang/Object;)Ln5/a;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    move-object/from16 v6, p1

    .line 145
    .line 146
    iput-object v6, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 147
    .line 148
    move-object/from16 v7, p2

    .line 149
    .line 150
    iput-object v7, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 151
    .line 152
    iput v5, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    .line 153
    .line 154
    invoke-interface {v1, v3, v8}, Ln5/b;->a(Ln5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-ne v1, v2, :cond_7

    .line 159
    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :cond_7
    move-object v5, v6

    .line 163
    move-object v3, v7

    .line 164
    :goto_2
    iput-object v5, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 167
    .line 168
    iput v10, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    .line 169
    .line 170
    const-wide/16 v6, 0x64

    .line 171
    .line 172
    invoke-static {v6, v7, v8}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-ne v1, v2, :cond_4

    .line 177
    .line 178
    goto/16 :goto_6

    .line 179
    .line 180
    :goto_3
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v3}, Ln5/a;->c()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-lt v3, v10, :cond_9

    .line 189
    .line 190
    iget-object v3, v0, Lcom/zykj/evaluation/submit/SubmitWork;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 191
    .line 192
    invoke-virtual {v3}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v5}, Ln5/a;->i()J

    .line 201
    .line 202
    .line 203
    move-result-wide v5

    .line 204
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    invoke-virtual {v7}, Ln5/a;->h()J

    .line 209
    .line 210
    .line 211
    move-result-wide v12

    .line 212
    iput-object v11, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 213
    .line 214
    iput-object v1, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 215
    .line 216
    iput v4, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    .line 217
    .line 218
    move-wide v4, v5

    .line 219
    move-wide v6, v12

    .line 220
    invoke-interface/range {v3 .. v8}, Ln5/b;->c(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    if-ne v3, v2, :cond_8

    .line 225
    .line 226
    goto :goto_6

    .line 227
    :cond_8
    move-object v3, v1

    .line 228
    move-object v4, v11

    .line 229
    :goto_4
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    const-string v5, "TASK_ID"

    .line 234
    .line 235
    const-wide/16 v6, -0x1

    .line 236
    .line 237
    invoke-virtual {v1, v5, v6, v7}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 238
    .line 239
    .line 240
    move-result-wide v5

    .line 241
    new-instance v1, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    const-string v7, "["

    .line 247
    .line 248
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    const-string v5, "] \u5931\u8d25\u91cd\u8bd5\u6b21\u6570\u8fc7\u591a\uff0c\u91cd\u65b0\u63d0\u4ea4"

    .line 255
    .line 256
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    move-object v1, v3

    .line 271
    move-object v3, v4

    .line 272
    goto :goto_5

    .line 273
    :cond_9
    move-object v3, v11

    .line 274
    :goto_5
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    new-instance v5, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$2;

    .line 279
    .line 280
    const/4 v6, 0x0

    .line 281
    invoke-direct {v5, v1, v6}, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$2;-><init>(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    .line 282
    .line 283
    .line 284
    iput-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->a:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v1, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->b:Ljava/lang/Object;

    .line 287
    .line 288
    iput v9, v8, Lcom/zykj/evaluation/submit/SubmitWork$failedResult$1;->e:I

    .line 289
    .line 290
    invoke-static {v4, v5, v8}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    if-ne v4, v2, :cond_a

    .line 295
    .line 296
    :goto_6
    return-object v2

    .line 297
    :cond_a
    move-object v2, v1

    .line 298
    :goto_7
    const-string v1, "ERROR_KEY"

    .line 299
    .line 300
    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    const-string v3, "EXTRA_DATA"

    .line 305
    .line 306
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    new-instance v2, Landroidx/work/Data$Builder;

    .line 315
    .line 316
    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    .line 317
    .line 318
    .line 319
    const/4 v3, 0x0

    .line 320
    :goto_8
    if-ge v3, v10, :cond_b

    .line 321
    .line 322
    aget-object v4, v1, v3

    .line 323
    .line 324
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v5

    .line 328
    check-cast v5, Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v4

    .line 334
    invoke-virtual {v2, v5, v4}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 335
    .line 336
    .line 337
    add-int/lit8 v3, v3, 0x1

    .line 338
    .line 339
    goto :goto_8

    .line 340
    :cond_b
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    const-string v2, "failure(...)"

    .line 349
    .line 350
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    return-object v1
.end method

.method public final k(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitWork;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-wide v2, p1

    .line 8
    move-wide v4, p3

    .line 9
    move-object v6, p5

    .line 10
    invoke-interface/range {v1 .. v6}, Ln5/b;->d(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final l()Ln5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitWork;->b:Ln5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "submitTask"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public abstract m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method

.method public final n(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->d:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->d:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;-><init>(Lcom/zykj/evaluation/submit/SubmitWork;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->d:I

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v3, :cond_5

    .line 43
    .line 44
    if-eq v3, v6, :cond_4

    .line 45
    .line 46
    if-eq v3, v5, :cond_2

    .line 47
    .line 48
    if-ne v3, v4, :cond_1

    .line 49
    .line 50
    iget-object v2, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->a:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_5

    .line 56
    .line 57
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v1

    .line 65
    :cond_2
    iget-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->a:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    move-object v1, v3

    .line 71
    goto :goto_3

    .line 72
    :cond_4
    iget-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->a:Ljava/lang/Object;

    .line 73
    .line 74
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v0, Lcom/zykj/evaluation/submit/SubmitWork;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    sget-object v3, Lm5/e$b;->b:Lm5/e$b;

    .line 92
    .line 93
    invoke-virtual {v3}, Lm5/e;->a()I

    .line 94
    .line 95
    .line 96
    move-result v16

    .line 97
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ln5/a;->c()I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    add-int/lit8 v17, v3, 0x1

    .line 106
    .line 107
    const/16 v19, 0x4f

    .line 108
    .line 109
    const/16 v20, 0x0

    .line 110
    .line 111
    const-wide/16 v10, 0x0

    .line 112
    .line 113
    const-wide/16 v12, 0x0

    .line 114
    .line 115
    const/4 v14, 0x0

    .line 116
    const/4 v15, 0x0

    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    invoke-static/range {v9 .. v20}, Ln5/a;->b(Ln5/a;JJILjava/lang/String;IIZILjava/lang/Object;)Ln5/a;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    move-object/from16 v7, p1

    .line 124
    .line 125
    iput-object v7, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->a:Ljava/lang/Object;

    .line 126
    .line 127
    iput v6, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->d:I

    .line 128
    .line 129
    invoke-interface {v1, v3, v8}, Ln5/b;->a(Ln5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-ne v1, v2, :cond_6

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_6
    move-object v3, v7

    .line 137
    :goto_2
    iput-object v3, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->a:Ljava/lang/Object;

    .line 138
    .line 139
    iput v5, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->d:I

    .line 140
    .line 141
    const-wide/16 v5, 0x64

    .line 142
    .line 143
    invoke-static {v5, v6, v8}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-ne v1, v2, :cond_3

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :goto_3
    iget-object v3, v0, Lcom/zykj/evaluation/submit/SubmitWork;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    invoke-virtual {v5}, Ln5/a;->i()J

    .line 161
    .line 162
    .line 163
    move-result-wide v5

    .line 164
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 165
    .line 166
    .line 167
    move-result-object v7

    .line 168
    invoke-virtual {v7}, Ln5/a;->h()J

    .line 169
    .line 170
    .line 171
    move-result-wide v9

    .line 172
    iput-object v1, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iput v4, v8, Lcom/zykj/evaluation/submit/SubmitWork$successResult$1;->d:I

    .line 175
    .line 176
    move-wide v4, v5

    .line 177
    move-wide v6, v9

    .line 178
    invoke-interface/range {v3 .. v8}, Ln5/b;->b(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    if-ne v3, v2, :cond_7

    .line 183
    .line 184
    :goto_4
    return-object v2

    .line 185
    :cond_7
    move-object v2, v1

    .line 186
    :goto_5
    const-string v1, "SUCCESS_KEY"

    .line 187
    .line 188
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    new-instance v2, Landroidx/work/Data$Builder;

    .line 197
    .line 198
    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    .line 199
    .line 200
    .line 201
    const/4 v3, 0x0

    .line 202
    aget-object v1, v1, v3

    .line 203
    .line 204
    invoke-virtual {v1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    check-cast v3, Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-virtual {v2, v3, v1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    const-string v2, "success(...)"

    .line 226
    .line 227
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-object v1
.end method

.method public abstract o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method
