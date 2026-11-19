.class final Landroidx/camera/camera2/internal/ProcessingCaptureSession;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/CaptureSessionInterface;


# annotations
.annotation build Landroidx/annotation/OptIn;
    markerClass = {
        Landroidx/camera/camera2/interop/ExperimentalCamera2Interop;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;,
        Landroidx/camera/camera2/internal/ProcessingCaptureSession$SessionProcessorCaptureCallback;,
        Landroidx/camera/camera2/internal/ProcessingCaptureSession$CaptureCallbackAdapter;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ProcessingCaptureSession"

.field private static final TIMEOUT_GET_SURFACE_IN_MS:J = 0x1388L

.field private static sHeldProcessorSurfaces:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field private static sNextInstanceId:I


# instance fields
.field private final mCamera2CameraInfoImpl:Landroidx/camera/camera2/internal/Camera2CameraInfoImpl;

.field private final mCaptureSession:Landroidx/camera/camera2/internal/CaptureSession;

.field final mExecutor:Ljava/util/concurrent/Executor;

.field private mInstanceId:I

.field private mOutputSurfaces:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;"
        }
    .end annotation
.end field

.field private volatile mPendingCaptureConfigs:Ljava/util/List;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/CaptureConfig;",
            ">;"
        }
    .end annotation
.end field

.field private mProcessorSessionConfig:Landroidx/camera/core/impl/SessionConfig;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

.field private mRequestProcessor:Landroidx/camera/camera2/internal/Camera2RequestProcessor;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final mScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

.field private mSessionConfig:Landroidx/camera/core/impl/SessionConfig;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mSessionOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;

.field private final mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

.field private final mSessionProcessorCaptureCallback:Landroidx/camera/camera2/internal/ProcessingCaptureSession$SessionProcessorCaptureCallback;

