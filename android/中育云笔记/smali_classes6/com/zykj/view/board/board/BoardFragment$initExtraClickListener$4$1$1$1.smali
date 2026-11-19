.class final Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment;->K0()V
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
    c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$4$1$1$1"
    f = "BoardFragment.kt"
    l = {
        0x1d6
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lhd/p;

.field public final synthetic e:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;


# direct methods
.method public constructor <init>(Lhd/p;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->d:Lhd/p;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->e:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->d:Lhd/p;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->e:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;-><init>(Lhd/p;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->c:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->d:Lhd/p;

    .line 28
    .line 29
    iput v2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->c:I

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-interface {p1, v1, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    if-ne p1, v0, :cond_2

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$4$1$1$1;->e:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;->c:Landroid/widget/TextView;

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 47
    .line 48
    return-object p1
.end method
