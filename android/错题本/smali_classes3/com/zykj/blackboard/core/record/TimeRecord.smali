.class public final Lcom/zykj/blackboard/core/record/TimeRecord;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/record/ITimeRecord;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\tJ\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\tJ\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0016\u0010\tJ\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0017\u0010\tJ\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/record/TimeRecord;",
        "Lcom/zykj/blackboard/core/record/ITimeRecord;",
        "<init>",
        "()V",
        "Ld6/s;",
        "reset",
        "",
        "time",
        "init",
        "(J)V",
        "",
        "isRecord",
        "()Z",
        "currentTime",
        "getTime",
        "(J)J",
        "isAudio",
        "getDelayTime",
        "(JZ)J",
        "startRecord",
        "stopRecord",
        "offset",
        "setOffsetForAudio",
        "setOffsetForCommand",
        "Lcom/zykj/blackboard/listener/RecordListener;",
        "recordListener",
        "setListener",
        "(Lcom/zykj/blackboard/listener/RecordListener;)V",
        "J",
        "startTime",
        "prevTimeForCommand",
        "prevTimeForAudio",
        "Z",
        "listener",
        "Lcom/zykj/blackboard/listener/RecordListener;",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private isRecord:Z

.field private listener:Lcom/zykj/blackboard/listener/RecordListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private prevTimeForAudio:J

.field private prevTimeForCommand:J

.field private startTime:J

.field private time:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/blackboard/core/record/TimeRecord;->startRecord$lambda-0(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    return-void
.end method

.method private static final startRecord$lambda-0(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->startTime:J

    .line 7
    .line 8
    :goto_0
    iget-boolean v2, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->listener:Lcom/zykj/blackboard/listener/RecordListener;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/zykj/blackboard/core/record/TimeRecord;->getTime(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    invoke-interface {v2, v3, v4}, Lcom/zykj/blackboard/listener/RecordListener;->progress(J)V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/16 v2, 0x18

    .line 24
    .line 25
    int-to-long v2, v2

    .line 26
    add-long/2addr v0, v2

    .line 27
    const-wide/16 v2, 0x18

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/lang/Thread;->sleep(J)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method


# virtual methods
.method public getDelayTime(JZ)J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 11
    .line 12
    :goto_0
    sub-long v0, p1, v0

    .line 13
    .line 14
    if-eqz p3, :cond_1

    .line 15
    .line 16
    iput-wide p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 17
    .line 18
    return-wide v0

    .line 19
    :cond_1
    iget-wide v2, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    const-string v2, "prevTimeForCommand1"

    .line 26
    .line 27
    invoke-static {v2, p3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 28
    .line 29
    .line 30
    iput-wide p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 31
    .line 32
    const-string p3, "prevTimeForCommand2"

    .line 33
    .line 34
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    return-wide v0

    .line 42
    :cond_2
    const-wide/16 p1, 0x0

    .line 43
    .line 44
    return-wide p1
.end method

.method public getTime(J)J
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->time:J

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->startTime:J

    .line 8
    .line 9
    sub-long v2, p1, v2

    .line 10
    .line 11
    add-long/2addr v2, v0

    .line 12
    iput-wide v2, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->time:J

    .line 13
    .line 14
    iput-wide p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->startTime:J

    .line 15
    .line 16
    :cond_0
    iget-wide p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->time:J

    .line 17
    .line 18
    return-wide p1
.end method

.method public init(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->time:J

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 5
    .line 6
    return-void
.end method

.method public isRecord()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 2
    .line 3
    return v0
.end method

.method public reset()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->time:J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 7
    .line 8
    return-void
.end method

.method public setListener(Lcom/zykj/blackboard/listener/RecordListener;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/listener/RecordListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "recordListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->listener:Lcom/zykj/blackboard/listener/RecordListener;

    .line 7
    .line 8
    return-void
.end method

.method public final setOffsetForAudio(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 5
    .line 6
    return-void
.end method

.method public final setOffsetForCommand(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 2
    .line 3
    add-long/2addr v0, p1

    .line 4
    iput-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 5
    .line 6
    return-void
.end method

.method public startRecord(J)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 7
    .line 8
    iput-wide p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->startTime:J

    .line 9
    .line 10
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 11
    .line 12
    sub-long v0, p1, v0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 15
    .line 16
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 17
    .line 18
    sub-long/2addr p1, v0

    .line 19
    iput-wide p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 20
    .line 21
    iget-object p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->listener:Lcom/zykj/blackboard/listener/RecordListener;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Lcom/zykj/blackboard/listener/RecordListener;->startRecord()V

    .line 26
    .line 27
    .line 28
    :cond_0
    new-instance p1, Ljava/lang/Thread;

    .line 29
    .line 30
    new-instance p2, La8/a;

    .line 31
    .line 32
    const/16 v0, 0x19

    .line 33
    .line 34
    invoke-direct {p2, p0, v0}, La8/a;-><init>(Ljava/lang/Object;I)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public stopRecord(J)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->time:J

    .line 6
    .line 7
    iget-wide v2, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->startTime:J

    .line 8
    .line 9
    sub-long v2, p1, v2

    .line 10
    .line 11
    add-long/2addr v2, v0

    .line 12
    iput-wide v2, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->time:J

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->isRecord:Z

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->startTime:J

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForCommand:J

    .line 22
    .line 23
    iget-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 24
    .line 25
    sub-long v0, p1, v0

    .line 26
    .line 27
    iput-wide v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->prevTimeForAudio:J

    .line 28
    .line 29
    iget-object v0, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->listener:Lcom/zykj/blackboard/listener/RecordListener;

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/core/record/TimeRecord;->getTime(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide p1

    .line 37
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/listener/RecordListener;->progress(J)V

    .line 38
    .line 39
    .line 40
    :cond_0
    iget-object p1, p0, Lcom/zykj/blackboard/core/record/TimeRecord;->listener:Lcom/zykj/blackboard/listener/RecordListener;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, Lcom/zykj/blackboard/listener/RecordListener;->stopRecord()V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method
