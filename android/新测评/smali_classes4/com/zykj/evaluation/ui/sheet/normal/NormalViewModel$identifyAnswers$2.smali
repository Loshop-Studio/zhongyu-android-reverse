.class final Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->P0(Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        "Lkotlin/Result<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "Lkotlin/Result;",
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
    c = "com.zykj.evaluation.ui.sheet.normal.NormalViewModel$identifyAnswers$2"
    f = "NormalViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNormalViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1441:1\n37#2:1442\n36#2,3:1443\n*S KotlinDebug\n*F\n+ 1 NormalViewModel.kt\ncom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2\n*L\n1014#1:1442\n1014#1:1443,3\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

.field public final synthetic c:Landroid/graphics/Bitmap;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->c:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->d:Ljava/util/List;

    iput-object p4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->e:Landroid/graphics/Bitmap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 6

    new-instance v0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->c:Landroid/graphics/Bitmap;

    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->e:Landroid/graphics/Bitmap;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;-><init>(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroid/graphics/Bitmap;Ljava/util/List;Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->b:Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->c:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->d:Ljava/util/List;

    .line 16
    .line 17
    iget-object v8, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel$identifyAnswers$2;->e:Landroid/graphics/Bitmap;

    .line 18
    .line 19
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->j0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    const/4 v2, 0x0

    .line 26
    const-string v4, "tfLiteBuffer"

    .line 27
    .line 28
    if-nez v1, :cond_0

    .line 29
    .line 30
    :try_start_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    move-object v1, v2

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p1, v0

    .line 37
    goto :goto_2

    .line 38
    :cond_0
    :goto_0
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->j0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)[B

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    if-nez v5, :cond_1

    .line 43
    .line 44
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v2, v5

    .line 49
    :goto_1
    array-length v2, v2

    .line 50
    int-to-long v4, v2

    .line 51
    const/4 v2, 0x0

    .line 52
    new-array v2, v2, [Landroid/graphics/Point;

    .line 53
    .line 54
    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, [Landroid/graphics/Point;

    .line 59
    .line 60
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->e0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lorg/json/JSONObject;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->v()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    invoke-static {p1}, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;->a0(Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;)Lx6/j;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lx6/j;->d()[Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    move-wide v9, v4

    .line 81
    move-object v4, v0

    .line 82
    move-object v0, v1

    .line 83
    move-object v5, v2

    .line 84
    move-wide v1, v9

    .line 85
    invoke-static/range {v0 .. v8}, Lcom/zykj/camera/AnswerSheetNative;->nativeScanAnswerSheetInChoice([BJLandroid/graphics/Bitmap;[Landroid/graphics/Point;Ljava/lang/String;I[Ljava/lang/String;Landroid/graphics/Bitmap;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    goto :goto_3

    .line 98
    :goto_2
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 99
    .line 100
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 116
    .line 117
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1
.end method
