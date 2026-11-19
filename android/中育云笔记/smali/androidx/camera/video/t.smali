.class public final synthetic Landroidx/camera/video/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Landroidx/camera/video/Recorder;

.field public final synthetic d:Landroidx/camera/video/Recorder$RecordingRecord;

.field public final synthetic e:J

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/t;->c:Landroidx/camera/video/Recorder;

    iput-object p2, p0, Landroidx/camera/video/t;->d:Landroidx/camera/video/Recorder$RecordingRecord;

    iput-wide p3, p0, Landroidx/camera/video/t;->e:J

    iput p5, p0, Landroidx/camera/video/t;->f:I

    iput-object p6, p0, Landroidx/camera/video/t;->g:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/camera/video/t;->c:Landroidx/camera/video/Recorder;

    iget-object v1, p0, Landroidx/camera/video/t;->d:Landroidx/camera/video/Recorder$RecordingRecord;

    iget-wide v2, p0, Landroidx/camera/video/t;->e:J

    iget v4, p0, Landroidx/camera/video/t;->f:I

    iget-object v5, p0, Landroidx/camera/video/t;->g:Ljava/lang/Throwable;

    invoke-static/range {v0 .. v5}, Landroidx/camera/video/Recorder;->h(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;JILjava/lang/Throwable;)V

    return-void
.end method
