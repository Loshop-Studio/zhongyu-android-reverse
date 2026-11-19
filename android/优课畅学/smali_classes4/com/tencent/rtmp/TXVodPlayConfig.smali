.class public Lcom/tencent/rtmp/TXVodPlayConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field autoRotate:Z

.field cacheMp4ExtName:Ljava/lang/String;

.field enableAccurateSeek:Z

.field mCacheFolderPath:Ljava/lang/String;

.field mConnectRetryCount:I

.field mConnectRetryInterval:I

.field mHeaders:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field mMaxCacheItems:I

.field mPlayerType:I

.field mTimeout:I

.field maxBufferSize:I

.field progressInterval:I

.field smoothSwitchBitrate:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mConnectRetryCount:I

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mConnectRetryInterval:I

    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    iput v0, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mTimeout:I

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->enableAccurateSeek:Z

    .line 15
    .line 16
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->autoRotate:Z

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->smoothSwitchBitrate:Z

    .line 20
    .line 21
    const-string v1, "mp4"

    .line 22
    .line 23
    iput-object v1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->cacheMp4ExtName:Ljava/lang/String;

    .line 24
    .line 25
    iput v0, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->maxBufferSize:I

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public setAutoRotate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->autoRotate:Z

    .line 2
    .line 3
    return-void
.end method

.method public setCacheFolderPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mCacheFolderPath:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCacheMp4ExtName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->cacheMp4ExtName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setConnectRetryCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mConnectRetryCount:I

    .line 2
    .line 3
    return-void
.end method

.method public setConnectRetryInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mConnectRetryInterval:I

    .line 2
    .line 3
    return-void
.end method

.method public setEnableAccurateSeek(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->enableAccurateSeek:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHeaders(Ljava/util/Map;)V
    .locals 0
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
    iput-object p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mHeaders:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public setMaxBufferSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->maxBufferSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setMaxCacheItems(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mMaxCacheItems:I

    .line 2
    .line 3
    return-void
.end method

.method public setPlayerType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mPlayerType:I

    .line 2
    .line 3
    return-void
.end method

.method public setProgressInterval(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->progressInterval:I

    .line 2
    .line 3
    return-void
.end method

.method public setSmoothSwitchBitrate(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->smoothSwitchBitrate:Z

    .line 2
    .line 3
    return-void
.end method

.method public setTimeout(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/tencent/rtmp/TXVodPlayConfig;->mTimeout:I

    .line 2
    .line 3
    return-void
.end method
