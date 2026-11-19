.class public final synthetic Landroidx/camera/core/imagecapture/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/core/imagecapture/ProcessingNode;

.field public final synthetic c:Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/imagecapture/ProcessingNode;Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/core/imagecapture/f;->a:I

    iput-object p1, p0, Landroidx/camera/core/imagecapture/f;->b:Landroidx/camera/core/imagecapture/ProcessingNode;

    iput-object p2, p0, Landroidx/camera/core/imagecapture/f;->c:Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/imagecapture/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/imagecapture/f;->b:Landroidx/camera/core/imagecapture/ProcessingNode;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/f;->c:Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/ProcessingNode;->h(Landroidx/camera/core/imagecapture/ProcessingNode;Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/imagecapture/f;->b:Landroidx/camera/core/imagecapture/ProcessingNode;

    iget-object v1, p0, Landroidx/camera/core/imagecapture/f;->c:Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;

    invoke-static {v0, v1}, Landroidx/camera/core/imagecapture/ProcessingNode;->e(Landroidx/camera/core/imagecapture/ProcessingNode;Landroidx/camera/core/imagecapture/ProcessingNode$InputPacket;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
