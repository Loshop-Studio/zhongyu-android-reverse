.class final Lcom/zykj/view/widget/SketchProgressView$showView$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/widget/SketchProgressView;->n()V
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
    c = "com.zykj.view.widget.SketchProgressView$showView$1"
    f = "SketchProgressView.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x15a
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "a"
    }
    s = {
        "L$0",
        "I$0"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/view/widget/SketchProgressView;


# direct methods
.method public constructor <init>(Lcom/zykj/view/widget/SketchProgressView;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->d:Lcom/zykj/view/widget/SketchProgressView;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/widget/SketchProgressView;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->c(Lcom/zykj/view/widget/SketchProgressView;)V

    return-void
.end method

.method private static final c(Lcom/zykj/view/widget/SketchProgressView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/view/widget/SketchProgressView$showView$1;

    iget-object v1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->d:Lcom/zykj/view/widget/SketchProgressView;

    invoke-direct {v0, v1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;-><init>(Lcom/zykj/view/widget/SketchProgressView;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/widget/SketchProgressView$showView$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/widget/SketchProgressView$showView$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->b:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
    iget v2, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->a:I

    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    move p1, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_1
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

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    :goto_0
    invoke-static {v0}, Lkotlinx/coroutines/CoroutineScopeKt;->isActive(Lkotlinx/coroutines/CoroutineScope;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    const/16 v2, 0xfa

    .line 42
    .line 43
    if-ge p1, v2, :cond_3

    .line 44
    .line 45
    add-int/lit8 v2, p1, 0x19

    .line 46
    .line 47
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->d:Lcom/zykj/view/widget/SketchProgressView;

    .line 48
    .line 49
    invoke-static {p1}, Lcom/zykj/view/widget/SketchProgressView;->a(Lcom/zykj/view/widget/SketchProgressView;)Landroid/graphics/Paint;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->d:Lcom/zykj/view/widget/SketchProgressView;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    iput v2, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->a:I

    .line 64
    .line 65
    iput v3, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->b:I

    .line 66
    .line 67
    const-wide/16 v4, 0xa

    .line 68
    .line 69
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/DelayKt;->delay(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    if-ne p1, v1, :cond_0

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    iget-object p1, p0, Lcom/zykj/view/widget/SketchProgressView$showView$1;->d:Lcom/zykj/view/widget/SketchProgressView;

    .line 77
    .line 78
    new-instance v0, Lcom/zykj/view/widget/b;

    .line 79
    .line 80
    invoke-direct {v0, p1}, Lcom/zykj/view/widget/b;-><init>(Lcom/zykj/view/widget/SketchProgressView;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p1
.end method
