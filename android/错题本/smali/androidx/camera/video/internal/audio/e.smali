.class public final synthetic Landroidx/camera/video/internal/audio/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/video/internal/audio/BufferedAudioStream;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/video/internal/audio/BufferedAudioStream;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/internal/audio/e;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/audio/e;->b:Landroidx/camera/video/internal/audio/BufferedAudioStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/audio/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/audio/e;->b:Landroidx/camera/video/internal/audio/BufferedAudioStream;

    invoke-static {v0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->c(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/audio/e;->b:Landroidx/camera/video/internal/audio/BufferedAudioStream;

    invoke-static {v0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->f(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/internal/audio/e;->b:Landroidx/camera/video/internal/audio/BufferedAudioStream;

    invoke-static {v0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->b(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/internal/audio/e;->b:Landroidx/camera/video/internal/audio/BufferedAudioStream;

    invoke-static {v0}, Landroidx/camera/video/internal/audio/BufferedAudioStream;->a(Landroidx/camera/video/internal/audio/BufferedAudioStream;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
