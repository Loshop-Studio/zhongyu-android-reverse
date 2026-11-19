.class public final synthetic Landroidx/camera/view/c;
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
    iput p2, p0, Landroidx/camera/view/c;->a:I

    iput-object p1, p0, Landroidx/camera/view/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/view/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/view/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/ImageCapture$ScreenFlashListener;

    invoke-interface {v0}, Landroidx/camera/core/ImageCapture$ScreenFlashListener;->onCompleted()V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/view/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;

    invoke-interface {v0}, Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;->onSurfaceNotInUse()V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/view/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/CameraController$2;

    invoke-static {v0}, Landroidx/camera/view/CameraController$2;->a(Landroidx/camera/view/CameraController$2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
