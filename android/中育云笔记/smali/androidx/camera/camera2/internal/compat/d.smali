.class public final synthetic Landroidx/camera/camera2/internal/compat/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Landroidx/camera/camera2/internal/compat/CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper;

.field public final synthetic d:Landroid/hardware/camera2/CameraCaptureSession;

.field public final synthetic e:Landroid/hardware/camera2/CaptureRequest;

.field public final synthetic f:J

.field public final synthetic g:J


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/internal/compat/CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/compat/d;->c:Landroidx/camera/camera2/internal/compat/CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper;

    iput-object p2, p0, Landroidx/camera/camera2/internal/compat/d;->d:Landroid/hardware/camera2/CameraCaptureSession;

    iput-object p3, p0, Landroidx/camera/camera2/internal/compat/d;->e:Landroid/hardware/camera2/CaptureRequest;

    iput-wide p4, p0, Landroidx/camera/camera2/internal/compat/d;->f:J

    iput-wide p6, p0, Landroidx/camera/camera2/internal/compat/d;->g:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/d;->c:Landroidx/camera/camera2/internal/compat/CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper;

    iget-object v1, p0, Landroidx/camera/camera2/internal/compat/d;->d:Landroid/hardware/camera2/CameraCaptureSession;

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/d;->e:Landroid/hardware/camera2/CaptureRequest;

    iget-wide v3, p0, Landroidx/camera/camera2/internal/compat/d;->f:J

    iget-wide v5, p0, Landroidx/camera/camera2/internal/compat/d;->g:J

    invoke-static/range {v0 .. v6}, Landroidx/camera/camera2/internal/compat/CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper;->b(Landroidx/camera/camera2/internal/compat/CameraCaptureSessionCompat$CaptureCallbackExecutorWrapper;Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;JJ)V

    return-void
.end method
