# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/MyCourseViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/CourseRepository;

.field public final b:Landroidx/datastore/core/DataStore;

.field public final c:Landroidx/lifecycle/MutableLiveData;

.field public final d:Ll8/c;

.field public final e:Ll8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;)V
    .locals 6

    .line 1
    const-string v0, "repository"

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
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 17
    .line 18
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    new-instance v3, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;

    .line 26
    .line 27
    const/4 p2, 0x0

    .line 28
    invoke-direct {v3, p0, p2}, Lcom/zykj/study/viewmodels/MyCourseViewModel$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseViewModel;Lm7/c;)V

    .line 29
    .line 30
    .line 31
    const/4 v4, 0x3

    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    move-object v0, p0

    .line 36
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Ll8/c;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseViewModel$special$$inlined$flatMapLatest$1;

    .line 44
    .line 45
    invoke-direct {v2, p2, p0}, Lcom/zykj/study/viewmodels/MyCourseViewModel$special$$inlined$flatMapLatest$1;-><init>(Lm7/c;Lcom/zykj/study/viewmodels/MyCourseViewModel;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2}, Ll8/e;->U(Ll8/c;Lx7/q;)Ll8/c;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v1, v2}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Ll8/c;Li8/b0;)Ll8/c;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, v0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->d:Ll8/c;

    .line 61
    .line 62
    invoke-static {p1}, Landroidx/lifecycle/FlowLiveDataConversions;->asFlow(Landroidx/lifecycle/LiveData;)Ll8/c;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    new-instance v1, Lcom/zykj/study/viewmodels/MyCourseViewModel$special$$inlined$flatMapLatest$2;

    .line 67
    .line 68
    invoke-direct {v1, p2, p0}, Lcom/zykj/study/viewmodels/MyCourseViewModel$special$$inlined$flatMapLatest$2;-><init>(Lm7/c;Lcom/zykj/study/viewmodels/MyCourseViewModel;)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1, v1}, Ll8/e;->U(Ll8/c;Lx7/q;)Ll8/c;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-static {p1, p2}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Ll8/c;Li8/b0;)Ll8/c;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    iput-object p1, v0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->e:Ll8/c;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lcom/zykj/study/repository/CourseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ll8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->d:Ll8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Ll8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->e:Ll8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final g(Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseViewModel$teachCourse$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/MyCourseViewModel$teachCourse$2;-><init>(Lcom/zykj/study/viewmodels/MyCourseViewModel;Lcom/zykj/study/data/MyCourseEntity;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2, p2}, Lcom/zykj/base/BaseViewModel;->launchAsyncData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
