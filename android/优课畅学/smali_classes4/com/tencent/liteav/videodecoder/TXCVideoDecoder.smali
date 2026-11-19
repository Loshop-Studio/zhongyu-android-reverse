.class public Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/liteav/basic/b/b;
.implements Lcom/tencent/liteav/videodecoder/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;
    }
.end annotation


# static fields
.field private static final NEW_DECODER:Z = true

.field private static final TAG:Ljava/lang/String; = "TXCVideoDecoder"

.field private static mDecodeFirstFrameTS:J


# instance fields
.field private mDecFormat:Lorg/json/JSONArray;

.field private mDecoderCacheNum:I

.field private mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

.field mDecoderListener:Lcom/tencent/liteav/videodecoder/f;

.field private mEnableDecoderChange:Z

.field private mEnableLimitDecCache:Z

.field private mEnableRestartDecoder:Z

.field mHWDec:Z

.field mHevc:Z

.field private mNALList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/liteav/basic/structs/TXSNALPacket;",
            ">;"
        }
    .end annotation
.end field

.field private mNativeContext:J

.field mNeedSortFrame:Z

.field private mNotifyListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/basic/b/b;",
            ">;"
        }
    .end annotation
.end field

.field private mPps:Ljava/nio/ByteBuffer;

.field mRecvFirstFrame:Z

.field private mRestarting:Z

.field private mSps:Ljava/nio/ByteBuffer;

.field private mStreamType:I

.field mSurface:Landroid/view/Surface;

.field private mUserId:Ljava/lang/String;

.field mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

.field private mVideoHeight:I

.field private mVideoWidth:I


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

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRestarting:Z

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoWidth:I

    .line 10
    .line 11
    iput v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoHeight:I

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableDecoderChange:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableRestartDecoder:Z

    .line 16
    .line 17
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableLimitDecCache:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecFormat:Lorg/json/JSONArray;

    .line 21
    .line 22
    new-instance v1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    iput-boolean v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHevc:Z

    .line 33
    .line 34
    iput-boolean v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNeedSortFrame:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRecvFirstFrame:Z

    .line 37
    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    sput-wide v0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 41
    .line 42
    return-void
.end method

