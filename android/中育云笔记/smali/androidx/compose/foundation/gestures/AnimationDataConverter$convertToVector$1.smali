.class final Landroidx/compose/foundation/gestures/AnimationDataConverter$convertToVector$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AnimationDataConverter;->getConvertToVector()Lhd/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/gestures/AnimationDataConverter$convertToVector$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/gestures/AnimationDataConverter$convertToVector$1;

    invoke-direct {v0}, Landroidx/compose/foundation/gestures/AnimationDataConverter$convertToVector$1;-><init>()V

    sput-object v0, Landroidx/compose/foundation/gestures/AnimationDataConverter$convertToVector$1;->INSTANCE:Landroidx/compose/foundation/gestures/AnimationDataConverter$convertToVector$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/foundation/gestures/AnimationData;)Landroidx/compose/animation/core/AnimationVector4D;
    .locals 7

    .line 1
    new-instance v0, Landroidx/compose/animation/core/AnimationVector4D;

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/AnimationData;->getZoom()F

    move-result v1

    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/AnimationData;->getOffset-F1C5BW0()J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    .line 2
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    .line 3
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/AnimationData;->getOffset-F1C5BW0()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    .line 4
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    .line 5
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/AnimationData;->getDegrees()F

    move-result p1

    invoke-direct {v0, v1, v2, v3, p1}, Landroidx/compose/animation/core/AnimationVector4D;-><init>(FFFF)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 6
    check-cast p1, Landroidx/compose/foundation/gestures/AnimationData;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/AnimationDataConverter$convertToVector$1;->invoke(Landroidx/compose/foundation/gestures/AnimationData;)Landroidx/compose/animation/core/AnimationVector4D;

    move-result-object p1

    return-object p1
.end method
