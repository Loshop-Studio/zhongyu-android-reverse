.class final Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.image.ImageCropFragment$showCropDialog$2$1$1$1"
    f = "ImageCropFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/image/ImageCropFragment;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Lkotlin/jvm/internal/Ref$ObjectRef;


# direct methods
.method public constructor <init>(Lcom/zykj/image/ImageCropFragment;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->b:Lcom/zykj/image/ImageCropFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->c:Landroid/graphics/Bitmap;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->b:Lcom/zykj/image/ImageCropFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->c:Landroid/graphics/Bitmap;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;-><init>(Lcom/zykj/image/ImageCropFragment;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/Ref$ObjectRef;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->b:Lcom/zykj/image/ImageCropFragment;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->c:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 16
    .line 17
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Ljava/io/File;

    .line 20
    .line 21
    invoke-static {p1, v0, v1}, Lcom/zykj/image/ImageCropFragment;->access$saveToLocal(Lcom/zykj/image/ImageCropFragment;Landroid/graphics/Bitmap;Ljava/io/File;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/image/ImageCropFragment$showCropDialog$2$1$1$1;->d:Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 25
    .line 26
    iget-object p1, p1, Lkotlin/jvm/internal/Ref$ObjectRef;->a:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p1, Ljava/io/File;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string v0, "Bitmap\u4fdd\u5b58\u5230\u672c\u5730"

    .line 35
    .line 36
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Lw0/a;->a(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1
.end method
