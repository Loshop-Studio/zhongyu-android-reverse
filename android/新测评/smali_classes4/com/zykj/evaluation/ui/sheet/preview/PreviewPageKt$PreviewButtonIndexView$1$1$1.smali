.class final Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.evaluation.ui.sheet.preview.PreviewPageKt$PreviewButtonIndexView$1$1$1"
    f = "PreviewPage.kt"
    i = {}
    l = {
        0x144
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPreviewPage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewPage.kt\ncom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,364:1\n360#2,7:365\n*S KotlinDebug\n*F\n+ 1 PreviewPage.kt\ncom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1\n*L\n324#1:365,7\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Landroidx/compose/foundation/ScrollState;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/ScrollState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->b:Landroidx/compose/foundation/ScrollState;

    iput-object p2, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->c:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance p1, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;

    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->b:Landroidx/compose/foundation/ScrollState;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->c:Ljava/util/List;

    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;-><init>(Landroidx/compose/foundation/ScrollState;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->a:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->b:Landroidx/compose/foundation/ScrollState;

    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->c:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const/4 v3, 0x0

    .line 36
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Lv6/z;

    .line 47
    .line 48
    invoke-virtual {v4}, Lv6/z;->d()Lcom/zykj/evaluation/ui/sheet/c;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    instance-of v4, v4, Lcom/zykj/evaluation/ui/sheet/c$a;

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    const/4 v3, -0x1

    .line 61
    :goto_1
    iput v2, p0, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt$PreviewButtonIndexView$1$1$1;->a:I

    .line 62
    .line 63
    invoke-virtual {p1, v3, p0}, Landroidx/compose/foundation/ScrollState;->scrollTo(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    if-ne p1, v0, :cond_4

    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p1
.end method
