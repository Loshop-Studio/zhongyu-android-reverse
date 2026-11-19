.class public La/k/b/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic a:Landroid/view/ViewGroup;

.field public final synthetic b:La/k/b/m;

.field public final synthetic c:La/k/b/s0$a;

.field public final synthetic d:La/h/f/a;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;La/k/b/m;La/k/b/s0$a;La/h/f/a;)V
    .locals 0

    iput-object p1, p0, La/k/b/r;->a:Landroid/view/ViewGroup;

    iput-object p2, p0, La/k/b/r;->b:La/k/b/m;

    iput-object p3, p0, La/k/b/r;->c:La/k/b/s0$a;

    iput-object p4, p0, La/k/b/r;->d:La/h/f/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    iget-object p1, p0, La/k/b/r;->a:Landroid/view/ViewGroup;

    new-instance v0, La/k/b/r$a;

    invoke-direct {v0, p0}, La/k/b/r$a;-><init>(La/k/b/r;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    return-void
.end method
