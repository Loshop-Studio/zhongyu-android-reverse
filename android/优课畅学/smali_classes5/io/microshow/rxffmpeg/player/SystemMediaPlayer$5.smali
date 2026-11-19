.class Lio/microshow/rxffmpeg/player/SystemMediaPlayer$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/microshow/rxffmpeg/player/SystemMediaPlayer;->setOnTimeUpdateListener(Lio/microshow/rxffmpeg/player/IMediaPlayer$OnTimeUpdateListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;


# direct methods
.method public constructor <init>(Lio/microshow/rxffmpeg/player/SystemMediaPlayer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$5;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onInfo(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .line 1
    const/4 p1, 0x3

    .line 2
    const/4 p3, 0x0

    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, p1, :cond_3

    .line 5
    .line 6
    const/16 p1, 0x2bc

    .line 7
    .line 8
    if-ne p2, p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x2bd

    .line 12
    .line 13
    if-ne p2, p1, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$5;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 16
    .line 17
    iget-object p2, p1, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnLoadingListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;

    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-interface {p2, p1, v0}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;->onLoading(Lio/microshow/rxffmpeg/player/IMediaPlayer;Z)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return v0

    .line 25
    :cond_2
    return p3

    .line 26
    :cond_3
    :goto_0
    iget-object p1, p0, Lio/microshow/rxffmpeg/player/SystemMediaPlayer$5;->this$0:Lio/microshow/rxffmpeg/player/SystemMediaPlayer;

    .line 27
    .line 28
    iget-object p2, p1, Lio/microshow/rxffmpeg/player/BaseMediaPlayer;->mOnLoadingListener:Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;

    .line 29
    .line 30
    if-eqz p2, :cond_4

    .line 31
    .line 32
    invoke-interface {p2, p1, p3}, Lio/microshow/rxffmpeg/player/IMediaPlayer$OnLoadingListener;->onLoading(Lio/microshow/rxffmpeg/player/IMediaPlayer;Z)V

    .line 33
    .line 34
    .line 35
    :cond_4
    return v0
.end method
