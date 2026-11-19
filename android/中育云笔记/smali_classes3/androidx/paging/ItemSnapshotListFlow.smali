.class public final Landroidx/paging/ItemSnapshotListFlow;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/ItemSnapshotListFlow;->asItemSnapshotListFlow$lambda$0(Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final asItemSnapshotListFlow(Lvd/c;Lhd/l;)Lvd/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lvd/c;",
            "Lhd/l;",
            ")",
            "Lvd/c;"
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
    const-string v0, "onLoadError"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 12
    .line 13
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v1, p0, v0, p1, v2}, Landroidx/paging/ItemSnapshotListFlow$asItemSnapshotListFlow$2;-><init>(Lvd/c;Lkotlin/jvm/internal/Ref$ObjectRef;Lhd/l;Lvc/c;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lvd/e;->g(Lhd/p;)Lvd/c;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static synthetic asItemSnapshotListFlow$default(Lvd/c;Lhd/l;ILjava/lang/Object;)Lvd/c;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p1, Landroidx/paging/w;

    .line 6
    .line 7
    invoke-direct {p1}, Landroidx/paging/w;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p0, p1}, Landroidx/paging/ItemSnapshotListFlow;->asItemSnapshotListFlow(Lvd/c;Lhd/l;)Lvd/c;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method private static final asItemSnapshotListFlow$lambda$0(Landroidx/paging/CombinedLoadStates;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method
