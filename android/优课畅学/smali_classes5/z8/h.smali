.class public Lz8/h;
.super Lz8/c;
.source "SourceFile"


# instance fields
.field public L:F

.field public M:F

.field public N:[F

.field public O:F

.field public P:F

.field public Q:I


# direct methods
.method public constructor <init>(Lz8/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lz8/c;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lz8/h;->L:F

    .line 6
    .line 7
    const/high16 v0, -0x40800000    # -1.0f

    .line 8
    .line 9
    iput v0, p0, Lz8/h;->M:F

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lz8/h;->N:[F

    .line 13
    .line 14
    iput-object p1, p0, Lz8/c;->q:Lz8/f;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public E(Lz8/m;)F
    .locals 2

    .line 1
    iget v0, p0, Lz8/h;->Q:I

    .line 2
    .line 3
    invoke-interface {p1}, Lz8/m;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lz8/h;->P:F

    .line 10
    .line 11
    iget v1, p0, Lz8/c;->o:F

    .line 12
    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget p1, p0, Lz8/h;->O:F

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    invoke-interface {p1}, Lz8/m;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    iget v1, p0, Lz8/c;->o:F

    .line 26
    .line 27
    sub-float/2addr v0, v1

    .line 28
    const/high16 v1, 0x40000000    # 2.0f

    .line 29
    .line 30
    div-float/2addr v0, v1

    .line 31
    invoke-interface {p1}, Lz8/m;->getWidth()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iput p1, p0, Lz8/h;->Q:I

    .line 36
    .line 37
    iget p1, p0, Lz8/c;->o:F

    .line 38
    .line 39
    iput p1, p0, Lz8/h;->P:F

    .line 40
    .line 41
    iput v0, p0, Lz8/h;->O:F

    .line 42
    .line 43
    return v0
.end method

.method public d()F
    .locals 2

    .line 1
    iget v0, p0, Lz8/h;->M:F

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
    iget v0, p0, Lz8/h;->L:F

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
    move-result p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Lz8/h;->E(Lz8/m;)F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p2, p0, Lz8/h;->N:[F

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
    iput-object p2, p0, Lz8/h;->N:[F

    .line 21
    .line 22
    :cond_1
    iget-object p2, p0, Lz8/h;->N:[F

    .line 23
    .line 24
    const/4 p3, 0x0

    .line 25
    aput p1, p2, p3

    .line 26
    .line 27
    iget p3, p0, Lz8/h;->M:F

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
    iget v0, p0, Lz8/h;->L:F

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
    iget v0, p0, Lz8/h;->M:F

    .line 2
    .line 3
    return v0
.end method

.method public m()I
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    return v0
.end method

.method public y(Lz8/m;FF)V
    .locals 4

    .line 1
    iget-object p2, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    if-eqz p2, :cond_1

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
    sub-long/2addr v0, v2

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long p2, v0, v2

    .line 15
    .line 16
    if-lez p2, :cond_0

    .line 17
    .line 18
    iget-object p2, p0, Lz8/c;->q:Lz8/f;

    .line 19
    .line 20
    iget-wide v2, p2, Lz8/f;->c:J

    .line 21
    .line 22
    cmp-long p2, v0, v2

    .line 23
    .line 24
    if-gez p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Lz8/c;->v()Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-nez p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lz8/h;->E(Lz8/m;)F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Lz8/h;->L:F

    .line 37
    .line 38
    iput p3, p0, Lz8/h;->M:F

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    invoke-virtual {p0, p1}, Lz8/c;->D(Z)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    const/4 p2, 0x0

    .line 46
    invoke-virtual {p0, p2}, Lz8/c;->D(Z)V

    .line 47
    .line 48
    .line 49
    const/high16 p2, -0x40800000    # -1.0f

    .line 50
    .line 51
    iput p2, p0, Lz8/h;->M:F

    .line 52
    .line 53
    invoke-interface {p1}, Lz8/m;->getWidth()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    int-to-float p1, p1

    .line 58
    iput p1, p0, Lz8/h;->L:F

    .line 59
    .line 60
    :cond_1
    return-void
.end method
