.class public final synthetic Landroidx/camera/core/processing/a;
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
    iput p1, p0, Landroidx/camera/core/processing/a;->a:I

    iput-object p2, p0, Landroidx/camera/core/processing/a;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/core/processing/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/processing/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/SurfaceProcessorWithExecutor;

    iget-object v1, p0, Landroidx/camera/core/processing/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceOutput;

    invoke-static {v0, v1}, Landroidx/camera/core/processing/SurfaceProcessorWithExecutor;->a(Landroidx/camera/core/processing/SurfaceProcessorWithExecutor;Landroidx/camera/core/SurfaceOutput;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/processing/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/SurfaceProcessorWithExecutor;

    iget-object v1, p0, Landroidx/camera/core/processing/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    invoke-static {v0, v1}, Landroidx/camera/core/processing/SurfaceProcessorWithExecutor;->b(Landroidx/camera/core/processing/SurfaceProcessorWithExecutor;Landroidx/camera/core/SurfaceRequest;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/camera/core/processing/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/DefaultSurfaceProcessor;

    iget-object v1, p0, Landroidx/camera/core/processing/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceOutput;

    invoke-static {v0, v1}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;->g(Landroidx/camera/core/processing/DefaultSurfaceProcessor;Landroidx/camera/core/SurfaceOutput;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/camera/core/processing/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/DefaultSurfaceProcessor;

    iget-object v1, p0, Landroidx/camera/core/processing/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/SurfaceRequest;

    invoke-static {v0, v1}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;->l(Landroidx/camera/core/processing/DefaultSurfaceProcessor;Landroidx/camera/core/SurfaceRequest;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Landroidx/camera/core/processing/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/SurfaceOutputImpl;

    iget-object v1, p0, Landroidx/camera/core/processing/a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v1}, Landroidx/camera/core/processing/SurfaceOutputImpl;->b(Landroidx/camera/core/processing/SurfaceOutputImpl;Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Landroidx/camera/core/processing/a;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/processing/DefaultSurfaceProcessor;

    iget-object v1, p0, Landroidx/camera/core/processing/a;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/processing/DefaultSurfaceProcessor$PendingSnapshot;

    invoke-static {v0, v1}, Landroidx/camera/core/processing/DefaultSurfaceProcessor;->a(Landroidx/camera/core/processing/DefaultSurfaceProcessor;Landroidx/camera/core/processing/DefaultSurfaceProcessor$PendingSnapshot;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
