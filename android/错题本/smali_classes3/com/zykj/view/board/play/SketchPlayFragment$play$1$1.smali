.class final Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->play(Ljava/lang/String;IZLr6/c;Lr6/c;)V
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
    c = "com.zykj.view.board.play.SketchPlayFragment$play$1$1"
    f = "SketchPlayFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $onFailure:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $path:Ljava/lang/String;

.field final synthetic $progress:I

.field final synthetic $showLoading:Z

.field label:I

.field final synthetic this$0:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ILr6/c;Lr6/c;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/zykj/view/board/play/SketchPlayFragment;",
            "Ljava/lang/String;",
            "I",
            "Lr6/c;",
            "Lr6/c;",
            "Lh6/c<",
            "-",
            "Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$showLoading:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$path:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$progress:I

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$onSuccess:Lr6/c;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$onFailure:Lr6/c;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic e(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/c;Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->invokeSuspend$lambda$2(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/c;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->invokeSuspend$lambda$1$lambda$0(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V

    return-void
.end method

.method public static synthetic g(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)Ld6/s;
    .locals 0

    .line 1
    invoke-static {p1, p0, p3, p4, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->invokeSuspend$lambda$1(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;I)Ld6/s;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$1(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;I)Ld6/s;
    .locals 7

    .line 1
    invoke-static {p0, p4}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$setMTotalTime$p(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 11
    .line 12
    new-instance v1, Lcom/zykj/view/board/play/i;

    .line 13
    .line 14
    move-object v3, p0

    .line 15
    move v4, p1

    .line 16
    move v5, p2

    .line 17
    move-object v6, p3

    .line 18
    move v2, p4

    .line 19
    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/board/play/i;-><init>(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    const-string p0, "mBinding"

    .line 29
    .line 30
    invoke-static {p0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    throw p0
.end method

.method private static final invokeSuspend$lambda$1$lambda$0(ILcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V
    .locals 0

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$initPlaySketch(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$initStaticSketch(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    if-eqz p3, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->hideProgress()V

    .line 13
    .line 14
    .line 15
    :cond_1
    if-eqz p4, :cond_3

    .line 16
    .line 17
    if-lez p0, :cond_2

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    goto :goto_1

    .line 21
    :cond_2
    const/4 p0, 0x0

    .line 22
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p4, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_3
    return-void
.end method

.method private static final invokeSuspend$lambda$2(ZLcom/zykj/view/board/play/SketchPlayFragment;Lr6/c;Ljava/lang/Throwable;)Ld6/s;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->hideProgress()V

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-interface {p2, p3}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_1
    sget-object p0, Ld6/s;->a:Ld6/s;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 8
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
    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$showLoading:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$path:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$progress:I

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$onSuccess:Lr6/c;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$onFailure:Lr6/c;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ILr6/c;Lr6/c;Lh6/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->label:I

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$showLoading:Z

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 17
    .line 18
    const/4 v2, 0x3

    .line 19
    invoke-static {p1, v1, v0, v2, v1}, Lcom/zykj/view/board/play/SketchPlayFragment;->showProgress$default(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->access$getMBinding$p(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->sketchView:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 31
    .line 32
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$path:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->this$0:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 35
    .line 36
    iget v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$progress:I

    .line 37
    .line 38
    iget-boolean v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$showLoading:Z

    .line 39
    .line 40
    iget-object v5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$onSuccess:Lr6/c;

    .line 41
    .line 42
    new-instance v6, Lcom/zykj/view/board/play/g;

    .line 43
    .line 44
    invoke-direct {v6, v2, v3, v4, v5}, Lcom/zykj/view/board/play/g;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLr6/c;)V

    .line 45
    .line 46
    .line 47
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->$onFailure:Lr6/c;

    .line 48
    .line 49
    new-instance v5, Lcom/zykj/view/board/play/h;

    .line 50
    .line 51
    invoke-direct {v5, v4, v2, v3, v0}, Lcom/zykj/view/board/play/h;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ld6/d;I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v1, v6, v5}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->loadData(Ljava/lang/String;Lr6/c;Lr6/c;)V

    .line 55
    .line 56
    .line 57
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_1
    const-string p1, "mBinding"

    .line 61
    .line 62
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
.end method
