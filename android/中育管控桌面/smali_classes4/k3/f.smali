.class public final synthetic Lk3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic a:Landroidx/paging/compose/LazyPagingItems;

.field public final synthetic b:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/compose/LazyPagingItems;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/f;->a:Landroidx/paging/compose/LazyPagingItems;

    iput-object p2, p0, Lk3/f;->b:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iput-object p3, p0, Lk3/f;->c:Ljava/util/List;

    iput-object p4, p0, Lk3/f;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lk3/f;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lk3/f;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, Lk3/f;->a:Landroidx/paging/compose/LazyPagingItems;

    iget-object v1, p0, Lk3/f;->b:Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;

    iget-object v2, p0, Lk3/f;->c:Ljava/util/List;

    iget-object v3, p0, Lk3/f;->d:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lk3/f;->e:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lk3/f;->f:Lkotlin/jvm/functions/Function1;

    move-object v6, p1

    check-cast v6, Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move-object v8, p3

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zykj/gallery/ui/gallery/screenList/GalleryListKt;->i(Landroidx/paging/compose/LazyPagingItems;Lcom/zykj/gallery/ui/gallery/screenList/ScreenState;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
