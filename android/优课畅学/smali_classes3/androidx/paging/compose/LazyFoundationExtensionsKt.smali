.class public final Landroidx/paging/compose/LazyFoundationExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final itemContentType(Landroidx/paging/compose/LazyPagingItems;Lx7/l;)Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/compose/LazyPagingItems<",
            "TT;>;",
            "Lx7/l;",
            ")",
            "Lx7/l;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemContentType$1;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemContentType$1;-><init>(Lx7/l;Landroidx/paging/compose/LazyPagingItems;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic itemContentType$default(Landroidx/paging/compose/LazyPagingItems;Lx7/l;ILjava/lang/Object;)Lx7/l;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1}, Landroidx/paging/compose/LazyFoundationExtensionsKt;->itemContentType(Landroidx/paging/compose/LazyPagingItems;Lx7/l;)Lx7/l;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final itemKey(Landroidx/paging/compose/LazyPagingItems;Lx7/l;)Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/compose/LazyPagingItems<",
            "TT;>;",
            "Lx7/l;",
            ")",
            "Lx7/l;"
        }
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, Landroidx/paging/compose/LazyFoundationExtensionsKt$itemKey$1;-><init>(Lx7/l;Landroidx/paging/compose/LazyPagingItems;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic itemKey$default(Landroidx/paging/compose/LazyPagingItems;Lx7/l;ILjava/lang/Object;)Lx7/l;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1}, Landroidx/paging/compose/LazyFoundationExtensionsKt;->itemKey(Landroidx/paging/compose/LazyPagingItems;Lx7/l;)Lx7/l;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
