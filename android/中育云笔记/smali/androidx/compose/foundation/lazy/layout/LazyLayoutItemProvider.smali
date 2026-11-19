.class public interface abstract Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation


# virtual methods
.method public abstract Item(ILjava/lang/Object;Landroidx/compose/runtime/Composer;I)V
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation
.end method

.method public getContentType(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getIndex(Ljava/lang/Object;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public abstract getItemCount()I
.end method

.method public getKey(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/compose/foundation/lazy/layout/Lazy_androidKt;->getDefaultLazyLayoutKey(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
