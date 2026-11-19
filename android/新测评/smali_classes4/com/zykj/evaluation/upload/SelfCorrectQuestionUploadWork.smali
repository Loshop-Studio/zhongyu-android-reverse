.class public final Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;
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
        Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0019B5\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ*\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J*\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;",
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
        "",
        "key",
        "",
        "",
        "extras",
        "Landroidx/work/ListenableWorker$Result;",
        "f",
        "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "d",
        "doWork",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "Lp5/j;",
        "b",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "c",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "Ln5/o;",
        "Ln5/o;",
        "uploadCorrectSelfQuestion",
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
        "SMAP\nSelfCorrectQuestionUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelfCorrectQuestionUploadWork.kt\ncom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Data.kt\nandroidx/work/DataKt\n*L\n1#1,245:1\n1#2:246\n1563#3:247\n1634#3,2:248\n1563#3:250\n1634#3,3:251\n1636#3:254\n1563#3:255\n1634#3,2:256\n1563#3:258\n1634#3,3:259\n1636#3:262\n1563#3:263\n1634#3,3:264\n1563#3:267\n1634#3,2:268\n1563#3:270\n1634#3,3:271\n1636#3:274\n1869#3,2:275\n31#4,5:277\n31#4,5:282\n*S KotlinDebug\n*F\n+ 1 SelfCorrectQuestionUploadWork.kt\ncom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork\n*L\n105#1:247\n105#1:248,2\n107#1:250\n107#1:251,3\n105#1:254\n121#1:255\n121#1:256,2\n123#1:258\n123#1:259,3\n121#1:262\n161#1:263\n161#1:264,3\n177#1:267\n177#1:268,2\n179#1:270\n179#1:271,3\n177#1:274\n195#1:275,2\n221#1:277,5\n238#1:282,5\n*E\n"
    }
.end annotation


# static fields
.field public static final e:Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;

.field public static final f:I


# instance fields
.field public final a:Lp5/j;

.field public final b:Lcom/zykj/evaluation/di/AppDatabase;

