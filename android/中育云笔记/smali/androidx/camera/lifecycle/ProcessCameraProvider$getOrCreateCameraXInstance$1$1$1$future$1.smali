.class final Landroidx/camera/lifecycle/ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/lifecycle/ProcessCameraProvider;->getOrCreateCameraXInstance(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $cameraX:Landroidx/camera/core/CameraX;


# direct methods
.method public constructor <init>(Landroidx/camera/core/CameraX;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/lifecycle/ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1;->$cameraX:Landroidx/camera/core/CameraX;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Void;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object p1, p0, Landroidx/camera/lifecycle/ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1;->$cameraX:Landroidx/camera/core/CameraX;

    invoke-virtual {p1}, Landroidx/camera/core/CameraX;->getInitializeFuture()Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/lifecycle/ProcessCameraProvider$getOrCreateCameraXInstance$1$1$1$future$1;->invoke(Ljava/lang/Void;)Lcom/google/common/util/concurrent/ListenableFuture;

    move-result-object p1

    return-object p1
.end method
