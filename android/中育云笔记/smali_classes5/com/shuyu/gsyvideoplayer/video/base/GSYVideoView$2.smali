.class Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->onLossAudio()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;


# direct methods
.method public constructor <init>(Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView$2;->this$0:Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView$2;->this$0:Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->mReleaseWhenLossAudio:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->releaseVideos()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->getGSYVideoManager()Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoViewBridge;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoViewBridge;->listener()Ll7/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView$2;->this$0:Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoView;->getGSYVideoManager()Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoViewBridge;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, Lcom/shuyu/gsyvideoplayer/video/base/GSYVideoViewBridge;->listener()Ll7/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ll7/a;->onVideoPause()V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method
