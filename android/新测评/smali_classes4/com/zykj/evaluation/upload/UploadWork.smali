.class public abstract Lcom/zykj/evaluation/upload/UploadWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/upload/UploadWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\n\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\'\u0018\u0000 *2\u00020\u0001:\u0001(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u00a6@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\rH\u00a6@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u00a6@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fH\u0097@\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J(\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000cH\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ2\u0010$\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\r2\u0006\u0010#\u001a\u00020\"H\u0082@\u00a2\u0006\u0004\u0008$\u0010%J\u001a\u0010\'\u001a\u0004\u0018\u00010\r2\u0006\u0010&\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\'\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)\u00a8\u0006+"
    }
    d2 = {
        "Lcom/zykj/evaluation/upload/UploadWork;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "ossTaskManger",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;)V",
        "",
        "key",
        "",
        "",
        "extras",
        "Landroidx/work/ListenableWorker$Result;",
        "f",
        "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "h",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "uploadUrl",
        "i",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "g",
        "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "doWork",
        "j",
        "(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "",
        "type",
        "Ljava/io/File;",
        "file",
        "fileRelativePath",
        "Lcom/zykj/evaluation/upload/OssToken;",
        "credential",
        "k",
        "(ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "srcPath",
        "l",
        "a",
        "Lcom/zykj/evaluation/upload/OssTaskManger;",
        "b",
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
        "SMAP\nUploadWork.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadWork.kt\ncom/zykj/evaluation/upload/UploadWork\n+ 2 Data.kt\nandroidx/work/DataKt\n*L\n1#1,232:1\n31#2,5:233\n31#2,5:238\n31#2,5:243\n*S KotlinDebug\n*F\n+ 1 UploadWork.kt\ncom/zykj/evaluation/upload/UploadWork\n*L\n112#1:233,5\n185#1:238,5\n193#1:243,5\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/evaluation/upload/UploadWork$a;

.field public static final c:I

.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:Lcom/zykj/evaluation/upload/OssTaskManger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/evaluation/upload/UploadWork$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/evaluation/upload/UploadWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/evaluation/upload/UploadWork;->b:Lcom/zykj/evaluation/upload/UploadWork$a;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    sput v1, Lcom/zykj/evaluation/upload/UploadWork;->c:I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "getSimpleName(...)"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lcom/zykj/evaluation/upload/UploadWork;->d:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/zykj/evaluation/upload/OssTaskManger;)V
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
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lcom/zykj/evaluation/upload/UploadWork;->a:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 20
    .line 21
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/evaluation/upload/UploadWork;Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/evaluation/upload/UploadWork;Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/upload/UploadWork;->j(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic d(Lcom/zykj/evaluation/upload/UploadWork;ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/zykj/evaluation/upload/UploadWork;->k(ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/evaluation/upload/UploadWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

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
    iput v3, v2, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;-><init>(Lcom/zykj/evaluation/upload/UploadWork;Lkotlin/coroutines/Continuation;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->j:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 38
    .line 39
    const-string v4, "/"

    .line 40
    .line 41
    const/16 v5, 0x64

    .line 42
    .line 43
    const/4 v7, 0x1

    .line 44
    const-string v10, "["

    .line 45
    .line 46
    packed-switch v3, :pswitch_data_0

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :pswitch_0
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Ljava/lang/Exception;

    .line 60
    .line 61
    :pswitch_1
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 64
    .line 65
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    :pswitch_2
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, [Ljava/lang/String;

    .line 72
    .line 73
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lcom/zykj/evaluation/upload/UploadWork;

    .line 76
    .line 77
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-object v1

    .line 81
    :pswitch_3
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 82
    .line 83
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v0, Ljava/lang/String;

    .line 86
    .line 87
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 90
    .line 91
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v4, v0

    .line 94
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 95
    .line 96
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v5, v0

    .line 99
    check-cast v5, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v6, v0

    .line 104
    check-cast v6, [Ljava/lang/String;

    .line 105
    .line 106
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 107
    .line 108
    move-object v7, v0

    .line 109
    check-cast v7, Lcom/zykj/evaluation/upload/UploadWork;

    .line 110
    .line 111
    :try_start_0
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 112
    .line 113
    .line 114
    const/16 v16, 0x68

    .line 115
    .line 116
    goto/16 :goto_16

    .line 117
    .line 118
    :catch_0
    move-exception v0

    .line 119
    :goto_2
    const/16 v16, 0x68

    .line 120
    .line 121
    goto/16 :goto_19

    .line 122
    .line 123
    :pswitch_4
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 124
    .line 125
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Ljava/lang/String;

    .line 128
    .line 129
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 132
    .line 133
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 134
    .line 135
    move-object v4, v0

    .line 136
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 137
    .line 138
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v5, v0

    .line 141
    check-cast v5, Ljava/lang/String;

    .line 142
    .line 143
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 144
    .line 145
    move-object v6, v0

    .line 146
    check-cast v6, [Ljava/lang/String;

    .line 147
    .line 148
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 149
    .line 150
    move-object v7, v0

    .line 151
    check-cast v7, Lcom/zykj/evaluation/upload/UploadWork;

    .line 152
    .line 153
    :try_start_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 154
    .line 155
    .line 156
    const/16 v16, 0x68

    .line 157
    .line 158
    goto/16 :goto_18

    .line 159
    .line 160
    :pswitch_5
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 161
    .line 162
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 165
    .line 166
    iget-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 169
    .line 170
    iget-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v5, Ljava/lang/String;

    .line 173
    .line 174
    iget-object v6, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v6, [Ljava/lang/String;

    .line 177
    .line 178
    iget-object v7, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v7, Lcom/zykj/evaluation/upload/UploadWork;

    .line 181
    .line 182
    :try_start_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 183
    .line 184
    .line 185
    const/16 v16, 0x68

    .line 186
    .line 187
    goto/16 :goto_15

    .line 188
    .line 189
    :pswitch_6
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 190
    .line 191
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, Lcom/zykj/evaluation/upload/UploadWork;

    .line 194
    .line 195
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 198
    .line 199
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v4, v0

    .line 202
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 203
    .line 204
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 205
    .line 206
    move-object v5, v0

    .line 207
    check-cast v5, Ljava/lang/String;

    .line 208
    .line 209
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 210
    .line 211
    move-object v6, v0

    .line 212
    check-cast v6, [Ljava/lang/String;

    .line 213
    .line 214
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 215
    .line 216
    move-object v7, v0

    .line 217
    check-cast v7, Lcom/zykj/evaluation/upload/UploadWork;

    .line 218
    .line 219
    :goto_3
    :try_start_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 220
    .line 221
    .line 222
    return-object v1

    .line 223
    :pswitch_7
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 224
    .line 225
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Lcom/zykj/evaluation/upload/OssData;

    .line 228
    .line 229
    iget-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 232
    .line 233
    iget-object v7, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v7, Ljava/lang/String;

    .line 236
    .line 237
    iget-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v12, [Ljava/lang/String;

    .line 240
    .line 241
    iget-object v13, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v13, Lcom/zykj/evaluation/upload/UploadWork;

    .line 244
    .line 245
    :try_start_4
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 246
    .line 247
    .line 248
    move/from16 p1, v5

    .line 249
    .line 250
    move-object v5, v7

    .line 251
    move-object v6, v12

    .line 252
    move-object v7, v13

    .line 253
    const/16 v16, 0x68

    .line 254
    .line 255
    goto/16 :goto_12

    .line 256
    .line 257
    :catch_1
    move-exception v0

    .line 258
    move-object v5, v7

    .line 259
    move-object v6, v12

    .line 260
    move-object v7, v13

    .line 261
    goto/16 :goto_2

    .line 262
    .line 263
    :pswitch_8
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 264
    .line 265
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 266
    .line 267
    move-object v4, v0

    .line 268
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 269
    .line 270
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 271
    .line 272
    move-object v5, v0

    .line 273
    check-cast v5, Ljava/lang/String;

    .line 274
    .line 275
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 276
    .line 277
    move-object v6, v0

    .line 278
    check-cast v6, [Ljava/lang/String;

    .line 279
    .line 280
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 281
    .line 282
    move-object v7, v0

    .line 283
    check-cast v7, Lcom/zykj/evaluation/upload/UploadWork;

    .line 284
    .line 285
    goto :goto_3

    .line 286
    :pswitch_9
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 287
    .line 288
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 289
    .line 290
    check-cast v0, Ljava/lang/String;

    .line 291
    .line 292
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v0, Ljava/lang/String;

    .line 295
    .line 296
    iget-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v12, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 299
    .line 300
    iget-object v13, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 301
    .line 302
    check-cast v13, Ljava/lang/String;

    .line 303
    .line 304
    iget-object v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v14, [Ljava/lang/String;

    .line 307
    .line 308
    iget-object v15, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v15, Lcom/zykj/evaluation/upload/UploadWork;

    .line 311
    .line 312
    :try_start_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 313
    .line 314
    .line 315
    move/from16 p1, v5

    .line 316
    .line 317
    move-object v9, v12

    .line 318
    move-object v5, v13

    .line 319
    move-object v6, v14

    .line 320
    const/16 v16, 0x68

    .line 321
    .line 322
    goto/16 :goto_8

    .line 323
    .line 324
    :catch_2
    move-exception v0

    .line 325
    move-object v4, v12

    .line 326
    move-object v5, v13

    .line 327
    move-object v6, v14

    .line 328
    move-object v7, v15

    .line 329
    goto/16 :goto_2

    .line 330
    .line 331
    :pswitch_a
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 332
    .line 333
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v0, Ljava/lang/String;

    .line 336
    .line 337
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v0, Ljava/lang/String;

    .line 340
    .line 341
    iget-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v12, Ljava/lang/String;

    .line 344
    .line 345
    iget-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v12, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 348
    .line 349
    iget-object v13, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v13, Ljava/lang/String;

    .line 352
    .line 353
    iget-object v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 354
    .line 355
    check-cast v14, [Ljava/lang/String;

    .line 356
    .line 357
    iget-object v15, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v15, Lcom/zykj/evaluation/upload/UploadWork;

    .line 360
    .line 361
    :try_start_6
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 362
    .line 363
    .line 364
    move/from16 p1, v5

    .line 365
    .line 366
    move-object v9, v12

    .line 367
    move-object v5, v13

    .line 368
    move-object v6, v14

    .line 369
    const/16 v16, 0x68

    .line 370
    .line 371
    goto/16 :goto_d

    .line 372
    .line 373
    :pswitch_b
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 374
    .line 375
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 376
    .line 377
    move-object v4, v0

    .line 378
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 379
    .line 380
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 381
    .line 382
    move-object v12, v0

    .line 383
    check-cast v12, Ljava/lang/String;

    .line 384
    .line 385
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 386
    .line 387
    move-object v13, v0

    .line 388
    check-cast v13, [Ljava/lang/String;

    .line 389
    .line 390
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 391
    .line 392
    move-object v14, v0

    .line 393
    check-cast v14, Lcom/zykj/evaluation/upload/UploadWork;

    .line 394
    .line 395
    :try_start_7
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 396
    .line 397
    .line 398
    move/from16 p1, v5

    .line 399
    .line 400
    move-object v5, v12

    .line 401
    move-object v6, v13

    .line 402
    const/16 v16, 0x68

    .line 403
    .line 404
    goto/16 :goto_e

    .line 405
    .line 406
    :catch_3
    move-exception v0

    .line 407
    move-object v5, v12

    .line 408
    move-object v6, v13

    .line 409
    move-object v7, v14

    .line 410
    goto/16 :goto_2

    .line 411
    .line 412
    :pswitch_c
    iget v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 413
    .line 414
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 415
    .line 416
    move-object v4, v0

    .line 417
    check-cast v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 418
    .line 419
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 420
    .line 421
    move-object v12, v0

    .line 422
    check-cast v12, Ljava/lang/String;

    .line 423
    .line 424
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 425
    .line 426
    move-object v13, v0

    .line 427
    check-cast v13, [Ljava/lang/String;

    .line 428
    .line 429
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 430
    .line 431
    move-object v14, v0

    .line 432
    check-cast v14, Lcom/zykj/evaluation/upload/UploadWork;

    .line 433
    .line 434
    :try_start_8
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 435
    .line 436
    .line 437
    move/from16 p1, v5

    .line 438
    .line 439
    move-object v5, v12

    .line 440
    move-object v6, v13

    .line 441
    const/16 v16, 0x68

    .line 442
    .line 443
    goto/16 :goto_10

    .line 444
    .line 445
    :pswitch_d
    iget-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast v0, Lcom/zykj/evaluation/upload/UploadWork;

    .line 448
    .line 449
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 450
    .line 451
    .line 452
    :cond_1
    move-object v1, v0

    .line 453
    goto :goto_4

    .line 454
    :pswitch_e
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 455
    .line 456
    .line 457
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 458
    .line 459
    iput v7, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 460
    .line 461
    invoke-virtual {v0, v8}, Lcom/zykj/evaluation/upload/UploadWork;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    if-ne v1, v2, :cond_1

    .line 466
    .line 467
    goto/16 :goto_1b

    .line 468
    .line 469
    :goto_4
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    const-string v3, "EXTRA_DATA"

    .line 474
    .line 475
    invoke-virtual {v0, v3}, Landroidx/work/Data;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v12

    .line 479
    invoke-static {}, Lcom/blankj/utilcode/util/NetworkUtils;->isConnected()Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    const/4 v13, 0x2

    .line 484
    if-nez v0, :cond_3

    .line 485
    .line 486
    const/16 v0, 0x65

    .line 487
    .line 488
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v3

    .line 496
    iput-object v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 497
    .line 498
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    iput-object v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 503
    .line 504
    iput v13, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 505
    .line 506
    invoke-direct {v1, v0, v12, v8}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    if-ne v0, v2, :cond_2

    .line 511
    .line 512
    goto/16 :goto_1b

    .line 513
    .line 514
    :cond_2
    return-object v0

    .line 515
    :cond_3
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    const-string v14, "INPUT_TYPE"

    .line 520
    .line 521
    const/4 v15, -0x1

    .line 522
    invoke-virtual {v0, v14, v15}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 523
    .line 524
    .line 525
    move-result v14

    .line 526
    const/4 v0, 0x3

    .line 527
    if-ne v14, v15, :cond_5

    .line 528
    .line 529
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 530
    .line 531
    .line 532
    move-result-object v3

    .line 533
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v4

    .line 537
    iput-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 538
    .line 539
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    iput-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 544
    .line 545
    iput v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 546
    .line 547
    iput v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 548
    .line 549
    invoke-direct {v1, v3, v12, v8}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    if-ne v0, v2, :cond_4

    .line 554
    .line 555
    goto/16 :goto_1b

    .line 556
    .line 557
    :cond_4
    return-object v0

    .line 558
    :cond_5
    invoke-virtual {v1}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 559
    .line 560
    .line 561
    move-result-object v15

    .line 562
    move/from16 p1, v5

    .line 563
    .line 564
    const-string v5, "INPUT_FILE_ABSOLUTE_PATH"

    .line 565
    .line 566
    invoke-virtual {v15, v5}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v5

    .line 570
    const-string v15, ""

    .line 571
    .line 572
    if-nez v5, :cond_6

    .line 573
    .line 574
    move-object v5, v15

    .line 575
    :cond_6
    const/16 v16, 0x68

    .line 576
    .line 577
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 578
    .line 579
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 580
    .line 581
    .line 582
    new-instance v11, Ljava/io/File;

    .line 583
    .line 584
    invoke-direct {v11, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    iput-object v11, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 588
    .line 589
    new-instance v11, Ljava/lang/StringBuilder;

    .line 590
    .line 591
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 595
    .line 596
    .line 597
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 598
    .line 599
    .line 600
    const-string v6, "]: \u5f00\u59cb\u4e0a\u4f20\u6587\u4ef6"

    .line 601
    .line 602
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v6

    .line 609
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 610
    .line 611
    .line 612
    move-result-object v6

    .line 613
    invoke-static {v6}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    iget-object v6, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 617
    .line 618
    check-cast v6, Ljava/io/File;

    .line 619
    .line 620
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 621
    .line 622
    .line 623
    move-result v6

    .line 624
    if-eqz v6, :cond_26

    .line 625
    .line 626
    iget-object v6, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 627
    .line 628
    check-cast v6, Ljava/io/File;

    .line 629
    .line 630
    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    .line 631
    .line 632
    .line 633
    move-result v6

    .line 634
    if-eqz v6, :cond_7

    .line 635
    .line 636
    iget-object v6, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v6, Ljava/io/File;

    .line 639
    .line 640
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 641
    .line 642
    .line 643
    move-result-object v6

    .line 644
    if-eqz v6, :cond_26

    .line 645
    .line 646
    array-length v6, v6

    .line 647
    if-nez v6, :cond_7

    .line 648
    .line 649
    goto/16 :goto_1a

    .line 650
    .line 651
    :cond_7
    if-eqz v14, :cond_18

    .line 652
    .line 653
    if-eq v14, v7, :cond_16

    .line 654
    .line 655
    if-eq v14, v13, :cond_d

    .line 656
    .line 657
    if-eq v14, v0, :cond_8

    .line 658
    .line 659
    move-object v15, v1

    .line 660
    move-object v4, v9

    .line 661
    move-object v6, v12

    .line 662
    move v3, v14

    .line 663
    :goto_5
    const/4 v0, 0x0

    .line 664
    goto/16 :goto_11

    .line 665
    .line 666
    :cond_8
    if-eqz v12, :cond_a

    .line 667
    .line 668
    const/4 v0, 0x0

    .line 669
    :try_start_9
    invoke-static {v12, v0}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    check-cast v3, Ljava/lang/String;

    .line 674
    .line 675
    if-nez v3, :cond_9

    .line 676
    .line 677
    goto :goto_6

    .line 678
    :cond_9
    move-object v0, v3

    .line 679
    goto :goto_7

    .line 680
    :catch_4
    move-exception v0

    .line 681
    move-object v7, v1

    .line 682
    move-object v4, v9

    .line 683
    move-object v6, v12

    .line 684
    move v3, v14

    .line 685
    goto/16 :goto_19

    .line 686
    .line 687
    :cond_a
    :goto_6
    move-object v0, v15

    .line 688
    :goto_7
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    iget-object v6, v1, Lcom/zykj/evaluation/upload/UploadWork;->a:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 693
    .line 694
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 698
    .line 699
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 700
    .line 701
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 702
    .line 703
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 704
    .line 705
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 706
    .line 707
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v11

    .line 711
    iput-object v11, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 712
    .line 713
    iput v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 714
    .line 715
    const/16 v11, 0x8

    .line 716
    .line 717
    iput v11, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 718
    .line 719
    invoke-virtual {v6, v3, v8}, Lcom/zykj/evaluation/upload/OssTaskManger;->g(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v3
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    .line 723
    if-ne v3, v2, :cond_b

    .line 724
    .line 725
    goto/16 :goto_1b

    .line 726
    .line 727
    :cond_b
    move-object v15, v1

    .line 728
    move-object v1, v3

    .line 729
    move-object v6, v12

    .line 730
    move v3, v14

    .line 731
    :goto_8
    :try_start_a
    check-cast v1, Lcom/zykj/evaluation/upload/OssData;

    .line 732
    .line 733
    if-eqz v1, :cond_c

    .line 734
    .line 735
    invoke-virtual {v1}, Lcom/zykj/evaluation/upload/OssData;->getObjectKey()Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v11

    .line 739
    new-instance v12, Ljava/lang/StringBuilder;

    .line 740
    .line 741
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 745
    .line 746
    .line 747
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 748
    .line 749
    .line 750
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 751
    .line 752
    .line 753
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    const/4 v4, 0x0

    .line 758
    invoke-static {v1, v4, v0, v7, v4}, Lcom/zykj/evaluation/upload/OssData;->copy$default(Lcom/zykj/evaluation/upload/OssData;Lcom/zykj/evaluation/upload/OssToken;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/upload/OssData;

    .line 759
    .line 760
    .line 761
    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_5

    .line 762
    :goto_9
    move-object v4, v9

    .line 763
    goto/16 :goto_11

    .line 764
    .line 765
    :catch_5
    move-exception v0

    .line 766
    move-object v4, v9

    .line 767
    :goto_a
    move-object v7, v15

    .line 768
    goto/16 :goto_19

    .line 769
    .line 770
    :cond_c
    move-object v4, v9

    .line 771
    goto :goto_5

    .line 772
    :cond_d
    if-eqz v12, :cond_e

    .line 773
    .line 774
    const/4 v0, 0x0

    .line 775
    :try_start_b
    invoke-static {v12, v0}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    move-result-object v6

    .line 779
    check-cast v6, Ljava/lang/String;

    .line 780
    .line 781
    if-nez v6, :cond_f

    .line 782
    .line 783
    :cond_e
    move-object v6, v15

    .line 784
    :cond_f
    if-eqz v12, :cond_10

    .line 785
    .line 786
    invoke-static {v12, v7}, Lkotlin/collections/ArraysKt;->getOrNull([Ljava/lang/Object;I)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v0

    .line 790
    check-cast v0, Ljava/lang/String;

    .line 791
    .line 792
    if-nez v0, :cond_11

    .line 793
    .line 794
    :cond_10
    move-object v0, v15

    .line 795
    :cond_11
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 796
    .line 797
    .line 798
    move-result v11

    .line 799
    if-nez v11, :cond_12

    .line 800
    .line 801
    goto :goto_b

    .line 802
    :cond_12
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 803
    .line 804
    .line 805
    move-result v11

    .line 806
    if-nez v11, :cond_14

    .line 807
    .line 808
    :goto_b
    const-string v0, "ERROR_KEY"

    .line 809
    .line 810
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 811
    .line 812
    .line 813
    move-result-object v4

    .line 814
    invoke-static {v0, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    invoke-static {v3, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 819
    .line 820
    .line 821
    move-result-object v3

    .line 822
    filled-new-array {v0, v3}, [Lkotlin/Pair;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    new-instance v3, Landroidx/work/Data$Builder;

    .line 827
    .line 828
    invoke-direct {v3}, Landroidx/work/Data$Builder;-><init>()V

    .line 829
    .line 830
    .line 831
    const/4 v6, 0x0

    .line 832
    :goto_c
    if-ge v6, v13, :cond_13

    .line 833
    .line 834
    aget-object v4, v0, v6

    .line 835
    .line 836
    invoke-virtual {v4}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v7

    .line 840
    check-cast v7, Ljava/lang/String;

    .line 841
    .line 842
    invoke-virtual {v4}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-virtual {v3, v7, v4}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 847
    .line 848
    .line 849
    add-int/lit8 v6, v6, 0x1

    .line 850
    .line 851
    goto :goto_c

    .line 852
    :cond_13
    invoke-virtual {v3}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 853
    .line 854
    .line 855
    move-result-object v0

    .line 856
    invoke-static {v0}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 857
    .line 858
    .line 859
    move-result-object v0

    .line 860
    const-string v3, "failure(...)"

    .line 861
    .line 862
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    return-object v0

    .line 866
    :cond_14
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    iget-object v11, v1, Lcom/zykj/evaluation/upload/UploadWork;->a:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 871
    .line 872
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 873
    .line 874
    .line 875
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 876
    .line 877
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 878
    .line 879
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 880
    .line 881
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 882
    .line 883
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v13

    .line 887
    iput-object v13, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 888
    .line 889
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 890
    .line 891
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v13

    .line 895
    iput-object v13, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 896
    .line 897
    iput v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 898
    .line 899
    const/4 v13, 0x7

    .line 900
    iput v13, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 901
    .line 902
    invoke-virtual {v11, v6, v3, v8}, Lcom/zykj/evaluation/upload/OssTaskManger;->d(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v3
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_4

    .line 906
    if-ne v3, v2, :cond_15

    .line 907
    .line 908
    goto/16 :goto_1b

    .line 909
    .line 910
    :cond_15
    move-object v15, v1

    .line 911
    move-object v1, v3

    .line 912
    move-object v6, v12

    .line 913
    move v3, v14

    .line 914
    :goto_d
    :try_start_c
    check-cast v1, Lcom/zykj/evaluation/upload/OssData;

    .line 915
    .line 916
    if-eqz v1, :cond_c

    .line 917
    .line 918
    invoke-virtual {v1}, Lcom/zykj/evaluation/upload/OssData;->getObjectKey()Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v11

    .line 922
    new-instance v12, Ljava/lang/StringBuilder;

    .line 923
    .line 924
    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 931
    .line 932
    .line 933
    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 934
    .line 935
    .line 936
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    const/4 v4, 0x0

    .line 941
    invoke-static {v1, v4, v0, v7, v4}, Lcom/zykj/evaluation/upload/OssData;->copy$default(Lcom/zykj/evaluation/upload/OssData;Lcom/zykj/evaluation/upload/OssToken;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/evaluation/upload/OssData;

    .line 942
    .line 943
    .line 944
    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_5

    .line 945
    goto/16 :goto_9

    .line 946
    .line 947
    :cond_16
    :try_start_d
    iget-object v0, v1, Lcom/zykj/evaluation/upload/UploadWork;->a:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 948
    .line 949
    const-string v3, "zip"

    .line 950
    .line 951
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 952
    .line 953
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 954
    .line 955
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 956
    .line 957
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 958
    .line 959
    iput v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 960
    .line 961
    const/4 v4, 0x6

    .line 962
    iput v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 963
    .line 964
    invoke-virtual {v0, v3, v8}, Lcom/zykj/evaluation/upload/OssTaskManger;->i(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4

    .line 968
    if-ne v0, v2, :cond_17

    .line 969
    .line 970
    goto/16 :goto_1b

    .line 971
    .line 972
    :cond_17
    move-object v4, v9

    .line 973
    move-object v6, v12

    .line 974
    move v3, v14

    .line 975
    move-object v14, v1

    .line 976
    move-object v1, v0

    .line 977
    :goto_e
    :try_start_e
    check-cast v1, Lcom/zykj/evaluation/upload/OssData;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6

    .line 978
    .line 979
    :goto_f
    move-object v0, v1

    .line 980
    move-object v15, v14

    .line 981
    goto :goto_11

    .line 982
    :catch_6
    move-exception v0

    .line 983
    move-object v7, v14

    .line 984
    goto/16 :goto_19

    .line 985
    .line 986
    :cond_18
    :try_start_f
    iget-object v0, v1, Lcom/zykj/evaluation/upload/UploadWork;->a:Lcom/zykj/evaluation/upload/OssTaskManger;

    .line 987
    .line 988
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v3

    .line 992
    const-string v4, "getFileExtension(...)"

    .line 993
    .line 994
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 995
    .line 996
    .line 997
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 998
    .line 999
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1000
    .line 1001
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1002
    .line 1003
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1004
    .line 1005
    iput v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1006
    .line 1007
    const/4 v4, 0x5

    .line 1008
    iput v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1009
    .line 1010
    invoke-virtual {v0, v3, v8}, Lcom/zykj/evaluation/upload/OssTaskManger;->i(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_4

    .line 1014
    if-ne v0, v2, :cond_19

    .line 1015
    .line 1016
    goto/16 :goto_1b

    .line 1017
    .line 1018
    :cond_19
    move-object v4, v9

    .line 1019
    move-object v6, v12

    .line 1020
    move v3, v14

    .line 1021
    move-object v14, v1

    .line 1022
    move-object v1, v0

    .line 1023
    :goto_10
    :try_start_10
    check-cast v1, Lcom/zykj/evaluation/upload/OssData;
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    .line 1024
    .line 1025
    goto :goto_f

    .line 1026
    :goto_11
    if-nez v0, :cond_1b

    .line 1027
    .line 1028
    :try_start_11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1029
    .line 1030
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1037
    .line 1038
    .line 1039
    const-string v1, "]: OssToken\u83b7\u53d6\u5931\u8d25"

    .line 1040
    .line 1041
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v0

    .line 1048
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 1053
    .line 1054
    .line 1055
    const/16 v0, 0x67

    .line 1056
    .line 1057
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v0

    .line 1061
    iput-object v15, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1062
    .line 1063
    iput-object v6, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1064
    .line 1065
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1066
    .line 1067
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v1

    .line 1071
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1072
    .line 1073
    const/4 v1, 0x0

    .line 1074
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 1075
    .line 1076
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 1077
    .line 1078
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 1079
    .line 1080
    iput v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1081
    .line 1082
    const/4 v1, 0x0

    .line 1083
    iput v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->i:I

    .line 1084
    .line 1085
    const/16 v1, 0x9

    .line 1086
    .line 1087
    iput v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1088
    .line 1089
    invoke-direct {v15, v0, v6, v8}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    if-ne v0, v2, :cond_1a

    .line 1094
    .line 1095
    goto/16 :goto_1b

    .line 1096
    .line 1097
    :cond_1a
    return-object v0

    .line 1098
    :catch_7
    move-exception v0

    .line 1099
    goto/16 :goto_a

    .line 1100
    .line 1101
    :cond_1b
    if-ne v3, v7, :cond_1f

    .line 1102
    .line 1103
    iget-object v1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v1, Ljava/io/File;

    .line 1106
    .line 1107
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 1108
    .line 1109
    .line 1110
    move-result v1

    .line 1111
    if-eqz v1, :cond_1f

    .line 1112
    .line 1113
    iput-object v15, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1114
    .line 1115
    iput-object v6, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1116
    .line 1117
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1118
    .line 1119
    iput-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1120
    .line 1121
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 1122
    .line 1123
    const/4 v1, 0x0

    .line 1124
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 1125
    .line 1126
    iput-object v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 1127
    .line 1128
    iput v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1129
    .line 1130
    const/16 v1, 0xa

    .line 1131
    .line 1132
    iput v1, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1133
    .line 1134
    invoke-virtual {v15, v5, v8}, Lcom/zykj/evaluation/upload/UploadWork;->l(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v1
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_7

    .line 1138
    if-ne v1, v2, :cond_1c

    .line 1139
    .line 1140
    goto/16 :goto_1b

    .line 1141
    .line 1142
    :cond_1c
    move-object v7, v15

    .line 1143
    :goto_12
    :try_start_12
    check-cast v1, Ljava/lang/String;

    .line 1144
    .line 1145
    if-eqz v1, :cond_1d

    .line 1146
    .line 1147
    new-instance v9, Ljava/io/File;

    .line 1148
    .line 1149
    invoke-direct {v9, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1150
    .line 1151
    .line 1152
    iput-object v9, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1153
    .line 1154
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1155
    .line 1156
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1157
    .line 1158
    .line 1159
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1160
    .line 1161
    .line 1162
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1163
    .line 1164
    .line 1165
    const-string v9, "]: \u6587\u4ef6\u538b\u7f29\u6210\u529f"

    .line 1166
    .line 1167
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1168
    .line 1169
    .line 1170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v1

    .line 1174
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1175
    .line 1176
    .line 1177
    move-result-object v1

    .line 1178
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 1179
    .line 1180
    .line 1181
    move-object v1, v4

    .line 1182
    move v4, v3

    .line 1183
    move-object v3, v7

    .line 1184
    :goto_13
    move-object v9, v5

    .line 1185
    move-object v11, v6

    .line 1186
    goto :goto_14

    .line 1187
    :catch_8
    move-exception v0

    .line 1188
    goto/16 :goto_19

    .line 1189
    .line 1190
    :cond_1d
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1191
    .line 1192
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1196
    .line 1197
    .line 1198
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1199
    .line 1200
    .line 1201
    const-string v9, "]: \u6587\u4ef6\u538b\u7f29\u5931\u8d25"

    .line 1202
    .line 1203
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v1

    .line 1214
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1215
    .line 1216
    .line 1217
    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    iput-object v7, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1222
    .line 1223
    iput-object v6, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1224
    .line 1225
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1226
    .line 1227
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v9

    .line 1231
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1232
    .line 1233
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 1238
    .line 1239
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1240
    .line 1241
    .line 1242
    move-result-object v0

    .line 1243
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 1244
    .line 1245
    iput v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1246
    .line 1247
    const/4 v0, 0x0

    .line 1248
    iput v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->i:I

    .line 1249
    .line 1250
    const/16 v0, 0xb

    .line 1251
    .line 1252
    iput v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1253
    .line 1254
    invoke-direct {v7, v1, v6, v8}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_8

    .line 1258
    if-ne v0, v2, :cond_1e

    .line 1259
    .line 1260
    goto/16 :goto_1b

    .line 1261
    .line 1262
    :cond_1e
    return-object v0

    .line 1263
    :cond_1f
    move-object v1, v4

    .line 1264
    move v4, v3

    .line 1265
    move-object v3, v15

    .line 1266
    goto :goto_13

    .line 1267
    :goto_14
    :try_start_13
    iget-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 1268
    .line 1269
    check-cast v5, Ljava/io/File;

    .line 1270
    .line 1271
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssData;->getObjectKey()Ljava/lang/String;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v6

    .line 1275
    invoke-virtual {v0}, Lcom/zykj/evaluation/upload/OssData;->getToken()Lcom/zykj/evaluation/upload/OssToken;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v7

    .line 1279
    iput-object v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1280
    .line 1281
    iput-object v11, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1282
    .line 1283
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1284
    .line 1285
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v12

    .line 1289
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1290
    .line 1291
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v12

    .line 1295
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 1296
    .line 1297
    const/4 v12, 0x0

    .line 1298
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 1299
    .line 1300
    iput-object v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 1301
    .line 1302
    iput v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1303
    .line 1304
    const/16 v12, 0xc

    .line 1305
    .line 1306
    iput v12, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1307
    .line 1308
    invoke-virtual/range {v3 .. v8}, Lcom/zykj/evaluation/upload/UploadWork;->k(ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v5
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_9

    .line 1312
    if-ne v5, v2, :cond_20

    .line 1313
    .line 1314
    goto/16 :goto_1b

    .line 1315
    .line 1316
    :cond_20
    move-object v7, v3

    .line 1317
    move v3, v4

    .line 1318
    move-object v6, v11

    .line 1319
    move-object v4, v1

    .line 1320
    move-object v1, v5

    .line 1321
    move-object v5, v9

    .line 1322
    :goto_15
    :try_start_14
    check-cast v1, Ljava/lang/String;

    .line 1323
    .line 1324
    if-eqz v1, :cond_23

    .line 1325
    .line 1326
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 1327
    .line 1328
    .line 1329
    move-result v9

    .line 1330
    if-nez v9, :cond_21

    .line 1331
    .line 1332
    goto :goto_17

    .line 1333
    :cond_21
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1339
    .line 1340
    .line 1341
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1342
    .line 1343
    .line 1344
    const-string v11, "]: \u6587\u4ef6\u4e0a\u4f20\u6210\u529f"

    .line 1345
    .line 1346
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1347
    .line 1348
    .line 1349
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v9

    .line 1353
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v9

    .line 1357
    invoke-static {v9}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 1358
    .line 1359
    .line 1360
    iput-object v7, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1361
    .line 1362
    iput-object v6, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1363
    .line 1364
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1365
    .line 1366
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v9

    .line 1370
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1371
    .line 1372
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1373
    .line 1374
    .line 1375
    move-result-object v0

    .line 1376
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 1377
    .line 1378
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 1383
    .line 1384
    iput v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1385
    .line 1386
    const/16 v0, 0xe

    .line 1387
    .line 1388
    iput v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1389
    .line 1390
    invoke-virtual {v7, v1, v6, v8}, Lcom/zykj/evaluation/upload/UploadWork;->j(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    if-ne v1, v2, :cond_22

    .line 1395
    .line 1396
    goto/16 :goto_1b

    .line 1397
    .line 1398
    :cond_22
    :goto_16
    check-cast v1, Landroidx/work/ListenableWorker$Result;

    .line 1399
    .line 1400
    return-object v1

    .line 1401
    :cond_23
    :goto_17
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1402
    .line 1403
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1407
    .line 1408
    .line 1409
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1410
    .line 1411
    .line 1412
    const-string v11, "]: \u6587\u4ef6\u4e0a\u4f20\u5931\u8d25"

    .line 1413
    .line 1414
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1415
    .line 1416
    .line 1417
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v9

    .line 1421
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v9

    .line 1425
    invoke-static {v9}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1429
    .line 1430
    .line 1431
    move-result-object v9

    .line 1432
    iput-object v7, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1433
    .line 1434
    iput-object v6, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1435
    .line 1436
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1437
    .line 1438
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v11

    .line 1442
    iput-object v11, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1443
    .line 1444
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v0

    .line 1448
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 1449
    .line 1450
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 1455
    .line 1456
    iput v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1457
    .line 1458
    const/16 v0, 0xd

    .line 1459
    .line 1460
    iput v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1461
    .line 1462
    invoke-direct {v7, v9, v6, v8}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v1

    .line 1466
    if-ne v1, v2, :cond_24

    .line 1467
    .line 1468
    goto/16 :goto_1b

    .line 1469
    .line 1470
    :cond_24
    :goto_18
    check-cast v1, Landroidx/work/ListenableWorker$Result;
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_8

    .line 1471
    .line 1472
    return-object v1

    .line 1473
    :catch_9
    move-exception v0

    .line 1474
    move-object v7, v3

    .line 1475
    move v3, v4

    .line 1476
    move-object v5, v9

    .line 1477
    move-object v6, v11

    .line 1478
    move-object v4, v1

    .line 1479
    :goto_19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1480
    .line 1481
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1482
    .line 1483
    .line 1484
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1485
    .line 1486
    .line 1487
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1488
    .line 1489
    .line 1490
    const-string v9, "]: \u6587\u4ef6\u4e0a\u4f20\u5931\u8d25, e: "

    .line 1491
    .line 1492
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v1

    .line 1502
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 1503
    .line 1504
    .line 1505
    move-result-object v1

    .line 1506
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1507
    .line 1508
    .line 1509
    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v1

    .line 1513
    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v9

    .line 1517
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1518
    .line 1519
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v9

    .line 1523
    iput-object v9, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1524
    .line 1525
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v5

    .line 1529
    iput-object v5, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1530
    .line 1531
    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v4

    .line 1535
    iput-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1536
    .line 1537
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v0

    .line 1541
    iput-object v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->e:Ljava/lang/Object;

    .line 1542
    .line 1543
    const/4 v4, 0x0

    .line 1544
    iput-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->f:Ljava/lang/Object;

    .line 1545
    .line 1546
    iput-object v4, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->g:Ljava/lang/Object;

    .line 1547
    .line 1548
    iput v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1549
    .line 1550
    const/16 v0, 0xf

    .line 1551
    .line 1552
    iput v0, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1553
    .line 1554
    invoke-direct {v7, v1, v6, v8}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v0

    .line 1558
    if-ne v0, v2, :cond_25

    .line 1559
    .line 1560
    goto :goto_1b

    .line 1561
    :cond_25
    return-object v0

    .line 1562
    :cond_26
    :goto_1a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1563
    .line 1564
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1568
    .line 1569
    .line 1570
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1571
    .line 1572
    .line 1573
    const-string v3, "]: \u4e0a\u4f20\u5931\u8d25\uff0c\u6587\u4ef6\u4e3a\u7a7a"

    .line 1574
    .line 1575
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1576
    .line 1577
    .line 1578
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v0

    .line 1582
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v0

    .line 1586
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 1587
    .line 1588
    .line 1589
    const/16 v0, 0x69

    .line 1590
    .line 1591
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v0

    .line 1595
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v3

    .line 1599
    iput-object v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->a:Ljava/lang/Object;

    .line 1600
    .line 1601
    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v3

    .line 1605
    iput-object v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->b:Ljava/lang/Object;

    .line 1606
    .line 1607
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v3

    .line 1611
    iput-object v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->c:Ljava/lang/Object;

    .line 1612
    .line 1613
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v3

    .line 1617
    iput-object v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->d:Ljava/lang/Object;

    .line 1618
    .line 1619
    iput v14, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->h:I

    .line 1620
    .line 1621
    const/4 v3, 0x4

    .line 1622
    iput v3, v8, Lcom/zykj/evaluation/upload/UploadWork$doWork$1;->l:I

    .line 1623
    .line 1624
    invoke-direct {v1, v0, v12, v8}, Lcom/zykj/evaluation/upload/UploadWork;->f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 1625
    .line 1626
    .line 1627
    move-result-object v0

    .line 1628
    if-ne v0, v2, :cond_27

    .line 1629
    .line 1630
    :goto_1b
    return-object v2

    .line 1631
    :cond_27
    return-object v0

    .line 1632
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_2
        :pswitch_2
        :pswitch_1
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
        :pswitch_0
    .end packed-switch
.end method

.method private final f(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->e:I

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
    iput v1, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;-><init>(Lcom/zykj/evaluation/upload/UploadWork;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->e:I

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
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    check-cast p2, [Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->a:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p2, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->b:Ljava/lang/Object;

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/evaluation/upload/UploadWork$failedResult$1;->e:I

    .line 65
    .line 66
    invoke-virtual {p0, p1, v0}, Lcom/zykj/evaluation/upload/UploadWork;->g(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    if-ne p3, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    const-string p3, "ERROR_KEY"

    .line 74
    .line 75
    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const-string p3, "EXTRA_DATA"

    .line 80
    .line 81
    invoke-static {p3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    filled-new-array {p1, p2}, [Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance p2, Landroidx/work/Data$Builder;

    .line 90
    .line 91
    invoke-direct {p2}, Landroidx/work/Data$Builder;-><init>()V

    .line 92
    .line 93
    .line 94
    const/4 p3, 0x0

    .line 95
    :goto_2
    const/4 v0, 0x2

    .line 96
    if-ge p3, v0, :cond_4

    .line 97
    .line 98
    aget-object v0, p1, p3

    .line 99
    .line 100
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Ljava/lang/String;

    .line 105
    .line 106
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p2, v1, v0}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 111
    .line 112
    .line 113
    add-int/lit8 p3, p3, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-virtual {p2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    const-string p2, "failure(...)"

    .line 125
    .line 126
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object p1
.end method


# virtual methods
.method public doWork(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/zykj/evaluation/upload/UploadWork;->e(Lcom/zykj/evaluation/upload/UploadWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract g(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method

.method public abstract h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method

.method public abstract i(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end method

.method public final j(Ljava/lang/String;[Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->e:I

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
    iput v1, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;-><init>(Lcom/zykj/evaluation/upload/UploadWork;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->e:I

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
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->b:Ljava/lang/Object;

    .line 39
    .line 40
    move-object p2, p1

    .line 41
    check-cast p2, [Ljava/lang/String;

    .line 42
    .line 43
    iget-object p1, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iput-object p2, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->b:Ljava/lang/Object;

    .line 65
    .line 66
    iput v3, v0, Lcom/zykj/evaluation/upload/UploadWork$successResult$1;->e:I

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0}, Lcom/zykj/evaluation/upload/UploadWork;->i(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    if-ne p3, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    const-string p3, "SUCCESS_KEY"

    .line 76
    .line 77
    invoke-static {p3, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p3, "EXTRA_DATA"

    .line 82
    .line 83
    invoke-static {p3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    filled-new-array {p1, p2}, [Lkotlin/Pair;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance p2, Landroidx/work/Data$Builder;

    .line 92
    .line 93
    invoke-direct {p2}, Landroidx/work/Data$Builder;-><init>()V

    .line 94
    .line 95
    .line 96
    const/4 p3, 0x0

    .line 97
    :goto_2
    const/4 v0, 0x2

    .line 98
    if-ge p3, v0, :cond_4

    .line 99
    .line 100
    aget-object v0, p1, p3

    .line 101
    .line 102
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p2, v1, v0}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 113
    .line 114
    .line 115
    add-int/lit8 p3, p3, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    invoke-virtual {p2}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    const-string p2, "success(...)"

    .line 127
    .line 128
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object p1
.end method

.method public final k(ILjava/io/File;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->g:I

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
    iput v1, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;-><init>(Lcom/zykj/evaluation/upload/UploadWork;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->g:I

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
    iget p1, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->a:I

    .line 39
    .line 40
    iget-object p2, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Lcom/zykj/evaluation/upload/OssToken;

    .line 43
    .line 44
    iget-object p2, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Ljava/lang/String;

    .line 47
    .line 48
    iget-object p2, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p2, Ljava/io/File;

    .line 51
    .line 52
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-static {p5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sget-object p5, Lcom/zykj/evaluation/upload/UploadUtils;->a:Lcom/zykj/evaluation/upload/UploadUtils;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const-string v4, "getAbsolutePath(...)"

    .line 74
    .line 75
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object p2, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 79
    .line 80
    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iput-object v4, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->c:Ljava/lang/Object;

    .line 85
    .line 86
    invoke-static {p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    iput-object v4, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->d:Ljava/lang/Object;

    .line 91
    .line 92
    iput p1, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->a:I

    .line 93
    .line 94
    iput v3, v0, Lcom/zykj/evaluation/upload/UploadWork$uploadFile$1;->g:I

    .line 95
    .line 96
    invoke-virtual {p5, v2, p3, p4, v0}, Lcom/zykj/evaluation/upload/UploadUtils;->c(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/evaluation/upload/OssToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p5

    .line 100
    if-ne p5, v1, :cond_3

    .line 101
    .line 102
    return-object v1

    .line 103
    :cond_3
    :goto_1
    check-cast p5, Ljava/lang/String;

    .line 104
    .line 105
    if-ne p1, v3, :cond_4

    .line 106
    .line 107
    invoke-virtual {p2}, Ljava/io/File;->delete()Z

    .line 108
    .line 109
    .line 110
    :cond_4
    return-object p5
.end method

.method public final l(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/evaluation/upload/UploadWork$zipFile$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lcom/zykj/evaluation/upload/UploadWork$zipFile$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
