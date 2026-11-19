.class public final Lqb/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Lrb/i;

.field public final c:Lrb/g;

.field public final d:Lrb/f;

.field public final e:Lrb/h;

.field public f:Lrb/e;


# direct methods
.method public constructor <init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lrb/i;

    .line 20
    .line 21
    invoke-direct {v0, p1, p2, p3}, Lrb/i;-><init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lqb/a;->b:Lrb/i;

    .line 25
    .line 26
    new-instance v0, Lrb/g;

    .line 27
    .line 28
    invoke-direct {v0, p1, p2, p3}, Lrb/g;-><init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lqb/a;->c:Lrb/g;

    .line 32
    .line 33
    new-instance v0, Lrb/f;

    .line 34
    .line 35
    invoke-direct {v0, p1, p2, p3}, Lrb/f;-><init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lqb/a;->d:Lrb/f;

    .line 39
    .line 40
    new-instance v0, Lrb/h;

    .line 41
    .line 42
    invoke-direct {v0, p1, p2, p3}, Lrb/h;-><init>(Lqb/c;Landroid/graphics/Matrix;Lqb/b;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lqb/a;->e:Lrb/h;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x2

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    if-eq v0, v2, :cond_3

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x5

    .line 19
    if-eq v0, v1, :cond_1

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    if-eq v0, v1, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    iget-object v0, p0, Lqb/a;->f:Lrb/e;

    .line 26
    .line 27
    if-eqz v0, :cond_a

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lrb/e;->v(Landroid/view/MotionEvent;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object v0, p0, Lqb/a;->f:Lrb/e;

    .line 34
    .line 35
    if-eqz v0, :cond_a

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Lrb/e;->t(Landroid/view/MotionEvent;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    iget-object v0, p0, Lqb/a;->f:Lrb/e;

    .line 42
    .line 43
    if-eqz v0, :cond_a

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Lrb/e;->r(Landroid/view/MotionEvent;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    iget-object v0, p0, Lqb/a;->f:Lrb/e;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Lrb/e;->w(Landroid/view/MotionEvent;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p1, 0x0

    .line 57
    iput-object p1, p0, Lqb/a;->f:Lrb/e;

    .line 58
    .line 59
    return-void

    .line 60
    :cond_5
    iget v0, p0, Lqb/a;->a:I

    .line 61
    .line 62
    if-eqz v0, :cond_9

    .line 63
    .line 64
    if-eq v0, v2, :cond_8

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    const/4 v1, 0x3

    .line 69
    if-eq v0, v1, :cond_6

    .line 70
    .line 71
    iget-object v0, p0, Lqb/a;->e:Lrb/h;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_6
    iget-object v0, p0, Lqb/a;->e:Lrb/h;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-object v0, p0, Lqb/a;->d:Lrb/f;

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-object v0, p0, Lqb/a;->c:Lrb/g;

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget-object v0, p0, Lqb/a;->b:Lrb/i;

    .line 84
    .line 85
    :goto_0
    iput-object v0, p0, Lqb/a;->f:Lrb/e;

    .line 86
    .line 87
    if-eqz v0, :cond_a

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Lrb/e;->p(Landroid/view/MotionEvent;)V

    .line 90
    .line 91
    .line 92
    :cond_a
    :goto_1
    return-void
.end method

.method public final b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lqb/a;->a:I

    .line 2
    .line 3
    return-void
.end method
