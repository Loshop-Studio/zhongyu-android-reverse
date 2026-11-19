.class public abstract Lcom/xuexiang/xui/widget/progress/materialprogressbar/m;
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
    const v5, 0x3eaaaaab

    .line 11
    .line 12
    .line 13
    const v6, 0x3eb2d26b

    .line 14
    .line 15
    .line 16
    const v1, 0x3d8bf745

    .line 17
    .line 18
    .line 19
    const v2, 0x3ca33b27

    .line 20
    .line 21
    .line 22
    const v3, 0x3e44d0f2

    .line 23
    .line 24
    .line 25
    const v4, 0x3e225c0e

    .line 26
    .line 27
    .line 28
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 29
    .line 30
    .line 31
    const v5, 0x3f2aaaab

    .line 32
    .line 33
    .line 34
    const v6, 0x3f2ecbf5

    .line 35
    .line 36
    .line 37
    const v1, 0x3ec4a953

    .line 38
    .line 39
    .line 40
    const v2, 0x3ed45dee

    .line 41
    .line 42
    .line 43
    const v3, 0x3f0ca946

    .line 44
    .line 45
    .line 46
    const v4, 0x3f2e6da1

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 50
    .line 51
    .line 52
    const/high16 v5, 0x3f800000    # 1.0f

    .line 53
    .line 54
    const/high16 v6, 0x3f800000    # 1.0f

    .line 55
    .line 56
    const v1, 0x3f40a97e

    .line 57
    .line 58
    .line 59
    const v2, 0x3f2e8a32

    .line 60
    .line 61
    .line 62
    const v3, 0x3f3cbcad

    .line 63
    .line 64
    .line 65
    const v4, 0x3f60ff57

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/m;->a:Landroid/view/animation/Interpolator;

    .line 76
    .line 77
    return-void
.end method
