.class public final Lf2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf2/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf2/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf2/a;->a:Lf2/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;JI)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p4, :cond_0

    .line 5
    .line 6
    new-instance p4, Landroid/view/animation/AlphaAnimation;

    .line 7
    .line 8
    invoke-direct {p4, v1, v0}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance p4, Landroid/view/animation/AlphaAnimation;

    .line 13
    .line 14
    invoke-direct {p4, v0, v1}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-virtual {p4, p2, p3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 18
    .line 19
    .line 20
    const/4 p2, 0x1

    .line 21
    invoke-virtual {p4, p2}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 22
    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1, p4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
.end method

.method public final b(Landroid/view/View;FFJ)V
    .locals 12

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getAlpha()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    const/high16 v2, 0x41f00000    # 30.0f

    .line 12
    .line 13
    const/high16 v3, 0x40000000    # 2.0f

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/high16 v0, 0x3f000000    # 0.5f

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Landroid/view/animation/ScaleAnimation;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    int-to-float v0, v0

    .line 29
    div-float v9, v0, v3

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-float v0, v0

    .line 36
    div-float/2addr v0, v3

    .line 37
    add-float v10, v0, v2

    .line 38
    .line 39
    move v7, p2

    .line 40
    move v8, p3

    .line 41
    move v5, p2

    .line 42
    move v6, p3

    .line 43
    invoke-direct/range {v4 .. v10}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 44
    .line 45
    .line 46
    :goto_0
    move-wide/from16 p2, p4

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 50
    .line 51
    .line 52
    new-instance v5, Landroid/view/animation/ScaleAnimation;

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    int-to-float v0, v0

    .line 59
    div-float v10, v0, v3

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    int-to-float v0, v0

    .line 66
    div-float/2addr v0, v3

    .line 67
    add-float v11, v0, v2

    .line 68
    .line 69
    move v8, p3

    .line 70
    move v9, p2

    .line 71
    move v7, p2

    .line 72
    move v6, p3

    .line 73
    invoke-direct/range {v5 .. v11}, Landroid/view/animation/ScaleAnimation;-><init>(FFFFFF)V

    .line 74
    .line 75
    .line 76
    move-object v4, v5

    .line 77
    goto :goto_0

    .line 78
    :goto_1
    invoke-virtual {v4, p2, p3}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 79
    .line 80
    .line 81
    const/4 p2, 0x1

    .line 82
    invoke-virtual {v4, p2}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method

.method public final c(JZ[Landroid/view/View;Lhd/a;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance p3, Landroid/view/animation/TranslateAnimation;

    .line 16
    .line 17
    aget-object v2, p4, v0

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    int-to-float v2, v2

    .line 24
    neg-float v2, v2

    .line 25
    invoke-direct {p3, v1, v2, v1, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    new-instance p3, Landroid/view/animation/TranslateAnimation;

    .line 30
    .line 31
    aget-object v2, p4, v0

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-float v2, v2

    .line 38
    neg-float v2, v2

    .line 39
    invoke-direct {p3, v2, v1, v1, v1}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p3, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 46
    .line 47
    .line 48
    array-length p1, p4

    .line 49
    :goto_1
    if-ge v0, p1, :cond_1

    .line 50
    .line 51
    aget-object p2, p4, v0

    .line 52
    .line 53
    invoke-virtual {p2, p3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance p1, Lf2/a$a;

    .line 60
    .line 61
    invoke-direct {p1, p5}, Lf2/a$a;-><init>(Lhd/a;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p3, p1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
