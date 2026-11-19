.class final synthetic Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtil_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final INVALID:Landroidx/paging/PagingSource$LoadResult;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/paging/PagingSource$LoadResult$Invalid;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/paging/PagingSource$LoadResult$Invalid;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtil_androidKt;->INVALID:Landroidx/paging/PagingSource$LoadResult;

    .line 7
    .line 8
    return-void
.end method

.method public static final getINVALID()Landroidx/paging/PagingSource$LoadResult;
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtil_androidKt;->INVALID:Landroidx/paging/PagingSource$LoadResult;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final queryDatabase(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomSQLiteQuery;Landroidx/room/RoomDatabase;ILandroid/os/CancellationSignal;Lhd/l;)Landroidx/paging/PagingSource$LoadResult;
    .locals 6
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Value:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;",
            "Landroidx/room/RoomSQLiteQuery;",
            "Landroidx/room/RoomDatabase;",
            "I",
            "Landroid/os/CancellationSignal;",
            "Lhd/l;",
            ")",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;"
        }
    .end annotation

    .line 1
    const-string v0, "params"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceQuery"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "db"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "convertRows"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Integer;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v0, v1

    .line 36
    :goto_0
    invoke-static {p0, v0}, Landroidx/room/paging/util/RoomPagingUtil;->getLimit(Landroidx/paging/PagingSource$LoadParams;I)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-static {p0, v0, p3}, Landroidx/room/paging/util/RoomPagingUtil;->getOffset(Landroidx/paging/PagingSource$LoadParams;II)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v3, "SELECT * FROM ( "

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroidx/room/RoomSQLiteQuery;->getSql()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v3, " ) LIMIT "

    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v3, " OFFSET "

    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v3, Landroidx/room/RoomSQLiteQuery;->Companion:Landroidx/room/RoomSQLiteQuery$Companion;

    .line 82
    .line 83
    invoke-virtual {p1}, Landroidx/room/RoomSQLiteQuery;->getArgCount()I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-virtual {v3, v0, v4}, Landroidx/room/RoomSQLiteQuery$Companion;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3, p1}, Landroidx/room/RoomSQLiteQuery;->copyArgumentsFrom(Landroidx/room/RoomSQLiteQuery;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v3, p4}, Landroidx/room/RoomDatabase;->query(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    :try_start_0
    invoke-interface {p5, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    check-cast p2, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 108
    .line 109
    .line 110
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    add-int/2addr p1, p0

    .line 115
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result p4

    .line 119
    const/4 p5, 0x0

    .line 120
    if-nez p4, :cond_2

    .line 121
    .line 122
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result p4

    .line 126
    if-lt p4, v2, :cond_2

    .line 127
    .line 128
    if-lt p1, p3, :cond_1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object p4

    .line 135
    goto :goto_2

    .line 136
    :cond_2
    :goto_1
    move-object p4, p5

    .line 137
    :goto_2
    if-lez p0, :cond_4

    .line 138
    .line 139
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eqz v0, :cond_3

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object p5

    .line 150
    :cond_4
    :goto_3
    move v0, p3

    .line 151
    move-object p3, p4

    .line 152
    move p4, p0

    .line 153
    new-instance p0, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 154
    .line 155
    sub-int p1, v0, p1

    .line 156
    .line 157
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    move-object v5, p5

    .line 162
    move p5, p1

    .line 163
    move-object p1, p2

    .line 164
    move-object p2, v5

    .line 165
    invoke-direct/range {p0 .. p5}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 166
    .line 167
    .line 168
    return-object p0

    .line 169
    :catchall_0
    move-exception v0

    .line 170
    move-object p0, v0

    .line 171
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 175
    .line 176
    .line 177
    throw p0
.end method

.method public static synthetic queryDatabase$default(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomSQLiteQuery;Landroidx/room/RoomDatabase;ILandroid/os/CancellationSignal;Lhd/l;ILjava/lang/Object;)Landroidx/paging/PagingSource$LoadResult;
    .locals 6

    .line 1
    and-int/lit8 p6, p6, 0x10

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    move-object v0, p0

    .line 7
    move-object v1, p1

    .line 8
    move-object v2, p2

    .line 9
    move v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-static/range {v0 .. v5}, Landroidx/room/paging/util/RoomPagingUtil;->queryDatabase(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomSQLiteQuery;Landroidx/room/RoomDatabase;ILandroid/os/CancellationSignal;Lhd/l;)Landroidx/paging/PagingSource$LoadResult;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static final queryItemCount(Landroidx/room/RoomSQLiteQuery;Landroidx/room/RoomDatabase;)I
    .locals 3
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    const-string v0, "sourceQuery"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "db"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "SELECT COUNT(*) FROM ( "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/room/RoomSQLiteQuery;->getSql()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, " )"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sget-object v1, Landroidx/room/RoomSQLiteQuery;->Companion:Landroidx/room/RoomSQLiteQuery$Companion;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/room/RoomSQLiteQuery;->getArgCount()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    invoke-virtual {v1, v0, v2}, Landroidx/room/RoomSQLiteQuery$Companion;->acquire(Ljava/lang/String;I)Landroidx/room/RoomSQLiteQuery;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0, p0}, Landroidx/room/RoomSQLiteQuery;->copyArgumentsFrom(Landroidx/room/RoomSQLiteQuery;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    const/4 v1, 0x2

    .line 52
    invoke-static {p1, v0, p0, v1, p0}, Landroidx/room/RoomDatabase;->query$default(Landroidx/room/RoomDatabase;Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;ILjava/lang/Object;)Landroid/database/Cursor;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    :try_start_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    const/4 v1, 0x0

    .line 61
    if-eqz p1, :cond_0

    .line 62
    .line 63
    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    .line 64
    .line 65
    .line 66
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 71
    .line 72
    .line 73
    return p1

    .line 74
    :catchall_0
    move-exception p1

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 80
    .line 81
    .line 82
    return v1

    .line 83
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/room/RoomSQLiteQuery;->release()V

    .line 87
    .line 88
    .line 89
    throw p1
.end method
