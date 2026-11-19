# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public Lcom/zykj/study/viewmodels/StudyViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/CourseRepository;

.field public final b:Landroidx/datastore/core/DataStore;

.field public final c:Ll8/h;

.field public d:Lcom/zykj/study/data/CourseStudyKeyEntity;

.field public e:Ll8/c;

.field public final f:Landroidx/lifecycle/MutableLiveData;

.field public g:I

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Ll8/c;

.field public final j:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V
    .locals 6

    .line 1
    const-string v0, "respository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "userDataStore"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headerBeanFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->c:Ll8/h;

    .line 24
    .line 25
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 32
    .line 33
    new-instance p3, Landroidx/lifecycle/MutableLiveData;

    .line 34
    .line 35
    invoke-direct {p3}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object p3, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    new-instance v3, Lcom/zykj/study/viewmodels/StudyViewModel$1;

    .line 41
    .line 42
    invoke-direct {v3, p0, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$1;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lm7/c;)V

    .line 43
    .line 44
    .line 45
    const/4 v4, 0x3

    .line 46
    const/4 v5, 0x0

    .line 47
    const/4 v1, 0x0

    .line 48
    const/4 v2, 0x0

    .line 49
    move-object v0, p0

    .line 50
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Ll8/c;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p3, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;

    .line 58
    .line 59
    invoke-direct {p3, p2, p0}, Lcom/zykj/study/viewmodels/StudyViewModel$special$$inlined$flatMapLatest$1;-><init>(Lm7/c;Lcom/zykj/study/viewmodels/StudyViewModel;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, p3}, Ll8/e;->U(Ll8/c;Lx7/q;)Ll8/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-static {p1, p2}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Ll8/c;Li8/b0;)Ll8/c;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, v0, Lcom/zykj/study/viewmodels/StudyViewModel;->i:Ll8/c;

    .line 75
    .line 76
    new-instance p1, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p1, v0, Lcom/zykj/study/viewmodels/StudyViewModel;->j:Ljava/util/HashSet;

    .line 82
    .line 83
    return-void
.end method

.method public static synthetic a(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/viewmodels/StudyViewModel;->e(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static final e(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    const/16 v0, 0x3fe

    .line 21
    .line 22
    if-eq p0, v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0
.end method


# virtual methods
.method public final b(Ljava/util/List;)Ljava/util/List;
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v1, 0xa

    .line 6
    .line 7
    invoke-static {p1, v1}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Lcom/zykj/study/bean/course/CatalogBean;

    .line 29
    .line 30
    new-instance v2, Lcom/zykj/study/bean/SelectModel;

    .line 31
    .line 32
    iget-object v3, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->j:Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    invoke-direct {v2, v3, v1}, Lcom/zykj/study/bean/SelectModel;-><init>(ZLjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-object v0

    .line 54
    :cond_1
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    return-object p1
.end method

.method public final c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final d(ILm7/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;->d:I

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
    iput v1, v0, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;->d:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lm7/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v6, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;->d:I

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x1

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    if-ne v1, v8, :cond_1

    .line 40
    .line 41
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v1, p0

    .line 45
    goto :goto_2

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    new-instance v4, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$2;

    .line 66
    .line 67
    invoke-direct {v4, p0, p1, v7}, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$2;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;ILm7/c;)V

    .line 68
    .line 69
    .line 70
    new-instance v5, Lg5/a3;

    .line 71
    .line 72
    invoke-direct {v5}, Lg5/a3;-><init>()V

    .line 73
    .line 74
    .line 75
    iput p1, v6, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;->a:I

    .line 76
    .line 77
    iput v8, v6, Lcom/zykj/study/viewmodels/StudyViewModel$getCourseDetails$1;->d:I

    .line 78
    .line 79
    move-object v1, p0

    .line 80
    invoke-static/range {v1 .. v6}, Lcom/zykj/study/viewmodels/ViewModelExtKt;->a(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/l;Lm7/c;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v0, :cond_3

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_3
    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-static {v8}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_4

    .line 98
    .line 99
    iget-object p1, v1, Lcom/zykj/study/viewmodels/StudyViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 100
    .line 101
    invoke-virtual {p1, v7}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 105
    .line 106
    return-object p1
.end method

.method public final f()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ll8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->i:Ll8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ll8/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->c:Ll8/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Ll8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->e:Ll8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lcom/zykj/study/repository/CourseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Ljava/util/HashSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->j:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public final o(Lcom/zykj/study/data/CourseStudyKeyEntity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->d:Lcom/zykj/study/data/CourseStudyKeyEntity;

    .line 2
    .line 3
    return-void
.end method

.method public final p(Ll8/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->e:Ll8/c;

    .line 2
    .line 3
    return-void
.end method

.method public final q()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/CourseStudyEntity;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, p0, v0, v4}, Lcom/zykj/study/viewmodels/StudyViewModel$teach$1$1;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1, v2, v3}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudyViewModel;->f:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/data/CourseStudyEntity;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    new-instance v3, Lcom/zykj/study/viewmodels/StudyViewModel$unSubscribe$1$1;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v3, p0, v0, v4}, Lcom/zykj/study/viewmodels/StudyViewModel$unSubscribe$1$1;-><init>(Lcom/zykj/study/viewmodels/StudyViewModel;Lcom/zykj/study/data/CourseStudyEntity;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v1, v2, v3}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
