.class public Ld9/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Z

.field public b:Lz8/e;

.field public c:I

.field public d:I

.field public e:Lz8/c;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:J

.field public n:J

.field public o:J

.field public p:Z

.field public q:J

.field public r:J

.field public s:J

.field public t:Lz8/l;

.field public u:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lz8/e;

    .line 5
    .line 6
    invoke-direct {v0}, Lz8/e;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ld9/a$b;->b:Lz8/e;

    .line 10
    .line 11
    new-instance v0, La9/d;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, v1}, La9/d;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Ld9/a$b;->t:Lz8/l;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public a(II)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x6

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x7

    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget p1, p0, Ld9/a$b;->j:I

    .line 19
    .line 20
    add-int/2addr p1, p2

    .line 21
    iput p1, p0, Ld9/a$b;->j:I

    .line 22
    .line 23
    return p1

    .line 24
    :cond_1
    iget p1, p0, Ld9/a$b;->g:I

    .line 25
    .line 26
    add-int/2addr p1, p2

    .line 27
    iput p1, p0, Ld9/a$b;->g:I

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    iget p1, p0, Ld9/a$b;->h:I

    .line 31
    .line 32
    add-int/2addr p1, p2

    .line 33
    iput p1, p0, Ld9/a$b;->h:I

    .line 34
    .line 35
    return p1

    .line 36
    :cond_3
    iget p1, p0, Ld9/a$b;->i:I

    .line 37
    .line 38
    add-int/2addr p1, p2

    .line 39
    iput p1, p0, Ld9/a$b;->i:I

    .line 40
    .line 41
    return p1

    .line 42
    :cond_4
    iget p1, p0, Ld9/a$b;->f:I

    .line 43
    .line 44
    add-int/2addr p1, p2

    .line 45
    iput p1, p0, Ld9/a$b;->f:I

    .line 46
    .line 47
    return p1
.end method

.method public b(I)I
    .locals 1

    .line 1
    iget v0, p0, Ld9/a$b;->k:I

    .line 2
    .line 3
    add-int/2addr v0, p1

    .line 4
    iput v0, p0, Ld9/a$b;->k:I

    .line 5
    .line 6
    return v0
.end method

.method public c(Lz8/c;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ld9/a$b;->u:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld9/a$b;->t:Lz8/l;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lz8/l;->e(Lz8/c;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d()V
    .locals 3

    .line 1
    iget v0, p0, Ld9/a$b;->k:I

    .line 2
    .line 3
    iput v0, p0, Ld9/a$b;->l:I

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput v0, p0, Ld9/a$b;->k:I

    .line 7
    .line 8
    iput v0, p0, Ld9/a$b;->j:I

    .line 9
    .line 10
    iput v0, p0, Ld9/a$b;->i:I

    .line 11
    .line 12
    iput v0, p0, Ld9/a$b;->h:I

    .line 13
    .line 14
    iput v0, p0, Ld9/a$b;->g:I

    .line 15
    .line 16
    iput v0, p0, Ld9/a$b;->f:I

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    iput-wide v1, p0, Ld9/a$b;->m:J

    .line 21
    .line 22
    iput-wide v1, p0, Ld9/a$b;->o:J

    .line 23
    .line 24
    iput-wide v1, p0, Ld9/a$b;->n:J

    .line 25
    .line 26
    iput-wide v1, p0, Ld9/a$b;->q:J

    .line 27
    .line 28
    iput-boolean v0, p0, Ld9/a$b;->p:Z

    .line 29
    .line 30
    monitor-enter p0

    .line 31
    :try_start_0
    iget-object v0, p0, Ld9/a$b;->t:Lz8/l;

    .line 32
    .line 33
    invoke-interface {v0}, Lz8/l;->clear()V

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :catchall_0
    move-exception v0

    .line 39
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v0
.end method

.method public e(Ld9/a$b;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget v0, p1, Ld9/a$b;->l:I

    .line 5
    .line 6
    iput v0, p0, Ld9/a$b;->l:I

    .line 7
    .line 8
    iget v0, p1, Ld9/a$b;->f:I

    .line 9
    .line 10
    iput v0, p0, Ld9/a$b;->f:I

    .line 11
    .line 12
    iget v0, p1, Ld9/a$b;->g:I

    .line 13
    .line 14
    iput v0, p0, Ld9/a$b;->g:I

    .line 15
    .line 16
    iget v0, p1, Ld9/a$b;->h:I

    .line 17
    .line 18
    iput v0, p0, Ld9/a$b;->h:I

    .line 19
    .line 20
    iget v0, p1, Ld9/a$b;->i:I

    .line 21
    .line 22
    iput v0, p0, Ld9/a$b;->i:I

    .line 23
    .line 24
    iget v0, p1, Ld9/a$b;->j:I

    .line 25
    .line 26
    iput v0, p0, Ld9/a$b;->j:I

    .line 27
    .line 28
    iget v0, p1, Ld9/a$b;->k:I

    .line 29
    .line 30
    iput v0, p0, Ld9/a$b;->k:I

    .line 31
    .line 32
    iget-wide v0, p1, Ld9/a$b;->m:J

    .line 33
    .line 34
    iput-wide v0, p0, Ld9/a$b;->m:J

    .line 35
    .line 36
    iget-wide v0, p1, Ld9/a$b;->n:J

    .line 37
    .line 38
    iput-wide v0, p0, Ld9/a$b;->n:J

    .line 39
    .line 40
    iget-wide v0, p1, Ld9/a$b;->o:J

    .line 41
    .line 42
    iput-wide v0, p0, Ld9/a$b;->o:J

    .line 43
    .line 44
    iget-boolean v0, p1, Ld9/a$b;->p:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Ld9/a$b;->p:Z

    .line 47
    .line 48
    iget-wide v0, p1, Ld9/a$b;->q:J

    .line 49
    .line 50
    iput-wide v0, p0, Ld9/a$b;->q:J

    .line 51
    .line 52
    iget-wide v0, p1, Ld9/a$b;->r:J

    .line 53
    .line 54
    iput-wide v0, p0, Ld9/a$b;->r:J

    .line 55
    .line 56
    iget-wide v0, p1, Ld9/a$b;->s:J

    .line 57
    .line 58
    iput-wide v0, p0, Ld9/a$b;->s:J

    .line 59
    .line 60
    return-void
.end method
