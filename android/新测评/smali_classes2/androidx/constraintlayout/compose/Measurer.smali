.class public Landroidx/constraintlayout/compose/Measurer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;
.implements Landroidx/constraintlayout/compose/DesignInfoProvider;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/Measurer$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Deprecated;
    message = "Replace with Measurer2 instead for proper Measure/Layout handling."
    replaceWith = .subannotation Lkotlin/ReplaceWith;
        expression = "Measurer2"
        imports = {}
    .end subannotation
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ea\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u00104\u001a\u0002052\u0008\u00106\u001a\u0004\u0018\u00010#J\u001a\u00107\u001a\u0002052\u0006\u00108\u001a\u000209H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008:\u0010;J\u0008\u0010<\u001a\u000205H\u0016J\r\u0010=\u001a\u000205H\u0007\u00a2\u0006\u0002\u0010>J\u0008\u0010?\u001a\u000205H\u0016J&\u0010@\u001a\u00020A2\u0008\u0010B\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010C\u001a\u00020AH\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008D\u0010EJ \u0010F\u001a\u00020\u00072\u0006\u0010G\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020\u001c2\u0006\u0010I\u001a\u00020\u0007H\u0016J,\u0010J\u001a\u00020K2\"\u0010L\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070Mj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`NH\u0002J\u0018\u0010O\u001a\u0002052\u0006\u0010P\u001a\u00020Q2\u0006\u0010O\u001a\u00020RH\u0016J\"\u0010S\u001a\u00020T2\u0006\u0010P\u001a\u00020Q2\u0006\u00108\u001a\u000209H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008U\u0010VJH\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u001c2\u0006\u0010\\\u001a\u00020\u001c2\u0006\u0010]\u001a\u00020\u001c2\u0006\u0010^\u001a\u00020X2\u0006\u0010_\u001a\u00020X2\u0006\u0010`\u001a\u00020\u001c2\u0006\u0010a\u001a\u00020\u0019H\u0002J\u000e\u0010b\u001a\u0002052\u0006\u0010c\u001a\u00020dJ>\u0010e\u001a\u00020f2\u0006\u00108\u001a\u0002092\u0006\u0010g\u001a\u00020h2\u0006\u0010c\u001a\u00020d2\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u00020\u00140j2\u0006\u0010k\u001a\u00020\u001c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008l\u0010mJ\r\u0010n\u001a\u000205H\u0000\u00a2\u0006\u0002\u0008oJ\u001f\u0010p\u001a\u000205*\u0008\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010O\u001a\u00020RH\u0002\u00a2\u0006\u0002\u0010qJ\u0019\u0010r\u001a\u000205*\u00020s2\u0006\u0010\u000c\u001a\u00020\rH\u0007\u00a2\u0006\u0002\u0010tJ\u0012\u0010r\u001a\u000205*\u00020u2\u0006\u0010\u000c\u001a\u00020\rJ\u0018\u0010v\u001a\u000205*\u00020w2\u000c\u0010i\u001a\u0008\u0012\u0004\u0012\u00020\u00140jR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\u0008\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001c0\u001b0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u001fR\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020)0\u0013X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0017R\u0014\u0010+\u001a\u00020,X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0014\u0010/\u001a\u000200X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u000e\u00103\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006x"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/Measurer;",
        "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;",
        "Landroidx/constraintlayout/compose/DesignInfoProvider;",
        "density",
        "Landroidx/compose/ui/unit/Density;",
        "(Landroidx/compose/ui/unit/Density;)V",
        "computedLayoutResult",
        "",
        "designElements",
        "Ljava/util/ArrayList;",
        "Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;",
        "Lkotlin/collections/ArrayList;",
        "forcedScaleFactor",
        "",
        "getForcedScaleFactor",
        "()F",
        "setForcedScaleFactor",
        "(F)V",
        "frameCache",
        "",
        "Landroidx/compose/ui/layout/Measurable;",
        "Landroidx/constraintlayout/core/state/WidgetFrame;",
        "getFrameCache",
        "()Ljava/util/Map;",
        "heightConstraintsHolder",
        "",
        "lastMeasures",
        "",
        "",
        "layoutCurrentHeight",
        "getLayoutCurrentHeight",
        "()I",
        "layoutCurrentWidth",
        "getLayoutCurrentWidth",
        "layoutInformationReceiver",
        "Landroidx/constraintlayout/compose/LayoutInformationReceiver;",
        "getLayoutInformationReceiver",
        "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;",
        "setLayoutInformationReceiver",
        "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V",
        "placeables",
        "Landroidx/compose/ui/layout/Placeable;",
        "getPlaceables",
        "root",
        "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;",
        "getRoot",
        "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;",
        "state",
        "Landroidx/constraintlayout/compose/State;",
        "getState",
        "()Landroidx/constraintlayout/compose/State;",
        "widthConstraintsHolder",
        "addLayoutInformationReceiver",
        "",
        "layoutReceiver",
        "applyRootSize",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "applyRootSize-BRTryo0",
        "(J)V",
        "computeLayoutResult",
        "createDesignElements",
        "(Landroidx/compose/runtime/Composer;I)V",
        "didMeasures",
        "getColor",
        "Landroidx/compose/ui/graphics/Color;",
        "str",
        "defaultColor",
        "getColor-wrIjXm8",
        "(Ljava/lang/String;J)J",
        "getDesignInfo",
        "startX",
        "startY",
        "args",
        "getTextStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "params",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "measure",
        "constraintWidget",
        "Landroidx/constraintlayout/core/widgets/ConstraintWidget;",
        "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;",
        "measureWidget",
        "Landroidx/collection/IntIntPair;",
        "measureWidget-yQShABA",
        "(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J",
        "obtainConstraints",
        "",
        "dimensionBehaviour",
        "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;",
        "dimension",
        "matchConstraintDefaultDimension",
        "measureStrategy",
        "otherDimensionResolved",
        "currentDimensionResolved",
        "rootMaxConstraint",
        "outConstraints",
        "parseDesignElements",
        "constraintSet",
        "Landroidx/constraintlayout/compose/ConstraintSet;",
        "performMeasure",
        "Landroidx/compose/ui/unit/IntSize;",
        "layoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "measurables",
        "",
        "optimizationLevel",
        "performMeasure-2eBlSMk",
        "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;I)J",
        "resetMeasureState",
        "resetMeasureState$constraintlayout_compose_release",
        "copyFrom",
        "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V",
        "drawDebugBounds",
        "Landroidx/compose/foundation/layout/BoxScope;",
        "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/graphics/drawscope/DrawScope;",
        "performLayout",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 10 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2303:1\n1#2:2304\n361#3,7:2305\n33#4,6:2312\n33#4,4:2318\n38#4:2324\n33#4,4:2331\n38#4:2377\n288#5,2:2322\n1225#6,6:2325\n149#7:2335\n149#7:2372\n71#8:2336\n68#8,6:2337\n74#8:2371\n78#8:2376\n79#9,6:2343\n86#9,4:2358\n90#9,2:2368\n94#9:2375\n368#10,9:2349\n377#10:2370\n378#10,2:2373\n4034#11,6:2362\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/Measurer\n*L\n1752#1:2305,7\n1989#1:2312,6\n1996#1:2318,4\n1996#1:2324\n2129#1:2331,4\n2129#1:2377\n2000#1:2322,2\n2078#1:2325,6\n2145#1:2335\n2156#1:2372\n2154#1:2336\n2154#1:2337,6\n2154#1:2371\n2154#1:2376\n2154#1:2343,6\n2154#1:2358,4\n2154#1:2368,2\n2154#1:2375\n2154#1:2349,9\n2154#1:2370\n2154#1:2373,2\n2154#1:2362,6\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private computedLayoutResult:Ljava/lang/String;

.field private designElements:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;",
            ">;"
        }
    .end annotation
.end field

.field private forcedScaleFactor:F

.field private final frameCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/constraintlayout/core/state/WidgetFrame;",
            ">;"
        }
    .end annotation
.end field

