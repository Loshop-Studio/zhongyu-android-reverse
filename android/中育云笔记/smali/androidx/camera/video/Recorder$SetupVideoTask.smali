.class Landroidx/camera/video/Recorder$SetupVideoTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/video/Recorder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SetupVideoTask"
.end annotation


# instance fields
.field private mIsFailedRetryCanceled:Z

.field private final mMaxRetryCount:I

.field private mRetryCount:I

.field private mRetryFuture:Ljava/util/concurrent/ScheduledFuture;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private final mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

.field private final mTimebase:Landroidx/camera/core/impl/Timebase;

.field final synthetic this$0:Landroidx/camera/video/Recorder;


# direct methods
.method public constructor <init>(Landroidx/camera/video/Recorder;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;I)V
    .locals 0
    .param p1    # Landroidx/camera/video/Recorder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/core/SurfaceRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mIsFailedRetryCanceled:Z

    .line 8
    .line 9
    iput p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryCount:I

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 13
    .line 14
    iput-object p2, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 15
    .line 16
    iput-object p3, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mTimebase:Landroidx/camera/core/impl/Timebase;

    .line 17
    .line 18
    iput p4, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mMaxRetryCount:I

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic a(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->isServiced()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 11
    .line 12
    iget-object v0, v0, Landroidx/camera/video/Recorder;->mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/camera/video/VideoEncoderSession;->isConfiguredSurfaceRequest(Landroidx/camera/core/SurfaceRequest;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/camera/video/Recorder;->isPersistentRecordingInProgress()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance v0, Landroidx/camera/video/VideoEncoderSession;

    .line 30
    .line 31
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 32
    .line 33
    invoke-static {v1}, Landroidx/camera/video/Recorder;->access$100(Landroidx/camera/video/Recorder;)Landroidx/camera/video/internal/encoder/EncoderFactory;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 38
    .line 39
    iget-object v3, v2, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    invoke-static {v2}, Landroidx/camera/video/Recorder;->access$200(Landroidx/camera/video/Recorder;)Ljava/util/concurrent/Executor;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v0, v1, v3, v2}, Landroidx/camera/video/VideoEncoderSession;-><init>(Landroidx/camera/video/internal/encoder/EncoderFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 49
    .line 50
    iget-object v2, v1, Landroidx/camera/video/Recorder;->mMediaSpec:Landroidx/camera/core/impl/MutableStateObservable;

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Landroidx/camera/video/Recorder;->getObservableData(Landroidx/camera/core/impl/StateObservable;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Landroidx/camera/video/MediaSpec;

    .line 57
    .line 58
    iget-object v2, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 59
    .line 60
    invoke-static {v2}, Landroidx/camera/video/Recorder;->access$300(Landroidx/camera/video/Recorder;)Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/camera/video/VideoEncoderSession;->configure(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;Landroidx/camera/video/MediaSpec;Landroidx/camera/video/internal/VideoValidatedEncoderProfilesProxy;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p2, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 69
    .line 70
    iput-object v0, p2, Landroidx/camera/video/Recorder;->mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    .line 71
    .line 72
    new-instance p2, Landroidx/camera/video/Recorder$SetupVideoTask$1;

    .line 73
    .line 74
    invoke-direct {p2, p0, v0}, Landroidx/camera/video/Recorder$SetupVideoTask$1;-><init>(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/video/VideoEncoderSession;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 78
    .line 79
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 80
    .line 81
    invoke-static {p1, p2, p0}, Landroidx/camera/core/impl/utils/futures/Futures;->addCallback(Lcom/google/common/util/concurrent/ListenableFuture;Landroidx/camera/core/impl/utils/futures/FutureCallback;Ljava/util/concurrent/Executor;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v0, "Ignore the SurfaceRequest "

    .line 91
    .line 92
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, " isServiced: "

    .line 99
    .line 100
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroidx/camera/core/SurfaceRequest;->isServiced()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p1, " VideoEncoderSession: "

    .line 111
    .line 112
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget-object p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 116
    .line 117
    iget-object p0, p0, Landroidx/camera/video/Recorder;->mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    .line 118
    .line 119
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    const-string p0, " has been configured with a persistent in-progress recording."

    .line 123
    .line 124
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    const-string p1, "Recorder"

    .line 132
    .line 133
    invoke-static {p1, p0}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public static synthetic access$1000(Landroidx/camera/video/Recorder$SetupVideoTask;)Landroidx/camera/core/impl/Timebase;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mTimebase:Landroidx/camera/core/impl/Timebase;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1100(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/camera/video/Recorder$SetupVideoTask;->setupVideo(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$400(Landroidx/camera/video/Recorder$SetupVideoTask;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$408(Landroidx/camera/video/Recorder$SetupVideoTask;)I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryCount:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryCount:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic access$500(Landroidx/camera/video/Recorder$SetupVideoTask;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mMaxRetryCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$602(Landroidx/camera/video/Recorder$SetupVideoTask;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$800(Landroidx/camera/video/Recorder$SetupVideoTask;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mIsFailedRetryCanceled:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$900(Landroidx/camera/video/Recorder$SetupVideoTask;)Landroidx/camera/core/SurfaceRequest;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 2
    .line 3
    return-object p0
.end method

.method private setupVideo(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
    .locals 2
    .param p1    # Landroidx/camera/core/SurfaceRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/core/impl/Timebase;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/camera/video/Recorder;->access$000(Landroidx/camera/video/Recorder;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Landroidx/camera/video/f0;

    .line 8
    .line 9
    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/video/f0;-><init>(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public cancelFailedRetry()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mIsFailedRetryCanceled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mIsFailedRetryCanceled:Z

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mRetryFuture:Ljava/util/concurrent/ScheduledFuture;

    .line 19
    .line 20
    :cond_1
    :goto_0
    return-void
.end method

.method public start()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mSurfaceRequest:Landroidx/camera/core/SurfaceRequest;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask;->mTimebase:Landroidx/camera/core/impl/Timebase;

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Landroidx/camera/video/Recorder$SetupVideoTask;->setupVideo(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
