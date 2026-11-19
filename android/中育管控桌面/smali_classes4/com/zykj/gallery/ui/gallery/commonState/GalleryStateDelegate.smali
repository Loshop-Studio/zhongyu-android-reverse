.class public final Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0014\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00180\u0017H\u0016J\u0008\u0010\u001c\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000fX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00180\u0017X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;",
        "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;",
        "repository",
        "Lcom/zykj/gallery/repository/GalleryRepository;",
        "isRecycleBinProvider",
        "Lkotlin/Function0;",
        "",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<init>",
        "(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V",
        "_totalCount",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "totalCount",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getTotalCount",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "pagingDelegate",
        "Lcom/zykj/gallery/page/PagingModuleDelegate;",
        "",
        "Lcom/zykj/gallery/bean/GalleryImgBean;",
        "listPager",
        "Lkotlinx/coroutines/flow/Flow;",
        "Landroidx/paging/PagingData;",
        "getListPager",
        "()Lkotlinx/coroutines/flow/Flow;",
        "getListPagingFlow",
        "forceRefreshList",
        "module_gallery_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _totalCount:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final isRecycleBinProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final listPager:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/paging/PagingData<",
            "Lcom/zykj/gallery/bean/GalleryImgBean;",
            ">;>;"
        }
    .end annotation
.end field

.field private final pagingDelegate:Lcom/zykj/gallery/page/PagingModuleDelegate;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/zykj/gallery/page/PagingModuleDelegate;"
        }
    .end annotation
.end field

.field private final repository:Lcom/zykj/gallery/repository/GalleryRepository;

.field private final scope:Lkotlinx/coroutines/CoroutineScope;

.field private final totalCount:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/gallery/repository/GalleryRepository;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "repository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "isRecycleBinProvider"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scope"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->repository:Lcom/zykj/gallery/repository/GalleryRepository;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->isRecycleBinProvider:Lkotlin/jvm/functions/Function0;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->_totalCount:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    .line 36
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->totalCount:Lkotlinx/coroutines/flow/StateFlow;

    .line 41
    .line 42
    new-instance p1, Lcom/zykj/gallery/page/PagingModuleDelegate;

    .line 43
    .line 44
    new-instance p2, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;

    .line 45
    .line 46
    invoke-direct {p2, p0}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;-><init>(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)V

    .line 47
    .line 48
    .line 49
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 50
    .line 51
    const/16 v1, 0x28

    .line 52
    .line 53
    invoke-direct {p1, p2, v0, v1, p3}, Lcom/zykj/gallery/page/PagingModuleDelegate;-><init>(Le3/a;Ljava/lang/Object;ILkotlinx/coroutines/CoroutineScope;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->pagingDelegate:Lcom/zykj/gallery/page/PagingModuleDelegate;

    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/zykj/gallery/page/PagingModuleDelegate;->d()Lkotlinx/coroutines/flow/Flow;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-static {p1, p3}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/flow/Flow;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->listPager:Lkotlinx/coroutines/flow/Flow;

    .line 67
    .line 68
    return-void
.end method

.method public static final synthetic access$getRepository$p(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)Lcom/zykj/gallery/repository/GalleryRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->repository:Lcom/zykj/gallery/repository/GalleryRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_totalCount$p(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->_totalCount:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$isRecycleBinProvider$p(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->isRecycleBinProvider:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public forceRefreshList()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->pagingDelegate:Lcom/zykj/gallery/page/PagingModuleDelegate;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/gallery/page/PagingModuleDelegate;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getListPager()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/paging/PagingData<",
            "Lcom/zykj/gallery/bean/GalleryImgBean;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->listPager:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    return-object v0
.end method

.method public getListPagingFlow()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Landroidx/paging/PagingData<",
            "Lcom/zykj/gallery/bean/GalleryImgBean;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->pagingDelegate:Lcom/zykj/gallery/page/PagingModuleDelegate;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/gallery/page/PagingModuleDelegate;->d()Lkotlinx/coroutines/flow/Flow;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getTotalCount()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->totalCount:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method
