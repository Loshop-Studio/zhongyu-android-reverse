.class public final Landroidx/constraintlayout/compose/ConstrainScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Landroidx/compose/foundation/layout/LayoutScopeMarker;
.end annotation

.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;,
        Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;,
        Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008$\u0008\u0007\u0018\u00002\u00020\u0001:\u0006\u009c\u0001\u009d\u0001\u009e\u0001B\u0017\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020zJ\u000e\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020{J\u0018\u0010|\u001a\u00020x2\u0006\u0010}\u001a\u0002032\u0008\u0008\u0003\u0010~\u001a\u00020\rJ\u000e\u0010\u007f\u001a\u00020x2\u0006\u0010}\u001a\u000203J\u0019\u0010\u0080\u0001\u001a\u00020x2\u0006\u0010}\u001a\u0002032\u0008\u0008\u0003\u0010~\u001a\u00020\rJ-\u0010\u0081\u0001\u001a\u00020x2\u0006\u0010}\u001a\u0002032\u0007\u0010\u0082\u0001\u001a\u00020\r2\u0007\u0010\u0083\u0001\u001a\u00020V\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0084\u0001\u0010\u0085\u0001J\u0007\u0010\u0086\u0001\u001a\u00020xJ\u0007\u0010\u0087\u0001\u001a\u00020xJ\u0007\u0010\u0088\u0001\u001a\u00020xJY\u0010\u0089\u0001\u001a\u00020x2\u0006\u0010T\u001a\u00020z2\u0006\u0010\u0017\u001a\u00020z2\t\u0008\u0002\u0010\u008a\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u008b\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u008c\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u008d\u0001\u001a\u00020V2\u0008\u0008\u0003\u0010~\u001a\u00020\r\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u008f\u0001J\u009f\u0001\u0010\u0089\u0001\u001a\u00020x2\u0006\u0010R\u001a\u00020{2\u0006\u0010T\u001a\u00020z2\u0006\u0010\u001d\u001a\u00020{2\u0006\u0010\u0017\u001a\u00020z2\t\u0008\u0002\u0010\u0090\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u008a\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u0091\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u008b\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u0092\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u008c\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u0093\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u008d\u0001\u001a\u00020V2\u0008\u0008\u0003\u0010(\u001a\u00020\r2\u0008\u0008\u0003\u0010d\u001a\u00020\r\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u0094\u0001\u0010\u0095\u0001JY\u0010\u0089\u0001\u001a\u00020x2\u0006\u0010R\u001a\u00020{2\u0006\u0010\u001d\u001a\u00020{2\t\u0008\u0002\u0010\u0090\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u0091\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u0092\u0001\u001a\u00020V2\t\u0008\u0002\u0010\u0093\u0001\u001a\u00020V2\u0008\u0008\u0003\u0010~\u001a\u00020\r\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u008e\u0001\u0010\u0096\u0001J\u0007\u0010\u0097\u0001\u001a\u00020xJ\u0007\u0010\u0098\u0001\u001a\u00020xJ\u0017\u0010\u0099\u0001\u001a\u00020 *\u00020V\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR&\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\tR+\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R&\u0010(\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008)\u0010\u0010\"\u0004\u0008*\u0010\u0012R+\u0010+\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008.\u0010/\u001a\u0004\u0008,\u0010\u0010\"\u0004\u0008-\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0011\u00102\u001a\u000203\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R+\u00106\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00089\u0010/\u001a\u0004\u00087\u0010\u0010\"\u0004\u00088\u0010\u0012R+\u0010:\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008=\u0010/\u001a\u0004\u0008;\u0010\u0010\"\u0004\u0008<\u0010\u0012R+\u0010>\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008A\u0010/\u001a\u0004\u0008?\u0010\u0010\"\u0004\u0008@\u0010\u0012R+\u0010B\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008E\u0010/\u001a\u0004\u0008C\u0010\u0010\"\u0004\u0008D\u0010\u0012R+\u0010F\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008I\u0010/\u001a\u0004\u0008G\u0010\u0010\"\u0004\u0008H\u0010\u0012R+\u0010J\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008M\u0010/\u001a\u0004\u0008K\u0010\u0010\"\u0004\u0008L\u0010\u0012R+\u0010N\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008Q\u0010/\u001a\u0004\u0008O\u0010\u0010\"\u0004\u0008P\u0010\u0012R\u0011\u0010R\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008S\u0010\tR\u0011\u0010T\u001a\u00020\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010\u001aR1\u0010W\u001a\u00020V2\u0006\u0010\u001f\u001a\u00020V8F@FX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008Z\u0010[\u001a\u0004\u0008X\u0010\u0010\"\u0004\u0008Y\u0010\u0012R1\u0010\\\u001a\u00020V2\u0006\u0010\u001f\u001a\u00020V8F@FX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008_\u0010[\u001a\u0004\u0008]\u0010\u0010\"\u0004\u0008^\u0010\u0012R1\u0010`\u001a\u00020V2\u0006\u0010\u001f\u001a\u00020V8F@FX\u0086\u008e\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008c\u0010[\u001a\u0004\u0008a\u0010\u0010\"\u0004\u0008b\u0010\u0012R&\u0010d\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\r8\u0006@FX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008e\u0010\u0010\"\u0004\u0008f\u0010\u0012R+\u0010g\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008j\u0010/\u001a\u0004\u0008h\u0010\u0010\"\u0004\u0008i\u0010\u0012R+\u0010l\u001a\u00020k2\u0006\u0010\u001f\u001a\u00020k8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008q\u0010r\u001a\u0004\u0008m\u0010n\"\u0004\u0008o\u0010pR+\u0010s\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008v\u0010\'\u001a\u0004\u0008t\u0010#\"\u0004\u0008u\u0010%\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u009f\u0001"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ConstrainScope;",
        "",
        "id",
        "containerObject",
        "Landroidx/constraintlayout/core/parser/CLObject;",
        "(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V",
        "absoluteLeft",
        "Landroidx/constraintlayout/compose/VerticalAnchorable;",
        "getAbsoluteLeft",
        "()Landroidx/constraintlayout/compose/VerticalAnchorable;",
        "absoluteRight",
        "getAbsoluteRight",
        "value",
        "",
        "alpha",
        "getAlpha",
        "()F",
        "setAlpha",
        "(F)V",
        "baseline",
        "Landroidx/constraintlayout/compose/BaselineAnchorable;",
        "getBaseline",
        "()Landroidx/constraintlayout/compose/BaselineAnchorable;",
        "bottom",
        "Landroidx/constraintlayout/compose/HorizontalAnchorable;",
        "getBottom",
        "()Landroidx/constraintlayout/compose/HorizontalAnchorable;",
        "getContainerObject$constraintlayout_compose_release",
        "()Landroidx/constraintlayout/core/parser/CLObject;",
        "end",
        "getEnd",
        "<set-?>",
        "Landroidx/constraintlayout/compose/Dimension;",
        "height",
        "getHeight",
        "()Landroidx/constraintlayout/compose/Dimension;",
        "setHeight",
        "(Landroidx/constraintlayout/compose/Dimension;)V",
        "height$delegate",
        "Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;",
        "horizontalBias",
        "getHorizontalBias",
        "setHorizontalBias",
        "horizontalChainWeight",
        "getHorizontalChainWeight",
        "setHorizontalChainWeight",
        "horizontalChainWeight$delegate",
        "Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;",
        "getId$constraintlayout_compose_release",
        "()Ljava/lang/Object;",
        "parent",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "getParent",
        "()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "pivotX",
        "getPivotX",
        "setPivotX",
        "pivotX$delegate",
        "pivotY",
        "getPivotY",
        "setPivotY",
        "pivotY$delegate",
        "rotationX",
        "getRotationX",
        "setRotationX",
        "rotationX$delegate",
        "rotationY",
        "getRotationY",
        "setRotationY",
        "rotationY$delegate",
        "rotationZ",
        "getRotationZ",
        "setRotationZ",
        "rotationZ$delegate",
        "scaleX",
        "getScaleX",
        "setScaleX",
        "scaleX$delegate",
        "scaleY",
        "getScaleY",
        "setScaleY",
        "scaleY$delegate",
        "start",
        "getStart",
        "top",
        "getTop",
        "Landroidx/compose/ui/unit/Dp;",
        "translationX",
        "getTranslationX-D9Ej5fM",
        "setTranslationX-0680j_4",
        "translationX$delegate",
        "Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;",
        "translationY",
        "getTranslationY-D9Ej5fM",
        "setTranslationY-0680j_4",
        "translationY$delegate",
        "translationZ",
        "getTranslationZ-D9Ej5fM",
        "setTranslationZ-0680j_4",
        "translationZ$delegate",
        "verticalBias",
        "getVerticalBias",
        "setVerticalBias",
        "verticalChainWeight",
        "getVerticalChainWeight",
        "setVerticalChainWeight",
        "verticalChainWeight$delegate",
        "Landroidx/constraintlayout/compose/Visibility;",
        "visibility",
        "getVisibility",
        "()Landroidx/constraintlayout/compose/Visibility;",
        "setVisibility",
        "(Landroidx/constraintlayout/compose/Visibility;)V",
        "visibility$delegate",
        "Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;",
        "width",
        "getWidth",
        "setWidth",
        "width$delegate",
        "centerAround",
        "",
        "anchor",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "centerHorizontallyTo",
        "other",
        "bias",
        "centerTo",
        "centerVerticallyTo",
        "circular",
        "angle",
        "distance",
        "circular-wH6b6FI",
        "(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FF)V",
        "clearConstraints",
        "clearHorizontal",
        "clearVertical",
        "linkTo",
        "topMargin",
        "bottomMargin",
        "topGoneMargin",
        "bottomGoneMargin",
        "linkTo-8ZKsbrE",
        "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V",
        "startMargin",
        "endMargin",
        "startGoneMargin",
        "endGoneMargin",
        "linkTo-R7zmacU",
        "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V",
        "(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V",
        "resetDimensions",
        "resetTransforms",
        "asDimension",
        "asDimension-0680j_4",
        "(F)Landroidx/constraintlayout/compose/Dimension;",
        "DimensionProperty",
        "DpProperty",
        "FloatProperty",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConstrainScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstrainScope.kt\nandroidx/constraintlayout/compose/ConstrainScope\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,482:1\n149#2:483\n149#2:484\n149#2:485\n149#2:486\n149#2:487\n149#2:488\n149#2:489\n149#2:490\n149#2:491\n149#2:492\n149#2:493\n149#2:494\n149#2:495\n149#2:496\n149#2:497\n149#2:498\n149#2:499\n149#2:500\n149#2:501\n*S KotlinDebug\n*F\n+ 1 ConstrainScope.kt\nandroidx/constraintlayout/compose/ConstrainScope\n*L\n119#1:483\n122#1:484\n125#1:485\n193#1:486\n194#1:487\n195#1:488\n196#1:489\n214#1:490\n215#1:491\n216#1:492\n217#1:493\n238#1:494\n239#1:495\n240#1:496\n241#1:497\n242#1:498\n243#1:499\n244#1:500\n245#1:501\n*E\n"
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I


# instance fields
.field private final absoluteLeft:Landroidx/constraintlayout/compose/VerticalAnchorable;

.field private final absoluteRight:Landroidx/constraintlayout/compose/VerticalAnchorable;

.field private alpha:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field private final baseline:Landroidx/constraintlayout/compose/BaselineAnchorable;

.field private final bottom:Landroidx/constraintlayout/compose/HorizontalAnchorable;

.field private final containerObject:Landroidx/constraintlayout/core/parser/CLObject;

.field private final end:Landroidx/constraintlayout/compose/VerticalAnchorable;

.field private final height$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

.field private horizontalBias:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field private final horizontalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final id:Ljava/lang/Object;

.field private final parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

.field private final pivotX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final pivotY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final rotationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final rotationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final rotationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final scaleX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final scaleY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final start:Landroidx/constraintlayout/compose/VerticalAnchorable;

.field private final top:Landroidx/constraintlayout/compose/HorizontalAnchorable;

.field private final translationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

.field private final translationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

.field private final translationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

.field private verticalBias:F
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation
.end field

.field private final verticalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

.field private final visibility$delegate:Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;

.field private final width$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v0, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 2
    .line 3
    const-class v1, Landroidx/constraintlayout/compose/ConstrainScope;

    .line 4
    .line 5
    const-string/jumbo v2, "width"

    .line 6
    .line 7
    .line 8
    const-string v3, "getWidth()Landroidx/constraintlayout/compose/Dimension;"

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v2, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 19
    .line 20
    const-string v3, "height"

    .line 21
    .line 22
    const-string v5, "getHeight()Landroidx/constraintlayout/compose/Dimension;"

    .line 23
    .line 24
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    new-instance v3, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 32
    .line 33
    const-string/jumbo v5, "visibility"

    .line 34
    .line 35
    .line 36
    const-string v6, "getVisibility()Landroidx/constraintlayout/compose/Visibility;"

    .line 37
    .line 38
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v3}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v5, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 46
    .line 47
    const-string/jumbo v6, "scaleX"

    .line 48
    .line 49
    .line 50
    const-string v7, "getScaleX()F"

    .line 51
    .line 52
    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    invoke-static {v5}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-instance v6, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 60
    .line 61
    const-string/jumbo v7, "scaleY"

    .line 62
    .line 63
    .line 64
    const-string v8, "getScaleY()F"

    .line 65
    .line 66
    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    invoke-static {v6}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    new-instance v7, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 74
    .line 75
    const-string/jumbo v8, "rotationX"

    .line 76
    .line 77
    .line 78
    const-string v9, "getRotationX()F"

    .line 79
    .line 80
    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    new-instance v8, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 88
    .line 89
    const-string/jumbo v9, "rotationY"

    .line 90
    .line 91
    .line 92
    const-string v10, "getRotationY()F"

    .line 93
    .line 94
    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    invoke-static {v8}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    new-instance v9, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 102
    .line 103
    const-string/jumbo v10, "rotationZ"

    .line 104
    .line 105
    .line 106
    const-string v11, "getRotationZ()F"

    .line 107
    .line 108
    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    invoke-static {v9}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    new-instance v10, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 116
    .line 117
    const-string/jumbo v11, "translationX"

    .line 118
    .line 119
    .line 120
    const-string v12, "getTranslationX-D9Ej5fM()F"

    .line 121
    .line 122
    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 123
    .line 124
    .line 125
    invoke-static {v10}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    new-instance v11, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 130
    .line 131
    const-string/jumbo v12, "translationY"

    .line 132
    .line 133
    .line 134
    const-string v13, "getTranslationY-D9Ej5fM()F"

    .line 135
    .line 136
    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {v11}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    new-instance v12, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 144
    .line 145
    const-string/jumbo v13, "translationZ"

    .line 146
    .line 147
    .line 148
    const-string v14, "getTranslationZ-D9Ej5fM()F"

    .line 149
    .line 150
    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v12}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 154
    .line 155
    .line 156
    move-result-object v12

    .line 157
    new-instance v13, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 158
    .line 159
    const-string/jumbo v14, "pivotX"

    .line 160
    .line 161
    .line 162
    const-string v15, "getPivotX()F"

    .line 163
    .line 164
    invoke-direct {v13, v1, v14, v15, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    invoke-static {v13}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 168
    .line 169
    .line 170
    move-result-object v13

    .line 171
    new-instance v14, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 172
    .line 173
    const-string/jumbo v15, "pivotY"

    .line 174
    .line 175
    .line 176
    move-object/from16 v16, v0

    .line 177
    .line 178
    const-string v0, "getPivotY()F"

    .line 179
    .line 180
    invoke-direct {v14, v1, v15, v0, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v14}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    new-instance v14, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 188
    .line 189
    const-string v15, "horizontalChainWeight"

    .line 190
    .line 191
    move-object/from16 v17, v0

    .line 192
    .line 193
    const-string v0, "getHorizontalChainWeight()F"

    .line 194
    .line 195
    invoke-direct {v14, v1, v15, v0, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 196
    .line 197
    .line 198
    invoke-static {v14}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    new-instance v14, Lkotlin/jvm/internal/MutablePropertyReference1Impl;

    .line 203
    .line 204
    const-string/jumbo v15, "verticalChainWeight"

    .line 205
    .line 206
    .line 207
    move-object/from16 v18, v0

    .line 208
    .line 209
    const-string v0, "getVerticalChainWeight()F"

    .line 210
    .line 211
    invoke-direct {v14, v1, v15, v0, v4}, Lkotlin/jvm/internal/MutablePropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v14}, Lkotlin/jvm/internal/Reflection;->mutableProperty1(Lkotlin/jvm/internal/MutablePropertyReference1;)Lkotlin/reflect/KMutableProperty1;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const/16 v1, 0xf

    .line 219
    .line 220
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 221
    .line 222
    aput-object v16, v1, v4

    .line 223
    .line 224
    const/4 v4, 0x1

    .line 225
    aput-object v2, v1, v4

    .line 226
    .line 227
    const/4 v2, 0x2

    .line 228
    aput-object v3, v1, v2

    .line 229
    .line 230
    const/4 v2, 0x3

    .line 231
    aput-object v5, v1, v2

    .line 232
    .line 233
    const/4 v2, 0x4

    .line 234
    aput-object v6, v1, v2

    .line 235
    .line 236
    const/4 v2, 0x5

    .line 237
    aput-object v7, v1, v2

    .line 238
    .line 239
    const/4 v2, 0x6

    .line 240
    aput-object v8, v1, v2

    .line 241
    .line 242
    const/4 v2, 0x7

    .line 243
    aput-object v9, v1, v2

    .line 244
    .line 245
    const/16 v2, 0x8

    .line 246
    .line 247
    aput-object v10, v1, v2

    .line 248
    .line 249
    const/16 v2, 0x9

    .line 250
    .line 251
    aput-object v11, v1, v2

    .line 252
    .line 253
    const/16 v2, 0xa

    .line 254
    .line 255
    aput-object v12, v1, v2

    .line 256
    .line 257
    const/16 v2, 0xb

    .line 258
    .line 259
    aput-object v13, v1, v2

    .line 260
    .line 261
    const/16 v2, 0xc

    .line 262
    .line 263
    aput-object v17, v1, v2

    .line 264
    .line 265
    const/16 v2, 0xd

    .line 266
    .line 267
    aput-object v18, v1, v2

    .line 268
    .line 269
    const/16 v2, 0xe

    .line 270
    .line 271
    aput-object v0, v1, v2

    .line 272
    .line 273
    sput-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 274
    .line 275
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->id:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 7
    .line 8
    new-instance p1, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 9
    .line 10
    const-string/jumbo v0, "parent"

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 17
    .line 18
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;

    .line 19
    .line 20
    const/4 v0, -0x2

    .line 21
    invoke-direct {p1, v0, p2}, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;-><init>(ILandroidx/constraintlayout/core/parser/CLObject;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->start:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 25
    .line 26
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-direct {p1, v0, p2}, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;-><init>(ILandroidx/constraintlayout/core/parser/CLObject;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->absoluteLeft:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 33
    .line 34
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintHorizontalAnchorable;

    .line 35
    .line 36
    invoke-direct {p1, v0, p2}, Landroidx/constraintlayout/compose/ConstraintHorizontalAnchorable;-><init>(ILandroidx/constraintlayout/core/parser/CLObject;)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->top:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;

    .line 42
    .line 43
    const/4 v1, -0x1

    .line 44
    invoke-direct {p1, v1, p2}, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;-><init>(ILandroidx/constraintlayout/core/parser/CLObject;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->end:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 48
    .line 49
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {p1, v1, p2}, Landroidx/constraintlayout/compose/ConstraintVerticalAnchorable;-><init>(ILandroidx/constraintlayout/core/parser/CLObject;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->absoluteRight:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 56
    .line 57
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintHorizontalAnchorable;

    .line 58
    .line 59
    invoke-direct {p1, v1, p2}, Landroidx/constraintlayout/compose/ConstraintHorizontalAnchorable;-><init>(ILandroidx/constraintlayout/core/parser/CLObject;)V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->bottom:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 63
    .line 64
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintBaselineAnchorable;

    .line 65
    .line 66
    invoke-direct {p1, p2}, Landroidx/constraintlayout/compose/ConstraintBaselineAnchorable;-><init>(Landroidx/constraintlayout/core/parser/CLObject;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->baseline:Landroidx/constraintlayout/compose/BaselineAnchorable;

    .line 70
    .line 71
    new-instance p1, Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 72
    .line 73
    sget-object p2, Landroidx/constraintlayout/compose/Dimension;->Companion:Landroidx/constraintlayout/compose/Dimension$Companion;

    .line 74
    .line 75
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/Dimension$Companion;->getWrapContent()Landroidx/constraintlayout/compose/Dimension;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {p1, p0, v1}, Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/Dimension;)V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->width$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 83
    .line 84
    new-instance p1, Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 85
    .line 86
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/Dimension$Companion;->getWrapContent()Landroidx/constraintlayout/compose/Dimension;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-direct {p1, p0, p2}, Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/Dimension;)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->height$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 94
    .line 95
    sget-object p1, Landroidx/constraintlayout/compose/Visibility;->Companion:Landroidx/constraintlayout/compose/Visibility$Companion;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/Visibility$Companion;->getVisible()Landroidx/constraintlayout/compose/Visibility;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    new-instance p2, Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;

    .line 102
    .line 103
    invoke-direct {p2, p0, p1}, Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/Visibility;)V

    .line 104
    .line 105
    .line 106
    iput-object p2, p0, Landroidx/constraintlayout/compose/ConstrainScope;->visibility$delegate:Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;

    .line 107
    .line 108
    const/high16 p1, 0x3f800000    # 1.0f

    .line 109
    .line 110
    iput p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->alpha:F

    .line 111
    .line 112
    new-instance v1, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 113
    .line 114
    const/4 v5, 0x2

    .line 115
    const/4 v6, 0x0

    .line 116
    const/high16 v3, 0x3f800000    # 1.0f

    .line 117
    .line 118
    const/4 v4, 0x0

    .line 119
    move-object v2, p0

    .line 120
    invoke-direct/range {v1 .. v6}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 121
    .line 122
    .line 123
    move-object v8, v2

    .line 124
    iput-object v1, v8, Landroidx/constraintlayout/compose/ConstrainScope;->scaleX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 125
    .line 126
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 127
    .line 128
    const/4 v11, 0x2

    .line 129
    const/4 v12, 0x0

    .line 130
    const/high16 v9, 0x3f800000    # 1.0f

    .line 131
    .line 132
    const/4 v10, 0x0

    .line 133
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 134
    .line 135
    .line 136
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->scaleY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 137
    .line 138
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 139
    .line 140
    const/4 v9, 0x0

    .line 141
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 142
    .line 143
    .line 144
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->rotationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 145
    .line 146
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 147
    .line 148
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 149
    .line 150
    .line 151
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->rotationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 152
    .line 153
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 154
    .line 155
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 156
    .line 157
    .line 158
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->rotationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 159
    .line 160
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 161
    .line 162
    int-to-float p1, v0

    .line 163
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 168
    .line 169
    .line 170
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->translationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 171
    .line 172
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 173
    .line 174
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 179
    .line 180
    .line 181
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->translationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 182
    .line 183
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 184
    .line 185
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 186
    .line 187
    .line 188
    move-result v9

    .line 189
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 190
    .line 191
    .line 192
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->translationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 193
    .line 194
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 195
    .line 196
    const/high16 v9, 0x3f000000    # 0.5f

    .line 197
    .line 198
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 199
    .line 200
    .line 201
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->pivotX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 202
    .line 203
    new-instance v7, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 204
    .line 205
    invoke-direct/range {v7 .. v12}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 206
    .line 207
    .line 208
    iput-object v7, v8, Landroidx/constraintlayout/compose/ConstrainScope;->pivotY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 209
    .line 210
    new-instance p1, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 211
    .line 212
    const-string p2, "hWeight"

    .line 213
    .line 214
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 215
    .line 216
    invoke-direct {p1, p0, v0, p2}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iput-object p1, v8, Landroidx/constraintlayout/compose/ConstrainScope;->horizontalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 220
    .line 221
    new-instance p1, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 222
    .line 223
    const-string/jumbo p2, "vWeight"

    .line 224
    .line 225
    .line 226
    invoke-direct {p1, p0, v0, p2}, Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;-><init>(Landroidx/constraintlayout/compose/ConstrainScope;FLjava/lang/String;)V

    .line 227
    .line 228
    .line 229
    iput-object p1, v8, Landroidx/constraintlayout/compose/ConstrainScope;->verticalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 230
    .line 231
    const/high16 p1, 0x3f000000    # 0.5f

    .line 232
    .line 233
    iput p1, v8, Landroidx/constraintlayout/compose/ConstrainScope;->horizontalBias:F

    .line 234
    .line 235
    iput p1, v8, Landroidx/constraintlayout/compose/ConstrainScope;->verticalBias:F

    .line 236
    .line 237
    return-void
.end method

.method public static synthetic centerHorizontallyTo$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/high16 p2, 0x3f000000    # 0.5f

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstrainScope;->centerHorizontallyTo(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic centerVerticallyTo$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/high16 p2, 0x3f000000    # 0.5f

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstrainScope;->centerVerticallyTo(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static synthetic linkTo-8ZKsbrE$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p8, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p3, v1

    .line 6
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    :cond_0
    move v5, p3

    and-int/lit8 p3, p8, 0x8

    if-eqz p3, :cond_1

    int-to-float p3, v1

    .line 7
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p4

    :cond_1
    move v6, p4

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_2

    int-to-float p3, v1

    .line 8
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p5

    :cond_2
    move v7, p5

    and-int/lit8 p3, p8, 0x20

    if-eqz p3, :cond_3

    int-to-float p3, v1

    .line 9
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    move v8, p3

    goto :goto_0

    :cond_3
    move/from16 v8, p6

    :goto_0
    and-int/lit8 p3, p8, 0x40

    if-eqz p3, :cond_4

    const/high16 p3, 0x3f000000    # 0.5f

    move v9, p3

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    goto :goto_2

    :cond_4
    move/from16 v9, p7

    goto :goto_1

    .line 10
    :goto_2
    invoke-virtual/range {v2 .. v9}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V

    return-void
.end method

.method public static synthetic linkTo-8ZKsbrE$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFFILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p8, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p3, v1

    .line 1
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    :cond_0
    move v5, p3

    and-int/lit8 p3, p8, 0x8

    if-eqz p3, :cond_1

    int-to-float p3, v1

    .line 2
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p4

    :cond_1
    move v6, p4

    and-int/lit8 p3, p8, 0x10

    if-eqz p3, :cond_2

    int-to-float p3, v1

    .line 3
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p5

    :cond_2
    move v7, p5

    and-int/lit8 p3, p8, 0x20

    if-eqz p3, :cond_3

    int-to-float p3, v1

    .line 4
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    move v8, p3

    goto :goto_0

    :cond_3
    move/from16 v8, p6

    :goto_0
    and-int/lit8 p3, p8, 0x40

    if-eqz p3, :cond_4

    const/high16 p3, 0x3f000000    # 0.5f

    move v9, p3

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    goto :goto_2

    :cond_4
    move/from16 v9, p7

    goto :goto_1

    .line 5
    :goto_2
    invoke-virtual/range {v2 .. v9}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V

    return-void
.end method

.method public static synthetic linkTo-R7zmacU$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFFILjava/lang/Object;)V
    .locals 18

    .line 1
    move/from16 v0, p15

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    int-to-float v1, v2

    .line 9
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    move v8, v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move/from16 v8, p5

    .line 16
    .line 17
    :goto_0
    and-int/lit8 v1, v0, 0x20

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    int-to-float v1, v2

    .line 22
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    move v9, v1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move/from16 v9, p6

    .line 29
    .line 30
    :goto_1
    and-int/lit8 v1, v0, 0x40

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    int-to-float v1, v2

    .line 35
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    move v10, v1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move/from16 v10, p7

    .line 42
    .line 43
    :goto_2
    and-int/lit16 v1, v0, 0x80

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    int-to-float v1, v2

    .line 48
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    move v11, v1

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    move/from16 v11, p8

    .line 55
    .line 56
    :goto_3
    and-int/lit16 v1, v0, 0x100

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    int-to-float v1, v2

    .line 61
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    move v12, v1

    .line 66
    goto :goto_4

    .line 67
    :cond_4
    move/from16 v12, p9

    .line 68
    .line 69
    :goto_4
    and-int/lit16 v1, v0, 0x200

    .line 70
    .line 71
    if-eqz v1, :cond_5

    .line 72
    .line 73
    int-to-float v1, v2

    .line 74
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    move v13, v1

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    move/from16 v13, p10

    .line 81
    .line 82
    :goto_5
    and-int/lit16 v1, v0, 0x400

    .line 83
    .line 84
    if-eqz v1, :cond_6

    .line 85
    .line 86
    int-to-float v1, v2

    .line 87
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    move v14, v1

    .line 92
    goto :goto_6

    .line 93
    :cond_6
    move/from16 v14, p11

    .line 94
    .line 95
    :goto_6
    and-int/lit16 v1, v0, 0x800

    .line 96
    .line 97
    if-eqz v1, :cond_7

    .line 98
    .line 99
    int-to-float v1, v2

    .line 100
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    move v15, v1

    .line 105
    goto :goto_7

    .line 106
    :cond_7
    move/from16 v15, p12

    .line 107
    .line 108
    :goto_7
    and-int/lit16 v1, v0, 0x1000

    .line 109
    .line 110
    const/high16 v2, 0x3f000000    # 0.5f

    .line 111
    .line 112
    if-eqz v1, :cond_8

    .line 113
    .line 114
    move/from16 v16, v2

    .line 115
    .line 116
    goto :goto_8

    .line 117
    :cond_8
    move/from16 v16, p13

    .line 118
    .line 119
    :goto_8
    and-int/lit16 v0, v0, 0x2000

    .line 120
    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    move/from16 v17, v2

    .line 124
    .line 125
    :goto_9
    move-object/from16 v3, p0

    .line 126
    .line 127
    move-object/from16 v4, p1

    .line 128
    .line 129
    move-object/from16 v5, p2

    .line 130
    .line 131
    move-object/from16 v6, p3

    .line 132
    .line 133
    move-object/from16 v7, p4

    .line 134
    .line 135
    goto :goto_a

    .line 136
    :cond_9
    move/from16 v17, p14

    .line 137
    .line 138
    goto :goto_9

    .line 139
    :goto_a
    invoke-virtual/range {v3 .. v17}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-R7zmacU(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V

    .line 140
    .line 141
    .line 142
    return-void
.end method


# virtual methods
.method public final asDimension-0680j_4(F)Landroidx/constraintlayout/compose/Dimension;
    .locals 1

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/Dimension;->Companion:Landroidx/constraintlayout/compose/Dimension$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/compose/Dimension$Companion;->value-0680j_4(F)Landroidx/constraintlayout/compose/Dimension;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final centerAround(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;)V
    .locals 10

    const/16 v8, 0x7c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-static/range {v0 .. v9}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFILjava/lang/Object;)V

    return-void
.end method

.method public final centerAround(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;)V
    .locals 10

    const/16 v8, 0x7c

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-static/range {v0 .. v9}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFFILjava/lang/Object;)V

    return-void
.end method

.method public final centerHorizontallyTo(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)V
    .locals 10
    .param p2    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getStart()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getEnd()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/16 v8, 0x3c

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v0, p0

    .line 17
    move v7, p2

    .line 18
    invoke-static/range {v0 .. v9}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFFILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final centerTo(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;)V
    .locals 17

    .line 1
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getStart()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getTop()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getEnd()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual/range {p1 .. p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getBottom()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    const/16 v15, 0x3ff0

    .line 18
    .line 19
    const/16 v16, 0x0

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x0

    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v10, 0x0

    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v14, 0x0

    .line 31
    move-object/from16 v0, p0

    .line 32
    .line 33
    invoke-static/range {v0 .. v16}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-R7zmacU$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFFILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final centerVerticallyTo(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;F)V
    .locals 10
    .param p2    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getTop()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getBottom()Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/16 v8, 0x3c

    .line 10
    .line 11
    const/4 v9, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x0

    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v0, p0

    .line 17
    move v7, p2

    .line 18
    invoke-static/range {v0 .. v9}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE$default(Landroidx/constraintlayout/compose/ConstrainScope;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final circular-wH6b6FI(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;FF)V
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/core/parser/CLArray;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [C

    .line 5
    .line 6
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 30
    .line 31
    .line 32
    new-instance p1, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 33
    .line 34
    invoke-direct {p1, p3}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 41
    .line 42
    const-string p2, "circular"

    .line 43
    .line 44
    invoke-virtual {p1, p2, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final clearConstraints()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainScope;->clearHorizontal()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/constraintlayout/compose/ConstrainScope;->clearVertical()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 8
    .line 9
    const-string v1, "circular"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final clearHorizontal()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    const-string/jumbo v1, "left"

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 10
    .line 11
    const-string/jumbo v1, "right"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 18
    .line 19
    const-string/jumbo v1, "start"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 26
    .line 27
    const-string v1, "end"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final clearVertical()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    const-string/jumbo v1, "top"

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 10
    .line 11
    const-string v1, "bottom"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 17
    .line 18
    const-string v1, "baseline"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final getAbsoluteLeft()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->absoluteLeft:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAbsoluteRight()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->absoluteRight:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getAlpha()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->alpha:F

    .line 2
    .line 3
    return v0
.end method

.method public final getBaseline()Landroidx/constraintlayout/compose/BaselineAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->baseline:Landroidx/constraintlayout/compose/BaselineAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getBottom()Landroidx/constraintlayout/compose/HorizontalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->bottom:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getContainerObject$constraintlayout_compose_release()Landroidx/constraintlayout/core/parser/CLObject;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getEnd()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->end:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeight()Landroidx/constraintlayout/compose/Dimension;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->height$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/constraintlayout/compose/Dimension;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getHorizontalBias()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->horizontalBias:F

    .line 2
    .line 3
    return v0
.end method

.method public final getHorizontalChainWeight()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->horizontalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getId$constraintlayout_compose_release()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->id:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getParent()Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->parent:Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPivotX()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->pivotX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getPivotY()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->pivotY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getRotationX()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->rotationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getRotationY()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->rotationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getRotationZ()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->rotationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getScaleX()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->scaleX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getScaleY()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->scaleY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final getStart()Landroidx/constraintlayout/compose/VerticalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->start:Landroidx/constraintlayout/compose/VerticalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTop()Landroidx/constraintlayout/compose/HorizontalAnchorable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->top:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTranslationX-D9Ej5fM()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->translationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/compose/ui/unit/Dp;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getTranslationY-D9Ej5fM()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->translationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/compose/ui/unit/Dp;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getTranslationZ-D9Ej5fM()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->translationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/compose/ui/unit/Dp;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getVerticalBias()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->verticalBias:F

    .line 2
    .line 3
    return v0
.end method

.method public final getVerticalChainWeight()F
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->verticalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getVisibility()Landroidx/constraintlayout/compose/Visibility;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->visibility$delegate:Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/constraintlayout/compose/Visibility;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getWidth()Landroidx/constraintlayout/compose/Dimension;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->width$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lkotlin/properties/ObservableProperty;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/constraintlayout/compose/Dimension;

    .line 13
    .line 14
    return-object v0
.end method

.method public final linkTo-8ZKsbrE(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V
    .locals 1
    .param p7    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 4
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->top:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    invoke-interface {v0, p1, p3, p5}, Landroidx/constraintlayout/compose/HorizontalAnchorable;->linkTo-VpY3zN4(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V

    .line 5
    iget-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->bottom:Landroidx/constraintlayout/compose/HorizontalAnchorable;

    invoke-interface {p1, p2, p4, p6}, Landroidx/constraintlayout/compose/HorizontalAnchorable;->linkTo-VpY3zN4(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FF)V

    .line 6
    iget-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    const-string/jumbo p2, "vBias"

    invoke-virtual {p1, p2, p7}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    return-void
.end method

.method public final linkTo-8ZKsbrE(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V
    .locals 1
    .param p7    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->start:Landroidx/constraintlayout/compose/VerticalAnchorable;

    invoke-interface {v0, p1, p3, p5}, Landroidx/constraintlayout/compose/VerticalAnchorable;->linkTo-VpY3zN4(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V

    .line 2
    iget-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->end:Landroidx/constraintlayout/compose/VerticalAnchorable;

    invoke-interface {p1, p2, p4, p6}, Landroidx/constraintlayout/compose/VerticalAnchorable;->linkTo-VpY3zN4(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FF)V

    .line 3
    iget-object p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    const-string p2, "hRtlBias"

    invoke-virtual {p1, p2, p7}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    return-void
.end method

.method public final linkTo-R7zmacU(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFFFFFFF)V
    .locals 8
    .param p13    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .param p14    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param

    .line 1
    move-object v0, p0

    .line 2
    move-object v1, p1

    .line 3
    move-object v2, p3

    .line 4
    move v3, p5

    .line 5
    move v4, p7

    .line 6
    move/from16 v5, p9

    .line 7
    .line 8
    move/from16 v6, p11

    .line 9
    .line 10
    move/from16 v7, p13

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v7}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;FFFFF)V

    .line 13
    .line 14
    .line 15
    move-object v1, p2

    .line 16
    move-object v2, p4

    .line 17
    move v3, p6

    .line 18
    move/from16 v4, p8

    .line 19
    .line 20
    move/from16 v5, p10

    .line 21
    .line 22
    move/from16 v6, p12

    .line 23
    .line 24
    move/from16 v7, p14

    .line 25
    .line 26
    invoke-virtual/range {v0 .. v7}, Landroidx/constraintlayout/compose/ConstrainScope;->linkTo-8ZKsbrE(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;FFFFF)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final resetDimensions()V
    .locals 2

    .line 1
    sget-object v0, Landroidx/constraintlayout/compose/Dimension;->Companion:Landroidx/constraintlayout/compose/Dimension$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/Dimension$Companion;->getWrapContent()Landroidx/constraintlayout/compose/Dimension;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0, v1}, Landroidx/constraintlayout/compose/ConstrainScope;->setWidth(Landroidx/constraintlayout/compose/Dimension;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/Dimension$Companion;->getWrapContent()Landroidx/constraintlayout/compose/Dimension;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstrainScope;->setHeight(Landroidx/constraintlayout/compose/Dimension;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final resetTransforms()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    const-string v1, "alpha"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 9
    .line 10
    const-string/jumbo v1, "scaleX"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 17
    .line 18
    const-string/jumbo v1, "scaleY"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 25
    .line 26
    const-string/jumbo v1, "rotationX"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 33
    .line 34
    const-string/jumbo v1, "rotationY"

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 41
    .line 42
    const-string/jumbo v1, "rotationZ"

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 49
    .line 50
    const-string/jumbo v1, "translationX"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 57
    .line 58
    const-string/jumbo v1, "translationY"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 65
    .line 66
    const-string/jumbo v1, "translationZ"

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 73
    .line 74
    const-string/jumbo v1, "pivotX"

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 81
    .line 82
    const-string/jumbo v1, "pivotY"

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->remove(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final setAlpha(F)V
    .locals 2

    .line 1
    iput p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->alpha:F

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 10
    .line 11
    const-string v1, "alpha"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final setHeight(Landroidx/constraintlayout/compose/Dimension;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->height$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setHorizontalBias(F)V
    .locals 2

    .line 1
    iput p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->horizontalBias:F

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 10
    .line 11
    const-string v1, "hBias"

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final setHorizontalChainWeight(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->horizontalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setPivotX(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->pivotX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setPivotY(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->pivotY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setRotationX(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->rotationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setRotationY(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->rotationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setRotationZ(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->rotationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setScaleX(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->scaleX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setScaleY(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->scaleY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTranslationX-0680j_4(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->translationX$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setTranslationY-0680j_4(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->translationY$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setTranslationZ-0680j_4(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->translationZ$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DpProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setVerticalBias(F)V
    .locals 2

    .line 1
    iput p1, p0, Landroidx/constraintlayout/compose/ConstrainScope;->verticalBias:F

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 10
    .line 11
    const-string/jumbo v1, "vBias"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setVerticalChainWeight(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->verticalChainWeight$delegate:Landroidx/constraintlayout/compose/ConstrainScope$FloatProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setVisibility(Landroidx/constraintlayout/compose/Visibility;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->visibility$delegate:Landroidx/constraintlayout/compose/ConstrainScope$visibility$2;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setWidth(Landroidx/constraintlayout/compose/Dimension;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstrainScope;->width$delegate:Landroidx/constraintlayout/compose/ConstrainScope$DimensionProperty;

    .line 2
    .line 3
    sget-object v1, Landroidx/constraintlayout/compose/ConstrainScope;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, p1}, Lkotlin/properties/ObservableProperty;->setValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
