# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/viewmodels/MyCourseViewModel$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/MyCourseViewModel;-><init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;)V
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
    c = "com.zykj.study.viewmodels.MyCourseViewModel$1"
    f = "MyCourseViewModel.kt"
    l = {
        0x24,
        0x23
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:I

.field public final synthetic d:Lcom/zykj/study/viewmodels/MyCourseViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/MyCourseViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->d:Lcom/zykj/study/viewmodels/MyCourseViewModel;

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
    new-instance p1, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->d:Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseViewModel;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->c:I

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
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lcom/zykj/study/repository/CourseRepository;

    .line 34
    .line 35
    iget-object v3, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->a:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->d:Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MyCourseViewModel;->a()Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->d:Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/MyCourseViewModel;->b()Lcom/zykj/study/repository/CourseRepository;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object v4, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->d:Lcom/zykj/study/viewmodels/MyCourseViewModel;

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/MyCourseViewModel;->e()Landroidx/datastore/core/DataStore;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->a:Ljava/lang/Object;

    .line 69
    .line 70
    iput-object v1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->b:Ljava/lang/Object;

    .line 71
    .line 72
    iput v3, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->c:I

    .line 73
    .line 74
    invoke-static {v4, p0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    if-ne v3, v0, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object v5, v3

    .line 82
    move-object v3, p1

    .line 83
    move-object p1, v5

    .line 84
    :goto_0
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 85
    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-nez p1, :cond_5

    .line 93
    .line 94
    :cond_4
    const-string p1, ""

    .line 95
    .line 96
    :cond_5
    iput-object v3, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->a:Ljava/lang/Object;

    .line 97
    .line 98
    const/4 v4, 0x0

    .line 99
    iput-object v4, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->b:Ljava/lang/Object;

    .line 100
    .line 101
    iput v2, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;->c:I

    .line 102
    .line 103
    invoke-virtual {v1, p1, p0}, Lcom/zykj/study/repository/CourseRepository;->p(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_6

    .line 108
    .line 109
    :goto_1
    return-object v0

    .line 110
    :cond_6
    move-object v0, v3

    .line 111
    :goto_2
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 115
    .line 116
    return-object p1
.end method
