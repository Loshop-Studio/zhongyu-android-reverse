# RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。
.class public final Lcom/friday/main/viewmodel/FolderMoveViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lcom/friday/common/dao/ResourceDao;

.field public final d:Lc2/v0;

.field public final e:Lu3/b;

.field public final f:Lvd/l;

.field public final g:Lvd/u;

.field public final h:Lvd/l;

.field public final i:Lvd/u;

.field public final j:Lvd/k;

.field public final k:Lvd/p;

.field public final l:Lvd/k;

.field public final m:Lvd/p;

.field public final n:Lvd/k;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/v0;Lu3/b;)V
    .locals 1

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
    const-string v0, "imageSafetyDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "homeService"

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
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->d:Lc2/v0;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->e:Lu3/b;

    .line 31
    .line 32
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->f:Lvd/l;

    .line 41
    .line 42
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->g:Lvd/u;

    .line 43
    .line 44
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h:Lvd/l;

    .line 53
    .line 54
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->i:Lvd/u;

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    const/4 p2, 0x0

    .line 62
    const/4 p3, 0x7

    .line 63
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    iput-object p4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->j:Lvd/k;

    .line 68
    .line 69
    invoke-static {p4}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 70
    .line 71
    .line 72
    move-result-object p4

    .line 73
    iput-object p4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->k:Lvd/p;

    .line 74
    .line 75
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    iput-object p4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->l:Lvd/k;

    .line 80
    .line 81
    invoke-static {p4}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 82
    .line 83
    .line 84
    move-result-object p4

    .line 85
    iput-object p4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->m:Lvd/p;

    .line 86
    .line 87
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->n:Lvd/k;

    .line 92
    .line 93
    return-void
.end method

