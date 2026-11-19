.class Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->initListener()V
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
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    iget-object p3, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 4
    .line 5
    invoke-interface {p3}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->getDuration()I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    mul-int/2addr p2, p3

    .line 10
    div-int/lit8 p2, p2, 0x64

    .line 11
    .line 12
    iput p2, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mPosition:I

    .line 13
    .line 14
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 15
    .line 16
    invoke-static {p1}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$100(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 23
    .line 24
    iget-object p2, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayerView:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;

    .line 25
    .line 26
    iget-object p2, p2, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView;->mPlayerCoreType:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    .line 27
    .line 28
    sget-object p3, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;->PCT_RXFFMPEG_PLAYER:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    if-ne p2, p3, :cond_0

    .line 32
    .line 33
    iget p2, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mPosition:I

    .line 34
    .line 35
    iget-object p3, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 36
    .line 37
    invoke-interface {p3}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->getDuration()I

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    invoke-virtual {p1, v0, p2, p3}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    sget-object p3, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;->PCT_SYSTEM_MEDIA_PLAYER:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerView$PlayerCoreType;

    .line 46
    .line 47
    if-ne p2, p3, :cond_1

    .line 48
    .line 49
    iget p2, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mPosition:I

    .line 50
    .line 51
    div-int/lit16 p2, p2, 0x3e8

    .line 52
    .line 53
    iget-object p3, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 54
    .line 55
    invoke-interface {p3}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->getDuration()I

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    div-int/lit16 p3, p3, 0x3e8

    .line 60
    .line 61
    invoke-virtual {p1, v0, p2, p3}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V

    .line 62
    .line 63
    .line 64
    :cond_1
    :goto_0
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 65
    .line 66
    iget-object p2, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 67
    .line 68
    iget p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mPosition:I

    .line 69
    .line 70
    invoke-interface {p2, p1}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->seekTo(I)V

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {p1, v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$102(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 8
    .line 9
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 10
    .line 11
    invoke-interface {p1}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->pause()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 2
    .line 3
    iget-object p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 4
    .line 5
    invoke-interface {p1}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->resume()V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 9
    .line 10
    iget-object v0, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerController;->mPlayer:Lio/microshow/rxffmpeg/player/BaseMediaPlayer;

    .line 11
    .line 12
    iget p1, p1, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->mPosition:I

    .line 13
    .line 14
    invoke-interface {v0, p1}, Lio/microshow/rxffmpeg/player/IMediaPlayer;->seekTo(I)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl$5;->this$0:Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-static {p1, v0}, Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;->access$102(Lio/microshow/rxffmpeg/player/RxFFmpegPlayerControllerImpl;Z)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method
