.class public final synthetic Landroidx/camera/video/internal/encoder/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/internal/encoder/k;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/encoder/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;

    invoke-virtual {v0}, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;->reachEndData()V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderCallback;

    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncoderCallback;->onEncodePaused()V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderCallback;

    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncoderCallback;->onEncodeStart()V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/k;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderCallback;

    invoke-interface {v0}, Landroidx/camera/video/internal/encoder/EncoderCallback;->onEncodeStop()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
