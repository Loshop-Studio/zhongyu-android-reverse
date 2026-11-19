.class public final synthetic Lt6/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic a:Landroidx/paging/compose/LazyPagingItems;

.field public final synthetic b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/compose/LazyPagingItems;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/g0;->a:Landroidx/paging/compose/LazyPagingItems;

    iput-object p2, p0, Lt6/g0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p3, p0, Lt6/g0;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lt6/g0;->d:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lt6/g0;->a:Landroidx/paging/compose/LazyPagingItems;

    iget-object v1, p0, Lt6/g0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Lt6/g0;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lt6/g0;->d:Landroidx/navigation/NavController;

    move-object v4, p1

    check-cast v4, Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    move-object v6, p3

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p4, Ljava/lang/Integer;

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lt6/m0;->b(Landroidx/paging/compose/LazyPagingItems;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
