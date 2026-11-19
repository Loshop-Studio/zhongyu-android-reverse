.class public Lr5/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr5/b0$a;
    }
.end annotation


# static fields
.field public static b:Lr5/b0;


# instance fields
.field public a:Landroid/content/Context;


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

.method public static c()Lr5/b0;
    .locals 2

    .line 1
    const-class v0, Lr5/b0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lr5/b0;->b:Lr5/b0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, Lr5/b0;

    .line 9
    .line 10
    invoke-direct {v1}, Lr5/b0;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lr5/b0;->b:Lr5/b0;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    sget-object v1, Lr5/b0;->b:Lr5/b0;

    .line 19
    .line 20
    monitor-exit v0

    .line 21
    return-object v1

    .line 22
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    throw v1
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lr5/y;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Z)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {}, Lr5/v0;->i()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    iget-object p1, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 17
    .line 18
    const-string v1, "global_v2"

    .line 19
    .line 20
    const-string v2, "uuid"

    .line 21
    .line 22
    invoke-static {p1, v1, v2, v0}, Lr5/l;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    const-string v3, "-"

    .line 41
    .line 42
    invoke-virtual {p1, v3, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object v0, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 47
    .line 48
    invoke-static {v0, v1, v2, p1}, Lr5/l;->g(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-static {p1}, Lr5/v0;->p(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return-object p1
.end method

.method public d(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 6
    .line 7
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lr5/y;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)Lr5/a0;
    .locals 1

    .line 1
    new-instance v0, Lr5/b0$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lr5/b0$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lr5/m;->d(Landroid/content/Context;)Lr5/a0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lr5/q;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public h(Ljava/lang/String;Ljava/lang/String;)Landroid/util/Pair;
    .locals 1

    .line 1
    invoke-static {p1, p2}, Lr5/m1;->f(Ljava/lang/String;Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Lr5/z0;->d()Lr5/t;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lr5/t;->F()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p2}, Lr5/z0;->d()Lr5/t;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Lr5/t;->H()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v0, Landroid/util/Pair;

    .line 45
    .line 46
    invoke-direct {v0, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :cond_1
    :goto_0
    iget-object p1, p0, Lr5/b0;->a:Landroid/content/Context;

    .line 51
    .line 52
    invoke-static {p1}, Lr5/h1;->l(Landroid/content/Context;)Landroid/util/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lr5/z0;->d()Lr5/t;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {p2, v0}, Lr5/t;->w(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lr5/z0;->e()Lr5/z0;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p2}, Lr5/z0;->d()Lr5/t;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    iget-object v0, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {p2, v0}, Lr5/t;->y(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object p1

    .line 87
    :cond_2
    new-instance p1, Landroid/util/Pair;

    .line 88
    .line 89
    const-string p2, ""

    .line 90
    .line 91
    invoke-direct {p1, p2, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    return-object p1
.end method

.method public i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lr5/q;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
