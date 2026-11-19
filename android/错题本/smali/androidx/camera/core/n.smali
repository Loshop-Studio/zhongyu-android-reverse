.class public final synthetic Landroidx/camera/core/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ForwardingImageProxy$OnImageCloseListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/core/ImageProxy;

.field public final synthetic c:Landroidx/camera/core/ImageProxy;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/core/n;->a:I

    iput-object p1, p0, Landroidx/camera/core/n;->b:Landroidx/camera/core/ImageProxy;

    iput-object p2, p0, Landroidx/camera/core/n;->c:Landroidx/camera/core/ImageProxy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onImageClose(Landroidx/camera/core/ImageProxy;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/n;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/n;->b:Landroidx/camera/core/ImageProxy;

    iget-object v1, p0, Landroidx/camera/core/n;->c:Landroidx/camera/core/ImageProxy;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/ImageProcessingUtil;->a(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/n;->b:Landroidx/camera/core/ImageProxy;

    iget-object v1, p0, Landroidx/camera/core/n;->c:Landroidx/camera/core/ImageProxy;

    invoke-static {v0, v1, p1}, Landroidx/camera/core/ImageProcessingUtil;->b(Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;Landroidx/camera/core/ImageProxy;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
