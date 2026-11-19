.class public La/k/b/d;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Z

.field public final synthetic d:La/k/b/z0$d;

.field public final synthetic e:La/k/b/c$b;


# direct methods
.method public constructor <init>(La/k/b/c;Landroid/view/ViewGroup;Landroid/view/View;ZLa/k/b/z0$d;La/k/b/c$b;)V
    .locals 0

    iput-object p2, p0, La/k/b/d;->a:Landroid/view/ViewGroup;

    iput-object p3, p0, La/k/b/d;->b:Landroid/view/View;

    iput-boolean p4, p0, La/k/b/d;->c:Z

    iput-object p5, p0, La/k/b/d;->d:La/k/b/z0$d;

    iput-object p6, p0, La/k/b/d;->e:La/k/b/c$b;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, La/k/b/d;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, La/k/b/d;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-boolean p1, p0, La/k/b/d;->c:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, La/k/b/d;->d:La/k/b/z0$d;

    .line 1
    iget-object p1, p1, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    .line 2
    iget-object v0, p0, La/k/b/d;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, La/k/b/z0$d$c;->a(Landroid/view/View;)V

    :cond_0
    iget-object p1, p0, La/k/b/d;->e:La/k/b/c$b;

    invoke-virtual {p1}, La/k/b/c$c;->a()V

    return-void
.end method
