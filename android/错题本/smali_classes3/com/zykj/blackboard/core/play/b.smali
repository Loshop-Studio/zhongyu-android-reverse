.class public final synthetic Lcom/zykj/blackboard/core/play/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/blackboard/core/play/AudioCommandThread;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/play/AudioCommandThread;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/blackboard/core/play/b;->a:I

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/b;->b:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/play/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/blackboard/core/play/b;->b:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    invoke-static {v0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->d(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/b;->b:Lcom/zykj/blackboard/core/play/AudioCommandThread;

    invoke-static {v0, p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->a(Lcom/zykj/blackboard/core/play/AudioCommandThread;Landroid/media/MediaPlayer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