.method public static final C(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V
    .locals 10

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_4

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    if-gez v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lrc/w;->w()V

    .line 27
    .line 28
    .line 29
    :cond_0
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    const-string v5, "toString(...)"

    .line 44
    .line 45
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, Ljava/io/File;

    .line 49
    .line 50
    invoke-direct {v5, p2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_2

    .line 58
    .line 59
    invoke-static {v5, v4}, Lcom/blankj/utilcode/util/FileUtils;->rename(Ljava/io/File;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->f()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    const-string v5, "\u6210\u529f"

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    const-string v5, "\u5931\u8d25"

    .line 73
    .line 74
    :goto_1
    new-instance v8, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v9, "\u9875\u9762FolderMoveViewModel.kt -> copyNote(), \u9875\u9762 "

    .line 80
    .line 81
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v6, ": \u7269\u7406\u91cd\u547d\u540d ["

    .line 88
    .line 89
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, "] -> ["

    .line 96
    .line 97
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, "] "

    .line 104
    .line 105
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v6, "\u9875\u9762FolderMoveViewModel.kt -> copyNote(),  copyNote()\uff0cObjectBox,\u627e\u4e0d\u5230\u7269\u7406\u6587\u4ef6\u5939 "

    .line 129
    .line 130
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :goto_2
    invoke-virtual {v2, v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->m(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v5, "\u9875\u9762FolderMoveViewModel.kt -> copyNote()\uff0cObjectBox, \u66f4\u65b0 PageEntity \u5b57\u6bb5: dirName \u5df2\u8bbe\u4e3a "

    .line 156
    .line 157
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->a()Lio/objectbox/relation/ToOne;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->d()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 183
    .line 184
    if-eqz v1, :cond_3

    .line 185
    .line 186
    invoke-virtual {v1, p2}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->e(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    const-class v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 190
    .line 191
    invoke-virtual {p3, v2}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2, v1}, Ljc/a;->m(Ljava/lang/Object;)J

    .line 196
    .line 197
    .line 198
    :cond_3
    move v1, v3

    .line 199
    goto/16 :goto_0

    .line 200
    .line 201
    :cond_4
    check-cast p0, Ljava/util/Collection;

    .line 202
    .line 203
    invoke-virtual {p1, p0}, Ljc/a;->n(Ljava/util/Collection;)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method private final D(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->d:Lc2/v0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lc2/v0;->a(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p1
.end method

.method public static synthetic e(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->C(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V

    return-void
.end method

.method public static final synthetic f(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->t(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/entity/FileEntity;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->u()Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lu3/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->e:Lu3/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->f:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->l:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->j:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->B(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic p(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->D(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic q(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->I(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->L(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final A()Lvd/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->n:Lvd/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B(Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "FolderMoveViewModel.kt -> copyNote(),\u5f00\u59cb\u590d\u5236\u65b0\u7b14\u8bb0"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/io/File;

    .line 11
    .line 12
    const-string v1, "page_mdb"

    .line 13
    .line 14
    invoke-direct {v0, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/zykj/blackboard/core/data/dao/a;->y()Ljc/c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Ljc/c;->a(Ljava/lang/Object;)Ljc/c;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Ljc/c;->f(Ljava/io/File;)Ljc/c;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljc/c;->b()Lio/objectbox/BoxStore;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    :try_start_0
    const-class v1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lio/objectbox/BoxStore;->g(Ljava/lang/Class;)Ljc/a;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Ljc/a;->e()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v3, Lw3/d;

    .line 48
    .line 49
    invoke-direct {v3, v2, v1, p1, v0}, Lw3/d;-><init>(Ljava/util/List;Ljc/a;Ljava/lang/String;Lio/objectbox/BoxStore;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v3}, Lio/objectbox/BoxStore;->I(Ljava/lang/Runnable;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "\u9875\u9762ObjectBox, MDB\u6a21\u5f0f\u6570\u636e\u540c\u6b65\u4fee\u6b63\u5b8c\u6210"

    .line 56
    .line 57
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    goto :goto_0

    .line 70
    :catch_0
    move-exception p1

    .line 71
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v2, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v3, "\u9875\u9762ObjectBox, MDB\u5931\u8d25: "

    .line 81
    .line 82
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :goto_0
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->close()V

    .line 107
    .line 108
    .line 109
    throw p1
.end method

.method public final E()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->m:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->k:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, p2, p1, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final H(Ljava/lang/String;Ljava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileIdList"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, p1, p2, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final I(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p2, Ljava/lang/Iterable;

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 23
    .line 24
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->p()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-virtual {v3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->getFileName()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {p4, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3, v2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->q(Ljava/lang/String;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {v3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    new-instance v3, Ljava/io/File;

    .line 66
    .line 67
    invoke-virtual {v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-direct {v3, p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3, v2}, Lcom/blankj/utilcode/util/FileUtils;->rename(Ljava/io/File;Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    return-object v0
.end method

.method public final J(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {v2, p0, p1, p2, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$2;

    .line 18
    .line 19
    invoke-direct {v3, p0, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$restoreFile$2;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lvc/c;)V

    .line 20
    .line 21
    .line 22
    const/4 v5, 0x4

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    move-object v1, p0

    .line 26
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final K(Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "fileEntity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$setCurrentFolder$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$setCurrentFolder$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final L(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Ljava/lang/String;

    .line 20
    .line 21
    if-nez p2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :cond_0
    invoke-virtual {p1, p2}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->T(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->A()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    :cond_2
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->T(Ljava/lang/String;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const-string v1, "getChildGraphList(...)"

    .line 66
    .line 67
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    check-cast p1, Ljava/lang/Iterable;

    .line 71
    .line 72
    new-instance v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v2, 0xa

    .line 75
    .line 76
    invoke-static {p1, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 98
    .line 99
    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v2, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->L(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/HashMap;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_3
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->l()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->g()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    return-object p1
.end method

.method public final s(Ljava/util/List;Lcom/friday/common/entity/FileEntity;)V
    .locals 7

    .line 1
    const-string v0, "resourceList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "selectedFile"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, p2, p1, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$copyNote$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final t(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p3, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->h:I

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
    iput v1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->h:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->d:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Ljava/util/List;

    .line 48
    .line 49
    iget-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 52
    .line 53
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_2
    iget-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->d:Ljava/lang/Object;

    .line 66
    .line 67
    move-object p2, p1

    .line 68
    check-cast p2, Ljava/util/List;

    .line 69
    .line 70
    iget-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 73
    .line 74
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 p3, 0x0

    .line 82
    invoke-interface {p2, p3, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-string v5, "0"

    .line 90
    .line 91
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-nez v2, :cond_6

    .line 96
    .line 97
    iget-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    iput-object v5, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->c:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object p2, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->d:Ljava/lang/Object;

    .line 110
    .line 111
    iput v4, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->h:I

    .line 112
    .line 113
    invoke-interface {p3, v2, v0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    if-ne p3, v1, :cond_4

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_4
    :goto_1
    check-cast p3, Lcom/friday/common/entity/FileEntity;

    .line 121
    .line 122
    if-eqz p3, :cond_7

    .line 123
    .line 124
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iput-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->c:Ljava/lang/Object;

    .line 129
    .line 130
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    iput-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->d:Ljava/lang/Object;

    .line 135
    .line 136
    invoke-static {p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iput-object p1, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->e:Ljava/lang/Object;

    .line 141
    .line 142
    iput v3, v0, Lcom/friday/main/viewmodel/FolderMoveViewModel$folderList$1;->h:I

    .line 143
    .line 144
    invoke-virtual {p0, p3, p2, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->t(Lcom/friday/common/entity/FileEntity;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    if-ne p1, v1, :cond_5

    .line 149
    .line 150
    :goto_2
    return-object v1

    .line 151
    :cond_5
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 152
    .line 153
    return-object p1

    .line 154
    :cond_6
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->u()Lcom/friday/common/entity/FileEntity;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-interface {p2, p3, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 162
    .line 163
    return-object p1
.end method

.method public final u()Lcom/friday/common/entity/FileEntity;
    .locals 24

    .line 1
    new-instance v0, Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    const/high16 v22, 0x60000

    .line 4
    .line 5
    const/16 v23, 0x0

    .line 6
    .line 7
    const-string v1, "0"

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    const-string v4, "\u6839\u76ee\u5f55"

    .line 12
    .line 13
    const-string v5, ""

    .line 14
    .line 15
    const-string v6, ""

    .line 16
    .line 17
    const-string v7, "0"

    .line 18
    .line 19
    const-string v8, "0"

    .line 20
    .line 21
    const-string v9, ""

    .line 22
    .line 23
    const-string v10, ""

    .line 24
    .line 25
    const/4 v11, 0x0

    .line 26
    const/4 v12, 0x0

    .line 27
    const/4 v13, 0x0

    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v15, 0x0

    .line 30
    const/16 v16, 0x0

    .line 31
    .line 32
    const/16 v17, 0x0

    .line 33
    .line 34
    const/16 v18, 0x0

    .line 35
    .line 36
    const-wide/16 v19, 0x0

    .line 37
    .line 38
    const/16 v21, 0x0

    .line 39
    .line 40
    invoke-direct/range {v0 .. v23}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public final v(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v4, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFileLevels$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Lvc/c;)V

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x3

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final w()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->g:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFiles$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFiles$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFiles$2;

    .line 13
    .line 14
    invoke-direct {v3, v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFiles$2;-><init>(Lvc/c;)V

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

.method public final y(ZZLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v0, "parentId"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileId"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    move-object v4, p0

    .line 15
    move v3, p1

    .line 16
    move v2, p2

    .line 17
    move-object v5, p3

    .line 18
    move-object v6, p4

    .line 19
    invoke-direct/range {v1 .. v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$1;-><init>(ZZLcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$2;

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-direct {v3, p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel$getFilesExceptItself$2;-><init>(Lvc/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    move-object v2, v1

    .line 32
    move-object v1, p0

    .line 33
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final z()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel;->i:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method
