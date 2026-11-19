.class public final Lh/b$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final a:Lh/b$d;

.field public final b:[Z

.field public c:Z

.field public final synthetic d:Lh/b;


# direct methods
.method public constructor <init>(Lh/b;Lh/b$d;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lh/b$c;->d:Lh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p2, p0, Lh/b$c;->a:Lh/b$d;

    .line 4
    invoke-static {p2}, Lh/b$d;->e(Lh/b$d;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lh/b;->b(Lh/b;)I

    move-result p1

    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lh/b$c;->b:[Z

    return-void
.end method

.method public synthetic constructor <init>(Lh/b;Lh/b$d;Lh/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lh/b$c;-><init>(Lh/b;Lh/b$d;)V

    return-void
.end method

.method public static synthetic c(Lh/b$c;)Lh/b$d;
    .locals 0

    .line 1
    iget-object p0, p0, Lh/b$c;->a:Lh/b$d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lh/b$c;)[Z
    .locals 0

    .line 1
    iget-object p0, p0, Lh/b$c;->b:[Z

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/b$c;->d:Lh/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, p0, v1}, Lh/b;->e(Lh/b;Lh/b$c;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh/b$c;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Lh/b$c;->a()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh/b$c;->d:Lh/b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, p0, v1}, Lh/b;->e(Lh/b;Lh/b$c;Z)V

    .line 5
    .line 6
    .line 7
    iput-boolean v1, p0, Lh/b$c;->c:Z

    .line 8
    .line 9
    return-void
.end method

.method public f(I)Ljava/io/File;
    .locals 3

    .line 1
    iget-object v0, p0, Lh/b$c;->d:Lh/b;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lh/b$c;->a:Lh/b$d;

    .line 5
    .line 6
    invoke-static {v1}, Lh/b$d;->g(Lh/b$d;)Lh/b$c;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-ne v1, p0, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Lh/b$c;->a:Lh/b$d;

    .line 13
    .line 14
    invoke-static {v1}, Lh/b$d;->e(Lh/b$d;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v1, p0, Lh/b$c;->b:[Z

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aput-boolean v2, v1, p1

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lh/b$c;->a:Lh/b$d;

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Lh/b$d;->k(I)Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v1, p0, Lh/b$c;->d:Lh/b;

    .line 32
    .line 33
    invoke-static {v1}, Lh/b;->d(Lh/b;)Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_1

    .line 42
    .line 43
    iget-object v1, p0, Lh/b$c;->d:Lh/b;

    .line 44
    .line 45
    invoke-static {v1}, Lh/b;->d(Lh/b;)Ljava/io/File;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 50
    .line 51
    .line 52
    :cond_1
    monitor-exit v0

    .line 53
    return-object p1

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    throw p1
.end method
