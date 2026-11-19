.class final Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->sketchStartPlaying()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.view.board.play.SketchPlayFragment$sketchStartPlaying$1"
    f = "SketchPlayFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/play/SketchPlayFragment;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance p1, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->start()V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getExtraConfig$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/board/play/SketchPlayExtraConfig;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayExtraConfig;->getAutoHideSeekBar()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$sketchStartPlaying$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 36
    .line 37
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$startControlBarJob(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    const-string p1, "mBinding"

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    throw p1

    .line 50
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1
.end method
