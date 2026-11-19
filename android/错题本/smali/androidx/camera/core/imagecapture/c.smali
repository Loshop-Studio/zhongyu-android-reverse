.class public final synthetic Landroidx/camera/core/imagecapture/c;
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
    iput p2, p0, Landroidx/camera/core/imagecapture/c;->a:I

    iput-object p1, p0, Landroidx/camera/core/imagecapture/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/imagecapture/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/imagecapture/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/imagecapture/CaptureNode$1;

    invoke-static {v0}, Landroidx/camera/core/imagecapture/CaptureNode$1;->a(Landroidx/camera/core/imagecapture/CaptureNode$1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/SafeCloseImageReaderProxy;

    invoke-static {v0}, Landroidx/camera/core/imagecapture/CaptureNode;->e(Landroidx/camera/core/SafeCloseImageReaderProxy;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/imagecapture/c;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/SafeCloseImageReaderProxy;

    invoke-static {v0}, Landroidx/camera/core/imagecapture/CaptureNode;->c(Landroidx/camera/core/SafeCloseImageReaderProxy;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
