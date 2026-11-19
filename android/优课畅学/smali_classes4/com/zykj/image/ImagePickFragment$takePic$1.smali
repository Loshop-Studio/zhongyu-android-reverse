.class public final Lcom/zykj/image/ImagePickFragment$takePic$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageCapture$OnImageSavedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/image/ImagePickFragment;->takePic()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/image/ImagePickFragment;

.field public final synthetic b:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/zykj/image/ImagePickFragment;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1;->a:Lcom/zykj/image/ImagePickFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/image/ImagePickFragment$takePic$1;->b:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onError(Landroidx/camera/core/ImageCaptureException;)V
    .locals 3

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/image/ImagePickFragment$takePic$1;->a:Lcom/zykj/image/ImagePickFragment;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lcom/zykj/image/ImagePickFragment$takePic$1$onError$1;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p1, v2}, Lcom/zykj/image/ImagePickFragment$takePic$1$onError$1;-><init>(Landroidx/camera/core/ImageCaptureException;Lm7/c;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onImageSaved(Landroidx/camera/core/ImageCapture$OutputFileResults;)V
    .locals 4

    .line 1
    const-string v0, "outputFileResults"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1;->a:Lcom/zykj/image/ImagePickFragment;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-instance v0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1;->b:Ljava/io/File;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/zykj/image/ImagePickFragment$takePic$1;->a:Lcom/zykj/image/ImagePickFragment;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;-><init>(Ljava/io/File;Lcom/zykj/image/ImagePickFragment;Lm7/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 23
    .line 24
    .line 25
    return-void
.end method
