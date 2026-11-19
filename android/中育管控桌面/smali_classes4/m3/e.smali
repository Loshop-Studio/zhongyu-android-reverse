.class public final synthetic Lm3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Landroidx/paging/compose/LazyPagingItems;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/compose/LazyPagingItems;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/e;->a:Landroidx/paging/compose/LazyPagingItems;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/e;->a:Landroidx/paging/compose/LazyPagingItems;

    invoke-static {v0}, Lcom/zykj/gallery/ui/share/page/c;->k(Landroidx/paging/compose/LazyPagingItems;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
