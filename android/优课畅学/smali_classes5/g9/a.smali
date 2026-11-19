.class public Lg9/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/GestureDetector;

.field public b:Ly8/f;

.field public c:Landroid/graphics/RectF;

.field public final d:Landroid/view/GestureDetector$OnGestureListener;


# direct methods
.method public constructor <init>(Ly8/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lg9/a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lg9/a$a;-><init>(Lg9/a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lg9/a;->d:Landroid/view/GestureDetector$OnGestureListener;

    .line 10
    .line 11
    iput-object p1, p0, Lg9/a;->b:Ly8/f;

    .line 12
    .line 13
    new-instance v1, Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lg9/a;->c:Landroid/graphics/RectF;

    .line 19
    .line 20
    new-instance v1, Landroid/view/GestureDetector;

    .line 21
    .line 22
    check-cast p1, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {v1, p1, v0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lg9/a;->a:Landroid/view/GestureDetector;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic a(Lg9/a;)Ly8/f;
    .locals 0

    .line 1
    iget-object p0, p0, Lg9/a;->b:Ly8/f;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lg9/a;FF)Lz8/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lg9/a;->i(FF)Lz8/l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lg9/a;Lz8/l;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg9/a;->g(Lz8/l;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic d(Lg9/a;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lg9/a;->h()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static declared-synchronized e(Ly8/f;)Lg9/a;
    .locals 2

    .line 1
    const-class v0, Lg9/a;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Lg9/a;

    .line 5
    .line 6
    invoke-direct {v1, p0}, Lg9/a;-><init>(Ly8/f;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-object v1

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p0
.end method


# virtual methods
.method public f(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/a;->a:Landroid/view/GestureDetector;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final g(Lz8/l;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lg9/a;->b:Ly8/f;

    .line 2
    .line 3
    invoke-interface {p1}, Ly8/f;->getOnDanmakuClickListener()Ly8/f$a;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg9/a;->b:Ly8/f;

    .line 2
    .line 3
    invoke-interface {v0}, Ly8/f;->getOnDanmakuClickListener()Ly8/f$a;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return v0
.end method

.method public final i(FF)Lz8/l;
    .locals 8

    .line 1
    new-instance v0, La9/d;

    .line 2
    .line 3
    invoke-direct {v0}, La9/d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lg9/a;->c:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/graphics/RectF;->setEmpty()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lg9/a;->b:Ly8/f;

    .line 12
    .line 13
    invoke-interface {v1}, Ly8/f;->getCurrentVisibleDanmakus()Lz8/l;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v1}, Lz8/l;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v1}, Lz8/l;->iterator()Lz8/k;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    :cond_0
    :goto_0
    invoke-interface {v1}, Lz8/k;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {v1}, Lz8/k;->next()Lz8/c;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    iget-object v3, p0, Lg9/a;->c:Landroid/graphics/RectF;

    .line 42
    .line 43
    invoke-virtual {v2}, Lz8/c;->g()F

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v2}, Lz8/c;->l()F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {v2}, Lz8/c;->i()F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual {v2}, Lz8/c;->d()F

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    .line 60
    .line 61
    .line 62
    iget-object v3, p0, Lg9/a;->c:Landroid/graphics/RectF;

    .line 63
    .line 64
    invoke-virtual {v3, p1, p2}, Landroid/graphics/RectF;->contains(FF)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_0

    .line 69
    .line 70
    invoke-interface {v0, v2}, Lz8/l;->e(Lz8/c;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    return-object v0
.end method
