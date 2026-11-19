.class public abstract Lcom/zykj/download/work/DownloadFileWork;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/DownloadFileWork$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadFileWork$a;

.field public static final DELAY_TIME:J = 0x3e8L


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final appDataBase:Lcom/zykj/download/data/AppDatabase;

.field public dir:Ljava/lang/String;

.field public downloadUrl:Ljava/lang/String;

.field public fileName:Ljava/lang/String;

.field private final progressLiveData:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public proxy:Lcom/zykj/download/work/DownloadFileWorkProxy;

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
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadFileWork$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/download/work/DownloadFileWork;->Companion:Lcom/zykj/download/work/DownloadFileWork$a;

    return-void
.end method

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
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->appContext:Landroid/content/Context;

    .line 15
    .line 16
    sget-object p2, Lcom/zykj/download/data/AppDatabase;->a:Lcom/zykj/download/data/AppDatabase$a;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Lcom/zykj/download/data/AppDatabase$a;->b(Landroid/content/Context;)Lcom/zykj/download/data/AppDatabase;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 23
    .line 24
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 25
    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 36
    .line 37
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->progressLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 48
    .line 49
    return-void
.end method

.method public static final synthetic access$downloadFileWithProgress(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final checkParam()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->downloadUrl:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->dir:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->fileName:Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 15
    .line 16
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/NullPointerException;

    .line 19
    .line 20
    const-string v3, "DownloadFileWork fileName is null"

    .line 21
    .line 22
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    throw v0

    .line 29
    :cond_1
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 30
    .line 31
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 32
    .line 33
    new-instance v2, Ljava/lang/NullPointerException;

    .line 34
    .line 35
    const-string v3, "DownloadFileWork dir is null"

    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_2
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 45
    .line 46
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NULL_POINT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 47
    .line 48
    new-instance v2, Ljava/lang/NullPointerException;

    .line 49
    .line 50
    const-string v3, "DownloadFileWork fileUrl is null"

    .line 51
    .line 52
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw v0
.end method

.method public static synthetic doWork$suspendImpl(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork;->appContext:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getAppDataBase()Lcom/zykj/download/data/AppDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;-><init>(Landroid/content/Context;Lcom/zykj/download/data/AppDatabase;Lcom/zykj/download/work/DownloadFileWork;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setProxy(Lcom/zykj/download/work/DownloadFileWorkProxy;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/zykj/download/work/DownloadFileWork;->downloadFileWithProgress(Lm7/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method private final downloadFileWithProgress(Lm7/c;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Landroidx/work/ListenableWorker$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

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
    iput v1, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    .line 32
    .line 33
    const-string v3, "success_key"

    .line 34
    .line 35
    const/4 v4, 0x5

    .line 36
    const/4 v5, 0x4

    .line 37
    const/4 v6, 0x3

    .line 38
    const/4 v7, 0x2

    .line 39
    const/4 v8, 0x1

    .line 40
    const/4 v9, 0x0

    .line 41
    const-string v10, "error_key"

    .line 42
    .line 43
    const-string v11, "dataBuilder.build()"

    .line 44
    .line 45
    const/4 v12, 0x0

    .line 46
    if-eqz v2, :cond_6

    .line 47
    .line 48
    if-eq v2, v8, :cond_5

    .line 49
    .line 50
    if-eq v2, v7, :cond_4

    .line 51
    .line 52
    if-eq v2, v6, :cond_3

    .line 53
    .line 54
    if-eq v2, v5, :cond_2

    .line 55
    .line 56
    if-ne v2, v4, :cond_1

    .line 57
    .line 58
    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ljava/io/File;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto/16 :goto_7

    .line 69
    .line 70
    :catch_0
    move-exception p1

    .line 71
    goto/16 :goto_8

    .line 72
    .line 73
    :catch_1
    move-exception p1

    .line 74
    goto/16 :goto_9

    .line 75
    .line 76
    :catch_2
    move-exception p1

    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 82
    .line 83
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_2
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v2, Ljava/io/File;

    .line 90
    .line 91
    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Lcom/zykj/download/work/DownloadFileWork;

    .line 94
    .line 95
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    .line 97
    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_3
    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/lang/String;

    .line 103
    .line 104
    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Ljava/lang/String;

    .line 111
    .line 112
    :try_start_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 113
    .line 114
    .line 115
    move-object p1, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_5
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, Ljava/io/File;

    .line 120
    .line 121
    iget-object v8, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v8, Lcom/zykj/download/work/DownloadFileWork;

    .line 124
    .line 125
    :try_start_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_6
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :try_start_5
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->initParameter()V

    .line 133
    .line 134
    .line 135
    invoke-direct {p0}, Lcom/zykj/download/work/DownloadFileWork;->checkParam()V

    .line 136
    .line 137
    .line 138
    new-instance v2, Ljava/io/File;

    .line 139
    .line 140
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDir()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getFileName()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v13

    .line 148
    invoke-direct {v2, p1, v13}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v13

    .line 159
    iput-object p0, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->b:Ljava/lang/Object;

    .line 162
    .line 163
    iput v8, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    .line 164
    .line 165
    invoke-virtual {p1, v13, v2, v0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkDownloadSuccess(Ljava/lang/String;Ljava/io/File;Lm7/c;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-ne p1, v1, :cond_7

    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_7
    move-object v8, p0

    .line 174
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 175
    .line 176
    if-eqz p1, :cond_a

    .line 177
    .line 178
    const/16 v2, 0x64

    .line 179
    .line 180
    invoke-static {v2}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 185
    .line 186
    iput-object v9, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->b:Ljava/lang/Object;

    .line 187
    .line 188
    iput v7, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    .line 189
    .line 190
    const-wide/16 v4, 0x0

    .line 191
    .line 192
    invoke-virtual {v8, v4, v5, v2, v0}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lm7/c;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-ne v2, v1, :cond_8

    .line 197
    .line 198
    goto/16 :goto_5

    .line 199
    .line 200
    :cond_8
    :goto_2
    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 201
    .line 202
    iput v6, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    .line 203
    .line 204
    const-wide/16 v4, 0x3e8

    .line 205
    .line 206
    invoke-static {v4, v5, v0}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-ne v0, v1, :cond_9

    .line 211
    .line 212
    goto/16 :goto_5

    .line 213
    .line 214
    :cond_9
    move-object v0, p1

    .line 215
    :goto_3
    invoke-static {v3, v0}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    new-instance v0, Landroidx/work/Data$Builder;

    .line 224
    .line 225
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 226
    .line 227
    .line 228
    aget-object p1, p1, v12

    .line 229
    .line 230
    invoke-virtual {p1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    check-cast v1, Ljava/lang/String;

    .line 235
    .line 236
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    invoke-static {p1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    const-string v0, "success(workDataOf(SUCCESS_KEY to localPathForSuccess))"

    .line 255
    .line 256
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    return-object p1

    .line 260
    :cond_a
    sget-object p1, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 261
    .line 262
    iget-object v6, v8, Lcom/zykj/download/work/DownloadFileWork;->appContext:Landroid/content/Context;

    .line 263
    .line 264
    invoke-virtual {p1, v6}, Lcom/zykj/download/OssUtils;->isNetworkConnected(Landroid/content/Context;)Z

    .line 265
    .line 266
    .line 267
    move-result p1

    .line 268
    if-nez p1, :cond_b

    .line 269
    .line 270
    new-instance p1, Landroidx/work/Data$Builder;

    .line 271
    .line 272
    invoke-direct {p1}, Landroidx/work/Data$Builder;-><init>()V

    .line 273
    .line 274
    .line 275
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_NO_CONNECT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 276
    .line 277
    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    invoke-virtual {p1, v10, v0}, Landroidx/work/Data$Builder;->putInt(Ljava/lang/String;I)Landroidx/work/Data$Builder;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p1}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    const-string v0, "failure(\n                    Data.Builder().putInt(\n                        ERROR_KEY,\n                        ErrorCode.NET_NO_CONNECT.errorCodeInfo.code\n                    ).build()\n                )"

    .line 298
    .line 299
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    return-object p1

    .line 303
    :cond_b
    invoke-virtual {v8}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {v8}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    iput-object v8, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 312
    .line 313
    iput-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->b:Ljava/lang/Object;

    .line 314
    .line 315
    iput v5, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    .line 316
    .line 317
    invoke-virtual {p1, v6, v2, v0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->checkRecord(Ljava/lang/String;Ljava/io/File;Lm7/c;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object p1

    .line 321
    if-ne p1, v1, :cond_c

    .line 322
    .line 323
    goto :goto_5

    .line 324
    :cond_c
    move-object v5, v8

    .line 325
    :goto_4
    check-cast p1, Lcom/zykj/download/data/DownloadEntity;

    .line 326
    .line 327
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    new-instance v7, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1;

    .line 332
    .line 333
    invoke-direct {v7, v5, p1, v9}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lcom/zykj/download/data/DownloadEntity;Lm7/c;)V

    .line 334
    .line 335
    .line 336
    iput-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->a:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v9, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->b:Ljava/lang/Object;

    .line 339
    .line 340
    iput v4, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$1;->e:I

    .line 341
    .line 342
    invoke-static {v6, v7, v0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    if-ne p1, v1, :cond_d

    .line 347
    .line 348
    :goto_5
    return-object v1

    .line 349
    :cond_d
    move-object v0, v2

    .line 350
    :goto_6
    check-cast p1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 351
    .line 352
    if-eqz p1, :cond_e

    .line 353
    .line 354
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-static {v10, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    new-instance v0, Landroidx/work/Data$Builder;

    .line 375
    .line 376
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 377
    .line 378
    .line 379
    aget-object p1, p1, v12

    .line 380
    .line 381
    invoke-virtual {p1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, Ljava/lang/String;

    .line 386
    .line 387
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-static {p1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    const-string v0, "failure(workDataOf(ERROR_KEY to error.errorCodeInfo.code))"

    .line 406
    .line 407
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    return-object p1

    .line 411
    :cond_e
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p1

    .line 415
    invoke-static {v3, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 420
    .line 421
    .line 422
    move-result-object p1

    .line 423
    new-instance v0, Landroidx/work/Data$Builder;

    .line 424
    .line 425
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 426
    .line 427
    .line 428
    aget-object p1, p1, v12

    .line 429
    .line 430
    invoke-virtual {p1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    check-cast v1, Ljava/lang/String;

    .line 435
    .line 436
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    invoke-static {p1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->success(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 451
    .line 452
    .line 453
    move-result-object p1

    .line 454
    const-string v0, "success(workDataOf(SUCCESS_KEY to file.absolutePath))"

    .line 455
    .line 456
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_5
    .catch Lcom/alibaba/sdk/android/oss/ClientException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Lcom/alibaba/sdk/android/oss/ServiceException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Lcom/zykj/http/exception/RemoteCodeException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 457
    .line 458
    .line 459
    return-object p1

    .line 460
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 461
    .line 462
    .line 463
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 464
    .line 465
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object p1

    .line 477
    invoke-static {v10, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    new-instance v0, Landroidx/work/Data$Builder;

    .line 486
    .line 487
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 488
    .line 489
    .line 490
    aget-object p1, p1, v12

    .line 491
    .line 492
    invoke-virtual {p1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    check-cast v1, Ljava/lang/String;

    .line 497
    .line 498
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object p1

    .line 502
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 503
    .line 504
    .line 505
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-static {p1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.DEFAULT_ERROR.errorCodeInfo.code))"

    .line 517
    .line 518
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    return-object p1

    .line 522
    :goto_8
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 523
    .line 524
    .line 525
    invoke-virtual {p1}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 530
    .line 531
    .line 532
    move-result p1

    .line 533
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    invoke-static {v10, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 542
    .line 543
    .line 544
    move-result-object p1

    .line 545
    new-instance v0, Landroidx/work/Data$Builder;

    .line 546
    .line 547
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 548
    .line 549
    .line 550
    aget-object p1, p1, v12

    .line 551
    .line 552
    invoke-virtual {p1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    check-cast v1, Ljava/lang/String;

    .line 557
    .line 558
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p1

    .line 562
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    invoke-static {p1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 570
    .line 571
    .line 572
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 573
    .line 574
    .line 575
    move-result-object p1

    .line 576
    const-string v0, "failure(workDataOf(ERROR_KEY to e.errorCodeInfo.code))"

    .line 577
    .line 578
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    return-object p1

    .line 582
    :goto_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 583
    .line 584
    .line 585
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/oss/ServiceException;->getStatusCode()I

    .line 586
    .line 587
    .line 588
    move-result p1

    .line 589
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    invoke-static {v10, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 594
    .line 595
    .line 596
    move-result-object p1

    .line 597
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 598
    .line 599
    .line 600
    move-result-object p1

    .line 601
    new-instance v0, Landroidx/work/Data$Builder;

    .line 602
    .line 603
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 604
    .line 605
    .line 606
    aget-object p1, p1, v12

    .line 607
    .line 608
    invoke-virtual {p1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    check-cast v1, Ljava/lang/String;

    .line 613
    .line 614
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object p1

    .line 618
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 622
    .line 623
    .line 624
    move-result-object p1

    .line 625
    invoke-static {p1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 629
    .line 630
    .line 631
    move-result-object p1

    .line 632
    const-string v0, "failure(workDataOf(ERROR_KEY to e.statusCode))"

    .line 633
    .line 634
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    return-object p1

    .line 638
    :goto_a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 639
    .line 640
    .line 641
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCode;->OSS_CLIENT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 642
    .line 643
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 648
    .line 649
    .line 650
    move-result p1

    .line 651
    invoke-static {p1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 652
    .line 653
    .line 654
    move-result-object p1

    .line 655
    invoke-static {v10, p1}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 656
    .line 657
    .line 658
    move-result-object p1

    .line 659
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 660
    .line 661
    .line 662
    move-result-object p1

    .line 663
    new-instance v0, Landroidx/work/Data$Builder;

    .line 664
    .line 665
    invoke-direct {v0}, Landroidx/work/Data$Builder;-><init>()V

    .line 666
    .line 667
    .line 668
    aget-object p1, p1, v12

    .line 669
    .line 670
    invoke-virtual {p1}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    check-cast v1, Ljava/lang/String;

    .line 675
    .line 676
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object p1

    .line 680
    invoke-virtual {v0, v1, p1}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 684
    .line 685
    .line 686
    move-result-object p1

    .line 687
    invoke-static {p1, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    invoke-static {p1}, Landroidx/work/ListenableWorker$Result;->failure(Landroidx/work/Data;)Landroidx/work/ListenableWorker$Result;

    .line 691
    .line 692
    .line 693
    move-result-object p1

    .line 694
    const-string v0, "failure(workDataOf(ERROR_KEY to ErrorCode.OSS_CLIENT_ERROR.errorCodeInfo.code))"

    .line 695
    .line 696
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    return-object p1
.end method

.method public static synthetic notifyProgress$default(Lcom/zykj/download/work/DownloadFileWork;JLjava/lang/Integer;Lm7/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    if-nez p6, :cond_1

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lm7/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string p1, "Super calls with default arguments not supported in this target, function: notifyProgress"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method


# virtual methods
.method public doWork(Lm7/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm7/c<",
            "-",
            "Landroidx/work/ListenableWorker$Result;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/download/work/DownloadFileWork;->doWork$suspendImpl(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public abstract downloadFile(Lcom/zykj/download/data/DownloadEntity;Lm7/c;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/download/data/DownloadEntity;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public final getAppDataBase()Lcom/zykj/download/data/AppDatabase;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->appDataBase:Lcom/zykj/download/data/AppDatabase;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDir()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->dir:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "dir"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getDownloadUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->downloadUrl:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "downloadUrl"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public final getFileName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "fileName"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
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
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->progressLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->proxy:Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "proxy"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
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
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork;->receiverLengthLiveData:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract initParameter()V
.end method

.method public final notifyProgress(JLjava/lang/Integer;Lm7/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/Integer;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->e:I

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
    iput v1, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->e:I

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
    iget-wide p1, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->b:J

    .line 39
    .line 40
    iget-object p3, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->a:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p3, Lcom/zykj/download/work/DownloadFileWork;

    .line 43
    .line 44
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    invoke-virtual {p4, p3}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const-string p4, "speed"

    .line 67
    .line 68
    invoke-static {p1, p2}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {p4, v2}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    const-string v2, "progress"

    .line 77
    .line 78
    invoke-static {v2, p3}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    filled-new-array {p4, p3}, [Lkotlin/Pair;

    .line 83
    .line 84
    .line 85
    move-result-object p3

    .line 86
    new-instance p4, Landroidx/work/Data$Builder;

    .line 87
    .line 88
    invoke-direct {p4}, Landroidx/work/Data$Builder;-><init>()V

    .line 89
    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    :goto_1
    const/4 v4, 0x2

    .line 93
    if-ge v2, v4, :cond_3

    .line 94
    .line 95
    aget-object v4, p3, v2

    .line 96
    .line 97
    invoke-virtual {v4}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    check-cast v5, Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v4}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {p4, v5, v4}, Landroidx/work/Data$Builder;->put(Ljava/lang/String;Ljava/lang/Object;)Landroidx/work/Data$Builder;

    .line 108
    .line 109
    .line 110
    add-int/lit8 v2, v2, 0x1

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    invoke-virtual {p4}, Landroidx/work/Data$Builder;->build()Landroidx/work/Data;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    const-string p4, "dataBuilder.build()"

    .line 118
    .line 119
    invoke-static {p3, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    iput-object p0, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->a:Ljava/lang/Object;

    .line 123
    .line 124
    iput-wide p1, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->b:J

    .line 125
    .line 126
    iput v3, v0, Lcom/zykj/download/work/DownloadFileWork$notifyProgress$1;->e:I

    .line 127
    .line 128
    invoke-virtual {p0, p3, v0}, Landroidx/work/CoroutineWorker;->setProgress(Landroidx/work/Data;Lm7/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    if-ne p3, v1, :cond_4

    .line 133
    .line 134
    return-object v1

    .line 135
    :cond_4
    move-object p3, p0

    .line 136
    :goto_2
    new-instance p4, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v0, "speed="

    .line 142
    .line 143
    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string p1, ", progress="

    .line 150
    .line 151
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p3}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const/16 p1, 0x20

    .line 166
    .line 167
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 175
    .line 176
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 180
    .line 181
    return-object p1
.end method

.method public final sendSpeedAndProgress(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li8/b0;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->f:I

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
    iput v1, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 44
    .line 45
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Li8/b0;

    .line 48
    .line 49
    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Lcom/zykj/download/work/DownloadFileWork;

    .line 52
    .line 53
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    move-object p2, p1

    .line 57
    move-object p1, v2

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    iget-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 70
    .line 71
    iget-object v2, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Li8/b0;

    .line 74
    .line 75
    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v5, Lcom/zykj/download/work/DownloadFileWork;

    .line 78
    .line 79
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    new-instance p2, Lkotlin/jvm/internal/Ref$LongRef;

    .line 87
    .line 88
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 89
    .line 90
    .line 91
    move-object v5, p0

    .line 92
    :cond_4
    :goto_1
    invoke-static {p1}, Lkotlinx/coroutines/e;->g(Li8/b0;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-eqz v2, :cond_8

    .line 97
    .line 98
    invoke-virtual {v5}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/Long;

    .line 107
    .line 108
    if-nez v2, :cond_5

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_5
    iget-wide v6, p2, Lkotlin/jvm/internal/Ref$LongRef;->a:J

    .line 112
    .line 113
    const-wide/16 v8, 0x0

    .line 114
    .line 115
    cmp-long v6, v6, v8

    .line 116
    .line 117
    if-nez v6, :cond_6

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v6

    .line 124
    iget-wide v8, p2, Lkotlin/jvm/internal/Ref$LongRef;->a:J

    .line 125
    .line 126
    sub-long/2addr v6, v8

    .line 127
    sget-object v8, Lcom/zykj/download/work/DownloadFileWorkProxy;->Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    .line 128
    .line 129
    invoke-virtual {v8}, Lcom/zykj/download/work/DownloadFileWorkProxy$a;->a()J

    .line 130
    .line 131
    .line 132
    move-result-wide v8

    .line 133
    div-long v8, v6, v8

    .line 134
    .line 135
    :goto_2
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide v6

    .line 139
    iput-wide v6, p2, Lkotlin/jvm/internal/Ref$LongRef;->a:J

    .line 140
    .line 141
    invoke-virtual {v5}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    check-cast v2, Ljava/lang/Integer;

    .line 150
    .line 151
    iput-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->a:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->b:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object p2, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 156
    .line 157
    iput v4, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->f:I

    .line 158
    .line 159
    invoke-virtual {v5, v8, v9, v2, v0}, Lcom/zykj/download/work/DownloadFileWork;->notifyProgress(JLjava/lang/Integer;Lm7/c;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-ne v2, v1, :cond_7

    .line 164
    .line 165
    goto :goto_5

    .line 166
    :cond_7
    move-object v2, p1

    .line 167
    move-object p1, p2

    .line 168
    :goto_3
    move-object p2, p1

    .line 169
    move-object p1, v2

    .line 170
    :goto_4
    sget-object v2, Lcom/zykj/download/work/DownloadFileWorkProxy;->Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    .line 171
    .line 172
    invoke-virtual {v2}, Lcom/zykj/download/work/DownloadFileWorkProxy$a;->a()J

    .line 173
    .line 174
    .line 175
    move-result-wide v6

    .line 176
    iput-object v5, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->a:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->b:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object p2, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->c:Ljava/lang/Object;

    .line 181
    .line 182
    iput v3, v0, Lcom/zykj/download/work/DownloadFileWork$sendSpeedAndProgress$1;->f:I

    .line 183
    .line 184
    invoke-static {v6, v7, v0}, Lkotlinx/coroutines/DelayKt;->b(JLm7/c;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    if-ne v2, v1, :cond_4

    .line 189
    .line 190
    :goto_5
    return-object v1

    .line 191
    :cond_8
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 192
    .line 193
    return-object p1
.end method

.method public final setDir(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->dir:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setDownloadUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->downloadUrl:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setFileName(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->fileName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final setProxy(Lcom/zykj/download/work/DownloadFileWorkProxy;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork;->proxy:Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 7
    .line 8
    return-void
.end method
