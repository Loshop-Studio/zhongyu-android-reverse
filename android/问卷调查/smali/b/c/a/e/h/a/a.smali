.class public Lb/c/a/e/h/a/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Landroid/graphics/Path;

.field public static final b:Landroid/graphics/Path;

.field public static final c:Landroid/graphics/Path;

.field public static final d:Landroid/graphics/Path;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v7, Landroid/graphics/Path;

    invoke-direct {v7}, Landroid/graphics/Path;-><init>()V

    sput-object v7, Lb/c/a/e/h/a/a;->a:Landroid/graphics/Path;

    const v0, -0x3bfd599a    # -522.6f

    const/4 v8, 0x0

    invoke-virtual {v7, v0, v8}, Landroid/graphics/Path;->moveTo(FF)V

    const v1, 0x42439950

    const/4 v2, 0x0

    const v3, 0x432606cd

    const/4 v4, 0x0

    const v5, 0x43969bd0

    const/4 v6, 0x0

    move-object v0, v7

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    const v1, 0x434594cf

    const v3, 0x43d27dc9

    const v5, 0x43d27dc9

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    sput-object v0, Lb/c/a/e/h/a/a;->b:Landroid/graphics/Path;

    const v1, 0x3dcccccd    # 0.1f

    invoke-virtual {v0, v8, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3f53ac64

    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v3, 0x40000000    # 2.0f

    invoke-virtual {v0, v3, v1}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    sput-object v0, Lb/c/a/e/h/a/a;->c:Landroid/graphics/Path;

    const v4, -0x3cba6666    # -197.6f

    invoke-virtual {v0, v4, v8}, Landroid/graphics/Path;->moveTo(FF)V

    const v10, 0x41648256

    const/4 v11, 0x0

    const v12, 0x42aa27d8

    const/4 v13, 0x0

    const v14, 0x43078c01

    const/4 v15, 0x0

    move-object v9, v0

    invoke-virtual/range {v9 .. v15}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    const v10, 0x42590c32

    const v12, 0x42b4d966

    const v14, 0x43283e4a

    invoke-virtual/range {v9 .. v15}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    const v10, 0x4310b8b7

    const v12, 0x439e3475

    const v14, 0x439e3475

    invoke-virtual/range {v9 .. v15}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    sput-object v0, Lb/c/a/e/h/a/a;->d:Landroid/graphics/Path;

    invoke-virtual {v0, v8, v1}, Landroid/graphics/Path;->moveTo(FF)V

    const v4, 0x3f1245ed

    invoke-virtual {v0, v2, v4}, Landroid/graphics/Path;->lineTo(FF)V

    const v2, 0x3f68f280

    invoke-virtual {v0, v3, v2}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v2, 0x40400000    # 3.0f

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    return-void
.end method
