.class public final synthetic Landroidx/camera/camera2/internal/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroidx/camera/camera2/internal/ExposureControl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Landroidx/camera/camera2/internal/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/camera/camera2/internal/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/camera2/internal/f;->d:Ljava/lang/Object;

    iput p1, p0, Landroidx/camera/camera2/internal/f;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/camera/core/impl/CameraCaptureCallback;ILjava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, Landroidx/camera/camera2/internal/f;->a:I

    iput-object p1, p0, Landroidx/camera/camera2/internal/f;->b:Ljava/lang/Object;

    iput p2, p0, Landroidx/camera/camera2/internal/f;->c:I

    iput-object p3, p0, Landroidx/camera/camera2/internal/f;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/camera2/internal/ExposureControl;

    iget-object v1, p0, Landroidx/camera/camera2/internal/f;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    iget v2, p0, Landroidx/camera/camera2/internal/f;->c:I

    invoke-static {v2, v0, v1}, Landroidx/camera/camera2/internal/ExposureControl;->a(ILandroidx/camera/camera2/internal/ExposureControl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/CameraCaptureCallback;

    iget-object v1, p0, Landroidx/camera/camera2/internal/f;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/CameraCaptureResult;

    iget v2, p0, Landroidx/camera/camera2/internal/f;->c:I

    invoke-static {v0, v2, v1}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl$CameraCaptureCallbackSet;->b(Landroidx/camera/core/impl/CameraCaptureCallback;ILandroidx/camera/core/impl/CameraCaptureResult;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/CameraCaptureCallback;

    iget-object v1, p0, Landroidx/camera/camera2/internal/f;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/CameraCaptureFailure;

    iget v2, p0, Landroidx/camera/camera2/internal/f;->c:I

    invoke-static {v0, v2, v1}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl$CameraCaptureCallbackSet;->a(Landroidx/camera/core/impl/CameraCaptureCallback;ILandroidx/camera/core/impl/CameraCaptureFailure;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
