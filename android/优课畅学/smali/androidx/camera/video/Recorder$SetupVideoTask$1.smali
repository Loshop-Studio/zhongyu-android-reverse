.class Landroidx/camera/video/Recorder$SetupVideoTask$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/utils/futures/FutureCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/video/Recorder$SetupVideoTask;->setupVideo(Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/camera/core/impl/utils/futures/FutureCallback<",
        "Landroidx/camera/video/internal/encoder/Encoder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

.field final synthetic val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;


# direct methods
.method public constructor <init>(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/video/VideoEncoderSession;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Landroidx/camera/video/Recorder$SetupVideoTask$1;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$800(Landroidx/camera/video/Recorder$SetupVideoTask;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v1, "Retry setupVideo #"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 20
    .line 21
    invoke-static {v1}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$400(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "Recorder"

    .line 33
    .line 34
    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 38
    .line 39
    invoke-static {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$900(Landroidx/camera/video/Recorder$SetupVideoTask;)Landroidx/camera/core/SurfaceRequest;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object p0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 44
    .line 45
    invoke-static {p0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$1000(Landroidx/camera/video/Recorder$SetupVideoTask;)Landroidx/camera/core/impl/Timebase;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {v0, v1, p0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$1100(Landroidx/camera/video/Recorder$SetupVideoTask;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/impl/Timebase;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/Throwable;)V
    .locals 5
    .param p1    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/NonNull;
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
    const-string v1, "VideoEncoder Setup error: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "Recorder"

    .line 19
    .line 20
    invoke-static {v1, v0, p1}, Landroidx/camera/core/Logger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 24
    .line 25
    invoke-static {v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$400(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 30
    .line 31
    invoke-static {v1}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$500(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ge v0, v1, :cond_0

    .line 36
    .line 37
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 38
    .line 39
    invoke-static {p1}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$408(Landroidx/camera/video/Recorder$SetupVideoTask;)I

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 43
    .line 44
    new-instance v0, Landroidx/camera/video/g0;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Landroidx/camera/video/g0;-><init>(Landroidx/camera/video/Recorder$SetupVideoTask$1;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 50
    .line 51
    iget-object v1, v1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 52
    .line 53
    iget-object v1, v1, Landroidx/camera/video/Recorder;->mSequentialExecutor:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    sget-wide v2, Landroidx/camera/video/Recorder;->sRetrySetupVideoDelayMs:J

    .line 56
    .line 57
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    invoke-static {v0, v1, v2, v3, v4}, Landroidx/camera/video/Recorder;->access$700(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {p1, v0}, Landroidx/camera/video/Recorder$SetupVideoTask;->access$602(Landroidx/camera/video/Recorder$SetupVideoTask;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_0
    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    .line 68
    .line 69
    iget-object v0, v0, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Landroidx/camera/video/Recorder;->onEncoderSetupError(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public onSuccess(Landroidx/camera/video/internal/encoder/Encoder;)V
    .locals 3
    .param p1    # Landroidx/camera/video/internal/encoder/Encoder;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VideoEncoder is created. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Recorder"

    invoke-static {v1, v0}, Landroidx/camera/core/Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    iget-object p1, p1, Landroidx/camera/video/Recorder;->mVideoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_1

    move p1, v2

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-static {p1}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 4
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    iget-object p1, p1, Landroidx/camera/video/Recorder;->mVideoEncoder:Landroidx/camera/video/internal/encoder/Encoder;

    if-nez p1, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Landroidx/core/util/Preconditions;->checkState(Z)V

    .line 5
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    iget-object v0, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->val$videoEncoderSession:Landroidx/camera/video/VideoEncoderSession;

    invoke-virtual {p1, v0}, Landroidx/camera/video/Recorder;->onVideoEncoderReady(Landroidx/camera/video/VideoEncoderSession;)V

    .line 6
    iget-object p1, p0, Landroidx/camera/video/Recorder$SetupVideoTask$1;->this$1:Landroidx/camera/video/Recorder$SetupVideoTask;

    iget-object p1, p1, Landroidx/camera/video/Recorder$SetupVideoTask;->this$0:Landroidx/camera/video/Recorder;

    invoke-virtual {p1}, Landroidx/camera/video/Recorder;->onConfigured()V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    check-cast p1, Landroidx/camera/video/internal/encoder/Encoder;

    invoke-virtual {p0, p1}, Landroidx/camera/video/Recorder$SetupVideoTask$1;->onSuccess(Landroidx/camera/video/internal/encoder/Encoder;)V

    return-void
.end method
