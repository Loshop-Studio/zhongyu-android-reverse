.class public final Lc9/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc9/w$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:Ll8/r;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ll8/q;

.field public final f:Ll8/t;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:[Lc9/n;

.field public final k:Z


# direct methods
.method public constructor <init>(Lc9/w$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lc9/w$a;->b:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput-object v0, p0, Lc9/w;->a:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    iget-object v0, p1, Lc9/w$a;->a:Lc9/y;

    .line 9
    .line 10
    iget-object v0, v0, Lc9/y;->c:Ll8/r;

    .line 11
    .line 12
    iput-object v0, p0, Lc9/w;->b:Ll8/r;

    .line 13
    .line 14
    iget-object v0, p1, Lc9/w$a;->n:Ljava/lang/String;

    .line 15
    .line 16
    iput-object v0, p0, Lc9/w;->c:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v0, p1, Lc9/w$a;->r:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lc9/w;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, p1, Lc9/w$a;->s:Ll8/q;

    .line 23
    .line 24
    iput-object v0, p0, Lc9/w;->e:Ll8/q;

    .line 25
    .line 26
    iget-object v0, p1, Lc9/w$a;->t:Ll8/t;

    .line 27
    .line 28
    iput-object v0, p0, Lc9/w;->f:Ll8/t;

    .line 29
    .line 30
    iget-boolean v0, p1, Lc9/w$a;->o:Z

    .line 31
    .line 32
    iput-boolean v0, p0, Lc9/w;->g:Z

    .line 33
    .line 34
    iget-boolean v0, p1, Lc9/w$a;->p:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lc9/w;->h:Z

    .line 37
    .line 38
    iget-boolean v0, p1, Lc9/w$a;->q:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lc9/w;->i:Z

    .line 41
    .line 42
    iget-object v0, p1, Lc9/w$a;->v:[Lc9/n;

    .line 43
    .line 44
    iput-object v0, p0, Lc9/w;->j:[Lc9/n;

    .line 45
    .line 46
    iget-boolean p1, p1, Lc9/w$a;->w:Z

    .line 47
    .line 48
    iput-boolean p1, p0, Lc9/w;->k:Z

    .line 49
    .line 50
    return-void
.end method

.method public static b(Lc9/y;Ljava/lang/reflect/Method;)Lc9/w;
    .locals 1

    .line 1
    new-instance v0, Lc9/w$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lc9/w$a;-><init>(Lc9/y;Ljava/lang/reflect/Method;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lc9/w$a;->b()Lc9/w;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public a([Ljava/lang/Object;)Ll8/w;
    .locals 12

    .line 1
    iget-object v0, p0, Lc9/w;->j:[Lc9/n;

    .line 2
    .line 3
    array-length v1, p1

    .line 4
    array-length v2, v0

    .line 5
    if-ne v1, v2, :cond_2

    .line 6
    .line 7
    new-instance v3, Lc9/v;

    .line 8
    .line 9
    iget-object v4, p0, Lc9/w;->c:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lc9/w;->b:Ll8/r;

    .line 12
    .line 13
    iget-object v6, p0, Lc9/w;->d:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lc9/w;->e:Ll8/q;

    .line 16
    .line 17
    iget-object v8, p0, Lc9/w;->f:Ll8/t;

    .line 18
    .line 19
    iget-boolean v9, p0, Lc9/w;->g:Z

    .line 20
    .line 21
    iget-boolean v10, p0, Lc9/w;->h:Z

    .line 22
    .line 23
    iget-boolean v11, p0, Lc9/w;->i:Z

    .line 24
    .line 25
    invoke-direct/range {v3 .. v11}, Lc9/v;-><init>(Ljava/lang/String;Ll8/r;Ljava/lang/String;Ll8/q;Ll8/t;ZZZ)V

    .line 26
    .line 27
    .line 28
    iget-boolean v2, p0, Lc9/w;->k:Z

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    add-int/lit8 v1, v1, -0x1

    .line 33
    .line 34
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    :goto_0
    if-ge v4, v1, :cond_1

    .line 41
    .line 42
    aget-object v5, p1, v4

    .line 43
    .line 44
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    aget-object v5, v0, v4

    .line 48
    .line 49
    aget-object v6, p1, v4

    .line 50
    .line 51
    invoke-virtual {v5, v3, v6}, Lc9/n;->a(Lc9/v;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v3}, Lc9/v;->k()Ll8/w$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance v0, Lc9/k;

    .line 62
    .line 63
    iget-object v1, p0, Lc9/w;->a:Ljava/lang/reflect/Method;

    .line 64
    .line 65
    invoke-direct {v0, v1, v2}, Lc9/k;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    const-class v1, Lc9/k;

    .line 69
    .line 70
    invoke-virtual {p1, v1, v0}, Ll8/w$a;->m(Ljava/lang/Class;Ljava/lang/Object;)Ll8/w$a;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ll8/w$a;->b()Ll8/w;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 80
    .line 81
    new-instance v2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v3, "Argument count ("

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ") doesn\'t match expected count ("

    .line 95
    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    array-length v0, v0

    .line 100
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v0, ")"

    .line 104
    .line 105
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1
.end method
