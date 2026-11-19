.class final Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->f0(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;)V
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
    c = "com.zykj.evaluation.ui.detail.BaseDetailViewModel$saveBitmapToAddMistake$1$1"
    f = "BaseDetailViewModel.kt"
    i = {
        0x0
    }
    l = {
        0x172
    }
    m = "invokeSuspend"
    n = {
        "path"
    }
    s = {
        "L$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

.field public final synthetic d:Landroid/graphics/Bitmap;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->c:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->d:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->e:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->c:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->d:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->e:Lkotlin/jvm/functions/Function1;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/lang/String;

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
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->c:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->K()Lg7/e;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->c:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;->Q()J

    .line 40
    .line 41
    .line 42
    move-result-wide v4

    .line 43
    const/4 v7, 0x2

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-static/range {v3 .. v8}, Lg7/e;->p(Lg7/e;JIILjava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v3, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->c:Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;

    .line 57
    .line 58
    iget-object v5, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->d:Landroid/graphics/Bitmap;

    .line 59
    .line 60
    const/4 v6, 0x0

    .line 61
    invoke-direct {v3, v4, v5, p1, v6}, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1$1;-><init>(Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Landroid/graphics/Bitmap;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 62
    .line 63
    .line 64
    iput-object p1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->a:Ljava/lang/Object;

    .line 65
    .line 66
    iput v2, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->b:I

    .line 67
    .line 68
    invoke-static {v1, v3, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    if-ne v1, v0, :cond_2

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    move-object v0, p1

    .line 76
    move-object p1, v1

    .line 77
    :goto_0
    iget-object v1, p0, Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel$saveBitmapToAddMistake$1$1;->e:Lkotlin/jvm/functions/Function1;

    .line 78
    .line 79
    check-cast p1, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    const-string p1, ""

    .line 92
    .line 93
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 97
    .line 98
    return-object p1
.end method
