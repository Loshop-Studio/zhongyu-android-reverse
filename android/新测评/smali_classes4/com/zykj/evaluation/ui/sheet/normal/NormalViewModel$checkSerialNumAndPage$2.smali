.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->F0(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Ljava/lang/Integer;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
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
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$checkSerialNumAndPage$2"
    f = "NormalViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1441:1\n37#2:1442\n36#2,3:1443\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2\n*L\n966#1:1442\n966#1:1443,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Landroid/graphics/Bitmap;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic e:[Ljava/lang/String;

.field public final synthetic f:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Ljava/util/List;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;[Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->b:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput-object p4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->e:[Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->f:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->b:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->c:Ljava/util/List;

    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->e:[Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->f:Landroid/graphics/Bitmap;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;-><init>(Landroid/graphics/Bitmap;Ljava/util/List;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;[Ljava/lang/String;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->b:Landroid/graphics/Bitmap;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->c:Ljava/util/List;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    new-array v1, v1, [Landroid/graphics/Point;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, [Landroid/graphics/Point;

    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->d:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 25
    .line 26
    invoke-static {v1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->f0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->e:[Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$checkSerialNumAndPage$2;->f:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    invoke-static {p1, v0, v1, v2, v3}, Lcom/zykj/camera/AnswerSheetNative;->nativeGetAnswerSheetIds(Landroid/graphics/Bitmap;[Landroid/graphics/Point;Ljava/lang/String;[Ljava/lang/String;Landroid/graphics/Bitmap;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxInt(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1
.end method
