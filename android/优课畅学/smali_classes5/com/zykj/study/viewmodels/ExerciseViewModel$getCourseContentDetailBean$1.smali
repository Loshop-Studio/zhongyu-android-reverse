.class final Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/ExerciseViewModel;->a(III)V
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
    c = "com.zykj.study.viewmodels.ExerciseViewModel$getCourseContentDetailBean$1"
    f = "ExerciseViewModel.kt"
    l = {
        0x19
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/ExerciseViewModel;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/ExerciseViewModel;IIILm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->b:Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->c:I

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->d:I

    .line 6
    .line 7
    iput p4, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->e:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->b:Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 4
    .line 5
    iget v2, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->c:I

    .line 6
    .line 7
    iget v3, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->d:I

    .line 8
    .line 9
    iget v4, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->e:I

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;-><init>(Lcom/zykj/study/viewmodels/ExerciseViewModel;IIILm7/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->b:Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/ExerciseViewModel;->c()Lcom/zykj/study/repository/ExerciseRepository;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->c:I

    .line 34
    .line 35
    iget v3, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->d:I

    .line 36
    .line 37
    iput v2, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->a:I

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3, p0}, Lcom/zykj/study/repository/ExerciseRepository;->e(IILm7/c;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p1, v0, :cond_2

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->b:Lcom/zykj/study/viewmodels/ExerciseViewModel;

    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/study/viewmodels/ExerciseViewModel$getCourseContentDetailBean$1;->e:I

    .line 49
    .line 50
    check-cast p1, Lcom/zykj/study/bean/CourseContentDetailBean;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/zykj/study/bean/CourseContentDetailBean;->getExerciseList()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    const/4 v3, 0x0

    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/study/bean/CourseContentDetailBean;->getExerciseList()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/study/bean/CourseContentDetailBean;->getExerciseList()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_5

    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    move-object v4, v2

    .line 89
    check-cast v4, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 90
    .line 91
    invoke-virtual {v4}, Lcom/zykj/study/bean/exercise/ExerciseBean;->getGroupId()I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-ne v4, v1, :cond_4

    .line 96
    .line 97
    move-object v3, v2

    .line 98
    :cond_5
    check-cast v3, Lcom/zykj/study/bean/exercise/ExerciseBean;

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1, v3}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/ExerciseViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1, v3}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :goto_2
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 116
    .line 117
    return-object p1
.end method