.field private final heightConstraintsHolder:[I

.field private final lastMeasures:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

.field private final placeables:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation
.end field

.field private final root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

.field private final state:Landroidx/constraintlayout/compose/State;

.field private final widthConstraintsHolder:[I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/unit/Density;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->computedLayoutResult:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v0, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->setMeasurer(Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 18
    .line 19
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 25
    .line 26
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 32
    .line 33
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 39
    .line 40
    new-instance v0, Landroidx/constraintlayout/compose/State;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Landroidx/constraintlayout/compose/State;-><init>(Landroidx/compose/ui/unit/Density;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 46
    .line 47
    const/4 p1, 0x2

    .line 48
    new-array v0, p1, [I

    .line 49
    .line 50
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->widthConstraintsHolder:[I

    .line 51
    .line 52
    new-array p1, p1, [I

    .line 53
    .line 54
    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->heightConstraintsHolder:[I

    .line 55
    .line 56
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 57
    .line 58
    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 59
    .line 60
    new-instance p1, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->designElements:Ljava/util/ArrayList;

    .line 66
    .line 67
    return-void
.end method

.method private final copyFrom([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V
    .locals 2

    .line 1
    iget v0, p2, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredWidth:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    aput-object v0, p1, v1

    .line 9
    .line 10
    iget v0, p2, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHeight:I

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    aput-object v0, p1, v1

    .line 18
    .line 19
    iget p2, p2, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredBaseline:I

    .line 20
    .line 21
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    const/4 v0, 0x2

    .line 26
    aput-object p2, p1, v0

    .line 27
    .line 28
    return-void
.end method

.method private final getColor-wrIjXm8(Ljava/lang/String;J)J
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    const/16 v2, 0x23

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string/jumbo v0, "this as java.lang.String).substring(startIndex)"

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x6

    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    new-instance v0, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v1, "FF"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    :cond_0
    const/16 v0, 0x10

    .line 50
    .line 51
    :try_start_0
    invoke-static {p1, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    long-to-int p1, v0

    .line 56
    invoke-static {p1}, Landroidx/compose/ui/graphics/ColorKt;->Color(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    return-wide p1

    .line 61
    :catch_0
    :cond_1
    return-wide p2
.end method

.method public static synthetic getColor-wrIjXm8$default(Landroidx/constraintlayout/compose/Measurer;Ljava/lang/String;JILjava/lang/Object;)J
    .locals 0

    .line 1
    if-nez p5, :cond_1

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x2

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    sget-object p2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 8
    .line 9
    invoke-virtual {p2}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8(Ljava/lang/String;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p0

    .line 17
    return-wide p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: getColor-wrIjXm8"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method private final getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Landroidx/compose/ui/text/TextStyle;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string/jumbo v1, "size"

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    sget-object v2, Landroidx/compose/ui/unit/TextUnit;->Companion:Landroidx/compose/ui/unit/TextUnit$Companion;

    .line 13
    .line 14
    invoke-virtual {v2}, Landroidx/compose/ui/unit/TextUnit$Companion;->getUnspecified-XSAIIZE()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(F)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    :cond_0
    move-wide v7, v2

    .line 29
    const-string v1, "color"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v2, v0

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    const/4 v6, 0x0

    .line 40
    const-wide/16 v3, 0x0

    .line 41
    .line 42
    move-object/from16 v1, p0

    .line 43
    .line 44
    invoke-static/range {v1 .. v6}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8$default(Landroidx/constraintlayout/compose/Measurer;Ljava/lang/String;JILjava/lang/Object;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    new-instance v4, Landroidx/compose/ui/text/TextStyle;

    .line 49
    .line 50
    const v34, 0xfffffc

    .line 51
    .line 52
    .line 53
    const/16 v35, 0x0

    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/4 v10, 0x0

    .line 57
    const/4 v11, 0x0

    .line 58
    const/4 v12, 0x0

    .line 59
    const/4 v13, 0x0

    .line 60
    const-wide/16 v14, 0x0

    .line 61
    .line 62
    const/16 v16, 0x0

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    .line 66
    const/16 v18, 0x0

    .line 67
    .line 68
    const-wide/16 v19, 0x0

    .line 69
    .line 70
    const/16 v21, 0x0

    .line 71
    .line 72
    const/16 v22, 0x0

    .line 73
    .line 74
    const/16 v23, 0x0

    .line 75
    .line 76
    const/16 v24, 0x0

    .line 77
    .line 78
    const/16 v25, 0x0

    .line 79
    .line 80
    const-wide/16 v26, 0x0

    .line 81
    .line 82
    const/16 v28, 0x0

    .line 83
    .line 84
    const/16 v29, 0x0

    .line 85
    .line 86
    const/16 v30, 0x0

    .line 87
    .line 88
    const/16 v31, 0x0

    .line 89
    .line 90
    const/16 v32, 0x0

    .line 91
    .line 92
    const/16 v33, 0x0

    .line 93
    .line 94
    invoke-direct/range {v4 .. v35}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 95
    .line 96
    .line 97
    return-object v4
.end method

.method private final measureWidget-yQShABA(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p1, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 6
    .line 7
    instance-of v2, p1, Landroidx/constraintlayout/core/widgets/VirtualLayout;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_4

    .line 11
    .line 12
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v1, -0x80000000

    .line 17
    .line 18
    const/high16 v2, 0x40000000    # 2.0f

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/Constraints;->getHasBoundedWidth-impl(J)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    move v0, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move v0, v3

    .line 33
    :goto_0
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    move v3, v2

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/Constraints;->getHasBoundedHeight-impl(J)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    move v3, v1

    .line 48
    :cond_3
    :goto_1
    check-cast p1, Landroidx/constraintlayout/core/widgets/VirtualLayout;

    .line 49
    .line 50
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    invoke-static {p2, p3}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    invoke-virtual {p1, v0, v1, v3, p2}, Landroidx/constraintlayout/core/widgets/VirtualLayout;->measure(IIII)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroidx/constraintlayout/core/widgets/VirtualLayout;->getMeasuredWidth()I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    invoke-virtual {p1}, Landroidx/constraintlayout/core/widgets/VirtualLayout;->getMeasuredHeight()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    invoke-static {p2, p1}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 70
    .line 71
    .line 72
    move-result-wide p1

    .line 73
    return-wide p1

    .line 74
    :cond_4
    instance-of p1, v0, Landroidx/compose/ui/layout/Measurable;

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    move-object p1, v0

    .line 79
    check-cast p1, Landroidx/compose/ui/layout/Measurable;

    .line 80
    .line 81
    invoke-interface {p1, p2, p3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 86
    .line 87
    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p2, p1}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 99
    .line 100
    .line 101
    move-result-wide p1

    .line 102
    return-wide p1

    .line 103
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string p2, "Nothing to measure for widget: "

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string p2, "CCL"

    .line 121
    .line 122
    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    invoke-static {v3, v3}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 126
    .line 127
    .line 128
    move-result-wide p1

    .line 129
    return-wide p1
.end method

.method private final obtainConstraints(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z
    .locals 4

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/Measurer$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eq v0, v2, :cond_9

    .line 12
    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq v0, v3, :cond_8

    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    if-eq v0, v3, :cond_1

    .line 18
    .line 19
    const/4 p2, 0x4

    .line 20
    if-ne v0, p2, :cond_0

    .line 21
    .line 22
    aput p7, p8, v1

    .line 23
    .line 24
    aput p7, p8, v2

    .line 25
    .line 26
    return v1

    .line 27
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    new-instance p3, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, " is not supported"

    .line 38
    .line 39
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2

    .line 54
    :cond_1
    if-nez p6, :cond_4

    .line 55
    .line 56
    sget p1, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->TRY_GIVEN_DIMENSIONS:I

    .line 57
    .line 58
    if-eq p4, p1, :cond_2

    .line 59
    .line 60
    sget p1, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->USE_GIVEN_DIMENSIONS:I

    .line 61
    .line 62
    if-ne p4, p1, :cond_3

    .line 63
    .line 64
    :cond_2
    sget p1, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->USE_GIVEN_DIMENSIONS:I

    .line 65
    .line 66
    if-eq p4, p1, :cond_4

    .line 67
    .line 68
    if-ne p3, v2, :cond_4

    .line 69
    .line 70
    if-eqz p5, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move p1, v1

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    :goto_0
    move p1, v2

    .line 76
    :goto_1
    if-eqz p1, :cond_5

    .line 77
    .line 78
    move p3, p2

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    move p3, v1

    .line 81
    :goto_2
    aput p3, p8, v1

    .line 82
    .line 83
    if-eqz p1, :cond_6

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_6
    move p2, p7

    .line 87
    :goto_3
    aput p2, p8, v2

    .line 88
    .line 89
    if-nez p1, :cond_7

    .line 90
    .line 91
    return v2

    .line 92
    :cond_7
    return v1

    .line 93
    :cond_8
    aput v1, p8, v1

    .line 94
    .line 95
    aput p7, p8, v2

    .line 96
    .line 97
    return v2

    .line 98
    :cond_9
    aput p2, p8, v1

    .line 99
    .line 100
    aput p2, p8, v2

    .line 101
    .line 102
    return v1
.end method


# virtual methods
.method public final addLayoutInformationReceiver(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V
    .locals 1

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->computedLayoutResult:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->setLayoutInformation(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final applyRootSize-BRTryo0(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setWidth(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setHeight(I)V

    .line 17
    .line 18
    .line 19
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 20
    .line 21
    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 24
    .line 25
    const/high16 p2, -0x80000000

    .line 26
    .line 27
    const/high16 v0, 0x3f800000    # 1.0f

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedWidth()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-ne p1, p2, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 41
    .line 42
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedWidth()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-le p1, v1, :cond_1

    .line 56
    .line 57
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    int-to-float v1, v1

    .line 64
    int-to-float v2, p1

    .line 65
    div-float/2addr v1, v2

    .line 66
    iput v1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    iput v0, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 70
    .line 71
    :goto_0
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setWidth(I)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 77
    .line 78
    if-eqz p1, :cond_7

    .line 79
    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedHeight()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-ne p1, p2, :cond_3

    .line 87
    .line 88
    return-void

    .line 89
    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 90
    .line 91
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getForcedHeight()I

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    iget p2, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 99
    .line 100
    invoke-static {p2}, Ljava/lang/Float;->isNaN(F)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-eqz p2, :cond_4

    .line 105
    .line 106
    iput v0, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 107
    .line 108
    :cond_4
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 109
    .line 110
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    if-le p1, p2, :cond_5

    .line 115
    .line 116
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 117
    .line 118
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    int-to-float p2, p2

    .line 123
    int-to-float v0, p1

    .line 124
    div-float v0, p2, v0

    .line 125
    .line 126
    :cond_5
    iget p2, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 127
    .line 128
    cmpg-float p2, v0, p2

    .line 129
    .line 130
    if-gez p2, :cond_6

    .line 131
    .line 132
    iput v0, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 133
    .line 134
    :cond_6
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 135
    .line 136
    invoke-virtual {p2, p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setHeight(I)V

    .line 137
    .line 138
    .line 139
    :cond_7
    return-void
.end method

.method public computeLayoutResult()V
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string/jumbo v1, "{ "

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, "  root: {"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "interpolated: { left:  0,"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "  top:  0,"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v2, "  right:   "

    .line 34
    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v2, " ,"

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v3, "  bottom:  "

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v3, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 70
    .line 71
    invoke-virtual {v3}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, " } }"

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 94
    .line 95
    invoke-virtual {v1}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    const/4 v3, 0x0

    .line 104
    :cond_0
    :goto_0
    const-string v4, " }"

    .line 105
    .line 106
    if-ge v3, v2, :cond_8

    .line 107
    .line 108
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    add-int/lit8 v3, v3, 0x1

    .line 113
    .line 114
    check-cast v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 115
    .line 116
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    instance-of v7, v6, Landroidx/compose/ui/layout/Measurable;

    .line 121
    .line 122
    const-string/jumbo v8, "}, "

    .line 123
    .line 124
    .line 125
    const-string v9, ": {"

    .line 126
    .line 127
    const/16 v10, 0x20

    .line 128
    .line 129
    if-nez v7, :cond_2

    .line 130
    .line 131
    instance-of v6, v5, Landroidx/constraintlayout/core/widgets/Guideline;

    .line 132
    .line 133
    if-eqz v6, :cond_0

    .line 134
    .line 135
    new-instance v6, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    iget-object v7, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    check-cast v5, Landroidx/constraintlayout/core/widgets/Guideline;

    .line 159
    .line 160
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/Guideline;->getOrientation()I

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    if-nez v6, :cond_1

    .line 165
    .line 166
    const-string v6, " type: \'hGuideline\', "

    .line 167
    .line 168
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    goto :goto_1

    .line 172
    :cond_1
    const-string v6, " type: \'vGuideline\', "

    .line 173
    .line 174
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    :goto_1
    const-string v6, " interpolated: "

    .line 178
    .line 179
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    new-instance v6, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v7, " { left: "

    .line 188
    .line 189
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getX()I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const-string v7, ", top: "

    .line 200
    .line 201
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getY()I

    .line 205
    .line 206
    .line 207
    move-result v7

    .line 208
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v7, ", right: "

    .line 212
    .line 213
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getX()I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 221
    .line 222
    .line 223
    move-result v9

    .line 224
    add-int/2addr v7, v9

    .line 225
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string v7, ", bottom: "

    .line 229
    .line 230
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getY()I

    .line 234
    .line 235
    .line 236
    move-result v7

    .line 237
    invoke-virtual {v5}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 238
    .line 239
    .line 240
    move-result v5

    .line 241
    add-int/2addr v7, v5

    .line 242
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    goto/16 :goto_0

    .line 259
    .line 260
    :cond_2
    iget-object v4, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 261
    .line 262
    const/4 v7, 0x0

    .line 263
    if-nez v4, :cond_5

    .line 264
    .line 265
    move-object v4, v6

    .line 266
    check-cast v4, Landroidx/compose/ui/layout/Measurable;

    .line 267
    .line 268
    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    if-nez v11, :cond_3

    .line 273
    .line 274
    invoke-static {v4}, Landroidx/constraintlayout/compose/ConstraintLayoutTagKt;->getConstraintLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    :cond_3
    if-eqz v11, :cond_4

    .line 279
    .line 280
    invoke-virtual {v11}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    goto :goto_2

    .line 285
    :cond_4
    move-object v4, v7

    .line 286
    :goto_2
    iput-object v4, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 287
    .line 288
    :cond_5
    iget-object v4, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 289
    .line 290
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    check-cast v4, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 295
    .line 296
    if-eqz v4, :cond_6

    .line 297
    .line 298
    iget-object v4, v4, Landroidx/constraintlayout/core/state/WidgetFrame;->widget:Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 299
    .line 300
    if-eqz v4, :cond_6

    .line 301
    .line 302
    iget-object v7, v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->frame:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 303
    .line 304
    :cond_6
    if-nez v7, :cond_7

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_7
    new-instance v4, Ljava/lang/StringBuilder;

    .line 309
    .line 310
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    iget-object v5, v5, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 317
    .line 318
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    const-string v4, " interpolated : "

    .line 332
    .line 333
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    const/4 v4, 0x1

    .line 337
    invoke-virtual {v7, v0, v4}, Landroidx/constraintlayout/core/state/WidgetFrame;->serialize(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    goto/16 :goto_0

    .line 344
    .line 345
    :cond_8
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iput-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->computedLayoutResult:Ljava/lang/String;

    .line 353
    .line 354
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 355
    .line 356
    if-eqz v1, :cond_9

    .line 357
    .line 358
    invoke-interface {v1, v0}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->setLayoutInformation(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    :cond_9
    return-void
.end method

.method public final createDesignElements(Landroidx/compose/runtime/Composer;I)V
    .locals 27
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const v2, 0x685d849a

    .line 6
    .line 7
    .line 8
    move-object/from16 v3, p1

    .line 9
    .line 10
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v12

    .line 14
    and-int/lit8 v3, v1, 0x6

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const/4 v3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v3, v4

    .line 28
    :goto_0
    or-int/2addr v3, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v3, v1

    .line 31
    :goto_1
    and-int/lit8 v5, v3, 0x3

    .line 32
    .line 33
    if-ne v5, v4, :cond_3

    .line 34
    .line 35
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_d

    .line 46
    .line 47
    :cond_3
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    if-eqz v4, :cond_4

    .line 52
    .line 53
    const/4 v4, -0x1

    .line 54
    const-string v5, "androidx.constraintlayout.compose.Measurer.createDesignElements (ConstraintLayout.kt:2127)"

    .line 55
    .line 56
    invoke-static {v2, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_4
    iget-object v2, v0, Landroidx/constraintlayout/compose/Measurer;->designElements:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v15

    .line 65
    const/4 v13, 0x0

    .line 66
    move v14, v13

    .line 67
    :goto_3
    if-ge v14, v15, :cond_14

    .line 68
    .line 69
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;

    .line 74
    .line 75
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    sget-object v5, Landroidx/constraintlayout/compose/DesignElements;->INSTANCE:Landroidx/constraintlayout/compose/DesignElements;

    .line 80
    .line 81
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/DesignElements;->getMap()Ljava/util/HashMap;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getType()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Lkotlin/jvm/functions/Function4;

    .line 94
    .line 95
    if-eqz v5, :cond_5

    .line 96
    .line 97
    const v6, -0xc70c646

    .line 98
    .line 99
    .line 100
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-interface {v5, v4, v3, v12, v6}, Lkotlin/jvm/functions/Function4;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 115
    .line 116
    .line 117
    move/from16 v25, v13

    .line 118
    .line 119
    move/from16 v23, v14

    .line 120
    .line 121
    move/from16 v24, v15

    .line 122
    .line 123
    goto/16 :goto_c

    .line 124
    .line 125
    :cond_5
    const v5, -0xc6ea7e5

    .line 126
    .line 127
    .line 128
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getType()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    if-eqz v5, :cond_6

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    const/16 v7, 0x8

    .line 142
    .line 143
    const-string v8, "backgroundColor"

    .line 144
    .line 145
    const-string/jumbo v9, "text"

    .line 146
    .line 147
    .line 148
    sparse-switch v6, :sswitch_data_0

    .line 149
    .line 150
    .line 151
    :cond_6
    :goto_4
    move/from16 v25, v13

    .line 152
    .line 153
    move/from16 v23, v14

    .line 154
    .line 155
    move/from16 v24, v15

    .line 156
    .line 157
    goto/16 :goto_a

    .line 158
    .line 159
    :sswitch_0
    const-string v3, "image"

    .line 160
    .line 161
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_7

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    const v3, -0xc500d9d

    .line 169
    .line 170
    .line 171
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 172
    .line 173
    .line 174
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 175
    .line 176
    invoke-static {v3, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    const v3, 0x108003f

    .line 181
    .line 182
    .line 183
    const/4 v4, 0x6

    .line 184
    invoke-static {v3, v12, v4}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    const/16 v11, 0x30

    .line 189
    .line 190
    move-object/from16 v19, v12

    .line 191
    .line 192
    const/16 v12, 0x78

    .line 193
    .line 194
    const-string v4, "Placeholder Image"

    .line 195
    .line 196
    const/4 v6, 0x0

    .line 197
    const/4 v7, 0x0

    .line 198
    const/4 v8, 0x0

    .line 199
    const/4 v9, 0x0

    .line 200
    move-object/from16 v10, v19

    .line 201
    .line 202
    invoke-static/range {v3 .. v12}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 203
    .line 204
    .line 205
    move-object v12, v10

    .line 206
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 207
    .line 208
    .line 209
    move/from16 v25, v13

    .line 210
    .line 211
    move/from16 v23, v14

    .line 212
    .line 213
    move/from16 v24, v15

    .line 214
    .line 215
    goto/16 :goto_b

    .line 216
    .line 217
    :sswitch_1
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    if-nez v5, :cond_8

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_8
    const v5, -0xc5a950a

    .line 225
    .line 226
    .line 227
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    check-cast v5, Ljava/lang/String;

    .line 239
    .line 240
    if-nez v5, :cond_9

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_9
    move-object v9, v5

    .line 244
    :goto_5
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 245
    .line 246
    invoke-static {v5, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-direct {v0, v3}, Landroidx/constraintlayout/compose/Measurer;->getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    move v3, v13

    .line 259
    const/4 v13, 0x0

    .line 260
    move v6, v14

    .line 261
    const/16 v14, 0x1f8

    .line 262
    .line 263
    move v7, v6

    .line 264
    const/4 v6, 0x0

    .line 265
    move v8, v7

    .line 266
    const/4 v7, 0x0

    .line 267
    move v10, v8

    .line 268
    const/4 v8, 0x0

    .line 269
    move v11, v3

    .line 270
    move-object v3, v9

    .line 271
    const/4 v9, 0x0

    .line 272
    move/from16 v16, v10

    .line 273
    .line 274
    const/4 v10, 0x0

    .line 275
    move/from16 v17, v11

    .line 276
    .line 277
    const/4 v11, 0x0

    .line 278
    move/from16 p1, v15

    .line 279
    .line 280
    move/from16 v23, v16

    .line 281
    .line 282
    move/from16 v15, v17

    .line 283
    .line 284
    invoke-static/range {v3 .. v14}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-VhcvRP8(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V

    .line 285
    .line 286
    .line 287
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 288
    .line 289
    .line 290
    :goto_6
    move/from16 v24, p1

    .line 291
    .line 292
    move/from16 v25, v15

    .line 293
    .line 294
    goto/16 :goto_b

    .line 295
    .line 296
    :sswitch_2
    move/from16 v23, v14

    .line 297
    .line 298
    move/from16 p1, v15

    .line 299
    .line 300
    move v15, v13

    .line 301
    const-string v6, "box"

    .line 302
    .line 303
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    if-nez v5, :cond_a

    .line 308
    .line 309
    :goto_7
    move/from16 v24, p1

    .line 310
    .line 311
    move/from16 v25, v15

    .line 312
    .line 313
    goto/16 :goto_a

    .line 314
    .line 315
    :cond_a
    const v5, -0xc63dab8

    .line 316
    .line 317
    .line 318
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v5

    .line 329
    check-cast v5, Ljava/lang/String;

    .line 330
    .line 331
    if-nez v5, :cond_b

    .line 332
    .line 333
    const-string v5, ""

    .line 334
    .line 335
    :cond_b
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    invoke-virtual {v6, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    check-cast v6, Ljava/lang/String;

    .line 344
    .line 345
    sget-object v8, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 346
    .line 347
    invoke-virtual {v8}, Landroidx/compose/ui/graphics/Color$Companion;->getLightGray-0d7_KjU()J

    .line 348
    .line 349
    .line 350
    move-result-wide v8

    .line 351
    invoke-direct {v0, v6, v8, v9}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8(Ljava/lang/String;J)J

    .line 352
    .line 353
    .line 354
    move-result-wide v17

    .line 355
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 356
    .line 357
    invoke-static {v6, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 358
    .line 359
    .line 360
    move-result-object v16

    .line 361
    const/16 v20, 0x2

    .line 362
    .line 363
    const/16 v21, 0x0

    .line 364
    .line 365
    const/16 v19, 0x0

    .line 366
    .line 367
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 372
    .line 373
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 374
    .line 375
    .line 376
    move-result-object v8

    .line 377
    invoke-static {v8, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 378
    .line 379
    .line 380
    move-result-object v8

    .line 381
    invoke-static {v12, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 382
    .line 383
    .line 384
    move-result v9

    .line 385
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 386
    .line 387
    .line 388
    move-result-object v10

    .line 389
    invoke-static {v12, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 394
    .line 395
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 396
    .line 397
    .line 398
    move-result-object v13

    .line 399
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 400
    .line 401
    .line 402
    move-result-object v14

    .line 403
    if-nez v14, :cond_c

    .line 404
    .line 405
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 406
    .line 407
    .line 408
    :cond_c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 409
    .line 410
    .line 411
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 412
    .line 413
    .line 414
    move-result v14

    .line 415
    if-eqz v14, :cond_d

    .line 416
    .line 417
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 418
    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 422
    .line 423
    .line 424
    :goto_8
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 425
    .line 426
    .line 427
    move-result-object v13

    .line 428
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 429
    .line 430
    .line 431
    move-result-object v14

    .line 432
    invoke-static {v13, v8, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 436
    .line 437
    .line 438
    move-result-object v8

    .line 439
    invoke-static {v13, v10, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 443
    .line 444
    .line 445
    move-result-object v8

    .line 446
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 447
    .line 448
    .line 449
    move-result v10

    .line 450
    if-nez v10, :cond_e

    .line 451
    .line 452
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v10

    .line 456
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 457
    .line 458
    .line 459
    move-result-object v14

    .line 460
    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v10

    .line 464
    if-nez v10, :cond_f

    .line 465
    .line 466
    :cond_e
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v10

    .line 470
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    invoke-interface {v13, v9, v8}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 478
    .line 479
    .line 480
    :cond_f
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 481
    .line 482
    .line 483
    move-result-object v8

    .line 484
    invoke-static {v13, v4, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 485
    .line 486
    .line 487
    sget-object v4, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 488
    .line 489
    int-to-float v4, v7

    .line 490
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    invoke-direct {v0, v3}, Landroidx/constraintlayout/compose/Measurer;->getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    const/16 v13, 0x30

    .line 507
    .line 508
    const/16 v14, 0x1f8

    .line 509
    .line 510
    const/4 v6, 0x0

    .line 511
    const/4 v7, 0x0

    .line 512
    const/4 v8, 0x0

    .line 513
    const/4 v9, 0x0

    .line 514
    const/4 v10, 0x0

    .line 515
    const/4 v11, 0x0

    .line 516
    move-object/from16 v26, v5

    .line 517
    .line 518
    move-object v5, v3

    .line 519
    move-object/from16 v3, v26

    .line 520
    .line 521
    invoke-static/range {v3 .. v14}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-VhcvRP8(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V

    .line 522
    .line 523
    .line 524
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 525
    .line 526
    .line 527
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 528
    .line 529
    .line 530
    goto/16 :goto_6

    .line 531
    .line 532
    :sswitch_3
    move/from16 v23, v14

    .line 533
    .line 534
    move/from16 p1, v15

    .line 535
    .line 536
    move v15, v13

    .line 537
    const-string/jumbo v6, "textfield"

    .line 538
    .line 539
    .line 540
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    if-nez v5, :cond_10

    .line 545
    .line 546
    goto/16 :goto_7

    .line 547
    .line 548
    :cond_10
    const v5, -0xc5532fe

    .line 549
    .line 550
    .line 551
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    invoke-virtual {v3, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    check-cast v3, Ljava/lang/String;

    .line 563
    .line 564
    if-nez v3, :cond_11

    .line 565
    .line 566
    move-object v3, v9

    .line 567
    :cond_11
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 568
    .line 569
    invoke-static {v5, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 570
    .line 571
    .line 572
    move-result-object v5

    .line 573
    sget-object v4, Landroidx/constraintlayout/compose/Measurer$createDesignElements$1$2;->INSTANCE:Landroidx/constraintlayout/compose/Measurer$createDesignElements$1$2;

    .line 574
    .line 575
    const/16 v21, 0x0

    .line 576
    .line 577
    const v22, 0xfff8

    .line 578
    .line 579
    .line 580
    const/4 v6, 0x0

    .line 581
    const/4 v7, 0x0

    .line 582
    const/4 v8, 0x0

    .line 583
    const/4 v9, 0x0

    .line 584
    const/4 v10, 0x0

    .line 585
    const/4 v11, 0x0

    .line 586
    move-object/from16 v19, v12

    .line 587
    .line 588
    const/4 v12, 0x0

    .line 589
    const/4 v13, 0x0

    .line 590
    const/4 v14, 0x0

    .line 591
    move/from16 v17, v15

    .line 592
    .line 593
    const/4 v15, 0x0

    .line 594
    const/16 v16, 0x0

    .line 595
    .line 596
    move/from16 v18, v17

    .line 597
    .line 598
    const/16 v17, 0x0

    .line 599
    .line 600
    move/from16 v20, v18

    .line 601
    .line 602
    const/16 v18, 0x0

    .line 603
    .line 604
    move/from16 v24, v20

    .line 605
    .line 606
    const/16 v20, 0x30

    .line 607
    .line 608
    move/from16 v25, v24

    .line 609
    .line 610
    move/from16 v24, p1

    .line 611
    .line 612
    invoke-static/range {v3 .. v22}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    .line 613
    .line 614
    .line 615
    move-object/from16 v12, v19

    .line 616
    .line 617
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 618
    .line 619
    .line 620
    goto/16 :goto_b

    .line 621
    .line 622
    :sswitch_4
    move/from16 v25, v13

    .line 623
    .line 624
    move/from16 v23, v14

    .line 625
    .line 626
    move/from16 v24, v15

    .line 627
    .line 628
    const-string v6, "button"

    .line 629
    .line 630
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 631
    .line 632
    .line 633
    move-result v5

    .line 634
    if-nez v5, :cond_12

    .line 635
    .line 636
    goto :goto_a

    .line 637
    :cond_12
    const v5, -0xc6e65c7

    .line 638
    .line 639
    .line 640
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 644
    .line 645
    .line 646
    move-result-object v5

    .line 647
    invoke-virtual {v5, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    move-result-object v5

    .line 651
    check-cast v5, Ljava/lang/String;

    .line 652
    .line 653
    if-nez v5, :cond_13

    .line 654
    .line 655
    goto :goto_9

    .line 656
    :cond_13
    move-object v9, v5

    .line 657
    :goto_9
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 658
    .line 659
    .line 660
    move-result-object v5

    .line 661
    invoke-virtual {v5, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    check-cast v5, Ljava/lang/String;

    .line 666
    .line 667
    sget-object v6, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 668
    .line 669
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/Color$Companion;->getLightGray-0d7_KjU()J

    .line 670
    .line 671
    .line 672
    move-result-wide v10

    .line 673
    invoke-direct {v0, v5, v10, v11}, Landroidx/constraintlayout/compose/Measurer;->getColor-wrIjXm8(Ljava/lang/String;J)J

    .line 674
    .line 675
    .line 676
    move-result-wide v14

    .line 677
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 678
    .line 679
    invoke-static {v5, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 680
    .line 681
    .line 682
    move-result-object v4

    .line 683
    const/16 v5, 0x14

    .line 684
    .line 685
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape(I)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 686
    .line 687
    .line 688
    move-result-object v5

    .line 689
    invoke-static {v4, v5}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 690
    .line 691
    .line 692
    move-result-object v13

    .line 693
    const/16 v17, 0x2

    .line 694
    .line 695
    const/16 v18, 0x0

    .line 696
    .line 697
    const/16 v16, 0x0

    .line 698
    .line 699
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    int-to-float v5, v7

    .line 704
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 705
    .line 706
    .line 707
    move-result v5

    .line 708
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-virtual {v3}, Landroidx/constraintlayout/core/state/ConstraintSetParser$DesignElement;->getParams()Ljava/util/HashMap;

    .line 713
    .line 714
    .line 715
    move-result-object v3

    .line 716
    invoke-direct {v0, v3}, Landroidx/constraintlayout/compose/Measurer;->getTextStyle(Ljava/util/HashMap;)Landroidx/compose/ui/text/TextStyle;

    .line 717
    .line 718
    .line 719
    move-result-object v5

    .line 720
    const/4 v13, 0x0

    .line 721
    const/16 v14, 0x1f8

    .line 722
    .line 723
    const/4 v6, 0x0

    .line 724
    const/4 v7, 0x0

    .line 725
    const/4 v8, 0x0

    .line 726
    move-object v3, v9

    .line 727
    const/4 v9, 0x0

    .line 728
    const/4 v10, 0x0

    .line 729
    const/4 v11, 0x0

    .line 730
    invoke-static/range {v3 .. v14}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-VhcvRP8(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/runtime/Composer;II)V

    .line 731
    .line 732
    .line 733
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 734
    .line 735
    .line 736
    goto :goto_b

    .line 737
    :goto_a
    const v3, -0xc4b476a

    .line 738
    .line 739
    .line 740
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 741
    .line 742
    .line 743
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 744
    .line 745
    .line 746
    :goto_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 747
    .line 748
    .line 749
    :goto_c
    add-int/lit8 v14, v23, 0x1

    .line 750
    .line 751
    move/from16 v15, v24

    .line 752
    .line 753
    move/from16 v13, v25

    .line 754
    .line 755
    goto/16 :goto_3

    .line 756
    .line 757
    :cond_14
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 758
    .line 759
    .line 760
    move-result v2

    .line 761
    if-eqz v2, :cond_15

    .line 762
    .line 763
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 764
    .line 765
    .line 766
    :cond_15
    :goto_d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 767
    .line 768
    .line 769
    move-result-object v2

    .line 770
    if-eqz v2, :cond_16

    .line 771
    .line 772
    new-instance v3, Landroidx/constraintlayout/compose/Measurer$createDesignElements$2;

    .line 773
    .line 774
    invoke-direct {v3, v0, v1}, Landroidx/constraintlayout/compose/Measurer$createDesignElements$2;-><init>(Landroidx/constraintlayout/compose/Measurer;I)V

    .line 775
    .line 776
    .line 777
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 778
    .line 779
    .line 780
    :cond_16
    return-void

    .line 781
    :sswitch_data_0
    .sparse-switch
        -0x521dd8ce -> :sswitch_4
        -0x3d7a7013 -> :sswitch_3
        0x17dcb -> :sswitch_2
        0x36452d -> :sswitch_1
        0x5faa95b -> :sswitch_0
    .end sparse-switch
.end method

.method public didMeasures()V
    .locals 0

    return-void
.end method

.method public final drawDebugBounds(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V
    .locals 5
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    const v0, 0x7ec0f4c2

    .line 1
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v4, 0x92

    if-ne v2, v4, :cond_7

    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    .line 2
    :cond_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_6

    .line 3
    :cond_7
    :goto_4
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v4, "androidx.constraintlayout.compose.Measurer.drawDebugBounds (ConstraintLayout.kt:2076)"

    invoke-static {v0, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 4
    :cond_8
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    invoke-interface {p1, v0}, Landroidx/compose/foundation/layout/BoxScope;->matchParentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v1, v1, 0x70

    const/4 v4, 0x0

    if-ne v1, v3, :cond_9

    const/4 v1, 0x1

    goto :goto_5

    :cond_9
    move v1, v4

    :goto_5
    or-int/2addr v1, v2

    .line 5
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_a

    .line 6
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_b

    .line 7
    :cond_a
    new-instance v2, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$1$1;

    invoke-direct {v2, p0, p2}, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$1$1;-><init>(Landroidx/constraintlayout/compose/Measurer;F)V

    .line 8
    invoke-interface {p3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 9
    :cond_b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, p3, v4}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 10
    :cond_c
    :goto_6
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p3

    if-eqz p3, :cond_d

    new-instance v0, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$2;

    invoke-direct {v0, p0, p1, p2, p4}, Landroidx/constraintlayout/compose/Measurer$drawDebugBounds$2;-><init>(Landroidx/constraintlayout/compose/Measurer;Landroidx/compose/foundation/layout/BoxScope;FI)V

    invoke-interface {p3, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_d
    return-void
.end method

.method public final drawDebugBounds(Landroidx/compose/ui/graphics/drawscope/DrawScope;F)V
    .locals 36

    .line 11
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer;->getLayoutCurrentWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float v0, v0, p2

    .line 12
    invoke-virtual/range {p0 .. p0}, Landroidx/constraintlayout/compose/Measurer;->getLayoutCurrentHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float v1, v1, p2

    .line 13
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v2

    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->getWidth-impl(J)F

    move-result v2

    sub-float/2addr v2, v0

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 14
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/geometry/Size;->getHeight-impl(J)F

    move-result v4

    sub-float/2addr v4, v1

    div-float/2addr v4, v3

    .line 15
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v6

    .line 16
    invoke-static {v2, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v8

    add-float v5, v2, v0

    invoke-static {v5, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v10

    const/16 v18, 0x1f8

    const/16 v19, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v20, v0

    move v0, v5

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v19}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 17
    invoke-static {v0, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v8

    add-float v5, v4, v1

    invoke-static {v0, v5}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v10

    move/from16 p2, v1

    move v1, v5

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v19}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 18
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v8

    invoke-static {v2, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v10

    invoke-static/range {v5 .. v19}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 19
    invoke-static {v2, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v8

    invoke-static {v2, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v10

    invoke-static/range {v5 .. v19}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    const/4 v0, 0x1

    int-to-float v0, v0

    add-float/2addr v2, v0

    add-float/2addr v4, v0

    .line 20
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    move-result-wide v22

    .line 21
    invoke-static {v2, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v24

    add-float v0, v2, v20

    invoke-static {v0, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v26

    const/16 v34, 0x1f8

    const/16 v35, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v21, p1

    invoke-static/range {v21 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 22
    invoke-static {v0, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v24

    add-float v1, v4, p2

    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v26

    invoke-static/range {v21 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 23
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v24

    invoke-static {v2, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v26

    invoke-static/range {v21 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 24
    invoke-static {v2, v1}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v24

    invoke-static {v2, v4}, Landroidx/compose/ui/geometry/OffsetKt;->Offset(FF)J

    move-result-wide v26

    invoke-static/range {v21 .. v35}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawLine-NGM6Ib0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFILandroidx/compose/ui/graphics/PathEffect;FLandroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    return-void
.end method

.method public getDesignInfo(IILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2, p3}, Landroidx/constraintlayout/compose/ToolingUtilsKt;->parseConstraintsToJson(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;Landroidx/constraintlayout/compose/State;IILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final getForcedScaleFactor()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 2
    .line 3
    return v0
.end method

.method public final getFrameCache()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/constraintlayout/core/state/WidgetFrame;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLayoutCurrentHeight()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getLayoutCurrentWidth()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getLayoutInformationReceiver()Landroidx/constraintlayout/compose/LayoutInformationReceiver;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPlaceables()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/ui/layout/Placeable;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRoot()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getState()Landroidx/constraintlayout/compose/State;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 2
    .line 3
    return-object v0
.end method

.method public measure(Landroidx/constraintlayout/core/widgets/ConstraintWidget;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    const/4 v11, 0x0

    .line 8
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v12

    .line 12
    iget-object v13, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->stringId:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    move-object v14, v1

    .line 21
    check-cast v14, [Ljava/lang/Integer;

    .line 22
    .line 23
    iget-object v1, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 24
    .line 25
    iget v2, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalDimension:I

    .line 26
    .line 27
    iget v3, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultWidth:I

    .line 28
    .line 29
    iget v4, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measureStrategy:I

    .line 30
    .line 31
    const/4 v15, 0x1

    .line 32
    if-eqz v14, :cond_0

    .line 33
    .line 34
    aget-object v5, v14, v15

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    move v5, v11

    .line 42
    :goto_0
    invoke-virtual {v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    move v5, v15

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v5, v11

    .line 51
    :goto_1
    invoke-virtual {v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->isResolvedHorizontally()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    iget-object v7, v0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 56
    .line 57
    invoke-virtual {v7}, Landroidx/constraintlayout/compose/State;->getRootIncomingConstraints-msEJaDk()J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    iget-object v8, v0, Landroidx/constraintlayout/compose/Measurer;->widthConstraintsHolder:[I

    .line 66
    .line 67
    invoke-direct/range {v0 .. v8}, Landroidx/constraintlayout/compose/Measurer;->obtainConstraints(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z

    .line 68
    .line 69
    .line 70
    iget-object v1, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 71
    .line 72
    iget v2, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalDimension:I

    .line 73
    .line 74
    iget v3, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultHeight:I

    .line 75
    .line 76
    iget v4, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measureStrategy:I

    .line 77
    .line 78
    if-eqz v14, :cond_2

    .line 79
    .line 80
    aget-object v5, v14, v11

    .line 81
    .line 82
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    goto :goto_2

    .line 87
    :cond_2
    move v5, v11

    .line 88
    :goto_2
    invoke-virtual {v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-ne v5, v6, :cond_3

    .line 93
    .line 94
    move v5, v15

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    move v5, v11

    .line 97
    :goto_3
    invoke-virtual {v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->isResolvedVertically()Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    iget-object v7, v0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 102
    .line 103
    invoke-virtual {v7}, Landroidx/constraintlayout/compose/State;->getRootIncomingConstraints-msEJaDk()J

    .line 104
    .line 105
    .line 106
    move-result-wide v7

    .line 107
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 108
    .line 109
    .line 110
    move-result v7

    .line 111
    iget-object v8, v0, Landroidx/constraintlayout/compose/Measurer;->heightConstraintsHolder:[I

    .line 112
    .line 113
    invoke-direct/range {v0 .. v8}, Landroidx/constraintlayout/compose/Measurer;->obtainConstraints(Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;IIIZZI[I)Z

    .line 114
    .line 115
    .line 116
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->widthConstraintsHolder:[I

    .line 117
    .line 118
    aget v2, v1, v11

    .line 119
    .line 120
    aget v1, v1, v15

    .line 121
    .line 122
    iget-object v3, v0, Landroidx/constraintlayout/compose/Measurer;->heightConstraintsHolder:[I

    .line 123
    .line 124
    aget v4, v3, v11

    .line 125
    .line 126
    aget v3, v3, v15

    .line 127
    .line 128
    invoke-static {v2, v1, v4, v3}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 129
    .line 130
    .line 131
    move-result-wide v1

    .line 132
    iget v3, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measureStrategy:I

    .line 133
    .line 134
    sget v4, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->TRY_GIVEN_DIMENSIONS:I

    .line 135
    .line 136
    if-eq v3, v4, :cond_4

    .line 137
    .line 138
    sget v4, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->USE_GIVEN_DIMENSIONS:I

    .line 139
    .line 140
    if-eq v3, v4, :cond_4

    .line 141
    .line 142
    iget-object v3, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 143
    .line 144
    sget-object v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;->MATCH_CONSTRAINT:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 145
    .line 146
    if-ne v3, v4, :cond_4

    .line 147
    .line 148
    iget v3, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultWidth:I

    .line 149
    .line 150
    if-nez v3, :cond_4

    .line 151
    .line 152
    iget-object v3, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalBehavior:Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;

    .line 153
    .line 154
    if-ne v3, v4, :cond_4

    .line 155
    .line 156
    iget v3, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintDefaultHeight:I

    .line 157
    .line 158
    if-eqz v3, :cond_b

    .line 159
    .line 160
    :cond_4
    invoke-direct {v0, v9, v1, v2}, Landroidx/constraintlayout/compose/Measurer;->measureWidget-yQShABA(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v3

    .line 164
    invoke-virtual {v9, v11}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setMeasureRequested(Z)V

    .line 165
    .line 166
    .line 167
    invoke-static {v3, v4}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    iget v6, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMinWidth:I

    .line 176
    .line 177
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    const/4 v8, 0x0

    .line 186
    if-lez v7, :cond_5

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_5
    move-object v6, v8

    .line 190
    :goto_4
    iget v7, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMaxWidth:I

    .line 191
    .line 192
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-lez v14, :cond_6

    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_6
    move-object v7, v8

    .line 204
    :goto_5
    invoke-static {v5, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    check-cast v5, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    invoke-static {v3, v4}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    iget v7, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMinHeight:I

    .line 223
    .line 224
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v14

    .line 232
    if-lez v14, :cond_7

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_7
    move-object v7, v8

    .line 236
    :goto_6
    iget v14, v9, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->mMatchConstraintMaxHeight:I

    .line 237
    .line 238
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v14

    .line 242
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v16

    .line 246
    if-lez v16, :cond_8

    .line 247
    .line 248
    move-object v8, v14

    .line 249
    :cond_8
    invoke-static {v6, v7, v8}, Lkotlin/ranges/RangesKt;->coerceIn(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    check-cast v6, Ljava/lang/Number;

    .line 254
    .line 255
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    invoke-static {v3, v4}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    if-eq v5, v7, :cond_9

    .line 264
    .line 265
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 266
    .line 267
    .line 268
    move-result v7

    .line 269
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 270
    .line 271
    .line 272
    move-result v1

    .line 273
    invoke-static {v5, v5, v7, v1}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 274
    .line 275
    .line 276
    move-result-wide v1

    .line 277
    move v5, v15

    .line 278
    goto :goto_7

    .line 279
    :cond_9
    move v5, v11

    .line 280
    :goto_7
    invoke-static {v3, v4}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-eq v6, v3, :cond_a

    .line 285
    .line 286
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 287
    .line 288
    .line 289
    move-result v3

    .line 290
    invoke-static {v1, v2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    invoke-static {v3, v1, v6, v6}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints(IIII)J

    .line 295
    .line 296
    .line 297
    move-result-wide v1

    .line 298
    move v5, v15

    .line 299
    :cond_a
    if-eqz v5, :cond_b

    .line 300
    .line 301
    invoke-direct {v0, v9, v1, v2}, Landroidx/constraintlayout/compose/Measurer;->measureWidget-yQShABA(Landroidx/constraintlayout/core/widgets/ConstraintWidget;J)J

    .line 302
    .line 303
    .line 304
    invoke-virtual {v9, v11}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->setMeasureRequested(Z)V

    .line 305
    .line 306
    .line 307
    :cond_b
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 308
    .line 309
    invoke-virtual {v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, Landroidx/compose/ui/layout/Placeable;

    .line 318
    .line 319
    if-eqz v1, :cond_c

    .line 320
    .line 321
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    goto :goto_8

    .line 326
    :cond_c
    invoke-virtual {v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    :goto_8
    iput v2, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredWidth:I

    .line 331
    .line 332
    if-eqz v1, :cond_d

    .line 333
    .line 334
    invoke-virtual {v1}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 335
    .line 336
    .line 337
    move-result v2

    .line 338
    goto :goto_9

    .line 339
    :cond_d
    invoke-virtual {v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    :goto_9
    iput v2, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHeight:I

    .line 344
    .line 345
    const/high16 v2, -0x80000000

    .line 346
    .line 347
    if-eqz v1, :cond_e

    .line 348
    .line 349
    iget-object v3, v0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 350
    .line 351
    invoke-virtual {v3, v9}, Landroidx/constraintlayout/core/state/State;->isBaselineNeeded(Landroidx/constraintlayout/core/widgets/ConstraintWidget;)Z

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    if-eqz v3, :cond_e

    .line 356
    .line 357
    invoke-static {}, Landroidx/compose/ui/layout/AlignmentLineKt;->getFirstBaseline()Landroidx/compose/ui/layout/HorizontalAlignmentLine;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-interface {v1, v3}, Landroidx/compose/ui/layout/Measured;->get(Landroidx/compose/ui/layout/AlignmentLine;)I

    .line 362
    .line 363
    .line 364
    move-result v1

    .line 365
    goto :goto_a

    .line 366
    :cond_e
    move v1, v2

    .line 367
    :goto_a
    if-eq v1, v2, :cond_f

    .line 368
    .line 369
    move v3, v15

    .line 370
    goto :goto_b

    .line 371
    :cond_f
    move v3, v11

    .line 372
    :goto_b
    iput-boolean v3, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHasBaseline:Z

    .line 373
    .line 374
    iput v1, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredBaseline:I

    .line 375
    .line 376
    iget-object v1, v0, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 377
    .line 378
    invoke-interface {v1, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    if-nez v3, :cond_10

    .line 383
    .line 384
    const/4 v3, 0x3

    .line 385
    new-array v3, v3, [Ljava/lang/Integer;

    .line 386
    .line 387
    aput-object v12, v3, v11

    .line 388
    .line 389
    aput-object v12, v3, v15

    .line 390
    .line 391
    const/4 v4, 0x2

    .line 392
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    aput-object v2, v3, v4

    .line 397
    .line 398
    invoke-interface {v1, v13, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    :cond_10
    check-cast v3, [Ljava/lang/Integer;

    .line 402
    .line 403
    invoke-direct {v0, v3, v10}, Landroidx/constraintlayout/compose/Measurer;->copyFrom([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V

    .line 404
    .line 405
    .line 406
    iget v1, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredWidth:I

    .line 407
    .line 408
    iget v2, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->horizontalDimension:I

    .line 409
    .line 410
    if-ne v1, v2, :cond_11

    .line 411
    .line 412
    iget v1, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredHeight:I

    .line 413
    .line 414
    iget v2, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->verticalDimension:I

    .line 415
    .line 416
    if-eq v1, v2, :cond_12

    .line 417
    .line 418
    :cond_11
    move v11, v15

    .line 419
    :cond_12
    iput-boolean v11, v10, Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;->measuredNeedsSolverPass:Z

    .line 420
    .line 421
    return-void
.end method

.method public final parseDesignElements(Landroidx/constraintlayout/compose/ConstraintSet;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroidx/constraintlayout/compose/JSONConstraintSet;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/compose/JSONConstraintSet;

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->designElements:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/compose/JSONConstraintSet;->emitDesignElements(Ljava/util/ArrayList;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final performLayout(Landroidx/compose/ui/layout/Placeable$PlacementScope;Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/constraintlayout/core/widgets/WidgetContainer;->getChildren()Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    move v3, v1

    .line 21
    :goto_0
    if-ge v3, v2, :cond_1

    .line 22
    .line 23
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;

    .line 28
    .line 29
    invoke-virtual {v4}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getCompanionWidget()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    instance-of v6, v5, Landroidx/compose/ui/layout/Measurable;

    .line 34
    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    new-instance v6, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 38
    .line 39
    iget-object v4, v4, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->frame:Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroidx/constraintlayout/core/state/WidgetFrame;->update()Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-direct {v6, v4}, Landroidx/constraintlayout/core/state/WidgetFrame;-><init>(Landroidx/constraintlayout/core/state/WidgetFrame;)V

    .line 46
    .line 47
    .line 48
    iget-object v4, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 49
    .line 50
    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    :goto_1
    const/4 v2, 0x0

    .line 61
    if-ge v1, v0, :cond_9

    .line 62
    .line 63
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 68
    .line 69
    iget-object v4, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 70
    .line 71
    invoke-interface {v4, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_4

    .line 76
    .line 77
    iget-object v4, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 78
    .line 79
    invoke-interface {v4}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Ljava/lang/Iterable;

    .line 84
    .line 85
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-eqz v5, :cond_3

    .line 94
    .line 95
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    move-object v6, v5

    .line 100
    check-cast v6, Landroidx/compose/ui/layout/Measurable;

    .line 101
    .line 102
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    if-eqz v7, :cond_2

    .line 107
    .line 108
    invoke-static {v6}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v3}, Landroidx/compose/ui/layout/LayoutIdKt;->getLayoutId(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_2

    .line 121
    .line 122
    move-object v2, v5

    .line 123
    :cond_3
    check-cast v2, Landroidx/compose/ui/layout/Measurable;

    .line 124
    .line 125
    if-nez v2, :cond_5

    .line 126
    .line 127
    move-object v5, p1

    .line 128
    goto :goto_2

    .line 129
    :cond_4
    move-object v2, v3

    .line 130
    :cond_5
    iget-object v4, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 131
    .line 132
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    move-object v7, v4

    .line 137
    check-cast v7, Landroidx/constraintlayout/core/state/WidgetFrame;

    .line 138
    .line 139
    if-nez v7, :cond_6

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_6
    iget-object v4, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 143
    .line 144
    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    move-object v6, v2

    .line 149
    check-cast v6, Landroidx/compose/ui/layout/Placeable;

    .line 150
    .line 151
    if-nez v6, :cond_7

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_7
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 155
    .line 156
    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    if-nez v2, :cond_8

    .line 161
    .line 162
    sget-object v2, Landroidx/compose/ui/unit/Constraints;->Companion:Landroidx/compose/ui/unit/Constraints$Companion;

    .line 163
    .line 164
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    invoke-virtual {v6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    invoke-virtual {v2, v4, v5}, Landroidx/compose/ui/unit/Constraints$Companion;->fixed-JhjzzOo(II)J

    .line 173
    .line 174
    .line 175
    move-result-wide v4

    .line 176
    invoke-interface {v3, v4, v5}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    const/4 v10, 0x4

    .line 181
    const/4 v11, 0x0

    .line 182
    const-wide/16 v8, 0x0

    .line 183
    .line 184
    move-object v5, p1

    .line 185
    invoke-static/range {v5 .. v11}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->placeWithFrameTransform-Ktjjmr4$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/constraintlayout/core/state/WidgetFrame;JILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_8
    move-object v5, p1

    .line 190
    const/4 v10, 0x4

    .line 191
    const/4 v11, 0x0

    .line 192
    const-wide/16 v8, 0x0

    .line 193
    .line 194
    invoke-static/range {v5 .. v11}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->placeWithFrameTransform-Ktjjmr4$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;Landroidx/constraintlayout/core/state/WidgetFrame;JILjava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 198
    .line 199
    move-object p1, v5

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :cond_9
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 203
    .line 204
    if-eqz p1, :cond_a

    .line 205
    .line 206
    invoke-interface {p1}, Landroidx/constraintlayout/compose/LayoutInformationReceiver;->getLayoutInformationMode()Landroidx/constraintlayout/compose/LayoutInfoFlags;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    :cond_a
    sget-object p1, Landroidx/constraintlayout/compose/LayoutInfoFlags;->BOUNDS:Landroidx/constraintlayout/compose/LayoutInfoFlags;

    .line 211
    .line 212
    if-ne v2, p1, :cond_b

    .line 213
    .line 214
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->computeLayoutResult()V

    .line 215
    .line 216
    .line 217
    :cond_b
    :goto_3
    return-void
.end method

.method public final performMeasure-2eBlSMk(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;I)J
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/constraintlayout/compose/ConstraintSet;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;I)J"
        }
    .end annotation

    .line 1
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p3, p1}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    return-wide p1

    .line 20
    :cond_0
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 21
    .line 22
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedWidth-impl(J)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {v2}, Landroidx/constraintlayout/core/state/Dimension;->createFixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createWrap()Landroidx/constraintlayout/core/state/Dimension;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/state/Dimension;->min(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    :goto_0
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/state/State;->width(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/State;

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 53
    .line 54
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getHasFixedHeight-impl(J)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-static {v2}, Landroidx/constraintlayout/core/state/Dimension;->createFixed(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-static {}, Landroidx/constraintlayout/core/state/Dimension;->createWrap()Landroidx/constraintlayout/core/state/Dimension;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    invoke-virtual {v2, v3}, Landroidx/constraintlayout/core/state/Dimension;->min(I)Landroidx/constraintlayout/core/state/Dimension;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :goto_1
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/state/State;->height(Landroidx/constraintlayout/core/state/Dimension;)Landroidx/constraintlayout/core/state/State;

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 85
    .line 86
    iget-object v1, v1, Landroidx/constraintlayout/core/state/State;->mParent:Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 87
    .line 88
    invoke-virtual {v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->getWidth()Landroidx/constraintlayout/core/state/Dimension;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 93
    .line 94
    iget-object v3, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    invoke-virtual {v1, v2, v3, v4}, Landroidx/constraintlayout/core/state/Dimension;->apply(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/widgets/ConstraintWidget;I)V

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 101
    .line 102
    iget-object v1, v1, Landroidx/constraintlayout/core/state/State;->mParent:Landroidx/constraintlayout/core/state/ConstraintReference;

    .line 103
    .line 104
    invoke-virtual {v1}, Landroidx/constraintlayout/core/state/ConstraintReference;->getHeight()Landroidx/constraintlayout/core/state/Dimension;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    iget-object v2, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 109
    .line 110
    iget-object v3, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 111
    .line 112
    const/4 v5, 0x1

    .line 113
    invoke-virtual {v1, v2, v3, v5}, Landroidx/constraintlayout/core/state/Dimension;->apply(Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/widgets/ConstraintWidget;I)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 117
    .line 118
    invoke-virtual {v1, p1, p2}, Landroidx/constraintlayout/compose/State;->setRootIncomingConstraints-BRTryo0(J)V

    .line 119
    .line 120
    .line 121
    iget-object v1, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 122
    .line 123
    sget-object v2, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 124
    .line 125
    if-ne p3, v2, :cond_3

    .line 126
    .line 127
    move v4, v5

    .line 128
    :cond_3
    invoke-virtual {v1, v4}, Landroidx/constraintlayout/core/state/State;->setRtl(Z)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/Measurer;->resetMeasureState$constraintlayout_compose_release()V

    .line 132
    .line 133
    .line 134
    invoke-interface/range {p4 .. p5}, Landroidx/constraintlayout/compose/ConstraintSet;->isDirty(Ljava/util/List;)Z

    .line 135
    .line 136
    .line 137
    move-result p3

    .line 138
    if-eqz p3, :cond_4

    .line 139
    .line 140
    iget-object p3, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 141
    .line 142
    invoke-virtual {p3}, Landroidx/constraintlayout/core/state/State;->reset()V

    .line 143
    .line 144
    .line 145
    iget-object p3, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 146
    .line 147
    invoke-interface {p4, p3, p5}, Landroidx/constraintlayout/compose/ConstraintSet;->applyTo(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 148
    .line 149
    .line 150
    iget-object p3, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 151
    .line 152
    invoke-static {p3, p5}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->buildMapping(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    iget-object p3, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 156
    .line 157
    iget-object p4, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 158
    .line 159
    invoke-virtual {p3, p4}, Landroidx/constraintlayout/core/state/State;->apply(Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    iget-object p3, p0, Landroidx/constraintlayout/compose/Measurer;->state:Landroidx/constraintlayout/compose/State;

    .line 164
    .line 165
    invoke-static {p3, p5}, Landroidx/constraintlayout/compose/ConstraintLayoutKt;->buildMapping(Landroidx/constraintlayout/compose/State;Ljava/util/List;)V

    .line 166
    .line 167
    .line 168
    :goto_2
    invoke-virtual/range {p0 .. p2}, Landroidx/constraintlayout/compose/Measurer;->applyRootSize-BRTryo0(J)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 172
    .line 173
    invoke-virtual {p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->updateHierarchy()V

    .line 174
    .line 175
    .line 176
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 177
    .line 178
    move/from16 p2, p6

    .line 179
    .line 180
    invoke-virtual {p1, p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->setOptimizationLevel(I)V

    .line 181
    .line 182
    .line 183
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->getOptimizationLevel()I

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    const/4 v8, 0x0

    .line 190
    const/4 v9, 0x0

    .line 191
    const/4 v2, 0x0

    .line 192
    const/4 v3, 0x0

    .line 193
    const/4 v4, 0x0

    .line 194
    const/4 v5, 0x0

    .line 195
    const/4 v6, 0x0

    .line 196
    const/4 v7, 0x0

    .line 197
    invoke-virtual/range {v0 .. v9}, Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;->measure(IIIIIIIII)J

    .line 198
    .line 199
    .line 200
    iget-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 201
    .line 202
    invoke-virtual {p1}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getWidth()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    iget-object p2, p0, Landroidx/constraintlayout/compose/Measurer;->root:Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;

    .line 207
    .line 208
    invoke-virtual {p2}, Landroidx/constraintlayout/core/widgets/ConstraintWidget;->getHeight()I

    .line 209
    .line 210
    .line 211
    move-result p2

    .line 212
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    .line 213
    .line 214
    .line 215
    move-result-wide p1

    .line 216
    return-wide p1
.end method

.method public final resetMeasureState$constraintlayout_compose_release()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->placeables:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->lastMeasures:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/constraintlayout/compose/Measurer;->frameCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setForcedScaleFactor(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/compose/Measurer;->forcedScaleFactor:F

    .line 2
    .line 3
    return-void
.end method

.method public final setLayoutInformationReceiver(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/constraintlayout/compose/Measurer;->layoutInformationReceiver:Landroidx/constraintlayout/compose/LayoutInformationReceiver;

    .line 2
    .line 3
    return-void
.end method
