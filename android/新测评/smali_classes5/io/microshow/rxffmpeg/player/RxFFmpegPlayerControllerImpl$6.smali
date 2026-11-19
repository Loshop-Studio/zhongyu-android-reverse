.class Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onCompletion(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$6;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

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
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$6;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    iget-object v0, v0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->isLooping()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$6;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 14
    .line 15
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$000(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$6;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 25
    .line 26
    invoke-static {v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$000(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/16 v1, 0x8

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
