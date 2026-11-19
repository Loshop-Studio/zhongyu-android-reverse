.class Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/Camera2CapturePipeline$PipelineTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/Camera2CapturePipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ScreenFlashTask"
.end annotation


# static fields
.field private static final CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS:J


# instance fields
.field private final mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

.field private final mExecutor:Ljava/util/concurrent/Executor;

.field private final mScheduler:Ljava/util/concurrent/ScheduledExecutorService;

.field private final mScreenFlash:Landroidx/camera/core/ImageCapture$ScreenFlash;

.field private final mUseFlashModeTorchFor3aUpdate:Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x2

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS:J

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroidx/camera/camera2/internal/Camera2CameraControlImpl;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;)V
    .locals 0
    .param p1    # Landroidx/camera/camera2/internal/Camera2CameraControlImpl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mExecutor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mScheduler:Ljava/util/concurrent/ScheduledExecutorService;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mUseFlashModeTorchFor3aUpdate:Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->getScreenFlash()Landroidx/camera/core/ImageCapture$ScreenFlash;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    check-cast p1, Landroidx/camera/core/ImageCapture$ScreenFlash;

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mScreenFlash:Landroidx/camera/core/ImageCapture$ScreenFlash;

    .line 22
    .line 23
    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "Camera2CapturePipeline"

    .line 5
    .line 6
    const-string v1, "ScreenFlashTask#preCapture: invoking applyScreenFlashUi"

    .line 7
    .line 8
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mScreenFlash:Landroidx/camera/core/ImageCapture$ScreenFlash;

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 18
    .line 19
    const-wide/16 v3, 0x3

    .line 20
    .line 21
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    add-long/2addr v0, v2

    .line 26
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Landroidx/camera/core/ImageCapture$ScreenFlashListener;

    .line 31
    .line 32
    invoke-interface {p0, v0, v1, p1}, Landroidx/camera/core/ImageCapture$ScreenFlash;->apply(JLandroidx/camera/core/ImageCapture$ScreenFlashListener;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-virtual {p2, p0}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->set(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static synthetic b(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3

    .line 1
    sget-wide v0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->CHECK_3A_WITH_SCREEN_FLASH_TIMEOUT_IN_NS:J

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mScheduler:Ljava/util/concurrent/ScheduledExecutorService;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 6
    .line 7
    new-instance v2, Landroidx/camera/camera2/internal/m1;

    .line 8
    .line 9
    invoke-direct {v2}, Landroidx/camera/camera2/internal/m1;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, p1, p0, v2}, Landroidx/camera/camera2/internal/Camera2CapturePipeline;->waitForResult(JLjava/util/concurrent/ScheduledExecutorService;Landroidx/camera/camera2/internal/Camera2CameraControlImpl;Landroidx/camera/camera2/internal/Camera2CapturePipeline$ResultListener$Checker;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic d(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->getFocusMeteringControl()Landroidx/camera/camera2/internal/FocusMeteringControl;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/FocusMeteringControl;->triggerAePrecapture()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static synthetic e(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/camera/camera2/internal/g1;

    .line 5
    .line 6
    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/g1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Landroidx/concurrent/futures/CallbackToFutureAdapter;->getFuture(Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static synthetic f()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic g(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->mainThreadExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    new-instance v1, Landroidx/camera/camera2/internal/l1;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/camera2/internal/l1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "OnScreenFlashStart"

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic h(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V
    .locals 2

    .line 1
    const-string v0, "Camera2CapturePipeline"

    .line 2
    .line 3
    const-string v1, "ScreenFlashTask#preCapture: UI change applied"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->set(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic i(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mUseFlashModeTorchFor3aUpdate:Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;->shouldUseFlashModeTorch()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "EnableTorchInternal"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, v2}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->set(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    const-string v0, "Camera2CapturePipeline"

    .line 17
    .line 18
    const-string v3, "ScreenFlashTask#preCapture: enable torch"

    .line 19
    .line 20
    invoke-static {v0, v3}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->enableTorchInternal(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v2}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->set(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public static synthetic j(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Landroidx/camera/camera2/internal/Camera2CapturePipeline;->is3AConverged(Landroid/hardware/camera2/TotalCaptureResult;Z)Z

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method public static synthetic k(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/camera2/internal/n1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/camera/camera2/internal/n1;-><init>(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    const-string p0, "OnScreenFlashUiApplied"

    .line 10
    .line 11
    return-object p0
.end method

.method public static synthetic l(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->getFocusMeteringControl()Landroidx/camera/camera2/internal/FocusMeteringControl;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/FocusMeteringControl;->enableExternalFlashAeMode(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static synthetic m(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Lcom/google/common/util/concurrent/ListenableFuture;Ljava/lang/Object;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    const-wide/16 v0, 0x3

    .line 7
    .line 8
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v2

    .line 12
    iget-object v4, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mScheduler:Ljava/util/concurrent/ScheduledExecutorService;

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x1

    .line 16
    move-object v7, p1

    .line 17
    invoke-static/range {v2 .. v7}, Landroidx/camera/core/impl/utils/futures/Futures;->makeTimeoutFuture(JLjava/util/concurrent/ScheduledExecutorService;Ljava/lang/Object;ZLcom/google/common/util/concurrent/ListenableFuture;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method


# virtual methods
.method public isCaptureResultNeeded()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public postCapture()V
    .locals 4

    .line 1
    const-string v0, "Camera2CapturePipeline"

    .line 2
    .line 3
    const-string v1, "ScreenFlashTask#postCapture"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mUseFlashModeTorchFor3aUpdate:Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/compat/workaround/UseFlashModeTorchFor3aUpdate;->shouldUseFlashModeTorch()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->enableTorchInternal(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->getFocusMeteringControl()Landroidx/camera/camera2/internal/FocusMeteringControl;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/FocusMeteringControl;->enableExternalFlashAeMode(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v2, Landroidx/camera/camera2/internal/j1;

    .line 33
    .line 34
    invoke-direct {v2}, Landroidx/camera/camera2/internal/j1;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v3, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mExecutor:Ljava/util/concurrent/Executor;

    .line 38
    .line 39
    invoke-interface {v0, v2, v3}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mCameraControl:Landroidx/camera/camera2/internal/Camera2CameraControlImpl;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/Camera2CameraControlImpl;->getFocusMeteringControl()Landroidx/camera/camera2/internal/FocusMeteringControl;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v0, v1, v2}, Landroidx/camera/camera2/internal/FocusMeteringControl;->cancelAfAeTrigger(ZZ)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->mainThreadExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mScreenFlash:Landroidx/camera/core/ImageCapture$ScreenFlash;

    .line 57
    .line 58
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    new-instance v2, Landroidx/camera/camera2/internal/k1;

    .line 62
    .line 63
    invoke-direct {v2, v1}, Landroidx/camera/camera2/internal/k1;-><init>(Landroidx/camera/core/ImageCapture$ScreenFlash;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public preCapture(Landroid/hardware/camera2/TotalCaptureResult;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .param p1    # Landroid/hardware/camera2/TotalCaptureResult;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/TotalCaptureResult;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 1
    const-string p1, "Camera2CapturePipeline"

    .line 2
    .line 3
    const-string v0, "ScreenFlashTask#preCapture"

    .line 4
    .line 5
    invoke-static {p1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Landroidx/camera/camera2/internal/o1;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Landroidx/camera/camera2/internal/o1;-><init>(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter;->getFuture(Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Landroidx/camera/camera2/internal/p1;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Landroidx/camera/camera2/internal/p1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Landroidx/concurrent/futures/CallbackToFutureAdapter;->getFuture(Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Landroidx/camera/core/impl/utils/futures/FutureChain;->from(Lcom/google/common/util/concurrent/ListenableFuture;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    new-instance v1, Landroidx/camera/camera2/internal/q1;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/q1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;)V

    .line 38
    .line 39
    .line 40
    iget-object v2, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mExecutor:Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    invoke-virtual {p1, v1, v2}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transformAsync(Landroidx/camera/core/impl/utils/futures/AsyncFunction;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v1, Landroidx/camera/camera2/internal/r1;

    .line 47
    .line 48
    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/r1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;)V

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mExecutor:Ljava/util/concurrent/Executor;

    .line 52
    .line 53
    invoke-virtual {p1, v1, v2}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transformAsync(Landroidx/camera/core/impl/utils/futures/AsyncFunction;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance v1, Landroidx/camera/camera2/internal/s1;

    .line 58
    .line 59
    invoke-direct {v1, p0, v0}, Landroidx/camera/camera2/internal/s1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mExecutor:Ljava/util/concurrent/Executor;

    .line 63
    .line 64
    invoke-virtual {p1, v1, v0}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transformAsync(Landroidx/camera/core/impl/utils/futures/AsyncFunction;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v0, Landroidx/camera/camera2/internal/t1;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/t1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mExecutor:Ljava/util/concurrent/Executor;

    .line 74
    .line 75
    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transformAsync(Landroidx/camera/core/impl/utils/futures/AsyncFunction;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v0, Landroidx/camera/camera2/internal/h1;

    .line 80
    .line 81
    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/h1;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$ScreenFlashTask;->mExecutor:Ljava/util/concurrent/Executor;

    .line 85
    .line 86
    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transformAsync(Landroidx/camera/core/impl/utils/futures/AsyncFunction;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v0, Landroidx/camera/camera2/internal/i1;

    .line 91
    .line 92
    invoke-direct {v0}, Landroidx/camera/camera2/internal/i1;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transform(Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    return-object p1
.end method
