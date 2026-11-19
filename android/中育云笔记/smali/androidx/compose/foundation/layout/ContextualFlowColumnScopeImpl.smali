.class public final Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/layout/ColumnScope;
.implements Landroidx/compose/foundation/layout/ContextualFlowColumnScope;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

.field private final indexInLine:I

.field private final lineIndex:I

.field private final maxHeightInLine:F

.field private final maxWidth:F


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(IIFF)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->lineIndex:I

    .line 4
    iput p2, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->indexInLine:I

    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->maxWidth:F

    .line 6
    iput p4, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->maxHeightInLine:F

    .line 7
    sget-object p1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    iput-object p1, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    return-void
.end method

.method public synthetic constructor <init>(IIFFLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;-><init>(IIFF)V

    return-void
.end method


# virtual methods
.method public align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/VerticalAlignmentLine;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public alignBy(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->alignBy(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public fillMaxColumnWidth(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p2

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpg-float v0, p2, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    :cond_0
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "invalid fraction "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, "; must be >= 0 and <= 1.0"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Landroidx/compose/foundation/layout/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    new-instance v0, Landroidx/compose/foundation/layout/FillCrossAxisSizeElement;

    .line 42
    .line 43
    invoke-direct {v0, p2}, Landroidx/compose/foundation/layout/FillCrossAxisSizeElement;-><init>(F)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method

.method public getIndexInLine()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->indexInLine:I

    .line 2
    .line 3
    return v0
.end method

.method public getLineIndex()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->lineIndex:I

    .line 2
    .line 3
    return v0
.end method

.method public getMaxHeightInLine-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->maxHeightInLine:F

    .line 2
    .line 3
    return v0
.end method

.method public getMaxWidth-D9Ej5fM()F
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->maxWidth:F

    .line 2
    .line 3
    return v0
.end method

.method public weight(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p2    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl;->$$delegate_0:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/layout/ColumnScopeInstance;->weight(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
