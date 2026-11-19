.class public final Lcom/zykj/evaluation/upload/OssTaskManger;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final b:Lf7/c;

.field public final c:Lcom/zykj/evaluation/di/AppDatabase;

.field public final d:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lf7/c;Lcom/zykj/evaluation/di/AppDatabase;)V
    .locals 1

    .line 1
    const-string v0, "userFlow"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ossTokenApi"

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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/evaluation/upload/OssTaskManger;->b:Lf7/c;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 24
    .line 25
    new-instance p1, Lf7/a;

    .line 26
    .line 27
    invoke-direct {p1}, Lf7/a;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/zykj/evaluation/upload/OssTaskManger;->d:Lkotlin/Lazy;

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic a()Landroidx/work/WorkManager;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/evaluation/upload/OssTaskManger;->x()Landroidx/work/WorkManager;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p8}, Lcom/zykj/evaluation/upload/OssTaskManger;->e(Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p9, 0x8

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const-string p2, "0"

    .line 13
    .line 14
    move-object v4, p2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object v4, p4

    .line 17
    :goto_0
    and-int/lit8 p2, p9, 0x10

    .line 18
    .line 19
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    const-string p2, "toString(...)"

    .line 30
    .line 31
    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v9, 0x4

    .line 35
    const/4 v10, 0x0

    .line 36
    const-string v6, "-"

    .line 37
    .line 38
    const-string v7, ""

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    move-object v5, p2

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object/from16 v5, p5

    .line 48
    .line 49
    :goto_1
    and-int/lit8 p2, p9, 0x20

    .line 50
    .line 51
    if-eqz p2, :cond_3

    .line 52
    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    move-wide v6, v0

    .line 58
    move-object v3, p3

    .line 59
    move-object/from16 v8, p8

    .line 60
    .line 61
    move-object v0, p0

    .line 62
    move-object v1, p1

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-wide/from16 v6, p6

    .line 65
    .line 66
    move-object v0, p0

    .line 67
    move-object v1, p1

    .line 68
    move-object v3, p3

    .line 69
    move-object/from16 v8, p8

    .line 70
    .line 71
    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/zykj/evaluation/upload/OssTaskManger;->e(Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public static synthetic v(Lcom/zykj/evaluation/upload/OssTaskManger;Ljava/lang/String;I[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest;
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p5, :cond_0

    .line 5
    .line 6
    move p2, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    new-array p3, v0, [Ljava/lang/String;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/OssTaskManger;->u(Ljava/lang/String;I[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final x()Landroidx/work/WorkManager;
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
.method public final c(Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/evaluation/bean/UploadData;->getUploadUrl()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-lez p1, :cond_1

    .line 22
    .line 23
    :goto_0
    const/4 p1, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move p1, v1

    .line 26
    :goto_1
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    move v0, v1

    .line 35
    goto :goto_4

    .line 36
    :cond_2
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    move v0, v1

    .line 41
    :cond_3
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_5

    .line 46
    .line 47
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lcom/zykj/evaluation/bean/UploadData;

    .line 52
    .line 53
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-lez v3, :cond_4

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUploadUrl()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-lez v2, :cond_3

    .line 73
    .line 74
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    if-gez v0, :cond_3

    .line 77
    .line 78
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    :goto_4
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    move p3, v1

    .line 87
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_a

    .line 92
    .line 93
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    move v3, v1

    .line 108
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-eqz v4, :cond_9

    .line 113
    .line 114
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 119
    .line 120
    invoke-virtual {v4}, Lcom/zykj/evaluation/bean/CommitAnswer;->getAnswers()Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    if-eqz v4, :cond_6

    .line 125
    .line 126
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-eqz v5, :cond_6

    .line 131
    .line 132
    move v5, v1

    .line 133
    goto :goto_8

    .line 134
    :cond_6
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    move v5, v1

    .line 139
    :cond_7
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v6

    .line 143
    if-eqz v6, :cond_8

    .line 144
    .line 145
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    check-cast v6, Ljava/lang/String;

    .line 150
    .line 151
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    if-lez v6, :cond_7

    .line 156
    .line 157
    add-int/lit8 v5, v5, 0x1

    .line 158
    .line 159
    if-gez v5, :cond_7

    .line 160
    .line 161
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwCountOverflow()V

    .line 162
    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_8
    :goto_8
    add-int/2addr v3, v5

    .line 166
    goto :goto_6

    .line 167
    :cond_9
    add-int/2addr p3, v3

    .line 168
    goto :goto_5

    .line 169
    :cond_a
    add-int/2addr p1, v0

    .line 170
    add-int/2addr p1, p3

    .line 171
    return p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v1, Lcom/zykj/evaluation/upload/b$b;->b:Lcom/zykj/evaluation/upload/b$b;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "."

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Lcom/zykj/evaluation/upload/a$a;->c:Lcom/zykj/evaluation/upload/a$a;

    .line 21
    .line 22
    const/16 v9, 0x30

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const-wide/16 v6, 0x0

    .line 27
    .line 28
    move-object v0, p0

    .line 29
    move-object v4, p1

    .line 30
    move-object v8, p3

    .line 31
    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->f(Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public final e(Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p8

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->p:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->p:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->n:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->p:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    if-eq v4, v6, :cond_2

    .line 42
    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    iget-wide v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->l:J

    .line 46
    .line 47
    iget-wide v5, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->k:J

    .line 48
    .line 49
    iget-object v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->j:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v8, Lcom/zykj/evaluation/upload/TokenReq;

    .line 52
    .line 53
    iget-object v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v8, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v8, Ljava/lang/String;

    .line 68
    .line 69
    iget-object v9, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v9, Ljava/lang/String;

    .line 72
    .line 73
    iget-object v10, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v10, Ljava/lang/String;

    .line 76
    .line 77
    iget-object v11, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v11, Lcom/zykj/evaluation/upload/a;

    .line 80
    .line 81
    iget-object v12, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v12, Ljava/lang/String;

    .line 84
    .line 85
    iget-object v2, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v2, Lcom/zykj/evaluation/upload/b;

    .line 88
    .line 89
    :try_start_0
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    const/16 v25, 0x0

    .line 93
    .line 94
    goto/16 :goto_3

    .line 95
    .line 96
    :catchall_0
    move-exception v0

    .line 97
    const/16 v25, 0x0

    .line 98
    .line 99
    goto/16 :goto_4

    .line 100
    .line 101
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 104
    .line 105
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    throw v0

    .line 109
    :cond_2
    iget-wide v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->k:J

    .line 110
    .line 111
    iget-object v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->e:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v4, Ljava/lang/String;

    .line 114
    .line 115
    iget-object v6, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->d:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v6, Ljava/lang/String;

    .line 118
    .line 119
    iget-object v10, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v10, Lcom/zykj/evaluation/upload/a;

    .line 122
    .line 123
    iget-object v11, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->b:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v11, Ljava/lang/String;

    .line 126
    .line 127
    iget-object v12, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v12, Lcom/zykj/evaluation/upload/b;

    .line 130
    .line 131
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-wide v13, v8

    .line 135
    move-object v9, v10

    .line 136
    move-object v8, v11

    .line 137
    move-object v11, v4

    .line 138
    move-object v10, v6

    .line 139
    goto :goto_1

    .line 140
    :cond_3
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v0, v1, Lcom/zykj/evaluation/upload/OssTaskManger;->a:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 144
    .line 145
    move-object/from16 v4, p1

    .line 146
    .line 147
    iput-object v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->a:Ljava/lang/Object;

    .line 148
    .line 149
    move-object/from16 v8, p2

    .line 150
    .line 151
    iput-object v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->b:Ljava/lang/Object;

    .line 152
    .line 153
    move-object/from16 v9, p3

    .line 154
    .line 155
    iput-object v9, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->c:Ljava/lang/Object;

    .line 156
    .line 157
    move-object/from16 v10, p4

    .line 158
    .line 159
    iput-object v10, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->d:Ljava/lang/Object;

    .line 160
    .line 161
    move-object/from16 v11, p5

    .line 162
    .line 163
    iput-object v11, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->e:Ljava/lang/Object;

    .line 164
    .line 165
    move-wide/from16 v12, p6

    .line 166
    .line 167
    iput-wide v12, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->k:J

    .line 168
    .line 169
    iput v6, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->p:I

    .line 170
    .line 171
    invoke-static {v0, v2}, Lkotlinx/coroutines/flow/FlowKt;->firstOrNull(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    if-ne v0, v3, :cond_4

    .line 176
    .line 177
    move-object v2, v3

    .line 178
    goto/16 :goto_2

    .line 179
    .line 180
    :cond_4
    move-wide v13, v12

    .line 181
    move-object v12, v4

    .line 182
    :goto_1
    check-cast v0, Lcom/zykj/message/server/bean/UserInfo;

    .line 183
    .line 184
    if-eqz v0, :cond_b

    .line 185
    .line 186
    invoke-virtual {v0}, Lcom/zykj/message/server/bean/UserInfo;->a()Ljava/lang/Long;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-eqz v0, :cond_b

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 193
    .line 194
    .line 195
    move-result-wide v5

    .line 196
    invoke-virtual {v9}, Lcom/zykj/evaluation/upload/a;->a()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v12}, Lcom/zykj/evaluation/upload/b;->a()I

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    new-instance v15, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v15, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    const/16 v25, 0x0

    .line 213
    .line 214
    const-string v7, "+"

    .line 215
    .line 216
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    move-object/from16 v26, v3

    .line 220
    .line 221
    const-string v3, "eval_v2"

    .line 222
    .line 223
    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v15, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v4

    .line 266
    invoke-static {v4}, Lcom/blankj/utilcode/util/EncryptUtils;->encryptMD5ToString(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v22

    .line 270
    move-wide/from16 v20, v13

    .line 271
    .line 272
    new-instance v13, Lcom/zykj/evaluation/upload/TokenReq;

    .line 273
    .line 274
    invoke-virtual {v12}, Lcom/zykj/evaluation/upload/b;->a()I

    .line 275
    .line 276
    .line 277
    move-result v15

    .line 278
    invoke-virtual {v9}, Lcom/zykj/evaluation/upload/a;->b()I

    .line 279
    .line 280
    .line 281
    move-result v17

    .line 282
    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    const/16 v23, 0x1

    .line 286
    .line 287
    const/16 v24, 0x0

    .line 288
    .line 289
    const/4 v14, 0x0

    .line 290
    move-object/from16 v16, v8

    .line 291
    .line 292
    move-object/from16 v18, v10

    .line 293
    .line 294
    move-object/from16 v19, v11

    .line 295
    .line 296
    invoke-direct/range {v13 .. v24}, Lcom/zykj/evaluation/upload/TokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 297
    .line 298
    .line 299
    move-object v14, v13

    .line 300
    move-object/from16 v13, v16

    .line 301
    .line 302
    move-wide/from16 v7, v20

    .line 303
    .line 304
    :try_start_1
    sget-object v15, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 305
    .line 306
    iget-object v15, v1, Lcom/zykj/evaluation/upload/OssTaskManger;->b:Lf7/c;

    .line 307
    .line 308
    iput-object v12, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->a:Ljava/lang/Object;

    .line 309
    .line 310
    iput-object v13, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->b:Ljava/lang/Object;

    .line 311
    .line 312
    iput-object v9, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->c:Ljava/lang/Object;

    .line 313
    .line 314
    iput-object v10, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->d:Ljava/lang/Object;

    .line 315
    .line 316
    iput-object v11, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->e:Ljava/lang/Object;

    .line 317
    .line 318
    iput-object v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->f:Ljava/lang/Object;

    .line 319
    .line 320
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iput-object v0, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->g:Ljava/lang/Object;

    .line 325
    .line 326
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    iput-object v0, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->h:Ljava/lang/Object;

    .line 331
    .line 332
    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    iput-object v0, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->i:Ljava/lang/Object;

    .line 337
    .line 338
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iput-object v0, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->j:Ljava/lang/Object;

    .line 343
    .line 344
    iput-wide v7, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->k:J

    .line 345
    .line 346
    iput-wide v5, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->l:J

    .line 347
    .line 348
    const/4 v0, 0x0

    .line 349
    iput v0, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->m:I

    .line 350
    .line 351
    const/4 v0, 0x2

    .line 352
    iput v0, v2, Lcom/zykj/evaluation/upload/OssTaskManger$getOssData$1;->p:I

    .line 353
    .line 354
    invoke-interface {v15, v14, v2}, Lf7/c;->a(Lcom/zykj/evaluation/upload/TokenReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 358
    move-object/from16 v2, v26

    .line 359
    .line 360
    if-ne v0, v2, :cond_5

    .line 361
    .line 362
    :goto_2
    return-object v2

    .line 363
    :cond_5
    move-wide/from16 v27, v7

    .line 364
    .line 365
    move-object v8, v3

    .line 366
    move-wide v3, v5

    .line 367
    move-wide/from16 v5, v27

    .line 368
    .line 369
    move-object v2, v11

    .line 370
    move-object v11, v9

    .line 371
    move-object v9, v2

    .line 372
    move-object v2, v12

    .line 373
    move-object v12, v13

    .line 374
    :goto_3
    :try_start_2
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    .line 375
    .line 376
    invoke-static {v0}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    check-cast v0, Lcom/zykj/evaluation/upload/OssToken;

    .line 381
    .line 382
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 386
    goto :goto_5

    .line 387
    :catchall_1
    move-exception v0

    .line 388
    goto :goto_4

    .line 389
    :catchall_2
    move-exception v0

    .line 390
    move-wide/from16 v27, v7

    .line 391
    .line 392
    move-object v8, v3

    .line 393
    move-wide v3, v5

    .line 394
    move-wide/from16 v5, v27

    .line 395
    .line 396
    move-object v2, v11

    .line 397
    move-object v11, v9

    .line 398
    move-object v9, v2

    .line 399
    move-object v2, v12

    .line 400
    move-object v12, v13

    .line 401
    :goto_4
    sget-object v7, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 402
    .line 403
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    :goto_5
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v7

    .line 415
    if-eqz v7, :cond_6

    .line 416
    .line 417
    move-object/from16 v0, v25

    .line 418
    .line 419
    :cond_6
    check-cast v0, Lcom/zykj/evaluation/upload/OssToken;

    .line 420
    .line 421
    if-eqz v0, :cond_a

    .line 422
    .line 423
    invoke-virtual {v11}, Lcom/zykj/evaluation/upload/a;->a()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    new-instance v13, Ljava/lang/StringBuilder;

    .line 428
    .line 429
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    const-string v8, "/"

    .line 436
    .line 437
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v13, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    const-string v4, "0"

    .line 454
    .line 455
    invoke-static {v10, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    if-eqz v4, :cond_7

    .line 460
    .line 461
    const-string v4, "yyyyMMdd"

    .line 462
    .line 463
    invoke-static {v4}, Lcom/blankj/utilcode/util/TimeUtils;->getSafeDateFormat(Ljava/lang/String;)Ljava/text/SimpleDateFormat;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    invoke-static {v5, v6, v4}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(JLjava/text/DateFormat;)Ljava/lang/String;

    .line 468
    .line 469
    .line 470
    move-result-object v10

    .line 471
    :cond_7
    sget-object v4, Lcom/zykj/evaluation/upload/a$a;->c:Lcom/zykj/evaluation/upload/a$a;

    .line 472
    .line 473
    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 474
    .line 475
    .line 476
    move-result v4

    .line 477
    if-eqz v4, :cond_8

    .line 478
    .line 479
    const-string v9, ""

    .line 480
    .line 481
    goto :goto_6

    .line 482
    :cond_8
    sget-object v4, Lcom/zykj/evaluation/upload/b$a;->b:Lcom/zykj/evaluation/upload/b$a;

    .line 483
    .line 484
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 485
    .line 486
    .line 487
    move-result v2

    .line 488
    if-eqz v2, :cond_9

    .line 489
    .line 490
    new-instance v2, Ljava/lang/StringBuilder;

    .line 491
    .line 492
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 496
    .line 497
    .line 498
    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 499
    .line 500
    .line 501
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v9

    .line 505
    :cond_9
    :goto_6
    new-instance v7, Lcom/zykj/evaluation/upload/OssData;

    .line 506
    .line 507
    new-instance v2, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 516
    .line 517
    .line 518
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 522
    .line 523
    .line 524
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    invoke-static {v2, v8}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-direct {v7, v0, v2}, Lcom/zykj/evaluation/upload/OssData;-><init>(Lcom/zykj/evaluation/upload/OssToken;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    goto :goto_7

    .line 539
    :cond_a
    move-object/from16 v7, v25

    .line 540
    .line 541
    :goto_7
    return-object v7

    .line 542
    :cond_b
    const/16 v25, 0x0

    .line 543
    .line 544
    return-object v25
.end method

.method public final g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v1, Lcom/zykj/evaluation/upload/b$b;->b:Lcom/zykj/evaluation/upload/b$b;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "."

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Lcom/zykj/evaluation/upload/a$b;->c:Lcom/zykj/evaluation/upload/a$b;

    .line 21
    .line 22
    const/16 v9, 0x38

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    move-object v8, p2

    .line 31
    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->f(Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public final h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v1, Lcom/zykj/evaluation/upload/b$b;->b:Lcom/zykj/evaluation/upload/b$b;

    .line 2
    .line 3
    sget-object v3, Lcom/zykj/evaluation/upload/a$c;->c:Lcom/zykj/evaluation/upload/a$c;

    .line 4
    .line 5
    const/16 v9, 0x3a

    .line 6
    .line 7
    const/4 v10, 0x0

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x0

    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    move-object v8, p1

    .line 15
    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->f(Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final i(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v1, Lcom/zykj/evaluation/upload/b$a;->b:Lcom/zykj/evaluation/upload/b$a;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "."

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Lcom/zykj/evaluation/upload/a$c;->c:Lcom/zykj/evaluation/upload/a$c;

    .line 21
    .line 22
    const/16 v9, 0x38

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x0

    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    move-object v0, p0

    .line 30
    move-object v8, p2

    .line 31
    invoke-static/range {v0 .. v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->f(Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/upload/b;Ljava/lang/String;Lcom/zykj/evaluation/upload/a;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
.end method

.method public final j(Landroidx/work/OneTimeWorkRequest;)Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/upload/OssTaskManger;->l()Landroidx/work/WorkManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1}, Landroidx/work/WorkRequest;->getId()Ljava/util/UUID;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Landroidx/work/WorkManager;->getWorkInfoByIdLiveData(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public final k(Ljava/util/List;)Landroidx/lifecycle/LiveData;
    .locals 2

    .line 1
    const-string v0, "localPathList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/evaluation/upload/OssTaskManger;->l()Landroidx/work/WorkManager;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Landroidx/work/WorkQuery$Builder;->Companion:Landroidx/work/WorkQuery$Builder$Companion;

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Landroidx/work/WorkQuery$Builder$Companion;->fromUniqueWorkNames(Ljava/util/List;)Landroidx/work/WorkQuery$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Landroidx/work/WorkQuery$Builder;->build()Landroidx/work/WorkQuery;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {v0, p1}, Landroidx/work/WorkManager;->getWorkInfosLiveData(Landroidx/work/WorkQuery;)Landroidx/lifecycle/LiveData;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public final l()Landroidx/work/WorkManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/upload/OssTaskManger;->d:Lkotlin/Lazy;

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

.method public final m(Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/OssTaskManger;->c(Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    return p1

    .line 9
    :cond_0
    const/4 p1, 0x0

    .line 10
    return p1
.end method

.method public final n(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->l:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->j:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->l:I

    .line 38
    .line 39
    const/4 v12, 0x2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eq v2, v3, :cond_2

    .line 44
    .line 45
    if-ne v2, v12, :cond_1

    .line 46
    .line 47
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->d:I

    .line 48
    .line 49
    iget v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->c:I

    .line 50
    .line 51
    iget-wide v4, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->b:J

    .line 52
    .line 53
    iget-wide v6, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->a:J

    .line 54
    .line 55
    iget-object v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v8, Ln5/h;

    .line 58
    .line 59
    iget-object v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v13, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v13, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/4 v11, 0x0

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 76
    .line 77
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v1

    .line 81
    :cond_2
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->c:I

    .line 82
    .line 83
    iget-wide v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->b:J

    .line 84
    .line 85
    iget-wide v5, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->a:J

    .line 86
    .line 87
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    move-wide/from16 v4, p1

    .line 101
    .line 102
    iput-wide v4, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->a:J

    .line 103
    .line 104
    move-wide/from16 v6, p3

    .line 105
    .line 106
    iput-wide v6, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->b:J

    .line 107
    .line 108
    move/from16 v8, p5

    .line 109
    .line 110
    iput v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->c:I

    .line 111
    .line 112
    iput v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->l:I

    .line 113
    .line 114
    move-object v3, v1

    .line 115
    invoke-interface/range {v3 .. v9}, Ln5/i;->a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    if-ne v1, v10, :cond_4

    .line 120
    .line 121
    goto/16 :goto_4

    .line 122
    .line 123
    :cond_4
    move-wide/from16 v5, p1

    .line 124
    .line 125
    move-wide/from16 v3, p3

    .line 126
    .line 127
    move/from16 v2, p5

    .line 128
    .line 129
    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    .line 130
    .line 131
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 132
    .line 133
    .line 134
    move-result-object v7

    .line 135
    move-object/from16 v16, v1

    .line 136
    .line 137
    move-wide v13, v3

    .line 138
    move-object v15, v7

    .line 139
    move-object v7, v9

    .line 140
    const/4 v8, 0x0

    .line 141
    move v9, v2

    .line 142
    move-wide v1, v5

    .line 143
    :goto_3
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_7

    .line 148
    .line 149
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    move-object v4, v3

    .line 154
    check-cast v4, Ln5/h;

    .line 155
    .line 156
    invoke-virtual {v4}, Ln5/h;->d()J

    .line 157
    .line 158
    .line 159
    move-result-wide v5

    .line 160
    invoke-virtual {v4}, Ln5/h;->e()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v12

    .line 164
    invoke-virtual {v4}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 165
    .line 166
    .line 167
    move-result-object v17

    .line 168
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v5, "_"

    .line 181
    .line 182
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v5, ": "

    .line 189
    .line 190
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const-string v5, "reStartUploadAnswerWork"

    .line 201
    .line 202
    invoke-static {v5, v0}, Lcom/tencent/bugly/crashreport/BuglyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    sget-object v5, Lm5/e$a;->b:Lm5/e$a;

    .line 214
    .line 215
    invoke-virtual {v5}, Lm5/e;->a()I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-ne v0, v5, :cond_6

    .line 220
    .line 221
    invoke-virtual {v4}, Ln5/h;->d()J

    .line 222
    .line 223
    .line 224
    move-result-wide v5

    .line 225
    move-object v0, v3

    .line 226
    move-object v11, v4

    .line 227
    invoke-virtual {v11}, Ln5/h;->a()J

    .line 228
    .line 229
    .line 230
    move-result-wide v3

    .line 231
    move-wide/from16 v19, v5

    .line 232
    .line 233
    invoke-virtual {v11}, Ln5/h;->b()I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    invoke-virtual {v11}, Ln5/h;->c()Lcom/zykj/evaluation/bean/UploadData;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v12

    .line 245
    iput-object v12, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->f:Ljava/lang/Object;

    .line 246
    .line 247
    iput-object v15, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->g:Ljava/lang/Object;

    .line 248
    .line 249
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    iput-object v0, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->h:Ljava/lang/Object;

    .line 254
    .line 255
    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->i:Ljava/lang/Object;

    .line 260
    .line 261
    iput-wide v1, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->a:J

    .line 262
    .line 263
    iput-wide v13, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->b:J

    .line 264
    .line 265
    iput v9, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->c:I

    .line 266
    .line 267
    iput v8, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->d:I

    .line 268
    .line 269
    const/4 v11, 0x0

    .line 270
    iput v11, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->e:I

    .line 271
    .line 272
    const/4 v12, 0x2

    .line 273
    iput v12, v7, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadAnswerWork$1;->l:I

    .line 274
    .line 275
    move-object/from16 v0, p0

    .line 276
    .line 277
    move-wide/from16 v17, v1

    .line 278
    .line 279
    move-wide/from16 v1, v19

    .line 280
    .line 281
    invoke-virtual/range {v0 .. v7}, Lcom/zykj/evaluation/upload/OssTaskManger;->t(JJILcom/zykj/evaluation/bean/UploadData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    if-ne v1, v10, :cond_5

    .line 286
    .line 287
    :goto_4
    return-object v10

    .line 288
    :cond_5
    move v2, v8

    .line 289
    move v3, v9

    .line 290
    move-wide v4, v13

    .line 291
    move-object v8, v15

    .line 292
    move-object/from16 v13, v16

    .line 293
    .line 294
    move-object v9, v7

    .line 295
    move-wide/from16 v6, v17

    .line 296
    .line 297
    :goto_5
    move-object v15, v8

    .line 298
    move-object/from16 v16, v13

    .line 299
    .line 300
    move v8, v2

    .line 301
    move-wide v13, v4

    .line 302
    move-wide v1, v6

    .line 303
    move-object v7, v9

    .line 304
    move v9, v3

    .line 305
    goto :goto_6

    .line 306
    :cond_6
    move-wide/from16 v17, v1

    .line 307
    .line 308
    const/4 v11, 0x0

    .line 309
    const/4 v12, 0x2

    .line 310
    :goto_6
    move-object/from16 v0, p0

    .line 311
    .line 312
    goto/16 :goto_3

    .line 313
    .line 314
    :cond_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 315
    .line 316
    return-object v0
.end method

.method public final o(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->l:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->j:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v14

    .line 37
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->l:I

    .line 38
    .line 39
    const/4 v10, 0x2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eq v2, v3, :cond_2

    .line 44
    .line 45
    if-ne v2, v10, :cond_1

    .line 46
    .line 47
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->d:I

    .line 48
    .line 49
    iget v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->c:I

    .line 50
    .line 51
    iget-wide v4, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->b:J

    .line 52
    .line 53
    iget-wide v6, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->a:J

    .line 54
    .line 55
    iget-object v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v8, Ln5/v;

    .line 58
    .line 59
    iget-object v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v11, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v11, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move/from16 v24, v10

    .line 71
    .line 72
    const/16 v23, 0x0

    .line 73
    .line 74
    goto/16 :goto_5

    .line 75
    .line 76
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_2
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->c:I

    .line 85
    .line 86
    iget-wide v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->b:J

    .line 87
    .line 88
    iget-wide v5, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->a:J

    .line 89
    .line 90
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    move-wide/from16 v4, p1

    .line 104
    .line 105
    iput-wide v4, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->a:J

    .line 106
    .line 107
    move-wide/from16 v6, p3

    .line 108
    .line 109
    iput-wide v6, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->b:J

    .line 110
    .line 111
    move/from16 v8, p5

    .line 112
    .line 113
    iput v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->c:I

    .line 114
    .line 115
    iput v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->l:I

    .line 116
    .line 117
    move-object v3, v1

    .line 118
    invoke-interface/range {v3 .. v9}, Ln5/w;->a(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    if-ne v1, v14, :cond_4

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_4
    move-wide/from16 v5, p1

    .line 127
    .line 128
    move-wide/from16 v3, p3

    .line 129
    .line 130
    move/from16 v2, p5

    .line 131
    .line 132
    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    .line 133
    .line 134
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    move-object/from16 v16, v1

    .line 139
    .line 140
    move-object v13, v9

    .line 141
    const/4 v1, 0x0

    .line 142
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    if-eqz v8, :cond_7

    .line 147
    .line 148
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    move-object v9, v8

    .line 153
    check-cast v9, Ln5/v;

    .line 154
    .line 155
    invoke-virtual {v9}, Ln5/v;->j()J

    .line 156
    .line 157
    .line 158
    move-result-wide v11

    .line 159
    move-wide/from16 p1, v11

    .line 160
    .line 161
    invoke-virtual {v9}, Ln5/v;->g()J

    .line 162
    .line 163
    .line 164
    move-result-wide v10

    .line 165
    invoke-virtual {v9}, Ln5/v;->d()I

    .line 166
    .line 167
    .line 168
    move-result v12

    .line 169
    new-instance v15, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    move-object/from16 p3, v8

    .line 175
    .line 176
    move-object/from16 p4, v9

    .line 177
    .line 178
    move-wide/from16 v8, p1

    .line 179
    .line 180
    invoke-virtual {v15, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v8, "_"

    .line 184
    .line 185
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v15, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v8, ": "

    .line 192
    .line 193
    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    const-string v9, "reStartUploadQuestionWork"

    .line 204
    .line 205
    invoke-static {v9, v8}, Lcom/tencent/bugly/crashreport/BuglyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {p4 .. p4}, Ln5/v;->d()I

    .line 209
    .line 210
    .line 211
    move-result v8

    .line 212
    sget-object v9, Lm5/e$a;->b:Lm5/e$a;

    .line 213
    .line 214
    invoke-virtual {v9}, Lm5/e;->a()I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    if-ne v8, v9, :cond_6

    .line 219
    .line 220
    invoke-virtual/range {p4 .. p4}, Ln5/v;->j()J

    .line 221
    .line 222
    .line 223
    move-result-wide v8

    .line 224
    invoke-virtual/range {p4 .. p4}, Ln5/v;->h()J

    .line 225
    .line 226
    .line 227
    move-result-wide v10

    .line 228
    invoke-virtual/range {p4 .. p4}, Ln5/v;->i()I

    .line 229
    .line 230
    .line 231
    move-result v12

    .line 232
    invoke-virtual/range {p4 .. p4}, Ln5/v;->g()J

    .line 233
    .line 234
    .line 235
    move-result-wide v18

    .line 236
    move-wide/from16 v20, v8

    .line 237
    .line 238
    invoke-virtual/range {p4 .. p4}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    .line 239
    .line 240
    .line 241
    move-result-object v8

    .line 242
    invoke-virtual/range {p4 .. p4}, Ln5/v;->c()Ljava/util/List;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    move-wide/from16 v22, v10

    .line 247
    .line 248
    invoke-virtual/range {p4 .. p4}, Ln5/v;->l()Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    invoke-virtual/range {p4 .. p4}, Ln5/v;->k()Z

    .line 253
    .line 254
    .line 255
    move-result v11

    .line 256
    move v15, v12

    .line 257
    invoke-virtual/range {p4 .. p4}, Ln5/v;->e()Ljava/util/List;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iput-object v0, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->f:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v7, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->g:Ljava/lang/Object;

    .line 268
    .line 269
    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iput-object v0, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->h:Ljava/lang/Object;

    .line 274
    .line 275
    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iput-object v0, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->i:Ljava/lang/Object;

    .line 280
    .line 281
    iput-wide v5, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->a:J

    .line 282
    .line 283
    iput-wide v3, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->b:J

    .line 284
    .line 285
    iput v2, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->c:I

    .line 286
    .line 287
    iput v1, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->d:I

    .line 288
    .line 289
    const/4 v0, 0x0

    .line 290
    iput v0, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->e:I

    .line 291
    .line 292
    const/4 v0, 0x2

    .line 293
    iput v0, v13, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadQuestionWork$1;->l:I

    .line 294
    .line 295
    move/from16 v24, v0

    .line 296
    .line 297
    move/from16 v17, v2

    .line 298
    .line 299
    move-object/from16 v0, p0

    .line 300
    .line 301
    move-wide/from16 v25, v22

    .line 302
    .line 303
    const/16 v23, 0x0

    .line 304
    .line 305
    const/16 v23, 0x0

    .line 306
    .line 307
    move-object/from16 v22, v7

    .line 308
    .line 309
    move/from16 v27, v15

    .line 310
    .line 311
    move v15, v1

    .line 312
    move-wide/from16 v1, v20

    .line 313
    .line 314
    move-wide/from16 v20, v5

    .line 315
    .line 316
    move/from16 v5, v27

    .line 317
    .line 318
    move-wide/from16 v6, v18

    .line 319
    .line 320
    move-wide/from16 v18, v3

    .line 321
    .line 322
    move-wide/from16 v3, v25

    .line 323
    .line 324
    invoke-virtual/range {v0 .. v13}, Lcom/zykj/evaluation/upload/OssTaskManger;->r(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    if-ne v1, v14, :cond_5

    .line 329
    .line 330
    :goto_4
    return-object v14

    .line 331
    :cond_5
    move-object v9, v13

    .line 332
    move v2, v15

    .line 333
    move-object/from16 v11, v16

    .line 334
    .line 335
    move/from16 v3, v17

    .line 336
    .line 337
    move-wide/from16 v4, v18

    .line 338
    .line 339
    move-wide/from16 v6, v20

    .line 340
    .line 341
    move-object/from16 v8, v22

    .line 342
    .line 343
    :goto_5
    move v1, v2

    .line 344
    move v2, v3

    .line 345
    move-wide v3, v4

    .line 346
    move-wide v5, v6

    .line 347
    move-object v7, v8

    .line 348
    move-object v13, v9

    .line 349
    move-object/from16 v16, v11

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_6
    move v15, v1

    .line 353
    move/from16 v17, v2

    .line 354
    .line 355
    move-wide/from16 v18, v3

    .line 356
    .line 357
    move-wide/from16 v20, v5

    .line 358
    .line 359
    move-object/from16 v22, v7

    .line 360
    .line 361
    const/16 v23, 0x0

    .line 362
    .line 363
    const/16 v24, 0x2

    .line 364
    .line 365
    :goto_6
    move-object/from16 v0, p0

    .line 366
    .line 367
    move/from16 v10, v24

    .line 368
    .line 369
    goto/16 :goto_3

    .line 370
    .line 371
    :cond_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 372
    .line 373
    return-object v0
.end method

.method public final p(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->l:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->j:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->l:I

    .line 38
    .line 39
    const/4 v13, 0x2

    .line 40
    const/4 v3, 0x1

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    if-eq v2, v3, :cond_2

    .line 44
    .line 45
    if-ne v2, v13, :cond_1

    .line 46
    .line 47
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->d:I

    .line 48
    .line 49
    iget v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->c:I

    .line 50
    .line 51
    iget-wide v4, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->b:J

    .line 52
    .line 53
    iget-wide v6, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->a:J

    .line 54
    .line 55
    iget-object v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v8, Ln5/o;

    .line 58
    .line 59
    iget-object v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v10, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v10, Ljava/lang/Iterable;

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move v12, v13

    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    goto/16 :goto_5

    .line 74
    .line 75
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_2
    iget v2, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->c:I

    .line 84
    .line 85
    iget-wide v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->b:J

    .line 86
    .line 87
    iget-wide v5, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->a:J

    .line 88
    .line 89
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-wide/from16 v4, p1

    .line 103
    .line 104
    iput-wide v4, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->a:J

    .line 105
    .line 106
    move-wide/from16 v6, p3

    .line 107
    .line 108
    iput-wide v6, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->b:J

    .line 109
    .line 110
    move/from16 v8, p5

    .line 111
    .line 112
    iput v8, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->c:I

    .line 113
    .line 114
    iput v3, v9, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->l:I

    .line 115
    .line 116
    move-object v3, v1

    .line 117
    invoke-interface/range {v3 .. v9}, Ln5/p;->b(JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-ne v1, v11, :cond_4

    .line 122
    .line 123
    goto/16 :goto_4

    .line 124
    .line 125
    :cond_4
    move-wide/from16 v5, p1

    .line 126
    .line 127
    move-wide/from16 v3, p3

    .line 128
    .line 129
    move/from16 v2, p5

    .line 130
    .line 131
    :goto_2
    check-cast v1, Ljava/lang/Iterable;

    .line 132
    .line 133
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    move-object/from16 v16, v1

    .line 138
    .line 139
    move v15, v2

    .line 140
    move-wide v1, v3

    .line 141
    move-wide v3, v5

    .line 142
    move-object v5, v7

    .line 143
    move-object v10, v9

    .line 144
    const/4 v14, 0x0

    .line 145
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-eqz v6, :cond_7

    .line 150
    .line 151
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    move-object v7, v6

    .line 156
    check-cast v7, Ln5/o;

    .line 157
    .line 158
    invoke-virtual {v7}, Ln5/o;->i()J

    .line 159
    .line 160
    .line 161
    move-result-wide v8

    .line 162
    invoke-virtual {v7}, Ln5/o;->f()J

    .line 163
    .line 164
    .line 165
    move-result-wide v12

    .line 166
    invoke-virtual {v7}, Ln5/o;->e()I

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    move-object/from16 p1, v6

    .line 171
    .line 172
    new-instance v6, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v8, "_"

    .line 181
    .line 182
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    const-string v8, ": "

    .line 189
    .line 190
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    const-string v6, "reStartUploadSelfCorrectQuestionWork"

    .line 201
    .line 202
    invoke-static {v6, v0}, Lcom/tencent/bugly/crashreport/BuglyLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7}, Ln5/o;->e()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    sget-object v6, Lm5/e$a;->b:Lm5/e$a;

    .line 210
    .line 211
    invoke-virtual {v6}, Lm5/e;->a()I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-ne v0, v6, :cond_6

    .line 216
    .line 217
    invoke-virtual {v7}, Ln5/o;->i()J

    .line 218
    .line 219
    .line 220
    move-result-wide v8

    .line 221
    invoke-virtual {v7}, Ln5/o;->g()J

    .line 222
    .line 223
    .line 224
    move-result-wide v12

    .line 225
    invoke-virtual {v7}, Ln5/o;->h()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    move-object/from16 v18, v7

    .line 230
    .line 231
    invoke-virtual/range {v18 .. v18}, Ln5/o;->f()J

    .line 232
    .line 233
    .line 234
    move-result-wide v6

    .line 235
    move-wide/from16 v19, v8

    .line 236
    .line 237
    invoke-virtual/range {v18 .. v18}, Ln5/o;->c()Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-virtual/range {v18 .. v18}, Ln5/o;->d()Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    move/from16 p2, v0

    .line 246
    .line 247
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iput-object v0, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->f:Ljava/lang/Object;

    .line 252
    .line 253
    iput-object v5, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->g:Ljava/lang/Object;

    .line 254
    .line 255
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    iput-object v0, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->h:Ljava/lang/Object;

    .line 260
    .line 261
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    iput-object v0, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->i:Ljava/lang/Object;

    .line 266
    .line 267
    iput-wide v3, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->a:J

    .line 268
    .line 269
    iput-wide v1, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->b:J

    .line 270
    .line 271
    iput v15, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->c:I

    .line 272
    .line 273
    iput v14, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->d:I

    .line 274
    .line 275
    const/4 v0, 0x0

    .line 276
    iput v0, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->e:I

    .line 277
    .line 278
    move-wide/from16 p3, v12

    .line 279
    .line 280
    const/4 v12, 0x2

    .line 281
    iput v12, v10, Lcom/zykj/evaluation/upload/OssTaskManger$reStartUploadSelfCorrectQuestionWork$1;->l:I

    .line 282
    .line 283
    move/from16 v21, v0

    .line 284
    .line 285
    move-wide/from16 v17, v1

    .line 286
    .line 287
    move-object v13, v5

    .line 288
    move-wide/from16 v1, v19

    .line 289
    .line 290
    move-object/from16 v0, p0

    .line 291
    .line 292
    move/from16 v5, p2

    .line 293
    .line 294
    move-wide/from16 v19, v3

    .line 295
    .line 296
    move-wide/from16 v3, p3

    .line 297
    .line 298
    invoke-virtual/range {v0 .. v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->s(JJIJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    if-ne v1, v11, :cond_5

    .line 303
    .line 304
    :goto_4
    return-object v11

    .line 305
    :cond_5
    move-object v9, v10

    .line 306
    move-object v8, v13

    .line 307
    move v2, v14

    .line 308
    move v3, v15

    .line 309
    move-object/from16 v10, v16

    .line 310
    .line 311
    move-wide/from16 v4, v17

    .line 312
    .line 313
    move-wide/from16 v6, v19

    .line 314
    .line 315
    :goto_5
    move v14, v2

    .line 316
    move v15, v3

    .line 317
    move-wide v1, v4

    .line 318
    move-wide v3, v6

    .line 319
    move-object v5, v8

    .line 320
    move-object/from16 v16, v10

    .line 321
    .line 322
    move-object v10, v9

    .line 323
    goto :goto_6

    .line 324
    :cond_6
    move-wide/from16 v17, v1

    .line 325
    .line 326
    move-wide/from16 v19, v3

    .line 327
    .line 328
    move-object v13, v5

    .line 329
    const/4 v12, 0x2

    .line 330
    const/16 v21, 0x0

    .line 331
    .line 332
    :goto_6
    move-object/from16 v0, p0

    .line 333
    .line 334
    move v13, v12

    .line 335
    goto/16 :goto_3

    .line 336
    .line 337
    :cond_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 338
    .line 339
    return-object v0
.end method

.method public final q(Ln5/v;Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p1}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Ln5/v;->c()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ln5/v;->e()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p0, v1, v2, v3}, Lcom/zykj/evaluation/upload/OssTaskManger;->m(Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-virtual {p0, p2, p3, p4}, Lcom/zykj/evaluation/upload/OssTaskManger;->m(Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    invoke-virtual {p1}, Ln5/v;->d()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    sget-object p3, Lm5/e$c;->b:Lm5/e$c;

    .line 30
    .line 31
    invoke-virtual {p3}, Lm5/e;->a()I

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-ne p1, p3, :cond_1

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_1
    return v0
.end method

.method public final r(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p13

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->m:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->m:I

    .line 22
    .line 23
    :goto_0
    move-object v11, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->k:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->m:I

    .line 38
    .line 39
    const/4 v12, 0x2

    .line 40
    const/4 v4, 0x1

    .line 41
    const-string v13, "_"

    .line 42
    .line 43
    if-eqz v3, :cond_3

    .line 44
    .line 45
    if-eq v3, v4, :cond_2

    .line 46
    .line 47
    if-ne v3, v12, :cond_1

    .line 48
    .line 49
    iget-wide v2, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->c:J

    .line 50
    .line 51
    iget v4, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->d:I

    .line 52
    .line 53
    iget-wide v5, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->b:J

    .line 54
    .line 55
    iget-wide v7, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->a:J

    .line 56
    .line 57
    iget-object v9, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v9, Ln5/v;

    .line 60
    .line 61
    iget-object v9, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->g:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v9, Ljava/util/List;

    .line 64
    .line 65
    iget-object v9, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->f:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v9, Ljava/util/List;

    .line 68
    .line 69
    iget-object v9, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->e:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v9, Lcom/zykj/evaluation/bean/UploadData;

    .line 72
    .line 73
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 79
    .line 80
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :cond_2
    iget-boolean v3, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->j:Z

    .line 87
    .line 88
    iget-boolean v4, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->i:Z

    .line 89
    .line 90
    iget-wide v5, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->c:J

    .line 91
    .line 92
    iget v7, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->d:I

    .line 93
    .line 94
    iget-wide v8, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->b:J

    .line 95
    .line 96
    iget-wide v14, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->a:J

    .line 97
    .line 98
    iget-object v10, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->g:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v10, Ljava/util/List;

    .line 101
    .line 102
    iget-object v12, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->f:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v12, Ljava/util/List;

    .line 105
    .line 106
    move-object/from16 v16, v1

    .line 107
    .line 108
    iget-object v1, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->e:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lcom/zykj/evaluation/bean/UploadData;

    .line 111
    .line 112
    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move/from16 v25, v3

    .line 116
    .line 117
    move/from16 v24, v4

    .line 118
    .line 119
    move-object/from16 v3, v16

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    move-object/from16 v16, v1

    .line 123
    .line 124
    invoke-static/range {v16 .. v16}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    move-object/from16 v1, p8

    .line 134
    .line 135
    iput-object v1, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->e:Ljava/lang/Object;

    .line 136
    .line 137
    move-object/from16 v12, p9

    .line 138
    .line 139
    iput-object v12, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->f:Ljava/lang/Object;

    .line 140
    .line 141
    move-object/from16 v14, p12

    .line 142
    .line 143
    iput-object v14, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->g:Ljava/lang/Object;

    .line 144
    .line 145
    move-wide/from16 v5, p1

    .line 146
    .line 147
    iput-wide v5, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->a:J

    .line 148
    .line 149
    move-wide/from16 v7, p3

    .line 150
    .line 151
    iput-wide v7, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->b:J

    .line 152
    .line 153
    move/from16 v9, p5

    .line 154
    .line 155
    iput v9, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->d:I

    .line 156
    .line 157
    move-wide/from16 v4, p6

    .line 158
    .line 159
    iput-wide v4, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->c:J

    .line 160
    .line 161
    move/from16 v15, p10

    .line 162
    .line 163
    iput-boolean v15, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->i:Z

    .line 164
    .line 165
    move/from16 v6, p11

    .line 166
    .line 167
    iput-boolean v6, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->j:Z

    .line 168
    .line 169
    const/4 v10, 0x1

    .line 170
    iput v10, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->m:I

    .line 171
    .line 172
    move-wide v6, v7

    .line 173
    move v8, v9

    .line 174
    move-wide v9, v4

    .line 175
    move-wide/from16 v4, p1

    .line 176
    .line 177
    invoke-interface/range {v3 .. v11}, Ln5/w;->d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-ne v3, v2, :cond_4

    .line 182
    .line 183
    goto/16 :goto_5

    .line 184
    .line 185
    :cond_4
    move-wide/from16 v8, p3

    .line 186
    .line 187
    move/from16 v7, p5

    .line 188
    .line 189
    move-wide/from16 v5, p6

    .line 190
    .line 191
    move/from16 v25, p11

    .line 192
    .line 193
    move-object v10, v14

    .line 194
    move/from16 v24, v15

    .line 195
    .line 196
    move-wide/from16 v14, p1

    .line 197
    .line 198
    :goto_2
    check-cast v3, Ln5/v;

    .line 199
    .line 200
    invoke-virtual {v0, v3, v1, v12, v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->q(Ln5/v;Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    if-eqz v4, :cond_7

    .line 205
    .line 206
    if-eqz v3, :cond_5

    .line 207
    .line 208
    invoke-virtual {v3}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-virtual {v3}, Ln5/v;->c()Ljava/util/List;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-virtual {v3}, Ln5/v;->e()Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    invoke-virtual {v0, v2, v4, v11}, Lcom/zykj/evaluation/upload/OssTaskManger;->c(Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    goto :goto_3

    .line 225
    :cond_5
    const/4 v2, 0x0

    .line 226
    :goto_3
    invoke-virtual {v0, v1, v12, v10}, Lcom/zykj/evaluation/upload/OssTaskManger;->c(Lcom/zykj/evaluation/bean/UploadData;Ljava/util/List;Ljava/util/List;)I

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v3, :cond_6

    .line 231
    .line 232
    invoke-virtual {v3}, Ln5/v;->d()I

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    goto :goto_4

    .line 241
    :cond_6
    const/4 v3, 0x0

    .line 242
    :goto_4
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    new-instance v11, Ljava/lang/StringBuilder;

    .line 251
    .line 252
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 253
    .line 254
    .line 255
    const-string v12, "\u9875\u9762OssTaskManger.kt -> \u4fdd\u7559\u5df2\u6709\u975e\u7a7a\u9898\u76ee\u63d0\u4ea4\u5feb\u7167: "

    .line 256
    .line 257
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v11, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v11, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v11, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    const-string v5, ", oldState="

    .line 282
    .line 283
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string v3, ", oldContent="

    .line 290
    .line 291
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    const-string v2, ", newContent="

    .line 298
    .line 299
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string v1, ", newReq="

    .line 306
    .line 307
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    const-string v1, ", newUpload="

    .line 314
    .line 315
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 333
    .line 334
    return-object v1

    .line 335
    :cond_7
    iget-object v4, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 336
    .line 337
    invoke-virtual {v4}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 338
    .line 339
    .line 340
    move-result-object v4

    .line 341
    move-wide v15, v14

    .line 342
    new-instance v14, Ln5/v;

    .line 343
    .line 344
    sget-object v17, Lm5/e$c;->b:Lm5/e$c;

    .line 345
    .line 346
    invoke-virtual/range {v17 .. v17}, Lm5/e;->a()I

    .line 347
    .line 348
    .line 349
    move-result v27

    .line 350
    move-object/from16 v22, v1

    .line 351
    .line 352
    move-wide/from16 v20, v5

    .line 353
    .line 354
    move/from16 v19, v7

    .line 355
    .line 356
    move-wide/from16 v17, v8

    .line 357
    .line 358
    move-object/from16 v26, v10

    .line 359
    .line 360
    move-object/from16 v23, v12

    .line 361
    .line 362
    invoke-direct/range {v14 .. v27}, Ln5/v;-><init>(JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;I)V

    .line 363
    .line 364
    .line 365
    move-object v12, v14

    .line 366
    move-wide v14, v15

    .line 367
    move/from16 v1, v24

    .line 368
    .line 369
    move/from16 v10, v25

    .line 370
    .line 371
    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    iput-object v0, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->e:Ljava/lang/Object;

    .line 376
    .line 377
    invoke-static/range {v23 .. v23}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    iput-object v0, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->f:Ljava/lang/Object;

    .line 382
    .line 383
    invoke-static/range {v26 .. v26}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    iput-object v0, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->g:Ljava/lang/Object;

    .line 388
    .line 389
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    iput-object v0, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->h:Ljava/lang/Object;

    .line 394
    .line 395
    iput-wide v14, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->a:J

    .line 396
    .line 397
    iput-wide v8, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->b:J

    .line 398
    .line 399
    iput v7, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->d:I

    .line 400
    .line 401
    iput-wide v5, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->c:J

    .line 402
    .line 403
    iput-boolean v1, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->i:Z

    .line 404
    .line 405
    iput-boolean v10, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->j:Z

    .line 406
    .line 407
    const/4 v0, 0x2

    .line 408
    iput v0, v11, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitQuestion$1;->m:I

    .line 409
    .line 410
    invoke-interface {v4, v12, v11}, Ln5/w;->b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    if-ne v0, v2, :cond_8

    .line 415
    .line 416
    :goto_5
    return-object v2

    .line 417
    :cond_8
    move-wide v2, v5

    .line 418
    move v4, v7

    .line 419
    move-wide v5, v8

    .line 420
    move-wide v7, v14

    .line 421
    :goto_6
    sget-object v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e:Lcom/zykj/evaluation/upload/QuestionUploadWork$a;

    .line 422
    .line 423
    move-object/from16 p1, v0

    .line 424
    .line 425
    move-wide/from16 p6, v2

    .line 426
    .line 427
    move/from16 p8, v4

    .line 428
    .line 429
    move-wide/from16 p4, v5

    .line 430
    .line 431
    move-wide/from16 p2, v7

    .line 432
    .line 433
    invoke-virtual/range {p1 .. p8}, Lcom/zykj/evaluation/upload/QuestionUploadWork$a;->a(JJJI)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-virtual {v0}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    check-cast v0, Landroidx/work/OneTimeWorkRequest;

    .line 442
    .line 443
    new-instance v1, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v1, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v1

    .line 473
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/evaluation/upload/OssTaskManger;->l()Landroidx/work/WorkManager;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    sget-object v3, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 478
    .line 479
    invoke-virtual {v2, v1, v3, v0}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 480
    .line 481
    .line 482
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0
.end method

.method public final s(JJIJLjava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p10

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->i:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->i:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->g:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->i:I

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
    iget-wide v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->c:J

    .line 43
    .line 44
    iget v5, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->d:I

    .line 45
    .line 46
    iget-wide v6, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->b:J

    .line 47
    .line 48
    iget-wide v8, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->a:J

    .line 49
    .line 50
    iget-object v10, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v10, Ljava/util/List;

    .line 53
    .line 54
    iget-object v2, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move-wide v12, v8

    .line 62
    move-wide v9, v6

    .line 63
    move-wide v7, v12

    .line 64
    move-wide v12, v3

    .line 65
    goto :goto_1

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
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    new-instance v6, Ln5/o;

    .line 84
    .line 85
    sget-object v4, Lm5/e$c;->b:Lm5/e$c;

    .line 86
    .line 87
    invoke-virtual {v4}, Lm5/e;->a()I

    .line 88
    .line 89
    .line 90
    move-result v16

    .line 91
    move-wide/from16 v7, p1

    .line 92
    .line 93
    move-wide/from16 v9, p3

    .line 94
    .line 95
    move/from16 v11, p5

    .line 96
    .line 97
    move-wide/from16 v12, p6

    .line 98
    .line 99
    move-object/from16 v14, p8

    .line 100
    .line 101
    move-object/from16 v15, p9

    .line 102
    .line 103
    invoke-direct/range {v6 .. v16}, Ln5/o;-><init>(JJIJLjava/util/List;Ljava/util/List;I)V

    .line 104
    .line 105
    .line 106
    invoke-static/range {p8 .. p8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    iput-object v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->e:Ljava/lang/Object;

    .line 111
    .line 112
    invoke-static/range {p9 .. p9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iput-object v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->f:Ljava/lang/Object;

    .line 117
    .line 118
    iput-wide v7, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->a:J

    .line 119
    .line 120
    iput-wide v9, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->b:J

    .line 121
    .line 122
    iput v11, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->d:I

    .line 123
    .line 124
    iput-wide v12, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->c:J

    .line 125
    .line 126
    iput v5, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startCommitSelfCorrectQuestion$1;->i:I

    .line 127
    .line 128
    invoke-interface {v1, v6, v2}, Ln5/p;->c(Ln5/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    if-ne v1, v3, :cond_3

    .line 133
    .line 134
    return-object v3

    .line 135
    :cond_3
    move v5, v11

    .line 136
    :goto_1
    sget-object v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->e:Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;

    .line 137
    .line 138
    move-object/from16 p1, v1

    .line 139
    .line 140
    move/from16 p8, v5

    .line 141
    .line 142
    move-wide/from16 p2, v7

    .line 143
    .line 144
    move-wide/from16 p4, v9

    .line 145
    .line 146
    move-wide/from16 p6, v12

    .line 147
    .line 148
    invoke-virtual/range {p1 .. p8}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;->a(JJJI)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 157
    .line 158
    new-instance v2, Ljava/lang/StringBuilder;

    .line 159
    .line 160
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    const-string v3, "_"

    .line 167
    .line 168
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssTaskManger;->l()Landroidx/work/WorkManager;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    sget-object v4, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 195
    .line 196
    invoke-virtual {v3, v2, v4, v1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 197
    .line 198
    .line 199
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v1
.end method

.method public final t(JJILcom/zykj/evaluation/bean/UploadData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p7

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->g:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->g:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->e:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->g:I

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
    iget v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->c:I

    .line 43
    .line 44
    iget-wide v4, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->b:J

    .line 45
    .line 46
    iget-wide v6, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->a:J

    .line 47
    .line 48
    iget-object v2, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lcom/zykj/evaluation/bean/UploadData;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-wide/from16 v16, v6

    .line 56
    .line 57
    move-wide v7, v4

    .line 58
    move-wide/from16 v5, v16

    .line 59
    .line 60
    move v10, v3

    .line 61
    goto :goto_1

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
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v6, Ln5/h;

    .line 80
    .line 81
    invoke-virtual/range {p6 .. p6}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    move-wide/from16 v7, p1

    .line 86
    .line 87
    move-wide/from16 v9, p3

    .line 88
    .line 89
    move/from16 v11, p5

    .line 90
    .line 91
    move-object/from16 v13, p6

    .line 92
    .line 93
    invoke-direct/range {v6 .. v13}, Ln5/h;-><init>(JJILjava/lang/String;Lcom/zykj/evaluation/bean/UploadData;)V

    .line 94
    .line 95
    .line 96
    iput-object v13, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->d:Ljava/lang/Object;

    .line 97
    .line 98
    iput-wide v7, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->a:J

    .line 99
    .line 100
    iput-wide v9, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->b:J

    .line 101
    .line 102
    iput v11, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->c:I

    .line 103
    .line 104
    iput v5, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadAnswerWork$1;->g:I

    .line 105
    .line 106
    invoke-interface {v1, v6, v2}, Ln5/i;->c(Ln5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    if-ne v1, v3, :cond_3

    .line 111
    .line 112
    return-object v3

    .line 113
    :cond_3
    move-wide v5, v7

    .line 114
    move-wide v7, v9

    .line 115
    move v10, v11

    .line 116
    move-object v2, v13

    .line 117
    :goto_1
    sget-object v4, Lcom/zykj/evaluation/upload/AnswerUploadWork;->g:Lcom/zykj/evaluation/upload/AnswerUploadWork$a;

    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v11

    .line 127
    const/16 v14, 0x60

    .line 128
    .line 129
    const/4 v15, 0x0

    .line 130
    const/4 v12, 0x0

    .line 131
    const/4 v13, 0x0

    .line 132
    invoke-static/range {v4 .. v15}, Lcom/zykj/evaluation/upload/AnswerUploadWork$a;->b(Lcom/zykj/evaluation/upload/AnswerUploadWork$a;JJLjava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Landroidx/work/OneTimeWorkRequest;

    .line 141
    .line 142
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    new-instance v3, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v4, "_"

    .line 155
    .line 156
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssTaskManger;->l()Landroidx/work/WorkManager;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    sget-object v4, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 183
    .line 184
    invoke-virtual {v3, v2, v4, v1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 185
    .line 186
    .line 187
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 188
    .line 189
    return-object v1
.end method

.method public final u(Ljava/lang/String;I[Ljava/lang/String;)Landroidx/work/OneTimeWorkRequest;
    .locals 8

    .line 1
    const-string v0, "fileAbsolutePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "extras"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lcom/zykj/evaluation/upload/FileUploadWork;->e:Lcom/zykj/evaluation/upload/FileUploadWork$a;

    .line 12
    .line 13
    const/16 v6, 0x8

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v3, p1

    .line 18
    move v2, p2

    .line 19
    move-object v4, p3

    .line 20
    invoke-static/range {v1 .. v7}, Lcom/zykj/evaluation/upload/FileUploadWork$a;->b(Lcom/zykj/evaluation/upload/FileUploadWork$a;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroidx/work/OneTimeWorkRequest;

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/zykj/evaluation/upload/OssTaskManger;->l()Landroidx/work/WorkManager;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    sget-object p3, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 35
    .line 36
    invoke-virtual {p2, v3, p3, p1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public final w(JJILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    move-object/from16 v2, p7

    .line 6
    .line 7
    instance-of v3, v2, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->g:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->g:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;-><init>(Lcom/zykj/evaluation/upload/OssTaskManger;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->e:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->g:I

    .line 38
    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    const/4 v7, 0x1

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    if-ne v5, v7, :cond_1

    .line 45
    .line 46
    iget v1, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->c:I

    .line 47
    .line 48
    iget-wide v4, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->b:J

    .line 49
    .line 50
    iget-wide v7, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->a:J

    .line 51
    .line 52
    iget-object v3, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->d:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v3, Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move v15, v1

    .line 60
    move-object v1, v3

    .line 61
    move-wide v13, v4

    .line 62
    move-wide v11, v7

    .line 63
    goto :goto_2

    .line 64
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 65
    .line 66
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 67
    .line 68
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v1

    .line 72
    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_3

    .line 80
    .line 81
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_3
    iget-object v2, v0, Lcom/zykj/evaluation/upload/OssTaskManger;->c:Lcom/zykj/evaluation/di/AppDatabase;

    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v5, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_4

    .line 108
    .line 109
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v9

    .line 113
    move-object/from16 v17, v9

    .line 114
    .line 115
    check-cast v17, Lcom/zykj/evaluation/bean/UploadData;

    .line 116
    .line 117
    new-instance v10, Ln5/h;

    .line 118
    .line 119
    invoke-virtual/range {v17 .. v17}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v16

    .line 123
    move-wide/from16 v11, p1

    .line 124
    .line 125
    move-wide/from16 v13, p3

    .line 126
    .line 127
    move/from16 v15, p5

    .line 128
    .line 129
    invoke-direct/range {v10 .. v17}, Ln5/h;-><init>(JJILjava/lang/String;Lcom/zykj/evaluation/bean/UploadData;)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_4
    iput-object v1, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->d:Ljava/lang/Object;

    .line 137
    .line 138
    move-wide/from16 v11, p1

    .line 139
    .line 140
    iput-wide v11, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->a:J

    .line 141
    .line 142
    move-wide/from16 v13, p3

    .line 143
    .line 144
    iput-wide v13, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->b:J

    .line 145
    .line 146
    move/from16 v15, p5

    .line 147
    .line 148
    iput v15, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->c:I

    .line 149
    .line 150
    iput v7, v3, Lcom/zykj/evaluation/upload/OssTaskManger$startUploadMultiAnswerWork$1;->g:I

    .line 151
    .line 152
    invoke-interface {v2, v5, v3}, Ln5/i;->b(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    if-ne v2, v4, :cond_5

    .line 157
    .line 158
    return-object v4

    .line 159
    :cond_5
    :goto_2
    sget-object v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->c:Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;

    .line 160
    .line 161
    new-instance v3, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    if-eqz v5, :cond_6

    .line 179
    .line 180
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    check-cast v5, Lcom/zykj/evaluation/bean/UploadData;

    .line 185
    .line 186
    new-instance v6, Lkotlin/Pair;

    .line 187
    .line 188
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    invoke-virtual {v5}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-direct {v6, v7, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_6
    move-object/from16 p1, v2

    .line 204
    .line 205
    move-object/from16 p7, v3

    .line 206
    .line 207
    move-wide/from16 p2, v11

    .line 208
    .line 209
    move-wide/from16 p4, v13

    .line 210
    .line 211
    move/from16 p6, v15

    .line 212
    .line 213
    invoke-virtual/range {p1 .. p7}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;->a(JJILjava/util/List;)Landroidx/work/OneTimeWorkRequest$Builder;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v2}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    check-cast v2, Landroidx/work/OneTimeWorkRequest;

    .line 222
    .line 223
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Lcom/zykj/evaluation/bean/UploadData;

    .line 228
    .line 229
    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    new-instance v3, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v4, "_"

    .line 242
    .line 243
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssTaskManger;->l()Landroidx/work/WorkManager;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    sget-object v4, Landroidx/work/ExistingWorkPolicy;->REPLACE:Landroidx/work/ExistingWorkPolicy;

    .line 270
    .line 271
    invoke-virtual {v3, v1, v4, v2}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 272
    .line 273
    .line 274
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v1
.end method
