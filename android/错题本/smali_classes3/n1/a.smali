.class public final Ln1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Lcom/stormdzh/lame4android/PCMFormat;


# instance fields
.field public a:Landroid/media/AudioRecord;

.field public b:I

.field public c:[S

.field public d:Ln1/c;

.field public e:I

.field public f:Ljava/io/File;

.field public final g:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/stormdzh/lame4android/PCMFormat;->PCM_16BIT:Lcom/stormdzh/lame4android/PCMFormat;

    .line 2
    .line 3
    sput-object v0, Ln1/a;->h:Lcom/stormdzh/lame4android/PCMFormat;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Ln1/a;->g:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Ln1/a;->g:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Ln1/a;->c()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/media/AudioRecord;->stop()V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 22
    .line 23
    invoke-virtual {v2}, Landroid/media/AudioRecord;->release()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v2

    .line 28
    goto :goto_4

    .line 29
    :catch_0
    move-exception v2

    .line 30
    goto :goto_2

    .line 31
    :cond_0
    :goto_0
    iget-object v2, p0, Ln1/a;->d:Ln1/c;

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, v2, Ln1/c;->a:Lcom/blankj/utilcode/util/h;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 41
    .line 42
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 43
    .line 44
    .line 45
    throw v2

    .line 46
    :cond_2
    move-object v2, v1

    .line 47
    :goto_1
    if-eqz v2, :cond_3

    .line 48
    .line 49
    new-instance v3, Landroid/os/Message;

    .line 50
    .line 51
    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 52
    .line 53
    .line 54
    const/4 v4, 0x1

    .line 55
    iput v4, v3, Landroid/os/Message;->what:I

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/h;->handleMessage(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    .line 60
    goto :goto_3

    .line 61
    :goto_2
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_3
    :try_start_2
    iput-object v1, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 65
    .line 66
    monitor-exit v0

    .line 67
    return-void

    .line 68
    :catchall_1
    move-exception v1

    .line 69
    goto :goto_5

    .line 70
    :goto_4
    iput-object v1, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 71
    .line 72
    throw v2

    .line 73
    :goto_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    throw v1
.end method

.method public final b(Ljava/io/File;)V
    .locals 13

    .line 1
    sget-object v0, Ln1/a;->h:Lcom/stormdzh/lame4android/PCMFormat;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/stormdzh/lame4android/PCMFormat;->getAudioFormat()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x3e80

    .line 8
    .line 9
    const/16 v3, 0x10

    .line 10
    .line 11
    invoke-static {v2, v3, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iput v1, p0, Ln1/a;->b:I

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/stormdzh/lame4android/PCMFormat;->getBytesPerFrame()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget v4, p0, Ln1/a;->b:I

    .line 22
    .line 23
    div-int/2addr v4, v1

    .line 24
    rem-int/lit16 v5, v4, 0xa0

    .line 25
    .line 26
    const/16 v6, 0xa0

    .line 27
    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    rsub-int v5, v5, 0xa0

    .line 31
    .line 32
    add-int/2addr v5, v4

    .line 33
    mul-int/2addr v5, v1

    .line 34
    iput v5, p0, Ln1/a;->b:I

    .line 35
    .line 36
    :cond_0
    new-instance v7, Landroid/media/AudioRecord;

    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/stormdzh/lame4android/PCMFormat;->getAudioFormat()I

    .line 39
    .line 40
    .line 41
    move-result v11

    .line 42
    iget v12, p0, Ln1/a;->b:I

    .line 43
    .line 44
    const/16 v9, 0x3e80

    .line 45
    .line 46
    const/16 v10, 0x10

    .line 47
    .line 48
    const/4 v8, 0x1

    .line 49
    invoke-direct/range {v7 .. v12}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 50
    .line 51
    .line 52
    iput-object v7, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 53
    .line 54
    iget v0, p0, Ln1/a;->b:I

    .line 55
    .line 56
    new-array v0, v0, [S

    .line 57
    .line 58
    iput-object v0, p0, Ln1/a;->c:[S

    .line 59
    .line 60
    const/16 v0, 0x20

    .line 61
    .line 62
    const/4 v1, 0x7

    .line 63
    invoke-static {v2, v3, v2, v0, v1}, Lcom/stormdzh/lame4android/Lame;->init(IIIII)V

    .line 64
    .line 65
    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    iput-object p1, p0, Ln1/a;->f:Ljava/io/File;

    .line 69
    .line 70
    new-instance p1, Ln1/c;

    .line 71
    .line 72
    iget-object v0, p0, Ln1/a;->f:Ljava/io/File;

    .line 73
    .line 74
    iget v1, p0, Ln1/a;->b:I

    .line 75
    .line 76
    const-string v2, "DataEncodeThread"

    .line 77
    .line 78
    invoke-direct {p1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v2, Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-static {v2}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    iput-object v2, p1, Ln1/c;->d:Ljava/util/List;

    .line 91
    .line 92
    new-instance v2, Ljava/io/FileOutputStream;

    .line 93
    .line 94
    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 95
    .line 96
    .line 97
    iput-object v2, p1, Ln1/c;->c:Ljava/io/FileOutputStream;

    .line 98
    .line 99
    mul-int/lit8 v1, v1, 0x2

    .line 100
    .line 101
    int-to-double v0, v1

    .line 102
    const-wide/high16 v2, 0x3ff4000000000000L    # 1.25

    .line 103
    .line 104
    mul-double/2addr v0, v2

    .line 105
    const-wide v2, 0x40bc200000000000L    # 7200.0

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    add-double/2addr v0, v2

    .line 111
    double-to-int v0, v0

    .line 112
    new-array v0, v0, [B

    .line 113
    .line 114
    iput-object v0, p1, Ln1/c;->b:[B

    .line 115
    .line 116
    iput-object p1, p0, Ln1/a;->d:Ln1/c;

    .line 117
    .line 118
    invoke-virtual {p1}, Ln1/c;->start()V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 122
    .line 123
    iget-object v0, p0, Ln1/a;->d:Ln1/c;

    .line 124
    .line 125
    iget-object v1, v0, Ln1/c;->a:Lcom/blankj/utilcode/util/h;

    .line 126
    .line 127
    if-eqz v1, :cond_1

    .line 128
    .line 129
    invoke-virtual {p1, v0, v1}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;Landroid/os/Handler;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 133
    .line 134
    invoke-virtual {p1, v6}, Landroid/media/AudioRecord;->setPositionNotificationPeriod(I)I

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    .line 145
    .line 146
    const-string v0, "output file is null"

    .line 147
    .line 148
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    throw p1
.end method

.method public final c()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/media/AudioRecord;->getRecordingState()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final d(Ljava/io/File;)V
    .locals 4

    .line 1
    const-string v0, "Start recording, BufferSize = "

    .line 2
    .line 3
    iget-object v1, p0, Ln1/a;->g:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v2, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ln1/a;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    monitor-exit v1

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const/4 v2, -0x1

    .line 21
    iput v2, p0, Ln1/a;->e:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    const-string v2, "Mp3Recorder"

    .line 24
    .line 25
    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget v0, p0, Ln1/a;->b:I

    .line 31
    .line 32
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ln1/a;->b(Ljava/io/File;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    iput-object p1, p0, Ln1/a;->f:Ljava/io/File;

    .line 51
    .line 52
    :goto_0
    iget-object p1, p0, Ln1/a;->a:Landroid/media/AudioRecord;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/media/AudioRecord;->startRecording()V

    .line 55
    .line 56
    .line 57
    new-instance p1, Lcom/tencent/bugly/proguard/z0;

    .line 58
    .line 59
    const/4 v0, 0x3

    .line 60
    invoke-direct {p1, p0, v0}, Lcom/tencent/bugly/proguard/z0;-><init>(Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 64
    .line 65
    .line 66
    monitor-exit v1

    .line 67
    return-void

    .line 68
    :goto_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    throw p1
.end method
