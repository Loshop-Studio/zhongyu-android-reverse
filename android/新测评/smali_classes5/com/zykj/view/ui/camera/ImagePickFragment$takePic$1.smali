.class public final Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageCapture$OnImageSavedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment;->v()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/zykj/view/ui/camera/ImagePickFragment$takePic$1",
        "Landroidx/camera/core/ImageCapture$OnImageSavedCallback;",
        "onImageSaved",
        "",
        "outputFileResults",
        "Landroidx/camera/core/ImageCapture$OutputFileResults;",
        "onError",
        "exception",
        "Landroidx/camera/core/ImageCaptureException;",
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
.field public final synthetic a:Lcom/zykj/view/ui/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->a:Lcom/zykj/view/ui/camera/ImagePickFragment;

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
    .locals 8

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->a:Lcom/zykj/view/ui/camera/ImagePickFragment;

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v5, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->a:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v5, v0, p1, v1}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public onImageSaved(Landroidx/camera/core/ImageCapture$OutputFileResults;)V
    .locals 8

    .line 1
    const-string v0, "outputFileResults"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->a:Lcom/zykj/view/ui/camera/ImagePickFragment;

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getMain()Lkotlinx/coroutines/MainCoroutineDispatcher;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v5, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;->a:Lcom/zykj/view/ui/camera/ImagePickFragment;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v5, v0, p1, v1}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCapture$OutputFileResults;Lkotlin/coroutines/Continuation;)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 37
    .line 38
    .line 39
    return-void
.end method
