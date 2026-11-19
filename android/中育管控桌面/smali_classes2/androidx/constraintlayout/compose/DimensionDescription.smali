.class public final Landroidx/constraintlayout/compose/DimensionDescription;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/constraintlayout/compose/Dimension$Coercible;
.implements Landroidx/constraintlayout/compose/Dimension$MinCoercible;
.implements Landroidx/constraintlayout/compose/Dimension$MaxCoercible;
.implements Landroidx/constraintlayout/compose/Dimension;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0008\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nB\u001b\u0008\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\r\u0010\u0012\u001a\u00020\u0013H\u0000\u00a2\u0006\u0002\u0008\u0014R\u0014\u0010\u000c\u001a\u00020\rX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\rX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u000e\u0010\u0008\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/DimensionDescription;",
        "Landroidx/constraintlayout/compose/Dimension$Coercible;",
        "Landroidx/constraintlayout/compose/Dimension$MinCoercible;",
        "Landroidx/constraintlayout/compose/Dimension$MaxCoercible;",
        "Landroidx/constraintlayout/compose/Dimension;",
        "value",
        "Landroidx/compose/ui/unit/Dp;",
        "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "valueSymbol",
        "",
        "(Ljava/lang/String;)V",
        "(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;)V",
        "max",
        "Landroidx/constraintlayout/compose/DimensionSymbol;",
        "getMax$constraintlayout_compose_release",
        "()Landroidx/constraintlayout/compose/DimensionSymbol;",
        "min",
        "getMin$constraintlayout_compose_release",
        "asCLElement",
        "Landroidx/constraintlayout/core/parser/CLElement;",
        "asCLElement$constraintlayout_compose_release",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final max:Landroidx/constraintlayout/compose/DimensionSymbol;

.field private final min:Landroidx/constraintlayout/compose/DimensionSymbol;

.field private final valueSymbol:Landroidx/constraintlayout/compose/DimensionSymbol;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(F)V
    .locals 1

    .line 6
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->box-impl(F)Landroidx/compose/ui/unit/Dp;

    move-result-object p1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/compose/DimensionDescription;-><init>(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/DimensionDescription;-><init>(F)V

    return-void
.end method

.method private constructor <init>(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroidx/constraintlayout/compose/DimensionSymbol;

    const-string v1, "base"

    const/4 v2, 0x0

    invoke-direct {v0, p1, p2, v1, v2}, Landroidx/constraintlayout/compose/DimensionSymbol;-><init>(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Landroidx/constraintlayout/compose/DimensionDescription;->valueSymbol:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 4
    new-instance p1, Landroidx/constraintlayout/compose/DimensionSymbol;

    const-string p2, "min"

    invoke-direct {p1, v2, v2, p2, v2}, Landroidx/constraintlayout/compose/DimensionSymbol;-><init>(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/constraintlayout/compose/DimensionDescription;->min:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 5
    new-instance p1, Landroidx/constraintlayout/compose/DimensionSymbol;

    const-string p2, "max"

    invoke-direct {p1, v2, v2, p2, v2}, Landroidx/constraintlayout/compose/DimensionSymbol;-><init>(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Landroidx/constraintlayout/compose/DimensionDescription;->max:Landroidx/constraintlayout/compose/DimensionSymbol;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0, p1}, Landroidx/constraintlayout/compose/DimensionDescription;-><init>(Landroidx/compose/ui/unit/Dp;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final asCLElement$constraintlayout_compose_release()Landroidx/constraintlayout/core/parser/CLElement;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/DimensionDescription;->min:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/DimensionSymbol;->isUndefined()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/DimensionDescription;->max:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/DimensionSymbol;->isUndefined()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/constraintlayout/compose/DimensionDescription;->valueSymbol:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/DimensionSymbol;->asCLElement()Landroidx/constraintlayout/core/parser/CLElement;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_0
    new-instance v0, Landroidx/constraintlayout/core/parser/CLObject;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    new-array v1, v1, [C

    .line 28
    .line 29
    invoke-direct {v0, v1}, Landroidx/constraintlayout/core/parser/CLObject;-><init>([C)V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/constraintlayout/compose/DimensionDescription;->min:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/DimensionSymbol;->isUndefined()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/constraintlayout/compose/DimensionDescription;->min:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 41
    .line 42
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/DimensionSymbol;->asCLElement()Landroidx/constraintlayout/core/parser/CLElement;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "min"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object v1, p0, Landroidx/constraintlayout/compose/DimensionDescription;->max:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 52
    .line 53
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/DimensionSymbol;->isUndefined()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    iget-object v1, p0, Landroidx/constraintlayout/compose/DimensionDescription;->max:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/DimensionSymbol;->asCLElement()Landroidx/constraintlayout/core/parser/CLElement;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "max"

    .line 66
    .line 67
    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 68
    .line 69
    .line 70
    :cond_2
    iget-object v1, p0, Landroidx/constraintlayout/compose/DimensionDescription;->valueSymbol:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 71
    .line 72
    invoke-virtual {v1}, Landroidx/constraintlayout/compose/DimensionSymbol;->asCLElement()Landroidx/constraintlayout/core/parser/CLElement;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v2, "value"

    .line 77
    .line 78
    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 79
    .line 80
    .line 81
    return-object v0
.end method

.method public final getMax$constraintlayout_compose_release()Landroidx/constraintlayout/compose/DimensionSymbol;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/DimensionDescription;->max:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMin$constraintlayout_compose_release()Landroidx/constraintlayout/compose/DimensionSymbol;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/DimensionDescription;->min:Landroidx/constraintlayout/compose/DimensionSymbol;

    .line 2
    .line 3
    return-object v0
.end method
