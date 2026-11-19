# RE note 本类字节码直接引用的读写或显示接口包括DataStore。
.class public final Lcom/zykj/lib/login/ui/main/LoginViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final a:Landroidx/datastore/core/DataStore;

.field public final b:Landroidx/datastore/core/DataStore;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/datastore/core/DataStore;Landroidx/datastore/core/DataStore;)V
    .locals 1

    .line 1
    const-string v0, "serverDataStore"

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
    iput-object p1, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, v0}, Lcom/zykj/lib/login/ui/main/LoginViewModel$exitLogin$1;-><init>(Lcom/zykj/lib/login/ui/main/LoginViewModel;Lm7/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Landroidx/datastore/core/DataStore;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d(Lcom/zykj/lib/login/proto/ServerBean;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel;->a:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/lib/login/ui/main/LoginViewModel$setServerBean$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$setServerBean$2;-><init>(Lcom/zykj/lib/login/proto/ServerBean;Lm7/c;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1, p2}, Landroidx/datastore/core/DataStore;->updateData(Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p1
.end method

.method public final e(Lcom/zykj/lib/login/proto/UserBean;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/login/ui/main/LoginViewModel;->b:Landroidx/datastore/core/DataStore;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/lib/login/ui/main/LoginViewModel$setUserBean$2;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, Lcom/zykj/lib/login/ui/main/LoginViewModel$setUserBean$2;-><init>(Lcom/zykj/lib/login/proto/UserBean;Lm7/c;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1, p2}, Landroidx/datastore/core/DataStore;->updateData(Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p1
.end method
