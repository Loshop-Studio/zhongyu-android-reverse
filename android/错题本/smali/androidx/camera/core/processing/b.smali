.class public final synthetic Landroidx/camera/core/processing/b;
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
    iput p2, p0, Landroidx/camera/core/processing/b;->a:I

    iput-object p1, p0, Landroidx/camera/core/processing/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/processing/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/SurfaceProcessorNode;

    invoke-static {v0}, Landroidx/camera/core/processing/SurfaceProcessorNode;->c(Landroidx/camera/core/processing/SurfaceProcessorNode;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/processing/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/SurfaceOutput;

    invoke-interface {v0}, Landroidx/camera/core/SurfaceOutput;->close()V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/processing/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;

    invoke-static {v0}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;->k(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/core/processing/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/DefaultSurfaceProcessor;

    invoke-static {v0}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;->c(Landroidx/camera/core/processing/DefaultSurfaceProcessor;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/core/processing/b;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/SurfaceRequest;

    invoke-virtual {v0}, Landroidx/camera/core/SurfaceRequest;->willNotProvideSurface()Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
