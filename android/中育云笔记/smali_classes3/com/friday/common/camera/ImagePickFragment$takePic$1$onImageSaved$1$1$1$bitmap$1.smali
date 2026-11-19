.class final Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.camera.ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1"
    f = "ImagePickFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/camera/CameraBean;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/CameraBean;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;->d:Lcom/friday/common/camera/CameraBean;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;->d:Lcom/friday/common/camera/CameraBean;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;-><init>(Lcom/friday/common/camera/CameraBean;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment$takePic$1$onImageSaved$1$1$1$bitmap$1;->d:Lcom/friday/common/camera/CameraBean;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/friday/common/camera/CameraBean;->i()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenWidth()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    mul-int/lit8 v0, v0, 0x2

    .line 22
    .line 23
    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getScreenHeight()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    mul-int/lit8 v1, v1, 0x2

    .line 28
    .line 29
    invoke-static {p1, v0, v1}, Lcom/blankj/utilcode/util/ImageUtils;->getBitmap(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 37
    .line 38
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p1
.end method
