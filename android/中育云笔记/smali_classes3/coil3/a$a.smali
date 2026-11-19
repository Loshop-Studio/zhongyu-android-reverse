.class public final Lcoil3/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcoil3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcoil3/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcoil3/a;->g()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/util/Collection;

    .line 9
    .line 10
    invoke-static {v0}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcoil3/a$a;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcoil3/a;->i()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/util/Collection;

    .line 21
    .line 22
    invoke-static {v0}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lcoil3/a$a;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcoil3/a;->h()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/util/Collection;

    .line 33
    .line 34
    invoke-static {v0}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcoil3/a$a;->c:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcoil3/a;->f()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Ljava/lang/Iterable;

    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    if-eqz v2, :cond_0

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Lkotlin/Pair;

    .line 66
    .line 67
    new-instance v3, Lk/d;

    .line 68
    .line 69
    invoke-direct {v3, v2}, Lk/d;-><init>(Lkotlin/Pair;)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iput-object v1, p0, Lcoil3/a$a;->d:Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcoil3/a;->e()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Ljava/lang/Iterable;

    .line 83
    .line 84
    new-instance v0, Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, Lcoil3/decode/a$a;

    .line 104
    .line 105
    new-instance v2, Lk/e;

    .line 106
    .line 107
    invoke-direct {v2, v1}, Lk/e;-><init>(Lcoil3/decode/a$a;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    iput-object v0, p0, Lcoil3/a$a;->e:Ljava/util/List;

    .line 115
    .line 116
    return-void
.end method

.method public static synthetic a(Lcoil3/decode/a$a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/a$a;->f(Lcoil3/decode/a$a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcoil3/decode/a$a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/a$a;->l(Lcoil3/decode/a$a;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/Pair;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lcoil3/a$a;->e(Lkotlin/Pair;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ln/k$a;Lod/c;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcoil3/a$a;->m(Ln/k$a;Lod/c;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/Pair;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final f(Lcoil3/decode/a$a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final l(Lcoil3/decode/a$a;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final m(Ln/k$a;Lod/c;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method


# virtual methods
.method public final g(Lcoil3/decode/a$a;)Lcoil3/a$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->e:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    new-instance v1, Lk/g;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lk/g;-><init>(Lcoil3/decode/a$a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final h(Lcoil3/intercept/a;)Lcoil3/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->a:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final i(Ln/k$a;Lod/c;)Lcoil3/a$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->d:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    new-instance v1, Lk/f;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Lk/f;-><init>(Ln/k$a;Lod/c;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final j(Lp/c;Lod/c;)Lcoil3/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->c:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final k(Lq/c;Lod/c;)Lcoil3/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->b:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-static {p1, p2}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final n(Lhd/a;)Lcoil3/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->e:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final o(Lhd/a;)Lcoil3/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->d:Ljava/util/List;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final p()Lcoil3/a;
    .locals 7

    .line 1
    new-instance v0, Lcoil3/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcoil3/a$a;->a:Ljava/util/List;

    .line 4
    .line 5
    invoke-static {v1}, La0/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Lcoil3/a$a;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2}, La0/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, Lcoil3/a$a;->c:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v3}, La0/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v4, p0, Lcoil3/a$a;->d:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v4}, La0/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget-object v5, p0, Lcoil3/a$a;->e:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v5}, La0/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-direct/range {v0 .. v6}, Lcoil3/a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/n;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public final q()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->e:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcoil3/a$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
