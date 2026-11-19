.class public La9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:F

.field public d:J

.field public e:J

.field public f:Lz8/f;

.field public g:Lz8/f;

.field public h:Lz8/f;

.field public i:Lz8/l;

.field public j:Lz8/m;

.field public k:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, La9/c;->a:I

    .line 6
    .line 7
    iput v0, p0, La9/c;->b:I

    .line 8
    .line 9
    const/high16 v0, 0x3f800000    # 1.0f

    .line 10
    .line 11
    iput v0, p0, La9/c;->c:F

    .line 12
    .line 13
    const-wide/16 v0, 0xed8

    .line 14
    .line 15
    iput-wide v0, p0, La9/c;->d:J

    .line 16
    .line 17
    const-wide/16 v0, 0xfa0

    .line 18
    .line 19
    iput-wide v0, p0, La9/c;->e:J

    .line 20
    .line 21
    new-instance v0, La9/d;

    .line 22
    .line 23
    invoke-direct {v0}, La9/d;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La9/c;->i:Lz8/l;

    .line 27
    .line 28
    return-void
.end method

.method public static a()La9/c;
    .locals 1

    .line 1
    new-instance v0, La9/c;

    .line 2
    .line 3
    invoke-direct {v0}, La9/c;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static f(Lz8/c;[[FFF)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lz8/c;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-ne v0, v1, :cond_2

    .line 7
    .line 8
    array-length v0, p1

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    aget-object v1, p1, v0

    .line 13
    .line 14
    array-length v1, v1

    .line 15
    const/4 v2, 0x2

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    move v1, v0

    .line 20
    :goto_0
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_1

    .line 22
    .line 23
    aget-object v2, p1, v1

    .line 24
    .line 25
    aget v3, v2, v0

    .line 26
    .line 27
    mul-float/2addr v3, p2

    .line 28
    aput v3, v2, v0

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    aget v4, v2, v3

    .line 32
    .line 33
    mul-float/2addr v4, p3

    .line 34
    aput v4, v2, v3

    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    check-cast p0, Lz8/q;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lz8/q;->E([[F)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public b(I)Lz8/c;
    .locals 1

    .line 1
    iget-object v0, p0, La9/c;->k:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, La9/c;->e(ILmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Lz8/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(IFFFF)Lz8/c;
    .locals 5

    .line 1
    iget v0, p0, La9/c;->a:I

    .line 2
    .line 3
    iget v1, p0, La9/c;->b:I

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3, p4}, La9/c;->m(FFF)Z

    .line 6
    .line 7
    .line 8
    move-result p4

    .line 9
    iget-object v2, p0, La9/c;->f:Lz8/f;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lz8/f;

    .line 14
    .line 15
    iget-wide v3, p0, La9/c;->d:J

    .line 16
    .line 17
    invoke-direct {v2, v3, v4}, Lz8/f;-><init>(J)V

    .line 18
    .line 19
    .line 20
    iput-object v2, p0, La9/c;->f:Lz8/f;

    .line 21
    .line 22
    invoke-virtual {v2, p5}, Lz8/f;->a(F)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    if-eqz p4, :cond_1

    .line 27
    .line 28
    iget-wide v3, p0, La9/c;->d:J

    .line 29
    .line 30
    invoke-virtual {v2, v3, v4}, Lz8/f;->b(J)V

    .line 31
    .line 32
    .line 33
    :cond_1
    :goto_0
    iget-object p5, p0, La9/c;->g:Lz8/f;

    .line 34
    .line 35
    if-nez p5, :cond_2

    .line 36
    .line 37
    new-instance p5, Lz8/f;

    .line 38
    .line 39
    const-wide/16 v2, 0xed8

    .line 40
    .line 41
    invoke-direct {p5, v2, v3}, Lz8/f;-><init>(J)V

    .line 42
    .line 43
    .line 44
    iput-object p5, p0, La9/c;->g:Lz8/f;

    .line 45
    .line 46
    :cond_2
    if-eqz p4, :cond_4

    .line 47
    .line 48
    const/4 p4, 0x0

    .line 49
    cmpl-float p5, p2, p4

    .line 50
    .line 51
    if-lez p5, :cond_4

    .line 52
    .line 53
    invoke-virtual {p0}, La9/c;->j()V

    .line 54
    .line 55
    .line 56
    if-lez v0, :cond_3

    .line 57
    .line 58
    if-lez v1, :cond_3

    .line 59
    .line 60
    int-to-float p5, v0

    .line 61
    div-float/2addr p2, p5

    .line 62
    int-to-float p5, v1

    .line 63
    div-float p5, p3, p5

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    const/high16 p2, 0x3f800000    # 1.0f

    .line 67
    .line 68
    move p5, p2

    .line 69
    :goto_1
    cmpl-float p3, p3, p4

    .line 70
    .line 71
    if-lez p3, :cond_4

    .line 72
    .line 73
    invoke-virtual {p0, p2, p5}, La9/c;->k(FF)V

    .line 74
    .line 75
    .line 76
    :cond_4
    const/4 p2, 0x1

    .line 77
    if-eq p1, p2, :cond_9

    .line 78
    .line 79
    const/4 p2, 0x4

    .line 80
    if-eq p1, p2, :cond_8

    .line 81
    .line 82
    const/4 p2, 0x5

    .line 83
    if-eq p1, p2, :cond_7

    .line 84
    .line 85
    const/4 p2, 0x6

    .line 86
    if-eq p1, p2, :cond_6

    .line 87
    .line 88
    const/4 p2, 0x7

    .line 89
    if-eq p1, p2, :cond_5

    .line 90
    .line 91
    const/4 p1, 0x0

    .line 92
    return-object p1

    .line 93
    :cond_5
    new-instance p1, Lz8/q;

    .line 94
    .line 95
    invoke-direct {p1}, Lz8/q;-><init>()V

    .line 96
    .line 97
    .line 98
    iget-object p2, p0, La9/c;->i:Lz8/l;

    .line 99
    .line 100
    invoke-interface {p2, p1}, Lz8/l;->e(Lz8/c;)Z

    .line 101
    .line 102
    .line 103
    return-object p1

    .line 104
    :cond_6
    new-instance p1, Lz8/o;

    .line 105
    .line 106
    iget-object p2, p0, La9/c;->f:Lz8/f;

    .line 107
    .line 108
    invoke-direct {p1, p2}, Lz8/o;-><init>(Lz8/f;)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :cond_7
    new-instance p1, Lz8/h;

    .line 113
    .line 114
    iget-object p2, p0, La9/c;->g:Lz8/f;

    .line 115
    .line 116
    invoke-direct {p1, p2}, Lz8/h;-><init>(Lz8/f;)V

    .line 117
    .line 118
    .line 119
    return-object p1

    .line 120
    :cond_8
    new-instance p1, Lz8/g;

    .line 121
    .line 122
    iget-object p2, p0, La9/c;->g:Lz8/f;

    .line 123
    .line 124
    invoke-direct {p1, p2}, Lz8/g;-><init>(Lz8/f;)V

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_9
    new-instance p1, Lz8/p;

    .line 129
    .line 130
    iget-object p2, p0, La9/c;->f:Lz8/f;

    .line 131
    .line 132
    invoke-direct {p1, p2}, Lz8/p;-><init>(Lz8/f;)V

    .line 133
    .line 134
    .line 135
    return-object p1
.end method

.method public d(IIIFF)Lz8/c;
    .locals 6

    .line 1
    int-to-float v2, p2

    .line 2
    int-to-float v3, p3

    .line 3
    move-object v0, p0

    .line 4
    move v1, p1

    .line 5
    move v4, p4

    .line 6
    move v5, p5

    .line 7
    invoke-virtual/range {v0 .. v5}, La9/c;->c(IFFFF)Lz8/c;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public e(ILmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Lz8/c;
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    iput-object p2, p0, La9/c;->k:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 6
    .line 7
    invoke-virtual {p2}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->b()Lz8/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, La9/c;->j:Lz8/m;

    .line 12
    .line 13
    invoke-interface {v0}, Lz8/m;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    iget-object v0, p0, La9/c;->j:Lz8/m;

    .line 18
    .line 19
    invoke-interface {v0}, Lz8/m;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    iget v5, p0, La9/c;->c:F

    .line 24
    .line 25
    iget v6, p2, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->k:F

    .line 26
    .line 27
    move-object v1, p0

    .line 28
    move v2, p1

    .line 29
    invoke-virtual/range {v1 .. v6}, La9/c;->d(IIIFF)Lz8/c;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public g(Lz8/c;FFFFJJFF)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lz8/c;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x7

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    move v0, p2

    .line 10
    move-object p2, p1

    .line 11
    check-cast p2, Lz8/q;

    .line 12
    .line 13
    mul-float/2addr v0, p10

    .line 14
    mul-float/2addr p3, p11

    .line 15
    mul-float/2addr p4, p10

    .line 16
    mul-float/2addr p5, p11

    .line 17
    move-wide p9, p8

    .line 18
    move-wide p7, p6

    .line 19
    move p6, p5

    .line 20
    move p5, p4

    .line 21
    move p4, p3

    .line 22
    move p3, v0

    .line 23
    invoke-virtual/range {p2 .. p10}, Lz8/q;->F(FFFFJJ)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, La9/c;->l(Lz8/c;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public h(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)V
    .locals 1

    .line 1
    iput-object p1, p0, La9/c;->k:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    invoke-virtual {p1}, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->b()Lz8/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, La9/c;->j:Lz8/m;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0, p1}, La9/c;->e(ILmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Lz8/c;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La9/c;->j:Lz8/m;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, La9/c;->b:I

    .line 6
    .line 7
    iput v1, p0, La9/c;->a:I

    .line 8
    .line 9
    iget-object v1, p0, La9/c;->i:Lz8/l;

    .line 10
    .line 11
    invoke-interface {v1}, Lz8/l;->clear()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La9/c;->f:Lz8/f;

    .line 15
    .line 16
    iput-object v0, p0, La9/c;->g:Lz8/f;

    .line 17
    .line 18
    iput-object v0, p0, La9/c;->h:Lz8/f;

    .line 19
    .line 20
    const-wide/16 v0, 0xfa0

    .line 21
    .line 22
    iput-wide v0, p0, La9/c;->e:J

    .line 23
    .line 24
    return-void
.end method

.method public j()V
    .locals 7

    .line 1
    iget-object v0, p0, La9/c;->f:Lz8/f;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-wide v3, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-wide v3, v0, Lz8/f;->c:J

    .line 10
    .line 11
    :goto_0
    iget-object v0, p0, La9/c;->g:Lz8/f;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    move-wide v5, v1

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-wide v5, v0, Lz8/f;->c:J

    .line 18
    .line 19
    :goto_1
    iget-object v0, p0, La9/c;->h:Lz8/f;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_2

    .line 24
    :cond_2
    iget-wide v1, v0, Lz8/f;->c:J

    .line 25
    .line 26
    :goto_2
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    iput-wide v3, p0, La9/c;->e:J

    .line 31
    .line 32
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    iput-wide v0, p0, La9/c;->e:J

    .line 37
    .line 38
    const-wide/16 v2, 0xed8

    .line 39
    .line 40
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide v0

    .line 44
    iput-wide v0, p0, La9/c;->e:J

    .line 45
    .line 46
    iget-wide v2, p0, La9/c;->d:J

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    iput-wide v0, p0, La9/c;->e:J

    .line 53
    .line 54
    return-void
.end method

.method public final k(FF)V
    .locals 13

    .line 1
    iget-object v1, p0, La9/c;->i:Lz8/l;

    .line 2
    .line 3
    invoke-interface {v1}, Lz8/l;->iterator()Lz8/k;

    .line 4
    .line 5
    .line 6
    move-result-object v12

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v12}, Lz8/k;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-interface {v12}, Lz8/k;->next()Lz8/c;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lz8/q;

    .line 18
    .line 19
    iget v2, v1, Lz8/q;->L:F

    .line 20
    .line 21
    iget v3, v1, Lz8/q;->M:F

    .line 22
    .line 23
    iget v4, v1, Lz8/q;->N:F

    .line 24
    .line 25
    iget v5, v1, Lz8/q;->O:F

    .line 26
    .line 27
    iget-wide v6, v1, Lz8/q;->R:J

    .line 28
    .line 29
    iget-wide v8, v1, Lz8/q;->S:J

    .line 30
    .line 31
    move-object v0, p0

    .line 32
    move v10, p1

    .line 33
    move v11, p2

    .line 34
    invoke-virtual/range {v0 .. v11}, La9/c;->g(Lz8/c;FFFFJJFF)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v1, Lz8/q;->Y:[Lz8/q$a;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    array-length v2, v0

    .line 42
    if-lez v2, :cond_0

    .line 43
    .line 44
    array-length v2, v0

    .line 45
    add-int/lit8 v3, v2, 0x1

    .line 46
    .line 47
    const/4 v4, 0x2

    .line 48
    new-array v5, v4, [I

    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    aput v4, v5, v6

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    aput v3, v5, v4

    .line 55
    .line 56
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-static {v3, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    check-cast v3, [[F

    .line 63
    .line 64
    :goto_1
    if-ge v4, v2, :cond_1

    .line 65
    .line 66
    aget-object v5, v0, v4

    .line 67
    .line 68
    invoke-virtual {v5}, Lz8/q$a;->a()[F

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    aput-object v5, v3, v4

    .line 73
    .line 74
    add-int/lit8 v5, v4, 0x1

    .line 75
    .line 76
    aget-object v4, v0, v4

    .line 77
    .line 78
    invoke-virtual {v4}, Lz8/q$a;->c()[F

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    aput-object v4, v3, v5

    .line 83
    .line 84
    move v4, v5

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    invoke-static {v1, v3, p1, p2}, La9/c;->f(Lz8/c;[[FFF)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_2
    return-void
.end method

.method public final l(Lz8/c;)V
    .locals 5

    .line 1
    iget-object v0, p0, La9/c;->h:Lz8/f;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p1, Lz8/c;->q:Lz8/f;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-wide v1, v1, Lz8/f;->c:J

    .line 10
    .line 11
    iget-wide v3, v0, Lz8/f;->c:J

    .line 12
    .line 13
    cmp-long v0, v1, v3

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object p1, p1, Lz8/c;->q:Lz8/f;

    .line 20
    .line 21
    iput-object p1, p0, La9/c;->h:Lz8/f;

    .line 22
    .line 23
    invoke-virtual {p0}, La9/c;->j()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public m(FFF)Z
    .locals 6

    .line 1
    iget v0, p0, La9/c;->a:I

    .line 2
    .line 3
    float-to-int v1, p1

    .line 4
    if-ne v0, v1, :cond_1

    .line 5
    .line 6
    iget v0, p0, La9/c;->b:I

    .line 7
    .line 8
    float-to-int v2, p2

    .line 9
    if-ne v0, v2, :cond_1

    .line 10
    .line 11
    iget v0, p0, La9/c;->c:F

    .line 12
    .line 13
    cmpl-float v0, v0, p3

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    :cond_1
    :goto_0
    mul-float/2addr p1, p3

    .line 21
    const v0, 0x442a8000    # 682.0f

    .line 22
    .line 23
    .line 24
    div-float/2addr p1, v0

    .line 25
    const v0, 0x456d8000    # 3800.0f

    .line 26
    .line 27
    .line 28
    mul-float/2addr p1, v0

    .line 29
    float-to-long v2, p1

    .line 30
    iput-wide v2, p0, La9/c;->d:J

    .line 31
    .line 32
    const-wide/16 v4, 0x2328

    .line 33
    .line 34
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v2

    .line 38
    iput-wide v2, p0, La9/c;->d:J

    .line 39
    .line 40
    const-wide/16 v4, 0xfa0

    .line 41
    .line 42
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    iput-wide v2, p0, La9/c;->d:J

    .line 47
    .line 48
    iput v1, p0, La9/c;->a:I

    .line 49
    .line 50
    float-to-int p1, p2

    .line 51
    iput p1, p0, La9/c;->b:I

    .line 52
    .line 53
    iput p3, p0, La9/c;->c:F

    .line 54
    .line 55
    const/4 p1, 0x1

    .line 56
    return p1
.end method
