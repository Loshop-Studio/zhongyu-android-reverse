.class public final synthetic Landroidx/camera/view/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroidx/camera/view/TextureViewImplementation;

.field public final synthetic b:Landroid/view/Surface;

.field public final synthetic c:Le1/a;

.field public final synthetic d:Landroidx/camera/core/SurfaceRequest;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/TextureViewImplementation;Landroid/view/Surface;Le1/a;Landroidx/camera/core/SurfaceRequest;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/p;->a:Landroidx/camera/view/TextureViewImplementation;

    iput-object p2, p0, Landroidx/camera/view/p;->b:Landroid/view/Surface;

    iput-object p3, p0, Landroidx/camera/view/p;->c:Le1/a;

    iput-object p4, p0, Landroidx/camera/view/p;->d:Landroidx/camera/core/SurfaceRequest;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/view/p;->c:Le1/a;

    iget-object v1, p0, Landroidx/camera/view/p;->d:Landroidx/camera/core/SurfaceRequest;

    iget-object v2, p0, Landroidx/camera/view/p;->a:Landroidx/camera/view/TextureViewImplementation;

    iget-object v3, p0, Landroidx/camera/view/p;->b:Landroid/view/Surface;

    invoke-static {v2, v3, v0, v1}, Landroidx/camera/view/TextureViewImplementation;->b(Landroidx/camera/view/TextureViewImplementation;Landroid/view/Surface;Le1/a;Landroidx/camera/core/SurfaceRequest;)V

    return-void
.end method
