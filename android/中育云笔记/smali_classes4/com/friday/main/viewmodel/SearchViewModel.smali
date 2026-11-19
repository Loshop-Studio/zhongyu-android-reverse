.class public final Lcom/friday/main/viewmodel/SearchViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lj2/d;

.field public final d:Lu3/b;

.field public final e:Lcom/friday/common/dao/ResourceDao;

.field public final f:Lvd/l;

.field public final g:Lvd/c;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/MutableLiveData;

.field public final j:Landroidx/lifecycle/MutableLiveData;

.field public final k:Landroidx/lifecycle/MutableLiveData;

.field public final l:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lj2/d;Lu3/b;Lcom/friday/common/dao/ResourceDao;)V
    .locals 1

    .line 1
    const-string v0, "fileDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "homeService"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "resourceDao"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/friday/main/viewmodel/SearchViewModel;->c:Lj2/d;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/friday/main/viewmodel/SearchViewModel;->d:Lu3/b;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/friday/main/viewmodel/SearchViewModel;->e:Lcom/friday/common/dao/ResourceDao;

    .line 31
    .line 32
    const-string p1, ""

    .line 33
    .line 34
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->f:Lvd/l;

    .line 39
    .line 40
    const-wide/16 p2, 0xc8

    .line 41
    .line 42
    invoke-static {p1, p2, p3}, Lvd/e;->O(Lvd/c;J)Lvd/c;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Lvd/e;->n(Lvd/c;)Lvd/c;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance p2, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;

    .line 51
    .line 52
    const/4 p3, 0x0

    .line 53
    invoke-direct {p2, p3, p0}, Lcom/friday/main/viewmodel/SearchViewModel$special$$inlined$flatMapLatest$1;-><init>(Lvc/c;Lcom/friday/main/viewmodel/SearchViewModel;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Lvd/e;->T(Lvd/c;Lhd/q;)Lvd/c;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->g:Lvd/c;

    .line 61
    .line 62
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 63
    .line 64
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 68
    .line 69
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 70
    .line 71
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 75
    .line 76
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 77
    .line 78
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 82
    .line 83
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 84
    .line 85
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 86
    .line 87
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 91
    .line 92
    return-void
.end method

.method public static synthetic e(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/main/viewmodel/SearchViewModel;->o(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/main/viewmodel/SearchViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/main/viewmodel/SearchViewModel;)Lj2/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->c:Lj2/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/main/viewmodel/SearchViewModel;)Lu3/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->d:Lu3/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;)Lcom/friday/common/entity/FileEntity;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/main/viewmodel/SearchViewModel;->s(Lcom/friday/common/entity/FileEntity;)Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final o(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method private final s(Lcom/friday/common/entity/FileEntity;)Lcom/friday/common/entity/FileEntity;
    .locals 14

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    const/16 v2, 0x1e

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    const/4 v4, 0x5

    .line 17
    const/4 v5, 0x4

    .line 18
    const/4 v6, 0x2

    .line 19
    const/4 v7, 0x1

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eq v0, v7, :cond_1

    .line 27
    .line 28
    if-eq v0, v6, :cond_1

    .line 29
    .line 30
    if-eq v0, v5, :cond_1

    .line 31
    .line 32
    if-eq v0, v4, :cond_0

    .line 33
    .line 34
    if-eq v0, v3, :cond_0

    .line 35
    .line 36
    if-eq v0, v2, :cond_0

    .line 37
    .line 38
    invoke-virtual {p1, v1}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_0
    invoke-virtual {p1, v7}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_1
    invoke-virtual {p1, v6}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_2
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-direct {p0}, Lcom/friday/main/viewmodel/SearchViewModel;->y()J

    .line 57
    .line 58
    .line 59
    move-result-wide v9

    .line 60
    invoke-interface {v0, v8, v9, v10}, Lcom/friday/common/dao/FileDao;->T(Ljava/lang/String;J)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ljava/lang/Iterable;

    .line 65
    .line 66
    instance-of v8, v0, Ljava/util/Collection;

    .line 67
    .line 68
    if-eqz v8, :cond_3

    .line 69
    .line 70
    move-object v9, v0

    .line 71
    check-cast v9, Ljava/util/Collection;

    .line 72
    .line 73
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_3

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    :cond_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eqz v10, :cond_5

    .line 89
    .line 90
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    check-cast v10, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    filled-new-array {v11, v12, v13}, [Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    invoke-static {v11, v10}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v10

    .line 124
    if-eqz v10, :cond_4

    .line 125
    .line 126
    invoke-virtual {p1, v7}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    :cond_5
    :goto_0
    if-eqz v8, :cond_6

    .line 131
    .line 132
    move-object v2, v0

    .line 133
    check-cast v2, Ljava/util/Collection;

    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-eqz v2, :cond_6

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-eqz v2, :cond_8

    .line 151
    .line 152
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    check-cast v2, Ljava/lang/Number;

    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 159
    .line 160
    .line 161
    move-result v2

    .line 162
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    filled-new-array {v3, v4, v8}, [Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-static {v3, v2}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    if-eqz v2, :cond_7

    .line 187
    .line 188
    invoke-virtual {p1, v6}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 189
    .line 190
    .line 191
    return-object p1

    .line 192
    :cond_8
    :goto_1
    invoke-virtual {p1, v1}, Lcom/friday/common/entity/FileEntity;->setSyncStatus(I)V

    .line 193
    .line 194
    .line 195
    return-object p1
.end method

.method private final y()J
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0
.end method


# virtual methods
.method public final j(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->g:I

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
    iput v1, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->g:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->e:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->g:I

    .line 34
    .line 35
    const/4 v8, 0x2

    .line 36
    const/4 v2, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    if-ne v1, v8, :cond_1

    .line 42
    .line 43
    iget-object p1, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->d:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Ljava/util/List;

    .line 46
    .line 47
    iget-object p1, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_4

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 66
    .line 67
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->e:Lcom/friday/common/dao/ResourceDao;

    .line 75
    .line 76
    move p2, v2

    .line 77
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iput-object p1, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->c:Ljava/lang/Object;

    .line 82
    .line 83
    iput p2, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->g:I

    .line 84
    .line 85
    const-wide/16 v3, 0x0

    .line 86
    .line 87
    const/4 v6, 0x2

    .line 88
    const/4 v7, 0x0

    .line 89
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    if-ne p2, v0, :cond_4

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_4
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 97
    .line 98
    move-object v1, p2

    .line 99
    check-cast v1, Ljava/util/Collection;

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_7

    .line 106
    .line 107
    iget-object v1, p0, Lcom/friday/main/viewmodel/SearchViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->c:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->d:Ljava/lang/Object;

    .line 124
    .line 125
    iput v8, v5, Lcom/friday/main/viewmodel/SearchViewModel$doesFileExits$1;->g:I

    .line 126
    .line 127
    invoke-interface {v1, v2, v5}, Lcom/friday/common/dao/FileDao;->Y(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    if-ne p2, v0, :cond_5

    .line 132
    .line 133
    :goto_3
    return-object v0

    .line 134
    :cond_5
    :goto_4
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 135
    .line 136
    if-eqz p2, :cond_6

    .line 137
    .line 138
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    goto :goto_5

    .line 143
    :cond_6
    const/4 p1, 0x0

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 150
    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    const-string p1, "index.json"

    .line 163
    .line 164
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    :goto_5
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    return-object p1
.end method

.method public final k(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;->f:I

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
    iput v1, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;->f:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;->c:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/friday/main/viewmodel/SearchViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 58
    .line 59
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    iput-object v2, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/friday/main/viewmodel/SearchViewModel$doesOfficeAndMicroClassFileExits$1;->f:I

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Lcom/friday/common/dao/FileDao;->Y(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p2, v1, :cond_3

    .line 72
    .line 73
    return-object v1

    .line 74
    :cond_3
    :goto_1
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 75
    .line 76
    if-eqz p2, :cond_4

    .line 77
    .line 78
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    goto :goto_2

    .line 83
    :cond_4
    const/4 p1, 0x0

    .line 84
    :goto_2
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
.end method

.method public final l(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/SearchViewModel$downloadFile$2;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lvc/c;)V

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

.method public final m(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/SearchViewModel$downloadMicroClass$2;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lvc/c;)V

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

.method public final n(Lcom/friday/common/entity/FileEntity;)V
    .locals 3

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/main/viewmodel/SearchViewModel$downloadOffice$1;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, p1, v1}, Lcom/friday/main/viewmodel/SearchViewModel$downloadOffice$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lcom/friday/main/viewmodel/SearchViewModel$downloadOffice$2;

    .line 13
    .line 14
    invoke-direct {v2, p0, v1}, Lcom/friday/main/viewmodel/SearchViewModel$downloadOffice$2;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lw3/o;

    .line 18
    .line 19
    invoke-direct {v1, p0, p1}, Lw3/o;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v2, v1}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final p(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/SearchViewModel$downloadTxt$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/SearchViewModel$downloadTxt$1;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/SearchViewModel$downloadTxt$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/SearchViewModel$downloadTxt$2;-><init>(Lcom/friday/main/viewmodel/SearchViewModel;Lvc/c;)V

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

.method public final q()Lvd/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->g:Lvd/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w(Lcom/friday/common/entity/FileEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final x(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "keyword"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/main/viewmodel/SearchViewModel;->f:Lvd/l;

    .line 7
    .line 8
    :cond_0
    invoke-interface {v0}, Lvd/l;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    move-object v2, v1

    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    invoke-interface {v0, v1, p1}, Lvd/l;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return-void
.end method
