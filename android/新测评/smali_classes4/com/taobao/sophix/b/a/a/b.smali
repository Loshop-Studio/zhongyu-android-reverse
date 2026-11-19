.class public Lcom/taobao/sophix/b/a/a/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/taobao/sophix/b/a/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/taobao/sophix/b/a/a/b$a;
    }
.end annotation


# static fields
.field private static b:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

.field private static c:Ljava/lang/String;


# instance fields
.field private a:Lcom/taobao/sophix/c/c;


# direct methods
.method public constructor <init>(Lcom/taobao/sophix/listener/PatchLoadStatusListener;Lcom/taobao/sophix/c/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sput-object p1, Lcom/taobao/sophix/b/a/a/b;->b:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/taobao/sophix/b/a/a/b;->a:Lcom/taobao/sophix/c/c;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Lcom/taobao/sophix/b/a/a/b;)Lcom/taobao/sophix/c/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/taobao/sophix/b/a/a/b;->a:Lcom/taobao/sophix/c/c;

    return-object p0
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ".odex"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .line 9
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b$a;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a(Lcom/taobao/sophix/b/a/a/b;Ljava/io/File;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->e(Ljava/io/File;)V

    return-void
.end method

.method public static a(Ljava/lang/Class;)V
    .locals 2

    .line 46
    const-string p0, "ignore in art."

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "ColdDexManager"

    const-string v1, "setClearPreVerified"

    invoke-static {v0, v1, p0}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method private static a(Ljava/util/List;Ljava/lang/Class;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 11
    invoke-static {p0, v2}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/util/List;Ljava/lang/Class;)V

    .line 12
    invoke-static {p0, v2}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/util/List;Ljava/lang/Class;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    .line 37
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 38
    :try_start_1
    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    :try_start_2
    invoke-static {p1, p2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    invoke-static {p1}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 41
    invoke-static {p2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    return-void

    :catchall_0
    move-exception p3

    :goto_0
    move-object v0, p1

    goto :goto_3

    :catch_0
    move-exception p3

    :goto_1
    move-object v0, p1

    goto :goto_2

    :catchall_1
    move-exception p3

    move-object p2, v0

    goto :goto_0

    :catch_1
    move-exception p3

    move-object p2, v0

    goto :goto_1

    :catchall_2
    move-exception p3

    move-object p2, v0

    goto :goto_3

    :catch_2
    move-exception p3

    move-object p2, v0

    .line 42
    :goto_2
    :try_start_3
    new-instance p1, Lcom/taobao/sophix/a/b;

    const/16 v1, 0x68

    invoke-direct {p1, v1, p3}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    move-exception p3

    .line 43
    :goto_3
    invoke-static {v0}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 44
    invoke-static {p2}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 45
    throw p3
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 20
    const-string v0, "ColdDexManager"

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    const-string v2, "dex2oat"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    const-string v2, "--runtime-arg"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    const-string v3, "-classpath"

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    const-string v2, "&"

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "--dex-file="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "--oat-file="

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "--instruction-set="

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->f()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    const-string p1, "--compiler-filter=interpret-only"

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    new-instance p1, Ljava/lang/ProcessBuilder;

    invoke-direct {p1, v1}, Ljava/lang/ProcessBuilder;-><init>(Ljava/util/List;)V

    const/4 p2, 0x1

    .line 31
    invoke-virtual {p1, p2}, Ljava/lang/ProcessBuilder;->redirectErrorStream(Z)Ljava/lang/ProcessBuilder;

    const/4 v1, 0x0

    .line 32
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;

    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Process;->waitFor()I

    move-result p1

    if-eqz p1, :cond_0

    .line 34
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dex2oat exit un-normally: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {v0, p1, p2}, Lcom/taobao/sophix/e/e;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :cond_0
    return p2

    .line 35
    :goto_0
    const-string p2, "dex2oat failed to start"

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, p2, p1, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    return v1

    .line 36
    :goto_1
    const-string p2, "dex2oat was interrupted: "

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, p2, p1, v2}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    return v1
.end method

.method private static a(Ljava/util/List;)[Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;)[",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "L"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "."

    const-string v4, "/"

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "exclude "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "ColdDexManager"

    invoke-static {v4, v2, v3}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    .line 19
    invoke-interface {v0, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p0
.end method

.method public static b(Ljava/lang/Class;)V
    .locals 1

    .line 39
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b$a;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p0}, Lcom/taobao/sophix/b/a/a/b$a;->a(Ljava/util/List;Ljava/lang/Class;)V

    return-void
.end method

.method private static b(Ljava/util/List;Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    .line 32
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    .line 33
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    const-class v1, Landroid/app/Application;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 36
    invoke-static {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/util/List;Ljava/lang/Class;)V

    .line 37
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b()Z
    .locals 1

    .line 38
    sget-boolean v0, Lcom/taobao/sophix/b/b;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private b(Ljava/io/File;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/taobao/sophix/e/b;->b()Z

    move-result v1

    const/16 v2, 0x1d

    const/4 v3, 0x0

    const-string v4, "ColdDexManager"

    if-eqz v1, :cond_2

    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v1, v2, :cond_0

    .line 4
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->d(Ljava/io/File;)Z

    move-result p1

    return p1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/b;->a:Lcom/taobao/sophix/c/c;

    iget v0, v0, Lcom/taobao/sophix/c/c;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 6
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "android version >= 29, check patch file exists: "

    invoke-static {v4, v1, v0}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return p1

    .line 8
    :cond_1
    const-string p1, "android version >= 29, preload, not apply patch under enhanced."

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {v4, p1, v0}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return v3

    .line 9
    :cond_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v1, "sophix-merged.zip"

    if-lt p1, v2, :cond_8

    .line 10
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "android version >= 29, check zip exists: "

    invoke-static {v4, v6, v5}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    if-nez p1, :cond_3

    return v3

    .line 13
    :cond_3
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const/4 v5, -0x1

    const-string v6, "oat_sdk_int"

    invoke-static {p1, v6, v5}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result p1

    .line 14
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "oat sdk int: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v4, v5, v7}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 15
    const-string v5, "opt file exists: "

    if-ge p1, v2, :cond_6

    .line 16
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {p1, v6}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    new-instance p1, Ljava/io/File;

    invoke-static {v1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v4, v0, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 20
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 21
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v0}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 22
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    .line 23
    :cond_4
    const-string p1, "fail to delete illegal odex file."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "hasValidOptPatches"

    invoke-static {v4, v0, p1}, Lcom/taobao/sophix/e/e;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 24
    new-instance p1, Lcom/taobao/sophix/a/b;

    const/16 v0, 0x50

    const-string v1, "fail to delete odex file."

    invoke-direct {p1, v0, v1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    return v3

    .line 25
    :cond_6
    new-instance p1, Ljava/io/File;

    invoke-static {v1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {v4, v0, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 28
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 29
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->d(Ljava/io/File;)Z

    move-result p1

    return p1

    :cond_7
    const/4 p1, 0x1

    return p1

    .line 30
    :cond_8
    new-instance p1, Ljava/io/File;

    invoke-static {v1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->d(Ljava/io/File;)Z

    move-result p1

    return p1
.end method

.method public static synthetic c()Lcom/taobao/sophix/listener/PatchLoadStatusListener;
    .locals 1

    .line 1
    sget-object v0, Lcom/taobao/sophix/b/a/a/b;->b:Lcom/taobao/sophix/listener/PatchLoadStatusListener;

    return-object v0
.end method

.method private c(Ljava/io/File;)Ljava/io/File;
    .locals 5

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".odex"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "oat"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1

    :cond_0
    return-object p1
.end method

.method private static c(Ljava/util/List;Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;",
            "Ljava/lang/Class;",
            ")V"
        }
    .end annotation

    .line 7
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 8
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static synthetic d()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->e()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private d(Ljava/io/File;)Z
    .locals 4

    .line 2
    const-string v0, "file"

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "ColdDexManager"

    const-string v2, "isOptFileValid"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 3
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    .line 4
    invoke-static {p1}, Lcom/taobao/sophix/e/i;->b(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    const-string p1, "odex is legal"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/taobao/sophix/e/e;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    const/4 p1, 0x1

    return p1

    .line 6
    :cond_0
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v0}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    const-string v0, "odex is illegal"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 8
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    const-string p1, "fail to delete illegal odex file."

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/taobao/sophix/e/e;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 10
    new-instance p1, Lcom/taobao/sophix/a/b;

    const/16 v0, 0x50

    const-string v1, "fail to delete odex file."

    invoke-direct {p1, v0, v1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return v3

    .line 11
    :cond_3
    const-string p1, "odex not exist"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    return v3
.end method

.method private static e()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-static {v1, v0}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/util/List;Ljava/lang/Class;)V

    .line 14
    invoke-static {v1, v0}, Lcom/taobao/sophix/b/a/a/b;->b(Ljava/util/List;Ljava/lang/Class;)V

    .line 15
    invoke-static {v1, v0}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/util/List;Ljava/lang/Class;)V

    return-object v1
.end method

.method private declared-synchronized e(Ljava/io/File;)V
    .locals 3

    monitor-enter p0

    .line 1
    :try_start_0
    const-string v0, "ColdDexManager"

    const-string v1, "doOptPatch start"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 2
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    invoke-static {v0}, Lcom/taobao/sophix/e/g;->a(Landroid/app/Application;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    const-string p1, "ColdDexManager"

    const-string v0, "doOptPatch"

    const-string v1, "skip in main process"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 5
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/taobao/sophix/e/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->i(Ljava/io/File;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->j(Ljava/io/File;)V

    .line 8
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->h(Ljava/io/File;)V

    .line 9
    :goto_0
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v0, "sophix_system_fingerprint"

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 10
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method private static f()Ljava/lang/String;
    .locals 4

    .line 9
    sget-object v0, Lcom/taobao/sophix/b/a/a/b;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 10
    :try_start_0
    const-class v0, Landroid/content/pm/ApplicationInfo;

    const-string v1, "primaryCpuAbi"

    invoke-static {v0, v1}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 11
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 12
    const-string v1, "dalvik.system.VMRuntime"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getInstructionSet"

    const-class v3, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/taobao/sophix/e/h;->a(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    .line 13
    invoke-virtual {v1, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    sput-object v0, Lcom/taobao/sophix/b/a/a/b;->c:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    .line 14
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ColdDexManager"

    const-string v3, "fail to get primary cpu abi"

    invoke-static {v2, v3, v0, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)I

    .line 15
    :cond_0
    :goto_0
    sget-object v0, Lcom/taobao/sophix/b/a/a/b;->c:Ljava/lang/String;

    return-object v0
.end method

.method private f(Ljava/io/File;)V
    .locals 5

    const/4 v0, 0x0

    .line 1
    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "ColdDexManager"

    const-string v3, "optProcessedBaseDexFiles start"

    invoke-static {v2, v3, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 2
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    const-string v3, "classes.dex"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, v1}, Lcom/taobao/sophix/b/a/a/b;->i(Ljava/io/File;)V

    .line 4
    sget-object v1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    const-string v2, "SP_BASE_DEX_COUNT"

    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/j;->a(Landroid/content/Context;Ljava/lang/String;I)I

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    .line 5
    new-instance v1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "classes"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".dex"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0, v1}, Lcom/taobao/sophix/b/a/a/b;->g(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-direct {p0, v1}, Lcom/taobao/sophix/b/a/a/b;->i(Ljava/io/File;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Lcom/taobao/sophix/a/b;

    const/16 v0, 0x69

    const-string v1, "processBaseDexFiles fail"

    invoke-direct {p1, v0, v1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method

.method private g(Ljava/io/File;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/io/File;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v2, "classes.dex"

    .line 12
    .line 13
    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->a()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/util/List;)[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, p1, v1}, Lcom/taobao/sophix/core/dex/SophixNative;->removeClassesInBase(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method private h(Ljava/io/File;)V
    .locals 13

    .line 1
    const-string v0, "fail to mark kept methods"

    .line 2
    .line 3
    const-string v1, "classes.dex"

    .line 4
    .line 5
    const-string v2, "sophix-merged.zip"

    .line 6
    .line 7
    const-string v3, ".dex"

    .line 8
    .line 9
    const-string v4, "classes"

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    new-array v6, v5, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v7, "ColdDexManager"

    .line 15
    .line 16
    const-string v8, "optMergedAllDexFiles start"

    .line 17
    .line 18
    invoke-static {v7, v8, v6}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    :try_start_0
    const-string v8, ".tmp"

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v9

    .line 28
    invoke-static {v2, v8, v9}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    new-instance v9, Ljava/util/zip/ZipOutputStream;

    .line 33
    .line 34
    new-instance v10, Ljava/io/FileOutputStream;

    .line 35
    .line 36
    invoke-direct {v10, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {v9, v10}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    .line 41
    .line 42
    :try_start_1
    new-instance v6, Ljava/util/zip/ZipEntry;

    .line 43
    .line 44
    invoke-direct {v6, v1}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v9, v6}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 48
    .line 49
    .line 50
    new-instance v6, Ljava/io/File;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v10

    .line 56
    invoke-direct {v6, v10, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Ljava/io/FileInputStream;

    .line 60
    .line 61
    invoke-direct {v1, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v1, v9}, Lcom/taobao/sophix/e/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    .line 71
    .line 72
    .line 73
    new-instance v1, Ljava/io/File;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    new-instance v10, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const/4 v11, 0x1

    .line 88
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    invoke-direct {v1, v6, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 106
    .line 107
    const/16 v10, 0x1b

    .line 108
    .line 109
    if-ge v6, v10, :cond_1

    .line 110
    .line 111
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->b()Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_1

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    invoke-static {}, Lcom/taobao/sophix/b/a/a/b;->a()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object v10

    .line 125
    invoke-static {v10}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/util/List;)[Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-static {v6, v10}, Lcom/taobao/sophix/core/dex/SophixNative;->markKeptMethods(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-eqz v6, :cond_0

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    new-array p1, v5, [Ljava/lang/Object;

    .line 137
    .line 138
    invoke-static {v7, v0, p1}, Lcom/taobao/sophix/e/e;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 139
    .line 140
    .line 141
    new-instance p1, Lcom/taobao/sophix/a/b;

    .line 142
    .line 143
    const/16 v1, 0x6a

    .line 144
    .line 145
    invoke-direct {p1, v1, v0}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    throw p1

    .line 149
    :catchall_0
    move-exception p1

    .line 150
    move-object v6, v9

    .line 151
    goto/16 :goto_3

    .line 152
    .line 153
    :catch_0
    move-exception p1

    .line 154
    move-object v6, v9

    .line 155
    goto/16 :goto_2

    .line 156
    .line 157
    :cond_1
    :goto_0
    move v0, v11

    .line 158
    :goto_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_2

    .line 163
    .line 164
    new-instance v6, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    const-string v10, "append dex file "

    .line 170
    .line 171
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    const-string v10, " to jar"

    .line 182
    .line 183
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    new-array v10, v5, [Ljava/lang/Object;

    .line 191
    .line 192
    invoke-static {v7, v6, v10}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    new-instance v6, Ljava/util/zip/ZipEntry;

    .line 196
    .line 197
    new-instance v10, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    add-int/2addr v0, v11

    .line 206
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v12

    .line 210
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    invoke-direct {v6, v10}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9, v6}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 224
    .line 225
    .line 226
    new-instance v6, Ljava/io/FileInputStream;

    .line 227
    .line 228
    invoke-direct {v6, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 229
    .line 230
    .line 231
    invoke-static {v6, v9}, Lcom/taobao/sophix/e/c;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 238
    .line 239
    .line 240
    new-instance v1, Ljava/io/File;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    new-instance v10, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v12

    .line 258
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-direct {v1, v6, v10}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_2
    invoke-virtual {v9}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 273
    .line 274
    .line 275
    new-instance v0, Ljava/io/File;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    invoke-direct {v0, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    if-eqz p1, :cond_3

    .line 289
    .line 290
    const-string p1, "mergedFile"

    .line 291
    .line 292
    new-instance v1, Ljava/lang/StringBuilder;

    .line 293
    .line 294
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v2

    .line 301
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    const-string v2, " exist, delete first."

    .line 305
    .line 306
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-static {v7, p1, v1}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 321
    .line 322
    .line 323
    :cond_3
    new-instance p1, Ljava/io/File;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    invoke-static {v1}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/io/File;)Ljava/io/File;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-static {p1}, Lcom/taobao/sophix/e/i;->d(Ljava/io/File;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v8, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    if-eqz p1, :cond_4

    .line 348
    .line 349
    invoke-direct {p0, v0}, Lcom/taobao/sophix/b/a/a/b;->i(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 350
    .line 351
    .line 352
    invoke-static {v9}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :cond_4
    :try_start_2
    new-instance p1, Ljava/io/IOException;

    .line 357
    .line 358
    const-string v0, "fail to rename"

    .line 359
    .line 360
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 364
    :catchall_1
    move-exception p1

    .line 365
    goto :goto_3

    .line 366
    :catch_1
    move-exception p1

    .line 367
    :goto_2
    :try_start_3
    new-instance v0, Lcom/taobao/sophix/a/b;

    .line 368
    .line 369
    const/16 v1, 0x6b

    .line 370
    .line 371
    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    .line 372
    .line 373
    .line 374
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 375
    :goto_3
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/io/Closeable;)V

    .line 376
    .line 377
    .line 378
    throw p1
.end method

.method private i(Ljava/io/File;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "ColdDexManager"

    .line 10
    .line 11
    const-string v2, "preloadDex start"

    .line 12
    .line 13
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v2

    .line 20
    new-instance v0, Ljava/io/File;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :try_start_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v5, 0x1a

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    if-ge v4, v5, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    const-wide/32 v7, 0x1e8480

    .line 45
    .line 46
    .line 47
    cmp-long v4, v4, v7

    .line 48
    .line 49
    if-lez v4, :cond_0

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    invoke-direct {p0, v4, v5}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-nez v4, :cond_1

    .line 64
    .line 65
    const-string v4, "preloadDex switch to traditional odex"

    .line 66
    .line 67
    new-array v5, v6, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {v1, v4, v5}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {p1, v4, v6}, Ldalvik/system/DexFile;->loadDex(Ljava/lang/String;Ljava/lang/String;I)Ldalvik/system/DexFile;

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :catch_0
    move-exception p1

    .line 85
    goto/16 :goto_2

    .line 86
    .line 87
    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {p1, v4, v6}, Ldalvik/system/DexFile;->loadDex(Ljava/lang/String;Ljava/lang/String;I)Ldalvik/system/DexFile;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 96
    .line 97
    .line 98
    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Lcom/taobao/sophix/b/a/a/b;->c(Ljava/io/File;)Ljava/io/File;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1}, Lcom/taobao/sophix/e/f;->a(Ljava/io/File;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-wide/16 v4, 0x3e8

    .line 107
    .line 108
    move-wide v7, v4

    .line 109
    :cond_2
    :goto_1
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-nez v9, :cond_3

    .line 114
    .line 115
    invoke-static {p1}, Lcom/taobao/sophix/e/f;->a(Ljava/io/File;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-nez v9, :cond_5

    .line 124
    .line 125
    :cond_3
    invoke-static {p1}, Lcom/taobao/sophix/e/f;->a(Ljava/io/File;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :try_start_1
    new-instance v9, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v10, "preloadDex wait dexopt "

    .line 135
    .line 136
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v10, "ms"

    .line 147
    .line 148
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    new-array v10, v6, [Ljava/lang/Object;

    .line 156
    .line 157
    invoke-static {v1, v9, v10}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 158
    .line 159
    .line 160
    invoke-static {v7, v8}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 161
    .line 162
    .line 163
    :catch_1
    const-wide/16 v9, 0x1f40

    .line 164
    .line 165
    cmp-long v9, v7, v9

    .line 166
    .line 167
    if-gez v9, :cond_4

    .line 168
    .line 169
    add-long/2addr v7, v4

    .line 170
    goto :goto_1

    .line 171
    :cond_4
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    if-eqz v9, :cond_2

    .line 176
    .line 177
    const-string v4, "preloadDex signature is always empty, abandon."

    .line 178
    .line 179
    new-array v5, v6, [Ljava/lang/Object;

    .line 180
    .line 181
    invoke-static {v1, v4, v5}, Lcom/taobao/sophix/e/e;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 182
    .line 183
    .line 184
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 185
    .line 186
    .line 187
    move-result-wide v4

    .line 188
    sub-long/2addr v4, v2

    .line 189
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    const-string v3, "time consumed(ms)"

    .line 194
    .line 195
    filled-new-array {v3, v2}, [Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    const-string v3, "preloadDex end"

    .line 200
    .line 201
    invoke-static {v1, v3, v2}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 202
    .line 203
    .line 204
    invoke-static {p1, v0}, Lcom/taobao/sophix/e/i;->a(Ljava/io/File;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 208
    .line 209
    sget-object v0, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 210
    .line 211
    const-string v1, "oat_sdk_int"

    .line 212
    .line 213
    invoke-static {v0, v1, p1}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :goto_2
    new-instance v0, Lcom/taobao/sophix/a/b;

    .line 218
    .line 219
    const/16 v1, 0x66

    .line 220
    .line 221
    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw v0
.end method

.method private j(Ljava/io/File;)V
    .locals 10

    .line 1
    const-string v0, "SP_BASE_DEX_COUNT"

    .line 2
    .line 3
    const-string v1, "classes.dex"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    new-array v3, v2, [Ljava/lang/Object;

    .line 7
    .line 8
    const-string v4, "ColdDexManager"

    .line 9
    .line 10
    const-string v5, "extractAllBaseDexFiles start"

    .line 11
    .line 12
    invoke-static {v4, v5, v3}, Lcom/taobao/sophix/e/e;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :try_start_0
    new-instance v4, Ljava/util/zip/ZipFile;

    .line 17
    .line 18
    invoke-direct {v4, p1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 19
    .line 20
    .line 21
    :try_start_1
    sget-object v5, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 22
    .line 23
    invoke-virtual {v5}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    iget-object v5, v5, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 28
    .line 29
    new-instance v6, Ljava/util/zip/ZipFile;

    .line 30
    .line 31
    invoke-direct {v6, v5}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    :try_start_2
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v4, v1}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    new-instance v5, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    sget-object v7, Ljava/io/File;->separator:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-direct {p0, v4, v3, v5}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :catchall_0
    move-exception p1

    .line 69
    :goto_0
    move-object v3, v4

    .line 70
    goto :goto_4

    .line 71
    :cond_0
    :goto_1
    sget-object v3, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 72
    .line 73
    invoke-static {v3, v0, v2}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    :cond_1
    :goto_2
    invoke-interface {v3}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_3

    .line 85
    .line 86
    invoke-interface {v3}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Ljava/util/zip/ZipEntry;

    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    const-string v8, "classes"

    .line 97
    .line 98
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    if-eqz v8, :cond_1

    .line 103
    .line 104
    const-string v8, ".dex"

    .line 105
    .line 106
    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    if-eqz v8, :cond_1

    .line 111
    .line 112
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_2

    .line 117
    .line 118
    const-string v7, "classes1.dex"

    .line 119
    .line 120
    :cond_2
    new-instance v8, Ljava/lang/StringBuilder;

    .line 121
    .line 122
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-direct {p0, v6, v5, v7}, Lcom/taobao/sophix/b/a/a/b;->a(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    add-int/lit8 v2, v2, 0x1

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_3
    sget-object p1, Lcom/taobao/sophix/b/b;->b:Landroid/app/Application;

    .line 147
    .line 148
    invoke-static {p1, v0, v2}, Lcom/taobao/sophix/e/j;->b(Landroid/content/Context;Ljava/lang/String;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    .line 150
    .line 151
    invoke-static {v4}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :catchall_1
    move-exception p1

    .line 159
    move-object v6, v3

    .line 160
    goto :goto_0

    .line 161
    :catch_0
    move-exception p1

    .line 162
    goto :goto_3

    .line 163
    :catchall_2
    move-exception p1

    .line 164
    move-object v6, v3

    .line 165
    goto :goto_4

    .line 166
    :catch_1
    move-exception p1

    .line 167
    move-object v4, v3

    .line 168
    :goto_3
    :try_start_3
    new-instance v0, Lcom/taobao/sophix/a/b;

    .line 169
    .line 170
    const/16 v1, 0x67

    .line 171
    .line 172
    invoke-direct {v0, v1, p1}, Lcom/taobao/sophix/a/b;-><init>(ILjava/lang/Throwable;)V

    .line 173
    .line 174
    .line 175
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 176
    :goto_4
    invoke-static {v3}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v6}, Lcom/taobao/sophix/e/c;->a(Ljava/util/zip/ZipFile;)V

    .line 180
    .line 181
    .line 182
    throw p1
.end method

.method private k(Ljava/io/File;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Ljava/lang/Object;

    .line 3
    .line 4
    const-string v1, "ColdDexManager"

    .line 5
    .line 6
    const-string v2, "doApplyPatch"

    .line 7
    .line 8
    invoke-static {v1, v2, v0}, Lcom/taobao/sophix/e/e;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/taobao/sophix/b/a/a/a;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Lcom/taobao/sophix/b/a/a/a;-><init>(Ljava/lang/ClassLoader;)V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/taobao/sophix/e/b;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/taobao/sophix/b/a/a/a;->a(Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v2, "sophix-merged.zip"

    .line 41
    .line 42
    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/taobao/sophix/b/a/a/a;->a(Ljava/io/File;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public a(Ljava/io/File;)Z
    .locals 2

    .line 3
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->b(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/b;->a:Lcom/taobao/sophix/c/c;

    invoke-virtual {v0}, Lcom/taobao/sophix/c/c;->a()V

    .line 5
    iget-object v0, p0, Lcom/taobao/sophix/b/a/a/b;->a:Lcom/taobao/sophix/c/c;

    const-string v1, "181"

    iput-object v1, v0, Lcom/taobao/sophix/c/c;->c:Ljava/lang/String;

    .line 6
    invoke-static {v0}, Lcom/taobao/sophix/c/b;->a(Lcom/taobao/sophix/c/c;)V

    .line 7
    invoke-direct {p0, p1}, Lcom/taobao/sophix/b/a/a/b;->k(Ljava/io/File;)V

    const/4 p1, 0x1

    return p1

    .line 8
    :cond_0
    new-instance v0, Lcom/taobao/sophix/b/a/a/b$1;

    invoke-direct {v0, p0, p1}, Lcom/taobao/sophix/b/a/a/b$1;-><init>(Lcom/taobao/sophix/b/a/a/b;Ljava/io/File;)V

    invoke-static {v0}, Lcom/taobao/sophix/e/l;->a(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return p1
.end method
