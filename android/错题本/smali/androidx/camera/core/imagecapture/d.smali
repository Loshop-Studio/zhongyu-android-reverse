.class public final synthetic Landroidx/camera/core/imagecapture/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/core/imagecapture/d;->a:I

    iput-object p1, p0, Landroidx/camera/core/imagecapture/d;->c:Ljava/lang/Object;

    iput p2, p0, Landroidx/camera/core/imagecapture/d;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/imagecapture/d;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/imagecapture/d;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/TakePictureRequest;

    iget v1, p0, Landroidx/camera/core/imagecapture/d;->b:I

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/TakePictureRequest;->e(Landroidx/camera/core/imagecapture/TakePictureRequest;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/d;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/CaptureNode$1;

    iget v1, p0, Landroidx/camera/core/imagecapture/d;->b:I

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/CaptureNode$1;->b(Landroidx/camera/core/imagecapture/CaptureNode$1;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
