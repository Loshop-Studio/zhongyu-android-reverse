.class public final Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/ImageCapture$OnImageSavedCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/ImageCaptureExtKt;->takePicture(Landroidx/camera/core/ImageCapture;Landroidx/camera/core/ImageCapture$OutputFileOptions;Lhd/a;Lhd/l;Lhd/l;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $continuation:Lsd/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/j;"
        }
    .end annotation
.end field

.field final synthetic $delegatingCallback:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/camera/core/DelegatingImageSavedCallback;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onCaptureProcessProgressed:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onCaptureStarted:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $onPostviewBitmapAvailable:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/a;Lhd/l;Lhd/l;Lkotlin/jvm/internal/Ref$ObjectRef;Lsd/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/a;",
            "Lhd/l;",
            "Lhd/l;",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/camera/core/DelegatingImageSavedCallback;",
            ">;",
            "Lsd/j;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$onCaptureStarted:Lhd/a;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$onCaptureProcessProgressed:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$onPostviewBitmapAvailable:Lhd/l;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$delegatingCallback:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$continuation:Lsd/j;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public onCaptureProcessProgressed(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$onCaptureProcessProgressed:Lhd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public onCaptureStarted()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$onCaptureStarted:Lhd/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onError(Landroidx/camera/core/ImageCaptureException;)V
    .locals 2

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$delegatingCallback:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 7
    .line 8
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "delegatingCallback"

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    check-cast v0, Landroidx/camera/core/DelegatingImageSavedCallback;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Landroidx/camera/core/DelegatingImageSavedCallback;->dispose()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$continuation:Lsd/j;

    .line 25
    .line 26
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v0, p1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public onImageSaved(Landroidx/camera/core/ImageCapture$OutputFileResults;)V
    .locals 1

    .line 1
    const-string v0, "outputFileResults"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$delegatingCallback:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 7
    .line 8
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-string v0, "delegatingCallback"

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    check-cast v0, Landroidx/camera/core/DelegatingImageSavedCallback;

    .line 20
    .line 21
    :goto_0
    invoke-virtual {v0}, Landroidx/camera/core/DelegatingImageSavedCallback;->dispose()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$continuation:Lsd/j;

    .line 25
    .line 26
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {v0, p1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onPostviewBitmapAvailable(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/camera/core/ImageCaptureExtKt$takePicture$4$1;->$onPostviewBitmapAvailable:Lhd/l;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
