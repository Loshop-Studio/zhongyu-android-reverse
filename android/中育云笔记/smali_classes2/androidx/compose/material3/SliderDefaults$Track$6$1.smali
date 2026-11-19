.class final Landroidx/compose/material3/SliderDefaults$Track$6$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SliderDefaults;->Track-4EFweAY(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/SliderColors;Lhd/p;Lhd/q;FFLandroidx/compose/runtime/Composer;II)V
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


# instance fields
.field final synthetic $activeTickColor:J

.field final synthetic $activeTrackColor:J

.field final synthetic $drawStopIndicator:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $drawTick:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field final synthetic $inactiveTickColor:J

.field final synthetic $inactiveTrackColor:J

.field final synthetic $sliderState:Landroidx/compose/material3/SliderState;

.field final synthetic $thumbTrackGapSize:F

.field final synthetic $trackInsideCornerSize:F


# direct methods
.method public constructor <init>(Landroidx/compose/material3/SliderState;JJJJFFLhd/p;Lhd/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SliderState;",
            "JJJJFF",
            "Lhd/p;",
            "Lhd/q;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$sliderState:Landroidx/compose/material3/SliderState;

    .line 2
    .line 3
    iput-wide p2, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$inactiveTrackColor:J

    .line 4
    .line 5
    iput-wide p4, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$activeTrackColor:J

    .line 6
    .line 7
    iput-wide p6, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$inactiveTickColor:J

    .line 8
    .line 9
    iput-wide p8, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$activeTickColor:J

    .line 10
    .line 11
    iput p10, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$thumbTrackGapSize:F

    .line 12
    .line 13
    iput p11, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$trackInsideCornerSize:F

    .line 14
    .line 15
    iput-object p12, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$drawStopIndicator:Lhd/p;

    .line 16
    .line 17
    iput-object p13, p0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$drawTick:Lhd/q;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/graphics/drawscope/DrawScope;

    invoke-virtual {p0, p1}, Landroidx/compose/material3/SliderDefaults$Track$6$1;->invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 2
    sget-object v1, Landroidx/compose/material3/SliderDefaults;->INSTANCE:Landroidx/compose/material3/SliderDefaults;

    .line 3
    iget-object v3, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$sliderState:Landroidx/compose/material3/SliderState;

    invoke-virtual {v3}, Landroidx/compose/material3/SliderState;->getTickFractions$material3_release()[F

    move-result-object v3

    .line 4
    iget-object v4, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$sliderState:Landroidx/compose/material3/SliderState;

    invoke-virtual {v4}, Landroidx/compose/material3/SliderState;->getCoercedValueAsFraction$material3_release()F

    move-result v5

    .line 5
    iget-wide v6, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$inactiveTrackColor:J

    .line 6
    iget-wide v8, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$activeTrackColor:J

    .line 7
    iget-wide v10, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$inactiveTickColor:J

    .line 8
    iget-wide v12, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$activeTickColor:J

    .line 9
    iget-object v4, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$sliderState:Landroidx/compose/material3/SliderState;

    invoke-virtual {v4}, Landroidx/compose/material3/SliderState;->getTrackHeight$material3_release()F

    move-result v4

    invoke-interface {v2, v4}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(F)F

    move-result v14

    const/4 v4, 0x0

    .line 10
    invoke-interface {v2, v4}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    move-result v15

    .line 11
    iget-object v4, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$sliderState:Landroidx/compose/material3/SliderState;

    invoke-virtual {v4}, Landroidx/compose/material3/SliderState;->getThumbWidth$material3_release()F

    move-result v4

    invoke-interface {v2, v4}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(F)F

    move-result v16

    .line 12
    iget v4, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$thumbTrackGapSize:F

    move-object/from16 v17, v1

    .line 13
    iget v1, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$trackInsideCornerSize:F

    move/from16 v18, v1

    .line 14
    iget-object v1, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$drawStopIndicator:Lhd/p;

    move-object/from16 v19, v1

    .line 15
    iget-object v1, v0, Landroidx/compose/material3/SliderDefaults$Track$6$1;->$drawTick:Lhd/q;

    const/16 v21, 0x0

    move-object/from16 v20, v1

    move-object/from16 v1, v17

    move/from16 v17, v4

    const/4 v4, 0x0

    .line 16
    invoke-static/range {v1 .. v21}, Landroidx/compose/material3/SliderDefaults;->access$drawTrack-ngJ0SCU(Landroidx/compose/material3/SliderDefaults;Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJFFFFFLhd/p;Lhd/q;Z)V

    return-void
.end method
