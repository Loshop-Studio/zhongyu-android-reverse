# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public Lcom/zykj/study/viewmodels/StudentViewContentViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Landroidx/datastore/core/DataStore;

.field public final b:Lcom/zykj/study/repository/TeachCourseRepository;

.field public final c:Landroidx/lifecycle/MutableLiveData;

.field public final d:Ljava/util/HashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/core/DataStore;Lcom/zykj/study/repository/TeachCourseRepository;)V
    .locals 1

    .line 1
    const-string v0, "userDataStore"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "repository"

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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->b:Lcom/zykj/study/repository/TeachCourseRepository;

    .line 17
    .line 18
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    new-instance p1, Ljava/util/HashSet;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->d:Ljava/util/HashSet;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lcom/zykj/study/repository/TeachCourseRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->b:Lcom/zykj/study/repository/TeachCourseRepository;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/util/HashSet;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->d:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/StudentViewContentViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e(ILjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "userId"

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
    new-instance v2, Lcom/zykj/study/viewmodels/StudentViewContentViewModel$initMemberProgress$1;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/StudentViewContentViewModel$initMemberProgress$1;-><init>(Lcom/zykj/study/viewmodels/StudentViewContentViewModel;ILjava/lang/String;Lm7/c;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0, v1, v2}, Lcom/zykj/base/BaseViewModel;->launchData(Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;)Lkotlinx/coroutines/n;

    .line 21
    .line 22
    .line 23
    return-void
.end method
