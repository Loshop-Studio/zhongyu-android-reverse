.class public final synthetic Landroidx/camera/core/imagecapture/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/ImageReaderProxy$OnImageAvailableListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/core/imagecapture/CaptureNode;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/imagecapture/CaptureNode;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/core/imagecapture/b;->a:I

    iput-object p1, p0, Landroidx/camera/core/imagecapture/b;->b:Landroidx/camera/core/imagecapture/CaptureNode;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onImageAvailable(Landroidx/camera/core/impl/ImageReaderProxy;)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/imagecapture/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/imagecapture/b;->b:Landroidx/camera/core/imagecapture/CaptureNode;

    invoke-static {v0, p1}, Landroidx/camera/core/imagecapture/CaptureNode;->b(Landroidx/camera/core/imagecapture/CaptureNode;Landroidx/camera/core/impl/ImageReaderProxy;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/b;->b:Landroidx/camera/core/imagecapture/CaptureNode;

    invoke-static {v0, p1}, Landroidx/camera/core/imagecapture/CaptureNode;->d(Landroidx/camera/core/imagecapture/CaptureNode;Landroidx/camera/core/impl/ImageReaderProxy;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
