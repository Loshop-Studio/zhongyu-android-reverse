.class public final synthetic Lcom/zykj/blackboard/core/play/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/play/AudioCommandThread;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/play/AudioCommandThread;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/c;->a:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    return-void
.end method


# virtual methods
.method public final onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/c;->a:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    invoke-static {v0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->c(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V

    return-void
.end method
