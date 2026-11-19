.class final Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/find/MicroCodeFragment;->s(Ljava/lang/String;)V
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
    c = "com.zykj.study.ui.home.find.MicroCodeFragment$attachmentToServer$1"
    f = "MicroCodeFragment.kt"
    l = {
        0x11b,
        0x11c,
        0x124
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->c:Ljava/lang/String;

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
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->a:I

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
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->n(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)Lcom/zykj/study/viewmodels/MicroCodeViewModel;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->m(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragmentArgs;->a()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    iget-object v5, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->c:Ljava/lang/String;

    .line 55
    .line 56
    iput v4, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->a:I

    .line 57
    .line 58
    invoke-virtual {p1, v1, v5, p0}, Lcom/zykj/study/viewmodels/MicroCodeViewModel;->b(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    if-ne p1, v0, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    :goto_1
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v1, 0x0

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v2, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1$1;

    .line 81
    .line 82
    iget-object v4, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 83
    .line 84
    invoke-direct {v2, v4, v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1$1;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V

    .line 85
    .line 86
    .line 87
    iput v3, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->a:I

    .line 88
    .line 89
    invoke-static {p1, v2, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-ne p1, v0, :cond_6

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v3, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1$2;

    .line 101
    .line 102
    iget-object v4, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 103
    .line 104
    invoke-direct {v3, v4, v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1$2;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Lm7/c;)V

    .line 105
    .line 106
    .line 107
    iput v2, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$attachmentToServer$1;->a:I

    .line 108
    .line 109
    invoke-static {p1, v3, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    if-ne p1, v0, :cond_6

    .line 114
    .line 115
    :goto_2
    return-object v0

    .line 116
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 117
    .line 118
    return-object p1
.end method
