.class public final synthetic Landroidx/camera/video/internal/encoder/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/video/internal/encoder/c;->a:I

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p3, p0, Landroidx/camera/video/internal/encoder/c;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/encoder/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderImpl;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl;->m(Landroidx/camera/video/internal/encoder/EncoderImpl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/Encoder$SurfaceInput$OnSurfaceUpdateListener;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$SurfaceInput;->a(Landroidx/camera/video/internal/encoder/Encoder$SurfaceInput$OnSurfaceUpdateListener;Landroid/view/Surface;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v1, Landroid/media/MediaCodec$CodecException;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;->h(Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;Landroid/media/MediaCodec$CodecException;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderCallback;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroid/media/MediaFormat;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;->d(Landroidx/camera/video/internal/encoder/EncoderCallback;Landroid/media/MediaFormat;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderCallback;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/internal/encoder/EncodedDataImpl;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;->c(Landroidx/camera/video/internal/encoder/EncoderCallback;Landroidx/camera/video/internal/encoder/EncodedDataImpl;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v1, Landroid/media/MediaFormat;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;->f(Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;Landroid/media/MediaFormat;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderImpl$ByteBufferInput;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/Observable$Observer;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$ByteBufferInput;->f(Landroidx/camera/video/internal/encoder/EncoderImpl$ByteBufferInput;Landroidx/camera/core/impl/Observable$Observer;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/Observable$Observer;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/internal/BufferProvider$State;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$ByteBufferInput;->e(Landroidx/camera/core/impl/Observable$Observer;Landroidx/camera/video/internal/BufferProvider$State;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/internal/BufferProvider$State;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl$ByteBufferInput;->b(Ljava/util/Map$Entry;Landroidx/camera/video/internal/BufferProvider$State;)V

    return-void

    :pswitch_8
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/internal/encoder/EncoderImpl;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/internal/encoder/InputBufferImpl;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl;->g(Landroidx/camera/video/internal/encoder/EncoderImpl;Landroidx/camera/video/internal/encoder/InputBufferImpl;)V

    return-void

    :pswitch_9
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/c;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Executor;

    iget-object v1, p0, Landroidx/camera/video/internal/encoder/c;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;

    invoke-static {v0, v1}, Landroidx/camera/video/internal/encoder/EncoderImpl;->f(Ljava/util/concurrent/Executor;Landroidx/camera/video/internal/encoder/EncoderImpl$MediaCodecCallback;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
