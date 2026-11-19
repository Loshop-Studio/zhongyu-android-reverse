.class public Lcom/tencent/liteav/network/TXCStreamDownloader;
.super Lcom/tencent/liteav/basic/module/a;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/b/b;
.implements Lcom/tencent/liteav/network/TXIStreamDownloader$a;
.implements Lcom/tencent/liteav/network/d$a;
.implements Lcom/tencent/liteav/network/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/network/TXCStreamDownloader$a;,
        Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "TXCStreamDownloader"


# instance fields
.field private mAccUrlFetcher:Lcom/tencent/liteav/network/k;

.field private mApplicationContext:Landroid/content/Context;

.field private mChannelType:I

.field private mCurrentNalTs:J

.field private mDownloadFormat:I

.field private mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

.field private mDownloaderRunning:Z

.field private mEnableMessage:Z

.field private mEnableMetaData:Z

.field private mEnableNearestIP:Z

.field private mFlvSessionKey:Ljava/lang/String;

.field private mHandler:Landroid/os/Handler;

.field protected mHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mLastDownloadStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

.field private mLastIFramelTs:J

.field private mLastTimeStamp:J

.field private mListener:Lcom/tencent/liteav/network/h;

.field private mListenerLock:[B

.field private mNotifyListener:Lcom/tencent/liteav/basic/b/b;

.field private mOriginPlayUrl:Ljava/lang/String;

.field private mRecvFirstNal:Z

.field private mReportNetStatusRunnalbe:Ljava/lang/Runnable;

.field private mStreamSwitcher:Lcom/tencent/liteav/network/d;

.field private mSwitchStartTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->f()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/basic/module/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListener:Lcom/tencent/liteav/network/h;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    new-array v2, v1, [B

    .line 11
    .line 12
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mNotifyListener:Lcom/tencent/liteav/basic/b/b;

    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloaderRunning:Z

    .line 17
    .line 18
    const-string v2, ""

    .line 19
    .line 20
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mOriginPlayUrl:Ljava/lang/String;

    .line 21
    .line 22
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableNearestIP:Z

    .line 23
    .line 24
    iput v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mChannelType:I

    .line 25
    .line 26
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableMessage:Z

    .line 27
    .line 28
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableMetaData:Z

    .line 29
    .line 30
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mFlvSessionKey:Ljava/lang/String;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    iput v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloadFormat:I

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 36
    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    iput-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastTimeStamp:J

    .line 40
    .line 41
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastDownloadStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 42
    .line 43
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mRecvFirstNal:Z

    .line 44
    .line 45
    iput-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mSwitchStartTime:J

    .line 46
    .line 47
    iput-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mCurrentNalTs:J

    .line 48
    .line 49
    iput-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastIFramelTs:J

    .line 50
    .line 51
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 52
    .line 53
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamDownloader$3;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lcom/tencent/liteav/network/TXCStreamDownloader$3;-><init>(Lcom/tencent/liteav/network/TXCStreamDownloader;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mReportNetStatusRunnalbe:Ljava/lang/Runnable;

    .line 59
    .line 60
    if-nez p2, :cond_0

    .line 61
    .line 62
    new-instance v0, Lcom/tencent/liteav/network/TXCFLVDownloader;

    .line 63
    .line 64
    invoke-direct {v0, p1}, Lcom/tencent/liteav/network/TXCFLVDownloader;-><init>(Landroid/content/Context;)V

    .line 65
    .line 66
    .line 67
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 68
    .line 69
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mFlvSessionKey:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setFlvSessionKey(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    if-eq p2, v2, :cond_1

    .line 76
    .line 77
    const/4 v0, 0x4

    .line 78
    if-ne p2, v0, :cond_2

    .line 79
    .line 80
    :cond_1
    new-instance v0, Lcom/tencent/liteav/network/TXCRTMPDownloader;

    .line 81
    .line 82
    invoke-direct {v0, p1}, Lcom/tencent/liteav/network/TXCRTMPDownloader;-><init>(Landroid/content/Context;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 86
    .line 87
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-virtual {v0, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setListener(Lcom/tencent/liteav/network/h;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 100
    .line 101
    invoke-virtual {v0, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setRestartListener(Lcom/tencent/liteav/network/TXIStreamDownloader$a;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    iput p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloadFormat:I

    .line 105
    .line 106
    new-instance p2, Lcom/tencent/liteav/network/k;

    .line 107
    .line 108
    invoke-direct {p2, p1}, Lcom/tencent/liteav/network/k;-><init>(Landroid/content/Context;)V

    .line 109
    .line 110
    .line 111
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 112
    .line 113
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 114
    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    new-instance p1, Landroid/os/Handler;

    .line 118
    .line 119
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 120
    .line 121
    invoke-virtual {p2}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 126
    .line 127
    .line 128
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 129
    .line 130
    :cond_4
    return-void
.end method

.method public static synthetic access$000(Lcom/tencent/liteav/network/TXCStreamDownloader;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mOriginPlayUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/tencent/liteav/network/TXCStreamDownloader;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableNearestIP:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1000(Lcom/tencent/liteav/network/TXCStreamDownloader;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1100(Lcom/tencent/liteav/network/TXCStreamDownloader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->reportNetStatus()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Lcom/tencent/liteav/network/TXCStreamDownloader;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mChannelType:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$300(Lcom/tencent/liteav/network/TXCStreamDownloader;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableMessage:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$400(Lcom/tencent/liteav/network/TXCStreamDownloader;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableMetaData:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$500(Lcom/tencent/liteav/network/TXCStreamDownloader;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloaderRunning:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$600(Lcom/tencent/liteav/network/TXCStreamDownloader;)Lcom/tencent/liteav/network/TXIStreamDownloader;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$700(Lcom/tencent/liteav/network/TXCStreamDownloader;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$800(Lcom/tencent/liteav/network/TXCStreamDownloader;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mReportNetStatusRunnalbe:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$900(Lcom/tencent/liteav/network/TXCStreamDownloader;)Lcom/tencent/liteav/network/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 2
    .line 3
    return-object p0
.end method

.method private getDownloadStats()Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->getDownloadStats()Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method private getRealTimeStreamInfo()Lcom/tencent/liteav/network/TXCStreamDownloader$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/network/k;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamDownloader$a;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/tencent/liteav/network/TXCStreamDownloader$a;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/tencent/liteav/network/k;->a()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iput-object v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->b:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/tencent/liteav/network/k;->b()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->c:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/tencent/liteav/network/k;->c()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    iput v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->d:I

    .line 43
    .line 44
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 45
    .line 46
    invoke-virtual {v1}, Lcom/tencent/liteav/network/k;->d()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->e:Ljava/lang/String;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 v0, 0x0

    .line 54
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    invoke-virtual {v1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->getCurrentStreamUrl()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->a:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->isQuicChannel()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput-boolean v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->f:Z

    .line 73
    .line 74
    :cond_1
    return-object v0
.end method

.method private getSpeed(JJJ)Ljava/lang/Long;
    .locals 1

    .line 1
    cmp-long v0, p1, p3

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sub-long/2addr p3, p1

    .line 7
    :goto_0
    const-wide/16 p1, 0x0

    .line 8
    .line 9
    cmp-long v0, p5, p1

    .line 10
    .line 11
    if-lez v0, :cond_1

    .line 12
    .line 13
    const-wide/16 p1, 0x1f40

    .line 14
    .line 15
    mul-long/2addr p3, p1

    .line 16
    const-wide/16 p1, 0x400

    .line 17
    .line 18
    mul-long/2addr p5, p1

    .line 19
    div-long p1, p3, p5

    .line 20
    .line 21
    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method private native nativeGetRTMPProxyUserId()Ljava/lang/String;
.end method

.method private playStreamWithRawUrl(Ljava/lang/String;Z)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    const-string v0, "http://"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "https://"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    const-string v0, ".flv"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 32
    .line 33
    iget v1, v0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryLimit:I

    .line 34
    .line 35
    iget v0, v0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryInterval:I

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 39
    .line 40
    new-instance v2, Lcom/tencent/liteav/network/TXCFLVDownloader;

    .line 41
    .line 42
    iget-object v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 43
    .line 44
    invoke-direct {v2, v3}, Lcom/tencent/liteav/network/TXCFLVDownloader;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 48
    .line 49
    iget-object v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mFlvSessionKey:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setFlvSessionKey(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 55
    .line 56
    invoke-virtual {v2, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setListener(Lcom/tencent/liteav/network/h;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 60
    .line 61
    invoke-virtual {v2, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setRestartListener(Lcom/tencent/liteav/network/TXIStreamDownloader$a;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 70
    .line 71
    iput v1, v2, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryLimit:I

    .line 72
    .line 73
    iput v0, v2, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryInterval:I

    .line 74
    .line 75
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHeaders:Ljava/util/Map;

    .line 76
    .line 77
    invoke-virtual {v2, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setHeaders(Ljava/util/Map;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setUserID(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    const-wide/16 v0, 0x1

    .line 90
    .line 91
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const/16 v1, 0x1bc8

    .line 96
    .line 97
    invoke-virtual {p0, v1, v0}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    new-instance v3, Ljava/util/Vector;

    .line 101
    .line 102
    invoke-direct {v3}, Ljava/util/Vector;-><init>()V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/tencent/liteav/network/e;

    .line 106
    .line 107
    const/4 v1, 0x0

    .line 108
    invoke-direct {v0, p1, v1}, Lcom/tencent/liteav/network/e;-><init>(Ljava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setOriginUrl(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 120
    .line 121
    const/4 v4, 0x0

    .line 122
    const/4 v5, 0x0

    .line 123
    move v7, p2

    .line 124
    move v6, p2

    .line 125
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/liteav/network/TXIStreamDownloader;->startDownload(Ljava/util/Vector;ZZZZ)V

    .line 126
    .line 127
    .line 128
    :cond_2
    return-void
.end method

.method private reportNetStatus()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->reportNetStatusInternal()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mReportNetStatusRunnalbe:Ljava/lang/Runnable;

    .line 7
    .line 8
    const-wide/16 v2, 0x7d0

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private reportNetStatusInternal()V
    .locals 15

    .line 1
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastTimeStamp:J

    .line 6
    .line 7
    sub-long v9, v0, v2

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->getDownloadStats()Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->getRealTimeStreamInfo()Lcom/tencent/liteav/network/TXCStreamDownloader$a;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v2, :cond_5

    .line 18
    .line 19
    iget-object v4, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastDownloadStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 20
    .line 21
    const-wide/16 v11, 0x0

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    iget-wide v5, v4, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseVideoBytes:J

    .line 26
    .line 27
    iget-wide v7, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseVideoBytes:J

    .line 28
    .line 29
    move-object v4, p0

    .line 30
    invoke-direct/range {v4 .. v10}, Lcom/tencent/liteav/network/TXCStreamDownloader;->getSpeed(JJJ)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 35
    .line 36
    .line 37
    move-result-wide v13

    .line 38
    iget-object v5, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastDownloadStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 39
    .line 40
    iget-wide v5, v5, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 41
    .line 42
    iget-wide v7, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 43
    .line 44
    invoke-direct/range {v4 .. v10}, Lcom/tencent/liteav/network/TXCStreamDownloader;->getSpeed(JJJ)Ljava/lang/Long;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v4, p0

    .line 54
    move-wide v5, v11

    .line 55
    move-wide v13, v5

    .line 56
    :goto_0
    cmp-long v7, v13, v11

    .line 57
    .line 58
    if-gtz v7, :cond_1

    .line 59
    .line 60
    cmp-long v7, v5, v11

    .line 61
    .line 62
    if-lez v7, :cond_2

    .line 63
    .line 64
    :cond_1
    iget-object v7, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 65
    .line 66
    const/4 v8, 0x0

    .line 67
    iput v8, v7, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryTimes:I

    .line 68
    .line 69
    :cond_2
    const/16 v7, 0x1bbd

    .line 70
    .line 71
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {p0, v7, v8}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    const/16 v7, 0x1bbe

    .line 79
    .line 80
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {p0, v7, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    iget-wide v5, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstVideoTS:J

    .line 88
    .line 89
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    const/16 v6, 0x1bbf

    .line 94
    .line 95
    invoke-virtual {p0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    iget-wide v5, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstAudioTS:J

    .line 99
    .line 100
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const/16 v6, 0x1bc0

    .line 105
    .line 106
    invoke-virtual {p0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    iget-wide v5, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->videoGop:J

    .line 110
    .line 111
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    const/16 v6, 0x1bd0

    .line 116
    .line 117
    invoke-virtual {p0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    const-wide/16 v5, 0x1

    .line 121
    .line 122
    const/16 v7, 0x1bc7

    .line 123
    .line 124
    const/16 v8, 0x1bc2

    .line 125
    .line 126
    const/16 v9, 0x1bc1

    .line 127
    .line 128
    if-eqz v3, :cond_4

    .line 129
    .line 130
    iget v10, v3, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->d:I

    .line 131
    .line 132
    int-to-long v10, v10

    .line 133
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    invoke-virtual {p0, v9, v10}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    iget-object v9, v3, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->e:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {p0, v8, v9}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    iget-boolean v8, v3, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->f:Z

    .line 146
    .line 147
    if-eqz v8, :cond_3

    .line 148
    .line 149
    const-wide/16 v5, 0x2

    .line 150
    .line 151
    :cond_3
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    invoke-virtual {p0, v7, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    const/16 v5, 0x1bcc

    .line 159
    .line 160
    iget-object v6, v3, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->a:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {p0, v5, v6}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    const/16 v5, 0x1bcd

    .line 166
    .line 167
    iget-object v6, v3, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->b:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {p0, v5, v6}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    const/16 v5, 0x1bce

    .line 173
    .line 174
    iget-object v3, v3, Lcom/tencent/liteav/network/TXCStreamDownloader$a;->c:Ljava/lang/String;

    .line 175
    .line 176
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_4
    iget v3, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->errorCode:I

    .line 181
    .line 182
    int-to-long v10, v3

    .line 183
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {p0, v9, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    iget-object v3, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->errorInfo:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {p0, v8, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {p0, v7, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    :goto_1
    iget-wide v5, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->startTS:J

    .line 203
    .line 204
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    const/16 v5, 0x1bc3

    .line 209
    .line 210
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    iget-wide v5, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->dnsTS:J

    .line 214
    .line 215
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    const/16 v5, 0x1bc4

    .line 220
    .line 221
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    iget-wide v5, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->connTS:J

    .line 225
    .line 226
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    const/16 v5, 0x1bc5

    .line 231
    .line 232
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    iget-object v3, v2, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->serverIP:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    const/16 v5, 0x1bc6

    .line 242
    .line 243
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_5
    move-object v4, p0

    .line 248
    :goto_2
    iget-object v3, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 249
    .line 250
    if-eqz v3, :cond_6

    .line 251
    .line 252
    invoke-virtual {v3}, Lcom/tencent/liteav/network/TXIStreamDownloader;->getConnectCountQuic()I

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    iget-object v5, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 257
    .line 258
    invoke-virtual {v5}, Lcom/tencent/liteav/network/TXIStreamDownloader;->getConnectCountTcp()I

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    add-int/lit8 v3, v3, 0x1

    .line 263
    .line 264
    int-to-long v6, v3

    .line 265
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 266
    .line 267
    .line 268
    move-result-object v3

    .line 269
    const/16 v6, 0x1bca

    .line 270
    .line 271
    invoke-virtual {p0, v6, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    add-int/lit8 v5, v5, 0x1

    .line 275
    .line 276
    int-to-long v5, v5

    .line 277
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    const/16 v5, 0x1bcb

    .line 282
    .line 283
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    iget-object v3, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 287
    .line 288
    invoke-virtual {v3}, Lcom/tencent/liteav/network/TXIStreamDownloader;->getRealStreamUrl()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    const/16 v5, 0x1bcf

    .line 293
    .line 294
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    iget-object v3, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 298
    .line 299
    invoke-virtual {v3}, Lcom/tencent/liteav/network/TXIStreamDownloader;->getFlvSessionKey()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    const/16 v5, 0x1bd1

    .line 308
    .line 309
    invoke-virtual {p0, v5, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    :cond_6
    iput-wide v0, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastTimeStamp:J

    .line 313
    .line 314
    iput-object v2, v4, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastDownloadStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 315
    .line 316
    return-void
.end method

.method private tryResetRetryCount()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput v1, v0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryTimes:I

    .line 7
    .line 8
    :cond_0
    return-void
.end method


# virtual methods
.method public getRTMPProxyUserId()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->nativeGetRTMPProxyUserId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public onNotifyEvent(ILandroid/os/Bundle;)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mNotifyListener:Lcom/tencent/liteav/basic/b/b;

    .line 5
    .line 6
    const/16 v2, 0x7d1

    .line 7
    .line 8
    if-eqz v1, :cond_11

    .line 9
    .line 10
    new-instance v1, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    const/16 v3, 0xbbf

    .line 16
    .line 17
    const/16 v4, 0xbbe

    .line 18
    .line 19
    const/16 v5, 0xbbb

    .line 20
    .line 21
    const/16 v6, 0xbba

    .line 22
    .line 23
    const/16 v7, -0x8fd

    .line 24
    .line 25
    const/16 v8, 0xbc2

    .line 26
    .line 27
    const/16 v9, -0x904

    .line 28
    .line 29
    if-eq p1, v9, :cond_c

    .line 30
    .line 31
    const/16 v10, 0x7dc

    .line 32
    .line 33
    if-eq p1, v10, :cond_b

    .line 34
    .line 35
    const/16 v10, 0x7ec

    .line 36
    .line 37
    if-eq p1, v10, :cond_a

    .line 38
    .line 39
    const/16 v10, 0x7ef

    .line 40
    .line 41
    if-eq p1, v10, :cond_a

    .line 42
    .line 43
    const/16 v10, 0x837

    .line 44
    .line 45
    if-eq p1, v10, :cond_9

    .line 46
    .line 47
    if-eq p1, v8, :cond_8

    .line 48
    .line 49
    const/16 v10, -0x8fe

    .line 50
    .line 51
    if-eq p1, v10, :cond_7

    .line 52
    .line 53
    if-eq p1, v7, :cond_6

    .line 54
    .line 55
    if-eq p1, v2, :cond_5

    .line 56
    .line 57
    const/16 v10, 0x7d2

    .line 58
    .line 59
    if-eq p1, v10, :cond_4

    .line 60
    .line 61
    if-eq p1, v6, :cond_3

    .line 62
    .line 63
    if-eq p1, v5, :cond_2

    .line 64
    .line 65
    if-eq p1, v4, :cond_1

    .line 66
    .line 67
    if-eq p1, v3, :cond_0

    .line 68
    .line 69
    const-string v10, "EVT_MSG"

    .line 70
    .line 71
    new-instance v11, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v12, "UNKNOWN event = "

    .line 77
    .line 78
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v11, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :catchall_0
    move-exception p1

    .line 94
    goto/16 :goto_1

    .line 95
    .line 96
    :cond_0
    const-string v10, "EVT_MSG"

    .line 97
    .line 98
    const-string v11, "Read data error"

    .line 99
    .line 100
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_1
    const-string v10, "EVT_MSG"

    .line 105
    .line 106
    const-string v11, "Write data error"

    .line 107
    .line 108
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_2
    const-string v10, "EVT_MSG"

    .line 113
    .line 114
    const-string v11, "RTMP handshake failed"

    .line 115
    .line 116
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    const-string v10, "EVT_MSG"

    .line 121
    .line 122
    const-string v11, "Failed to connect server"

    .line 123
    .line 124
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    const-string v10, "EVT_MSG"

    .line 129
    .line 130
    const-string v11, "begine receiving stream"

    .line 131
    .line 132
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_5
    const-string v10, "EVT_MSG"

    .line 137
    .line 138
    const-string v11, "connection SUCCESS"

    .line 139
    .line 140
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_6
    const-string v10, "EVT_MSG"

    .line 145
    .line 146
    const-string v11, "failed to connect server for several times, abort connection"

    .line 147
    .line 148
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_7
    const-string v10, "EVT_MSG"

    .line 153
    .line 154
    const-string v11, "Failed to get accelerated pull address"

    .line 155
    .line 156
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_8
    const-string v10, "EVT_MSG"

    .line 161
    .line 162
    const-string v11, "No video at this stream address"

    .line 163
    .line 164
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_9
    const-string v10, "EVT_MSG"

    .line 169
    .line 170
    const-string v11, "retry connecting stream server"

    .line 171
    .line 172
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_a
    move-object v1, p2

    .line 177
    goto :goto_0

    .line 178
    :cond_b
    const-string v10, "EVT_GET_MSG"

    .line 179
    .line 180
    invoke-virtual {p2, v10}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    .line 181
    .line 182
    .line 183
    move-result-object v10

    .line 184
    if-eqz v10, :cond_d

    .line 185
    .line 186
    array-length v11, v10

    .line 187
    if-lez v11, :cond_d

    .line 188
    .line 189
    const-string v11, "EVT_GET_MSG"

    .line 190
    .line 191
    invoke-virtual {v1, v11, v10}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 192
    .line 193
    .line 194
    goto :goto_0

    .line 195
    :cond_c
    const-string v10, "EVT_MSG"

    .line 196
    .line 197
    const-string v11, "The server rejected the connection request"

    .line 198
    .line 199
    invoke-virtual {v1, v10, v11}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_d
    :goto_0
    const-string v10, ""

    .line 203
    .line 204
    if-eqz p2, :cond_e

    .line 205
    .line 206
    const-string v10, "EVT_MSG"

    .line 207
    .line 208
    const-string v11, ""

    .line 209
    .line 210
    invoke-virtual {p2, v10, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    :cond_e
    if-eqz v10, :cond_f

    .line 215
    .line 216
    invoke-virtual {v10}, Ljava/lang/String;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    if-nez p2, :cond_f

    .line 221
    .line 222
    const-string p2, "EVT_MSG"

    .line 223
    .line 224
    invoke-virtual {v1, p2, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    :cond_f
    const-string p2, "EVT_TIME"

    .line 228
    .line 229
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 230
    .line 231
    .line 232
    move-result-wide v10

    .line 233
    invoke-virtual {v1, p2, v10, v11}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 234
    .line 235
    .line 236
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mNotifyListener:Lcom/tencent/liteav/basic/b/b;

    .line 237
    .line 238
    invoke-interface {p2, p1, v1}, Lcom/tencent/liteav/basic/b/b;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 239
    .line 240
    .line 241
    const/16 p2, 0xbb9

    .line 242
    .line 243
    if-eq p1, p2, :cond_10

    .line 244
    .line 245
    if-eq p1, v6, :cond_10

    .line 246
    .line 247
    if-eq p1, v5, :cond_10

    .line 248
    .line 249
    const/16 p2, 0xbbc

    .line 250
    .line 251
    if-eq p1, p2, :cond_10

    .line 252
    .line 253
    const/16 p2, 0xbbd

    .line 254
    .line 255
    if-eq p1, p2, :cond_10

    .line 256
    .line 257
    if-eq p1, v4, :cond_10

    .line 258
    .line 259
    if-eq p1, v3, :cond_10

    .line 260
    .line 261
    const/16 p2, 0xbc0

    .line 262
    .line 263
    if-eq p1, p2, :cond_10

    .line 264
    .line 265
    const/16 p2, 0xbc1

    .line 266
    .line 267
    if-eq p1, p2, :cond_10

    .line 268
    .line 269
    if-eq p1, v8, :cond_10

    .line 270
    .line 271
    const/16 p2, 0x835

    .line 272
    .line 273
    if-eq p1, p2, :cond_10

    .line 274
    .line 275
    const/16 p2, 0x836

    .line 276
    .line 277
    if-eq p1, p2, :cond_10

    .line 278
    .line 279
    const/16 p2, 0x83d

    .line 280
    .line 281
    if-eq p1, p2, :cond_10

    .line 282
    .line 283
    const/16 p2, 0x83e

    .line 284
    .line 285
    if-eq p1, p2, :cond_10

    .line 286
    .line 287
    if-eq p1, v7, :cond_10

    .line 288
    .line 289
    const/16 p2, -0x900

    .line 290
    .line 291
    if-eq p1, p2, :cond_10

    .line 292
    .line 293
    if-eq p1, v9, :cond_10

    .line 294
    .line 295
    const/16 p2, -0x905

    .line 296
    .line 297
    if-ne p1, p2, :cond_11

    .line 298
    .line 299
    :cond_10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object p2

    .line 303
    const/16 v3, 0x1bc1

    .line 304
    .line 305
    invoke-virtual {p0, v3, p2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    const-string p2, "EVT_MSG"

    .line 309
    .line 310
    invoke-virtual {v1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p2

    .line 314
    const/16 v1, 0x1bc2

    .line 315
    .line 316
    invoke-virtual {p0, v1, p2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    :cond_11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    if-ne p1, v2, :cond_12

    .line 321
    .line 322
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->reportNetStatusInternal()V

    .line 323
    .line 324
    .line 325
    :cond_12
    return-void

    .line 326
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    throw p1
.end method

.method public onOldStreamStop()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/tencent/liteav/network/d;->b()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    throw v1
.end method

.method public onPullAudio(Lcom/tencent/liteav/basic/structs/a;)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->tryResetRetryCount()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListener:Lcom/tencent/liteav/network/h;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p1}, Lcom/tencent/liteav/network/h;->onPullAudio(Lcom/tencent/liteav/basic/structs/a;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    move-object p1, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iget-object v3, p1, Lcom/tencent/liteav/basic/structs/a;->f:[B

    .line 23
    .line 24
    iget v4, p1, Lcom/tencent/liteav/basic/structs/a;->h:I

    .line 25
    .line 26
    iget-wide v5, p1, Lcom/tencent/liteav/basic/structs/a;->e:J

    .line 27
    .line 28
    iget v7, p1, Lcom/tencent/liteav/basic/structs/a;->g:I

    .line 29
    .line 30
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/liteav/network/TXIStreamDownloader;->PushAudioFrame([BIJI)V

    .line 31
    .line 32
    .line 33
    :cond_1
    monitor-exit v1

    .line 34
    return-void

    .line 35
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p1
.end method

.method public onPullNAL(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->tryResetRetryCount()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mRecvFirstNal:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamDownloader;->reportNetStatusInternal()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mRecvFirstNal:Z

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    iget-wide v2, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 18
    .line 19
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mCurrentNalTs:J

    .line 20
    .line 21
    iget v0, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastIFramelTs:J

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    move-object p1, v0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListener:Lcom/tencent/liteav/network/h;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-interface {v0, p1}, Lcom/tencent/liteav/network/h;->onPullNAL(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 39
    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    iget-object v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 43
    .line 44
    iget v4, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 45
    .line 46
    iget-wide v5, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 47
    .line 48
    iget-wide v7, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 49
    .line 50
    iget v9, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 51
    .line 52
    invoke-virtual/range {v2 .. v9}, Lcom/tencent/liteav/network/TXIStreamDownloader;->PushVideoFrame([BIJJI)V

    .line 53
    .line 54
    .line 55
    :cond_3
    monitor-exit v1

    .line 56
    return-void

    .line 57
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p1
.end method

.method public onRestartDownloader()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/tencent/liteav/network/TXCStreamDownloader$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/tencent/liteav/network/TXCStreamDownloader$1;-><init>(Lcom/tencent/liteav/network/TXCStreamDownloader;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onSwitchFinish(Lcom/tencent/liteav/network/TXIStreamDownloader;Z)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v1

    .line 8
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mSwitchStartTime:J

    .line 9
    .line 10
    sub-long/2addr v1, v3

    .line 11
    long-to-int v1, v1

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mSwitchStartTime:J

    .line 15
    .line 16
    new-instance v2, Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "EVT_TIME"

    .line 22
    .line 23
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual {v2, v3, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 28
    .line 29
    .line 30
    const/16 v3, 0x7df

    .line 31
    .line 32
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setListener(Lcom/tencent/liteav/network/h;)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 45
    .line 46
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setRestartListener(Lcom/tencent/liteav/network/TXIStreamDownloader$a;)V

    .line 47
    .line 48
    .line 49
    const-string p1, "EVT_ID"

    .line 50
    .line 51
    invoke-virtual {v2, p1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    const-string p1, "EVT_MSG"

    .line 55
    .line 56
    const-string p2, "Switched resolution successfully"

    .line 57
    .line 58
    invoke-virtual {v2, p1, p2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mNotifyListener:Lcom/tencent/liteav/basic/b/b;

    .line 62
    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    invoke-interface {p1, v3, v2}, Lcom/tencent/liteav/basic/b/b;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto :goto_2

    .line 71
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 72
    .line 73
    sget p2, Lcom/tencent/liteav/basic/datareport/a;->bw:I

    .line 74
    .line 75
    const-string v2, ""

    .line 76
    .line 77
    invoke-static {p1, p2, v1, v2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;IILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const-string p1, "EVT_ID"

    .line 82
    .line 83
    invoke-virtual {v2, p1, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    const-string p1, "EVT_MSG"

    .line 87
    .line 88
    const-string p2, "Failed to switch resolution"

    .line 89
    .line 90
    invoke-virtual {v2, p1, p2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mNotifyListener:Lcom/tencent/liteav/basic/b/b;

    .line 94
    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    invoke-interface {p1, v3, v2}, Lcom/tencent/liteav/basic/b/b;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 98
    .line 99
    .line 100
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 101
    .line 102
    sget p2, Lcom/tencent/liteav/basic/datareport/a;->bx:I

    .line 103
    .line 104
    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;I)V

    .line 105
    .line 106
    .line 107
    :goto_1
    const/4 p1, 0x0

    .line 108
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 109
    .line 110
    monitor-exit v0

    .line 111
    return-void

    .line 112
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    throw p1
.end method

.method public requestKeyFrame(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloaderRunning:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v0, "room"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->requestKeyFrame(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public setFlvSessionKey(Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mFlvSessionKey:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setFlvSessionKey(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setHeaders(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHeaders:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setHeaders(Ljava/util/Map;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setID(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/liteav/basic/module/a;->setID(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setUserID(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setListener(Lcom/tencent/liteav/network/h;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListener:Lcom/tencent/liteav/network/h;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mNotifyListener:Lcom/tencent/liteav/basic/b/b;

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return-void

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw p1
.end method

.method public setRetryInterval(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, v0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryInterval:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public setRetryTimes(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, v0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryLimit:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public start(Ljava/lang/String;ZIZZ)I
    .locals 11

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x1

    .line 10
    iput-boolean v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloaderRunning:Z

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    iput-boolean v6, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mRecvFirstNal:Z

    .line 14
    .line 15
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mOriginPlayUrl:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableNearestIP:Z

    .line 18
    .line 19
    iput p3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mChannelType:I

    .line 20
    .line 21
    iput-boolean p4, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableMessage:Z

    .line 22
    .line 23
    iput-boolean v5, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mEnableMetaData:Z

    .line 24
    .line 25
    const-wide/16 v7, 0x0

    .line 26
    .line 27
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/16 v7, 0x1bc9

    .line 32
    .line 33
    invoke-virtual {p0, v7, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    const/16 v8, 0x1bca

    .line 37
    .line 38
    invoke-virtual {p0, v8, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    const/16 v8, 0x1bcb

    .line 42
    .line 43
    invoke-virtual {p0, v8, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    const-string v3, "room"

    .line 47
    .line 48
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const-wide/16 v8, 0x7d0

    .line 53
    .line 54
    const/16 v10, 0x1bc8

    .line 55
    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0, v7, v1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    const-wide/16 v0, 0x2

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-virtual {p0, v10, p2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 71
    .line 72
    if-eqz p2, :cond_0

    .line 73
    .line 74
    new-instance v1, Ljava/util/Vector;

    .line 75
    .line 76
    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance p2, Lcom/tencent/liteav/network/e;

    .line 80
    .line 81
    invoke-direct {p2, p1, v2}, Lcom/tencent/liteav/network/e;-><init>(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p2}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 88
    .line 89
    invoke-virtual {p2, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setOriginUrl(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 93
    .line 94
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setUserID(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    const/4 v3, 0x0

    .line 105
    move v4, p4

    .line 106
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/liteav/network/TXIStreamDownloader;->startDownload(Ljava/util/Vector;ZZZZ)V

    .line 107
    .line 108
    .line 109
    :cond_0
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 110
    .line 111
    if-eqz p1, :cond_1

    .line 112
    .line 113
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mReportNetStatusRunnalbe:Ljava/lang/Runnable;

    .line 114
    .line 115
    invoke-virtual {p1, p2, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 116
    .line 117
    .line 118
    :cond_1
    return v6

    .line 119
    :cond_2
    const/4 v3, 0x4

    .line 120
    if-eqz p2, :cond_7

    .line 121
    .line 122
    iget v7, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloadFormat:I

    .line 123
    .line 124
    if-ne v7, v3, :cond_7

    .line 125
    .line 126
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mAccUrlFetcher:Lcom/tencent/liteav/network/k;

    .line 127
    .line 128
    new-instance v1, Lcom/tencent/liteav/network/TXCStreamDownloader$2;

    .line 129
    .line 130
    invoke-direct {v1, p0, p1, p4, v5}, Lcom/tencent/liteav/network/TXCStreamDownloader$2;-><init>(Lcom/tencent/liteav/network/TXCStreamDownloader;Ljava/lang/String;ZZ)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p1, p3, v1}, Lcom/tencent/liteav/network/k;->a(Ljava/lang/String;ILcom/tencent/liteav/network/k$a;)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-eqz p1, :cond_6

    .line 138
    .line 139
    const/4 p2, -0x1

    .line 140
    if-ne p1, p2, :cond_3

    .line 141
    .line 142
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 143
    .line 144
    sget v0, Lcom/tencent/liteav/basic/datareport/a;->at:I

    .line 145
    .line 146
    const-string v1, "invalid playUrl"

    .line 147
    .line 148
    invoke-static {p2, v0, p1, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;IILjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_3
    const/4 p2, -0x2

    .line 153
    if-ne p1, p2, :cond_4

    .line 154
    .line 155
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 156
    .line 157
    sget v0, Lcom/tencent/liteav/basic/datareport/a;->at:I

    .line 158
    .line 159
    const-string v1, "invalid streamID"

    .line 160
    .line 161
    invoke-static {p2, v0, p1, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;IILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_4
    const/4 p2, -0x3

    .line 166
    if-ne p1, p2, :cond_5

    .line 167
    .line 168
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 169
    .line 170
    sget v0, Lcom/tencent/liteav/basic/datareport/a;->at:I

    .line 171
    .line 172
    const-string v1, "invalid signature"

    .line 173
    .line 174
    invoke-static {p2, v0, p1, v1}, Lcom/tencent/liteav/basic/datareport/TXCDRApi;->txReportDAU(Landroid/content/Context;IILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    :cond_5
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v0, "getAccelerateStreamPlayUrl failed, result = "

    .line 183
    .line 184
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 188
    .line 189
    .line 190
    const-string p1, ", play stream with raw url"

    .line 191
    .line 192
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    const-string p2, "TXCStreamDownloader"

    .line 200
    .line 201
    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    const/16 p1, -0x8fe

    .line 205
    .line 206
    const/4 p2, 0x0

    .line 207
    invoke-virtual {p0, p1, p2}, Lcom/tencent/liteav/network/TXCStreamDownloader;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 208
    .line 209
    .line 210
    const/16 p1, -0x8fd

    .line 211
    .line 212
    invoke-virtual {p0, p1, p2}, Lcom/tencent/liteav/network/TXCStreamDownloader;->onNotifyEvent(ILandroid/os/Bundle;)V

    .line 213
    .line 214
    .line 215
    :cond_6
    return v6

    .line 216
    :cond_7
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 217
    .line 218
    if-eqz v0, :cond_9

    .line 219
    .line 220
    invoke-virtual {p0, v10, v1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    new-instance v1, Ljava/util/Vector;

    .line 224
    .line 225
    invoke-direct {v1}, Ljava/util/Vector;-><init>()V

    .line 226
    .line 227
    .line 228
    new-instance v0, Lcom/tencent/liteav/network/e;

    .line 229
    .line 230
    invoke-direct {v0, p1, v6}, Lcom/tencent/liteav/network/e;-><init>(Ljava/lang/String;Z)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 237
    .line 238
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setOriginUrl(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 242
    .line 243
    iget p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloadFormat:I

    .line 244
    .line 245
    if-ne p1, v3, :cond_8

    .line 246
    .line 247
    :goto_1
    move v3, p2

    .line 248
    move v4, p4

    .line 249
    goto :goto_2

    .line 250
    :cond_8
    move v2, v6

    .line 251
    goto :goto_1

    .line 252
    :goto_2
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/liteav/network/TXIStreamDownloader;->startDownload(Ljava/util/Vector;ZZZZ)V

    .line 253
    .line 254
    .line 255
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 256
    .line 257
    if-eqz p1, :cond_9

    .line 258
    .line 259
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mReportNetStatusRunnalbe:Ljava/lang/Runnable;

    .line 260
    .line 261
    invoke-virtual {p1, p2, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 262
    .line 263
    .line 264
    :cond_9
    return v6
.end method

.method public stop()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloaderRunning:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mRecvFirstNal:Z

    .line 5
    .line 6
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->stopDownload()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHandler:Landroid/os/Handler;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mReportNetStatusRunnalbe:Ljava/lang/Runnable;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 23
    .line 24
    monitor-enter v0

    .line 25
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/network/d;->a(Lcom/tencent/liteav/network/h;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/tencent/liteav/network/d;->a()V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception v1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v1
.end method

.method public switchStream(Ljava/lang/String;)Z
    .locals 11

    .line 1
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mListenerLock:[B

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    instance-of v2, v0, Lcom/tencent/liteav/network/TXCFLVDownloader;

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v5, Lcom/tencent/liteav/network/TXCFLVDownloader;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mApplicationContext:Landroid/content/Context;

    .line 20
    .line 21
    check-cast v0, Lcom/tencent/liteav/network/TXCFLVDownloader;

    .line 22
    .line 23
    invoke-direct {v5, v2, v0}, Lcom/tencent/liteav/network/TXCFLVDownloader;-><init>(Landroid/content/Context;Lcom/tencent/liteav/network/TXCFLVDownloader;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 27
    .line 28
    iget v2, v0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryLimit:I

    .line 29
    .line 30
    iput v2, v5, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryLimit:I

    .line 31
    .line 32
    iget v0, v0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryInterval:I

    .line 33
    .line 34
    iput v0, v5, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryInterval:I

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mHeaders:Ljava/util/Map;

    .line 37
    .line 38
    invoke-virtual {v5, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setHeaders(Ljava/util/Map;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v5, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setUserID(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mFlvSessionKey:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v5, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->setFlvSessionKey(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Lcom/tencent/liteav/network/d;

    .line 54
    .line 55
    invoke-direct {v0, p0}, Lcom/tencent/liteav/network/d;-><init>(Lcom/tencent/liteav/network/d$a;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Lcom/tencent/liteav/network/d;->a(Lcom/tencent/liteav/network/h;)V

    .line 61
    .line 62
    .line 63
    iget-object v3, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mStreamSwitcher:Lcom/tencent/liteav/network/d;

    .line 64
    .line 65
    iget-object v4, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mDownloader:Lcom/tencent/liteav/network/TXIStreamDownloader;

    .line 66
    .line 67
    iget-wide v6, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mCurrentNalTs:J

    .line 68
    .line 69
    iget-wide v8, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mLastIFramelTs:J

    .line 70
    .line 71
    move-object v10, p1

    .line 72
    invoke-virtual/range {v3 .. v10}, Lcom/tencent/liteav/network/d;->a(Lcom/tencent/liteav/network/TXIStreamDownloader;Lcom/tencent/liteav/network/TXIStreamDownloader;JJLjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCStreamDownloader;->mSwitchStartTime:J

    .line 80
    .line 81
    monitor-exit v1

    .line 82
    const/4 p1, 0x1

    .line 83
    return p1

    .line 84
    :catchall_0
    move-exception v0

    .line 85
    move-object p1, v0

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    :goto_0
    const-string p1, "TXCStreamDownloader"

    .line 88
    .line 89
    const-string v0, "stream_switch stream is changing ignore this change"

    .line 90
    .line 91
    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p1, 0x0

    .line 95
    monitor-exit v1

    .line 96
    return p1

    .line 97
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    throw p1
.end method
