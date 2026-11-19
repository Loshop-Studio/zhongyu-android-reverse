.class public final Lcom/friday/document/viewmodel/ShareBaseViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Ls2/b;

.field public final c:Lc2/g2;

.field public final d:Lcom/friday/common/dao/ResourceDao;

.field public final e:Lcom/friday/document/service/FileManager;

.field public final f:Lvd/l;

.field public final g:Lvd/u;

.field public final h:Lvd/l;

.field public final i:Lvd/u;

.field public final j:Lvd/k;

.field public final k:Lvd/p;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/util/HashMap;

.field public final n:Lvd/l;

.field public final o:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ls2/b;Lc2/g2;Lcom/friday/common/dao/ResourceDao;Lcom/friday/document/service/FileManager;)V
    .locals 1

    .line 1
    const-string v0, "shareService"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "shareCacheDao"

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
    const-string v0, "fileManager"

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
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->b:Ls2/b;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->c:Lc2/g2;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->d:Lcom/friday/common/dao/ResourceDao;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->e:Lcom/friday/document/service/FileManager;

    .line 31
    .line 32
    const/4 p1, 0x0

    .line 33
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->f:Lvd/l;

    .line 38
    .line 39
    invoke-static {p2}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->g:Lvd/u;

    .line 44
    .line 45
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-static {p2}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->h:Lvd/l;

    .line 54
    .line 55
    invoke-static {p2}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iput-object p2, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->i:Lvd/u;

    .line 60
    .line 61
    const/4 p2, 0x0

    .line 62
    const/4 p3, 0x7

    .line 63
    invoke-static {p2, p2, p1, p3, p1}, Lvd/q;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lvd/k;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->j:Lvd/k;

    .line 68
    .line 69
    invoke-static {p1}, Lvd/e;->a(Lvd/k;)Lvd/p;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->k:Lvd/p;

    .line 74
    .line 75
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDataPath()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    sget-object p2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {p0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->J()J

    .line 82
    .line 83
    .line 84
    move-result-wide p3

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string p1, "share"

    .line 97
    .line 98
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->l:Ljava/lang/String;

    .line 115
    .line 116
    new-instance p1, Ljava/util/HashMap;

    .line 117
    .line 118
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 119
    .line 120
    .line 121
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->m:Ljava/util/HashMap;

    .line 122
    .line 123
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->n:Lvd/l;

    .line 132
    .line 133
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iput-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->o:Lvd/u;

    .line 138
    .line 139
    return-void
.end method

.method public static synthetic H(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->G(Lcom/friday/document/model/ShareFile;Ljava/util/List;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final J()J
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

.method public static final synthetic e(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lhd/p;Lhd/p;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->n(Lcom/friday/document/model/ShareFile;Lhd/p;Lhd/p;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final varargs synthetic f(Lcom/friday/document/viewmodel/ShareBaseViewModel;Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->y(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic g(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->d:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->m:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Lc2/g2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->c:Lc2/g2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Ls2/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->b:Ls2/b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/document/viewmodel/ShareBaseViewModel;)Lvd/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->j:Lvd/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/friday/document/viewmodel/ShareBaseViewModel;)J
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->J()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static synthetic o(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lhd/p;Lhd/p;Lhd/p;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x4

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p3, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p6, 0x8

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move-object p4, v0

    .line 12
    :cond_1
    invoke-virtual/range {p0 .. p5}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->n(Lcom/friday/document/model/ShareFile;Lhd/p;Lhd/p;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static synthetic t(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x1

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->s(Lcom/friday/document/model/ShareFile;ZLvc/c;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final A()Lvd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->k:Lvd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final B()Lcom/friday/document/service/FileManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->e:Lcom/friday/document/service/FileManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->i:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->f:I

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
    iput v1, v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->f:I

    .line 18
    .line 19
    :goto_0
    move-object v5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v5, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->d:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v5, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->f:I

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
    iget-object p1, v5, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/friday/document/model/ShareFile;

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
    iget-object v1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->d:Lcom/friday/common/dao/ResourceDao;

    .line 60
    .line 61
    move p2, v2

    .line 62
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, v5, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    iput p2, v5, Lcom/friday/document/viewmodel/ShareBaseViewModel$getPreviewList$1;->f:I

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    const/4 v6, 0x2

    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-static/range {v1 .. v7}, Lcom/friday/common/dao/ResourceDao;->c(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    if-ne p2, v0, :cond_3

    .line 83
    .line 84
    return-object v0

    .line 85
    :cond_3
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/Iterable;

    .line 88
    .line 89
    new-instance p1, Lcom/friday/document/viewmodel/ShareBaseViewModel$a;

    .line 90
    .line 91
    invoke-direct {p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel$a;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-static {p2, p1}, Lrc/g0;->P0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/lang/Iterable;

    .line 99
    .line 100
    new-instance p2, Ljava/util/ArrayList;

    .line 101
    .line 102
    const/16 v0, 0xa

    .line 103
    .line 104
    invoke-static {p1, v0}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_4

    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lcom/friday/common/entity/ResourceEntity;

    .line 126
    .line 127
    new-instance v1, Ljava/io/File;

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :cond_4
    return-object p2
.end method

.method public final E(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/ShareBaseViewModel$insertVideoCache$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel$insertVideoCache$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final F(Lcom/friday/document/model/ShareFile;)V
    .locals 7

    .line 1
    const-string v0, "shareFile"

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
    new-instance v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$sendDismissEvent$1;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel$sendDismissEvent$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

.method public final G(Lcom/friday/document/model/ShareFile;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "imageList"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->f:Lvd/l;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->h:Lvd/l;

    .line 12
    .line 13
    invoke-interface {p1, p2}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final I(Ljava/lang/String;)V
    .locals 7

    .line 1
    const-string v0, "fileId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lcom/friday/document/viewmodel/ShareBaseViewModel$updatePreviewTime$1;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {v2, p0, p1, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel$updatePreviewTime$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Ljava/lang/String;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    const/4 v5, 0x6

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    move-object v1, p0

    .line 17
    invoke-static/range {v1 .. v6}, Lcom/friday/common/base/BaseViewModel;->c(Lcom/friday/common/base/BaseViewModel;Lhd/p;Lhd/p;Lhd/a;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final n(Lcom/friday/document/model/ShareFile;Lhd/p;Lhd/p;Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p5, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

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
    iput v1, v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->h:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    .line 34
    .line 35
    const/4 v7, 0x4

    .line 36
    const/4 v8, 0x3

    .line 37
    const/4 v2, 0x2

    .line 38
    const/4 v3, 0x1

    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    if-eq v1, v3, :cond_4

    .line 42
    .line 43
    if-eq v1, v2, :cond_3

    .line 44
    .line 45
    if-eq v1, v8, :cond_2

    .line 46
    .line 47
    if-ne v1, v7, :cond_1

    .line 48
    .line 49
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, Lhd/p;

    .line 52
    .line 53
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Lhd/p;

    .line 56
    .line 57
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lhd/p;

    .line 60
    .line 61
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 64
    .line 65
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_2
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p1, Lhd/p;

    .line 81
    .line 82
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p1, Lhd/p;

    .line 85
    .line 86
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast p1, Lhd/p;

    .line 89
    .line 90
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 93
    .line 94
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_4

    .line 98
    .line 99
    :cond_3
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Lhd/p;

    .line 102
    .line 103
    iget-object p2, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p2, Lhd/p;

    .line 106
    .line 107
    iget-object p3, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast p3, Lhd/p;

    .line 110
    .line 111
    iget-object p4, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast p4, Lcom/friday/document/model/ShareFile;

    .line 114
    .line 115
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_4
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 120
    .line 121
    move-object p4, p1

    .line 122
    check-cast p4, Lhd/p;

    .line 123
    .line 124
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 125
    .line 126
    move-object p3, p1

    .line 127
    check-cast p3, Lhd/p;

    .line 128
    .line 129
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 130
    .line 131
    move-object p2, p1

    .line 132
    check-cast p2, Lhd/p;

    .line 133
    .line 134
    iget-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 137
    .line 138
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    invoke-static {p5}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    if-eqz p3, :cond_6

    .line 146
    .line 147
    iput-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 148
    .line 149
    iput-object p2, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-static {p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p5

    .line 155
    iput-object p5, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object p4, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 158
    .line 159
    iput v3, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    .line 160
    .line 161
    invoke-interface {p3, p1, v4}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p5

    .line 165
    if-ne p5, v0, :cond_6

    .line 166
    .line 167
    goto/16 :goto_5

    .line 168
    .line 169
    :cond_6
    :goto_2
    iput-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 170
    .line 171
    iput-object p2, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 172
    .line 173
    invoke-static {p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p5

    .line 177
    iput-object p5, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object p4, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 180
    .line 181
    iput v2, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    .line 182
    .line 183
    const/4 v3, 0x0

    .line 184
    const/4 v5, 0x2

    .line 185
    const/4 v6, 0x0

    .line 186
    move-object v1, p0

    .line 187
    move-object v2, p1

    .line 188
    invoke-static/range {v1 .. v6}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->t(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p5

    .line 192
    if-ne p5, v0, :cond_7

    .line 193
    .line 194
    goto :goto_5

    .line 195
    :cond_7
    move-object p1, p3

    .line 196
    move-object p3, p2

    .line 197
    move-object p2, p1

    .line 198
    move-object p1, p4

    .line 199
    move-object p4, v2

    .line 200
    :goto_3
    check-cast p5, Ljava/lang/Boolean;

    .line 201
    .line 202
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 203
    .line 204
    .line 205
    move-result p5

    .line 206
    if-nez p5, :cond_a

    .line 207
    .line 208
    sget-object v1, Lf2/c;->a:Lf2/c;

    .line 209
    .line 210
    invoke-virtual {v1}, Lf2/c;->e()Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_9

    .line 215
    .line 216
    invoke-static {p4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iput-object v1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 221
    .line 222
    invoke-static {p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    iput-object v1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 227
    .line 228
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    iput-object p2, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 233
    .line 234
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iput-object p1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 239
    .line 240
    iput-boolean p5, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->g:Z

    .line 241
    .line 242
    iput v8, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    .line 243
    .line 244
    invoke-interface {p3, p4, v4}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    if-ne p1, v0, :cond_8

    .line 249
    .line 250
    goto :goto_5

    .line 251
    :cond_8
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 252
    .line 253
    return-object p1

    .line 254
    :cond_9
    new-instance p1, Ljava/lang/Exception;

    .line 255
    .line 256
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    :cond_a
    if-eqz p1, :cond_c

    .line 261
    .line 262
    invoke-static {p4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iput-object v1, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->c:Ljava/lang/Object;

    .line 267
    .line 268
    invoke-static {p3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p3

    .line 272
    iput-object p3, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->d:Ljava/lang/Object;

    .line 273
    .line 274
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    iput-object p2, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->e:Ljava/lang/Object;

    .line 279
    .line 280
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p2

    .line 284
    iput-object p2, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->f:Ljava/lang/Object;

    .line 285
    .line 286
    iput-boolean p5, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->g:Z

    .line 287
    .line 288
    iput v7, v4, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickFile$1;->j:I

    .line 289
    .line 290
    invoke-interface {p1, p4, v4}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    if-ne p1, v0, :cond_b

    .line 295
    .line 296
    :goto_5
    return-object v0

    .line 297
    :cond_b
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 298
    .line 299
    return-object p1

    .line 300
    :cond_c
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 301
    .line 302
    return-object p1
.end method

.method public final p(Lcom/friday/document/model/ShareFile;)Lcom/friday/document/view/share/SuspendCall;
    .locals 3

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/document/view/share/SuspendCall;

    .line 7
    .line 8
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickNoteCall$1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickNoteCall$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/friday/document/view/share/SuspendCall;-><init>(Lhd/l;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final q(Lcom/friday/document/model/ShareFile;)Lcom/friday/document/view/share/SuspendCall;
    .locals 3

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/document/view/share/SuspendCall;

    .line 7
    .line 8
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickOthersCall$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/friday/document/view/share/SuspendCall;-><init>(Lhd/l;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final r(Lcom/friday/document/model/ShareFile;)Lcom/friday/document/view/share/SuspendCall;
    .locals 3

    .line 1
    const-string v0, "shareFile"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/friday/document/view/share/SuspendCall;

    .line 7
    .line 8
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickTxtCall$1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$clickTxtCall$1;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/friday/document/view/share/SuspendCall;-><init>(Lhd/l;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final s(Lcom/friday/document/model/ShareFile;ZLvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$doesFileExits$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$doesFileExits$2;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;ZLvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final u(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadCover$2;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

.method public final v(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadNoteFile$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadNoteFile$2;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

.method public final w(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadOthers$2;-><init>(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Lvc/c;)V

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

.method public final x(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/viewmodel/ShareBaseViewModel$downloadTxt$2;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/viewmodel/ShareBaseViewModel;Lvc/c;)V

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

.method public final varargs y(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p2, v2

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-static {p1, v3, v4}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    return v4

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v1
.end method

.method public final z()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/viewmodel/ShareBaseViewModel;->g:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method
