.class final Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->l()V
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
    c = "com.zykj.study.viewmodels.BaseExerciseViewModel$goPrevQuestion$1"
    f = "BaseExerciseViewModel.kt"
    l = {
        0xc4
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/BaseExerciseViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->b:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

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
    new-instance p1, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->b:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;-><init>(Lcom/zykj/study/viewmodels/BaseExerciseViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->b:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->a(Lcom/zykj/study/viewmodels/BaseExerciseViewModel;)Ll8/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 34
    .line 35
    iput v2, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->a:I

    .line 36
    .line 37
    invoke-interface {p1, v1, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-ne p1, v0, :cond_2

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->b:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Ljava/util/List;

    .line 55
    .line 56
    if-eqz p1, :cond_6

    .line 57
    .line 58
    iget-object v0, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->b:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 59
    .line 60
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    const/4 v1, 0x0

    .line 65
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    check-cast v3, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    const/4 v1, -0x1

    .line 96
    :goto_2
    iget-object p1, p0, Lcom/zykj/study/viewmodels/BaseExerciseViewModel$goPrevQuestion$1;->b:Lcom/zykj/study/viewmodels/BaseExerciseViewModel;

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->q()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    check-cast v3, Ljava/util/List;

    .line 114
    .line 115
    if-eqz v3, :cond_5

    .line 116
    .line 117
    add-int/lit8 v4, v1, -0x1

    .line 118
    .line 119
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lcom/zykj/study/bean/exercise/QuestionBean;

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    const/4 v3, 0x0

    .line 127
    :goto_3
    invoke-virtual {v0, v3}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/BaseExerciseViewModel;->e()Landroidx/lifecycle/MutableLiveData;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    sub-int/2addr v1, v2

    .line 135
    invoke-static {v1}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_6
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 143
    .line 144
    return-object p1
.end method
