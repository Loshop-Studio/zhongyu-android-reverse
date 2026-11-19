# RE note 本类字节码直接引用的读写或显示接口包括JSON。
.class public final Lcom/friday/paint/viewmodel/NoteViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lcom/friday/common/dao/ResourceDao;

.field public final d:Lcom/friday/common/dao/UserDao;

.field public final e:Lc2/v0;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/util/List;

.field public k:Ljava/lang/String;

.field public l:Landroidx/lifecycle/MutableLiveData;

.field public m:Landroidx/lifecycle/MutableLiveData;

.field public n:Landroidx/lifecycle/MutableLiveData;

.field public final o:Ljava/util/HashMap;

.field public final p:J

.field public final q:Landroidx/lifecycle/MutableLiveData;

.field public final r:Landroidx/lifecycle/MutableLiveData;

.field public final s:Lvd/k;

.field public final t:Lvd/p;

.field public final u:Landroidx/lifecycle/MutableLiveData;

.field public final v:Landroidx/lifecycle/LiveData;

.field public final w:Landroidx/lifecycle/MutableLiveData;

.field public final x:Landroidx/lifecycle/MutableLiveData;

.field public final y:Lvd/k;

.field public final z:Lvd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lcom/friday/common/dao/UserDao;Lc2/v0;)V
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
    const-string v0, "userDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "imageSafetyDao"

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
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->d:Lcom/friday/common/dao/UserDao;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->e:Lc2/v0;

    .line 31
    .line 32
    const-string p1, ""

    .line 33
    .line 34
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->f:Ljava/lang/String;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->g:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->h:Ljava/lang/String;

    .line 39
    .line 40
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->i:Ljava/lang/String;

    .line 41
    .line 42
    new-instance p2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->j:Ljava/util/List;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->k:Ljava/lang/String;

    .line 50
    .line 51
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 52
    .line 53
    new-instance p2, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 54
    .line 55
    const/high16 p3, 0x40400000    # 3.0f

    .line 56
    .line 57
    const/high16 p4, -0x1000000

    .line 58
    .line 59
    invoke-direct {p2, p3, p4}, Lcom/zykj/sketch/core/config/GraphConfig;-><init>(FI)V

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 66
    .line 67
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 68
    .line 69
    sget-object p2, Lcom/zykj/sketch/core/data/Mode;->ACTION_WRITING:Lcom/zykj/sketch/core/data/Mode;

    .line 70
    .line 71
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 75
    .line 76
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 77
    .line 78
    new-instance p2, Lcom/zykj/sketch/core/config/SketchConfig$Builder;

    .line 79
    .line 80
    invoke-direct {p2}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lvb/n;->h()Ljava/lang/Boolean;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    if-eqz p3, :cond_0

    .line 88
    .line 89
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 90
    .line 91
    .line 92
    move-result p3

    .line 93
    goto :goto_0

    .line 94
    :cond_0
    const/4 p3, 0x1

    .line 95
    :goto_0
    invoke-virtual {p2, p3}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->setTouchable(Z)Lcom/zykj/sketch/core/config/SketchConfig$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    const/4 p3, 0x5

    .line 100
    invoke-virtual {p2, p3}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->setMaxImageCount(I)Lcom/zykj/sketch/core/config/SketchConfig$Builder;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    const-string p4, "getApp(...)"

    .line 109
    .line 110
    invoke-static {p3, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2, p3}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->build(Landroid/content/Context;)Lcom/zykj/sketch/core/config/SketchConfig;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    invoke-direct {p1, p2}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 121
    .line 122
    new-instance p1, Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->o:Ljava/util/HashMap;

    .line 128
    .line 129
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Lcom/friday/common/helper/b;->t()J

    .line 136
    .line 137
    .line 138
    move-result-wide p1

    .line 139
    iput-wide p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->p:J

    .line 140
    .line 141
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 142
    .line 143
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 144
    .line 145
    .line 146
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 147
    .line 148
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 149
    .line 150
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 154
    .line 155
    const/4 p1, 0x0

    .line 156
    const/4 p2, 0x0

    .line 157
    const/4 p3, 0x7

    .line 158
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 159
    .line 160
    .line 161
    move-result-object p4

    .line 162
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->s:Lvd/k;

    .line 163
    .line 164
    invoke-static {p4}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 165
    .line 166
    .line 167
    move-result-object p4

    .line 168
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->t:Lvd/p;

    .line 169
    .line 170
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 171
    .line 172
    invoke-direct {p4}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 173
    .line 174
    .line 175
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->u:Landroidx/lifecycle/MutableLiveData;

    .line 176
    .line 177
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->v:Landroidx/lifecycle/LiveData;

    .line 178
    .line 179
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 180
    .line 181
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 182
    .line 183
    invoke-direct {p4, v0}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->w:Landroidx/lifecycle/MutableLiveData;

    .line 187
    .line 188
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->x:Landroidx/lifecycle/MutableLiveData;

    .line 189
    .line 190
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->y:Lvd/k;

    .line 195
    .line 196
    invoke-static {p1}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->z:Lvd/p;

    .line 201
    .line 202
    return-void
