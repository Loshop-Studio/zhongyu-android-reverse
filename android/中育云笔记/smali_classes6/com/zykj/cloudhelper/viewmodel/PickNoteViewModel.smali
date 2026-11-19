.class public final Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lpa/a;

.field public final c:Ld2/i;

.field public final d:Lcom/friday/common/dao/FileDao;

.field public e:Landroid/net/Uri;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public final h:Landroidx/lifecycle/MutableLiveData;

.field public final i:Landroidx/lifecycle/MutableLiveData;

.field public final j:Landroidx/lifecycle/MutableLiveData;

.field public final k:Landroidx/lifecycle/MutableLiveData;

.field public final l:Ljava/lang/String;

.field public final m:Landroidx/lifecycle/MutableLiveData;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lpa/a;Ld2/i;Lcom/friday/common/dao/FileDao;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "ezyService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "fileDao"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->b:Lpa/a;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->c:Ld2/i;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->d:Lcom/friday/common/dao/FileDao;

    .line 24
    .line 25
    const-string p1, ""

    .line 26
    .line 27
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->f:Ljava/lang/String;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->g:Ljava/lang/String;

    .line 30
    .line 31
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 32
    .line 33
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 39
    .line 40
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 44
    .line 45
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 46
    .line 47
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 51
    .line 52
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 53
    .line 54
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 58
    .line 59
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lcom/friday/common/helper/b;->l()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->l:Ljava/lang/String;

    .line 70
    .line 71
    new-instance p1, Landroidx/lifecycle/MutableLiveData;

    .line 72
    .line 73
    invoke-direct {p1}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 77
    .line 78
    return-void
.end method

.method public static synthetic e(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->k(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Ld2/i;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->c:Ld2/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->d:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;)Lpa/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->b:Lpa/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final k(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "\u65b0\u5efa\u6587\u4ef6\u5939\u6210\u529f"

    .line 2
    .line 3
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->l(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "fileName"

    .line 4
    .line 5
    move-object/from16 v4, p1

    .line 6
    .line 7
    invoke-static {v4, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "parentId"

    .line 11
    .line 12
    move-object/from16 v5, p2

    .line 13
    .line 14
    invoke-static {v5, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 18
    .line 19
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 20
    .line 21
    sget-object v3, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Ljava/util/Date;

    .line 27
    .line 28
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v11

    .line 35
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    const-string v1, "toString(...)"

    .line 44
    .line 45
    invoke-static {v12, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/16 v16, 0x4

    .line 49
    .line 50
    const/16 v17, 0x0

    .line 51
    .line 52
    const-string v13, "-"

    .line 53
    .line 54
    const-string v14, ""

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    invoke-static/range {v12 .. v17}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance v2, Lcom/friday/common/entity/FileEntity;

    .line 65
    .line 66
    const v24, 0x7e000

    .line 67
    .line 68
    .line 69
    const/16 v25, 0x0

    .line 70
    .line 71
    const-string v7, ""

    .line 72
    .line 73
    const-string v8, ""

    .line 74
    .line 75
    const-string v9, "0"

    .line 76
    .line 77
    const/4 v13, 0x1

    .line 78
    const/4 v14, 0x0

    .line 79
    const/16 v16, 0x0

    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    const/16 v19, 0x0

    .line 84
    .line 85
    const/16 v20, 0x0

    .line 86
    .line 87
    const-wide/16 v21, 0x0

    .line 88
    .line 89
    const/16 v23, 0x0

    .line 90
    .line 91
    move-object v12, v11

    .line 92
    move-object v6, v4

    .line 93
    move-object v10, v5

    .line 94
    move-wide/from16 v4, p3

    .line 95
    .line 96
    invoke-direct/range {v2 .. v25}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 97
    .line 98
    .line 99
    move-object v1, v2

    .line 100
    new-instance v2, Lcom/friday/common/entity/NoteBean;

    .line 101
    .line 102
    const/16 v18, 0x1c00

    .line 103
    .line 104
    const-string v6, ""

    .line 105
    .line 106
    const-string v7, "0"

    .line 107
    .line 108
    const/4 v10, 0x0

    .line 109
    move-object v8, v11

    .line 110
    const-wide/16 v11, 0x0

    .line 111
    .line 112
    const-wide/16 v16, 0x0

    .line 113
    .line 114
    move-object v9, v8

    .line 115
    move-object/from16 v4, p1

    .line 116
    .line 117
    move-object/from16 v5, p2

    .line 118
    .line 119
    invoke-direct/range {v2 .. v19}, Lcom/friday/common/entity/NoteBean;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJZZZJILkotlin/jvm/internal/n;)V

    .line 120
    .line 121
    .line 122
    new-instance v3, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;

    .line 123
    .line 124
    const/4 v4, 0x0

    .line 125
    invoke-direct {v3, v0, v1, v4}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$1;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$2;

    .line 129
    .line 130
    invoke-direct {v1, v0, v4}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$createFolder$2;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lvc/c;)V

    .line 131
    .line 132
    .line 133
    new-instance v4, Lwa/a;

    .line 134
    .line 135
    invoke-direct {v4, v0, v2}, Lwa/a;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v3, v1, v4}, Lcom/friday/common/base/BaseViewModel;->b(Lhd/p;Lhd/p;Lhd/a;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final l(Z)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$fetchFileList$1;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;ZLvc/c;)V

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

.method public final n()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->h:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->k:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->i:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->m:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->e:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->j:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u(Lcom/friday/common/entity/NoteBean;)V
    .locals 7

    .line 1
    const-string v0, "parent"

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
    new-instance v4, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel$insertNewFile$1;-><init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;Lvc/c;)V

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

.method public final v(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->f:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final w(Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->e:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method public final x(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->g:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
