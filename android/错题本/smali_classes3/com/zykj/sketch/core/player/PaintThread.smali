.class public final Lcom/zykj/sketch/core/player/PaintThread;
.super Lcom/zykj/sketch/core/player/PlayThread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/player/PaintThread$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010*\n\u0002\u0008\u0006\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u000eJ\r\u0010\u0018\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0018\u0010\u000eJ\u001b\u0010\u001c\u001a\u00020\u00082\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00082\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00082\u0006\u0010!\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\"\u0010\nJ\u001b\u0010%\u001a\u00020\u00082\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020#0\u0019\u00a2\u0006\u0004\u0008%\u0010\u001dJ\u000f\u0010&\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008&\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\'R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010(R\u001c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010(R\u0016\u0010!\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0016\u0010/\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010)R\u0016\u00100\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u0010)\u00a8\u00062"
    }
    d2 = {
        "Lcom/zykj/sketch/core/player/PaintThread;",
        "Lcom/zykj/sketch/core/player/PlayThread;",
        "Lcom/zykj/sketch/core/GraphControl;",
        "graphControl",
        "<init>",
        "(Lcom/zykj/sketch/core/GraphControl;)V",
        "",
        "progress",
        "Ld6/s;",
        "notifyProgress",
        "(J)V",
        "getTotalDuration",
        "()J",
        "run",
        "()V",
        "",
        "position",
        "seekTo",
        "(I)V",
        "startPlay",
        "resumePlay",
        "waitPlay",
        "pausePlay",
        "stopPlay",
        "initSeekTo",
        "",
        "Lcom/zykj/sketch/core/data/GraphTask;",
        "graphTaskList",
        "setData",
        "(Ljava/util/List;)V",
        "lastGraphTask",
        "setLastTask",
        "(Lcom/zykj/sketch/core/data/GraphTask;)V",
        "maxProgress",
        "setMaxProgress",
        "Lcom/zykj/sketch/core/listener/PlayActionListener;",
        "playActionListener",
        "setProgressListener",
        "shutdown",
        "Lcom/zykj/sketch/core/GraphControl;",
        "Ljava/util/List;",
        "J",
        "lastTask",
        "Lcom/zykj/sketch/core/data/GraphTask;",
        "",
        "iterator",
        "Ljava/util/ListIterator;",
        "playTime",
        "startTime",
        "Companion",
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
.field public static final Companion:Lcom/zykj/sketch/core/player/PaintThread$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final PERIOD:J = 0x28L


# instance fields
.field private final graphControl:Lcom/zykj/sketch/core/GraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private graphTaskList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private iterator:Ljava/util/ListIterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ListIterator<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private lastTask:Lcom/zykj/sketch/core/data/GraphTask;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private maxProgress:J

.field private playActionListener:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/listener/PlayActionListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private playTime:J

.field private startTime:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/sketch/core/player/PaintThread$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/sketch/core/player/PaintThread$Companion;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lcom/zykj/sketch/core/player/PaintThread;->Companion:Lcom/zykj/sketch/core/player/PaintThread$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/zykj/sketch/core/GraphControl;)V
    .locals 2
    .param p1    # Lcom/zykj/sketch/core/GraphControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graphControl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/PlayThread;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->startTime:J

    .line 23
    .line 24
    return-void
.end method

.method private final getTotalDuration()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/zykj/sketch/core/data/GraphTask;

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/zykj/sketch/core/data/GraphTask;->getStartTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0

    .line 22
    :cond_0
    const-wide/16 v0, 0x0

    .line 23
    .line 24
    return-wide v0
.end method

