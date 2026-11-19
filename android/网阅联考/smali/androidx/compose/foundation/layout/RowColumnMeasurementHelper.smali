.class public final Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001Br\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J2\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00162\u0008\u0010-\u001a\u0004\u0018\u00010)2\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u0006H\u0002J(\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00062\u0006\u00103\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00104\u001a\u000205H\u0002J3\u00106\u001a\u0002072\u0006\u00104\u001a\u0002052\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u0006\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=J&\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002072\u0006\u0010B\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0008J\n\u0010\r\u001a\u00020\u0006*\u00020\u0016J\n\u0010C\u001a\u00020\u0006*\u00020\u0016R5\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\u00020\u000c\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u001b\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\u0008%\u0010&R\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u0015X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010*\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006D"
    }
    d2 = {
        "Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;",
        "",
        "orientation",
        "Landroidx/compose/foundation/layout/LayoutOrientation;",
        "arrangement",
        "Lkotlin/Function5;",
        "",
        "",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "Landroidx/compose/ui/unit/Density;",
        "",
        "arrangementSpacing",
        "Landroidx/compose/ui/unit/Dp;",
        "crossAxisSize",
        "Landroidx/compose/foundation/layout/SizeMode;",
        "crossAxisAlignment",
        "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "measurables",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "placeables",
        "",
        "Landroidx/compose/ui/layout/Placeable;",
        "(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getArrangement",
        "()Lkotlin/jvm/functions/Function5;",
        "getArrangementSpacing-D9Ej5fM",
        "()F",
        "F",
        "getCrossAxisAlignment",
        "()Landroidx/compose/foundation/layout/CrossAxisAlignment;",
        "getCrossAxisSize",
        "()Landroidx/compose/foundation/layout/SizeMode;",
        "getMeasurables",
        "()Ljava/util/List;",
        "getOrientation",
        "()Landroidx/compose/foundation/layout/LayoutOrientation;",
        "getPlaceables",
        "()[Landroidx/compose/ui/layout/Placeable;",
        "[Landroidx/compose/ui/layout/Placeable;",
        "rowColumnParentData",
        "Landroidx/compose/foundation/layout/RowColumnParentData;",
        "[Landroidx/compose/foundation/layout/RowColumnParentData;",
        "getCrossAxisPosition",
        "placeable",
        "parentData",
        "crossAxisLayoutSize",
        "layoutDirection",
        "beforeCrossAxisAlignmentLine",
        "mainAxisPositions",
        "mainAxisLayoutSize",
        "childrenMainAxisSize",
        "measureScope",
        "Landroidx/compose/ui/layout/MeasureScope;",
        "measureWithoutPlacing",
        "Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "startIndex",
        "endIndex",
        "measureWithoutPlacing-_EkL_-Y",
        "(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;",
        "placeHelper",
        "placeableScope",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "measureResult",
        "crossAxisOffset",
        "mainAxisSize",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRowColumnMeasurementHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnMeasurementHelper.kt\nandroidx/compose/foundation/layout/RowColumnMeasurementHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"
    }
.end annotation


# instance fields
.field private final arrangement:Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/unit/Density;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final arrangementSpacing:F

.field private final crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

.field private final crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

.field private final measurables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;"
        }
    .end annotation
.end field

.field private final orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

