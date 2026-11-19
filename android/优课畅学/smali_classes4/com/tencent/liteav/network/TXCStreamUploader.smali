.class public Lcom/tencent/liteav/network/TXCStreamUploader;
.super Lcom/tencent/liteav/basic/module/a;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/network/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/network/TXCStreamUploader$RtmpProxyUserInfo;,
        Lcom/tencent/liteav/network/TXCStreamUploader$a;,
        Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;,
        Lcom/tencent/liteav/network/TXCStreamUploader$b;
    }
.end annotation


# static fields
.field public static final RTMPSENDSTRATEGY_LIVE:I = 0x1

.field public static final RTMPSENDSTRATEGY_REALTIME_QUIC:I = 0x3

.field public static final RTMPSENDSTRATEGY_REALTIME_TCP:I = 0x2

.field static final TAG:Ljava/lang/String; = "TXCStreamUploader"

.field public static final TXE_UPLOAD_MODE_AUDIO_ONLY:I = 0x1

.field public static final TXE_UPLOAD_MODE_LINK_MIC:I = 0x2

.field public static final TXE_UPLOAD_MODE_REAL_TIME:I = 0x0

.field public static final TXE_UPLOAD_PROTOCOL_AV:I = 0x1

.field public static final TXE_UPLOAD_PROTOCOL_RTMP:I


# instance fields
.field private final MSG_EVENT:I

.field private final MSG_RECONNECT:I

.field private final MSG_REPORT_STATUS:I

.field private final MSG_RTMPPROXY_HEARTBEAT:I

.field private mAudioMuted:Z

.field private mChannelType:I

.field private mConnectCountQuic:I

.field private mConnectCountTcp:I

.field private mConnectSuccessTimeStamps:J

.field private mContext:Landroid/content/Context;

.field private mCurrentRecordIdx:I

.field private mEnableNearestIP:Z

.field private mGoodPushTime:J

.field private mHandler:Landroid/os/Handler;

.field private mHandlerThread:Landroid/os/HandlerThread;

.field private mIntelligentRoute:Lcom/tencent/liteav/network/c;

.field private mIpList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/network/a;",
            ">;"
        }
    .end annotation
.end field

.field private mIsPushing:Z

.field private mLastNetworkType:I

.field private mLastTimeStamp:J

.field private mLastUploadStats:Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

.field mMetaData:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mNotifyListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private mParam:Lcom/tencent/liteav/network/l;

.field private mQuicChannel:Z

.field private mRetryCount:I

.field private mRtmpMsgRecvThreadInstance:J

.field private mRtmpMsgRecvThreadLock:Ljava/lang/Object;

.field private mRtmpProxyEnable:Z

.field private mRtmpProxyIPIndex:I

.field private mRtmpProxyIPList:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mRtmpProxyInstance:J

.field private mRtmpProxyLock:Ljava/lang/Object;

.field private mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

.field private mRtmpUrl:Ljava/lang/String;

.field private mThread:Ljava/lang/Thread;

.field private mThreadLock:Ljava/lang/Object;

.field private mUploadQualityReport:Lcom/tencent/liteav/network/n;

.field private mUploaderInstance:J

.field private mVecPendingNAL:Ljava/util/Vector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Vector<",
            "Lcom/tencent/liteav/basic/structs/TXSNALPacket;",
            ">;"
        }
    .end annotation
.end field


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

.method public constructor <init>(Landroid/content/Context;Lcom/tencent/liteav/network/l;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/basic/module/a;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThread:Ljava/lang/Thread;

    .line 10
    .line 11
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    iput-boolean v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 15
    .line 16
    const-string v4, ""

    .line 17
    .line 18
    iput-object v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 21
    .line 22
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mChannelType:I

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    iput-boolean v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mEnableNearestIP:Z

    .line 26
    .line 27
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIntelligentRoute:Lcom/tencent/liteav/network/c;

    .line 28
    .line 29
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 30
    .line 31
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 32
    .line 33
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 34
    .line 35
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 36
    .line 37
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 38
    .line 39
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 40
    .line 41
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectSuccessTimeStamps:J

    .line 42
    .line 43
    const-wide/16 v5, 0x7530

    .line 44
    .line 45
    iput-wide v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mGoodPushTime:J

    .line 46
    .line 47
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandlerThread:Landroid/os/HandlerThread;

    .line 48
    .line 49
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 50
    .line 51
    const/16 v5, 0x65

    .line 52
    .line 53
    iput v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->MSG_RECONNECT:I

    .line 54
    .line 55
    const/16 v5, 0x66

    .line 56
    .line 57
    iput v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->MSG_EVENT:I

    .line 58
    .line 59
    const/16 v5, 0x67

    .line 60
    .line 61
    iput v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->MSG_REPORT_STATUS:I

    .line 62
    .line 63
    const/16 v5, 0x68

    .line 64
    .line 65
    iput v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->MSG_RTMPPROXY_HEARTBEAT:I

    .line 66
    .line 67
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastTimeStamp:J

    .line 68
    .line 69
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastUploadStats:Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 70
    .line 71
    new-instance v5, Ljava/util/Vector;

    .line 72
    .line 73
    invoke-direct {v5}, Ljava/util/Vector;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mVecPendingNAL:Ljava/util/Vector;

    .line 77
    .line 78
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 79
    .line 80
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountQuic:I

    .line 81
    .line 82
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountTcp:I

    .line 83
    .line 84
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 85
    .line 86
    iput-boolean v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 87
    .line 88
    iput-boolean v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mAudioMuted:Z

    .line 89
    .line 90
    new-instance v5, Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 91
    .line 92
    invoke-direct {v5, p0}, Lcom/tencent/liteav/network/TXCStreamUploader$a;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;)V

    .line 93
    .line 94
    .line 95
    iput-object v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 96
    .line 97
    new-instance v5, Ljava/util/Vector;

    .line 98
    .line 99
    invoke-direct {v5}, Ljava/util/Vector;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPList:Ljava/util/Vector;

    .line 103
    .line 104
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPIndex:I

    .line 105
    .line 106
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    .line 107
    .line 108
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadInstance:J

    .line 109
    .line 110
    new-instance v5, Ljava/lang/Object;

    .line 111
    .line 112
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 113
    .line 114
    .line 115
    iput-object v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyLock:Ljava/lang/Object;

    .line 116
    .line 117
    new-instance v5, Ljava/lang/Object;

    .line 118
    .line 119
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadLock:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 125
    .line 126
    if-nez p2, :cond_0

    .line 127
    .line 128
    new-instance p2, Lcom/tencent/liteav/network/l;

    .line 129
    .line 130
    invoke-direct {p2}, Lcom/tencent/liteav/network/l;-><init>()V

    .line 131
    .line 132
    .line 133
    iput v3, p2, Lcom/tencent/liteav/network/l;->a:I

    .line 134
    .line 135
    const/4 v5, 0x3

    .line 136
    iput v5, p2, Lcom/tencent/liteav/network/l;->f:I

    .line 137
    .line 138
    iput v5, p2, Lcom/tencent/liteav/network/l;->e:I

    .line 139
    .line 140
    const/16 v5, 0x28

    .line 141
    .line 142
    iput v5, p2, Lcom/tencent/liteav/network/l;->g:I

    .line 143
    .line 144
    const/16 v5, 0x3e8

    .line 145
    .line 146
    iput v5, p2, Lcom/tencent/liteav/network/l;->h:I

    .line 147
    .line 148
    iput-boolean v4, p2, Lcom/tencent/liteav/network/l;->i:Z

    .line 149
    .line 150
    :cond_0
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 151
    .line 152
    new-instance p2, Ljava/lang/Object;

    .line 153
    .line 154
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 158
    .line 159
    new-instance p2, Lcom/tencent/liteav/network/c;

    .line 160
    .line 161
    invoke-direct {p2}, Lcom/tencent/liteav/network/c;-><init>()V

    .line 162
    .line 163
    .line 164
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIntelligentRoute:Lcom/tencent/liteav/network/c;

    .line 165
    .line 166
    iput-object p0, p2, Lcom/tencent/liteav/network/c;->a:Lcom/tencent/liteav/network/b;

    .line 167
    .line 168
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 169
    .line 170
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 171
    .line 172
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 173
    .line 174
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 175
    .line 176
    iput-boolean v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 177
    .line 178
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThread:Ljava/lang/Thread;

    .line 179
    .line 180
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 181
    .line 182
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 183
    .line 184
    iput-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandlerThread:Landroid/os/HandlerThread;

    .line 185
    .line 186
    new-instance p2, Lcom/tencent/liteav/network/n;

    .line 187
    .line 188
    invoke-direct {p2, p1}, Lcom/tencent/liteav/network/n;-><init>(Landroid/content/Context;)V

    .line 189
    .line 190
    .line 191
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 192
    .line 193
    invoke-static {}, Lcom/tencent/liteav/network/m;->a()Lcom/tencent/liteav/network/m;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-virtual {p2, p1}, Lcom/tencent/liteav/network/m;->a(Landroid/content/Context;)V

    .line 198
    .line 199
    .line 200
    return-void
.end method

