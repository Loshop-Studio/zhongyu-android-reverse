# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/evaluation/submit/SubmitNoStemWork;
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
        Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B-\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ4\u0010\u0013\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00120\u00112\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001bR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\u0008\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006$"
    }
    d2 = {
        "Lcom/zykj/evaluation/submit/SubmitNoStemWork;",
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
        "Ljava/util/ArrayList;",
        "Ln5/h;",
        "Lkotlin/collections/ArrayList;",
        "h",
        "Ljava/util/ArrayList;",
        "uploadAnswerList",
        "i",
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
        "SMAP\nSubmitNoStemWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubmitNoStemWork.kt\ncom/zykj/evaluation/submit/SubmitNoStemWork\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n49#2:130\n51#2:134\n46#3:131\n51#3:133\n105#4:132\n1563#5:135\n1634#5,2:136\n1563#5:138\n1634#5,2:139\n295#5,2:141\n1636#5:143\n1636#5:144\n*S KotlinDebug\n*F\n+ 1 SubmitNoStemWork.kt\ncom/zykj/evaluation/submit/SubmitNoStemWork\n*L\n68#1:130\n68#1:134\n68#1:131\n68#1:133\n68#1:132\n82#1:135\n82#1:136,2\n84#1:138\n84#1:139,2\n85#1:141,2\n84#1:143\n82#1:144\n*E\n"
    }
.end annotation


# static fields
.field public static final i:Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;

.field public static final j:I


# instance fields
.field public final f:Lp5/j;

.field public final g:Lcom/zykj/evaluation/di/AppDatabase;

.field public final h:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->i:Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->j:I

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
    iput-object p3, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->f:Lp5/j;

    .line 25
    .line 26
    iput-object p4, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 27
    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->h:Ljava/util/ArrayList;

    .line 34
    .line 35
    return-void
.end method

.method public static final synthetic p(Lcom/zykj/evaluation/submit/SubmitNoStemWork;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->h:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
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
    sget-object v0, Lcom/zykj/evaluation/utils/LocalAnswerManager;->a:Lcom/zykj/evaluation/utils/LocalAnswerManager;

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/utils/LocalAnswerManager;->a(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    .line 58
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
    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

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
    invoke-interface/range {v3 .. v9}, Ln5/i;->d(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

# RE I/O 读取 JSON（Gson.fromJson）。
.method public m(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->f:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->f:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;-><init>(Lcom/zykj/evaluation/submit/SubmitNoStemWork;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->d:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->f:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v5, :cond_1

    .line 41
    .line 42
    iget-object v3, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, Ljava/util/List;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Lcom/google/gson/Gson;

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_5

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, Lcom/google/gson/Gson;

    .line 67
    .line 68
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v4}, Ln5/a;->e()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    new-instance v6, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$list$1;

    .line 80
    .line 81
    invoke-direct {v6}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$list$1;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-virtual {v1, v4, v6}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    const-string v6, "fromJson(...)"

    .line 93
    .line 94
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    check-cast v4, Ljava/lang/Iterable;

    .line 98
    .line 99
    new-instance v6, Ljava/util/ArrayList;

    .line 100
    .line 101
    const/16 v7, 0xa

    .line 102
    .line 103
    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_7

    .line 119
    .line 120
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    move-object v9, v8

    .line 125
    check-cast v9, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 126
    .line 127
    invoke-virtual {v9}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    new-instance v13, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-static {v8, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 134
    .line 135
    .line 136
    move-result v10

    .line 137
    invoke-direct {v13, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-eqz v10, :cond_6

    .line 149
    .line 150
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    check-cast v10, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 155
    .line 156
    iget-object v11, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->h:Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 159
    .line 160
    .line 161
    move-result v12

    .line 162
    const/4 v14, 0x0

    .line 163
    :goto_3
    const/4 v15, 0x0

    .line 164
    if-ge v14, v12, :cond_4

    .line 165
    .line 166
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v16

    .line 170
    add-int/lit8 v14, v14, 0x1

    .line 171
    .line 172
    move-object/from16 v17, v16

    .line 173
    .line 174
    check-cast v17, Ln5/h;

    .line 175
    .line 176
    invoke-virtual/range {v17 .. v17}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 177
    .line 178
    .line 179
    move-result-object v17

    .line 180
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v10}, Lcom/zykj/evaluation/bean/CommitAnswer;->getUuid()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_3

    .line 193
    .line 194
    goto :goto_4

    .line 195
    :cond_3
    const/4 v5, 0x1

    .line 196
    const/16 v7, 0xa

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_4
    move-object/from16 v16, v15

    .line 200
    .line 201
    :goto_4
    check-cast v16, Ln5/h;

    .line 202
    .line 203
    if-eqz v16, :cond_5

    .line 204
    .line 205
    invoke-virtual/range {v16 .. v16}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getUploadUrl()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    const/4 v7, 0x1

    .line 218
    invoke-static {v10, v15, v5, v7, v15}, Lcom/zykj/evaluation/bean/CommitAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitAnswer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    :cond_5
    invoke-interface {v13, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    const/4 v5, 0x1

    .line 226
    const/16 v7, 0xa

    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_6
    const/4 v14, 0x3

    .line 230
    const/4 v15, 0x0

    .line 231
    const-wide/16 v10, 0x0

    .line 232
    .line 233
    const/4 v12, 0x0

    .line 234
    invoke-static/range {v9 .. v15}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    invoke-interface {v6, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    const/4 v5, 0x1

    .line 242
    const/16 v7, 0xa

    .line 243
    .line 244
    goto/16 :goto_1

    .line 245
    .line 246
    :cond_7
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitWork;->l()Ln5/a;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v4}, Ln5/a;->h()J

    .line 251
    .line 252
    .line 253
    move-result-wide v4

    .line 254
    iget-object v7, v0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->f:Lp5/j;

    .line 255
    .line 256
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    iput-object v1, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->a:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iput-object v1, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->b:Ljava/lang/Object;

    .line 267
    .line 268
    iput-wide v4, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->c:J

    .line 269
    .line 270
    const/4 v1, 0x1

    .line 271
    iput v1, v2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$submitTask$1;->f:I

    .line 272
    .line 273
    invoke-interface {v7, v4, v5, v6, v2}, Lp5/j;->y(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    if-ne v1, v3, :cond_8

    .line 278
    .line 279
    return-object v3

    .line 280
    :cond_8
    :goto_5
    check-cast v1, Lcom/zykj/http/bean/ApiResp;

    .line 281
    .line 282
    invoke-static {v1}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v1
.end method

.method public o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p6, p0, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->g:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {p6}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

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
    invoke-interface/range {v0 .. v5}, Ln5/i;->e(JJI)Lkotlinx/coroutines/flow/Flow;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance p2, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1;

    .line 15
    .line 16
    invoke-direct {p2, p1, p0}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$uploadCommitStateList$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/zykj/evaluation/submit/SubmitNoStemWork;)V

    .line 17
    .line 18
    .line 19
    return-object p2
.end method