.method private final notifyProgress(J)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/PaintThread;->getTotalDuration()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-wide v0, p1

    .line 15
    :goto_0
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/PaintThread;->getTotalDuration()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    cmp-long p1, v2, p1

    .line 20
    .line 21
    if-gez p1, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/zykj/sketch/core/player/PaintThread;->getTotalDuration()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    :cond_1
    iget-object p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->playActionListener:Ljava/util/List;

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_2

    .line 40
    .line 41
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    check-cast p2, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 46
    .line 47
    :try_start_0
    invoke-interface {p2, v0, v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onProgress(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p2

    .line 52
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    return-void
.end method


# virtual methods
.method public final initSeekTo()V
    .locals 7

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/16 v0, 0x1

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->iterator:Ljava/util/ListIterator;

    .line 20
    .line 21
    if-eqz v0, :cond_9

    .line 22
    .line 23
    :cond_1
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_8

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    check-cast v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 34
    .line 35
    iget-wide v2, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getStartTime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    cmp-long v1, v2, v4

    .line 42
    .line 43
    if-gez v1, :cond_1

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/4 v2, 0x1

    .line 59
    const/4 v3, 0x0

    .line 60
    if-eqz v1, :cond_6

    .line 61
    .line 62
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 67
    .line 68
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getHasSnapshot()Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getSnapshotVoid()Lr6/a;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 82
    .line 83
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/core/GraphControl;->isRender(Z)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_3

    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    check-cast v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 106
    .line 107
    iget-wide v3, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 108
    .line 109
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getStartTime()J

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    cmp-long v3, v3, v5

    .line 114
    .line 115
    if-lez v3, :cond_4

    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getExecuteVoid()Lr6/a;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    :cond_5
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 129
    .line 130
    invoke-virtual {v0, v2}, Lcom/zykj/sketch/core/GraphControl;->isRender(Z)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_6
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 138
    .line 139
    invoke-virtual {v1, v3}, Lcom/zykj/sketch/core/GraphControl;->isRender(Z)V

    .line 140
    .line 141
    .line 142
    :goto_1
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_7

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 153
    .line 154
    iget-wide v3, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 155
    .line 156
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getStartTime()J

    .line 157
    .line 158
    .line 159
    move-result-wide v5

    .line 160
    cmp-long v3, v3, v5

    .line 161
    .line 162
    if-lez v3, :cond_7

    .line 163
    .line 164
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getExecuteVoid()Lr6/a;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_7
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Lcom/zykj/sketch/core/GraphControl;->isRender(Z)V

    .line 175
    .line 176
    .line 177
    return-void

    .line 178
    :cond_8
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->lastTask:Lcom/zykj/sketch/core/data/GraphTask;

    .line 179
    .line 180
    if-eqz v0, :cond_9

    .line 181
    .line 182
    invoke-virtual {v0}, Lcom/zykj/sketch/core/data/GraphTask;->getSnapshotVoid()Lr6/a;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-eqz v0, :cond_9

    .line 187
    .line 188
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    :cond_9
    return-void
.end method

.method public pausePlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->pausePlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playActionListener:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayPause()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public resumePlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->resumePlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playActionListener:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayStart()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public run()V
    .locals 8

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_PAUSE:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 6
    .line 7
    if-eq v0, v1, :cond_7

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_WAIT:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v1, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 24
    .line 25
    const-wide/16 v2, 0x0

    .line 26
    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    iput-wide v2, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 30
    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto/16 :goto_2

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->iterator:Ljava/util/ListIterator;

    .line 36
    .line 37
    if-eqz v0, :cond_6

    .line 38
    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    sget-object v4, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_PAUSE:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 50
    .line 51
    if-eq v1, v4, :cond_7

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v4, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_WAIT:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 58
    .line 59
    if-eq v1, v4, :cond_7

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PlayThread;->getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v4, Lcom/zykj/sketch/core/data/PlayStatus;->RECORD_END:Lcom/zykj/sketch/core/data/PlayStatus;

    .line 66
    .line 67
    if-ne v1, v4, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    check-cast v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 75
    .line 76
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getStartTime()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    iget-wide v6, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 81
    .line 82
    cmp-long v4, v4, v6

    .line 83
    .line 84
    if-gtz v4, :cond_3

    .line 85
    .line 86
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    iput-wide v4, p0, Lcom/zykj/sketch/core/player/PaintThread;->startTime:J

    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/zykj/sketch/core/data/GraphTask;->getExecuteVoid()Lr6/a;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-interface {v0}, Ljava/util/ListIterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-nez v0, :cond_6

    .line 114
    .line 115
    iget-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 116
    .line 117
    iget-wide v4, p0, Lcom/zykj/sketch/core/player/PaintThread;->maxProgress:J

    .line 118
    .line 119
    cmp-long v0, v0, v4

    .line 120
    .line 121
    if-lez v0, :cond_6

    .line 122
    .line 123
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->lastTask:Lcom/zykj/sketch/core/data/GraphTask;

    .line 124
    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/zykj/sketch/core/data/GraphTask;->getSnapshotVoid()Lr6/a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_5

    .line 132
    .line 133
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/sketch/core/player/PaintThread;->stopPlay()V

    .line 137
    .line 138
    .line 139
    iput-wide v2, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 140
    .line 141
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphControl:Lcom/zykj/sketch/core/GraphControl;

    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/zykj/sketch/core/GraphControl;->resetStatus()V

    .line 144
    .line 145
    .line 146
    iget-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->maxProgress:J

    .line 147
    .line 148
    invoke-direct {p0, v0, v1}, Lcom/zykj/sketch/core/player/PaintThread;->notifyProgress(J)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :cond_6
    iget-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 153
    .line 154
    const-wide/16 v2, 0x28

    .line 155
    .line 156
    add-long/2addr v0, v2

    .line 157
    iput-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 158
    .line 159
    invoke-direct {p0, v0, v1}, Lcom/zykj/sketch/core/player/PaintThread;->notifyProgress(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_1
    return-void

    .line 163
    :goto_2
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final seekTo(I)V
    .locals 2

    .line 1
    int-to-long v0, p1

    .line 2
    iput-wide v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playTime:J

    .line 3
    .line 4
    return-void
.end method

.method public final setData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/data/GraphTask;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "graphTaskList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->iterator:Ljava/util/ListIterator;

    .line 23
    .line 24
    return-void
.end method

.method public final setLastTask(Lcom/zykj/sketch/core/data/GraphTask;)V
    .locals 0
    .param p1    # Lcom/zykj/sketch/core/data/GraphTask;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->lastTask:Lcom/zykj/sketch/core/data/GraphTask;

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxProgress(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->maxProgress:J

    .line 2
    .line 3
    return-void
.end method

.method public final setProgressListener(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/listener/PlayActionListener;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "playActionListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/sketch/core/player/PaintThread;->playActionListener:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public shutdown()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->shutdown()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->graphTaskList:Ljava/util/List;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public startPlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->startPlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playActionListener:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayStart()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public stopPlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->stopPlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playActionListener:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onPlayEnd()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method

.method public waitPlay()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/zykj/sketch/core/player/PlayThread;->waitPlay()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PaintThread;->playActionListener:Ljava/util/List;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/sketch/core/listener/PlayActionListener;

    .line 23
    .line 24
    invoke-interface {v1}, Lcom/zykj/sketch/core/listener/PlayActionListener;->onWaitPlay()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-void
.end method
