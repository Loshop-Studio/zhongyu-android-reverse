.class public final Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/Flow;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->w(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/Flow;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

.field public final synthetic c:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/Flow;Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;->a:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;->b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;->a:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;->b:Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1;->c:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 8
    .line 9
    invoke-direct {v1, p1, v2, v3}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$startDownload$$inlined$map$1$2;-><init>(Lkotlinx/coroutines/flow/FlowCollector;Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, p2}, Lkotlinx/coroutines/flow/Flow;->collect(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p1
.end method
