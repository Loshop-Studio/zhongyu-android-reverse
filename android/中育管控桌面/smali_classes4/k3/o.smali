.class public final synthetic Lk3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/CoroutineScope;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Landroidx/paging/compose/LazyPagingItems;


# direct methods
.method public synthetic constructor <init>(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Landroidx/paging/compose/LazyPagingItems;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/o;->a:Lkotlinx/coroutines/CoroutineScope;

    iput-object p2, p0, Lk3/o;->b:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lk3/o;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lk3/o;->d:Landroidx/paging/compose/LazyPagingItems;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lk3/o;->a:Lkotlinx/coroutines/CoroutineScope;

    iget-object v1, p0, Lk3/o;->b:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lk3/o;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lk3/o;->d:Landroidx/paging/compose/LazyPagingItems;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->m(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/MutableState;Lkotlin/jvm/functions/Function0;Landroidx/paging/compose/LazyPagingItems;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
