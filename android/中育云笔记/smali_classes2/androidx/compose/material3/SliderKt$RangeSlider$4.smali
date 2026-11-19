.class final Landroidx/compose/material3/SliderKt$RangeSlider$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/SliderKt;->RangeSlider(Lnd/f;Lhd/l;Landroidx/compose/ui/Modifier;ZLnd/f;ILhd/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/p;"
    }
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $colors:Landroidx/compose/material3/SliderColors;

.field final synthetic $enabled:Z

.field final synthetic $modifier:Landroidx/compose/ui/Modifier;

.field final synthetic $onValueChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onValueChangeFinished:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $steps:I

.field final synthetic $value:Lnd/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnd/f;"
        }
    .end annotation
.end field

.field final synthetic $valueRange:Lnd/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnd/f;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnd/f;Lhd/l;Landroidx/compose/ui/Modifier;ZLnd/f;ILhd/a;Landroidx/compose/material3/SliderColors;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnd/f;",
            "Lhd/l;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lnd/f;",
            "I",
            "Lhd/a;",
            "Landroidx/compose/material3/SliderColors;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$value:Lnd/f;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$onValueChange:Lhd/l;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$modifier:Landroidx/compose/ui/Modifier;

    .line 6
    .line 7
    iput-boolean p4, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$enabled:Z

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$valueRange:Lnd/f;

    .line 10
    .line 11
    iput p6, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$steps:I

    .line 12
    .line 13
    iput-object p7, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$onValueChangeFinished:Lhd/a;

    .line 14
    .line 15
    iput-object p8, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$colors:Landroidx/compose/material3/SliderColors;

    .line 16
    .line 17
    iput p9, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$$changed:I

    .line 18
    .line 19
    iput p10, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$$default:I

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/SliderKt$RangeSlider$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 2
    iget-object v0, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$value:Lnd/f;

    iget-object v1, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$onValueChange:Lhd/l;

    iget-object v2, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$modifier:Landroidx/compose/ui/Modifier;

    iget-boolean v3, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$enabled:Z

    iget-object v4, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$valueRange:Lnd/f;

    iget v5, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$steps:I

    iget-object v6, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$onValueChangeFinished:Lhd/a;

    iget-object v7, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$colors:Landroidx/compose/material3/SliderColors;

    iget p2, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$$changed:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v9

    iget v10, p0, Landroidx/compose/material3/SliderKt$RangeSlider$4;->$$default:I

    move-object v8, p1

    invoke-static/range {v0 .. v10}, Landroidx/compose/material3/SliderKt;->RangeSlider(Lnd/f;Lhd/l;Landroidx/compose/ui/Modifier;ZLnd/f;ILhd/a;Landroidx/compose/material3/SliderColors;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
