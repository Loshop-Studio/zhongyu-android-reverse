.class public Lcom/tencent/liteav/network/TXCFLVDownloader;
.super Lcom/tencent/liteav/network/TXIStreamDownloader;
.source "SourceFile"


# instance fields
.field private final CONNECT_TIMEOUT:I

.field private final FLV_HEAD_SIZE:I

.field private final MAX_FRAME_SIZE:I

.field private final MSG_CONNECT:I

.field private final MSG_DISCONNECT:I

.field private final MSG_QUIT:I

.field private final MSG_RECONNECT:I

.field private final MSG_RECV_DATA:I

.field private final MSG_RESUME:I

.field private final MSG_SEEK:I

.field private final READ_STREAM_SIZE:I

.field public final TAG:Ljava/lang/String;

.field private mConnection:Ljava/net/HttpURLConnection;

.field private mContentLength:J

.field private mCurrentNalTs:J

.field private mDownloadedSize:J

.field private mFLVParser:J

.field private mFlvHandler:Landroid/os/Handler;

.field private mFlvThread:Landroid/os/HandlerThread;

.field private mHandleDataInJava:Z

.field private mHasReceivedFirstAudio:Z

.field private mHasReceivedFirstVideo:Z

.field private mInputStream:Ljava/io/InputStream;

.field private mLastIFramelTs:J

