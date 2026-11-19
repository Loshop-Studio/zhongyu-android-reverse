.class public final Landroidx/compose/animation/ColorVectorConverterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ColorToVector:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1;->INSTANCE:Landroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1;

    .line 2
    .line 3
    sput-object v0, Landroidx/compose/animation/ColorVectorConverterKt;->ColorToVector:Lhd/l;

    .line 4
    .line 5
    return-void
.end method

.method public static final getVectorConverter(Landroidx/compose/ui/graphics/Color$Companion;)Lhd/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/graphics/Color$Companion;",
            ")",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    sget-object p0, Landroidx/compose/animation/ColorVectorConverterKt;->ColorToVector:Lhd/l;

    .line 2
    .line 3
    return-object p0
.end method
