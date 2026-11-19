.class public Lcom/luck/picture/lib/magical/MagicalView$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/magical/MagicalView;->y(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/magical/MagicalView;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/magical/MagicalView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Lcom/luck/picture/lib/magical/MagicalView;->h(Lcom/luck/picture/lib/magical/MagicalView;Z)Z

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Float;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Lcom/luck/picture/lib/magical/MagicalView;->j(Lcom/luck/picture/lib/magical/MagicalView;F)F

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->k(Lcom/luck/picture/lib/magical/MagicalView;)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 29
    .line 30
    invoke-static {v0}, Lcom/luck/picture/lib/magical/MagicalView;->i(Lcom/luck/picture/lib/magical/MagicalView;)F

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 38
    .line 39
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->g(Lcom/luck/picture/lib/magical/MagicalView;)Lt6/c;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-eqz p1, :cond_0

    .line 44
    .line 45
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 46
    .line 47
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->g(Lcom/luck/picture/lib/magical/MagicalView;)Lt6/c;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView$e;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/luck/picture/lib/magical/MagicalView;->i(Lcom/luck/picture/lib/magical/MagicalView;)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-interface {p1, v0}, Lt6/c;->a(F)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method
