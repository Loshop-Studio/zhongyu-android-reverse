.class public final Lcom/friday/common/MyDataBase_Impl;
.super Lcom/friday/common/MyDataBase;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final n:Lqc/d;

.field public final o:Lqc/d;

.field public final p:Lqc/d;

.field public final q:Lqc/d;

.field public final r:Lqc/d;

.field public final s:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/common/MyDataBase;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz1/c;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lz1/c;-><init>(Lcom/friday/common/MyDataBase_Impl;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->n:Lqc/d;

    .line 14
    .line 15
    new-instance v0, Lz1/d;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lz1/d;-><init>(Lcom/friday/common/MyDataBase_Impl;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->o:Lqc/d;

    .line 25
    .line 26
    new-instance v0, Lz1/e;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lz1/e;-><init>(Lcom/friday/common/MyDataBase_Impl;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->p:Lqc/d;

    .line 36
    .line 37
    new-instance v0, Lz1/f;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lz1/f;-><init>(Lcom/friday/common/MyDataBase_Impl;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->q:Lqc/d;

    .line 47
    .line 48
    new-instance v0, Lz1/g;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lz1/g;-><init>(Lcom/friday/common/MyDataBase_Impl;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->r:Lqc/d;

    .line 58
    .line 59
    new-instance v0, Lz1/h;

    .line 60
    .line 61
    invoke-direct {v0, p0}, Lz1/h;-><init>(Lcom/friday/common/MyDataBase_Impl;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->s:Lqc/d;

    .line 69
    .line 70
    return-void
.end method

.method public static synthetic A(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ResourceDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/MyDataBase_Impl;->G(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ResourceDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ImageSafetyDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/MyDataBase_Impl;->E(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ImageSafetyDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/PdfDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/MyDataBase_Impl;->F(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/PdfDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static final D(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/FileDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/dao/FileDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/dao/FileDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final E(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ImageSafetyDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/dao/ImageSafetyDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/dao/ImageSafetyDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final F(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/PdfDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/dao/PdfDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/dao/PdfDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final G(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ResourceDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/dao/ResourceDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/dao/ResourceDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final H(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ShareCacheDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/dao/ShareCacheDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/dao/ShareCacheDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final I(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/UserDao_Impl;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/dao/UserDao_Impl;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/dao/UserDao_Impl;-><init>(Landroidx/room/RoomDatabase;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic J(Lcom/friday/common/MyDataBase_Impl;Landroidx/sqlite/SQLiteConnection;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/room/RoomDatabase;->internalInitInvalidationTracker(Landroidx/sqlite/SQLiteConnection;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/UserDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/MyDataBase_Impl;->I(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/UserDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/FileDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/MyDataBase_Impl;->D(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/FileDao_Impl;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ShareCacheDao_Impl;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/common/MyDataBase_Impl;->H(Lcom/friday/common/MyDataBase_Impl;)Lcom/friday/common/dao/ShareCacheDao_Impl;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public K()Landroidx/room/RoomOpenDelegate;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/common/MyDataBase_Impl$createOpenDelegate$_openDelegate$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/common/MyDataBase_Impl$createOpenDelegate$_openDelegate$1;-><init>(Lcom/friday/common/MyDataBase_Impl;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public clearAllTables()V
    .locals 6

    .line 1
    const-string v4, "PdfEntity"

    .line 2
    .line 3
    const-string v5, "ImageSafetyEntity"

    .line 4
    .line 5
    const-string v0, "User"

    .line 6
    .line 7
    const-string v1, "File"

    .line 8
    .line 9
    const-string v2, "ResourceEntity"

    .line 10
    .line 11
    const-string v3, "ShareCacheEntity"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-super {p0, v1, v0}, Landroidx/room/RoomDatabase;->performClear(Z[Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public createAutoMigrations(Ljava/util/Map;)Ljava/util/List;
    .locals 1

    .line 1
    const-string v0, "autoMigrationSpecs"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public createInvalidationTracker()Landroidx/room/InvalidationTracker;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, Landroidx/room/InvalidationTracker;

    .line 12
    .line 13
    const-string v7, "PdfEntity"

    .line 14
    .line 15
    const-string v8, "ImageSafetyEntity"

    .line 16
    .line 17
    const-string v3, "User"

    .line 18
    .line 19
    const-string v4, "File"

    .line 20
    .line 21
    const-string v5, "ResourceEntity"

    .line 22
    .line 23
    const-string v6, "ShareCacheEntity"

    .line 24
    .line 25
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-direct {v2, p0, v0, v1, v3}, Landroidx/room/InvalidationTracker;-><init>(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v2
.end method

.method public bridge synthetic createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/MyDataBase_Impl;->K()Landroidx/room/RoomOpenDelegate;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getRequiredAutoMigrationSpecClasses()Ljava/util/Set;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public getRequiredTypeConverterClasses()Ljava/util/Map;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lcom/friday/common/dao/UserDao;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    sget-object v2, Lcom/friday/common/dao/UserDao_Impl;->c:Lcom/friday/common/dao/UserDao_Impl$a;

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/friday/common/dao/UserDao_Impl$a;->a()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    const-class v1, Lcom/friday/common/dao/FileDao;

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lcom/friday/common/dao/FileDao_Impl;->c:Lcom/friday/common/dao/FileDao_Impl$a;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/friday/common/dao/FileDao_Impl$a;->a()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    const-class v1, Lcom/friday/common/dao/ResourceDao;

    .line 37
    .line 38
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    sget-object v2, Lcom/friday/common/dao/ResourceDao_Impl;->c:Lcom/friday/common/dao/ResourceDao_Impl$a;

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/friday/common/dao/ResourceDao_Impl$a;->a()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-class v1, Lc2/g2;

    .line 52
    .line 53
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v2, Lcom/friday/common/dao/ShareCacheDao_Impl;->c:Lcom/friday/common/dao/ShareCacheDao_Impl$a;

    .line 58
    .line 59
    invoke-virtual {v2}, Lcom/friday/common/dao/ShareCacheDao_Impl$a;->a()Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    const-class v1, Lc2/v0;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget-object v2, Lcom/friday/common/dao/ImageSafetyDao_Impl;->c:Lcom/friday/common/dao/ImageSafetyDao_Impl$a;

    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/friday/common/dao/ImageSafetyDao_Impl$a;->a()Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-class v1, Lc2/a1;

    .line 82
    .line 83
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget-object v2, Lcom/friday/common/dao/PdfDao_Impl;->c:Lcom/friday/common/dao/PdfDao_Impl$a;

    .line 88
    .line 89
    invoke-virtual {v2}, Lcom/friday/common/dao/PdfDao_Impl$a;->a()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    return-object v0
.end method

.method public r()Lcom/friday/common/dao/FileDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->o:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/dao/FileDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public s()Lc2/v0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->r:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lc2/v0;

    .line 8
    .line 9
    return-object v0
.end method

.method public t()Lc2/a1;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->s:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lc2/a1;

    .line 8
    .line 9
    return-object v0
.end method

.method public u()Lcom/friday/common/dao/ResourceDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->p:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/dao/ResourceDao;

    .line 8
    .line 9
    return-object v0
.end method

.method public v()Lc2/g2;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->q:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lc2/g2;

    .line 8
    .line 9
    return-object v0
.end method

.method public w()Lcom/friday/common/dao/UserDao;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/MyDataBase_Impl;->n:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/dao/UserDao;

    .line 8
    .line 9
    return-object v0
.end method