.field private mStillCaptureOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->sHeldProcessorSurfaces:Ljava/util/List;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->sNextInstanceId:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/SessionProcessor;Landroidx/camera/camera2/internal/Camera2CameraInfoImpl;Landroidx/camera/camera2/internal/compat/params/DynamicRangesCompat;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 3
    .param p1    # Landroidx/camera/core/impl/SessionProcessor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/camera2/internal/Camera2CameraInfoImpl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/camera/camera2/internal/compat/params/DynamicRangesCompat;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mOutputSurfaces:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 13
    .line 14
    new-instance v0, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 15
    .line 16
    invoke-direct {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->build()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 24
    .line 25
    new-instance v0, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 26
    .line 27
    invoke-direct {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->build()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mStillCaptureOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 38
    .line 39
    new-instance v1, Landroidx/camera/camera2/internal/CaptureSession;

    .line 40
    .line 41
    const-class v2, Landroidx/camera/camera2/internal/compat/quirk/CaptureSessionShouldUseMrirQuirk;

    .line 42
    .line 43
    invoke-static {v2}, Landroidx/camera/camera2/internal/compat/quirk/DeviceQuirks;->get(Ljava/lang/Class;)Landroidx/camera/core/impl/Quirk;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    const/4 v0, 0x1

    .line 50
    :cond_0
    invoke-direct {v1, p3, v0}, Landroidx/camera/camera2/internal/CaptureSession;-><init>(Landroidx/camera/camera2/internal/compat/params/DynamicRangesCompat;Z)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCaptureSession:Landroidx/camera/camera2/internal/CaptureSession;

    .line 54
    .line 55
    iput-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 56
    .line 57
    iput-object p2, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCamera2CameraInfoImpl:Landroidx/camera/camera2/internal/Camera2CameraInfoImpl;

    .line 58
    .line 59
    iput-object p4, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mExecutor:Ljava/util/concurrent/Executor;

    .line 60
    .line 61
    iput-object p5, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 62
    .line 63
    sget-object p1, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->UNINITIALIZED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 64
    .line 65
    iput-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 66
    .line 67
    new-instance p1, Landroidx/camera/camera2/internal/ProcessingCaptureSession$SessionProcessorCaptureCallback;

    .line 68
    .line 69
    invoke-direct {p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession$SessionProcessorCaptureCallback;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessorCaptureCallback:Landroidx/camera/camera2/internal/ProcessingCaptureSession$SessionProcessorCaptureCallback;

    .line 73
    .line 74
    sget p1, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->sNextInstanceId:I

    .line 75
    .line 76
    add-int/lit8 p2, p1, 0x1

    .line 77
    .line 78
    sput p2, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->sNextInstanceId:I

    .line 79
    .line 80
    iput p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 81
    .line 82
    new-instance p1, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string p2, "New ProcessingCaptureSession (id="

    .line 88
    .line 89
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    iget p2, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 93
    .line 94
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p2, ")"

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const-string p2, "ProcessingCaptureSession"

    .line 107
    .line 108
    invoke-static {p2, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/ProcessingCaptureSession;Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCaptureSession:Landroidx/camera/camera2/internal/CaptureSession;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->onConfigured(Landroidx/camera/camera2/internal/CaptureSession;)V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public static synthetic b(Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->sHeldProcessorSurfaces:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic c(Landroidx/camera/camera2/internal/ProcessingCaptureSession;Landroidx/camera/core/impl/DeferrableSurface;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mOutputSurfaces:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/camera/core/impl/DeferrableSurfaces;->decrementAll(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/camera/core/impl/DeferrableSurface;->decrementUseCount()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private static cancelRequests(Ljava/util/List;)V
    .locals 4
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/CaptureConfig;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroidx/camera/core/impl/CaptureConfig;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/camera/core/impl/CaptureConfig;->getCameraCaptureCallbacks()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroidx/camera/core/impl/CameraCaptureCallback;

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/camera/core/impl/CaptureConfig;->getId()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-virtual {v2, v3}, Landroidx/camera/core/impl/CameraCaptureCallback;->onCaptureCancelled(I)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method

.method public static synthetic d(Landroidx/camera/camera2/internal/ProcessingCaptureSession;Landroidx/camera/core/impl/SessionConfig;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 9

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "-- getSurfaces done, start init (id="

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v2, "ProcessingCaptureSession"

    .line 29
    .line 30
    invoke-static {v2, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 34
    .line 35
    sget-object v3, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->DE_INITIALIZED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 36
    .line 37
    if-ne v0, v3, :cond_0

    .line 38
    .line 39
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string p1, "SessionProcessorCaptureSession is closed."

    .line 42
    .line 43
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Landroidx/camera/core/impl/utils/futures/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    invoke-interface {p4, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p4, v0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Landroidx/camera/core/impl/DeferrableSurface;

    .line 71
    .line 72
    new-instance p1, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;

    .line 73
    .line 74
    const-string p2, "Surface closed"

    .line 75
    .line 76
    invoke-direct {p1, p2, p0}, Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException;-><init>(Ljava/lang/String;Landroidx/camera/core/impl/DeferrableSurface;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, Landroidx/camera/core/impl/utils/futures/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0

    .line 84
    :cond_1
    const/4 p4, 0x0

    .line 85
    move v3, p4

    .line 86
    move-object v4, v0

    .line 87
    move-object v5, v4

    .line 88
    move-object v6, v5

    .line 89
    :goto_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v7

    .line 97
    if-ge v3, v7, :cond_6

    .line 98
    .line 99
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v7

    .line 103
    invoke-interface {v7, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    check-cast v7, Landroidx/camera/core/impl/DeferrableSurface;

    .line 108
    .line 109
    invoke-static {v7}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->isPreview(Landroidx/camera/core/impl/DeferrableSurface;)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-nez v8, :cond_4

    .line 114
    .line 115
    invoke-static {v7}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->isStreamSharing(Landroidx/camera/core/impl/DeferrableSurface;)Z

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    if-eqz v8, :cond_2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    invoke-static {v7}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->isImageCapture(Landroidx/camera/core/impl/DeferrableSurface;)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_3

    .line 127
    .line 128
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getSurface()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-interface {v5}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    check-cast v5, Landroid/view/Surface;

    .line 137
    .line 138
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedSize()Landroid/util/Size;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedStreamFormat()I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    invoke-static {v5, v8, v7}, Landroidx/camera/core/impl/OutputSurface;->create(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/OutputSurface;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    goto :goto_2

    .line 151
    :cond_3
    invoke-static {v7}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->isImageAnalysis(Landroidx/camera/core/impl/DeferrableSurface;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-eqz v8, :cond_5

    .line 156
    .line 157
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getSurface()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    invoke-interface {v6}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    check-cast v6, Landroid/view/Surface;

    .line 166
    .line 167
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedSize()Landroid/util/Size;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedStreamFormat()I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    invoke-static {v6, v8, v7}, Landroidx/camera/core/impl/OutputSurface;->create(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/OutputSurface;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    goto :goto_2

    .line 180
    :cond_4
    :goto_1
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getSurface()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    check-cast v4, Landroid/view/Surface;

    .line 189
    .line 190
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedSize()Landroid/util/Size;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    invoke-virtual {v7}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedStreamFormat()I

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    invoke-static {v4, v8, v7}, Landroidx/camera/core/impl/OutputSurface;->create(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/OutputSurface;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 203
    .line 204
    goto :goto_0

    .line 205
    :cond_6
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getPostviewOutputConfig()Landroidx/camera/core/impl/SessionConfig$OutputConfig;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    if-eqz v3, :cond_7

    .line 210
    .line 211
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getPostviewOutputConfig()Landroidx/camera/core/impl/SessionConfig$OutputConfig;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v0}, Landroidx/camera/core/impl/SessionConfig$OutputConfig;->getSurface()Landroidx/camera/core/impl/DeferrableSurface;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->getSurface()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    check-cast v3, Landroid/view/Surface;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedSize()Landroid/util/Size;

    .line 230
    .line 231
    .line 232
    move-result-object v7

    .line 233
    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->getPrescribedStreamFormat()I

    .line 234
    .line 235
    .line 236
    move-result v8

    .line 237
    invoke-static {v3, v7, v8}, Landroidx/camera/core/impl/OutputSurface;->create(Landroid/view/Surface;Landroid/util/Size;I)Landroidx/camera/core/impl/OutputSurface;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    goto :goto_3

    .line 242
    :cond_7
    move-object v3, v0

    .line 243
    :goto_3
    sget-object v7, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->SESSION_INITIALIZED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 244
    .line 245
    iput-object v7, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 246
    .line 247
    :try_start_0
    new-instance v7, Ljava/util/ArrayList;

    .line 248
    .line 249
    iget-object v8, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mOutputSurfaces:Ljava/util/List;

    .line 250
    .line 251
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 252
    .line 253
    .line 254
    if-eqz v0, :cond_8

    .line 255
    .line 256
    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    :cond_8
    invoke-static {v7}, Landroidx/camera/core/impl/DeferrableSurfaces;->incrementAll(Ljava/util/List;)V
    :try_end_0
    .catch Landroidx/camera/core/impl/DeferrableSurface$SurfaceClosedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 260
    .line 261
    .line 262
    new-instance v7, Ljava/lang/StringBuilder;

    .line 263
    .line 264
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 265
    .line 266
    .line 267
    const-string v8, "== initSession (id="

    .line 268
    .line 269
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    iget v8, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 273
    .line 274
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    invoke-static {v2, v1}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :try_start_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 288
    .line 289
    iget-object v7, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCamera2CameraInfoImpl:Landroidx/camera/camera2/internal/Camera2CameraInfoImpl;

    .line 290
    .line 291
    invoke-static {v4, v5, v6, v3}, Landroidx/camera/core/impl/OutputSurfaceConfiguration;->create(Landroidx/camera/core/impl/OutputSurface;Landroidx/camera/core/impl/OutputSurface;Landroidx/camera/core/impl/OutputSurface;Landroidx/camera/core/impl/OutputSurface;)Landroidx/camera/core/impl/OutputSurfaceConfiguration;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    invoke-interface {v1, v7, v3}, Landroidx/camera/core/impl/SessionProcessor;->initSession(Landroidx/camera/core/CameraInfo;Landroidx/camera/core/impl/OutputSurfaceConfiguration;)Landroidx/camera/core/impl/SessionConfig;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    iput-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorSessionConfig:Landroidx/camera/core/impl/SessionConfig;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 300
    .line 301
    invoke-virtual {v1}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    invoke-interface {v1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p4

    .line 309
    check-cast p4, Landroidx/camera/core/impl/DeferrableSurface;

    .line 310
    .line 311
    invoke-virtual {p4}, Landroidx/camera/core/impl/DeferrableSurface;->getTerminationFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 312
    .line 313
    .line 314
    move-result-object p4

    .line 315
    new-instance v1, Landroidx/camera/camera2/internal/f3;

    .line 316
    .line 317
    invoke-direct {v1, p0, v0}, Landroidx/camera/camera2/internal/f3;-><init>(Landroidx/camera/camera2/internal/ProcessingCaptureSession;Landroidx/camera/core/impl/DeferrableSurface;)V

    .line 318
    .line 319
    .line 320
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-interface {p4, v1, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 325
    .line 326
    .line 327
    iget-object p4, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    .line 328
    .line 329
    invoke-virtual {p4}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 330
    .line 331
    .line 332
    move-result-object p4

    .line 333
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object p4

    .line 337
    :goto_4
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_9

    .line 342
    .line 343
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Landroidx/camera/core/impl/DeferrableSurface;

    .line 348
    .line 349
    sget-object v1, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->sHeldProcessorSurfaces:Ljava/util/List;

    .line 350
    .line 351
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->getTerminationFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    new-instance v2, Landroidx/camera/camera2/internal/g3;

    .line 359
    .line 360
    invoke-direct {v2, v0}, Landroidx/camera/camera2/internal/g3;-><init>(Landroidx/camera/core/impl/DeferrableSurface;)V

    .line 361
    .line 362
    .line 363
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mExecutor:Ljava/util/concurrent/Executor;

    .line 364
    .line 365
    invoke-interface {v1, v2, v0}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 366
    .line 367
    .line 368
    goto :goto_4

    .line 369
    :cond_9
    new-instance p4, Landroidx/camera/core/impl/SessionConfig$ValidatingBuilder;

    .line 370
    .line 371
    invoke-direct {p4}, Landroidx/camera/core/impl/SessionConfig$ValidatingBuilder;-><init>()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p4, p1}, Landroidx/camera/core/impl/SessionConfig$ValidatingBuilder;->add(Landroidx/camera/core/impl/SessionConfig;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {p4}, Landroidx/camera/core/impl/SessionConfig$ValidatingBuilder;->clearSurfaces()V

    .line 378
    .line 379
    .line 380
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    .line 381
    .line 382
    invoke-virtual {p4, p1}, Landroidx/camera/core/impl/SessionConfig$ValidatingBuilder;->add(Landroidx/camera/core/impl/SessionConfig;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p4}, Landroidx/camera/core/impl/SessionConfig$ValidatingBuilder;->isValid()Z

    .line 386
    .line 387
    .line 388
    move-result p1

    .line 389
    const-string v0, "Cannot transform the SessionConfig"

    .line 390
    .line 391
    invoke-static {p1, v0}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {p4}, Landroidx/camera/core/impl/SessionConfig$ValidatingBuilder;->build()Landroidx/camera/core/impl/SessionConfig;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    iget-object p4, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCaptureSession:Landroidx/camera/camera2/internal/CaptureSession;

    .line 399
    .line 400
    invoke-static {p2}, Landroidx/core/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p2

    .line 404
    check-cast p2, Landroid/hardware/camera2/CameraDevice;

    .line 405
    .line 406
    invoke-virtual {p4, p1, p2, p3}, Landroidx/camera/camera2/internal/CaptureSession;->open(Landroidx/camera/core/impl/SessionConfig;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    new-instance p2, Landroidx/camera/camera2/internal/ProcessingCaptureSession$1;

    .line 411
    .line 412
    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession$1;-><init>(Landroidx/camera/camera2/internal/ProcessingCaptureSession;)V

    .line 413
    .line 414
    .line 415
    iget-object p0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mExecutor:Ljava/util/concurrent/Executor;

    .line 416
    .line 417
    invoke-static {p1, p2, p0}, Landroidx/camera/core/impl/utils/futures/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/impl/utils/futures/FutureCallback;Ljava/util/concurrent/Executor;)V

    .line 418
    .line 419
    .line 420
    return-object p1

    .line 421
    :catchall_0
    move-exception p1

    .line 422
    const-string/jumbo p2, "initSession failed"

    .line 423
    .line 424
    .line 425
    invoke-static {v2, p2, p1}, Landroidx/camera/core/Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 426
    .line 427
    .line 428
    iget-object p0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mOutputSurfaces:Ljava/util/List;

    .line 429
    .line 430
    invoke-static {p0}, Landroidx/camera/core/impl/DeferrableSurfaces;->decrementAll(Ljava/util/List;)V

    .line 431
    .line 432
    .line 433
    if-eqz v0, :cond_a

    .line 434
    .line 435
    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->decrementUseCount()V

    .line 436
    .line 437
    .line 438
    :cond_a
    throw p1

    .line 439
    :catch_0
    move-exception p0

    .line 440
    invoke-static {p0}, Landroidx/camera/core/impl/utils/futures/Futures;->immediateFailedFuture(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 441
    .line 442
    .line 443
    move-result-object p0

    .line 444
    return-object p0
.end method

.method public static synthetic e(Landroidx/camera/camera2/internal/ProcessingCaptureSession;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "== deInitSession (id="

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "ProcessingCaptureSession"

    .line 29
    .line 30
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 34
    .line 35
    invoke-interface {p0}, Landroidx/camera/core/impl/SessionProcessor;->deInitSession()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private static getSessionProcessorSurfaceList(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/SessionProcessorSurface;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Landroidx/camera/core/impl/DeferrableSurface;

    .line 21
    .line 22
    instance-of v2, v1, Landroidx/camera/core/impl/SessionProcessorSurface;

    .line 23
    .line 24
    const-string v3, "Surface must be SessionProcessorSurface"

    .line 25
    .line 26
    invoke-static {v2, v3}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    check-cast v1, Landroidx/camera/core/impl/SessionProcessorSurface;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-object v0
.end method

.method private static hasPreviewSurface(Landroidx/camera/core/impl/CaptureConfig;)Z
    .locals 2
    .param p0    # Landroidx/camera/core/impl/CaptureConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/impl/CaptureConfig;->getSurfaces()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroidx/camera/core/impl/DeferrableSurface;

    .line 20
    .line 21
    invoke-static {v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->isPreview(Landroidx/camera/core/impl/DeferrableSurface;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    invoke-static {v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->isStreamSharing(Landroidx/camera/core/impl/DeferrableSurface;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    :cond_1
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method private static isImageAnalysis(Landroidx/camera/core/impl/DeferrableSurface;)Z
    .locals 1
    .param p0    # Landroidx/camera/core/impl/DeferrableSurface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->getContainerClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class v0, Landroidx/camera/core/ImageAnalysis;

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static isImageCapture(Landroidx/camera/core/impl/DeferrableSurface;)Z
    .locals 1
    .param p0    # Landroidx/camera/core/impl/DeferrableSurface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->getContainerClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class v0, Landroidx/camera/core/ImageCapture;

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static isPreview(Landroidx/camera/core/impl/DeferrableSurface;)Z
    .locals 1
    .param p0    # Landroidx/camera/core/impl/DeferrableSurface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->getContainerClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class v0, Landroidx/camera/core/Preview;

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static isStreamSharing(Landroidx/camera/core/impl/DeferrableSurface;)Z
    .locals 1
    .param p0    # Landroidx/camera/core/impl/DeferrableSurface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/impl/DeferrableSurface;->getContainerClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class v0, Landroidx/camera/core/streamsharing/StreamSharing;

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private isTemplateTypeForStillCapture(I)Z
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private updateParameters(Landroidx/camera/camera2/interop/CaptureRequestOptions;Landroidx/camera/camera2/interop/CaptureRequestOptions;)V
    .locals 1
    .param p1    # Landroidx/camera/camera2/interop/CaptureRequestOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/camera2/interop/CaptureRequestOptions;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;->insertAllOptions(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2}, Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;->insertAllOptions(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/camera/camera2/impl/Camera2ImplConfig$Builder;->build()Landroidx/camera/camera2/impl/Camera2ImplConfig;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-interface {p1, p2}, Landroidx/camera/core/impl/SessionProcessor;->setParameters(Landroidx/camera/core/impl/Config;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public cancelIssuedCaptureRequests()V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "cancelIssuedCaptureRequests (id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ")"

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "ProcessingCaptureSession"

    .line 26
    .line 27
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Landroidx/camera/core/impl/CaptureConfig;

    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/camera/core/impl/CaptureConfig;->getCameraCaptureCallbacks()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_0

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Landroidx/camera/core/impl/CameraCaptureCallback;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroidx/camera/core/impl/CaptureConfig;->getId()I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/CameraCaptureCallback;->onCaptureCancelled(I)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 v0, 0x0

    .line 81
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 82
    .line 83
    :cond_2
    return-void
.end method

.method public close()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "close (id="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ") state="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const-string v1, "ProcessingCaptureSession"

    .line 31
    .line 32
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 36
    .line 37
    sget-object v2, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 38
    .line 39
    if-ne v0, v2, :cond_1

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "== onCaptureSessionEnd (id = "

    .line 47
    .line 48
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget v2, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v2, ")"

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 69
    .line 70
    invoke-interface {v0}, Landroidx/camera/core/impl/SessionProcessor;->onCaptureSessionEnd()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mRequestProcessor:Landroidx/camera/camera2/internal/Camera2RequestProcessor;

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/Camera2RequestProcessor;->close()V

    .line 78
    .line 79
    .line 80
    :cond_0
    sget-object v0, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->ON_CAPTURE_SESSION_ENDED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 81
    .line 82
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 83
    .line 84
    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCaptureSession:Landroidx/camera/camera2/internal/CaptureSession;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/CaptureSession;->close()V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public getCaptureConfigs()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/CaptureConfig;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 9
    .line 10
    return-object v0
.end method

.method public getSessionConfig()Landroidx/camera/core/impl/SessionConfig;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public isInOpenState()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCaptureSession:Landroidx/camera/camera2/internal/CaptureSession;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/camera/camera2/internal/CaptureSession;->isInOpenState()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public issueCaptureRequests(Ljava/util/List;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/CaptureConfig;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "issueCaptureRequests (id="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ") + state ="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "ProcessingCaptureSession"

    .line 40
    .line 41
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    if-eq v0, v2, :cond_5

    .line 54
    .line 55
    const/4 v2, 0x2

    .line 56
    if-eq v0, v2, :cond_2

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    if-eq v0, v2, :cond_1

    .line 60
    .line 61
    const/4 v2, 0x4

    .line 62
    if-eq v0, v2, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const-string v2, "Run issueCaptureRequests in wrong state, state = "

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->cancelRequests(Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Landroidx/camera/core/impl/CaptureConfig;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroidx/camera/core/impl/CaptureConfig;->getTemplateType()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    invoke-direct {p0, v1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->isTemplateTypeForStillCapture(I)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->issueStillCaptureRequest(Landroidx/camera/core/impl/CaptureConfig;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->issueTriggerRequest(Landroidx/camera/core/impl/CaptureConfig;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    :goto_1
    return-void

    .line 126
    :cond_5
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 127
    .line 128
    if-eqz v0, :cond_6

    .line 129
    .line 130
    invoke-static {p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->cancelRequests(Ljava/util/List;)V

    .line 131
    .line 132
    .line 133
    const-string p1, "cancel the request because are pending un-submitted request"

    .line 134
    .line 135
    invoke-static {v1, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_6
    iput-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 140
    .line 141
    return-void
.end method

.method public issueStillCaptureRequest(Landroidx/camera/core/impl/CaptureConfig;)V
    .locals 6
    .param p1    # Landroidx/camera/core/impl/CaptureConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getImplementationOptions()Landroidx/camera/core/impl/Config;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->from(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getImplementationOptions()Landroidx/camera/core/impl/Config;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Landroidx/camera/core/impl/CaptureConfig;->OPTION_ROTATION:Landroidx/camera/core/impl/Config$Option;

    .line 14
    .line 15
    invoke-interface {v1, v2}, Landroidx/camera/core/impl/Config;->containsOption(Landroidx/camera/core/impl/Config$Option;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_ORIENTATION:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getImplementationOptions()Landroidx/camera/core/impl/Config;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3, v2}, Landroidx/camera/core/impl/Config;->retrieveOption(Landroidx/camera/core/impl/Config$Option;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getImplementationOptions()Landroidx/camera/core/impl/Config;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    sget-object v2, Landroidx/camera/core/impl/CaptureConfig;->OPTION_JPEG_QUALITY:Landroidx/camera/core/impl/Config$Option;

    .line 41
    .line 42
    invoke-interface {v1, v2}, Landroidx/camera/core/impl/Config;->containsOption(Landroidx/camera/core/impl/Config$Option;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    sget-object v1, Landroid/hardware/camera2/CaptureRequest;->JPEG_QUALITY:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getImplementationOptions()Landroidx/camera/core/impl/Config;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-interface {v3, v2}, Landroidx/camera/core/impl/Config;->retrieveOption(Landroidx/camera/core/impl/Config$Option;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/lang/Integer;

    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Integer;->byteValue()B

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v0, v1, v2}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->setCaptureRequestOption(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 69
    .line 70
    .line 71
    :cond_1
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->build()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mStillCaptureOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 76
    .line 77
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 78
    .line 79
    invoke-direct {p0, v1, v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->updateParameters(Landroidx/camera/camera2/interop/CaptureRequestOptions;Landroidx/camera/camera2/interop/CaptureRequestOptions;)V

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->isPostviewEnabled()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getTagBundle()Landroidx/camera/core/impl/TagBundle;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    new-instance v3, Landroidx/camera/camera2/internal/ProcessingCaptureSession$CaptureCallbackAdapter;

    .line 93
    .line 94
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getId()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getCameraCaptureCallbacks()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/4 v5, 0x0

    .line 103
    invoke-direct {v3, v4, p1, v5}, Landroidx/camera/camera2/internal/ProcessingCaptureSession$CaptureCallbackAdapter;-><init>(ILjava/util/List;Landroidx/camera/camera2/internal/ProcessingCaptureSession$1;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v0, v1, v2, v3}, Landroidx/camera/core/impl/SessionProcessor;->startCapture(ZLandroidx/camera/core/impl/TagBundle;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;)I

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public issueTriggerRequest(Landroidx/camera/core/impl/CaptureConfig;)V
    .locals 6
    .param p1    # Landroidx/camera/core/impl/CaptureConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "ProcessingCaptureSession"

    .line 2
    .line 3
    const-string/jumbo v1, "issueTriggerRequest"

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getImplementationOptions()Landroidx/camera/core/impl/Config;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->from(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->build()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroidx/camera/core/impl/ReadableConfig;->listOptions()Ljava/util/Set;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Landroidx/camera/core/impl/Config$Option;

    .line 40
    .line 41
    invoke-virtual {v2}, Landroidx/camera/core/impl/Config$Option;->getToken()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/hardware/camera2/CaptureRequest$Key;

    .line 46
    .line 47
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-nez v3, :cond_1

    .line 54
    .line 55
    sget-object v3, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_PRECAPTURE_TRIGGER:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/hardware/camera2/CaptureRequest$Key;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    .line 63
    :cond_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getTagBundle()Landroidx/camera/core/impl/TagBundle;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v3, Landroidx/camera/camera2/internal/ProcessingCaptureSession$CaptureCallbackAdapter;

    .line 70
    .line 71
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getId()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getCameraCaptureCallbacks()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-direct {v3, v4, p1, v5}, Landroidx/camera/camera2/internal/ProcessingCaptureSession$CaptureCallbackAdapter;-><init>(ILjava/util/List;Landroidx/camera/camera2/internal/ProcessingCaptureSession$1;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v1, v0, v2, v3}, Landroidx/camera/core/impl/SessionProcessor;->startTrigger(Landroidx/camera/core/impl/Config;Landroidx/camera/core/impl/TagBundle;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;)I

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_2
    filled-new-array {p1}, [Landroidx/camera/core/impl/CaptureConfig;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->cancelRequests(Ljava/util/List;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public onConfigured(Landroidx/camera/camera2/internal/CaptureSession;)V
    .locals 2
    .param p1    # Landroidx/camera/camera2/internal/CaptureSession;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 2
    .line 3
    sget-object v1, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->SESSION_INITIALIZED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Landroidx/camera/camera2/internal/Camera2RequestProcessor;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    .line 11
    .line 12
    invoke-virtual {v1}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->getSessionProcessorSurfaceList(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, p1, v1}, Landroidx/camera/camera2/internal/Camera2RequestProcessor;-><init>(Landroidx/camera/camera2/internal/CaptureSession;Ljava/util/List;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mRequestProcessor:Landroidx/camera/camera2/internal/Camera2RequestProcessor;

    .line 24
    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v0, "== onCaptureSessinStarted (id = "

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v0, ")"

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "ProcessingCaptureSession"

    .line 50
    .line 51
    invoke-static {v0, p1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 55
    .line 56
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mRequestProcessor:Landroidx/camera/camera2/internal/Camera2RequestProcessor;

    .line 57
    .line 58
    invoke-interface {p1, v0}, Landroidx/camera/core/impl/SessionProcessor;->onCaptureSessionStart(Landroidx/camera/core/impl/RequestProcessor;)V

    .line 59
    .line 60
    .line 61
    sget-object p1, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 62
    .line 63
    iput-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 64
    .line 65
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->setSessionConfig(Landroidx/camera/core/impl/SessionConfig;)V

    .line 70
    .line 71
    .line 72
    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 73
    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->issueCaptureRequests(Ljava/util/List;)V

    .line 79
    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    iput-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mPendingCaptureConfigs:Ljava/util/List;

    .line 83
    .line 84
    :cond_2
    :goto_0
    return-void
.end method

.method public open(Landroidx/camera/core/impl/SessionConfig;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 8
    .param p1    # Landroidx/camera/core/impl/SessionConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/hardware/camera2/CameraDevice;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/SessionConfig;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 2
    .line 3
    sget-object v1, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->UNINITIALIZED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v2

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v3, "Invalid state state:"

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v3, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    xor-int/2addr v0, v2

    .line 42
    const-string v1, "SessionConfig contains no surfaces"

    .line 43
    .line 44
    invoke-static {v0, v1}, Landroidx/core/util/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    const-string/jumbo v1, "open (id="

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ")"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "ProcessingCaptureSession"

    .line 73
    .line 74
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getSurfaces()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iput-object v2, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mOutputSurfaces:Ljava/util/List;

    .line 82
    .line 83
    iget-object v6, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mExecutor:Ljava/util/concurrent/Executor;

    .line 84
    .line 85
    iget-object v7, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mScheduledExecutorService:Ljava/util/concurrent/ScheduledExecutorService;

    .line 86
    .line 87
    const/4 v3, 0x0

    .line 88
    const-wide/16 v4, 0x1388

    .line 89
    .line 90
    invoke-static/range {v2 .. v7}, Landroidx/camera/core/impl/DeferrableSurfaces;->surfaceListWithTimeout(Ljava/util/Collection;ZJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Landroidx/camera/core/impl/utils/futures/FutureChain;->from(Lcom/google/common/util/concurrent/ListenableFuture;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    new-instance v1, Landroidx/camera/camera2/internal/d3;

    .line 99
    .line 100
    invoke-direct {v1, p0, p1, p2, p3}, Landroidx/camera/camera2/internal/d3;-><init>(Landroidx/camera/camera2/internal/ProcessingCaptureSession;Landroidx/camera/core/impl/SessionConfig;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/SynchronizedCaptureSession$Opener;)V

    .line 101
    .line 102
    .line 103
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mExecutor:Ljava/util/concurrent/Executor;

    .line 104
    .line 105
    invoke-virtual {v0, v1, p1}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transformAsync(Landroidx/camera/core/impl/utils/futures/AsyncFunction;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance p2, Landroidx/camera/camera2/internal/e3;

    .line 110
    .line 111
    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/e3;-><init>(Landroidx/camera/camera2/internal/ProcessingCaptureSession;)V

    .line 112
    .line 113
    .line 114
    iget-object p3, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mExecutor:Ljava/util/concurrent/Executor;

    .line 115
    .line 116
    invoke-virtual {p1, p2, p3}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transform(Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    return-object p1
.end method

.method public release(Z)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "release (id="

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ") mProcessorState="

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "ProcessingCaptureSession"

    .line 32
    .line 33
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mCaptureSession:Landroidx/camera/camera2/internal/CaptureSession;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/CaptureSession;->release(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/4 v1, 0x1

    .line 49
    if-eq v0, v1, :cond_0

    .line 50
    .line 51
    const/4 v1, 0x3

    .line 52
    if-eq v0, v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    new-instance v0, Landroidx/camera/camera2/internal/c3;

    .line 56
    .line 57
    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/c3;-><init>(Landroidx/camera/camera2/internal/ProcessingCaptureSession;)V

    .line 58
    .line 59
    .line 60
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-interface {p1, v0, v1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    sget-object v0, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->DE_INITIALIZED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 68
    .line 69
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 70
    .line 71
    return-object p1
.end method

.method public setSessionConfig(Landroidx/camera/core/impl/SessionConfig;)V
    .locals 2
    .param p1    # Landroidx/camera/core/impl/SessionConfig;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "setSessionConfig (id="

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    iget v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mInstanceId:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v1, ")"

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "ProcessingCaptureSession"

    .line 27
    .line 28
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionConfig:Landroidx/camera/core/impl/SessionConfig;

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mRequestProcessor:Landroidx/camera/camera2/internal/Camera2RequestProcessor;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/Camera2RequestProcessor;->updateSessionConfig(Landroidx/camera/core/impl/SessionConfig;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mProcessorState:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 44
    .line 45
    sget-object v1, Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;->ON_CAPTURE_SESSION_STARTED:Landroidx/camera/camera2/internal/ProcessingCaptureSession$ProcessorState;

    .line 46
    .line 47
    if-ne v0, v1, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getImplementationOptions()Landroidx/camera/core/impl/Config;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->from(Landroidx/camera/core/impl/Config;)Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Landroidx/camera/camera2/interop/CaptureRequestOptions$Builder;->build()Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 62
    .line 63
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mStillCaptureOptions:Landroidx/camera/camera2/interop/CaptureRequestOptions;

    .line 64
    .line 65
    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->updateParameters(Landroidx/camera/camera2/interop/CaptureRequestOptions;Landroidx/camera/camera2/interop/CaptureRequestOptions;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getRepeatingCaptureConfig()Landroidx/camera/core/impl/CaptureConfig;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->hasPreviewSurface(Landroidx/camera/core/impl/CaptureConfig;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_2

    .line 77
    .line 78
    iget-object p1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 79
    .line 80
    invoke-interface {p1}, Landroidx/camera/core/impl/SessionProcessor;->stopRepeating()V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessor:Landroidx/camera/core/impl/SessionProcessor;

    .line 85
    .line 86
    invoke-virtual {p1}, Landroidx/camera/core/impl/SessionConfig;->getRepeatingCaptureConfig()Landroidx/camera/core/impl/CaptureConfig;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Landroidx/camera/core/impl/CaptureConfig;->getTagBundle()Landroidx/camera/core/impl/TagBundle;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object v1, p0, Landroidx/camera/camera2/internal/ProcessingCaptureSession;->mSessionProcessorCaptureCallback:Landroidx/camera/camera2/internal/ProcessingCaptureSession$SessionProcessorCaptureCallback;

    .line 95
    .line 96
    invoke-interface {v0, p1, v1}, Landroidx/camera/core/impl/SessionProcessor;->startRepeating(Landroidx/camera/core/impl/TagBundle;Landroidx/camera/core/impl/SessionProcessor$CaptureCallback;)I

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_0
    return-void
.end method

.method public setStreamUseCaseMap(Ljava/util/Map;)V
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/DeferrableSurface;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    return-void
.end method
