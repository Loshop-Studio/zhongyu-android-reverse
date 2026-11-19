.class public final Lcom/zykj/sketch/core/record/AudioControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/record/AudioControl$Companion;,
        Lcom/zykj/sketch/core/record/AudioControl$TimeThread;
    }
.end annotation


# static fields
.field public static final AUDIO_SAMPLE_RATE:I = 0x3e80

.field public static final Companion:Lcom/zykj/sketch/core/record/AudioControl$Companion;


# instance fields
.field private final actionRecord:Lcom/zykj/sketch/core/ActionRecord;

.field private final audioFileList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private execute:Ljava/util/concurrent/ScheduledExecutorService;

.field private fileName:Ljava/lang/String;

.field private isRecord:Z

.field private listener:Lcom/zykj/sketch/core/listener/ProgressListener;

.field private mediaRecorder:Landroid/media/MediaRecorder;

.field private systemTime:J

.field private final timeThread:Lcom/zykj/sketch/core/record/AudioControl$TimeThread;

.field private totalTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/record/AudioControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/record/AudioControl$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/sketch/core/record/AudioControl;->Companion:Lcom/zykj/sketch/core/record/AudioControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/sketch/core/ActionRecord;)V
    .locals 1

    .line 1
    const-string v0, "actionRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->audioFileList:Ljava/util/List;

    .line 17
    .line 18
    const-string p1, ""

    .line 19
    .line 20
    iput-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 21
    .line 22
    new-instance p1, Lcom/zykj/sketch/core/record/AudioControl$TimeThread;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Lcom/zykj/sketch/core/record/AudioControl$TimeThread;-><init>(Lcom/zykj/sketch/core/record/AudioControl;)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->timeThread:Lcom/zykj/sketch/core/record/AudioControl$TimeThread;

    .line 28
    .line 29
    return-void
.end method

