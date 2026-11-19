.class public final synthetic Landroidx/camera/video/internal/encoder/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/video/internal/encoder/EncoderImpl;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/EncoderImpl;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/internal/encoder/d;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/d;->b:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/encoder/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/d;->b:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/EncoderImpl;->b(Landroidx/camera/video/internal/encoder/EncoderImpl;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/d;->b:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/EncoderImpl;->h(Landroidx/camera/video/internal/encoder/EncoderImpl;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/d;->b:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/EncoderImpl;->i(Landroidx/camera/video/internal/encoder/EncoderImpl;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/d;->b:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/EncoderImpl;->c(Landroidx/camera/video/internal/encoder/EncoderImpl;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/d;->b:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/EncoderImpl;->p(Landroidx/camera/video/internal/encoder/EncoderImpl;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/d;->b:Landroidx/camera/video/internal/encoder/EncoderImpl;

    invoke-static {v0}, Landroidx/camera/video/internal/encoder/EncoderImpl;->a(Landroidx/camera/video/internal/encoder/EncoderImpl;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
