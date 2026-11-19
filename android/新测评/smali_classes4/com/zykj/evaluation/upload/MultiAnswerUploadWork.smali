.class public final Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;
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
        Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001cB-\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u000c2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "Lcom/zykj/evaluation/di/AppDatabase;",
        "database",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V",
        "Landroidx/work/ListenableWorker$Result;",
        "doWork",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "uuid",
        "filePath",
        "uploadUrl",
        "Lm5/e;",
        "commitState",
        "",
        "d",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "key",
        "c",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "b",
        "Lcom/zykj/evaluation/di/AppDatabase;",
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
        "SMAP\nMultiAnswerUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiAnswerUploadWork.kt\ncom/zykj/evaluation/upload/MultiAnswerUploadWork\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Data.kt\nandroidx/work/DataKt\n*L\n1#1,188:1\n13472#2,2:189\n13472#2,2:196\n31#3,5:191\n31#3,5:198\n*S KotlinDebug\n*F\n+ 1 MultiAnswerUploadWork.kt\ncom/zykj/evaluation/upload/MultiAnswerUploadWork\n*L\n81#1:189,2\n169#1:196,2\n136#1:191,5\n186#1:198,5\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;

.field public static final d:I


# instance fields
.field public final a:Lcom/zykj/evaluation/upload/OssTaskManger;

