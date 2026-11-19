.class public final synthetic Lt6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


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

    iput-object p1, p0, Lt6/a0;->a:Landroidx/paging/compose/LazyPagingItems;

    iput-object p2, p0, Lt6/a0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iput-object p3, p0, Lt6/a0;->c:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lt6/a0;->d:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lt6/a0;->a:Landroidx/paging/compose/LazyPagingItems;

    iget-object v1, p0, Lt6/a0;->b:Lcom/zykj/evaluation/ui/home/HomeViewModel;

    iget-object v2, p0, Lt6/a0;->c:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lt6/a0;->d:Landroidx/navigation/NavController;

    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    invoke-static {v0, v1, v2, v3, p1}, Lt6/m0;->k(Landroidx/paging/compose/LazyPagingItems;Lcom/zykj/evaluation/ui/home/HomeViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;Landroidx/compose/foundation/lazy/grid/LazyGridScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
