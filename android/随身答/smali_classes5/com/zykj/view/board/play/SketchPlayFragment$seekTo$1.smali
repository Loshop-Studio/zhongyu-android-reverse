.class final Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->k0(IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
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
    c = "com.zykj.view.board.play.SketchPlayFragment$seekTo$1"
    f = "SketchPlayFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput p2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->c:I

    iput-boolean p3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->d:Z

    iput-object p4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->e:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->f:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function0;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->g(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function0;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->k(Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function0;I)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->D(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final k(Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7

    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;

    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->c:I

    iget-boolean v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->d:Z

    iget-object v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->e:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->f:Lkotlin/jvm/functions/Function0;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->q(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const-string p1, "mBinding"

    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 26
    .line 27
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->c:I

    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->d:Z

    .line 30
    .line 31
    iget-object v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->e:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    new-instance v4, Lcom/zykj/view/board/play/d;

    .line 36
    .line 37
    invoke-direct {v4, v1, v2, v3}, Lcom/zykj/view/board/play/d;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function0;)V

    .line 38
    .line 39
    .line 40
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->f:Lkotlin/jvm/functions/Function0;

    .line 41
    .line 42
    new-instance v2, Lcom/zykj/view/board/play/e;

    .line 43
    .line 44
    invoke-direct {v2, v1}, Lcom/zykj/view/board/play/e;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, v4, v2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->seekTo(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method
