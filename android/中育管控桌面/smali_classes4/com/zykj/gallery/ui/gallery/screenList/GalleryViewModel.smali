.class public final Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;
.super Lcom/zykj/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0018\u0010\u0010J\u001b\u0010\u001c\u001a\u00020\n2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\n2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ#\u0010\"\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001f2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020!0\u0019\u00a2\u0006\u0004\u0008\"\u0010#J\r\u0010$\u001a\u00020\n\u00a2\u0006\u0004\u0008$\u0010\u0012J\u001b\u0010%\u001a\u00020\n2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\u0004\u0008%\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u00060(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u001d\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00060,8\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010-\u001a\u0004\u0008.\u0010/R\u001d\u00105\u001a\u0008\u0012\u0004\u0012\u00020\r018\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u00102\u001a\u0004\u00083\u00104R\u001a\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00080(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010*R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R#\u0010@\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\r0<0;8\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008=\u0010?R\u001d\u0010C\u001a\u0008\u0012\u0004\u0012\u00020A0,8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010-\u001a\u0004\u0008B\u0010/R/\u0010I\u001a\u0004\u0018\u00010\r2\u0008\u0010D\u001a\u0004\u0018\u00010\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00083\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010\u0010\u00a8\u0006J"
    }
    d2 = {
        "Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;",
        "Lcom/zykj/base/BaseViewModel;",
        "Lcom/zykj/gallery/repository/GalleryRepository;",
        "galleryRepository",
        "<init>",
        "(Lcom/zykj/gallery/repository/GalleryRepository;)V",
        "Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;",
        "newState",
        "",
        "needRefresh",
        "",
        "r",
        "(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Z)V",
        "Lcom/zykj/gallery/bean/GalleryImgBean;",
        "item",
        "s",
        "(Lcom/zykj/gallery/bean/GalleryImgBean;)V",
        "t",
        "()V",
        "isRecycleBin",
        "q",
        "(Z)V",
        "m",
        "entity",
        "o",
        "",
        "",
        "list",
        "l",
        "(Ljava/util/List;)V",
        "e",
        "Landroid/content/Context;",
        "context",
        "",
        "d",
        "(Landroid/content/Context;Ljava/util/List;)V",
        "c",
        "n",
        "a",
        "Lcom/zykj/gallery/repository/GalleryRepository;",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "b",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "_screenState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "h",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "screenState",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "i",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "selectedItems",
        "_isRecycleBin",
        "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;",
        "f",
        "Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;",
        "galleryStateDelegate",
        "Lkotlinx/coroutines/flow/Flow;",
        "Landroidx/paging/PagingData;",
        "g",
        "Lkotlinx/coroutines/flow/Flow;",
        "()Lkotlinx/coroutines/flow/Flow;",
        "listPager",
        "",
        "k",
        "totalCount",
        "<set-?>",
        "Landroidx/compose/runtime/MutableState;",
        "j",
        "()Lcom/zykj/gallery/bean/GalleryImgBean;",
        "p",
        "selectedPreviewImg",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGalleryViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryViewModel.kt\ncom/zykj/gallery/ui/gallery/screenList/GalleryViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n85#2:145\n113#2,2:146\n*S KotlinDebug\n*F\n+ 1 GalleryViewModel.kt\ncom/zykj/gallery/ui/gallery/screenList/GalleryViewModel\n*L\n86#1:145\n86#1:146,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lcom/zykj/gallery/repository/GalleryRepository;

.field public final b:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final c:Lkotlinx/coroutines/flow/StateFlow;

.field public final d:Landroidx/compose/runtime/snapshots/SnapshotStateList;

.field public final e:Lkotlinx/coroutines/flow/MutableStateFlow;

.field public final f:Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;

.field public final g:Lkotlinx/coroutines/flow/Flow;

.field public final h:Lkotlinx/coroutines/flow/StateFlow;

.field public final i:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/gallery/repository/GalleryRepository;)V
    .locals 3

    .line 1
    const-string v0, "galleryRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/base/BaseViewModel;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->a:Lcom/zykj/gallery/repository/GalleryRepository;

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;->a:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 18
    .line 19
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->c:Lkotlinx/coroutines/flow/StateFlow;

    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->d:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 30
    .line 31
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 38
    .line 39
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    .line 44
    .line 45
    new-instance v2, Lk3/n0;

    .line 46
    .line 47
    invoke-direct {v2, p0}, Lk3/n0;-><init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, p1, v2, v0}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V

    .line 51
    .line 52
    .line 53
    iput-object v1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->f:Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;

    .line 54
    .line 55
    invoke-interface {v1}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;->getListPagingFlow()Lkotlinx/coroutines/flow/Flow;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->g:Lkotlinx/coroutines/flow/Flow;

    .line 60
    .line 61
    invoke-interface {v1}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;->getTotalCount()Lkotlinx/coroutines/flow/StateFlow;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->h:Lkotlinx/coroutines/flow/StateFlow;

    .line 66
    .line 67
    const/4 p1, 0x0

    .line 68
    const/4 v0, 0x2

    .line 69
    invoke-static {p1, p1, v0, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->i:Landroidx/compose/runtime/MutableState;

    .line 74
    .line 75
    return-void
.end method

.method public static synthetic a(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->f(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic b(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)Lcom/zykj/gallery/repository/GalleryRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->a:Lcom/zykj/gallery/repository/GalleryRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final f(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final c()V
    .locals 6

    .line 1
    new-instance v3, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$clear$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v3, p0, v0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$clear$1;-><init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Lkotlin/coroutines/Continuation;)V

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
    invoke-static/range {v0 .. v5}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final d(Landroid/content/Context;Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "list"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$clearImgCache$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p1, p2, v0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$clearImgCache$1;-><init>(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final e(Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v4, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$clearImgClear$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$clearImgClear$1;-><init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x3

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g()Lkotlinx/coroutines/flow/Flow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->g:Lkotlinx/coroutines/flow/Flow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->c:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->d:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lcom/zykj/gallery/bean/GalleryImgBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->i:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/gallery/bean/GalleryImgBean;

    .line 8
    .line 9
    return-object v0
.end method

.method public final k()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->h:Lkotlinx/coroutines/flow/StateFlow;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v4, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$moveToRecycleBinAsync$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$moveToRecycleBinAsync$1;-><init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x3

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->f:Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryCommonState;->forceRefreshList()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v4, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$receiver$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$receiver$1;-><init>(Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;Ljava/util/List;Lkotlin/coroutines/Continuation;)V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x3

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/zykj/base/BaseViewModel;->launch$default(Lcom/zykj/base/BaseViewModel;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lcom/kunminx/architecture/ui/callback/UnPeekLiveData;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final o(Lcom/zykj/gallery/bean/GalleryImgBean;)V
    .locals 1

    .line 1
    const-string v0, "entity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->p(Lcom/zykj/gallery/bean/GalleryImgBean;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final p(Lcom/zykj/gallery/bean/GalleryImgBean;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->i:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->e:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->m()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final r(Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Z)V
    .locals 1

    .line 1
    const-string v0, "newState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->b:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    sget-object p2, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel$a;->a:[I

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    aget p1, p2, p1

    .line 20
    .line 21
    const/4 p2, 0x1

    .line 22
    if-eq p1, p2, :cond_2

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    if-eq p1, v0, :cond_2

    .line 26
    .line 27
    const/4 v0, 0x3

    .line 28
    if-eq p1, v0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x4

    .line 31
    if-ne p1, v0, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 35
    .line 36
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_0
    invoke-virtual {p0, p2}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->q(Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, p1}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->q(Z)V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method public final s(Lcom/zykj/gallery/bean/GalleryImgBean;)V
    .locals 1

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->d:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->d:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->d:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/screenList/GalleryViewModel;->d:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
