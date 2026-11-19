.class public final synthetic Lk3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Landroidx/compose/foundation/lazy/grid/LazyGridState;

.field public final synthetic b:Landroidx/paging/compose/LazyPagingItems;

.field public final synthetic c:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/paging/compose/LazyPagingItems;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/b;->a:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iput-object p2, p0, Lk3/b;->b:Landroidx/paging/compose/LazyPagingItems;

    iput-object p3, p0, Lk3/b;->c:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-object p4, p0, Lk3/b;->d:Ljava/util/List;

    iput-object p5, p0, Lk3/b;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lk3/b;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lk3/b;->g:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lk3/b;->a:Landroidx/compose/foundation/lazy/grid/LazyGridState;

    iget-object v1, p0, Lk3/b;->b:Landroidx/paging/compose/LazyPagingItems;

    iget-object v2, p0, Lk3/b;->c:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-object v3, p0, Lk3/b;->d:Ljava/util/List;

    iget-object v4, p0, Lk3/b;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lk3/b;->f:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lk3/b;->g:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/BoxScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->f(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/paging/compose/LazyPagingItems;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
