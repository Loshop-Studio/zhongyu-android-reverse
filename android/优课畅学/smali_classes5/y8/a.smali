.class public Ly8/a;
.super Ly8/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly8/a$a;
    }
.end annotation


# instance fields
.field public u:I

.field public v:Ly8/a$a;

.field public w:Lz8/e;

.field public final x:Ljava/lang/Object;

.field public y:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Lz8/e;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;Ly8/h$a;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Ly8/e;-><init>(Lz8/e;Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;Ly8/h$a;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    iput p1, p0, Ly8/a;->u:I

    .line 6
    .line 7
    new-instance p1, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Ly8/a;->x:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {}, Ltv/cjump/jni/NativeBitmapFactory;->g()V

    .line 15
    .line 16
    .line 17
    iput p4, p0, Ly8/a;->u:I

    .line 18
    .line 19
    invoke-static {}, Ltv/cjump/jni/NativeBitmapFactory;->f()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    mul-int/lit8 p1, p4, 0x2

    .line 26
    .line 27
    iput p1, p0, Ly8/a;->u:I

    .line 28
    .line 29
    :cond_0
    new-instance p1, Ly8/a$a;

    .line 30
    .line 31
    const/4 p2, 0x3

    .line 32
    invoke-direct {p1, p0, p4, p2}, Ly8/a$a;-><init>(Ly8/a;II)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Ly8/a;->v:Ly8/a$a;

    .line 36
    .line 37
    iget-object p2, p0, Ly8/e;->f:Ld9/a;

    .line 38
    .line 39
    invoke-interface {p2, p1}, Ld9/a;->b(Lz8/j;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic t(Ly8/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/a;->x:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic u(Ly8/a;)Ly8/a$a;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/a;->v:Ly8/a$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic v(Ly8/a;)Lz8/e;
    .locals 0

    .line 1
    iget-object p0, p0, Ly8/a;->w:Lz8/e;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a(Lz8/c;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ly8/e;->a(Lz8/c;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0, p1}, Ly8/a$a;->a(Lz8/c;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Ly8/e;->b(I)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ly8/a$a;->z(I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public c(Lz8/a;)Ld9/a$b;
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ly8/e;->c(Lz8/a;)Ld9/a$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Ly8/a;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Ly8/a;->x:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 11
    .line 12
    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget v1, p1, Ld9/a$b;->k:I

    .line 21
    .line 22
    iget v2, p1, Ld9/a$b;->l:I

    .line 23
    .line 24
    sub-int/2addr v1, v2

    .line 25
    const/16 v2, -0x14

    .line 26
    .line 27
    if-ge v1, v2, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ly8/a$a;->C()V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 33
    .line 34
    iget-object v1, p0, Ly8/e;->a:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 35
    .line 36
    iget-object v1, v1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 37
    .line 38
    iget-wide v1, v1, La9/c;->e:J

    .line 39
    .line 40
    neg-long v1, v1

    .line 41
    invoke-virtual {v0, v1, v2}, Ly8/a$a;->B(J)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-object p1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    throw p1
.end method

.method public f(J)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Ly8/e;->f(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ly8/a;->start()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Ly8/a$a;->E(J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public i()V
    .locals 2

    .line 1
    invoke-super {p0}, Ly8/e;->i()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ly8/e;->s()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ly8/e;->f:Ld9/a;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-interface {v0, v1}, Ld9/a;->b(Lz8/j;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Ly8/a$a;->r()V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Ly8/a;->v:Ly8/a$a;

    .line 21
    .line 22
    :cond_0
    invoke-static {}, Ltv/cjump/jni/NativeBitmapFactory;->h()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public o(Lz8/e;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ly8/e;->g:Lz8/e;

    .line 2
    .line 3
    new-instance v0, Lz8/e;

    .line 4
    .line 5
    invoke-direct {v0}, Lz8/e;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Ly8/a;->w:Lz8/e;

    .line 9
    .line 10
    iget-wide v1, p1, Lz8/e;->a:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lz8/e;->b(J)J

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public prepare()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/e;->d:Lc9/a;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ly8/e;->p(Lc9/a;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 7
    .line 8
    invoke-virtual {v0}, Ly8/a$a;->m()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public q(Lz8/c;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ly8/e;->q(Lz8/c;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget p1, p0, Ly8/a;->y:I

    .line 9
    .line 10
    add-int/lit8 p1, p1, 0x1

    .line 11
    .line 12
    iput p1, p0, Ly8/a;->y:I

    .line 13
    .line 14
    const/4 v1, 0x5

    .line 15
    if-le p1, v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Ly8/a$a;->C()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    iput p1, p0, Ly8/a;->y:I

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p1}, Lz8/c;->e()Lz8/n;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-interface {v0}, Lz8/n;->hasReferences()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-interface {v0}, Lz8/n;->e()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v0}, Lz8/n;->destroy()V

    .line 41
    .line 42
    .line 43
    :goto_0
    const/4 v0, 0x0

    .line 44
    iput-object v0, p1, Lz8/c;->x:Lz8/n;

    .line 45
    .line 46
    :cond_2
    return-void
.end method

.method public start()V
    .locals 3

    .line 1
    invoke-super {p0}, Ly8/e;->start()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ltv/cjump/jni/NativeBitmapFactory;->g()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Ly8/a$a;

    .line 12
    .line 13
    iget v1, p0, Ly8/a;->u:I

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v0, p0, v1, v2}, Ly8/a$a;-><init>(Ly8/a;II)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ly8/a;->v:Ly8/a$a;

    .line 20
    .line 21
    invoke-virtual {v0}, Ly8/a$a;->m()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Ly8/e;->f:Ld9/a;

    .line 25
    .line 26
    iget-object v1, p0, Ly8/a;->v:Ly8/a$a;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ld9/a;->b(Lz8/j;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    invoke-virtual {v0}, Ly8/a$a;->D()V

    .line 33
    .line 34
    .line 35
    return-void
.end method
