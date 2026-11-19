.class public final Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le3/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1",
        "Le3/a;",
        "",
        "Lcom/zykj/gallery/bean/GalleryImgBean;",
        "params",
        "Landroidx/paging/PagingSource;",
        "",
        "create",
        "(Lkotlin/Unit;)Landroidx/paging/PagingSource;",
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


# instance fields
.field final synthetic this$0:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;


# direct methods
.method public constructor <init>(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;->this$0:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;->create$lambda$0(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final create$lambda$0(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;I)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->access$isRecycleBinProvider$p(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p0}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->access$get_totalCount$p(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {p0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method


# virtual methods
.method public bridge synthetic create(Ljava/lang/Object;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;->create(Lkotlin/Unit;)Landroidx/paging/PagingSource;

    move-result-object p1

    return-object p1
.end method

.method public create(Lkotlin/Unit;)Landroidx/paging/PagingSource;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Unit;",
            ")",
            "Landroidx/paging/PagingSource<",
            "Ljava/lang/Integer;",
            "Lcom/zykj/gallery/bean/GalleryImgBean;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;->this$0:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    invoke-static {p1}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->access$getRepository$p(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)Lcom/zykj/gallery/repository/GalleryRepository;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;->this$0:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    invoke-static {v0}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;->access$isRecycleBinProvider$p(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)Lkotlin/jvm/functions/Function0;

    move-result-object v0

    .line 4
    new-instance v1, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;

    .line 5
    iget-object v2, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate$pagingDelegate$1;->this$0:Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    new-instance v3, Lcom/zykj/gallery/ui/gallery/commonState/a;

    invoke-direct {v3, v2}, Lcom/zykj/gallery/ui/gallery/commonState/a;-><init>(Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;)V

    const/16 v2, 0x28

    .line 6
    invoke-direct {v1, p1, v0, v2, v3}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function1;)V

    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v1, p1}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->d(Lkotlin/Unit;)Landroidx/paging/PagingSource;

    move-result-object p1

    return-object p1
.end method
