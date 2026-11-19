.class public Lt7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt7/a$a;
    }
.end annotation


# static fields
.field public static final m:Lcom/stormdzh/lame4android/PCMFormat;


# instance fields
.field public a:Landroid/media/AudioRecord;

.field public b:I

.field public c:[S

.field public d:Lt7/b;

.field public e:I

.field public f:I

.field public g:Lcom/stormdzh/lame4android/PCMFormat;

.field public h:I

.field public i:Ljava/io/File;

.field public j:Ljava/lang/Thread;

.field public k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/stormdzh/lame4android/PCMFormat;->f:Lcom/stormdzh/lame4android/PCMFormat;

    .line 2
    .line 3
    sput-object v0, Lt7/a;->m:Lcom/stormdzh/lame4android/PCMFormat;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 7
    sget-object v0, Lt7/a;->m:Lcom/stormdzh/lame4android/PCMFormat;

    const/16 v1, 0x3e80

    const/16 v2, 0x10

    invoke-direct {p0, v1, v2, v0}, Lt7/a;-><init>(IILcom/stormdzh/lame4android/PCMFormat;)V

    return-void
.end method

.method public constructor <init>(IILcom/stormdzh/lame4android/PCMFormat;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 3
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lt7/a;->l:Ljava/lang/Object;

    .line 4
    iput p1, p0, Lt7/a;->e:I

    .line 5
    iput p2, p0, Lt7/a;->f:I

    .line 6
    iput-object p3, p0, Lt7/a;->g:Lcom/stormdzh/lame4android/PCMFormat;

    return-void
.end method

.method public static synthetic a(Lt7/a;I)I
    .locals 0

    .line 1
    iput p1, p0, Lt7/a;->k:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic b(Lt7/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lt7/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lt7/a;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lt7/a;)Lt7/a$a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Lt7/a;)Landroid/media/AudioRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lt7/a;)[S
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/a;->c:[S

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Lt7/a;)I
    .locals 0

    .line 1
    iget p0, p0, Lt7/a;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic j(Lt7/a;)Lt7/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/a;->d:Lt7/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic k(Lt7/a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt7/a;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lt7/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    invoke-virtual {p0}, Lt7/a;->l()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-object v2, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/media/AudioRecord;->stop()V

    .line 19
    .line 20
    .line 21
    iget-object v2, p0, Lt7/a;->a:Landroid/media/AudioRecord;

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
    iget-object v2, p0, Lt7/a;->d:Lt7/b;

    .line 32
    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-virtual {v2}, Lt7/b;->b()Lt7/b$a;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v2, v1

    .line 41
    :goto_1
    if-eqz v2, :cond_2

    .line 42
    .line 43
    new-instance v3, Landroid/os/Message;

    .line 44
    .line 45
    invoke-direct {v3}, Landroid/os/Message;-><init>()V

    .line 46
    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    iput v4, v3, Landroid/os/Message;->what:I

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lt7/b$a;->handleMessage(Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :goto_2
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_3
    :try_start_2
    iput-object v1, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :catchall_1
    move-exception v1

    .line 63
    goto :goto_5

    .line 64
    :goto_4
    iput-object v1, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 65
    .line 66
    throw v2

    .line 67
    :goto_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    throw v1
.end method

.method public final d(Ljava/io/File;)V
    .locals 11

    .line 1
    iget v0, p0, Lt7/a;->e:I

    .line 2
    .line 3
    iget v1, p0, Lt7/a;->f:I

    .line 4
    .line 5
    iget-object v2, p0, Lt7/a;->g:Lcom/stormdzh/lame4android/PCMFormat;

    .line 6
    .line 7
    invoke-virtual {v2}, Lcom/stormdzh/lame4android/PCMFormat;->a()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v0, v1, v2}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, Lt7/a;->b:I

    .line 16
    .line 17
    sget-object v0, Lt7/a;->m:Lcom/stormdzh/lame4android/PCMFormat;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/stormdzh/lame4android/PCMFormat;->c()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget v2, p0, Lt7/a;->b:I

    .line 24
    .line 25
    div-int/2addr v2, v1

    .line 26
    rem-int/lit16 v3, v2, 0xa0

    .line 27
    .line 28
    const/16 v4, 0xa0

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    rsub-int v3, v3, 0xa0

    .line 33
    .line 34
    add-int/2addr v2, v3

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iput v2, p0, Lt7/a;->b:I

    .line 37
    .line 38
    :cond_0
    new-instance v5, Landroid/media/AudioRecord;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/stormdzh/lame4android/PCMFormat;->a()I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    iget v10, p0, Lt7/a;->b:I

    .line 45
    .line 46
    const/16 v7, 0x3e80

    .line 47
    .line 48
    const/16 v8, 0x10

    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    invoke-direct/range {v5 .. v10}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 52
    .line 53
    .line 54
    iput-object v5, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 55
    .line 56
    iget v0, p0, Lt7/a;->b:I

    .line 57
    .line 58
    new-array v0, v0, [S

    .line 59
    .line 60
    iput-object v0, p0, Lt7/a;->c:[S

    .line 61
    .line 62
    iget v0, p0, Lt7/a;->e:I

    .line 63
    .line 64
    iget v1, p0, Lt7/a;->f:I

    .line 65
    .line 66
    const/16 v2, 0x20

    .line 67
    .line 68
    const/4 v3, 0x7

    .line 69
    invoke-static {v0, v1, v0, v2, v3}, Lcom/stormdzh/lame4android/Lame;->init(IIIII)V

    .line 70
    .line 71
    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    iput-object p1, p0, Lt7/a;->i:Ljava/io/File;

    .line 75
    .line 76
    new-instance p1, Lt7/b;

    .line 77
    .line 78
    iget-object v0, p0, Lt7/a;->i:Ljava/io/File;

    .line 79
    .line 80
    iget v1, p0, Lt7/a;->b:I

    .line 81
    .line 82
    invoke-direct {p1, v0, v1}, Lt7/b;-><init>(Ljava/io/File;I)V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lt7/a;->d:Lt7/b;

    .line 86
    .line 87
    invoke-virtual {p1}, Lt7/b;->start()V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 91
    .line 92
    iget-object v0, p0, Lt7/a;->d:Lt7/b;

    .line 93
    .line 94
    invoke-virtual {v0}, Lt7/b;->b()Lt7/b$a;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1, v0, v1}, Landroid/media/AudioRecord;->setRecordPositionUpdateListener(Landroid/media/AudioRecord$OnRecordPositionUpdateListener;Landroid/os/Handler;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 102
    .line 103
    invoke-virtual {p1, v4}, Landroid/media/AudioRecord;->setPositionNotificationPeriod(I)I

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_1
    new-instance p1, Ljava/lang/Exception;

    .line 108
    .line 109
    const-string v0, "output file is null"

    .line 110
    .line 111
    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p1
.end method

.method public l()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lt7/a;->a:Landroid/media/AudioRecord;

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

.method public m(ILjava/io/File;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lt7/a;->l:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lt7/a;->l()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iput p1, p0, Lt7/a;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    const-string p1, "Mp3Recorder"

    .line 21
    .line 22
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "Start recording, BufferSize = "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget v2, p0, Lt7/a;->b:I

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
    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 45
    .line 46
    if-nez p1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, p2}, Lt7/a;->d(Ljava/io/File;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    iput-object p2, p0, Lt7/a;->i:Ljava/io/File;

    .line 53
    .line 54
    :goto_0
    iget-object p1, p0, Lt7/a;->a:Landroid/media/AudioRecord;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/media/AudioRecord;->startRecording()V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lt7/a$b;

    .line 60
    .line 61
    invoke-direct {p1, p0}, Lt7/a$b;-><init>(Lt7/a;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lt7/a;->j:Ljava/lang/Thread;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 67
    .line 68
    .line 69
    monitor-exit v0

    .line 70
    return-void

    .line 71
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    throw p1
.end method

.method public n()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt7/a;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
