.class public abstract Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/graphics/Path;

.field public static final b:Landroid/view/animation/Interpolator;


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
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->a:Landroid/graphics/Path;

    .line 7
    .line 8
    const/high16 v5, 0x3f000000    # 0.5f

    .line 9
    .line 10
    const/high16 v6, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const v1, 0x3e4ccccd    # 0.2f

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    const v3, 0x3dcccccd    # 0.1f

    .line 17
    .line 18
    .line 19
    const/high16 v4, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 22
    .line 23
    .line 24
    const/high16 v1, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-virtual {v0, v1, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/r;->b:Landroid/view/animation/Interpolator;

    .line 34
    .line 35
    return-void
.end method
