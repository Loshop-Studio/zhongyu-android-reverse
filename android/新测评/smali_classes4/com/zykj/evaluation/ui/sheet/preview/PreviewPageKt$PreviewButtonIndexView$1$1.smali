.class final Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->r(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.zykj.evaluation.ui.sheet.preview.PreviewPageKt$PreviewButtonIndexView$1$1"
    f = "PreviewPage.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroidx/compose/foundation/ScrollState;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/ScrollState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->c:Landroidx/compose/foundation/ScrollState;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->d:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    new-instance v0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->c:Landroidx/compose/foundation/ScrollState;

    iget-object v2, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->d:Ljava/util/List;

    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;-><init>(Landroidx/compose/foundation/ScrollState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lkotlinx/coroutines/CoroutineScope;

    .line 5
    .line 6
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->a:I

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance v4, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->c:Landroidx/compose/foundation/ScrollState;

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->d:Ljava/util/List;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v4, p1, v0, v2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;-><init>(Landroidx/compose/foundation/ScrollState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 30
    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p1
.end method
