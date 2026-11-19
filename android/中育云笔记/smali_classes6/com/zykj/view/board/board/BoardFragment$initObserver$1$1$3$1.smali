.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1"
    f = "BoardFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lcom/zykj/view/board/board/t;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/view/board/board/t;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->g(Lcom/zykj/view/board/board/t;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/board/t;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_3

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$3$1;->e:Lcom/zykj/view/board/board/BoardFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->n0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const-string p1, "mBinding"

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->h:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 30
    .line 31
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->e:Landroid/widget/RadioButton;

    .line 32
    .line 33
    const-string v2, "rbPenDottedLine"

    .line 34
    .line 35
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->c()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    const/16 v3, 0x8

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    move v2, v4

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, v3

    .line 50
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->f:Landroid/widget/RadioButton;

    .line 54
    .line 55
    const-string v2, "rbPenHighlighter"

    .line 56
    .line 57
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->d()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    move v3, v4

    .line 67
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->m:Landroid/widget/RadioGroup;

    .line 71
    .line 72
    const-string v2, "rgPenType"

    .line 73
    .line 74
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->g()Lcom/zykj/view/board/board/u;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    invoke-virtual {v2}, Lcom/zykj/view/board/board/u;->b()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    invoke-static {v1, v2}, Lvb/a;->a(Landroid/widget/RadioGroup;I)V

    .line 86
    .line 87
    .line 88
    iget-object v1, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->l:Landroid/widget/RadioGroup;

    .line 89
    .line 90
    const-string v2, "rgPenSize"

    .line 91
    .line 92
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->f()I

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-static {v1, v2}, Lvb/a;->a(Landroid/widget/RadioGroup;I)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewIncludePenBinding;->k:Landroid/widget/RadioGroup;

    .line 103
    .line 104
    const-string v1, "rgPenColor"

    .line 105
    .line 106
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/zykj/view/board/board/t;->e()Lcom/zykj/view/board/board/s;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lcom/zykj/view/board/board/s;->b()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-static {p1, v0}, Lvb/a;->a(Landroid/widget/RadioGroup;I)V

    .line 118
    .line 119
    .line 120
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 121
    .line 122
    return-object p1

    .line 123
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 126
    .line 127
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
.end method
