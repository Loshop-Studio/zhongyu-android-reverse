.class public final synthetic Landroidx/camera/camera2/interop/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/camera2/interop/Camera2CameraControl;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/camera2/interop/Camera2CameraControl;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/camera2/interop/b;->a:I

    iput-object p1, p0, Landroidx/camera/camera2/interop/b;->b:Landroidx/camera/camera2/interop/Camera2CameraControl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/camera2/interop/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/camera2/interop/b;->b:Landroidx/camera/camera2/interop/Camera2CameraControl;

    invoke-static {v0, p1}, Landroidx/camera/camera2/interop/Camera2CameraControl;->b(Landroidx/camera/camera2/interop/Camera2CameraControl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/camera2/interop/b;->b:Landroidx/camera/camera2/interop/Camera2CameraControl;

    invoke-static {v0, p1}, Landroidx/camera/camera2/interop/Camera2CameraControl;->g(Landroidx/camera/camera2/interop/Camera2CameraControl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/camera2/interop/b;->b:Landroidx/camera/camera2/interop/Camera2CameraControl;

    invoke-static {v0, p1}, Landroidx/camera/camera2/interop/Camera2CameraControl;->a(Landroidx/camera/camera2/interop/Camera2CameraControl;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
