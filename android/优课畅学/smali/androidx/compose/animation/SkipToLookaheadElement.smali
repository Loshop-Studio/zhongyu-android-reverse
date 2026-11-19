.class public final Landroidx/compose/animation/SkipToLookaheadElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/animation/SkipToLookaheadNode;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final isEnabled:Lx7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/a;"
        }
    .end annotation
.end field

.field private final scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v0, v1, v0}, Landroidx/compose/animation/SkipToLookaheadElement;-><init>(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/ScaleToBoundsImpl;",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    .line 6
    iput-object p2, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 2
    invoke-static {}, Landroidx/compose/animation/SkipToLookaheadNodeKt;->access$getDefaultEnabled$p()Lx7/a;

    move-result-object p2

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/animation/SkipToLookaheadElement;-><init>(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;)V

    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/animation/SkipToLookaheadElement;Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;ILjava/lang/Object;)Landroidx/compose/animation/SkipToLookaheadElement;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/SkipToLookaheadElement;->copy(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;)Landroidx/compose/animation/SkipToLookaheadElement;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/animation/ScaleToBoundsImpl;
    .locals 1

    iget-object v0, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    return-object v0
.end method

.method public final component2()Lx7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;)Landroidx/compose/animation/SkipToLookaheadElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/ScaleToBoundsImpl;",
            "Lx7/a;",
            ")",
            "Landroidx/compose/animation/SkipToLookaheadElement;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/animation/SkipToLookaheadElement;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/compose/animation/SkipToLookaheadElement;-><init>(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public create()Landroidx/compose/animation/SkipToLookaheadNode;
    .locals 3

    .line 2
    new-instance v0, Landroidx/compose/animation/SkipToLookaheadNode;

    iget-object v1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    iget-object v2, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    invoke-direct {v0, v1, v2}, Landroidx/compose/animation/SkipToLookaheadNode;-><init>(Landroidx/compose/animation/ScaleToBoundsImpl;Lx7/a;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/animation/SkipToLookaheadElement;->create()Landroidx/compose/animation/SkipToLookaheadNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/animation/SkipToLookaheadElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/animation/SkipToLookaheadElement;

    iget-object v1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    iget-object v3, p1, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    iget-object p1, p1, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getScaleToBounds()Landroidx/compose/animation/ScaleToBoundsImpl;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 3

    .line 1
    const-string v0, "skipToLookahead"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "scaleToBounds"

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/ui/platform/InspectorInfo;->getProperties()Landroidx/compose/ui/platform/ValueElementSequence;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "isEnabled"

    .line 22
    .line 23
    iget-object v1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/ValueElementSequence;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final isEnabled()Lx7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/a;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SkipToLookaheadElement(scaleToBounds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroidx/compose/animation/SkipToLookaheadNode;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/animation/SkipToLookaheadElement;->scaleToBounds:Landroidx/compose/animation/ScaleToBoundsImpl;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/SkipToLookaheadNode;->setScaleToBounds(Landroidx/compose/animation/ScaleToBoundsImpl;)V

    .line 3
    iget-object v0, p0, Landroidx/compose/animation/SkipToLookaheadElement;->isEnabled:Lx7/a;

    invoke-virtual {p1, v0}, Landroidx/compose/animation/SkipToLookaheadNode;->setEnabled(Lx7/a;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/animation/SkipToLookaheadNode;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/SkipToLookaheadElement;->update(Landroidx/compose/animation/SkipToLookaheadNode;)V

    return-void
.end method
