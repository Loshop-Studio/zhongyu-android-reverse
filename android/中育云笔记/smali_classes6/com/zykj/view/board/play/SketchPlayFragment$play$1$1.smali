.class final Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->l0(Ljava/lang/String;IZLhd/l;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.zykj.view.board.play.SketchPlayFragment$play$1$1"
    f = "SketchPlayFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Z

.field public final synthetic e:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:I

.field public final synthetic h:Lhd/l;

.field public final synthetic i:Lhd/l;


# direct methods
.method public constructor <init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ILhd/l;Lhd/l;Lvc/c;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->d:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->f:Ljava/lang/String;

    .line 6
    .line 7
    iput p4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->g:I

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->h:Lhd/l;

    .line 10
    .line 11
    iput-object p6, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->i:Lhd/l;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p7}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic g(ZLcom/zykj/view/board/play/SketchPlayFragment;Lhd/l;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->v(ZLcom/zykj/view/board/play/SketchPlayFragment;Lhd/l;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(ILcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->t(ILcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->p(Lcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;I)Lqc/q;
    .locals 7

    .line 1
    invoke-static {p0, p4}, Lcom/zykj/view/board/play/SketchPlayFragment;->L(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/zykj/view/board/play/SketchPlayFragment;->C(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "mBinding"

    .line 11
    .line 12
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :cond_0
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 17
    .line 18
    new-instance v1, Lcom/zykj/view/board/play/c;

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    move v4, p1

    .line 22
    move v5, p2

    .line 23
    move-object v6, p3

    .line 24
    move v2, p4

    .line 25
    invoke-direct/range {v1 .. v6}, Lcom/zykj/view/board/play/c;-><init>(ILcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 32
    .line 33
    return-object p0
.end method

.method public static final t(ILcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;)V
    .locals 0

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment;->I(Lcom/zykj/view/board/play/SketchPlayFragment;I)V

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->J(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 8
    .line 9
    .line 10
    :goto_0
    if-eqz p3, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->X()V

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
    invoke-interface {p4, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    :cond_3
    return-void
.end method

.method public static final v(ZLcom/zykj/view/board/play/SketchPlayFragment;Lhd/l;Ljava/lang/Throwable;)Lqc/q;
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->X()V

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-interface {p2, p3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 8

    .line 1
    new-instance v0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;

    .line 2
    .line 3
    iget-boolean v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->d:Z

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->f:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->g:I

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->h:Lhd/l;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->i:Lhd/l;

    .line 14
    .line 15
    move-object v7, p2

    .line 16
    invoke-direct/range {v0 .. v7}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ILhd/l;Lhd/l;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->d:Z

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-static {p1, v0, v1, v2, v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->r0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 24
    .line 25
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->C(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    const-string p1, "mBinding"

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v0, p1

    .line 38
    :goto_0
    iget-object p1, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->j:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 39
    .line 40
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->f:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 43
    .line 44
    iget v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->g:I

    .line 45
    .line 46
    iget-boolean v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->d:Z

    .line 47
    .line 48
    iget-object v4, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->h:Lhd/l;

    .line 49
    .line 50
    new-instance v5, Lcom/zykj/view/board/play/a;

    .line 51
    .line 52
    invoke-direct {v5, v1, v2, v3, v4}, Lcom/zykj/view/board/play/a;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;IZLhd/l;)V

    .line 53
    .line 54
    .line 55
    iget-boolean v1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->d:Z

    .line 56
    .line 57
    iget-object v2, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->e:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 58
    .line 59
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->i:Lhd/l;

    .line 60
    .line 61
    new-instance v4, Lcom/zykj/view/board/play/b;

    .line 62
    .line 63
    invoke-direct {v4, v1, v2, v3}, Lcom/zykj/view/board/play/b;-><init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Lhd/l;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0, v5, v4}, Lcom/zykj/merge/sketch/view/MergeSketchPlayView;->loadData(Ljava/lang/String;Lhd/l;Lhd/l;)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
.end method
