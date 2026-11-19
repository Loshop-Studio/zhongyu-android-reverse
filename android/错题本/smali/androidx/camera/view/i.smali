.class public final synthetic Landroidx/camera/view/i;
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
    iput p1, p0, Landroidx/camera/view/i;->a:I

    iput-object p2, p0, Landroidx/camera/view/i;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/view/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/view/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/view/i;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/CameraController;

    iget-object v1, p0, Landroidx/camera/view/i;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/CameraSelector;

    invoke-static {v0, v1}, Landroidx/camera/view/CameraController;->d(Landroidx/camera/view/CameraController;Landroidx/camera/core/CameraSelector;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/view/i;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewView$OnFrameUpdateListener;

    iget-object v1, p0, Landroidx/camera/view/i;->b:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/SurfaceTexture;

    invoke-static {v0, v1}, Landroidx/camera/view/TextureViewImplementation$1;->a(Landroidx/camera/view/PreviewView$OnFrameUpdateListener;Landroid/graphics/SurfaceTexture;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/view/i;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/TextureViewImplementation;

    iget-object v1, p0, Landroidx/camera/view/i;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    invoke-static {v0, v1}, Landroidx/camera/view/TextureViewImplementation;->c(Landroidx/camera/view/TextureViewImplementation;Landroidx/camera/core/SurfaceRequest;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/view/i;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewView$1;

    iget-object v1, p0, Landroidx/camera/view/i;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    invoke-static {v0, v1}, Landroidx/camera/view/PreviewView$1;->a(Landroidx/camera/view/PreviewView$1;Landroidx/camera/core/SurfaceRequest;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
