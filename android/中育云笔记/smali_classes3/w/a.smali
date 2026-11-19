.class public final Lw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/p;


# instance fields
.field public final a:Lcoil3/e;

.field public final b:La0/x;

.field public final c:La0/l;


# direct methods
.method public constructor <init>(Lcoil3/e;La0/x;Lcoil3/util/Logger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lw/a;->a:Lcoil3/e;

    .line 5
    .line 6
    iput-object p2, p0, Lw/a;->b:La0/x;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, La0/m;->a(Lcoil3/util/Logger;)La0/l;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lw/a;->c:La0/l;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(Lw/g;Lx/e;)Lw/n;
    .locals 11

    .line 1
    new-instance v0, Lw/n;

    .line 2
    .line 3
    invoke-virtual {p1}, Lw/g;->c()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lw/g;->w()Lcoil3/size/Scale;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p1}, Lw/g;->v()Lcoil3/size/Precision;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p1}, Lw/g;->i()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {p1}, Lw/g;->n()Lokio/FileSystem;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    invoke-virtual {p1}, Lw/g;->s()Lcoil3/request/CachePolicy;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-virtual {p1}, Lw/g;->j()Lcoil3/request/CachePolicy;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-virtual {p1}, Lw/g;->t()Lcoil3/request/CachePolicy;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-virtual {p0, p1, p2}, Lw/a;->j(Lw/g;Lx/e;)Lcoil3/c;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    move-object v2, p2

    .line 40
    invoke-direct/range {v0 .. v10}, Lw/n;-><init>(Landroid/content/Context;Lx/e;Lcoil3/size/Scale;Lcoil3/size/Precision;Ljava/lang/String;Lokio/FileSystem;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/c;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public b(Lw/g;Lkotlinx/coroutines/g;Z)Lw/o;
    .locals 7

    .line 1
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ly/b;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-static {p1}, Lw/j;->m(Lw/g;)Landroidx/lifecycle/Lifecycle;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    if-nez p3, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lw/a;->f(Lw/g;)Landroidx/lifecycle/Lifecycle;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    :cond_0
    move-object v5, p3

    .line 20
    new-instance v1, Lcoil3/request/ViewTargetRequestDelegate;

    .line 21
    .line 22
    iget-object v2, p0, Lw/a;->a:Lcoil3/e;

    .line 23
    .line 24
    move-object v4, v0

    .line 25
    check-cast v4, Ly/b;

    .line 26
    .line 27
    move-object v3, p1

    .line 28
    move-object v6, p2

    .line 29
    invoke-direct/range {v1 .. v6}, Lcoil3/request/ViewTargetRequestDelegate;-><init>(Lcoil3/e;Lw/g;Ly/b;Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/g;)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_1
    move-object v3, p1

    .line 34
    move-object v6, p2

    .line 35
    invoke-static {v3}, Lw/j;->m(Lw/g;)Landroidx/lifecycle/Lifecycle;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    if-eqz p3, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lw/a;->f(Lw/g;)Landroidx/lifecycle/Lifecycle;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 p1, 0x0

    .line 49
    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    .line 50
    .line 51
    new-instance p2, Lcoil3/request/LifecycleRequestDelegate;

    .line 52
    .line 53
    invoke-direct {p2, p1, v6}, Lcoil3/request/LifecycleRequestDelegate;-><init>(Landroidx/lifecycle/Lifecycle;Lkotlinx/coroutines/g;)V

    .line 54
    .line 55
    .line 56
    return-object p2

    .line 57
    :cond_4
    invoke-static {v6}, Lw/b;->e(Lkotlinx/coroutines/g;)Lkotlinx/coroutines/g;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {p1}, Lw/b;->d(Lkotlinx/coroutines/g;)Lw/b;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1
.end method

.method public c(Lw/g;)Lw/g;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p1, v0, v1, v0}, Lw/g;->A(Lw/g;Landroid/content/Context;ILjava/lang/Object;)Lw/g$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lw/a;->a:Lcoil3/e;

    .line 8
    .line 9
    invoke-interface {v1}, Lcoil3/e;->b()Lw/g$b;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Lw/g$a;->e(Lw/g$b;)Lw/g$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Lw/g$c;->m()Lx/g;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lw/a;->m(Lw/g;)Lx/g;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lw/g$a;->r(Lx/g;)Lw/g$a;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Lw/g$c;->l()Lcoil3/size/Scale;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lw/a;->l(Lw/g;)Lcoil3/size/Scale;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v0, v2}, Lw/g$a;->q(Lcoil3/size/Scale;)Lw/g$a;

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Lw/g$c;->k()Lcoil3/size/Precision;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-nez v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0, p1, v1}, Lw/a;->k(Lw/g;Lx/g;)Lcoil3/size/Precision;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {v0, p1}, Lw/g$a;->p(Lcoil3/size/Precision;)Lw/g$a;

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {v0}, Lw/g$a;->c()Lw/g;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    return-object p1
.end method

