# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public final Lcom/zykj/download/work/DownloadOssFileWork;
.super Lcom/zykj/download/work/DownloadFileCommonWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/DownloadOssFileWork$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/download/work/DownloadOssFileWork;",
        "Lcom/zykj/download/work/DownloadFileCommonWork;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "",
        "initParameter",
        "()V",
        "Lw5/b;",
        "entity",
        "downloadFile",
        "(Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/zykj/download/OssToken;",
        "ossToken",
        "Lcom/zykj/download/OssToken;",
        "getOssToken",
        "()Lcom/zykj/download/OssToken;",
        "setOssToken",
        "(Lcom/zykj/download/OssToken;)V",
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
.field public static final Companion:Lcom/zykj/download/work/DownloadOssFileWork$a;


# instance fields
.field public ossToken:Lcom/zykj/download/OssToken;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/work/DownloadOssFileWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadOssFileWork$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/download/work/DownloadOssFileWork;->Companion:Lcom/zykj/download/work/DownloadOssFileWork$a;

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
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileCommonWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public downloadFile(Lw5/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw5/b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;,
            Ljava/lang/SecurityException;,
            Lcom/alibaba/sdk/android/oss/ClientException;,
            Lcom/alibaba/sdk/android/oss/ServiceException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "applicationContext"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadOssFileWork;->getOssToken()Lcom/zykj/download/OssToken;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->getOssClient(Landroid/content/Context;Lcom/zykj/download/OssToken;)Lcom/alibaba/sdk/android/oss/OSSClient;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadOssFileWork;->getOssToken()Lcom/zykj/download/OssToken;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/zykj/download/OssToken;->getBucket()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadOssFileWork;->getOssToken()Lcom/zykj/download/OssToken;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v0, v4, v5}, Lcom/zykj/download/OssUtils;->getObjectKey(Lcom/zykj/download/OssToken;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v2, v3, v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lcom/alibaba/sdk/android/oss/model/OSSRequest$CRC64Config;->YES:Lcom/alibaba/sdk/android/oss/model/OSSRequest$CRC64Config;

    .line 46
    .line 47
    invoke-virtual {v2, v0}, Lcom/alibaba/sdk/android/oss/model/OSSRequest;->setCRC64(Ljava/lang/Enum;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Lcom/alibaba/sdk/android/oss/OSSClient;->getObject(Lcom/alibaba/sdk/android/oss/model/GetObjectRequest;)Lcom/alibaba/sdk/android/oss/model/GetObjectResult;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getContentLength()J

    .line 55
    .line 56
    .line 57
    move-result-wide v1

    .line 58
    const/16 v3, 0x800

    .line 59
    .line 60
    new-array v3, v3, [B

    .line 61
    .line 62
    new-instance v4, Ljava/io/FileOutputStream;

    .line 63
    .line 64
    invoke-virtual {p1}, Lw5/b;->g()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-direct {v4, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :try_start_0
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getObjectContent()Ljava/io/InputStream;

    .line 72
    .line 73
    .line 74
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 75
    const-wide/16 v6, 0x0

    .line 76
    .line 77
    :goto_0
    :try_start_1
    invoke-virtual {v5, v3}, Ljava/io/InputStream;->read([B)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v8

    .line 85
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    sget-object v10, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    const/4 v10, -0x1

    .line 96
    if-eq v10, v8, :cond_0

    .line 97
    .line 98
    const/4 v8, 0x0

    .line 99
    invoke-virtual {v4, v3, v8, v9}, Ljava/io/FileOutputStream;->write([BII)V

    .line 100
    .line 101
    .line 102
    int-to-long v8, v9

    .line 103
    add-long/2addr v6, v8

    .line 104
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-static {v6, v7}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-virtual {v8, v9}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    long-to-float v9, v6

    .line 120
    const/high16 v10, 0x42c80000    # 100.0f

    .line 121
    .line 122
    mul-float/2addr v9, v10

    .line 123
    long-to-float v10, v1

    .line 124
    div-float/2addr v9, v10

    .line 125
    float-to-int v9, v9

    .line 126
    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    invoke-virtual {v8, v9}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :catchall_0
    move-exception p1

    .line 135
    goto :goto_1

    .line 136
    :cond_0
    const/4 v3, 0x0

    .line 137
    :try_start_2
    invoke-static {v5, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    .line 139
    .line 140
    invoke-static {v4, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lw5/b;->g()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v3}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v3

    .line 151
    new-instance v4, Ljava/io/File;

    .line 152
    .line 153
    invoke-virtual {p1}, Lw5/b;->g()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v1, v2, v4}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkContentLength(JLjava/io/File;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/GetObjectResult;->getMetadata()Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Lcom/alibaba/sdk/android/oss/model/ObjectMetadata;->getContentMD5()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    const-string v1, "result.metadata.contentMD5"

    .line 172
    .line 173
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    const-string v1, "it"

    .line 177
    .line 178
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Lw5/b;->g()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {p0, v0, v3, v1}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0, p1, v3, p2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateVerifyCode(Lw5/b;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    if-ne p1, p2, :cond_1

    .line 201
    .line 202
    return-object p1

    .line 203
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p1

    .line 206
    :catchall_1
    move-exception p1

    .line 207
    goto :goto_2

    .line 208
    :goto_1
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 209
    :catchall_2
    move-exception p2

    .line 210
    :try_start_4
    invoke-static {v5, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 211
    .line 212
    .line 213
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 214
    :goto_2
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 215
    :catchall_3
    move-exception p2

    .line 216
    invoke-static {v4, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    throw p2
.end method

.method public final getOssToken()Lcom/zykj/download/OssToken;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadOssFileWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "ossToken"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public initParameter()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/zykj/download/work/DownloadFileCommonWork;->initParameter()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "inputData"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/zykj/download/OssUtils;->getOssToken(Landroidx/work/Data;)Lcom/zykj/download/OssToken;

    .line 16
    .line 17
    .line 18
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadOssFileWork;->setOssToken(Lcom/zykj/download/OssToken;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception v0

    .line 24
    new-instance v1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 25
    .line 26
    sget-object v2, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw v1
.end method

.method public final setOssToken(Lcom/zykj/download/OssToken;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/download/work/DownloadOssFileWork;->ossToken:Lcom/zykj/download/OssToken;

    .line 7
    .line 8
    return-void
.end method
