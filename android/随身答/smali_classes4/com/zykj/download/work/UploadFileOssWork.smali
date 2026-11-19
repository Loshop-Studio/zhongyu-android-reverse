# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public Lcom/zykj/download/work/UploadFileOssWork;
.super Lcom/zykj/download/work/UploadFileWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/UploadFileOssWork$a;,
        Lcom/zykj/download/work/UploadFileOssWork$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0017\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u000b8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/zykj/download/work/UploadFileOssWork;",
        "Lcom/zykj/download/work/UploadFileWork;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "initParameter",
        "()V",
        "",
        "uploadFile",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "objectName",
        "Ljava/lang/String;",
        "filePath",
        "Lcom/zykj/download/OssToken;",
        "ossToken",
        "Lcom/zykj/download/OssToken;",
        "Companion",
        "a",
        "download_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

.field private static final fileOkHttpClient:Ll8/v;

.field private static final uploadApi:Lcom/zykj/download/api/UploadApi;


# instance fields
.field private final appContext:Landroid/content/Context;

.field private filePath:Ljava/lang/String;

.field private objectName:Ljava/lang/String;

.field private ossToken:Lcom/zykj/download/OssToken;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/download/work/UploadFileOssWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/download/work/UploadFileOssWork;->Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 8
    .line 9
    new-instance v0, Ll8/v$a;

    .line 10
    .line 11
    invoke-direct {v0}, Ll8/v$a;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ll8/v$a;

    .line 15
    .line 16
    invoke-direct {v0}, Ll8/v$a;-><init>()V

    .line 17
    .line 18
    .line 19
    const-wide/16 v1, 0x2

    .line 20
    .line 21
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3}, Ll8/v$a;->Q(JLjava/util/concurrent/TimeUnit;)Ll8/v$a;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ll8/v$a;->c()Ll8/v;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lcom/zykj/download/work/UploadFileOssWork;->fileOkHttpClient:Ll8/v;

    .line 31
    .line 32
    new-instance v1, Lc9/y$b;

    .line 33
    .line 34
    invoke-direct {v1}, Lc9/y$b;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Lc9/y$b;->g(Ll8/v;)Lc9/y$b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, Lcom/zykj/http/BaseUrlEnum;->DEFAULT:Lcom/zykj/http/BaseUrlEnum;

    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/zykj/http/BaseUrlEnum;->getUrl()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lc9/y$b;->c(Ljava/lang/String;)Lc9/y$b;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lc9/y$b;->e()Lc9/y;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-class v1, Lcom/zykj/download/api/UploadApi;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lc9/y;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "Builder()\n            .client(fileOkHttpClient)\n            .baseUrl(BaseUrlEnum.DEFAULT.url)\n            .build().create(UploadApi::class.java)"

    .line 62
    .line 63
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    check-cast v0, Lcom/zykj/download/api/UploadApi;

    .line 67
    .line 68
    sput-object v0, Lcom/zykj/download/work/UploadFileOssWork;->uploadApi:Lcom/zykj/download/api/UploadApi;

    .line 69
    .line 70
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

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
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/work/UploadFileWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileOssWork;->appContext:Landroid/content/Context;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic b(Lcom/zykj/download/work/UploadFileOssWork;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;JJ)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/download/work/UploadFileOssWork;->uploadFile$lambda-2(Lcom/zykj/download/work/UploadFileOssWork;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;JJ)V

    return-void
.end method

