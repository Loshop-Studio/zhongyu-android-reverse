# RE note 本类字节码直接引用的读写或显示接口包括文件流。
.class public Lcom/zykj/paint/record/AudioRecorder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/paint/record/AudioRecorder$Status;,
        Lcom/zykj/paint/record/AudioRecorder$AudioRecordHolder;
    }
.end annotation


# static fields
.field private static final AUDIO_CHANNEL:I = 0x10

.field private static final AUDIO_ENCODING:I = 0x2

.field private static final AUDIO_INPUT:I = 0x1

.field private static final AUDIO_SAMPLE_RATE:I = 0x3e80

.field private static final TAG:Ljava/lang/String; = "AudioRecorder"

.field private static audioRecorder:Lcom/zykj/paint/record/AudioRecorder;


# instance fields
.field private audioRecord:Landroid/media/AudioRecord;

.field private bufferSizeInBytes:I

.field private fileName:Ljava/lang/String;

.field private filesName:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private path:Ljava/lang/String;

.field private status:Lcom/zykj/paint/record/AudioRecorder$Status;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 4
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_NO_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/paint/record/AudioRecorder$1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/record/AudioRecorder;-><init>()V

    return-void
.end method

.method public static synthetic access$200(Lcom/zykj/paint/record/AudioRecorder;Lcom/zykj/paint/record/RecordStreamListener;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/paint/record/AudioRecorder;->writeDataTOFile(Lcom/zykj/paint/record/RecordStreamListener;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$300(Lcom/zykj/paint/record/AudioRecorder;)Landroid/media/AudioRecord;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$400(Lcom/zykj/paint/record/AudioRecorder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/record/AudioRecorder;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$500(Lcom/zykj/paint/record/AudioRecorder;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/paint/record/AudioRecorder;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$502(Lcom/zykj/paint/record/AudioRecorder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/paint/record/AudioRecorder;->fileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p1
.end method

.method public static getInstance()Lcom/zykj/paint/record/AudioRecorder;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/record/AudioRecorder$AudioRecordHolder;->access$100()Lcom/zykj/paint/record/AudioRecorder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private makePCMFile2Amr(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/paint/record/AmrEncoder;

    .line 2
    .line 3
    invoke-direct {v0, p2}, Lcom/zykj/paint/record/AmrEncoder;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p2, Lcom/zykj/paint/record/AudioRecorder$3;

    .line 7
    .line 8
    invoke-direct {p2, p0, v0, p1}, Lcom/zykj/paint/record/AudioRecorder$3;-><init>(Lcom/zykj/paint/record/AudioRecorder;Lcom/zykj/paint/record/AmrEncoder;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/zykj/paint/record/AudioRecorder$3;->run()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private makePCMFileToWAVFile()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/paint/record/AudioRecorder$5;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/zykj/paint/record/AudioRecorder$5;-><init>(Lcom/zykj/paint/record/AudioRecorder;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private mergePCMFilesToWAVFile(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/Thread;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/paint/record/AudioRecorder$4;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1, p2}, Lcom/zykj/paint/record/AudioRecorder$4;-><init>(Lcom/zykj/paint/record/AudioRecorder;Ljava/util/List;Z)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private writeDataTOFile(Lcom/zykj/paint/record/RecordStreamListener;)V
    .locals 7

    .line 1
    const-string v0, "AudioRecorder"

    .line 2
    .line 3
    iget v1, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 4
    .line 5
    new-array v2, v1, [B

    .line 6
    .line 7
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v4, p0, Lcom/zykj/paint/record/AudioRecorder;->fileName:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v4, "--"

    .line 18
    .line 19
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v4

    .line 26
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    new-instance v4, Ljava/io/File;

    .line 39
    .line 40
    invoke-static {v3}, Lcom/zykj/paint/record/AudioFileUtils;->getPcmFileAbsolutePath(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v4, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_0

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v3

    .line 58
    goto :goto_1

    .line 59
    :catch_1
    move-exception p1

    .line 60
    goto :goto_5

    .line 61
    :cond_0
    :goto_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 62
    .line 63
    invoke-direct {v3, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :goto_1
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    :goto_2
    sget-object v4, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_START:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 76
    .line 77
    iput-object v4, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 78
    .line 79
    :cond_1
    :goto_3
    iget-object v4, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 80
    .line 81
    sget-object v5, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_START:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 82
    .line 83
    if-ne v4, v5, :cond_2

    .line 84
    .line 85
    iget-object v4, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 86
    .line 87
    iget v5, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 88
    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-virtual {v4, v2, v6, v5}, Landroid/media/AudioRecord;->read([BII)I

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    const/4 v5, -0x3

    .line 95
    if-eq v5, v4, :cond_1

    .line 96
    .line 97
    if-eqz v3, :cond_1

    .line 98
    .line 99
    :try_start_1
    invoke-virtual {v3, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 100
    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    invoke-interface {p1, v2, v6, v1}, Lcom/zykj/paint/record/RecordStreamListener;->recordOfByte([BII)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2

    .line 105
    .line 106
    .line 107
    goto :goto_3

    .line 108
    :catch_2
    move-exception v4

    .line 109
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    if-eqz v3, :cond_3

    .line 118
    .line 119
    :try_start_2
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    .line 120
    .line 121
    .line 122
    goto :goto_4

    .line 123
    :catch_3
    move-exception p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 129
    .line 130
    .line 131
    :cond_3
    :goto_4
    return-void

    .line 132
    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw v0
.end method


# virtual methods
.method public canel()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->fileName:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/media/AudioRecord;->release()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_NO_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 21
    .line 22
    return-void
.end method

.method public clearTempRecord()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/zykj/paint/record/AudioFileUtils;->clearPcmFiles()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public createAudio(Ljava/lang/String;IIII)V
    .locals 7

    .line 1
    invoke-static {p3, p4, p5}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 6
    .line 7
    new-instance v1, Landroid/media/AudioRecord;

    .line 8
    .line 9
    iget v6, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 10
    .line 11
    move v2, p2

    .line 12
    move v3, p3

    .line 13
    move v4, p4

    .line 14
    move v5, p5

    .line 15
    invoke-direct/range {v1 .. v6}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/zykj/paint/record/AudioRecorder;->fileName:Ljava/lang/String;

    .line 21
    .line 22
    return-void
.end method

.method public createDefaultAudio(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/16 v2, 0x3e80

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iput v0, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 11
    .line 12
    new-instance v1, Landroid/media/AudioRecord;

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    iget v6, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const/16 v3, 0x3e80

    .line 19
    .line 20
    const/16 v4, 0x10

    .line 21
    .line 22
    invoke-direct/range {v1 .. v6}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 26
    .line 27
    iput-object p3, p0, Lcom/zykj/paint/record/AudioRecorder;->fileName:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p2, p0, Lcom/zykj/paint/record/AudioRecorder;->path:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/paint/record/AudioFileUtils;->setFilePath(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object p1, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 37
    .line 38
    return-void
.end method

.method public getPcmFilesCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getStatus()Lcom/zykj/paint/record/AudioRecorder$Status;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 2
    .line 3
    return-object v0
.end method

.method public pauseRecord()V
    .locals 3

    .line 1
    const-string v0, "===pauseRecord==="

    .line 2
    .line 3
    const-string v1, "AudioRecorder"

    .line 4
    .line 5
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 9
    .line 10
    sget-object v2, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_START:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    const-string v0, "[\u5df2\u6682\u505c]"

    .line 15
    .line 16
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_PAUSE:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/paint/record/AudioRecorder;->preview()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public preview()V
    .locals 6

    .line 1
    const-string v0, "[fileName.size()]-->>>>"

    .line 2
    .line 3
    const-string v1, "===release==="

    .line 4
    .line 5
    const-string v2, "AudioRecorder"

    .line 6
    .line 7
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-lez v1, :cond_1

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Ljava/lang/String;

    .line 61
    .line 62
    new-instance v4, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    const-string v5, "[fileName]-->>>>"

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v2, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    invoke-static {v3}, Lcom/zykj/paint/record/AudioFileUtils;->getPcmFileAbsolutePath(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :catch_0
    move-exception v0

    .line 91
    goto :goto_1

    .line 92
    :cond_0
    const/4 v1, 0x1

    .line 93
    invoke-direct {p0, v0, v1}, Lcom/zykj/paint/record/AudioRecorder;->mergePCMFilesToWAVFile(Ljava/util/List;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    :cond_1
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_NO_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 97
    .line 98
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 99
    .line 100
    return-void

    .line 101
    :goto_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v1
.end method

.method public release()V
    .locals 3

    .line 1
    const-string v0, "AudioRecorder"

    .line 2
    .line 3
    const-string v1, "===release==="

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-lez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {v1}, Ljava/util/List;->clear()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_2

    .line 25
    :catch_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/media/AudioRecord;->release()V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 35
    .line 36
    :cond_1
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_NO_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 37
    .line 38
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 39
    .line 40
    return-void

    .line 41
    :goto_1
    :try_start_1
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    :goto_2
    iget-object v2, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/media/AudioRecord;->release()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 59
    .line 60
    :cond_2
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_NO_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 61
    .line 62
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 63
    .line 64
    throw v1
.end method

.method public resume()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 2
    .line 3
    const-string v1, "===resumeRecord==="

    .line 4
    .line 5
    const-string v2, "AudioRecorder"

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v3, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 15
    .line 16
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    const/16 v0, 0x10

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    const/16 v4, 0x3e80

    .line 30
    .line 31
    invoke-static {v4, v0, v3}, Landroid/media/AudioRecord;->getMinBufferSize(III)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 36
    .line 37
    new-instance v3, Landroid/media/AudioRecord;

    .line 38
    .line 39
    const/4 v7, 0x2

    .line 40
    iget v8, p0, Lcom/zykj/paint/record/AudioRecorder;->bufferSizeInBytes:I

    .line 41
    .line 42
    const/4 v4, 0x1

    .line 43
    const/16 v5, 0x3e80

    .line 44
    .line 45
    const/16 v6, 0x10

    .line 46
    .line 47
    invoke-direct/range {v3 .. v8}, Landroid/media/AudioRecord;-><init>(IIIII)V

    .line 48
    .line 49
    .line 50
    iput-object v3, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 51
    .line 52
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/media/AudioRecord;->getState()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 74
    .line 75
    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_START:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 79
    .line 80
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 81
    .line 82
    new-instance v0, Ljava/lang/Thread;

    .line 83
    .line 84
    new-instance v1, Lcom/zykj/paint/record/AudioRecorder$1;

    .line 85
    .line 86
    invoke-direct {v1, p0}, Lcom/zykj/paint/record/AudioRecorder$1;-><init>(Lcom/zykj/paint/record/AudioRecorder;)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public startRecord()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->filesName:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 7
    .line 8
    sget-object v1, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_NO_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->fileName:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "===startRecord==="

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/media/AudioRecord;->getState()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "AudioRecorder"

    .line 38
    .line 39
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/media/AudioRecord;->startRecording()V

    .line 45
    .line 46
    .line 47
    new-instance v0, Ljava/lang/Thread;

    .line 48
    .line 49
    new-instance v1, Lcom/zykj/paint/record/AudioRecorder$2;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Lcom/zykj/paint/record/AudioRecorder$2;-><init>(Lcom/zykj/paint/record/AudioRecorder;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public stopRecord()V
    .locals 2

    .line 1
    const-string v0, "AudioRecorder"

    .line 2
    .line 3
    const-string v1, "===stopRecord==="

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 9
    .line 10
    sget-object v1, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_NO_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 11
    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    sget-object v1, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_READY:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v0, Lcom/zykj/paint/record/AudioRecorder$Status;->STATUS_STOP:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 20
    .line 21
    iput-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->status:Lcom/zykj/paint/record/AudioRecorder$Status;

    .line 22
    .line 23
    iget-object v0, p0, Lcom/zykj/paint/record/AudioRecorder;->audioRecord:Landroid/media/AudioRecord;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/media/AudioRecord;->stop()V

    .line 26
    .line 27
    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/paint/record/AudioRecorder;->release()V

    .line 29
    .line 30
    .line 31
    return-void
.end method