.field private final placeables:[Landroidx/compose/ui/layout/Placeable;

.field private final rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;


# direct methods
.method private constructor <init>(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/LayoutOrientation;",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Ljava/lang/Integer;",
            "-[I-",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "-",
            "Landroidx/compose/ui/unit/Density;",
            "-[I",
            "Lkotlin/Unit;",
            ">;F",
            "Landroidx/compose/foundation/layout/SizeMode;",
            "Landroidx/compose/foundation/layout/CrossAxisAlignment;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;[",
            "Landroidx/compose/ui/layout/Placeable;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 4
    iput-object p2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangement:Lkotlin/jvm/functions/Function5;

    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangementSpacing:F

    .line 6
    iput-object p4, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    .line 7
    iput-object p5, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 8
    iput-object p6, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 9
    iput-object p7, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 10
    invoke-interface {p6}, Ljava/util/List;->size()I

    move-result p1

    new-array p2, p1, [Landroidx/compose/foundation/layout/RowColumnParentData;

    const/4 p3, 0x0

    :goto_0
    if-ge p3, p1, :cond_0

    .line 11
    iget-object p4, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    invoke-interface {p4, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    invoke-static {p4}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    move-result-object p4

    aput-object p4, p2, p3

    add-int/lit8 p3, p3, 0x1

    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;-><init>(Landroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/functions/Function5;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;)V

    return-void
.end method

.method private final getCrossAxisPosition(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;ILandroidx/compose/ui/unit/LayoutDirection;I)I
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnParentData;->getCrossAxisAlignment()Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-nez p2, :cond_1

    .line 8
    .line 9
    :cond_0
    iget-object p2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sub-int/2addr p3, v0

    .line 16
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 17
    .line 18
    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 19
    .line 20
    if-ne v0, v1, :cond_2

    .line 21
    .line 22
    sget-object p4, Landroidx/compose/ui/unit/LayoutDirection;->Ltr:Landroidx/compose/ui/unit/LayoutDirection;

    .line 23
    .line 24
    :cond_2
    invoke-virtual {p2, p3, p4, p1, p5}, Landroidx/compose/foundation/layout/CrossAxisAlignment;->align$foundation_layout_release(ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/layout/Placeable;I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    return p1
.end method

.method private final mainAxisPositions(I[I[ILandroidx/compose/ui/layout/MeasureScope;)[I
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangement:Lkotlin/jvm/functions/Function5;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p4}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    move-object v2, p2

    .line 12
    move-object v4, p4

    .line 13
    move-object v5, p3

    .line 14
    invoke-interface/range {v0 .. v5}, Lkotlin/jvm/functions/Function5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-object p3
.end method


# virtual methods
.method public final crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 7
    .line 8
    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    :goto_0
    return p1
.end method

.method public final getArrangement()Lkotlin/jvm/functions/Function5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function5<",
            "Ljava/lang/Integer;",
            "[I",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/unit/Density;",
            "[I",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangement:Lkotlin/jvm/functions/Function5;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getArrangementSpacing-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangementSpacing:F

    .line 2
    .line 3
    return v0
.end method

.method public final getCrossAxisAlignment()Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisAlignment:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCrossAxisSize()Landroidx/compose/foundation/layout/SizeMode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMeasurables()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOrientation()Landroidx/compose/foundation/layout/LayoutOrientation;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceables()[Landroidx/compose/ui/layout/Placeable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 7
    .line 8
    sget-object v1, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    :goto_0
    return p1
.end method

.method public final measureWithoutPlacing-_EkL_-Y(Landroidx/compose/ui/layout/MeasureScope;JII)Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v5, p5

    .line 6
    .line 7
    const-string v2, "measureScope"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;

    .line 13
    .line 14
    iget-object v3, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    move-wide/from16 v6, p2

    .line 18
    .line 19
    invoke-direct {v2, v6, v7, v3, v4}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;-><init>(JLandroidx/compose/foundation/layout/LayoutOrientation;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    iget v3, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->arrangementSpacing:F

    .line 23
    .line 24
    invoke-interface {v1, v3}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    sub-int v13, v5, p4

    .line 29
    .line 30
    const/4 v14, 0x0

    .line 31
    move/from16 v12, p4

    .line 32
    .line 33
    move/from16 v17, v14

    .line 34
    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v11, 0x0

    .line 37
    const/16 v16, 0x0

    .line 38
    .line 39
    const/16 v18, 0x0

    .line 40
    .line 41
    const/16 v19, 0x0

    .line 42
    .line 43
    :goto_0
    const v7, 0x7fffffff

    .line 44
    .line 45
    .line 46
    const/16 v20, 0x1

    .line 47
    .line 48
    if-ge v12, v5, :cond_5

    .line 49
    .line 50
    iget-object v8, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 51
    .line 52
    invoke-interface {v8, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    move-object v10, v8

    .line 57
    check-cast v10, Landroidx/compose/ui/layout/Measurable;

    .line 58
    .line 59
    iget-object v8, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 60
    .line 61
    aget-object v21, v8, v12

    .line 62
    .line 63
    invoke-static/range {v21 .. v21}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 64
    .line 65
    .line 66
    move-result v8

    .line 67
    cmpl-float v9, v8, v14

    .line 68
    .line 69
    if-lez v9, :cond_0

    .line 70
    .line 71
    add-float v17, v17, v8

    .line 72
    .line 73
    add-int/lit8 v16, v16, 0x1

    .line 74
    .line 75
    move/from16 v24, v12

    .line 76
    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_0
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMax()I

    .line 80
    .line 81
    .line 82
    move-result v9

    .line 83
    iget-object v6, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 84
    .line 85
    aget-object v6, v6, v12

    .line 86
    .line 87
    if-nez v6, :cond_2

    .line 88
    .line 89
    const/4 v8, 0x0

    .line 90
    if-ne v9, v7, :cond_1

    .line 91
    .line 92
    move/from16 v22, v7

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    sub-int v6, v9, v18

    .line 96
    .line 97
    move/from16 v22, v6

    .line 98
    .line 99
    :goto_1
    const/16 v23, 0x0

    .line 100
    .line 101
    const/16 v24, 0x0

    .line 102
    .line 103
    const/16 v25, 0x8

    .line 104
    .line 105
    const/16 v26, 0x0

    .line 106
    .line 107
    move-object v6, v2

    .line 108
    move v7, v8

    .line 109
    move/from16 v8, v22

    .line 110
    .line 111
    move/from16 v22, v9

    .line 112
    .line 113
    move/from16 v9, v23

    .line 114
    .line 115
    move-object v4, v10

    .line 116
    move/from16 v10, v24

    .line 117
    .line 118
    move v15, v11

    .line 119
    move/from16 v11, v25

    .line 120
    .line 121
    move/from16 v24, v12

    .line 122
    .line 123
    move-object/from16 v12, v26

    .line 124
    .line 125
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->copy$default(Landroidx/compose/foundation/layout/OrientationIndependentConstraints;IIIIILjava/lang/Object;)Landroidx/compose/foundation/layout/OrientationIndependentConstraints;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    iget-object v7, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 130
    .line 131
    invoke-virtual {v6, v7}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(Landroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v6

    .line 135
    invoke-interface {v4, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    goto :goto_2

    .line 140
    :cond_2
    move/from16 v22, v9

    .line 141
    .line 142
    move v15, v11

    .line 143
    move/from16 v24, v12

    .line 144
    .line 145
    :goto_2
    sub-int v9, v22, v18

    .line 146
    .line 147
    invoke-virtual {v0, v6}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    sub-int/2addr v9, v4

    .line 152
    invoke-static {v3, v9}, Ljava/lang/Math;->min(II)I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    invoke-virtual {v0, v6}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 157
    .line 158
    .line 159
    move-result v7

    .line 160
    add-int/2addr v7, v4

    .line 161
    add-int v18, v18, v7

    .line 162
    .line 163
    invoke-virtual {v0, v6}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-static {v15, v7}, Ljava/lang/Math;->max(II)I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    if-nez v19, :cond_4

    .line 172
    .line 173
    invoke-static/range {v21 .. v21}, Landroidx/compose/foundation/layout/RowColumnImplKt;->isRelative(Landroidx/compose/foundation/layout/RowColumnParentData;)Z

    .line 174
    .line 175
    .line 176
    move-result v7

    .line 177
    if-eqz v7, :cond_3

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_3
    const/16 v19, 0x0

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :cond_4
    :goto_3
    move/from16 v19, v20

    .line 184
    .line 185
    :goto_4
    iget-object v7, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 186
    .line 187
    aput-object v6, v7, v24

    .line 188
    .line 189
    move v6, v4

    .line 190
    :goto_5
    add-int/lit8 v12, v24, 0x1

    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    goto/16 :goto_0

    .line 194
    .line 195
    :cond_5
    move v15, v11

    .line 196
    if-nez v16, :cond_6

    .line 197
    .line 198
    sub-int v18, v18, v6

    .line 199
    .line 200
    move v11, v15

    .line 201
    const/4 v14, 0x0

    .line 202
    goto/16 :goto_f

    .line 203
    .line 204
    :cond_6
    cmpl-float v4, v17, v14

    .line 205
    .line 206
    if-lez v4, :cond_7

    .line 207
    .line 208
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMax()I

    .line 209
    .line 210
    .line 211
    move-result v6

    .line 212
    if-eq v6, v7, :cond_7

    .line 213
    .line 214
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMax()I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    goto :goto_6

    .line 219
    :cond_7
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMin()I

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    :goto_6
    sub-int v6, v6, v18

    .line 224
    .line 225
    add-int/lit8 v16, v16, -0x1

    .line 226
    .line 227
    mul-int v3, v3, v16

    .line 228
    .line 229
    sub-int/2addr v6, v3

    .line 230
    if-lez v4, :cond_8

    .line 231
    .line 232
    int-to-float v4, v6

    .line 233
    div-float v4, v4, v17

    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_8
    move v4, v14

    .line 237
    :goto_7
    invoke-static/range {p4 .. p5}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    const/4 v9, 0x0

    .line 246
    :goto_8
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    if-eqz v10, :cond_9

    .line 251
    .line 252
    move-object v10, v8

    .line 253
    check-cast v10, Lkotlin/collections/IntIterator;

    .line 254
    .line 255
    invoke-virtual {v10}, Lkotlin/collections/IntIterator;->nextInt()I

    .line 256
    .line 257
    .line 258
    move-result v10

    .line 259
    iget-object v11, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 260
    .line 261
    aget-object v10, v11, v10

    .line 262
    .line 263
    invoke-static {v10}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 264
    .line 265
    .line 266
    move-result v10

    .line 267
    mul-float/2addr v10, v4

    .line 268
    invoke-static {v10}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 269
    .line 270
    .line 271
    move-result v10

    .line 272
    add-int/2addr v9, v10

    .line 273
    goto :goto_8

    .line 274
    :cond_9
    sub-int/2addr v6, v9

    .line 275
    move/from16 v8, p4

    .line 276
    .line 277
    move v11, v15

    .line 278
    const/4 v9, 0x0

    .line 279
    :goto_9
    if-ge v8, v5, :cond_10

    .line 280
    .line 281
    iget-object v10, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 282
    .line 283
    aget-object v10, v10, v8

    .line 284
    .line 285
    if-nez v10, :cond_f

    .line 286
    .line 287
    iget-object v10, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 288
    .line 289
    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v10

    .line 293
    check-cast v10, Landroidx/compose/ui/layout/Measurable;

    .line 294
    .line 295
    iget-object v12, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 296
    .line 297
    aget-object v12, v12, v8

    .line 298
    .line 299
    invoke-static {v12}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 300
    .line 301
    .line 302
    move-result v15

    .line 303
    cmpl-float v16, v15, v14

    .line 304
    .line 305
    if-lez v16, :cond_a

    .line 306
    .line 307
    move/from16 v16, v20

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_a
    const/16 v16, 0x0

    .line 311
    .line 312
    :goto_a
    if-eqz v16, :cond_e

    .line 313
    .line 314
    invoke-static {v6}, Lkotlin/math/MathKt;->getSign(I)I

    .line 315
    .line 316
    .line 317
    move-result v16

    .line 318
    sub-int v6, v6, v16

    .line 319
    .line 320
    mul-float/2addr v15, v4

    .line 321
    invoke-static {v15}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 322
    .line 323
    .line 324
    move-result v15

    .line 325
    add-int v15, v15, v16

    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    .line 329
    .line 330
    .line 331
    move-result v15

    .line 332
    new-instance v14, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;

    .line 333
    .line 334
    invoke-static {v12}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getFill(Landroidx/compose/foundation/layout/RowColumnParentData;)Z

    .line 335
    .line 336
    .line 337
    move-result v16

    .line 338
    if-eqz v16, :cond_b

    .line 339
    .line 340
    if-eq v15, v7, :cond_b

    .line 341
    .line 342
    move/from16 v17, v4

    .line 343
    .line 344
    move v7, v15

    .line 345
    goto :goto_b

    .line 346
    :cond_b
    move/from16 v17, v4

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    :goto_b
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getCrossAxisMax()I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    move/from16 v21, v6

    .line 354
    .line 355
    const/4 v6, 0x0

    .line 356
    invoke-direct {v14, v7, v15, v6, v4}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;-><init>(IIII)V

    .line 357
    .line 358
    .line 359
    iget-object v4, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 360
    .line 361
    invoke-virtual {v14, v4}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(Landroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 362
    .line 363
    .line 364
    move-result-wide v6

    .line 365
    invoke-interface {v10, v6, v7}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 366
    .line 367
    .line 368
    move-result-object v4

    .line 369
    invoke-virtual {v0, v4}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    add-int/2addr v9, v6

    .line 374
    invoke-virtual {v0, v4}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 375
    .line 376
    .line 377
    move-result v6

    .line 378
    invoke-static {v11, v6}, Ljava/lang/Math;->max(II)I

    .line 379
    .line 380
    .line 381
    move-result v11

    .line 382
    if-nez v19, :cond_d

    .line 383
    .line 384
    invoke-static {v12}, Landroidx/compose/foundation/layout/RowColumnImplKt;->isRelative(Landroidx/compose/foundation/layout/RowColumnParentData;)Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    if-eqz v6, :cond_c

    .line 389
    .line 390
    goto :goto_c

    .line 391
    :cond_c
    const/16 v19, 0x0

    .line 392
    .line 393
    goto :goto_d

    .line 394
    :cond_d
    :goto_c
    move/from16 v19, v20

    .line 395
    .line 396
    :goto_d
    iget-object v6, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 397
    .line 398
    aput-object v4, v6, v8

    .line 399
    .line 400
    move/from16 v6, v21

    .line 401
    .line 402
    goto :goto_e

    .line 403
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 404
    .line 405
    const-string v2, "All weights <= 0 should have placeables"

    .line 406
    .line 407
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v1

    .line 415
    :cond_f
    move/from16 v17, v4

    .line 416
    .line 417
    :goto_e
    add-int/lit8 v8, v8, 0x1

    .line 418
    .line 419
    move/from16 v4, v17

    .line 420
    .line 421
    const v7, 0x7fffffff

    .line 422
    .line 423
    .line 424
    const/4 v14, 0x0

    .line 425
    goto/16 :goto_9

    .line 426
    .line 427
    :cond_10
    add-int/2addr v9, v3

    .line 428
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMax()I

    .line 429
    .line 430
    .line 431
    move-result v3

    .line 432
    sub-int v3, v3, v18

    .line 433
    .line 434
    invoke-static {v9, v3}, Lkotlin/ranges/RangesKt;->coerceAtMost(II)I

    .line 435
    .line 436
    .line 437
    move-result v14

    .line 438
    :goto_f
    if-eqz v19, :cond_16

    .line 439
    .line 440
    move/from16 v6, p4

    .line 441
    .line 442
    const/4 v3, 0x0

    .line 443
    const/4 v4, 0x0

    .line 444
    :goto_10
    if-ge v6, v5, :cond_15

    .line 445
    .line 446
    iget-object v7, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 447
    .line 448
    aget-object v7, v7, v6

    .line 449
    .line 450
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    iget-object v8, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->rowColumnParentData:[Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 454
    .line 455
    aget-object v8, v8, v6

    .line 456
    .line 457
    invoke-static {v8}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getCrossAxisAlignment(Landroidx/compose/foundation/layout/RowColumnParentData;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 458
    .line 459
    .line 460
    move-result-object v8

    .line 461
    if-eqz v8, :cond_11

    .line 462
    .line 463
    invoke-virtual {v8, v7}, Landroidx/compose/foundation/layout/CrossAxisAlignment;->calculateAlignmentLinePosition$foundation_layout_release(Landroidx/compose/ui/layout/Placeable;)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v8

    .line 467
    goto :goto_11

    .line 468
    :cond_11
    const/4 v8, 0x0

    .line 469
    :goto_11
    if-eqz v8, :cond_14

    .line 470
    .line 471
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 472
    .line 473
    .line 474
    move-result v9

    .line 475
    const/high16 v10, -0x80000000

    .line 476
    .line 477
    if-eq v9, v10, :cond_12

    .line 478
    .line 479
    goto :goto_12

    .line 480
    :cond_12
    const/4 v9, 0x0

    .line 481
    :goto_12
    invoke-static {v3, v9}, Ljava/lang/Math;->max(II)I

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    invoke-virtual {v0, v7}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 486
    .line 487
    .line 488
    move-result v9

    .line 489
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 490
    .line 491
    .line 492
    move-result v8

    .line 493
    if-eq v8, v10, :cond_13

    .line 494
    .line 495
    goto :goto_13

    .line 496
    :cond_13
    invoke-virtual {v0, v7}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 497
    .line 498
    .line 499
    move-result v8

    .line 500
    :goto_13
    sub-int/2addr v9, v8

    .line 501
    invoke-static {v4, v9}, Ljava/lang/Math;->max(II)I

    .line 502
    .line 503
    .line 504
    move-result v4

    .line 505
    :cond_14
    add-int/lit8 v6, v6, 0x1

    .line 506
    .line 507
    goto :goto_10

    .line 508
    :cond_15
    move v6, v3

    .line 509
    goto :goto_14

    .line 510
    :cond_16
    const/4 v4, 0x0

    .line 511
    const/4 v6, 0x0

    .line 512
    :goto_14
    add-int v3, v18, v14

    .line 513
    .line 514
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getMainAxisMin()I

    .line 515
    .line 516
    .line 517
    move-result v7

    .line 518
    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getCrossAxisMax()I

    .line 523
    .line 524
    .line 525
    move-result v7

    .line 526
    const v8, 0x7fffffff

    .line 527
    .line 528
    .line 529
    if-eq v7, v8, :cond_17

    .line 530
    .line 531
    iget-object v7, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->crossAxisSize:Landroidx/compose/foundation/layout/SizeMode;

    .line 532
    .line 533
    sget-object v8, Landroidx/compose/foundation/layout/SizeMode;->Expand:Landroidx/compose/foundation/layout/SizeMode;

    .line 534
    .line 535
    if-ne v7, v8, :cond_17

    .line 536
    .line 537
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getCrossAxisMax()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    goto :goto_15

    .line 542
    :cond_17
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->getCrossAxisMin()I

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    add-int/2addr v4, v6

    .line 547
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    invoke-static {v11, v2}, Ljava/lang/Math;->max(II)I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    :goto_15
    new-array v4, v13, [I

    .line 556
    .line 557
    const/4 v14, 0x0

    .line 558
    :goto_16
    if-ge v14, v13, :cond_18

    .line 559
    .line 560
    const/4 v7, 0x0

    .line 561
    aput v7, v4, v14

    .line 562
    .line 563
    add-int/lit8 v14, v14, 0x1

    .line 564
    .line 565
    goto :goto_16

    .line 566
    :cond_18
    const/4 v7, 0x0

    .line 567
    new-array v8, v13, [I

    .line 568
    .line 569
    move v15, v7

    .line 570
    :goto_17
    if-ge v15, v13, :cond_19

    .line 571
    .line 572
    iget-object v7, v0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 573
    .line 574
    add-int v9, v15, p4

    .line 575
    .line 576
    aget-object v7, v7, v9

    .line 577
    .line 578
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v7}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 582
    .line 583
    .line 584
    move-result v7

    .line 585
    aput v7, v8, v15

    .line 586
    .line 587
    add-int/lit8 v15, v15, 0x1

    .line 588
    .line 589
    goto :goto_17

    .line 590
    :cond_19
    invoke-direct {v0, v3, v8, v4, v1}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->mainAxisPositions(I[I[ILandroidx/compose/ui/layout/MeasureScope;)[I

    .line 591
    .line 592
    .line 593
    move-result-object v7

    .line 594
    new-instance v8, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;

    .line 595
    .line 596
    move-object v1, v8

    .line 597
    move/from16 v4, p4

    .line 598
    .line 599
    move/from16 v5, p5

    .line 600
    .line 601
    invoke-direct/range {v1 .. v7}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;-><init>(IIIII[I)V

    .line 602
    .line 603
    .line 604
    return-object v8
.end method

.method public final placeHelper(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;ILandroidx/compose/ui/unit/LayoutDirection;)V
    .locals 11

    .line 1
    const-string v0, "placeableScope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "measureResult"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "layoutDirection"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getStartIndex()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getEndIndex()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    :goto_0
    if-ge v0, v1, :cond_2

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->placeables:[Landroidx/compose/ui/layout/Placeable;

    .line 27
    .line 28
    aget-object v2, v2, v0

    .line 29
    .line 30
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getMainAxisPositions()[I

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    iget-object v3, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->measurables:Ljava/util/List;

    .line 38
    .line 39
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 44
    .line 45
    invoke-interface {v3}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->getParentData()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    instance-of v4, v3, Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    check-cast v3, Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    const/4 v3, 0x0

    .line 57
    :goto_1
    move-object v5, v3

    .line 58
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getCrossAxisSize()I

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getBeforeCrossAxisAlignmentLine()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    move-object v3, p0

    .line 67
    move-object v4, v2

    .line 68
    move-object v7, p4

    .line 69
    invoke-direct/range {v3 .. v8}, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->getCrossAxisPosition(Landroidx/compose/ui/layout/Placeable;Landroidx/compose/foundation/layout/RowColumnParentData;ILandroidx/compose/ui/unit/LayoutDirection;I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    add-int v6, v3, p3

    .line 74
    .line 75
    iget-object v3, p0, Landroidx/compose/foundation/layout/RowColumnMeasurementHelper;->orientation:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 76
    .line 77
    sget-object v4, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 78
    .line 79
    if-ne v3, v4, :cond_1

    .line 80
    .line 81
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getStartIndex()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    sub-int v3, v0, v3

    .line 86
    .line 87
    aget v5, v9, v3

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x4

    .line 91
    const/4 v9, 0x0

    .line 92
    move-object v3, p1

    .line 93
    move-object v4, v2

    .line 94
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    invoke-virtual {p2}, Landroidx/compose/foundation/layout/RowColumnMeasureHelperResult;->getStartIndex()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    sub-int v3, v0, v3

    .line 103
    .line 104
    aget v7, v9, v3

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    const/4 v9, 0x4

    .line 108
    const/4 v10, 0x0

    .line 109
    move-object v3, p1

    .line 110
    move-object v4, v2

    .line 111
    move v5, v6

    .line 112
    move v6, v7

    .line 113
    move v7, v8

    .line 114
    move v8, v9

    .line 115
    move-object v9, v10

    .line 116
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_2
    return-void
.end method
