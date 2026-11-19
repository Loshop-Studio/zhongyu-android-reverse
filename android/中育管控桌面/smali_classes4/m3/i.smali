.class public final synthetic Lm3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroidx/paging/compose/LazyPagingItems;


# direct methods
.method public synthetic constructor <init>(Landroidx/paging/compose/LazyPagingItems;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/i;->a:Landroidx/paging/compose/LazyPagingItems;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm3/i;->a:Landroidx/paging/compose/LazyPagingItems;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/gallery/ui/share/page/c;->q(Landroidx/paging/compose/LazyPagingItems;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
