.class final Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImageCropFragment;->I(Landroid/graphics/Bitmap;ZLvc/c;)Ljava/lang/Object;
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
    c = "com.friday.common.camera.ImageCropFragment$optimizeCroppedBitmap$2"
    f = "ImageCropFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/camera/ImageCropFragment;

.field public final synthetic e:Landroid/graphics/Bitmap;

.field public final synthetic f:Z


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImageCropFragment;Landroid/graphics/Bitmap;ZLvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->d:Lcom/friday/common/camera/ImageCropFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->e:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->f:Z

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->d:Lcom/friday/common/camera/ImageCropFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->e:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-boolean v2, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->f:Z

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;-><init>(Lcom/friday/common/camera/ImageCropFragment;Landroid/graphics/Bitmap;ZLvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->d:Lcom/friday/common/camera/ImageCropFragment;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->e:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/friday/common/camera/ImageCropFragment$optimizeCroppedBitmap$2;->f:Z

    .line 16
    .line 17
    invoke-static {p1, v0, v1}, Lcom/friday/common/camera/ImageCropFragment;->B(Lcom/friday/common/camera/ImageCropFragment;Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method
