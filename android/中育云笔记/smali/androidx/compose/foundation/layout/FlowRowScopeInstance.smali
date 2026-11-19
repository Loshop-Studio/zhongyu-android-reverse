.class public final Landroidx/compose/foundation/layout/FlowRowScopeInstance;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/layout/RowScope;
.implements Landroidx/compose/foundation/layout/FlowRowScope;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Landroidx/compose/foundation/layout/FlowRowScopeInstance;


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/foundation/layout/RowScopeInstance;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;

    invoke-direct {v0}, Landroidx/compose/foundation/layout/FlowRowScopeInstance;-><init>()V

    sput-object v0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/FlowRowScopeInstance;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/RowScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/RowScopeInstance;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/RowScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/RowScopeInstance;->alignBy(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/HorizontalAlignmentLine;)Landroidx/compose/ui/Modifier;

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
    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/RowScopeInstance;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/layout/RowScopeInstance;->alignBy(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/RowScopeInstance;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/layout/RowScopeInstance;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method

.method public fillMaxRowHeight(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p2, v0

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    const/high16 v0, 0x3f800000    # 1.0f

    .line 7
    .line 8
    cmpg-float v0, p2, v0

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "invalid fraction "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, "; must be >= 0 and <= 1.0"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Landroidx/compose/foundation/layout/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    new-instance v0, Landroidx/compose/foundation/layout/FillCrossAxisSizeElement;

    .line 43
    .line 44
    invoke-direct {v0, p2}, Landroidx/compose/foundation/layout/FillCrossAxisSizeElement;-><init>(F)V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
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

    iget-object v0, p0, Landroidx/compose/foundation/layout/FlowRowScopeInstance;->$$delegate_0:Landroidx/compose/foundation/layout/RowScopeInstance;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/layout/RowScopeInstance;->weight(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;

    move-result-object p1

    return-object p1
.end method
