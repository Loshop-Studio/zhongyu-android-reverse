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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010!\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\u0018\u0000 *2\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00082\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0018\u0010#\u001a\u00060\"R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010\'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010)\u00a8\u0006,"
    }
    d2 = {
        "Lcom/zykj/sketch/core/record/AudioControl;",
        "",
        "Lcom/zykj/sketch/core/ActionRecord;",
        "actionRecord",
        "<init>",
        "(Lcom/zykj/sketch/core/ActionRecord;)V",
        "",
        "sourcePath",
        "Ld6/s;",
        "startRecord",
        "(Ljava/lang/String;)V",
        "stopRecord",
        "()V",
        "",
        "isRecord",
        "()Z",
        "Lcom/zykj/sketch/core/listener/ProgressListener;",
        "listener",
        "addListener",
        "(Lcom/zykj/sketch/core/listener/ProgressListener;)V",
        "reset",
        "Lcom/zykj/sketch/core/ActionRecord;",
        "Landroid/media/MediaRecorder;",
        "mediaRecorder",
        "Landroid/media/MediaRecorder;",
        "",
        "audioFileList",
        "Ljava/util/List;",
        "fileName",
        "Ljava/lang/String;",
        "Z",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "execute",
        "Ljava/util/concurrent/ScheduledExecutorService;",
        "Lcom/zykj/sketch/core/record/AudioControl$TimeThread;",
        "timeThread",
        "Lcom/zykj/sketch/core/record/AudioControl$TimeThread;",
        "",
        "totalTime",
        "J",
        "systemTime",
        "Lcom/zykj/sketch/core/listener/ProgressListener;",
        "Companion",
        "TimeThread",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final AUDIO_SAMPLE_RATE:I = 0x3e80

.field public static final Companion:Lcom/zykj/sketch/core/record/AudioControl$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final actionRecord:Lcom/zykj/sketch/core/ActionRecord;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final audioFileList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private execute:Ljava/util/concurrent/ScheduledExecutorService;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private fileName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isRecord:Z

.field private listener:Lcom/zykj/sketch/core/listener/ProgressListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private mediaRecorder:Landroid/media/MediaRecorder;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private systemTime:J

.field private final timeThread:Lcom/zykj/sketch/core/record/AudioControl$TimeThread;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private totalTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/record/AudioControl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/record/AudioControl$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/sketch/core/record/AudioControl;->Companion:Lcom/zykj/sketch/core/record/AudioControl$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/sketch/core/ActionRecord;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/ActionRecord;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "actionRecord"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    .param p1    # Lcom/zykj/sketch/core/listener/ProgressListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

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
    .locals 17
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "startRecording Exception "

    .line 6
    .line 7
    const-string v3, "AudioControl startRecord \u6dfb\u52a0\u4e86\u52a8\u4f5c "

    .line 8
    .line 9
    const-string v4, "AudioControl stopRecord \u91cc\u9762\u7ed3\u675f\u7684 "

    .line 10
    .line 11
    monitor-enter p0

    .line 12
    :try_start_0
    const-string v5, "sourcePath"

    .line 13
    .line 14
    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v5, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 18
    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    new-instance v5, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v4, v1, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    sget-object v5, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 36
    .line 37
    invoke-virtual {v5, v4}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/zykj/sketch/core/record/AudioControl;->stopRecord()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_0
    :goto_0
    new-instance v4, Landroid/media/MediaRecorder;

    .line 48
    .line 49
    invoke-direct {v4}, Landroid/media/MediaRecorder;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v4, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    invoke-virtual {v4, v5}, Landroid/media/MediaRecorder;->setAudioSource(I)V

    .line 56
    .line 57
    .line 58
    iget-object v4, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    const/4 v6, 0x3

    .line 63
    invoke-virtual {v4, v6}, Landroid/media/MediaRecorder;->setOutputFormat(I)V

    .line 64
    .line 65
    .line 66
    :cond_1
    iget-object v4, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 67
    .line 68
    if-eqz v4, :cond_2

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Landroid/media/MediaRecorder;->setAudioEncoder(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    iget-object v4, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    const/16 v6, 0x3e80

    .line 78
    .line 79
    invoke-virtual {v4, v6}, Landroid/media/MediaRecorder;->setAudioSamplingRate(I)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    new-instance v4, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v8, ".amr"

    .line 95
    .line 96
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    iput-object v4, v1, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 104
    .line 105
    new-instance v4, Ljava/io/File;

    .line 106
    .line 107
    iget-object v8, v1, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 108
    .line 109
    invoke-direct {v4, v0, v8}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 117
    .line 118
    .line 119
    iget-object v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 120
    .line 121
    if-eqz v0, :cond_4

    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    invoke-virtual {v0, v8}, Landroid/media/MediaRecorder;->setOutputFile(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    iget-object v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->audioFileList:Ljava/util/List;

    .line 131
    .line 132
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    const-string v8, "audioFile.absolutePath"

    .line 137
    .line 138
    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    :try_start_1
    iget-object v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 145
    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->prepare()V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :catch_0
    move-exception v0

    .line 153
    goto :goto_2

    .line 154
    :cond_5
    :goto_1
    iget-object v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 155
    .line 156
    if-eqz v0, :cond_6

    .line 157
    .line 158
    invoke-virtual {v0}, Landroid/media/MediaRecorder;->start()V

    .line 159
    .line 160
    .line 161
    :cond_6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 162
    .line 163
    .line 164
    move-result-wide v8

    .line 165
    iput-wide v8, v1, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 166
    .line 167
    invoke-static {v5}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    .line 168
    .line 169
    .line 170
    move-result-object v10

    .line 171
    iput-object v10, v1, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 172
    .line 173
    if-eqz v10, :cond_7

    .line 174
    .line 175
    iget-object v11, v1, Lcom/zykj/sketch/core/record/AudioControl;->timeThread:Lcom/zykj/sketch/core/record/AudioControl$TimeThread;

    .line 176
    .line 177
    sget-object v16, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 178
    .line 179
    const-wide/16 v12, 0x0

    .line 180
    .line 181
    const-wide/16 v14, 0x32

    .line 182
    .line 183
    invoke-interface/range {v10 .. v16}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 184
    .line 185
    .line 186
    :cond_7
    iget-object v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 187
    .line 188
    sget-object v4, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_START:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 189
    .line 190
    iget-object v8, v1, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {v0, v6, v7, v8}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStartEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-virtual {v0, v4, v6}, Lcom/zykj/sketch/core/ActionRecord;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 197
    .line 198
    .line 199
    new-instance v0, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    iget-object v3, v1, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 214
    .line 215
    invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    iput-boolean v5, v1, Lcom/zykj/sketch/core/record/AudioControl;->isRecord:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :goto_2
    :try_start_2
    sget-object v3, Lcom/zykj/sketch/utils/LogUtils;->Companion:Lcom/zykj/sketch/utils/LogUtils$Companion;

    .line 222
    .line 223
    new-instance v4, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v3, v0}, Lcom/zykj/sketch/utils/LogUtils$Companion;->e(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    const/4 v0, 0x0

    .line 243
    iput-boolean v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->isRecord:Z

    .line 244
    .line 245
    const/4 v0, 0x0

    .line 246
    iput-object v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 247
    .line 248
    iget-object v0, v1, Lcom/zykj/sketch/core/record/AudioControl;->listener:Lcom/zykj/sketch/core/listener/ProgressListener;

    .line 249
    .line 250
    if-eqz v0, :cond_8

    .line 251
    .line 252
    invoke-interface {v0}, Lcom/zykj/sketch/core/listener/ProgressListener;->recordError()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 253
    .line 254
    .line 255
    :cond_8
    :goto_3
    monitor-exit p0

    .line 256
    return-void

    .line 257
    :goto_4
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 258
    throw v0
.end method

.method public final declared-synchronized stopRecord()V
    .locals 11

    .line 1
    const-string v0, "AudioControl stopRecord \u6dfb\u52a0\u4e86\u52a8\u4f5c "

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_3

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    :try_start_1
    invoke-virtual {v1}, Landroid/media/MediaRecorder;->stop()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/media/MediaRecorder;->release()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 15
    .line 16
    .line 17
    :try_start_2
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    :goto_0
    iget-wide v5, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v7

    .line 34
    iget-wide v9, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 35
    .line 36
    sub-long/2addr v7, v9

    .line 37
    add-long/2addr v7, v5

    .line 38
    iput-wide v7, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 39
    .line 40
    iput-wide v3, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 41
    .line 42
    iput-object v2, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 43
    .line 44
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 45
    .line 46
    sget-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    iget-object v5, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v1, v3, v4, v5}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStopEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    :goto_1
    invoke-virtual {v1, v2, v3}, Lcom/zykj/sketch/core/ActionRecord;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-wide v5, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    iget-wide v9, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 77
    .line 78
    sub-long/2addr v7, v9

    .line 79
    add-long/2addr v7, v5

    .line 80
    iput-wide v7, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 81
    .line 82
    iput-wide v3, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 83
    .line 84
    iput-object v2, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 87
    .line 88
    sget-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 89
    .line 90
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    iget-object v5, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v1, v3, v4, v5}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStopEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v1, v2, v3}, Lcom/zykj/sketch/core/ActionRecord;->addRecord(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;Lcom/google/protobuf/Message;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :catch_0
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->execute:Ljava/util/concurrent/ScheduledExecutorService;

    .line 105
    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 109
    .line 110
    .line 111
    :cond_2
    iget-wide v5, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 112
    .line 113
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    iget-wide v9, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 118
    .line 119
    sub-long/2addr v7, v9

    .line 120
    add-long/2addr v7, v5

    .line 121
    iput-wide v7, p0, Lcom/zykj/sketch/core/record/AudioControl;->totalTime:J

    .line 122
    .line 123
    iput-wide v3, p0, Lcom/zykj/sketch/core/record/AudioControl;->systemTime:J

    .line 124
    .line 125
    iput-object v2, p0, Lcom/zykj/sketch/core/record/AudioControl;->mediaRecorder:Landroid/media/MediaRecorder;

    .line 126
    .line 127
    iget-object v1, p0, Lcom/zykj/sketch/core/record/AudioControl;->actionRecord:Lcom/zykj/sketch/core/ActionRecord;

    .line 128
    .line 129
    sget-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_AUDIO_STOP:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 130
    .line 131
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    iget-object v5, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v1, v3, v4, v5}, Lcom/zykj/sketch/core/ActionRecord;->buildAudioStopEvent(JLjava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    goto :goto_1

    .line 142
    :cond_3
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->fileName:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 157
    .line 158
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    iput-boolean v0, p0, Lcom/zykj/sketch/core/record/AudioControl;->isRecord:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 163
    .line 164
    monitor-exit p0

    .line 165
    return-void

    .line 166
    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 167
    throw v0
.end method
