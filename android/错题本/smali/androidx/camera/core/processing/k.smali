.class public final synthetic Landroidx/camera/core/processing/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/camera/core/processing/k;->a:I

    iput-object p1, p0, Landroidx/camera/core/processing/k;->b:Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/k;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/processing/k;->b:Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;

    invoke-static {v0}, Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;->d(Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/processing/k;->b:Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;

    invoke-virtual {v0}, Landroidx/camera/core/impl/DeferrableSurface;->decrementUseCount()V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/processing/k;->b:Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;

    invoke-virtual {v0}, Landroidx/camera/core/processing/SurfaceEdge$SettableSurface;->close()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