.field public final b:Lcom/zykj/evaluation/di/AppDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->c:Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->d:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;Lcom/zykj/evaluation/di/AppDatabase;)V
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
    const-string v0, "ossTaskManger"

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
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->a:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 25
    .line 26
    iput-object p4, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 27
    .line 28
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->n:I

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
    iput v1, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;-><init>(Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->l:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->n:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p1, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->j:I

    .line 40
    .line 41
    iget v2, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->i:I

    .line 42
    .line 43
    iget v5, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->h:I

    .line 44
    .line 45
    iget-object v6, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->g:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Ljava/lang/String;

    .line 48
    .line 49
    iget-object v6, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v6, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, Lkotlin/Pair;

    .line 56
    .line 57
    iget-object v6, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v6, Ljava/lang/String;

    .line 60
    .line 61
    iget-object v6, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v6, Ljava/lang/String;

    .line 64
    .line 65
    iget-object v6, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v6, [Ljava/lang/String;

    .line 68
    .line 69
    iget-object v7, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->a:Ljava/lang/Object;

    .line 70
    .line 71
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    move-object v10, v0

    .line 75
    move v0, v5

    .line 76
    move-object v11, v6

    .line 77
    move-object p2, v7

    .line 78
    goto/16 :goto_2

    .line 79
    .line 80
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance p2, Ljava/lang/Exception;

    .line 92
    .line 93
    new-instance v2, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v5, "MultiAnswerUploadWork failed, key is "

    .line 99
    .line 100
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-direct {p2, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p2}, Lcom/tencent/bugly/crashreport/CrashReport;->postCatchedException(Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    const-string v2, "ANSWER_DATA"

    .line 121
    .line 122
    invoke-virtual {p2, v2}, Landroidx/work/Data;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-eqz p2, :cond_5

    .line 127
    .line 128
    array-length v2, p2

    .line 129
    move-object v11, p2

    .line 130
    move-object v10, v0

    .line 131
    move v0, v4

    .line 132
    move-object p2, p1

    .line 133
    move p1, v2

    .line 134
    move v2, v0

    .line 135
    :goto_1
    if-ge v2, p1, :cond_4

    .line 136
    .line 137
    aget-object v5, v11, v2

    .line 138
    .line 139
    new-instance v6, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$2$pair$1;

    .line 140
    .line 141
    invoke-direct {v6}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$2$pair$1;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    invoke-static {v5, v6}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    check-cast v6, Lkotlin/Pair;

    .line 153
    .line 154
    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    check-cast v7, Ljava/lang/String;

    .line 159
    .line 160
    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    check-cast v8, Ljava/lang/String;

    .line 165
    .line 166
    sget-object v9, Lm5/e$a;->b:Lm5/e$a;

    .line 167
    .line 168
    iput-object p2, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->a:Ljava/lang/Object;

    .line 169
    .line 170
    iput-object v11, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 171
    .line 172
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    iput-object v12, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->c:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    iput-object v5, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->d:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    iput-object v5, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->e:Ljava/lang/Object;

    .line 189
    .line 190
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    iput-object v5, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->f:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    iput-object v5, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->g:Ljava/lang/Object;

    .line 201
    .line 202
    iput v0, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->h:I

    .line 203
    .line 204
    iput v2, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->i:I

    .line 205
    .line 206
    iput p1, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->j:I

    .line 207
    .line 208
    iput v4, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->k:I

    .line 209
    .line 210
    iput v3, v10, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$failedResult$1;->n:I

    .line 211
    .line 212
    move-object v6, v7

    .line 213
    move-object v7, v8

    .line 214
    const-string v8, ""

    .line 215
    .line 216
    move-object v5, p0

    .line 217
    invoke-virtual/range {v5 .. v10}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    if-ne v6, v1, :cond_3

    .line 222
    .line 223
    return-object v1

    .line 224
    :cond_3
    :goto_2
    add-int/2addr v2, v3

    .line 225
    goto :goto_1

    .line 226
    :cond_4
    move-object p1, p2

    .line 227
    :cond_5
    const-string p2, "ERROR_KEY"

    .line 228
    .line 229
    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    new-instance p2, Landroidx/work/Data$Builder;

    .line 238
    .line 239
    invoke-direct {p2}, Landroidx/work/Data$Builder;-><init>()V

    .line 240
    .line 241
    .line 242
    aget-object p1, p1, v4

    .line 243
    .line 244
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Ljava/lang/String;

    .line 249
    .line 250
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p2, v0, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    const-string p2, "failure(...)"

    .line 266
    .line 267
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-object p1
.end method

.method public final d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->b:Lcom/zykj/evaluation/di/AppDatabase;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/evaluation/di/AppDatabase;->h()Ln5/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ln5/h;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const-string v3, "USER_ID"

    .line 14
    .line 15
    const-wide/16 v4, 0x0

    .line 16
    .line 17
    invoke-virtual {v2, v3, v4, v5}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    const-string v7, "TASK_ID"

    .line 26
    .line 27
    invoke-virtual {v6, v7, v4, v5}, Landroidx/work/Data;->getLong(Ljava/lang/String;J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-string v7, "TASK_STATE"

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    invoke-virtual {v6, v7, v8}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    new-instance v8, Lcom/zykj/evaluation/bean/UploadData;

    .line 43
    .line 44
    invoke-virtual {p4}, Lm5/e;->a()I

    .line 45
    .line 46
    .line 47
    move-result p4

    .line 48
    invoke-direct {v8, p1, p2, p3, p4}, Lcom/zykj/evaluation/bean/UploadData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    move-object v7, p1

    .line 52
    invoke-direct/range {v1 .. v8}, Ln5/h;-><init>(JJILjava/lang/String;Lcom/zykj/evaluation/bean/UploadData;)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v1, p5}, Ln5/i;->c(Ln5/h;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    if-ne p1, p2, :cond_0

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p1
.end method

.method public doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;-><init>(Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;Lkotlin/coroutines/Continuation;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->q:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    iget v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 36
    .line 37
    const-string v9, "["

    .line 38
    .line 39
    packed-switch v3, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v1

    .line 50
    :pswitch_0
    iget v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->o:I

    .line 51
    .line 52
    iget v4, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->n:I

    .line 53
    .line 54
    iget v5, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 55
    .line 56
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v11, Ljava/lang/String;

    .line 59
    .line 60
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v11, Ljava/lang/String;

    .line 63
    .line 64
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v11, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v11, Ljava/io/File;

    .line 71
    .line 72
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v11, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v11, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v11, Lkotlin/Pair;

    .line 83
    .line 84
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v11, Ljava/lang/String;

    .line 87
    .line 88
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v11, Ljava/lang/String;

    .line 91
    .line 92
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v11, [Ljava/lang/String;

    .line 95
    .line 96
    iget-object v12, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v12, Ljava/util/List;

    .line 99
    .line 100
    iget-object v13, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v13, Lcom/zykj/evaluation/upload/OssData;

    .line 103
    .line 104
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto/16 :goto_8

    .line 108
    .line 109
    :pswitch_1
    iget v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->p:I

    .line 110
    .line 111
    iget v4, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->o:I

    .line 112
    .line 113
    iget v5, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->n:I

    .line 114
    .line 115
    iget v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 116
    .line 117
    iget-object v12, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v12, Ljava/lang/String;

    .line 120
    .line 121
    iget-object v13, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v13, Ljava/lang/String;

    .line 124
    .line 125
    iget-object v14, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v14, Ljava/io/File;

    .line 128
    .line 129
    iget-object v15, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v15, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v7, Ljava/lang/String;

    .line 136
    .line 137
    iget-object v10, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v10, Lkotlin/Pair;

    .line 140
    .line 141
    iget-object v8, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v8, Ljava/lang/String;

    .line 144
    .line 145
    move-object/from16 v18, v1

    .line 146
    .line 147
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v1, Ljava/lang/String;

    .line 150
    .line 151
    move-object/from16 v19, v1

    .line 152
    .line 153
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v1, [Ljava/lang/String;

    .line 156
    .line 157
    move-object/from16 v20, v1

    .line 158
    .line 159
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v1, Ljava/util/List;

    .line 162
    .line 163
    move-object/from16 v21, v1

    .line 164
    .line 165
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast v1, Lcom/zykj/evaluation/upload/OssData;

    .line 168
    .line 169
    invoke-static/range {v18 .. v18}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    move-object/from16 v0, v20

    .line 173
    .line 174
    move-object/from16 v20, v13

    .line 175
    .line 176
    move-object v13, v0

    .line 177
    move-object v0, v12

    .line 178
    move-object v12, v7

    .line 179
    move v7, v5

    .line 180
    move-object v5, v2

    .line 181
    move-object v2, v15

    .line 182
    move-object v15, v1

    .line 183
    move-object/from16 v1, v18

    .line 184
    .line 185
    move-object/from16 v18, v14

    .line 186
    .line 187
    move-object/from16 v14, v21

    .line 188
    .line 189
    move-object/from16 v21, v8

    .line 190
    .line 191
    move v8, v11

    .line 192
    move v11, v4

    .line 193
    goto/16 :goto_7

    .line 194
    .line 195
    :pswitch_2
    move-object/from16 v18, v1

    .line 196
    .line 197
    iget v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->p:I

    .line 198
    .line 199
    iget v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->o:I

    .line 200
    .line 201
    iget v4, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->n:I

    .line 202
    .line 203
    iget v5, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 204
    .line 205
    iget-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v7, Ljava/lang/String;

    .line 208
    .line 209
    iget-object v8, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v8, Ljava/lang/String;

    .line 212
    .line 213
    iget-object v10, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v10, Ljava/io/File;

    .line 216
    .line 217
    iget-object v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v11, Ljava/lang/String;

    .line 220
    .line 221
    iget-object v12, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v12, Ljava/lang/String;

    .line 224
    .line 225
    iget-object v13, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v13, Lkotlin/Pair;

    .line 228
    .line 229
    iget-object v14, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v14, Ljava/lang/String;

    .line 232
    .line 233
    iget-object v15, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v15, Ljava/lang/String;

    .line 236
    .line 237
    move/from16 v19, v1

    .line 238
    .line 239
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v1, [Ljava/lang/String;

    .line 242
    .line 243
    move-object/from16 v20, v1

    .line 244
    .line 245
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v1, Ljava/util/List;

    .line 248
    .line 249
    move-object/from16 v21, v1

    .line 250
    .line 251
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v1, Lcom/zykj/evaluation/upload/OssData;

    .line 254
    .line 255
    invoke-static/range {v18 .. v18}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_5

    .line 259
    .line 260
    :pswitch_3
    move-object/from16 v18, v1

    .line 261
    .line 262
    iget-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;

    .line 265
    .line 266
    :goto_1
    invoke-static/range {v18 .. v18}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    return-object v18

    .line 270
    :pswitch_4
    move-object/from16 v18, v1

    .line 271
    .line 272
    invoke-static/range {v18 .. v18}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :pswitch_5
    move-object/from16 v18, v1

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :pswitch_6
    move-object/from16 v18, v1

    .line 280
    .line 281
    invoke-static/range {v18 .. v18}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-nez v1, :cond_2

    .line 289
    .line 290
    const/16 v1, 0x65

    .line 291
    .line 292
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    const/4 v3, 0x1

    .line 297
    iput v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 298
    .line 299
    invoke-virtual {v0, v1, v2}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    if-ne v1, v6, :cond_1

    .line 304
    .line 305
    goto/16 :goto_a

    .line 306
    .line 307
    :cond_1
    return-object v1

    .line 308
    :cond_2
    iget-object v1, v0, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->a:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 309
    .line 310
    const/4 v3, 0x2

    .line 311
    iput v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 312
    .line 313
    invoke-virtual {v1, v2}, Lcom/zykj/evaluation/upload/OssTaskManger;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    if-ne v1, v6, :cond_3

    .line 318
    .line 319
    goto/16 :goto_a

    .line 320
    .line 321
    :cond_3
    :goto_2
    check-cast v1, Lcom/zykj/evaluation/upload/OssData;

    .line 322
    .line 323
    if-nez v1, :cond_5

    .line 324
    .line 325
    const/16 v1, 0x67

    .line 326
    .line 327
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v1

    .line 331
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    iput-object v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 336
    .line 337
    const/4 v3, 0x0

    .line 338
    iput v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 339
    .line 340
    const/4 v3, 0x3

    .line 341
    iput v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 342
    .line 343
    invoke-virtual {v0, v1, v2}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->c(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    if-ne v1, v6, :cond_4

    .line 348
    .line 349
    goto/16 :goto_a

    .line 350
    .line 351
    :cond_4
    return-object v1

    .line 352
    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    .line 353
    .line 354
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    const-string v5, "ANSWER_DATA"

    .line 362
    .line 363
    invoke-virtual {v4, v5}, Landroidx/work/Data;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    if-eqz v4, :cond_e

    .line 368
    .line 369
    array-length v5, v4

    .line 370
    move-object v10, v1

    .line 371
    move-object v7, v3

    .line 372
    move-object v8, v4

    .line 373
    move v11, v5

    .line 374
    const/4 v12, 0x0

    .line 375
    const/4 v13, 0x0

    .line 376
    move-object v5, v2

    .line 377
    :goto_3
    if-ge v12, v11, :cond_d

    .line 378
    .line 379
    aget-object v14, v8, v12

    .line 380
    .line 381
    new-instance v1, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$2$pair$1;

    .line 382
    .line 383
    invoke-direct {v1}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$2$pair$1;-><init>()V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-static {v14, v1}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    move-object v15, v1

    .line 395
    check-cast v15, Lkotlin/Pair;

    .line 396
    .line 397
    invoke-virtual {v15}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v1

    .line 401
    check-cast v1, Ljava/lang/String;

    .line 402
    .line 403
    invoke-virtual {v15}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    check-cast v2, Ljava/lang/String;

    .line 408
    .line 409
    new-instance v3, Ljava/io/File;

    .line 410
    .line 411
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/io/File;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v10}, Lcom/zykj/evaluation/upload/OssData;->getObjectKey()Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    move-object/from16 v18, v3

    .line 423
    .line 424
    new-instance v3, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    const-string v0, "/"

    .line 433
    .line 434
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 438
    .line 439
    .line 440
    const-string v0, "."

    .line 441
    .line 442
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 443
    .line 444
    .line 445
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    new-instance v3, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 455
    .line 456
    .line 457
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    move-object/from16 v19, v4

    .line 464
    .line 465
    const-string v4, "]: \u5f00\u59cb\u4e0a\u4f20\u6587\u4ef6"

    .line 466
    .line 467
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v3

    .line 478
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->exists()Z

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    if-eqz v3, :cond_7

    .line 486
    .line 487
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->isDirectory()Z

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-eqz v3, :cond_6

    .line 492
    .line 493
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 494
    .line 495
    .line 496
    move-result-object v3

    .line 497
    if-eqz v3, :cond_7

    .line 498
    .line 499
    array-length v3, v3

    .line 500
    if-nez v3, :cond_6

    .line 501
    .line 502
    goto :goto_4

    .line 503
    :cond_6
    move v4, v12

    .line 504
    move-object/from16 v20, v19

    .line 505
    .line 506
    const/4 v3, 0x0

    .line 507
    move-object v12, v1

    .line 508
    move-object v1, v2

    .line 509
    move-object v2, v5

    .line 510
    move v5, v13

    .line 511
    move-object/from16 v19, v14

    .line 512
    .line 513
    goto/16 :goto_6

    .line 514
    .line 515
    :cond_7
    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    const-string v4, "]: \u4e0a\u4f20\u5931\u8d25\uff0c\u6587\u4ef6\u4e3a\u7a7a"

    .line 527
    .line 528
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    sget-object v4, Lm5/e$a;->b:Lm5/e$a;

    .line 546
    .line 547
    iput-object v10, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 548
    .line 549
    iput-object v7, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 550
    .line 551
    iput-object v8, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 552
    .line 553
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    iput-object v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 558
    .line 559
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    iput-object v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 564
    .line 565
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v3

    .line 569
    iput-object v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 570
    .line 571
    iput-object v1, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 572
    .line 573
    iput-object v2, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 574
    .line 575
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    iput-object v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 580
    .line 581
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    iput-object v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 586
    .line 587
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 588
    .line 589
    const/4 v3, 0x0

    .line 590
    iput-object v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 591
    .line 592
    iput v13, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 593
    .line 594
    iput v12, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->n:I

    .line 595
    .line 596
    iput v11, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->o:I

    .line 597
    .line 598
    const/4 v3, 0x0

    .line 599
    iput v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->p:I

    .line 600
    .line 601
    const/4 v3, 0x4

    .line 602
    iput v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 603
    .line 604
    const-string v3, ""

    .line 605
    .line 606
    move-object/from16 v20, v0

    .line 607
    .line 608
    move-object/from16 v0, p0

    .line 609
    .line 610
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v3

    .line 614
    if-ne v3, v6, :cond_8

    .line 615
    .line 616
    goto/16 :goto_a

    .line 617
    .line 618
    :cond_8
    move-object/from16 v21, v7

    .line 619
    .line 620
    move v3, v11

    .line 621
    move v4, v12

    .line 622
    move-object/from16 v7, v20

    .line 623
    .line 624
    move-object v12, v1

    .line 625
    move-object v11, v2

    .line 626
    move-object v2, v5

    .line 627
    move-object/from16 v20, v8

    .line 628
    .line 629
    move-object v1, v10

    .line 630
    move v5, v13

    .line 631
    move-object v13, v15

    .line 632
    move-object/from16 v10, v18

    .line 633
    .line 634
    move-object/from16 v8, v19

    .line 635
    .line 636
    const/16 v19, 0x0

    .line 637
    .line 638
    move-object v15, v14

    .line 639
    :goto_5
    move-object/from16 v0, v20

    .line 640
    .line 641
    move-object/from16 v20, v8

    .line 642
    .line 643
    move-object v8, v0

    .line 644
    move-object v0, v7

    .line 645
    move-object/from16 v18, v10

    .line 646
    .line 647
    move-object/from16 v7, v21

    .line 648
    .line 649
    move-object v10, v1

    .line 650
    move-object v1, v11

    .line 651
    move v11, v3

    .line 652
    move/from16 v3, v19

    .line 653
    .line 654
    move-object/from16 v19, v15

    .line 655
    .line 656
    move-object v15, v13

    .line 657
    :goto_6
    sget-object v13, Lcom/zykj/evaluation/upload/UploadUtils;->a:Lcom/zykj/evaluation/upload/UploadUtils;

    .line 658
    .line 659
    move-object/from16 v21, v14

    .line 660
    .line 661
    invoke-virtual {v10}, Lcom/zykj/evaluation/upload/OssData;->getToken()Lcom/zykj/evaluation/upload/OssToken;

    .line 662
    .line 663
    .line 664
    move-result-object v14

    .line 665
    iput-object v10, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 666
    .line 667
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 668
    .line 669
    iput-object v8, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 670
    .line 671
    move-object/from16 v22, v7

    .line 672
    .line 673
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v7

    .line 677
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 678
    .line 679
    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v7

    .line 683
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 684
    .line 685
    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    move-result-object v7

    .line 689
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 690
    .line 691
    iput-object v12, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 692
    .line 693
    iput-object v1, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 694
    .line 695
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v7

    .line 699
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 700
    .line 701
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v7

    .line 705
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 706
    .line 707
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v7

    .line 711
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 712
    .line 713
    const/4 v7, 0x0

    .line 714
    iput-object v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 715
    .line 716
    iput v5, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 717
    .line 718
    iput v4, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->n:I

    .line 719
    .line 720
    iput v11, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->o:I

    .line 721
    .line 722
    iput v3, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->p:I

    .line 723
    .line 724
    const/4 v7, 0x5

    .line 725
    iput v7, v2, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 726
    .line 727
    invoke-virtual {v13, v1, v0, v14, v2}, Lcom/zykj/evaluation/upload/UploadUtils;->c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v7

    .line 731
    if-ne v7, v6, :cond_9

    .line 732
    .line 733
    goto/16 :goto_a

    .line 734
    .line 735
    :cond_9
    move-object v13, v15

    .line 736
    move-object v15, v10

    .line 737
    move-object v10, v13

    .line 738
    move-object v13, v8

    .line 739
    move-object/from16 v14, v22

    .line 740
    .line 741
    move v8, v5

    .line 742
    move-object v5, v2

    .line 743
    move-object v2, v1

    .line 744
    move-object v1, v7

    .line 745
    move v7, v4

    .line 746
    :goto_7
    check-cast v1, Ljava/lang/String;

    .line 747
    .line 748
    if-eqz v1, :cond_a

    .line 749
    .line 750
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 751
    .line 752
    .line 753
    move-result v4

    .line 754
    if-nez v4, :cond_b

    .line 755
    .line 756
    :cond_a
    move-object/from16 v22, v0

    .line 757
    .line 758
    move-object v0, v1

    .line 759
    move-object v1, v12

    .line 760
    goto/16 :goto_9

    .line 761
    .line 762
    :cond_b
    new-instance v4, Ljava/lang/StringBuilder;

    .line 763
    .line 764
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 771
    .line 772
    .line 773
    move-object/from16 v22, v0

    .line 774
    .line 775
    const-string v0, "]: \u6587\u4ef6\u4e0a\u4f20\u6210\u529f"

    .line 776
    .line 777
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 789
    .line 790
    .line 791
    sget-object v4, Lm5/e$b;->b:Lm5/e$b;

    .line 792
    .line 793
    iput-object v15, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 794
    .line 795
    iput-object v14, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 796
    .line 797
    iput-object v13, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 798
    .line 799
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 804
    .line 805
    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 810
    .line 811
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 816
    .line 817
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 822
    .line 823
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v0

    .line 827
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 828
    .line 829
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 834
    .line 835
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 840
    .line 841
    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 846
    .line 847
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 852
    .line 853
    iput v8, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 854
    .line 855
    iput v7, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->n:I

    .line 856
    .line 857
    iput v11, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->o:I

    .line 858
    .line 859
    iput v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->p:I

    .line 860
    .line 861
    const/4 v0, 0x6

    .line 862
    iput v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 863
    .line 864
    move-object/from16 v0, p0

    .line 865
    .line 866
    move-object v3, v1

    .line 867
    move-object v1, v12

    .line 868
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v1

    .line 872
    if-ne v1, v6, :cond_c

    .line 873
    .line 874
    goto/16 :goto_a

    .line 875
    .line 876
    :cond_c
    move-object v2, v5

    .line 877
    move v4, v7

    .line 878
    move v5, v8

    .line 879
    move v3, v11

    .line 880
    move-object v11, v13

    .line 881
    move-object v12, v14

    .line 882
    move-object v13, v15

    .line 883
    :goto_8
    move-object v8, v11

    .line 884
    move-object v7, v12

    .line 885
    move-object v10, v13

    .line 886
    const/16 v17, 0x1

    .line 887
    .line 888
    move v11, v3

    .line 889
    move v13, v5

    .line 890
    move-object v5, v2

    .line 891
    goto :goto_b

    .line 892
    :goto_9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 893
    .line 894
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 898
    .line 899
    .line 900
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 901
    .line 902
    .line 903
    const-string v12, "]: \u6587\u4ef6\u4e0a\u4f20\u5931\u8d25"

    .line 904
    .line 905
    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 909
    .line 910
    .line 911
    move-result-object v4

    .line 912
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v4

    .line 916
    invoke-static {v4}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 917
    .line 918
    .line 919
    invoke-interface {v14, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    sget-object v4, Lm5/e$a;->b:Lm5/e$a;

    .line 923
    .line 924
    iput-object v15, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 925
    .line 926
    iput-object v14, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 927
    .line 928
    iput-object v13, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 929
    .line 930
    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v12

    .line 934
    iput-object v12, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 935
    .line 936
    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v12

    .line 940
    iput-object v12, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 941
    .line 942
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v10

    .line 946
    iput-object v10, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 947
    .line 948
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v10

    .line 952
    iput-object v10, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 953
    .line 954
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v10

    .line 958
    iput-object v10, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->h:Ljava/lang/Object;

    .line 959
    .line 960
    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v10

    .line 964
    iput-object v10, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->i:Ljava/lang/Object;

    .line 965
    .line 966
    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v10

    .line 970
    iput-object v10, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 971
    .line 972
    invoke-static/range {v22 .. v22}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    move-result-object v10

    .line 976
    iput-object v10, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->k:Ljava/lang/Object;

    .line 977
    .line 978
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    iput-object v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->l:Ljava/lang/Object;

    .line 983
    .line 984
    iput v8, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->m:I

    .line 985
    .line 986
    iput v7, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->n:I

    .line 987
    .line 988
    iput v11, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->o:I

    .line 989
    .line 990
    iput v3, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->p:I

    .line 991
    .line 992
    const/4 v0, 0x7

    .line 993
    iput v0, v5, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork$doWork$1;->s:I

    .line 994
    .line 995
    const-string v3, ""

    .line 996
    .line 997
    move-object/from16 v0, p0

    .line 998
    .line 999
    invoke-virtual/range {v0 .. v5}, Lcom/zykj/evaluation/upload/MultiAnswerUploadWork;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm5/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v1

    .line 1003
    if-ne v1, v6, :cond_c

    .line 1004
    .line 1005
    :goto_a
    return-object v6

    .line 1006
    :goto_b
    add-int/lit8 v12, v4, 0x1

    .line 1007
    .line 1008
    move-object/from16 v0, p0

    .line 1009
    .line 1010
    goto/16 :goto_3

    .line 1011
    .line 1012
    :cond_d
    move-object v3, v7

    .line 1013
    :cond_e
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1014
    .line 1015
    .line 1016
    move-result v0

    .line 1017
    if-eqz v0, :cond_f

    .line 1018
    .line 1019
    invoke-static {}, Landroidx/work/ListenableWorker$Result;->success()Landroidx/work/ListenableWorker$Result;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1024
    .line 1025
    .line 1026
    return-object v0

    .line 1027
    :cond_f
    const/16 v0, 0x68

    .line 1028
    .line 1029
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    const-string v1, "ERROR_KEY"

    .line 1034
    .line 1035
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    new-instance v1, Landroidx/work/Data$Builder;

    .line 1044
    .line 1045
    invoke-direct {v1}, Landroidx/work/Data$Builder;-><init>()V

    .line 1046
    .line 1047
    .line 1048
    const/16 v16, 0x0

    .line 1049
    .line 1050
    aget-object v0, v0, v16

    .line 1051
    .line 1052
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v2

    .line 1056
    check-cast v2, Ljava/lang/String;

    .line 1057
    .line 1058
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v0

    .line 1062
    invoke-virtual {v1, v2, v0}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v1}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v0

    .line 1069
    invoke-static {v0}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v0

    .line 1073
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1074
    .line 1075
    .line 1076
    return-object v0

    .line 1077
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
