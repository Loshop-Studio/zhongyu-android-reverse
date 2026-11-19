.class public final Landroidx/paging/CombinedLoadStatesKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final awaitNotLoading(Lvd/c;Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/c;",
            "Lvc/c<",
            "Landroidx/paging/CombinedLoadStates;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    invoke-static {p0, v0, v1}, Lvd/e;->m(Lvd/c;J)Lvd/c;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Landroidx/paging/CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Landroidx/paging/CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1;-><init>(Lvd/c;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p1}, Lvd/e;->z(Lvd/c;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
