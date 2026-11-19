.class public final Lh7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/view/simpleBoard/a;

.field public b:I

.field public final c:Li7/j;

.field public final d:Li7/g;

.field public final e:Li7/f;

.field public final f:Li7/h;

.field public final g:Li7/i;

.field public h:Li7/e;


# direct methods
.method public constructor <init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lh7/a;->a:Lcom/zykj/view/simpleBoard/a;

    .line 20
    .line 21
    new-instance v0, Li7/j;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2, p3}, Li7/j;-><init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lh7/a;->c:Li7/j;

    .line 27
    .line 28
    new-instance v0, Li7/g;

    .line 29
    .line 30
    invoke-direct {v0, p1, p2, p3}, Li7/g;-><init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lh7/a;->d:Li7/g;

    .line 34
    .line 35
    new-instance v0, Li7/f;

    .line 36
    .line 37
    invoke-direct {v0, p1, p2, p3}, Li7/f;-><init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lh7/a;->e:Li7/f;

    .line 41
    .line 42
    new-instance v0, Li7/h;

    .line 43
    .line 44
    invoke-direct {v0, p1, p2, p3}, Li7/h;-><init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lh7/a;->f:Li7/h;

    .line 48
    .line 49
    new-instance v0, Li7/i;

    .line 50
    .line 51
    invoke-direct {v0, p1, p2, p3}, Li7/i;-><init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, Lh7/a;->g:Li7/i;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x3

    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x1

    .line 13
    if-eqz v0, :cond_7

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eq v0, v3, :cond_5

    .line 17
    .line 18
    if-eq v0, v2, :cond_4

    .line 19
    .line 20
    if-eq v0, v1, :cond_2

    .line 21
    .line 22
    const/4 v1, 0x5

    .line 23
    if-eq v0, v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x6

    .line 26
    if-eq v0, v1, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    iget-object v0, p0, Lh7/a;->h:Li7/e;

    .line 30
    .line 31
    if-eqz v0, :cond_d

    .line 32
    .line 33
    invoke-virtual {v0, p1}, Li7/e;->v(Landroid/view/MotionEvent;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    iget-object v0, p0, Lh7/a;->h:Li7/e;

    .line 38
    .line 39
    if-eqz v0, :cond_d

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Li7/e;->t(Landroid/view/MotionEvent;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-object v0, p0, Lh7/a;->h:Li7/e;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Li7/e;->y(Landroid/view/MotionEvent;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    iput-object v4, p0, Lh7/a;->h:Li7/e;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_4
    iget-object v0, p0, Lh7/a;->h:Li7/e;

    .line 56
    .line 57
    if-eqz v0, :cond_d

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Li7/e;->r(Landroid/view/MotionEvent;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    iget-object v0, p0, Lh7/a;->h:Li7/e;

    .line 64
    .line 65
    if-eqz v0, :cond_6

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Li7/e;->w(Landroid/view/MotionEvent;)V

    .line 68
    .line 69
    .line 70
    :cond_6
    iput-object v4, p0, Lh7/a;->h:Li7/e;

    .line 71
    .line 72
    return-void

    .line 73
    :cond_7
    iget v0, p0, Lh7/a;->b:I

    .line 74
    .line 75
    if-eqz v0, :cond_c

    .line 76
    .line 77
    if-eq v0, v3, :cond_b

    .line 78
    .line 79
    if-eq v0, v2, :cond_a

    .line 80
    .line 81
    if-eq v0, v1, :cond_9

    .line 82
    .line 83
    const/4 v1, 0x4

    .line 84
    if-eq v0, v1, :cond_8

    .line 85
    .line 86
    iget-object v0, p0, Lh7/a;->f:Li7/h;

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_8
    iget-object v0, p0, Lh7/a;->g:Li7/i;

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_9
    iget-object v0, p0, Lh7/a;->f:Li7/h;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_a
    iget-object v0, p0, Lh7/a;->e:Li7/f;

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_b
    iget-object v0, p0, Lh7/a;->d:Li7/g;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_c
    iget-object v0, p0, Lh7/a;->c:Li7/j;

    .line 102
    .line 103
    :goto_0
    iput-object v0, p0, Lh7/a;->h:Li7/e;

    .line 104
    .line 105
    if-eqz v0, :cond_d

    .line 106
    .line 107
    invoke-virtual {v0, p1}, Li7/e;->p(Landroid/view/MotionEvent;)V

    .line 108
    .line 109
    .line 110
    :cond_d
    :goto_1
    return-void
.end method

.method public final b(I)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    iget-object v0, p0, Lh7/a;->a:Lcom/zykj/view/simpleBoard/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/zykj/view/simpleBoard/a;->g()V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput p1, p0, Lh7/a;->b:I

    .line 10
    .line 11
    return-void
.end method
