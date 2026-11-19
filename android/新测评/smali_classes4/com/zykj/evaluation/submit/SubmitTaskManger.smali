# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/zykj/evaluation/submit/SubmitTaskManger;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/evaluation/di/AppDatabase;

.field public final b:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final c:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)V
    .locals 1

    .line 1
    const-string v0, "database"

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->b:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 17
    .line 18
    new-instance p1, Lr5/c;

    .line 19
    .line 20
    invoke-direct {p1}, Lr5/c;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->c:Lkotlin/Lazy;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic a()Landroidx/work/WorkManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->m()Landroidx/work/WorkManager;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/submit/SubmitTaskManger;)Landroidx/work/WorkManager;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->d()Landroidx/work/WorkManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/evaluation/submit/SubmitTaskManger;JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->e(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/evaluation/submit/SubmitTaskManger;JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "_"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v7, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object/from16 v7, p6

    .line 34
    .line 35
    :goto_0
    and-int/lit8 v0, p9, 0x10

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    new-array v0, v0, [Ljava/lang/String;

    .line 41
    .line 42
    move-object v8, v0

    .line 43
    :goto_1
    move-object v1, p0

    .line 44
    move-wide v2, p1

    .line 45
    move-wide v4, p3

    .line 46
    move v6, p5

    .line 47
    move-object/from16 v9, p8

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    move-object/from16 v8, p7

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :goto_2
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->g(JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static synthetic j(Lcom/zykj/evaluation/submit/SubmitTaskManger;JJLjava/util/List;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/evaluation/bean/TaskState$ToDo;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$ToDo;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/TaskState;->getState()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, "_"

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    move-object v7, v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object/from16 v7, p6

    .line 40
    .line 41
    :goto_0
    and-int/lit8 v0, p9, 0x10

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    new-array v0, v0, [Ljava/lang/String;

    .line 47
    .line 48
    move-object v8, v0

    .line 49
    :goto_1
    move-object v1, p0

    .line 50
    move-wide v2, p1

    .line 51
    move-wide v4, p3

    .line 52
    move-object v6, p5

    .line 53
    move-object/from16 v9, p8

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_1
    move-object/from16 v8, p7

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :goto_2
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->i(JJLjava/util/List;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/evaluation/submit/SubmitTaskManger;JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    and-int/lit8 v0, p9, 0x8

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "_"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v7, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object/from16 v7, p6

    .line 34
    .line 35
    :goto_0
    and-int/lit8 v0, p9, 0x10

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    new-array v0, v0, [Ljava/lang/String;

    .line 41
    .line 42
    move-object v8, v0

    .line 43
    :goto_1
    move-object v1, p0

    .line 44
    move-wide v2, p1

    .line 45
    move-wide v4, p3

    .line 46
    move v6, p5

    .line 47
    move-object/from16 v9, p8

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    move-object/from16 v8, p7

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :goto_2
    invoke-virtual/range {v1 .. v9}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->k(JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method

.method public static final m()Landroidx/work/WorkManager;
    .locals 3

    .line 1
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getApp(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method


# virtual methods
.method public final d()Landroidx/work/WorkManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->c:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/work/WorkManager;

    .line 8
    .line 9
    return-object v0
.end method

.method public final e(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p6

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->h:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->h:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;-><init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->f:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->h:I

    .line 38
    .line 39
    const/4 v9, 0x2

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v11, 0x1

    .line 42
    if-eqz v3, :cond_3

    .line 43
    .line 44
    if-eq v3, v11, :cond_2

    .line 45
    .line 46
    if-ne v3, v9, :cond_1

    .line 47
    .line 48
    iget v2, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->e:I

    .line 49
    .line 50
    iget-wide v3, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->b:J

    .line 51
    .line 52
    iget-wide v5, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->a:J

    .line 53
    .line 54
    iget-object v7, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v7, Ln5/a;

    .line 57
    .line 58
    iget-object v7, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v7, Ljava/lang/String;

    .line 61
    .line 62
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_5

    .line 66
    .line 67
    :catch_0
    move-exception v0

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_2
    iget-wide v3, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->b:J

    .line 79
    .line 80
    iget-wide v5, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->a:J

    .line 81
    .line 82
    iget-object v7, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->c:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v7, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object/from16 v16, v7

    .line 90
    .line 91
    move-object v7, v0

    .line 92
    move-object/from16 v0, v16

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v1, Lcom/zykj/evaluation/submit/SubmitTaskManger;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    move-object/from16 v0, p5

    .line 105
    .line 106
    iput-object v0, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->c:Ljava/lang/Object;

    .line 107
    .line 108
    move-wide/from16 v4, p1

    .line 109
    .line 110
    iput-wide v4, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->a:J

    .line 111
    .line 112
    move-wide/from16 v6, p3

    .line 113
    .line 114
    iput-wide v6, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->b:J

    .line 115
    .line 116
    iput v11, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->h:I

    .line 117
    .line 118
    invoke-interface/range {v3 .. v8}, Ln5/b;->d(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-ne v3, v2, :cond_4

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    move-wide/from16 v5, p1

    .line 126
    .line 127
    move-object v7, v3

    .line 128
    move-wide/from16 v3, p3

    .line 129
    .line 130
    :goto_2
    check-cast v7, Ln5/a;

    .line 131
    .line 132
    if-eqz v7, :cond_5

    .line 133
    .line 134
    invoke-virtual {v7}, Ln5/a;->g()I

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    sget-object v13, Lm5/i$c;->b:Lm5/i$c;

    .line 139
    .line 140
    invoke-virtual {v13}, Lm5/i;->a()I

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-ne v12, v13, :cond_5

    .line 145
    .line 146
    invoke-virtual {v7}, Ln5/a;->d()I

    .line 147
    .line 148
    .line 149
    move-result v12

    .line 150
    sget-object v13, Lm5/e$c;->b:Lm5/e$c;

    .line 151
    .line 152
    invoke-virtual {v13}, Lm5/e;->a()I

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-ne v12, v13, :cond_5

    .line 157
    .line 158
    move v12, v11

    .line 159
    goto :goto_3

    .line 160
    :cond_5
    move v12, v10

    .line 161
    :goto_3
    if-eqz v12, :cond_c

    .line 162
    .line 163
    :try_start_1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 164
    .line 165
    .line 166
    move-result-object v13

    .line 167
    new-instance v14, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$workInfos$1;

    .line 168
    .line 169
    const/4 v15, 0x0

    .line 170
    invoke-direct {v14, v1, v0, v15}, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$workInfos$1;-><init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iput-object v0, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->c:Ljava/lang/Object;

    .line 178
    .line 179
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iput-object v0, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->d:Ljava/lang/Object;

    .line 184
    .line 185
    iput-wide v5, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->a:J

    .line 186
    .line 187
    iput-wide v3, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->b:J

    .line 188
    .line 189
    iput v12, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->e:I

    .line 190
    .line 191
    iput v9, v8, Lcom/zykj/evaluation/submit/SubmitTaskManger$isNormalSubmitCommitting$1;->h:I

    .line 192
    .line 193
    invoke-static {v13, v14, v8}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 197
    if-ne v0, v2, :cond_6

    .line 198
    .line 199
    :goto_4
    return-object v2

    .line 200
    :cond_6
    move v2, v12

    .line 201
    :goto_5
    :try_start_2
    check-cast v0, Ljava/util/List;

    .line 202
    .line 203
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    if-eqz v0, :cond_8

    .line 207
    .line 208
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 209
    .line 210
    .line 211
    move-result v7

    .line 212
    if-eqz v7, :cond_8

    .line 213
    .line 214
    :cond_7
    move v0, v10

    .line 215
    goto :goto_6

    .line 216
    :cond_8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    if-eqz v7, :cond_7

    .line 225
    .line 226
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v7

    .line 230
    check-cast v7, Landroidx/work/WorkInfo;

    .line 231
    .line 232
    invoke-virtual {v7}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    sget-object v9, Landroidx/work/WorkInfo$State;->ENQUEUED:Landroidx/work/WorkInfo$State;

    .line 237
    .line 238
    if-eq v8, v9, :cond_a

    .line 239
    .line 240
    invoke-virtual {v7}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 241
    .line 242
    .line 243
    move-result-object v7

    .line 244
    sget-object v8, Landroidx/work/WorkInfo$State;->RUNNING:Landroidx/work/WorkInfo$State;

    .line 245
    .line 246
    if-ne v7, v8, :cond_9

    .line 247
    .line 248
    :cond_a
    move v0, v11

    .line 249
    :goto_6
    if-nez v0, :cond_b

    .line 250
    .line 251
    new-instance v7, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const-string v8, "\u9875\u9762SubmitTaskManger.kt -> \u666e\u901a\u6d4b\u8bc4\u4ea4\u5377\u72b6\u6001\u5047\u6b7b: "

    .line 257
    .line 258
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const-string v5, "_"

    .line 265
    .line 266
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_b
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 284
    .line 285
    .line 286
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 287
    return-object v0

    .line 288
    :catch_1
    move-exception v0

    .line 289
    move v2, v12

    .line 290
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 291
    .line 292
    .line 293
    move v12, v2

    .line 294
    :cond_c
    if-eqz v12, :cond_d

    .line 295
    .line 296
    move v10, v11

    .line 297
    :cond_d
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    return-object v0
.end method

.method public final f(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;-><init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->h:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x5

    .line 41
    const/4 v12, 0x4

    .line 42
    const/4 v13, 0x3

    .line 43
    const/4 v14, 0x2

    .line 44
    const/4 v15, 0x1

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    if-eq v3, v15, :cond_3

    .line 48
    .line 49
    if-eq v3, v14, :cond_2

    .line 50
    .line 51
    if-eq v3, v13, :cond_2

    .line 52
    .line 53
    if-eq v3, v12, :cond_2

    .line 54
    .line 55
    if-ne v3, v11, :cond_1

    .line 56
    .line 57
    iget-wide v2, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 58
    .line 59
    iget-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 60
    .line 61
    iget-object v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, Landroidx/work/OneTimeWorkRequest;

    .line 64
    .line 65
    iget-object v7, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v7, Landroidx/work/OneTimeWorkRequest;

    .line 68
    .line 69
    iget-object v7, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v7, Ln5/a;

    .line 72
    .line 73
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move/from16 p6, v15

    .line 77
    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v1

    .line 88
    :cond_2
    iget v3, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->c:I

    .line 89
    .line 90
    iget-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 91
    .line 92
    iget-wide v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 93
    .line 94
    iget-object v8, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v8, Ln5/a;

    .line 97
    .line 98
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move/from16 p6, v15

    .line 102
    .line 103
    goto/16 :goto_3

    .line 104
    .line 105
    :cond_3
    iget v3, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->c:I

    .line 106
    .line 107
    iget-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 108
    .line 109
    iget-wide v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 110
    .line 111
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    move-wide/from16 v24, v6

    .line 115
    .line 116
    move-wide v6, v4

    .line 117
    move-wide/from16 v4, v24

    .line 118
    .line 119
    move v8, v3

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v1, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    move-wide/from16 v4, p1

    .line 131
    .line 132
    iput-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 133
    .line 134
    move-wide/from16 v6, p3

    .line 135
    .line 136
    iput-wide v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 137
    .line 138
    move/from16 v1, p5

    .line 139
    .line 140
    iput v1, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->c:I

    .line 141
    .line 142
    iput v15, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    .line 143
    .line 144
    move-object v8, v9

    .line 145
    invoke-interface/range {v3 .. v8}, Ln5/b;->d(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    if-ne v3, v2, :cond_5

    .line 150
    .line 151
    goto/16 :goto_6

    .line 152
    .line 153
    :cond_5
    move-wide/from16 v4, p1

    .line 154
    .line 155
    move-wide/from16 v6, p3

    .line 156
    .line 157
    move v8, v1

    .line 158
    move-object v1, v3

    .line 159
    :goto_2
    check-cast v1, Ln5/a;

    .line 160
    .line 161
    if-nez v1, :cond_6

    .line 162
    .line 163
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    return-object v1

    .line 168
    :cond_6
    invoke-virtual {v1}, Ln5/a;->g()I

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    sget-object v16, Lm5/i$b;->b:Lm5/i$b;

    .line 173
    .line 174
    move/from16 p6, v15

    .line 175
    .line 176
    invoke-virtual/range {v16 .. v16}, Lm5/i;->a()I

    .line 177
    .line 178
    .line 179
    move-result v15

    .line 180
    if-ne v3, v15, :cond_8

    .line 181
    .line 182
    iget-object v3, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->b:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 183
    .line 184
    iput-object v1, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->e:Ljava/lang/Object;

    .line 185
    .line 186
    iput-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 187
    .line 188
    iput-wide v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 189
    .line 190
    iput v8, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->c:I

    .line 191
    .line 192
    iput v14, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    .line 193
    .line 194
    invoke-virtual/range {v3 .. v9}, Lcom/zykj/evaluation/upload/OssTaskManger;->n(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    if-ne v3, v2, :cond_7

    .line 199
    .line 200
    goto/16 :goto_6

    .line 201
    .line 202
    :cond_7
    move-wide/from16 v24, v6

    .line 203
    .line 204
    move-wide v6, v4

    .line 205
    move-wide/from16 v4, v24

    .line 206
    .line 207
    move v3, v8

    .line 208
    move-object v8, v1

    .line 209
    :goto_3
    move-wide/from16 v16, v4

    .line 210
    .line 211
    move-wide v14, v6

    .line 212
    move-object v12, v8

    .line 213
    move v8, v3

    .line 214
    goto :goto_4

    .line 215
    :cond_8
    sget-object v14, Lm5/i$c;->b:Lm5/i$c;

    .line 216
    .line 217
    invoke-virtual {v14}, Lm5/i;->a()I

    .line 218
    .line 219
    .line 220
    move-result v14

    .line 221
    if-ne v3, v14, :cond_9

    .line 222
    .line 223
    iget-object v3, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->b:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 224
    .line 225
    iput-object v1, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->e:Ljava/lang/Object;

    .line 226
    .line 227
    iput-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 228
    .line 229
    iput-wide v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 230
    .line 231
    iput v8, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->c:I

    .line 232
    .line 233
    iput v13, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    .line 234
    .line 235
    invoke-virtual/range {v3 .. v9}, Lcom/zykj/evaluation/upload/OssTaskManger;->o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    if-ne v3, v2, :cond_7

    .line 240
    .line 241
    goto/16 :goto_6

    .line 242
    .line 243
    :cond_9
    sget-object v13, Lm5/i$a;->b:Lm5/i$a;

    .line 244
    .line 245
    invoke-virtual {v13}, Lm5/i;->a()I

    .line 246
    .line 247
    .line 248
    move-result v13

    .line 249
    if-ne v3, v13, :cond_a

    .line 250
    .line 251
    iget-object v3, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->b:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 252
    .line 253
    iput-object v1, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->e:Ljava/lang/Object;

    .line 254
    .line 255
    iput-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 256
    .line 257
    iput-wide v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 258
    .line 259
    iput v8, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->c:I

    .line 260
    .line 261
    iput v12, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    .line 262
    .line 263
    invoke-virtual/range {v3 .. v9}, Lcom/zykj/evaluation/upload/OssTaskManger;->p(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    if-ne v3, v2, :cond_7

    .line 268
    .line 269
    goto/16 :goto_6

    .line 270
    .line 271
    :cond_a
    move-object v12, v1

    .line 272
    move-wide v14, v4

    .line 273
    move-wide/from16 v16, v6

    .line 274
    .line 275
    :goto_4
    invoke-virtual {v12}, Ln5/a;->g()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    sget-object v3, Lm5/i$b;->b:Lm5/i$b;

    .line 280
    .line 281
    invoke-virtual {v3}, Lm5/i;->a()I

    .line 282
    .line 283
    .line 284
    move-result v3

    .line 285
    if-ne v1, v3, :cond_b

    .line 286
    .line 287
    sget-object v13, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->i:Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;

    .line 288
    .line 289
    const/16 v19, 0x4

    .line 290
    .line 291
    const/16 v20, 0x0

    .line 292
    .line 293
    const/16 v18, 0x0

    .line 294
    .line 295
    invoke-static/range {v13 .. v20}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;->b(Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;JJ[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 304
    .line 305
    move v3, v8

    .line 306
    move-wide v6, v14

    .line 307
    move-wide/from16 v4, v16

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_b
    sget-object v3, Lm5/i$c;->b:Lm5/i$c;

    .line 311
    .line 312
    invoke-virtual {v3}, Lm5/i;->a()I

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    if-ne v1, v3, :cond_c

    .line 317
    .line 318
    sget-object v13, Lcom/zykj/evaluation/submit/SubmitNormalWork;->h:Lcom/zykj/evaluation/submit/SubmitNormalWork$a;

    .line 319
    .line 320
    const/16 v20, 0x8

    .line 321
    .line 322
    const/16 v21, 0x0

    .line 323
    .line 324
    const/16 v19, 0x0

    .line 325
    .line 326
    move/from16 v18, v8

    .line 327
    .line 328
    invoke-static/range {v13 .. v21}, Lcom/zykj/evaluation/submit/SubmitNormalWork$a;->b(Lcom/zykj/evaluation/submit/SubmitNormalWork$a;JJI[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 337
    .line 338
    move-wide v6, v14

    .line 339
    move-wide/from16 v4, v16

    .line 340
    .line 341
    move/from16 v3, v18

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_c
    move/from16 v18, v8

    .line 345
    .line 346
    sget-object v3, Lm5/i$a;->b:Lm5/i$a;

    .line 347
    .line 348
    invoke-virtual {v3}, Lm5/i;->a()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-ne v1, v3, :cond_d

    .line 353
    .line 354
    sget-object v13, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->h:Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;

    .line 355
    .line 356
    const/16 v20, 0x8

    .line 357
    .line 358
    const/16 v21, 0x0

    .line 359
    .line 360
    const/16 v19, 0x0

    .line 361
    .line 362
    invoke-static/range {v13 .. v21}, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;->b(Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;JJI[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    move-wide v6, v14

    .line 367
    move-wide/from16 v4, v16

    .line 368
    .line 369
    move/from16 v3, v18

    .line 370
    .line 371
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 376
    .line 377
    goto :goto_5

    .line 378
    :cond_d
    move-wide v6, v14

    .line 379
    move-wide/from16 v4, v16

    .line 380
    .line 381
    move/from16 v3, v18

    .line 382
    .line 383
    const/4 v1, 0x0

    .line 384
    :goto_5
    if-eqz v1, :cond_f

    .line 385
    .line 386
    iget-object v8, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 387
    .line 388
    invoke-virtual {v8}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 389
    .line 390
    .line 391
    move-result-object v8

    .line 392
    sget-object v13, Lm5/e$c;->b:Lm5/e$c;

    .line 393
    .line 394
    invoke-virtual {v13}, Lm5/e;->a()I

    .line 395
    .line 396
    .line 397
    move-result v19

    .line 398
    const/16 v22, 0x6f

    .line 399
    .line 400
    const/16 v23, 0x0

    .line 401
    .line 402
    const-wide/16 v13, 0x0

    .line 403
    .line 404
    const-wide/16 v15, 0x0

    .line 405
    .line 406
    const/16 v17, 0x0

    .line 407
    .line 408
    const/16 v18, 0x0

    .line 409
    .line 410
    const/16 v20, 0x0

    .line 411
    .line 412
    const/16 v21, 0x0

    .line 413
    .line 414
    invoke-static/range {v12 .. v23}, Ln5/a;->b(Ln5/a;JJILjava/lang/String;IIZILjava/lang/Object;)Ln5/a;

    .line 415
    .line 416
    .line 417
    move-result-object v13

    .line 418
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v12

    .line 422
    iput-object v12, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->e:Ljava/lang/Object;

    .line 423
    .line 424
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v12

    .line 428
    iput-object v12, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->f:Ljava/lang/Object;

    .line 429
    .line 430
    iput-object v1, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->g:Ljava/lang/Object;

    .line 431
    .line 432
    iput-wide v6, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->a:J

    .line 433
    .line 434
    iput-wide v4, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->b:J

    .line 435
    .line 436
    iput v3, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->c:I

    .line 437
    .line 438
    iput v10, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->d:I

    .line 439
    .line 440
    iput v11, v9, Lcom/zykj/evaluation/submit/SubmitTaskManger$restartSubmitWork$1;->j:I

    .line 441
    .line 442
    invoke-interface {v8, v13, v9}, Ln5/b;->a(Ln5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    if-ne v3, v2, :cond_e

    .line 447
    .line 448
    :goto_6
    return-object v2

    .line 449
    :cond_e
    move-wide v2, v4

    .line 450
    move-wide v4, v6

    .line 451
    move-object v6, v1

    .line 452
    :goto_7
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->d()Landroidx/work/WorkManager;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    new-instance v7, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 462
    .line 463
    .line 464
    const-string v4, "_"

    .line 465
    .line 466
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    sget-object v3, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 477
    .line 478
    invoke-virtual {v1, v2, v3, v6}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 479
    .line 480
    .line 481
    :cond_f
    invoke-static/range {p6 .. p6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    return-object v1
.end method

.method public final g(JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->h:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->h:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;-><init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->f:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->h:I

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
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->c:I

    .line 43
    .line 44
    iget-wide v4, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->b:J

    .line 45
    .line 46
    iget-wide v6, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->a:J

    .line 47
    .line 48
    iget-object v8, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->e:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, [Ljava/lang/String;

    .line 51
    .line 52
    iget-object v2, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-wide v10, v6

    .line 60
    move-object v7, v8

    .line 61
    move-wide v8, v10

    .line 62
    move v12, v3

    .line 63
    move-wide v10, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    new-instance v6, Ln5/a;

    .line 83
    .line 84
    sget-object v4, Lm5/i$a;->b:Lm5/i$a;

    .line 85
    .line 86
    invoke-virtual {v4}, Lm5/i;->a()I

    .line 87
    .line 88
    .line 89
    move-result v11

    .line 90
    sget-object v4, Lm5/e$c;->b:Lm5/e$c;

    .line 91
    .line 92
    invoke-virtual {v4}, Lm5/e;->a()I

    .line 93
    .line 94
    .line 95
    move-result v13

    .line 96
    const/16 v16, 0x40

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    const-string v12, ""

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/4 v15, 0x0

    .line 104
    move-wide/from16 v7, p1

    .line 105
    .line 106
    move-wide/from16 v9, p3

    .line 107
    .line 108
    invoke-direct/range {v6 .. v17}, Ln5/a;-><init>(JJILjava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 109
    .line 110
    .line 111
    move-object/from16 v4, p6

    .line 112
    .line 113
    iput-object v4, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->d:Ljava/lang/Object;

    .line 114
    .line 115
    move-object/from16 v7, p7

    .line 116
    .line 117
    iput-object v7, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->e:Ljava/lang/Object;

    .line 118
    .line 119
    move-wide/from16 v8, p1

    .line 120
    .line 121
    iput-wide v8, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->a:J

    .line 122
    .line 123
    move-wide/from16 v10, p3

    .line 124
    .line 125
    iput-wide v10, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->b:J

    .line 126
    .line 127
    move/from16 v12, p5

    .line 128
    .line 129
    iput v12, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->c:I

    .line 130
    .line 131
    iput v5, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitCorrectSelfWork$1;->h:I

    .line 132
    .line 133
    invoke-interface {v1, v6, v2}, Ln5/b;->a(Ln5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-ne v1, v3, :cond_3

    .line 138
    .line 139
    return-object v3

    .line 140
    :cond_3
    move-object v2, v4

    .line 141
    :goto_1
    sget-object v1, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork;->h:Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;

    .line 142
    .line 143
    array-length v3, v7

    .line 144
    invoke-static {v7, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    check-cast v3, [Ljava/lang/String;

    .line 149
    .line 150
    move-object/from16 p1, v1

    .line 151
    .line 152
    move-object/from16 p7, v3

    .line 153
    .line 154
    move-wide/from16 p2, v8

    .line 155
    .line 156
    move-wide/from16 p4, v10

    .line 157
    .line 158
    move/from16 p6, v12

    .line 159
    .line 160
    invoke-virtual/range {p1 .. p7}, Lcom/zykj/evaluation/submit/SubmitCorrectSelfWork$a;->a(JJI[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 169
    .line 170
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->d()Landroidx/work/WorkManager;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    sget-object v4, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 175
    .line 176
    invoke-virtual {v3, v2, v4, v1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 177
    .line 178
    .line 179
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 180
    .line 181
    return-object v1
.end method

# RE I/O 写入 JSON（Gson.toJson）。
.method public final i(JJLjava/util/List;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->i:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->i:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;-><init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->i:I

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
    iget-wide v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->b:J

    .line 43
    .line 44
    iget-wide v5, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->a:J

    .line 45
    .line 46
    iget-object v7, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->f:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, Lcom/google/gson/Gson;

    .line 49
    .line 50
    iget-object v7, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v7, [Ljava/lang/String;

    .line 53
    .line 54
    iget-object v8, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v8, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v2, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v9, v8

    .line 66
    move-object v8, v7

    .line 67
    move-object v7, v9

    .line 68
    move-wide v11, v3

    .line 69
    move-wide v9, v5

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 74
    .line 75
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance v1, Lcom/google/gson/Gson;

    .line 83
    .line 84
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 85
    .line 86
    .line 87
    iget-object v4, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 88
    .line 89
    invoke-virtual {v4}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    new-instance v6, Ln5/a;

    .line 94
    .line 95
    sget-object v7, Lm5/i$b;->b:Lm5/i$b;

    .line 96
    .line 97
    invoke-virtual {v7}, Lm5/i;->a()I

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    move-object/from16 v7, p5

    .line 102
    .line 103
    invoke-virtual {v1, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v12

    .line 107
    const-string v8, "toJson(...)"

    .line 108
    .line 109
    invoke-static {v12, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    sget-object v8, Lm5/e$c;->b:Lm5/e$c;

    .line 113
    .line 114
    invoke-virtual {v8}, Lm5/e;->a()I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    const/16 v16, 0x40

    .line 119
    .line 120
    const/16 v17, 0x0

    .line 121
    .line 122
    const/4 v14, 0x0

    .line 123
    const/4 v15, 0x0

    .line 124
    move-wide/from16 v7, p1

    .line 125
    .line 126
    move-wide/from16 v9, p3

    .line 127
    .line 128
    invoke-direct/range {v6 .. v17}, Ln5/a;-><init>(JJILjava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    .line 130
    .line 131
    invoke-static/range {p5 .. p5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    iput-object v7, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->c:Ljava/lang/Object;

    .line 136
    .line 137
    move-object/from16 v7, p6

    .line 138
    .line 139
    iput-object v7, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->d:Ljava/lang/Object;

    .line 140
    .line 141
    move-object/from16 v8, p7

    .line 142
    .line 143
    iput-object v8, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->e:Ljava/lang/Object;

    .line 144
    .line 145
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iput-object v1, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->f:Ljava/lang/Object;

    .line 150
    .line 151
    move-wide/from16 v9, p1

    .line 152
    .line 153
    iput-wide v9, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->a:J

    .line 154
    .line 155
    move-wide/from16 v11, p3

    .line 156
    .line 157
    iput-wide v11, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->b:J

    .line 158
    .line 159
    iput v5, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNoStemWork$1;->i:I

    .line 160
    .line 161
    invoke-interface {v4, v6, v2}, Ln5/b;->a(Ln5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    if-ne v1, v3, :cond_3

    .line 166
    .line 167
    return-object v3

    .line 168
    :cond_3
    :goto_1
    sget-object v1, Lcom/zykj/evaluation/submit/SubmitNoStemWork;->i:Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;

    .line 169
    .line 170
    array-length v2, v8

    .line 171
    invoke-static {v8, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    check-cast v2, [Ljava/lang/String;

    .line 176
    .line 177
    move-object/from16 p1, v1

    .line 178
    .line 179
    move-object/from16 p6, v2

    .line 180
    .line 181
    move-wide/from16 p2, v9

    .line 182
    .line 183
    move-wide/from16 p4, v11

    .line 184
    .line 185
    invoke-virtual/range {p1 .. p6}, Lcom/zykj/evaluation/submit/SubmitNoStemWork$a;->a(JJ[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 194
    .line 195
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->d()Landroidx/work/WorkManager;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    sget-object v3, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 200
    .line 201
    invoke-virtual {v2, v7, v3, v1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 202
    .line 203
    .line 204
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v1
.end method

.method public final k(JJILjava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->h:I

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
    iput v3, v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->h:I

    .line 22
    .line 23
    :goto_0
    move-object v6, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;-><init>(Lcom/zykj/evaluation/submit/SubmitTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->f:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    iget v2, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->h:I

    .line 38
    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eq v2, v3, :cond_2

    .line 44
    .line 45
    if-ne v2, v8, :cond_1

    .line 46
    .line 47
    iget v2, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->c:I

    .line 48
    .line 49
    iget-wide v3, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->b:J

    .line 50
    .line 51
    iget-wide v7, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->a:J

    .line 52
    .line 53
    iget-object v5, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, [Ljava/lang/String;

    .line 56
    .line 57
    iget-object v6, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_2
    iget v2, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->c:I

    .line 75
    .line 76
    iget-wide v3, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->b:J

    .line 77
    .line 78
    iget-wide v9, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->a:J

    .line 79
    .line 80
    iget-object v5, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v5, [Ljava/lang/String;

    .line 83
    .line 84
    iget-object v11, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v11, Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-wide v14, v3

    .line 92
    move-wide v12, v9

    .line 93
    move-object v10, v1

    .line 94
    move-object v9, v5

    .line 95
    move-object v1, v11

    .line 96
    goto :goto_2

    .line 97
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object/from16 v5, p6

    .line 101
    .line 102
    iput-object v5, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->d:Ljava/lang/Object;

    .line 103
    .line 104
    move-object/from16 v9, p7

    .line 105
    .line 106
    iput-object v9, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->e:Ljava/lang/Object;

    .line 107
    .line 108
    move-wide/from16 v1, p1

    .line 109
    .line 110
    iput-wide v1, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->a:J

    .line 111
    .line 112
    move-wide/from16 v10, p3

    .line 113
    .line 114
    iput-wide v10, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->b:J

    .line 115
    .line 116
    move/from16 v12, p5

    .line 117
    .line 118
    iput v12, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->c:I

    .line 119
    .line 120
    iput v3, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->h:I

    .line 121
    .line 122
    move-wide v3, v10

    .line 123
    invoke-virtual/range {v0 .. v6}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->e(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-ne v10, v7, :cond_4

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_4
    move-wide/from16 v14, p3

    .line 131
    .line 132
    move-object/from16 v1, p6

    .line 133
    .line 134
    move v2, v12

    .line 135
    move-wide/from16 v12, p1

    .line 136
    .line 137
    :goto_2
    check-cast v10, Ljava/lang/Boolean;

    .line 138
    .line 139
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_5

    .line 144
    .line 145
    new-instance v1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v3, "\u9875\u9762SubmitTaskManger.kt -> \u666e\u901a\u6d4b\u8bc4\u4ea4\u5377\u5df2\u5728\u63d0\u4ea4\u4e2d: "

    .line 151
    .line 152
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v3, "_"

    .line 159
    .line 160
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 184
    .line 185
    return-object v1

    .line 186
    :cond_5
    iget-object v3, v0, Lcom/zykj/evaluation/submit/SubmitTaskManger;->a:Lcom/zykj/evaluation/di/AppDatabase;

    .line 187
    .line 188
    invoke-virtual {v3}, Lcom/zykj/evaluation/di/AppDatabase;->g()Ln5/b;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    new-instance v11, Ln5/a;

    .line 193
    .line 194
    sget-object v4, Lm5/i$c;->b:Lm5/i$c;

    .line 195
    .line 196
    invoke-virtual {v4}, Lm5/i;->a()I

    .line 197
    .line 198
    .line 199
    move-result v16

    .line 200
    sget-object v4, Lm5/e$c;->b:Lm5/e$c;

    .line 201
    .line 202
    invoke-virtual {v4}, Lm5/e;->a()I

    .line 203
    .line 204
    .line 205
    move-result v18

    .line 206
    const/16 v21, 0x40

    .line 207
    .line 208
    const/16 v22, 0x0

    .line 209
    .line 210
    const-string v17, ""

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    const/16 v20, 0x0

    .line 215
    .line 216
    invoke-direct/range {v11 .. v22}, Ln5/a;-><init>(JJILjava/lang/String;IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    .line 218
    .line 219
    iput-object v1, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->d:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v9, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->e:Ljava/lang/Object;

    .line 222
    .line 223
    iput-wide v12, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->a:J

    .line 224
    .line 225
    iput-wide v14, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->b:J

    .line 226
    .line 227
    iput v2, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->c:I

    .line 228
    .line 229
    iput v8, v6, Lcom/zykj/evaluation/submit/SubmitTaskManger$startSubmitNormalWork$1;->h:I

    .line 230
    .line 231
    invoke-interface {v3, v11, v6}, Ln5/b;->a(Ln5/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v3

    .line 235
    if-ne v3, v7, :cond_6

    .line 236
    .line 237
    :goto_3
    return-object v7

    .line 238
    :cond_6
    move-object v6, v1

    .line 239
    move-object v5, v9

    .line 240
    move-wide v7, v12

    .line 241
    move-wide v3, v14

    .line 242
    :goto_4
    sget-object v1, Lcom/zykj/evaluation/submit/SubmitNormalWork;->h:Lcom/zykj/evaluation/submit/SubmitNormalWork$a;

    .line 243
    .line 244
    array-length v9, v5

    .line 245
    invoke-static {v5, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    check-cast v5, [Ljava/lang/String;

    .line 250
    .line 251
    move-object/from16 p1, v1

    .line 252
    .line 253
    move/from16 p6, v2

    .line 254
    .line 255
    move-wide/from16 p4, v3

    .line 256
    .line 257
    move-object/from16 p7, v5

    .line 258
    .line 259
    move-wide/from16 p2, v7

    .line 260
    .line 261
    invoke-virtual/range {p1 .. p7}, Lcom/zykj/evaluation/submit/SubmitNormalWork$a;->a(JJI[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 270
    .line 271
    invoke-virtual {v0}, Lcom/zykj/evaluation/submit/SubmitTaskManger;->d()Landroidx/work/WorkManager;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    sget-object v3, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 276
    .line 277
    invoke-virtual {v2, v6, v3, v1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 278
    .line 279
    .line 280
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 281
    .line 282
    return-object v1
.end method
