.class public abstract Lz8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:Ljava/lang/String;

.field public C:Z

.field public D:Lz8/e;

.field public E:I

.field public F:I

.field public G:I

.field public H:Lz8/i;

.field public I:I

.field public J:I

.field public K:Z

.field public a:J

.field public b:J

.field public c:Ljava/lang/CharSequence;

.field public d:[Ljava/lang/String;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:F

.field public h:F

.field public i:I

.field public j:I

.field public k:F

.field public l:I

.field public m:I

.field public n:B

.field public o:F

.field public p:F

.field public q:Lz8/f;

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Lz8/n;

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lz8/c;->j:I

    .line 6
    .line 7
    const/high16 v1, -0x40800000    # -1.0f

    .line 8
    .line 9
    iput v1, p0, Lz8/c;->k:F

    .line 10
    .line 11
    iput v0, p0, Lz8/c;->l:I

    .line 12
    .line 13
    iput v0, p0, Lz8/c;->m:I

    .line 14
    .line 15
    iput-byte v0, p0, Lz8/c;->n:B

    .line 16
    .line 17
    iput v1, p0, Lz8/c;->o:F

    .line 18
    .line 19
    iput v1, p0, Lz8/c;->p:F

    .line 20
    .line 21
    iput v0, p0, Lz8/c;->t:I

    .line 22
    .line 23
    iput v0, p0, Lz8/c;->u:I

    .line 24
    .line 25
    iput v0, p0, Lz8/c;->v:I

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    iput v1, p0, Lz8/c;->w:I

    .line 29
    .line 30
    iput v0, p0, Lz8/c;->A:I

    .line 31
    .line 32
    sget v2, Lz8/b;->a:I

    .line 33
    .line 34
    iput v2, p0, Lz8/c;->E:I

    .line 35
    .line 36
    iput v0, p0, Lz8/c;->F:I

    .line 37
    .line 38
    iput v1, p0, Lz8/c;->G:I

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iput-object v2, p0, Lz8/c;->H:Lz8/i;

    .line 42
    .line 43
    iput v0, p0, Lz8/c;->I:I

    .line 44
    .line 45
    iput v1, p0, Lz8/c;->J:I

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public A(Lz8/m;Z)V
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lz8/m;->l(Lz8/c;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lz8/c;->H:Lz8/i;

    .line 5
    .line 6
    iget p1, p1, Lz8/i;->f:I

    .line 7
    .line 8
    iput p1, p0, Lz8/c;->w:I

    .line 9
    .line 10
    return-void
.end method

.method public B(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lz8/c;->a:J

    .line 2
    .line 3
    const-wide/16 p1, 0x0

    .line 4
    .line 5
    iput-wide p1, p0, Lz8/c;->b:J

    .line 6
    .line 7
    return-void
.end method

.method public C(Lz8/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    return-void
.end method

.method public D(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Lz8/c;->H:Lz8/i;

    .line 4
    .line 5
    iget p1, p1, Lz8/i;->b:I

    .line 6
    .line 7
    iput p1, p0, Lz8/c;->t:I

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput p1, p0, Lz8/c;->s:I

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput p1, p0, Lz8/c;->s:I

    .line 15
    .line 16
    return-void
.end method

.method public a(Lz8/m;)I
    .locals 0

    .line 1
    invoke-interface {p1, p0}, Lz8/m;->e(Lz8/c;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public b()J
    .locals 4

    .line 1
    iget-object v0, p0, Lz8/c;->H:Lz8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v0, v0, Lz8/i;->e:I

    .line 6
    .line 7
    iget v1, p0, Lz8/c;->v:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v0, p0, Lz8/c;->a:J

    .line 13
    .line 14
    iget-wide v2, p0, Lz8/c;->b:J

    .line 15
    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0

    .line 18
    :cond_1
    :goto_0
    iget-wide v0, p0, Lz8/c;->a:J

    .line 19
    .line 20
    return-wide v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lz8/c;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public abstract d()F
.end method

.method public e()Lz8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lz8/c;->x:Lz8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()J
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/c;->q:Lz8/f;

    .line 2
    .line 3
    iget-wide v0, v0, Lz8/f;->c:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public abstract g()F
.end method

.method public abstract h(Lz8/m;J)[F
.end method

.method public abstract i()F
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lz8/c;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public k()Lz8/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract l()F
.end method

.method public abstract m()I
.end method

.method public n()Z
    .locals 2

    .line 1
    iget v0, p0, Lz8/c;->G:I

    .line 2
    .line 3
    iget-object v1, p0, Lz8/c;->H:Lz8/i;

    .line 4
    .line 5
    iget v1, v1, Lz8/i;->c:I

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Lz8/c;->F:I

    .line 11
    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    return v0
.end method

.method public o()Z
    .locals 2

    .line 1
    iget v0, p0, Lz8/c;->G:I

    .line 2
    .line 3
    iget-object v1, p0, Lz8/c;->H:Lz8/i;

    .line 4
    .line 5
    iget v1, v1, Lz8/i;->c:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lz8/c;->F:I

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public p()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v0, v0, Lz8/e;->a:J

    .line 6
    .line 7
    invoke-virtual {p0}, Lz8/c;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-gez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public q()Z
    .locals 2

    .line 1
    iget v0, p0, Lz8/c;->o:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-lez v0, :cond_0

    .line 8
    .line 9
    iget v0, p0, Lz8/c;->p:F

    .line 10
    .line 11
    cmpl-float v0, v0, v1

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lz8/c;->u:I

    .line 16
    .line 17
    iget-object v1, p0, Lz8/c;->H:Lz8/i;

    .line 18
    .line 19
    iget v1, v1, Lz8/i;->a:I

    .line 20
    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method

.method public r()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/c;->H:Lz8/i;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget v0, v0, Lz8/i;->e:I

    .line 6
    .line 7
    iget v1, p0, Lz8/c;->v:I

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lz8/c;->K:Z

    .line 13
    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public s()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v0, v0, Lz8/e;->a:J

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lz8/c;->t(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public t(J)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz8/c;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr p1, v0

    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    cmp-long v0, p1, v0

    .line 9
    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Lz8/c;->q:Lz8/f;

    .line 13
    .line 14
    iget-wide v0, v0, Lz8/f;->c:J

    .line 15
    .line 16
    cmp-long p1, p1, v0

    .line 17
    .line 18
    if-ltz p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return p1

    .line 23
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 24
    return p1
.end method

.method public u()Z
    .locals 2

    .line 1
    iget v0, p0, Lz8/c;->w:I

    .line 2
    .line 3
    iget-object v1, p0, Lz8/c;->H:Lz8/i;

    .line 4
    .line 5
    iget v1, v1, Lz8/i;->f:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public v()Z
    .locals 3

    .line 1
    iget v0, p0, Lz8/c;->s:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget v0, p0, Lz8/c;->t:I

    .line 7
    .line 8
    iget-object v2, p0, Lz8/c;->H:Lz8/i;

    .line 9
    .line 10
    iget v2, v2, Lz8/i;->b:I

    .line 11
    .line 12
    if-ne v0, v2, :cond_0

    .line 13
    .line 14
    return v1

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public w()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lz8/c;->D:Lz8/e;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v0, v0, Lz8/e;->a:J

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lz8/c;->x(J)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    return v0
.end method

.method public x(J)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lz8/c;->b()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sub-long/2addr p1, v0

    .line 6
    iget-object v0, p0, Lz8/c;->q:Lz8/f;

    .line 7
    .line 8
    iget-wide v0, v0, Lz8/f;->c:J

    .line 9
    .line 10
    cmp-long p1, p1, v0

    .line 11
    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public abstract y(Lz8/m;FF)V
.end method

.method public z(Lz8/m;Z)V
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lz8/m;->b(Lz8/c;Z)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lz8/c;->H:Lz8/i;

    .line 5
    .line 6
    iget p1, p1, Lz8/i;->a:I

    .line 7
    .line 8
    iput p1, p0, Lz8/c;->u:I

    .line 9
    .line 10
    return-void
.end method
