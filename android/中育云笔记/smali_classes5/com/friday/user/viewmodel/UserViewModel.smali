# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/friday/user/viewmodel/UserViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/UserDao;

.field public final c:Lcom/friday/common/dao/FileDao;

.field public final d:Lcom/friday/common/dao/ResourceDao;

.field public final e:Lc2/g2;

.field public final f:Lc2/v0;

.field public final g:Ld2/i;

.field public final h:Lvd/l;

.field public final i:Lvd/u;

.field public final j:Ljava/lang/String;

.field public final k:Landroidx/lifecycle/MutableLiveData;

.field public final l:Landroidx/compose/runtime/MutableState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/UserDao;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/g2;Lc2/v0;Ld2/i;)V
    .locals 1

    .line 1
    const-string v0, "userDao"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileDao"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "resourceDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "shareCacheDao"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "imageSafetyDao"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "ezyService"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel;->b:Lcom/friday/common/dao/UserDao;

    .line 35
    .line 36
    iput-object p2, p0, Lcom/friday/user/viewmodel/UserViewModel;->c:Lcom/friday/common/dao/FileDao;

    .line 37
    .line 38
    iput-object p3, p0, Lcom/friday/user/viewmodel/UserViewModel;->d:Lcom/friday/common/dao/ResourceDao;

    .line 39
    .line 40
    iput-object p4, p0, Lcom/friday/user/viewmodel/UserViewModel;->e:Lc2/g2;

    .line 41
    .line 42
    iput-object p5, p0, Lcom/friday/user/viewmodel/UserViewModel;->f:Lc2/v0;

    .line 43
    .line 44
    iput-object p6, p0, Lcom/friday/user/viewmodel/UserViewModel;->g:Ld2/i;

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/friday/user/viewmodel/UserViewModel;->o()V

    .line 47
    .line 48
    .line 49
    const-string p1, ""

    .line 50
    .line 51
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel;->h:Lvd/l;

    .line 56
    .line 57
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel;->i:Lvd/u;

    .line 62
    .line 63
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 68
    .line 69
    sget-object p3, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 70
    .line 71
    invoke-virtual {p3}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-virtual {p3}, Lcom/friday/common/helper/b;->t()J

    .line 76
    .line 77
    .line 78
    move-result-wide p3

    .line 79
    new-instance p5, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p1, "share"

    .line 91
    .line 92
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p5, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel;->j:Ljava/lang/String;

    .line 106
    .line 107
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 108
    .line 109
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 113
    .line 114
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 115
    .line 116
    const/4 p2, 0x0

    .line 117
    const/4 p3, 0x2

    .line 118
    invoke-static {p1, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel;->l:Landroidx/compose/runtime/MutableState;

    .line 123
    .line 124
    return-void
.end method

.method public static final synthetic e(Lcom/friday/user/viewmodel/UserViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/user/viewmodel/UserViewModel;->n(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/user/viewmodel/UserViewModel;)Ld2/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/user/viewmodel/UserViewModel;->g:Ld2/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/user/viewmodel/UserViewModel;->c:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/user/viewmodel/UserViewModel;->d:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/user/viewmodel/UserViewModel;)Lc2/g2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/user/viewmodel/UserViewModel;->e:Lc2/g2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/user/viewmodel/UserViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/user/viewmodel/UserViewModel;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/UserDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/user/viewmodel/UserViewModel;->b:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/user/viewmodel/UserViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/user/viewmodel/UserViewModel;->h:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final m()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1;-><init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lcom/friday/user/viewmodel/UserViewModel$clearCache$2;

    .line 8
    .line 9
    invoke-direct {v2, p0, v0}, Lcom/friday/user/viewmodel/UserViewModel$clearCache$2;-><init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v5}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final n(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p5

    .line 4
    .line 5
    instance-of v2, v0, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->r:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->r:I

    .line 22
    .line 23
    :goto_0
    move-object v7, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;-><init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->p:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->r:I

    .line 38
    .line 39
    const/4 v10, 0x2

    .line 40
    const/4 v12, 0x1

    .line 41
    if-eqz v3, :cond_3

    .line 42
    .line 43
    if-eq v3, v12, :cond_2

    .line 44
    .line 45
    if-ne v3, v10, :cond_1

    .line 46
    .line 47
    iget v3, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->n:I

    .line 48
    .line 49
    iget-object v4, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->m:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 52
    .line 53
    iget-object v5, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->l:Ljava/lang/Object;

    .line 54
    .line 55
    iget-object v6, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->k:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v6, Ljava/util/Iterator;

    .line 58
    .line 59
    iget-object v8, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->j:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, Ljava/util/ArrayList;

    .line 62
    .line 63
    iget-object v9, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->i:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v9, Ljava/util/HashSet;

    .line 66
    .line 67
    iget-object v13, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->h:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v13, Ljava/lang/Iterable;

    .line 70
    .line 71
    iget-object v14, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->g:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v14, Ljava/util/List;

    .line 74
    .line 75
    iget-object v15, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->f:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v15, Ljava/util/List;

    .line 78
    .line 79
    iget-object v10, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->e:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Ljava/util/List;

    .line 82
    .line 83
    iget-object v11, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->d:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, Ljava/lang/String;

    .line 86
    .line 87
    iget-object v12, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v12, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v12

    .line 95
    const/4 v12, 0x2

    .line 96
    goto/16 :goto_5

    .line 97
    .line 98
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 99
    .line 100
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 101
    .line 102
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v0

    .line 106
    :cond_2
    iget-object v3, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->f:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v3, Ljava/util/List;

    .line 109
    .line 110
    iget-object v4, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->e:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v4, Ljava/util/List;

    .line 113
    .line 114
    iget-object v5, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->d:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v5, Ljava/lang/String;

    .line 117
    .line 118
    iget-object v6, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v6, Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    move-object v11, v3

    .line 126
    move-object v10, v4

    .line 127
    move-object v3, v0

    .line 128
    move-object v0, v5

    .line 129
    goto :goto_2

    .line 130
    :cond_3
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    iget-object v3, v1, Lcom/friday/user/viewmodel/UserViewModel;->d:Lcom/friday/common/dao/ResourceDao;

    .line 134
    .line 135
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iput-object v0, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->c:Ljava/lang/Object;

    .line 140
    .line 141
    move-object/from16 v0, p2

    .line 142
    .line 143
    iput-object v0, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->d:Ljava/lang/Object;

    .line 144
    .line 145
    move-object/from16 v10, p3

    .line 146
    .line 147
    iput-object v10, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->e:Ljava/lang/Object;

    .line 148
    .line 149
    move-object/from16 v11, p4

    .line 150
    .line 151
    iput-object v11, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->f:Ljava/lang/Object;

    .line 152
    .line 153
    const/4 v4, 0x1

    .line 154
    iput v4, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->r:I

    .line 155
    .line 156
    const-wide/16 v5, 0x0

    .line 157
    .line 158
    const/4 v8, 0x2

    .line 159
    const/4 v9, 0x0

    .line 160
    move-object/from16 v4, p1

    .line 161
    .line 162
    invoke-static/range {v3 .. v9}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    if-ne v3, v2, :cond_4

    .line 167
    .line 168
    goto/16 :goto_4

    .line 169
    .line 170
    :cond_4
    move-object/from16 v6, p1

    .line 171
    .line 172
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 173
    .line 174
    move-object v4, v3

    .line 175
    check-cast v4, Ljava/lang/Iterable;

    .line 176
    .line 177
    new-instance v5, Ljava/util/HashSet;

    .line 178
    .line 179
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 180
    .line 181
    .line 182
    new-instance v8, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    move-object v14, v3

    .line 192
    move-object v13, v4

    .line 193
    move-object v12, v6

    .line 194
    move-object v6, v9

    .line 195
    move-object v15, v11

    .line 196
    const/4 v3, 0x0

    .line 197
    move-object v11, v0

    .line 198
    move-object v9, v5

    .line 199
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_8

    .line 204
    .line 205
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    move-object v4, v5

    .line 210
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 211
    .line 212
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getResourceType()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_5

    .line 224
    .line 225
    iget-object v0, v1, Lcom/friday/user/viewmodel/UserViewModel;->f:Lc2/v0;

    .line 226
    .line 227
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    move-object/from16 p1, v12

    .line 232
    .line 233
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v12

    .line 237
    iput-object v12, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->c:Ljava/lang/Object;

    .line 238
    .line 239
    iput-object v11, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->d:Ljava/lang/Object;

    .line 240
    .line 241
    iput-object v10, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->e:Ljava/lang/Object;

    .line 242
    .line 243
    iput-object v15, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->f:Ljava/lang/Object;

    .line 244
    .line 245
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v12

    .line 249
    iput-object v12, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->g:Ljava/lang/Object;

    .line 250
    .line 251
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v12

    .line 255
    iput-object v12, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->h:Ljava/lang/Object;

    .line 256
    .line 257
    iput-object v9, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->i:Ljava/lang/Object;

    .line 258
    .line 259
    iput-object v8, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->j:Ljava/lang/Object;

    .line 260
    .line 261
    iput-object v6, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->k:Ljava/lang/Object;

    .line 262
    .line 263
    iput-object v5, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->l:Ljava/lang/Object;

    .line 264
    .line 265
    iput-object v4, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->m:Ljava/lang/Object;

    .line 266
    .line 267
    iput v3, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->n:I

    .line 268
    .line 269
    const/4 v12, 0x0

    .line 270
    iput v12, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->o:I

    .line 271
    .line 272
    const/4 v12, 0x2

    .line 273
    iput v12, v7, Lcom/friday/user/viewmodel/UserViewModel$deleteNoteFile$1;->r:I

    .line 274
    .line 275
    invoke-interface {v0, v1, v7}, Lc2/v0;->c(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-ne v0, v2, :cond_6

    .line 280
    .line 281
    :goto_4
    return-object v2

    .line 282
    :cond_5
    move-object/from16 p1, v12

    .line 283
    .line 284
    const/4 v12, 0x2

    .line 285
    :cond_6
    move-object/from16 v0, p1

    .line 286
    .line 287
    :goto_5
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    invoke-virtual {v9, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eqz v1, :cond_7

    .line 296
    .line 297
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    :cond_7
    move-object/from16 v1, p0

    .line 301
    .line 302
    move-object v12, v0

    .line 303
    goto :goto_3

    .line 304
    :cond_8
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    const/4 v1, 0x0

    .line 309
    :goto_6
    if-ge v1, v0, :cond_9

    .line 310
    .line 311
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    add-int/lit8 v1, v1, 0x1

    .line 316
    .line 317
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 318
    .line 319
    new-instance v3, Ljava/io/File;

    .line 320
    .line 321
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 329
    .line 330
    .line 331
    goto :goto_6

    .line 332
    :cond_9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    const-string v1, "index.json"

    .line 341
    .line 342
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_c

    .line 354
    .line 355
    new-instance v1, Ljava/io/File;

    .line 356
    .line 357
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    const/4 v2, 0x0

    .line 361
    const/4 v4, 0x1

    .line 362
    invoke-static {v1, v2, v4, v2}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    new-instance v1, Lcom/friday/user/viewmodel/UserViewModel$a;

    .line 367
    .line 368
    invoke-direct {v1}, Lcom/friday/user/viewmodel/UserViewModel$a;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    :try_start_0
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 376
    .line 377
    new-instance v3, Lcom/google/gson/Gson;

    .line 378
    .line 379
    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    check-cast v0, Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 392
    goto :goto_7

    .line 393
    :catchall_0
    move-exception v0

    .line 394
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 395
    .line 396
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    :goto_7
    invoke-static {v0}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    if-eqz v1, :cond_a

    .line 409
    .line 410
    goto :goto_8

    .line 411
    :cond_a
    move-object v2, v0

    .line 412
    :goto_8
    check-cast v2, Ljava/util/ArrayList;

    .line 413
    .line 414
    if-eqz v2, :cond_c

    .line 415
    .line 416
    new-instance v0, Ljava/util/ArrayList;

    .line 417
    .line 418
    const/16 v1, 0xa

    .line 419
    .line 420
    invoke-static {v2, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    const/4 v3, 0x0

    .line 432
    :goto_9
    if-ge v3, v1, :cond_b

    .line 433
    .line 434
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 435
    .line 436
    .line 437
    move-result-object v4

    .line 438
    add-int/lit8 v3, v3, 0x1

    .line 439
    .line 440
    check-cast v4, Ljava/lang/String;

    .line 441
    .line 442
    new-instance v5, Ljava/io/File;

    .line 443
    .line 444
    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 448
    .line 449
    .line 450
    goto :goto_9

    .line 451
    :cond_b
    invoke-interface {v15, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 456
    .line 457
    .line 458
    :cond_c
    new-instance v0, Ljava/io/File;

    .line 459
    .line 460
    invoke-direct {v0, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 467
    .line 468
    return-object v0
.end method

.method public final o()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/user/viewmodel/UserViewModel$getName$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/user/viewmodel/UserViewModel$getName$1;-><init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lcom/friday/user/viewmodel/UserViewModel$getName$2;

    .line 8
    .line 9
    invoke-direct {v2, v0}, Lcom/friday/user/viewmodel/UserViewModel$getName$2;-><init>(Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v4, 0x4

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p0

    .line 16
    invoke-static/range {v0 .. v5}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final p()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/viewmodel/UserViewModel;->l:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final q()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/viewmodel/UserViewModel;->i:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/viewmodel/UserViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/viewmodel/UserViewModel;->l:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final t()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/user/viewmodel/UserViewModel$uploadLog$1;-><init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    return-void
.end method
