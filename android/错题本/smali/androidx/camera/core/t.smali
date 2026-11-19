.class public final synthetic Landroidx/camera/core/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/core/util/Consumer;

.field public final synthetic c:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Landroidx/core/util/Consumer;Landroid/view/Surface;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/camera/core/t;->a:I

    iput-object p1, p0, Landroidx/camera/core/t;->b:Landroidx/core/util/Consumer;

    iput-object p2, p0, Landroidx/camera/core/t;->c:Landroid/view/Surface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/camera/core/t;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/camera/core/t;->b:Landroidx/core/util/Consumer;

    iget-object v1, p0, Landroidx/camera/core/t;->c:Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/core/SurfaceRequest;->e(Landroidx/core/util/Consumer;Landroid/view/Surface;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/camera/core/t;->b:Landroidx/core/util/Consumer;

    iget-object v1, p0, Landroidx/camera/core/t;->c:Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/camera/core/SurfaceRequest;->f(Landroidx/core/util/Consumer;Landroid/view/Surface;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
