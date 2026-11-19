.class public final synthetic Landroidx/camera/video/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/video/Recorder;

.field public final synthetic b:Landroidx/camera/video/Recorder$RecordingRecord;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/video/d;->a:Landroidx/camera/video/Recorder;

    iput-object p2, p0, Landroidx/camera/video/d;->b:Landroidx/camera/video/Recorder$RecordingRecord;

    iput-boolean p3, p0, Landroidx/camera/video/d;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/video/d;->b:Landroidx/camera/video/Recorder$RecordingRecord;

    iget-boolean v1, p0, Landroidx/camera/video/d;->c:Z

    iget-object v2, p0, Landroidx/camera/video/d;->a:Landroidx/camera/video/Recorder;

    invoke-static {v2, v0, v1}, Landroidx/camera/video/Recorder;->i(Landroidx/camera/video/Recorder;Landroidx/camera/video/Recorder$RecordingRecord;Z)V

    return-void
.end method