.field private mPacketBytes:[B

.field private mPlayUrl:Ljava/lang/String;

.field private mRecvData:Z

.field private mRefFLVParser:J

.field private mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

.field private mStopJitter:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;-><init>(Landroid/content/Context;)V

    .line 2
    const-string p1, "network.TXCFLVDownloader"

    iput-object p1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->TAG:Ljava/lang/String;

    const/16 v0, 0x9

    .line 3
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->FLV_HEAD_SIZE:I

    const/high16 v0, 0x100000

    .line 4
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MAX_FRAME_SIZE:I

    const/16 v0, 0x64

    .line 5
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_CONNECT:I

    const/16 v0, 0x65

    .line 6
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_RECV_DATA:I

    const/16 v0, 0x66

    .line 7
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_DISCONNECT:I

    const/16 v0, 0x67

    .line 8
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_RECONNECT:I

    const/16 v0, 0x68

    .line 9
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_SEEK:I

    const/16 v0, 0x69

    .line 10
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_RESUME:I

    const/16 v0, 0x6a

    .line 11
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_QUIT:I

    const/16 v0, 0x1f40

    .line 12
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->CONNECT_TIMEOUT:I

    const/16 v0, 0x56c

    .line 13
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->READ_STREAM_SIZE:I

    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvThread:Landroid/os/HandlerThread;

    .line 15
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 16
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 17
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 18
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPacketBytes:[B

    const/4 v1, 0x0

    .line 19
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRecvData:Z

    const-wide/16 v2, 0x0

    .line 20
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mContentLength:J

    .line 21
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mDownloadedSize:J

    .line 22
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHandleDataInJava:Z

    .line 23
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 24
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRefFLVParser:J

    .line 25
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mCurrentNalTs:J

    .line 26
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mLastIFramelTs:J

    const/4 v4, 0x1

    .line 27
    iput-boolean v4, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStopJitter:Z

    .line 28
    const-string v4, ""

    iput-object v4, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPlayUrl:Ljava/lang/String;

    .line 29
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstVideo:Z

    .line 30
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstAudio:Z

    .line 31
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 32
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    invoke-direct {v0}, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 33
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 34
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->dnsTS:J

    .line 35
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->startTS:J

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "new flv download "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/liteav/network/TXCFLVDownloader;)V
    .locals 5

    .line 37
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXIStreamDownloader;-><init>(Landroid/content/Context;)V

    .line 38
    const-string p1, "network.TXCFLVDownloader"

    iput-object p1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->TAG:Ljava/lang/String;

    const/16 v0, 0x9

    .line 39
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->FLV_HEAD_SIZE:I

    const/high16 v0, 0x100000

    .line 40
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MAX_FRAME_SIZE:I

    const/16 v0, 0x64

    .line 41
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_CONNECT:I

    const/16 v0, 0x65

    .line 42
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_RECV_DATA:I

    const/16 v0, 0x66

    .line 43
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_DISCONNECT:I

    const/16 v0, 0x67

    .line 44
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_RECONNECT:I

    const/16 v0, 0x68

    .line 45
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_SEEK:I

    const/16 v0, 0x69

    .line 46
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_RESUME:I

    const/16 v0, 0x6a

    .line 47
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->MSG_QUIT:I

    const/16 v0, 0x1f40

    .line 48
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->CONNECT_TIMEOUT:I

    const/16 v0, 0x56c

    .line 49
    iput v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->READ_STREAM_SIZE:I

    const/4 v0, 0x0

    .line 50
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvThread:Landroid/os/HandlerThread;

    .line 51
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 52
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 53
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 54
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPacketBytes:[B

    const/4 v1, 0x0

    .line 55
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRecvData:Z

    const-wide/16 v2, 0x0

    .line 56
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mContentLength:J

    .line 57
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mDownloadedSize:J

    .line 58
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHandleDataInJava:Z

    .line 59
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 60
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRefFLVParser:J

    .line 61
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mCurrentNalTs:J

    .line 62
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mLastIFramelTs:J

    const/4 v4, 0x1

    .line 63
    iput-boolean v4, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStopJitter:Z

    .line 64
    const-string v4, ""

    iput-object v4, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPlayUrl:Ljava/lang/String;

    .line 65
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstVideo:Z

    .line 66
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstAudio:Z

    .line 67
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 68
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    invoke-direct {v0}, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;-><init>()V

    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 69
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 70
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->dnsTS:J

    .line 71
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v2

    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->startTS:J

    if-eqz p2, :cond_0

    .line 72
    iget-wide v2, p2, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRefFLVParser:J

    .line 73
    iput-boolean v1, p2, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStopJitter:Z

    .line 74
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "new multi flv download "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic access$000(Lcom/tencent/liteav/network/TXCFLVDownloader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->processMsgConnect()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100(Lcom/tencent/liteav/network/TXCFLVDownloader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->processMsgRecvData()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Lcom/tencent/liteav/network/TXCFLVDownloader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->processMsgDisConnect()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$300(Lcom/tencent/liteav/network/TXCFLVDownloader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->processMsgReconnect()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private connect()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/net/URL;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPlayUrl:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/net/HttpURLConnection;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 27
    .line 28
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->dnsTS:J

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 35
    .line 36
    const/16 v1, 0x1f40

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 47
    .line 48
    const-string v1, "Accept-Encoding"

    .line 49
    .line 50
    const-string v2, "identity"

    .line 51
    .line 52
    invoke-virtual {v0, v1, v2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mHeaders:Ljava/util/Map;

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_1

    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, Ljava/util/Map$Entry;

    .line 84
    .line 85
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/lang/String;

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v2, v3, v1}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const/16 v1, 0xc8

    .line 115
    .line 116
    if-ne v1, v0, :cond_2

    .line 117
    .line 118
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 119
    .line 120
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 121
    .line 122
    .line 123
    move-result-wide v1

    .line 124
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->connTS:J

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 128
    .line 129
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iput v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->errorCode:I

    .line 136
    .line 137
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 144
    .line 145
    const/16 v0, 0x56c

    .line 146
    .line 147
    new-array v0, v0, [B

    .line 148
    .line 149
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPacketBytes:[B

    .line 150
    .line 151
    const/4 v0, 0x0

    .line 152
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRecvData:Z

    .line 153
    .line 154
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    int-to-long v0, v0

    .line 161
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mContentLength:J

    .line 162
    .line 163
    const-wide/16 v0, 0x0

    .line 164
    .line 165
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mDownloadedSize:J

    .line 166
    .line 167
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 168
    .line 169
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 170
    .line 171
    invoke-virtual {v1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v1}, Ljava/net/URL;->getHost()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v1}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->serverIP:Ljava/lang/String;

    .line 188
    .line 189
    const/16 v0, 0x7d1

    .line 190
    .line 191
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->sendNotifyEvent(I)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 195
    .line 196
    const-string v1, "X-Tlive-SpanId"

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 203
    .line 204
    iput-object v0, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->flvSessionKey:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mFlvSessionKey:Ljava/lang/String;

    .line 207
    .line 208
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_3

    .line 213
    .line 214
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 215
    .line 216
    iget-object v1, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mFlvSessionKey:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v0, v1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    if-eqz v0, :cond_3

    .line 223
    .line 224
    new-instance v1, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 227
    .line 228
    .line 229
    const-string v2, "receive flvSessionKey "

    .line 230
    .line 231
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    const-string v2, "network.TXCFLVDownloader"

    .line 242
    .line 243
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    const/16 v1, 0x7ef

    .line 247
    .line 248
    invoke-virtual {p0, v1, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->sendNotifyEvent(ILjava/lang/String;)V

    .line 249
    .line 250
    .line 251
    :cond_3
    return-void
.end method

.method private disconnect()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 7
    .line 8
    .line 9
    iput-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method private native nativeCleanData(J)V
.end method

.method private native nativeGetAudioBytes(J)I
.end method

.method private native nativeGetVideoBytes(J)I
.end method

.method private native nativeGetVideoGop(J)I
.end method

.method private native nativeInitFlvHander(Ljava/lang/String;IZZ)J
.end method

.method private native nativeInitFlvHanderByRef(J)J
.end method

.method private native nativeParseData(J[BI)I
.end method

.method private native nativeUninitFlvhander(JZ)V
.end method

.method private onRecvFirstAudioData()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstAudio:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstAudio:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstAudioTS:J

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "onRecvData: receive first audio with ts "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 27
    .line 28
    iget-wide v1, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstAudioTS:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "network.TXCFLVDownloader"

    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method private onRecvFirstVideoData()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstVideo:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstVideo:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstVideoTS:J

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "onRecvData: receive first video with ts "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 27
    .line 28
    iget-wide v1, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstVideoTS:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "network.TXCFLVDownloader"

    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void
.end method

.method private postConnectMsg()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 12
    .line 13
    :cond_0
    new-instance v0, Landroid/os/Message;

    .line 14
    .line 15
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x64

    .line 19
    .line 20
    iput v1, v0, Landroid/os/Message;->what:I

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method

.method private postDisconnectMsg()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/16 v1, 0x66

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private postReconnectMsg()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryInterval:I

    .line 6
    .line 7
    mul-int/lit16 v1, v1, 0x3e8

    .line 8
    .line 9
    int-to-long v1, v1

    .line 10
    const/16 v3, 0x67

    .line 11
    .line 12
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private processMsgConnect()V
    .locals 5

    .line 1
    const-string v0, "network.TXCFLVDownloader"

    .line 2
    .line 3
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->connect()V
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRefFLVParser:J

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativeInitFlvHanderByRef(J)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 25
    .line 26
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRefFLVParser:J

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mUserID:Ljava/lang/String;

    .line 30
    .line 31
    iget-boolean v1, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mEnableMessage:Z

    .line 32
    .line 33
    iget-boolean v2, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mEnableMetaData:Z

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {p0, v0, v3, v1, v2}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativeInitFlvHander(Ljava/lang/String;IZZ)J

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 41
    .line 42
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x65

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void

    .line 52
    :catch_0
    move-exception v1

    .line 53
    const-string v2, "error, reconnect"

    .line 54
    .line 55
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 59
    .line 60
    .line 61
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catch_1
    move-exception v1

    .line 66
    const-string v2, "exception, reconnect"

    .line 67
    .line 68
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :catch_2
    move-exception v1

    .line 79
    const-string v2, "file not found, reconnect"

    .line 80
    .line 81
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 85
    .line 86
    .line 87
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catch_3
    const-string v1, "socket timeout, reconnect"

    .line 92
    .line 93
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method private processMsgDisConnect()V
    .locals 5

    .line 1
    :try_start_0
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    goto :goto_0

    .line 5
    :catch_0
    move-exception v0

    .line 6
    const-string v1, "network.TXCFLVDownloader"

    .line 7
    .line 8
    const-string v2, "disconnect failed."

    .line 9
    .line 10
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 14
    .line 15
    const-wide/16 v2, 0x0

    .line 16
    .line 17
    cmp-long v4, v0, v2

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    iget-boolean v4, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStopJitter:Z

    .line 22
    .line 23
    invoke-direct {p0, v0, v1, v4}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativeUninitFlvhander(JZ)V

    .line 24
    .line 25
    .line 26
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method private processMsgReconnect()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStopJitter:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->reconnect()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "ignore processMsgReconnect when start multi stream switch"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "network.TXCFLVDownloader"

    .line 27
    .line 28
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mRestartListener:Lcom/tencent/liteav/network/TXIStreamDownloader$a;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {v0}, Lcom/tencent/liteav/network/TXIStreamDownloader$a;->onOldStreamStop()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method private processMsgRecvData()V
    .locals 10

    .line 1
    const-string v0, "network.TXCFLVDownloader"

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 4
    .line 5
    if-eqz v1, :cond_4

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_0
    iget-object v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPacketBytes:[B

    .line 9
    .line 10
    const/16 v4, 0x56c

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    invoke-virtual {v1, v3, v5, v4}, Ljava/io/InputStream;->read([BII)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_2

    .line 18
    .line 19
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mDownloadedSize:J

    .line 20
    .line 21
    int-to-long v6, v1

    .line 22
    add-long/2addr v3, v6

    .line 23
    iput-wide v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mDownloadedSize:J

    .line 24
    .line 25
    iget-boolean v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRecvData:Z

    .line 26
    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    new-instance v3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v4, "flv play receive first data "

    .line 35
    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    iput-boolean v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mRecvData:Z

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v1

    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :catch_1
    move-exception v1

    .line 57
    goto/16 :goto_2

    .line 58
    .line 59
    :cond_0
    :goto_0
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 60
    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    cmp-long v8, v3, v8

    .line 64
    .line 65
    if-eqz v8, :cond_1

    .line 66
    .line 67
    iget-object v5, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 68
    .line 69
    iget-wide v8, v5, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->beforeParseVideoBytes:J

    .line 70
    .line 71
    add-long/2addr v8, v6

    .line 72
    iput-wide v8, v5, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->beforeParseVideoBytes:J

    .line 73
    .line 74
    iget-object v5, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPacketBytes:[B

    .line 75
    .line 76
    invoke-direct {p0, v3, v4, v5, v1}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativeParseData(J[BI)I

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 81
    .line 82
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 83
    .line 84
    invoke-direct {p0, v3, v4}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativeGetVideoBytes(J)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    int-to-long v3, v3

    .line 89
    iput-wide v3, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseVideoBytes:J

    .line 90
    .line 91
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 92
    .line 93
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 94
    .line 95
    invoke-direct {p0, v3, v4}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativeGetAudioBytes(J)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    int-to-long v3, v3

    .line 100
    iput-wide v3, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 101
    .line 102
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 103
    .line 104
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 105
    .line 106
    invoke-direct {p0, v3, v4}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativeGetVideoGop(J)I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    int-to-long v3, v3

    .line 111
    iput-wide v3, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->videoGop:J

    .line 112
    .line 113
    :cond_1
    const/high16 v1, 0x100000

    .line 114
    .line 115
    if-le v5, v1, :cond_3

    .line 116
    .line 117
    new-instance v3, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v4, "flv play parse frame: "

    .line 123
    .line 124
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    const-string v4, " > "

    .line 131
    .line 132
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v1, ",sart reconnect"

    .line 139
    .line 140
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_2
    if-gez v1, :cond_3

    .line 155
    .line 156
    new-instance v3, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const-string v4, "http read: "

    .line 162
    .line 163
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    const-string v1, " < 0, start reconnect"

    .line 170
    .line 171
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :cond_3
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 186
    .line 187
    if-eqz v1, :cond_4

    .line 188
    .line 189
    const/16 v3, 0x65

    .line 190
    .line 191
    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljavax/net/ssl/SSLException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :goto_1
    const-string v3, "error"

    .line 196
    .line 197
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 201
    .line 202
    .line 203
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 204
    .line 205
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :goto_2
    const-string v3, "exception"

    .line 209
    .line 210
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 214
    .line 215
    .line 216
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mInputStream:Ljava/io/InputStream;

    .line 217
    .line 218
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :catch_2
    const-string v1, "eof exception start reconnect"

    .line 222
    .line 223
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 227
    .line 228
    .line 229
    goto :goto_3

    .line 230
    :catch_3
    const-string v1, "ssl exception start reconnect"

    .line 231
    .line 232
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 236
    .line 237
    .line 238
    goto :goto_3

    .line 239
    :catch_4
    const-string v1, "socket exception start reconnect"

    .line 240
    .line 241
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 245
    .line 246
    .line 247
    goto :goto_3

    .line 248
    :catch_5
    const-string v1, "socket timeout start reconnect"

    .line 249
    .line 250
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postReconnectMsg()V

    .line 254
    .line 255
    .line 256
    :cond_4
    :goto_3
    return-void
.end method

.method private reconnect()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->processMsgDisConnect()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryTimes:I

    .line 5
    .line 6
    iget v1, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryLimit:I

    .line 7
    .line 8
    const-string v2, "network.TXCFLVDownloader"

    .line 9
    .line 10
    if-ge v0, v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x1

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryTimes:I

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "reconnect retry time:"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget v1, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryTimes:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", limit:"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v1, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->connectRetryLimit:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->processMsgConnect()V

    .line 49
    .line 50
    .line 51
    const/16 v0, 0x837

    .line 52
    .line 53
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->sendNotifyEvent(I)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    const-string v0, "reconnect all times retried, send failed event "

    .line 58
    .line 59
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/16 v0, -0x8fd

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/network/TXIStreamDownloader;->sendNotifyEvent(I)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method private startInternal()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvThread:Landroid/os/HandlerThread;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/HandlerThread;

    .line 6
    .line 7
    const-string v1, "FlvThread"

    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvThread:Landroid/os/HandlerThread;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lcom/tencent/liteav/network/TXCFLVDownloader$1;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvThread:Landroid/os/HandlerThread;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, p0, v1}, Lcom/tencent/liteav/network/TXCFLVDownloader$1;-><init>(Lcom/tencent/liteav/network/TXCFLVDownloader;Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 33
    .line 34
    :cond_1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->postConnectMsg()V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public PushAudioFrame([BIJI)V
    .locals 8

    .line 1
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v3, p1

    .line 5
    move v4, p2

    .line 6
    move-wide v5, p3

    .line 7
    move v7, p5

    .line 8
    invoke-virtual/range {v0 .. v7}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativePushAudioFrame(J[BIJI)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public PushVideoFrame([BIJJI)V
    .locals 10

    .line 1
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFLVParser:J

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v3, p1

    .line 5
    move v4, p2

    .line 6
    move-wide v5, p3

    .line 7
    move-wide v7, p5

    .line 8
    move/from16 v9, p7

    .line 9
    .line 10
    invoke-virtual/range {v0 .. v9}, Lcom/tencent/liteav/network/TXCFLVDownloader;->nativePushVideoFrame(J[BIJJI)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public getCurrentTS()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mCurrentNalTs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getDownloadStats()Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;
    .locals 4

    .line 1
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 7
    .line 8
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 9
    .line 10
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 11
    .line 12
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseVideoBytes:J

    .line 13
    .line 14
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseVideoBytes:J

    .line 15
    .line 16
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->beforeParseVideoBytes:J

    .line 17
    .line 18
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->beforeParseVideoBytes:J

    .line 19
    .line 20
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->beforeParseAudioBytes:J

    .line 21
    .line 22
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->beforeParseAudioBytes:J

    .line 23
    .line 24
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->videoGop:J

    .line 25
    .line 26
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->videoGop:J

    .line 27
    .line 28
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->startTS:J

    .line 29
    .line 30
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->startTS:J

    .line 31
    .line 32
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->dnsTS:J

    .line 33
    .line 34
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->dnsTS:J

    .line 35
    .line 36
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->connTS:J

    .line 37
    .line 38
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->connTS:J

    .line 39
    .line 40
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstAudioTS:J

    .line 41
    .line 42
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstAudioTS:J

    .line 43
    .line 44
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstVideoTS:J

    .line 45
    .line 46
    iput-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstVideoTS:J

    .line 47
    .line 48
    iget-object v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->serverIP:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->serverIP:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->flvSessionKey:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->flvSessionKey:Ljava/lang/String;

    .line 55
    .line 56
    iget v2, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->errorCode:I

    .line 57
    .line 58
    iput v2, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->errorCode:I

    .line 59
    .line 60
    iget-object v1, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->errorInfo:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->errorInfo:Ljava/lang/String;

    .line 63
    .line 64
    return-object v0
.end method

.method public getLastIFrameTS()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mLastIFramelTs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getRealStreamUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mConnection:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return-object v0
.end method

.method public native nativePushAudioFrame(J[BIJI)V
.end method

.method public native nativePushVideoFrame(J[BIJJI)V
.end method

.method public onRecvAudioData([BIII)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstAudio:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstAudio:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstAudioTS:J

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "receive first audio with ts "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 27
    .line 28
    iget-wide v1, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstAudioTS:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "network.TXCFLVDownloader"

    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 43
    .line 44
    iget-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 45
    .line 46
    array-length v3, p1

    .line 47
    int-to-long v3, v3

    .line 48
    add-long/2addr v1, v3

    .line 49
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseAudioBytes:J

    .line 50
    .line 51
    invoke-super {p0, p1, p2, p3, p4}, Lcom/tencent/liteav/network/TXIStreamDownloader;->onRecvAudioData([BIII)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public onRecvVideoData([BIJJI)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstVideo:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHasReceivedFirstVideo:Z

    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstVideoTS:J

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "receive first video with ts "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 27
    .line 28
    iget-wide v1, v1, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->firstVideoTS:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "network.TXCFLVDownloader"

    .line 38
    .line 39
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mStats:Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;

    .line 43
    .line 44
    iget-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseVideoBytes:J

    .line 45
    .line 46
    array-length v3, p1

    .line 47
    int-to-long v3, v3

    .line 48
    add-long/2addr v1, v3

    .line 49
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamDownloader$DownloadStats;->afterParseVideoBytes:J

    .line 50
    .line 51
    invoke-super/range {p0 .. p7}, Lcom/tencent/liteav/network/TXIStreamDownloader;->onRecvVideoData([BIJJI)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public recvData(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mHandleDataInJava:Z

    .line 2
    .line 3
    return-void
.end method

.method public startDownload(Ljava/util/Vector;ZZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Vector<",
            "Lcom/tencent/liteav/network/e;",
            ">;ZZZZ)V"
        }
    .end annotation

    .line 1
    iget-boolean p2, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mIsRunning:Z

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p1, :cond_2

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/Vector;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    iput-boolean p4, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mEnableMessage:Z

    .line 16
    .line 17
    iput-boolean p5, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mEnableMetaData:Z

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    iput-boolean p2, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mIsRunning:Z

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    invoke-virtual {p1, p2}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Lcom/tencent/liteav/network/e;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/tencent/liteav/network/e;->a:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPlayUrl:Ljava/lang/String;

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string p2, "start pull with url "

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mPlayUrl:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string p2, "network.TXCFLVDownloader"

    .line 53
    .line 54
    invoke-static {p2, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCFLVDownloader;->startInternal()V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_0
    return-void
.end method

.method public stopDownload()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mIsRunning:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXIStreamDownloader;->mIsRunning:Z

    .line 8
    .line 9
    const-string v0, "stop pull"

    .line 10
    .line 11
    const-string v1, "network.TXCFLVDownloader"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 25
    .line 26
    const/16 v3, 0x66

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;

    .line 32
    .line 33
    const/16 v3, 0x6a

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCFLVDownloader;->mFlvHandler:Landroid/os/Handler;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    return-void

    .line 44
    :goto_1
    const-string v2, "stop download failed."

    .line 45
    .line 46
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
