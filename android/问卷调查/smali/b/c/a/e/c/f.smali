.class public Lb/c/a/e/c/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lb/c/a/e/c/g;


# direct methods
.method public constructor <init>(Lb/c/a/e/c/g;)V
    .locals 0

    iput-object p1, p0, Lb/c/a/e/c/f;->a:Lb/c/a/e/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Lb/c/a/e/c/f;->a:Lb/c/a/e/c/g;

    iget-object v0, v0, Lb/c/a/e/c/g;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setY(F)V

    return-void
.end method
