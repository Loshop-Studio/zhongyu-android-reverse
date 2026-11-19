.class public final Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final ambientColor:J

.field private final clip:Z

.field private final elevation:F

.field private final shape:Landroidx/compose/ui/graphics/Shape;

.field private final spotColor:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(FLandroidx/compose/ui/graphics/Shape;ZJJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    .line 4
    iput-object p2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 5
    iput-boolean p3, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    .line 6
    iput-wide p4, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    .line 7
    iput-wide p6, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    return-void
.end method

.method public synthetic constructor <init>(FLandroidx/compose/ui/graphics/Shape;ZJJLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;-><init>(FLandroidx/compose/ui/graphics/Shape;ZJJ)V

    return-void
.end method

.method public static synthetic copy-gNMxBKI$default(Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget p1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-wide p4, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    :cond_3
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_4

    iget-wide p6, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    :cond_4
    move-wide p8, p6

    move-wide p6, p4

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->copy-gNMxBKI(FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    move-result-object p0

    return-object p0
.end method

.method private final createBlock()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$createBlock$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement$createBlock$1;-><init>(Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public final component1-D9Ej5fM()F
    .locals 1

    iget v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    return v0
.end method

.method public final component2()Landroidx/compose/ui/graphics/Shape;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    return v0
.end method

.method public final component4-0d7_KjU()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    return-wide v0
.end method

.method public final component5-0d7_KjU()J
    .locals 2

    iget-wide v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    return-wide v0
.end method

.method public final copy-gNMxBKI(FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;
    .locals 9

    new-instance v0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    const/4 v8, 0x0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-wide v6, p6

    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;-><init>(FLandroidx/compose/ui/graphics/Shape;ZJJLkotlin/jvm/internal/n;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->create()Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;

    move-result-object v0

    return-object v0
.end method

.method public create()Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;
    .locals 2

    .line 2
    new-instance v0, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;

    invoke-direct {p0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->createBlock()Lhd/l;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;-><init>(Lhd/l;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;

    iget v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    iget v3, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/Dp;->equals-impl0(FF)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    iget-object v3, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    iget-boolean v3, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    iget-wide v5, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    iget-wide v5, p1, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/graphics/Color;->equals-impl0(JJ)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAmbientColor-0d7_KjU()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getClip()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getElevation-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    .line 2
    .line 3
    return v0
.end method

.method public final getShape()Landroidx/compose/ui/graphics/Shape;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSpotColor-0d7_KjU()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3

    .line 1
    const-string/jumbo v0, "shadow"

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    .line 12
    .line 13
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "elevation"

    .line 18
    .line 19
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string/jumbo v1, "shape"

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-boolean v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    .line 39
    .line 40
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const-string v2, "clip"

    .line 45
    .line 46
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    .line 54
    .line 55
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v2, "ambientColor"

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-wide v0, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    .line 69
    .line 70
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-string/jumbo v1, "spotColor"

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1, v0}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ShadowGraphicsLayerElement(elevation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->elevation:F

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->toString-impl(F)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shape="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->shape:Landroidx/compose/ui/graphics/Shape;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", clip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->clip:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ambientColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->ambientColor:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", spotColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->spotColor:J

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/Color;->toString-impl(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->update(Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;)V

    return-void
.end method

.method public update(Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;->createBlock()Lhd/l;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;->setLayerBlock(Lhd/l;)V

    .line 3
    invoke-virtual {p1}, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier;->invalidateLayerBlock()V

    return-void
.end method
