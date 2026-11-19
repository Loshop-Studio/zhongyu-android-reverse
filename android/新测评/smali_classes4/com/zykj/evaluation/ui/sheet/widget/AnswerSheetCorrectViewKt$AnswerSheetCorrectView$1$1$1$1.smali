.class final Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt;->e(Landroidx/compose/ui/Modifier;Landroid/graphics/Bitmap;Ljava/util/List;Lb7/t0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lx6/j;",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;",
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
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lx6/j;",
        "pageQuestionAnswerData",
        "",
        "",
        "idList",
        "",
        "<anonymous>",
        "(Lx6/j;Ljava/util/Set;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.evaluation.ui.sheet.widget.AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1"
    f = "AnswerSheetCorrectView.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x23
    }
    m = "invokeSuspend"
    n = {
        "pageQuestionAnswerData",
        "idList"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;


# direct methods
.method public constructor <init>(Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->d:Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lx6/j;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->d:Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;

    .line 4
    .line 5
    invoke-direct {v0, v1, p3}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;-><init>(Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;Lkotlin/coroutines/Continuation;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, v0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->c:Ljava/lang/Object;

    .line 11
    .line 12
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx6/j;

    check-cast p2, Ljava/util/Set;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->a(Lx6/j;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx6/j;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget v3, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->a:I

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    if-eqz v3, :cond_1

    .line 17
    .line 18
    if-ne v3, v4, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->d:Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iput-object v3, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->b:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->c:Ljava/lang/Object;

    .line 48
    .line 49
    iput v4, p0, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetCorrectViewKt$AnswerSheetCorrectView$1$1$1$1;->a:I

    .line 50
    .line 51
    invoke-virtual {p1, v0, v1, p0}, Lcom/zykj/evaluation/ui/widget/AnswerSheetCorrectView;->p(Lx6/j;Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v2, :cond_2

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p1
.end method
