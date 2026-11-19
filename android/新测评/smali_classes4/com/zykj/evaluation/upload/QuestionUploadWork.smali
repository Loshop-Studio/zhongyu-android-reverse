.class public final Lcom/zykj/evaluation/upload/QuestionUploadWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/hilt/work/HiltWorker;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/upload/QuestionUploadWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B5\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J*\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J*\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0010\u0008\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/evaluation/upload/QuestionUploadWork;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lp5/j;",
        "service",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)V",
        "Landroidx/work/ListenableWorker$Result;",
        "doWork",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "key",
        "",
        "",
        "extras",
        "f",
        "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "d",
        "a",
        "Lp5/j;",
        "b",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "c",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "Ln5/v;",
        "Ln5/v;",
        "uploadQuestion",
        "e",
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
        "SMAP\nQuestionUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuestionUploadWork.kt\ncom/zykj/evaluation/upload/QuestionUploadWork\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Data.kt\nandroidx/work/DataKt\n*L\n1#1,290:1\n1#2:291\n1563#3:292\n1634#3,3:293\n1563#3:296\n1634#3,3:297\n1563#3:300\n1634#3,3:301\n1563#3:304\n1634#3,2:305\n1563#3:307\n1634#3,3:308\n1636#3:311\n1563#3:312\n1634#3,2:313\n1563#3:315\n1634#3,3:316\n1636#3:319\n1563#3:320\n1634#3,3:321\n1563#3:324\n1634#3,2:325\n1563#3:327\n1634#3,3:328\n1636#3:331\n1869#3,2:332\n31#4,5:334\n31#4,5:339\n*S KotlinDebug\n*F\n+ 1 QuestionUploadWork.kt\ncom/zykj/evaluation/upload/QuestionUploadWork\n*L\n100#1:292\n100#1:293,3\n104#1:296\n104#1:297,3\n137#1:300\n137#1:301,3\n145#1:304\n145#1:305,2\n147#1:307\n147#1:308,3\n145#1:311\n159#1:312\n159#1:313,2\n161#1:315\n161#1:316,3\n159#1:319\n193#1:320\n193#1:321,3\n208#1:324\n208#1:325,2\n210#1:327\n210#1:328,3\n208#1:331\n237#1:332,2\n263#1:334,5\n283#1:339,5\n*E\n"
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/evaluation/upload/QuestionUploadWork$a;

.field public static final f:I


# instance fields
.field public final a:Lp5/j;

.field public final b:Lcom/zykj/evaluation/di/AppDatabase;

