.class public abstract Lx0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:I

.field public b:F

.field public c:Lh0/c;

.field public d:Lcom/bumptech/glide/Priority;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:I

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:I

.field public i:Z

.field public j:I

.field public k:I

.field public l:Lf0/b;

.field public m:Z

.field public n:Z

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:I

.field public q:Lf0/d;

.field public r:Ljava/util/Map;

.field public s:Ljava/lang/Class;

.field public t:Z

.field public u:Landroid/content/res/Resources$Theme;

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, Lx0/a;->b:F

    .line 7
    .line 8
    sget-object v0, Lh0/c;->e:Lh0/c;

    .line 9
    .line 10
    iput-object v0, p0, Lx0/a;->c:Lh0/c;

    .line 11
    .line 12
    sget-object v0, Lcom/bumptech/glide/Priority;->c:Lcom/bumptech/glide/Priority;

    .line 13
    .line 14
    iput-object v0, p0, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lx0/a;->i:Z

    .line 18
    .line 19
    const/4 v1, -0x1

    .line 20
    iput v1, p0, Lx0/a;->j:I

    .line 21
    .line 22
    iput v1, p0, Lx0/a;->k:I

    .line 23
    .line 24
    invoke-static {}, La1/a;->c()La1/a;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iput-object v1, p0, Lx0/a;->l:Lf0/b;

    .line 29
    .line 30
    iput-boolean v0, p0, Lx0/a;->n:Z

    .line 31
    .line 32
    new-instance v1, Lf0/d;

    .line 33
    .line 34
    invoke-direct {v1}, Lf0/d;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lx0/a;->q:Lf0/d;

    .line 38
    .line 39
    new-instance v1, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 40
    .line 41
    invoke-direct {v1}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lx0/a;->r:Ljava/util/Map;

    .line 45
    .line 46
    const-class v1, Ljava/lang/Object;

    .line 47
    .line 48
    iput-object v1, p0, Lx0/a;->s:Ljava/lang/Class;

    .line 49
    .line 50
    iput-boolean v0, p0, Lx0/a;->y:Z

    .line 51
    .line 52
    return-void
.end method

.method public static L(II)Z
    .locals 0

    .line 1
    and-int/2addr p0, p1

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    const/4 p0, 0x1

    .line 5
    return p0

    .line 6
    :cond_0
    const/4 p0, 0x0

    .line 7
    return p0
.end method


# virtual methods
.method public final A()F
    .locals 1

    .line 1
    iget v0, p0, Lx0/a;->b:F

    .line 2
    .line 3
    return v0
.end method

