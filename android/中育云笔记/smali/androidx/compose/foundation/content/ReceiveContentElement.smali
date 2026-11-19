.class public final Landroidx/compose/foundation/content/ReceiveContentElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/content/ReceiveContentNode;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/content/ReceiveContentListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic copy$default(Landroidx/compose/foundation/content/ReceiveContentElement;Landroidx/compose/foundation/content/ReceiveContentListener;ILjava/lang/Object;)Landroidx/compose/foundation/content/ReceiveContentElement;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/content/ReceiveContentElement;->copy(Landroidx/compose/foundation/content/ReceiveContentListener;)Landroidx/compose/foundation/content/ReceiveContentElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Landroidx/compose/foundation/content/ReceiveContentListener;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    return-object v0
.end method

.method public final copy(Landroidx/compose/foundation/content/ReceiveContentListener;)Landroidx/compose/foundation/content/ReceiveContentElement;
    .locals 1

    new-instance v0, Landroidx/compose/foundation/content/ReceiveContentElement;

    invoke-direct {v0, p1}, Landroidx/compose/foundation/content/ReceiveContentElement;-><init>(Landroidx/compose/foundation/content/ReceiveContentListener;)V

    return-object v0
.end method

.method public create()Landroidx/compose/foundation/content/ReceiveContentNode;
    .locals 2

    .line 2
    new-instance v0, Landroidx/compose/foundation/content/ReceiveContentNode;

    iget-object v1, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    invoke-direct {v0, v1}, Landroidx/compose/foundation/content/ReceiveContentNode;-><init>(Landroidx/compose/foundation/content/ReceiveContentListener;)V

    return-object v0
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/content/ReceiveContentElement;->create()Landroidx/compose/foundation/content/ReceiveContentNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/content/ReceiveContentElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Landroidx/compose/foundation/content/ReceiveContentElement;

    iget-object v1, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    iget-object p1, p1, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getReceiveContentListener()Landroidx/compose/foundation/content/ReceiveContentListener;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 1

    .line 1
    const-string v0, "receiveContent"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/InspectorInfo;->setName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiveContentElement(receiveContentListener="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroidx/compose/foundation/content/ReceiveContentNode;)V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/content/ReceiveContentElement;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    invoke-virtual {p1, v0}, Landroidx/compose/foundation/content/ReceiveContentNode;->updateNode(Landroidx/compose/foundation/content/ReceiveContentListener;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/content/ReceiveContentNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/content/ReceiveContentElement;->update(Landroidx/compose/foundation/content/ReceiveContentNode;)V

    return-void
.end method
