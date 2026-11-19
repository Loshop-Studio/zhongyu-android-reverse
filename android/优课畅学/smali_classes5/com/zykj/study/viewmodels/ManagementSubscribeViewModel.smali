.class public final Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Lcom/zykj/study/repository/SubscribeRepository;

.field public b:Landroidx/lifecycle/MutableLiveData;

.field public c:Landroidx/lifecycle/MutableLiveData;

.field public d:Lcom/zykj/study/bean/FreeSubscribeReq;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/study/repository/SubscribeRepository;)V
    .locals 10

    .line 1
    const-string v0, "subscribeRepository"

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
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->a:Lcom/zykj/study/repository/SubscribeRepository;

    .line 10
    .line 11
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 24
    .line 25
    invoke-direct {p1, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 29
    .line 30
    new-instance v1, Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    const/16 v9, 0x14

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x0

    .line 41
    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/bean/FreeSubscribeReq;-><init>(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;II)V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->d:Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 45
    .line 46
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;)Lcom/zykj/study/repository/SubscribeRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->a:Lcom/zykj/study/repository/SubscribeRepository;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final b(Lcom/zykj/study/bean/DeleteSubBatchReq;Lm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$deleteBatchSubscribe$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$deleteBatchSubscribe$2;-><init>(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;Lcom/zykj/study/bean/DeleteSubBatchReq;Lm7/c;)V

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

.method public final c(Lcom/zykj/study/bean/DeleteSubSingReq;Lm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$deleteSingSubscribe$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, v3}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$deleteSingSubscribe$2;-><init>(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;Lcom/zykj/study/bean/DeleteSubSingReq;Lm7/c;)V

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

.method public final d()Ll8/c;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->a:Lcom/zykj/study/repository/SubscribeRepository;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->d:Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/zykj/study/repository/SubscribeRepository;->e(Lcom/zykj/study/bean/FreeSubscribeReq;)Ll8/c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Li8/b0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Ll8/c;Li8/b0;)Ll8/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final e()Lcom/zykj/study/bean/FreeSubscribeReq;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->d:Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->c:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g(JLm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getOtherStudents$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getOtherStudents$2;-><init>(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;JLm7/c;)V

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

.method public final h(JLm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSelfGroup$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSelfGroup$2;-><init>(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;JLm7/c;)V

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

.method public final i(JLm7/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-direct {v2, p0, p1, p2, v3}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel$getSubscribeTab$2;-><init>(Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;JLm7/c;)V

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

.method public final j()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k(Lcom/zykj/study/bean/FreeSubscribeReq;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->d:Lcom/zykj/study/bean/FreeSubscribeReq;

    .line 7
    .line 8
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->b:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->a:Lcom/zykj/study/repository/SubscribeRepository;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/study/repository/SubscribeRepository;->k()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
