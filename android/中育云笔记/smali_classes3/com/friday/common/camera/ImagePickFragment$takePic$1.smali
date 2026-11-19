.class public final Lcom/friday/common/camera/ImagePickFragment$takePic$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageCapture$OnImageSavedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1;->a:Lcom/friday/common/camera/ImagePickFragment;

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
    .locals 9

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1;->a:Lcom/friday/common/camera/ImagePickFragment;

    .line 7
    .line 8
    :try_start_0
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v2, "getViewLifecycleOwner(...)"

    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v6, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-direct {v6, v0, p1, v1}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onError$1$1;-><init>(Lcom/friday/common/camera/ImagePickFragment;Landroidx/camera/core/ImageCaptureException;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    const/4 v7, 0x3

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    sget-object v0, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public onImageSaved(Landroidx/camera/core/ImageCapture$OutputFileResults;)V
    .locals 7

    .line 1
    const-string v0, "outputFileResults"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1;->a:Lcom/friday/common/camera/ImagePickFragment;

    .line 7
    .line 8
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const-string v0, "getViewLifecycleOwner(...)"

    .line 13
    .line 14
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v4, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1;->a:Lcom/friday/common/camera/ImagePickFragment;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {v4, p1, v0}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1;-><init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :catch_0
    move-exception v0

    .line 38
    move-object p1, v0

    .line 39
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 40
    .line 41
    .line 42
    return-void
.end method
