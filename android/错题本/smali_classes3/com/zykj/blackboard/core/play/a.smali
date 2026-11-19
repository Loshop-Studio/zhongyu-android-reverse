.class public final synthetic Lcom/zykj/blackboard/core/play/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/play/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/play/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/zykj/sketch/core/player/AudioThread;->b(Landroid/media/MediaPlayer;)V

    return-void

    :pswitch_0
    invoke-static {p1}, Lcom/zykj/blackboard/core/play/AudioCommandThread;->b(Landroid/media/MediaPlayer;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
