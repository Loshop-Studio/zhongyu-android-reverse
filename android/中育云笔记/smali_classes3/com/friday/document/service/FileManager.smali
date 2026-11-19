.class public final Lcom/friday/document/service/FileManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/service/FileManager$a;
    }
.end annotation


# static fields
.field public static final n:Lcom/friday/document/service/FileManager$a;

.field public static final o:I


# instance fields
.field public final a:Ld2/i;

.field public final b:Lcom/friday/common/network/StudentSession;

.field public final c:Lcom/friday/common/dao/FileDao;

.field public final d:Lcom/friday/common/dao/ResourceDao;

.field public final e:Lj2/g;

.field public final f:Lcom/friday/document/sync/SyncStateOne;

.field public final g:Lcom/friday/document/sync/SyncStateThree;

.field public final h:Lc2/g2;

.field public final i:Lsd/i0;

.field public final j:Ljava/lang/String;

.field public k:Lkotlinx/coroutines/g;

.field public final l:Lbe/a;

.field public m:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/service/FileManager$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/service/FileManager$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/service/FileManager;->n:Lcom/friday/document/service/FileManager$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/document/service/FileManager;->o:I

    return-void
.end method

.method public constructor <init>(Ld2/i;Lcom/friday/common/network/StudentSession;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lj2/g;Lcom/friday/document/sync/SyncStateOne;Lcom/friday/document/sync/SyncStateThree;Lc2/g2;Lsd/i0;)V
    .locals 1

    .line 1
    const-string v0, "service"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "studentSession"

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
    const-string v0, "resourceDao"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "noteHelper"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "syncStateOne"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "syncStateThree"

    .line 32
    .line 33
    invoke-static {p7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "shareCacheDao"

    .line 37
    .line 38
    invoke-static {p8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "externalScope"

    .line 42
    .line 43
    invoke-static {p9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, Lcom/friday/document/service/FileManager;->a:Ld2/i;

    .line 50
    .line 51
    iput-object p2, p0, Lcom/friday/document/service/FileManager;->b:Lcom/friday/common/network/StudentSession;

    .line 52
    .line 53
    iput-object p3, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 54
    .line 55
    iput-object p4, p0, Lcom/friday/document/service/FileManager;->d:Lcom/friday/common/dao/ResourceDao;

    .line 56
    .line 57
    iput-object p5, p0, Lcom/friday/document/service/FileManager;->e:Lj2/g;

    .line 58
    .line 59
    iput-object p6, p0, Lcom/friday/document/service/FileManager;->f:Lcom/friday/document/sync/SyncStateOne;

    .line 60
    .line 61
    iput-object p7, p0, Lcom/friday/document/service/FileManager;->g:Lcom/friday/document/sync/SyncStateThree;

    .line 62
    .line 63
    iput-object p8, p0, Lcom/friday/document/service/FileManager;->h:Lc2/g2;

    .line 64
    .line 65
    iput-object p9, p0, Lcom/friday/document/service/FileManager;->i:Lsd/i0;

    .line 66
    .line 67
    sget-object p1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p2}, Lcom/friday/common/helper/b;->n()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    sget-object p3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/friday/common/helper/b;->i()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    new-instance p4, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, Lcom/friday/document/service/FileManager;->j:Ljava/lang/String;

    .line 109
    .line 110
    const/4 p1, 0x1

    .line 111
    const/4 p2, 0x0

    .line 112
    const/4 p3, 0x0

    .line 113
    invoke-static {p3, p1, p2}, Lbe/f;->b(ZILjava/lang/Object;)Lbe/a;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iput-object p1, p0, Lcom/friday/document/service/FileManager;->l:Lbe/a;

    .line 118
    .line 119
    return-void
.end method

.method public static final synthetic g(Lcom/friday/document/service/FileManager;Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager;->s(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic h(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic i(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/FileDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Lcom/friday/document/service/FileManager;)Lj2/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/service/FileManager;->e:Lj2/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k(Lcom/friday/document/service/FileManager;)Lcom/friday/common/dao/ResourceDao;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/service/FileManager;->d:Lcom/friday/common/dao/ResourceDao;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic l(Lcom/friday/document/service/FileManager;)Lc2/g2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/document/service/FileManager;->h:Lc2/g2;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic m(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Ljava/lang/Exception;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/service/FileManager;->y(Lcom/friday/common/entity/FileEntity;Ljava/lang/Exception;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic n(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager;->F(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic o(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager;->H(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic p(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/service/FileManager;->J(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic q(Lcom/friday/document/service/FileManager;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/service/FileManager;->K()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static final synthetic r(Lcom/friday/document/service/FileManager;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/service/FileManager;->L(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "jpg"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "png"

    .line 11
    .line 12
    invoke-static {p1, v0, v1}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    const-string v0, "webp"

    .line 19
    .line 20
    invoke-static {p1, v0, v1}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    :cond_1
    :goto_0
    return v1
.end method

.method public final B(Lcom/friday/common/entity/FileEntity;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

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
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p1, v0, :cond_1

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p1, v2, :cond_1

    .line 24
    .line 25
    const/4 v2, 0x4

    .line 26
    if-eq p1, v2, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x5

    .line 29
    if-eq p1, v2, :cond_1

    .line 30
    .line 31
    const/16 v2, 0xa

    .line 32
    .line 33
    if-eq p1, v2, :cond_1

    .line 34
    .line 35
    return v1

    .line 36
    :cond_1
    return v0
.end method

.method public final C(Ljava/util/List;Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/friday/document/service/FileManager$newDownloadOnShare$2;-><init>(Lcom/friday/document/service/FileManager;Ljava/util/List;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

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

.method public final D(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x5

    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/16 v1, 0x1e

    .line 25
    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/friday/document/service/FileManager;->g:Lcom/friday/document/sync/SyncStateThree;

    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Lcom/friday/document/sync/SyncStateThree;->a(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-ne p1, p2, :cond_1

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 45
    .line 46
    return-object p1

    .line 47
    :cond_2
    iget-object v0, p0, Lcom/friday/document/service/FileManager;->f:Lcom/friday/document/sync/SyncStateOne;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p2}, Lcom/friday/document/sync/SyncStateOne;->l(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    if-ne p1, p2, :cond_3

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 61
    .line 62
    return-object p1
.end method

.method public final E()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/document/service/FileManager;->k:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcom/friday/document/service/FileManager;->i:Lsd/i0;

    .line 7
    .line 8
    new-instance v4, Lcom/friday/document/service/FileManager$runAsync$1;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-direct {v4, p0, v0}, Lcom/friday/document/service/FileManager$runAsync$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 12
    .line 13
    .line 14
    const/4 v5, 0x3

    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/friday/document/service/FileManager;->k:Lkotlinx/coroutines/g;

    .line 23
    .line 24
    return-void
.end method

.method public final F(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    instance-of v3, v2, Lcom/friday/document/service/FileManager$syncParentsBefore$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Lcom/friday/document/service/FileManager$syncParentsBefore$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->l:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x2

    .line 41
    const/4 v8, 0x1

    .line 42
    const/4 v9, 0x3

    .line 43
    if-eqz v5, :cond_4

    .line 44
    .line 45
    if-eq v5, v8, :cond_3

    .line 46
    .line 47
    if-eq v5, v7, :cond_2

    .line 48
    .line 49
    if-ne v5, v9, :cond_1

    .line 50
    .line 51
    iget v0, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->j:I

    .line 52
    .line 53
    iget-object v5, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Lcom/friday/common/entity/FileEntity;

    .line 56
    .line 57
    iget-object v8, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->h:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 60
    .line 61
    iget-object v8, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->f:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Ljava/util/Iterator;

    .line 64
    .line 65
    iget-object v10, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v10, Ljava/lang/Iterable;

    .line 68
    .line 69
    iget-object v11, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v11, Ljava/util/List;

    .line 72
    .line 73
    iget-object v12, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v12, Lcom/friday/common/entity/FileEntity;

    .line 76
    .line 77
    :try_start_0
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto/16 :goto_5

    .line 81
    .line 82
    :catch_0
    move-exception v0

    .line 83
    goto/16 :goto_6

    .line 84
    .line 85
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0

    .line 93
    :cond_2
    iget v0, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->k:I

    .line 94
    .line 95
    iget v5, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->j:I

    .line 96
    .line 97
    iget-object v8, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->h:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 100
    .line 101
    iget-object v10, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->g:Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v11, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->f:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v11, Ljava/util/Iterator;

    .line 106
    .line 107
    iget-object v12, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->e:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v12, Ljava/lang/Iterable;

    .line 110
    .line 111
    iget-object v13, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->d:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v13, Ljava/util/List;

    .line 114
    .line 115
    iget-object v14, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->c:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v14, Lcom/friday/common/entity/FileEntity;

    .line 118
    .line 119
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object/from16 v16, v2

    .line 123
    .line 124
    move v2, v0

    .line 125
    move v0, v5

    .line 126
    move-object v5, v10

    .line 127
    move-object v10, v12

    .line 128
    move-object v12, v13

    .line 129
    move-object/from16 v13, v16

    .line 130
    .line 131
    goto/16 :goto_3

    .line 132
    .line 133
    :cond_3
    iget-object v0, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 136
    .line 137
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_4
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {p0 .. p1}, Lcom/friday/document/service/FileManager;->B(Lcom/friday/common/entity/FileEntity;)Z

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-nez v2, :cond_5

    .line 149
    .line 150
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_5
    iput-object v0, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->c:Ljava/lang/Object;

    .line 154
    .line 155
    iput v8, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    .line 156
    .line 157
    invoke-virtual {v1, v0, v3}, Lcom/friday/document/service/FileManager;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    if-ne v2, v4, :cond_6

    .line 162
    .line 163
    goto/16 :goto_4

    .line 164
    .line 165
    :cond_6
    :goto_1
    check-cast v2, Ljava/util/List;

    .line 166
    .line 167
    move-object v5, v2

    .line 168
    check-cast v5, Ljava/lang/Iterable;

    .line 169
    .line 170
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object v8

    .line 174
    move v10, v6

    .line 175
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    if-eqz v11, :cond_e

    .line 180
    .line 181
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v11

    .line 185
    move-object v12, v11

    .line 186
    check-cast v12, Lcom/friday/common/entity/FileEntity;

    .line 187
    .line 188
    iget-object v13, v1, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 189
    .line 190
    invoke-virtual {v12}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    iput-object v0, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->c:Ljava/lang/Object;

    .line 195
    .line 196
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v15

    .line 200
    iput-object v15, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->d:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v15

    .line 206
    iput-object v15, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->e:Ljava/lang/Object;

    .line 207
    .line 208
    iput-object v8, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->f:Ljava/lang/Object;

    .line 209
    .line 210
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    iput-object v15, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->g:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object v12, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->h:Ljava/lang/Object;

    .line 217
    .line 218
    const/4 v15, 0x0

    .line 219
    iput-object v15, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->i:Ljava/lang/Object;

    .line 220
    .line 221
    iput v10, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->j:I

    .line 222
    .line 223
    iput v6, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->k:I

    .line 224
    .line 225
    iput v7, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    .line 226
    .line 227
    invoke-interface {v13, v14, v3}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v13

    .line 231
    if-ne v13, v4, :cond_7

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_7
    move-object v14, v0

    .line 235
    move v0, v10

    .line 236
    move-object v10, v5

    .line 237
    move-object v5, v11

    .line 238
    move-object v11, v8

    .line 239
    move-object v8, v12

    .line 240
    move-object v12, v2

    .line 241
    move v2, v6

    .line 242
    :goto_3
    check-cast v13, Lcom/friday/common/entity/FileEntity;

    .line 243
    .line 244
    if-eqz v13, :cond_d

    .line 245
    .line 246
    invoke-virtual {v13}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    if-eqz v15, :cond_c

    .line 251
    .line 252
    invoke-virtual {v13}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    if-eq v15, v9, :cond_b

    .line 257
    .line 258
    invoke-virtual {v13}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 259
    .line 260
    .line 261
    move-result v15

    .line 262
    const/16 v6, 0x1e

    .line 263
    .line 264
    if-eq v15, v6, :cond_b

    .line 265
    .line 266
    :try_start_1
    iput-object v14, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->c:Ljava/lang/Object;

    .line 267
    .line 268
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    iput-object v6, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->d:Ljava/lang/Object;

    .line 273
    .line 274
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    iput-object v6, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->e:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v11, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->f:Ljava/lang/Object;

    .line 281
    .line 282
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    iput-object v5, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->g:Ljava/lang/Object;

    .line 287
    .line 288
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    iput-object v5, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->h:Ljava/lang/Object;

    .line 293
    .line 294
    iput-object v13, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->i:Ljava/lang/Object;

    .line 295
    .line 296
    iput v0, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->j:I

    .line 297
    .line 298
    iput v2, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->k:I

    .line 299
    .line 300
    iput v9, v3, Lcom/friday/document/service/FileManager$syncParentsBefore$1;->n:I

    .line 301
    .line 302
    invoke-virtual {v1, v13, v3}, Lcom/friday/document/service/FileManager;->H(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 306
    if-ne v2, v4, :cond_8

    .line 307
    .line 308
    :goto_4
    return-object v4

    .line 309
    :cond_8
    move-object v8, v11

    .line 310
    move-object v11, v12

    .line 311
    move-object v12, v14

    .line 312
    :goto_5
    move-object v5, v10

    .line 313
    move-object v2, v11

    .line 314
    move v10, v0

    .line 315
    move-object v0, v12

    .line 316
    goto/16 :goto_8

    .line 317
    .line 318
    :catch_1
    move-exception v0

    .line 319
    move-object v5, v13

    .line 320
    move-object v12, v14

    .line 321
    :goto_6
    instance-of v2, v0, Ljava/util/concurrent/CancellationException;

    .line 322
    .line 323
    if-nez v2, :cond_a

    .line 324
    .line 325
    instance-of v2, v0, Lcom/friday/common/network/SessionNotReadyException;

    .line 326
    .line 327
    if-eqz v2, :cond_9

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_9
    invoke-virtual {v12}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    new-instance v4, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    const-string v6, "\u9875\u9762 FileManager.kt -> syncParentsBefore\uff0c\u7236\u76ee\u5f55\u540c\u6b65\u5931\u8d25\uff0c\u5b50\u6587\u4ef6id="

    .line 348
    .line 349
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    .line 351
    .line 352
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    const-string v2, "\uff0c\u7236\u76ee\u5f55id="

    .line 356
    .line 357
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 358
    .line 359
    .line 360
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 361
    .line 362
    .line 363
    const-string v2, "\uff0c\u5f02\u5e38="

    .line 364
    .line 365
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 383
    .line 384
    sget-object v2, Lcom/friday/common/util/SyncException$Kind;->f:Lcom/friday/common/util/SyncException$Kind;

    .line 385
    .line 386
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    new-instance v4, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 393
    .line 394
    .line 395
    const-string v5, "\u7236\u76ee\u5f55\u540c\u6b65\u5931\u8d25\uff0cparentId="

    .line 396
    .line 397
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    invoke-direct {v0, v2, v3}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    throw v0

    .line 411
    :cond_a
    :goto_7
    throw v0

    .line 412
    :cond_b
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 413
    .line 414
    sget-object v2, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    .line 415
    .line 416
    invoke-virtual {v13}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v3

    .line 420
    new-instance v4, Ljava/lang/StringBuilder;

    .line 421
    .line 422
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 423
    .line 424
    .line 425
    const-string v5, "\u7236\u76ee\u5f55\u5f85\u5220\u9664\uff0cparentId="

    .line 426
    .line 427
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 431
    .line 432
    .line 433
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-direct {v0, v2, v3}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    throw v0

    .line 441
    :cond_c
    move-object v5, v10

    .line 442
    move-object v8, v11

    .line 443
    move-object v2, v12

    .line 444
    move v10, v0

    .line 445
    move-object v0, v14

    .line 446
    :goto_8
    const/4 v6, 0x0

    .line 447
    goto/16 :goto_2

    .line 448
    .line 449
    :cond_d
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 450
    .line 451
    sget-object v2, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    .line 452
    .line 453
    invoke-virtual {v8}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v3

    .line 457
    new-instance v4, Ljava/lang/StringBuilder;

    .line 458
    .line 459
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 460
    .line 461
    .line 462
    const-string v5, "\u7236\u76ee\u5f55\u4e0d\u5b58\u5728\uff0cparentId="

    .line 463
    .line 464
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-direct {v0, v2, v3}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v0

    .line 478
    :cond_e
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 479
    .line 480
    return-object v0
.end method

.method public final G(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p2, Lcom/friday/document/service/FileManager$syncSingleFile$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/service/FileManager$syncSingleFile$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

    .line 32
    .line 33
    const/4 v3, 0x5

    .line 34
    const/4 v4, 0x4

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v2, :cond_6

    .line 39
    .line 40
    if-eq v2, v7, :cond_5

    .line 41
    .line 42
    if-eq v2, v6, :cond_4

    .line 43
    .line 44
    if-eq v2, v5, :cond_3

    .line 45
    .line 46
    if-eq v2, v4, :cond_2

    .line 47
    .line 48
    if-eq v2, v3, :cond_1

    .line 49
    .line 50
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_1
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lcom/friday/common/util/SyncException;

    .line 61
    .line 62
    iget-object v1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 69
    .line 70
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto/16 :goto_7

    .line 74
    .line 75
    :cond_2
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 78
    .line 79
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 82
    .line 83
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/friday/common/util/SyncException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :catch_0
    move-exception p2

    .line 89
    move-object v8, p2

    .line 90
    move-object p2, p1

    .line 91
    move-object p1, v8

    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_3
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 97
    .line 98
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 101
    .line 102
    :try_start_1
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/friday/common/util/SyncException; {:try_start_1 .. :try_end_1} :catch_0

    .line 103
    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 109
    .line 110
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 113
    .line 114
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_5
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 121
    .line 122
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_6
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    sget-object p2, Lf2/c;->a:Lf2/c;

    .line 130
    .line 131
    invoke-virtual {p2}, Lf2/c;->e()Z

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    if-eqz p2, :cond_f

    .line 136
    .line 137
    iget-object p2, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 144
    .line 145
    iput v7, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

    .line 146
    .line 147
    invoke-interface {p2, v2, v0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    if-ne p2, v1, :cond_7

    .line 152
    .line 153
    goto/16 :goto_6

    .line 154
    .line 155
    :cond_7
    :goto_1
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 156
    .line 157
    if-nez p2, :cond_8

    .line 158
    .line 159
    move-object p2, p1

    .line 160
    :cond_8
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    if-nez v2, :cond_9

    .line 165
    .line 166
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 167
    .line 168
    return-object p1

    .line 169
    :cond_9
    iget-object v2, p0, Lcom/friday/document/service/FileManager;->b:Lcom/friday/common/network/StudentSession;

    .line 170
    .line 171
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    iput-object v7, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object p2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 178
    .line 179
    iput v6, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

    .line 180
    .line 181
    invoke-virtual {v2, v0}, Lcom/friday/common/network/StudentSession;->i(Lvc/c;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    if-ne v2, v1, :cond_a

    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_a
    move-object v2, p1

    .line 189
    move-object p1, p2

    .line 190
    :goto_2
    :try_start_2
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    iput-object p2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 197
    .line 198
    iput v5, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

    .line 199
    .line 200
    invoke-virtual {p0, p1, v0}, Lcom/friday/document/service/FileManager;->F(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    if-ne p2, v1, :cond_b

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_b
    :goto_3
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    iput-object p2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 212
    .line 213
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 214
    .line 215
    iput v4, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

    .line 216
    .line 217
    invoke-virtual {p0, p1, v0}, Lcom/friday/document/service/FileManager;->H(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p1
    :try_end_2
    .catch Lcom/friday/common/util/SyncException; {:try_start_2 .. :try_end_2} :catch_0

    .line 221
    if-ne p1, v1, :cond_c

    .line 222
    .line 223
    goto :goto_6

    .line 224
    :cond_c
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 225
    .line 226
    return-object p1

    .line 227
    :goto_5
    invoke-virtual {p1}, Lcom/friday/common/util/SyncException;->a()Lcom/friday/common/util/SyncException$Kind;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    sget-object v5, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    .line 232
    .line 233
    if-eq v4, v5, :cond_d

    .line 234
    .line 235
    invoke-virtual {p1}, Lcom/friday/common/util/SyncException;->a()Lcom/friday/common/util/SyncException$Kind;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    sget-object v5, Lcom/friday/common/util/SyncException$Kind;->f:Lcom/friday/common/util/SyncException$Kind;

    .line 240
    .line 241
    if-ne v4, v5, :cond_e

    .line 242
    .line 243
    :cond_d
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v2

    .line 247
    iput-object v2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->c:Ljava/lang/Object;

    .line 248
    .line 249
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    iput-object v2, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->d:Ljava/lang/Object;

    .line 254
    .line 255
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->e:Ljava/lang/Object;

    .line 256
    .line 257
    iput v3, v0, Lcom/friday/document/service/FileManager$syncSingleFile$1;->h:I

    .line 258
    .line 259
    invoke-virtual {p0, p2, p1, v0}, Lcom/friday/document/service/FileManager;->y(Lcom/friday/common/entity/FileEntity;Ljava/lang/Exception;Lvc/c;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p2

    .line 263
    if-ne p2, v1, :cond_e

    .line 264
    .line 265
    :goto_6
    return-object v1

    .line 266
    :cond_e
    :goto_7
    throw p1

    .line 267
    :cond_f
    new-instance p1, Ljava/lang/Exception;

    .line 268
    .line 269
    const-string p2, "\u7f51\u7edc\u672a\u8fde\u63a5"

    .line 270
    .line 271
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    throw p1
.end method

.method public final H(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->g:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->g:I

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
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 48
    .line 49
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 64
    .line 65
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object p2, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    iput v4, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->g:I

    .line 81
    .line 82
    invoke-interface {p2, v2, v0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-ne p2, v1, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    :goto_1
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 90
    .line 91
    if-nez p2, :cond_5

    .line 92
    .line 93
    move-object p2, p1

    .line 94
    :cond_5
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-nez v2, :cond_6

    .line 99
    .line 100
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 101
    .line 102
    return-object p1

    .line 103
    :cond_6
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->c:Ljava/lang/Object;

    .line 108
    .line 109
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->d:Ljava/lang/Object;

    .line 114
    .line 115
    iput v3, v0, Lcom/friday/document/service/FileManager$syncSingleFileWithoutParents$1;->g:I

    .line 116
    .line 117
    invoke-virtual {p0, p2, v0}, Lcom/friday/document/service/FileManager;->J(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-ne p1, v1, :cond_7

    .line 122
    .line 123
    :goto_2
    return-object v1

    .line 124
    :cond_7
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 125
    .line 126
    return-object p1
.end method

.method public final I(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p4, Lcom/friday/document/service/FileManager$syncTree$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$syncTree$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$syncTree$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lcom/friday/document/service/FileManager$syncTree$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lcom/friday/document/service/FileManager$syncTree$1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-wide p1, v0, Lcom/friday/document/service/FileManager$syncTree$1;->g:J

    .line 45
    .line 46
    iget-object p3, v0, Lcom/friday/document/service/FileManager$syncTree$1;->f:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p3, Lcom/friday/common/entity/FileEntity;

    .line 49
    .line 50
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->e:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v2, Ljava/util/Iterator;

    .line 53
    .line 54
    iget-object v4, v0, Lcom/friday/document/service/FileManager$syncTree$1;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v4, Ljava/util/List;

    .line 57
    .line 58
    iget-object v5, v0, Lcom/friday/document/service/FileManager$syncTree$1;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Ljava/lang/String;

    .line 61
    .line 62
    :try_start_0
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    .line 64
    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :catch_0
    move-exception p1

    .line 68
    goto/16 :goto_5

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
    iget-wide p1, v0, Lcom/friday/document/service/FileManager$syncTree$1;->g:J

    .line 79
    .line 80
    iget-object p3, v0, Lcom/friday/document/service/FileManager$syncTree$1;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p3, Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    iget-wide p2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->g:J

    .line 89
    .line 90
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncTree$1;->d:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Lcom/friday/document/service/FileManager;

    .line 93
    .line 94
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v2, Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    invoke-static {p4}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object p4, Lf2/c;->a:Lf2/c;

    .line 106
    .line 107
    invoke-virtual {p4}, Lf2/c;->e()Z

    .line 108
    .line 109
    .line 110
    move-result p4

    .line 111
    if-eqz p4, :cond_9

    .line 112
    .line 113
    iget-object p4, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 114
    .line 115
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iput-object v2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->c:Ljava/lang/Object;

    .line 120
    .line 121
    iput-object p0, v0, Lcom/friday/document/service/FileManager$syncTree$1;->d:Ljava/lang/Object;

    .line 122
    .line 123
    iput-wide p2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->g:J

    .line 124
    .line 125
    iput v5, v0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

    .line 126
    .line 127
    invoke-interface {p4, p1, p2, p3, v0}, Lcom/friday/common/dao/FileDao;->e(Ljava/lang/String;JLvc/c;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    if-ne p4, v1, :cond_5

    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_5
    move-object v2, p1

    .line 135
    move-object p1, p0

    .line 136
    :goto_1
    check-cast p4, Ljava/util/List;

    .line 137
    .line 138
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    iput-object v5, v0, Lcom/friday/document/service/FileManager$syncTree$1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    const/4 v5, 0x0

    .line 145
    iput-object v5, v0, Lcom/friday/document/service/FileManager$syncTree$1;->d:Ljava/lang/Object;

    .line 146
    .line 147
    iput-wide p2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->g:J

    .line 148
    .line 149
    iput v4, v0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

    .line 150
    .line 151
    invoke-virtual {p1, p4, v0}, Lcom/friday/document/service/FileManager;->s(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p4

    .line 155
    if-ne p4, v1, :cond_6

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    move-wide p1, p2

    .line 159
    move-object p3, v2

    .line 160
    :goto_2
    check-cast p4, Ljava/util/List;

    .line 161
    .line 162
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    move-object v5, p3

    .line 167
    move-object v4, p4

    .line 168
    :cond_7
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result p3

    .line 172
    if-eqz p3, :cond_8

    .line 173
    .line 174
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    check-cast p3, Lcom/friday/common/entity/FileEntity;

    .line 179
    .line 180
    :try_start_1
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object p4

    .line 184
    iput-object p4, v0, Lcom/friday/document/service/FileManager$syncTree$1;->c:Ljava/lang/Object;

    .line 185
    .line 186
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p4

    .line 190
    iput-object p4, v0, Lcom/friday/document/service/FileManager$syncTree$1;->d:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object v2, v0, Lcom/friday/document/service/FileManager$syncTree$1;->e:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object p3, v0, Lcom/friday/document/service/FileManager$syncTree$1;->f:Ljava/lang/Object;

    .line 195
    .line 196
    iput-wide p1, v0, Lcom/friday/document/service/FileManager$syncTree$1;->g:J

    .line 197
    .line 198
    iput v3, v0, Lcom/friday/document/service/FileManager$syncTree$1;->j:I

    .line 199
    .line 200
    invoke-virtual {p0, p3, v0}, Lcom/friday/document/service/FileManager;->G(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 204
    if-ne p3, v1, :cond_7

    .line 205
    .line 206
    :goto_4
    return-object v1

    .line 207
    :goto_5
    invoke-virtual {p3}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    invoke-virtual {p3}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p4

    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    .line 220
    .line 221
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 222
    .line 223
    .line 224
    const-string v1, "\u9875\u9762 FileManager.kt -> syncTree\uff0c\u540c\u6b65\u8def\u5f84\u4e2d\u65ad\uff0c\u6587\u4ef6id="

    .line 225
    .line 226
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    const-string p2, "\uff0c\u6587\u4ef6\u540d="

    .line 233
    .line 234
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    const-string p2, "\uff0c\u5f02\u5e38="

    .line 241
    .line 242
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    :cond_8
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 261
    .line 262
    return-object p1

    .line 263
    :cond_9
    new-instance p1, Ljava/lang/Exception;

    .line 264
    .line 265
    const-string p2, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u68c0\u67e5"

    .line 266
    .line 267
    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw p1
.end method

.method public final J(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, Lcom/friday/document/service/FileManager$syncWithRetry$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->h:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/service/FileManager$syncWithRetry$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->h:I

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_5

    .line 38
    .line 39
    if-eq v2, v6, :cond_4

    .line 40
    .line 41
    if-eq v2, v5, :cond_3

    .line 42
    .line 43
    if-eq v2, v4, :cond_2

    .line 44
    .line 45
    if-eq v2, v3, :cond_1

    .line 46
    .line 47
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    iget-object p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p1, Ljava/lang/Exception;

    .line 58
    .line 59
    iget-object v0, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 62
    .line 63
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_7

    .line 67
    .line 68
    :cond_2
    iget p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->e:I

    .line 69
    .line 70
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->d:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Ljava/lang/Exception;

    .line 73
    .line 74
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 77
    .line 78
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    move p2, p1

    .line 82
    :goto_1
    move-object p1, v2

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    iget p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->e:I

    .line 85
    .line 86
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 89
    .line 90
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    .line 93
    goto :goto_4

    .line 94
    :catch_0
    move-exception p2

    .line 95
    move-object v11, p2

    .line 96
    move p2, p1

    .line 97
    move-object p1, v11

    .line 98
    goto :goto_5

    .line 99
    :cond_4
    iget p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->e:I

    .line 100
    .line 101
    iget-object v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 104
    .line 105
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    const/4 p2, 0x0

    .line 113
    :goto_2
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    iput-object v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->d:Ljava/lang/Object;

    .line 117
    .line 118
    iput p2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->e:I

    .line 119
    .line 120
    iput v6, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->h:I

    .line 121
    .line 122
    invoke-virtual {p0, v0}, Lcom/friday/document/service/FileManager;->L(Lvc/c;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    if-ne v2, v1, :cond_6

    .line 127
    .line 128
    goto/16 :goto_6

    .line 129
    .line 130
    :cond_6
    move-object v2, p1

    .line 131
    move p1, p2

    .line 132
    :goto_3
    :try_start_1
    iput-object v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 133
    .line 134
    iput p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->e:I

    .line 135
    .line 136
    iput v5, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->h:I

    .line 137
    .line 138
    invoke-virtual {p0, v2, v0}, Lcom/friday/document/service/FileManager;->D(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    if-ne p2, v1, :cond_7

    .line 143
    .line 144
    goto :goto_6

    .line 145
    :cond_7
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    .line 147
    return-object p1

    .line 148
    :goto_5
    instance-of v7, p1, Ljava/util/concurrent/CancellationException;

    .line 149
    .line 150
    if-nez v7, :cond_b

    .line 151
    .line 152
    instance-of v7, p1, Lcom/friday/common/network/SessionNotReadyException;

    .line 153
    .line 154
    if-nez v7, :cond_b

    .line 155
    .line 156
    invoke-virtual {p0, p1}, Lcom/friday/document/service/FileManager;->z(Ljava/lang/Exception;)Z

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    if-eqz v7, :cond_9

    .line 161
    .line 162
    if-nez p2, :cond_9

    .line 163
    .line 164
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    new-instance v9, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v10, "\u9875\u9762 FileManager.kt -> syncWithRetry\uff0c\u9047\u5230\u9650\u9891\uff0c3\u79d2\u540e\u91cd\u8bd5\u5f53\u524d\u6587\u4ef6\uff0c\u6587\u4ef6id="

    .line 182
    .line 183
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    const-string p2, "\uff0c\u6587\u4ef6\u540d="

    .line 190
    .line 191
    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string p2, "\uff0c\u5f02\u5e38="

    .line 198
    .line 199
    invoke-virtual {v9, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    iput-object v2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 217
    .line 218
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->d:Ljava/lang/Object;

    .line 223
    .line 224
    iput v6, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->e:I

    .line 225
    .line 226
    iput v4, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->h:I

    .line 227
    .line 228
    const-wide/16 p1, 0xbb8

    .line 229
    .line 230
    invoke-static {p1, p2, v0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    if-ne p1, v1, :cond_8

    .line 235
    .line 236
    goto :goto_6

    .line 237
    :cond_8
    move p2, v6

    .line 238
    goto/16 :goto_1

    .line 239
    .line 240
    :cond_9
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    iput-object v4, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->c:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object p1, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->d:Ljava/lang/Object;

    .line 247
    .line 248
    iput p2, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->e:I

    .line 249
    .line 250
    iput v3, v0, Lcom/friday/document/service/FileManager$syncWithRetry$1;->h:I

    .line 251
    .line 252
    invoke-virtual {p0, v2, p1, v0}, Lcom/friday/document/service/FileManager;->y(Lcom/friday/common/entity/FileEntity;Ljava/lang/Exception;Lvc/c;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    if-ne p2, v1, :cond_a

    .line 257
    .line 258
    :goto_6
    return-object v1

    .line 259
    :cond_a
    :goto_7
    throw p1

    .line 260
    :cond_b
    throw p1
.end method

.method public final K()J
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

.method public final L(Lvc/c;)Ljava/lang/Object;
    .locals 14

    .line 1
    instance-of v0, p1, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->j:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->h:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->j:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v5, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget-object v0, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lbe/a;

    .line 46
    .line 47
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_4

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1

    .line 61
    :cond_2
    iget v2, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->d:I

    .line 62
    .line 63
    iget-object v5, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->c:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v5, Lbe/a;

    .line 66
    .line 67
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object p1, v5

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/friday/document/service/FileManager;->l:Lbe/a;

    .line 76
    .line 77
    iput-object p1, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->c:Ljava/lang/Object;

    .line 78
    .line 79
    iput v3, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->d:I

    .line 80
    .line 81
    iput v5, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->j:I

    .line 82
    .line 83
    invoke-interface {p1, v6, v0}, Lbe/a;->lock(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-ne v2, v1, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move v2, v3

    .line 91
    :goto_1
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    iget-wide v9, p0, Lcom/friday/document/service/FileManager;->m:J

    .line 96
    .line 97
    sub-long v9, v7, v9

    .line 98
    .line 99
    const-wide/16 v11, 0x3e8

    .line 100
    .line 101
    sub-long/2addr v11, v9

    .line 102
    const-wide/16 v9, 0x0

    .line 103
    .line 104
    cmp-long v5, v11, v9

    .line 105
    .line 106
    if-lez v5, :cond_5

    .line 107
    .line 108
    iput-object p1, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->c:Ljava/lang/Object;

    .line 109
    .line 110
    iput v2, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->d:I

    .line 111
    .line 112
    iput v3, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->e:I

    .line 113
    .line 114
    iput-wide v7, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->f:J

    .line 115
    .line 116
    iput-wide v11, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->g:J

    .line 117
    .line 118
    iput v4, v0, Lcom/friday/document/service/FileManager$waitForSyncInterval$1;->j:I

    .line 119
    .line 120
    invoke-static {v11, v12, v0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 124
    if-ne v0, v1, :cond_5

    .line 125
    .line 126
    :goto_2
    return-object v1

    .line 127
    :catchall_1
    move-exception v0

    .line 128
    move-object v13, v0

    .line 129
    move-object v0, p1

    .line 130
    move-object p1, v13

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    move-object v0, p1

    .line 133
    :goto_3
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 134
    .line 135
    .line 136
    move-result-wide v1

    .line 137
    iput-wide v1, p0, Lcom/friday/document/service/FileManager;->m:J

    .line 138
    .line 139
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 140
    .line 141
    invoke-interface {v0, v6}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 145
    .line 146
    return-object p1

    .line 147
    :goto_4
    invoke-interface {v0, v6}, Lbe/a;->unlock(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    throw p1
.end method

.method public a(Ljava/util/List;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/service/FileManager$newDownload$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p2, p0, p1, v2}, Lcom/friday/document/service/FileManager$newDownload$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Ljava/util/List;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

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

.method public b(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/service/FileManager$downloadTxt$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/service/FileManager$downloadTxt$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V

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

.method public c(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/service/FileManager$downloadFile$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/service/FileManager$downloadFile$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V

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

.method public d(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, Lcom/friday/document/service/FileManager$downloadMicroClass$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->f:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->f:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/service/FileManager$downloadMicroClass$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->f:I

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
    iget-object p1, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    iget-object p1, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->c:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 60
    .line 61
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    new-instance v2, Lcom/friday/document/service/FileManager$downloadMicroClass$2;

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    invoke-direct {v2, p1, v5}, Lcom/friday/document/service/FileManager$downloadMicroClass$2;-><init>(Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 76
    .line 77
    .line 78
    iput-object p1, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    iput v4, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->f:I

    .line 81
    .line 82
    invoke-static {p2, v2, v0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    if-ne p2, v1, :cond_4

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->c:Ljava/lang/Object;

    .line 100
    .line 101
    iput v3, v0, Lcom/friday/document/service/FileManager$downloadMicroClass$1;->f:I

    .line 102
    .line 103
    invoke-interface {p2, v2, v4, v0}, Lcom/friday/common/dao/FileDao;->b0(Ljava/lang/String;ZLvc/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v1, :cond_5

    .line 108
    .line 109
    :goto_2
    return-object v1

    .line 110
    :cond_5
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 111
    .line 112
    return-object p1
.end method

.method public e(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/service/FileManager$downloadOffice$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/service/FileManager$downloadOffice$2;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/service/FileManager;Lvc/c;)V

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

.method public f(Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lcom/friday/document/service/FileManager$repairMissingImagesByPageDir$2;-><init>(Lcom/friday/document/service/FileManager;Lcom/friday/common/entity/FileEntity;Ljava/lang/String;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p3}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

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

.method public final s(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->o:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->m:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->o:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget p1, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->j:I

    .line 40
    .line 41
    iget-object v2, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->i:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Lcom/friday/document/service/FileManager;

    .line 44
    .line 45
    iget-object v2, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 48
    .line 49
    iget-object v5, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->f:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Ljava/util/Iterator;

    .line 52
    .line 53
    iget-object v6, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v6, Ljava/lang/Iterable;

    .line 56
    .line 57
    iget-object v7, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->d:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v7, Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    iget-object v8, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v8, Ljava/util/List;

    .line 64
    .line 65
    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_0
    move-exception p2

    .line 70
    goto/16 :goto_5

    .line 71
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
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 84
    .line 85
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 86
    .line 87
    .line 88
    move-object v2, p1

    .line 89
    check-cast v2, Ljava/lang/Iterable;

    .line 90
    .line 91
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    move-object v7, p2

    .line 96
    move-object v6, v2

    .line 97
    move p2, v4

    .line 98
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_7

    .line 103
    .line 104
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    move-object v8, v2

    .line 109
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 110
    .line 111
    invoke-virtual {p0, v8}, Lcom/friday/document/service/FileManager;->B(Lcom/friday/common/entity/FileEntity;)Z

    .line 112
    .line 113
    .line 114
    move-result v9

    .line 115
    if-eqz v9, :cond_6

    .line 116
    .line 117
    :try_start_1
    sget-object v9, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 118
    .line 119
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    iput-object v9, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->c:Ljava/lang/Object;

    .line 124
    .line 125
    iput-object v7, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->d:Ljava/lang/Object;

    .line 126
    .line 127
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    iput-object v9, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->e:Ljava/lang/Object;

    .line 132
    .line 133
    iput-object v5, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->f:Ljava/lang/Object;

    .line 134
    .line 135
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    iput-object v2, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->g:Ljava/lang/Object;

    .line 140
    .line 141
    iput-object v8, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->h:Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {p0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iput-object v2, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->i:Ljava/lang/Object;

    .line 148
    .line 149
    iput p2, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->j:I

    .line 150
    .line 151
    iput v4, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->k:I

    .line 152
    .line 153
    iput v4, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->l:I

    .line 154
    .line 155
    iput v3, v0, Lcom/friday/document/service/FileManager$buildParentFirstQueue$1;->o:I

    .line 156
    .line 157
    invoke-virtual {p0, v8, v0}, Lcom/friday/document/service/FileManager;->w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    if-ne v2, v1, :cond_3

    .line 162
    .line 163
    return-object v1

    .line 164
    :cond_3
    move-object v11, v8

    .line 165
    move-object v8, p1

    .line 166
    move p1, p2

    .line 167
    move-object p2, v2

    .line 168
    move-object v2, v11

    .line 169
    :goto_2
    :try_start_2
    check-cast p2, Ljava/lang/Iterable;

    .line 170
    .line 171
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    :cond_4
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v9

    .line 179
    if-eqz v9, :cond_5

    .line 180
    .line 181
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 186
    .line 187
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    if-eqz v10, :cond_4

    .line 192
    .line 193
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    invoke-interface {v7, v10, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_5
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 202
    .line 203
    invoke-static {p2}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    .line 205
    .line 206
    :goto_4
    move p2, p1

    .line 207
    move-object p1, v8

    .line 208
    move-object v8, v2

    .line 209
    goto :goto_6

    .line 210
    :catchall_1
    move-exception v2

    .line 211
    move-object v11, v8

    .line 212
    move-object v8, p1

    .line 213
    move p1, p2

    .line 214
    move-object p2, v2

    .line 215
    move-object v2, v11

    .line 216
    :goto_5
    sget-object v9, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 217
    .line 218
    invoke-static {p2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-static {p2}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_6
    :goto_6
    invoke-virtual {v8}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-interface {v7, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :cond_7
    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    const-string p2, "<get-values>(...)"

    .line 240
    .line 241
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    check-cast p1, Ljava/lang/Iterable;

    .line 245
    .line 246
    invoke-static {p1}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    return-object p1
.end method

.method public final t()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/friday/document/service/FileManager;->k:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v1, p0, Lcom/friday/document/service/FileManager;->k:Lkotlinx/coroutines/g;

    .line 11
    .line 12
    return-void
.end method

.method public final u(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/document/service/FileManager$downloadCover$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, v2}, Lcom/friday/document/service/FileManager$downloadCover$2;-><init>(Lcom/friday/common/entity/FileEntity;Lvc/c;)V

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
    new-instance v1, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/service/FileManager$downloadFileOnShare$2;-><init>(Lcom/friday/document/model/ShareFile;Lcom/friday/document/service/FileManager;Lvc/c;)V

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

.method public final w(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, Lcom/friday/document/service/FileManager$findParentChain$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$findParentChain$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->i:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->i:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$findParentChain$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/service/FileManager$findParentChain$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->g:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->i:I

    .line 32
    .line 33
    const-string v3, "0"

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    const-string v5, "\uff0cparentId="

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-ne v2, v4, :cond_1

    .line 41
    .line 42
    iget-object p1, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v2, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v2, Ljava/util/Set;

    .line 49
    .line 50
    iget-object v6, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Ljava/util/List;

    .line 53
    .line 54
    iget-object v7, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v7, Lcom/friday/common/entity/FileEntity;

    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance p2, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    filled-new-array {v2}, [Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, Lrc/y0;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    move-object v9, p2

    .line 95
    move-object p2, p1

    .line 96
    move-object p1, v6

    .line 97
    move-object v6, v9

    .line 98
    :goto_1
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-nez v7, :cond_7

    .line 103
    .line 104
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-eqz v7, :cond_6

    .line 109
    .line 110
    iget-object v7, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 111
    .line 112
    iput-object p2, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->c:Ljava/lang/Object;

    .line 113
    .line 114
    iput-object v6, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->d:Ljava/lang/Object;

    .line 115
    .line 116
    iput-object v2, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->e:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object p1, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->f:Ljava/lang/Object;

    .line 119
    .line 120
    iput v4, v0, Lcom/friday/document/service/FileManager$findParentChain$1;->i:I

    .line 121
    .line 122
    invoke-interface {v7, p1, v0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    if-ne v7, v1, :cond_3

    .line 127
    .line 128
    return-object v1

    .line 129
    :cond_3
    move-object v9, v7

    .line 130
    move-object v7, p2

    .line 131
    move-object p2, v9

    .line 132
    :goto_2
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 133
    .line 134
    if-eqz p2, :cond_5

    .line 135
    .line 136
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-static {v8, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v8

    .line 144
    if-eqz v8, :cond_4

    .line 145
    .line 146
    invoke-interface {v6, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    move-object p2, v7

    .line 154
    goto :goto_1

    .line 155
    :cond_4
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 156
    .line 157
    sget-object v1, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    .line 158
    .line 159
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    new-instance v3, Ljava/lang/StringBuilder;

    .line 168
    .line 169
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 170
    .line 171
    .line 172
    const-string v4, "\u7236\u76ee\u5f55\u7c7b\u578b\u9519\u8bef\uff0cfileId="

    .line 173
    .line 174
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string p1, "\uff0cfileType="

    .line 187
    .line 188
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-direct {v0, v1, p1}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_5
    new-instance p2, Lcom/friday/common/util/SyncException;

    .line 203
    .line 204
    sget-object v0, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    .line 205
    .line 206
    invoke-virtual {v7}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    new-instance v2, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    const-string v3, "\u7236\u76ee\u5f55\u672c\u5730\u8bb0\u5f55\u4e0d\u5b58\u5728\uff0cfileId="

    .line 216
    .line 217
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    invoke-direct {p2, v0, p1}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw p2

    .line 237
    :cond_6
    new-instance v0, Lcom/friday/common/util/SyncException;

    .line 238
    .line 239
    sget-object v1, Lcom/friday/common/util/SyncException$Kind;->e:Lcom/friday/common/util/SyncException$Kind;

    .line 240
    .line 241
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p2

    .line 245
    new-instance v2, Ljava/lang/StringBuilder;

    .line 246
    .line 247
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 248
    .line 249
    .line 250
    const-string v3, "\u7236\u76ee\u5f55\u94fe\u5b58\u5728\u5faa\u73af\uff0cfileId="

    .line 251
    .line 252
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-direct {v0, v1, p1}, Lcom/friday/common/util/SyncException;-><init>(Lcom/friday/common/util/SyncException$Kind;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v0

    .line 272
    :cond_7
    invoke-static {v6}, Lrc/c0;->W(Ljava/util/List;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    return-object p1
.end method

.method public final x(Ljava/util/List;)Ljava/util/List;
    .locals 10

    .line 1
    const-string v0, "originList"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Iterable;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    move-object v2, v1

    .line 28
    check-cast v2, Lcom/friday/common/entity/ResourceEntity;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/friday/common/entity/ResourceEntity;->getPageIndex()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    new-instance v3, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_0
    check-cast v3, Ljava/util/List;

    .line 53
    .line 54
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_8

    .line 76
    .line 77
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, Ljava/util/Map$Entry;

    .line 82
    .line 83
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/Number;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    check-cast v1, Ljava/util/List;

    .line 98
    .line 99
    move-object v3, v1

    .line 100
    check-cast v3, Ljava/lang/Iterable;

    .line 101
    .line 102
    instance-of v4, v3, Ljava/util/Collection;

    .line 103
    .line 104
    if-eqz v4, :cond_2

    .line 105
    .line 106
    move-object v4, v3

    .line 107
    check-cast v4, Ljava/util/Collection;

    .line 108
    .line 109
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_2

    .line 114
    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_2
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-eqz v4, :cond_7

    .line 126
    .line 127
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v4

    .line 131
    check-cast v4, Lcom/friday/common/entity/ResourceEntity;

    .line 132
    .line 133
    invoke-virtual {v4}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    const/4 v5, 0x2

    .line 138
    const/4 v6, 0x0

    .line 139
    const-string v7, ".mdb"

    .line 140
    .line 141
    const/4 v8, 0x0

    .line 142
    invoke-static {v4, v7, v8, v5, v6}, Lqd/z;->B(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-eqz v4, :cond_3

    .line 147
    .line 148
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    check-cast v1, Ljava/lang/Iterable;

    .line 153
    .line 154
    new-instance v4, Ljava/util/ArrayList;

    .line 155
    .line 156
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-eqz v5, :cond_6

    .line 168
    .line 169
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    move-object v6, v5

    .line 174
    check-cast v6, Lcom/friday/common/entity/ResourceEntity;

    .line 175
    .line 176
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    invoke-virtual {p0, v8}, Lcom/friday/document/service/FileManager;->A(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-nez v8, :cond_5

    .line 185
    .line 186
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    const/4 v9, 0x1

    .line 191
    invoke-static {v8, v7, v9}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 192
    .line 193
    .line 194
    move-result v8

    .line 195
    if-nez v8, :cond_5

    .line 196
    .line 197
    invoke-virtual {v6}, Lcom/friday/common/entity/ResourceEntity;->getId()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    const-string v8, "snapshot.bin"

    .line 202
    .line 203
    invoke-static {v6, v8, v9}, Lqd/z;->A(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 204
    .line 205
    .line 206
    move-result v6

    .line 207
    if-eqz v6, :cond_4

    .line 208
    .line 209
    :cond_5
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_6
    invoke-interface {p1, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 214
    .line 215
    .line 216
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    new-instance v4, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const-string v5, "\u9875\u9762 FileManager.kt -> getFinalDownloadList\uff0c\u6309\u65b0\u7b14\u8bb0\u89c4\u5219\u8fc7\u6ee4\uff0c\u7b2c"

    .line 226
    .line 227
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v2, "\u9875\uff0c\u539f\u59cb\u6570\u91cf="

    .line 234
    .line 235
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v2, "\uff0c\u4fdd\u7559\u6570\u91cf="

    .line 242
    .line 243
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    goto/16 :goto_1

    .line 261
    .line 262
    :cond_7
    :goto_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    new-instance v4, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 269
    .line 270
    .line 271
    const-string v5, "\u9875\u9762 FileManager.kt -> getFinalDownloadList\uff0c\u6309\u65e7\u7b14\u8bb0\u89c4\u5219\u4fdd\u7559\uff0c\u7b2c"

    .line 272
    .line 273
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    const-string v2, "\u9875\uff0c\u6570\u91cf="

    .line 280
    .line 281
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    check-cast v1, Ljava/util/Collection;

    .line 299
    .line 300
    invoke-interface {p1, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 301
    .line 302
    .line 303
    goto/16 :goto_1

    .line 304
    .line 305
    :cond_8
    return-object p1
.end method

.method public final y(Lcom/friday/common/entity/FileEntity;Ljava/lang/Exception;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Lcom/friday/document/service/FileManager$handleSyncError$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/friday/document/service/FileManager$handleSyncError$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->h:I

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
    iput v1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/service/FileManager$handleSyncError$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/friday/document/service/FileManager$handleSyncError$1;-><init>(Lcom/friday/document/service/FileManager;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->h:I

    .line 32
    .line 33
    const/4 v3, 0x4

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x3

    .line 37
    if-eqz v2, :cond_5

    .line 38
    .line 39
    if-eq v2, v5, :cond_4

    .line 40
    .line 41
    if-eq v2, v4, :cond_3

    .line 42
    .line 43
    if-eq v2, v6, :cond_2

    .line 44
    .line 45
    if-ne v2, v3, :cond_1

    .line 46
    .line 47
    iget-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ljava/lang/Exception;

    .line 50
    .line 51
    iget-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 54
    .line 55
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_4

    .line 59
    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_2
    iget-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Ljava/lang/Exception;

    .line 71
    .line 72
    iget-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 75
    .line 76
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto/16 :goto_7

    .line 80
    .line 81
    :cond_3
    iget-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/Exception;

    .line 84
    .line 85
    iget-object p2, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 88
    .line 89
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    iget-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 94
    .line 95
    move-object p2, p1

    .line 96
    check-cast p2, Ljava/lang/Exception;

    .line 97
    .line 98
    iget-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 101
    .line 102
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_5
    invoke-static {p3}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 110
    .line 111
    .line 112
    iget-object p3, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 113
    .line 114
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    iput-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 119
    .line 120
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    iput-object v7, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 125
    .line 126
    iput v5, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->h:I

    .line 127
    .line 128
    invoke-interface {p3, v2, v0}, Lcom/friday/common/dao/FileDao;->u(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    if-ne p3, v1, :cond_6

    .line 133
    .line 134
    goto/16 :goto_6

    .line 135
    .line 136
    :cond_6
    :goto_1
    iget-object p3, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    iput-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 143
    .line 144
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    iput-object v5, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 149
    .line 150
    iput v4, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->h:I

    .line 151
    .line 152
    invoke-interface {p3, v2, v0}, Lcom/friday/common/dao/FileDao;->J(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p3

    .line 156
    if-ne p3, v1, :cond_7

    .line 157
    .line 158
    goto/16 :goto_6

    .line 159
    .line 160
    :cond_7
    move-object v8, p2

    .line 161
    move-object p2, p1

    .line 162
    move-object p1, v8

    .line 163
    :goto_2
    check-cast p3, Ljava/lang/Integer;

    .line 164
    .line 165
    if-eqz p3, :cond_8

    .line 166
    .line 167
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result p3

    .line 171
    goto :goto_3

    .line 172
    :cond_8
    const/4 p3, 0x0

    .line 173
    :goto_3
    if-lt p3, v6, :cond_d

    .line 174
    .line 175
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    new-instance v4, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    const-string v5, "\u9875\u9762 FileManager.kt -> handleSyncError\uff0c\u540c\u6b65\u6b21\u6570\u8fbe\u5230\u4e0a\u9650\uff0c\u6587\u4ef6id="

    .line 185
    .line 186
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eq v2, v6, :cond_b

    .line 208
    .line 209
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    const/16 v4, 0x1e

    .line 214
    .line 215
    if-ne v2, v4, :cond_9

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :cond_9
    iget-object v2, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 219
    .line 220
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    iput-object p2, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iput-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 235
    .line 236
    iput p3, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->e:I

    .line 237
    .line 238
    iput v3, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->h:I

    .line 239
    .line 240
    invoke-interface {v2, v4, v0}, Lcom/friday/common/dao/FileDao;->f(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    if-ne p1, v1, :cond_a

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_a
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 248
    .line 249
    return-object p1

    .line 250
    :cond_b
    :goto_5
    iget-object v2, p0, Lcom/friday/document/service/FileManager;->c:Lcom/friday/common/dao/FileDao;

    .line 251
    .line 252
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-static {p2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p2

    .line 260
    iput-object p2, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->c:Ljava/lang/Object;

    .line 261
    .line 262
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    iput-object p1, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->d:Ljava/lang/Object;

    .line 267
    .line 268
    iput p3, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->e:I

    .line 269
    .line 270
    iput v6, v0, Lcom/friday/document/service/FileManager$handleSyncError$1;->h:I

    .line 271
    .line 272
    invoke-interface {v2, v3, v0}, Lcom/friday/common/dao/FileDao;->A(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    if-ne p1, v1, :cond_c

    .line 277
    .line 278
    :goto_6
    return-object v1

    .line 279
    :cond_c
    :goto_7
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 280
    .line 281
    return-object p1

    .line 282
    :cond_d
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 283
    .line 284
    return-object p1
.end method

.method public final z(Ljava/lang/Exception;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/friday/common/util/SyncException;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, Lcom/friday/common/util/SyncException;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/friday/common/util/SyncException;->c()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ne v0, v2, :cond_1

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    sget-object v0, Lcom/friday/common/util/SyncException;->e:Lcom/friday/common/util/SyncException$a;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {v0, v1, p1, v2, v1}, Lcom/friday/common/util/SyncException$a;->b(Lcom/friday/common/util/SyncException$a;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    :goto_1
    return v2

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    return p1
.end method
