.class public final Ld3/a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Ld3/a;->a:I

    iput-object p1, p0, Ld3/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Ld3/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Ld3/a;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lw3/b;

    .line 13
    .line 14
    iget-object v0, p1, Lw3/b;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 15
    .line 16
    iget-boolean v1, v0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object p1, p1, Lw3/b;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget p1, p0, Ld3/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ld3/a;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lw3/b;

    .line 9
    .line 10
    iget-object v0, p1, Lw3/b;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 11
    .line 12
    iget-boolean v1, v0, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p1, Lw3/b;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    iput-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    iget-object p1, p0, Ld3/a;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lt3/c;

    .line 31
    .line 32
    iget-object p1, p1, Lt3/c;->b:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget-object v0, p1, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->q:Landroid/graphics/PointF;

    .line 43
    .line 44
    const/high16 v1, -0x3b860000    # -1000.0f

    .line 45
    .line 46
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 47
    .line 48
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 49
    .line 50
    const/4 v0, 0x4

    .line 51
    iput v0, p1, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->l:I

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->c(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 65
    .line 66
    .line 67
    :cond_1
    return-void

    .line 68
    :pswitch_1
    iget-object p1, p0, Ld3/a;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lcom/xuexiang/xui/widget/picker/RulerView;

    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
