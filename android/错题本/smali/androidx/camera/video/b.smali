.class public final synthetic Landroidx/camera/video/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/camera/video/b;->a:I

    iput-object p2, p0, Landroidx/camera/video/b;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/video/b;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/video/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoCapture;

    iget-object v1, p0, Landroidx/camera/video/b;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/SessionConfig$Builder;

    invoke-static {v0, v1, p1}, Landroidx/camera/video/VideoCapture;->f(Landroidx/camera/video/VideoCapture;Landroidx/camera/core/impl/SessionConfig$Builder;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder;

    iget-object v1, p0, Landroidx/camera/video/b;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/Recorder$RecordingRecord;

    invoke-static {v0, p1, v1}, Landroidx/camera/video/Recorder;->f(Landroidx/camera/video/Recorder;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Landroidx/camera/video/Recorder$RecordingRecord;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/video/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder;

    iget-object v1, p0, Landroidx/camera/video/b;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/video/Recorder$RecordingRecord;

    invoke-static {v0, p1, v1}, Landroidx/camera/video/Recorder;->o(Landroidx/camera/video/Recorder;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Landroidx/camera/video/Recorder$RecordingRecord;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
