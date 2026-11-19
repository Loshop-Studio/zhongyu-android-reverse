.class public final synthetic Landroidx/camera/video/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/video/o;->a:I

    iput-object p2, p0, Landroidx/camera/video/o;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/video/o;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/video/o;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/o;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoCapture;

    iget-object v1, p0, Landroidx/camera/video/o;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-static {v0, v1}, Landroidx/camera/video/VideoCapture;->c(Landroidx/camera/video/VideoCapture;Landroidx/camera/core/impl/DeferrableSurface;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/o;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder;

    iget-object v1, p0, Landroidx/camera/video/o;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/VideoOutput$SourceState;

    invoke-static {v0, v1}, Landroidx/camera/video/Recorder;->g(Landroidx/camera/video/Recorder;Landroidx/camera/video/VideoOutput$SourceState;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/o;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/camera/video/o;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-static {v1, v0}, Landroidx/camera/video/Recorder;->c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/o;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoEncoderSession;

    iget-object v1, p0, Landroidx/camera/video/o;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/video/VideoEncoderSession;->c(Landroidx/camera/video/VideoEncoderSession;Landroid/view/Surface;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/video/o;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoCapture$2;

    iget-object v1, p0, Landroidx/camera/video/o;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/SessionConfig$Builder;

    invoke-static {v0, v1}, Landroidx/camera/video/VideoCapture$2;->a(Landroidx/camera/video/VideoCapture$2;Landroidx/camera/core/impl/SessionConfig$Builder;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/video/o;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder$RecordingRecord;

    iget-object v1, p0, Landroidx/camera/video/o;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/VideoRecordEvent;

    invoke-static {v0, v1}, Landroidx/camera/video/Recorder$RecordingRecord;->e(Landroidx/camera/video/Recorder$RecordingRecord;Landroidx/camera/video/VideoRecordEvent;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
