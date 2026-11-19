.class public final Lw3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xw/repo/BubbleSeekBar;


# direct methods
.method public synthetic constructor <init>(Lcom/xw/repo/BubbleSeekBar;I)V
    .locals 0

    .line 1
    iput p2, p0, Lw3/b;->a:I

    iput-object p1, p0, Lw3/b;->b:Lcom/xw/repo/BubbleSeekBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lw3/b;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lw3/b;->b:Lcom/xw/repo/BubbleSeekBar;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/xw/repo/BubbleSeekBar;->o0:I

    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/xw/repo/BubbleSeekBar;->h()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, v1, Lcom/xw/repo/BubbleSeekBar;->P:Z

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object v0, v1, Lcom/xw/repo/BubbleSeekBar;->d0:Lw3/d;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-boolean v2, v1, Lcom/xw/repo/BubbleSeekBar;->B:Z

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x0

    .line 31
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-wide v1, v1, Lcom/xw/repo/BubbleSeekBar;->A:J

    .line 36
    .line 37
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Ld3/a;

    .line 42
    .line 43
    const/4 v2, 0x2

    .line 44
    invoke-direct {v1, p0, v2}, Ld3/a;-><init>(Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_1
    const/4 v0, 0x0

    .line 56
    iput-boolean v0, v1, Lcom/xw/repo/BubbleSeekBar;->k0:Z

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/xw/repo/BubbleSeekBar;->a()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_2
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
