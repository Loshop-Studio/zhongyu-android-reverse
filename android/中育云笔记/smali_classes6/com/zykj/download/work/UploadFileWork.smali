.class public abstract Lcom/zykj/download/work/UploadFileWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final progressLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final receiverLengthLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 2

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerParams"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork;->appContext:Landroid/content/Context;

    .line 15
    .line 16
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 30
    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lcom/zykj/download/work/UploadFileWork;->progressLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 40
    .line 41
    return-void
.end method

.method public static final synthetic access$uploadFileWithProgress(Lcom/zykj/download/work/UploadFileWork;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/download/work/UploadFileWork;->uploadFileWithProgress(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic doWork$suspendImpl(Lcom/zykj/download/work/UploadFileWork;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/download/work/UploadFileWork;->appContext:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/download/OssUtils;->isNetworkConnected(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    invoke-static {p0}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string p1, "error_key"

    .line 26
    .line 27
    invoke-static {p1, p0}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    filled-new-array {p0}, [Lkotlin/Pair;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance p1, Landroidx/work/Data$Builder;

    .line 36
    .line 37
    invoke-direct {p1}, Landroidx/work/Data$Builder;-><init>()V

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    aget-object p0, p0, v0

    .line 42
    .line 43
    invoke-virtual {p0}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p0}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p1, v0, p0}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-string p1, "dataBuilder.build()"

    .line 61
    .line 62
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string p1, "failure(workDataOf(ERROR_KEY to ErrorCode.NET_NO_CONNECT.errorCodeInfo.code))"

    .line 70
    .line 71
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/download/work/UploadFileWork;->uploadFileWithProgress(Lvc/c;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    return-object p0
.end method

.method private final uploadFileWithProgress(Lvc/c;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Landroidx/work/ListenableWorker$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->f:I

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
    iput v1, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;-><init>(Lcom/zykj/download/work/UploadFileWork;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const-string v4, "error_key"

    .line 35
    .line 36
    const-string v5, "dataBuilder.build()"

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_2

    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :catch_1
    move-exception p1

    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :catch_2
    move-exception p1

    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :catch_3
    move-exception p1

    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 68
    .line 69
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw p1

    .line 73
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :try_start_1
    invoke-virtual {p0}, Lcom/zykj/download/work/UploadFileWork;->initParameter()V

    .line 77
    .line 78
    .line 79
    new-instance p1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 80
    .line 81
    invoke-direct {p1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v7, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;

    .line 89
    .line 90
    const/4 v8, 0x0

    .line 91
    invoke-direct {v7, p0, p1, v8}, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$2;-><init>(Lcom/zykj/download/work/UploadFileWork;Lkotlin/jvm/internal/Ref$ObjectRef;Lvc/c;)V

    .line 92
    .line 93
    .line 94
    iput-object p1, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    iput v3, v0, Lcom/zykj/download/work/UploadFileWork$uploadFileWithProgress$1;->f:I

    .line 97
    .line 98
    invoke-static {v2, v7, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    if-ne v0, v1, :cond_3

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    move-object v0, p1

    .line 106
    :goto_1
    const-string p1, "success_key"

    .line 107
    .line 108
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {p1, v0}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance v0, Landroidx/work/Data$Builder;

    .line 119
    .line 120
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 121
    .line 122
    .line 123
    aget-object p1, p1, v6

    .line 124
    .line 125
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    check-cast v1, Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    const-string v0, "success(workDataOf(SUCCESS_KEY to successResult))"

    .line 150
    .line 151
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 152
    .line 153
    .line 154
    return-object p1

    .line 155
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 156
    .line 157
    .line 158
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 159
    .line 160
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {v4, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    new-instance v0, Landroidx/work/Data$Builder;

    .line 181
    .line 182
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 183
    .line 184
    .line 185
    aget-object p1, p1, v6

    .line 186
    .line 187
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Ljava/lang/String;

    .line 192
    .line 193
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.DEFAULT_ERROR.errorCodeInfo.code))"

    .line 212
    .line 213
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-object p1

    .line 217
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 218
    .line 219
    .line 220
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 221
    .line 222
    invoke-static {v4, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    new-instance v0, Landroidx/work/Data$Builder;

    .line 231
    .line 232
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 233
    .line 234
    .line 235
    aget-object p1, p1, v6

    .line 236
    .line 237
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.NULL_POINT))"

    .line 262
    .line 263
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    return-object p1

    .line 267
    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    instance-of v0, v0, Ljava/io/FileNotFoundException;

    .line 275
    .line 276
    if-eqz v0, :cond_4

    .line 277
    .line 278
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_FILE_NOT_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 279
    .line 280
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    invoke-static {v4, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 293
    .line 294
    .line 295
    move-result-object p1

    .line 296
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    new-instance v0, Landroidx/work/Data$Builder;

    .line 301
    .line 302
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 303
    .line 304
    .line 305
    aget-object p1, p1, v6

    .line 306
    .line 307
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Ljava/lang/String;

    .line 312
    .line 313
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 328
    .line 329
    .line 330
    move-result-object p1

    .line 331
    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_FILE_NOT_FOUND.errorCodeInfo.code))"

    .line 332
    .line 333
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    goto :goto_5

    .line 337
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-static {v4, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    new-instance v0, Landroidx/work/Data$Builder;

    .line 358
    .line 359
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 360
    .line 361
    .line 362
    aget-object p1, p1, v6

    .line 363
    .line 364
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, Ljava/lang/String;

    .line 369
    .line 370
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 385
    .line 386
    .line 387
    move-result-object p1

    .line 388
    const-string v0, "failure(workDataOf(ERROR_KEY to e.errorCodeInfo.code))"

    .line 389
    .line 390
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    :goto_5
    return-object p1

    .line 394
    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 395
    .line 396
    .line 397
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getStatusCode()I

    .line 398
    .line 399
    .line 400
    move-result p1

    .line 401
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-static {v4, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 410
    .line 411
    .line 412
    move-result-object p1

    .line 413
    new-instance v0, Landroidx/work/Data$Builder;

    .line 414
    .line 415
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 416
    .line 417
    .line 418
    aget-object p1, p1, v6

    .line 419
    .line 420
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, Ljava/lang/String;

    .line 425
    .line 426
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 441
    .line 442
    .line 443
    move-result-object p1

    .line 444
    const-string v0, "failure(workDataOf(ERROR_KEY to e.statusCode))"

    .line 445
    .line 446
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    return-object p1

    .line 450
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 451
    .line 452
    .line 453
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    .line 458
    .line 459
    if-eqz p1, :cond_5

    .line 460
    .line 461
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 462
    .line 463
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 468
    .line 469
    .line 470
    move-result p1

    .line 471
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    invoke-static {v4, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 480
    .line 481
    .line 482
    move-result-object p1

    .line 483
    new-instance v0, Landroidx/work/Data$Builder;

    .line 484
    .line 485
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 486
    .line 487
    .line 488
    aget-object p1, p1, v6

    .line 489
    .line 490
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    check-cast v1, Ljava/lang/String;

    .line 495
    .line 496
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object p1

    .line 500
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 511
    .line 512
    .line 513
    move-result-object p1

    .line 514
    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_SOCKET_TIME_OUT.errorCodeInfo.code))"

    .line 515
    .line 516
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 517
    .line 518
    .line 519
    goto :goto_8

    .line 520
    :cond_5
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 521
    .line 522
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 527
    .line 528
    .line 529
    move-result p1

    .line 530
    invoke-static {p1}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    invoke-static {v4, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 535
    .line 536
    .line 537
    move-result-object p1

    .line 538
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 539
    .line 540
    .line 541
    move-result-object p1

    .line 542
    new-instance v0, Landroidx/work/Data$Builder;

    .line 543
    .line 544
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 545
    .line 546
    .line 547
    aget-object p1, p1, v6

    .line 548
    .line 549
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    check-cast v1, Ljava/lang/String;

    .line 554
    .line 555
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object p1

    .line 559
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 563
    .line 564
    .line 565
    move-result-object p1

    .line 566
    invoke-static {p1, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 570
    .line 571
    .line 572
    move-result-object p1

    .line 573
    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_ERROR.errorCodeInfo.code))"

    .line 574
    .line 575
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    :goto_8
    return-object p1
.end method


# virtual methods
.method public doWork(Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Landroidx/work/ListenableWorker$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/download/work/UploadFileWork;->doWork$suspendImpl(Lcom/zykj/download/work/UploadFileWork;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getProgressLiveData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork;->progressLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/UploadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract initParameter()V
.end method

.method public final sendSpeedAndProgress(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/i0;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->j:I

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
    iput v1, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;-><init>(Lcom/zykj/download/work/UploadFileWork;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->j:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x2

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v3, :cond_3

    .line 38
    .line 39
    if-ne v2, v4, :cond_2

    .line 40
    .line 41
    iget-object p1, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 44
    .line 45
    iget-object v2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lsd/i0;

    .line 48
    .line 49
    iget-object v5, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Lcom/zykj/download/work/UploadFileWork;

    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object v8, v2

    .line 57
    move-object v2, p1

    .line 58
    move-object p1, v8

    .line 59
    :cond_1
    move-object v8, v5

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_3
    iget-wide v5, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->g:J

    .line 70
    .line 71
    iget-object p1, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->f:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Ljava/lang/Long;

    .line 74
    .line 75
    iget-object v2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 78
    .line 79
    iget-object v7, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->d:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v7, Lsd/i0;

    .line 82
    .line 83
    iget-object v8, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v8, Lcom/zykj/download/work/UploadFileWork;

    .line 86
    .line 87
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    goto/16 :goto_4

    .line 91
    .line 92
    :cond_4
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance p2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 96
    .line 97
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 98
    .line 99
    .line 100
    move-object v8, p0

    .line 101
    move-object v2, p2

    .line 102
    :goto_1
    invoke-static {p1}, Lkotlinx/coroutines/d;->f(Lsd/i0;)Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    if-eqz p2, :cond_8

    .line 107
    .line 108
    invoke-virtual {v8}, Lcom/zykj/download/work/UploadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Ljava/lang/Long;

    .line 117
    .line 118
    if-nez p2, :cond_5

    .line 119
    .line 120
    :goto_2
    move-object v5, v8

    .line 121
    goto/16 :goto_5

    .line 122
    .line 123
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 124
    .line 125
    .line 126
    move-result-wide v5

    .line 127
    iget-wide v9, v2, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 128
    .line 129
    sub-long/2addr v5, v9

    .line 130
    int-to-long v9, v4

    .line 131
    mul-long/2addr v5, v9

    .line 132
    const/16 v7, 0x400

    .line 133
    .line 134
    int-to-long v9, v7

    .line 135
    div-long/2addr v5, v9

    .line 136
    const-string v7, "speed"

    .line 137
    .line 138
    invoke-static {v5, v6}, Lxc/a;->d(J)Ljava/lang/Long;

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-static {v7, v9}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 143
    .line 144
    .line 145
    move-result-object v7

    .line 146
    invoke-virtual {v8}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 147
    .line 148
    .line 149
    move-result-object v9

    .line 150
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    const-string v10, "progress"

    .line 155
    .line 156
    invoke-static {v10, v9}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    filled-new-array {v7, v9}, [Lkotlin/Pair;

    .line 161
    .line 162
    .line 163
    move-result-object v7

    .line 164
    new-instance v9, Landroidx/work/Data$Builder;

    .line 165
    .line 166
    invoke-direct {v9}, Landroidx/work/Data$Builder;-><init>()V

    .line 167
    .line 168
    .line 169
    const/4 v10, 0x0

    .line 170
    :goto_3
    if-ge v10, v4, :cond_6

    .line 171
    .line 172
    aget-object v11, v7, v10

    .line 173
    .line 174
    invoke-virtual {v11}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v12

    .line 178
    check-cast v12, Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {v11}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v11

    .line 184
    invoke-virtual {v9, v12, v11}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 185
    .line 186
    .line 187
    add-int/lit8 v10, v10, 0x1

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    invoke-virtual {v9}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    const-string v9, "dataBuilder.build()"

    .line 195
    .line 196
    invoke-static {v7, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    iput-object v8, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object p1, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->d:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->e:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object p2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->f:Ljava/lang/Object;

    .line 206
    .line 207
    iput-wide v5, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->g:J

    .line 208
    .line 209
    iput v3, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->j:I

    .line 210
    .line 211
    invoke-virtual {v8, v7, v0}, Landroidx/work/CoroutineWorker;->setProgress(Landroidx/work/Data;Lvc/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    if-ne v7, v1, :cond_7

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_7
    move-object v7, p1

    .line 219
    move-object p1, p2

    .line 220
    :goto_4
    const-string p2, "it"

    .line 221
    .line 222
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 226
    .line 227
    .line 228
    move-result-wide p1

    .line 229
    iput-wide p1, v2, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 230
    .line 231
    new-instance p1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string p2, "speed="

    .line 237
    .line 238
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    const-string p2, ", progress="

    .line 245
    .line 246
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8}, Lcom/zykj/download/work/UploadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p2

    .line 257
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    const/16 p2, 0x20

    .line 261
    .line 262
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 263
    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 270
    .line 271
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    move-object p1, v7

    .line 275
    goto/16 :goto_2

    .line 276
    .line 277
    :goto_5
    iput-object v5, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 278
    .line 279
    iput-object p1, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->d:Ljava/lang/Object;

    .line 280
    .line 281
    iput-object v2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->e:Ljava/lang/Object;

    .line 282
    .line 283
    const/4 p2, 0x0

    .line 284
    iput-object p2, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->f:Ljava/lang/Object;

    .line 285
    .line 286
    iput v4, v0, Lcom/zykj/download/work/UploadFileWork$sendSpeedAndProgress$1;->j:I

    .line 287
    .line 288
    const-wide/16 v6, 0x1f4

    .line 289
    .line 290
    invoke-static {v6, v7, v0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p2

    .line 294
    if-ne p2, v1, :cond_1

    .line 295
    .line 296
    :goto_6
    return-object v1

    .line 297
    :cond_8
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 298
    .line 299
    return-object p1
.end method

.method public abstract uploadFile(Lvc/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
