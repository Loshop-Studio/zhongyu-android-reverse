.class public final Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;
.super Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R#\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00030\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;",
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;",
        "appList",
        "Lcom/zykj/huiwei/launcher/api/HomeService;",
        "api",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/api/HomeService;)V",
        "",
        "d",
        "()V",
        "a",
        "Lcom/zykj/huiwei/launcher/api/HomeService;",
        "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;",
        "b",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "huiWeiDisableAppList",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        "c",
        "Lkotlinx/coroutines/flow/Flow;",
        "e",
        "()Lkotlinx/coroutines/flow/Flow;",
        "huiWeiFilterAppList",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Lcom/zykj/huiwei/launcher/api/HomeService;

.field public final b:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final c:Lkotlinx/coroutines/flow/Flow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/api/HomeService;)V
    .locals 2

    .line 1
    const-string v0, "appList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "api"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;->a:Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 15
    .line 16
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 25
    .line 26
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, v1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;Lkotlin/coroutines/Continuation;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/flow/FlowKt;->flowCombine(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;->c:Lkotlinx/coroutines/flow/Flow;

    .line 37
    .line 38
    return-void
.end method

.method public static final synthetic b(Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;)Lcom/zykj/huiwei/launcher/api/HomeService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;->a:Lcom/zykj/huiwei/launcher/api/HomeService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final d()V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$getAppList$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$getAppList$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;Lkotlin/coroutines/Continuation;)V

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
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launchData$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final e()Lkotlinx/coroutines/flow/Flow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;->c:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    return-object v0
.end method
