.class public Lb/c/a/e/h/a/l;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Landroid/graphics/Path;

.field public static final b:Landroid/view/animation/Interpolator;


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    sput-object v7, Lb/c/a/e/h/a/l;->a:Landroid/graphics/Path;

    const/4 v0, 0x0

    invoke-virtual {v7, v0, v0}, Landroid/graphics/Path;->moveTo(FF)V

    const v1, 0x3ebba5e3    # 0.3665f

    invoke-virtual {v7, v1, v0}, Landroid/graphics/Path;->lineTo(FF)V

    const v1, 0x3ef1eef4

    const v2, 0x3d7fa189

    const v3, 0x3f1d8be9

    const/high16 v4, 0x3f000000    # 0.5f

    const v5, 0x3f2ee979

    const/high16 v6, 0x3f000000    # 0.5f

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    const v1, 0x3f413756

    const/high16 v2, 0x3f000000    # 0.5f

    const v3, 0x3f41dbae

    const v4, 0x3f5083bc

    const/high16 v5, 0x3f800000    # 1.0f

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 1
    new-instance v0, Landroid/view/animation/PathInterpolator;

    invoke-direct {v0, v7}, Landroid/view/animation/PathInterpolator;-><init>(Landroid/graphics/Path;)V

    .line 2
    sput-object v0, Lb/c/a/e/h/a/l;->b:Landroid/view/animation/Interpolator;

    return-void
.end method
