.class public abstract Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/graphics/Path;

.field public static final b:Landroid/view/animation/Interpolator;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v7, Landroid/graphics/Path;

    .line 2
    .line 3
    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->a:Landroid/graphics/Path;

    .line 7
    .line 8
    const/high16 v0, 0x3f000000    # 0.5f

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v7, v0, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 12
    .line 13
    .line 14
    const v1, 0x3f333333    # 0.7f

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const v3, 0x3f19999a    # 0.6f

    .line 19
    .line 20
    .line 21
    const/high16 v4, 0x3f800000    # 1.0f

    .line 22
    .line 23
    const/high16 v5, 0x3f800000    # 1.0f

    .line 24
    .line 25
    const/high16 v6, 0x3f800000    # 1.0f

    .line 26
    .line 27
    move-object v0, v7

    .line 28
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 29
    .line 30
    .line 31
    invoke-static {v7}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/s;->b:Landroid/view/animation/Interpolator;

    .line 36
    .line 37
    return-void
.end method
