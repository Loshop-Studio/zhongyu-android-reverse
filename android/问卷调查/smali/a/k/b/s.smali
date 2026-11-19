.class public La/k/b/s;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:La/k/b/m;

.field public final synthetic d:La/k/b/s0$a;

.field public final synthetic e:La/h/f/a;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;La/k/b/m;La/k/b/s0$a;La/h/f/a;)V
    .locals 0

    iput-object p1, p0, La/k/b/s;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, La/k/b/s;->b:Landroid/view/View;

    iput-object p3, p0, La/k/b/s;->c:La/k/b/m;

    iput-object p4, p0, La/k/b/s;->d:La/k/b/s0$a;

    iput-object p5, p0, La/k/b/s;->e:La/h/f/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, La/k/b/s;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, La/k/b/s;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object p1, p0, La/k/b/s;->c:La/k/b/m;

    .line 1
    iget-object v0, p1, La/k/b/m;->J:La/k/b/m$b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, La/k/b/m$b;->b:Landroid/animation/Animator;

    .line 2
    :goto_0
    invoke-virtual {p1, v1}, La/k/b/m;->o0(Landroid/animation/Animator;)V

    if-eqz v0, :cond_1

    iget-object p1, p0, La/k/b/s;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, La/k/b/s;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    if-gez p1, :cond_1

    iget-object p1, p0, La/k/b/s;->d:La/k/b/s0$a;

    iget-object v0, p0, La/k/b/s;->c:La/k/b/m;

    iget-object v1, p0, La/k/b/s;->e:La/h/f/a;

    check-cast p1, La/k/b/c0$d;

    invoke-virtual {p1, v0, v1}, La/k/b/c0$d;->a(La/k/b/m;La/h/f/a;)V

    :cond_1
    return-void
.end method
