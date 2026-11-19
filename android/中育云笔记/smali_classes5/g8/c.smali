.class public Lg8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg8/a;


# static fields
.field public static g:I = 0xe9

.field public static h:I = 0x91d


# instance fields
.field public a:Landroid/view/View;

.field public b:F

.field public c:I

.field public d:I

.field public e:F

.field public f:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lg8/c;->c:I

    .line 6
    .line 7
    sget v0, Lg8/c;->g:I

    .line 8
    .line 9
    iput v0, p0, Lg8/c;->d:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lg8/c;->e:F

    .line 13
    .line 14
    iput-object p1, p0, Lg8/c;->a:Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lg8/c;->e:F

    .line 21
    .line 22
    iget-object p1, p0, Lg8/c;->a:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    .line 29
    .line 30
    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 31
    .line 32
    iget-object v0, p0, Lg8/c;->a:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    .line 39
    .line 40
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 41
    .line 42
    add-int/2addr p1, v0

    .line 43
    int-to-float p1, p1

    .line 44
    iput p1, p0, Lg8/c;->f:F

    .line 45
    .line 46
    return-void
.end method

.method public static c(Landroid/view/View;)Lg8/c;
    .locals 1

    .line 1
    new-instance v0, Lg8/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lg8/c;-><init>(Landroid/view/View;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a(F)V
    .locals 0

    .line 1
    iput p1, p0, Lg8/c;->b:F

    .line 2
    .line 3
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lg8/c;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg8/c;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lg8/c;->e:F

    .line 8
    .line 9
    iget-object v2, p0, Lg8/c;->a:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    int-to-float v2, v2

    .line 16
    add-float/2addr v1, v2

    .line 17
    iget v2, p0, Lg8/c;->f:F

    .line 18
    .line 19
    add-float/2addr v1, v2

    .line 20
    const/4 v2, 0x2

    .line 21
    new-array v2, v2, [F

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    aput v0, v2, v3

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    aput v1, v2, v0

    .line 28
    .line 29
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-wide/16 v1, 0x12c

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 36
    .line 37
    .line 38
    new-instance v1, Lg8/c$d;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lg8/c$d;-><init>(Lg8/c;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 47
    .line 48
    .line 49
    iput v3, p0, Lg8/c;->c:I

    .line 50
    .line 51
    return-void
.end method

.method public final e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg8/c;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lg8/c;->a:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    neg-int v1, v1

    .line 14
    int-to-float v1, v1

    .line 15
    const/4 v2, 0x2

    .line 16
    new-array v2, v2, [F

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    aput v0, v2, v3

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    aput v1, v2, v0

    .line 23
    .line 24
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-wide/16 v1, 0x12c

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 31
    .line 32
    .line 33
    new-instance v1, Lg8/c$a;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lg8/c$a;-><init>(Lg8/c;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 42
    .line 43
    .line 44
    iput v3, p0, Lg8/c;->c:I

    .line 45
    .line 46
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg8/c;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, Lg8/c;->e:F

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    new-array v2, v2, [F

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput v0, v2, v3

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    aput v1, v2, v0

    .line 17
    .line 18
    invoke-static {v2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-wide/16 v2, 0x12c

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 25
    .line 26
    .line 27
    new-instance v2, Lg8/c$c;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Lg8/c$c;-><init>(Lg8/c;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 36
    .line 37
    .line 38
    iput v0, p0, Lg8/c;->c:I

    .line 39
    .line 40
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lg8/c;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    new-array v1, v1, [F

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput v0, v1, v2

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    const/4 v2, 0x0

    .line 15
    aput v2, v1, v0

    .line 16
    .line 17
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-wide/16 v2, 0x12c

    .line 22
    .line 23
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 24
    .line 25
    .line 26
    new-instance v2, Lg8/c$b;

    .line 27
    .line 28
    invoke-direct {v2, p0}, Lg8/c$b;-><init>(Lg8/c;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 35
    .line 36
    .line 37
    iput v0, p0, Lg8/c;->c:I

    .line 38
    .line 39
    return-void
.end method

.method public getState()I
    .locals 1

    .line 1
    iget v0, p0, Lg8/c;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public hide()V
    .locals 2

    .line 1
    iget v0, p0, Lg8/c;->d:I

    .line 2
    .line 3
    sget v1, Lg8/c;->g:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lg8/c;->e()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget v1, Lg8/c;->h:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lg8/c;->d()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public show()V
    .locals 2

    .line 1
    iget v0, p0, Lg8/c;->d:I

    .line 2
    .line 3
    sget v1, Lg8/c;->g:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lg8/c;->g()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget v1, Lg8/c;->h:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lg8/c;->f()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method
