.class public final Lee/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/f;
.implements Lge/n;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lee/n;

.field public final c:I

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/Set;

.field public final f:[Ljava/lang/String;

.field public final g:[Lee/f;

.field public final h:[Ljava/util/List;

.field public final i:[Z

.field public final j:Ljava/util/Map;

.field public final k:[Lee/f;

.field public final l:Lqc/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lee/n;ILjava/util/List;Lee/a;)V
    .locals 1

    .line 1
    const-string v0, "serialName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kind"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "typeParameters"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "builder"

    .line 17
    .line 18
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lee/i;->a:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p2, p0, Lee/i;->b:Lee/n;

    .line 27
    .line 28
    iput p3, p0, Lee/i;->c:I

    .line 29
    .line 30
    invoke-virtual {p5}, Lee/a;->c()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lee/i;->d:Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {p5}, Lee/a;->f()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Ljava/lang/Iterable;

    .line 41
    .line 42
    invoke-static {p1}, Lrc/g0;->V0(Ljava/lang/Iterable;)Ljava/util/HashSet;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lee/i;->e:Ljava/util/Set;

    .line 47
    .line 48
    invoke-virtual {p5}, Lee/a;->f()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Ljava/util/Collection;

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    new-array p3, p2, [Ljava/lang/String;

    .line 56
    .line 57
    invoke-interface {p1, p3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, [Ljava/lang/String;

    .line 62
    .line 63
    iput-object p1, p0, Lee/i;->f:[Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {p5}, Lee/a;->e()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-static {p3}, Lge/x1;->b(Ljava/util/List;)[Lee/f;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    iput-object p3, p0, Lee/i;->g:[Lee/f;

    .line 74
    .line 75
    invoke-virtual {p5}, Lee/a;->d()Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    check-cast p3, Ljava/util/Collection;

    .line 80
    .line 81
    new-array p2, p2, [Ljava/util/List;

    .line 82
    .line 83
    invoke-interface {p3, p2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    check-cast p2, [Ljava/util/List;

    .line 88
    .line 89
    iput-object p2, p0, Lee/i;->h:[Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {p5}, Lee/a;->g()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Ljava/util/Collection;

    .line 96
    .line 97
    invoke-static {p2}, Lrc/g0;->R0(Ljava/util/Collection;)[Z

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    iput-object p2, p0, Lee/i;->i:[Z

    .line 102
    .line 103
    invoke-static {p1}, Lrc/r;->z1([Ljava/lang/Object;)Ljava/lang/Iterable;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance p2, Ljava/util/ArrayList;

    .line 108
    .line 109
    const/16 p3, 0xa

    .line 110
    .line 111
    invoke-static {p1, p3}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 112
    .line 113
    .line 114
    move-result p3

    .line 115
    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result p3

    .line 126
    if-eqz p3, :cond_0

    .line 127
    .line 128
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    check-cast p3, Lrc/k0;

    .line 133
    .line 134
    invoke-virtual {p3}, Lrc/k0;->b()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p5

    .line 138
    invoke-virtual {p3}, Lrc/k0;->a()I

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    invoke-static {p5, p3}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 147
    .line 148
    .line 149
    move-result-object p3

    .line 150
    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_0
    invoke-static {p2}, Lkotlin/collections/a;->s(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    iput-object p1, p0, Lee/i;->j:Ljava/util/Map;

    .line 159
    .line 160
    invoke-static {p4}, Lge/x1;->b(Ljava/util/List;)[Lee/f;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    iput-object p1, p0, Lee/i;->k:[Lee/f;

    .line 165
    .line 166
    new-instance p1, Lee/g;

    .line 167
    .line 168
    invoke-direct {p1, p0}, Lee/g;-><init>(Lee/i;)V

    .line 169
    .line 170
    .line 171
    invoke-static {p1}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    iput-object p1, p0, Lee/i;->l:Lqc/d;

    .line 176
    .line 177
    return-void
.end method

.method public static synthetic h(Lee/i;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lee/i;->j(Lee/i;)I

    move-result p0

    return p0
.end method

.method public static synthetic i(Lee/i;I)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lee/i;->l(Lee/i;I)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lee/i;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->k:[Lee/f;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lge/e2;->a(Lee/f;[Lee/f;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final l(Lee/i;I)Ljava/lang/CharSequence;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lee/i;->d(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ": "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lee/i;->e(I)Lee/f;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Lee/f;->f()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->e:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lee/f$a;->b(Lee/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lee/i;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public d(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->f:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public e(I)Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->g:[Lee/f;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lee/i;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    invoke-interface {p0}, Lee/f;->f()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v3, p1

    .line 16
    check-cast v3, Lee/f;

    .line 17
    .line 18
    invoke-interface {v3}, Lee/f;->f()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_2

    .line 27
    .line 28
    return v2

    .line 29
    :cond_2
    check-cast p1, Lee/i;

    .line 30
    .line 31
    iget-object v1, p0, Lee/i;->k:[Lee/f;

    .line 32
    .line 33
    iget-object p1, p1, Lee/i;->k:[Lee/f;

    .line 34
    .line 35
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    return v2

    .line 42
    :cond_3
    invoke-interface {p0}, Lee/f;->c()I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    invoke-interface {v3}, Lee/f;->c()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eq p1, v1, :cond_4

    .line 51
    .line 52
    return v2

    .line 53
    :cond_4
    invoke-interface {p0}, Lee/f;->c()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    move v1, v2

    .line 58
    :goto_0
    if-ge v1, p1, :cond_7

    .line 59
    .line 60
    invoke-interface {p0, v1}, Lee/f;->e(I)Lee/f;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-interface {v4}, Lee/f;->f()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-interface {v3, v1}, Lee/f;->e(I)Lee/f;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    invoke-interface {v5}, Lee/f;->f()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_5

    .line 81
    .line 82
    return v2

    .line 83
    :cond_5
    invoke-interface {p0, v1}, Lee/f;->e(I)Lee/f;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-interface {v4}, Lee/f;->getKind()Lee/n;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-interface {v3, v1}, Lee/f;->e(I)Lee/f;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    invoke-interface {v5}, Lee/f;->getKind()Lee/n;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_6

    .line 104
    .line 105
    return v2

    .line 106
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_7
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->i:[Z

    .line 2
    .line 3
    aget-boolean p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public getKind()Lee/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->b:Lee/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lee/i;->k()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lee/f$a;->a(Lee/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final k()I
    .locals 1

    .line 1
    iget-object v0, p0, Lee/i;->l:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0}, Lee/i;->c()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {v0, v1}, Lnd/o;->u(II)Lnd/j;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lee/i;->f()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x28

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    new-instance v8, Lee/h;

    .line 32
    .line 33
    invoke-direct {v8, p0}, Lee/h;-><init>(Lee/i;)V

    .line 34
    .line 35
    .line 36
    const/16 v9, 0x18

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    const-string v3, ", "

    .line 40
    .line 41
    const-string v5, ")"

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v7, 0x0

    .line 45
    invoke-static/range {v2 .. v10}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method
