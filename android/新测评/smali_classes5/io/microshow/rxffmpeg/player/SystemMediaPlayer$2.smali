.class Lio/microshow/rxffmpeg/player/SystemMediaPlayer$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnVideoSizeChangedListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

.field final synthetic val$listener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$2;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 2
    .line 3
    iput-object p2, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$2;->val$listener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 3

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$2;->val$listener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$2;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 6
    .line 7
    int-to-float v1, p2

    .line 8
    int-to-float v2, p3

    .line 9
    div-float/2addr v1, v2

    .line 10
    invoke-interface {p1, v0, p2, p3, v1}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnVideoSizeChangedListener;->onVideoSizeChanged(Lio/microshow/rxffmpeg/player/IMediaPlayer;IIF)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
