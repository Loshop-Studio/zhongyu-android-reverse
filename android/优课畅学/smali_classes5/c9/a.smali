.class public abstract Lc9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lz8/e;

.field public b:I

.field public c:I

.field public d:F

.field public e:F

.field public f:Lz8/l;

.field public g:Lz8/m;

.field public h:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Lz8/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/a;->f:Lz8/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lc9/a;->h:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 7
    .line 8
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 9
    .line 10
    invoke-virtual {v0}, La9/c;->i()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lc9/a;->c()Lz8/l;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lc9/a;->f:Lz8/l;

    .line 18
    .line 19
    invoke-virtual {p0}, Lc9/a;->e()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lc9/a;->h:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 23
    .line 24
    iget-object v0, v0, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 25
    .line 26
    invoke-virtual {v0}, La9/c;->j()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lc9/a;->f:Lz8/l;

    .line 30
    .line 31
    return-object v0
.end method

.method public b()F
    .locals 2

    .line 1
    iget v0, p0, Lc9/a;->d:F

    .line 2
    .line 3
    const v1, 0x3f19999a    # 0.6f

    .line 4
    .line 5
    .line 6
    sub-float/2addr v0, v1

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    div-float/2addr v1, v0

    .line 10
    return v1
.end method

.method public abstract c()Lz8/l;
.end method

.method public d()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lc9/a;->e()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public f(Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;)Lc9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lc9/a;->h:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lc9/a;->f:Lz8/l;

    .line 9
    .line 10
    :cond_0
    iput-object p1, p0, Lc9/a;->h:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 11
    .line 12
    return-object p0
.end method

.method public g(Lz8/m;)Lc9/a;
    .locals 3

    .line 1
    iput-object p1, p0, Lc9/a;->g:Lz8/m;

    .line 2
    .line 3
    invoke-interface {p1}, Lz8/m;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iput v0, p0, Lc9/a;->b:I

    .line 8
    .line 9
    invoke-interface {p1}, Lz8/m;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lc9/a;->c:I

    .line 14
    .line 15
    invoke-interface {p1}, Lz8/m;->getDensity()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, Lc9/a;->d:F

    .line 20
    .line 21
    invoke-interface {p1}, Lz8/m;->g()F

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iput p1, p0, Lc9/a;->e:F

    .line 26
    .line 27
    iget-object p1, p0, Lc9/a;->h:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 28
    .line 29
    iget-object p1, p1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 30
    .line 31
    iget v0, p0, Lc9/a;->b:I

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    iget v1, p0, Lc9/a;->c:I

    .line 35
    .line 36
    int-to-float v1, v1

    .line 37
    invoke-virtual {p0}, Lc9/a;->b()F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p1, v0, v1, v2}, La9/c;->m(FFF)Z

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lc9/a;->h:Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;

    .line 45
    .line 46
    iget-object p1, p1, Lmaster/flame/danmaku/danmaku/model/android/DanmakuContext;->A:La9/c;

    .line 47
    .line 48
    invoke-virtual {p1}, La9/c;->j()V

    .line 49
    .line 50
    .line 51
    return-object p0
.end method

.method public h(Lz8/e;)Lc9/a;
    .locals 0

    .line 1
    iput-object p1, p0, Lc9/a;->a:Lz8/e;

    .line 2
    .line 3
    return-object p0
.end method
