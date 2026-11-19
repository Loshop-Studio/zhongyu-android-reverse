# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class final Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->j()V
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
    c = "com.zykj.study.viewmodels.CourseDetailsViewModel$subscribe$1$1"
    f = "CourseDetailsViewModel.kt"
    l = {
        0x42,
        0x41
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public final synthetic d:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

.field public final synthetic e:Lcom/zykj/study/bean/course/CourseDetailsBean;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/CourseDetailsViewModel;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->d:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->e:Lcom/zykj/study/bean/course/CourseDetailsBean;

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
    new-instance p1, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->d:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->e:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;-><init>(Lcom/zykj/study/viewmodels/CourseDetailsViewModel;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->c:I

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
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto :goto_2

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
    iget v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->b:I

    .line 28
    .line 29
    iget-object v3, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v3, Lcom/zykj/study/repository/CourseRepository;

    .line 32
    .line 33
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->d:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->e()Lcom/zykj/study/repository/CourseRepository;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->e:Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    iget-object v4, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->d:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 53
    .line 54
    invoke-virtual {v4}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->h()Landroidx/datastore/core/DataStore;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-interface {v4}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->a:Ljava/lang/Object;

    .line 63
    .line 64
    iput v1, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->b:I

    .line 65
    .line 66
    iput v3, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->c:I

    .line 67
    .line 68
    invoke-static {v4, p0}, Ll8/e;->z(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-ne v3, v0, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move-object v5, v3

    .line 76
    move-object v3, p1

    .line 77
    move-object p1, v5

    .line 78
    :goto_0
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 79
    .line 80
    if-eqz p1, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_5

    .line 87
    .line 88
    :cond_4
    const-string p1, ""

    .line 89
    .line 90
    :cond_5
    const/4 v4, 0x0

    .line 91
    iput-object v4, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput v2, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->c:I

    .line 94
    .line 95
    invoke-virtual {v3, v1, p1, p0}, Lcom/zykj/study/repository/CourseRepository;->w(ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    if-ne p1, v0, :cond_6

    .line 100
    .line 101
    :goto_1
    return-object v0

    .line 102
    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseDetailsViewModel$subscribe$1$1;->d:Lcom/zykj/study/viewmodels/CourseDetailsViewModel;

    .line 103
    .line 104
    check-cast p1, Lcom/zykj/study/bean/course/CourseDetailsBean;

    .line 105
    .line 106
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/CourseDetailsViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 114
    .line 115
    return-object p1
.end method
