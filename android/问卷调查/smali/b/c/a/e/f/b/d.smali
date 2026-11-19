.class public Lb/c/a/e/f/b/d;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source ""


# instance fields
.field public final synthetic a:Lb/c/a/e/f/b/e;


# direct methods
.method public constructor <init>(Lb/c/a/e/f/b/e;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/f/b/d;->a:Lb/c/a/e/f/b/e;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    iget-object v0, p0, Lb/c/a/e/f/b/d;->a:Lb/c/a/e/f/b/e;

    .line 1
    iget-object v1, v0, Lb/c/a/e/f/b/e;->v:Lb/c/a/e/f/b/e$g;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 2
    invoke-virtual {v0}, Lb/c/a/e/f/b/e;->l()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    .line 4
    sget v1, Lb/c/a/e/f/b/e;->F:I

    if-gt v0, v1, :cond_2

    .line 5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    .line 6
    sget v1, Lb/c/a/e/f/b/e;->F:I

    if-le v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb/c/a/e/f/b/d;->a:Lb/c/a/e/f/b/e;

    .line 7
    iget-object v0, v0, Lb/c/a/e/f/b/e;->v:Lb/c/a/e/f/b/e$g;

    .line 8
    invoke-interface {v0, p1, p2, p3, p4}, Lb/c/a/e/f/b/e$g;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v2
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    iget-object p1, p0, Lb/c/a/e/f/b/d;->a:Lb/c/a/e/f/b/e;

    .line 1
    iget-object v0, p1, Lb/c/a/e/f/b/e;->t:Landroid/view/View$OnLongClickListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getY()F

    move-result p1

    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-nez p1, :cond_0

    iget-object p1, p0, Lb/c/a/e/f/b/d;->a:Lb/c/a/e/f/b/e;

    invoke-virtual {p1}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ImageView;->getX()F

    move-result p1

    cmpl-float p1, p1, v0

    if-nez p1, :cond_0

    iget-object p1, p0, Lb/c/a/e/f/b/d;->a:Lb/c/a/e/f/b/e;

    .line 3
    iget-object v0, p1, Lb/c/a/e/f/b/e;->t:Landroid/view/View$OnLongClickListener;

    .line 4
    invoke-virtual {p1}, Lb/c/a/e/f/b/e;->i()Landroid/widget/ImageView;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    :cond_0
    return-void
.end method
