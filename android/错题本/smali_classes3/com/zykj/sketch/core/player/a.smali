.class public final synthetic Lcom/zykj/sketch/core/player/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnErrorListener;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/core/player/AudioThread;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/player/AudioThread;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/player/a;->a:Lcom/zykj/sketch/core/player/AudioThread;

    return-void
.end method


# virtual methods
.method public final onError(Landroid/media/MediaPlayer;II)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/player/a;->a:Lcom/zykj/sketch/core/player/AudioThread;

    invoke-static {v0, p1, p2, p3}, Lcom/zykj/sketch/core/player/AudioThread;->a(Lcom/zykj/sketch/core/player/AudioThread;Landroid/media/MediaPlayer;II)Z

    move-result p1

    return p1
.end method