.field public final c:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public d:Ln5/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->e:Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->f:I

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
    iput-object p3, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->a:Lp5/j;

    .line 30
    .line 31
    iput-object p4, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 32
    .line 33
    iput-object p5, p0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->c:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 34
    .line 35
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final d(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->e:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->e:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;-><init>(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->e:I

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
    iget-object v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, [Ljava/lang/String;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->a:Ljava/lang/Object;

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
    iget-object v1, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v4, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 70
    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    const-string v4, "uploadCorrectSelfQuestion"

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
    move-result v16

    .line 86
    const/16 v17, 0x3f

    .line 87
    .line 88
    const/16 v18, 0x0

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
    invoke-static/range {v6 .. v18}, Ln5/o;->b(Ln5/o;JJIJLjava/util/List;Ljava/util/List;IILjava/lang/Object;)Ln5/o;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    move-object/from16 v6, p1

    .line 104
    .line 105
    iput-object v6, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->a:Ljava/lang/Object;

    .line 106
    .line 107
    move-object/from16 v7, p2

    .line 108
    .line 109
    iput-object v7, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 110
    .line 111
    iput v5, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$failedResult$1;->e:I

    .line 112
    .line 113
    invoke-interface {v1, v4, v2}, Ln5/p;->c(Ln5/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-ne v1, v3, :cond_4

    .line 118
    .line 119
    return-object v3

    .line 120
    :cond_4
    move-object v2, v6

    .line 121
    move-object v3, v7

    .line 122
    :goto_1
    const-string v1, "ERROR_KEY"

    .line 123
    .line 124
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v2, "EXTRA_DATA"

    .line 129
    .line 130
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v2, Landroidx/work/Data$Builder;

    .line 139
    .line 140
    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    .line 141
    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    :goto_2
    const/4 v4, 0x2

    .line 145
    if-ge v3, v4, :cond_5

    .line 146
    .line 147
    aget-object v4, v1, v3

    .line 148
    .line 149
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    check-cast v5, Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v2, v5, v4}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 160
    .line 161
    .line 162
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v2, "failure(...)"

    .line 174
    .line 175
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v1
.end method

.method public static synthetic e(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
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
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private final f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->e:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->e:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;-><init>(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->e:I

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
    iget-object v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v3, [Ljava/lang/String;

    .line 45
    .line 46
    iget-object v2, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->a:Ljava/lang/Object;

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
    iget-object v1, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 64
    .line 65
    invoke-virtual {v1}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v4, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 70
    .line 71
    if-nez v4, :cond_3

    .line 72
    .line 73
    const-string v4, "uploadCorrectSelfQuestion"

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
    move-result v16

    .line 86
    const/16 v17, 0x3f

    .line 87
    .line 88
    const/16 v18, 0x0

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
    invoke-static/range {v6 .. v18}, Ln5/o;->b(Ln5/o;JJIJLjava/util/List;Ljava/util/List;IILjava/lang/Object;)Ln5/o;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    move-object/from16 v6, p1

    .line 104
    .line 105
    iput-object v6, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->a:Ljava/lang/Object;

    .line 106
    .line 107
    move-object/from16 v7, p2

    .line 108
    .line 109
    iput-object v7, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->b:Ljava/lang/Object;

    .line 110
    .line 111
    iput v5, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$successResult$1;->e:I

    .line 112
    .line 113
    invoke-interface {v1, v4, v2}, Ln5/p;->c(Ln5/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    if-ne v1, v3, :cond_4

    .line 118
    .line 119
    return-object v3

    .line 120
    :cond_4
    move-object v2, v6

    .line 121
    move-object v3, v7

    .line 122
    :goto_1
    const-string v1, "SUCCESS_KEY"

    .line 123
    .line 124
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const-string v2, "EXTRA_DATA"

    .line 129
    .line 130
    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v2, Landroidx/work/Data$Builder;

    .line 139
    .line 140
    invoke-direct {v2}, Landroidx/work/Data$Builder;-><init>()V

    .line 141
    .line 142
    .line 143
    const/4 v3, 0x0

    .line 144
    :goto_2
    const/4 v4, 0x2

    .line 145
    if-ge v3, v4, :cond_5

    .line 146
    .line 147
    aget-object v4, v1, v3

    .line 148
    .line 149
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    check-cast v5, Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v2, v5, v4}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 160
    .line 161
    .line 162
    add-int/lit8 v3, v3, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    invoke-virtual {v2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {v1}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    const-string v2, "success(...)"

    .line 174
    .line 175
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v1
.end method

.method public static synthetic g(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
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
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 47

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 22
    .line 23
    :goto_0
    move-object v4, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;-><init>(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->p:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v12

    .line 37
    iget v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 38
    .line 39
    const-string v13, "]["

    .line 40
    .line 41
    const/4 v15, -0x1

    .line 42
    const-string v16, "uploadCorrectSelfQuestion"

    .line 43
    .line 44
    const-string v5, "["

    .line 45
    .line 46
    packed-switch v2, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :pswitch_0
    iget-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v2, Lcom/zykj/evaluation/upload/OssData;

    .line 60
    .line 61
    iget-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_1
    iget v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 70
    .line 71
    iget-wide v5, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 72
    .line 73
    iget-wide v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 74
    .line 75
    iget-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 76
    .line 77
    iget-object v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v3, Lkotlin/Unit;

    .line 80
    .line 81
    iget-object v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v3, Lcom/zykj/evaluation/upload/OssData;

    .line 84
    .line 85
    iget-object v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v13, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 88
    .line 89
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    move-object v15, v12

    .line 93
    goto/16 :goto_22

    .line 94
    .line 95
    :pswitch_2
    iget v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 96
    .line 97
    iget-wide v6, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 98
    .line 99
    iget-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 100
    .line 101
    iget-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 102
    .line 103
    iget-object v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v8, Ljava/lang/Throwable;

    .line 106
    .line 107
    iget-object v15, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 108
    .line 109
    iget-object v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v3, Lcom/zykj/evaluation/upload/OssData;

    .line 112
    .line 113
    iget-object v9, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 116
    .line 117
    invoke-static {v0}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v17, v5

    .line 121
    .line 122
    move-object v5, v12

    .line 123
    goto/16 :goto_1f

    .line 124
    .line 125
    :pswitch_3
    iget v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->f:I

    .line 126
    .line 127
    iget v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->e:I

    .line 128
    .line 129
    iget v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 130
    .line 131
    iget-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 132
    .line 133
    iget-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 134
    .line 135
    iget-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 136
    .line 137
    iget-object v15, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v15, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 140
    .line 141
    iget-object v15, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v15, Ljava/util/Iterator;

    .line 144
    .line 145
    iget-object v6, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v6, Ljava/lang/Iterable;

    .line 148
    .line 149
    move-object/from16 v17, v0

    .line 150
    .line 151
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;

    .line 154
    .line 155
    move-object/from16 v16, v0

    .line 156
    .line 157
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 158
    .line 159
    move-object/from16 v18, v0

    .line 160
    .line 161
    check-cast v18, Lcom/zykj/evaluation/upload/OssData;

    .line 162
    .line 163
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 164
    .line 165
    move-object/from16 v19, v0

    .line 166
    .line 167
    check-cast v19, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 168
    .line 169
    :try_start_0
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 170
    .line 171
    .line 172
    move-object/from16 v0, v17

    .line 173
    .line 174
    move-object/from16 v17, v5

    .line 175
    .line 176
    move-object v5, v12

    .line 177
    goto/16 :goto_1b

    .line 178
    .line 179
    :catchall_0
    move-exception v0

    .line 180
    move-object/from16 v17, v5

    .line 181
    .line 182
    move-object v5, v12

    .line 183
    goto/16 :goto_1d

    .line 184
    .line 185
    :pswitch_4
    move-object/from16 v17, v0

    .line 186
    .line 187
    iget v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 188
    .line 189
    iget-wide v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 190
    .line 191
    iget-wide v6, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 192
    .line 193
    iget-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 194
    .line 195
    iget-object v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v10, Ljava/lang/String;

    .line 198
    .line 199
    iget-object v11, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v11, Ljava/lang/String;

    .line 202
    .line 203
    iget-object v11, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v11, Ljava/lang/String;

    .line 206
    .line 207
    iget-object v11, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v11, Ljava/lang/String;

    .line 210
    .line 211
    iget-object v11, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v11, Lcom/zykj/evaluation/bean/UploadData;

    .line 214
    .line 215
    iget-object v15, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v15, Ljava/util/Iterator;

    .line 218
    .line 219
    iget-object v14, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v14, Lcom/zykj/evaluation/upload/OssData;

    .line 222
    .line 223
    move/from16 v19, v0

    .line 224
    .line 225
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 228
    .line 229
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    move-object/from16 v18, v4

    .line 233
    .line 234
    move-object v4, v1

    .line 235
    move-object/from16 v1, v18

    .line 236
    .line 237
    move-object/from16 v40, v5

    .line 238
    .line 239
    move-object v5, v12

    .line 240
    move-object/from16 v22, v13

    .line 241
    .line 242
    const/16 v18, 0x1

    .line 243
    .line 244
    move-wide/from16 v43, v6

    .line 245
    .line 246
    move-object v6, v0

    .line 247
    move-object v0, v15

    .line 248
    move/from16 v7, v19

    .line 249
    .line 250
    move-object v15, v10

    .line 251
    move-wide/from16 v45, v2

    .line 252
    .line 253
    move-object v2, v11

    .line 254
    move-wide/from16 v10, v45

    .line 255
    .line 256
    move-object v3, v14

    .line 257
    move-wide/from16 v13, v43

    .line 258
    .line 259
    goto/16 :goto_17

    .line 260
    .line 261
    :pswitch_5
    move-object/from16 v17, v0

    .line 262
    .line 263
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 264
    .line 265
    check-cast v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;

    .line 266
    .line 267
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v0, Ljava/lang/String;

    .line 270
    .line 271
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, Ljava/lang/String;

    .line 274
    .line 275
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Ljava/lang/String;

    .line 278
    .line 279
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    .line 282
    .line 283
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 286
    .line 287
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 290
    .line 291
    :goto_2
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    return-object v17

    .line 295
    :pswitch_6
    move-object/from16 v17, v0

    .line 296
    .line 297
    iget v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 298
    .line 299
    iget-wide v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 300
    .line 301
    iget-wide v6, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 302
    .line 303
    iget-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 304
    .line 305
    iget-object v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v10, Ljava/lang/String;

    .line 308
    .line 309
    iget-object v11, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v11, Ljava/lang/String;

    .line 312
    .line 313
    iget-object v14, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v14, Ljava/lang/String;

    .line 316
    .line 317
    iget-object v15, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v15, Lcom/zykj/evaluation/bean/UploadData;

    .line 320
    .line 321
    move/from16 v19, v0

    .line 322
    .line 323
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v0, Ljava/util/Iterator;

    .line 326
    .line 327
    move-object/from16 v20, v0

    .line 328
    .line 329
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 330
    .line 331
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 332
    .line 333
    move-object/from16 v21, v0

    .line 334
    .line 335
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 338
    .line 339
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    move-object/from16 v22, v13

    .line 343
    .line 344
    move-object/from16 v1, v21

    .line 345
    .line 346
    const/16 v18, 0x1

    .line 347
    .line 348
    move-wide/from16 v43, v2

    .line 349
    .line 350
    move-object v3, v0

    .line 351
    move-object v2, v15

    .line 352
    move-object/from16 v0, v17

    .line 353
    .line 354
    move-object/from16 v17, v5

    .line 355
    .line 356
    move-object v15, v12

    .line 357
    move-object v5, v14

    .line 358
    move-wide v13, v6

    .line 359
    move-object v12, v10

    .line 360
    move/from16 v7, v19

    .line 361
    .line 362
    move-object/from16 v6, v20

    .line 363
    .line 364
    move-object/from16 v19, v11

    .line 365
    .line 366
    move-wide/from16 v10, v43

    .line 367
    .line 368
    goto/16 :goto_11

    .line 369
    .line 370
    :pswitch_7
    move-object/from16 v17, v0

    .line 371
    .line 372
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, Lcom/zykj/evaluation/bean/UploadData;

    .line 375
    .line 376
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 379
    .line 380
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 383
    .line 384
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    move-object/from16 v0, v17

    .line 388
    .line 389
    goto/16 :goto_10

    .line 390
    .line 391
    :pswitch_8
    move-object/from16 v17, v0

    .line 392
    .line 393
    iget v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 394
    .line 395
    iget-wide v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 396
    .line 397
    iget-wide v6, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 398
    .line 399
    iget-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 400
    .line 401
    iget-object v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v10, Lcom/zykj/evaluation/bean/UploadData;

    .line 404
    .line 405
    iget-object v11, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v11, Ljava/util/Iterator;

    .line 408
    .line 409
    iget-object v14, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v14, Lcom/zykj/evaluation/upload/OssData;

    .line 412
    .line 413
    iget-object v14, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v14, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 416
    .line 417
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 418
    .line 419
    .line 420
    move-object/from16 v22, v13

    .line 421
    .line 422
    move-wide/from16 v43, v6

    .line 423
    .line 424
    move v7, v0

    .line 425
    move-object v6, v11

    .line 426
    move-object/from16 v0, v17

    .line 427
    .line 428
    move-object/from16 v17, v5

    .line 429
    .line 430
    move-object v5, v10

    .line 431
    move-wide/from16 v10, v43

    .line 432
    .line 433
    goto/16 :goto_e

    .line 434
    .line 435
    :pswitch_9
    move-object/from16 v17, v0

    .line 436
    .line 437
    goto/16 :goto_2

    .line 438
    .line 439
    :pswitch_a
    move-object/from16 v17, v0

    .line 440
    .line 441
    iget-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Ljava/lang/StringBuilder;

    .line 444
    .line 445
    goto/16 :goto_2

    .line 446
    .line 447
    :pswitch_b
    move-object/from16 v17, v0

    .line 448
    .line 449
    iget v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 450
    .line 451
    iget-wide v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 452
    .line 453
    iget-wide v9, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 454
    .line 455
    iget-wide v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 456
    .line 457
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    move-object v11, v4

    .line 461
    move-object v15, v5

    .line 462
    move-wide v4, v7

    .line 463
    move-wide v6, v9

    .line 464
    const/4 v14, 0x0

    .line 465
    const-wide/16 v19, -0x1

    .line 466
    .line 467
    move v8, v0

    .line 468
    move-wide v9, v2

    .line 469
    move-object/from16 v0, v17

    .line 470
    .line 471
    const/16 v2, 0xa

    .line 472
    .line 473
    goto/16 :goto_4

    .line 474
    .line 475
    :pswitch_c
    move-object/from16 v17, v0

    .line 476
    .line 477
    invoke-static/range {v17 .. v17}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    const-string v2, "USER_ID"

    .line 485
    .line 486
    const-wide/16 v6, -0x1

    .line 487
    .line 488
    invoke-virtual {v0, v2, v6, v7}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 489
    .line 490
    .line 491
    move-result-wide v2

    .line 492
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 493
    .line 494
    .line 495
    move-result-object v0

    .line 496
    const-string v8, "TASK_ID"

    .line 497
    .line 498
    invoke-virtual {v0, v8, v6, v7}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 499
    .line 500
    .line 501
    move-result-wide v8

    .line 502
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    const-string v10, "QUESTION_ID"

    .line 507
    .line 508
    invoke-virtual {v0, v10, v6, v7}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 509
    .line 510
    .line 511
    move-result-wide v10

    .line 512
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    const-string v6, "TASK_STATE"

    .line 517
    .line 518
    invoke-virtual {v0, v6, v15}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    new-instance v6, Ljava/lang/StringBuilder;

    .line 523
    .line 524
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 525
    .line 526
    .line 527
    const-string v7, "\u4e0a\u4f20\u9898\uff1a questionId: "

    .line 528
    .line 529
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 530
    .line 531
    .line 532
    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v6

    .line 543
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    const-wide/16 v19, -0x1

    .line 547
    .line 548
    cmp-long v6, v2, v19

    .line 549
    .line 550
    if-eqz v6, :cond_2c

    .line 551
    .line 552
    cmp-long v6, v8, v19

    .line 553
    .line 554
    if-eqz v6, :cond_2c

    .line 555
    .line 556
    cmp-long v6, v10, v19

    .line 557
    .line 558
    if-eqz v6, :cond_2c

    .line 559
    .line 560
    if-eq v0, v15, :cond_2c

    .line 561
    .line 562
    iget-object v6, v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 563
    .line 564
    invoke-virtual {v6}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 565
    .line 566
    .line 567
    move-result-object v6

    .line 568
    iput-wide v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 569
    .line 570
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 571
    .line 572
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 573
    .line 574
    iput v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 575
    .line 576
    const/4 v7, 0x1

    .line 577
    iput v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 578
    .line 579
    move-object v15, v5

    .line 580
    const/4 v14, 0x0

    .line 581
    move-wide/from16 v43, v8

    .line 582
    .line 583
    move v8, v0

    .line 584
    move-wide v9, v10

    .line 585
    move-object v11, v4

    .line 586
    move-wide v4, v2

    .line 587
    move-object v3, v6

    .line 588
    move-wide/from16 v6, v43

    .line 589
    .line 590
    const/16 v2, 0xa

    .line 591
    .line 592
    invoke-interface/range {v3 .. v11}, Ln5/p;->d(JJIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    if-ne v0, v12, :cond_1

    .line 597
    .line 598
    :goto_3
    move-object v15, v12

    .line 599
    goto/16 :goto_25

    .line 600
    .line 601
    :cond_1
    :goto_4
    check-cast v0, Ln5/o;

    .line 602
    .line 603
    if-eqz v0, :cond_2

    .line 604
    .line 605
    iput-object v0, v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 606
    .line 607
    goto :goto_5

    .line 608
    :cond_2
    move-object v0, v14

    .line 609
    :goto_5
    if-nez v0, :cond_3

    .line 610
    .line 611
    move-object v1, v15

    .line 612
    move-object v15, v12

    .line 613
    :goto_6
    move-wide v2, v4

    .line 614
    move v0, v8

    .line 615
    move-wide v4, v9

    .line 616
    move-wide v8, v6

    .line 617
    goto/16 :goto_24

    .line 618
    .line 619
    :cond_3
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-nez v0, :cond_5

    .line 624
    .line 625
    const/16 v0, 0x65

    .line 626
    .line 627
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    iput-wide v4, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 632
    .line 633
    iput-wide v6, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 634
    .line 635
    iput-wide v9, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 636
    .line 637
    iput v8, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 638
    .line 639
    const/4 v0, 0x3

    .line 640
    iput v0, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 641
    .line 642
    const/4 v3, 0x0

    .line 643
    const/4 v5, 0x2

    .line 644
    const/4 v6, 0x0

    .line 645
    move-object v4, v11

    .line 646
    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->e(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    if-ne v0, v12, :cond_4

    .line 651
    .line 652
    goto :goto_3

    .line 653
    :cond_4
    return-object v0

    .line 654
    :cond_5
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 655
    .line 656
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 657
    .line 658
    .line 659
    iget-object v3, v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 660
    .line 661
    if-nez v3, :cond_6

    .line 662
    .line 663
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    move-object v3, v14

    .line 667
    :cond_6
    invoke-virtual {v3}, Ln5/o;->d()Ljava/util/List;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    iput-object v3, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 672
    .line 673
    iget-object v3, v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 674
    .line 675
    if-nez v3, :cond_7

    .line 676
    .line 677
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    move-object v3, v14

    .line 681
    :cond_7
    invoke-virtual {v3}, Ln5/o;->c()Ljava/util/List;

    .line 682
    .line 683
    .line 684
    move-result-object v3

    .line 685
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    move-object/from16 v43, v14

    .line 690
    .line 691
    move-object v14, v0

    .line 692
    move-object v0, v3

    .line 693
    move-object/from16 v3, v43

    .line 694
    .line 695
    move-wide/from16 v43, v6

    .line 696
    .line 697
    move v7, v8

    .line 698
    move-wide v5, v4

    .line 699
    move-wide v8, v9

    .line 700
    move-object v4, v11

    .line 701
    move-wide/from16 v10, v43

    .line 702
    .line 703
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 704
    .line 705
    .line 706
    move-result v17

    .line 707
    if-eqz v17, :cond_22

    .line 708
    .line 709
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v17

    .line 713
    move-object/from16 v2, v17

    .line 714
    .line 715
    check-cast v2, Lcom/zykj/evaluation/bean/UploadData;

    .line 716
    .line 717
    move-object/from16 p1, v3

    .line 718
    .line 719
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getCommitState()I

    .line 720
    .line 721
    .line 722
    move-result v3

    .line 723
    sget-object v17, Lm5/e$b;->b:Lm5/e$b;

    .line 724
    .line 725
    move-object/from16 v22, v13

    .line 726
    .line 727
    invoke-virtual/range {v17 .. v17}, Lm5/e;->a()I

    .line 728
    .line 729
    .line 730
    move-result v13

    .line 731
    if-ne v3, v13, :cond_b

    .line 732
    .line 733
    iget-object v3, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 734
    .line 735
    check-cast v3, Ljava/lang/Iterable;

    .line 736
    .line 737
    new-instance v13, Ljava/util/ArrayList;

    .line 738
    .line 739
    move-object/from16 v23, v12

    .line 740
    .line 741
    move-object/from16 v17, v15

    .line 742
    .line 743
    const/16 v15, 0xa

    .line 744
    .line 745
    invoke-static {v3, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 746
    .line 747
    .line 748
    move-result v12

    .line 749
    invoke-direct {v13, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 750
    .line 751
    .line 752
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 753
    .line 754
    .line 755
    move-result-object v3

    .line 756
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 757
    .line 758
    .line 759
    move-result v12

    .line 760
    if-eqz v12, :cond_a

    .line 761
    .line 762
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v12

    .line 766
    move-object/from16 v24, v12

    .line 767
    .line 768
    check-cast v24, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 769
    .line 770
    invoke-virtual/range {v24 .. v24}, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;->getResults()Ljava/util/List;

    .line 771
    .line 772
    .line 773
    move-result-object v12

    .line 774
    move-object/from16 v19, v3

    .line 775
    .line 776
    new-instance v3, Ljava/util/ArrayList;

    .line 777
    .line 778
    move/from16 v20, v7

    .line 779
    .line 780
    invoke-static {v12, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 781
    .line 782
    .line 783
    move-result v7

    .line 784
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 785
    .line 786
    .line 787
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 788
    .line 789
    .line 790
    move-result-object v7

    .line 791
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 792
    .line 793
    .line 794
    move-result v12

    .line 795
    if-eqz v12, :cond_9

    .line 796
    .line 797
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v12

    .line 801
    move-object/from16 v25, v12

    .line 802
    .line 803
    check-cast v25, Lcom/zykj/evaluation/bean/SelfCorrectResult;

    .line 804
    .line 805
    invoke-virtual/range {v25 .. v25}, Lcom/zykj/evaluation/bean/SelfCorrectResult;->getUuid()Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v12

    .line 809
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v15

    .line 813
    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v12

    .line 817
    if-eqz v12, :cond_8

    .line 818
    .line 819
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUploadUrl()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v12

    .line 823
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 824
    .line 825
    .line 826
    move-result-object v28

    .line 827
    const/16 v29, 0x3

    .line 828
    .line 829
    const/16 v30, 0x0

    .line 830
    .line 831
    const/16 v26, 0x0

    .line 832
    .line 833
    const/16 v27, 0x0

    .line 834
    .line 835
    invoke-static/range {v25 .. v30}, Lcom/zykj/evaluation/bean/SelfCorrectResult;->copy$default(Lcom/zykj/evaluation/bean/SelfCorrectResult;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/SelfCorrectResult;

    .line 836
    .line 837
    .line 838
    move-result-object v25

    .line 839
    :cond_8
    move-object/from16 v12, v25

    .line 840
    .line 841
    invoke-interface {v3, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 842
    .line 843
    .line 844
    goto :goto_9

    .line 845
    :cond_9
    const/16 v30, 0x3

    .line 846
    .line 847
    const/16 v31, 0x0

    .line 848
    .line 849
    const-wide/16 v25, 0x0

    .line 850
    .line 851
    const-wide/16 v27, 0x0

    .line 852
    .line 853
    move-object/from16 v29, v3

    .line 854
    .line 855
    invoke-static/range {v24 .. v31}, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;->copy$default(Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;JJLjava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 856
    .line 857
    .line 858
    move-result-object v3

    .line 859
    invoke-interface {v13, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    move-object/from16 v3, v19

    .line 863
    .line 864
    move/from16 v7, v20

    .line 865
    .line 866
    const/16 v15, 0xa

    .line 867
    .line 868
    goto :goto_8

    .line 869
    :cond_a
    move/from16 v20, v7

    .line 870
    .line 871
    iput-object v13, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 872
    .line 873
    goto/16 :goto_c

    .line 874
    .line 875
    :cond_b
    move/from16 v20, v7

    .line 876
    .line 877
    move-object/from16 v23, v12

    .line 878
    .line 879
    move-object/from16 v17, v15

    .line 880
    .line 881
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    if-nez v3, :cond_f

    .line 890
    .line 891
    iget-object v3, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v3, Ljava/lang/Iterable;

    .line 894
    .line 895
    new-instance v7, Ljava/util/ArrayList;

    .line 896
    .line 897
    const/16 v15, 0xa

    .line 898
    .line 899
    invoke-static {v3, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 900
    .line 901
    .line 902
    move-result v12

    .line 903
    invoke-direct {v7, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 904
    .line 905
    .line 906
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 907
    .line 908
    .line 909
    move-result-object v3

    .line 910
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 911
    .line 912
    .line 913
    move-result v12

    .line 914
    if-eqz v12, :cond_e

    .line 915
    .line 916
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    move-result-object v12

    .line 920
    move-object/from16 v24, v12

    .line 921
    .line 922
    check-cast v24, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 923
    .line 924
    invoke-virtual/range {v24 .. v24}, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;->getResults()Ljava/util/List;

    .line 925
    .line 926
    .line 927
    move-result-object v12

    .line 928
    new-instance v13, Ljava/util/ArrayList;

    .line 929
    .line 930
    move-object/from16 v19, v3

    .line 931
    .line 932
    invoke-static {v12, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 933
    .line 934
    .line 935
    move-result v3

    .line 936
    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 937
    .line 938
    .line 939
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 940
    .line 941
    .line 942
    move-result-object v3

    .line 943
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 944
    .line 945
    .line 946
    move-result v12

    .line 947
    if-eqz v12, :cond_d

    .line 948
    .line 949
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 950
    .line 951
    .line 952
    move-result-object v12

    .line 953
    move-object/from16 v25, v12

    .line 954
    .line 955
    check-cast v25, Lcom/zykj/evaluation/bean/SelfCorrectResult;

    .line 956
    .line 957
    invoke-virtual/range {v25 .. v25}, Lcom/zykj/evaluation/bean/SelfCorrectResult;->getUuid()Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v12

    .line 961
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 962
    .line 963
    .line 964
    move-result-object v15

    .line 965
    invoke-static {v12, v15}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 966
    .line 967
    .line 968
    move-result v12

    .line 969
    if-eqz v12, :cond_c

    .line 970
    .line 971
    const-string v12, ""

    .line 972
    .line 973
    invoke-static {v12}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 974
    .line 975
    .line 976
    move-result-object v28

    .line 977
    const/16 v29, 0x3

    .line 978
    .line 979
    const/16 v30, 0x0

    .line 980
    .line 981
    const/16 v26, 0x0

    .line 982
    .line 983
    const/16 v27, 0x0

    .line 984
    .line 985
    invoke-static/range {v25 .. v30}, Lcom/zykj/evaluation/bean/SelfCorrectResult;->copy$default(Lcom/zykj/evaluation/bean/SelfCorrectResult;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/SelfCorrectResult;

    .line 986
    .line 987
    .line 988
    move-result-object v25

    .line 989
    :cond_c
    move-object/from16 v12, v25

    .line 990
    .line 991
    invoke-interface {v13, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    goto :goto_b

    .line 995
    :cond_d
    const/16 v30, 0x3

    .line 996
    .line 997
    const/16 v31, 0x0

    .line 998
    .line 999
    const-wide/16 v25, 0x0

    .line 1000
    .line 1001
    const-wide/16 v27, 0x0

    .line 1002
    .line 1003
    move-object/from16 v29, v13

    .line 1004
    .line 1005
    invoke-static/range {v24 .. v31}, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;->copy$default(Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;JJLjava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v3

    .line 1009
    invoke-interface {v7, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-object/from16 v3, v19

    .line 1013
    .line 1014
    const/16 v15, 0xa

    .line 1015
    .line 1016
    goto :goto_a

    .line 1017
    :cond_e
    iput-object v7, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1018
    .line 1019
    :goto_c
    move-object/from16 v3, p1

    .line 1020
    .line 1021
    move-object/from16 v15, v17

    .line 1022
    .line 1023
    move/from16 v7, v20

    .line 1024
    .line 1025
    move-object/from16 v13, v22

    .line 1026
    .line 1027
    move-object/from16 v12, v23

    .line 1028
    .line 1029
    const/16 v2, 0xa

    .line 1030
    .line 1031
    goto/16 :goto_7

    .line 1032
    .line 1033
    :cond_f
    if-eqz p1, :cond_11

    .line 1034
    .line 1035
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/evaluation/upload/OssData;->getToken()Lcom/zykj/evaluation/upload/OssToken;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v3

    .line 1039
    invoke-static {v3}, Lf7/b;->a(Lcom/zykj/evaluation/upload/OssToken;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v3

    .line 1043
    if-eqz v3, :cond_10

    .line 1044
    .line 1045
    goto :goto_d

    .line 1046
    :cond_10
    move-object v3, v14

    .line 1047
    move/from16 v7, v20

    .line 1048
    .line 1049
    move-object/from16 v12, v23

    .line 1050
    .line 1051
    move-wide v13, v10

    .line 1052
    move-wide v10, v8

    .line 1053
    move-wide v8, v5

    .line 1054
    move-object v6, v0

    .line 1055
    move-object/from16 v0, p1

    .line 1056
    .line 1057
    goto :goto_f

    .line 1058
    :cond_11
    :goto_d
    iget-object v3, v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->c:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 1059
    .line 1060
    iput-object v14, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 1061
    .line 1062
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v7

    .line 1066
    iput-object v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 1067
    .line 1068
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 1069
    .line 1070
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 1071
    .line 1072
    const/4 v7, 0x0

    .line 1073
    iput-object v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 1074
    .line 1075
    iput-object v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 1076
    .line 1077
    iput-object v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 1078
    .line 1079
    iput-object v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 1080
    .line 1081
    iput-wide v5, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 1082
    .line 1083
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 1084
    .line 1085
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 1086
    .line 1087
    move/from16 v7, v20

    .line 1088
    .line 1089
    iput v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 1090
    .line 1091
    const/4 v12, 0x4

    .line 1092
    iput v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 1093
    .line 1094
    invoke-virtual {v3, v4}, Lcom/zykj/evaluation/upload/OssTaskManger;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1095
    .line 1096
    .line 1097
    move-result-object v3

    .line 1098
    move-object/from16 v12, v23

    .line 1099
    .line 1100
    if-ne v3, v12, :cond_12

    .line 1101
    .line 1102
    goto/16 :goto_3

    .line 1103
    .line 1104
    :cond_12
    move-wide/from16 v43, v5

    .line 1105
    .line 1106
    move-object v6, v0

    .line 1107
    move-object v5, v2

    .line 1108
    move-object v0, v3

    .line 1109
    move-wide v2, v8

    .line 1110
    move-wide/from16 v8, v43

    .line 1111
    .line 1112
    :goto_e
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 1113
    .line 1114
    move-wide/from16 v43, v2

    .line 1115
    .line 1116
    move-object v3, v14

    .line 1117
    move-wide v13, v10

    .line 1118
    move-wide/from16 v10, v43

    .line 1119
    .line 1120
    move-object v2, v5

    .line 1121
    :goto_f
    if-nez v0, :cond_15

    .line 1122
    .line 1123
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1124
    .line 1125
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1126
    .line 1127
    .line 1128
    move-object/from16 v15, v17

    .line 1129
    .line 1130
    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v5, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1134
    .line 1135
    .line 1136
    const-string v6, "]--->ossToken\u83b7\u53d6\u5931\u8d25"

    .line 1137
    .line 1138
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v5

    .line 1145
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v5

    .line 1149
    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getRunAttemptCount()I

    .line 1153
    .line 1154
    .line 1155
    move-result v5

    .line 1156
    const/4 v6, 0x1

    .line 1157
    if-ge v5, v6, :cond_13

    .line 1158
    .line 1159
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->retry()Landroidx/work/ListenableWorker$Result;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1164
    .line 1165
    .line 1166
    return-object v0

    .line 1167
    :cond_13
    const/16 v5, 0x67

    .line 1168
    .line 1169
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v5

    .line 1173
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v3

    .line 1177
    iput-object v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 1178
    .line 1179
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 1184
    .line 1185
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v0

    .line 1189
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 1190
    .line 1191
    const/4 v2, 0x0

    .line 1192
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 1193
    .line 1194
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 1195
    .line 1196
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 1197
    .line 1198
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 1199
    .line 1200
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 1201
    .line 1202
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 1203
    .line 1204
    iput-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 1205
    .line 1206
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 1207
    .line 1208
    iput v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 1209
    .line 1210
    const/4 v0, 0x5

    .line 1211
    iput v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 1212
    .line 1213
    const/4 v3, 0x0

    .line 1214
    move-object v2, v5

    .line 1215
    const/4 v5, 0x2

    .line 1216
    const/4 v6, 0x0

    .line 1217
    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->e(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v0

    .line 1221
    if-ne v0, v12, :cond_14

    .line 1222
    .line 1223
    goto/16 :goto_3

    .line 1224
    .line 1225
    :cond_14
    :goto_10
    check-cast v0, Landroidx/work/ListenableWorker$Result;

    .line 1226
    .line 1227
    return-object v0

    .line 1228
    :cond_15
    move-object/from16 v15, v17

    .line 1229
    .line 1230
    const/16 v18, 0x1

    .line 1231
    .line 1232
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v1

    .line 1236
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v1

    .line 1240
    const-string v5, "toString(...)"

    .line 1241
    .line 1242
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    const/16 v27, 0x4

    .line 1246
    .line 1247
    const/16 v28, 0x0

    .line 1248
    .line 1249
    const-string v24, "-"

    .line 1250
    .line 1251
    const-string v25, ""

    .line 1252
    .line 1253
    const/16 v26, 0x0

    .line 1254
    .line 1255
    move-object/from16 v23, v1

    .line 1256
    .line 1257
    invoke-static/range {v23 .. v28}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v1

    .line 1261
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v5

    .line 1265
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v5

    .line 1269
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssData;->getObjectKey()Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v15

    .line 1273
    move-object/from16 v23, v12

    .line 1274
    .line 1275
    new-instance v12, Ljava/lang/StringBuilder;

    .line 1276
    .line 1277
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1281
    .line 1282
    .line 1283
    const-string v15, "/"

    .line 1284
    .line 1285
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1286
    .line 1287
    .line 1288
    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1289
    .line 1290
    .line 1291
    const-string v15, "."

    .line 1292
    .line 1293
    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1300
    .line 1301
    .line 1302
    move-result-object v12

    .line 1303
    sget-object v15, Lcom/zykj/evaluation/upload/UploadUtils;->a:Lcom/zykj/evaluation/upload/UploadUtils;

    .line 1304
    .line 1305
    move-object/from16 p1, v1

    .line 1306
    .line 1307
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getLocalPath()Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v1

    .line 1311
    move-object/from16 v19, v5

    .line 1312
    .line 1313
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssData;->getToken()Lcom/zykj/evaluation/upload/OssToken;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v5

    .line 1317
    iput-object v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 1318
    .line 1319
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 1320
    .line 1321
    iput-object v6, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 1322
    .line 1323
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 1324
    .line 1325
    move-object/from16 v20, v0

    .line 1326
    .line 1327
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 1332
    .line 1333
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 1338
    .line 1339
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 1344
    .line 1345
    move-object v0, v2

    .line 1346
    const/4 v2, 0x0

    .line 1347
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 1348
    .line 1349
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 1350
    .line 1351
    iput-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 1352
    .line 1353
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 1354
    .line 1355
    iput v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 1356
    .line 1357
    const/4 v2, 0x6

    .line 1358
    iput v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 1359
    .line 1360
    invoke-virtual {v15, v1, v12, v5, v4}, Lcom/zykj/evaluation/upload/UploadUtils;->c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1361
    .line 1362
    .line 1363
    move-result-object v1

    .line 1364
    move-object/from16 v15, v23

    .line 1365
    .line 1366
    if-ne v1, v15, :cond_16

    .line 1367
    .line 1368
    goto/16 :goto_25

    .line 1369
    .line 1370
    :cond_16
    move-object/from16 v5, p1

    .line 1371
    .line 1372
    move-object v2, v0

    .line 1373
    move-object v0, v1

    .line 1374
    move-object/from16 v1, v20

    .line 1375
    .line 1376
    :goto_11
    move-object/from16 v26, v0

    .line 1377
    .line 1378
    check-cast v26, Ljava/lang/String;

    .line 1379
    .line 1380
    if-nez v26, :cond_18

    .line 1381
    .line 1382
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v0

    .line 1386
    new-instance v6, Ljava/lang/StringBuilder;

    .line 1387
    .line 1388
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 1389
    .line 1390
    .line 1391
    move-object/from16 p1, v5

    .line 1392
    .line 1393
    move-object/from16 v5, v17

    .line 1394
    .line 1395
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1396
    .line 1397
    .line 1398
    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1399
    .line 1400
    .line 1401
    move-object/from16 v5, v22

    .line 1402
    .line 1403
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1407
    .line 1408
    .line 1409
    const-string v0, "]--->\u81ea\u6279\u7b54\u6848\u4e0a\u4f20\u5931\u8d25"

    .line 1410
    .line 1411
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1412
    .line 1413
    .line 1414
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1423
    .line 1424
    .line 1425
    const/16 v0, 0x68

    .line 1426
    .line 1427
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v0

    .line 1431
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v3

    .line 1435
    iput-object v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 1436
    .line 1437
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v1

    .line 1441
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 1442
    .line 1443
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v1

    .line 1447
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 1448
    .line 1449
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 1454
    .line 1455
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v1

    .line 1459
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 1460
    .line 1461
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v1

    .line 1465
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 1466
    .line 1467
    invoke-static/range {p0 .. p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v1

    .line 1471
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 1472
    .line 1473
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 1474
    .line 1475
    iput-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 1476
    .line 1477
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 1478
    .line 1479
    iput v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 1480
    .line 1481
    const/4 v1, 0x0

    .line 1482
    iput v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->e:I

    .line 1483
    .line 1484
    const/4 v1, 0x7

    .line 1485
    iput v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 1486
    .line 1487
    const/4 v3, 0x0

    .line 1488
    const/4 v5, 0x2

    .line 1489
    const/4 v6, 0x0

    .line 1490
    move-object/from16 v1, p0

    .line 1491
    .line 1492
    move-object v2, v0

    .line 1493
    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->e(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v0

    .line 1497
    move-object v4, v1

    .line 1498
    if-ne v0, v15, :cond_17

    .line 1499
    .line 1500
    goto/16 :goto_25

    .line 1501
    .line 1502
    :cond_17
    return-object v0

    .line 1503
    :cond_18
    move-object v0, v4

    .line 1504
    move-object/from16 p1, v5

    .line 1505
    .line 1506
    move-object/from16 v5, v17

    .line 1507
    .line 1508
    move-object/from16 v4, p0

    .line 1509
    .line 1510
    move-object/from16 v17, v12

    .line 1511
    .line 1512
    iget-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 1513
    .line 1514
    if-nez v12, :cond_19

    .line 1515
    .line 1516
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 1517
    .line 1518
    .line 1519
    const/16 v20, 0x0

    .line 1520
    .line 1521
    goto :goto_12

    .line 1522
    :cond_19
    move-object/from16 v20, v12

    .line 1523
    .line 1524
    :goto_12
    iget-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 1525
    .line 1526
    if-nez v12, :cond_1a

    .line 1527
    .line 1528
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 1529
    .line 1530
    .line 1531
    const/4 v12, 0x0

    .line 1532
    :cond_1a
    invoke-virtual {v12}, Ln5/o;->c()Ljava/util/List;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v12

    .line 1536
    move-object/from16 v40, v5

    .line 1537
    .line 1538
    new-instance v5, Ljava/util/ArrayList;

    .line 1539
    .line 1540
    move/from16 v42, v7

    .line 1541
    .line 1542
    move-object/from16 v41, v15

    .line 1543
    .line 1544
    const/16 v15, 0xa

    .line 1545
    .line 1546
    invoke-static {v12, v15}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1547
    .line 1548
    .line 1549
    move-result v7

    .line 1550
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 1551
    .line 1552
    .line 1553
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v7

    .line 1557
    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1558
    .line 1559
    .line 1560
    move-result v12

    .line 1561
    if-eqz v12, :cond_1c

    .line 1562
    .line 1563
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v12

    .line 1567
    check-cast v12, Lcom/zykj/evaluation/bean/UploadData;

    .line 1568
    .line 1569
    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1570
    .line 1571
    .line 1572
    move-result v15

    .line 1573
    if-eqz v15, :cond_1b

    .line 1574
    .line 1575
    sget-object v15, Lm5/e$b;->b:Lm5/e$b;

    .line 1576
    .line 1577
    invoke-virtual {v15}, Lm5/e;->a()I

    .line 1578
    .line 1579
    .line 1580
    move-result v27

    .line 1581
    const/16 v28, 0x3

    .line 1582
    .line 1583
    const/16 v29, 0x0

    .line 1584
    .line 1585
    const/16 v24, 0x0

    .line 1586
    .line 1587
    const/16 v25, 0x0

    .line 1588
    .line 1589
    move-object/from16 v23, v12

    .line 1590
    .line 1591
    invoke-static/range {v23 .. v29}, Lcom/zykj/evaluation/bean/UploadData;->copy$default(Lcom/zykj/evaluation/bean/UploadData;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/zykj/evaluation/bean/UploadData;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v12

    .line 1595
    :goto_14
    move-object/from16 v15, v26

    .line 1596
    .line 1597
    goto :goto_15

    .line 1598
    :cond_1b
    move-object/from16 v23, v12

    .line 1599
    .line 1600
    goto :goto_14

    .line 1601
    :goto_15
    invoke-interface {v5, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1602
    .line 1603
    .line 1604
    move-object/from16 v26, v15

    .line 1605
    .line 1606
    goto :goto_13

    .line 1607
    :cond_1c
    move-object/from16 v15, v26

    .line 1608
    .line 1609
    const/16 v38, 0x6f

    .line 1610
    .line 1611
    const/16 v39, 0x0

    .line 1612
    .line 1613
    const-wide/16 v28, 0x0

    .line 1614
    .line 1615
    const-wide/16 v30, 0x0

    .line 1616
    .line 1617
    const/16 v32, 0x0

    .line 1618
    .line 1619
    const-wide/16 v33, 0x0

    .line 1620
    .line 1621
    const/16 v36, 0x0

    .line 1622
    .line 1623
    const/16 v37, 0x0

    .line 1624
    .line 1625
    move-object/from16 v35, v5

    .line 1626
    .line 1627
    move-object/from16 v27, v20

    .line 1628
    .line 1629
    invoke-static/range {v27 .. v39}, Ln5/o;->b(Ln5/o;JJIJLjava/util/List;Ljava/util/List;IILjava/lang/Object;)Ln5/o;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v5

    .line 1633
    iput-object v5, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 1634
    .line 1635
    iget-object v5, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 1636
    .line 1637
    invoke-virtual {v5}, Lcom/zykj/evaluation/di/AppDatabase;->i()Ln5/p;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v5

    .line 1641
    iget-object v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->d:Ln5/o;

    .line 1642
    .line 1643
    if-nez v7, :cond_1d

    .line 1644
    .line 1645
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 1646
    .line 1647
    .line 1648
    const/4 v7, 0x0

    .line 1649
    :cond_1d
    iput-object v3, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 1650
    .line 1651
    iput-object v1, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 1652
    .line 1653
    iput-object v6, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 1654
    .line 1655
    iput-object v2, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 1656
    .line 1657
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v12

    .line 1661
    iput-object v12, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 1662
    .line 1663
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v12

    .line 1667
    iput-object v12, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 1668
    .line 1669
    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1670
    .line 1671
    .line 1672
    move-result-object v12

    .line 1673
    iput-object v12, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 1674
    .line 1675
    iput-object v15, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 1676
    .line 1677
    iput-wide v8, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 1678
    .line 1679
    iput-wide v13, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 1680
    .line 1681
    iput-wide v10, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 1682
    .line 1683
    move/from16 v12, v42

    .line 1684
    .line 1685
    iput v12, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 1686
    .line 1687
    move-object/from16 p1, v1

    .line 1688
    .line 1689
    const/16 v1, 0x8

    .line 1690
    .line 1691
    iput v1, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 1692
    .line 1693
    invoke-interface {v5, v7, v0}, Ln5/p;->c(Ln5/o;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1694
    .line 1695
    .line 1696
    move-result-object v1

    .line 1697
    move-object/from16 v5, v41

    .line 1698
    .line 1699
    if-ne v1, v5, :cond_1e

    .line 1700
    .line 1701
    :goto_16
    move-object v15, v5

    .line 1702
    goto/16 :goto_25

    .line 1703
    .line 1704
    :cond_1e
    move-object v1, v0

    .line 1705
    move-object v0, v6

    .line 1706
    move v7, v12

    .line 1707
    move-object v6, v3

    .line 1708
    move-object/from16 v3, p1

    .line 1709
    .line 1710
    :goto_17
    invoke-virtual {v2}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v12

    .line 1714
    move-object/from16 p1, v0

    .line 1715
    .line 1716
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1717
    .line 1718
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1719
    .line 1720
    .line 1721
    move-object/from16 v17, v1

    .line 1722
    .line 1723
    move-object/from16 v1, v40

    .line 1724
    .line 1725
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1726
    .line 1727
    .line 1728
    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1729
    .line 1730
    .line 1731
    move-object/from16 v19, v2

    .line 1732
    .line 1733
    move-object/from16 v2, v22

    .line 1734
    .line 1735
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1736
    .line 1737
    .line 1738
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1739
    .line 1740
    .line 1741
    const-string v12, "]--->\u81ea\u6279\u7b54\u6848\u4e0a\u4f20\u6210\u529f"

    .line 1742
    .line 1743
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1744
    .line 1745
    .line 1746
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v0

    .line 1750
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v0

    .line 1754
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 1755
    .line 1756
    .line 1757
    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1758
    .line 1759
    check-cast v0, Ljava/lang/Iterable;

    .line 1760
    .line 1761
    new-instance v12, Ljava/util/ArrayList;

    .line 1762
    .line 1763
    move-object/from16 v20, v3

    .line 1764
    .line 1765
    const/16 v2, 0xa

    .line 1766
    .line 1767
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1768
    .line 1769
    .line 1770
    move-result v3

    .line 1771
    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1772
    .line 1773
    .line 1774
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v0

    .line 1778
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1779
    .line 1780
    .line 1781
    move-result v3

    .line 1782
    if-eqz v3, :cond_21

    .line 1783
    .line 1784
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1785
    .line 1786
    .line 1787
    move-result-object v3

    .line 1788
    move-object/from16 v23, v3

    .line 1789
    .line 1790
    check-cast v23, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 1791
    .line 1792
    invoke-virtual/range {v23 .. v23}, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;->getResults()Ljava/util/List;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v3

    .line 1796
    move-object/from16 v31, v0

    .line 1797
    .line 1798
    new-instance v0, Ljava/util/ArrayList;

    .line 1799
    .line 1800
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 1801
    .line 1802
    .line 1803
    move-result v4

    .line 1804
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1805
    .line 1806
    .line 1807
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v2

    .line 1811
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1812
    .line 1813
    .line 1814
    move-result v3

    .line 1815
    if-eqz v3, :cond_20

    .line 1816
    .line 1817
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v3

    .line 1821
    move-object/from16 v24, v3

    .line 1822
    .line 1823
    check-cast v24, Lcom/zykj/evaluation/bean/SelfCorrectResult;

    .line 1824
    .line 1825
    invoke-virtual/range {v24 .. v24}, Lcom/zykj/evaluation/bean/SelfCorrectResult;->getUuid()Ljava/lang/String;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v3

    .line 1829
    invoke-virtual/range {v19 .. v19}, Lcom/zykj/evaluation/bean/UploadData;->getUuid()Ljava/lang/String;

    .line 1830
    .line 1831
    .line 1832
    move-result-object v4

    .line 1833
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1834
    .line 1835
    .line 1836
    move-result v3

    .line 1837
    if-eqz v3, :cond_1f

    .line 1838
    .line 1839
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v27

    .line 1843
    const/16 v28, 0x3

    .line 1844
    .line 1845
    const/16 v29, 0x0

    .line 1846
    .line 1847
    const/16 v25, 0x0

    .line 1848
    .line 1849
    const/16 v26, 0x0

    .line 1850
    .line 1851
    invoke-static/range {v24 .. v29}, Lcom/zykj/evaluation/bean/SelfCorrectResult;->copy$default(Lcom/zykj/evaluation/bean/SelfCorrectResult;Ljava/lang/String;ILjava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/SelfCorrectResult;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v24

    .line 1855
    :cond_1f
    move-object/from16 v3, v24

    .line 1856
    .line 1857
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1858
    .line 1859
    .line 1860
    goto :goto_19

    .line 1861
    :cond_20
    const/16 v29, 0x3

    .line 1862
    .line 1863
    const/16 v30, 0x0

    .line 1864
    .line 1865
    const-wide/16 v24, 0x0

    .line 1866
    .line 1867
    const-wide/16 v26, 0x0

    .line 1868
    .line 1869
    move-object/from16 v28, v0

    .line 1870
    .line 1871
    invoke-static/range {v23 .. v30}, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;->copy$default(Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;JJLjava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 1876
    .line 1877
    .line 1878
    const/16 v2, 0xa

    .line 1879
    .line 1880
    move-object/from16 v4, p0

    .line 1881
    .line 1882
    move-object/from16 v0, v31

    .line 1883
    .line 1884
    goto :goto_18

    .line 1885
    :cond_21
    iput-object v12, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1886
    .line 1887
    move-object/from16 v0, p1

    .line 1888
    .line 1889
    move-object v15, v1

    .line 1890
    move-object v12, v5

    .line 1891
    move-object/from16 v4, v17

    .line 1892
    .line 1893
    move-object/from16 v3, v20

    .line 1894
    .line 1895
    const/16 v2, 0xa

    .line 1896
    .line 1897
    move-object/from16 v1, p0

    .line 1898
    .line 1899
    move-wide/from16 v43, v13

    .line 1900
    .line 1901
    move-object v14, v6

    .line 1902
    move-wide v5, v8

    .line 1903
    move-wide v8, v10

    .line 1904
    move-wide/from16 v10, v43

    .line 1905
    .line 1906
    move-object/from16 v13, v22

    .line 1907
    .line 1908
    goto/16 :goto_7

    .line 1909
    .line 1910
    :cond_22
    move-object/from16 p1, v3

    .line 1911
    .line 1912
    move-wide v2, v5

    .line 1913
    move-object v5, v12

    .line 1914
    move-object v1, v15

    .line 1915
    :try_start_1
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 1916
    .line 1917
    iget-object v0, v14, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1918
    .line 1919
    check-cast v0, Ljava/lang/Iterable;

    .line 1920
    .line 1921
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 1925
    move-object/from16 v18, p1

    .line 1926
    .line 1927
    move-object v15, v6

    .line 1928
    move-object/from16 v19, v14

    .line 1929
    .line 1930
    move-object v6, v0

    .line 1931
    move-wide v13, v2

    .line 1932
    const/4 v2, 0x0

    .line 1933
    const/4 v3, 0x0

    .line 1934
    move-object/from16 v0, p0

    .line 1935
    .line 1936
    :goto_1a
    :try_start_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    .line 1937
    .line 1938
    .line 1939
    move-result v12

    .line 1940
    if-eqz v12, :cond_24

    .line 1941
    .line 1942
    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v12

    .line 1946
    move-object/from16 p1, v6

    .line 1947
    .line 1948
    move-object v6, v12

    .line 1949
    check-cast v6, Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;

    .line 1950
    .line 1951
    move-object/from16 v16, v12

    .line 1952
    .line 1953
    iget-object v12, v0, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->a:Lp5/j;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1954
    .line 1955
    move-object/from16 v17, v1

    .line 1956
    .line 1957
    :try_start_3
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1958
    .line 1959
    .line 1960
    move-result-object v1

    .line 1961
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 1962
    .line 1963
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v1

    .line 1967
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 1968
    .line 1969
    iput-object v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 1970
    .line 1971
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v1

    .line 1975
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 1976
    .line 1977
    iput-object v15, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 1978
    .line 1979
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v1

    .line 1983
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 1984
    .line 1985
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v1

    .line 1989
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 1990
    .line 1991
    const/4 v1, 0x0

    .line 1992
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 1993
    .line 1994
    iput-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 1995
    .line 1996
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 1997
    .line 1998
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 1999
    .line 2000
    iput v7, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 2001
    .line 2002
    iput v3, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->e:I

    .line 2003
    .line 2004
    iput v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->f:I

    .line 2005
    .line 2006
    const/4 v1, 0x0

    .line 2007
    iput v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->g:I

    .line 2008
    .line 2009
    const/16 v1, 0x9

    .line 2010
    .line 2011
    iput v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 2012
    .line 2013
    invoke-interface {v12, v6, v4}, Lp5/j;->x(Lcom/zykj/evaluation/bean/CommitSelfCorrectReq;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v1

    .line 2017
    if-ne v1, v5, :cond_23

    .line 2018
    .line 2019
    goto/16 :goto_16

    .line 2020
    .line 2021
    :cond_23
    move-object/from16 v6, p1

    .line 2022
    .line 2023
    move-object/from16 v16, v0

    .line 2024
    .line 2025
    move-object v0, v1

    .line 2026
    :goto_1b
    check-cast v0, Lcom/zykj/http/bean/ApiResp;

    .line 2027
    .line 2028
    invoke-static {v0}, Lo5/g;->b(Lcom/zykj/http/bean/ApiResp;)Ljava/lang/Object;

    .line 2029
    .line 2030
    .line 2031
    move-object/from16 v0, v16

    .line 2032
    .line 2033
    move-object/from16 v1, v17

    .line 2034
    .line 2035
    goto :goto_1a

    .line 2036
    :catchall_1
    move-exception v0

    .line 2037
    goto :goto_1d

    .line 2038
    :catchall_2
    move-exception v0

    .line 2039
    move-object/from16 v17, v1

    .line 2040
    .line 2041
    goto :goto_1d

    .line 2042
    :cond_24
    move-object/from16 v17, v1

    .line 2043
    .line 2044
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2045
    .line 2046
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 2050
    :goto_1c
    move-object v15, v0

    .line 2051
    move v2, v7

    .line 2052
    move-wide v6, v8

    .line 2053
    move-object/from16 v3, v18

    .line 2054
    .line 2055
    move-object/from16 v9, v19

    .line 2056
    .line 2057
    goto :goto_1e

    .line 2058
    :catchall_3
    move-exception v0

    .line 2059
    move-object/from16 v17, v1

    .line 2060
    .line 2061
    move-object/from16 v18, p1

    .line 2062
    .line 2063
    move-object/from16 v19, v14

    .line 2064
    .line 2065
    move-wide v13, v2

    .line 2066
    :goto_1d
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 2067
    .line 2068
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 2069
    .line 2070
    .line 2071
    move-result-object v0

    .line 2072
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v0

    .line 2076
    goto :goto_1c

    .line 2077
    :goto_1e
    invoke-static {v15}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2078
    .line 2079
    .line 2080
    move-result-object v8

    .line 2081
    if-eqz v8, :cond_26

    .line 2082
    .line 2083
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 2084
    .line 2085
    .line 2086
    move-result-object v0

    .line 2087
    new-instance v1, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$8$1;

    .line 2088
    .line 2089
    const/4 v12, 0x0

    .line 2090
    invoke-direct {v1, v8, v12}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$8$1;-><init>(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)V

    .line 2091
    .line 2092
    .line 2093
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v12

    .line 2097
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 2098
    .line 2099
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v12

    .line 2103
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 2104
    .line 2105
    iput-object v15, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 2106
    .line 2107
    iput-object v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 2108
    .line 2109
    const/4 v12, 0x0

    .line 2110
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 2111
    .line 2112
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 2113
    .line 2114
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 2115
    .line 2116
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 2117
    .line 2118
    iput-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 2119
    .line 2120
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 2121
    .line 2122
    iput-wide v6, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 2123
    .line 2124
    iput v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 2125
    .line 2126
    const/4 v12, 0x0

    .line 2127
    iput v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->e:I

    .line 2128
    .line 2129
    const/16 v12, 0xa

    .line 2130
    .line 2131
    iput v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 2132
    .line 2133
    invoke-static {v0, v1, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v0

    .line 2137
    if-ne v0, v5, :cond_25

    .line 2138
    .line 2139
    goto/16 :goto_16

    .line 2140
    .line 2141
    :cond_25
    :goto_1f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2142
    .line 2143
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 2144
    .line 2145
    .line 2146
    move-object/from16 v1, v17

    .line 2147
    .line 2148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2149
    .line 2150
    .line 2151
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2152
    .line 2153
    .line 2154
    const-string v12, "]--->\u81ea\u6279\u63a5\u53e3\u63d0\u4ea4\u5931\u8d25"

    .line 2155
    .line 2156
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2157
    .line 2158
    .line 2159
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2160
    .line 2161
    .line 2162
    move-result-object v0

    .line 2163
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v0

    .line 2167
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 2168
    .line 2169
    .line 2170
    invoke-static {v8}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    .line 2171
    .line 2172
    .line 2173
    :goto_20
    move v0, v2

    .line 2174
    move-object v12, v9

    .line 2175
    move-wide v8, v6

    .line 2176
    move-object v7, v3

    .line 2177
    goto :goto_21

    .line 2178
    :cond_26
    move-object/from16 v1, v17

    .line 2179
    .line 2180
    goto :goto_20

    .line 2181
    :goto_21
    invoke-static {v15}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 2182
    .line 2183
    .line 2184
    move-result v2

    .line 2185
    if-eqz v2, :cond_27

    .line 2186
    .line 2187
    const/4 v15, 0x0

    .line 2188
    :cond_27
    check-cast v15, Lkotlin/Unit;

    .line 2189
    .line 2190
    if-eqz v15, :cond_2a

    .line 2191
    .line 2192
    new-instance v2, Ljava/lang/StringBuilder;

    .line 2193
    .line 2194
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 2195
    .line 2196
    .line 2197
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2198
    .line 2199
    .line 2200
    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2201
    .line 2202
    .line 2203
    const-string v1, "]--->\u81ea\u6279\u63a5\u53e3\u63d0\u4ea4\u6210\u529f"

    .line 2204
    .line 2205
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2206
    .line 2207
    .line 2208
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v1

    .line 2212
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 2213
    .line 2214
    .line 2215
    move-result-object v1

    .line 2216
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 2217
    .line 2218
    .line 2219
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v1

    .line 2223
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 2224
    .line 2225
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v1

    .line 2229
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 2230
    .line 2231
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v1

    .line 2235
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 2236
    .line 2237
    const/4 v2, 0x0

    .line 2238
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 2239
    .line 2240
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 2241
    .line 2242
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 2243
    .line 2244
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 2245
    .line 2246
    iput-object v2, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 2247
    .line 2248
    iput-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 2249
    .line 2250
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 2251
    .line 2252
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 2253
    .line 2254
    iput v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 2255
    .line 2256
    const/4 v1, 0x0

    .line 2257
    iput v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->e:I

    .line 2258
    .line 2259
    const/16 v1, 0xb

    .line 2260
    .line 2261
    iput v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 2262
    .line 2263
    const-string v2, ""

    .line 2264
    .line 2265
    const/4 v3, 0x0

    .line 2266
    move-object/from16 v23, v5

    .line 2267
    .line 2268
    const/4 v5, 0x2

    .line 2269
    const/4 v6, 0x0

    .line 2270
    move-object/from16 v1, p0

    .line 2271
    .line 2272
    move-object/from16 v15, v23

    .line 2273
    .line 2274
    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->g(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v2

    .line 2278
    if-ne v2, v15, :cond_28

    .line 2279
    .line 2280
    goto/16 :goto_25

    .line 2281
    .line 2282
    :cond_28
    move-object v3, v2

    .line 2283
    move v2, v0

    .line 2284
    move-object v0, v3

    .line 2285
    move-object v3, v7

    .line 2286
    move-wide v5, v8

    .line 2287
    move-wide v7, v10

    .line 2288
    move-wide v10, v13

    .line 2289
    move-object v13, v12

    .line 2290
    :goto_22
    check-cast v0, Landroidx/work/ListenableWorker$Result;

    .line 2291
    .line 2292
    if-eqz v0, :cond_29

    .line 2293
    .line 2294
    return-object v0

    .line 2295
    :cond_29
    move v0, v2

    .line 2296
    move-object v12, v13

    .line 2297
    move-wide v13, v10

    .line 2298
    move-wide v10, v7

    .line 2299
    move-object v7, v3

    .line 2300
    move-wide v8, v5

    .line 2301
    goto :goto_23

    .line 2302
    :cond_2a
    move-object v15, v5

    .line 2303
    :goto_23
    const/16 v1, 0x6a

    .line 2304
    .line 2305
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 2306
    .line 2307
    .line 2308
    move-result-object v2

    .line 2309
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2310
    .line 2311
    .line 2312
    move-result-object v1

    .line 2313
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 2314
    .line 2315
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v1

    .line 2319
    iput-object v1, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 2320
    .line 2321
    const/4 v12, 0x0

    .line 2322
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 2323
    .line 2324
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 2325
    .line 2326
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 2327
    .line 2328
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->m:Ljava/lang/Object;

    .line 2329
    .line 2330
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->n:Ljava/lang/Object;

    .line 2331
    .line 2332
    iput-object v12, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->o:Ljava/lang/Object;

    .line 2333
    .line 2334
    iput-wide v13, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 2335
    .line 2336
    iput-wide v10, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 2337
    .line 2338
    iput-wide v8, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 2339
    .line 2340
    iput v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 2341
    .line 2342
    const/16 v0, 0xc

    .line 2343
    .line 2344
    iput v0, v4, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 2345
    .line 2346
    const/4 v3, 0x0

    .line 2347
    const/4 v5, 0x2

    .line 2348
    const/4 v6, 0x0

    .line 2349
    move-object/from16 v1, p0

    .line 2350
    .line 2351
    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->e(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v0

    .line 2355
    if-ne v0, v15, :cond_2b

    .line 2356
    .line 2357
    goto/16 :goto_25

    .line 2358
    .line 2359
    :cond_2b
    return-object v0

    .line 2360
    :cond_2c
    move-object v1, v5

    .line 2361
    move-wide v6, v8

    .line 2362
    move-wide v9, v10

    .line 2363
    move-object v15, v12

    .line 2364
    move v8, v0

    .line 2365
    move-object v11, v4

    .line 2366
    move-wide v4, v2

    .line 2367
    goto/16 :goto_6

    .line 2368
    .line 2369
    :goto_24
    new-instance v6, Ljava/lang/StringBuilder;

    .line 2370
    .line 2371
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 2372
    .line 2373
    .line 2374
    cmp-long v7, v2, v19

    .line 2375
    .line 2376
    if-nez v7, :cond_2d

    .line 2377
    .line 2378
    const-string v7, "userId,"

    .line 2379
    .line 2380
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2381
    .line 2382
    .line 2383
    :cond_2d
    cmp-long v7, v8, v19

    .line 2384
    .line 2385
    if-nez v7, :cond_2e

    .line 2386
    .line 2387
    const-string v7, "taskId,"

    .line 2388
    .line 2389
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2390
    .line 2391
    .line 2392
    :cond_2e
    cmp-long v7, v4, v19

    .line 2393
    .line 2394
    if-nez v7, :cond_2f

    .line 2395
    .line 2396
    const-string v7, "questionId,"

    .line 2397
    .line 2398
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2399
    .line 2400
    .line 2401
    :cond_2f
    const/4 v7, -0x1

    .line 2402
    if-ne v0, v7, :cond_30

    .line 2403
    .line 2404
    const-string v7, "taskState,"

    .line 2405
    .line 2406
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2407
    .line 2408
    .line 2409
    :cond_30
    new-instance v7, Ljava/lang/StringBuilder;

    .line 2410
    .line 2411
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 2412
    .line 2413
    .line 2414
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2415
    .line 2416
    .line 2417
    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2418
    .line 2419
    .line 2420
    const-string v1, "] \u53c2\u6570\u9519\u8bef, "

    .line 2421
    .line 2422
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2423
    .line 2424
    .line 2425
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 2426
    .line 2427
    .line 2428
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v1

    .line 2432
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 2433
    .line 2434
    .line 2435
    move-result-object v1

    .line 2436
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 2437
    .line 2438
    .line 2439
    const/16 v1, 0x64

    .line 2440
    .line 2441
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 2442
    .line 2443
    .line 2444
    move-result-object v1

    .line 2445
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v6

    .line 2449
    iput-object v6, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 2450
    .line 2451
    iput-wide v2, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->a:J

    .line 2452
    .line 2453
    iput-wide v8, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->b:J

    .line 2454
    .line 2455
    iput-wide v4, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->c:J

    .line 2456
    .line 2457
    iput v0, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->d:I

    .line 2458
    .line 2459
    const/4 v0, 0x2

    .line 2460
    iput v0, v11, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork$doWork$1;->r:I

    .line 2461
    .line 2462
    const/4 v3, 0x0

    .line 2463
    const/4 v5, 0x2

    .line 2464
    const/4 v6, 0x0

    .line 2465
    move-object v2, v1

    .line 2466
    move-object v4, v11

    .line 2467
    move-object/from16 v1, p0

    .line 2468
    .line 2469
    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;->e(Lcom/zykj/evaluation/upload/SelfCorrectQuestionUploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v0

    .line 2473
    if-ne v0, v15, :cond_31

    .line 2474
    .line 2475
    :goto_25
    return-object v15

    .line 2476
    :cond_31
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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