.method public static final synthetic access$getListener$p(Lcom/zykj/sketch/core/record/AudioControl;)Lcom/zykj/sketch/core/listener/ProgressListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/core/record/AudioControl;->listener:Lcom/zykj/sketch/core/listener/ProgressListener;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getSystemTime$p(Lcom/zykj/sketch/core/record/AudioControl;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getTotalTime$p(Lcom/zykj/sketch/core/record/AudioControl;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 2
    .line 3
    return-wide v0
.end method


# virtual methods
.method public final addListener(Lcom/zykj/sketch/core/listener/ProgressListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->listener:Lcom/zykj/sketch/core/listener/ProgressListener;

    .line 2
    .line 3
    return-void
.end method

.method public final isRecord()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->isRecord:Z

    .line 2
    .line 3
    return v0
.end method

.method public final reset()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 4
    .line 5
    return-void
.end method

.method public final declared-synchronized startRecord(Ljava/lang/String;)V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "sourcePath"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "AudioControl stopRecord \u91cc\u9762\u7ed3\u675f\u7684 "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/zykj/sketch/core/record/AudioControl;->stopRecord()V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception v0

    .line 40
    move-object p1, v0

    .line 41
    goto/16 :goto_4

    .line 42
    .line 43
    :cond_0
    :goto_0
    new-instance v0, Landroid/media/MediaRecorder;

    .line 44
    .line 45
    invoke-direct {v0}, Landroid/media/MediaRecorder;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 55
    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    const/16 v2, 0x3e80

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 79
    .line 80
    .line 81
    move-result-wide v2

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v4, ".amr"

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 100
    .line 101
    new-instance v0, Ljava/io/File;

    .line 102
    .line 103
    iget-object v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 104
    .line 105
    invoke-direct {v0, p1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 116
    .line 117
    if-eqz p1, :cond_4

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-virtual {p1, v4}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    iget-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->audioFileList:Ljava/util/List;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v4, "audioFile.absolutePath"

    .line 133
    .line 134
    invoke-static {v0, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    .line 140
    :try_start_1
    iget-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 141
    .line 142
    if-eqz p1, :cond_5

    .line 143
    .line 144
    invoke-virtual {p1}, Landroid/media/MediaRecorder;->prepare()V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :catch_0
    move-exception v0

    .line 149
    move-object p1, v0

    .line 150
    goto :goto_2

    .line 151
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 152
    .line 153
    if-eqz p1, :cond_6

    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/media/MediaRecorder;->start()V

    .line 156
    .line 157
    .line 158
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 159
    .line 160
    .line 161
    move-result-wide v4

    .line 162
    iput-wide v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 163
    .line 164
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    iput-object v6, p0, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 169
    .line 170
    if-eqz v6, :cond_7

    .line 171
    .line 172
    iget-object v7, p0, Lcom/zykj/sketch/core/record/AudioControl;->timeThread:Lcom/zykj/sketch/core/record/AudioControl$TimeThread;

    .line 173
    .line 174
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 175
    .line 176
    const-wide/16 v8, 0x0

    .line 177
    .line 178
    const-wide/16 v10, 0x32

    .line 179
    .line 180
    invoke-interface/range {v6 .. v12}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 181
    .line 182
    .line 183
    :cond_7
    iget-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 184
    .line 185
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 186
    .line 187
    iget-object v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {p1, v2, v3, v4}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStartEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {p1, v0, v2}, Lcom/zykj/sketch/core/ActionRecord;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 194
    .line 195
    .line 196
    new-instance p1, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 199
    .line 200
    .line 201
    const-string v0, "AudioControl startRecord \u6dfb\u52a0\u4e86\u52a8\u4f5c "

    .line 202
    .line 203
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 207
    .line 208
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 216
    .line 217
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    iput-boolean v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->isRecord:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 221
    .line 222
    goto :goto_3

    .line 223
    :goto_2
    :try_start_2
    sget-object v0, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 224
    .line 225
    new-instance v1, Ljava/lang/StringBuilder;

    .line 226
    .line 227
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 228
    .line 229
    .line 230
    const-string v2, "startRecording Exception "

    .line 231
    .line 232
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/utils/LogUtils$Companion;->e(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const/4 p1, 0x0

    .line 250
    iput-boolean p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->isRecord:Z

    .line 251
    .line 252
    const/4 p1, 0x0

    .line 253
    iput-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 254
    .line 255
    iget-object p1, p0, Lcom/zykj/sketch/core/record/AudioControl;->listener:Lcom/zykj/sketch/core/listener/ProgressListener;

    .line 256
    .line 257
    if-eqz p1, :cond_8

    .line 258
    .line 259
    invoke-interface {p1}, Lcom/zykj/sketch/core/listener/ProgressListener;->recordError()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 260
    .line 261
    .line 262
    :cond_8
    :goto_3
    monitor-exit p0

    .line 263
    return-void

    .line 264
    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 265
    throw p1
.end method

.method public final declared-synchronized stopRecord()V
    .locals 10

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    :try_start_1
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 13
    .line 14
    .line 15
    :try_start_2
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    :goto_0
    iget-wide v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v6

    .line 32
    iget-wide v8, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 33
    .line 34
    sub-long/2addr v6, v8

    .line 35
    add-long/2addr v4, v6

    .line 36
    iput-wide v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 37
    .line 38
    iput-wide v2, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 39
    .line 40
    iput-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 41
    .line 42
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 43
    .line 44
    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 47
    .line 48
    .line 49
    move-result-wide v2

    .line 50
    iget-object v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v2, v3, v4}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStopEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/zykj/sketch/core/ActionRecord;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    iget-object v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 62
    .line 63
    if-eqz v4, :cond_1

    .line 64
    .line 65
    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 66
    .line 67
    .line 68
    :cond_1
    iget-wide v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 69
    .line 70
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 71
    .line 72
    .line 73
    move-result-wide v6

    .line 74
    iget-wide v8, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 75
    .line 76
    sub-long/2addr v6, v8

    .line 77
    add-long/2addr v4, v6

    .line 78
    iput-wide v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 79
    .line 80
    iput-wide v2, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 81
    .line 82
    iput-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 83
    .line 84
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 85
    .line 86
    sget-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v3

    .line 92
    iget-object v5, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1, v3, v4, v5}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStopEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v1, v2, v3}, Lcom/zykj/sketch/core/ActionRecord;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 99
    .line 100
    .line 101
    throw v0

    .line 102
    :catch_0
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 107
    .line 108
    .line 109
    :cond_2
    iget-wide v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 110
    .line 111
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 112
    .line 113
    .line 114
    move-result-wide v6

    .line 115
    iget-wide v8, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 116
    .line 117
    sub-long/2addr v6, v8

    .line 118
    add-long/2addr v4, v6

    .line 119
    iput-wide v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 120
    .line 121
    iput-wide v2, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 122
    .line 123
    iput-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 124
    .line 125
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 126
    .line 127
    sget-object v1, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 128
    .line 129
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 130
    .line 131
    .line 132
    move-result-wide v2

    .line 133
    iget-object v4, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v0, v2, v3, v4}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStopEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    goto :goto_1

    .line 140
    :cond_3
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const-string v1, "AudioControl stopRecord \u6dfb\u52a0\u4e86\u52a8\u4f5c "

    .line 146
    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 160
    .line 161
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    const/4 v0, 0x0

    .line 165
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->isRecord:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    .line 167
    monitor-exit p0

    .line 168
    return-void

    .line 169
    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    throw v0
.end method
