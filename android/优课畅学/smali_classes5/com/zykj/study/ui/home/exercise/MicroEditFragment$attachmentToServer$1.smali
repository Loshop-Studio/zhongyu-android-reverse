.class final Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->y(Ljava/lang/String;)V
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
    c = "com.zykj.study.ui.home.exercise.MicroEditFragment$attachmentToServer$1"
    f = "MicroEditFragment.kt"
    l = {
        0x165,
        0x166,
        0x172
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->c:Ljava/lang/String;

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
    new-instance p1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->c:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->w(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lcom/zykj/study/viewmodels/MicroEditViewModel;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 45
    .line 46
    invoke-static {v1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->u(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;->a()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iget-object v5, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 55
    .line 56
    invoke-static {v5}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->u(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;)Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v5}, Lcom/zykj/study/ui/home/exercise/MicroEditFragmentArgs;->c()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    iget-object v6, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->c:Ljava/lang/String;

    .line 65
    .line 66
    iput v4, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->a:I

    .line 67
    .line 68
    invoke-virtual {p1, v1, v5, v6, p0}, Lcom/zykj/study/viewmodels/MicroEditViewModel;->b(ILjava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-ne p1, v0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    :goto_1
    invoke-static {v4}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    const/4 v1, 0x0

    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance v2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1$1;

    .line 91
    .line 92
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 93
    .line 94
    iget-object v5, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->c:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {v2, v4, v5, v1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1$1;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lm7/c;)V

    .line 97
    .line 98
    .line 99
    iput v3, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->a:I

    .line 100
    .line 101
    invoke-static {p1, v2, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v0, :cond_6

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_5
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    new-instance v3, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1$2;

    .line 113
    .line 114
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->b:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 115
    .line 116
    invoke-direct {v3, v4, v1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1$2;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Lm7/c;)V

    .line 117
    .line 118
    .line 119
    iput v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$attachmentToServer$1;->a:I

    .line 120
    .line 121
    invoke-static {p1, v3, p0}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v0, :cond_6

    .line 126
    .line 127
    :goto_2
    return-object v0

    .line 128
    :cond_6
    :goto_3
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 129
    .line 130
    return-object p1
.end method
