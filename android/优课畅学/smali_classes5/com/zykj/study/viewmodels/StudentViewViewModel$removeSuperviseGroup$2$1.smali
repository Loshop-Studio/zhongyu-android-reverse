.class final Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/StudentViewViewModel;->l(ILm7/c;)Ljava/lang/Object;
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
    c = "com.zykj.study.viewmodels.StudentViewViewModel$removeSuperviseGroup$2$1"
    f = "StudentViewViewModel.kt"
    l = {
        0x49
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/StudentViewViewModel;IILm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->c:I

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->d:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 4
    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->c:I

    .line 6
    .line 7
    iget v2, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->d:I

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;-><init>(Lcom/zykj/study/viewmodels/StudentViewViewModel;IILm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->a:I

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->e()Lcom/zykj/study/repository/TeachCourseRepository;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget v1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->c:I

    .line 34
    .line 35
    iget v3, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->d:I

    .line 36
    .line 37
    iput v2, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->a:I

    .line 38
    .line 39
    invoke-virtual {p1, v1, v3, p0}, Lcom/zykj/study/repository/TeachCourseRepository;->o(IILm7/c;)Ljava/lang/Object;

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, Ljava/util/List;

    .line 57
    .line 58
    if-eqz p1, :cond_5

    .line 59
    .line 60
    iget v0, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->d:I

    .line 61
    .line 62
    new-instance v1, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    move-object v4, v3

    .line 82
    check-cast v4, Lcom/zykj/study/bean/teach/SuperviseGroup;

    .line 83
    .line 84
    invoke-virtual {v4}, Lcom/zykj/study/bean/teach/SuperviseGroup;->getId()I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-ne v4, v0, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->d()Landroidx/lifecycle/MutableLiveData;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/4 v0, 0x0

    .line 111
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewViewModel$removeSuperviseGroup$2$1;->b:Lcom/zykj/study/viewmodels/StudentViewViewModel;

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudentViewViewModel;->i()V

    .line 117
    .line 118
    .line 119
    invoke-static {v2}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    return-object p1
.end method
