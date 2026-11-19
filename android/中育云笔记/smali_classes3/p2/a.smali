.class public final Lp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lsd/i0;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {v0, v1, v0}, Lsd/e2;->b(Lkotlinx/coroutines/g;ILjava/lang/Object;)Lsd/v;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Lkotlin/coroutines/d;->plus(Lkotlin/coroutines/d;)Lkotlin/coroutines/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlinx/coroutines/d;->a(Lkotlin/coroutines/d;)Lsd/i0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public final b()Lj2/c;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/view/document/NewestFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/view/document/NewestFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final c(Lje/v;)Ls2/a;
    .locals 3

    .line 1
    const-string v0, "okHttpClient"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldf/d0$b;

    .line 7
    .line 8
    invoke-direct {v0}, Ldf/d0$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ldf/d0$b;->f(Lje/v;)Ldf/d0$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "https://hagateway.zyai.cc"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ldf/d0$b;->b(Ljava/lang/String;)Ldf/d0$b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lff/k;->a()Lff/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ldf/d0$b;->a(Ldf/h$a;)Ldf/d0$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Lcom/google/gson/GsonBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lh2/c;

    .line 35
    .line 36
    invoke-direct {v1}, Lh2/c;-><init>()V

    .line 37
    .line 38
    .line 39
    const-class v2, Ljava/util/Date;

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lef/a;->a(Lcom/google/gson/Gson;)Lef/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Ldf/d0$b;->a(Ldf/h$a;)Ldf/d0$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ldf/d0$b;->d()Ldf/d0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-class v0, Ls2/a;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ldf/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "create(...)"

    .line 68
    .line 69
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    check-cast p1, Ls2/a;

    .line 73
    .line 74
    return-object p1
.end method

.method public final d(Ld2/i;Lcom/friday/common/network/StudentSession;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lj2/g;Lcom/friday/document/sync/SyncStateOne;Lcom/friday/document/sync/SyncStateThree;Lc2/g2;Lsd/i0;)Lcom/friday/document/service/FileManager;
    .locals 11

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
    move-object/from16 v6, p5

    .line 24
    .line 25
    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "syncStateOne"

    .line 29
    .line 30
    move-object/from16 v7, p6

    .line 31
    .line 32
    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v0, "syncStateThree"

    .line 36
    .line 37
    move-object/from16 v8, p7

    .line 38
    .line 39
    invoke-static {v8, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v0, "shareCacheDao"

    .line 43
    .line 44
    move-object/from16 v9, p8

    .line 45
    .line 46
    invoke-static {v9, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "externalScope"

    .line 50
    .line 51
    move-object/from16 v10, p9

    .line 52
    .line 53
    invoke-static {v10, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v1, Lcom/friday/document/service/FileManager;

    .line 57
    .line 58
    move-object v2, p1

    .line 59
    move-object v3, p2

    .line 60
    move-object v4, p3

    .line 61
    move-object v5, p4

    .line 62
    invoke-direct/range {v1 .. v10}, Lcom/friday/document/service/FileManager;-><init>(Ld2/i;Lcom/friday/common/network/StudentSession;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lj2/g;Lcom/friday/document/sync/SyncStateOne;Lcom/friday/document/sync/SyncStateThree;Lc2/g2;Lsd/i0;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method

.method public final e()Lj2/f;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/view/document/FolderFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/view/document/FolderFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final f(Lcom/friday/document/service/FileManager;)Lj2/d;
    .locals 1

    .line 1
    const-string v0, "fileManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final g()Lj2/h;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/view/document/RecycleBinFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/view/document/RecycleBinFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final h()Lj2/i;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/view/share/StudentShareFragment;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/view/share/StudentShareFragment;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final i(Lje/v;)Ls2/b;
    .locals 3

    .line 1
    const-string v0, "okHttpClient"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ldf/d0$b;

    .line 7
    .line 8
    invoke-direct {v0}, Ldf/d0$b;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ldf/d0$b;->f(Lje/v;)Ldf/d0$b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "https://hagateway.zyai.cc"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ldf/d0$b;->b(Ljava/lang/String;)Ldf/d0$b;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lff/k;->a()Lff/k;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Ldf/d0$b;->a(Ldf/h$a;)Ldf/d0$b;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Lcom/google/gson/GsonBuilder;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/google/gson/GsonBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v1, Lh2/c;

    .line 35
    .line 36
    invoke-direct {v1}, Lh2/c;-><init>()V

    .line 37
    .line 38
    .line 39
    const-class v2, Ljava/util/Date;

    .line 40
    .line 41
    invoke-virtual {v0, v2, v1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Lef/a;->a(Lcom/google/gson/Gson;)Lef/a;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Ldf/d0$b;->a(Ldf/h$a;)Ldf/d0$b;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ldf/d0$b;->d()Ldf/d0;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const-class v0, Ls2/b;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ldf/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "create(...)"

    .line 68
    .line 69
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    check-cast p1, Ls2/b;

    .line 73
    .line 74
    return-object p1
.end method

.method public final j(Ls2/a;Ld2/i;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/v0;)Lcom/friday/document/sync/SyncStateOne;
    .locals 7

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
    const-string v0, "resourceDao"

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
    new-instance v1, Lcom/friday/document/sync/SyncStateOne;

    .line 27
    .line 28
    move-object v2, p1

    .line 29
    move-object v3, p2

    .line 30
    move-object v4, p3

    .line 31
    move-object v5, p4

    .line 32
    move-object v6, p5

    .line 33
    invoke-direct/range {v1 .. v6}, Lcom/friday/document/sync/SyncStateOne;-><init>(Ls2/a;Ld2/i;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;Lc2/v0;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method

.method public final k(Ls2/a;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;)Lcom/friday/document/sync/SyncStateThree;
    .locals 1

    .line 1
    const-string v0, "service"

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
    new-instance v0, Lcom/friday/document/sync/SyncStateThree;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2, p3}, Lcom/friday/document/sync/SyncStateThree;-><init>(Ls2/a;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/ResourceDao;)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method
