.class public final synthetic Landroidx/camera/camera2/internal/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/Camera2CameraControlImpl$CaptureResultListener;


# instance fields
.field public final synthetic a:Landroidx/camera/camera2/internal/FocusMeteringControl;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(IJLandroidx/camera/camera2/internal/FocusMeteringControl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Landroidx/camera/camera2/internal/q0;->a:Landroidx/camera/camera2/internal/FocusMeteringControl;

    iput p1, p0, Landroidx/camera/camera2/internal/q0;->b:I

    iput-wide p2, p0, Landroidx/camera/camera2/internal/q0;->c:J

    return-void
.end method


# virtual methods
.method public final onCaptureResult(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 4

    .line 1
    iget v0, p0, Landroidx/camera/camera2/internal/q0;->b:I

    iget-wide v1, p0, Landroidx/camera/camera2/internal/q0;->c:J

    iget-object v3, p0, Landroidx/camera/camera2/internal/q0;->a:Landroidx/camera/camera2/internal/FocusMeteringControl;

    invoke-static {v3, v0, v1, v2, p1}, Landroidx/camera/camera2/internal/FocusMeteringControl;->a(Landroidx/camera/camera2/internal/FocusMeteringControl;IJLandroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p1

    return p1
.end method