.method private static final uploadFile$lambda-2(Lcom/zykj/download/work/UploadFileOssWork;Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;JJ)V
    .locals 1

    .line 1
    const-string p1, "this$0"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    long-to-float p1, p2

    .line 22
    const/high16 p2, 0x42c80000    # 100.0f

    .line 23
    .line 24
    mul-float/2addr p1, p2

    .line 25
    long-to-float p2, p4

    .line 26
    div-float/2addr p1, p2

    .line 27
    float-to-int p1, p1

    .line 28
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic uploadFile$suspendImpl(Lcom/zykj/download/work/UploadFileOssWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p1, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->d:I

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
    iput v1, v0, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->d:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;-><init>(Lcom/zykj/download/work/UploadFileOssWork;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v6, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->d:I

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_1

    .line 40
    .line 41
    if-ne v1, v2, :cond_2

    .line 42
    .line 43
    :cond_1
    iget-object p0, v6, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0

    .line 59
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 68
    .line 69
    const-string v4, "ossToken"

    .line 70
    .line 71
    const/4 v5, 0x0

    .line 72
    if-eqz v1, :cond_13

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/download/OssToken;->getEndpoint()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 v1, 0x2f

    .line 82
    .line 83
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->objectName:Ljava/lang/String;

    .line 87
    .line 88
    const-string v7, "objectName"

    .line 89
    .line 90
    if-eqz v1, :cond_12

    .line 91
    .line 92
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 100
    .line 101
    if-eqz v1, :cond_11

    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/zykj/download/OssToken;->getStrategy()Lcom/zykj/download/StrategyEnum;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    sget-object v8, Lcom/zykj/download/work/UploadFileOssWork$b;->a:[I

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    aget v1, v8, v1

    .line 114
    .line 115
    const-string v8, "filePath"

    .line 116
    .line 117
    if-eq v1, v3, :cond_b

    .line 118
    .line 119
    const-string v7, "Bearer "

    .line 120
    .line 121
    const-string v9, "file"

    .line 122
    .line 123
    const-string v10, "multipart/form-data"

    .line 124
    .line 125
    if-eq v1, v2, :cond_7

    .line 126
    .line 127
    const/4 v3, 0x3

    .line 128
    if-eq v1, v3, :cond_4

    .line 129
    .line 130
    move-object v2, p1

    .line 131
    goto/16 :goto_3

    .line 132
    .line 133
    :cond_4
    new-instance v1, Ljava/io/File;

    .line 134
    .line 135
    iget-object v3, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 136
    .line 137
    if-eqz v3, :cond_6

    .line 138
    .line 139
    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    sget-object v3, Ll8/t;->e:Ll8/t$a;

    .line 143
    .line 144
    invoke-virtual {v3, v10}, Ll8/t$a;->b(Ljava/lang/String;)Ll8/t;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    new-instance v8, Lcom/zykj/download/work/UploadFileOssWork$d;

    .line 149
    .line 150
    invoke-direct {v8, p0}, Lcom/zykj/download/work/UploadFileOssWork$d;-><init>(Lcom/zykj/download/work/UploadFileOssWork;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v3, v8}, Lcom/zykj/http/progress/ProgressRequestBodyKt;->asProgressRequestBody(Ljava/io/File;Ll8/t;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    sget-object v8, Ll8/u$c;->c:Ll8/u$c$a;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v8, v9, v1, v3}, Ll8/u$c$a;->b(Ljava/lang/String;Ljava/lang/String;Ll8/x;)Ll8/u$c;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    move-object v11, v5

    .line 168
    move-object v5, v1

    .line 169
    sget-object v1, Lcom/zykj/download/work/UploadFileOssWork;->uploadApi:Lcom/zykj/download/api/UploadApi;

    .line 170
    .line 171
    iget-object p0, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 172
    .line 173
    if-eqz p0, :cond_5

    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/zykj/download/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {v7, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    iput-object p1, v6, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->a:Ljava/lang/Object;

    .line 184
    .line 185
    iput v2, v6, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->d:I

    .line 186
    .line 187
    const-string v4, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 188
    .line 189
    move-object v2, p1

    .line 190
    invoke-interface/range {v1 .. v6}, Lcom/zykj/download/api/UploadApi;->zyFs(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll8/u$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    if-ne p0, v0, :cond_8

    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v11

    .line 201
    :cond_6
    move-object v11, v5

    .line 202
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    throw v11

    .line 206
    :cond_7
    move-object v2, p1

    .line 207
    move-object v11, v5

    .line 208
    new-instance p1, Ljava/io/File;

    .line 209
    .line 210
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 211
    .line 212
    if-eqz v1, :cond_a

    .line 213
    .line 214
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    sget-object v1, Ll8/t;->e:Ll8/t$a;

    .line 218
    .line 219
    invoke-virtual {v1, v10}, Ll8/t$a;->b(Ljava/lang/String;)Ll8/t;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    new-instance v5, Lcom/zykj/download/work/UploadFileOssWork$c;

    .line 224
    .line 225
    invoke-direct {v5, p0}, Lcom/zykj/download/work/UploadFileOssWork$c;-><init>(Lcom/zykj/download/work/UploadFileOssWork;)V

    .line 226
    .line 227
    .line 228
    invoke-static {p1, v1, v5}, Lcom/zykj/http/progress/ProgressRequestBodyKt;->asProgressRequestBody(Ljava/io/File;Ll8/t;Lcom/zykj/http/listener/UploadProgressListener;)Lcom/zykj/http/progress/ProgressRequestBody;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    sget-object v5, Ll8/u$c;->c:Ll8/u$c$a;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {v5, v9, p1, v1}, Ll8/u$c$a;->b(Ljava/lang/String;Ljava/lang/String;Ll8/x;)Ll8/u$c;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    sget-object v1, Lcom/zykj/download/work/UploadFileOssWork;->uploadApi:Lcom/zykj/download/api/UploadApi;

    .line 243
    .line 244
    iget-object p0, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 245
    .line 246
    if-eqz p0, :cond_9

    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/zykj/download/OssToken;->getSecurityToken()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-static {v7, p0}, Lkotlin/jvm/internal/Intrinsics;->stringPlus(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    iput-object v2, v6, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->a:Ljava/lang/Object;

    .line 257
    .line 258
    iput v3, v6, Lcom/zykj/download/work/UploadFileOssWork$uploadFile$1;->d:I

    .line 259
    .line 260
    const-string v4, "3f4e17759c6b9c6a364211895bbb2abdc0ba62db"

    .line 261
    .line 262
    move-object v3, p0

    .line 263
    invoke-interface/range {v1 .. v6}, Lcom/zykj/download/api/UploadApi;->gridFs(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll8/u$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    if-ne p0, v0, :cond_8

    .line 268
    .line 269
    :goto_2
    return-object v0

    .line 270
    :cond_8
    :goto_3
    return-object v2

    .line 271
    :cond_9
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw v11

    .line 275
    :cond_a
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    throw v11

    .line 279
    :cond_b
    move-object v2, p1

    .line 280
    move-object v11, v5

    .line 281
    sget-object p1, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 282
    .line 283
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    const-string v1, "applicationContext"

    .line 288
    .line 289
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 293
    .line 294
    if-eqz v1, :cond_10

    .line 295
    .line 296
    invoke-virtual {p1, v0, v1}, Lcom/zykj/download/OssUtils;->getOssClient(Landroid/content/Context;Lcom/zykj/download/OssToken;)Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    new-instance v0, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;

    .line 301
    .line 302
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 303
    .line 304
    if-eqz v1, :cond_f

    .line 305
    .line 306
    invoke-virtual {v1}, Lcom/zykj/download/OssToken;->getBucket()Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    iget-object v3, p0, Lcom/zykj/download/work/UploadFileOssWork;->objectName:Ljava/lang/String;

    .line 311
    .line 312
    if-eqz v3, :cond_e

    .line 313
    .line 314
    iget-object v4, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 315
    .line 316
    if-eqz v4, :cond_d

    .line 317
    .line 318
    invoke-direct {v0, v1, v3, v4}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    new-instance v1, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;

    .line 322
    .line 323
    invoke-direct {v1}, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;-><init>()V

    .line 324
    .line 325
    .line 326
    iget-object v3, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 327
    .line 328
    if-eqz v3, :cond_c

    .line 329
    .line 330
    invoke-static {v3}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-virtual {v1, v3}, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;->setContentMD5(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;->setMetadata(Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;)V

    .line 338
    .line 339
    .line 340
    new-instance v1, Lx5/a;

    .line 341
    .line 342
    invoke-direct {v1, p0}, Lx5/a;-><init>(Lcom/zykj/download/work/UploadFileOssWork;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1}, Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;->setProgressCallback(Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    const/16 v1, 0x64

    .line 353
    .line 354
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    invoke-virtual {p0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, v0}, Lcom/alibaba/sdk/android/oss/OSSClient;->putObject(Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;)Lcom/alibaba/sdk/android/oss/model/PutObjectResult;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    new-instance p1, Ljava/lang/StringBuilder;

    .line 366
    .line 367
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 368
    .line 369
    .line 370
    const-string v0, "ETag:"

    .line 371
    .line 372
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/oss/model/PutObjectResult;->getETag()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    const-string v0, "  RequestId\uff1a"

    .line 383
    .line 384
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, Lcom/alibaba/sdk/android/oss/model/OSSResult;->getRequestId()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    sget-object p1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 399
    .line 400
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    return-object v2

    .line 404
    :cond_c
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    throw v11

    .line 408
    :cond_d
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    throw v11

    .line 412
    :cond_e
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v11

    .line 416
    :cond_f
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw v11

    .line 420
    :cond_10
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    throw v11

    .line 424
    :cond_11
    move-object v11, v5

    .line 425
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 426
    .line 427
    .line 428
    throw v11

    .line 429
    :cond_12
    move-object v11, v5

    .line 430
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    throw v11

    .line 434
    :cond_13
    move-object v11, v5

    .line 435
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    throw v11
.end method


# virtual methods
# RE I/O 读取 JSON（Gson.fromJson）。
.method public initParameter()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "oss_object_name"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    iput-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork;->objectName:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "file_path"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 28
    .line 29
    :try_start_0
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "OSS_DATA"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance v1, Lcom/google/gson/Gson;

    .line 43
    .line 44
    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    .line 45
    .line 46
    .line 47
    const-class v2, Lcom/zykj/download/OssToken;

    .line 48
    .line 49
    invoke-virtual {v1, v0, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lcom/zykj/download/OssToken;

    .line 54
    .line 55
    const-string v1, "{\n            inputData.getString(OSS_DATA)!!.let {\n                Gson().fromJson(it, OssToken::class.java)\n            }\n        }"

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/zykj/download/work/UploadFileOssWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 61
    .line 62
    new-instance v0, Ljava/io/File;

    .line 63
    .line 64
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    const-string v3, "filePath"

    .line 68
    .line 69
    if-eqz v1, :cond_2

    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_1

    .line 79
    .line 80
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 81
    .line 82
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 83
    .line 84
    new-instance v4, Ljava/io/FileNotFoundException;

    .line 85
    .line 86
    iget-object v5, p0, Lcom/zykj/download/work/UploadFileOssWork;->filePath:Ljava/lang/String;

    .line 87
    .line 88
    if-nez v5, :cond_0

    .line 89
    .line 90
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v2

    .line 94
    :cond_0
    invoke-direct {v4, v5}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v0, v1, v4}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    throw v0

    .line 101
    :cond_1
    return-void

    .line 102
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v2

    .line 106
    :catch_0
    move-exception v0

    .line 107
    new-instance v1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 108
    .line 109
    sget-object v2, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 110
    .line 111
    invoke-direct {v1, v2, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw v1

    .line 115
    :cond_3
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 116
    .line 117
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 118
    .line 119
    new-instance v2, Ljava/lang/NullPointerException;

    .line 120
    .line 121
    const-string v3, "UploadFileOssWork ->filePath is not set"

    .line 122
    .line 123
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    throw v0

    .line 130
    :cond_4
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 131
    .line 132
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 133
    .line 134
    new-instance v2, Ljava/lang/NullPointerException;

    .line 135
    .line 136
    const-string v3, "UploadFileOssWork ->objectName is not set"

    .line 137
    .line 138
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    throw v0
.end method

.method public uploadFile(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/zykj/download/work/UploadFileOssWork;->uploadFile$suspendImpl(Lcom/zykj/download/work/UploadFileOssWork;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
