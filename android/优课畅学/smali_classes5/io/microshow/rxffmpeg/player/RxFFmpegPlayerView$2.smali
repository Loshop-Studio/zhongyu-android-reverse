.class Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->updateVideoLayoutParams(IIF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

.field final synthetic val$dar:F

.field final synthetic val$height:I

.field final synthetic val$width:I


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;IIF)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 2
    .line 3
    iput p2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->val$width:I

    .line 4
    .line 5
    iput p3, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->val$height:I

    .line 6
    .line 7
    iput p4, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->val$dar:F

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 2
    .line 3
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->access$100(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;

    .line 8
    .line 9
    iget v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->val$width:I

    .line 10
    .line 11
    iget v3, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->val$height:I

    .line 12
    .line 13
    iget v4, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->val$dar:F

    .line 14
    .line 15
    invoke-direct {v1, v2, v3, v4}, Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;-><init>(IIF)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lio/microshow/rxffmpeg/player/MeasureHelper;->setVideoSizeInfo(Lio/microshow/rxffmpeg/player/MeasureHelper$VideoSizeInfo;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 22
    .line 23
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->access$100(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)Lio/microshow/rxffmpeg/player/MeasureHelper;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-object v1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 28
    .line 29
    invoke-static {v1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->access$200(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)Landroid/view/TextureView;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v2, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$2;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 34
    .line 35
    invoke-static {v2}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->access$300(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;)Landroid/widget/FrameLayout;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {v0, v1, v2}, Lio/microshow/rxffmpeg/player/MeasureHelper;->setVideoLayoutParams(Landroid/view/TextureView;Landroid/widget/FrameLayout;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
