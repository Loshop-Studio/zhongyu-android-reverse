.class public final synthetic Landroidx/camera/core/imagecapture/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/core/imagecapture/TakePictureManager;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/imagecapture/TakePictureManager;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/core/imagecapture/j;->a:I

    iput-object p1, p0, Landroidx/camera/core/imagecapture/j;->b:Landroidx/camera/core/imagecapture/TakePictureManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/imagecapture/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/imagecapture/j;->b:Landroidx/camera/core/imagecapture/TakePictureManager;

    invoke-virtual {v0}, Landroidx/camera/core/imagecapture/TakePictureManager;->issueNextRequest()V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/j;->b:Landroidx/camera/core/imagecapture/TakePictureManager;

    invoke-static {v0}, Landroidx/camera/core/imagecapture/TakePictureManager;->a(Landroidx/camera/core/imagecapture/TakePictureManager;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
