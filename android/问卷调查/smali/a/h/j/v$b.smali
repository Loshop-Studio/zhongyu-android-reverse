.class public La/h/j/v$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/h/j/v;->f(La/h/j/y;)La/h/j/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/h/j/y;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(La/h/j/v;La/h/j/y;Landroid/view/View;)V
    .locals 0

    iput-object p2, p0, La/h/j/v$b;->a:La/h/j/y;

    iput-object p3, p0, La/h/j/v$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    iget-object p1, p0, La/h/j/v$b;->a:La/h/j/y;

    check-cast p1, La/b/c/s$c;

    .line 1
    iget-object p1, p1, La/b/c/s$c;->a:La/b/c/s;

    iget-object p1, p1, La/b/c/s;->d:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
