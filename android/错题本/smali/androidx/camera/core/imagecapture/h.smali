.class public final synthetic Landroidx/camera/core/imagecapture/h;
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
    iput p1, p0, Landroidx/camera/core/imagecapture/h;->a:I

    iput-object p2, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/imagecapture/h;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/TakePictureRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/ImageCaptureException;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/TakePictureRequest;->a(Landroidx/camera/core/imagecapture/TakePictureRequest;Landroidx/camera/core/ImageCaptureException;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/TakePictureRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/ImageCapture$OutputFileResults;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/TakePictureRequest;->b(Landroidx/camera/core/imagecapture/TakePictureRequest;Landroidx/camera/core/ImageCapture$OutputFileResults;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/TakePictureRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/TakePictureRequest;->d(Landroidx/camera/core/imagecapture/TakePictureRequest;Landroid/graphics/Bitmap;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/TakePictureRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/ImageProxy;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/TakePictureRequest;->c(Landroidx/camera/core/imagecapture/TakePictureRequest;Landroidx/camera/core/ImageProxy;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/TakePictureManager;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/imagecapture/RequestWithCallback;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/TakePictureManager;->b(Landroidx/camera/core/imagecapture/TakePictureManager;Landroidx/camera/core/imagecapture/RequestWithCallback;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/ProcessingRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/ProcessingNode;->f(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroid/graphics/Bitmap;)V

    return-void

    :pswitch_5
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/ProcessingRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/ImageCapture$OutputFileResults;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/ProcessingNode;->a(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroidx/camera/core/ImageCapture$OutputFileResults;)V

    return-void

    :pswitch_6
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/ProcessingRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/ImageProxy;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/ProcessingNode;->c(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroidx/camera/core/ImageProxy;)V

    return-void

    :pswitch_7
    iget-object v0, p0, Landroidx/camera/core/imagecapture/h;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/ProcessingRequest;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/h;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/ImageCaptureException;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/ProcessingNode;->g(Landroidx/camera/core/imagecapture/ProcessingRequest;Landroidx/camera/core/ImageCaptureException;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
