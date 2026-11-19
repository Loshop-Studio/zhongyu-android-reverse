.class public final Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La5/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La5/f;"
    }
.end annotation


# instance fields
.field private final isRecycleBinProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field

.field private final repositoryProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field

.field private final scopeProvider:La5/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La5/f;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(La5/f;La5/f;La5/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/f;",
            "La5/f;",
            "La5/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->repositoryProvider:La5/f;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->isRecycleBinProvider:La5/f;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->scopeProvider:La5/f;

    .line 9
    .line 10
    return-void
.end method

.method public static create(La5/f;La5/f;La5/f;)Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/f;",
            "La5/f;",
            "La5/f;",
            ")",
            "Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;-><init>(La5/f;La5/f;La5/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static newInstance(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/gallery/repository/GalleryRepository;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            ")",
            "Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;-><init>(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public get()Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->repositoryProvider:La5/f;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/zykj/gallery/repository/GalleryRepository;

    iget-object v1, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->isRecycleBinProvider:La5/f;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->scopeProvider:La5/f;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {v0, v1, v2}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->newInstance(Lcom/zykj/gallery/repository/GalleryRepository;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate_Factory;->get()Lcom/zykj/gallery/ui/gallery/commonState/GalleryStateDelegate;

    move-result-object v0

    return-object v0
.end method
