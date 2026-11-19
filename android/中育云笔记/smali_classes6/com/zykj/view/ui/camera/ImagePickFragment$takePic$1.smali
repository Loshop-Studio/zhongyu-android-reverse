.class public final Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageCapture$OnImageSavedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/ui/camera/ImagePickFragment;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

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
    invoke-direct {v5, v0, p1, v1}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onError$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

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
    invoke-direct {v5, v0, p1, v1}, Lcom/zykj/view/ui/camera/ImagePickFragment$takePic$1$onImageSaved$1;-><init>(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroidx/camera/core/ImageCapture$OutputFileResults;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    const/4 v6, 0x2

    .line 34
    const/4 v7, 0x0

    .line 35
    const/4 v4, 0x0

    .line 36
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 37
    .line 38
    .line 39
    return-void
.end method
