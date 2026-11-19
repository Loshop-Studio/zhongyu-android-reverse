.class public final synthetic Landroidx/camera/video/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/video/p;->a:I

    iput-object p1, p0, Landroidx/camera/video/p;->d:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/video/p;->b:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/camera/video/p;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/camera/video/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/p;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v1, p0, Landroidx/camera/video/p;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/SessionConfig$Builder;

    iget-object v2, p0, Landroidx/camera/video/p;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/core/impl/CameraCaptureCallback;

    invoke-static {v0, v1, v2}, Landroidx/camera/video/VideoCapture;->e(Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/camera/core/impl/SessionConfig$Builder;Landroidx/camera/core/impl/CameraCaptureCallback;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/p;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder;

    iget-object v1, p0, Landroidx/camera/video/p;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    iget-object v2, p0, Landroidx/camera/video/p;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/core/impl/Timebase;

    invoke-static {v0, v1, v2}, Landroidx/camera/video/Recorder;->e(Landroidx/camera/video/Recorder;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/p;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object v1, p0, Landroidx/camera/video/p;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    iget-object v2, p0, Landroidx/camera/video/p;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/core/impl/Timebase;

    invoke-static {v0, v1, v2}, Landroidx/camera/video/Recorder$SetupVideoTask;->a(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
