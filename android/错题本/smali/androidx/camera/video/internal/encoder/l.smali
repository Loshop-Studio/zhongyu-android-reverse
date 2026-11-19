.class public final synthetic Landroidx/camera/video/internal/encoder/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/internal/encoder/l;->a:I

    iput-object p1, p0, Landroidx/camera/video/internal/encoder/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/internal/encoder/l;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/internal/encoder/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Landroidx/camera/video/internal/encoder/EncoderImpl;->n(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Landroidx/camera/video/internal/encoder/EncoderImpl;->q(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Landroidx/camera/video/internal/encoder/EncodedDataImpl;->a(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Landroidx/camera/video/internal/encoder/BufferCopiedEncodedData;->a(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/video/internal/encoder/l;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, p1}, Landroidx/camera/video/internal/encoder/InputBufferImpl;->a(Ljava/util/concurrent/atomic/AtomicReference;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
