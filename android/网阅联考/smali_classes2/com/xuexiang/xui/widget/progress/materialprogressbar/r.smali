.class public abstract Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;
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
    sput-object v7, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->a:Landroid/graphics/Path;

    .line 7
    .line 8
    const v1, 0x3e4ccccd    # 0.2f

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const v3, 0x3dcccccd    # 0.1f

    .line 13
    .line 14
    .line 15
    const/high16 v4, 0x3f800000    # 1.0f

    .line 16
    .line 17
    const/high16 v5, 0x3f000000    # 0.5f

    .line 18
    .line 19
    const/high16 v6, 0x3f800000    # 1.0f

    .line 20
    .line 21
    move-object v0, v7

    .line 22
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 23
    .line 24
    .line 25
    const/high16 v0, 0x3f800000    # 1.0f

    .line 26
    .line 27
    invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 28
    .line 29
    .line 30
    invoke-static {v7}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->b:Landroid/view/animation/Interpolator;

    .line 35
    .line 36
    return-void
.end method
