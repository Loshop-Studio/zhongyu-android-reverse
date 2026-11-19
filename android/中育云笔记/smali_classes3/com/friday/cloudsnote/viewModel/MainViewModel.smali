.class public final Lcom/friday/cloudsnote/viewModel/MainViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/UserDao;

.field public final c:Lcom/friday/common/network/StudentSession;

.field public final d:Ld2/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/UserDao;Lcom/friday/common/network/StudentSession;Ld2/i;)V
    .locals 1

    .line 1
    const-string v0, "userDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "studentSession"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "ezyService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel;->b:Lcom/friday/common/dao/UserDao;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel;->c:Lcom/friday/common/network/StudentSession;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel;->d:Ld2/i;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic e(Lcom/friday/cloudsnote/viewModel/MainViewModel;)Ld2/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel;->d:Ld2/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/cloudsnote/viewModel/MainViewModel;)Lcom/friday/common/dao/UserDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel;->b:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final g(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 7

    .line 1
    const-string v0, "output"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/friday/cloudsnote/viewModel/MainViewModel$setUserInfo$1;-><init>(Lcom/zykj/message/server/bean/UserInfo;Lcom/friday/cloudsnote/viewModel/MainViewModel;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final h(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/cloudsnote/viewModel/MainViewModel;->c:Lcom/friday/common/network/StudentSession;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/friday/common/network/StudentSession;->l(Lcom/zykj/message/server/bean/ServerInfo;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/cloudsnote/viewModel/MainViewModel$uploadLog$1;-><init>(Lcom/friday/cloudsnote/viewModel/MainViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method
