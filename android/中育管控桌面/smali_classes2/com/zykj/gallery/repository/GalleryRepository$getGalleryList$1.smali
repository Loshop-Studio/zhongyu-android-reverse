.class final Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/repository/GalleryRepository;->e(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.gallery.repository.GalleryRepository"
    f = "GalleryRepository.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x21
    }
    m = "getGalleryList"
    n = {
        "skipCount",
        "maxResultCount",
        "isRecycleBin"
    }
    s = {
        "I$0",
        "I$1",
        "Z$0"
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/zykj/gallery/repository/GalleryRepository;

.field public f:I


# direct methods
.method public constructor <init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->e:Lcom/zykj/gallery/repository/GalleryRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->d:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->f:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->f:I

    iget-object p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getGalleryList$1;->e:Lcom/zykj/gallery/repository/GalleryRepository;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lcom/zykj/gallery/repository/GalleryRepository;->e(IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
