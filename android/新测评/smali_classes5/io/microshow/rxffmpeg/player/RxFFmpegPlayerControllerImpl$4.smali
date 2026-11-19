.class Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->initView()V
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
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$4;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$4;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->isPlaying()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$4;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 14
    .line 15
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 16
    .line 17
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->pause()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$4;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 22
    .line 23
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 24
    .line 25
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->resume()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method
