.class final Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->l(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.detail.showImage.ShowImagePageKt$TransparentCommentImage$2$1"
    f = "ShowImagePage.kt"
    i = {}
    l = {
        0x2b
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nShowImagePage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShowImagePage.kt\ncom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1\n+ 2 singletonImageLoaders.android.kt\ncoil3/SingletonImageLoaders_androidKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n17#2:111\n1#3:112\n*S KotlinDebug\n*F\n+ 1 ShowImagePage.kt\ncom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1\n*L\n43#1:111\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroidx/compose/runtime/MutableState;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->d:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->d:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;-><init>(Ljava/lang/String;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/compose/runtime/MutableState;

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->d:Landroidx/compose/runtime/MutableState;

    .line 32
    .line 33
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v3, "getApp(...)"

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v4, Ly/e$a;

    .line 47
    .line 48
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, v5}, Ly/e$a;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v4, v3}, Ly/e$a;->c(Ljava/lang/Object;)Ly/e$a;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ly/e$a;->a()Ly/e;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->a:Ljava/lang/Object;

    .line 69
    .line 70
    iput v2, p0, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt$TransparentCommentImage$2$1;->b:I

    .line 71
    .line 72
    invoke-interface {v1, v3, p0}, Lcoil3/e;->c(Ly/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-ne v1, v0, :cond_2

    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_2
    move-object v0, p1

    .line 80
    move-object p1, v1

    .line 81
    :goto_0
    check-cast p1, Ly/h;

    .line 82
    .line 83
    invoke-interface {p1}, Ly/h;->getImage()Lk/j;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const/4 v1, 0x0

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    const/4 v2, 0x3

    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-static {p1, v3, v3, v2, v1}, Lk/o;->g(Lk/j;IIILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    sget-object v2, Lg7/a;->a:Lg7/a;

    .line 99
    .line 100
    const/4 v4, 0x2

    .line 101
    invoke-static {v2, p1, v3, v4, v1}, Lg7/a;->d(Lg7/a;Landroid/graphics/Bitmap;IILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    :cond_3
    invoke-static {v0, v1}, Lcom/zykj/evaluation/ui/detail/showImage/ShowImagePageKt;->q(Landroidx/compose/runtime/MutableState;Landroid/graphics/Bitmap;)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p1
.end method
