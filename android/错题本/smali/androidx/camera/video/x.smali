.class public final synthetic Landroidx/camera/video/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;
.implements Landroidx/camera/core/SurfaceRequest$TransformationInfoListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/video/x;->a:I

    iput-object p1, p0, Landroidx/camera/video/x;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/video/x;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/video/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoEncoderSession;

    invoke-static {v0, p1}, Landroidx/camera/video/VideoEncoderSession;->f(Landroidx/camera/video/VideoEncoderSession;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/video/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/VideoEncoderSession;

    invoke-static {v0, p1}, Landroidx/camera/video/VideoEncoderSession;->d(Landroidx/camera/video/VideoEncoderSession;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public onTransformationInfoUpdate(Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/video/x;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/video/Recorder;

    invoke-static {v0, p1}, Landroidx/camera/video/Recorder;->m(Landroidx/camera/video/Recorder;Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V

    return-void
.end method
