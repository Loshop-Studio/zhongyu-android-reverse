.class public final synthetic Landroidx/camera/view/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/concurrent/futures/CallbackToFutureAdapter$Resolver;
.implements Landroidx/camera/view/RotationProvider$Listener;
.implements Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/camera/view/o;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public attachCompleter(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/view/o;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/TextureViewImplementation;

    invoke-static {v0, p1}, Landroidx/camera/view/TextureViewImplementation;->d(Landroidx/camera/view/TextureViewImplementation;Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public onRotationChanged(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/view/o;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/CameraController;

    invoke-static {v0, p1}, Landroidx/camera/view/CameraController;->b(Landroidx/camera/view/CameraController;I)V

    return-void
.end method

.method public onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/view/o;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/camera/view/PreviewView;

    invoke-static {v0, p1}, Landroidx/camera/view/PreviewView;->a(Landroidx/camera/view/PreviewView;Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    move-result p1

    return p1
.end method
