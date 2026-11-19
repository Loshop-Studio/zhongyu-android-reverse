.class Lcom/tencent/ijk/media/player/MediaPlayerProxy$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/ijk/media/player/MediaPlayerProxy;->setOnHLSKeyErrorListener(Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/tencent/ijk/media/player/MediaPlayerProxy;

.field final synthetic val$finalListener:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;


# direct methods
.method public constructor <init>(Lcom/tencent/ijk/media/player/MediaPlayerProxy;Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/ijk/media/player/MediaPlayerProxy$9;->this$0:Lcom/tencent/ijk/media/player/MediaPlayerProxy;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/tencent/ijk/media/player/MediaPlayerProxy$9;->val$finalListener:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onHLSKeyError(Lcom/tencent/ijk/media/player/IMediaPlayer;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/tencent/ijk/media/player/MediaPlayerProxy$9;->val$finalListener:Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/tencent/ijk/media/player/MediaPlayerProxy$9;->this$0:Lcom/tencent/ijk/media/player/MediaPlayerProxy;

    .line 4
    .line 5
    invoke-interface {p1, v0}, Lcom/tencent/ijk/media/player/IMediaPlayer$OnHLSKeyErrorListener;->onHLSKeyError(Lcom/tencent/ijk/media/player/IMediaPlayer;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
