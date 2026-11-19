.class public final Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageCapture$OnImageSavedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment;->takePic()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/zykj/view/ui/camera/ImagePickFragment$takePic$1",
        "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;",
        "Landroidx/camera/core/ImageCapture$OutputFileResults;",
        "outputFileResults",
        "Ld6/s;",
        "onImageSaved",
        "(Landroidx/camera/core/ImageCapture$OutputFileResults;)V",
        "Landroidx/camera/core/ImageCaptureException;",
        "exception",
        "onError",
        "(Landroidx/camera/core/ImageCaptureException;)V",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onError(Landroidx/camera/core/ImageCaptureException;)V
    .locals 5

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getViewLifecycleOwner(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 22
    .line 23
    sget-object v1, Le7/k;->a:Ld7/d;

    .line 24
    .line 25
    new-instance v2, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v2, v3, p1, v4}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lh6/c;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x2

    .line 34
    invoke-static {v0, v1, v4, v2, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onImageSaved(Landroidx/camera/core/ImageCapture$OutputFileResults;)V
    .locals 5

    .line 1
    const-string v0, "outputFileResults"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "getViewLifecycleOwner(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v1, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 22
    .line 23
    sget-object v1, Le7/k;->a:Ld7/d;

    .line 24
    .line 25
    new-instance v2, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;

    .line 26
    .line 27
    iget-object v3, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->this$0:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    invoke-direct {v2, v3, p1, v4}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCapture$OutputFileResults;Lh6/c;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x2

    .line 34
    invoke-static {v0, v1, v4, v2, p1}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 35
    .line 36
    .line 37
    return-void
.end method
