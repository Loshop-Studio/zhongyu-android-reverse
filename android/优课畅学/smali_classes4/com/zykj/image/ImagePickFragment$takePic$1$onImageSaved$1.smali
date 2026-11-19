.class final Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/image/ImagePickFragment$takePic$1;->onImageSaved(Landroidx/camera/core/ImageCapture$OutputFileResults;)V
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
    c = "com.zykj.image.ImagePickFragment$takePic$1$onImageSaved$1"
    f = "ImagePickFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Ljava/io/File;

.field public final synthetic c:Lcom/zykj/image/ImagePickFragment;


# direct methods
.method public constructor <init>(Ljava/io/File;Lcom/zykj/image/ImagePickFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->b:Ljava/io/File;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->c:Lcom/zykj/image/ImagePickFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->b:Ljava/io/File;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->c:Lcom/zykj/image/ImagePickFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;-><init>(Ljava/io/File;Lcom/zykj/image/ImagePickFragment;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object v1, Lj3/l;->a:Lj3/l$b;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->b:Ljava/io/File;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string p1, "file.absolutePath"

    .line 20
    .line 21
    invoke-static {v2, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->c:Lcom/zykj/image/ImagePickFragment;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/zykj/image/ImagePickFragment;->access$getArgs(Lcom/zykj/image/ImagePickFragment;)Lcom/zykj/image/ImagePickFragmentArgs;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Lcom/zykj/image/ImagePickFragmentArgs;->b()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    iget-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->c:Lcom/zykj/image/ImagePickFragment;

    .line 35
    .line 36
    invoke-static {p1}, Lcom/zykj/image/ImagePickFragment;->access$getArgs(Lcom/zykj/image/ImagePickFragment;)Lcom/zykj/image/ImagePickFragmentArgs;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/zykj/image/ImagePickFragmentArgs;->c()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->c:Lcom/zykj/image/ImagePickFragment;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/zykj/image/ImagePickFragment;->access$getArgs(Lcom/zykj/image/ImagePickFragment;)Lcom/zykj/image/ImagePickFragmentArgs;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Lcom/zykj/image/ImagePickFragmentArgs;->d()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    iget-object p1, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->c:Lcom/zykj/image/ImagePickFragment;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/zykj/image/ImagePickFragment;->access$getArgs(Lcom/zykj/image/ImagePickFragment;)Lcom/zykj/image/ImagePickFragmentArgs;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/zykj/image/ImagePickFragmentArgs;->a()Z

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-virtual/range {v1 .. v6}, Lj3/l$b;->a(Ljava/lang/String;ZIIZ)Landroidx/navigation/NavDirections;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object v0, p0, Lcom/zykj/image/ImagePickFragment$takePic$1$onImageSaved$1;->c:Lcom/zykj/image/ImagePickFragment;

    .line 69
    .line 70
    invoke-static {v0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 81
    .line 82
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 83
    .line 84
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method
