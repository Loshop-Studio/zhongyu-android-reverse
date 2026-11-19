.class public Lb/c/a/e/f/b/f/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lb/c/a/e/f/b/f/d;

.field public b:F

.field public c:F

.field public final d:F

.field public final e:F

.field public f:Landroid/view/VelocityTracker;

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lb/c/a/e/f/b/f/a;->e:F

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    int-to-float p1, p1

    iput p1, p0, Lb/c/a/e/f/b/f/a;->d:F

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)F
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public b(Landroid/view/MotionEvent;)F
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public c()Z
    .locals 0

    const p0, 0x0

    throw p0
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_11

    const/4 v5, 0x0

    if-eq v2, v4, :cond_a

    const/4 v6, 0x2

    if-eq v2, v6, :cond_1

    const/4 v1, 0x3

    if-eq v2, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    iget-object v1, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_13

    goto/16 :goto_5

    :cond_1
    invoke-virtual/range {p0 .. p1}, Lb/c/a/e/f/b/f/a;->a(Landroid/view/MotionEvent;)F

    move-result v2

    invoke-virtual/range {p0 .. p1}, Lb/c/a/e/f/b/f/a;->b(Landroid/view/MotionEvent;)F

    move-result v5

    iget v7, v0, Lb/c/a/e/f/b/f/a;->b:F

    sub-float v7, v2, v7

    iget v8, v0, Lb/c/a/e/f/b/f/a;->c:F

    sub-float v8, v5, v8

    iget-boolean v9, v0, Lb/c/a/e/f/b/f/a;->g:Z

    if-nez v9, :cond_3

    mul-float v9, v7, v7

    mul-float v10, v8, v8

    add-float/2addr v10, v9

    float-to-double v9, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    iget v11, v0, Lb/c/a/e/f/b/f/a;->d:F

    float-to-double v11, v11

    cmpl-double v9, v9, v11

    if-ltz v9, :cond_2

    move v9, v4

    goto :goto_0

    :cond_2
    move v9, v3

    :goto_0
    iput-boolean v9, v0, Lb/c/a/e/f/b/f/a;->g:Z

    :cond_3
    iget-boolean v9, v0, Lb/c/a/e/f/b/f/a;->g:Z

    if-eqz v9, :cond_13

    iget-object v9, v0, Lb/c/a/e/f/b/f/a;->a:Lb/c/a/e/f/b/f/d;

    check-cast v9, Lb/c/a/e/f/b/e;

    .line 1
    iget-object v10, v9, Lb/c/a/e/f/b/e;->k:Lb/c/a/e/f/b/f/a;

    invoke-virtual {v10}, Lb/c/a/e/f/b/f/a;->c()Z

    move-result v10

    if-eqz v10, :cond_4

    goto :goto_1

    :cond_4
    sget-boolean v10, Lb/c/a/e/f/b/e;->E:Z

    if-eqz v10, :cond_5

    new-array v10, v6, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    aput-object v11, v10, v3

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    aput-object v11, v10, v4

    const-string v11, "onDrag: dx: %.2f. dy: %.2f"

    invoke-static {v11, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    :cond_5
    invoke-virtual {v9}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v10

    iget-object v11, v9, Lb/c/a/e/f/b/e;->n:Landroid/graphics/Matrix;

    invoke-virtual {v11, v7, v8}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    invoke-virtual {v9}, Lb/c/a/e/f/b/e;->b()V

    invoke-virtual {v10}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    iget-boolean v10, v9, Lb/c/a/e/f/b/e;->g:Z

    if-eqz v10, :cond_8

    iget-object v10, v9, Lb/c/a/e/f/b/e;->k:Lb/c/a/e/f/b/f/a;

    invoke-virtual {v10}, Lb/c/a/e/f/b/f/a;->c()Z

    move-result v10

    if-nez v10, :cond_8

    iget-boolean v10, v9, Lb/c/a/e/f/b/e;->h:Z

    if-nez v10, :cond_8

    iget v9, v9, Lb/c/a/e/f/b/e;->B:I

    if-eq v9, v6, :cond_7

    if-nez v9, :cond_6

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v6, v7, v6

    if-gez v6, :cond_7

    :cond_6
    if-ne v9, v4, :cond_9

    const/high16 v6, -0x40800000    # -1.0f

    cmpg-float v6, v7, v6

    if-gtz v6, :cond_9

    :cond_7
    if-eqz v8, :cond_9

    invoke-interface {v8, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto :goto_1

    :cond_8
    if-eqz v8, :cond_9

    invoke-interface {v8, v4}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 2
    :cond_9
    :goto_1
    iput v2, v0, Lb/c/a/e/f/b/f/a;->b:F

    iput v5, v0, Lb/c/a/e/f/b/f/a;->c:F

    iget-object v2, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_13

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    goto/16 :goto_6

    :cond_a
    iget-boolean v2, v0, Lb/c/a/e/f/b/f/a;->g:Z

    if-eqz v2, :cond_10

    iget-object v2, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_10

    invoke-virtual/range {p0 .. p1}, Lb/c/a/e/f/b/f/a;->a(Landroid/view/MotionEvent;)F

    move-result v2

    iput v2, v0, Lb/c/a/e/f/b/f/a;->b:F

    invoke-virtual/range {p0 .. p1}, Lb/c/a/e/f/b/f/a;->b(Landroid/view/MotionEvent;)F

    move-result v2

    iput v2, v0, Lb/c/a/e/f/b/f/a;->c:F

    iget-object v2, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v1, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    const/16 v2, 0x3e8

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object v1, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v1

    iget-object v2, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v6

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v6

    iget v7, v0, Lb/c/a/e/f/b/f/a;->e:F

    cmpl-float v6, v6, v7

    if-ltz v6, :cond_10

    iget-object v6, v0, Lb/c/a/e/f/b/f/a;->a:Lb/c/a/e/f/b/f/d;

    neg-float v1, v1

    neg-float v2, v2

    check-cast v6, Lb/c/a/e/f/b/e;

    .line 3
    sget-boolean v7, Lb/c/a/e/f/b/e;->E:Z

    invoke-virtual {v6}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object v7

    new-instance v8, Lb/c/a/e/f/b/e$c;

    invoke-virtual {v7}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v8, v6, v9}, Lb/c/a/e/f/b/e$c;-><init>(Lb/c/a/e/f/b/e;Landroid/content/Context;)V

    iput-object v8, v6, Lb/c/a/e/f/b/e;->A:Lb/c/a/e/f/b/e$c;

    invoke-virtual {v6, v7}, Lb/c/a/e/f/b/e;->k(Landroid/widget/ImageView;)I

    move-result v9

    invoke-virtual {v6, v7}, Lb/c/a/e/f/b/e;->j(Landroid/widget/ImageView;)I

    move-result v10

    float-to-int v14, v1

    float-to-int v15, v2

    .line 4
    iget-object v1, v8, Lb/c/a/e/f/b/e$c;->e:Lb/c/a/e/f/b/e;

    invoke-virtual {v1}, Lb/c/a/e/f/b/e;->f()Landroid/graphics/RectF;

    move-result-object v1

    if-nez v1, :cond_b

    goto :goto_4

    :cond_b
    iget v2, v1, Landroid/graphics/RectF;->left:F

    neg-float v2, v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v12

    int-to-float v2, v9

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v9

    cmpg-float v9, v2, v9

    if-gez v9, :cond_c

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v9

    sub-float/2addr v9, v2

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v2

    move/from16 v16, v3

    goto :goto_2

    :cond_c
    move v2, v12

    move/from16 v16, v2

    :goto_2
    iget v9, v1, Landroid/graphics/RectF;->top:F

    neg-float v9, v9

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v13

    int-to-float v9, v10

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v10

    cmpg-float v10, v9, v10

    if-gez v10, :cond_d

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    sub-float/2addr v1, v9

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    move/from16 v18, v3

    goto :goto_3

    :cond_d
    move v1, v13

    move/from16 v18, v1

    :goto_3
    iput v12, v8, Lb/c/a/e/f/b/e$c;->c:I

    iput v13, v8, Lb/c/a/e/f/b/e$c;->d:I

    if-ne v12, v2, :cond_e

    if-eq v13, v1, :cond_f

    :cond_e
    iget-object v3, v8, Lb/c/a/e/f/b/e$c;->b:Lb/c/a/e/f/b/g/c;

    const/16 v20, 0x0

    const/16 v21, 0x0

    check-cast v3, Lb/c/a/e/f/b/g/a;

    .line 5
    iget-object v11, v3, Lb/c/a/e/f/b/g/a;->a:Landroid/widget/OverScroller;

    move/from16 v17, v2

    move/from16 v19, v1

    invoke-virtual/range {v11 .. v21}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    .line 6
    :cond_f
    :goto_4
    iget-object v1, v6, Lb/c/a/e/f/b/e;->A:Lb/c/a/e/f/b/e$c;

    invoke-virtual {v7, v1}, Landroid/widget/ImageView;->post(Ljava/lang/Runnable;)Z

    .line 7
    :cond_10
    iget-object v1, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_13

    .line 8
    :goto_5
    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v5, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    goto :goto_6

    .line 9
    :cond_11
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, v0, Lb/c/a/e/f/b/f/a;->f:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_12

    invoke-virtual {v2, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_12
    invoke-virtual/range {p0 .. p1}, Lb/c/a/e/f/b/f/a;->a(Landroid/view/MotionEvent;)F

    move-result v2

    iput v2, v0, Lb/c/a/e/f/b/f/a;->b:F

    invoke-virtual/range {p0 .. p1}, Lb/c/a/e/f/b/f/a;->b(Landroid/view/MotionEvent;)F

    move-result v1

    iput v1, v0, Lb/c/a/e/f/b/f/a;->c:F

    iput-boolean v3, v0, Lb/c/a/e/f/b/f/a;->g:Z

    :cond_13
    :goto_6
    return v4
.end method
