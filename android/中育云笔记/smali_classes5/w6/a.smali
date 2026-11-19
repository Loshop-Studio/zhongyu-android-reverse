.class public Lw6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lw6/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a(Landroid/content/Context;[Ljava/lang/String;)Z
    .locals 5

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    aget-object v3, p1, v2

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-static {v4, v3}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public static b()Lw6/a;
    .locals 2

    .line 1
    sget-object v0, Lw6/a;->a:Lw6/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lw6/a;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lw6/a;->a:Lw6/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lw6/a;

    .line 13
    .line 14
    invoke-direct {v1}, Lw6/a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lw6/a;->a:Lw6/a;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lw6/a;->a:Lw6/a;

    .line 27
    .line 28
    return-object v0
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 1

    .line 1
    const-string v0, "android.permission.CAMERA"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Lw6/a;->a(Landroid/content/Context;[Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 1

    .line 1
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Lw6/a;->a(Landroid/content/Context;[Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static e(Landroid/content/Context;[Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lw6/a;->a(Landroid/content/Context;[Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 1

    .line 1
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p0, v0}, Lw6/a;->a(Landroid/content/Context;[Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public g([ILw6/c;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lw6/d;->c([I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p2}, Lw6/c;->onGranted()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p2}, Lw6/c;->onDenied()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h(Landroidx/fragment/app/Fragment;Ljava/util/List;ILw6/c;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La7/a;->c(Landroid/app/Activity;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    instance-of v0, p1, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, [Ljava/lang/String;

    .line 40
    .line 41
    array-length v3, v2

    .line 42
    const/4 v4, 0x0

    .line 43
    :goto_0
    if-ge v4, v3, :cond_1

    .line 44
    .line 45
    aget-object v5, v2, v4

    .line 46
    .line 47
    invoke-static {v0, v5}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-lez p2, :cond_4

    .line 64
    .line 65
    move-object p2, p1

    .line 66
    check-cast p2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 67
    .line 68
    invoke-virtual {p2, p4}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->K0(Lw6/c;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    new-array p2, p2, [Ljava/lang/String;

    .line 76
    .line 77
    invoke-interface {v1, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2, p3}, Landroidx/fragment/app/Fragment;->requestPermissions([Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, p2, p3}, Landroidx/core/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_4
    if-eqz p4, :cond_5

    .line 88
    .line 89
    invoke-interface {p4}, Lw6/c;->onGranted()V

    .line 90
    .line 91
    .line 92
    :cond_5
    :goto_1
    return-void
.end method

.method public i(Landroidx/fragment/app/Fragment;[Ljava/lang/String;Lw6/c;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    const/16 p2, 0x2766

    .line 10
    .line 11
    invoke-virtual {p0, p1, v0, p2, p3}, Lw6/a;->h(Landroidx/fragment/app/Fragment;Ljava/util/List;ILw6/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
