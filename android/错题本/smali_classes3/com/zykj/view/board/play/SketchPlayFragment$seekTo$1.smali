.class final Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->seekTo(IZLr6/a;Lr6/a;)V
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
    c = "com.zykj.view.board.play.SketchPlayFragment$seekTo$1"
    f = "SketchPlayFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $onFailure:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $progress:I

.field final synthetic $resumePlaying:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/a;Lr6/a;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/view/board/play/SketchPlayFragment;",
            "IZ",
            "Lr6/a;",
            "Lr6/a;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$progress:I

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$resumePlaying:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$onSuccess:Lr6/a;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$onFailure:Lr6/a;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic e(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/a;I)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->invokeSuspend$lambda$0(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/a;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lr6/a;Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->invokeSuspend$lambda$1(Lr6/a;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/a;I)Ld6/s;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$sketchResumePlaying(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-interface {p2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_1
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 12
    .line 13
    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lr6/a;Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    :cond_0
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 7
    .line 8
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 7
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
    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$progress:I

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$resumePlaying:Z

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$onSuccess:Lr6/a;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$onFailure:Lr6/a;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/a;Lr6/a;Lh6/c;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 19
    .line 20
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$progress:I

    .line 21
    .line 22
    iget-boolean v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$resumePlaying:Z

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$onSuccess:Lr6/a;

    .line 27
    .line 28
    new-instance v4, Lcom/zykj/view/board/play/h;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-direct {v4, v1, v2, v3, v5}, Lcom/zykj/view/board/play/h;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ld6/d;I)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->$onFailure:Lr6/a;

    .line 35
    .line 36
    new-instance v2, Lcom/zykj/view/board/play/k;

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-direct {v2, v1, v3}, Lcom/zykj/view/board/play/k;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0, v4, v2}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->seekTo(ILr6/c;Lr6/c;)V

    .line 43
    .line 44
    .line 45
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    const-string p1, "mBinding"

    .line 49
    .line 50
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p1, 0x0

    .line 54
    throw p1

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1
.end method
