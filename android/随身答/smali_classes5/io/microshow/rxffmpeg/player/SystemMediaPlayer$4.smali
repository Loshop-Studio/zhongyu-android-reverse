.class Lio/microshow/rxffmpeg/player/SystemMediaPlayer$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnCompleteListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

.field final synthetic val$listener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$4;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 2
    .line 3
    iput-object p2, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$4;->val$listener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$4;->val$listener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$4;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnCompletionListener;->onCompletion(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
