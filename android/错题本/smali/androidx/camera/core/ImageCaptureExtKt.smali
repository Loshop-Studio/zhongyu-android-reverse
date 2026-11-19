.class public final Landroidx/camera/core/ImageCaptureExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aV\u0010\n\u001a\u00020\t*\u00020\u00002\u0010\u0008\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\u0008\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a^\u0010\n\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\r\u001a\u00020\u000c2\u0010\u0008\u0002\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0016\u0008\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\u0008\u0002\u0010\u0008\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0086@\u00a2\u0006\u0004\u0008\n\u0010\u000f\u001a\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Landroidx/camera/core/ImageCapture;",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "onCaptureStarted",
        "Lkotlin/Function1;",
        "",
        "onCaptureProcessProgressed",
        "Landroid/graphics/Bitmap;",
        "onPostviewBitmapAvailable",
        "Landroidx/camera/core/ImageProxy;",
        "takePicture",
        "(Landroidx/camera/core/ImageCapture;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;",
        "Landroidx/camera/core/ImageCapture$OutputFileOptions;",
        "outputFileOptions",
        "Landroidx/camera/core/ImageCapture$OutputFileResults;",
        "(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;",
        "Landroidx/camera/core/imagecapture/TakePictureRequest;",
        "getTakePictureRequest",
        "(Landroidx/camera/core/ImageCapture;)Landroidx/camera/core/imagecapture/TakePictureRequest;",
        "camera-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nImageCaptureExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,203:1\n329#2:204\n329#2:216\n314#3,11:205\n314#3,11:217\n*S KotlinDebug\n*F\n+ 1 ImageCaptureExt.kt\nandroidx/camera/core/ImageCaptureExtKt\n*L\n50#1:204\n102#1:216\n52#1:205,11\n104#1:217,11\n*E\n"
    }
.end annotation


# direct methods
.method public static final getTakePictureRequest(Landroidx/camera/core/ImageCapture;)Landroidx/camera/core/imagecapture/TakePictureRequest;
    .locals 1
    .param p0    # Landroidx/camera/core/ImageCapture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/camera/core/ImageCapture;->getTakePictureManager()Landroidx/camera/core/imagecapture/TakePictureManager;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/TakePictureManager;->getCapturingRequest()Landroidx/camera/core/imagecapture/RequestWithCallback;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/camera/core/imagecapture/RequestWithCallback;->getTakePictureRequest()Landroidx/camera/core/imagecapture/TakePictureRequest;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return-object p0
.end method

.method public static final takePicture(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;
    .locals 9
    .param p0    # Landroidx/camera/core/ImageCapture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/camera/core/ImageCapture$OutputFileOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/ImageCapture;",
            "Landroidx/camera/core/ImageCapture$OutputFileOptions;",
            "Lr6/a;",
            "Lr6/c;",
            "Lr6/c;",
            "Lh6/c<",
            "-",
            "Landroidx/camera/core/ImageCapture$OutputFileResults;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 17
    invoke-interface {p5}, Lh6/c;->getContext()Lh6/h;

    move-result-object v0

    .line 18
    sget-object v1, Lh6/d;->a:Lh6/d;

    invoke-interface {v0, v1}, Lh6/h;->get(Lh6/g;)Lh6/f;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/r;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    .line 19
    instance-of v1, v0, Lkotlinx/coroutines/p0;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/p0;

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lkotlinx/coroutines/p0;->d()Ljava/util/concurrent/Executor;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_2
    new-instance v1, Lretrofit2/a;

    invoke-direct {v1, v0}, Lretrofit2/a;-><init>(Lkotlinx/coroutines/r;)V

    goto :goto_2

    .line 20
    :cond_3
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    const-string v0, "directExecutor()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    :cond_4
    :goto_2
    new-instance v8, Lkotlinx/coroutines/g;

    invoke-static {p5}, Lv7/l;->n(Lh6/c;)Lh6/c;

    move-result-object p5

    const/4 v0, 0x1

    invoke-direct {v8, v0, p5}, Lkotlinx/coroutines/g;-><init>(ILh6/c;)V

    .line 22
    invoke-virtual {v8}, Lkotlinx/coroutines/g;->u()V

    .line 23
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 24
    new-instance p5, Landroidx/camera/core/DelegatingImageSavedCallback;

    .line 25
    new-instance v3, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v3 .. v8}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;-><init>(Lr6/a;Lr6/c;Lr6/c;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/f;)V

    .line 26
    invoke-direct {p5, v3}, Landroidx/camera/core/DelegatingImageSavedCallback;-><init>(Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 27
    iput-object p5, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 28
    new-instance p2, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$2;

    invoke-direct {p2, v7}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v8, p2}, Lkotlinx/coroutines/g;->m(Lr6/c;)V

    .line 29
    iget-object p2, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz p2, :cond_5

    check-cast p2, Landroidx/camera/core/DelegatingImageSavedCallback;

    invoke-virtual {p0, p1, v1, p2}, Landroidx/camera/core/ImageCapture;->takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 30
    invoke-virtual {v8}, Lkotlinx/coroutines/g;->t()Ljava/lang/Object;

    move-result-object p0

    .line 31
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    return-object p0

    .line 32
    :cond_5
    const-string p0, "delegatingCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    throw v2
