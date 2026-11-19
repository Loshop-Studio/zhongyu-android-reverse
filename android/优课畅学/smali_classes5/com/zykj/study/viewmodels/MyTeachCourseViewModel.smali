.class public final Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/TeachCourseRepository;

.field public final b:Ll8/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/TeachCourseRepository;)V
    .locals 1

    .line 1
    const-string v0, "respository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;->a:Lcom/zykj/study/repository/TeachCourseRepository;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/repository/TeachCourseRepository;->e()Ll8/c;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p1, v0}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Ll8/c;Li8/b0;)Ll8/c;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;->b:Ll8/c;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel$deleteTeachCourse$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel$deleteTeachCourse$2;-><init>(Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;Lcom/zykj/study/bean/course/CourseDetailsBean;Lm7/c;)V

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

.method public final b()Ll8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;->b:Ll8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lcom/zykj/study/repository/TeachCourseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/MyTeachCourseViewModel;->a:Lcom/zykj/study/repository/TeachCourseRepository;

    .line 2
    .line 3
    return-object v0
.end method
