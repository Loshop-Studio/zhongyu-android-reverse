.class Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/imagecapture/CameraCapturePipeline;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/Camera2CapturePipeline;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CameraCapturePipelineImpl"
.end annotation


# instance fields
.field private final mExecutor:Ljava/util/concurrent/Executor;

.field private mFlashMode:I

.field private final mPipelineDelegate:Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;


# direct methods
.method public constructor <init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;Ljava/util/concurrent/Executor;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;->mPipelineDelegate:Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;->mExecutor:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    iput p3, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;->mFlashMode:I

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;->mPipelineDelegate:Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;->executePostCapture()V

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;->set(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    const-string p0, "invokePostCaptureFuture"

    .line 11
    .line 12
    return-object p0
.end method

.method public static synthetic b(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/lang/Void;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method


# virtual methods
.method public invokePostCapture()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/camera/camera2/internal/w0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/w0;-><init>(Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/concurrent/futures/CallbackToFutureAdapter;->getFuture(Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public invokePreCapture()Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "Camera2CapturePipeline"

    .line 2
    .line 3
    const-string v1, "invokePreCapture"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;->mPipelineDelegate:Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;

    .line 9
    .line 10
    iget v1, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;->mFlashMode:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/Camera2CapturePipeline$Pipeline;->executePreCapture(I)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Landroidx/camera/core/impl/utils/futures/FutureChain;->from(Lcom/google/common/util/concurrent/ListenableFuture;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Landroidx/camera/camera2/internal/x0;

    .line 21
    .line 22
    invoke-direct {v1}, Landroidx/camera/camera2/internal/x0;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Landroidx/camera/camera2/internal/Camera2CapturePipeline$CameraCapturePipelineImpl;->mExecutor:Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Landroidx/camera/core/impl/utils/futures/FutureChain;->transform(Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Landroidx/camera/core/impl/utils/futures/FutureChain;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method
