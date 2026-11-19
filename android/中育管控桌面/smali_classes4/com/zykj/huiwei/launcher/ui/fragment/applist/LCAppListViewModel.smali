.class public final Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;
.super Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0008\u0007\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R#\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00030\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;",
        "Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "Lcom/zykj/huiwei/launcher/bean/BaseAppInfo;",
        "appList",
        "<init>",
        "(Lkotlinx/coroutines/flow/MutableStateFlow;)V",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/zykj/huiwei/launcher/bean/resp/AppData;",
        "a",
        "Lkotlinx/coroutines/flow/Flow;",
        "b",
        "()Lkotlinx/coroutines/flow/Flow;",
        "lCFilterAppList",
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
.field public final a:Lkotlinx/coroutines/flow/Flow;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/MutableStateFlow;)V
    .locals 2

    .line 1
    const-string v0, "appList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel$lCFilterAppList$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlinx/coroutines/flow/FlowKt;->mapLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;->a:Lkotlinx/coroutines/flow/Flow;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b()Lkotlinx/coroutines/flow/Flow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/applist/LCAppListViewModel;->a:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    return-object v0
.end method
