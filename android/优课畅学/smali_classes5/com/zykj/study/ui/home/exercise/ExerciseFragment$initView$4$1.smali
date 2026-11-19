.class final Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.exercise.ExerciseFragment$initView$4$1"
    f = "ExerciseFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/bean/exercise/ExerciseBean;

.field public final synthetic c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/bean/exercise/ExerciseBean;Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->b:Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

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
    new-instance p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->b:Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;-><init>(Lcom/zykj/study/bean/exercise/ExerciseBean;Lcom/zykj/study/ui/home/exercise/ExerciseFragment;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->a:I

    .line 5
    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->b:Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getStatus()Lcom/zykj/study/bean/exercise/ExerciseType;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    const/4 p1, -0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    sget-object v0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1$a;->a:[I

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    aget p1, v0, p1

    .line 28
    .line 29
    :goto_0
    const/4 v0, 0x1

    .line 30
    if-eq p1, v0, :cond_2

    .line 31
    .line 32
    const/4 v0, 0x2

    .line 33
    if-eq p1, v0, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    if-eq p1, v0, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 40
    .line 41
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    sget-object v0, Lcom/zykj/study/ui/home/exercise/a;->a:Lcom/zykj/study/ui/home/exercise/a$c;

    .line 46
    .line 47
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 48
    .line 49
    invoke-static {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 58
    .line 59
    invoke-static {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 68
    .line 69
    invoke-static {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    const/16 v5, 0x8

    .line 78
    .line 79
    const/4 v6, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    invoke-static/range {v0 .. v6}, Lcom/zykj/study/ui/home/exercise/a$c;->b(Lcom/zykj/study/ui/home/exercise/a$c;IIIIILjava/lang/Object;)Landroidx/navigation/NavDirections;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 90
    .line 91
    invoke-static {p1}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    sget-object v0, Lcom/zykj/study/ui/home/exercise/a;->a:Lcom/zykj/study/ui/home/exercise/a$c;

    .line 96
    .line 97
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 98
    .line 99
    invoke-static {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->b()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 108
    .line 109
    invoke-static {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v2}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->a()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/ExerciseFragment$initView$4$1;->c:Lcom/zykj/study/ui/home/exercise/ExerciseFragment;

    .line 118
    .line 119
    invoke-static {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseFragment;->k(Lcom/zykj/study/ui/home/exercise/ExerciseFragment;)Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-virtual {v3}, Lcom/zykj/study/ui/home/exercise/ExerciseFragmentArgs;->c()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    invoke-virtual {v0, v1, v2, v3}, Lcom/zykj/study/ui/home/exercise/a$c;->c(III)Landroidx/navigation/NavDirections;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p1, v0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 132
    .line 133
    .line 134
    :goto_1
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 138
    .line 139
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 140
    .line 141
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1
.end method
