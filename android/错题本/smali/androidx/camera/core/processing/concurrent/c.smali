.class public final synthetic Landroidx/camera/core/processing/concurrent/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p7, p0, Landroidx/camera/core/processing/concurrent/c;->a:I

    iput-object p1, p0, Landroidx/camera/core/processing/concurrent/c;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/core/processing/concurrent/c;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/core/processing/concurrent/c;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/camera/core/processing/concurrent/c;->e:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/camera/core/processing/concurrent/c;->f:Ljava/lang/Object;

    iput-object p6, p0, Landroidx/camera/core/processing/concurrent/c;->g:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/camera/core/processing/concurrent/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$BoardHead;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->d:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/zykj/sketch/core/record/RecordControl;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->f:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lr6/c;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->g:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lr6/c;

    invoke-static/range {v1 .. v6}, Lcom/zykj/sketch/core/record/RecordControl;->a(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;Lcom/zykj/sketch/core/record/RecordControl;Lr6/c;Lr6/c;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessorNode;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/camera/core/impl/CameraInternal;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->d:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/camera/core/impl/CameraInternal;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/camera/core/processing/SurfaceEdge;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->f:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/camera/core/processing/SurfaceEdge;

    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/c;->g:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    invoke-static/range {v1 .. v6}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessorNode;->b(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessorNode;Landroidx/camera/core/impl/CameraInternal;Landroidx/camera/core/impl/CameraInternal;Landroidx/camera/core/processing/SurfaceEdge;Landroidx/camera/core/processing/SurfaceEdge;Ljava/util/Map$Entry;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
