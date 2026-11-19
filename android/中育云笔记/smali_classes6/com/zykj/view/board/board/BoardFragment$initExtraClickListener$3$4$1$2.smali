.class final Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;
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
    c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$4$1$2"
    f = "BoardFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;


# direct methods
.method public constructor <init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->e:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->f:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

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
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->e:Lhd/l;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->f:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;-><init>(Lhd/l;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->d:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final g(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->g(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->e:Lhd/l;

    .line 16
    .line 17
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$4$1$2;->f:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->h:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw p1
.end method
