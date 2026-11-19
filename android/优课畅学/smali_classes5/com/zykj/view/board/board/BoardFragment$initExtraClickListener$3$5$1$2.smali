.class final Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment;->w0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.view.board.board.BoardFragment$initExtraClickListener$3$5$1$2"
    f = "BoardFragment.kt"
    l = {
        0x1b9
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lx7/p;

.field public final synthetic d:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;


# direct methods
.method public constructor <init>(Lx7/p;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->c:Lx7/p;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->d:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->c:Lx7/p;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->d:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;-><init>(Lx7/p;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->c(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->a:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->c:Lx7/p;

    .line 32
    .line 33
    invoke-static {v0}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iput-object v2, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->b:Ljava/lang/Object;

    .line 38
    .line 39
    iput v3, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->a:I

    .line 40
    .line 41
    invoke-interface {p1, v0, p0}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-ne p1, v1, :cond_2

    .line 46
    .line 47
    return-object v1

    .line 48
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$2;->d:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 49
    .line 50
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->h:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 51
    .line 52
    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 53
    .line 54
    .line 55
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 56
    .line 57
    return-object p1
.end method
