.class final synthetic Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final getClippedRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Integer;
    .locals 1
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
            "Landroidx/paging/PagingState<",
            "Ljava/lang/Integer;",
            "TValue;>;)",
            "Ljava/lang/Integer;"
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
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getAnchorPosition()Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0}, Landroidx/paging/PagingState;->getConfig()Landroidx/paging/PagingConfig;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget p0, p0, Landroidx/paging/PagingConfig;->initialLoadSize:I

    .line 21
    .line 22
    div-int/lit8 p0, p0, 0x2

    .line 23
    .line 24
    sub-int/2addr v0, p0

    .line 25
    const/4 p0, 0x0

    .line 26
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static final getLimit(Landroidx/paging/PagingSource$LoadParams;I)I
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;I)I"
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
    instance-of v0, p0, Landroidx/paging/PagingSource$LoadParams$Prepend;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    check-cast p0, Landroidx/paging/PagingSource$LoadParams$Prepend;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ge p1, v0, :cond_0

    .line 17
    .line 18
    return p1

    .line 19
    :cond_0
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_1
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public static final getOffset(Landroidx/paging/PagingSource$LoadParams;II)I
    .locals 2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "Ljava/lang/Integer;",
            ">;II)I"
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
    instance-of v0, p0, Landroidx/paging/PagingSource$LoadParams$Prepend;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p0, Landroidx/paging/PagingSource$LoadParams$Prepend;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-ge p1, p2, :cond_0

    .line 18
    .line 19
    return v1

    .line 20
    :cond_0
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    sub-int/2addr p1, p0

    .line 25
    return p1

    .line 26
    :cond_1
    instance-of v0, p0, Landroidx/paging/PagingSource$LoadParams$Append;

    .line 27
    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    return p1

    .line 31
    :cond_2
    instance-of v0, p0, Landroidx/paging/PagingSource$LoadParams$Refresh;

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    check-cast p0, Landroidx/paging/PagingSource$LoadParams$Refresh;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sub-int v0, p2, v0

    .line 42
    .line 43
    if-lt p1, v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    sub-int/2addr p2, p0

    .line 50
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_3
    return p1

    .line 56
    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 57
    .line 58
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 59
    .line 60
    .line 61
    throw p0
.end method

.method public static final queryDatabase(Landroidx/paging/PagingSource$LoadParams;Landroidx/room/RoomRawQuery;ILhd/q;Lvc/c;)Ljava/lang/Object;
    .locals 10
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
            "Landroidx/room/RoomRawQuery;",
            "I",
            "Lhd/q;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "Ljava/lang/Integer;",
            "TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p4, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;

    .line 21
    .line 22
    invoke-direct {v0, p4}, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;-><init>(Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v4, :cond_1

    .line 38
    .line 39
    iget p0, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->I$2:I

    .line 40
    .line 41
    iget p1, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->I$1:I

    .line 42
    .line 43
    iget p2, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->I$0:I

    .line 44
    .line 45
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :goto_1
    move v8, p0

    .line 49
    goto :goto_4

    .line 50
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p0

    .line 58
    :cond_2
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    check-cast p4, Ljava/lang/Integer;

    .line 66
    .line 67
    if-eqz p4, :cond_3

    .line 68
    .line 69
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    move-result p4

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move p4, v3

    .line 75
    :goto_2
    invoke-static {p0, p4}, Landroidx/room/paging/util/RoomPagingUtil;->getLimit(Landroidx/paging/PagingSource$LoadParams;I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {p0, p4, p2}, Landroidx/room/paging/util/RoomPagingUtil;->getOffset(Landroidx/paging/PagingSource$LoadParams;II)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    add-int p4, v2, p0

    .line 84
    .line 85
    if-le p4, p2, :cond_4

    .line 86
    .line 87
    sub-int p4, p2, p0

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move p4, v2

    .line 91
    :goto_3
    new-instance v5, Landroidx/room/RoomRawQuery;

    .line 92
    .line 93
    new-instance v6, Ljava/lang/StringBuilder;

    .line 94
    .line 95
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 96
    .line 97
    .line 98
    const-string v7, "SELECT * FROM ( "

    .line 99
    .line 100
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroidx/room/RoomRawQuery;->getSql()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v7, " ) LIMIT "

    .line 111
    .line 112
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v7, " OFFSET "

    .line 119
    .line 120
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {p1}, Landroidx/room/RoomRawQuery;->getBindingFunction()Lhd/l;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-direct {v5, v6, p1}, Landroidx/room/RoomRawQuery;-><init>(Ljava/lang/String;Lhd/l;)V

    .line 135
    .line 136
    .line 137
    invoke-static {p4}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput p2, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->I$0:I

    .line 142
    .line 143
    iput v2, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->I$1:I

    .line 144
    .line 145
    iput p0, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->I$2:I

    .line 146
    .line 147
    iput v4, v0, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryDatabase$1;->label:I

    .line 148
    .line 149
    invoke-interface {p3, v5, p1, v0}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p4

    .line 153
    if-ne p4, v1, :cond_5

    .line 154
    .line 155
    return-object v1

    .line 156
    :cond_5
    move p1, v2

    .line 157
    goto :goto_1

    .line 158
    :goto_4
    move-object v5, p4

    .line 159
    check-cast v5, Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    add-int/2addr p0, v8

    .line 166
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 167
    .line 168
    .line 169
    move-result p3

    .line 170
    const/4 p4, 0x0

    .line 171
    if-nez p3, :cond_7

    .line 172
    .line 173
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result p3

    .line 177
    if-lt p3, p1, :cond_7

    .line 178
    .line 179
    if-lt p0, p2, :cond_6

    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_6
    invoke-static {p0}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    move-object v7, p1

    .line 187
    goto :goto_6

    .line 188
    :cond_7
    :goto_5
    move-object v7, p4

    .line 189
    :goto_6
    if-lez v8, :cond_9

    .line 190
    .line 191
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    if-eqz p1, :cond_8

    .line 196
    .line 197
    goto :goto_7

    .line 198
    :cond_8
    invoke-static {v8}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object p4

    .line 202
    :cond_9
    :goto_7
    move-object v6, p4

    .line 203
    new-instance v4, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 204
    .line 205
    sub-int/2addr p2, p0

    .line 206
    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    .line 207
    .line 208
    .line 209
    move-result v9

    .line 210
    invoke-direct/range {v4 .. v9}, Landroidx/paging/PagingSource$LoadResult$Page;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 211
    .line 212
    .line 213
    return-object v4
.end method

.method public static final queryItemCount(Landroidx/room/RoomRawQuery;Landroidx/room/RoomDatabase;Lvc/c;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/RoomRawQuery;",
            "Landroidx/room/RoomDatabase;",
            "Lvc/c<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SELECT COUNT(*) FROM ( "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/room/RoomRawQuery;->getSql()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " )"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, v0, p0, v2}, Landroidx/room/paging/util/RoomPagingUtil__RoomPagingUtilKt$queryItemCount$2;-><init>(Ljava/lang/String;Landroidx/room/RoomRawQuery;Lvc/c;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v1, p2}, Landroidx/room/RoomDatabaseKt;->useReaderConnection(Landroidx/room/RoomDatabase;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method
