.class public Lcom/xw/repo/BubbleSeekBar$f;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xw/repo/BubbleSeekBar;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xw/repo/BubbleSeekBar;


# direct methods
.method public constructor <init>(Lcom/xw/repo/BubbleSeekBar;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->c(Lcom/xw/repo/BubbleSeekBar;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->s(Lcom/xw/repo/BubbleSeekBar;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->t(Lcom/xw/repo/BubbleSeekBar;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->y(Lcom/xw/repo/BubbleSeekBar;)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {p1, v0}, Lcom/xw/repo/BubbleSeekBar;->x(Lcom/xw/repo/BubbleSeekBar;F)F

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-static {p1, v0}, Lcom/xw/repo/BubbleSeekBar;->o(Lcom/xw/repo/BubbleSeekBar;Z)Z

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-static {p1, v0}, Lcom/xw/repo/BubbleSeekBar;->a(Lcom/xw/repo/BubbleSeekBar;Z)Z

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->c(Lcom/xw/repo/BubbleSeekBar;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->s(Lcom/xw/repo/BubbleSeekBar;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 18
    .line 19
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->t(Lcom/xw/repo/BubbleSeekBar;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->y(Lcom/xw/repo/BubbleSeekBar;)F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-static {p1, v0}, Lcom/xw/repo/BubbleSeekBar;->x(Lcom/xw/repo/BubbleSeekBar;F)F

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-static {p1, v0}, Lcom/xw/repo/BubbleSeekBar;->o(Lcom/xw/repo/BubbleSeekBar;Z)Z

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 38
    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-static {p1, v0}, Lcom/xw/repo/BubbleSeekBar;->a(Lcom/xw/repo/BubbleSeekBar;Z)Z

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/xw/repo/BubbleSeekBar$f;->a:Lcom/xw/repo/BubbleSeekBar;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/xw/repo/BubbleSeekBar;->k(Lcom/xw/repo/BubbleSeekBar;)Lcom/xw/repo/BubbleSeekBar$k;

    .line 51
    .line 52
    .line 53
    return-void
.end method