.field public final c:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public d:Ln5/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/upload/QuestionUploadWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e:Lcom/zykj/evaluation/upload/QuestionUploadWork$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->f:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp5/j;Lcom/zykj/evaluation/di/AppDatabase;Lcom/zykj/evaluation/upload/OssTaskManger;)V
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
    const-string v0, "ossTaskManger"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->a:Lp5/j;

    .line 30
    .line 31
    iput-object p4, p0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 32
    .line 33
    iput-object p5, p0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->c:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 34
    .line 35
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->e:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->e:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;-><init>(Lcom/zykj/evaluation/upload/QuestionUploadWork;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->e:I

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
    iget-object v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, [Ljava/lang/String;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v4, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    .line 70
    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    const-string v4, "uploadQuestion"

    .line 74
    .line 75
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    :cond_3
    move-object v6, v4

    .line 80
    sget-object v4, Lm5/e$a;->b:Lm5/e$a;

    .line 81
    .line 82
    invoke-virtual {v4}, Lm5/e;->a()I

    .line 83
    .line 84
    .line 85
    move-result v19

    .line 86
    const/16 v20, 0x1ff

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const-wide/16 v7, 0x0

    .line 91
    .line 92
    const-wide/16 v9, 0x0

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    const-wide/16 v12, 0x0

    .line 96
    .line 97
    const/4 v14, 0x0

    .line 98
    const/4 v15, 0x0

    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    invoke-static/range {v6 .. v21}, Ln5/v;->b(Ln5/v;JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;IILjava/lang/Object;)Ln5/v;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    move-object/from16 v6, p1

    .line 110
    .line 111
    iput-object v6, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->a:Ljava/lang/Object;

    .line 112
    .line 113
    move-object/from16 v7, p2

    .line 114
    .line 115
    iput-object v7, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 116
    .line 117
    iput v5, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$failedResult$1;->e:I

    .line 118
    .line 119
    invoke-interface {v1, v4, v2}, Ln5/w;->b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-ne v1, v3, :cond_4

    .line 124
    .line 125
    return-object v3

    .line 126
    :cond_4
    move-object v2, v6

    .line 127
    move-object v3, v7

    .line 128
    :goto_1
    new-instance v1, Ljava/lang/Exception;

    .line 129
    .line 130
    new-instance v4, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string v5, "uploadQuestion failed, key is "

    .line 136
    .line 137
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-direct {v1, v4}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-static {v1}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    .line 151
    .line 152
    .line 153
    const-string v1, "ERROR_KEY"

    .line 154
    .line 155
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    const-string v2, "EXTRA_DATA"

    .line 160
    .line 161
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v2, Landroidx/work/Data$Builder;

    .line 170
    .line 171
    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    .line 172
    .line 173
    .line 174
    const/4 v3, 0x0

    .line 175
    :goto_2
    const/4 v4, 0x2

    .line 176
    if-ge v3, v4, :cond_5

    .line 177
    .line 178
    aget-object v4, v1, v3

    .line 179
    .line 180
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    check-cast v5, Ljava/lang/String;

    .line 185
    .line 186
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-virtual {v2, v5, v4}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 191
    .line 192
    .line 193
    add-int/lit8 v3, v3, 0x1

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_5
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    const-string v2, "failure(...)"

    .line 205
    .line 206
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object v1
.end method

.method public doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 55

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;

    iget v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    :goto_0
    move-object v4, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;

    invoke-direct {v2, v1, v0}, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;-><init>(Lcom/zykj/evaluation/upload/QuestionUploadWork;Lkotlin/coroutines/Continuation;)V

    goto :goto_0

    :goto_1
    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->q:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v12

    .line 1
    iget v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const-string v13, "]["

    const-string v15, "."

    const-string v3, "toString(...)"

    const/16 v16, 0x67

    const-string v5, "]--->ossToken\u83b7\u53d6\u5931\u8d25"

    const-string v9, "["

    const-wide/16 v10, -0x1

    const-string v17, "uploadQuestion"

    const/16 p1, 0x68

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v2, Lcom/zykj/evaluation/bean/UploadData;

    iget-object v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v2, Lcom/zykj/evaluation/upload/OssData;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v0

    :pswitch_1
    iget v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v9, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v3, Lkotlin/Unit;

    iget-object v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v3, Lcom/zykj/evaluation/bean/UploadData;

    iget-object v11, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v13, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v13, Lcom/zykj/evaluation/upload/OssData;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v18, v13

    move-object v13, v12

    goto/16 :goto_34

    :pswitch_2
    iget v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v9, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    move-wide v15, v9

    iget-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Throwable;

    iget-object v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    iget-object v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v10, Lcom/zykj/evaluation/bean/UploadData;

    iget-object v11, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v13, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v13, Lcom/zykj/evaluation/upload/OssData;

    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v18, v13

    move-object v13, v12

    goto/16 :goto_33

    :pswitch_3
    iget v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->f:I

    iget v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    iget v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    check-cast v8, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    iget-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v13, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;

    move-object/from16 p1, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Lcom/zykj/evaluation/bean/UploadData;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Lcom/zykj/evaluation/upload/OssData;

    :try_start_0
    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v3

    move v3, v2

    move v2, v0

    move-object/from16 v1, p1

    move-object/from16 v0, v19

    move-object/from16 v19, v9

    move-object v9, v13

    move-object v13, v12

    goto/16 :goto_2e

    :catchall_0
    move-exception v0

    move-object v13, v12

    goto/16 :goto_31

    :pswitch_4
    move-object/from16 v19, v0

    iget v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Lcom/zykj/evaluation/bean/UploadData;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Lcom/zykj/evaluation/upload/OssData;

    :try_start_1
    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-wide/from16 v51, v14

    move-object v14, v9

    move-wide/from16 v8, v51

    move-object v13, v12

    move-object/from16 v0, v19

    goto/16 :goto_2c

    :pswitch_5
    move-object/from16 v19, v0

    iget v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Lcom/zykj/evaluation/bean/UploadData;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    move-object/from16 v17, v0

    check-cast v17, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Lcom/zykj/evaluation/upload/OssData;

    :try_start_2
    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-wide/from16 v51, v14

    move-object v14, v9

    move-wide/from16 v8, v51

    move-object v13, v12

    move-object/from16 v0, v19

    goto/16 :goto_2a

    :pswitch_6
    move-object/from16 v19, v0

    iget v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    move-object v14, v3

    iget-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    move/from16 v21, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v20, v4

    move-object v4, v1

    move-object/from16 v1, v20

    move/from16 v20, v21

    move-object/from16 v21, v5

    move/from16 v5, v20

    move-object/from16 v20, v0

    move-object/from16 v48, v9

    move-object/from16 v26, v13

    move-object/from16 v0, v22

    move-object v13, v6

    move-wide v6, v7

    move-wide v8, v2

    move-object v3, v12

    move-object/from16 v2, v23

    move-object/from16 v23, v15

    move-object/from16 v51, v24

    move-object/from16 v24, v14

    move-wide v14, v10

    move-object/from16 v10, v25

    move-object/from16 v25, v51

    goto/16 :goto_25

    :pswitch_7
    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :goto_2
    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    :goto_3
    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    :goto_4
    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v19

    :pswitch_8
    move-object/from16 v19, v0

    move-object v14, v3

    iget v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    move/from16 v21, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    move-object/from16 v26, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    move-object/from16 v27, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v1, v21

    move-object/from16 v21, v5

    move v5, v1

    move-object v1, v0

    move-object/from16 v0, v19

    move-object/from16 v20, v23

    move-object/from16 v19, v13

    move-object/from16 v23, v15

    move-object v13, v8

    move-object/from16 v51, v26

    move-object/from16 v26, v9

    move-wide v8, v10

    move-object v11, v12

    move-object/from16 v12, v24

    move-object/from16 v10, v27

    move-object/from16 v24, v14

    move-wide v14, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v51

    goto/16 :goto_20

    :pswitch_9
    move-object/from16 v19, v0

    goto :goto_2

    :pswitch_a
    move-object/from16 v19, v0

    move-object v14, v3

    iget v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v8, Lcom/zykj/evaluation/bean/UploadData;

    move/from16 v21, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move/from16 v0, v21

    move-object/from16 v21, v5

    move-wide v5, v6

    move v7, v0

    move-object/from16 v26, v9

    move-object/from16 v0, v19

    move-object/from16 v25, v23

    move-object/from16 v19, v13

    move-object/from16 v23, v15

    move-object v13, v12

    move-wide/from16 v51, v10

    move-object v11, v1

    move-object/from16 v10, v24

    move-object/from16 v24, v14

    move-wide/from16 v14, v51

    goto/16 :goto_1d

    :pswitch_b
    move-object/from16 v19, v0

    move-object v14, v3

    iget v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    move/from16 v21, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v20, v0

    move-object/from16 v33, v8

    move-object/from16 v19, v13

    move-object/from16 v24, v14

    move-object/from16 v0, v23

    move-object v14, v9

    move-object/from16 v23, v15

    move-object v15, v4

    move-wide v3, v2

    move/from16 v2, v21

    move-object/from16 v21, v5

    move-wide/from16 v51, v10

    move-object v11, v1

    move-object v1, v12

    move-wide/from16 v12, v51

    goto/16 :goto_10

    :pswitch_c
    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto/16 :goto_3

    :pswitch_d
    move-object/from16 v19, v0

    move-object v14, v3

    iget v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    move/from16 v21, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v22, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    move-object/from16 v23, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    move-object/from16 v24, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    move-object/from16 v25, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v1, v0

    move-object/from16 v0, v19

    move-object/from16 v20, v23

    move-object/from16 v19, v13

    move-object/from16 v23, v15

    move-object v15, v8

    move-wide/from16 v51, v10

    move-object v11, v4

    move-object/from16 v4, v24

    move-object/from16 v24, v14

    move-wide v13, v2

    move/from16 v2, v21

    move-object/from16 v3, v25

    move-object/from16 v21, v5

    move-object/from16 v25, v9

    :goto_5
    move-wide v5, v6

    move-wide/from16 v7, v51

    goto/16 :goto_e

    :pswitch_e
    move-object/from16 v19, v0

    goto/16 :goto_3

    :pswitch_f
    move-object/from16 v19, v0

    move-object v14, v3

    iget v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iget-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iget-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    check-cast v8, Lcom/zykj/evaluation/bean/UploadData;

    move/from16 v21, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v25, v9

    move-object/from16 v24, v14

    move-object/from16 v20, v15

    move-wide/from16 v51, v2

    move-object v3, v0

    move-object/from16 v0, v19

    move/from16 v2, v21

    move-object/from16 v21, v5

    move-object/from16 v19, v13

    move-wide/from16 v53, v10

    move-object v11, v4

    move-wide/from16 v9, v51

    move-wide/from16 v4, v53

    goto/16 :goto_d

    :pswitch_10
    move-object/from16 v19, v0

    goto/16 :goto_4

    :pswitch_11
    move-object/from16 v19, v0

    iget-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    check-cast v0, Ljava/lang/StringBuilder;

    goto/16 :goto_4

    :pswitch_12
    move-object/from16 v19, v0

    move-object v14, v3

    iget v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iget-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iget-wide v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    move-wide/from16 v22, v7

    iget-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v8, v0

    move-object v0, v5

    move-wide/from16 v51, v10

    move-object v11, v4

    move-wide v4, v6

    move-wide/from16 v6, v22

    move-wide/from16 v22, v51

    move-wide/from16 v51, v2

    move-object v2, v9

    move-wide/from16 v9, v51

    move-object/from16 v3, v19

    goto/16 :goto_7

    :pswitch_13
    move-object/from16 v19, v0

    move-object v14, v3

    invoke-static/range {v19 .. v19}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    move-result-object v0

    const-string v2, "USER_ID"

    invoke-virtual {v0, v2, v10, v11}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    .line 3
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    move-result-object v0

    const-string v6, "TASK_ID"

    invoke-virtual {v0, v6, v10, v11}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    .line 4
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    move-result-object v0

    const-string v8, "QUESTION_ID"

    move-object/from16 v19, v9

    invoke-virtual {v0, v8, v10, v11}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    move-result-wide v8

    .line 5
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    move-result-object v0

    move-wide/from16 v22, v10

    const-string v10, "TASK_STATE"

    const/4 v11, -0x1

    invoke-virtual {v0, v10, v11}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    move-result v0

    cmp-long v10, v2, v22

    if-eqz v10, :cond_40

    cmp-long v10, v6, v22

    if-eqz v10, :cond_40

    cmp-long v10, v8, v22

    if-eqz v10, :cond_40

    if-eq v0, v11, :cond_40

    .line 6
    iget-object v10, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    invoke-virtual {v10}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    move-result-object v10

    iput-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v11, 0x1

    iput v11, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    move-object v11, v4

    move-wide/from16 v51, v8

    move v8, v0

    move-object v0, v5

    move-wide v4, v2

    move-object v3, v10

    move-object/from16 v2, v19

    move-wide/from16 v9, v51

    invoke-interface/range {v3 .. v11}, Ln5/w;->d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v12, :cond_1

    :goto_6
    move-object v13, v12

    goto/16 :goto_36

    .line 7
    :cond_1
    :goto_7
    check-cast v3, Ln5/v;

    if-eqz v3, :cond_2

    .line 8
    iput-object v3, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    goto :goto_8

    :cond_2
    const/4 v3, 0x0

    :goto_8
    if-nez v3, :cond_3

    move-object v15, v11

    move-object v13, v12

    :goto_9
    move v0, v8

    move-wide v8, v9

    goto/16 :goto_35

    .line 9
    :cond_3
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    move-result v3

    if-nez v3, :cond_5

    const/16 v0, 0x65

    .line 10
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    iput-wide v4, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v9, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v8, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v0, 0x3

    iput v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v4, v11

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_4

    goto :goto_6

    :cond_4
    return-object v0

    .line 11
    :cond_5
    new-instance v3, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    move-object/from16 v19, v13

    iget-object v13, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v13, :cond_6

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v13, 0x0

    :cond_6
    invoke-virtual {v13}, Ln5/v;->e()Ljava/util/List;

    move-result-object v13

    iput-object v13, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 12
    iget-object v13, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v13, :cond_7

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v13, 0x0

    :cond_7
    invoke-virtual {v13}, Ln5/v;->f()Lcom/zykj/evaluation/bean/UploadData;

    move-result-object v13

    move-object/from16 v20, v15

    .line 13
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    move-result v15

    sget-object v21, Lm5/e$b;->b:Lm5/e$b;

    move-object/from16 v24, v14

    invoke-virtual/range {v21 .. v21}, Lm5/e;->a()I

    move-result v14

    if-ne v15, v14, :cond_9

    .line 14
    iget-object v14, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Iterable;

    .line 15
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v21, v0

    move-object/from16 v25, v2

    const/16 v0, 0xa

    invoke-static {v14, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 17
    move-object/from16 v30, v2

    check-cast v30, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 18
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/UploadData;->getUploadUrl()Ljava/lang/String;

    move-result-object v33

    const/16 v35, 0x5

    const/16 v36, 0x0

    const-wide/16 v31, 0x0

    const/16 v34, 0x0

    invoke-static/range {v30 .. v36}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    move-result-object v2

    .line 19
    invoke-interface {v15, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_a

    .line 20
    :cond_8
    iput-object v15, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto :goto_c

    :cond_9
    move-object/from16 v21, v0

    move-object/from16 v25, v2

    .line 21
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_b

    .line 22
    iget-object v0, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    .line 23
    new-instance v2, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v0, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v2, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    .line 25
    move-object/from16 v30, v14

    check-cast v30, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    const/16 v35, 0x5

    const/16 v36, 0x0

    const-wide/16 v31, 0x0

    .line 26
    const-string v33, ""

    const/16 v34, 0x0

    invoke-static/range {v30 .. v36}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    move-result-object v14

    .line 27
    invoke-interface {v2, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 28
    :cond_a
    iput-object v2, v3, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :goto_c
    move-object v15, v11

    move-object/from16 v23, v20

    move-object/from16 v14, v25

    const/16 v20, 0x0

    move-object v11, v1

    move-object v1, v12

    goto/16 :goto_12

    .line 29
    :cond_b
    iget-object v0, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->c:Lcom/zykj/evaluation/upload/OssTaskManger;

    iput-object v3, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    iput-object v13, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    iput-wide v4, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v9, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v8, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v2, 0x4

    iput v2, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-virtual {v0, v11}, Lcom/zykj/evaluation/upload/OssTaskManger;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_c

    goto/16 :goto_6

    :cond_c
    move v2, v8

    move-object v8, v13

    .line 30
    :goto_d
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    if-nez v0, :cond_e

    .line 31
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v14, v25

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v15, v21

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-static {v13}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 32
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    iput-wide v4, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v9, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v2, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v0, 0x5

    iput v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v4, v11

    move-object v2, v13

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_d

    goto/16 :goto_6

    :cond_d
    return-object v0

    :cond_e
    move-object/from16 v15, v21

    move-object/from16 v14, v25

    .line 33
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v13, v24

    invoke-static {v1, v13}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v34, 0x4

    const/16 v35, 0x0

    const-string v31, "-"

    const-string v32, ""

    const/16 v33, 0x0

    move-object/from16 v30, v1

    invoke-static/range {v30 .. v35}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 34
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    move-result-object v21

    invoke-static/range {v21 .. v21}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    move-object/from16 v21, v15

    .line 35
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssData;->getObjectKey()Ljava/lang/String;

    move-result-object v15

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "/draft_"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v15, v20

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v20, v1

    .line 36
    sget-object v1, Lcom/zykj/evaluation/upload/UploadUtils;->a:Lcom/zykj/evaluation/upload/UploadUtils;

    move-object/from16 v22, v13

    .line 37
    invoke-virtual {v8}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v23, v15

    .line 38
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssData;->getToken()Lcom/zykj/evaluation/upload/OssToken;

    move-result-object v15

    .line 39
    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    iput-object v3, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    iput-object v8, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    move-object/from16 v26, v0

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-wide v4, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v9, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v2, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v0, 0x6

    iput v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-virtual {v1, v13, v14, v15, v11}, Lcom/zykj/evaluation/upload/UploadUtils;->c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_f

    goto/16 :goto_6

    :cond_f
    move-object v15, v14

    move-object/from16 v1, v26

    move-wide v13, v9

    move-wide/from16 v51, v4

    move-object v4, v8

    goto/16 :goto_5

    :goto_e
    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_11

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v9, v25

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, "]--->\u8349\u7a3f\u4e0a\u4f20\u5931\u8d25"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 41
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    invoke-static/range {p0 .. p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-wide v7, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v5, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v13, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v2, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v1, 0x0

    iput v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    const/4 v1, 0x7

    iput v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v2, v0

    move-object v4, v11

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v1

    if-ne v0, v12, :cond_10

    goto/16 :goto_6

    :cond_10
    return-object v0

    :cond_11
    move-object v10, v11

    move-object/from16 v9, v25

    move-object/from16 v11, p0

    move-object/from16 v25, v0

    .line 42
    iget-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v0, :cond_12

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/16 v30, 0x0

    goto :goto_f

    :cond_12
    move-object/from16 v30, v0

    .line 43
    :goto_f
    sget-object v0, Lm5/e$b;->b:Lm5/e$b;

    invoke-virtual {v0}, Lm5/e;->a()I

    move-result v0

    move-object/from16 v26, v9

    const/4 v9, 0x3

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move-wide/from16 v31, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v28, v15

    move-object/from16 v15, v27

    move-wide/from16 v46, v31

    move-wide/from16 v51, v7

    move v8, v0

    move-object/from16 v7, v25

    move-object/from16 v25, v12

    move-wide/from16 v53, v13

    move-object/from16 v14, v26

    move-wide/from16 v12, v51

    move-wide/from16 v26, v53

    .line 44
    invoke-static/range {v4 .. v10}, Lcom/zykj/evaluation/bean/UploadData;->copy$default(Lcom/zykj/evaluation/bean/UploadData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/zykj/evaluation/bean/UploadData;

    move-result-object v38

    const/16 v44, 0x3ef

    const/16 v45, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    .line 45
    invoke-static/range {v30 .. v45}, Ln5/v;->b(Ln5/v;JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;IILjava/lang/Object;)Ln5/v;

    move-result-object v0

    iput-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    .line 46
    iget-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    move-result-object v0

    iget-object v5, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v5, :cond_13

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_13
    iput-object v1, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    iput-object v3, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    invoke-static/range {v28 .. v28}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v7, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-wide v12, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    move-wide/from16 v8, v46

    iput-wide v8, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    move-object v6, v3

    move-object v10, v4

    move-wide/from16 v3, v26

    iput-wide v3, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v2, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    move-object/from16 v20, v1

    const/16 v1, 0x8

    iput v1, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-interface {v0, v5, v15}, Ln5/w;->b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v1, v25

    if-ne v0, v1, :cond_14

    move-object v13, v1

    goto/16 :goto_36

    :cond_14
    move-object v0, v6

    move-object/from16 v33, v7

    move-wide v6, v8

    move-object/from16 v22, v10

    .line 47
    :goto_10
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "]--->\u8349\u7a3f\u4e0a\u4f20\u6210\u529f\uff0c\u5df2\u4fee\u6539\u6570\u636e\u5e93"

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 48
    iget-object v5, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Iterable;

    .line 49
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v5, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v8, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 51
    move-object/from16 v30, v9

    check-cast v30, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    const/16 v35, 0x5

    const/16 v36, 0x0

    const-wide/16 v31, 0x0

    const/16 v34, 0x0

    .line 52
    invoke-static/range {v30 .. v36}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    move-result-object v9

    .line 53
    invoke-interface {v8, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 54
    :cond_15
    iput-object v8, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move v8, v2

    move-wide v9, v3

    move-wide v4, v12

    move-object/from16 v13, v22

    move-object v3, v0

    .line 55
    :goto_12
    iget-object v0, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v0, :cond_16

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_16
    invoke-virtual {v0}, Ln5/v;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-wide/from16 v51, v9

    move-object v10, v3

    move-wide v2, v6

    move-wide/from16 v6, v51

    move-wide/from16 v51, v4

    move v5, v8

    move-wide/from16 v8, v51

    move-object v4, v15

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_30

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/zykj/evaluation/bean/UploadData;

    .line 56
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    move-result v15

    sget-object v22, Lm5/e$b;->b:Lm5/e$b;

    move-object/from16 v25, v13

    invoke-virtual/range {v22 .. v22}, Lm5/e;->a()I

    move-result v13

    if-ne v15, v13, :cond_1a

    .line 57
    iget-object v13, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Iterable;

    .line 58
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v22, v1

    move-object/from16 v26, v14

    const/16 v14, 0xa

    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v15, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 60
    move-object/from16 v30, v13

    check-cast v30, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 61
    invoke-virtual/range {v30 .. v30}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    move-result-object v13

    move-object/from16 v27, v1

    .line 62
    new-instance v1, Ljava/util/ArrayList;

    move/from16 v28, v5

    invoke-static {v13, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_15
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_18

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .line 64
    check-cast v13, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 65
    invoke-virtual {v13}, Lcom/zykj/evaluation/bean/CommitAnswer;->getUuid()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v31, v5

    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v14, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_17

    .line 66
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getUploadUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    move-wide/from16 v37, v6

    const/4 v6, 0x0

    const/4 v14, 0x1

    invoke-static {v13, v6, v5, v14, v6}, Lcom/zykj/evaluation/bean/CommitAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitAnswer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitAnswer;

    move-result-object v13

    goto :goto_16

    :cond_17
    move-wide/from16 v37, v6

    const/4 v14, 0x1

    .line 67
    :goto_16
    invoke-interface {v1, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v5, v31

    move-wide/from16 v6, v37

    goto :goto_15

    :cond_18
    move-wide/from16 v37, v6

    const/4 v14, 0x1

    const/16 v35, 0x3

    const/16 v36, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    move-object/from16 v34, v1

    .line 68
    invoke-static/range {v30 .. v36}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    move-result-object v1

    .line 69
    invoke-interface {v15, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v27

    move/from16 v5, v28

    const/16 v14, 0xa

    goto :goto_14

    :cond_19
    move/from16 v28, v5

    move-wide/from16 v37, v6

    const/4 v14, 0x1

    .line 70
    iput-object v15, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    goto/16 :goto_1a

    :cond_1a
    move-object/from16 v22, v1

    move/from16 v28, v5

    move-wide/from16 v37, v6

    move-object/from16 v26, v14

    const/4 v14, 0x1

    .line 71
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_1e

    .line 72
    iget-object v1, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    .line 73
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 75
    move-object/from16 v29, v7

    check-cast v29, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 76
    invoke-virtual/range {v29 .. v29}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    move-result-object v7

    .line 77
    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v13, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_18
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 79
    check-cast v7, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 80
    invoke-virtual {v7}, Lcom/zykj/evaluation/bean/CommitAnswer;->getUuid()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1b

    .line 81
    const-string v14, ""

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    move-object/from16 v36, v1

    const/4 v1, 0x0

    const/4 v15, 0x1

    invoke-static {v7, v1, v14, v15, v1}, Lcom/zykj/evaluation/bean/CommitAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitAnswer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitAnswer;

    move-result-object v7

    goto :goto_19

    :cond_1b
    move-object/from16 v36, v1

    .line 82
    :goto_19
    invoke-interface {v13, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v36

    const/4 v14, 0x1

    goto :goto_18

    :cond_1c
    move-object/from16 v36, v1

    const/16 v34, 0x3

    const/16 v35, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v33, v13

    .line 83
    invoke-static/range {v29 .. v35}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    move-result-object v1

    .line 84
    invoke-interface {v5, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v36

    const/16 v6, 0xa

    const/4 v14, 0x1

    goto :goto_17

    .line 85
    :cond_1d
    iput-object v5, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    :goto_1a
    move-object/from16 v1, v22

    move-object/from16 v13, v25

    move-object/from16 v14, v26

    move/from16 v5, v28

    move-wide/from16 v6, v37

    goto/16 :goto_13

    :cond_1e
    if-eqz v20, :cond_20

    .line 86
    invoke-virtual/range {v20 .. v20}, Lcom/zykj/evaluation/upload/OssData;->getToken()Lcom/zykj/evaluation/upload/OssToken;

    move-result-object v1

    invoke-static {v1}, Lf7/b;->a(Lcom/zykj/evaluation/upload/OssToken;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_1c

    :cond_1f
    move-object/from16 v13, v22

    move/from16 v5, v28

    move-wide/from16 v6, v37

    :goto_1b
    move-object/from16 v1, v20

    goto :goto_1e

    .line 87
    :cond_20
    :goto_1c
    iget-object v1, v11, Lcom/zykj/evaluation/upload/QuestionUploadWork;->c:Lcom/zykj/evaluation/upload/OssTaskManger;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    iput-object v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    const/4 v6, 0x0

    iput-object v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    move-wide/from16 v5, v37

    iput-wide v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    move/from16 v7, v28

    iput v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/16 v13, 0x9

    iput v13, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-virtual {v1, v4}, Lcom/zykj/evaluation/upload/OssTaskManger;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v13, v22

    if-ne v1, v13, :cond_21

    goto/16 :goto_36

    :cond_21
    move-wide v14, v5

    move-wide v5, v2

    move-wide v2, v14

    move-object/from16 v22, v0

    move-object v0, v1

    move-wide v14, v8

    move-object v8, v12

    .line 88
    :goto_1d
    move-object/from16 v20, v0

    check-cast v20, Lcom/zykj/evaluation/upload/OssData;

    move-object v12, v8

    move-wide v8, v14

    move-object/from16 v0, v22

    move-wide/from16 v51, v5

    move v5, v7

    move-wide v6, v2

    move-wide/from16 v2, v51

    goto :goto_1b

    :goto_1e
    if-nez v1, :cond_23

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v14, v26

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v15, v21

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 90
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/16 v14, 0xa

    iput v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object v2, v0

    move-object v1, v11

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_22

    goto/16 :goto_36

    :cond_22
    return-object v0

    :cond_23
    move-object/from16 v15, v21

    move-object/from16 v14, v26

    .line 91
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v11

    invoke-virtual {v11}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v15, v24

    invoke-static {v11, v15}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v32, 0x4

    const/16 v33, 0x0

    const-string v29, "-"

    const-string v30, ""

    const/16 v31, 0x0

    move-object/from16 v28, v11

    invoke-static/range {v28 .. v33}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    .line 92
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    .line 93
    invoke-virtual {v1}, Lcom/zykj/evaluation/upload/OssData;->getObjectKey()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v29, v13

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "/"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, v23

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v20, v11

    .line 94
    sget-object v11, Lcom/zykj/evaluation/upload/UploadUtils;->a:Lcom/zykj/evaluation/upload/UploadUtils;

    .line 95
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v22, v15

    .line 96
    invoke-virtual {v1}, Lcom/zykj/evaluation/upload/OssData;->getToken()Lcom/zykj/evaluation/upload/OssToken;

    move-result-object v15

    .line 97
    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    iput-object v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    move-object/from16 v28, v1

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/16 v1, 0xb

    iput v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-virtual {v11, v14, v13, v15, v4}, Lcom/zykj/evaluation/upload/UploadUtils;->c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v11, v29

    if-ne v1, v11, :cond_24

    :goto_1f
    move-object v13, v11

    goto/16 :goto_36

    :cond_24
    move-wide v14, v6

    move-wide v6, v2

    move-object v2, v0

    move-object v0, v1

    move-object/from16 v1, v28

    :goto_20
    move-object/from16 v31, v0

    check-cast v31, Ljava/lang/String;

    if-nez v31, :cond_26

    .line 98
    invoke-virtual {v12}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v3, v26

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v3, v19

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]--->\u7b54\u6848\u4e0a\u4f20\u5931\u8d25"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 99
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    invoke-static/range {p0 .. p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v1, 0x0

    iput v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    const/16 v0, 0xc

    iput v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v1

    if-ne v0, v11, :cond_25

    goto/16 :goto_1f

    :cond_25
    return-object v0

    :cond_26
    move-object v0, v4

    move-object/from16 v3, v26

    move-object/from16 v4, p0

    move-object/from16 v26, v19

    move-object/from16 v19, v13

    .line 100
    iget-object v13, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v13, :cond_27

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/16 v35, 0x0

    goto :goto_21

    :cond_27
    move-object/from16 v35, v13

    .line 101
    :goto_21
    iget-object v13, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v13, :cond_28

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v13, 0x0

    :cond_28
    invoke-virtual {v13}, Ln5/v;->c()Ljava/util/List;

    move-result-object v13

    move-object/from16 v48, v3

    .line 102
    new-instance v3, Ljava/util/ArrayList;

    move/from16 v50, v5

    move-object/from16 v49, v11

    const/16 v11, 0xa

    invoke-static {v13, v11}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 103
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_22
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 104
    check-cast v11, Lcom/zykj/evaluation/bean/UploadData;

    .line 105
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_29

    .line 106
    sget-object v13, Lm5/e$b;->b:Lm5/e$b;

    invoke-virtual {v13}, Lm5/e;->a()I

    move-result v32

    const/16 v33, 0x3

    const/16 v34, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v28, v11

    .line 107
    invoke-static/range {v28 .. v34}, Lcom/zykj/evaluation/bean/UploadData;->copy$default(Lcom/zykj/evaluation/bean/UploadData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/zykj/evaluation/bean/UploadData;

    move-result-object v11

    :goto_23
    move-object/from16 v13, v31

    goto :goto_24

    :cond_29
    move-object/from16 v28, v11

    goto :goto_23

    .line 108
    :goto_24
    invoke-interface {v3, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v31, v13

    goto :goto_22

    :cond_2a
    move-object/from16 v13, v31

    const/16 v46, 0x3df

    const/16 v47, 0x0

    const-wide/16 v33, 0x0

    move-object/from16 v32, v35

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const-wide/16 v38, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move-object/from16 v41, v3

    .line 109
    invoke-static/range {v32 .. v47}, Ln5/v;->b(Ln5/v;JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;IILjava/lang/Object;)Ln5/v;

    move-result-object v3

    iput-object v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    .line 110
    iget-object v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    invoke-virtual {v3}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    move-result-object v3

    iget-object v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v5, :cond_2b

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v5, 0x0

    :cond_2b
    iput-object v1, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    iput-object v10, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    iput-object v2, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    iput-object v12, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v13, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v8, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v14, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    move/from16 v11, v50

    iput v11, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    move-object/from16 v19, v1

    const/16 v1, 0xd

    iput v1, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-interface {v3, v5, v0}, Ln5/w;->b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v3, v49

    if-ne v1, v3, :cond_2c

    move-object v13, v3

    goto/16 :goto_36

    :cond_2c
    move-object v1, v0

    move v5, v11

    move-object v0, v12

    move-object/from16 v20, v19

    .line 111
    :goto_25
    invoke-virtual {v0}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v0

    move-object/from16 v0, v48

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v0, v26

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "]--->\u7b54\u6848\u4e0a\u4f20\u6210\u529f"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v11}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 112
    iget-object v11, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Iterable;

    .line 113
    new-instance v12, Ljava/util/ArrayList;

    move-object/from16 v18, v1

    const/16 v0, 0xa

    invoke-static {v11, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 114
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_26
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 115
    move-object/from16 v28, v11

    check-cast v28, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    .line 116
    invoke-virtual/range {v28 .. v28}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->getAnswers()Ljava/util/List;

    move-result-object v11

    move-object/from16 v22, v1

    .line 117
    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v35, v2

    invoke-static {v11, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    .line 119
    check-cast v11, Lcom/zykj/evaluation/bean/CommitAnswer;

    .line 120
    invoke-virtual {v11}, Lcom/zykj/evaluation/bean/CommitAnswer;->getUuid()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v29, v2

    invoke-virtual/range {v19 .. v19}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    .line 121
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v49, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v11, v3, v0, v2, v3}, Lcom/zykj/evaluation/bean/CommitAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitAnswer;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitAnswer;

    move-result-object v11

    goto :goto_28

    :cond_2d
    move-object/from16 v49, v3

    const/4 v2, 0x1

    .line 122
    :goto_28
    invoke-interface {v1, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v29

    move-object/from16 v3, v49

    const/16 v0, 0xa

    goto :goto_27

    :cond_2e
    move-object/from16 v49, v3

    const/4 v2, 0x1

    const/16 v33, 0x3

    const/16 v34, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v32, v1

    .line 123
    invoke-static/range {v28 .. v34}, Lcom/zykj/evaluation/bean/CommitTaskAnswer;->copy$default(Lcom/zykj/evaluation/bean/CommitTaskAnswer;JLjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    move-result-object v0

    .line 124
    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, v22

    move-object/from16 v2, v35

    const/16 v0, 0xa

    goto :goto_26

    :cond_2f
    move-object/from16 v35, v2

    move-object/from16 v49, v3

    const/4 v2, 0x1

    .line 125
    iput-object v12, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    move-object v11, v4

    move-wide v2, v6

    move-wide v6, v14

    move-object/from16 v4, v18

    move-object/from16 v13, v25

    move-object/from16 v19, v26

    move-object/from16 v0, v35

    move-object/from16 v14, v48

    move-object/from16 v1, v49

    goto/16 :goto_13

    :cond_30
    move-wide/from16 v51, v6

    move v7, v5

    move-wide/from16 v5, v51

    move-object/from16 v25, v13

    move-object v13, v1

    move-object v1, v11

    .line 126
    :try_start_3
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 127
    iget-object v0, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v0, :cond_31

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_29

    :catchall_1
    move-exception v0

    move-wide v14, v5

    move v5, v7

    move-wide v6, v14

    move-wide v14, v8

    move-object/from16 v17, v10

    move-object/from16 v18, v20

    move-object/from16 v16, v25

    move-wide v10, v2

    goto/16 :goto_31

    :cond_31
    :goto_29
    invoke-virtual {v0}, Ln5/v;->l()Z

    move-result v0

    if-eqz v0, :cond_36

    .line 128
    iget-object v0, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    if-nez v0, :cond_32

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_32
    invoke-virtual {v0}, Ln5/v;->k()Z

    move-result v0

    if-eqz v0, :cond_34

    .line 129
    iget-object v0, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->a:Lp5/j;

    iget-object v11, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    const/16 v12, 0xe

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-interface {v0, v2, v3, v11, v4}, Lp5/j;->z(JLjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v0, v13, :cond_33

    goto/16 :goto_36

    :cond_33
    move-wide/from16 v16, v5

    move v5, v7

    move-wide/from16 v6, v16

    move-object/from16 v17, v10

    move-object/from16 v18, v20

    move-object/from16 v16, v25

    move-wide v10, v2

    :goto_2a
    :try_start_4
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    invoke-static {v0}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_2b
    move-object/from16 v19, v14

    move-wide v14, v8

    goto/16 :goto_2f

    :catchall_2
    move-exception v0

    move-wide v14, v8

    goto/16 :goto_31

    .line 130
    :cond_34
    :try_start_5
    iget-object v0, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork;->a:Lp5/j;

    iget-object v11, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    const/16 v12, 0xf

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-interface {v0, v2, v3, v11, v4}, Lp5/j;->b(JLcom/zykj/evaluation/bean/CommitTaskAnswer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-ne v0, v13, :cond_35

    goto/16 :goto_36

    :cond_35
    move-wide/from16 v16, v5

    move v5, v7

    move-wide/from16 v6, v16

    move-object/from16 v17, v10

    move-object/from16 v18, v20

    move-object/from16 v16, v25

    move-wide v10, v2

    :goto_2c
    :try_start_6
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    invoke-static {v0}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_2b

    .line 131
    :cond_36
    :try_start_7
    iget-object v0, v10, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Iterable;

    .line 132
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-wide v15, v5

    move v5, v7

    move-wide v6, v15

    move-object/from16 v17, v10

    move-object/from16 v19, v14

    move-object/from16 v18, v20

    move-object/from16 v16, v25

    move-wide v14, v8

    move-object v8, v11

    move-object v9, v0

    move-object v0, v1

    move-wide v10, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_2d
    :try_start_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_38

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v1, v12

    check-cast v1, Lcom/zykj/evaluation/bean/CommitTaskAnswer;

    move-object/from16 p1, v9

    .line 133
    iget-object v9, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->a:Lp5/j;

    move-object/from16 v20, v12

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    iput-object v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    iput-object v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v6, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    iput v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    iput v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->f:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->g:I

    const/16 v12, 0x10

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-interface {v9, v10, v11, v1, v4}, Lp5/j;->u(JLcom/zykj/evaluation/bean/CommitTaskAnswer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v13, :cond_37

    goto/16 :goto_36

    :cond_37
    move-object v9, v1

    move-object v1, v0

    move-object v0, v9

    move-object/from16 v9, p1

    :goto_2e
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    invoke-static {v0}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    move-object v0, v1

    move-object/from16 v1, p0

    goto :goto_2d

    :catchall_3
    move-exception v0

    goto :goto_31

    .line 134
    :cond_38
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 135
    :goto_2f
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v19

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "]--->\u4f5c\u7b54\u63a5\u53e3\u63d0\u4ea4\u6210\u529f"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 136
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 137
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_30
    move v2, v5

    move-wide v5, v6

    move-wide v8, v14

    move-object v7, v0

    goto :goto_32

    :goto_31
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_30

    .line 138
    :goto_32
    invoke-static {v7}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_3a

    .line 139
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    move-result-object v0

    new-instance v1, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$11$1;

    const/4 v12, 0x0

    invoke-direct {v1, v3, v12}, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$11$1;-><init>(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    iput-object v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    iput-object v3, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v8, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v5, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    const/16 v12, 0x11

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    invoke-static {v0, v1, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_39

    goto/16 :goto_36

    :cond_39
    move-wide/from16 v51, v10

    move-object/from16 v10, v16

    move-wide/from16 v15, v51

    move-object/from16 v11, v17

    .line 140
    :goto_33
    invoke-static {v3}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    move-object/from16 v17, v11

    move-wide/from16 v51, v15

    move-object/from16 v16, v10

    move-wide/from16 v10, v51

    :cond_3a
    move v0, v2

    move-object v1, v7

    move-wide v14, v8

    move-wide v7, v5

    .line 141
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3b

    const/4 v1, 0x0

    :cond_3b
    check-cast v1, Lkotlin/Unit;

    if-eqz v1, :cond_3e

    .line 142
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v12, 0x0

    iput v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->e:I

    const/16 v1, 0x12

    iput v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->g(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_3c

    goto/16 :goto_36

    :cond_3c
    move-object v3, v2

    move v2, v0

    move-object v0, v3

    move-wide v5, v7

    move-wide v7, v10

    move-wide v9, v14

    move-object/from16 v3, v16

    move-object/from16 v11, v17

    :goto_34
    check-cast v0, Landroidx/work/ListenableWorker$Result;

    if-eqz v0, :cond_3d

    return-object v0

    :cond_3d
    move v0, v2

    move-object/from16 v16, v3

    move-wide v14, v9

    move-object/from16 v17, v11

    move-wide v10, v7

    move-wide v7, v5

    :cond_3e
    const/16 v1, 0x6a

    .line 143
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    iput-object v12, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    iput-wide v14, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v10, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v7, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/16 v0, 0x13

    iput v0, v4, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_3f

    goto/16 :goto_36

    :cond_3f
    return-object v0

    :cond_40
    move-object v15, v4

    move-wide v9, v8

    move-object v13, v12

    move v8, v0

    move-wide v4, v2

    move-object/from16 v2, v19

    goto/16 :goto_9

    .line 144
    :goto_35
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    cmp-long v3, v4, v22

    if-nez v3, :cond_41

    .line 145
    const-string v3, "userId,"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_41
    cmp-long v3, v6, v22

    if-nez v3, :cond_42

    .line 146
    const-string v3, "taskId,"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_42
    cmp-long v3, v8, v22

    if-nez v3, :cond_43

    .line 147
    const-string v3, "questionId,"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_43
    const/4 v11, -0x1

    if-ne v0, v11, :cond_44

    .line 148
    const-string v3, "taskState,"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    :cond_44
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "] \u53c2\u6570\u9519\u8bef, "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    const/16 v2, 0x64

    .line 150
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    iput-wide v4, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->a:J

    iput-wide v6, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->b:J

    iput-wide v8, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->c:J

    iput v0, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->d:I

    const/4 v0, 0x2

    iput v0, v15, Lcom/zykj/evaluation/upload/QuestionUploadWork$doWork$1;->s:I

    const/4 v3, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object v4, v15

    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/QuestionUploadWork;->e(Lcom/zykj/evaluation/upload/QuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v13, :cond_45

    :goto_36
    return-object v13

    :cond_45
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->e:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->e:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;-><init>(Lcom/zykj/evaluation/upload/QuestionUploadWork;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->e:I

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
    iget-object v3, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, [Ljava/lang/String;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->a:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->j()Ln5/w;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v4, v0, Lcom/zykj/evaluation/upload/QuestionUploadWork;->d:Ln5/v;

    .line 70
    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    const-string v4, "uploadQuestion"

    .line 74
    .line 75
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    :cond_3
    move-object v6, v4

    .line 80
    sget-object v4, Lm5/e$b;->b:Lm5/e$b;

    .line 81
    .line 82
    invoke-virtual {v4}, Lm5/e;->a()I

    .line 83
    .line 84
    .line 85
    move-result v19

    .line 86
    const/16 v20, 0x1ff

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const-wide/16 v7, 0x0

    .line 91
    .line 92
    const-wide/16 v9, 0x0

    .line 93
    .line 94
    const/4 v11, 0x0

    .line 95
    const-wide/16 v12, 0x0

    .line 96
    .line 97
    const/4 v14, 0x0

    .line 98
    const/4 v15, 0x0

    .line 99
    const/16 v16, 0x0

    .line 100
    .line 101
    const/16 v17, 0x0

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    invoke-static/range {v6 .. v21}, Ln5/v;->b(Ln5/v;JJIJLcom/zykj/evaluation/bean/UploadData;Ljava/util/List;ZZLjava/util/List;IILjava/lang/Object;)Ln5/v;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    move-object/from16 v6, p1

    .line 110
    .line 111
    iput-object v6, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->a:Ljava/lang/Object;

    .line 112
    .line 113
    move-object/from16 v7, p2

    .line 114
    .line 115
    iput-object v7, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->b:Ljava/lang/Object;

    .line 116
    .line 117
    iput v5, v2, Lcom/zykj/evaluation/upload/QuestionUploadWork$successResult$1;->e:I

    .line 118
    .line 119
    invoke-interface {v1, v4, v2}, Ln5/w;->b(Ln5/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-ne v1, v3, :cond_4

    .line 124
    .line 125
    return-object v3

    .line 126
    :cond_4
    move-object v2, v6

    .line 127
    move-object v3, v7

    .line 128
    :goto_1
    const-string v1, "SUCCESS_KEY"

    .line 129
    .line 130
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    const-string v2, "EXTRA_DATA"

    .line 135
    .line 136
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    new-instance v2, Landroidx/work/Data$Builder;

    .line 145
    .line 146
    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    .line 147
    .line 148
    .line 149
    const/4 v3, 0x0

    .line 150
    :goto_2
    const/4 v4, 0x2

    .line 151
    if-ge v3, v4, :cond_5

    .line 152
    .line 153
    aget-object v4, v1, v3

    .line 154
    .line 155
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v5

    .line 159
    check-cast v5, Ljava/lang/String;

    .line 160
    .line 161
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v2, v5, v4}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 166
    .line 167
    .line 168
    add-int/lit8 v3, v3, 0x1

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v2, "success(...)"

    .line 180
    .line 181
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-object v1
.end method
