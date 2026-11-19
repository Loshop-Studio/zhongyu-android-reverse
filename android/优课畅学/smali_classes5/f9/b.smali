.class public abstract Lf9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lz8/c;Lz8/m;La9/e;)La9/e;
    .locals 7

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    new-instance p2, La9/e;

    .line 4
    .line 5
    invoke-direct {p2}, La9/e;-><init>()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget v0, p0, Lz8/c;->o:F

    .line 9
    .line 10
    float-to-double v0, v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    double-to-int v0, v0

    .line 16
    iget v1, p0, Lz8/c;->p:F

    .line 17
    .line 18
    float-to-double v1, v1

    .line 19
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 20
    .line 21
    .line 22
    move-result-wide v1

    .line 23
    double-to-int v1, v1

    .line 24
    invoke-interface {p1}, Lz8/m;->f()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {p2, v0, v1, v2, v3}, La9/e;->h(IIIZ)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, La9/e;->i()La9/f;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    move-object v1, p1

    .line 39
    check-cast v1, Lz8/a;

    .line 40
    .line 41
    iget-object v3, v0, La9/f;->a:Landroid/graphics/Canvas;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    const/4 v6, 0x1

    .line 45
    const/4 v4, 0x0

    .line 46
    move-object v2, p0

    .line 47
    invoke-virtual/range {v1 .. v6}, Lz8/a;->n(Lz8/c;Ljava/lang/Object;FFZ)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1}, Lz8/m;->isHardwareAccelerated()Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Lz8/m;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-interface {p1}, Lz8/m;->getHeight()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-interface {p1}, Lz8/m;->h()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-interface {p1}, Lz8/m;->k()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {v0, p0, v1, v2, p1}, La9/f;->e(IIII)V

    .line 73
    .line 74
    .line 75
    :cond_1
    return-object p2
.end method