.end method

.method private final N(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd HH:mm:ss"

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
    move-result-object v0

    .line 19
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    new-instance v2, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v2, p1, p0, v0, v3}, Lcom/friday/paint/viewmodel/NoteViewModel$handleResource$2;-><init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    if-ne p1, p2, :cond_0

    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 41
    .line 42
    return-object p1
.end method

.method private final Y(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 6

    .line 1
    new-instance v0, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;Ljava/lang/String;ILvc/c;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$2;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {v2, p1}, Lcom/friday/paint/viewmodel/NoteViewModel$updateNote$2;-><init>(Lvc/c;)V

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x4

    .line 18
    const/4 v3, 0x0

    .line 19
    move-object v1, v0

    .line 20
    move-object v0, p0

    .line 21
    invoke-static/range {v0 .. v5}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final synthetic e(Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;ILvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/paint/viewmodel/NoteViewModel;->r(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/paint/viewmodel/NoteViewModel;)Lc2/v0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->e:Lc2/v0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/paint/viewmodel/NoteViewModel;)Lcom/friday/common/dao/UserDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->d:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/paint/viewmodel/NoteViewModel;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic k(Lcom/friday/paint/viewmodel/NoteViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->s:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/paint/viewmodel/NoteViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->y:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/friday/paint/viewmodel/NoteViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->u:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method private final o(Lcom/friday/common/entity/CreateNoteInput;)V
    .locals 26

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "yyyy-MM-dd HH:mm:ss"

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
    move-result-object v11

    .line 19
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/CreateNoteInput;->getNoteId()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/CreateNoteInput;->getUserId()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/CreateNoteInput;->getNoteName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/CreateNoteInput;->getLocalPath()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/CreateNoteInput;->getParentId()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Lcom/friday/common/entity/FileEntity;

    .line 43
    .line 44
    const v24, 0x6e000

    .line 45
    .line 46
    .line 47
    const/16 v25, 0x0

    .line 48
    .line 49
    const-string v7, ""

    .line 50
    .line 51
    const-string v9, "1"

    .line 52
    .line 53
    const/4 v13, 0x1

    .line 54
    const/4 v14, 0x0

    .line 55
    const/4 v15, 0x0

    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    const/16 v20, 0x1

    .line 65
    .line 66
    const-wide/16 v21, 0x0

    .line 67
    .line 68
    const/16 v23, 0x0

    .line 69
    .line 70
    move-object v12, v11

    .line 71
    invoke-direct/range {v2 .. v25}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 72
    .line 73
    .line 74
    new-instance v4, Lcom/friday/paint/viewmodel/NoteViewModel$createNewNote$1;

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    move-object/from16 v3, p0

    .line 78
    .line 79
    invoke-direct {v4, v3, v2, v0}, Lcom/friday/paint/viewmodel/NoteViewModel$createNewNote$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 80
    .line 81
    .line 82
    new-instance v5, Lcom/friday/paint/viewmodel/NoteViewModel$createNewNote$2;

    .line 83
    .line 84
    invoke-direct {v5, v0}, Lcom/friday/paint/viewmodel/NoteViewModel$createNewNote$2;-><init>(Lvc/c;)V

    .line 85
    .line 86
    .line 87
    const/4 v7, 0x4

    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v6, 0x0

    .line 90
    invoke-static/range {v3 .. v8}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final A()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->j:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->l:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Ljava/util/HashMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->o:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

# RE I/O 读取 JSON（Gson.fromJson）。
.method public final H(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p2, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;

    iget v1, v0, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->h:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->h:I

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;

    invoke-direct {v0, p0, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    goto :goto_0

    :goto_1
    iget-object p2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->f:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->h:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v9, :cond_2

    if-ne v1, v8, :cond_1

    iget-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->e:Ljava/lang/Object;

    check-cast p1, Ljava/util/ArrayList;

    iget-object v0, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    iput-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    iput v9, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->h:I

    const-wide/16 v3, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto/16 :goto_5

    :cond_4
    move-object p1, v2

    .line 3
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 4
    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_8

    .line 5
    check-cast p2, Ljava/lang/Iterable;

    .line 6
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 9
    move-object v2, v1

    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 10
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    move-result-object v2

    .line 11
    invoke-virtual {p1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 13
    :cond_6
    new-instance p1, Lcom/friday/paint/viewmodel/NoteViewModel$a;

    invoke-direct {p1}, Lcom/friday/paint/viewmodel/NoteViewModel$a;-><init>()V

    invoke-static {v0, p1}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 14
    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 16
    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    .line 17
    new-instance v1, Ljava/io/File;

    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getPageName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    return-object p2

    .line 19
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    iget-object v2, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->d:Ljava/lang/Object;

    iput-object v1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->e:Ljava/lang/Object;

    iput v8, v5, Lcom/friday/paint/viewmodel/NoteViewModel$getPreviewList$1;->h:I

    invoke-interface {v2, p1, v5}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_9

    :goto_5
    return-object v0

    :cond_9
    move-object p1, v1

    .line 21
    :goto_6
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    const/4 v0, 0x0

    if-eqz p2, :cond_a

    .line 22
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    move-result-object p2

    goto :goto_7

    :cond_a
    move-object p2, v0

    :goto_7
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "index.json"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 23
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 24
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 25
    :cond_b
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v0, v9, v0}, Lcd/g;->e(Ljava/io/File;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 26
    new-instance v0, Lcom/friday/paint/viewmodel/NoteViewModel$b;

    invoke-direct {v0}, Lcom/friday/paint/viewmodel/NoteViewModel$b;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    .line 27
    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, p2, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    if-eqz p2, :cond_d

    .line 28
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :cond_c
    :goto_8
    if-ge v1, v0, :cond_d

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    check-cast v2, Ljava/lang/String;

    .line 29
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 30
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    return-object p1
.end method

.method public final I(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/viewmodel/NoteViewModel$getRiskScoreByImageId$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/paint/viewmodel/NoteViewModel$getRiskScoreByImageId$2;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Ljava/lang/String;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final J(Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/viewmodel/NoteViewModel$getScreensPermission$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/friday/paint/viewmodel/NoteViewModel$getScreensPermission$2;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final K()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->n:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/viewmodel/NoteViewModel$goAsking$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/viewmodel/NoteViewModel$goAsking$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

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

.method public final O(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/paint/viewmodel/NoteViewModel$insertImageSafety$2;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-direct {v1, p0, p1, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$insertImageSafety$2;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Lcom/friday/paint/viewmodel/NoteViewModel$insertImageSafety$3;

    .line 8
    .line 9
    invoke-direct {v2, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$insertImageSafety$3;-><init>(Lvc/c;)V

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
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 20
    .line 21
    return-object p1
.end method

.method public final P(Ljava/io/File;)V
    .locals 7

    .line 1
    const-string v0, "file"

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
    new-instance v4, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p1, p0, v0}, Lcom/friday/paint/viewmodel/NoteViewModel$saveThumbnail$1;-><init>(Ljava/io/File;Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

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

.method public final Q(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->k:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final R(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->f:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final S(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final T(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->g:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final U(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->i:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final V(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final W(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->w:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final X(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->g:I

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
    iput v3, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->g:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->e:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->g:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v7, :cond_3

    .line 43
    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    iget-object v3, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 51
    .line 52
    iget-object v2, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_5

    .line 60
    .line 61
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_2
    iget-object v4, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 72
    .line 73
    iget-object v6, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v6, Ljava/util/List;

    .line 76
    .line 77
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_3
    iget-object v4, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->c:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v4, Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object v1, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 93
    .line 94
    iget-object v4, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->f:Ljava/lang/String;

    .line 95
    .line 96
    move-object/from16 v8, p1

    .line 97
    .line 98
    iput-object v8, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->c:Ljava/lang/Object;

    .line 99
    .line 100
    iput v7, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->g:I

    .line 101
    .line 102
    invoke-interface {v1, v4, v2}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    if-ne v1, v3, :cond_5

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_5
    move-object v4, v8

    .line 110
    :goto_1
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 111
    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    new-instance v8, Lcom/friday/common/entity/CreateNoteInput;

    .line 115
    .line 116
    iget-object v9, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->f:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v10, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->h:Ljava/lang/String;

    .line 119
    .line 120
    iget-object v11, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->i:Ljava/lang/String;

    .line 121
    .line 122
    iget-wide v12, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->p:J

    .line 123
    .line 124
    iget-object v14, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->k:Ljava/lang/String;

    .line 125
    .line 126
    const/16 v16, 0x20

    .line 127
    .line 128
    const/16 v17, 0x0

    .line 129
    .line 130
    const/4 v15, 0x0

    .line 131
    invoke-direct/range {v8 .. v17}, Lcom/friday/common/entity/CreateNoteInput;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v0, v8}, Lcom/friday/paint/viewmodel/NoteViewModel;->o(Lcom/friday/common/entity/CreateNoteInput;)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_6
    iget-object v8, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->f:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v9, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->h:Ljava/lang/String;

    .line 141
    .line 142
    invoke-direct {v0, v8, v9, v7}, Lcom/friday/paint/viewmodel/NoteViewModel;->Y(Ljava/lang/String;Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    :goto_2
    iget-object v8, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 146
    .line 147
    iget-object v9, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->f:Ljava/lang/String;

    .line 148
    .line 149
    iput-object v4, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->c:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    iput-object v10, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->d:Ljava/lang/Object;

    .line 156
    .line 157
    iput v6, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->g:I

    .line 158
    .line 159
    invoke-interface {v8, v9, v7, v2}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    if-ne v6, v3, :cond_7

    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_7
    move-object v6, v4

    .line 167
    move-object v4, v1

    .line 168
    :goto_3
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iput-object v1, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->c:Ljava/lang/Object;

    .line 173
    .line 174
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    iput-object v1, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->d:Ljava/lang/Object;

    .line 179
    .line 180
    iput v5, v2, Lcom/friday/paint/viewmodel/NoteViewModel$updateIndexJson$1;->g:I

    .line 181
    .line 182
    invoke-direct {v0, v6, v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->N(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    if-ne v1, v3, :cond_8

    .line 187
    .line 188
    :goto_4
    return-object v3

    .line 189
    :cond_8
    :goto_5
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 190
    .line 191
    return-object v1
.end method

.method public final n()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/viewmodel/NoteViewModel$copyToOthers$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/viewmodel/NoteViewModel$copyToOthers$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

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

.method public final p(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->e:Lc2/v0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lc2/v0;->c(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

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

.method public final q(ILjava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "dataList"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p1, p2, p0, v0}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$1;-><init>(ILjava/util/List;Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteNote$2;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

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

.method public final r(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

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
    iput v3, v2, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->l:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

    .line 38
    .line 39
    const/4 v11, 0x0

    .line 40
    const/4 v12, 0x3

    .line 41
    const/4 v13, 0x2

    .line 42
    const/4 v4, 0x1

    .line 43
    if-eqz v3, :cond_4

    .line 44
    .line 45
    if-eq v3, v4, :cond_3

    .line 46
    .line 47
    if-eq v3, v13, :cond_2

    .line 48
    .line 49
    if-ne v3, v12, :cond_1

    .line 50
    .line 51
    iget v3, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->j:I

    .line 52
    .line 53
    iget v4, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->i:I

    .line 54
    .line 55
    iget-object v5, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    .line 58
    .line 59
    iget-object v5, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->f:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v5, Ljava/util/Iterator;

    .line 62
    .line 63
    iget-object v6, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v6, Ljava/lang/Iterable;

    .line 66
    .line 67
    iget-object v7, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v7, Ljava/util/List;

    .line 70
    .line 71
    iget-object v9, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v9, Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    move v1, v12

    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 84
    .line 85
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw v1

    .line 89
    :cond_2
    iget v3, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->j:I

    .line 90
    .line 91
    iget v4, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->i:I

    .line 92
    .line 93
    iget-object v5, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->h:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    .line 96
    .line 97
    iget-object v6, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->f:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v6, Ljava/util/Iterator;

    .line 100
    .line 101
    iget-object v7, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->e:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v7, Ljava/lang/Iterable;

    .line 104
    .line 105
    iget-object v9, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v9, Ljava/util/List;

    .line 108
    .line 109
    iget-object v10, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v10, Ljava/lang/String;

    .line 112
    .line 113
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_4

    .line 117
    .line 118
    :cond_3
    iget v3, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->i:I

    .line 119
    .line 120
    iget-object v4, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v4, Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    iget-object v3, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 132
    .line 133
    move-object/from16 v1, p1

    .line 134
    .line 135
    iput-object v1, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 136
    .line 137
    move/from16 v5, p2

    .line 138
    .line 139
    iput v5, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->i:I

    .line 140
    .line 141
    iput v4, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

    .line 142
    .line 143
    const-wide/16 v6, 0x0

    .line 144
    .line 145
    const/4 v9, 0x4

    .line 146
    const/4 v10, 0x0

    .line 147
    move-object v4, v1

    .line 148
    invoke-static/range {v3 .. v10}, Lcom/friday/common/dao/ResourceDao;->M(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;IJLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-ne v1, v2, :cond_5

    .line 153
    .line 154
    goto/16 :goto_5

    .line 155
    .line 156
    :cond_5
    move-object/from16 v4, p1

    .line 157
    .line 158
    move/from16 v3, p2

    .line 159
    .line 160
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 161
    .line 162
    move-object v5, v1

    .line 163
    check-cast v5, Ljava/lang/Iterable;

    .line 164
    .line 165
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    move-object v7, v6

    .line 170
    move-object v6, v5

    .line 171
    move-object v5, v7

    .line 172
    move-object v7, v1

    .line 173
    move-object v9, v4

    .line 174
    move v4, v3

    .line 175
    move v3, v11

    .line 176
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_9

    .line 181
    .line 182
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    move-object v10, v1

    .line 187
    check-cast v10, Lcom/friday/common/entity/ResourceEntity;

    .line 188
    .line 189
    invoke-virtual {v10}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    invoke-interface {v14}, Ljava/lang/CharSequence;->length()I

    .line 194
    .line 195
    .line 196
    move-result v14

    .line 197
    if-nez v14, :cond_7

    .line 198
    .line 199
    iget-object v14, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 200
    .line 201
    invoke-virtual {v10}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    iput-object v9, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    iput-object v12, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->d:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v12

    .line 217
    iput-object v12, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->e:Ljava/lang/Object;

    .line 218
    .line 219
    iput-object v5, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->f:Ljava/lang/Object;

    .line 220
    .line 221
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iput-object v1, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->g:Ljava/lang/Object;

    .line 226
    .line 227
    iput-object v10, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->h:Ljava/lang/Object;

    .line 228
    .line 229
    iput v4, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->i:I

    .line 230
    .line 231
    iput v3, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->j:I

    .line 232
    .line 233
    iput v11, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->k:I

    .line 234
    .line 235
    iput v13, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

    .line 236
    .line 237
    invoke-interface {v14, v15, v8}, Lcom/friday/common/dao/ResourceDao;->Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    if-ne v1, v2, :cond_6

    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_6
    move-object/from16 v16, v6

    .line 245
    .line 246
    move-object v6, v5

    .line 247
    move-object v5, v10

    .line 248
    move-object v10, v9

    .line 249
    move-object v9, v7

    .line 250
    move-object/from16 v7, v16

    .line 251
    .line 252
    :goto_4
    invoke-virtual {v5}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    invoke-static {v1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 261
    .line 262
    .line 263
    move-object v5, v6

    .line 264
    move-object v6, v7

    .line 265
    move-object v7, v9

    .line 266
    move-object v9, v10

    .line 267
    const/4 v1, 0x3

    .line 268
    goto :goto_6

    .line 269
    :cond_7
    iget-object v12, v0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 270
    .line 271
    iput-object v9, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 272
    .line 273
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    iput-object v14, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->d:Ljava/lang/Object;

    .line 278
    .line 279
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    iput-object v14, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->e:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v5, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->f:Ljava/lang/Object;

    .line 286
    .line 287
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    iput-object v1, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->g:Ljava/lang/Object;

    .line 292
    .line 293
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    iput-object v1, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->h:Ljava/lang/Object;

    .line 298
    .line 299
    iput v4, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->i:I

    .line 300
    .line 301
    iput v3, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->j:I

    .line 302
    .line 303
    iput v11, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->k:I

    .line 304
    .line 305
    const/4 v1, 0x3

    .line 306
    iput v1, v8, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResource$1;->n:I

    .line 307
    .line 308
    invoke-interface {v12, v9, v4, v8}, Lcom/friday/common/dao/ResourceDao;->p(Ljava/lang/String;ILvc/c;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v10

    .line 312
    if-ne v10, v2, :cond_8

    .line 313
    .line 314
    :goto_5
    return-object v2

    .line 315
    :cond_8
    :goto_6
    move v12, v1

    .line 316
    goto/16 :goto_3

    .line 317
    .line 318
    :cond_9
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 319
    .line 320
    return-object v1
.end method

.method public final s(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->i:I

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
    iput v1, v0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->i:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->g:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->i:I

    .line 34
    .line 35
    const/4 v8, 0x3

    .line 36
    const/4 v9, 0x2

    .line 37
    const/4 v2, 0x1

    .line 38
    if-eqz v1, :cond_4

    .line 39
    .line 40
    if-eq v1, v2, :cond_3

    .line 41
    .line 42
    if-eq v1, v9, :cond_2

    .line 43
    .line 44
    if-ne v1, v8, :cond_1

    .line 45
    .line 46
    iget-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    .line 49
    .line 50
    iget-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    .line 53
    .line 54
    iget-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 66
    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_2
    iget-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lcom/friday/common/entity/ResourceEntity;

    .line 74
    .line 75
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    .line 78
    .line 79
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    iget-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->c:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 99
    .line 100
    iput-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->c:Ljava/lang/Object;

    .line 101
    .line 102
    iput v2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->i:I

    .line 103
    .line 104
    const-wide/16 v3, 0x0

    .line 105
    .line 106
    const/4 v6, 0x2

    .line 107
    const/4 v7, 0x0

    .line 108
    move-object v2, p1

    .line 109
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    if-ne p2, v0, :cond_5

    .line 114
    .line 115
    goto :goto_4

    .line 116
    :cond_5
    move-object p1, v2

    .line 117
    :goto_2
    check-cast p2, Lcom/friday/common/entity/ResourceEntity;

    .line 118
    .line 119
    if-eqz p2, :cond_9

    .line 120
    .line 121
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getOssImageUrl()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    const/4 v2, 0x0

    .line 130
    if-nez v1, :cond_7

    .line 131
    .line 132
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 133
    .line 134
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    iput-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->c:Ljava/lang/Object;

    .line 139
    .line 140
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->d:Ljava/lang/Object;

    .line 145
    .line 146
    iput-object p2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->e:Ljava/lang/Object;

    .line 147
    .line 148
    iput v2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->f:I

    .line 149
    .line 150
    iput v9, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->i:I

    .line 151
    .line 152
    invoke-interface {v1, v3, v5}, Lcom/friday/common/dao/ResourceDao;->Z(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    if-ne p1, v0, :cond_6

    .line 157
    .line 158
    goto :goto_4

    .line 159
    :cond_6
    move-object p1, p2

    .line 160
    :goto_3
    invoke-virtual {p1}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_7
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 173
    .line 174
    iput-object p1, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->c:Ljava/lang/Object;

    .line 175
    .line 176
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    iput-object v3, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->d:Ljava/lang/Object;

    .line 181
    .line 182
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    iput-object p2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->e:Ljava/lang/Object;

    .line 187
    .line 188
    iput v2, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->f:I

    .line 189
    .line 190
    iput v8, v5, Lcom/friday/paint/viewmodel/NoteViewModel$deleteResourceById$1;->i:I

    .line 191
    .line 192
    invoke-interface {v1, p1, v5}, Lcom/friday/common/dao/ResourceDao;->k(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-ne p1, v0, :cond_8

    .line 197
    .line 198
    :goto_4
    return-object v0

    .line 199
    :cond_8
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_9
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 207
    .line 208
    .line 209
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 210
    .line 211
    return-object p1
.end method

.method public final t(Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/viewmodel/NoteViewModel$getAlbumPermission$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/friday/paint/viewmodel/NoteViewModel$getAlbumPermission$2;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final u()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->t:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v(Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/viewmodel/NoteViewModel$getCameraPermission$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, v2}, Lcom/friday/paint/viewmodel/NoteViewModel$getCameraPermission$2;-><init>(Lcom/friday/paint/viewmodel/NoteViewModel;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final w()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->z:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->x:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NoteViewModel;->v:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method
