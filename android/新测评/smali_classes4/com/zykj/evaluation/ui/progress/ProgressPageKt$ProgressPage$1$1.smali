.class final Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/progress/ProgressPageKt;->n(Ljava/util/List;Ljava/util/List;Lcom/zykj/evaluation/ui/progress/ProgressViewModel;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.zykj.evaluation.ui.progress.ProgressPageKt$ProgressPage$1$1"
    f = "ProgressPage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/progress/ProgressViewModel;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->b:Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->d:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance p1, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->b:Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->c:Ljava/util/List;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->d:Ljava/util/List;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;-><init>(Lcom/zykj/evaluation/ui/progress/ProgressViewModel;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->b:Lcom/zykj/evaluation/ui/progress/ProgressViewModel;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->c:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/evaluation/ui/progress/ProgressPageKt$ProgressPage$1$1;->d:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Lcom/zykj/evaluation/ui/progress/ProgressViewModel;->n(Ljava/util/List;Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1
.end method
