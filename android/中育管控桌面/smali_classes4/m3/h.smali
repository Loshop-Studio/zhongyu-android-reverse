.class public final synthetic Lm3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/paging/compose/LazyPagingItems;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/h;->a:Landroidx/paging/compose/LazyPagingItems;

    iput-object p2, p0, Lm3/h;->b:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, Lm3/h;->c:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lm3/h;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lm3/h;->a:Landroidx/paging/compose/LazyPagingItems;

    iget-object v1, p0, Lm3/h;->b:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lm3/h;->c:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lm3/h;->d:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/compose/foundation/lazy/grid/LazyGridScope;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/gallery/ui/share/page/c;->f(Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/grid/LazyGridScope;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
