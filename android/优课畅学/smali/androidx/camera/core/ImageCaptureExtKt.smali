.class public final Landroidx/camera/core/ImageCaptureExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final getTakePictureRequest(Landroidx/camera/core/ImageCapture;)Landroidx/camera/core/imagecapture/TakePictureRequest;
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

.method public static final takePicture(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lx7/a;Lx7/l;Lx7/l;Lm7/c;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/ImageCapture;",
            "Landroidx/camera/core/ImageCapture$OutputFileOptions;",
            "Lx7/a;",
            "Lx7/l;",
            "Lx7/l;",
            "Lm7/c<",
            "-",
            "Landroidx/camera/core/ImageCapture$OutputFileResults;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 15
    invoke-interface {p5}, Lm7/c;->getContext()Lkotlin/coroutines/d;

    move-result-object v0

    .line 16
    sget-object v1, Lkotlin/coroutines/c;->b0:Lkotlin/coroutines/c$b;

    invoke-interface {v0, v1}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/CoroutineDispatcher;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/CoroutineDispatcher;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Li8/s0;->a(Lkotlinx/coroutines/CoroutineDispatcher;)Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_2

    .line 17
    :cond_1
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, "directExecutor()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    :cond_2
    new-instance v8, Lkotlinx/coroutines/c;

    invoke-static {p5}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lm7/c;)Lm7/c;

    move-result-object v1

    const/4 v3, 0x1

    invoke-direct {v8, v1, v3}, Lkotlinx/coroutines/c;-><init>(Lm7/c;I)V

    .line 19
    invoke-virtual {v8}, Lkotlinx/coroutines/c;->D()V

    .line 20
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 21
    new-instance v1, Landroidx/camera/core/DelegatingImageSavedCallback;

    .line 22
    new-instance v3, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v3 .. v8}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;-><init>(Lx7/a;Lx7/l;Lx7/l;Lkotlin/jvm/internal/Ref$ObjectRef;Li8/j;)V

    .line 23
    invoke-direct {v1, v3}, Landroidx/camera/core/DelegatingImageSavedCallback;-><init>(Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 24
    iput-object v1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 25
    new-instance p2, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$2;

    invoke-direct {p2, v7}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-interface {v8, p2}, Li8/j;->r(Lx7/l;)V

    .line 26
    iget-object p2, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    if-nez p2, :cond_3

    const-string p2, "delegatingCallback"

    invoke-static {p2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v2, p2

    check-cast v2, Landroidx/camera/core/DelegatingImageSavedCallback;

    :goto_1
    invoke-virtual {p0, p1, v0, v2}, Landroidx/camera/core/ImageCapture;->takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 27
    invoke-virtual {v8}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    move-result-object p0

    .line 28
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {p5}, Lo7/f;->c(Lm7/c;)V

    :cond_4
    return-object p0
.end method

.method public static final takePicture(Landroidx/camera/core/ImageCapture;Lx7/a;Lx7/l;Lx7/l;Lm7/c;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/ImageCapture;",
            "Lx7/a;",
            "Lx7/l;",
            "Lx7/l;",
            "Lm7/c<",
            "-",
            "Landroidx/camera/core/ImageProxy;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p4}, Lm7/c;->getContext()Lkotlin/coroutines/d;

    move-result-object v0

    .line 2
    sget-object v1, Lkotlin/coroutines/c;->b0:Lkotlin/coroutines/c$b;

    invoke-interface {v0, v1}, Lkotlin/coroutines/d;->get(Lkotlin/coroutines/d$c;)Lkotlin/coroutines/d$b;

    move-result-object v0

    instance-of v1, v0, Lkotlinx/coroutines/CoroutineDispatcher;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/CoroutineDispatcher;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Li8/s0;->a(Lkotlinx/coroutines/CoroutineDispatcher;)Ljava/util/concurrent/Executor;

    move-result-object v0

    if-nez v0, :cond_2

    .line 3
    :cond_1
    invoke-static {}, Landroidx/camera/core/impl/utils/executor/CameraXExecutors;->directExecutor()Ljava/util/concurrent/Executor;

    move-result-object v0

    const-string v1, "directExecutor()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    :cond_2
    new-instance v8, Lkotlinx/coroutines/c;

    invoke-static {p4}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lm7/c;)Lm7/c;

    move-result-object v1

    const/4 v3, 0x1

    invoke-direct {v8, v1, v3}, Lkotlinx/coroutines/c;-><init>(Lm7/c;I)V

    .line 5
    invoke-virtual {v8}, Lkotlinx/coroutines/c;->D()V

    .line 6
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 7
    new-instance v1, Landroidx/camera/core/DelegatingImageCapturedCallback;

    .line 8
    new-instance v3, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$1;

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v3 .. v8}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$1;-><init>(Lx7/a;Lx7/l;Lx7/l;Lkotlin/jvm/internal/Ref$ObjectRef;Li8/j;)V

    .line 9
    invoke-direct {v1, v3}, Landroidx/camera/core/DelegatingImageCapturedCallback;-><init>(Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    .line 10
    iput-object v1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 11
    new-instance p1, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$2;

    invoke-direct {p1, v7}, Landroidx/camera/core/ImageCaptureExtKt$takePicture$2$2;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-interface {v8, p1}, Li8/j;->r(Lx7/l;)V

    .line 12
    iget-object p1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    if-nez p1, :cond_3

    const-string p1, "delegatingCallback"

    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    move-object v2, p1

    check-cast v2, Landroidx/camera/core/DelegatingImageCapturedCallback;

    :goto_1
    invoke-virtual {p0, v0, v2}, Landroidx/camera/core/ImageCapture;->takePicture(Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageCapturedCallback;)V

    .line 13
    invoke-virtual {v8}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    move-result-object p0

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    invoke-static {p4}, Lo7/f;->c(Lm7/c;)V

    :cond_4
    return-object p0
.end method

.method public static synthetic takePicture$default(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lx7/a;Lx7/l;Lx7/l;Lm7/c;ILjava/lang/Object;)Ljava/lang/Object;
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
    invoke-static/range {p0 .. p5}, Landroidx/camera/core/ImageCaptureExtKt;->takePicture(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lx7/a;Lx7/l;Lx7/l;Lm7/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic takePicture$default(Landroidx/camera/core/ImageCapture;Lx7/a;Lx7/l;Lx7/l;Lm7/c;ILjava/lang/Object;)Ljava/lang/Object;
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
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/camera/core/ImageCaptureExtKt;->takePicture(Landroidx/camera/core/ImageCapture;Lx7/a;Lx7/l;Lx7/l;Lm7/c;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
