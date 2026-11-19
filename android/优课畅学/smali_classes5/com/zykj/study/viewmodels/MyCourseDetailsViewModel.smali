# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;
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

.field public final d:Landroidx/lifecycle/LiveData;

.field public final e:Ll8/h;

.field public f:Landroidx/lifecycle/LiveData;

.field public g:I

.field public final h:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/CourseRepository;Landroidx/datastore/core/DataStore;Ll8/h;)V
    .locals 7

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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->c:Ll8/h;

    .line 24
    .line 25
    invoke-interface {p2}, Landroidx/datastore/core/DataStore;->getData()Ll8/c;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const/4 v5, 0x3

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const-wide/16 v3, 0x0

    .line 33
    .line 34
    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/FlowLiveDataConversions;->asLiveData$default(Ll8/c;Lkotlin/coroutines/d;JILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->d:Landroidx/lifecycle/LiveData;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 41
    .line 42
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, Ll8/r;->a(Ljava/lang/Object;)Ll8/h;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->e:Ll8/h;

    .line 59
    .line 60
    new-instance p1, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->h:Ljava/util/HashSet;

    .line 66
    .line 67
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;)Lcom/zykj/study/repository/CourseRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->s(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final c(ILjava/lang/String;IZ)V
    .locals 9

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;

    .line 15
    .line 16
    const/4 v8, 0x0

    .line 17
    move-object v3, p0

    .line 18
    move v4, p1

    .line 19
    move-object v5, p2

    .line 20
    move v6, p3

    .line 21
    move v7, p4

    .line 22
    invoke-direct/range {v2 .. v8}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$addCatalog$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILjava/lang/String;IZLm7/c;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final d(I)V
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
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$deleteChapter$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$deleteChapter$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final e(ILm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$deleteCourse$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$deleteCourse$2;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILm7/c;)V

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

.method public final f()Ll8/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->e:Ll8/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v3, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILm7/c;)V

    .line 9
    .line 10
    .line 11
    new-instance v4, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;

    .line 12
    .line 13
    invoke-direct {v4, p0, v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$getCatalogList$2;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    move-object v0, p0

    .line 20
    invoke-static/range {v0 .. v6}, Lcom/zykj/study/viewmodels/ViewModelExtKt;->c(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final h()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->g:I

    .line 2
    .line 3
    return v0
.end method

.method public final i()Ll8/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->c:Ll8/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "myCourseEntity"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final k()Ljava/util/HashSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->h:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->d:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m(I)V
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
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$ground$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$ground$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final n(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->g:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f:Landroidx/lifecycle/LiveData;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/zykj/study/repository/CourseRepository;->i(I)Landroidx/lifecycle/LiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->p(Landroidx/lifecycle/LiveData;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->g(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final o(Ljava/util/List;)V
    .locals 4

    .line 1
    const-string v0, "catalogBeanList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Ljava/util/List;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;

    .line 21
    .line 22
    invoke-direct {p1, p0, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$reorderCatalog$2;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0, v1, v2, p1}, Lcom/zykj/study/viewmodels/ViewModelExtKt;->b(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;Lx7/q;)Lkotlinx/coroutines/n;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final p(Landroidx/lifecycle/LiveData;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f:Landroidx/lifecycle/LiveData;

    .line 7
    .line 8
    return-void
.end method

.method public final q(I)V
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
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$undercarriage$1;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$undercarriage$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILm7/c;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final r(ILjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->getToastLiveData()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Lcom/zykj/base/BaseViewModel;->isDialogVisible()Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalog$1;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalog$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;ILjava/lang/String;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launch(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final s(Lm7/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;->c:I

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
    iput v1, v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;-><init>(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;->c:I

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->a:Lcom/zykj/study/repository/CourseRepository;

    .line 54
    .line 55
    iget v2, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->g:I

    .line 56
    .line 57
    iput v3, v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel$updateCatalogWithoutScope$1;->c:I

    .line 58
    .line 59
    invoke-virtual {p1, v2, v0}, Lcom/zykj/study/repository/CourseRepository;->j(ILm7/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->e:Ll8/h;

    .line 69
    .line 70
    sget-object v1, Lkotlin/Result;->b:Lkotlin/Result$a;

    .line 71
    .line 72
    invoke-static {p1}, Lq4/a;->a(Ljava/util/List;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    new-instance v1, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v2, 0xa

    .line 79
    .line 80
    invoke-static {p1, v2}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_4

    .line 96
    .line 97
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lcom/zykj/study/bean/course/CatalogBean;

    .line 102
    .line 103
    iget-object v3, p0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->h:Ljava/util/HashSet;

    .line 104
    .line 105
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {v4}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    invoke-virtual {v2, v3}, Lr0/a;->setExpanded(Z)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-static {v1}, Lkotlin/Result;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, Lkotlin/Result;->a(Ljava/lang/Object;)Lkotlin/Result;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {v0, p1}, Ll8/h;->setValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 136
    .line 137
    return-object p1
.end method
