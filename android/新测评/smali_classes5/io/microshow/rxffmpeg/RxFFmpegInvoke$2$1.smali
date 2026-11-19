.class Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;->subscribe(Lio/reactivex/FlowableEmitter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;

.field final synthetic val$emitter:Lio/reactivex/FlowableEmitter;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;Lio/reactivex/FlowableEmitter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;->this$1:Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;

    .line 2
    .line 3
    iput-object p2, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;->val$emitter:Lio/reactivex/FlowableEmitter;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;->val$emitter:Lio/reactivex/FlowableEmitter;

    .line 2
    .line 3
    new-instance v1, Lio/microshow/rxffmpeg/RxFFmpegProgress;

    .line 4
    .line 5
    sget v2, Lio/microshow/rxffmpeg/RxFFmpegSubscriber;->STATE_CANCEL:I

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lio/microshow/rxffmpeg/RxFFmpegProgress;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lio/reactivex/Emitter;->onNext(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;->val$emitter:Lio/reactivex/FlowableEmitter;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/Throwable;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Lio/reactivex/Emitter;->onError(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onFinish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;->val$emitter:Lio/reactivex/FlowableEmitter;

    .line 2
    .line 3
    invoke-interface {v0}, Lio/reactivex/Emitter;->onComplete()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onProgress(IJ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2$1;->val$emitter:Lio/reactivex/FlowableEmitter;

    .line 2
    .line 3
    new-instance v1, Lio/microshow/rxffmpeg/RxFFmpegProgress;

    .line 4
    .line 5
    sget v2, Lio/microshow/rxffmpeg/RxFFmpegSubscriber;->STATE_PROGRESS:I

    .line 6
    .line 7
    invoke-direct {v1, v2, p1, p2, p3}, Lio/microshow/rxffmpeg/RxFFmpegProgress;-><init>(IIJ)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Lio/reactivex/Emitter;->onNext(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
