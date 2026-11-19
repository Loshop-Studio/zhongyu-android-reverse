.class final Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/simple/SimpleViewModel;->j()V
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
    c = "com.zykj.view.board.simple.SimpleViewModel$updateConfigAboutPen$1"
    f = "SimpleViewModel.kt"
    l = {
        0x82,
        0x88,
        0x8d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/view/board/simple/SimpleViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->c:Lcom/zykj/view/board/simple/SimpleViewModel;

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
    new-instance p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->c:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;-><init>(Lcom/zykj/view/board/simple/SimpleViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->b:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lcom/zykj/view/board/simple/e;

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Lcom/zykj/view/board/simple/e;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->a:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, Lcom/zykj/view/board/simple/e;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->c:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 55
    .line 56
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->b(Lcom/zykj/view/board/simple/SimpleViewModel;)Ll8/h;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {p1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lcom/zykj/view/board/simple/e;

    .line 65
    .line 66
    iget-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->c:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 67
    .line 68
    invoke-static {v1}, Lcom/zykj/view/board/simple/SimpleViewModel;->a(Lcom/zykj/view/board/simple/SimpleViewModel;)Ll8/g;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v5, Lcom/zykj/view/board/simple/b$f;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/view/board/simple/e;->i()Lcom/zykj/view/board/simple/d;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-virtual {v6}, Lcom/zykj/view/board/simple/d;->a()I

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    invoke-virtual {p1}, Lcom/zykj/view/board/simple/e;->i()Lcom/zykj/view/board/simple/d;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7}, Lcom/zykj/view/board/simple/d;->c()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-direct {v5, v6, v7}, Lcom/zykj/view/board/simple/b$f;-><init>(IZ)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->a:Ljava/lang/Object;

    .line 94
    .line 95
    iput v4, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->b:I

    .line 96
    .line 97
    invoke-interface {v1, v5, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-ne v1, v0, :cond_4

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    move-object v1, p1

    .line 105
    :goto_0
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->c:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 106
    .line 107
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->a(Lcom/zykj/view/board/simple/SimpleViewModel;)Ll8/g;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v4, Lcom/zykj/view/board/simple/b$g;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/zykj/view/board/simple/e;->h()Lcom/zykj/view/board/simple/c;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    invoke-virtual {v5}, Lcom/zykj/view/board/simple/c;->b()F

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-direct {v4, v5}, Lcom/zykj/view/board/simple/b$g;-><init>(F)V

    .line 122
    .line 123
    .line 124
    iput-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->a:Ljava/lang/Object;

    .line 125
    .line 126
    iput v3, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->b:I

    .line 127
    .line 128
    invoke-interface {p1, v4, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v0, :cond_5

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->c:Lcom/zykj/view/board/simple/SimpleViewModel;

    .line 136
    .line 137
    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleViewModel;->a(Lcom/zykj/view/board/simple/SimpleViewModel;)Ll8/g;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    new-instance v3, Lcom/zykj/view/board/simple/b$e;

    .line 142
    .line 143
    invoke-virtual {v1}, Lcom/zykj/view/board/simple/e;->g()Lcom/zykj/view/board/board/s;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v4}, Lcom/zykj/view/board/board/s;->a()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    invoke-direct {v3, v4}, Lcom/zykj/view/board/simple/b$e;-><init>(I)V

    .line 152
    .line 153
    .line 154
    invoke-static {v1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    iput-object v1, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->a:Ljava/lang/Object;

    .line 159
    .line 160
    iput v2, p0, Lcom/zykj/view/board/simple/SimpleViewModel$updateConfigAboutPen$1;->b:I

    .line 161
    .line 162
    invoke-interface {p1, v3, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    if-ne p1, v0, :cond_6

    .line 167
    .line 168
    :goto_2
    return-object v0

    .line 169
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 170
    .line 171
    return-object p1
.end method
