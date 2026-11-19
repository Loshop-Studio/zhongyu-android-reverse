.class public final Landroidx/compose/ui/text/BulletKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DefaultBullet:Landroidx/compose/ui/text/Bullet;

.field private static final DefaultBulletIndentation:J

.field private static final DefaultBulletPadding:J

.field private static final DefaultBulletSize:J


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getEm(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    sput-wide v0, Landroidx/compose/ui/text/BulletKt;->DefaultBulletIndentation:J

    .line 7
    .line 8
    const-wide/high16 v0, 0x3fd0000000000000L    # 0.25

    .line 9
    .line 10
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/TextUnitKt;->getEm(D)J

    .line 11
    .line 12
    .line 13
    move-result-wide v4

    .line 14
    sput-wide v4, Landroidx/compose/ui/text/BulletKt;->DefaultBulletSize:J

    .line 15
    .line 16
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/TextUnitKt;->getEm(D)J

    .line 17
    .line 18
    .line 19
    move-result-wide v6

    .line 20
    sput-wide v6, Landroidx/compose/ui/text/BulletKt;->DefaultBulletPadding:J

    .line 21
    .line 22
    new-instance v2, Landroidx/compose/ui/text/Bullet;

    .line 23
    .line 24
    sget-object v3, Landroidx/compose/ui/text/CircleShape;->INSTANCE:Landroidx/compose/ui/text/CircleShape;

    .line 25
    .line 26
    sget-object v10, Landroidx/compose/ui/graphics/drawscope/Fill;->INSTANCE:Landroidx/compose/ui/graphics/drawscope/Fill;

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v8, 0x0

    .line 30
    const/high16 v9, 0x3f800000    # 1.0f

    .line 31
    .line 32
    invoke-direct/range {v2 .. v11}, Landroidx/compose/ui/text/Bullet;-><init>(Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/drawscope/DrawStyle;Lkotlin/jvm/internal/n;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Landroidx/compose/ui/text/BulletKt;->DefaultBullet:Landroidx/compose/ui/text/Bullet;

    .line 36
    .line 37
    return-void
.end method

.method public static final getDefaultBullet()Landroidx/compose/ui/text/Bullet;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/text/BulletKt;->DefaultBullet:Landroidx/compose/ui/text/Bullet;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getDefaultBulletIndentation()J
    .locals 2

    .line 1
    sget-wide v0, Landroidx/compose/ui/text/BulletKt;->DefaultBulletIndentation:J

    .line 2
    .line 3
    return-wide v0
.end method