.method private addOneNalToDecoder(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 5

    .line 1
    iget v0, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    new-instance v2, Landroid/os/Bundle;

    .line 10
    .line 11
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v3, "iframe"

    .line 15
    .line 16
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    const-string v0, "nal"

    .line 20
    .line 21
    iget-object v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 22
    .line 23
    invoke-virtual {v2, v0, v3}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 24
    .line 25
    .line 26
    const-string v0, "pts"

    .line 27
    .line 28
    iget-wide v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 29
    .line 30
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 31
    .line 32
    .line 33
    const-string v0, "dts"

    .line 34
    .line 35
    iget-wide v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 36
    .line 37
    invoke-virtual {v2, v0, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 38
    .line 39
    .line 40
    const-string v0, "codecId"

    .line 41
    .line 42
    iget p1, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 43
    .line 44
    invoke-virtual {v2, v0, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 45
    .line 46
    .line 47
    new-instance p1, Landroid/os/Message;

    .line 48
    .line 49
    invoke-direct {p1}, Landroid/os/Message;-><init>()V

    .line 50
    .line 51
    .line 52
    const/16 v0, 0x65

    .line 53
    .line 54
    iput v0, p1, Landroid/os/Message;->what:I

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 60
    .line 61
    if-eqz v0, :cond_1

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 64
    .line 65
    .line 66
    :cond_1
    iget p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 67
    .line 68
    add-int/2addr p1, v1

    .line 69
    iput p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 70
    .line 71
    return-void
.end method

.method private decNALByNewWay(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 12

    .line 1
    iget-boolean v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 2
    .line 3
    if-eqz v2, :cond_0

    .line 4
    .line 5
    iget-object v2, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 8
    .line 9
    iget-wide v5, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 10
    .line 11
    iget v7, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->rotation:I

    .line 12
    .line 13
    iget v8, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 14
    .line 15
    const/4 v10, 0x0

    .line 16
    iget v11, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    move-object v1, p0

    .line 20
    invoke-direct/range {v1 .. v11}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->decodeFrame([BJJIIIII)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    monitor-enter p0

    .line 25
    :try_start_0
    iget-wide v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 26
    .line 27
    iget-object v4, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 28
    .line 29
    iget v5, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 30
    .line 31
    iget-wide v6, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 32
    .line 33
    iget-wide v8, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 34
    .line 35
    iget v10, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->rotation:I

    .line 36
    .line 37
    iget v11, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 38
    .line 39
    move-object v1, p0

    .line 40
    invoke-direct/range {v1 .. v11}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeDecodeFrame(J[BIJJII)V

    .line 41
    .line 42
    .line 43
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw v0
.end method

.method private decNALByOldWay(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 6

    .line 1
    const-string v0, "TXCVideoDecoder"

    .line 2
    .line 3
    :try_start_0
    iget v1, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    move v1, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    iget-boolean v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRecvFirstFrame:Z

    .line 12
    .line 13
    if-nez v3, :cond_1

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    const-string p1, "play:decode: push nal ignore p frame when not got i frame"

    .line 18
    .line 19
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    if-nez v3, :cond_2

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    const-string v3, "play:decode: push first i frame"

    .line 30
    .line 31
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-boolean v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRecvFirstFrame:Z

    .line 35
    .line 36
    :cond_2
    iget-boolean v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRestarting:Z

    .line 37
    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    iget v3, p1, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 41
    .line 42
    if-ne v3, v2, :cond_3

    .line 43
    .line 44
    iget-boolean v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 45
    .line 46
    if-nez v3, :cond_3

    .line 47
    .line 48
    const-string v3, "play:decode: hevc decode error  "

    .line 49
    .line 50
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 54
    .line 55
    const-string v4, "h265 Decoding failed"

    .line 56
    .line 57
    const/16 v5, -0x900

    .line 58
    .line 59
    invoke-static {v3, v5, v4}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    iput-boolean v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRestarting:Z

    .line 63
    .line 64
    :cond_3
    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 65
    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_4

    .line 75
    .line 76
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_4

    .line 87
    .line 88
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lcom/tencent/liteav/basic/structs/TXSNALPacket;

    .line 93
    .line 94
    invoke-direct {p0, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->addOneNalToDecoder(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->addOneNalToDecoder(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_5
    if-eqz v1, :cond_6

    .line 108
    .line 109
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_6

    .line 116
    .line 117
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 120
    .line 121
    .line 122
    :cond_6
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    iget-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRestarting:Z

    .line 128
    .line 129
    if-nez p1, :cond_7

    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->start()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    .line 133
    .line 134
    :cond_7
    return-void

    .line 135
    :goto_2
    const-string v1, "decode NAL By Old way failed."

    .line 136
    .line 137
    invoke-static {v0, v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    return-void
.end method

.method private decodeFrame([BJJIIIII)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/tencent/liteav/basic/structs/TXSNALPacket;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalData:[B

    .line 7
    .line 8
    iput-wide p2, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->pts:J

    .line 9
    .line 10
    iput-wide p4, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->dts:J

    .line 11
    .line 12
    iput p6, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->rotation:I

    .line 13
    .line 14
    iput p7, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->codecId:I

    .line 15
    .line 16
    iput p10, v0, Lcom/tencent/liteav/basic/structs/TXSNALPacket;->nalType:I

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :try_start_0
    iget-wide p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 20
    .line 21
    const-wide/16 p3, 0x0

    .line 22
    .line 23
    cmp-long p1, p1, p3

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 28
    .line 29
    if-nez p1, :cond_0

    .line 30
    .line 31
    new-instance p1, Lcom/tencent/liteav/videodecoder/e;

    .line 32
    .line 33
    invoke-direct {p1}, Lcom/tencent/liteav/videodecoder/e;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p8, p9}, Lcom/tencent/liteav/videodecoder/e;->a(II)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p0}, Lcom/tencent/liteav/videodecoder/e;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 40
    .line 41
    .line 42
    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/videodecoder/e;->setNotifyListener(Ljava/lang/ref/WeakReference;)V

    .line 45
    .line 46
    .line 47
    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecFormat:Lorg/json/JSONArray;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/videodecoder/e;->a(Lorg/json/JSONArray;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/videodecoder/e;->config(Landroid/view/Surface;)I

    .line 55
    .line 56
    .line 57
    iget-boolean p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableLimitDecCache:Z

    .line 58
    .line 59
    invoke-virtual {p1, p2}, Lcom/tencent/liteav/videodecoder/e;->enableLimitDecCache(Z)V

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSps:Ljava/nio/ByteBuffer;

    .line 63
    .line 64
    iget-object p3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mPps:Ljava/nio/ByteBuffer;

    .line 65
    .line 66
    iget-boolean p4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNeedSortFrame:Z

    .line 67
    .line 68
    iget-boolean p5, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHevc:Z

    .line 69
    .line 70
    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/tencent/liteav/videodecoder/e;->start(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;ZZ)I

    .line 71
    .line 72
    .line 73
    const/4 p2, 0x1

    .line 74
    invoke-direct {p0, p2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->notifyDecoderStartEvent(Z)V

    .line 75
    .line 76
    .line 77
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p1

    .line 81
    goto :goto_1

    .line 82
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 83
    .line 84
    if-eqz p1, :cond_1

    .line 85
    .line 86
    invoke-interface {p1, v0}, Lcom/tencent/liteav/videodecoder/b;->decode(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    monitor-exit p0

    .line 90
    return-void

    .line 91
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    throw p1
.end method

.method private hasSurface()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method private native nativeCreateContext(Z)J
.end method

.method private native nativeDecCache(J)V
.end method

.method private native nativeDecodeFrame(J[BIJJII)V
.end method

.method private native nativeDestroyContext(J)V
.end method

.method private native nativeEnableDecodeChange(JZ)V
.end method

.method private native nativeEnableRestartDecoder(JZ)V
.end method

.method private native nativeNotifyPts(JJII)V
.end method

.method private native nativeSetID(JLjava/lang/String;)V
.end method

.method private native nativeSetStreamType(JI)V
.end method

.method private notifyDecoderStartEvent(Z)V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 2
    .line 3
    const-wide/16 v8, 0x1

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    move-wide v2, v8

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    move-wide v2, v1

    .line 12
    :goto_0
    const-string v6, ""

    .line 13
    .line 14
    iget v7, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 15
    .line 16
    const/16 v1, 0xfa5

    .line 17
    .line 18
    const-wide/16 v4, -0x1

    .line 19
    .line 20
    invoke-static/range {v0 .. v7}, Lcom/tencent/liteav/basic/module/TXCEventRecorderProxy;->a(Ljava/lang/String;IJJLjava/lang/String;I)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Landroid/os/Bundle;

    .line 24
    .line 25
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v1, "EVT_ID"

    .line 29
    .line 30
    const/16 v2, 0x7d8

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    const-string v1, "EVT_TIME"

    .line 36
    .line 37
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    invoke-virtual {v0, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 42
    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    const-string v1, "Enables hardware decoding"

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    const-string v1, "Enables software decoding"

    .line 50
    .line 51
    :goto_1
    const-string v3, "EVT_MSG"

    .line 52
    .line 53
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    const/4 v1, 0x2

    .line 61
    :goto_2
    const-string v3, "EVT_PARAM1"

    .line 62
    .line 63
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 67
    .line 68
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v1, v3, v2, v0}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    const-wide/16 v8, 0x2

    .line 79
    .line 80
    :goto_3
    iget p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 81
    .line 82
    const v1, 0x9c5a

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1, v8, v9, p1}, Lcom/tencent/liteav/basic/module/TXCKeyPointReportProxy;->a(Ljava/lang/String;IJI)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method private onDecodeDone(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;IIJJII)V
    .locals 4

    .line 1
    sget-wide v0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    sput-wide v0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "SoftDecode onDecodeFrame: decode first frame success:"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "_"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "TXCVideoDecoder"

    .line 45
    .line 46
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 50
    .line 51
    iget v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 52
    .line 53
    sget-wide v2, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 54
    .line 55
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    const/16 v3, 0x138d

    .line 60
    .line 61
    invoke-static {v0, v3, v1, v2}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;IILjava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHevc:Z

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    const/4 v0, 0x2

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 72
    .line 73
    iget v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 74
    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    const/16 v3, 0x138c

    .line 80
    .line 81
    invoke-static {v1, v3, v2, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;IILjava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    :cond_1
    move v0, p9

    .line 85
    move p9, p8

    .line 86
    move-wide p7, p6

    .line 87
    move-wide p5, p4

    .line 88
    move p4, p3

    .line 89
    move p3, p2

    .line 90
    move-object p2, p1

    .line 91
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderListener:Lcom/tencent/liteav/videodecoder/f;

    .line 92
    .line 93
    if-eqz p1, :cond_3

    .line 94
    .line 95
    iput p3, p2, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->width:I

    .line 96
    .line 97
    iput p4, p2, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->height:I

    .line 98
    .line 99
    iput p9, p2, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->rotation:I

    .line 100
    .line 101
    iput-wide p5, p2, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->pts:J

    .line 102
    .line 103
    iput v0, p2, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->frameType:I

    .line 104
    .line 105
    invoke-interface/range {p1 .. p9}, Lcom/tencent/liteav/videodecoder/f;->onDecodeFrame(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;IIJJI)V

    .line 106
    .line 107
    .line 108
    iget p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoWidth:I

    .line 109
    .line 110
    if-ne p2, p3, :cond_2

    .line 111
    .line 112
    iget p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoHeight:I

    .line 113
    .line 114
    if-eq p2, p4, :cond_3

    .line 115
    .line 116
    :cond_2
    iput p3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoWidth:I

    .line 117
    .line 118
    iput p4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoHeight:I

    .line 119
    .line 120
    invoke-interface {p1, p3, p4}, Lcom/tencent/liteav/videodecoder/f;->onVideoSizeChange(II)V

    .line 121
    .line 122
    .line 123
    :cond_3
    return-void
.end method

.method private onStartDecoder(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->notifyDecoderStartEvent(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private startDecodeThread()I
    .locals 11

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const-string v0, "TXCVideoDecoder"

    .line 7
    .line 8
    const-string v1, "play:decode: start decoder error when decoder is started"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    monitor-exit p0

    .line 15
    return v0

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    move-object v9, p0

    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 22
    .line 23
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRestarting:Z

    .line 24
    .line 25
    new-instance v1, Landroid/os/HandlerThread;

    .line 26
    .line 27
    const-string v2, "VDecoder"

    .line 28
    .line 29
    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 33
    .line 34
    .line 35
    iget-boolean v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v3, "VideoWDec"

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    const-string v3, "VideoSWDec"

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Thread;->getId()J

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :goto_0
    new-instance v3, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 89
    .line 90
    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-direct {v3, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;-><init>(Landroid/os/Looper;)V

    .line 95
    .line 96
    .line 97
    iget-boolean v4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHevc:Z

    .line 98
    .line 99
    iget-boolean v5, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 100
    .line 101
    iget-object v6, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 102
    .line 103
    iget-object v7, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSps:Ljava/nio/ByteBuffer;

    .line 104
    .line 105
    iget-object v8, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mPps:Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    move-object v10, p0

    .line 108
    move-object v9, p0

    .line 109
    :try_start_1
    invoke-virtual/range {v3 .. v10}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a(ZZLandroid/view/Surface;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Lcom/tencent/liteav/videodecoder/f;Lcom/tencent/liteav/basic/b/b;)V

    .line 110
    .line 111
    .line 112
    const-string v1, "TXCVideoDecoder"

    .line 113
    .line 114
    const-string v2, "play:decode: start decode thread"

    .line 115
    .line 116
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    const/16 v2, 0x64

    .line 124
    .line 125
    iput v2, v1, Landroid/os/Message;->what:I

    .line 126
    .line 127
    iget-boolean v2, v9, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNeedSortFrame:Z

    .line 128
    .line 129
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    iput-object v2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 136
    .line 137
    .line 138
    iput-object v3, v9, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 139
    .line 140
    monitor-exit p0

    .line 141
    return v0

    .line 142
    :catchall_1
    move-exception v0

    .line 143
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 144
    throw v0
.end method

.method private stopDecodeThread()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/16 v1, 0x66

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    throw v0
.end method

.method private declared-synchronized stopHWDecoder()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/tencent/liteav/videodecoder/b;->stop()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-interface {v0, v1}, Lcom/tencent/liteav/videodecoder/b;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Lcom/tencent/liteav/videodecoder/b;->setNotifyListener(Ljava/lang/ref/WeakReference;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit p0

    .line 26
    return-void

    .line 27
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw v0
.end method


# virtual methods
.method public GetDecodeFirstFrameTS()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public config(Lorg/json/JSONArray;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecFormat:Lorg/json/JSONArray;

    .line 2
    .line 3
    return-void
.end method

.method public enableChange(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableDecoderChange:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableDecoderChange:Z

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeEnableDecodeChange(JZ)V

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1
.end method

.method public enableHWDec(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 2
    .line 3
    return-void
.end method

.method public enableLimitDecCache(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableLimitDecCache:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lcom/tencent/liteav/videodecoder/b;->enableLimitDecCache(Z)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public enableRestart(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableRestartDecoder:Z

    .line 2
    .line 3
    return-void
.end method

.method public getDecoderCacheNum()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public isHardwareDecode()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public isHevc()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public onDecodeFailed(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderListener:Lcom/tencent/liteav/videodecoder/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tencent/liteav/videodecoder/f;->onDecodeFailed(I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    monitor-enter p0

    .line 9
    :try_start_0
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeDecCache(J)V

    .line 12
    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
.end method

.method public onDecodeFrame(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;IIJJI)V
    .locals 14

    .line 1
    sget-wide v0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    sput-wide v2, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 15
    .line 16
    const-string v0, "TXCVideoDecoder"

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v3, "MediaCodec onDecodeFrame: decode first frame success:"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v3, "_"

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 51
    .line 52
    iget v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 53
    .line 54
    sget-wide v3, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 55
    .line 56
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const/16 v4, 0x138d

    .line 61
    .line 62
    invoke-static {v0, v4, v2, v3}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;IILjava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHevc:Z

    .line 66
    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    move v0, v1

    .line 72
    :goto_0
    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 73
    .line 74
    iget v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 75
    .line 76
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const/16 v4, 0x138c

    .line 81
    .line 82
    invoke-static {v2, v4, v3, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;IILjava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-object v5, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderListener:Lcom/tencent/liteav/videodecoder/f;

    .line 86
    .line 87
    if-eqz v5, :cond_2

    .line 88
    .line 89
    move-object v6, p1

    .line 90
    move/from16 v7, p2

    .line 91
    .line 92
    move/from16 v8, p3

    .line 93
    .line 94
    move-wide/from16 v9, p4

    .line 95
    .line 96
    move-wide/from16 v11, p6

    .line 97
    .line 98
    move/from16 v13, p8

    .line 99
    .line 100
    invoke-interface/range {v5 .. v13}, Lcom/tencent/liteav/videodecoder/f;->onDecodeFrame(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;IIJJI)V

    .line 101
    .line 102
    .line 103
    :cond_2
    iget v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 104
    .line 105
    if-lez v0, :cond_3

    .line 106
    .line 107
    sub-int/2addr v0, v1

    .line 108
    iput v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 109
    .line 110
    :cond_3
    if-nez p1, :cond_4

    .line 111
    .line 112
    monitor-enter p0

    .line 113
    :try_start_0
    iget-wide v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 114
    .line 115
    move-object v2, p0

    .line 116
    move/from16 v7, p2

    .line 117
    .line 118
    move/from16 v8, p3

    .line 119
    .line 120
    move-wide/from16 v5, p4

    .line 121
    .line 122
    invoke-direct/range {v2 .. v8}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeNotifyPts(JJII)V

    .line 123
    .line 124
    .line 125
    monitor-exit p0

    .line 126
    goto :goto_1

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    throw v0

    .line 130
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 131
    .line 132
    invoke-interface {v0}, Lcom/tencent/liteav/videodecoder/b;->GetDecodeCost()I

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    iget-boolean v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 137
    .line 138
    if-eqz v1, :cond_5

    .line 139
    .line 140
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 141
    .line 142
    iget v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 143
    .line 144
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    const/16 v4, 0x1f44

    .line 149
    .line 150
    invoke-static {v1, v4, v3, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;IILjava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_5
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 155
    .line 156
    iget v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 157
    .line 158
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const/16 v4, 0x1f43

    .line 163
    .line 164
    invoke-static {v1, v4, v3, v0}, Lcom/tencent/liteav/basic/module/TXCStatus;->a(Ljava/lang/String;IILjava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    return-void
.end method

.method public onNotifyEvent(ILandroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/tencent/liteav/basic/util/e;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;ILandroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onVideoSizeChange(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderListener:Lcom/tencent/liteav/videodecoder/f;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoWidth:I

    .line 6
    .line 7
    if-ne v1, p1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoHeight:I

    .line 10
    .line 11
    if-eq v1, p2, :cond_1

    .line 12
    .line 13
    :cond_0
    iput p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoWidth:I

    .line 14
    .line 15
    iput p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoHeight:I

    .line 16
    .line 17
    invoke-interface {v0, p1, p2}, Lcom/tencent/liteav/videodecoder/f;->onVideoSizeChange(II)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method public pushNAL(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->decNALByNewWay(Lcom/tencent/liteav/basic/structs/TXSNALPacket;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public restart(Z)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 3
    .line 4
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRecvFirstFrame:Z

    .line 11
    .line 12
    iput p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    sput-wide v0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 17
    .line 18
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const/16 v0, 0x67

    .line 23
    .line 24
    iput v0, p1, Landroid/os/Message;->what:I

    .line 25
    .line 26
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 27
    .line 28
    iput v0, p1, Landroid/os/Message;->arg1:I

    .line 29
    .line 30
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNeedSortFrame:Z

    .line 31
    .line 32
    iput v0, p1, Landroid/os/Message;->arg2:I

    .line 33
    .line 34
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderHandler:Lcom/tencent/liteav/videodecoder/TXCVideoDecoder$a;

    .line 35
    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    throw p1
.end method

.method public setListener(Lcom/tencent/liteav/videodecoder/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderListener:Lcom/tencent/liteav/videodecoder/f;

    .line 2
    .line 3
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
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNotifyListener:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public setStreamType(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 5
    .line 6
    iget p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeSetStreamType(JI)V

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 5
    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 7
    .line 8
    invoke-direct {p0, v0, v1, p1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeSetID(JLjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p1
.end method

.method public setup(Landroid/graphics/SurfaceTexture;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 4
    :cond_0
    new-instance v0, Landroid/view/Surface;

    invoke-direct {v0, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {p0, v0, p2, p3, p4}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->setup(Landroid/view/Surface;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I

    move-result p1

    return p1
.end method

.method public setup(Landroid/view/Surface;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Z)I
    .locals 0

    .line 5
    iput-object p1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 6
    iput-object p2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSps:Ljava/nio/ByteBuffer;

    .line 7
    iput-object p3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mPps:Ljava/nio/ByteBuffer;

    .line 8
    iput-boolean p4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNeedSortFrame:Z

    const/4 p1, 0x0

    return p1
.end method

.method public declared-synchronized start()I
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "TXCVideoDecoder"

    .line 12
    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v3, "play:decode: start decoder error when not setup surface, id "

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, "_"

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    monitor-exit p0

    .line 46
    return v1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    :try_start_1
    iget-wide v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 50
    .line 51
    const-wide/16 v4, 0x0

    .line 52
    .line 53
    cmp-long v0, v2, v4

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const-string v0, "TXCVideoDecoder"

    .line 58
    .line 59
    new-instance v2, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v3, "play:decode: start decoder error when decoder is started, id "

    .line 65
    .line 66
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v3, "_"

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget v3, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 80
    .line 81
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 89
    .line 90
    .line 91
    monitor-exit p0

    .line 92
    return v1

    .line 93
    :cond_1
    :try_start_2
    const-string v0, "TXCVideoDecoder"

    .line 94
    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "play:decode: start decoder java id "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v2, "_"

    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mHWDec:Z

    .line 128
    .line 129
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeCreateContext(Z)J

    .line 130
    .line 131
    .line 132
    move-result-wide v0

    .line 133
    iput-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 134
    .line 135
    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 136
    .line 137
    invoke-direct {p0, v0, v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeSetID(JLjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 141
    .line 142
    iget v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 143
    .line 144
    invoke-direct {p0, v0, v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeSetStreamType(JI)V

    .line 145
    .line 146
    .line 147
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 148
    .line 149
    iget-boolean v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableDecoderChange:Z

    .line 150
    .line 151
    invoke-direct {p0, v0, v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeEnableDecodeChange(JZ)V

    .line 152
    .line 153
    .line 154
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 155
    .line 156
    iget-boolean v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mEnableRestartDecoder:Z

    .line 157
    .line 158
    invoke-direct {p0, v0, v1, v2}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeEnableRestartDecoder(JZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    .line 160
    .line 161
    monitor-exit p0

    .line 162
    const/4 v0, 0x0

    .line 163
    return v0

    .line 164
    :goto_0
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 165
    throw v0
.end method

.method public declared-synchronized stop()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "TXCVideoDecoder"

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "play:decode: stop decoder ignore when decoder is stopped, id "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, "_"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :try_start_1
    const-string v0, "TXCVideoDecoder"

    .line 49
    .line 50
    new-instance v1, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v4, "play:decode: stop decoder java id "

    .line 56
    .line 57
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mUserId:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v4, "_"

    .line 66
    .line 67
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget v4, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mStreamType:I

    .line 71
    .line 72
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-wide v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 83
    .line 84
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->nativeDestroyContext(J)V

    .line 85
    .line 86
    .line 87
    iput-wide v2, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNativeContext:J

    .line 88
    .line 89
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mNALList:Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 92
    .line 93
    .line 94
    const/4 v0, 0x0

    .line 95
    iput-boolean v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mRecvFirstFrame:Z

    .line 96
    .line 97
    iput v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecoderCacheNum:I

    .line 98
    .line 99
    sput-wide v2, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mDecodeFirstFrameTS:J

    .line 100
    .line 101
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    :try_start_2
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 103
    .line 104
    const/4 v1, 0x0

    .line 105
    if-eqz v0, :cond_1

    .line 106
    .line 107
    invoke-interface {v0}, Lcom/tencent/liteav/videodecoder/b;->stop()V

    .line 108
    .line 109
    .line 110
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 111
    .line 112
    invoke-interface {v0, v1}, Lcom/tencent/liteav/videodecoder/b;->setListener(Lcom/tencent/liteav/videodecoder/f;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 116
    .line 117
    invoke-interface {v0, v1}, Lcom/tencent/liteav/videodecoder/b;->setNotifyListener(Ljava/lang/ref/WeakReference;)V

    .line 118
    .line 119
    .line 120
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mVideoDecoder:Lcom/tencent/liteav/videodecoder/b;

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :catchall_1
    move-exception v0

    .line 124
    goto :goto_1

    .line 125
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 126
    .line 127
    if-eqz v0, :cond_2

    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 130
    .line 131
    .line 132
    iput-object v1, p0, Lcom/tencent/liteav/videodecoder/TXCVideoDecoder;->mSurface:Landroid/view/Surface;

    .line 133
    .line 134
    :cond_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 135
    monitor-exit p0

    .line 136
    return-void

    .line 137
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 138
    :try_start_4
    throw v0

    .line 139
    :goto_2
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 140
    throw v0
.end method
