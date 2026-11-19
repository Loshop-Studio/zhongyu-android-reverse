.class Lio/microshow/rxffmpeg/player/SystemMediaPlayer$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->startTimeUpdateDisposable()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx6/c;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$6;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Long;)V
    .locals 3

    .line 2
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$6;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    iget-object v0, p1, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnTimeUpdateListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p1, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->mMediaPlayer:Landroid/media/MediaPlayer;

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    iget-object v2, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$6;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    invoke-virtual {v2}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->getDuration()I

    move-result v2

    div-int/lit16 v2, v2, 0x3e8

    invoke-interface {v0, p1, v1, v2}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;->onTimeUpdate(Lio/microshow/rxffmpeg/player/IMediaPlayer;II)V

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$6;->accept(Ljava/lang/Long;)V

    return-void
.end method
