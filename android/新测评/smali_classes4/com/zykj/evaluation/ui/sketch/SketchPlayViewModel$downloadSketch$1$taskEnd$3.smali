.class final Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1;->k(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;)V
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
    c = "com.zykj.evaluation.ui.sketch.SketchPlayViewModel$downloadSketch$1$taskEnd$3"
    f = "SketchPlayViewModel.kt"
    i = {}
    l = {
        0x55
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

.field public final synthetic c:Ljava/io/File;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Ljava/io/File;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->b:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->c:Ljava/io/File;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->b:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->c:Ljava/io/File;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;-><init>(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p1

    .line 25
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v1, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1;

    .line 33
    .line 34
    iget-object v4, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->c:Ljava/io/File;

    .line 35
    .line 36
    invoke-direct {v1, v4, v3}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3$file$1;-><init>(Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    .line 37
    .line 38
    .line 39
    iput v2, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->a:I

    .line 40
    .line 41
    invoke-static {p1, v1, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v0, :cond_2

    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_2
    :goto_0
    check-cast p1, Ljava/io/File;

    .line 49
    .line 50
    if-eqz p1, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->b:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;->s()Lc7/k;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v2, "getAbsolutePath(...)"

    .line 63
    .line 64
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p1}, Lc7/k;->a(Ljava/lang/String;)Lc7/k;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;->y(Lc7/k;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel$downloadSketch$1$taskEnd$3;->b:Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;

    .line 75
    .line 76
    const/4 v0, 0x3

    .line 77
    invoke-static {p1, v3, v3, v0, v3}, Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;->x(Lcom/zykj/evaluation/ui/sketch/SketchPlayViewModel;Ljava/lang/Float;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 82
    .line 83
    const-string v0, "\u5fae\u8bfe\u89e3\u538b\u5931\u8d25"

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lcom/zykj/base/utils/XToastUtils;->error(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 89
    .line 90
    return-object p1
.end method
