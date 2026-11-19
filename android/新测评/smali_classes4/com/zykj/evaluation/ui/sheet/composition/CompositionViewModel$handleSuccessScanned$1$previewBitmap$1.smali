.class final Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Landroid/graphics/Bitmap;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/Bitmap;",
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
    c = "com.zykj.evaluation.ui.sheet.composition.CompositionViewModel$handleSuccessScanned$1$previewBitmap$1"
    f = "CompositionViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCompositionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,171:1\n88#2:172\n37#3:173\n36#3,3:174\n*S KotlinDebug\n*F\n+ 1 CompositionViewModel.kt\ncom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1\n*L\n80#1:172\n81#1:173\n81#1:174,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

.field public final synthetic c:Lb7/c1;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lb7/c1;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->c:Lb7/c1;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->c:Lb7/c1;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;-><init>(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;Lb7/c1;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    const/16 p1, 0x3e8

    .line 12
    .line 13
    int-to-float v0, p1

    .line 14
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->b:Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;

    .line 15
    .line 16
    invoke-static {v1}, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;->a0(Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel;)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    mul-float/2addr v0, v1

    .line 21
    float-to-int v0, v0

    .line 22
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 23
    .line 24
    invoke-static {p1, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/composition/CompositionViewModel$handleSuccessScanned$1$previewBitmap$1;->c:Lb7/c1;

    .line 29
    .line 30
    invoke-virtual {v0}, Lb7/c1;->a()Landroid/graphics/Bitmap;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0}, Lb7/c1;->b()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v2, 0x0

    .line 39
    new-array v2, v2, [Landroid/graphics/Point;

    .line 40
    .line 41
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, [Landroid/graphics/Point;

    .line 46
    .line 47
    invoke-static {v1, v0, p1}, Lcom/zykj/camera/AnswerSheetNative;->nativeCutImage(Landroid/graphics/Bitmap;[Landroid/graphics/Point;Landroid/graphics/Bitmap;)I

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1
.end method
