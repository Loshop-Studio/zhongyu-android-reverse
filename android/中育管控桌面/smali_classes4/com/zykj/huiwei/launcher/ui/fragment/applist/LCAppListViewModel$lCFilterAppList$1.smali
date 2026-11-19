.class final Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;-><init>(Lkotlinx/coroutines/flow/MutableStateFlow;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/List<",
        "+",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;",
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
        "\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        "it",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;"
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
    c = "com.zykj.huiwei.launcher.ui.fragment.applist.LCAppListViewModel$lCFilterAppList$1"
    f = "LCAppListViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->c:Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->c:Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;

    invoke-direct {v0, v1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->a(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;->c:Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;->a(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method
