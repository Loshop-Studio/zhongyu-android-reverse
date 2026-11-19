.class public final synthetic Landroidx/camera/core/processing/concurrent/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/Consumer;


# instance fields
.field public final synthetic c:Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

.field public final synthetic d:Landroid/graphics/SurfaceTexture;

.field public final synthetic e:Landroid/view/Surface;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/processing/concurrent/i;->c:Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    iput-object p2, p0, Landroidx/camera/core/processing/concurrent/i;->d:Landroid/graphics/SurfaceTexture;

    iput-object p3, p0, Landroidx/camera/core/processing/concurrent/i;->e:Landroid/view/Surface;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/core/processing/concurrent/i;->c:Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;

    iget-object v1, p0, Landroidx/camera/core/processing/concurrent/i;->d:Landroid/graphics/SurfaceTexture;

    iget-object v2, p0, Landroidx/camera/core/processing/concurrent/i;->e:Landroid/view/Surface;

    check-cast p1, Landroidx/camera/core/SurfaceRequest$Result;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;->c(Landroidx/camera/core/processing/concurrent/DualSurfaceProcessor;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Landroidx/camera/core/SurfaceRequest$Result;)V

    return-void
.end method
