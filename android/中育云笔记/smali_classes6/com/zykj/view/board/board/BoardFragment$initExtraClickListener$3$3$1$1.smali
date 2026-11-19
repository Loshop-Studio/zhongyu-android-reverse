.class final Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;
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
    c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$3$1$1"
    f = "BoardFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lhd/l;

.field public final synthetic e:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;


# direct methods
.method public constructor <init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->d:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->e:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

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
    new-instance p1, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->d:Lhd/l;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->e:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;-><init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->g(Ljava/lang/Throwable;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->c:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->d:Lhd/l;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$3$1$1;->e:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->e:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method
