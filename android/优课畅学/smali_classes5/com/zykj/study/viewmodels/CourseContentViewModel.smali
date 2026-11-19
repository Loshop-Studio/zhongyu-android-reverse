# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/CourseContentViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Landroidx/datastore/core/DataStore;

.field public final b:Lcom/zykj/study/repository/ExerciseRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/core/DataStore;Lcom/zykj/study/repository/ExerciseRepository;)V
    .locals 1

    .line 1
    const-string v0, "userDataStore"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "exerciseRepository"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/viewmodels/CourseContentViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/CourseContentViewModel;->b:Lcom/zykj/study/repository/ExerciseRepository;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Lcom/zykj/study/repository/ExerciseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/CourseContentViewModel;->b:Lcom/zykj/study/repository/ExerciseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b(IILm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Lcom/zykj/study/viewmodels/CourseContentViewModel$getGroupStatistic$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/CourseContentViewModel$getGroupStatistic$2;-><init>(Lcom/zykj/study/viewmodels/CourseContentViewModel;IILm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2, p3}, Lcom/zykj/base/BaseViewModel;->launchAsyncData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public final c(Lm7/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;-><init>(Lcom/zykj/study/viewmodels/CourseContentViewModel;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/study/viewmodels/CourseContentViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 54
    .line 55
    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput v3, v0, Lcom/zykj/study/viewmodels/CourseContentViewModel$getUserId$1;->c:I

    .line 60
    .line 61
    invoke-static {p1, v0}, Ll8/e;->x(Ll8/c;Lm7/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-ne p1, v1, :cond_3

    .line 66
    .line 67
    return-object v1

    .line 68
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/lib/login/proto/UserBean;

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/zykj/lib/login/proto/UserBean;->getId()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v0, "getId(...)"

    .line 75
    .line 76
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object p1
.end method
