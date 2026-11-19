.class Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/microshow/rxffmpeg/player/IMediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl;->play(Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl$1;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onPrepared(Lio/microshow/rxffmpeg/player/IMediaPlayer;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl$1;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayerImpl;

    .line 2
    .line 3
    invoke-virtual {p1}, Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->start()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
