.class public La/h/j/v$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/h/j/v;->e(Landroid/view/View;La/h/j/w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/h/j/w;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(La/h/j/v;La/h/j/w;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, La/h/j/v$a;->a:La/h/j/w;

    iput-object p3, p0, La/h/j/v$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, La/h/j/v$a;->a:La/h/j/w;

    iget-object v0, p0, La/h/j/v$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/h/j/w;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, La/h/j/v$a;->a:La/h/j/w;

    iget-object v0, p0, La/h/j/v$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/h/j/w;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, La/h/j/v$a;->a:La/h/j/w;

    iget-object v0, p0, La/h/j/v$a;->b:Landroid/view/View;

    invoke-interface {p1, v0}, La/h/j/w;->b(Landroid/view/View;)V

    return-void
.end method
