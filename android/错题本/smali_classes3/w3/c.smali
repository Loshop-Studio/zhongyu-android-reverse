.class public final Lw3/c;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xw/repo/BubbleSeekBar;


# direct methods
.method public synthetic constructor <init>(Lcom/xw/repo/BubbleSeekBar;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw3/c;->a:I

    iput-object p1, p0, Lw3/c;->b:Lcom/xw/repo/BubbleSeekBar;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lw3/c;->a:I

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
    iget-object p1, p0, Lw3/c;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 11
    .line 12
    iget-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lcom/xw/repo/BubbleSeekBar;->d()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p1, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->k0:Z

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    const/4 p1, 0x0

    .line 40
    iget-object v0, p0, Lw3/c;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 41
    .line 42
    iput-boolean p1, v0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, Lw3/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Lw3/c;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 11
    .line 12
    iget-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->D:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/xw/repo/BubbleSeekBar;->f()V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p1}, Lcom/xw/repo/BubbleSeekBar;->d()F

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iput v0, p1, Lcom/xw/repo/BubbleSeekBar;->c:F

    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p1, Lcom/xw/repo/BubbleSeekBar;->k0:Z

    .line 34
    .line 35
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_1
    const/4 p1, 0x0

    .line 43
    iget-object v0, p0, Lw3/c;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 44
    .line 45
    iput-boolean p1, v0, Lcom/xw/repo/BubbleSeekBar;->N:Z

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Lw3/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    iget-object p1, p0, Lw3/c;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 11
    .line 12
    iget-object v0, p1, Lcom/xw/repo/BubbleSeekBar;->c0:Landroid/view/WindowManager;

    .line 13
    .line 14
    iget-object v1, p1, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 15
    .line 16
    iget-object p1, p1, Lcom/xw/repo/BubbleSeekBar;->i0:Landroid/view/WindowManager$LayoutParams;

    .line 17
    .line 18
    invoke-interface {v0, v1, p1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