.method public d(Lw/g;Lr/d$c;)Z
    .locals 1

    .line 1
    invoke-virtual {p2}, Lr/d$c;->b()Lk/j;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    instance-of v0, p2, Lk/a;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast p2, Lk/a;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p2, 0x0

    .line 13
    :goto_0
    if-nez p2, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_1
    invoke-virtual {p2}, Lk/a;->b()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {p2}, La0/a;->c(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap$Config;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p0, p1, p2}, Lw/a;->i(Lw/g;Landroid/graphics/Bitmap$Config;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    return p1
.end method

.method public e(Lw/n;)Lw/n;
    .locals 15

    .line 1
    invoke-virtual/range {p1 .. p1}, Lw/n;->f()Lcoil3/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual/range {p0 .. p1}, Lw/a;->h(Lw/n;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lcoil3/c;->d()Lcoil3/c$a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lcoil3/c$c;->b:Lcoil3/c$c$a;

    .line 16
    .line 17
    invoke-static {v1}, Lw/j;->k(Lcoil3/c$c$a;)Lcoil3/c$c;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, Lcoil3/c$a;->b(Lcoil3/c$c;Ljava/lang/Object;)Lcoil3/c$a;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcoil3/c$a;->a()Lcoil3/c;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x1

    .line 32
    :goto_0
    move-object v12, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    const/4 v1, 0x0

    .line 35
    goto :goto_0

    .line 36
    :goto_1
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const/16 v13, 0x1ff

    .line 39
    .line 40
    const/4 v14, 0x0

    .line 41
    const/4 v3, 0x0

    .line 42
    const/4 v4, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x0

    .line 50
    move-object/from16 v2, p1

    .line 51
    .line 52
    invoke-static/range {v2 .. v14}, Lw/n;->b(Lw/n;Landroid/content/Context;Lx/e;Lcoil3/size/Scale;Lcoil3/size/Precision;Ljava/lang/String;Lokio/FileSystem;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/request/CachePolicy;Lcoil3/c;ILjava/lang/Object;)Lw/n;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0

    .line 57
    :cond_1
    return-object p1
.end method

.method public final f(Lw/g;)Landroidx/lifecycle/Lifecycle;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ly/b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Ly/b;

    .line 10
    .line 11
    invoke-interface {v0}, Ly/b;->getView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p1}, Lw/g;->c()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :goto_0
    invoke-static {p1}, La0/c;->e(Landroid/content/Context;)Landroidx/lifecycle/Lifecycle;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final g(Lw/g;Lx/e;)Z
    .locals 4

    .line 1
    invoke-static {p1}, Lw/h;->e(Lw/g;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-static {}, Lcoil3/util/d;->f()[Landroid/graphics/Bitmap$Config;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p1}, Lw/j;->i(Lw/g;)Landroid/graphics/Bitmap$Config;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v0, v3}, Lrc/r;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v2

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move v0, v1

    .line 31
    :goto_1
    invoke-static {p1}, Lw/j;->i(Lw/g;)Landroid/graphics/Bitmap$Config;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, La0/a;->d(Landroid/graphics/Bitmap$Config;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_3

    .line 40
    .line 41
    invoke-static {p1}, Lw/j;->i(Lw/g;)Landroid/graphics/Bitmap$Config;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p0, p1, v3}, Lw/a;->i(Lw/g;Landroid/graphics/Bitmap$Config;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_2

    .line 50
    .line 51
    iget-object p1, p0, Lw/a;->c:La0/l;

    .line 52
    .line 53
    invoke-interface {p1, p2}, La0/l;->a(Lx/e;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move p1, v2

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    :goto_2
    move p1, v1

    .line 63
    :goto_3
    if-eqz v0, :cond_4

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    return v1

    .line 68
    :cond_4
    return v2
.end method

.method public final h(Lw/n;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lw/j;->j(Lw/n;)Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, La0/a;->d(Landroid/graphics/Bitmap$Config;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object p1, p0, Lw/a;->c:La0/l;

    .line 12
    .line 13
    invoke-interface {p1}, La0/l;->b()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    return p1
.end method

.method public final i(Lw/g;Landroid/graphics/Bitmap$Config;)Z
    .locals 2

    .line 1
    invoke-static {p2}, La0/a;->d(Landroid/graphics/Bitmap$Config;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x1

    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    invoke-static {p1}, Lw/j;->e(Lw/g;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez p2, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of p2, p1, Ly/b;

    .line 22
    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    check-cast p1, Ly/b;

    .line 26
    .line 27
    invoke-interface {p1}, Ly/b;->getView()Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->isHardwareAccelerated()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    return v0
.end method

.method public final j(Lw/g;Lx/e;)Lcoil3/c;
    .locals 4

    .line 1
    invoke-static {p1}, Lw/j;->i(Lw/g;)Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1}, Lw/j;->g(Lw/g;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0, p1, p2}, Lw/a;->g(Lw/g;Lx/e;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 16
    .line 17
    :cond_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-static {p1}, Lw/h;->e(Lw/g;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    sget-object p2, Landroid/graphics/Bitmap$Config;->ALPHA_8:Landroid/graphics/Bitmap$Config;

    .line 30
    .line 31
    if-eq v0, p2, :cond_1

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p2, 0x0

    .line 36
    :goto_0
    new-instance v1, Lcoil3/c$a;

    .line 37
    .line 38
    invoke-virtual {p1}, Lw/g;->g()Lw/g$b;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Lw/g$b;->f()Lcoil3/c;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v2}, Lcoil3/c;->b()Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {p1}, Lw/g;->k()Lcoil3/c;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3}, Lcoil3/c;->b()Ljava/util/Map;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-static {v2, v3}, Lkotlin/collections/a;->n(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-direct {v1, v2}, Lcoil3/c$a;-><init>(Ljava/util/Map;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1}, Lw/j;->i(Lw/g;)Landroid/graphics/Bitmap$Config;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    if-eq v0, v2, :cond_2

    .line 70
    .line 71
    sget-object v2, Lcoil3/c$c;->b:Lcoil3/c$c$a;

    .line 72
    .line 73
    invoke-static {v2}, Lw/j;->k(Lcoil3/c$c$a;)Lcoil3/c$c;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2, v0}, Lcoil3/c$a;->b(Lcoil3/c$c;Ljava/lang/Object;)Lcoil3/c$a;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    :cond_2
    invoke-static {p1}, Lw/j;->g(Lw/g;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eq p2, p1, :cond_3

    .line 86
    .line 87
    sget-object p1, Lcoil3/c$c;->b:Lcoil3/c$c$a;

    .line 88
    .line 89
    invoke-static {p1}, Lw/j;->f(Lcoil3/c$c$a;)Lcoil3/c$c;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    invoke-virtual {v1, p1, p2}, Lcoil3/c$a;->b(Lcoil3/c$c;Ljava/lang/Object;)Lcoil3/c$a;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    :cond_3
    invoke-virtual {v1}, Lcoil3/c$a;->a()Lcoil3/c;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1
.end method

.method public final k(Lw/g;Lx/g;)Lcoil3/size/Precision;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lw/g;->h()Lw/g$c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lw/g$c;->m()Lx/g;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lx/g;->b:Lx/g;

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget-object p1, Lcoil3/size/Precision;->d:Lcoil3/size/Precision;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    instance-of v0, v0, Ly/b;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    instance-of v0, p2, Lx/i;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Ly/b;

    .line 39
    .line 40
    invoke-interface {v0}, Ly/b;->getView()Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    instance-of v0, v0, Landroid/widget/ImageView;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ly/b;

    .line 53
    .line 54
    invoke-interface {p1}, Ly/b;->getView()Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p2, Lx/i;

    .line 59
    .line 60
    invoke-interface {p2}, Lx/i;->getView()Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-ne p1, p2, :cond_1

    .line 65
    .line 66
    sget-object p1, Lcoil3/size/Precision;->d:Lcoil3/size/Precision;

    .line 67
    .line 68
    return-object p1

    .line 69
    :cond_1
    sget-object p1, Lcoil3/size/Precision;->c:Lcoil3/size/Precision;

    .line 70
    .line 71
    return-object p1
.end method

.method public final l(Lw/g;)Lcoil3/size/Scale;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ly/b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Ly/b;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ly/b;->getView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v0, v2

    .line 22
    :goto_1
    instance-of v1, v0, Landroid/widget/ImageView;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    move-object v2, v0

    .line 27
    check-cast v2, Landroid/widget/ImageView;

    .line 28
    .line 29
    :cond_2
    if-eqz v2, :cond_3

    .line 30
    .line 31
    invoke-static {v2}, Lcoil3/util/d;->e(Landroid/widget/ImageView;)Lcoil3/size/Scale;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_3
    invoke-virtual {p1}, Lw/g;->w()Lcoil3/size/Scale;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1
.end method

.method public final m(Lw/g;)Lx/g;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ly/b;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p1}, Lw/g;->y()Ly/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ly/b;

    .line 14
    .line 15
    invoke-interface {p1}, Ly/b;->getView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    instance-of v0, p1, Landroid/widget/ImageView;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    move-object v0, p1

    .line 24
    check-cast v0, Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    .line 31
    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    .line 35
    .line 36
    if-ne v0, v1, :cond_1

    .line 37
    .line 38
    :cond_0
    sget-object p1, Lx/g;->b:Lx/g;

    .line 39
    .line 40
    return-object p1

    .line 41
    :cond_1
    const/4 v0, 0x2

    .line 42
    const/4 v1, 0x0

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {p1, v2, v0, v1}, Lx/j;->b(Landroid/view/View;ZILjava/lang/Object;)Lx/i;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_2
    sget-object p1, Lx/g;->b:Lx/g;

    .line 50
    .line 51
    return-object p1
.end method
