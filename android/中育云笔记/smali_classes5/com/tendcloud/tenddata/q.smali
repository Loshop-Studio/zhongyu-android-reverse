.class Lcom/tendcloud/tenddata/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/q$a;,
        Lcom/tendcloud/tenddata/q$b;
    }
.end annotation


# static fields
.field private static final A:I = 0xc

.field static final a:I = 0x1

.field static final b:I = 0xd

.field static final c:Ljava/lang/String; = "TDDynamicEvent"

.field static final d:Ljava/lang/String; = "TDExceptionLog"

.field private static volatile e:Lcom/tendcloud/tenddata/q; = null

.field private static final m:Ljava/lang/String; = "talkingdata.viewcrawler.changes"

.field private static final n:Ljava/lang/String; = "config.events"

.field private static final o:Ljava/lang/String; = "config.events.hybrid"

.field private static final p:I = 0x0

.field private static final q:I = 0x2

.field private static final r:I = 0x3

.field private static final s:I = 0x4

.field private static final t:I = 0x5

.field private static final u:I = 0x6

.field private static final v:I = 0x7

.field private static final w:I = 0x8

.field private static final x:I = 0x9

.field private static final y:I = 0xa

.field private static final z:I = 0xb


# instance fields
.field private f:J

.field private final g:Landroid/content/Context;

.field private final h:Lcom/tendcloud/tenddata/i;

.field private final i:Lcom/tendcloud/tenddata/g;

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Lcom/tendcloud/tenddata/q$b;

.field private final l:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/b;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/q;->g:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Lcom/tendcloud/tenddata/g;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tendcloud/tenddata/g;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/tendcloud/tenddata/q;->i:Lcom/tendcloud/tenddata/g;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/tendcloud/tenddata/q;->c()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Lcom/tendcloud/tenddata/q;->j:Ljava/util/Map;

    .line 18
    .line 19
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iget v1, v1, Landroid/util/DisplayMetrics;->scaledDensity:F

    .line 28
    .line 29
    iput v1, p0, Lcom/tendcloud/tenddata/q;->l:F

    .line 30
    .line 31
    invoke-virtual {p3, v0}, Lcom/tendcloud/tenddata/b;->setEditState(Lcom/tendcloud/tenddata/g;)V

    .line 32
    .line 33
    .line 34
    new-instance p3, Landroid/os/HandlerThread;

    .line 35
    .line 36
    const-string v0, "CodelessViewCrawler"

    .line 37
    .line 38
    invoke-direct {p3, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/16 v0, 0xa

    .line 42
    .line 43
    invoke-virtual {p3, v0}, Ljava/lang/Thread;->setPriority(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3}, Ljava/lang/Thread;->start()V

    .line 47
    .line 48
    .line 49
    new-instance v0, Lcom/tendcloud/tenddata/q$b;

    .line 50
    .line 51
    invoke-virtual {p3}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/tendcloud/tenddata/q$b;-><init>(Lcom/tendcloud/tenddata/q;Landroid/content/Context;Ljava/lang/String;Landroid/os/Looper;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lcom/tendcloud/tenddata/q;->k:Lcom/tendcloud/tenddata/q$b;

    .line 59
    .line 60
    invoke-static {}, Lcom/tendcloud/tenddata/u;->a()Lcom/tendcloud/tenddata/u;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1, v0}, Lcom/tendcloud/tenddata/u;->a(Landroid/os/Handler;)V

    .line 65
    .line 66
    .line 67
    new-instance p1, Lcom/tendcloud/tenddata/i;

    .line 68
    .line 69
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/i;-><init>(Landroid/os/Handler;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Lcom/tendcloud/tenddata/q;->h:Lcom/tendcloud/tenddata/i;

    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/q$b;->start()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/q;)F
    .locals 0

    .line 1
    iget p0, p0, Lcom/tendcloud/tenddata/q;->l:F

    return p0
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/q;J)J
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/tendcloud/tenddata/q;->f:J

    return-wide p1
.end method

.method public static a()Lcom/tendcloud/tenddata/q;
    .locals 1

    .line 9
    sget-object v0, Lcom/tendcloud/tenddata/q;->e:Lcom/tendcloud/tenddata/q;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/b;)Lcom/tendcloud/tenddata/q;
    .locals 2

    .line 3
    sget-object v0, Lcom/tendcloud/tenddata/q;->e:Lcom/tendcloud/tenddata/q;

    if-nez v0, :cond_1

    .line 4
    const-class v0, Lcom/tendcloud/tenddata/q;

    monitor-enter v0

    .line 5
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/q;->e:Lcom/tendcloud/tenddata/q;

    if-nez v1, :cond_0

    .line 6
    new-instance v1, Lcom/tendcloud/tenddata/q;

    invoke-direct {v1, p0, p1, p2}, Lcom/tendcloud/tenddata/q;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/tendcloud/tenddata/b;)V

    sput-object v1, Lcom/tendcloud/tenddata/q;->e:Lcom/tendcloud/tenddata/q;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 7
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    .line 8
    :cond_1
    :goto_2
    sget-object p0, Lcom/tendcloud/tenddata/q;->e:Lcom/tendcloud/tenddata/q;

    return-object p0
.end method

.method public static synthetic b()Lcom/tendcloud/tenddata/q;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/q;->e:Lcom/tendcloud/tenddata/q;

    return-object v0
.end method

.method public static synthetic b(Lcom/tendcloud/tenddata/q;)Ljava/util/Map;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tendcloud/tenddata/q;->j:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic c(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/q;->i:Lcom/tendcloud/tenddata/g;

    return-object p0
.end method

.method private c()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 3
    :try_start_0
    const-string v1, "sdk_version"

    const-string v2, "5.0.17 gp"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    const-string v1, "system_name"

    const-string v2, "Android"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    const-string v1, "system_version"

    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v3, "UNKNOWN"

    if-nez v2, :cond_0

    move-object v2, v3

    :cond_0
    :try_start_1
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    const-string v1, "device_manufacturer"

    sget-object v2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    const-string v1, "device_brand"

    sget-object v2, Landroid/os/Build;->BRAND:Ljava/lang/String;

    if-nez v2, :cond_2

    move-object v2, v3

    :cond_2
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    const-string v1, "device_model"

    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    move-object v3, v2

    :goto_0
    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    :try_start_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/q;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 10
    iget-object v2, p0, Lcom/tendcloud/tenddata/q;->g:Landroid/content/Context;

    .line 11
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 12
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    .line 13
    const-string v3, "app_version"

    iget-object v4, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    const-string v3, "app_version_code"

    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v2

    .line 16
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    iget-object v2, p0, Lcom/tendcloud/tenddata/q;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x80

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 18
    const-string v3, "app_name"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    const-string v3, "app_icon_base64_png"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "data:image/png;base64,"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/e;->c(Landroid/graphics/drawable/Drawable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 21
    invoke-interface {v0, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :catchall_0
    return-object v0
.end method

.method public static synthetic d(Lcom/tendcloud/tenddata/q;)Lcom/tendcloud/tenddata/q$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tendcloud/tenddata/q;->k:Lcom/tendcloud/tenddata/q$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lcom/tendcloud/tenddata/q;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tendcloud/tenddata/q;->f:J

    .line 2
    .line 3
    return-wide v0
.end method
