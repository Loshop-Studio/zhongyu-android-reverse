.class public abstract Lio/microshow/rxffmpeg/RxFFmpegSubscriber;
.super Lio/reactivex/subscribers/a;
.source "SourceFile"

# interfaces
.implements Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/reactivex/subscribers/a;",
        "Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;"
    }
.end annotation


# static fields
.field public static STATE_CANCEL:I = -0x64

.field public static STATE_PROGRESS:I = 0x64


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/reactivex/subscribers/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onComplete()V
    .locals 0

    .line 1
    invoke-interface {p0}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onFinish()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onError(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onNext(Lio/microshow/rxffmpeg/RxFFmpegProgress;)V
    .locals 3

    .line 2
    iget v0, p1, Lio/microshow/rxffmpeg/RxFFmpegProgress;->state:I

    sget v1, Lio/microshow/rxffmpeg/RxFFmpegSubscriber;->STATE_CANCEL:I

    if-ne v0, v1, :cond_0

    .line 3
    invoke-interface {p0}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onCancel()V

    return-void

    .line 4
    :cond_0
    iget v0, p1, Lio/microshow/rxffmpeg/RxFFmpegProgress;->progress:I

    iget-wide v1, p1, Lio/microshow/rxffmpeg/RxFFmpegProgress;->progressTime:J

    invoke-interface {p0, v0, v1, v2}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onProgress(IJ)V

    return-void
.end method

.method public bridge synthetic onNext(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lio/microshow/rxffmpeg/RxFFmpegProgress;

    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/RxFFmpegSubscriber;->onNext(Lio/microshow/rxffmpeg/RxFFmpegProgress;)V

    return-void
.end method
