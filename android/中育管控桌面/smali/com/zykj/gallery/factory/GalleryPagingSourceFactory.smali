.class public final Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le3/a;


# instance fields
.field public final a:Lcom/zykj/gallery/repository/GalleryRepository;

.field public final b:Lkotlin/jvm/functions/Function0;

.field public final c:I

.field public final d:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string/jumbo v0, "repository"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "isRecycleBinProvider"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v0, "onTotalCountLoaded"

    .line 14
    .line 15
    .line 16
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->a:Lcom/zykj/gallery/repository/GalleryRepository;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->b:Lkotlin/jvm/functions/Function0;

    .line 25
    .line 26
    iput p3, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->c:I

    .line 27
    .line 28
    iput-object p4, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->d:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    return-void
.end method

.method public static final synthetic a(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;)Lcom/zykj/gallery/repository/GalleryRepository;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->a:Lcom/zykj/gallery/repository/GalleryRepository;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;)Lkotlin/jvm/functions/Function0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->b:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public bridge synthetic create(Ljava/lang/Object;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    check-cast p1, Lkotlin/Unit;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->d(Lkotlin/Unit;)Landroidx/paging/PagingSource;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(Lkotlin/Unit;)Landroidx/paging/PagingSource;
    .locals 2

    .line 1
    const-string/jumbo v0, "params"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lcom/zykj/gallery/page/OffsetPagingSource;

    .line 8
    .line 9
    new-instance v0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, p0, v1}, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory$create$1;-><init>(Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;Lkotlin/coroutines/Continuation;)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, Lcom/zykj/gallery/factory/GalleryPagingSourceFactory;->c:I

    .line 16
    .line 17
    invoke-direct {p1, v0, v1}, Lcom/zykj/gallery/page/OffsetPagingSource;-><init>(Lkotlin/jvm/functions/Function3;I)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method
