.class public final Lcom/friday/document/viewmodel/RecycleBinViewModel;
.super Lcom/friday/document/viewmodel/BaseFileViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final K:Lvd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;)V
    .locals 11

    .line 1
    const-string v0, "fileDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "resourceDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "documentService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "fileManager"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/friday/document/viewmodel/BaseFileViewModel;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Ls2/a;Lcom/friday/document/service/FileManager;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Landroidx/paging/Pager;

    .line 25
    .line 26
    new-instance v2, Landroidx/paging/PagingConfig;

    .line 27
    .line 28
    const/16 v9, 0x3e

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    const/16 v3, 0x14

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    invoke-direct/range {v2 .. v10}, Landroidx/paging/PagingConfig;-><init>(IIZIIIILkotlin/jvm/internal/n;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, Lz2/q;

    .line 42
    .line 43
    invoke-direct {v4, p1, p0}, Lz2/q;-><init>(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/RecycleBinViewModel;)V

    .line 44
    .line 45
    .line 46
    const/4 v5, 0x2

    .line 47
    const/4 v6, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    invoke-direct/range {v1 .. v6}, Landroidx/paging/Pager;-><init>(Landroidx/paging/PagingConfig;Ljava/lang/Object;Lhd/a;ILkotlin/jvm/internal/n;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Landroidx/paging/Pager;->getFlow()Lvd/c;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-static {p1, p2}, Lvd/e;->E(Lvd/c;Lkotlin/coroutines/d;)Lvd/c;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance p2, Lcom/friday/document/viewmodel/RecycleBinViewModel$special$$inlined$map$1;

    .line 65
    .line 66
    invoke-direct {p2, p1, p0}, Lcom/friday/document/viewmodel/RecycleBinViewModel$special$$inlined$map$1;-><init>(Lvd/c;Lcom/friday/document/viewmodel/RecycleBinViewModel;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p2, p1}, Landroidx/paging/CachedPagingDataKt;->cachedIn(Lvd/c;Lsd/i0;)Lvd/c;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel;->K:Lvd/c;

    .line 78
    .line 79
    return-void
.end method

.method public static synthetic D0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/RecycleBinViewModel;)Landroidx/paging/PagingSource;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->I0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/RecycleBinViewModel;)Landroidx/paging/PagingSource;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E0(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->J0(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic F0(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->M0(Lcom/friday/common/entity/FileEntity;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic G0(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->N0(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final I0(Lcom/friday/common/dao/FileDao;Lcom/friday/document/viewmodel/RecycleBinViewModel;)Landroidx/paging/PagingSource;
    .locals 3

    .line 1
    const-string v0, "-1"

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-interface {p0, v0, v1, v2}, Lcom/friday/common/dao/FileDao;->Q(Ljava/lang/String;J)Landroidx/paging/PagingSource;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final H0()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    const/4 v4, 0x6

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    move-object v0, p0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final J0(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->n:I

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
    iput v1, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->l:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->n:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget p1, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->j:I

    .line 43
    .line 44
    iget-object p2, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->i:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 47
    .line 48
    iget-object p2, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->g:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p2, Ljava/util/Iterator;

    .line 51
    .line 52
    iget-object v2, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->f:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/lang/Iterable;

    .line 55
    .line 56
    iget-object v5, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v5, Ljava/util/List;

    .line 59
    .line 60
    iget-object v6, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v6, Ljava/util/List;

    .line 63
    .line 64
    iget-object v7, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->c:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v7, Lcom/friday/common/entity/FileEntity;

    .line 67
    .line 68
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1

    .line 80
    :cond_2
    iget-object p1, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->d:Ljava/lang/Object;

    .line 81
    .line 82
    move-object p2, p1

    .line 83
    check-cast p2, Ljava/util/List;

    .line 84
    .line 85
    iget-object p1, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 88
    .line 89
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    const-string p3, "0"

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {p3, v2}, Lcom/blankj/utilcode/util/StringUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result p3

    .line 106
    if-eqz p3, :cond_6

    .line 107
    .line 108
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 120
    .line 121
    .line 122
    move-result-wide v6

    .line 123
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    iput-object v8, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->c:Ljava/lang/Object;

    .line 128
    .line 129
    iput-object p2, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->d:Ljava/lang/Object;

    .line 130
    .line 131
    iput v5, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->n:I

    .line 132
    .line 133
    invoke-interface {p3, v2, v6, v7, v0}, Lcom/friday/common/dao/FileDao;->X(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    if-ne p3, v1, :cond_4

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    :goto_1
    check-cast p3, Ljava/util/List;

    .line 141
    .line 142
    move-object v2, p3

    .line 143
    check-cast v2, Ljava/util/Collection;

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    if-nez v2, :cond_7

    .line 150
    .line 151
    move-object v2, p3

    .line 152
    check-cast v2, Ljava/lang/Iterable;

    .line 153
    .line 154
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    move-object v7, p1

    .line 159
    move-object v6, p2

    .line 160
    move p1, v3

    .line 161
    move-object p2, v5

    .line 162
    move-object v5, p3

    .line 163
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    if-eqz p3, :cond_7

    .line 168
    .line 169
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p3

    .line 173
    move-object v8, p3

    .line 174
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 175
    .line 176
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    iput-object v9, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->c:Ljava/lang/Object;

    .line 181
    .line 182
    iput-object v6, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->d:Ljava/lang/Object;

    .line 183
    .line 184
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v9

    .line 188
    iput-object v9, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->e:Ljava/lang/Object;

    .line 189
    .line 190
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    iput-object v9, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->f:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object p2, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->g:Ljava/lang/Object;

    .line 197
    .line 198
    invoke-static {p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    iput-object p3, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->h:Ljava/lang/Object;

    .line 203
    .line 204
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object p3

    .line 208
    iput-object p3, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->i:Ljava/lang/Object;

    .line 209
    .line 210
    iput p1, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->j:I

    .line 211
    .line 212
    iput v3, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->k:I

    .line 213
    .line 214
    iput v4, v0, Lcom/friday/document/viewmodel/RecycleBinViewModel$delete$1;->n:I

    .line 215
    .line 216
    invoke-virtual {p0, v8, v6, v0}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->J0(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p3

    .line 220
    if-ne p3, v1, :cond_5

    .line 221
    .line 222
    :goto_3
    return-object v1

    .line 223
    :cond_6
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 228
    .line 229
    .line 230
    :cond_7
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 231
    .line 232
    return-object p1
.end method

.method public final K0(Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "fileIdList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$1;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Ljava/util/List;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$2;

    .line 13
    .line 14
    invoke-direct {v3, v0}, Lcom/friday/document/viewmodel/RecycleBinViewModel$deleteDocument$2;-><init>(Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final L0()Lvd/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel;->K:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M0(Lcom/friday/common/entity/FileEntity;)Z
    .locals 6

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd"

    .line 4
    .line 5
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Ljava/util/Date;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getExpiredTime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const/16 p1, 0x3e8

    .line 30
    .line 31
    int-to-long v4, p1

    .line 32
    mul-long/2addr v2, v4

    .line 33
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p1}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {v1, p1}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    return p1

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1
.end method

.method public final N0(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$resDelete$2;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p1
.end method
