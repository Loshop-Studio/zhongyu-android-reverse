.class public final synthetic Landroidx/camera/camera2/internal/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/camera2/internal/s;->a:I

    iput-object p1, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/s;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/SafeCloseImageReaderProxy;

    invoke-virtual {v0}, Landroidx/camera/core/SafeCloseImageReaderProxy;->safeClose()V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/ImageCapture$ScreenFlash;

    invoke-interface {v0}, Landroidx/camera/core/ImageCapture$ScreenFlash;->clear()V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->updateSessionConfigSynchronous()J

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/SynchronizedCaptureSessionImpl;

    invoke-static {v0}, Landroidx/camera/camera2/internal/SynchronizedCaptureSessionImpl;->h(Landroidx/camera/camera2/internal/SynchronizedCaptureSessionImpl;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/SynchronizedCaptureSessionBaseImpl;

    invoke-static {v0}, Landroidx/camera/camera2/internal/SynchronizedCaptureSessionBaseImpl;->e(Landroidx/camera/camera2/internal/SynchronizedCaptureSessionBaseImpl;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/DeferrableSurface;

    invoke-static {v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->b(Landroidx/camera/core/impl/DeferrableSurface;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;

    invoke-static {v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->e(Landroidx/camera/camera2/internal/ProcessingCaptureSession;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashSet;

    invoke-static {v0}, Landroidx/camera/camera2/internal/CaptureSessionRepository$1;->b(Ljava/util/LinkedHashSet;)V

    return-void

    :pswitch_8
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/CaptureSession;

    invoke-static {v0}, Landroidx/camera/camera2/internal/CaptureSession;->a(Landroidx/camera/camera2/internal/CaptureSession;)V

    return-void

    :pswitch_9
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;->executePostCapture()V

    return-void

    :pswitch_a
    iget-object v0, p0, Landroidx/camera/camera2/internal/s;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/Camera2CameraImpl$StateCallback$ScheduledReopen;

    invoke-static {v0}, Landroidx/camera/camera2/internal/Camera2CameraImpl$StateCallback$ScheduledReopen;->a(Landroidx/camera/camera2/internal/Camera2CameraImpl$StateCallback$ScheduledReopen;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
