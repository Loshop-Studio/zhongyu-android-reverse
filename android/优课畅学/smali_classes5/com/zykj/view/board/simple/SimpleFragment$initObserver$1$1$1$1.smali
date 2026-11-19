.class final Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1"
    f = "SimpleFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/view/board/simple/SimpleFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

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
.method public final c(Lcom/zykj/view/board/simple/b;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;-><init>(Lcom/zykj/view/board/simple/SimpleFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/view/board/simple/b;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c(Lcom/zykj/view/board/simple/b;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/simple/b;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_7

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    instance-of p1, v0, Lcom/zykj/view/board/simple/b$b;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 20
    .line 21
    check-cast v0, Lcom/zykj/view/board/simple/b$b;

    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/b$b;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {p1, v0}, Lcom/zykj/view/board/simple/SimpleFragment;->v(Lcom/zykj/view/board/simple/SimpleFragment;Z)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_0

    .line 31
    .line 32
    :cond_0
    instance-of p1, v0, Lcom/zykj/view/board/simple/b$d;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 37
    .line 38
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->t(Lcom/zykj/view/board/simple/SimpleFragment;)Lv5/c;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast v0, Lcom/zykj/view/board/simple/b$d;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/b$d;->a()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p1, v0}, Lv5/c;->i(Z)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    instance-of p1, v0, Lcom/zykj/view/board/simple/b$f;

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 57
    .line 58
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->u(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast v0, Lcom/zykj/view/board/simple/b$f;

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/b$f;->a()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1, v1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->setActonMode(I)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->t(Lcom/zykj/view/board/simple/SimpleFragment;)Lv5/c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/b$f;->b()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    invoke-virtual {p1, v0}, Lv5/c;->l(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    instance-of p1, v0, Lcom/zykj/view/board/simple/b$g;

    .line 86
    .line 87
    if-eqz p1, :cond_3

    .line 88
    .line 89
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 90
    .line 91
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->t(Lcom/zykj/view/board/simple/SimpleFragment;)Lv5/c;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast v0, Lcom/zykj/view/board/simple/b$g;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/b$g;->a()F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    invoke-virtual {p1, v0}, Lv5/c;->m(F)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    instance-of p1, v0, Lcom/zykj/view/board/simple/b$e;

    .line 106
    .line 107
    if-eqz p1, :cond_4

    .line 108
    .line 109
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 110
    .line 111
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->t(Lcom/zykj/view/board/simple/SimpleFragment;)Lv5/c;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    check-cast v0, Lcom/zykj/view/board/simple/b$e;

    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/b$e;->a()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-virtual {p1, v0}, Lv5/c;->k(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    instance-of p1, v0, Lcom/zykj/view/board/simple/b$c;

    .line 126
    .line 127
    if-eqz p1, :cond_5

    .line 128
    .line 129
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 130
    .line 131
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->t(Lcom/zykj/view/board/simple/SimpleFragment;)Lv5/c;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast v0, Lcom/zykj/view/board/simple/b$c;

    .line 136
    .line 137
    invoke-virtual {v0}, Lcom/zykj/view/board/simple/b$c;->a()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    invoke-virtual {p1, v0}, Lv5/c;->j(F)V

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_5
    instance-of p1, v0, Lcom/zykj/view/board/simple/b$a;

    .line 146
    .line 147
    if-eqz p1, :cond_6

    .line 148
    .line 149
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleFragment$initObserver$1$1$1$1;->c:Lcom/zykj/view/board/simple/SimpleFragment;

    .line 150
    .line 151
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->u(Lcom/zykj/view/board/simple/SimpleFragment;)Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Lcom/zykj/view/simpleBoard/SimpleBoardView;->d()V

    .line 156
    .line 157
    .line 158
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 159
    .line 160
    return-object p1

    .line 161
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 162
    .line 163
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw p1

    .line 167
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 170
    .line 171
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    throw p1
.end method
