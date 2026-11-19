.class public abstract Lcom/xuexiang/xui/widget/progress/materialprogressbar/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/view/animation/Interpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 8
    .line 9
    .line 10
    const/high16 v5, 0x3e800000    # 0.25f

    .line 11
    .line 12
    const v6, 0x3e5fcc7e

    .line 13
    .line 14
    .line 15
    const v1, 0x3d19999a    # 0.0375f

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const v3, 0x3e03dadf

    .line 20
    .line 21
    .line 22
    const v4, 0x3db75fc0

    .line 23
    .line 24
    .line 25
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 26
    .line 27
    .line 28
    const v5, 0x3ef77777

    .line 29
    .line 30
    .line 31
    const v6, 0x3efaca7f

    .line 32
    .line 33
    .line 34
    const v1, 0x3ea512f7

    .line 35
    .line 36
    .line 37
    const v2, 0x3e975a46

    .line 38
    .line 39
    .line 40
    const v3, 0x3edf92c6

    .line 41
    .line 42
    .line 43
    const v4, 0x3ed5ce8b

    .line 44
    .line 45
    .line 46
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 47
    .line 48
    .line 49
    const/high16 v5, 0x3f800000    # 1.0f

    .line 50
    .line 51
    const/high16 v6, 0x3f800000    # 1.0f

    .line 52
    .line 53
    const v1, 0x3f30a3d7    # 0.69f

    .line 54
    .line 55
    .line 56
    const v2, 0x3f4f4a01    # 0.80972296f

    .line 57
    .line 58
    .line 59
    const v3, 0x3f4b17e5

    .line 60
    .line 61
    .line 62
    const v4, 0x3f733442

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/n;->a:Landroid/view/animation/Interpolator;

    .line 73
    .line 74
    return-void
.end method
