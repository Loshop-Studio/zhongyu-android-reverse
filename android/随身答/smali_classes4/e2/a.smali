.class public abstract Le2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String; = null

.field public static b:Ljava/lang/String; = null

.field public static c:Ljava/lang/String; = null

.field public static d:I = 0x0

.field public static e:Z = false

.field public static f:J = 0x7530L

.field public static g:Z = false

.field public static h:Z = false

.field public static i:Z = true

.field public static j:[D


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    const-string p0, "com.umeng.analytics.game.GameSdkVersion"

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "SDK_VERSION"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :catchall_0
    const/4 p0, 0x0

    .line 21
    return-object p0
.end method

.method public static b()[D
    .locals 1

    .line 1
    sget-object v0, Le2/a;->j:[D

    .line 2
    .line 3
    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Le2/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {p0}, Lj2/b;->a(Landroid/content/Context;)Lj2/b;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lj2/b;->e()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sput-object p0, Le2/a;->a:Ljava/lang/String;

    .line 18
    .line 19
    :cond_0
    sget-object p0, Le2/a;->a:Ljava/lang/String;

    .line 20
    .line 21
    return-object p0
.end method

.method public static d(Landroid/content/Context;)I
    .locals 1

    .line 1
    sget v0, Le2/a;->d:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lj2/b;->a(Landroid/content/Context;)Lj2/b;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lj2/b;->f()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    sput p0, Le2/a;->d:I

    .line 14
    .line 15
    :cond_0
    sget p0, Le2/a;->d:I

    .line 16
    .line 17
    return p0
.end method
