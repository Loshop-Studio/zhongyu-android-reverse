.class public final synthetic Landroidx/camera/video/q;
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
    iput p2, p0, Landroidx/camera/video/q;->a:I

    iput-object p1, p0, Landroidx/camera/video/q;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/q;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/q;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoCapture;

    invoke-static {v0}, Landroidx/camera/video/VideoCapture;->d(Landroidx/camera/video/VideoCapture;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/q;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/Encoder;

    invoke-static {v0}, Landroidx/camera/video/Recorder;->j(Landroidx/camera/video/internal/encoder/Encoder;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/q;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoEncoderSession;

    invoke-static {v0}, Landroidx/camera/video/VideoEncoderSession;->e(Landroidx/camera/video/VideoEncoderSession;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/q;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder$SetupVideoTask$1;

    invoke-static {v0}, Landroidx/camera/video/Recorder$SetupVideoTask$1;->a(Landroidx/camera/video/Recorder$SetupVideoTask$1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
