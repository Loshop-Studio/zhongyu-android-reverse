.class public final Lcom/friday/paint/viewmodel/NewNoteViewModel;
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

.field public final f:Lj2/d;

.field public g:Z

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public final m:Ljava/util/Set;

.field public final n:Lvd/k;

.field public final o:Lvd/p;

.field public final p:J

.field public final q:Landroidx/lifecycle/MutableLiveData;

.field public final r:Landroidx/lifecycle/MutableLiveData;

.field public final s:Landroidx/lifecycle/MutableLiveData;

.field public final t:Landroidx/lifecycle/LiveData;

.field public final u:Landroidx/lifecycle/MutableLiveData;

.field public final v:Landroidx/lifecycle/MutableLiveData;

.field public final w:Lvd/k;

.field public final x:Lvd/p;

.field public final y:Lvd/k;

.field public final z:Lvd/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lcom/friday/common/dao/UserDao;Lc2/v0;Lj2/d;)V
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
    const-string v0, "fileManager"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/friday/common/base/BaseViewModel;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 30
    .line 31
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 32
    .line 33
    iput-object p3, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->d:Lcom/friday/common/dao/UserDao;

    .line 34
    .line 35
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->e:Lc2/v0;

    .line 36
    .line 37
    iput-object p5, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->f:Lj2/d;

    .line 38
    .line 39
    const-string p1, ""

    .line 40
    .line 41
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->i:Ljava/lang/String;

    .line 44
    .line 45
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->j:Ljava/lang/String;

    .line 46
    .line 47
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k:Ljava/lang/String;

    .line 48
    .line 49
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->l:Ljava/lang/String;

    .line 50
    .line 51
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->m:Ljava/util/Set;

    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    const/4 p2, 0x0

    .line 60
    const/4 p3, 0x7

    .line 61
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 62
    .line 63
    .line 64
    move-result-object p4

    .line 65
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->n:Lvd/k;

    .line 66
    .line 67
    invoke-static {p4}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->o:Lvd/p;

    .line 72
    .line 73
    sget-object p4, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 74
    .line 75
    invoke-virtual {p4}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 76
    .line 77
    .line 78
    move-result-object p4

    .line 79
    invoke-virtual {p4}, Lcom/friday/common/helper/b;->t()J

    .line 80
    .line 81
    .line 82
    move-result-wide p4

    .line 83
    iput-wide p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->p:J

    .line 84
    .line 85
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 86
    .line 87
    invoke-direct {p4}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 91
    .line 92
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 93
    .line 94
    invoke-direct {p4}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 95
    .line 96
    .line 97
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 98
    .line 99
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 100
    .line 101
    invoke-direct {p4}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->s:Landroidx/lifecycle/MutableLiveData;

    .line 105
    .line 106
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->t:Landroidx/lifecycle/LiveData;

    .line 107
    .line 108
    new-instance p4, Landroidx/lifecycle/MutableLiveData;

    .line 109
    .line 110
    sget-object p5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 111
    .line 112
    invoke-direct {p4, p5}, Landroidx/lifecycle/MutableLiveData;-><init>(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->u:Landroidx/lifecycle/MutableLiveData;

    .line 116
    .line 117
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 118
    .line 119
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 120
    .line 121
    .line 122
    move-result-object p4

    .line 123
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->w:Lvd/k;

    .line 124
    .line 125
    invoke-static {p4}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 126
    .line 127
    .line 128
    move-result-object p4

    .line 129
    iput-object p4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->x:Lvd/p;

    .line 130
    .line 131
    invoke-static {p1, p1, p2, p3, p2}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->y:Lvd/k;

    .line 136
    .line 137
    invoke-static {p1}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->z:Lvd/p;

    .line 142
    .line 143
    return-void
.end method

.method public static final R(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static synthetic e(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->R(Lcom/friday/common/entity/ResourceEntity;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lcom/friday/common/entity/CreateNoteInput;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->u(Ljava/lang/String;Lcom/friday/common/entity/CreateNoteInput;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->w(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lj2/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->f:Lj2/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lc2/v0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->e:Lc2/v0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/paint/viewmodel/NewNoteViewModel;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic m(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->y:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic n(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->w:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->s:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->n:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic q(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->P(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic r(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->e0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final A()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->x:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->q:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->v:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Landroidx/lifecycle/LiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->t:Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Landroidx/lifecycle/MutableLiveData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->r:Landroidx/lifecycle/MutableLiveData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "notePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/File;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_4

    .line 16
    .line 17
    array-length v0, p1

    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    const/4 v3, 0x0

    .line 21
    if-ge v2, v0, :cond_1

    .line 22
    .line 23
    aget-object v4, p1, v2

    .line 24
    .line 25
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    if-eqz v5, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "res"

    .line 36
    .line 37
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_0

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const-string v6, "page_mdb"

    .line 48
    .line 49
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move-object v4, v3

    .line 60
    :goto_1
    if-eqz v4, :cond_4

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    array-length v0, p1

    .line 69
    :goto_2
    if-ge v1, v0, :cond_3

    .line 70
    .line 71
    aget-object v2, p1, v1

    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    const-string v5, "screenshot.png"

    .line 78
    .line 79
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    move-object v3, v2

    .line 86
    goto :goto_3

    .line 87
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    :goto_3
    if-eqz v3, :cond_4

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_4
    const-string p1, ""

    .line 100
    .line 101
    return-object p1
.end method

.method public final K()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->o:Lvd/p;

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
    new-instance v3, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$getPreviewNoteList$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

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

.method public final N(Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->d:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lcom/friday/common/dao/UserDao;->i(Lcom/friday/common/dao/UserDao;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final O()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/viewmodel/NewNoteViewModel$goAsking$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$goAsking$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

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

.method public final P(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
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
    new-instance v2, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v2, p1, p0, v0, v3}, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleResource$2;-><init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lvc/c;)V

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

.method public final Q(Ljava/lang/String;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;

    iget v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    :goto_0
    move-object v9, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;

    invoke-direct {v4, v1, v3}, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    goto :goto_0

    :goto_1
    iget-object v3, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->w:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v4

    .line 1
    iget v5, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    const-string v13, ", \u5f53\u524d\u753b\u677f\u56fe\u7247\u6570="

    const/4 v14, 0x4

    const/4 v15, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_5

    if-eq v5, v8, :cond_4

    if-eq v5, v7, :cond_3

    if-eq v5, v15, :cond_2

    if-ne v5, v14, :cond_1

    iget v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->r:I

    iget v2, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    iget-object v5, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->p:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->o:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->n:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    iget-object v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->l:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v10, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->k:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v12, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->j:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->i:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v15, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->h:Ljava/lang/Object;

    check-cast v15, Ljava/util/Set;

    iget-object v14, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->g:Ljava/lang/Object;

    check-cast v14, Ljava/util/Set;

    iget-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    check-cast v6, Ljava/util/Set;

    iget-object v11, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    move/from16 p1, v0

    iget-object v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v3, p1

    move-object/from16 v21, v6

    move-object/from16 v18, v15

    const/4 v6, 0x4

    move-object v15, v14

    move-object v14, v13

    move-object/from16 v13, p2

    goto/16 :goto_14

    :catchall_0
    move-exception v0

    goto/16 :goto_17

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    iget-object v2, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->k:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->j:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->i:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->h:Ljava/lang/Object;

    check-cast v7, Ljava/util/Set;

    iget-object v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->g:Ljava/lang/Object;

    check-cast v8, Ljava/util/Set;

    iget-object v10, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    check-cast v10, Ljava/util/Set;

    iget-object v11, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v13, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    check-cast v13, Ljava/util/List;

    iget-object v14, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    :try_start_1
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_e

    :cond_3
    iget v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->t:I

    iget v2, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->s:I

    iget v5, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->r:I

    iget v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    iget-object v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->o:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->m:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v11, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->l:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v14, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->j:Ljava/lang/Object;

    check-cast v14, Ljava/util/Iterator;

    iget-object v15, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->i:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    iget-object v12, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->h:Ljava/lang/Object;

    check-cast v12, Ljava/util/Collection;

    iget-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->g:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v10, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    move/from16 p1, v0

    iget-object v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 p2, v0

    iget-object v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    move-object/from16 v22, v0

    iget-object v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    :try_start_2
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v29, v8

    move/from16 v8, p1

    move/from16 p1, v6

    move v6, v2

    move-object/from16 v2, v29

    move-object/from16 v29, v15

    move-object v15, v0

    move-object v0, v12

    move-object/from16 v12, p2

    goto/16 :goto_7

    :cond_4
    iget v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    iget-object v2, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v5, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    :try_start_3
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v11, v3

    move-object v3, v2

    move-object v2, v6

    move-object v6, v5

    move-object v5, v11

    move v11, v0

    move-object v0, v7

    const/4 v12, 0x0

    const/16 v14, 0xa

    const/4 v15, 0x2

    goto/16 :goto_5

    :cond_5
    invoke-static {v3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    :try_start_4
    sget-object v3, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 3
    iget-object v3, v1, Lcom/friday/paint/viewmodel/NewNoteViewModel;->m:Ljava/util/Set;

    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v3, v5}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    .line 4
    new-instance v3, Ljava/io/File;

    const-string v5, "res/image"

    invoke-direct {v3, v0, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_1f

    .line 5
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 6
    array-length v6, v3

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_7

    aget-object v10, v3, v7

    .line 7
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "getName(...)"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "_deleted"

    const/4 v8, 0x0

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static {v11, v12, v8, v14, v15}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v2, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    .line 8
    invoke-interface {v5, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v7, v7, 0x1

    const/4 v8, 0x1

    goto :goto_2

    :cond_7
    const/4 v14, 0x2

    const/4 v15, 0x0

    .line 9
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_8

    move-object v3, v5

    goto :goto_3

    :cond_8
    move-object v3, v15

    :goto_3
    if-nez v3, :cond_9

    goto/16 :goto_16

    .line 10
    :cond_9
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\u9875\u9762NewNoteViewModel.kt -> handleSaveExitImage, pageName="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ", \u5f85\u6e05\u7406\u56fe\u7247\u6570="

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    .line 11
    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 12
    new-instance v6, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v7, :cond_a

    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    add-int/lit8 v8, v8, 0x1

    .line 14
    check-cast v10, Ljava/io/File;

    .line 15
    invoke-virtual {v10}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v10

    .line 16
    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    move/from16 v16, v5

    .line 17
    iget-object v5, v1, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    iput-object v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    iput-object v2, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    iput-object v3, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    const/4 v8, 0x0

    iput v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    const/4 v7, 0x1

    iput v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    move/from16 v17, v8

    const-wide/16 v7, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    move v15, v14

    move/from16 v14, v16

    move/from16 v12, v17

    invoke-static/range {v5 .. v11}, Lcom/friday/common/dao/ResourceDao;->w(Lcom/friday/common/dao/ResourceDao;Ljava/util/List;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_b

    goto/16 :goto_13

    :cond_b
    move v11, v12

    .line 18
    :goto_5
    check-cast v5, Ljava/util/List;

    .line 19
    move-object v7, v6

    check-cast v7, Ljava/lang/Iterable;

    .line 20
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 21
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object v15, v2

    move-object v2, v3

    move-object/from16 v29, v7

    move-object v14, v8

    move-object/from16 p1, v10

    move v3, v12

    move v8, v3

    move-object v12, v0

    move-object/from16 v10, v29

    move v0, v11

    move-object v11, v6

    move v6, v8

    :goto_6
    invoke-interface/range {p1 .. p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v22

    if-eqz v22, :cond_f

    invoke-interface/range {p1 .. p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v22

    .line 22
    move-object/from16 v23, v22

    check-cast v23, Ljava/lang/String;

    move-object/from16 p2, v7

    .line 23
    iget-object v7, v1, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    invoke-static/range {v23 .. v23}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    iput-object v12, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    iput-object v15, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    iput-object v11, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    move-object/from16 v24, v7

    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->g:Ljava/lang/Object;

    iput-object v14, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->h:Ljava/lang/Object;

    invoke-static/range {v29 .. v29}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->i:Ljava/lang/Object;

    move-object/from16 v7, p1

    iput-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->j:Ljava/lang/Object;

    move-object/from16 p1, v7

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->k:Ljava/lang/Object;

    iput-object v5, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->l:Ljava/lang/Object;

    iput-object v2, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->m:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->n:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->o:Ljava/lang/Object;

    iput v0, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    iput v3, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->r:I

    iput v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->s:I

    iput v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->t:I

    const/4 v7, 0x0

    iput v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->u:I

    iput v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->v:I

    const/4 v7, 0x2

    iput v7, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    move-object/from16 v22, v24

    const-wide/16 v24, 0x0

    const/16 v27, 0x2

    const/16 v28, 0x0

    move-object/from16 v26, v9

    invoke-static/range {v22 .. v28}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v7, v26

    if-ne v9, v4, :cond_c

    goto/16 :goto_13

    :cond_c
    move-object/from16 v22, v14

    move-object/from16 v14, p1

    move/from16 p1, v0

    move-object/from16 v0, v22

    move-object/from16 v22, v15

    move-object v15, v12

    move-object v12, v11

    move-object v11, v5

    move v5, v3

    move-object v3, v9

    move-object v9, v7

    move-object/from16 v7, p2

    :goto_7
    check-cast v3, Lcom/friday/common/entity/ResourceEntity;

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v3

    goto :goto_8

    :cond_d
    const/4 v3, 0x0

    :goto_8
    if-eqz v3, :cond_e

    .line 24
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_e
    move-object v3, v0

    move/from16 v0, p1

    move-object/from16 p1, v14

    move-object v14, v3

    move v3, v5

    move-object v5, v11

    move-object v11, v12

    move-object v12, v15

    move-object/from16 v15, v22

    goto/16 :goto_6

    :cond_f
    move-object v7, v9

    .line 25
    check-cast v14, Ljava/util/List;

    .line 26
    check-cast v14, Ljava/lang/Iterable;

    .line 27
    invoke-static {v14}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v10

    .line 28
    iget-object v3, v1, Lcom/friday/paint/viewmodel/NewNoteViewModel;->m:Ljava/util/Set;

    check-cast v3, Ljava/lang/Iterable;

    move-object v6, v11

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v6}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v3, v6}, Lrc/g0;->s0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v8

    .line 29
    move-object v3, v10

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_10

    .line 30
    move-object v3, v8

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v10, v3}, Lrc/z0;->k(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    goto :goto_9

    .line 31
    :cond_10
    invoke-static {}, Lrc/y0;->f()Ljava/util/Set;

    move-result-object v3

    .line 32
    :goto_9
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_11

    .line 33
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v6

    invoke-interface {v10}, Ljava/util/Set;->size()I

    move-result v9

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v14

    move-object/from16 v20, v2

    invoke-interface {v8}, Ljava/util/Set;->size()I

    move-result v2

    move-object/from16 p1, v3

    invoke-interface/range {p1 .. p1}, Ljava/util/Set;->size()I

    move-result v3

    move-object/from16 v22, v5

    .line 34
    move-object/from16 v5, p1

    check-cast v5, Ljava/lang/Iterable;

    move-object/from16 p2, v8

    const/16 v8, 0x14

    invoke-static {v5, v8}, Lrc/g0;->Q0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v5

    move-object/from16 v23, v5

    check-cast v23, Ljava/lang/Iterable;

    const/16 v30, 0x3f

    const/16 v31, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-static/range {v23 .. v31}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v23, v10

    const-string v10, "\u9875\u9762NewNoteViewModel.kt -> handleSaveExitImage, \u8df3\u8fc7\u672a\u786e\u8ba4\u5220\u9664\u7684\u56fe\u7247\u8d44\u6e90\u6e05\u7406\uff0cpageName="

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", \u672c\u5730\u8d44\u6e90\u8bb0\u5f55\u6570="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", \u5df2\u4e0a\u4f20\u8d44\u6e90\u6570="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ", \u663e\u5f0f\u5220\u9664\u8d44\u6e90\u6570="

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", \u8df3\u8fc7\u8d44\u6e90\u6570="

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", \u8df3\u8fc7\u8d44\u6e90\u793a\u4f8b="

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    .line 35
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    goto :goto_a

    :cond_11
    move-object/from16 v20, v2

    move-object/from16 p1, v3

    move-object/from16 v22, v5

    move-object/from16 p2, v8

    move-object/from16 v23, v10

    .line 36
    :goto_a
    move-object/from16 v2, v20

    check-cast v2, Ljava/lang/Iterable;

    .line 37
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 38
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Ljava/io/File;

    .line 39
    move-object/from16 v8, p1

    check-cast v8, Ljava/lang/Iterable;

    .line 40
    instance-of v9, v8, Ljava/util/Collection;

    if-eqz v9, :cond_12

    move-object v9, v8

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_12

    goto :goto_c

    .line 41
    :cond_12
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_14

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 42
    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_13

    goto :goto_b

    .line 43
    :cond_14
    :goto_c
    invoke-interface {v6, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    .line 44
    :cond_15
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_16

    .line 45
    const-string v0, "\u9875\u9762NewNoteViewModel.kt -> handleSaveExitImage, \u5f53\u524d\u6ca1\u6709\u9700\u8981\u5b9e\u9645\u5220\u9664\u7684\u56fe\u7247\u8d44\u6e90"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 46
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0

    .line 47
    :cond_16
    iget-object v2, v1, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 48
    new-instance v3, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v6, v14}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 49
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v8, 0x0

    :goto_d
    if-ge v8, v5, :cond_17

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v8, v8, 0x1

    .line 50
    check-cast v9, Ljava/io/File;

    .line 51
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    .line 52
    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 53
    :cond_17
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->g:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->h:Ljava/lang/Object;

    iput-object v6, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->i:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->j:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->k:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->l:Ljava/lang/Object;

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->m:Ljava/lang/Object;

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->n:Ljava/lang/Object;

    iput-object v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->o:Ljava/lang/Object;

    iput v0, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    const/4 v5, 0x3

    iput v5, v7, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    invoke-interface {v2, v3, v7}, Lcom/friday/common/dao/ResourceDao;->i(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_18

    goto/16 :goto_13

    :cond_18
    move-object/from16 v8, p2

    move-object v9, v7

    move-object v14, v12

    move-object v13, v15

    move-object/from16 v2, v20

    move-object/from16 v5, v22

    move-object/from16 v10, v23

    move-object/from16 v7, p1

    .line 54
    :goto_e
    check-cast v3, Ljava/util/List;

    .line 55
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v12

    .line 56
    move-object v15, v3

    check-cast v15, Ljava/lang/Iterable;

    move/from16 p1, v0

    const/16 v0, 0x14

    invoke-static {v15, v0}, Lrc/g0;->Q0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/Iterable;

    new-instance v24, Le4/d;

    invoke-direct/range {v24 .. v24}, Le4/d;-><init>()V

    const/16 v25, 0x1f

    const/16 v26, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v18 .. v26}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 p2, v2

    const-string v2, "\u9875\u9762NewNoteViewModel.kt -> handleSaveExitImage, \u5df2\u4e0a\u4f20\u5f85\u5220\u8d44\u6e90\u6570="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", \u8d44\u6e90\u793a\u4f8b="

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 58
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    .line 59
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v12, v10

    move-object v10, v0

    move-object v0, v14

    move-object v14, v6

    move-object v6, v12

    move-object v12, v3

    move-object/from16 v18, v7

    move-object v15, v8

    const/4 v3, 0x0

    move-object v8, v2

    move-object v7, v5

    move/from16 v2, p1

    move-object/from16 v5, p2

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v19

    check-cast v20, Ljava/io/File;

    move-object/from16 p1, v0

    .line 60
    move-object v0, v12

    check-cast v0, Ljava/lang/Iterable;

    move-object/from16 p2, v5

    .line 61
    instance-of v5, v0, Ljava/util/Collection;

    if-eqz v5, :cond_19

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_19

    goto :goto_11

    .line 62
    :cond_19
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/friday/common/entity/ResourceEntity;

    .line 63
    invoke-virtual {v5}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v21, v0

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1a

    move-object/from16 v21, v6

    goto :goto_12

    :cond_1a
    move-object/from16 v0, v21

    goto :goto_10

    .line 64
    :cond_1b
    :goto_11
    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v6

    const-string v6, "\u9875\u9762NewNoteViewModel.kt -> handleSaveExitImage, \u5220\u9664\u672a\u4e0a\u4f20\u672c\u5730\u56fe\u7247 "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 65
    invoke-static/range {v20 .. v20}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 66
    :goto_12
    iget-object v0, v1, Lcom/friday/paint/viewmodel/NewNoteViewModel;->e:Lc2/v0;

    invoke-virtual/range {v20 .. v20}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getAbsolutePath(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->c:Ljava/lang/Object;

    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->d:Ljava/lang/Object;

    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->e:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->f:Ljava/lang/Object;

    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->g:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->h:Ljava/lang/Object;

    iput-object v14, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->i:Ljava/lang/Object;

    iput-object v12, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->j:Ljava/lang/Object;

    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->k:Ljava/lang/Object;

    iput-object v8, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->l:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->m:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->n:Ljava/lang/Object;

    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->o:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->p:Ljava/lang/Object;

    iput v2, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->q:I

    iput v3, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->r:I

    const/4 v6, 0x0

    iput v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->s:I

    const/4 v6, 0x4

    iput v6, v9, Lcom/friday/paint/viewmodel/NewNoteViewModel$handleSaveExitImage$1;->y:I

    invoke-interface {v0, v5, v9}, Lc2/v0;->c(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_1c

    :goto_13
    return-object v4

    :cond_1c
    move-object/from16 v0, p1

    move-object/from16 v5, p2

    :goto_14
    move-object/from16 v6, v21

    goto/16 :goto_f

    .line 67
    :cond_1d
    iget-object v0, v1, Lcom/friday/paint/viewmodel/NewNoteViewModel;->m:Ljava/util/Set;

    check-cast v14, Ljava/lang/Iterable;

    .line 68
    new-instance v2, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v14, v5}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 70
    check-cast v4, Ljava/io/File;

    .line 71
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 72
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .line 73
    :cond_1e
    invoke-static {v2}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v0, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    move-result v0

    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 74
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_18

    .line 75
    :cond_1f
    :goto_16
    sget-object v0, Lqc/q;->a:Lqc/q;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v0

    .line 76
    :goto_17
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 77
    :goto_18
    invoke-static {v0}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_20

    .line 78
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u9875\u9762NewNoteViewModel.kt -> handleSaveExitImage, \u5904\u7406\u5931\u8d25: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 79
    :cond_20
    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final S(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/paint/viewmodel/NewNoteViewModel$insertImageSafety$2;

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    invoke-direct {v1, p0, p1, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$insertImageSafety$2;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)V

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
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 16
    .line 17
    return-object p1
.end method

.method public final T(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "imagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->m:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final U(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "pageDir"

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
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    new-instance v4, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel$repairMissingImagesByPageDir$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x2

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final V(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->g:Z

    .line 2
    .line 3
    return-void
.end method

.method public final W(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final X(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final Y(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->i:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final Z(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->l:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final a0(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->j:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public final b0(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->q:Landroidx/lifecycle/MutableLiveData;

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

.method public final c0(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->u:Landroidx/lifecycle/MutableLiveData;

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

.method public final d0(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-static {p1}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v2, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, p1, p0, v3}, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;-><init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, p2}, Lcom/friday/common/helper/NotePageOrder;->e(Ljava/lang/String;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1
.end method

.method public final e0(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move-object v1, p1

    .line 5
    move-object v2, p2

    .line 6
    move v3, p3

    .line 7
    move-object v4, p4

    .line 8
    move-object v6, p5

    .line 9
    invoke-interface/range {v0 .. v6}, Lcom/friday/common/dao/FileDao;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p1
.end method

.method public final f0(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;->f:I

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
    iput v1, v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;->f:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;->f:I

    .line 34
    .line 35
    const/4 v8, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v8, :cond_1

    .line 39
    .line 40
    iget-object p1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    if-nez p1, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 63
    .line 64
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iput-object p2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;->c:Ljava/lang/Object;

    .line 69
    .line 70
    iput v8, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$wasDeleted$1;->f:I

    .line 71
    .line 72
    const-wide/16 v3, 0x0

    .line 73
    .line 74
    const/4 v6, 0x2

    .line 75
    const/4 v7, 0x0

    .line 76
    move-object v2, p1

    .line 77
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->u(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    if-ne p2, v0, :cond_4

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_4
    :goto_2
    check-cast p2, Lcom/friday/common/entity/ResourceEntity;

    .line 85
    .line 86
    if-eqz p2, :cond_5

    .line 87
    .line 88
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getWasDeleted()Z

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    :cond_5
    :goto_3
    invoke-static {v8}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
.end method

.method public final s(Lvc/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Lcom/friday/common/helper/NotePageOrder;->a:Lcom/friday/common/helper/NotePageOrder;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h:Ljava/lang/String;

    .line 4
    .line 5
    new-instance v2, Lcom/friday/paint/viewmodel/NewNoteViewModel$awaitPendingSave$2;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v3}, Lcom/friday/paint/viewmodel/NewNoteViewModel$awaitPendingSave$2;-><init>(Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, p1}, Lcom/friday/common/helper/NotePageOrder;->e(Ljava/lang/String;Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

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

.method public final t()V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lsd/i0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$copyToOthers$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

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

.method public final u(Ljava/lang/String;Lcom/friday/common/entity/CreateNoteInput;Lvc/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/friday/common/entity/CreateNoteInput;->getNoteId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual/range {p2 .. p2}, Lcom/friday/common/entity/CreateNoteInput;->getUserId()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    invoke-virtual/range {p2 .. p2}, Lcom/friday/common/entity/CreateNoteInput;->getNoteName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    invoke-virtual/range {p2 .. p2}, Lcom/friday/common/entity/CreateNoteInput;->getLocalPath()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual/range {p2 .. p2}, Lcom/friday/common/entity/CreateNoteInput;->getParentId()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    new-instance v0, Lcom/friday/common/entity/FileEntity;

    .line 22
    .line 23
    const v22, 0x6e000

    .line 24
    .line 25
    .line 26
    const/16 v23, 0x0

    .line 27
    .line 28
    const-string v5, ""

    .line 29
    .line 30
    const-string v7, "12"

    .line 31
    .line 32
    const/4 v11, 0x1

    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v13, 0x0

    .line 35
    const/4 v14, 0x0

    .line 36
    const/4 v15, 0x0

    .line 37
    const/16 v16, 0x0

    .line 38
    .line 39
    const/16 v17, 0x0

    .line 40
    .line 41
    const/16 v18, 0x1

    .line 42
    .line 43
    const-wide/16 v19, 0x0

    .line 44
    .line 45
    const/16 v21, 0x0

    .line 46
    .line 47
    move-object/from16 v10, p1

    .line 48
    .line 49
    move-object/from16 v9, p1

    .line 50
    .line 51
    invoke-direct/range {v0 .. v23}, Lcom/friday/common/entity/FileEntity;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZLjava/lang/String;ILjava/lang/String;ZJZILkotlin/jvm/internal/n;)V

    .line 52
    .line 53
    .line 54
    move-object v1, v0

    .line 55
    move-object/from16 v0, p0

    .line 56
    .line 57
    iget-object v2, v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 58
    .line 59
    move-object/from16 v3, p3

    .line 60
    .line 61
    invoke-interface {v2, v1, v3}, Lcom/friday/common/dao/FileDao;->I(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-ne v1, v2, :cond_0

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_0
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 73
    .line 74
    return-object v1
.end method

.method public final v(ILjava/util/List;)V
    .locals 7

    .line 1
    const-string v0, "dataList"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p1, p2, p0, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$1;-><init>(ILjava/util/List;Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    new-instance v3, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;

    .line 13
    .line 14
    invoke-direct {v3, p0, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteNote$2;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

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

.method public final w(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p3, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->i:I

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
    iput v1, v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->i:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p3}, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;-><init>(Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p3, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->g:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->i:I

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    iget-boolean p1, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->f:Z

    .line 41
    .line 42
    iget-object p2, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->e:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Ljava/io/File;

    .line 45
    .line 46
    iget-object v0, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    iget-object v0, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    :try_start_0
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object p3, v0

    .line 60
    goto :goto_4

    .line 61
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_2
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance p3, Ljava/io/File;

    .line 73
    .line 74
    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object v1, Lf2/e;->a:Lf2/e;

    .line 78
    .line 79
    invoke-virtual {v1, p3}, Lf2/e;->b(Ljava/io/File;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    :try_start_1
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 84
    .line 85
    iget-wide v4, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->p:J

    .line 86
    .line 87
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iput-object v3, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->c:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    iput-object v3, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->d:Ljava/lang/Object;

    .line 98
    .line 99
    iput-object p3, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->e:Ljava/lang/Object;

    .line 100
    .line 101
    iput-boolean v7, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->f:Z

    .line 102
    .line 103
    iput v2, v6, Lcom/friday/paint/viewmodel/NewNoteViewModel$deleteResource$1;->i:I

    .line 104
    .line 105
    move-object v2, p1

    .line 106
    move-object v3, p2

    .line 107
    invoke-interface/range {v1 .. v6}, Lcom/friday/common/dao/ResourceDao;->A(Ljava/lang/String;Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 111
    if-ne p1, v0, :cond_3

    .line 112
    .line 113
    return-object v0

    .line 114
    :cond_3
    move-object p2, p3

    .line 115
    move-object p3, p1

    .line 116
    move p1, v7

    .line 117
    :goto_2
    :try_start_2
    check-cast p3, Ljava/util/List;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 118
    .line 119
    check-cast p3, Ljava/lang/Iterable;

    .line 120
    .line 121
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result p2

    .line 129
    if-eqz p2, :cond_4

    .line 130
    .line 131
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    check-cast p2, Lcom/friday/common/entity/ResourceEntity;

    .line 136
    .line 137
    invoke-virtual {p2}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-static {p2}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 146
    .line 147
    return-object p1

    .line 148
    :catch_1
    move-exception v0

    .line 149
    move-object p1, v0

    .line 150
    move-object p2, p3

    .line 151
    move-object p3, p1

    .line 152
    move p1, v7

    .line 153
    :goto_4
    if-eqz p1, :cond_5

    .line 154
    .line 155
    :try_start_3
    sget-object p1, Lf2/e;->a:Lf2/e;

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Lf2/e;->d(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :catch_2
    move-exception v0

    .line 162
    move-object p1, v0

    .line 163
    invoke-static {p3, p1}, Lqc/b;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    :cond_5
    :goto_5
    throw p3
.end method

.method public final x(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string p1, "com.zykj.manage"

    .line 2
    .line 3
    const-string v0, "com.zykj.gallery.ui.share.ShareActivity"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ActivityUtils;->isActivityExists(Ljava/lang/String;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-static {p1}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final y()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->z:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z(Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel;->d:Lcom/friday/common/dao/UserDao;

    .line 2
    .line 3
    const/4 v4, 0x1

    .line 4
    const/4 v5, 0x0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    move-object v3, p1

    .line 8
    invoke-static/range {v0 .. v5}, Lcom/friday/common/dao/UserDao;->e(Lcom/friday/common/dao/UserDao;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
