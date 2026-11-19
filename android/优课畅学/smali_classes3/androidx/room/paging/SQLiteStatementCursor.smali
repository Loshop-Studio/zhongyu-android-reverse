.class public final Landroidx/room/paging/SQLiteStatementCursor;
.super Landroid/database/AbstractCursor;
.source "SourceFile"


# instance fields
.field private final rowCount:I

.field private final statement:Landroidx/sqlite/SQLiteStatement;


# direct methods
.method public constructor <init>(Landroidx/sqlite/SQLiteStatement;I)V
    .locals 1

    .line 1
    const-string v0, "statement"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroid/database/AbstractCursor;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 10
    .line 11
    iput p2, p0, Landroidx/room/paging/SQLiteStatementCursor;->rowCount:I

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public getColumnNames()[Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/sqlite/SQLiteStatement;->getColumnNames()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/String;

    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, [Ljava/lang/String;

    .line 15
    .line 16
    return-object v0
.end method

.method public getCount()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->rowCount:I

    .line 2
    .line 3
    return v0
.end method

.method public getDouble(I)D
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/sqlite/SQLiteStatement;->getDouble(I)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getFloat(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/sqlite/SQLiteStatement;->getFloat(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getInt(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/sqlite/SQLiteStatement;->getInt(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLong(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public getShort(I)S
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/sqlite/SQLiteStatement;->getLong(I)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-int p1, v0

    .line 8
    int-to-short p1, p1

    .line 9
    return p1
.end method

.method public getString(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/sqlite/SQLiteStatement;->getText(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public isNull(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/sqlite/SQLiteStatement;->isNull(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public onMove(II)Z
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-ne p1, p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/room/paging/SQLiteStatementCursor;->statement:Landroidx/sqlite/SQLiteStatement;

    .line 6
    .line 7
    invoke-interface {p1}, Landroidx/sqlite/SQLiteStatement;->step()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string p2, "Compat cursor can only move forward one position at a time."

    .line 15
    .line 16
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1
.end method