.method public static b(II[F[F)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eq p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 p1, 0x2

    .line 6
    const/4 v1, 0x1

    .line 7
    if-ne p0, v1, :cond_2

    .line 8
    .line 9
    aget p0, p3, v0

    .line 10
    .line 11
    aget p1, p2, p1

    .line 12
    .line 13
    cmpg-float p0, p0, p1

    .line 14
    .line 15
    if-gez p0, :cond_1

    .line 16
    .line 17
    return v1

    .line 18
    :cond_1
    return v0

    .line 19
    :cond_2
    const/4 v2, 0x6

    .line 20
    if-ne p0, v2, :cond_3

    .line 21
    .line 22
    aget p0, p3, p1

    .line 23
    .line 24
    aget p1, p2, v0

    .line 25
    .line 26
    cmpl-float p0, p0, p1

    .line 27
    .line 28
    if-lez p0, :cond_3

    .line 29
    .line 30
    return v1

    .line 31
    :cond_3
    return v0
.end method

.method public static c(Lz8/m;Lz8/c;Lz8/c;J)Z
    .locals 1

    .line 1
    invoke-virtual {p1, p0, p3, p4}, Lz8/c;->h(Lz8/m;J)[F

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2, p0, p3, p4}, Lz8/c;->h(Lz8/m;J)[F

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Lz8/c;->m()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p2}, Lz8/c;->m()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    invoke-static {p1, p2, v0, p0}, Lf9/b;->b(II[F[F)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static final d(Lz8/c;Lz8/c;)I
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 v0, -0x1

    .line 6
    if-nez p0, :cond_1

    .line 7
    .line 8
    return v0

    .line 9
    :cond_1
    const/4 v1, 0x1

    .line 10
    if-nez p1, :cond_2

    .line 11
    .line 12
    return v1

    .line 13
    :cond_2
    invoke-virtual {p0}, Lz8/c;->j()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-virtual {p1}, Lz8/c;->j()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    sub-long/2addr v2, v4

    .line 22
    const-wide/16 v4, 0x0

    .line 23
    .line 24
    cmp-long v2, v2, v4

    .line 25
    .line 26
    if-lez v2, :cond_3

    .line 27
    .line 28
    return v1

    .line 29
    :cond_3
    if-gez v2, :cond_4

    .line 30
    .line 31
    return v0

    .line 32
    :cond_4
    invoke-virtual {p0}, Lz8/c;->m()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p1}, Lz8/c;->m()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sub-int/2addr v2, v3

    .line 41
    if-lez v2, :cond_5

    .line 42
    .line 43
    return v1

    .line 44
    :cond_5
    if-gez v2, :cond_6

    .line 45
    .line 46
    return v0

    .line 47
    :cond_6
    iget-object v2, p0, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 48
    .line 49
    if-nez v2, :cond_7

    .line 50
    .line 51
    return v0

    .line 52
    :cond_7
    iget-object v3, p1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 53
    .line 54
    if-nez v3, :cond_8

    .line 55
    .line 56
    return v1

    .line 57
    :cond_8
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    iget-object v3, p1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 62
    .line 63
    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_9

    .line 72
    .line 73
    return v2

    .line 74
    :cond_9
    iget v2, p0, Lz8/c;->f:I

    .line 75
    .line 76
    iget v3, p1, Lz8/c;->f:I

    .line 77
    .line 78
    sub-int/2addr v2, v3

    .line 79
    if-eqz v2, :cond_b

    .line 80
    .line 81
    if-gez v2, :cond_a

    .line 82
    .line 83
    return v0

    .line 84
    :cond_a
    return v1

    .line 85
    :cond_b
    iget v2, p0, Lz8/c;->r:I

    .line 86
    .line 87
    iget p1, p1, Lz8/c;->r:I

    .line 88
    .line 89
    sub-int/2addr v2, p1

    .line 90
    if-eqz v2, :cond_d

    .line 91
    .line 92
    if-gez v2, :cond_c

    .line 93
    .line 94
    return v0

    .line 95
    :cond_c
    return v1

    .line 96
    :cond_d
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    sub-int/2addr p1, p0

    .line 105
    return p1
.end method

.method public static e(Lz8/c;Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "/n"

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 23
    .line 24
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const/4 v1, -0x1

    .line 29
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    array-length v0, p1

    .line 34
    const/4 v1, 0x1

    .line 35
    if-le v0, v1, :cond_1

    .line 36
    .line 37
    iput-object p1, p0, Lz8/c;->d:[Ljava/lang/String;

    .line 38
    .line 39
    :cond_1
    :goto_0
    return-void
.end method

.method public static f(II)I
    .locals 0

    .line 1
    mul-int/2addr p0, p1

    .line 2
    mul-int/lit8 p0, p0, 0x4

    .line 3
    .line 4
    return p0
.end method

.method public static final g(Lz8/c;Lz8/c;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object p0, p0, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 6
    .line 7
    iget-object p1, p1, Lz8/c;->c:Ljava/lang/CharSequence;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v1

    .line 13
    :cond_1
    if-eqz p0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    return v1

    .line 22
    :cond_2
    return v0
.end method

.method public static h(Lz8/m;Lz8/c;Lz8/c;JJ)Z
    .locals 7

    .line 1
    invoke-virtual {p1}, Lz8/c;->m()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lz8/c;->m()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    return v2

    .line 13
    :cond_0
    invoke-virtual {p1}, Lz8/c;->s()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    return v2

    .line 20
    :cond_1
    invoke-virtual {p2}, Lz8/c;->b()J

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    sub-long/2addr v3, v5

    .line 29
    const-wide/16 v5, 0x0

    .line 30
    .line 31
    cmp-long v1, v3, v5

    .line 32
    .line 33
    const/4 v5, 0x1

    .line 34
    if-gtz v1, :cond_2

    .line 35
    .line 36
    return v5

    .line 37
    :cond_2
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    cmp-long p3, v3, p3

    .line 42
    .line 43
    if-gez p3, :cond_7

    .line 44
    .line 45
    invoke-virtual {p1}, Lz8/c;->w()Z

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    if-nez p3, :cond_7

    .line 50
    .line 51
    invoke-virtual {p2}, Lz8/c;->w()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    const/4 p3, 0x5

    .line 59
    if-eq v0, p3, :cond_6

    .line 60
    .line 61
    const/4 p3, 0x4

    .line 62
    if-ne v0, p3, :cond_4

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    invoke-static {p0, p1, p2, p5, p6}, Lf9/b;->c(Lz8/m;Lz8/c;Lz8/c;J)Z

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    if-nez p3, :cond_6

    .line 70
    .line 71
    invoke-virtual {p1}, Lz8/c;->b()J

    .line 72
    .line 73
    .line 74
    move-result-wide p3

    .line 75
    invoke-virtual {p1}, Lz8/c;->f()J

    .line 76
    .line 77
    .line 78
    move-result-wide p5

    .line 79
    add-long/2addr p3, p5

    .line 80
    invoke-static {p0, p1, p2, p3, p4}, Lf9/b;->c(Lz8/m;Lz8/c;Lz8/c;J)Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    if-eqz p0, :cond_5

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_5
    return v2

    .line 88
    :cond_6
    :goto_0
    return v5

    .line 89
    :cond_7
    :goto_1
    return v2
.end method
