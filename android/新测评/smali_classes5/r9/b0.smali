.class public final Lr9/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr9/b0$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/lang/reflect/Method;

.field public final c:La9/r;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:La9/q;

.field public final g:La9/t;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:[Lr9/v;

.field public final l:Z


# direct methods
.method public constructor <init>(Lr9/b0$a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lr9/b0$a;->b:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object v0, p0, Lr9/b0;->a:Ljava/lang/Class;

    .line 7
    .line 8
    iget-object v0, p1, Lr9/b0$a;->c:Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iput-object v0, p0, Lr9/b0;->b:Ljava/lang/reflect/Method;

    .line 11
    .line 12
    iget-object v0, p1, Lr9/b0$a;->a:Lr9/d0;

    .line 13
    .line 14
    iget-object v0, v0, Lr9/d0;->c:La9/r;

    .line 15
    .line 16
    iput-object v0, p0, Lr9/b0;->c:La9/r;

    .line 17
    .line 18
    iget-object v0, p1, Lr9/b0$a;->o:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v0, p0, Lr9/b0;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v0, p1, Lr9/b0$a;->s:Ljava/lang/String;

    .line 23
    .line 24
    iput-object v0, p0, Lr9/b0;->e:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v0, p1, Lr9/b0$a;->t:La9/q;

    .line 27
    .line 28
    iput-object v0, p0, Lr9/b0;->f:La9/q;

    .line 29
    .line 30
    iget-object v0, p1, Lr9/b0$a;->u:La9/t;

    .line 31
    .line 32
    iput-object v0, p0, Lr9/b0;->g:La9/t;

    .line 33
    .line 34
    iget-boolean v0, p1, Lr9/b0$a;->p:Z

    .line 35
    .line 36
    iput-boolean v0, p0, Lr9/b0;->h:Z

    .line 37
    .line 38
    iget-boolean v0, p1, Lr9/b0$a;->q:Z

    .line 39
    .line 40
    iput-boolean v0, p0, Lr9/b0;->i:Z

    .line 41
    .line 42
    iget-boolean v0, p1, Lr9/b0$a;->r:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lr9/b0;->j:Z

    .line 45
    .line 46
    iget-object v0, p1, Lr9/b0$a;->w:[Lr9/v;

    .line 47
    .line 48
    iput-object v0, p0, Lr9/b0;->k:[Lr9/v;

    .line 49
    .line 50
    iget-boolean p1, p1, Lr9/b0$a;->x:Z

    .line 51
    .line 52
    iput-boolean p1, p0, Lr9/b0;->l:Z

    .line 53
    .line 54
    return-void
.end method

.method public static b(Lr9/d0;Ljava/lang/Class;Ljava/lang/reflect/Method;)Lr9/b0;
    .locals 1

    .line 1
    new-instance v0, Lr9/b0$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lr9/b0$a;-><init>(Lr9/d0;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lr9/b0$a;->b()Lr9/b0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Object;[Ljava/lang/Object;)La9/w;
    .locals 12

    .line 1
    iget-object v0, p0, Lr9/b0;->k:[Lr9/v;

    .line 2
    .line 3
    array-length v1, p2

    .line 4
    array-length v2, v0

    .line 5
    if-ne v1, v2, :cond_2

    .line 6
    .line 7
    new-instance v3, Lr9/a0;

    .line 8
    .line 9
    iget-object v4, p0, Lr9/b0;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lr9/b0;->c:La9/r;

    .line 12
    .line 13
    iget-object v6, p0, Lr9/b0;->e:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v7, p0, Lr9/b0;->f:La9/q;

    .line 16
    .line 17
    iget-object v8, p0, Lr9/b0;->g:La9/t;

    .line 18
    .line 19
    iget-boolean v9, p0, Lr9/b0;->h:Z

    .line 20
    .line 21
    iget-boolean v10, p0, Lr9/b0;->i:Z

    .line 22
    .line 23
    iget-boolean v11, p0, Lr9/b0;->j:Z

    .line 24
    .line 25
    invoke-direct/range {v3 .. v11}, Lr9/a0;-><init>(Ljava/lang/String;La9/r;Ljava/lang/String;La9/q;La9/t;ZZZ)V

    .line 26
    .line 27
    .line 28
    iget-boolean v2, p0, Lr9/b0;->l:Z

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
    aget-object v5, p2, v4

    .line 43
    .line 44
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    aget-object v5, v0, v4

    .line 48
    .line 49
    aget-object v6, p2, v4

    .line 50
    .line 51
    invoke-virtual {v5, v3, v6}, Lr9/v;->a(Lr9/a0;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    add-int/lit8 v4, v4, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {v3}, Lr9/a0;->k()La9/w$a;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    new-instance v0, Lr9/s;

    .line 62
    .line 63
    iget-object v1, p0, Lr9/b0;->a:Ljava/lang/Class;

    .line 64
    .line 65
    iget-object v3, p0, Lr9/b0;->b:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    invoke-direct {v0, v1, p1, v3, v2}, Lr9/s;-><init>(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    const-class p1, Lr9/s;

    .line 71
    .line 72
    invoke-virtual {p2, p1, v0}, La9/w$a;->m(Ljava/lang/Class;Ljava/lang/Object;)La9/w$a;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, La9/w$a;->b()La9/w;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 82
    .line 83
    new-instance p2, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    .line 87
    .line 88
    const-string v2, "Argument count ("

    .line 89
    .line 90
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ") doesn\'t match expected count ("

    .line 97
    .line 98
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    array-length v0, v0

    .line 102
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v0, ")"

    .line 106
    .line 107
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1
.end method