.method public final B()Landroid/content/res/Resources$Theme;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->u:Landroid/content/res/Resources$Theme;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->r:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public final E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public final F()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public final G(Lx0/a;)Z
    .locals 2

    .line 1
    iget v0, p1, Lx0/a;->b:F

    .line 2
    .line 3
    iget v1, p0, Lx0/a;->b:F

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget v0, p0, Lx0/a;->f:I

    .line 12
    .line 13
    iget v1, p1, Lx0/a;->f:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    iget-object v1, p1, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lb1/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget v0, p0, Lx0/a;->h:I

    .line 28
    .line 29
    iget v1, p1, Lx0/a;->h:I

    .line 30
    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    iget-object v0, p0, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    iget-object v1, p1, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lb1/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget v0, p0, Lx0/a;->p:I

    .line 44
    .line 45
    iget v1, p1, Lx0/a;->p:I

    .line 46
    .line 47
    if-ne v0, v1, :cond_0

    .line 48
    .line 49
    iget-object v0, p0, Lx0/a;->o:Landroid/graphics/drawable/Drawable;

    .line 50
    .line 51
    iget-object v1, p1, Lx0/a;->o:Landroid/graphics/drawable/Drawable;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lb1/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    iget-boolean v0, p0, Lx0/a;->i:Z

    .line 60
    .line 61
    iget-boolean v1, p1, Lx0/a;->i:Z

    .line 62
    .line 63
    if-ne v0, v1, :cond_0

    .line 64
    .line 65
    iget v0, p0, Lx0/a;->j:I

    .line 66
    .line 67
    iget v1, p1, Lx0/a;->j:I

    .line 68
    .line 69
    if-ne v0, v1, :cond_0

    .line 70
    .line 71
    iget v0, p0, Lx0/a;->k:I

    .line 72
    .line 73
    iget v1, p1, Lx0/a;->k:I

    .line 74
    .line 75
    if-ne v0, v1, :cond_0

    .line 76
    .line 77
    iget-boolean v0, p0, Lx0/a;->m:Z

    .line 78
    .line 79
    iget-boolean v1, p1, Lx0/a;->m:Z

    .line 80
    .line 81
    if-ne v0, v1, :cond_0

    .line 82
    .line 83
    iget-boolean v0, p0, Lx0/a;->n:Z

    .line 84
    .line 85
    iget-boolean v1, p1, Lx0/a;->n:Z

    .line 86
    .line 87
    if-ne v0, v1, :cond_0

    .line 88
    .line 89
    iget-boolean v0, p0, Lx0/a;->w:Z

    .line 90
    .line 91
    iget-boolean v1, p1, Lx0/a;->w:Z

    .line 92
    .line 93
    if-ne v0, v1, :cond_0

    .line 94
    .line 95
    iget-boolean v0, p0, Lx0/a;->x:Z

    .line 96
    .line 97
    iget-boolean v1, p1, Lx0/a;->x:Z

    .line 98
    .line 99
    if-ne v0, v1, :cond_0

    .line 100
    .line 101
    iget-object v0, p0, Lx0/a;->c:Lh0/c;

    .line 102
    .line 103
    iget-object v1, p1, Lx0/a;->c:Lh0/c;

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_0

    .line 110
    .line 111
    iget-object v0, p0, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 112
    .line 113
    iget-object v1, p1, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 114
    .line 115
    if-ne v0, v1, :cond_0

    .line 116
    .line 117
    iget-object v0, p0, Lx0/a;->q:Lf0/d;

    .line 118
    .line 119
    iget-object v1, p1, Lx0/a;->q:Lf0/d;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Lf0/d;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_0

    .line 126
    .line 127
    iget-object v0, p0, Lx0/a;->r:Ljava/util/Map;

    .line 128
    .line 129
    iget-object v1, p1, Lx0/a;->r:Ljava/util/Map;

    .line 130
    .line 131
    invoke-interface {v0, v1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_0

    .line 136
    .line 137
    iget-object v0, p0, Lx0/a;->s:Ljava/lang/Class;

    .line 138
    .line 139
    iget-object v1, p1, Lx0/a;->s:Ljava/lang/Class;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_0

    .line 146
    .line 147
    iget-object v0, p0, Lx0/a;->l:Lf0/b;

    .line 148
    .line 149
    iget-object v1, p1, Lx0/a;->l:Lf0/b;

    .line 150
    .line 151
    invoke-static {v0, v1}, Lb1/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-eqz v0, :cond_0

    .line 156
    .line 157
    iget-object v0, p0, Lx0/a;->u:Landroid/content/res/Resources$Theme;

    .line 158
    .line 159
    iget-object p1, p1, Lx0/a;->u:Landroid/content/res/Resources$Theme;

    .line 160
    .line 161
    invoke-static {v0, p1}, Lb1/k;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_0

    .line 166
    .line 167
    const/4 p1, 0x1

    .line 168
    return p1

    .line 169
    :cond_0
    const/4 p1, 0x0

    .line 170
    return p1
.end method

.method public final H()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final I()Z
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lx0/a;->K(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public J()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->y:Z

    .line 2
    .line 3
    return v0
.end method

.method public final K(I)Z
    .locals 1

    .line 1
    iget v0, p0, Lx0/a;->a:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Lx0/a;->L(II)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final M()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public final N()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public final O()Z
    .locals 1

    .line 1
    const/16 v0, 0x800

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lx0/a;->K(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final P()Z
    .locals 2

    .line 1
    iget v0, p0, Lx0/a;->k:I

    .line 2
    .line 3
    iget v1, p0, Lx0/a;->j:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lb1/k;->t(II)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public Q()Lx0/a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx0/a;->t:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lx0/a;->a0()Lx0/a;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public R()Lx0/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 2
    .line 3
    new-instance v1, Lo0/j;

    .line 4
    .line 5
    invoke-direct {v1}, Lo0/j;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lx0/a;->V(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public S()Lx0/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->d:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 2
    .line 3
    new-instance v1, Lo0/k;

    .line 4
    .line 5
    invoke-direct {v1}, Lo0/k;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lx0/a;->U(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public T()Lx0/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->c:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 2
    .line 3
    new-instance v1, Lo0/s;

    .line 4
    .line 5
    invoke-direct {v1}, Lo0/s;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lx0/a;->U(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final U(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Lx0/a;->Z(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;Z)Lx0/a;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public final V(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lx0/a;->V(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lx0/a;->k(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Lx0/a;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p2, p1}, Lx0/a;->i0(Lf0/g;Z)Lx0/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method

.method public W(II)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lx0/a;->W(II)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput p1, p0, Lx0/a;->k:I

    .line 15
    .line 16
    iput p2, p0, Lx0/a;->j:I

    .line 17
    .line 18
    iget p1, p0, Lx0/a;->a:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x200

    .line 21
    .line 22
    iput p1, p0, Lx0/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public X(I)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->X(I)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput p1, p0, Lx0/a;->h:I

    .line 15
    .line 16
    iget p1, p0, Lx0/a;->a:I

    .line 17
    .line 18
    or-int/lit16 p1, p1, 0x80

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    and-int/lit8 p1, p1, -0x41

    .line 24
    .line 25
    iput p1, p0, Lx0/a;->a:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public Y(Lcom/bumptech/glide/Priority;)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->Y(Lcom/bumptech/glide/Priority;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/bumptech/glide/Priority;

    .line 19
    .line 20
    iput-object p1, p0, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 21
    .line 22
    iget p1, p0, Lx0/a;->a:I

    .line 23
    .line 24
    or-int/lit8 p1, p1, 0x8

    .line 25
    .line 26
    iput p1, p0, Lx0/a;->a:I

    .line 27
    .line 28
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public final Z(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;Z)Lx0/a;
    .locals 0

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lx0/a;->g0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lx0/a;->V(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    const/4 p2, 0x1

    .line 13
    iput-boolean p2, p1, Lx0/a;->y:Z

    .line 14
    .line 15
    return-object p1
.end method

.method public final a0()Lx0/a;
    .locals 0

    .line 1
    return-object p0
.end method

.method public b(Lx0/a;)Lx0/a;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->b(Lx0/a;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget v0, p1, Lx0/a;->a:I

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    invoke-static {v0, v1}, Lx0/a;->L(II)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget v0, p1, Lx0/a;->b:F

    .line 24
    .line 25
    iput v0, p0, Lx0/a;->b:F

    .line 26
    .line 27
    :cond_1
    iget v0, p1, Lx0/a;->a:I

    .line 28
    .line 29
    const/high16 v1, 0x40000

    .line 30
    .line 31
    invoke-static {v0, v1}, Lx0/a;->L(II)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-boolean v0, p1, Lx0/a;->w:Z

    .line 38
    .line 39
    iput-boolean v0, p0, Lx0/a;->w:Z

    .line 40
    .line 41
    :cond_2
    iget v0, p1, Lx0/a;->a:I

    .line 42
    .line 43
    const/high16 v1, 0x100000

    .line 44
    .line 45
    invoke-static {v0, v1}, Lx0/a;->L(II)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-boolean v0, p1, Lx0/a;->z:Z

    .line 52
    .line 53
    iput-boolean v0, p0, Lx0/a;->z:Z

    .line 54
    .line 55
    :cond_3
    iget v0, p1, Lx0/a;->a:I

    .line 56
    .line 57
    const/4 v1, 0x4

    .line 58
    invoke-static {v0, v1}, Lx0/a;->L(II)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p1, Lx0/a;->c:Lh0/c;

    .line 65
    .line 66
    iput-object v0, p0, Lx0/a;->c:Lh0/c;

    .line 67
    .line 68
    :cond_4
    iget v0, p1, Lx0/a;->a:I

    .line 69
    .line 70
    const/16 v1, 0x8

    .line 71
    .line 72
    invoke-static {v0, v1}, Lx0/a;->L(II)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object v0, p1, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 79
    .line 80
    iput-object v0, p0, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 81
    .line 82
    :cond_5
    iget v0, p1, Lx0/a;->a:I

    .line 83
    .line 84
    const/16 v1, 0x10

    .line 85
    .line 86
    invoke-static {v0, v1}, Lx0/a;->L(II)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x0

    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    iget-object v0, p1, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    iput-object v0, p0, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 96
    .line 97
    iput v1, p0, Lx0/a;->f:I

    .line 98
    .line 99
    iget v0, p0, Lx0/a;->a:I

    .line 100
    .line 101
    and-int/lit8 v0, v0, -0x21

    .line 102
    .line 103
    iput v0, p0, Lx0/a;->a:I

    .line 104
    .line 105
    :cond_6
    iget v0, p1, Lx0/a;->a:I

    .line 106
    .line 107
    const/16 v2, 0x20

    .line 108
    .line 109
    invoke-static {v0, v2}, Lx0/a;->L(II)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const/4 v2, 0x0

    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    iget v0, p1, Lx0/a;->f:I

    .line 117
    .line 118
    iput v0, p0, Lx0/a;->f:I

    .line 119
    .line 120
    iput-object v2, p0, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 121
    .line 122
    iget v0, p0, Lx0/a;->a:I

    .line 123
    .line 124
    and-int/lit8 v0, v0, -0x11

    .line 125
    .line 126
    iput v0, p0, Lx0/a;->a:I

    .line 127
    .line 128
    :cond_7
    iget v0, p1, Lx0/a;->a:I

    .line 129
    .line 130
    const/16 v3, 0x40

    .line 131
    .line 132
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_8

    .line 137
    .line 138
    iget-object v0, p1, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 139
    .line 140
    iput-object v0, p0, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    iput v1, p0, Lx0/a;->h:I

    .line 143
    .line 144
    iget v0, p0, Lx0/a;->a:I

    .line 145
    .line 146
    and-int/lit16 v0, v0, -0x81

    .line 147
    .line 148
    iput v0, p0, Lx0/a;->a:I

    .line 149
    .line 150
    :cond_8
    iget v0, p1, Lx0/a;->a:I

    .line 151
    .line 152
    const/16 v3, 0x80

    .line 153
    .line 154
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_9

    .line 159
    .line 160
    iget v0, p1, Lx0/a;->h:I

    .line 161
    .line 162
    iput v0, p0, Lx0/a;->h:I

    .line 163
    .line 164
    iput-object v2, p0, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 165
    .line 166
    iget v0, p0, Lx0/a;->a:I

    .line 167
    .line 168
    and-int/lit8 v0, v0, -0x41

    .line 169
    .line 170
    iput v0, p0, Lx0/a;->a:I

    .line 171
    .line 172
    :cond_9
    iget v0, p1, Lx0/a;->a:I

    .line 173
    .line 174
    const/16 v3, 0x100

    .line 175
    .line 176
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    if-eqz v0, :cond_a

    .line 181
    .line 182
    iget-boolean v0, p1, Lx0/a;->i:Z

    .line 183
    .line 184
    iput-boolean v0, p0, Lx0/a;->i:Z

    .line 185
    .line 186
    :cond_a
    iget v0, p1, Lx0/a;->a:I

    .line 187
    .line 188
    const/16 v3, 0x200

    .line 189
    .line 190
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_b

    .line 195
    .line 196
    iget v0, p1, Lx0/a;->k:I

    .line 197
    .line 198
    iput v0, p0, Lx0/a;->k:I

    .line 199
    .line 200
    iget v0, p1, Lx0/a;->j:I

    .line 201
    .line 202
    iput v0, p0, Lx0/a;->j:I

    .line 203
    .line 204
    :cond_b
    iget v0, p1, Lx0/a;->a:I

    .line 205
    .line 206
    const/16 v3, 0x400

    .line 207
    .line 208
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_c

    .line 213
    .line 214
    iget-object v0, p1, Lx0/a;->l:Lf0/b;

    .line 215
    .line 216
    iput-object v0, p0, Lx0/a;->l:Lf0/b;

    .line 217
    .line 218
    :cond_c
    iget v0, p1, Lx0/a;->a:I

    .line 219
    .line 220
    const/16 v3, 0x1000

    .line 221
    .line 222
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_d

    .line 227
    .line 228
    iget-object v0, p1, Lx0/a;->s:Ljava/lang/Class;

    .line 229
    .line 230
    iput-object v0, p0, Lx0/a;->s:Ljava/lang/Class;

    .line 231
    .line 232
    :cond_d
    iget v0, p1, Lx0/a;->a:I

    .line 233
    .line 234
    const/16 v3, 0x2000

    .line 235
    .line 236
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 237
    .line 238
    .line 239
    move-result v0

    .line 240
    if-eqz v0, :cond_e

    .line 241
    .line 242
    iget-object v0, p1, Lx0/a;->o:Landroid/graphics/drawable/Drawable;

    .line 243
    .line 244
    iput-object v0, p0, Lx0/a;->o:Landroid/graphics/drawable/Drawable;

    .line 245
    .line 246
    iput v1, p0, Lx0/a;->p:I

    .line 247
    .line 248
    iget v0, p0, Lx0/a;->a:I

    .line 249
    .line 250
    and-int/lit16 v0, v0, -0x4001

    .line 251
    .line 252
    iput v0, p0, Lx0/a;->a:I

    .line 253
    .line 254
    :cond_e
    iget v0, p1, Lx0/a;->a:I

    .line 255
    .line 256
    const/16 v3, 0x4000

    .line 257
    .line 258
    invoke-static {v0, v3}, Lx0/a;->L(II)Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_f

    .line 263
    .line 264
    iget v0, p1, Lx0/a;->p:I

    .line 265
    .line 266
    iput v0, p0, Lx0/a;->p:I

    .line 267
    .line 268
    iput-object v2, p0, Lx0/a;->o:Landroid/graphics/drawable/Drawable;

    .line 269
    .line 270
    iget v0, p0, Lx0/a;->a:I

    .line 271
    .line 272
    and-int/lit16 v0, v0, -0x2001

    .line 273
    .line 274
    iput v0, p0, Lx0/a;->a:I

    .line 275
    .line 276
    :cond_f
    iget v0, p1, Lx0/a;->a:I

    .line 277
    .line 278
    const v2, 0x8000

    .line 279
    .line 280
    .line 281
    invoke-static {v0, v2}, Lx0/a;->L(II)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_10

    .line 286
    .line 287
    iget-object v0, p1, Lx0/a;->u:Landroid/content/res/Resources$Theme;

    .line 288
    .line 289
    iput-object v0, p0, Lx0/a;->u:Landroid/content/res/Resources$Theme;

    .line 290
    .line 291
    :cond_10
    iget v0, p1, Lx0/a;->a:I

    .line 292
    .line 293
    const/high16 v2, 0x10000

    .line 294
    .line 295
    invoke-static {v0, v2}, Lx0/a;->L(II)Z

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    if-eqz v0, :cond_11

    .line 300
    .line 301
    iget-boolean v0, p1, Lx0/a;->n:Z

    .line 302
    .line 303
    iput-boolean v0, p0, Lx0/a;->n:Z

    .line 304
    .line 305
    :cond_11
    iget v0, p1, Lx0/a;->a:I

    .line 306
    .line 307
    const/high16 v2, 0x20000

    .line 308
    .line 309
    invoke-static {v0, v2}, Lx0/a;->L(II)Z

    .line 310
    .line 311
    .line 312
    move-result v0

    .line 313
    if-eqz v0, :cond_12

    .line 314
    .line 315
    iget-boolean v0, p1, Lx0/a;->m:Z

    .line 316
    .line 317
    iput-boolean v0, p0, Lx0/a;->m:Z

    .line 318
    .line 319
    :cond_12
    iget v0, p1, Lx0/a;->a:I

    .line 320
    .line 321
    const/16 v2, 0x800

    .line 322
    .line 323
    invoke-static {v0, v2}, Lx0/a;->L(II)Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-eqz v0, :cond_13

    .line 328
    .line 329
    iget-object v0, p0, Lx0/a;->r:Ljava/util/Map;

    .line 330
    .line 331
    iget-object v2, p1, Lx0/a;->r:Ljava/util/Map;

    .line 332
    .line 333
    invoke-interface {v0, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 334
    .line 335
    .line 336
    iget-boolean v0, p1, Lx0/a;->y:Z

    .line 337
    .line 338
    iput-boolean v0, p0, Lx0/a;->y:Z

    .line 339
    .line 340
    :cond_13
    iget v0, p1, Lx0/a;->a:I

    .line 341
    .line 342
    const/high16 v2, 0x80000

    .line 343
    .line 344
    invoke-static {v0, v2}, Lx0/a;->L(II)Z

    .line 345
    .line 346
    .line 347
    move-result v0

    .line 348
    if-eqz v0, :cond_14

    .line 349
    .line 350
    iget-boolean v0, p1, Lx0/a;->x:Z

    .line 351
    .line 352
    iput-boolean v0, p0, Lx0/a;->x:Z

    .line 353
    .line 354
    :cond_14
    iget-boolean v0, p0, Lx0/a;->n:Z

    .line 355
    .line 356
    if-nez v0, :cond_15

    .line 357
    .line 358
    iget-object v0, p0, Lx0/a;->r:Ljava/util/Map;

    .line 359
    .line 360
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 361
    .line 362
    .line 363
    iget v0, p0, Lx0/a;->a:I

    .line 364
    .line 365
    iput-boolean v1, p0, Lx0/a;->m:Z

    .line 366
    .line 367
    const v1, -0x20801

    .line 368
    .line 369
    .line 370
    and-int/2addr v0, v1

    .line 371
    iput v0, p0, Lx0/a;->a:I

    .line 372
    .line 373
    const/4 v0, 0x1

    .line 374
    iput-boolean v0, p0, Lx0/a;->y:Z

    .line 375
    .line 376
    :cond_15
    iget v0, p0, Lx0/a;->a:I

    .line 377
    .line 378
    iget v1, p1, Lx0/a;->a:I

    .line 379
    .line 380
    or-int/2addr v0, v1

    .line 381
    iput v0, p0, Lx0/a;->a:I

    .line 382
    .line 383
    iget-object v0, p0, Lx0/a;->q:Lf0/d;

    .line 384
    .line 385
    iget-object p1, p1, Lx0/a;->q:Lf0/d;

    .line 386
    .line 387
    invoke-virtual {v0, p1}, Lf0/d;->d(Lf0/d;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 391
    .line 392
    .line 393
    move-result-object p1

    .line 394
    return-object p1
.end method

.method public final b0()Lx0/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx0/a;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->a0()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "You cannot modify locked T, consider clone()"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method public c0(Lf0/c;Ljava/lang/Object;)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lx0/a;->c0(Lf0/c;Ljava/lang/Object;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lx0/a;->q:Lf0/d;

    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lf0/d;->e(Lf0/c;Ljava/lang/Object;)Lf0/d;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public d()Lx0/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx0/a;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "You cannot auto lock an already locked options object, try clone() first"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lx0/a;->v:Z

    .line 20
    .line 21
    invoke-virtual {p0}, Lx0/a;->Q()Lx0/a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public d0(Lf0/b;)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->d0(Lf0/b;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lf0/b;

    .line 19
    .line 20
    iput-object p1, p0, Lx0/a;->l:Lf0/b;

    .line 21
    .line 22
    iget p1, p0, Lx0/a;->a:I

    .line 23
    .line 24
    or-int/lit16 p1, p1, 0x400

    .line 25
    .line 26
    iput p1, p0, Lx0/a;->a:I

    .line 27
    .line 28
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public e()Lx0/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->e:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 2
    .line 3
    new-instance v1, Lo0/j;

    .line 4
    .line 5
    invoke-direct {v1}, Lo0/j;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lx0/a;->g0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public e0(F)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->e0(F)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    cmpg-float v0, p1, v0

    .line 16
    .line 17
    if-ltz v0, :cond_1

    .line 18
    .line 19
    const/high16 v0, 0x3f800000    # 1.0f

    .line 20
    .line 21
    cmpl-float v0, p1, v0

    .line 22
    .line 23
    if-gtz v0, :cond_1

    .line 24
    .line 25
    iput p1, p0, Lx0/a;->b:F

    .line 26
    .line 27
    iget p1, p0, Lx0/a;->a:I

    .line 28
    .line 29
    or-int/lit8 p1, p1, 0x2

    .line 30
    .line 31
    iput p1, p0, Lx0/a;->a:I

    .line 32
    .line 33
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v0, "sizeMultiplier must be between 0 and 1"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lx0/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lx0/a;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lx0/a;->G(Lx0/a;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return p1
.end method

.method public f()Lx0/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->d:Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;

    .line 2
    .line 3
    new-instance v1, Lo0/l;

    .line 4
    .line 5
    invoke-direct {v1}, Lo0/l;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Lx0/a;->g0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public f0(Z)Lx0/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, v1}, Lx0/a;->f0(Z)Lx0/a;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    xor-int/2addr p1, v1

    .line 16
    iput-boolean p1, p0, Lx0/a;->i:Z

    .line 17
    .line 18
    iget p1, p0, Lx0/a;->a:I

    .line 19
    .line 20
    or-int/lit16 p1, p1, 0x100

    .line 21
    .line 22
    iput p1, p0, Lx0/a;->a:I

    .line 23
    .line 24
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final g0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lx0/a;->g0(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;Lf0/g;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Lx0/a;->k(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Lx0/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p2}, Lx0/a;->h0(Lf0/g;)Lx0/a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1
.end method

.method public h()Lx0/a;
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lx0/a;

    .line 6
    .line 7
    new-instance v1, Lf0/d;

    .line 8
    .line 9
    invoke-direct {v1}, Lf0/d;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lx0/a;->q:Lf0/d;

    .line 13
    .line 14
    iget-object v2, p0, Lx0/a;->q:Lf0/d;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Lf0/d;->d(Lf0/d;)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;

    .line 20
    .line 21
    invoke-direct {v1}, Lcom/bumptech/glide/util/CachedHashCodeArrayMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lx0/a;->r:Ljava/util/Map;

    .line 25
    .line 26
    iget-object v2, p0, Lx0/a;->r:Ljava/util/Map;

    .line 27
    .line 28
    invoke-interface {v1, v2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, v0, Lx0/a;->t:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Lx0/a;->v:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    return-object v0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    new-instance v1, Ljava/lang/RuntimeException;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    throw v1
.end method

.method public h0(Lf0/g;)Lx0/a;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lx0/a;->i0(Lf0/g;Z)Lx0/a;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    return-object p1
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lx0/a;->b:F

    .line 2
    .line 3
    invoke-static {v0}, Lb1/k;->l(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lx0/a;->f:I

    .line 8
    .line 9
    invoke-static {v1, v0}, Lb1/k;->n(II)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget v1, p0, Lx0/a;->h:I

    .line 20
    .line 21
    invoke-static {v1, v0}, Lb1/k;->n(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v1, p0, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget v1, p0, Lx0/a;->p:I

    .line 32
    .line 33
    invoke-static {v1, v0}, Lb1/k;->n(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-object v1, p0, Lx0/a;->o:Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget-boolean v1, p0, Lx0/a;->i:Z

    .line 44
    .line 45
    invoke-static {v1, v0}, Lb1/k;->p(ZI)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v1, p0, Lx0/a;->j:I

    .line 50
    .line 51
    invoke-static {v1, v0}, Lb1/k;->n(II)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v1, p0, Lx0/a;->k:I

    .line 56
    .line 57
    invoke-static {v1, v0}, Lb1/k;->n(II)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-boolean v1, p0, Lx0/a;->m:Z

    .line 62
    .line 63
    invoke-static {v1, v0}, Lb1/k;->p(ZI)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-boolean v1, p0, Lx0/a;->n:Z

    .line 68
    .line 69
    invoke-static {v1, v0}, Lb1/k;->p(ZI)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget-boolean v1, p0, Lx0/a;->w:Z

    .line 74
    .line 75
    invoke-static {v1, v0}, Lb1/k;->p(ZI)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iget-boolean v1, p0, Lx0/a;->x:Z

    .line 80
    .line 81
    invoke-static {v1, v0}, Lb1/k;->p(ZI)I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    iget-object v1, p0, Lx0/a;->c:Lh0/c;

    .line 86
    .line 87
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object v1, p0, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 92
    .line 93
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    iget-object v1, p0, Lx0/a;->q:Lf0/d;

    .line 98
    .line 99
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    iget-object v1, p0, Lx0/a;->r:Ljava/util/Map;

    .line 104
    .line 105
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget-object v1, p0, Lx0/a;->s:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    iget-object v1, p0, Lx0/a;->l:Lf0/b;

    .line 116
    .line 117
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iget-object v1, p0, Lx0/a;->u:Landroid/content/res/Resources$Theme;

    .line 122
    .line 123
    invoke-static {v1, v0}, Lb1/k;->o(Ljava/lang/Object;I)I

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    return v0
.end method

.method public i(Ljava/lang/Class;)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->i(Ljava/lang/Class;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Class;

    .line 19
    .line 20
    iput-object p1, p0, Lx0/a;->s:Ljava/lang/Class;

    .line 21
    .line 22
    iget p1, p0, Lx0/a;->a:I

    .line 23
    .line 24
    or-int/lit16 p1, p1, 0x1000

    .line 25
    .line 26
    iput p1, p0, Lx0/a;->a:I

    .line 27
    .line 28
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public i0(Lf0/g;Z)Lx0/a;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2}, Lx0/a;->i0(Lf0/g;Z)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance v0, Lo0/q;

    .line 15
    .line 16
    invoke-direct {v0, p1, p2}, Lo0/q;-><init>(Lf0/g;Z)V

    .line 17
    .line 18
    .line 19
    const-class v1, Landroid/graphics/Bitmap;

    .line 20
    .line 21
    invoke-virtual {p0, v1, p1, p2}, Lx0/a;->j0(Ljava/lang/Class;Lf0/g;Z)Lx0/a;

    .line 22
    .line 23
    .line 24
    const-class v1, Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    invoke-virtual {p0, v1, v0, p2}, Lx0/a;->j0(Ljava/lang/Class;Lf0/g;Z)Lx0/a;

    .line 27
    .line 28
    .line 29
    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    .line 30
    .line 31
    invoke-virtual {v0}, Lo0/q;->c()Lf0/g;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v1, v0, p2}, Lx0/a;->j0(Ljava/lang/Class;Lf0/g;Z)Lx0/a;

    .line 36
    .line 37
    .line 38
    new-instance v0, Ls0/e;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Ls0/e;-><init>(Lf0/g;)V

    .line 41
    .line 42
    .line 43
    const-class p1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 44
    .line 45
    invoke-virtual {p0, p1, v0, p2}, Lx0/a;->j0(Ljava/lang/Class;Lf0/g;Z)Lx0/a;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    return-object p1
.end method

.method public j(Lh0/c;)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->j(Lh0/c;)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lh0/c;

    .line 19
    .line 20
    iput-object p1, p0, Lx0/a;->c:Lh0/c;

    .line 21
    .line 22
    iget p1, p0, Lx0/a;->a:I

    .line 23
    .line 24
    or-int/lit8 p1, p1, 0x4

    .line 25
    .line 26
    iput p1, p0, Lx0/a;->a:I

    .line 27
    .line 28
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1
.end method

.method public j0(Ljava/lang/Class;Lf0/g;Z)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1, p2, p3}, Lx0/a;->j0(Ljava/lang/Class;Lf0/g;Z)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {p2}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lx0/a;->r:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lx0/a;->a:I

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    iput-boolean p2, p0, Lx0/a;->n:Z

    .line 29
    .line 30
    const v0, 0x10800

    .line 31
    .line 32
    .line 33
    or-int/2addr v0, p1

    .line 34
    iput v0, p0, Lx0/a;->a:I

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Lx0/a;->y:Z

    .line 38
    .line 39
    if-eqz p3, :cond_1

    .line 40
    .line 41
    const p3, 0x30800

    .line 42
    .line 43
    .line 44
    or-int/2addr p1, p3

    .line 45
    iput p1, p0, Lx0/a;->a:I

    .line 46
    .line 47
    iput-boolean p2, p0, Lx0/a;->m:Z

    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    return-object p1
.end method

.method public k(Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;)Lx0/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/DownsampleStrategy;->h:Lf0/c;

    .line 2
    .line 3
    invoke-static {p1}, Lb1/j;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, v0, p1}, Lx0/a;->c0(Lf0/c;Ljava/lang/Object;)Lx0/a;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public k0(Z)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->k0(Z)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput-boolean p1, p0, Lx0/a;->z:Z

    .line 15
    .line 16
    iget p1, p0, Lx0/a;->a:I

    .line 17
    .line 18
    const/high16 v0, 0x100000

    .line 19
    .line 20
    or-int/2addr p1, v0

    .line 21
    iput p1, p0, Lx0/a;->a:I

    .line 22
    .line 23
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public l(I)Lx0/a;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->v:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lx0/a;->h()Lx0/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Lx0/a;->l(I)Lx0/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    iput p1, p0, Lx0/a;->f:I

    .line 15
    .line 16
    iget p1, p0, Lx0/a;->a:I

    .line 17
    .line 18
    or-int/lit8 p1, p1, 0x20

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    and-int/lit8 p1, p1, -0x11

    .line 24
    .line 25
    iput p1, p0, Lx0/a;->a:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lx0/a;->b0()Lx0/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method

.method public final m()Lh0/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->c:Lh0/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()I
    .locals 1

    .line 1
    iget v0, p0, Lx0/a;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final o()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->e:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->o:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()I
    .locals 1

    .line 1
    iget v0, p0, Lx0/a;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final r()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lx0/a;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public final s()Lf0/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->q:Lf0/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()I
    .locals 1

    .line 1
    iget v0, p0, Lx0/a;->j:I

    .line 2
    .line 3
    return v0
.end method

.method public final u()I
    .locals 1

    .line 1
    iget v0, p0, Lx0/a;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final v()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->g:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()I
    .locals 1

    .line 1
    iget v0, p0, Lx0/a;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public final x()Lcom/bumptech/glide/Priority;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->d:Lcom/bumptech/glide/Priority;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y()Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->s:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Lf0/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lx0/a;->l:Lf0/b;

    .line 2
    .line 3
    return-object v0
.end method
