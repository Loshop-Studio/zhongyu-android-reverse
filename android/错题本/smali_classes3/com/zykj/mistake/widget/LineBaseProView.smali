.class public abstract Lcom/zykj/mistake/widget/LineBaseProView;
.super Lcom/zykj/mistake/widget/BaseProView;
.source "SourceFile"


# instance fields
.field public A:F

.field public B:Z

.field public C:[F

.field public D:[F

.field public final E:Landroid/graphics/Path;

.field public final F:Landroid/graphics/Path;

.field public v:F

.field public w:F

.field public x:F

.field public y:F

.field public z:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/zykj/mistake/widget/LineBaseProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/mistake/widget/LineBaseProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/mistake/widget/BaseProView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x1

    .line 4
    iput-boolean p3, p0, Lcom/zykj/mistake/widget/LineBaseProView;->B:Z

    .line 5
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->E:Landroid/graphics/Path;

    .line 6
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->F:Landroid/graphics/Path;

    .line 7
    sget-object v0, Lcom/zykj/mistake/R$styleable;->LineBaseProView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 8
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBaseProView_background_radius:I

    const/high16 v0, -0x40800000    # -1.0f

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/LineBaseProView;->v:F

    .line 9
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBaseProView_left_top_radius:I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/LineBaseProView;->w:F

    .line 10
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBaseProView_left_bottom_radius:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/LineBaseProView;->x:F

    .line 11
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBaseProView_right_top_radius:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/LineBaseProView;->y:F

    .line 12
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBaseProView_right_bottom_radius:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p2

    iput p2, p0, Lcom/zykj/mistake/widget/LineBaseProView;->z:F

    .line 13
    sget p2, Lcom/zykj/mistake/R$styleable;->LineBaseProView_progress_radius:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    iput p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->A:F

    .line 14
    iget p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->v:F

    cmpl-float p1, p1, v0

    if-nez p1, :cond_0

    .line 15
    iput-boolean p3, p0, Lcom/zykj/mistake/widget/LineBaseProView;->B:Z

    .line 16
    :cond_0
    iget p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->w:F

    cmpl-float p1, p1, v1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->x:F

    cmpl-float p1, p1, v1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->y:F

    cmpl-float p1, p1, v1

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->z:F

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return-void

    .line 17
    :cond_2
    :goto_0
    iput-boolean p3, p0, Lcom/zykj/mistake/widget/LineBaseProView;->B:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->v:F

    .line 6
    .line 7
    const/high16 v1, -0x40800000    # -1.0f

    .line 8
    .line 9
    cmpl-float v0, v0, v1

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget v0, p0, Lcom/zykj/mistake/widget/BaseProView;->c:I

    .line 14
    .line 15
    div-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    int-to-float v0, v0

    .line 18
    iput v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->v:F

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final varargs d([I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/a0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/blankj/utilcode/util/a0;-><init>(ILjava/lang/Object;ZLjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public getLeftBottomRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->x:F

    .line 2
    .line 3
    return v0
.end method

.method public getLeftTopRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->w:F

    .line 2
    .line 3
    return v0
.end method

.method public getProgressRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->A:F

    .line 2
    .line 3
    return v0
.end method

.method public getRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public getRightBottomRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->z:F

    .line 2
    .line 3
    return v0
.end method

.method public getRightTopRadius()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/widget/LineBaseProView;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public setLeftBottomRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->x:F

    .line 2
    .line 3
    return-void
.end method

.method public setLeftTopRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->w:F

    .line 2
    .line 3
    return-void
.end method

.method public setProgressRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->A:F

    .line 2
    .line 3
    return-void
.end method

.method public setRadius(F)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->v:F

    return-void
.end method

.method public setRadius(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->B:Z

    return-void
.end method

.method public setRightBottomRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->z:F

    .line 2
    .line 3
    return-void
.end method

.method public setRightTopRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/widget/LineBaseProView;->y:F

    .line 2
    .line 3
    return-void
.end method
