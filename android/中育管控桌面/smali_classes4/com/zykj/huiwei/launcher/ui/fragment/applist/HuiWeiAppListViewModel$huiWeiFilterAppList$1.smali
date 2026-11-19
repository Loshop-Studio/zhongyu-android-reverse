.class final Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;Lcom/zykj/huiwei/launcher/api/HomeService;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;",
        ">;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        "appList",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;",
        "disableAppList",
        "Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.ui.fragment.applist.HuiWeiAppListViewModel$huiWeiFilterAppList$1"
    f = "HuiWeiAppListViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHuiWeiAppListViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HuiWeiAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n827#2:37\n855#2:38\n1761#2,3:39\n856#2:42\n*S KotlinDebug\n*F\n+ 1 HuiWeiAppListViewModel.kt\ncom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1\n*L\n22#1:37\n22#1:38\n23#1:39,3\n22#1:42\n*E\n"
    }
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;

    invoke-direct {v0, v1, p3}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->b:Ljava/lang/Object;

    iput-object p2, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->c:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Ljava/util/List;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->a(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->a:I

    .line 13
    .line 14
    if-nez v2, :cond_4

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_3

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v3, v2

    .line 39
    check-cast v3, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;

    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;->getPackageName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {v5}, Lcom/zykj/huiwei/launcher/bean/resp/DisableAppInfo;->getPackageName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    :goto_1
    invoke-interface {p1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel$huiWeiFilterAppList$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/applist/HuiWeiAppListViewModel;

    .line 86
    .line 87
    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;->a(Ljava/util/List;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1

    .line 92
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 93
    .line 94
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw p1
.end method
