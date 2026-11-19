.class public final Lk7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/g;
.implements Lm7/l;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcoil3/network/g;

.field public final c:I

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/HashSet;

.field public final f:[Ljava/lang/String;

.field public final g:[Lk7/g;

.field public final h:[Ljava/util/List;

.field public final i:[Z

.field public final j:Ljava/util/Map;

.field public final k:[Lk7/g;

.field public final l:Ld6/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcoil3/network/g;ILjava/util/List;Lk7/a;)V
    .locals 1

    .line 1
    const-string v0, "serialName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameters"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lk7/h;->a:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p2, p0, Lk7/h;->b:Lcoil3/network/g;

    .line 17
    .line 18
    iput p3, p0, Lk7/h;->c:I

    .line 19
    .line 20
    iget-object p1, p5, Lk7/a;->b:Ljava/util/List;

    .line 21
    .line 22
    iput-object p1, p0, Lk7/h;->d:Ljava/util/List;

    .line 23
    .line 24
    iget-object p1, p5, Lk7/a;->c:Ljava/util/ArrayList;

    .line 25
    .line 26
    const-string p2, "<this>"

    .line 27
    .line 28
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance p3, Ljava/util/HashSet;

    .line 32
    .line 33
    const/16 v0, 0xc

    .line 34
    .line 35
    invoke-static {p1, v0}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-static {v0}, Lkotlin/collections/e0;->C(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-direct {p3, v0}, Ljava/util/HashSet;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p3}, Lkotlin/collections/t;->A0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 47
    .line 48
    .line 49
    iput-object p3, p0, Lk7/h;->e:Ljava/util/HashSet;

    .line 50
    .line 51
    const/4 p3, 0x0

    .line 52
    new-array v0, p3, [Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, [Ljava/lang/String;

    .line 59
    .line 60
    iput-object p1, p0, Lk7/h;->f:[Ljava/lang/String;

    .line 61
    .line 62
    iget-object v0, p5, Lk7/a;->e:Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-static {v0}, Lm7/y0;->c(Ljava/util/List;)[Lk7/g;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iput-object v0, p0, Lk7/h;->g:[Lk7/g;

    .line 69
    .line 70
    iget-object v0, p5, Lk7/a;->f:Ljava/util/ArrayList;

    .line 71
    .line 72
    new-array p3, p3, [Ljava/util/List;

    .line 73
    .line 74
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p3

    .line 78
    check-cast p3, [Ljava/util/List;

    .line 79
    .line 80
    iput-object p3, p0, Lk7/h;->h:[Ljava/util/List;

    .line 81
    .line 82
    iget-object p3, p5, Lk7/a;->g:Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-static {p3}, Lkotlin/collections/t;->z0(Ljava/util/List;)[Z

    .line 85
    .line 86
    .line 87
    move-result-object p3

    .line 88
    iput-object p3, p0, Lk7/h;->i:[Z

    .line 89
    .line 90
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    new-instance p2, Lk7/i;

    .line 94
    .line 95
    new-instance p3, Landroidx/navigation/b;

    .line 96
    .line 97
    const/16 p5, 0x10

    .line 98
    .line 99
    invoke-direct {p3, p1, p5}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 100
    .line 101
    .line 102
    const/4 p1, 0x6

    .line 103
    invoke-direct {p2, p3, p1}, Lk7/i;-><init>(Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Ljava/util/ArrayList;

    .line 107
    .line 108
    const/16 p3, 0xa

    .line 109
    .line 110
    invoke-static {p2, p3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    invoke-direct {p1, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Lk7/i;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    :goto_0
    move-object p3, p2

    .line 122
    check-cast p3, Lkotlin/collections/b0;

    .line 123
    .line 124
    iget-object p5, p3, Lkotlin/collections/b0;->b:Ljava/util/Iterator;

    .line 125
    .line 126
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result p5

    .line 130
    if-eqz p5, :cond_0

    .line 131
    .line 132
    invoke-virtual {p3}, Lkotlin/collections/b0;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p3

    .line 136
    check-cast p3, Lkotlin/collections/a0;

    .line 137
    .line 138
    iget-object p5, p3, Lkotlin/collections/a0;->b:Ljava/lang/Object;

    .line 139
    .line 140
    iget p3, p3, Lkotlin/collections/a0;->a:I

    .line 141
    .line 142
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    new-instance v0, Lkotlin/Pair;

    .line 147
    .line 148
    invoke-direct {v0, p5, p3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_0
    invoke-static {p1}, Lkotlin/collections/e0;->I(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iput-object p1, p0, Lk7/h;->j:Ljava/util/Map;

    .line 160
    .line 161
    invoke-static {p4}, Lm7/y0;->c(Ljava/util/List;)[Lk7/g;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iput-object p1, p0, Lk7/h;->k:[Lk7/g;

    .line 166
    .line 167
    new-instance p1, Landroidx/navigation/b;

    .line 168
    .line 169
    const/16 p2, 0xf

    .line 170
    .line 171
    invoke-direct {p1, p0, p2}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, Lkotlin/a;->b(Lr6/a;)Ld6/e;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, p0, Lk7/h;->l:Ld6/e;

    .line 179
    .line 180
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->e:Ljava/util/HashSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk7/h;->j:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1

    .line 21
    :cond_0
    const/4 p1, -0x3

    .line 22
    return p1
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lk7/h;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->f:[Ljava/lang/String;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    instance-of v0, p1, Lk7/h;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_1
    move-object v0, p1

    .line 11
    check-cast v0, Lk7/g;

    .line 12
    .line 13
    invoke-interface {v0}, Lk7/g;->h()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v3, p0, Lk7/h;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    check-cast p1, Lk7/h;

    .line 27
    .line 28
    iget-object v2, p0, Lk7/h;->k:[Lk7/g;

    .line 29
    .line 30
    iget-object p1, p1, Lk7/h;->k:[Lk7/g;

    .line 31
    .line 32
    invoke-static {v2, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    invoke-interface {v0}, Lk7/g;->d()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iget v2, p0, Lk7/h;->c:I

    .line 44
    .line 45
    if-eq v2, p1, :cond_4

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_4
    move p1, v1

    .line 49
    :goto_0
    if-ge p1, v2, :cond_7

    .line 50
    .line 51
    iget-object v3, p0, Lk7/h;->g:[Lk7/g;

    .line 52
    .line 53
    aget-object v4, v3, p1

    .line 54
    .line 55
    invoke-interface {v4}, Lk7/g;->h()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v0, p1}, Lk7/g;->g(I)Lk7/g;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-interface {v5}, Lk7/g;->h()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    if-nez v4, :cond_5

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_5
    aget-object v3, v3, p1

    .line 75
    .line 76
    invoke-interface {v3}, Lk7/g;->getKind()Lcoil3/network/g;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    invoke-interface {v0, p1}, Lk7/g;->g(I)Lk7/g;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v4}, Lk7/g;->getKind()Lcoil3/network/g;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_6

    .line 93
    .line 94
    :goto_1
    return v1

    .line 95
    :cond_6
    add-int/lit8 p1, p1, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_7
    :goto_2
    const/4 p1, 0x1

    .line 99
    return p1
.end method

.method public final f(I)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->h:[Ljava/util/List;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final g(I)Lk7/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->g:[Lk7/g;

    .line 2
    .line 3
    aget-object p1, v0, p1

    .line 4
    .line 5
    return-object p1
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKind()Lcoil3/network/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->b:Lcoil3/network/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->l:Ld6/e;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

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

.method public final i(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/h;->i:[Z

    .line 2
    .line 3
    aget-boolean p1, v0, p1

    .line 4
    .line 5
    return p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Lm7/y0;->m(Lk7/g;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
