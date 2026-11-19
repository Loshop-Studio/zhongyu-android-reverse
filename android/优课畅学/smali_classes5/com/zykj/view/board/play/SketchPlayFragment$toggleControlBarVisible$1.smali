.class final Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/play/SketchPlayFragment;->q0()V
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
    c = "com.zykj.view.board.play.SketchPlayFragment$toggleControlBarVisible$1"
    f = "SketchPlayFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;-><init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_8

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->v(Lcom/zykj/view/board/play/SketchPlayFragment;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v0, 0x0

    .line 18
    const-string v1, "mBinding"

    .line 19
    .line 20
    if-lez p1, :cond_2

    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->t(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-object v0, p1

    .line 35
    :goto_0
    iget-object p1, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->a:Landroidx/constraintlayout/widget/Group;

    .line 38
    .line 39
    const-string v0, "groupSeekBar"

    .line 40
    .line 41
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_1

    .line 49
    .line 50
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 51
    .line 52
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->y(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 53
    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_1
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->F(Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 59
    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_2
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 63
    .line 64
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->s(Lcom/zykj/view/board/play/SketchPlayFragment;)Ls5/h;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Ls5/h;->e()Z

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    iget-object p1, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 75
    .line 76
    invoke-static {p1}, Lcom/zykj/view/board/play/SketchPlayFragment;->t(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    move-object p1, v0

    .line 86
    :cond_3
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->b:Landroid/widget/ImageView;

    .line 89
    .line 90
    const-string v2, "ivFullscreen"

    .line 91
    .line 92
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iget-object v3, p0, Lcom/zykj/view/board/play/SketchPlayFragment$toggleControlBarVisible$1;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 96
    .line 97
    invoke-static {v3}, Lcom/zykj/view/board/play/SketchPlayFragment;->t(Lcom/zykj/view/board/play/SketchPlayFragment;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    if-nez v3, :cond_4

    .line 102
    .line 103
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    move-object v0, v3

    .line 108
    :goto_1
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 109
    .line 110
    iget-object v0, v0, Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;->b:Landroid/widget/ImageView;

    .line 111
    .line 112
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    const/4 v1, 0x0

    .line 120
    if-nez v0, :cond_5

    .line 121
    .line 122
    const/4 v0, 0x1

    .line 123
    goto :goto_2

    .line 124
    :cond_5
    move v0, v1

    .line 125
    :goto_2
    if-nez v0, :cond_6

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    const/16 v1, 0x8

    .line 129
    .line 130
    :goto_3
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    :cond_7
    :goto_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 134
    .line 135
    return-object p1

    .line 136
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 139
    .line 140
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p1
.end method
