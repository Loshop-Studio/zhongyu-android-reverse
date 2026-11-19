.class final Lcoil3/compose/AsyncImagePainter$launchJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
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
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "coil3.compose.AsyncImagePainter$launchJob$1"
    f = "AsyncImagePainter.kt"
    i = {}
    l = {
        0xe4,
        0xe8
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $input:Lcoil3/compose/d;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcoil3/compose/AsyncImagePainter;


# direct methods
.method public constructor <init>(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/d;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcoil3/compose/AsyncImagePainter;",
            "Lcoil3/compose/d;",
            "Lh6/c<",
            "-",
            "Lcoil3/compose/AsyncImagePainter$launchJob$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->this$0:Lcoil3/compose/AsyncImagePainter;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->$input:Lcoil3/compose/d;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
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
    new-instance p1, Lcoil3/compose/AsyncImagePainter$launchJob$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->this$0:Lcoil3/compose/AsyncImagePainter;

    .line 4
    .line 5
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->$input:Lcoil3/compose/d;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;-><init>(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/d;Lh6/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcoil3/compose/AsyncImagePainter$launchJob$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 2
    .line 3
    iget v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->label:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->L$0:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcoil3/compose/AsyncImagePainter;

    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->this$0:Lcoil3/compose/AsyncImagePainter;

    .line 37
    .line 38
    iget-object v1, p1, Lcoil3/compose/AsyncImagePainter;->l:Lcoil3/compose/j;

    .line 39
    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    iget-object v2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->$input:Lcoil3/compose/d;

    .line 43
    .line 44
    iget-object v2, v2, Lcoil3/compose/d;->b:Ls/f;

    .line 45
    .line 46
    invoke-static {p1, v2, v3}, Lcoil3/compose/AsyncImagePainter;->a(Lcoil3/compose/AsyncImagePainter;Ls/f;Z)Ls/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object v2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->$input:Lcoil3/compose/d;

    .line 51
    .line 52
    iget-object v2, v2, Lcoil3/compose/d;->a:Lcoil3/n;

    .line 53
    .line 54
    iput v3, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->label:I

    .line 55
    .line 56
    invoke-virtual {v1, v2, p1, p0}, Lcoil3/compose/j;->a(Lcoil3/n;Ls/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    if-ne p1, v0, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_0
    check-cast p1, Lcoil3/compose/i;

    .line 64
    .line 65
    goto :goto_5

    .line 66
    :cond_4
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->$input:Lcoil3/compose/d;

    .line 67
    .line 68
    iget-object v1, v1, Lcoil3/compose/d;->b:Ls/f;

    .line 69
    .line 70
    const/4 v3, 0x0

    .line 71
    invoke-static {p1, v1, v3}, Lcoil3/compose/AsyncImagePainter;->a(Lcoil3/compose/AsyncImagePainter;Ls/f;Z)Ls/f;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->this$0:Lcoil3/compose/AsyncImagePainter;

    .line 76
    .line 77
    iget-object v3, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->$input:Lcoil3/compose/d;

    .line 78
    .line 79
    iget-object v3, v3, Lcoil3/compose/d;->a:Lcoil3/n;

    .line 80
    .line 81
    iput-object v1, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->L$0:Ljava/lang/Object;

    .line 82
    .line 83
    iput v2, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->label:I

    .line 84
    .line 85
    check-cast v3, Lcoil3/r;

    .line 86
    .line 87
    invoke-virtual {v3, p1, p0}, Lcoil3/r;->c(Ls/f;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v0, :cond_5

    .line 92
    .line 93
    :goto_1
    return-object v0

    .line 94
    :cond_5
    move-object v0, v1

    .line 95
    :goto_2
    check-cast p1, Ls/i;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    instance-of v1, p1, Ls/n;

    .line 101
    .line 102
    if-eqz v1, :cond_6

    .line 103
    .line 104
    new-instance v1, Lcoil3/compose/h;

    .line 105
    .line 106
    check-cast p1, Ls/n;

    .line 107
    .line 108
    iget-object v2, p1, Ls/n;->a:Lcoil3/k;

    .line 109
    .line 110
    iget-object v3, p1, Ls/n;->b:Ls/f;

    .line 111
    .line 112
    iget-object v3, v3, Ls/f;->a:Landroid/content/Context;

    .line 113
    .line 114
    iget v0, v0, Lcoil3/compose/AsyncImagePainter;->k:I

    .line 115
    .line 116
    invoke-static {v2, v3, v0}, Lcoil3/compose/l;->a(Lcoil3/k;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-direct {v1, v0, p1}, Lcoil3/compose/h;-><init>(Landroidx/compose/ui/graphics/painter/Painter;Ls/n;)V

    .line 121
    .line 122
    .line 123
    :goto_3
    move-object p1, v1

    .line 124
    goto :goto_5

    .line 125
    :cond_6
    instance-of v1, p1, Ls/b;

    .line 126
    .line 127
    if-eqz v1, :cond_8

    .line 128
    .line 129
    new-instance v1, Lcoil3/compose/f;

    .line 130
    .line 131
    check-cast p1, Ls/b;

    .line 132
    .line 133
    iget-object v2, p1, Ls/b;->a:Lcoil3/k;

    .line 134
    .line 135
    if-eqz v2, :cond_7

    .line 136
    .line 137
    iget-object v3, p1, Ls/b;->b:Ls/f;

    .line 138
    .line 139
    iget-object v3, v3, Ls/f;->a:Landroid/content/Context;

    .line 140
    .line 141
    iget v0, v0, Lcoil3/compose/AsyncImagePainter;->k:I

    .line 142
    .line 143
    invoke-static {v2, v3, v0}, Lcoil3/compose/l;->a(Lcoil3/k;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_4

    .line 148
    :cond_7
    const/4 v0, 0x0

    .line 149
    :goto_4
    invoke-direct {v1, v0, p1}, Lcoil3/compose/f;-><init>(Landroidx/compose/ui/graphics/painter/Painter;Ls/b;)V

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :goto_5
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter$launchJob$1;->this$0:Lcoil3/compose/AsyncImagePainter;

    .line 154
    .line 155
    invoke-static {v0, p1}, Lcoil3/compose/AsyncImagePainter;->b(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/i;)V

    .line 156
    .line 157
    .line 158
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 159
    .line 160
    return-object p1

    .line 161
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 162
    .line 163
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 164
    .line 165
    .line 166
    throw p1
.end method
