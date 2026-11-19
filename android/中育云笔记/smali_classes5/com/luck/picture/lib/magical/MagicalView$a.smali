.class public Lcom/luck/picture/lib/magical/MagicalView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/magical/MagicalView;->x(Z)V
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
    iput-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

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
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Float;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    iget-object v0, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/luck/picture/lib/magical/MagicalView;->a(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    int-to-float v2, p1

    .line 18
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->b(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-float v3, p1

    .line 25
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 26
    .line 27
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->l(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    int-to-float v4, p1

    .line 32
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 33
    .line 34
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->m(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    int-to-float v5, p1

    .line 39
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 40
    .line 41
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->n(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    int-to-float v6, p1

    .line 46
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->o(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    int-to-float v7, p1

    .line 53
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 54
    .line 55
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->p(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    int-to-float v8, p1

    .line 60
    iget-object p1, p0, Lcom/luck/picture/lib/magical/MagicalView$a;->a:Lcom/luck/picture/lib/magical/MagicalView;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/luck/picture/lib/magical/MagicalView;->q(Lcom/luck/picture/lib/magical/MagicalView;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    int-to-float v9, p1

    .line 67
    invoke-static/range {v0 .. v9}, Lcom/luck/picture/lib/magical/MagicalView;->r(Lcom/luck/picture/lib/magical/MagicalView;FFFFFFFFF)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
