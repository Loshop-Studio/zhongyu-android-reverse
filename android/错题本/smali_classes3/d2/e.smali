.class public final Ld2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/a;


# instance fields
.field public a:Landroid/view/View;

.field public b:I

.field public c:I

.field public d:F

.field public e:F


# direct methods
.method public static a(Landroid/view/View;)Ld2/e;
    .locals 2

    .line 1
    new-instance v0, Ld2/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput v1, v0, Ld2/e;->b:I

    .line 8
    .line 9
    const/16 v1, 0xe9

    .line 10
    .line 11
    iput v1, v0, Ld2/e;->c:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, v0, Ld2/e;->d:F

    .line 15
    .line 16
    iput-object p0, v0, Ld2/e;->a:Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, v0, Ld2/e;->d:F

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    .line 29
    .line 30
    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    .line 37
    .line 38
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 39
    .line 40
    add-int/2addr v1, p0

    .line 41
    int-to-float p0, v1

    .line 42
    iput p0, v0, Ld2/e;->e:F

    .line 43
    .line 44
    return-object v0
.end method


# virtual methods
.method public final b(I)V
    .locals 0

    .line 1
    iput p1, p0, Ld2/e;->c:I

    .line 2
    .line 3
    return-void
.end method

.method public final getState()I
    .locals 1

    .line 1
    iget v0, p0, Ld2/e;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final hide()V
    .locals 8

    .line 1
    iget-object v0, p0, Ld2/e;->a:Landroid/view/View;

    .line 2
    .line 3
    iget v1, p0, Ld2/e;->c:I

    .line 4
    .line 5
    const/16 v2, 0xe9

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const-wide/16 v6, 0x12c

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    neg-int v0, v0

    .line 23
    int-to-float v0, v0

    .line 24
    new-array v2, v4, [F

    .line 25
    .line 26
    aput v1, v2, v5

    .line 27
    .line 28
    aput v0, v2, v3

    .line 29
    .line 30
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 35
    .line 36
    .line 37
    new-instance v1, Ld2/d;

    .line 38
    .line 39
    invoke-direct {v1, p0, v5}, Ld2/d;-><init>(Ld2/e;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 46
    .line 47
    .line 48
    iput v5, p0, Ld2/e;->b:I

    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    const/16 v2, 0x91d

    .line 52
    .line 53
    if-ne v1, v2, :cond_1

    .line 54
    .line 55
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget v2, p0, Ld2/e;->d:F

    .line 60
    .line 61
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    int-to-float v0, v0

    .line 66
    add-float/2addr v2, v0

    .line 67
    iget v0, p0, Ld2/e;->e:F

    .line 68
    .line 69
    add-float/2addr v2, v0

    .line 70
    new-array v0, v4, [F

    .line 71
    .line 72
    aput v1, v0, v5

    .line 73
    .line 74
    aput v2, v0, v3

    .line 75
    .line 76
    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 81
    .line 82
    .line 83
    new-instance v1, Ld2/d;

    .line 84
    .line 85
    const/4 v2, 0x3

    .line 86
    invoke-direct {v1, p0, v2}, Ld2/d;-><init>(Ld2/e;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 93
    .line 94
    .line 95
    iput v5, p0, Ld2/e;->b:I

    .line 96
    .line 97
    :cond_1
    return-void
.end method

.method public final show()V
    .locals 8

    .line 1
    iget-object v0, p0, Ld2/e;->a:Landroid/view/View;

    .line 2
    .line 3
    iget v1, p0, Ld2/e;->c:I

    .line 4
    .line 5
    const/16 v2, 0xe9

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const-wide/16 v6, 0x12c

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    new-array v1, v4, [F

    .line 19
    .line 20
    aput v0, v1, v3

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    aput v0, v1, v5

    .line 24
    .line 25
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    .line 32
    new-instance v1, Ld2/d;

    .line 33
    .line 34
    invoke-direct {v1, p0, v5}, Ld2/d;-><init>(Ld2/e;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 41
    .line 42
    .line 43
    iput v5, p0, Ld2/e;->b:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const/16 v2, 0x91d

    .line 47
    .line 48
    if-ne v1, v2, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v1, p0, Ld2/e;->d:F

    .line 55
    .line 56
    new-array v2, v4, [F

    .line 57
    .line 58
    aput v0, v2, v3

    .line 59
    .line 60
    aput v1, v2, v5

    .line 61
    .line 62
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0, v6, v7}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 67
    .line 68
    .line 69
    new-instance v1, Ld2/d;

    .line 70
    .line 71
    invoke-direct {v1, p0, v4}, Ld2/d;-><init>(Ld2/e;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 78
    .line 79
    .line 80
    iput v5, p0, Ld2/e;->b:I

    .line 81
    .line 82
    :cond_1
    return-void
.end method
