.class public Landroidx/camera/core/imagecapture/TakePictureManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ForwardingImageProxy$OnImageCloseListener;
.implements Landroidx/camera/core/imagecapture/TakePictureRequest$RetryControl;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/imagecapture/TakePictureManager$CaptureError;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "TakePictureManager"


# instance fields
.field private mCapturingRequest:Landroidx/camera/core/imagecapture/RequestWithCallback;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field final mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

.field mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

.field private final mIncompleteRequests:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/imagecapture/RequestWithCallback;",
            ">;"
        }
    .end annotation
.end field

.field final mNewRequests:Ljava/util/Deque;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Landroidx/camera/core/imagecapture/TakePictureRequest;",
            ">;"
        }
    .end annotation
.end field

.field mPaused:Z


# direct methods
.method public constructor <init>(Landroidx/camera/core/imagecapture/ImageCaptureControl;)V
    .locals 1
    .param p1    # Landroidx/camera/core/imagecapture/ImageCaptureControl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayDeque;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mNewRequests:Ljava/util/Deque;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mPaused:Z

    .line 13
    .line 14
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mIncompleteRequests:Ljava/util/List;

    .line 25
    .line 26
    return-void
.end method

.method public static synthetic a(Landroidx/camera/core/imagecapture/TakePictureManager;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mCapturingRequest:Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/TakePictureManager;->issueNextRequest()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/imagecapture/TakePictureManager;Landroidx/camera/core/imagecapture/RequestWithCallback;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mIncompleteRequests:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private submitCameraRequest(Landroidx/camera/core/imagecapture/CameraRequest;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .param p1    # Landroidx/camera/core/imagecapture/CameraRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/imagecapture/CameraRequest;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

    .line 5
    .line 6
    invoke-interface {v0}, Landroidx/camera/core/imagecapture/ImageCaptureControl;->lockFlashMode()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImageCaptureControl:Landroidx/camera/core/imagecapture/ImageCaptureControl;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/CameraRequest;->getCaptureConfigs()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, Landroidx/camera/core/imagecapture/ImageCaptureControl;->submitStillCaptureRequests(Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Landroidx/camera/core/imagecapture/TakePictureManager$1;

    .line 20
    .line 21
    invoke-direct {v1, p0, p1}, Landroidx/camera/core/imagecapture/TakePictureManager$1;-><init>(Landroidx/camera/core/imagecapture/TakePictureManager;Landroidx/camera/core/imagecapture/CameraRequest;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->mainThreadExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {v0, v1, p1}, Landroidx/camera/core/impl/utils/futures/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/impl/utils/futures/FutureCallback;Ljava/util/concurrent/Executor;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method private trackCurrentRequests(Landroidx/camera/core/imagecapture/RequestWithCallback;)V
    .locals 3
    .param p1    # Landroidx/camera/core/imagecapture/RequestWithCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/TakePictureManager;->hasCapturingRequest()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mCapturingRequest:Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/RequestWithCallback;->getCaptureFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Landroidx/camera/core/imagecapture/u;

    .line 17
    .line 18
    invoke-direct {v1, p0}, Landroidx/camera/core/imagecapture/u;-><init>(Landroidx/camera/core/imagecapture/TakePictureManager;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mIncompleteRequests:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/camera/core/imagecapture/RequestWithCallback;->getCompleteFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Landroidx/camera/core/imagecapture/v;

    .line 38
    .line 39
    invoke-direct {v1, p0, p1}, Landroidx/camera/core/imagecapture/v;-><init>(Landroidx/camera/core/imagecapture/TakePictureManager;Landroidx/camera/core/imagecapture/RequestWithCallback;)V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public abortRequests()V
    .locals 5
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/camera/core/ImageCaptureException;

    .line 5
    .line 6
    const-string v1, "Camera is closed."

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x3

    .line 10
    invoke-direct {v0, v3, v1, v2}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mNewRequests:Ljava/util/Deque;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Landroidx/camera/core/imagecapture/TakePictureRequest;

    .line 30
    .line 31
    invoke-virtual {v2, v0}, Landroidx/camera/core/imagecapture/TakePictureRequest;->onError(Landroidx/camera/core/ImageCaptureException;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v1, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mNewRequests:Ljava/util/Deque;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    .line 38
    .line 39
    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    iget-object v2, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mIncompleteRequests:Ljava/util/List;

    .line 43
    .line 44
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    const/4 v3, 0x0

    .line 52
    :goto_1
    if-ge v3, v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    add-int/lit8 v3, v3, 0x1

    .line 59
    .line 60
    check-cast v4, Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 61
    .line 62
    invoke-virtual {v4, v0}, Landroidx/camera/core/imagecapture/RequestWithCallback;->abortAndSendErrorToApp(Landroidx/camera/core/ImageCaptureException;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    return-void
.end method

.method public getCapturingRequest()Landroidx/camera/core/imagecapture/RequestWithCallback;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mCapturingRequest:Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 2
    .line 3
    return-object v0
.end method

.method public getImagePipeline()Landroidx/camera/core/imagecapture/ImagePipeline;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIncompleteRequests()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/imagecapture/RequestWithCallback;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mIncompleteRequests:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hasCapturingRequest()Z
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mCapturingRequest:Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public issueNextRequest()V
    .locals 4
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/TakePictureManager;->hasCapturingRequest()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-boolean v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mPaused:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/camera/core/imagecapture/ImagePipeline;->getCapacity()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    return-void

    .line 25
    :cond_2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mNewRequests:Ljava/util/Deque;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroidx/camera/core/imagecapture/TakePictureRequest;

    .line 32
    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    return-void

    .line 36
    :cond_3
    new-instance v1, Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 37
    .line 38
    invoke-direct {v1, v0, p0}, Landroidx/camera/core/imagecapture/RequestWithCallback;-><init>(Landroidx/camera/core/imagecapture/TakePictureRequest;Landroidx/camera/core/imagecapture/TakePictureRequest$RetryControl;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0, v1}, Landroidx/camera/core/imagecapture/TakePictureManager;->trackCurrentRequests(Landroidx/camera/core/imagecapture/RequestWithCallback;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/camera/core/imagecapture/RequestWithCallback;->getCaptureFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v2, v0, v1, v3}, Landroidx/camera/core/imagecapture/ImagePipeline;->createRequests(Landroidx/camera/core/imagecapture/TakePictureRequest;Landroidx/camera/core/imagecapture/TakePictureCallback;Lcom/google/common/util/concurrent/ListenableFuture;)Landroidx/core/util/Pair;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v2, v0, Landroidx/core/util/Pair;->first:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v2, Landroidx/camera/core/imagecapture/CameraRequest;

    .line 57
    .line 58
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object v0, v0, Landroidx/core/util/Pair;->second:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Landroidx/camera/core/imagecapture/ProcessingRequest;

    .line 64
    .line 65
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    iget-object v3, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    .line 69
    .line 70
    invoke-virtual {v3, v0}, Landroidx/camera/core/imagecapture/ImagePipeline;->submitProcessingRequest(Landroidx/camera/core/imagecapture/ProcessingRequest;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, v2}, Landroidx/camera/core/imagecapture/TakePictureManager;->submitCameraRequest(Landroidx/camera/core/imagecapture/CameraRequest;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v1, v0}, Landroidx/camera/core/imagecapture/RequestWithCallback;->setCaptureRequestFuture(Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public offerRequest(Landroidx/camera/core/imagecapture/TakePictureRequest;)V
    .locals 1
    .param p1    # Landroidx/camera/core/imagecapture/TakePictureRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mNewRequests:Ljava/util/Deque;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Deque;->offer(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/TakePictureManager;->issueNextRequest()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onImageClose(Landroidx/camera/core/ImageProxy;)V
    .locals 1
    .param p1    # Landroidx/camera/core/ImageProxy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->mainThreadExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Landroidx/camera/core/imagecapture/w;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/camera/core/imagecapture/w;-><init>(Landroidx/camera/core/imagecapture/TakePictureManager;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public pause()V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mPaused:Z

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mCapturingRequest:Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/camera/core/imagecapture/RequestWithCallback;->abortSilentlyAndRetry()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public resume()V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mPaused:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/TakePictureManager;->issueNextRequest()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public retryRequest(Landroidx/camera/core/imagecapture/TakePictureRequest;)V
    .locals 2
    .param p1    # Landroidx/camera/core/imagecapture/TakePictureRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    const-string v0, "TakePictureManager"

    .line 5
    .line 6
    const-string v1, "Add a new request for retrying."

    .line 7
    .line 8
    invoke-static {v0, v1}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mNewRequests:Ljava/util/Deque;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/TakePictureManager;->issueNextRequest()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setImagePipeline(Landroidx/camera/core/imagecapture/ImagePipeline;)V
    .locals 0
    .param p1    # Landroidx/camera/core/imagecapture/ImagePipeline;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/Threads;->checkMainThread()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/camera/core/imagecapture/TakePictureManager;->mImagePipeline:Landroidx/camera/core/imagecapture/ImagePipeline;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroidx/camera/core/imagecapture/ImagePipeline;->setOnImageCloseListener(Landroidx/camera/core/ForwardingImageProxy$OnImageCloseListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