.end method

.method public static final takePicture(Landroidx/camera/core/ImageCapture;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;
    .locals 9
    .param p0    # Landroidx/camera/core/ImageCapture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lh6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/ImageCapture;",
            "Lr6/a;",
            "Lr6/c;",
            "Lr6/c;",
            "Lh6/c<",
            "-",
            "Landroidx/camera/core/ImageProxy;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-interface {p4}, Lh6/c;->getContext()Lh6/h;

    move-result-object v0

    .line 2
    sget-object v1, Lh6/d;->a:Lh6/d;

    invoke-interface {v0, v1}, Lh6/h;->get(Lh6/g;)Lh6/f;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/r;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_3

    .line 3
    instance-of v1, v0, Lkotlinx/coroutines/p0;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lkotlinx/coroutines/p0;

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lkotlinx/coroutines/p0;->d()Ljava/util/concurrent/Executor;

    move-result-object v1

    if-nez v1, :cond_4

    :cond_2
    new-instance v1, Lretrofit2/a;

    invoke-direct {v1, v0}, Lretrofit2/a;-><init>(Lkotlinx/coroutines/r;)V

    goto :goto_2

    .line 4
    :cond_3
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v1

    const-string v0, "directExecutor()"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    :cond_4
    :goto_2
    new-instance v8, Lkotlinx/coroutines/g;

    invoke-static {p4}, Lv7/l;->n(Lh6/c;)Lh6/c;

    move-result-object p4

    const/4 v0, 0x1

    invoke-direct {v8, v0, p4}, Lkotlinx/coroutines/g;-><init>(ILh6/c;)V

    .line 6
    invoke-virtual {v8}, Lkotlinx/coroutines/g;->u()V

    .line 7
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 8
    new-instance p4, Landroidx/camera/core/DelegatingImageCapturedCallback;

    .line 9
    new-instance v3, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$1;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$1;-><init>(Lr6/a;Lr6/c;Lr6/c;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlinx/coroutines/f;)V

    .line 10
    invoke-direct {p4, v3}, Landroidx/camera/core/DelegatingImageCapturedCallback;-><init>(Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    .line 11
    iput-object p4, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 12
    new-instance p1, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$2;

    invoke-direct {p1, v7}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v8, p1}, Lkotlinx/coroutines/g;->m(Lr6/c;)V

    .line 13
    iget-object p1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz p1, :cond_5

    check-cast p1, Landroidx/camera/core/DelegatingImageCapturedCallback;

    invoke-virtual {p0, v1, p1}, Landroidx/camera/core/ImageCapture;->takePicture(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    .line 14
    invoke-virtual {v8}, Lkotlinx/coroutines/g;->t()Ljava/lang/Object;

    move-result-object p0

    .line 15
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    return-object p0

    .line 16
    :cond_5
    const-string p0, "delegatingCallback"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    throw v2
.end method

.method public static synthetic takePicture$default(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lr6/a;Lr6/c;Lr6/c;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p4, v0

    .line 2
    :cond_2
    invoke-static/range {p0 .. p5}, Landroidx/camera/core/ImageCaptureExtKt;->takePicture(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic takePicture$default(Landroidx/camera/core/ImageCapture;Lr6/a;Lr6/c;Lr6/c;Lh6/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    move-object p3, v0

    .line 1
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/camera/core/ImageCaptureExtKt;->takePicture(Landroidx/camera/core/ImageCapture;Lr6/a;Lr6/c;Lr6/c;Lh6/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
