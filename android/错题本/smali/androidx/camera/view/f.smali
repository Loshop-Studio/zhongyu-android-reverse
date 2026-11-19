.class public final synthetic Landroidx/camera/view/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;
.implements Landroidx/camera/core/SurfaceRequest$TransformationInfoListener;
.implements Landroidx/camera/view/PreviewViewImplementation$OnSurfaceNotInUseListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/view/PreviewView$1;Landroidx/camera/view/PreviewStreamStateObserver;Landroidx/camera/core/impl/CameraInternal;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/view/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/view/f;->a:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/view/f;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-object p1, p0, Landroidx/camera/view/f;->a:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/camera/view/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/camera/view/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/view/f;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewStreamStateObserver;

    iget-object v1, p0, Landroidx/camera/view/f;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/CameraInfo;

    iget-object v2, p0, Landroidx/camera/view/f;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/view/PreviewStreamStateObserver;->a(Landroidx/camera/view/PreviewStreamStateObserver;Landroidx/camera/core/CameraInfo;Ljava/util/List;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onSurfaceNotInUse()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/view/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewView$1;

    iget-object v1, p0, Landroidx/camera/view/f;->a:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/view/PreviewStreamStateObserver;

    iget-object v2, p0, Landroidx/camera/view/f;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/core/impl/CameraInternal;

    invoke-static {v0, v1, v2}, Landroidx/camera/view/PreviewView$1;->b(Landroidx/camera/view/PreviewView$1;Landroidx/camera/view/PreviewStreamStateObserver;Landroidx/camera/core/impl/CameraInternal;)V

    return-void
.end method

.method public onTransformationInfoUpdate(Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/view/f;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewView$1;

    iget-object v1, p0, Landroidx/camera/view/f;->b:Ljava/lang/Object;

    check-cast v1, Landroidx/camera/core/impl/CameraInternal;

    iget-object v2, p0, Landroidx/camera/view/f;->c:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/core/SurfaceRequest;

    invoke-static {v0, v1, v2, p1}, Landroidx/camera/view/PreviewView$1;->c(Landroidx/camera/view/PreviewView$1;Landroidx/camera/core/impl/CameraInternal;Landroidx/camera/core/SurfaceRequest;Landroidx/camera/core/SurfaceRequest$TransformationInfo;)V

    return-void
.end method
