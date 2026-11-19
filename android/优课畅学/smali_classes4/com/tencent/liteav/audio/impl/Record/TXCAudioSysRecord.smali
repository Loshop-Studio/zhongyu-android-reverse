.class public Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String;

.field private static instance:Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;


# instance fields
.field private mAECType:I

.field private mBits:I

.field private mChannels:I

.field private mContext:Landroid/content/Context;

.field private mIsCapFirstFrame:Z

.field private mIsRunning:Z

.field private mMic:Landroid/media/AudioRecord;

.field private mPause:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private mRecordBuffer:[B

.field private mRecordThread:Ljava/lang/Thread;

.field private mSampleRate:I

.field private mSendMuteData:Z

.field private mWeakRefListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/liteav/audio/impl/Record/c;",
            ">;"
        }
    .end annotation
.end field

.field private threadMutex:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "AudioCenter:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-class v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    sput-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    sput-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->instance:Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 28
    .line 29
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0xbb80

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSampleRate:I

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mChannels:I

    .line 11
    .line 12
    const/16 v0, 0x10

    .line 13
    .line 14
    iput v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mBits:I

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mAECType:I

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 21
    .line 22
    iput-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordThread:Ljava/lang/Thread;

    .line 23
    .line 24
    iput-boolean v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsCapFirstFrame:Z

    .line 27
    .line 28
    iput-boolean v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSendMuteData:Z

    .line 29
    .line 30
    new-instance v1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mPause:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    new-instance v0, Ljava/lang/Object;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->threadMutex:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-direct {p0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->nativeClassInit()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public static getInstance()Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->instance:Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->instance:Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 13
    .line 14
    invoke-direct {v1}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->instance:Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->instance:Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;

    .line 27
    .line 28
    return-object v0
.end method

.method private init()V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v4, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSampleRate:I

    .line 4
    .line 5
    iget v8, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mChannels:I

    .line 6
    .line 7
    iget v9, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mBits:I

    .line 8
    .line 9
    iget v0, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mAECType:I

    .line 10
    .line 11
    sget-object v2, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {v3, v5, v6, v0}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v3, "audio record sampleRate = %d, channels = %d, bits = %d, aectype = %d"

    .line 34
    .line 35
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 v10, 0x1

    .line 43
    if-ne v8, v10, :cond_0

    .line 44
    .line 45
    const/16 v0, 0x10

    .line 46
    .line 47
    :goto_0
    move v5, v0

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    const/16 v0, 0xc

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :goto_1
    const/16 v11, 0x8

    .line 53
    .line 54
    if-ne v9, v11, :cond_1

    .line 55
    .line 56
    const/4 v0, 0x3

    .line 57
    :goto_2
    move v6, v0

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    const/4 v0, 0x2

    .line 60
    goto :goto_2

    .line 61
    :goto_3
    invoke-static {v4, v5, v6}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    :try_start_0
    const-string v0, "audio record type: system normal"

    .line 66
    .line 67
    invoke-static {v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    new-instance v2, Landroid/media/AudioRecord;

    .line 71
    .line 72
    mul-int/lit8 v7, v12, 0x2

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    invoke-direct/range {v2 .. v7}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 76
    .line 77
    .line 78
    iput-object v2, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :catch_0
    move-exception v0

    .line 82
    sget-object v2, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 83
    .line 84
    const-string v3, "create AudioRecord failed."

    .line 85
    .line 86
    invoke-static {v2, v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    :goto_4
    iget-object v0, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 90
    .line 91
    const/4 v2, -0x1

    .line 92
    if-eqz v0, :cond_5

    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getState()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eq v0, v10, :cond_2

    .line 99
    .line 100
    goto :goto_7

    .line 101
    :cond_2
    mul-int/lit16 v0, v8, 0x400

    .line 102
    .line 103
    mul-int/2addr v0, v9

    .line 104
    div-int/2addr v0, v11

    .line 105
    if-le v0, v12, :cond_3

    .line 106
    .line 107
    new-array v0, v12, [B

    .line 108
    .line 109
    iput-object v0, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_3
    new-array v0, v0, [B

    .line 113
    .line 114
    iput-object v0, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 115
    .line 116
    :goto_5
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 119
    .line 120
    .line 121
    move-result-object v13

    .line 122
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v14

    .line 126
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v16

    .line 134
    iget-object v3, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 135
    .line 136
    array-length v3, v3

    .line 137
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v17

    .line 141
    iget-object v3, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 142
    .line 143
    invoke-virtual {v3}, Landroid/media/AudioRecord;->getState()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v18

    .line 151
    filled-new-array/range {v13 .. v18}, [Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    const-string v4, "audio record: mic open rate=%dHZ, channels=%d, bits=%d, buffer=%d/%d, state=%d"

    .line 156
    .line 157
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    iget-object v0, v1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 165
    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    :try_start_1
    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :catch_1
    move-exception v0

    .line 173
    sget-object v3, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 174
    .line 175
    const-string v4, "mic startRecording failed."

    .line 176
    .line 177
    invoke-static {v3, v4, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    const-string v0, "start recording failed!"

    .line 181
    .line 182
    invoke-direct {v1, v2, v0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->onRecordError(ILjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    :cond_4
    :goto_6
    return-void

    .line 186
    :cond_5
    :goto_7
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 187
    .line 188
    const-string v3, "audio record: initialize the mic failed."

    .line 189
    .line 190
    invoke-static {v0, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-direct {v1}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->uninit()V

    .line 194
    .line 195
    .line 196
    const-string v0, "microphone permission denied!"

    .line 197
    .line 198
    invoke-direct {v1, v2, v0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->onRecordError(ILjava/lang/String;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method

.method private native nativeClassInit()V
.end method

.method private native nativeSendSysRecordAudioData([BIIII)V
.end method

.method private onRecordError(ILjava/lang/String;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mWeakRefListener:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/tencent/liteav/audio/impl/Record/c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0, p1, p2}, Lcom/tencent/liteav/audio/impl/Record/c;->onAudioRecordError(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    sget-object p1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 24
    .line 25
    const-string p2, "onRecordError:no callback"

    .line 26
    .line 27
    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method private onRecordPcmData([BIJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mWeakRefListener:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/tencent/liteav/audio/impl/Record/c;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/tencent/liteav/audio/impl/Record/c;->onAudioRecordPCM([BIJ)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    sget-object p1, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 20
    .line 21
    const-string p2, "onRecordPcmData:no callback"

    .line 22
    .line 23
    invoke-static {p1, p2}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private onRecordStart()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mWeakRefListener:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/tencent/liteav/audio/impl/Record/c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/tencent/liteav/audio/impl/Record/c;->onAudioRecordStart()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 24
    .line 25
    const-string v1, "onRecordStart:no callback"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
.end method

.method private onRecordStop()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mWeakRefListener:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lcom/tencent/liteav/audio/impl/Record/c;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Lcom/tencent/liteav/audio/impl/Record/c;->onAudioRecordStop()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 24
    .line 25
    const-string v1, "onRecordStop:no callback"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw v0
.end method

.method private uninit()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 7
    .line 8
    const-string v2, "stop mic"

    .line 9
    .line 10
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/media/AudioRecord;->release()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    sget-object v2, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 31
    .line 32
    const-string v3, "stop AudioRecord failed."

    .line 33
    .line 34
    invoke-static {v2, v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    :goto_0
    iput-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 38
    .line 39
    iput-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsCapFirstFrame:Z

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public declared-synchronized isRecording()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public pause(Z)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "system audio record pause"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mPause:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSendMuteData:Z

    .line 15
    .line 16
    return-void
.end method

.method public resume()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "system audio record resume"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mPause:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public run()V
    .locals 12

    .line 1
    iget-boolean v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "audio record: abandom start audio sys record thread!"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->onRecordStart()V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "start capture audio data ...,mIsRunning:"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v2, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, " Thread.interrupted:"

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v2, " mMic:"

    .line 46
    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v3, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->init()V

    .line 63
    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    :goto_0
    move v1, v0

    .line 67
    move v3, v1

    .line 68
    :goto_1
    iget-boolean v4, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z

    .line 69
    .line 70
    const/4 v5, 0x5

    .line 71
    if-eqz v4, :cond_7

    .line 72
    .line 73
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_7

    .line 78
    .line 79
    iget-object v4, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 80
    .line 81
    if-eqz v4, :cond_7

    .line 82
    .line 83
    if-gt v1, v5, :cond_7

    .line 84
    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    .line 87
    .line 88
    iget-object v4, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 89
    .line 90
    iget-object v5, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 91
    .line 92
    array-length v6, v5

    .line 93
    sub-int/2addr v6, v3

    .line 94
    invoke-virtual {v4, v5, v3, v6}, Landroid/media/AudioRecord;->read([BII)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    iget-object v5, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 99
    .line 100
    array-length v5, v5

    .line 101
    sub-int/2addr v5, v3

    .line 102
    if-eq v4, v5, :cond_2

    .line 103
    .line 104
    if-gtz v4, :cond_1

    .line 105
    .line 106
    sget-object v5, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 107
    .line 108
    new-instance v6, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v7, "read pcm error, len ="

    .line 114
    .line 115
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v5, v4}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v1, v1, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_1
    add-int/2addr v3, v4

    .line 132
    goto :goto_1

    .line 133
    :cond_2
    iget-boolean v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsCapFirstFrame:Z

    .line 134
    .line 135
    if-nez v1, :cond_3

    .line 136
    .line 137
    const/4 v1, -0x6

    .line 138
    const-string v3, "First frame captured#"

    .line 139
    .line 140
    invoke-direct {p0, v1, v3}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->onRecordError(ILjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const/4 v1, 0x1

    .line 144
    iput-boolean v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsCapFirstFrame:Z

    .line 145
    .line 146
    :cond_3
    iget-boolean v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSendMuteData:Z

    .line 147
    .line 148
    if-eqz v1, :cond_4

    .line 149
    .line 150
    iget-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 151
    .line 152
    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([BB)V

    .line 153
    .line 154
    .line 155
    :cond_4
    iget-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mPause:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eqz v1, :cond_6

    .line 162
    .line 163
    iget-boolean v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSendMuteData:Z

    .line 164
    .line 165
    if-eqz v1, :cond_5

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_5
    move-object v6, p0

    .line 169
    goto :goto_0

    .line 170
    :cond_6
    :goto_2
    iget-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 171
    .line 172
    array-length v3, v1

    .line 173
    invoke-static {}, Lcom/tencent/liteav/basic/util/TXCTimeUtil;->getTimeTick()J

    .line 174
    .line 175
    .line 176
    move-result-wide v4

    .line 177
    invoke-direct {p0, v1, v3, v4, v5}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->onRecordPcmData([BIJ)V

    .line 178
    .line 179
    .line 180
    iget-object v7, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordBuffer:[B

    .line 181
    .line 182
    array-length v8, v7

    .line 183
    iget v9, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSampleRate:I

    .line 184
    .line 185
    iget v10, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mChannels:I

    .line 186
    .line 187
    iget v11, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mBits:I

    .line 188
    .line 189
    move-object v6, p0

    .line 190
    invoke-direct/range {v6 .. v11}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->nativeSendSysRecordAudioData([BIIII)V

    .line 191
    .line 192
    .line 193
    goto :goto_0

    .line 194
    :cond_7
    move-object v6, p0

    .line 195
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 196
    .line 197
    new-instance v3, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    const-string v4, "stop capture audio data ...,mIsRunning:"

    .line 203
    .line 204
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    iget-boolean v4, v6, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z

    .line 208
    .line 209
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    iget-object v2, v6, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mMic:Landroid/media/AudioRecord;

    .line 216
    .line 217
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    const-string v2, " nFailedCount:"

    .line 221
    .line 222
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-static {v0, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-direct {p0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->uninit()V

    .line 236
    .line 237
    .line 238
    if-le v1, v5, :cond_8

    .line 239
    .line 240
    const/4 v0, -0x1

    .line 241
    const-string v1, "read data failed!"

    .line 242
    .line 243
    invoke-direct {p0, v0, v1}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->onRecordError(ILjava/lang/String;)V

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_8
    invoke-direct {p0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->onRecordStop()V

    .line 248
    .line 249
    .line 250
    return-void
.end method

.method public declared-synchronized setAudioRecordListener(Lcom/tencent/liteav/audio/impl/Record/c;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    :try_start_0
    iput-object p1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mWeakRefListener:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception p1

    .line 9
    goto :goto_1

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mWeakRefListener:Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return-void

    .line 19
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public start(III)V
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "start"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->threadMutex:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->stop()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mSampleRate:I

    .line 15
    .line 16
    iput p2, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mChannels:I

    .line 17
    .line 18
    iput p3, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mBits:I

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    iput-boolean p1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z

    .line 22
    .line 23
    new-instance p1, Ljava/lang/Thread;

    .line 24
    .line 25
    const-string p2, "AudioSysRecord Thread"

    .line 26
    .line 27
    invoke-direct {p1, p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordThread:Ljava/lang/Thread;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 33
    .line 34
    .line 35
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    const-string p1, "start ok"

    .line 37
    .line 38
    invoke-static {v0, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw p1
.end method

.method public stop()V
    .locals 7

    .line 1
    sget-object v0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "stop"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->threadMutex:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :try_start_0
    iput-boolean v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mIsRunning:Z

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    iget-object v3, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordThread:Ljava/lang/Thread;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v3}, Ljava/lang/Thread;->isAlive()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    .line 33
    .line 34
    .line 35
    move-result-wide v3

    .line 36
    iget-object v5, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordThread:Ljava/lang/Thread;

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    cmp-long v3, v3, v5

    .line 43
    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    :try_start_1
    iget-object v3, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordThread:Ljava/lang/Thread;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Thread;->join()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception v3

    .line 55
    :try_start_2
    sget-object v4, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v5, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    const-string v6, "record stop Exception: "

    .line 63
    .line 64
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-static {v4, v3}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_0
    :goto_0
    sget-object v3, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->TAG:Ljava/lang/String;

    .line 82
    .line 83
    new-instance v4, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v5, "stop ok,stop record cost time(MS): "

    .line 89
    .line 90
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 94
    .line 95
    .line 96
    move-result-wide v5

    .line 97
    sub-long/2addr v5, v1

    .line 98
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v3, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    const/4 v1, 0x0

    .line 109
    iput-object v1, p0, Lcom/tencent/liteav/audio/impl/Record/TXCAudioSysRecord;->mRecordThread:Ljava/lang/Thread;

    .line 110
    .line 111
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 112
    const-string v0, "stop ok"

    .line 113
    .line 114
    invoke-static {v3, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 119
    throw v1
.end method
