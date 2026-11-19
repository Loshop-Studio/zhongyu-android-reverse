.class public final Landroidx/paging/LegacyPagingSource;
.super Landroidx/paging/PagingSource;
.source "SourceFile"

# interfaces
.implements Landroidx/paging/CompatLegacyPagingSource;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/LegacyPagingSource$Companion;,
        Landroidx/paging/LegacyPagingSource$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Key:",
        "Ljava/lang/Object;",
        "Value:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/paging/PagingSource<",
        "TKey;TValue;>;",
        "Landroidx/paging/CompatLegacyPagingSource;"
    }
.end annotation


# static fields
.field private static final Companion:Landroidx/paging/LegacyPagingSource$Companion;

.field private static final PAGE_SIZE_NOT_SET:I = -0x80000000


# instance fields
.field private final dataSource:Landroidx/paging/DataSource;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/DataSource<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field

.field private final fetchContext:Lkotlin/coroutines/d;

.field private pageSize:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/paging/LegacyPagingSource$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/paging/LegacyPagingSource$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Landroidx/paging/LegacyPagingSource;->Companion:Landroidx/paging/LegacyPagingSource$Companion;

    return-void
.end method

.method public constructor <init>(Lkotlin/coroutines/d;Landroidx/paging/DataSource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/d;",
            "Landroidx/paging/DataSource<",
            "TKey;TValue;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "fetchContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "dataSource"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/paging/PagingSource;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Landroidx/paging/LegacyPagingSource;->fetchContext:Lkotlin/coroutines/d;

    .line 15
    .line 16
    iput-object p2, p0, Landroidx/paging/LegacyPagingSource;->dataSource:Landroidx/paging/DataSource;

    .line 17
    .line 18
    const/high16 p1, -0x80000000

    .line 19
    .line 20
    iput p1, p0, Landroidx/paging/LegacyPagingSource;->pageSize:I

    .line 21
    .line 22
    new-instance p1, Landroidx/paging/LegacyPagingSource$1;

    .line 23
    .line 24
    invoke-direct {p1, p0}, Landroidx/paging/LegacyPagingSource$1;-><init>(Landroidx/paging/LegacyPagingSource;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1}, Landroidx/paging/DataSource;->addInvalidatedCallback(Landroidx/paging/DataSource$InvalidatedCallback;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Landroidx/paging/y;

    .line 31
    .line 32
    invoke-direct {p1, p0}, Landroidx/paging/y;-><init>(Landroidx/paging/LegacyPagingSource;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Landroidx/paging/PagingSource;->registerInvalidatedCallback(Lhd/a;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private static final _init_$lambda$0(Landroidx/paging/LegacyPagingSource;)Lqc/q;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/LegacyPagingSource;->dataSource:Landroidx/paging/DataSource;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/LegacyPagingSource$2$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Landroidx/paging/LegacyPagingSource$2$1;-><init>(Landroidx/paging/LegacyPagingSource;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/paging/DataSource;->removeInvalidatedCallback(Landroidx/paging/DataSource$InvalidatedCallback;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroidx/paging/LegacyPagingSource;->dataSource:Landroidx/paging/DataSource;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/paging/DataSource;->invalidate()V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 17
    .line 18
    return-object p0
.end method

.method public static synthetic b(Landroidx/paging/LegacyPagingSource;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/paging/LegacyPagingSource;->_init_$lambda$0(Landroidx/paging/LegacyPagingSource;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method private final guessPageSize(Landroidx/paging/PagingSource$LoadParams;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "TKey;>;)I"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/paging/PagingSource$LoadParams$Refresh;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/paging/PagingSource$LoadParams$Refresh;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    rem-int/lit8 v1, v1, 0x3

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    div-int/lit8 p1, p1, 0x3

    .line 21
    .line 22
    return p1

    .line 23
    :cond_0
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method


# virtual methods
.method public final getDataSource$paging_common()Landroidx/paging/DataSource;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/DataSource<",
            "TKey;TValue;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/LegacyPagingSource;->dataSource:Landroidx/paging/DataSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public getJumpingSupported()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/paging/LegacyPagingSource;->dataSource:Landroidx/paging/DataSource;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/paging/DataSource;->getType$paging_common()Landroidx/paging/DataSource$KeyType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Landroidx/paging/DataSource$KeyType;->POSITIONAL:Landroidx/paging/DataSource$KeyType;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public getRefreshKey(Landroidx/paging/PagingState;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingState<",
            "TKey;TValue;>;)TKey;"
        }
    .end annotation

    .line 1
    const-string v0, "state"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/paging/LegacyPagingSource;->dataSource:Landroidx/paging/DataSource;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/paging/DataSource;->getType$paging_common()Landroidx/paging/DataSource$KeyType;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Landroidx/paging/LegacyPagingSource$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    aget v0, v1, v0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroidx/paging/PagingState;->getAnchorPosition()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p1, v0}, Landroidx/paging/PagingState;->closestItemToPosition(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    iget-object v0, p0, Landroidx/paging/LegacyPagingSource;->dataSource:Landroidx/paging/DataSource;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroidx/paging/DataSource;->getKeyInternal$paging_common(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1

    .line 53
    :cond_0
    return-object v2

    .line 54
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 55
    .line 56
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    return-object v2

    .line 61
    :cond_3
    invoke-virtual {p1}, Landroidx/paging/PagingState;->getAnchorPosition()Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_7

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {p1}, Landroidx/paging/PagingState;->access$getLeadingPlaceholderCount$p(Landroidx/paging/PagingState;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    sub-int v1, v0, v1

    .line 76
    .line 77
    const/4 v2, 0x0

    .line 78
    move v3, v2

    .line 79
    :goto_0
    invoke-virtual {p1}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v4}, Lrc/w;->p(Ljava/util/List;)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-ge v3, v4, :cond_4

    .line 88
    .line 89
    invoke-virtual {p1}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 98
    .line 99
    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-static {v4}, Lrc/w;->p(Ljava/util/List;)I

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-le v1, v4, :cond_4

    .line 108
    .line 109
    invoke-virtual {p1}, Landroidx/paging/PagingState;->getPages()Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    check-cast v4, Landroidx/paging/PagingSource$LoadResult$Page;

    .line 118
    .line 119
    invoke-virtual {v4}, Landroidx/paging/PagingSource$LoadResult$Page;->getData()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 124
    .line 125
    .line 126
    move-result v4

    .line 127
    sub-int/2addr v1, v4

    .line 128
    add-int/lit8 v3, v3, 0x1

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_4
    invoke-virtual {p1, v0}, Landroidx/paging/PagingState;->closestPageToPosition(I)Landroidx/paging/PagingSource$LoadResult$Page;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    if-eqz p1, :cond_5

    .line 136
    .line 137
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadResult$Page;->getPrevKey()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-nez p1, :cond_6

    .line 142
    .line 143
    :cond_5
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    :cond_6
    const-string v0, "null cannot be cast to non-null type kotlin.Int"

    .line 148
    .line 149
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    check-cast p1, Ljava/lang/Integer;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    add-int/2addr p1, v1

    .line 159
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    return-object p1

    .line 164
    :cond_7
    return-object v2
.end method

.method public load(Landroidx/paging/PagingSource$LoadParams;Lvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PagingSource$LoadParams<",
            "TKey;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/PagingSource$LoadResult<",
            "TKey;TValue;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/paging/PagingSource$LoadParams$Refresh;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    .line 6
    .line 7
    :goto_0
    move-object v2, v0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    instance-of v0, p1, Landroidx/paging/PagingSource$LoadParams$Append;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    instance-of v0, p1, Landroidx/paging/PagingSource$LoadParams$Prepend;

    .line 17
    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    sget-object v0, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :goto_1
    iget v0, p0, Landroidx/paging/LegacyPagingSource;->pageSize:I

    .line 24
    .line 25
    const/high16 v1, -0x80000000

    .line 26
    .line 27
    if-ne v0, v1, :cond_2

    .line 28
    .line 29
    const-string v0, "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould\'ve been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106"

    .line 30
    .line 31
    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0, p1}, Landroidx/paging/LegacyPagingSource;->guessPageSize(Landroidx/paging/PagingSource$LoadParams;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, Landroidx/paging/LegacyPagingSource;->pageSize:I

    .line 41
    .line 42
    :cond_2
    new-instance v1, Landroidx/paging/DataSource$Params;

    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getKey()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getLoadSize()I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {p1}, Landroidx/paging/PagingSource$LoadParams;->getPlaceholdersEnabled()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    iget v6, p0, Landroidx/paging/LegacyPagingSource;->pageSize:I

    .line 57
    .line 58
    invoke-direct/range {v1 .. v6}, Landroidx/paging/DataSource$Params;-><init>(Landroidx/paging/LoadType;Ljava/lang/Object;IZI)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Landroidx/paging/LegacyPagingSource;->fetchContext:Lkotlin/coroutines/d;

    .line 62
    .line 63
    new-instance v2, Landroidx/paging/LegacyPagingSource$load$2;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct {v2, p0, v1, p1, v3}, Landroidx/paging/LegacyPagingSource$load$2;-><init>(Landroidx/paging/LegacyPagingSource;Landroidx/paging/DataSource$Params;Landroidx/paging/PagingSource$LoadParams;Lvc/c;)V

    .line 67
    .line 68
    .line 69
    invoke-static {v0, v2, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1

    .line 74
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 75
    .line 76
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 77
    .line 78
    .line 79
    throw p1
.end method

.method public setPageSize(I)V
    .locals 2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/paging/LegacyPagingSource;->pageSize:I

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v0, "Page size is already set to "

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v0, p0, Landroidx/paging/LegacyPagingSource;->pageSize:I

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x2e

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0

    .line 44
    :cond_1
    :goto_0
    iput p1, p0, Landroidx/paging/LegacyPagingSource;->pageSize:I

    .line 45
    .line 46
    return-void
.end method
