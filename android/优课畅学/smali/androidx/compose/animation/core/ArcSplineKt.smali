.class public final Landroidx/compose/animation/core/ArcSplineKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ArcSplineArcAbove:I = 0x5

.field public static final ArcSplineArcBelow:I = 0x4

.field public static final ArcSplineArcStartFlip:I = 0x3

.field public static final ArcSplineArcStartHorizontal:I = 0x2

.field public static final ArcSplineArcStartLinear:I = 0x0

.field public static final ArcSplineArcStartVertical:I = 0x1

.field private static final DownArc:I = 0x4

.field private static final Epsilon:F = 0.001f

.field private static final HalfPi:F = 1.5707964f

.field private static final LutSize:I = 0x65

.field private static final OurPercentCache:[F

.field private static final StartHorizontal:I = 0x2

.field private static final StartLinear:I = 0x3

.field private static final StartVertical:I = 0x1

.field private static final UpArc:I = 0x5


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x5b

    .line 2
    .line 3
    new-array v0, v0, [F

    .line 4
    .line 5
    sput-object v0, Landroidx/compose/animation/core/ArcSplineKt;->OurPercentCache:[F

    .line 6
    .line 7
    return-void
.end method

.method public static final synthetic access$getOurPercentCache$p()[F
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/core/ArcSplineKt;->OurPercentCache:[F

    .line 2
    .line 3
    return-object v0
.end method
