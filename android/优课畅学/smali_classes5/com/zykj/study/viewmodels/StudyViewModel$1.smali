# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/viewmodels/StudyViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/StudyViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V
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
    c = "com.zykj.study.viewmodels.StudyViewModel$1"
    f = "StudyViewModel.kt"
    l = {
        0x3d,
        0x3e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public final synthetic e:Lcom/zykj/study/viewmodels/StudyViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->e:Lcom/zykj/study/viewmodels/StudyViewModel;

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
    new-instance p1, Lcom/zykj/study/viewmodels/StudyViewModel$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->e:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$1;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/StudyViewModel$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->d:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->a:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 22
    .line 23
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->e:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->m()Landroidx/datastore/core/DataStore;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput v3, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->d:I

    .line 53
    .line 54
    invoke-static {p1, p0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-ne p1, v0, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_0
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 62
    .line 63
    if-eqz p1, :cond_6

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_6

    .line 70
    .line 71
    iget-object v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->e:Lcom/zykj/study/viewmodels/StudyViewModel;

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/StudyViewModel;->j()Lcom/zykj/study/repository/CourseRepository;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    iput-object v1, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    iput-object v4, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->b:Ljava/lang/Object;

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    iput v4, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->c:I

    .line 87
    .line 88
    iput v2, p0, Lcom/zykj/study/viewmodels/StudyViewModel$1;->d:I

    .line 89
    .line 90
    invoke-virtual {v3, p1, p0}, Lcom/zykj/study/repository/CourseRepository;->o(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    if-ne p1, v0, :cond_4

    .line 95
    .line 96
    :goto_1
    return-object v0

    .line 97
    :cond_4
    move-object v0, v1

    .line 98
    :goto_2
    check-cast p1, Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 99
    .line 100
    if-eqz p1, :cond_5

    .line 101
    .line 102
    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->o(Lcom/zykj/study/data/CourseStudyKeyEntity;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudyViewModel;->j()Lcom/zykj/study/repository/CourseRepository;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1, p1}, Lcom/zykj/study/repository/CourseRepository;->q(Lcom/zykj/study/data/CourseStudyKeyEntity;)Ll8/c;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {p1, v1}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Ll8/c;Li8/b0;)Ll8/c;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {v0, p1}, Lcom/zykj/study/viewmodels/StudyViewModel;->p(Ll8/c;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/StudyViewModel;->l()Landroidx/lifecycle/MutableLiveData;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_6
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 133
    .line 134
    return-object p1
.end method
