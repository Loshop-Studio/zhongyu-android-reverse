.class final Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/gallery/repository/GalleryRepository;->h(Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0,
        0x0
    }
    l = {
        0x53
    }
    m = "getOssTokenFlow"
    n = {
        "userId",
        "fileType",
        "fileExt",
        "fileResource",
        "date",
        "uuid",
        "modulePath",
        "resPath",
        "reqStr",
        "sign",
        "tokenReq",
        "timeMillis"
    }
    s = {
        "L$0",
        "L$1",
        "L$2",
        "L$3",
        "L$4",
        "L$5",
        "L$6",
        "L$7",
        "L$8",
        "L$9",
        "L$10",
        "J$0"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:J

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lcom/zykj/gallery/repository/GalleryRepository;

.field public o:I


# direct methods
.method public constructor <init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->n:Lcom/zykj/gallery/repository/GalleryRepository;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->m:Ljava/lang/Object;

    iget p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->o:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->o:I

    iget-object v0, p0, Lcom/zykj/gallery/repository/GalleryRepository$getOssTokenFlow$1;->n:Lcom/zykj/gallery/repository/GalleryRepository;

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v9, p0

    invoke-static/range {v0 .. v9}, Lcom/zykj/gallery/repository/GalleryRepository;->a(Lcom/zykj/gallery/repository/GalleryRepository;Ljava/lang/String;Lcom/zykj/gallery/oss/FileType;Ljava/lang/String;Lcom/zykj/gallery/oss/FileResource;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
