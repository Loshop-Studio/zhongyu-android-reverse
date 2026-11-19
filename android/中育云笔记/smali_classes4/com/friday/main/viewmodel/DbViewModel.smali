.class public final Lcom/friday/main/viewmodel/DbViewModel;
.super Lcom/friday/common/base/BaseViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final b:Lcom/friday/common/dao/FileDao;

.field public final c:Lcom/friday/common/dao/ResourceDao;

.field public final d:Lc2/g2;

.field public final e:Lc2/v0;

.field public final f:Lvd/l;

.field public final g:Lvd/u;

.field public final h:Lvd/l;

.field public final i:Lvd/u;

.field public final j:Lvd/l;

.field public final k:Lvd/u;

.field public final l:Lvd/l;

.field public final m:Lvd/u;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/g2;Lc2/v0;)V
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
    const-string v0, "shareCacheDao"

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
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/friday/main/viewmodel/DbViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/friday/main/viewmodel/DbViewModel;->d:Lc2/g2;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/friday/main/viewmodel/DbViewModel;->e:Lc2/v0;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/DbViewModel;->m()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/DbViewModel;->o()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/DbViewModel;->p()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/friday/main/viewmodel/DbViewModel;->n()V

    .line 42
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
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->f:Lvd/l;

    .line 53
    .line 54
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->g:Lvd/u;

    .line 59
    .line 60
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->h:Lvd/l;

    .line 69
    .line 70
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->i:Lvd/u;

    .line 75
    .line 76
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->j:Lvd/l;

    .line 85
    .line 86
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->k:Lvd/u;

    .line 91
    .line 92
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {p1}, Lvd/v;->a(Ljava/lang/Object;)Lvd/l;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->l:Lvd/l;

    .line 101
    .line 102
    invoke-static {p1}, Lvd/e;->b(Lvd/l;)Lvd/u;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, p0, Lcom/friday/main/viewmodel/DbViewModel;->m:Lvd/u;

    .line 107
    .line 108
    return-void
.end method

.method public static final synthetic e(Lcom/friday/main/viewmodel/DbViewModel;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->b:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lcom/friday/main/viewmodel/DbViewModel;)Lc2/v0;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->e:Lc2/v0;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lcom/friday/main/viewmodel/DbViewModel;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->c:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/main/viewmodel/DbViewModel;)Lc2/g2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->d:Lc2/g2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/main/viewmodel/DbViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->f:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/main/viewmodel/DbViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->l:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/main/viewmodel/DbViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->h:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/main/viewmodel/DbViewModel;)Lvd/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/main/viewmodel/DbViewModel;->j:Lvd/l;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final m()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/main/viewmodel/DbViewModel$fetchDb$1;-><init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V

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

.method public final n()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/main/viewmodel/DbViewModel$fetchImageDb$1;-><init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V

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

.method public final o()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/main/viewmodel/DbViewModel$fetchResDb$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/main/viewmodel/DbViewModel$fetchResDb$1;-><init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V

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

.method public final p()V
    .locals 6

    .line 1
    new-instance v1, Lcom/friday/main/viewmodel/DbViewModel$fetchShareDb$1;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, p0, v0}, Lcom/friday/main/viewmodel/DbViewModel$fetchShareDb$1;-><init>(Lcom/friday/main/viewmodel/DbViewModel;Lvc/c;)V

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

.method public final q()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel;->g:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel;->m:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel;->i:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Lvd/u;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/viewmodel/DbViewModel;->k:Lvd/u;

    .line 2
    .line 3
    return-object v0
.end method
