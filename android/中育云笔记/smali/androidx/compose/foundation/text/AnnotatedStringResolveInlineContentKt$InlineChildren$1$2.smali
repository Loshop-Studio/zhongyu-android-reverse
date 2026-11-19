.class final Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/layout/MeasurePolicy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt;->InlineChildren(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# static fields
.field public static final INSTANCE:Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2;

    invoke-direct {v0}, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2;-><init>()V

    sput-object v0, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2;->INSTANCE:Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final measure-3p2s80s(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;J)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    move-object v1, p2

    .line 11
    check-cast v1, Ljava/util/Collection;

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    :goto_0
    if-ge v2, v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroidx/compose/ui/layout/Measurable;

    .line 25
    .line 26
    invoke-interface {v3, p3, p4}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    add-int/lit8 v2, v2, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {p3, p4}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    new-instance v7, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1;

    .line 45
    .line 46
    invoke-direct {v7, v0}, Landroidx/compose/foundation/text/AnnotatedStringResolveInlineContentKt$InlineChildren$1$2$1;-><init>(Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    const/4 v8, 0x4

    .line 50
    const/4 v9, 0x0

    .line 51
    const/4 v6, 0x0

    .line 52
    move-object v3, p1

    .line 53
    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method
