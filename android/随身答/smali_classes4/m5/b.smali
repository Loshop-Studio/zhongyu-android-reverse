.class public final synthetic Lm5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/play/AudioCommandThread;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/play/AudioCommandThread;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/b;->a:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/b;->a:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    invoke-static {v0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->v(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V

    return-void
.end method
