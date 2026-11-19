.class public Lio/objectbox/android/ObjectBoxDataSource;
.super Landroidx/paging/PositionalDataSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/objectbox/android/ObjectBoxDataSource$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/paging/PositionalDataSource<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lio/objectbox/query/Query;

.field public final b:Lq6/a;


# direct methods
.method public constructor <init>(Lio/objectbox/query/Query;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/paging/PositionalDataSource;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lio/objectbox/android/ObjectBoxDataSource;->a:Lio/objectbox/query/Query;

    .line 5
    .line 6
    new-instance v0, Lio/objectbox/android/ObjectBoxDataSource$a;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lio/objectbox/android/ObjectBoxDataSource$a;-><init>(Lio/objectbox/android/ObjectBoxDataSource;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lio/objectbox/android/ObjectBoxDataSource;->b:Lq6/a;

    .line 12
    .line 13
    invoke-virtual {p1}, Lio/objectbox/query/Query;->q()Lq6/g;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lq6/g;->b()Lq6/g;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Lq6/g;->c()Lq6/g;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1, v0}, Lq6/g;->a(Lq6/a;)Lq6/d;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method private loadRange(II)Ljava/util/List;
    .locals 3

    .line 2
    iget-object v0, p0, Lio/objectbox/android/ObjectBoxDataSource;->a:Lio/objectbox/query/Query;

    int-to-long v1, p1

    int-to-long p1, p2

    invoke-virtual {v0, v1, v2, p1, p2}, Lio/objectbox/query/Query;->k(JJ)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public loadInitial(Landroidx/paging/PositionalDataSource$LoadInitialParams;Landroidx/paging/PositionalDataSource$LoadInitialCallback;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lio/objectbox/android/ObjectBoxDataSource;->a:Lio/objectbox/query/Query;

    .line 2
    .line 3
    invoke-virtual {v0}, Lio/objectbox/query/Query;->count()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int v0, v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p2, p1, v0, v0}, Landroidx/paging/PositionalDataSource$LoadInitialCallback;->onResult(Ljava/util/List;II)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {p1, v0}, Landroidx/paging/PositionalDataSource;->computeInitialLoadPosition(Landroidx/paging/PositionalDataSource$LoadInitialParams;I)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static {p1, v1, v0}, Landroidx/paging/PositionalDataSource;->computeInitialLoadSize(Landroidx/paging/PositionalDataSource$LoadInitialParams;II)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-direct {p0, v1, p1}, Lio/objectbox/android/ObjectBoxDataSource;->loadRange(II)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-ne v3, p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {p2, v2, v1, v0}, Landroidx/paging/PositionalDataSource$LoadInitialCallback;->onResult(Ljava/util/List;II)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-virtual {p0}, Landroidx/paging/DataSource;->invalidate()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public loadRange(Landroidx/paging/PositionalDataSource$LoadRangeParams;Landroidx/paging/PositionalDataSource$LoadRangeCallback;)V
    .locals 1

    .line 1
    iget v0, p1, Landroidx/paging/PositionalDataSource$LoadRangeParams;->startPosition:I

    iget p1, p1, Landroidx/paging/PositionalDataSource$LoadRangeParams;->loadSize:I

    invoke-direct {p0, v0, p1}, Lio/objectbox/android/ObjectBoxDataSource;->loadRange(II)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/paging/PositionalDataSource$LoadRangeCallback;->onResult(Ljava/util/List;)V

    return-void
.end method