.method public static synthetic access$000(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;ZI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$100(Lcom/tencent/liteav/network/TXCStreamUploader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->reportNetStatus()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1000(Lcom/tencent/liteav/network/TXCStreamUploader;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1002(Lcom/tencent/liteav/network/TXCStreamUploader;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1100(Lcom/tencent/liteav/network/TXCStreamUploader;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1200(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1300(Lcom/tencent/liteav/network/TXCStreamUploader;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mAudioMuted:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$1400(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;Ljava/lang/String;ZIIIIIIIZILjava/util/HashMap;)J
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeInitUploader(Ljava/lang/String;Ljava/lang/String;ZIIIIIIIZILjava/util/HashMap;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic access$1500(Lcom/tencent/liteav/network/TXCStreamUploader;JZII)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeSetVideoDropParams(JZII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1600(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/util/Vector;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mVecPendingNAL:Ljava/util/Vector;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1700(Lcom/tencent/liteav/network/TXCStreamUploader;J[BIJJJ)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativePushNAL(J[BIJJJ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$1800(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyLock:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1900(Lcom/tencent/liteav/network/TXCStreamUploader;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$1902(Lcom/tencent/liteav/network/TXCStreamUploader;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$200(Lcom/tencent/liteav/network/TXCStreamUploader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->rtmpProxySendHeartBeat()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2000(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/TXCStreamUploader$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2100(Lcom/tencent/liteav/network/TXCStreamUploader;JJLjava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZLjava/lang/String;)J
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p15}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeInitRtmpProxyInstance(JJLjava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZLjava/lang/String;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic access$2200(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadLock:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2300(Lcom/tencent/liteav/network/TXCStreamUploader;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadInstance:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$2302(Lcom/tencent/liteav/network/TXCStreamUploader;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadInstance:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$2400(Lcom/tencent/liteav/network/TXCStreamUploader;JJ)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeInitRtmpMsgRecvThreadInstance(JJ)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static synthetic access$2500(Lcom/tencent/liteav/network/TXCStreamUploader;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeOnThreadRun(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2600(Lcom/tencent/liteav/network/TXCStreamUploader;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeRtmpMsgRecvThreadStop(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2700(Lcom/tencent/liteav/network/TXCStreamUploader;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeUninitRtmpMsgRecvThreadInstance(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2800(Lcom/tencent/liteav/network/TXCStreamUploader;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeUninitRtmpProxyInstance(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$2900(Lcom/tencent/liteav/network/TXCStreamUploader;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeUninitUploader(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$300(Lcom/tencent/liteav/network/TXCStreamUploader;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$3000(Lcom/tencent/liteav/network/TXCStreamUploader;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->internalReconnect(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$400(Lcom/tencent/liteav/network/TXCStreamUploader;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic access$402(Lcom/tencent/liteav/network/TXCStreamUploader;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic access$500(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$600(Lcom/tencent/liteav/network/TXCStreamUploader;)Lcom/tencent/liteav/network/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$700(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$800(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->getAddressFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$900(Lcom/tencent/liteav/network/TXCStreamUploader;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method private getAddressFromUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "://"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, -0x1

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    add-int/lit8 v0, v0, 0x3

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const-string v0, "/"

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1

    .line 32
    :cond_0
    const-string p1, ""

    .line 33
    .line 34
    return-object p1
.end method

.method private getNextRtmpProxyIP()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 2
    .line 3
    const-wide/16 v1, 0xea

    .line 4
    .line 5
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->f:J

    .line 6
    .line 7
    const-wide/16 v1, 0x50

    .line 8
    .line 9
    iput-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->g:J

    .line 10
    .line 11
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPList:Ljava/util/Vector;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/Vector;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-lez v0, :cond_2

    .line 21
    .line 22
    iget v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPIndex:I

    .line 23
    .line 24
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPList:Ljava/util/Vector;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/Vector;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-lt v0, v2, :cond_0

    .line 31
    .line 32
    iput v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPIndex:I

    .line 33
    .line 34
    return v1

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 36
    .line 37
    const-string v2, "://"

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    array-length v2, v0

    .line 44
    const/4 v3, 0x2

    .line 45
    if-ge v2, v3, :cond_1

    .line 46
    .line 47
    return v1

    .line 48
    :cond_1
    const/4 v1, 0x1

    .line 49
    aget-object v0, v0, v1

    .line 50
    .line 51
    const-string v2, "/"

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPList:Ljava/util/Vector;

    .line 62
    .line 63
    iget v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPIndex:I

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/util/Vector;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Ljava/lang/String;

    .line 70
    .line 71
    iget-object v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 72
    .line 73
    iput-object v2, v3, Lcom/tencent/liteav/network/TXCStreamUploader$a;->h:Ljava/lang/String;

    .line 74
    .line 75
    new-instance v3, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v4, "room://"

    .line 81
    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 96
    .line 97
    iput-boolean v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 98
    .line 99
    iget v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPIndex:I

    .line 100
    .line 101
    add-int/2addr v0, v1

    .line 102
    iput v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPIndex:I

    .line 103
    .line 104
    :cond_2
    return v1
.end method

.method private getParamsFromUrl(Ljava/lang/String;)Ljava/util/HashMap;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "[?]"

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_2

    .line 13
    .line 14
    array-length v1, p1

    .line 15
    const/4 v2, 0x2

    .line 16
    if-lt v1, v2, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    aget-object v3, p1, v1

    .line 20
    .line 21
    if-eqz v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    aget-object p1, p1, v1

    .line 31
    .line 32
    const-string v3, "[&]"

    .line 33
    .line 34
    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    array-length v3, p1

    .line 39
    const/4 v4, 0x0

    .line 40
    move v5, v4

    .line 41
    :goto_0
    if-ge v5, v3, :cond_2

    .line 42
    .line 43
    aget-object v6, p1, v5

    .line 44
    .line 45
    const-string v7, "="

    .line 46
    .line 47
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const/4 v8, -0x1

    .line 52
    if-eq v7, v8, :cond_1

    .line 53
    .line 54
    const-string v7, "[=]"

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    array-length v7, v6

    .line 61
    if-ne v7, v2, :cond_1

    .line 62
    .line 63
    aget-object v7, v6, v4

    .line 64
    .line 65
    aget-object v6, v6, v1

    .line 66
    .line 67
    invoke-virtual {v0, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    :goto_1
    return-object v0
.end method

.method private getRtmpRealConnectInfo()Lcom/tencent/liteav/network/TXCStreamUploader$b;
    .locals 10

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mEnableNearestIP:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamUploader$b;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 9
    .line 10
    invoke-direct {v0, p0, v2, v1}, Lcom/tencent/liteav/network/TXCStreamUploader$b;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;Z)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamUploader$b;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 21
    .line 22
    invoke-direct {v0, p0, v2, v1}, Lcom/tencent/liteav/network/TXCStreamUploader$b;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    iget v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-ge v2, v0, :cond_6

    .line 33
    .line 34
    iget v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 35
    .line 36
    if-gez v0, :cond_2

    .line 37
    .line 38
    goto/16 :goto_2

    .line 39
    .line 40
    :cond_2
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/tencent/liteav/network/a;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 49
    .line 50
    const-string v3, "://"

    .line 51
    .line 52
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    array-length v4, v2

    .line 57
    const/4 v5, 0x2

    .line 58
    if-ge v4, v5, :cond_3

    .line 59
    .line 60
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamUploader$b;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v0, p0, v2, v1}, Lcom/tencent/liteav/network/TXCStreamUploader$b;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :cond_3
    const/4 v4, 0x1

    .line 69
    aget-object v5, v2, v4

    .line 70
    .line 71
    const-string v6, "/"

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    iget-object v7, v0, Lcom/tencent/liteav/network/a;->a:Ljava/lang/String;

    .line 78
    .line 79
    const-string v8, ":"

    .line 80
    .line 81
    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    array-length v7, v7

    .line 86
    if-le v7, v4, :cond_4

    .line 87
    .line 88
    iget-object v7, v0, Lcom/tencent/liteav/network/a;->a:Ljava/lang/String;

    .line 89
    .line 90
    const-string v9, "["

    .line 91
    .line 92
    invoke-virtual {v7, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-nez v7, :cond_4

    .line 97
    .line 98
    new-instance v7, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v8, v0, Lcom/tencent/liteav/network/a;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v8, "]:"

    .line 112
    .line 113
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    iget-object v8, v0, Lcom/tencent/liteav/network/a;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    aput-object v7, v5, v1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    iget-object v9, v0, Lcom/tencent/liteav/network/a;->a:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    iget-object v8, v0, Lcom/tencent/liteav/network/a;->b:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    aput-object v7, v5, v1

    .line 151
    .line 152
    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    aget-object v8, v5, v1

    .line 155
    .line 156
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    array-length v8, v5

    .line 160
    if-ge v4, v8, :cond_5

    .line 161
    .line 162
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    aget-object v8, v5, v4

    .line 166
    .line 167
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    add-int/lit8 v4, v4, 0x1

    .line 171
    .line 172
    goto :goto_1

    .line 173
    :cond_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 174
    .line 175
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 176
    .line 177
    .line 178
    aget-object v1, v2, v1

    .line 179
    .line 180
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    new-instance v2, Lcom/tencent/liteav/network/TXCStreamUploader$b;

    .line 198
    .line 199
    iget-boolean v0, v0, Lcom/tencent/liteav/network/a;->c:Z

    .line 200
    .line 201
    invoke-direct {v2, p0, v1, v0}, Lcom/tencent/liteav/network/TXCStreamUploader$b;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;Z)V

    .line 202
    .line 203
    .line 204
    return-object v2

    .line 205
    :cond_6
    :goto_2
    new-instance v0, Lcom/tencent/liteav/network/TXCStreamUploader$b;

    .line 206
    .line 207
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 208
    .line 209
    invoke-direct {v0, p0, v2, v1}, Lcom/tencent/liteav/network/TXCStreamUploader$b;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;Z)V

    .line 210
    .line 211
    .line 212
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

.method private internalReconnect(Z)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 9
    .line 10
    const/16 v2, -0x52c

    .line 11
    .line 12
    const-string v3, ")"

    .line 13
    .line 14
    const-string v4, " to "

    .line 15
    .line 16
    const-string v5, "reconnect network switch from "

    .line 17
    .line 18
    const-string v6, " retry limit:"

    .line 19
    .line 20
    const/16 v7, 0x44e

    .line 21
    .line 22
    const-string v8, ""

    .line 23
    .line 24
    const/4 v9, 0x2

    .line 25
    const/4 v10, 0x1

    .line 26
    const-string v11, "TXCStreamUploader"

    .line 27
    .line 28
    const/4 v12, 0x0

    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    iget v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 32
    .line 33
    iget-object v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 34
    .line 35
    invoke-static {v13}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 36
    .line 37
    .line 38
    move-result v13

    .line 39
    if-eq v1, v13, :cond_1

    .line 40
    .line 41
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 58
    .line 59
    invoke-static {v2}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v11, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 74
    .line 75
    invoke-static {v1}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iput v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 80
    .line 81
    iput v12, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 82
    .line 83
    const-string v1, "WebrtcRoom: need enter again by user"

    .line 84
    .line 85
    invoke-static {v9, v1, v8, v12}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    const-string v1, "Network type has changed. Need to re-enter the room"

    .line 89
    .line 90
    new-array v2, v12, [Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/16 v2, 0x3fd

    .line 97
    .line 98
    invoke-direct {v0, v2, v1}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_1
    iget v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 103
    .line 104
    iget-object v4, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 105
    .line 106
    iget v4, v4, Lcom/tencent/liteav/network/l;->e:I

    .line 107
    .line 108
    const-string v5, "Network: reconnecting to upload server with quic.[addr:%s][retryCount:%d][retryLimit:%d]"

    .line 109
    .line 110
    if-ge v1, v4, :cond_2

    .line 111
    .line 112
    add-int/2addr v1, v10

    .line 113
    iput v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 114
    .line 115
    iget-object v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 116
    .line 117
    iget-object v2, v2, Lcom/tencent/liteav/network/TXCStreamUploader$a;->h:Ljava/lang/String;

    .line 118
    .line 119
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iget-object v4, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 124
    .line 125
    iget v4, v4, Lcom/tencent/liteav/network/l;->e:I

    .line 126
    .line 127
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    filled-new-array {v2, v1, v4}, [Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {v9, v1, v8, v12}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    iget-object v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 143
    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v2, "reconnect rtmp-proxy server(econnect retry count:"

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    iget v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    iget-object v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 163
    .line 164
    iget v2, v2, Lcom/tencent/liteav/network/l;->e:I

    .line 165
    .line 166
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v19

    .line 176
    const/16 v20, 0x0

    .line 177
    .line 178
    const v14, 0x1637b

    .line 179
    .line 180
    .line 181
    const-wide/16 v15, -0x1

    .line 182
    .line 183
    const-wide/16 v17, -0x1

    .line 184
    .line 185
    invoke-static/range {v13 .. v20}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 186
    .line 187
    .line 188
    invoke-direct {v0, v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    .line 189
    .line 190
    .line 191
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 192
    .line 193
    iget-boolean v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 194
    .line 195
    invoke-direct {v0, v1, v2, v12}, Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :cond_2
    invoke-direct {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->getNextRtmpProxyIP()Z

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-eqz v1, :cond_3

    .line 204
    .line 205
    iput v12, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 206
    .line 207
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 208
    .line 209
    iget-object v1, v1, Lcom/tencent/liteav/network/TXCStreamUploader$a;->h:Ljava/lang/String;

    .line 210
    .line 211
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    iget-object v3, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 216
    .line 217
    iget v3, v3, Lcom/tencent/liteav/network/l;->e:I

    .line 218
    .line 219
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    filled-new-array {v1, v2, v3}, [Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-static {v5, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {v9, v1, v8, v12}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 232
    .line 233
    .line 234
    invoke-direct {v0, v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    .line 235
    .line 236
    .line 237
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 238
    .line 239
    iget-boolean v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 240
    .line 241
    invoke-direct {v0, v1, v2, v12}, Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_3
    iget-object v3, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 246
    .line 247
    const-string v9, "connect rtmp-proxy server failed(try all addresses)"

    .line 248
    .line 249
    const/4 v10, 0x0

    .line 250
    const v4, 0x1637a

    .line 251
    .line 252
    .line 253
    const-wide/16 v5, -0x1

    .line 254
    .line 255
    const-wide/16 v7, -0x1

    .line 256
    .line 257
    invoke-static/range {v3 .. v10}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 258
    .line 259
    .line 260
    invoke-direct {v0, v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    .line 261
    .line 262
    .line 263
    return-void

    .line 264
    :cond_4
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 265
    .line 266
    invoke-virtual {v1}, Lcom/tencent/liteav/network/n;->c()V

    .line 267
    .line 268
    .line 269
    iget-boolean v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mEnableNearestIP:Z

    .line 270
    .line 271
    if-eqz v1, :cond_5

    .line 272
    .line 273
    iget v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 274
    .line 275
    iget-object v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 276
    .line 277
    invoke-static {v13}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    if-eq v1, v13, :cond_5

    .line 282
    .line 283
    new-instance v1, Ljava/lang/StringBuilder;

    .line 284
    .line 285
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    iget v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 292
    .line 293
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    iget-object v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 300
    .line 301
    invoke-static {v2}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-static {v11, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 316
    .line 317
    invoke-static {v1}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 318
    .line 319
    .line 320
    move-result v1

    .line 321
    iput v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 322
    .line 323
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIntelligentRoute:Lcom/tencent/liteav/network/c;

    .line 324
    .line 325
    iget-object v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 326
    .line 327
    iget v3, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mChannelType:I

    .line 328
    .line 329
    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/network/c;->a(Ljava/lang/String;I)V

    .line 330
    .line 331
    .line 332
    iput v12, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 333
    .line 334
    return-void

    .line 335
    :cond_5
    iget-boolean v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mEnableNearestIP:Z

    .line 336
    .line 337
    if-nez v1, :cond_6

    .line 338
    .line 339
    move v1, v12

    .line 340
    goto :goto_0

    .line 341
    :cond_6
    move/from16 v1, p1

    .line 342
    .line 343
    :goto_0
    iget-boolean v4, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 344
    .line 345
    if-ne v4, v10, :cond_7

    .line 346
    .line 347
    move v1, v10

    .line 348
    :cond_7
    if-ne v1, v10, :cond_8

    .line 349
    .line 350
    invoke-direct {v0, v10}, Lcom/tencent/liteav/network/TXCStreamUploader;->nextRecordIdx(Z)Z

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    if-nez v1, :cond_8

    .line 355
    .line 356
    const-string v1, "reconnect: try all addresses failed"

    .line 357
    .line 358
    invoke-static {v11, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    iget-object v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 362
    .line 363
    const-string v19, "connect upload server failed(try all addresses failed)"

    .line 364
    .line 365
    const/16 v20, 0x0

    .line 366
    .line 367
    const v14, 0x1637a

    .line 368
    .line 369
    .line 370
    const-wide/16 v15, -0x1

    .line 371
    .line 372
    const-wide/16 v17, -0x1

    .line 373
    .line 374
    invoke-static/range {v13 .. v20}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 375
    .line 376
    .line 377
    :cond_8
    invoke-direct {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->getRtmpRealConnectInfo()Lcom/tencent/liteav/network/TXCStreamUploader$b;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    iget-object v4, v1, Lcom/tencent/liteav/network/TXCStreamUploader$b;->a:Ljava/lang/String;

    .line 382
    .line 383
    invoke-direct {v0, v4}, Lcom/tencent/liteav/network/TXCStreamUploader;->getAddressFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v4

    .line 387
    new-instance v5, Ljava/lang/StringBuilder;

    .line 388
    .line 389
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const-string v13, "reconnect change ip: "

    .line 393
    .line 394
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    const-string v13, " enableNearestIP: "

    .line 401
    .line 402
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    iget-boolean v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mEnableNearestIP:Z

    .line 406
    .line 407
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v13, " last channel type: "

    .line 411
    .line 412
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    iget-boolean v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 416
    .line 417
    if-eqz v13, :cond_9

    .line 418
    .line 419
    const-string v13, "Q Channel"

    .line 420
    .line 421
    goto :goto_1

    .line 422
    :cond_9
    const-string v13, "TCP"

    .line 423
    .line 424
    :goto_1
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    invoke-static {v11, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    iget-boolean v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 435
    .line 436
    if-ne v5, v10, :cond_a

    .line 437
    .line 438
    const-string v2, "reconnect last channel type is Q Channel\uff0cignore retry limit"

    .line 439
    .line 440
    invoke-static {v11, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    const-string v2, "Network: reconnecting to upload server with quic.[addr:%s]"

    .line 444
    .line 445
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    invoke-static {v9, v2, v8, v12}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 454
    .line 455
    .line 456
    iget-object v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader$b;->a:Ljava/lang/String;

    .line 457
    .line 458
    iget-boolean v1, v1, Lcom/tencent/liteav/network/TXCStreamUploader$b;->b:Z

    .line 459
    .line 460
    invoke-direct {v0, v2, v1, v12}, Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V

    .line 461
    .line 462
    .line 463
    invoke-direct {v0, v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    .line 464
    .line 465
    .line 466
    return-void

    .line 467
    :cond_a
    new-instance v5, Ljava/lang/StringBuilder;

    .line 468
    .line 469
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 470
    .line 471
    .line 472
    const-string v13, "reconnect retry count:"

    .line 473
    .line 474
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    iget v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 478
    .line 479
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    iget-object v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 486
    .line 487
    iget v13, v13, Lcom/tencent/liteav/network/l;->e:I

    .line 488
    .line 489
    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v5

    .line 496
    invoke-static {v11, v5}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    iget v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 500
    .line 501
    iget-object v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 502
    .line 503
    iget v13, v13, Lcom/tencent/liteav/network/l;->e:I

    .line 504
    .line 505
    if-ge v5, v13, :cond_b

    .line 506
    .line 507
    add-int/2addr v5, v10

    .line 508
    iput v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 509
    .line 510
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    iget-object v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 515
    .line 516
    iget v5, v5, Lcom/tencent/liteav/network/l;->e:I

    .line 517
    .line 518
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    filled-new-array {v4, v2, v5}, [Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    const-string v4, "Network: reconnecting to upload server with tcp.[addr:%s][retryCount:%d][retryLimit:%d]"

    .line 527
    .line 528
    invoke-static {v4, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-static {v9, v2, v8, v12}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 533
    .line 534
    .line 535
    iget-object v13, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 536
    .line 537
    new-instance v2, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 540
    .line 541
    .line 542
    const-string v4, "reconnect upload server:(retry count:"

    .line 543
    .line 544
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    iget v4, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 548
    .line 549
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    iget-object v4, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 556
    .line 557
    iget v4, v4, Lcom/tencent/liteav/network/l;->e:I

    .line 558
    .line 559
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v19

    .line 569
    const/16 v20, 0x0

    .line 570
    .line 571
    const v14, 0x1637b

    .line 572
    .line 573
    .line 574
    const-wide/16 v15, -0x1

    .line 575
    .line 576
    const-wide/16 v17, -0x1

    .line 577
    .line 578
    invoke-static/range {v13 .. v20}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 579
    .line 580
    .line 581
    iget-object v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader$b;->a:Ljava/lang/String;

    .line 582
    .line 583
    iget-boolean v1, v1, Lcom/tencent/liteav/network/TXCStreamUploader$b;->b:Z

    .line 584
    .line 585
    invoke-direct {v0, v2, v1, v12}, Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V

    .line 586
    .line 587
    .line 588
    invoke-direct {v0, v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    .line 589
    .line 590
    .line 591
    return-void

    .line 592
    :cond_b
    const-string v1, "reconnect: try all times failed"

    .line 593
    .line 594
    invoke-static {v11, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    iget-object v3, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 598
    .line 599
    const-string v9, "connect upload server failed(try all times failed)"

    .line 600
    .line 601
    const/4 v10, 0x0

    .line 602
    const v4, 0x1637a

    .line 603
    .line 604
    .line 605
    const-wide/16 v5, -0x1

    .line 606
    .line 607
    const-wide/16 v7, -0x1

    .line 608
    .line 609
    invoke-static/range {v3 .. v10}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 610
    .line 611
    .line 612
    invoke-direct {v0, v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    .line 613
    .line 614
    .line 615
    return-void
.end method

.method private isQCloudStreamUrl(Ljava/lang/String;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "://"

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, -0x1

    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x3

    .line 21
    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const-string v1, "cloud.tencent.com"

    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    const/4 p1, 0x1

    .line 37
    return p1

    .line 38
    :cond_1
    :goto_0
    return v0
.end method

.method private native nativeCacheJNIParams()V
.end method

.method private native nativeEnableDrop(JZ)V
.end method

.method private native nativeGetStats(J)Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;
.end method

.method private native nativeInitRtmpMsgRecvThreadInstance(JJ)J
.end method

.method private native nativeInitRtmpProxyInstance(JJLjava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZLjava/lang/String;)J
.end method

.method private native nativeInitUploader(Ljava/lang/String;Ljava/lang/String;ZIIIIIIIZILjava/util/HashMap;)J
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "ZIIIIIIIZI",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)J"
        }
    .end annotation
.end method

.method private native nativeOnThreadRun(J)V
.end method

.method private native nativePushAAC(J[BJ)V
.end method

.method private native nativePushNAL(J[BIJJJ)V
.end method

.method private native nativeReleaseJNIParams()V
.end method

.method private native nativeRtmpMsgRecvThreadStart(J)V
.end method

.method private native nativeRtmpMsgRecvThreadStop(J)V
.end method

.method private native nativeRtmpProxyEnterRoom(J)V
.end method

.method private native nativeRtmpProxyLeaveRoom(J)V
.end method

.method private native nativeRtmpProxySendHeartBeat(JJJJJJJJJJJ)V
.end method

.method private native nativeSendRtmpProxyMsg(J[B)V
.end method

.method private native nativeSetSendStrategy(JIZ)V
.end method

.method private native nativeSetVideoDropParams(JZII)V
.end method

.method private native nativeStopPush(J)V
.end method

.method private native nativeUninitRtmpMsgRecvThreadInstance(J)V
.end method

.method private native nativeUninitRtmpProxyInstance(J)V
.end method

.method private native nativeUninitUploader(J)V
.end method

.method private nextRecordIdx(Z)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    if-ne p1, v0, :cond_1

    .line 15
    .line 16
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 17
    .line 18
    iget v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 19
    .line 20
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/tencent/liteav/network/a;

    .line 25
    .line 26
    iget v2, p1, Lcom/tencent/liteav/network/a;->e:I

    .line 27
    .line 28
    add-int/2addr v2, v0

    .line 29
    iput v2, p1, Lcom/tencent/liteav/network/a;->e:I

    .line 30
    .line 31
    :cond_1
    iget p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 32
    .line 33
    add-int/2addr p1, v0

    .line 34
    iget-object v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-ge p1, v2, :cond_2

    .line 41
    .line 42
    iget p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 43
    .line 44
    add-int/2addr p1, v0

    .line 45
    iput p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 46
    .line 47
    return v0

    .line 48
    :cond_2
    :goto_0
    return v1
.end method

.method private onRtmpProxyRoomEvent(II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string p2, "Already in room\uff0c[%d]"

    .line 13
    .line 14
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/16 p2, 0x3fa

    .line 19
    .line 20
    invoke-direct {p0, p2, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/4 v0, 0x2

    .line 25
    if-ne p1, v0, :cond_1

    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    const-string p2, "Not in the room\uff0c[%d]"

    .line 36
    .line 37
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/16 p2, 0x3fb

    .line 42
    .line 43
    invoke-direct {p0, p2, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(ILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method private onRtmpProxyUserListPushed([Lcom/tencent/liteav/network/TXCStreamUploader$RtmpProxyUserInfo;)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 10
    .line 11
    if-eqz v0, :cond_5

    .line 12
    .line 13
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    goto :goto_3

    .line 18
    :cond_2
    :try_start_0
    new-instance v0, Lorg/json/JSONArray;

    .line 19
    .line 20
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lorg/json/JSONArray;

    .line 24
    .line 25
    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    :goto_0
    array-length v3, p1

    .line 30
    if-ge v2, v3, :cond_4

    .line 31
    .line 32
    new-instance v3, Lorg/json/JSONObject;

    .line 33
    .line 34
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v4, "userid"

    .line 38
    .line 39
    aget-object v5, p1, v2

    .line 40
    .line 41
    iget-object v5, v5, Lcom/tencent/liteav/network/TXCStreamUploader$RtmpProxyUserInfo;->account:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    .line 45
    .line 46
    const-string v4, "playurl"

    .line 47
    .line 48
    aget-object v5, p1, v2

    .line 49
    .line 50
    iget-object v5, v5, Lcom/tencent/liteav/network/TXCStreamUploader$RtmpProxyUserInfo;->playUrl:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    .line 55
    aget-object v4, p1, v2

    .line 56
    .line 57
    iget v4, v4, Lcom/tencent/liteav/network/TXCStreamUploader$RtmpProxyUserInfo;->stmType:I

    .line 58
    .line 59
    if-nez v4, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception p1

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 68
    .line 69
    .line 70
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    new-instance p1, Lorg/json/JSONObject;

    .line 74
    .line 75
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v2, "userlist"

    .line 79
    .line 80
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 81
    .line 82
    .line 83
    const-string v0, "userlist_aux"

    .line 84
    .line 85
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const/16 v0, 0x3fc

    .line 93
    .line 94
    invoke-direct {p0, v0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :goto_2
    const-string v0, "TXCStreamUploader"

    .line 99
    .line 100
    const-string v1, "build json object failed."

    .line 101
    .line 102
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    :goto_3
    return-void
.end method

.method private onSendRtmpProxyMsg([B)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 5
    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    cmp-long v3, v1, v3

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    invoke-direct {p0, v1, v2, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeSendRtmpProxyMsg(J[B)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    monitor-exit v0

    .line 19
    return-void

    .line 20
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    throw p1
.end method

.method private parseProxyInfo(Ljava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v3, "_"

    .line 6
    .line 7
    const-string v4, "Key"

    .line 8
    .line 9
    if-eqz v2, :cond_c

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_c

    .line 16
    .line 17
    const-string v0, "room"

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    goto/16 :goto_5

    .line 26
    .line 27
    :cond_0
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 28
    .line 29
    invoke-direct/range {p0 .. p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->isQCloudStreamUrl(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    iput-boolean v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->i:Z

    .line 34
    .line 35
    invoke-direct/range {p0 .. p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->getParamsFromUrl(Ljava/lang/String;)Ljava/util/HashMap;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    if-nez v5, :cond_1

    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    const-string v0, "sdkappid"

    .line 44
    .line 45
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-eqz v6, :cond_2

    .line 50
    .line 51
    iget-object v6, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 52
    .line 53
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 64
    .line 65
    .line 66
    move-result-wide v7

    .line 67
    iput-wide v7, v6, Lcom/tencent/liteav/network/TXCStreamUploader$a;->a:J

    .line 68
    .line 69
    :cond_2
    const-string v0, "roomid"

    .line 70
    .line 71
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_c

    .line 76
    .line 77
    const-string v6, "userid"

    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_c

    .line 84
    .line 85
    const-string v7, "roomsig"

    .line 86
    .line 87
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    if-nez v8, :cond_3

    .line 92
    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_3
    iget-object v8, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 96
    .line 97
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    check-cast v0, Ljava/lang/String;

    .line 102
    .line 103
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 108
    .line 109
    .line 110
    move-result-wide v9

    .line 111
    iput-wide v9, v8, Lcom/tencent/liteav/network/TXCStreamUploader$a;->d:J

    .line 112
    .line 113
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 114
    .line 115
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Ljava/lang/String;

    .line 120
    .line 121
    iput-object v6, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->c:Ljava/lang/String;

    .line 122
    .line 123
    const-string v0, "bizbuf"

    .line 124
    .line 125
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    const-string v8, "TXCStreamUploader"

    .line 130
    .line 131
    const-string v9, "UTF-8"

    .line 132
    .line 133
    if-eqz v6, :cond_4

    .line 134
    .line 135
    :try_start_0
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Ljava/lang/String;

    .line 140
    .line 141
    iget-object v6, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 142
    .line 143
    invoke-static {v0, v9}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    iput-object v0, v6, Lcom/tencent/liteav/network/TXCStreamUploader$a;->j:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :catch_0
    move-exception v0

    .line 151
    const-string v6, "decode bizbuf failed."

    .line 152
    .line 153
    invoke-static {v8, v6, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    :cond_4
    :goto_0
    :try_start_1
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v0, v9}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v5, Lorg/json/JSONObject;

    .line 167
    .line 168
    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 172
    .line 173
    const-wide/16 v6, 0x0

    .line 174
    .line 175
    iput-wide v6, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->b:J

    .line 176
    .line 177
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-nez v0, :cond_5

    .line 182
    .line 183
    goto/16 :goto_5

    .line 184
    .line 185
    :cond_5
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 186
    .line 187
    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    iput-object v4, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->e:Ljava/lang/String;

    .line 192
    .line 193
    const-string v0, "RtmpProxy"

    .line 194
    .line 195
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 196
    .line 197
    .line 198
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 199
    const-string v4, "Type"

    .line 200
    .line 201
    const-string v6, "Port"

    .line 202
    .line 203
    const-string v7, "Ip"

    .line 204
    .line 205
    if-eqz v0, :cond_6

    .line 206
    .line 207
    :try_start_2
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    if-eqz v9, :cond_c

    .line 212
    .line 213
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 214
    .line 215
    .line 216
    move-result v9

    .line 217
    if-eqz v9, :cond_c

    .line 218
    .line 219
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    if-nez v9, :cond_6

    .line 224
    .line 225
    goto/16 :goto_5

    .line 226
    .line 227
    :catch_1
    move-exception v0

    .line 228
    goto/16 :goto_4

    .line 229
    .line 230
    :cond_6
    const-string v9, "AccessList"

    .line 231
    .line 232
    invoke-virtual {v5, v9}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    const/4 v9, 0x0

    .line 237
    if-eqz v5, :cond_9

    .line 238
    .line 239
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    if-lez v10, :cond_9

    .line 244
    .line 245
    move v10, v9

    .line 246
    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    if-ge v10, v11, :cond_9

    .line 251
    .line 252
    invoke-virtual {v5, v10}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 253
    .line 254
    .line 255
    move-result-object v11

    .line 256
    if-eqz v11, :cond_8

    .line 257
    .line 258
    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 259
    .line 260
    .line 261
    move-result v12

    .line 262
    if-eqz v12, :cond_8

    .line 263
    .line 264
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 265
    .line 266
    .line 267
    move-result v12

    .line 268
    if-eqz v12, :cond_8

    .line 269
    .line 270
    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    if-nez v12, :cond_7

    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_7
    invoke-virtual {v11, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v12

    .line 281
    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 282
    .line 283
    .line 284
    move-result-wide v13

    .line 285
    invoke-virtual {v11, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 286
    .line 287
    .line 288
    move-result-wide v15

    .line 289
    const-wide/16 v17, 0x2

    .line 290
    .line 291
    cmp-long v11, v15, v17

    .line 292
    .line 293
    if-nez v11, :cond_8

    .line 294
    .line 295
    iget-object v11, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPList:Ljava/util/Vector;

    .line 296
    .line 297
    new-instance v15, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    const-string v12, ":"

    .line 306
    .line 307
    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v15, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v12

    .line 317
    invoke-virtual {v11, v12}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    :cond_8
    :goto_2
    add-int/lit8 v10, v10, 0x1

    .line 321
    .line 322
    goto :goto_1

    .line 323
    :cond_9
    iget-object v4, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 324
    .line 325
    iget-boolean v4, v4, Lcom/tencent/liteav/network/TXCStreamUploader$a;->i:Z

    .line 326
    .line 327
    if-eqz v4, :cond_b

    .line 328
    .line 329
    if-nez v0, :cond_a

    .line 330
    .line 331
    goto/16 :goto_5

    .line 332
    .line 333
    :cond_a
    const-string v4, "?"

    .line 334
    .line 335
    invoke-virtual {v2, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 336
    .line 337
    .line 338
    move-result v4

    .line 339
    invoke-virtual {v2, v9, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    new-instance v4, Ljava/lang/StringBuilder;

    .line 344
    .line 345
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    .line 347
    .line 348
    iget-object v5, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 349
    .line 350
    iget-wide v9, v5, Lcom/tencent/liteav/network/TXCStreamUploader$a;->a:J

    .line 351
    .line 352
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    iget-object v5, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 359
    .line 360
    iget-wide v9, v5, Lcom/tencent/liteav/network/TXCStreamUploader$a;->d:J

    .line 361
    .line 362
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    iget-object v3, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 369
    .line 370
    iget-object v3, v3, Lcom/tencent/liteav/network/TXCStreamUploader$a;->c:Ljava/lang/String;

    .line 371
    .line 372
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    new-instance v4, Ljava/lang/StringBuilder;

    .line 380
    .line 381
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    .line 386
    .line 387
    const-string v2, "/webrtc/"

    .line 388
    .line 389
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 393
    .line 394
    .line 395
    const-string v2, "?real_rtmp_ip="

    .line 396
    .line 397
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string v2, "&real_rtmp_port="

    .line 408
    .line 409
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 413
    .line 414
    .line 415
    move-result-wide v2

    .line 416
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    const-string v0, "&tinyid="

    .line 420
    .line 421
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    iget-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 425
    .line 426
    iget-wide v2, v0, Lcom/tencent/liteav/network/TXCStreamUploader$a;->b:J

    .line 427
    .line 428
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    const-string v0, "&srctinyid=0"

    .line 432
    .line 433
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    iput-object v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 441
    .line 442
    invoke-direct {v1}, Lcom/tencent/liteav/network/TXCStreamUploader;->getNextRtmpProxyIP()Z

    .line 443
    .line 444
    .line 445
    goto :goto_3

    .line 446
    :cond_b
    iput-object v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 447
    .line 448
    iput-boolean v9, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 449
    .line 450
    :goto_3
    const/4 v0, 0x1

    .line 451
    iput-boolean v0, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 452
    .line 453
    goto :goto_5

    .line 454
    :goto_4
    const-string v2, "parse proxy info failed."

    .line 455
    .line 456
    invoke-static {v8, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 457
    .line 458
    .line 459
    :cond_c
    :goto_5
    return-void
.end method

.method private postReconnectMsg(Ljava/lang/String;ZI)V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Message;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 4
    .line 5
    .line 6
    const/16 v1, 0x65

    .line 7
    .line 8
    iput v1, v0, Landroid/os/Message;->what:I

    .line 9
    .line 10
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    :goto_0
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 18
    .line 19
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    int-to-long p2, p3

    .line 24
    invoke-virtual {p1, v0, p2, p3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method private reconnect(Z)V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->stopPushTask()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Lcom/tencent/liteav/network/TXCStreamUploader$3;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader$3;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Z)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 14
    .line 15
    iget p1, p1, Lcom/tencent/liteav/network/l;->f:I

    .line 16
    .line 17
    mul-int/lit16 p1, p1, 0x3e8

    .line 18
    .line 19
    int-to-long v2, p1

    .line 20
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method private reportNetStatus()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 4
    .line 5
    .line 6
    move-result-wide v7

    .line 7
    iget-wide v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastTimeStamp:J

    .line 8
    .line 9
    sub-long v5, v7, v1

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->getUploadStats()Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/16 v10, 0x1b60

    .line 22
    .line 23
    const/16 v11, 0x1b5f

    .line 24
    .line 25
    const/16 v12, 0x1b5e

    .line 26
    .line 27
    const/16 v13, 0x1b5d

    .line 28
    .line 29
    if-eqz v9, :cond_2

    .line 30
    .line 31
    iget-object v3, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastUploadStats:Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    iget-wide v1, v3, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->inVideoBytes:J

    .line 36
    .line 37
    iget-wide v3, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->inVideoBytes:J

    .line 38
    .line 39
    invoke-direct/range {v0 .. v6}, Lcom/tencent/liteav/network/TXCStreamUploader;->getSpeed(JJJ)Ljava/lang/Long;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v14

    .line 47
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastUploadStats:Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 48
    .line 49
    iget-wide v1, v1, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->inAudioBytes:J

    .line 50
    .line 51
    iget-wide v3, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->inAudioBytes:J

    .line 52
    .line 53
    invoke-direct/range {v0 .. v6}, Lcom/tencent/liteav/network/TXCStreamUploader;->getSpeed(JJJ)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 58
    .line 59
    .line 60
    move-result-wide v16

    .line 61
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastUploadStats:Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 62
    .line 63
    iget-wide v1, v1, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->outVideoBytes:J

    .line 64
    .line 65
    iget-wide v3, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->outVideoBytes:J

    .line 66
    .line 67
    invoke-direct/range {v0 .. v6}, Lcom/tencent/liteav/network/TXCStreamUploader;->getSpeed(JJJ)Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v18

    .line 75
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastUploadStats:Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 76
    .line 77
    iget-wide v1, v1, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->outAudioBytes:J

    .line 78
    .line 79
    iget-wide v3, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->outAudioBytes:J

    .line 80
    .line 81
    invoke-direct/range {v0 .. v6}, Lcom/tencent/liteav/network/TXCStreamUploader;->getSpeed(JJJ)Ljava/lang/Long;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 86
    .line 87
    .line 88
    move-result-wide v1

    .line 89
    move-wide v3, v1

    .line 90
    move-wide v1, v14

    .line 91
    goto :goto_0

    .line 92
    :cond_0
    move-wide v3, v1

    .line 93
    move-wide/from16 v16, v3

    .line 94
    .line 95
    move-wide/from16 v18, v16

    .line 96
    .line 97
    :goto_0
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->videoCacheLen:J

    .line 98
    .line 99
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v0, v13, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->audioCacheLen:J

    .line 107
    .line 108
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v0, v12, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->videoDropCount:J

    .line 116
    .line 117
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v0, v11, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->audioDropCount:J

    .line 125
    .line 126
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-virtual {v0, v10, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->bandwidthEst:J

    .line 134
    .line 135
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    const/16 v6, 0x1b6d

    .line 140
    .line 141
    invoke-virtual {v0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->startTS:J

    .line 145
    .line 146
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    const/16 v6, 0x1b61

    .line 151
    .line 152
    invoke-virtual {v0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->dnsTS:J

    .line 156
    .line 157
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    const/16 v6, 0x1b62

    .line 162
    .line 163
    invoke-virtual {v0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    iget-wide v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->connTS:J

    .line 167
    .line 168
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    const/16 v6, 0x1b63

    .line 173
    .line 174
    invoke-virtual {v0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    iget-object v5, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->serverIP:Ljava/lang/String;

    .line 178
    .line 179
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    const/16 v6, 0x1b64

    .line 184
    .line 185
    invoke-virtual {v0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    iget-boolean v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 189
    .line 190
    if-eqz v5, :cond_1

    .line 191
    .line 192
    const-wide/16 v5, 0x2

    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_1
    const-wide/16 v5, 0x1

    .line 196
    .line 197
    :goto_1
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    const/16 v6, 0x1b65

    .line 202
    .line 203
    invoke-virtual {v0, v6, v5}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    const/16 v5, 0x1b66

    .line 207
    .line 208
    iget-object v6, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->connectionID:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v0, v5, v6}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    const/16 v5, 0x1b67

    .line 214
    .line 215
    iget-object v6, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->connectionStats:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v0, v5, v6}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    iget-object v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 221
    .line 222
    iget-wide v10, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->videoDropCount:J

    .line 223
    .line 224
    iget-wide v12, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->audioDropCount:J

    .line 225
    .line 226
    invoke-virtual {v5, v10, v11, v12, v13}, Lcom/tencent/liteav/network/n;->a(JJ)V

    .line 227
    .line 228
    .line 229
    iget-object v5, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 230
    .line 231
    iget-wide v10, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->videoCacheLen:J

    .line 232
    .line 233
    iget-wide v12, v9, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->audioCacheLen:J

    .line 234
    .line 235
    invoke-virtual {v5, v10, v11, v12, v13}, Lcom/tencent/liteav/network/n;->b(JJ)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_2
    invoke-virtual {v0, v13, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v12, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v11, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v10, v3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-wide v3, v1

    .line 252
    move-wide/from16 v16, v3

    .line 253
    .line 254
    move-wide/from16 v18, v16

    .line 255
    .line 256
    :goto_2
    const/16 v5, 0x1b59

    .line 257
    .line 258
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v0, v5, v1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    const/16 v1, 0x1b5a

    .line 266
    .line 267
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    const/16 v1, 0x1b5b

    .line 275
    .line 276
    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 277
    .line 278
    .line 279
    move-result-object v2

    .line 280
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    const/16 v1, 0x1b5c

    .line 284
    .line 285
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    iput-wide v7, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastTimeStamp:J

    .line 293
    .line 294
    iput-object v9, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastUploadStats:Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 295
    .line 296
    iget-object v1, v0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 297
    .line 298
    if-eqz v1, :cond_3

    .line 299
    .line 300
    const/16 v2, 0x67

    .line 301
    .line 302
    const-wide/16 v3, 0x7d0

    .line 303
    .line 304
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 305
    .line 306
    .line 307
    :cond_3
    return-void
.end method

.method private rtmpProxySendHeartBeat()V
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/liteav/basic/util/e;->a()[I

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v2, 0x0

    .line 8
    aget v2, v0, v2

    .line 9
    .line 10
    div-int/lit8 v2, v2, 0xa

    .line 11
    .line 12
    int-to-long v4, v2

    .line 13
    const/4 v2, 0x1

    .line 14
    aget v0, v0, v2

    .line 15
    .line 16
    div-int/lit8 v0, v0, 0xa

    .line 17
    .line 18
    int-to-long v6, v0

    .line 19
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v2, 0x1b5c

    .line 24
    .line 25
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    int-to-long v8, v0

    .line 30
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/16 v2, 0x1b5b

    .line 35
    .line 36
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    int-to-long v10, v0

    .line 41
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/16 v2, 0x3e9

    .line 46
    .line 47
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    int-to-long v12, v0

    .line 52
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/16 v2, 0xfa1

    .line 57
    .line 58
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    int-to-long v14, v0

    .line 63
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/16 v2, 0x1b5e

    .line 68
    .line 69
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    int-to-long v2, v0

    .line 74
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    move-wide/from16 v16, v2

    .line 79
    .line 80
    const/16 v2, 0x1b5d

    .line 81
    .line 82
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    int-to-long v2, v0

    .line 87
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-wide/from16 v18, v2

    .line 92
    .line 93
    const/16 v2, 0x1b60

    .line 94
    .line 95
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    int-to-long v2, v0

    .line 100
    invoke-virtual {v1}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    move-wide/from16 v20, v2

    .line 105
    .line 106
    const/16 v2, 0x1b5f

    .line 107
    .line 108
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->c(Ljava/lang/String;I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    int-to-long v2, v0

    .line 113
    move-wide/from16 v22, v2

    .line 114
    .line 115
    iget-object v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyLock:Ljava/lang/Object;

    .line 116
    .line 117
    monitor-enter v2

    .line 118
    move-object/from16 v24, v2

    .line 119
    .line 120
    :try_start_0
    iget-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    .line 121
    .line 122
    invoke-direct/range {v1 .. v23}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeRtmpProxySendHeartBeat(JJJJJJJJJJJ)V

    .line 123
    .line 124
    .line 125
    monitor-exit v24

    .line 126
    return-void

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    monitor-exit v24
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    throw v0
.end method

.method private sendNotifyEvent(I)V
    .locals 7

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 10
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->reconnect(Z)V

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 11
    invoke-direct {p0, v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->reconnect(Z)V

    return-void

    :cond_1
    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_2

    .line 12
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectSuccessTimeStamps:J

    :cond_2
    const-wide/16 v1, 0x7d0

    const/16 v3, 0x68

    const/16 v4, 0x402

    if-ne p1, v4, :cond_3

    .line 13
    iget-boolean p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    if-eqz p1, :cond_10

    .line 14
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadLock:Ljava/lang/Object;

    monitor-enter p1

    .line 15
    :try_start_0
    iget-wide v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadInstance:J

    invoke-direct {p0, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeRtmpMsgRecvThreadStart(J)V

    .line 16
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyLock:Ljava/lang/Object;

    monitor-enter v0

    .line 18
    :try_start_1
    iget-wide v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    invoke-direct {p0, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeRtmpProxyEnterRoom(J)V

    .line 19
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_10

    .line 21
    invoke-virtual {p1, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :catchall_0
    move-exception p1

    .line 22
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception v0

    .line 23
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0

    .line 24
    :cond_3
    iget-object v5, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mNotifyListener:Ljava/lang/ref/WeakReference;

    if-eqz v5, :cond_10

    .line 25
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const/16 v6, -0x904

    if-eq p1, v6, :cond_f

    const/16 v6, -0x51b

    if-eq p1, v6, :cond_e

    if-eq p1, v4, :cond_d

    const/16 v1, 0xbbb

    if-eq p1, v1, :cond_c

    const/16 v1, -0x52d

    if-eq p1, v1, :cond_b

    const/16 v1, -0x52c

    if-eq p1, v1, :cond_a

    if-eq p1, v0, :cond_9

    const/16 v0, 0x3ea

    if-eq p1, v0, :cond_8

    const/16 v0, 0x44d

    if-eq p1, v0, :cond_7

    const/16 v0, 0x44e

    if-eq p1, v0, :cond_6

    const/16 v0, 0xbc0

    if-eq p1, v0, :cond_5

    const/16 v0, 0xbc1

    if-eq p1, v0, :cond_4

    .line 26
    const-string v0, "EVT_MSG"

    const-string v1, "UNKNOWN"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 27
    :cond_4
    const-string v0, "EVT_MSG"

    const-string v1, "Failed to connect server"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 28
    :cond_5
    const-string v0, "EVT_MSG"

    const-string v1, "No data is sent for more than 30s. Actively disconnect"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 29
    :cond_6
    const-string v0, "EVT_MSG"

    const-string v1, "Enables network reconnection"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 30
    :cond_7
    const-string v0, "EVT_MSG"

    const-string v1, "Insufficient upstream bandwidth. Data transmission is not timely"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_8
    const-string v0, "EVT_MSG"

    const-string v1, "rtmp start push stream"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 32
    :cond_9
    const-string v0, "EVT_MSG"

    const-string v1, "Already connected to rtmp server"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 33
    :cond_a
    const-string v0, "EVT_MSG"

    const-string v1, "Failed to connect all IPs, abort connection."

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 34
    :cond_b
    const-string v0, "EVT_MSG"

    const-string v1, "No internet. Please check if WiFi or mobile data is turned on"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 35
    :cond_c
    const-string v0, "EVT_MSG"

    const-string v1, "RTMP servers handshake failed"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 36
    :cond_d
    iget-boolean p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    if-eqz p1, :cond_10

    .line 37
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadLock:Ljava/lang/Object;

    monitor-enter p1

    .line 38
    :try_start_4
    iget-wide v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadInstance:J

    invoke-direct {p0, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeRtmpMsgRecvThreadStart(J)V

    .line 39
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 40
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyLock:Ljava/lang/Object;

    monitor-enter v0

    .line 41
    :try_start_5
    iget-wide v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    invoke-direct {p0, v4, v5}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeRtmpProxyEnterRoom(J)V

    .line 42
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 43
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    if-eqz p1, :cond_10

    .line 44
    invoke-virtual {p1, v3, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    :catchall_2
    move-exception p1

    .line 45
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    throw p1

    :catchall_3
    move-exception v0

    .line 46
    :try_start_7
    monitor-exit p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw v0

    .line 47
    :cond_e
    const-string v0, "EVT_MSG"

    const-string v1, "failed to connect server for several times, abort connection"

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 48
    :cond_f
    const-string v0, "EVT_MSG"

    const-string v1, "The server rejects the connection request. It may be that the push URL has been occupied or expired, or the anti-leech link is wrong."

    invoke-virtual {v5, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    :goto_0
    const-string v0, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v1

    invoke-virtual {v5, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 50
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mNotifyListener:Ljava/lang/ref/WeakReference;

    invoke-static {v0, p1, v5}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V

    :cond_10
    return-void
.end method

.method private sendNotifyEvent(ILjava/lang/String;)V
    .locals 7

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 3
    const-string v1, "EVT_MSG"

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    const-string p2, "EVT_TIME"

    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    move-result-wide v1

    invoke-virtual {v0, p2, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 5
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mNotifyListener:Ljava/lang/ref/WeakReference;

    invoke-static {p2, p1, v0}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILandroid/os/Bundle;)V

    goto :goto_1

    .line 6
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    :goto_1
    const/16 p2, 0x3ea

    if-ne p1, p2, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->getUploadStats()Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    iget-wide v1, p1, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->dnsparseTimeCost:J

    iget-wide v3, p1, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->connectTimeCost:J

    iget-wide v5, p1, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->handshakeTimeCost:J

    invoke-virtual/range {v0 .. v6}, Lcom/tencent/liteav/network/n;->a(JJJ)V

    return-void

    :cond_2
    const/16 p2, 0x44d

    if-ne p1, p2, :cond_3

    .line 9
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    invoke-virtual {p1}, Lcom/tencent/liteav/network/n;->d()V

    :cond_3
    return-void
.end method

.method private startPushTask(Ljava/lang/String;ZI)V
    .locals 4

    .line 1
    const-string p3, "TXCStreamUploader"

    .line 2
    .line 3
    const-string v0, "start push task"

    .line 4
    .line 5
    invoke-static {p3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-boolean p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    if-eq p3, p2, :cond_0

    .line 12
    .line 13
    if-ne p3, v0, :cond_0

    .line 14
    .line 15
    iget p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 16
    .line 17
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 22
    .line 23
    iget v1, v1, Lcom/tencent/liteav/network/l;->e:I

    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    filled-new-array {p3, v1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    const-string v1, "Network: switch push channel from quic to tcp.[retryCount:%d][retryLimit:%d]"

    .line 34
    .line 35
    invoke-static {v1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p3

    .line 39
    const-string v1, ""

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x2

    .line 43
    invoke-static {v3, p3, v1, v2}, Lcom/tencent/liteav/basic/module/Monitor;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    if-eqz p2, :cond_1

    .line 47
    .line 48
    iget p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountQuic:I

    .line 49
    .line 50
    add-int/2addr p3, v0

    .line 51
    iput p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountQuic:I

    .line 52
    .line 53
    int-to-long v0, p3

    .line 54
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    const/16 v0, 0x1b69

    .line 59
    .line 60
    invoke-virtual {p0, v0, p3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    iget p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountTcp:I

    .line 65
    .line 66
    add-int/2addr p3, v0

    .line 67
    iput p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountTcp:I

    .line 68
    .line 69
    int-to-long v0, p3

    .line 70
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    const/16 v0, 0x1b6a

    .line 75
    .line 76
    invoke-virtual {p0, v0, p3}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :goto_0
    new-instance p3, Lcom/tencent/liteav/network/TXCStreamUploader$2;

    .line 80
    .line 81
    const-string v0, "RTMPUpload"

    .line 82
    .line 83
    invoke-direct {p3, p0, v0, p2, p1}, Lcom/tencent/liteav/network/TXCStreamUploader$2;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Ljava/lang/String;ZLjava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iput-object p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThread:Ljava/lang/Thread;

    .line 87
    .line 88
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method private stopPushTask()V
    .locals 3

    .line 1
    const-string v0, "TXCStreamUploader"

    .line 2
    .line 3
    const-string v1, "stop push task"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mVecPendingNAL:Ljava/util/Vector;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/Vector;->removeAllElements()V

    .line 14
    .line 15
    .line 16
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 17
    .line 18
    invoke-direct {p0, v1, v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeStopPush(J)V

    .line 19
    .line 20
    .line 21
    monitor-exit v0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1
.end method

.method private tryResetRetryCount()V
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectSuccessTimeStamps:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iget-wide v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectSuccessTimeStamps:J

    .line 14
    .line 15
    sub-long/2addr v0, v4

    .line 16
    iget-object v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 17
    .line 18
    iget v5, v4, Lcom/tencent/liteav/network/l;->e:I

    .line 19
    .line 20
    iget v4, v4, Lcom/tencent/liteav/network/l;->f:I

    .line 21
    .line 22
    add-int/lit8 v4, v4, 0xd

    .line 23
    .line 24
    mul-int/2addr v5, v4

    .line 25
    mul-int/lit16 v5, v5, 0x3e8

    .line 26
    .line 27
    int-to-long v4, v5

    .line 28
    cmp-long v0, v0, v4

    .line 29
    .line 30
    if-lez v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 34
    .line 35
    iput-wide v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectSuccessTimeStamps:J

    .line 36
    .line 37
    const-string v0, "TXCStreamUploader"

    .line 38
    .line 39
    const-string v1, "reset retry count"

    .line 40
    .line 41
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method


# virtual methods
.method public getConfusionIP(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const-string v0, "."

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, -0x1

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v1, "A.B."

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :cond_0
    return-object p1
.end method

.method public getUploadStats()Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 5
    .line 6
    invoke-direct {p0, v1, v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeGetStats(J)Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    iget-boolean v2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-ne v2, v3, :cond_0

    .line 16
    .line 17
    const-wide/16 v2, 0x2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    :goto_0
    iput-wide v2, v1, Lcom/tencent/liteav/network/TXCStreamUploader$UploadStats;->channelType:J

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_2

    .line 27
    :cond_1
    :goto_1
    monitor-exit v0

    .line 28
    return-object v1

    .line 29
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw v1
.end method

.method public init()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onFetchDone(ILjava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/network/a;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "onFetchDone: code = "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v2, " ip count = "

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-string v2, "TXCStreamUploader"

    .line 39
    .line 40
    invoke-static {v2, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    if-nez p1, :cond_1

    .line 44
    .line 45
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iput v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mCurrentRecordIdx:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move p1, v0

    .line 55
    :goto_0
    if-lez p1, :cond_5

    .line 56
    .line 57
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string p2, ""

    .line 64
    .line 65
    move v1, v0

    .line 66
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    check-cast v2, Lcom/tencent/liteav/network/a;

    .line 77
    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    iget-boolean v3, v2, Lcom/tencent/liteav/network/a;->c:Z

    .line 81
    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    iget-object v3, v2, Lcom/tencent/liteav/network/a;->a:Ljava/lang/String;

    .line 85
    .line 86
    if-eqz v3, :cond_3

    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-lez v3, :cond_3

    .line 93
    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    :cond_3
    if-eqz v2, :cond_2

    .line 97
    .line 98
    new-instance v3, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string p2, " "

    .line 107
    .line 108
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    iget-object p2, v2, Lcom/tencent/liteav/network/a;->a:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {p0, p2}, Lcom/tencent/liteav/network/TXCStreamUploader;->getConfusionIP(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p2, ":"

    .line 121
    .line 122
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    iget-object p2, v2, Lcom/tencent/liteav/network/a;->b:Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    goto :goto_1

    .line 135
    :cond_4
    int-to-long v1, v1

    .line 136
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const/16 v1, 0x1b68

    .line 141
    .line 142
    invoke-virtual {p0, v1, p1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    new-instance p1, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 148
    .line 149
    .line 150
    const-string v1, "{"

    .line 151
    .line 152
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string p2, " }"

    .line 159
    .line 160
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const/16 p2, 0x1b6b

    .line 168
    .line 169
    invoke-virtual {p0, p2, p1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->getRtmpRealConnectInfo()Lcom/tencent/liteav/network/TXCStreamUploader$b;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iget-object p2, p1, Lcom/tencent/liteav/network/TXCStreamUploader$b;->a:Ljava/lang/String;

    .line 177
    .line 178
    iget-boolean p1, p1, Lcom/tencent/liteav/network/TXCStreamUploader$b;->b:Z

    .line 179
    .line 180
    invoke-direct {p0, p2, p1, v0}, Lcom/tencent/liteav/network/TXCStreamUploader;->postReconnectMsg(Ljava/lang/String;ZI)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public pushAAC([BJ)V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->tryResetRetryCount()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mAudioMuted:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    move-object p1, v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 20
    .line 21
    move-object v2, p0

    .line 22
    move-object v5, p1

    .line 23
    move-wide v6, p2

    .line 24
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativePushAAC(J[BJ)V

    .line 25
    .line 26
    .line 27
    :goto_0
    monitor-exit v1

    .line 28
    return-void

    .line 29
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    throw p1
.end method

.method public pushNAL(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->tryResetRetryCount()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v1

    .line 7
    :try_start_0
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 8
    .line 9
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    cmp-long v0, v3, v5

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object v5, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    array-length v0, v5

    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    iget v6, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 25
    .line 26
    iget-wide v7, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->frameIndex:J

    .line 27
    .line 28
    iget-wide v9, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 29
    .line 30
    iget-wide v11, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    .line 32
    move-object v2, p0

    .line 33
    :try_start_1
    invoke-direct/range {v2 .. v12}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativePushNAL(J[BIJJJ)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception v0

    .line 38
    :goto_0
    move-object p1, v0

    .line 39
    goto :goto_2

    .line 40
    :catchall_1
    move-exception v0

    .line 41
    move-object v2, p0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move-object v2, p0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v2, p0

    .line 46
    iget v0, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 47
    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v2, Lcom/tencent/liteav/network/TXCStreamUploader;->mVecPendingNAL:Ljava/util/Vector;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/Vector;->removeAllElements()V

    .line 53
    .line 54
    .line 55
    :cond_2
    iget-object v0, v2, Lcom/tencent/liteav/network/TXCStreamUploader;->mVecPendingNAL:Ljava/util/Vector;

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    :goto_1
    monitor-exit v1

    .line 61
    return-void

    .line 62
    :goto_2
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw p1
.end method

.method public setAudioInfo(II)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p2, v0, Lcom/tencent/liteav/network/l;->c:I

    .line 6
    .line 7
    iput p1, v0, Lcom/tencent/liteav/network/l;->d:I

    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public setAudioMute(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iput-boolean p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mAudioMuted:Z

    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 7
    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long p1, v1, v3

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 19
    .line 20
    iget-boolean p1, p1, Lcom/tencent/liteav/network/l;->j:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-boolean p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x2

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 p1, 0x1

    .line 35
    :goto_0
    const/4 v3, 0x0

    .line 36
    invoke-direct {p0, v1, v2, p1, v3}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeSetSendStrategy(JIZ)V

    .line 37
    .line 38
    .line 39
    :cond_2
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p1
.end method

.method public setDropEanble(Z)V
    .locals 3

    .line 1
    const-string v0, "TXCStreamUploader"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "drop enable "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string v2, "yes"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "no"

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v0

    .line 33
    :try_start_0
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 34
    .line 35
    invoke-direct {p0, v1, v2, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeEnableDrop(JZ)V

    .line 36
    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p1
.end method

.method public setMetaData(Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mMetaData:Ljava/util/HashMap;

    .line 2
    .line 3
    return-void
.end method

.method public setMode(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, v0, Lcom/tencent/liteav/network/l;->a:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public setNotifyListener(Lcom/tencent/liteav/basic/b/b;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public setRetryInterval(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, v0, Lcom/tencent/liteav/network/l;->f:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public setRetryTimes(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, v0, Lcom/tencent/liteav/network/l;->e:I

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public setSendStrategy(ZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 2
    .line 3
    iput-boolean p1, v0, Lcom/tencent/liteav/network/l;->j:Z

    .line 4
    .line 5
    iput-boolean p2, v0, Lcom/tencent/liteav/network/l;->k:Z

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/tencent/liteav/network/n;->a(Z)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-boolean p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move p1, v0

    .line 24
    :goto_0
    iget-boolean v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 25
    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIpList:Ljava/util/ArrayList;

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    move v0, p1

    .line 40
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 41
    .line 42
    monitor-enter p1

    .line 43
    :try_start_0
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 44
    .line 45
    const-wide/16 v3, 0x0

    .line 46
    .line 47
    cmp-long v3, v1, v3

    .line 48
    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    invoke-direct {p0, v1, v2, v0, p2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeSetSendStrategy(JIZ)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :catchall_0
    move-exception p2

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    int-to-long p1, v0

    .line 59
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const/16 p2, 0x1b6c

    .line 64
    .line 65
    invoke-virtual {p0, p2, p1}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :goto_3
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 70
    throw p2
.end method

.method public setVideoDropParams(ZII)V
    .locals 8

    .line 1
    const-string v0, "TXCStreamUploader"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "drop params wait i frame:"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string v2, "yes"

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string v2, "no"

    .line 19
    .line 20
    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v2, " max video count:"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v2, " max video cache time: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, " ms"

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 52
    .line 53
    monitor-enter v1

    .line 54
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mParam:Lcom/tencent/liteav/network/l;

    .line 55
    .line 56
    iput-boolean p1, v0, Lcom/tencent/liteav/network/l;->i:Z

    .line 57
    .line 58
    iput p2, v0, Lcom/tencent/liteav/network/l;->g:I

    .line 59
    .line 60
    iput p3, v0, Lcom/tencent/liteav/network/l;->h:I

    .line 61
    .line 62
    iget-wide v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 63
    .line 64
    const-wide/16 v5, 0x0

    .line 65
    .line 66
    cmp-long v0, v3, v5

    .line 67
    .line 68
    if-eqz v0, :cond_1

    .line 69
    .line 70
    move-object v2, p0

    .line 71
    move v5, p1

    .line 72
    move v6, p2

    .line 73
    move v7, p3

    .line 74
    invoke-direct/range {v2 .. v7}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeSetVideoDropParams(JZII)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    move-object p1, v0

    .line 80
    goto :goto_2

    .line 81
    :cond_1
    :goto_1
    monitor-exit v1

    .line 82
    return-void

    .line 83
    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 84
    throw p1
.end method

.method public start(Ljava/lang/String;ZI)Ljava/lang/String;
    .locals 5

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    iget-boolean v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    if-ne v3, v4, :cond_0

    .line 11
    .line 12
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    iput-boolean v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectSuccessTimeStamps:J

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRetryCount:I

    .line 21
    .line 22
    iput-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 23
    .line 24
    iput p3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mChannelType:I

    .line 25
    .line 26
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountQuic:I

    .line 27
    .line 28
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mConnectCountTcp:I

    .line 29
    .line 30
    iput-boolean v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 31
    .line 32
    iget-object v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyParam:Lcom/tencent/liteav/network/TXCStreamUploader$a;

    .line 33
    .line 34
    invoke-virtual {v4}, Lcom/tencent/liteav/network/TXCStreamUploader$a;->a()V

    .line 35
    .line 36
    .line 37
    iget-object v4, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPList:Ljava/util/Vector;

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/util/Vector;->clear()V

    .line 40
    .line 41
    .line 42
    iput v3, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyIPIndex:I

    .line 43
    .line 44
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    .line 45
    .line 46
    iput-wide v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpMsgRecvThreadInstance:J

    .line 47
    .line 48
    const/16 v0, 0x1b68

    .line 49
    .line 50
    invoke-virtual {p0, v0, v2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    const/16 v0, 0x1b69

    .line 54
    .line 55
    invoke-virtual {p0, v0, v2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    const/16 v0, 0x1b6a

    .line 59
    .line 60
    invoke-virtual {p0, v0, v2}, Lcom/tencent/liteav/basic/module/a;->setStatusValue(ILjava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/tencent/liteav/network/n;->a()V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "start push with url:"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, " enable nearest ip:"

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    if-eqz p2, :cond_1

    .line 89
    .line 90
    const-string v1, "yes"

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    const-string v1, "no"

    .line 94
    .line 95
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v1, "channel type:"

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, "TXCStreamUploader"

    .line 111
    .line 112
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 116
    .line 117
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_2

    .line 122
    .line 123
    const/16 p1, -0x52d

    .line 124
    .line 125
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->sendNotifyEvent(I)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 129
    .line 130
    return-object p1

    .line 131
    :cond_2
    iput-boolean p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mEnableNearestIP:Z

    .line 132
    .line 133
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandlerThread:Landroid/os/HandlerThread;

    .line 134
    .line 135
    if-nez p2, :cond_3

    .line 136
    .line 137
    new-instance p2, Landroid/os/HandlerThread;

    .line 138
    .line 139
    const-string v0, "RTMP_PUSH"

    .line 140
    .line 141
    invoke-direct {p2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandlerThread:Landroid/os/HandlerThread;

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 147
    .line 148
    .line 149
    :cond_3
    new-instance p2, Lcom/tencent/liteav/network/TXCStreamUploader$1;

    .line 150
    .line 151
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandlerThread:Landroid/os/HandlerThread;

    .line 152
    .line 153
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-direct {p2, p0, v0}, Lcom/tencent/liteav/network/TXCStreamUploader$1;-><init>(Lcom/tencent/liteav/network/TXCStreamUploader;Landroid/os/Looper;)V

    .line 158
    .line 159
    .line 160
    iput-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 161
    .line 162
    invoke-direct {p0, p1}, Lcom/tencent/liteav/network/TXCStreamUploader;->parseProxyInfo(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    iget-boolean p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 166
    .line 167
    if-eqz p2, :cond_4

    .line 168
    .line 169
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 170
    .line 171
    invoke-static {p1}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    iput p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 176
    .line 177
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeCacheJNIParams()V

    .line 178
    .line 179
    .line 180
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 181
    .line 182
    iget-boolean p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 183
    .line 184
    invoke-direct {p0, p1, p2, v3}, Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_4
    iget-boolean p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mEnableNearestIP:Z

    .line 189
    .line 190
    if-eqz p2, :cond_5

    .line 191
    .line 192
    iget p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 193
    .line 194
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 195
    .line 196
    invoke-static {v0}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-eq p2, v0, :cond_5

    .line 201
    .line 202
    const-string p2, "fetching nearest ip list"

    .line 203
    .line 204
    invoke-static {v1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mContext:Landroid/content/Context;

    .line 208
    .line 209
    invoke-static {p2}, Lcom/tencent/liteav/basic/util/e;->c(Landroid/content/Context;)I

    .line 210
    .line 211
    .line 212
    move-result p2

    .line 213
    iput p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mLastNetworkType:I

    .line 214
    .line 215
    iget-object p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIntelligentRoute:Lcom/tencent/liteav/network/c;

    .line 216
    .line 217
    invoke-virtual {p2, p1, p3}, Lcom/tencent/liteav/network/c;->a(Ljava/lang/String;I)V

    .line 218
    .line 219
    .line 220
    goto :goto_1

    .line 221
    :cond_5
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 222
    .line 223
    iget-boolean p2, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mQuicChannel:Z

    .line 224
    .line 225
    invoke-direct {p0, p1, p2, v3}, Lcom/tencent/liteav/network/TXCStreamUploader;->startPushTask(Ljava/lang/String;ZI)V

    .line 226
    .line 227
    .line 228
    :goto_1
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 229
    .line 230
    const/16 p2, 0x67

    .line 231
    .line 232
    const-wide/16 v0, 0x7d0

    .line 233
    .line 234
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpUrl:Ljava/lang/String;

    .line 238
    .line 239
    return-object p1
.end method

.method public stop()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mIsPushing:Z

    .line 8
    .line 9
    const-string v0, "TXCStreamUploader"

    .line 10
    .line 11
    const-string v1, "stop push"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyLock:Ljava/lang/Object;

    .line 21
    .line 22
    monitor-enter v0

    .line 23
    :try_start_0
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyInstance:J

    .line 24
    .line 25
    invoke-direct {p0, v1, v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeRtmpProxyLeaveRoom(J)V

    .line 26
    .line 27
    .line 28
    monitor-exit v0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    throw v1

    .line 33
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mThreadLock:Ljava/lang/Object;

    .line 34
    .line 35
    monitor-enter v0

    .line 36
    :try_start_1
    iget-wide v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploaderInstance:J

    .line 37
    .line 38
    invoke-direct {p0, v1, v2}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeStopPush(J)V

    .line 39
    .line 40
    .line 41
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandlerThread:Landroid/os/HandlerThread;

    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/os/Looper;->quit()V

    .line 52
    .line 53
    .line 54
    iput-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandlerThread:Landroid/os/HandlerThread;

    .line 55
    .line 56
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iput-object v1, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mHandler:Landroid/os/Handler;

    .line 61
    .line 62
    :cond_3
    iget-boolean v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mRtmpProxyEnable:Z

    .line 63
    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-direct {p0}, Lcom/tencent/liteav/network/TXCStreamUploader;->nativeReleaseJNIParams()V

    .line 67
    .line 68
    .line 69
    :cond_4
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/tencent/liteav/network/n;->c()V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/tencent/liteav/network/TXCStreamUploader;->mUploadQualityReport:Lcom/tencent/liteav/network/n;

    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/tencent/liteav/network/n;->a()V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :catchall_1
    move-exception v1

    .line 81
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    throw v1
.end method
