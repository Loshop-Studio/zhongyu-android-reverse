.class public final synthetic Landroidx/camera/camera2/internal/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/Camera2CapturePipeline$ResultListener$Checker;
.implements Landroidx/camera/core/internal/utils/RingBuffer$OnRemoveCallback;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/camera2/internal/y;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public check(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/y;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Landroidx/camera/camera2/internal/Camera2CapturePipeline$TorchTask;->c(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1

    :pswitch_0
    invoke-static {p1}, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->j(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1

    :pswitch_1
    invoke-static {p1}, Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;->c(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onRemove(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/camera/core/ImageProxy;

    invoke-static {p1}, Landroidx/camera/camera2/internal/ZslControlImpl;->b(Landroidx/camera/core/ImageProxy;)V

    return-void
.end method
