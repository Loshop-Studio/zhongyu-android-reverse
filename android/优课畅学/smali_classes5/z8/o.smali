.class public Lz8/o;
.super Lz8/p;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lz8/f;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lz8/p;-><init>(Lz8/f;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public E(Lz8/m;J)F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz8/c;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr p2, v0

    .line 6
    iget-object v0, p0, Lz8/c;->q:Lz8/f;

    .line 7
    .line 8
    iget-wide v0, v0, Lz8/f;->c:J

    .line 9
    .line 10
    cmp-long v0, p2, v0

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lz8/m;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    int-to-float p1, p1

    .line 19
    return p1

    .line 20
    :cond_0
    iget p1, p0, Lz8/p;->P:F

    .line 21
    .line 22
    long-to-float p2, p2

    .line 23
    mul-float/2addr p1, p2

    .line 24
    iget p2, p0, Lz8/c;->o:F

    .line 25
    .line 26
    sub-float/2addr p1, p2

    .line 27
    return p1
.end method

.method public d()F
    .locals 2

    .line 1
    iget v0, p0, Lz8/p;->M:F

    .line 2
    .line 3
    iget v1, p0, Lz8/c;->p:F

    .line 4
    .line 5
    add-float/2addr v0, v1

    .line 6
    return v0
.end method

.method public g()F
    .locals 1

    .line 1
    iget v0, p0, Lz8/p;->L:F

    .line 2
    .line 3
    return v0
.end method

.method public h(Lz8/m;J)[F
    .locals 1

    .line 1
    invoke-virtual {p0}, Lz8/c;->q()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lz8/o;->E(Lz8/m;J)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p2, p0, Lz8/p;->O:[F

    .line 14
    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    const/4 p2, 0x4

    .line 18
    new-array p2, p2, [F

    .line 19
    .line 20
    iput-object p2, p0, Lz8/p;->O:[F

    .line 21
    .line 22
    :cond_1
    iget-object p2, p0, Lz8/p;->O:[F

    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    aput p1, p2, p3

    .line 26
    .line 27
    iget p3, p0, Lz8/p;->M:F

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    aput p3, p2, v0

    .line 31
    .line 32
    iget v0, p0, Lz8/c;->o:F

    .line 33
    .line 34
    add-float/2addr p1, v0

    .line 35
    const/4 v0, 0x2

    .line 36
    aput p1, p2, v0

    .line 37
    .line 38
    iget p1, p0, Lz8/c;->p:F

    .line 39
    .line 40
    add-float/2addr p3, p1

    .line 41
    const/4 p1, 0x3

    .line 42
    aput p3, p2, p1

    .line 43
    .line 44
    return-object p2
.end method

.method public i()F
    .locals 2

    .line 1
    iget v0, p0, Lz8/p;->L:F

    .line 2
    .line 3
    iget v1, p0, Lz8/c;->o:F

    .line 4
    .line 5
    add-float/2addr v0, v1

    .line 6
    return v0
.end method

.method public l()F
    .locals 1

    .line 1
    iget v0, p0, Lz8/p;->M:F

    .line 2
    .line 3
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    return v0
.end method

.method public y(Lz8/m;FF)V
    .locals 6

    .line 1
    iget-object p2, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    if-eqz p2, :cond_2

    .line 4
    .line 5
    iget-wide v0, p2, Lz8/e;->a:J

    .line 6
    .line 7
    invoke-virtual {p0}, Lz8/c;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    sub-long v2, v0, v2

    .line 12
    .line 13
    const-wide/16 v4, 0x0

    .line 14
    .line 15
    cmp-long p2, v2, v4

    .line 16
    .line 17
    if-lez p2, :cond_1

    .line 18
    .line 19
    iget-object p2, p0, Lz8/c;->q:Lz8/f;

    .line 20
    .line 21
    iget-wide v4, p2, Lz8/f;->c:J

    .line 22
    .line 23
    cmp-long p2, v2, v4

    .line 24
    .line 25
    if-gez p2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0, v1}, Lz8/o;->E(Lz8/m;J)F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iput p1, p0, Lz8/p;->L:F

    .line 32
    .line 33
    invoke-virtual {p0}, Lz8/c;->v()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_0

    .line 38
    .line 39
    iput p3, p0, Lz8/p;->M:F

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    invoke-virtual {p0, p1}, Lz8/c;->D(Z)V

    .line 43
    .line 44
    .line 45
    :cond_0
    iput-wide v0, p0, Lz8/p;->Q:J

    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    iput-wide v0, p0, Lz8/p;->Q:J

    .line 49
    .line 50
    :cond_2
    const/4 p1, 0x0

    .line 51
    invoke-virtual {p0, p1}, Lz8/c;->D(Z)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
