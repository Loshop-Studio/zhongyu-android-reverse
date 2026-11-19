.class public abstract Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;
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
    const v2, 0x3e4ccccd    # 0.2f

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 14
    .line 15
    .line 16
    const v5, 0x3f177777

    .line 17
    .line 18
    .line 19
    const v6, 0x3ed58be5

    .line 20
    .line 21
    .line 22
    const v1, 0x3ecaaaab

    .line 23
    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    const v3, 0x3ef31ee5

    .line 27
    .line 28
    .line 29
    const v4, 0x3e53c2c1

    .line 30
    .line 31
    .line 32
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 33
    .line 34
    .line 35
    const/high16 v5, 0x3f800000    # 1.0f

    .line 36
    .line 37
    const/high16 v6, 0x3f800000    # 1.0f

    .line 38
    .line 39
    const v1, 0x3f3714cb

    .line 40
    .line 41
    .line 42
    const v2, 0x3f23ae62

    .line 43
    .line 44
    .line 45
    const v3, 0x3f50f5c3

    .line 46
    .line 47
    .line 48
    const v4, 0x3f797c90

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Landroidx/core/view/animation/PathInterpolatorCompat;->create(Landroid/graphics/Path;)Landroid/view/animation/Interpolator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    sput-object v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/l;->a:Landroid/view/animation/Interpolator;

    .line 59
    .line 60
    return-void
.end method
