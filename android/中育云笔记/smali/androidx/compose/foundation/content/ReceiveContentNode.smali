.class public final Landroidx/compose/foundation/content/ReceiveContentNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/modifier/ModifierLocalModifierNode;
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final providedValues:Landroidx/compose/ui/modifier/ModifierLocalMap;

.field private final receiveContentConfiguration:Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;

.field private receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/content/ReceiveContentListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/content/ReceiveContentNode;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    .line 5
    .line 6
    new-instance p1, Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;

    .line 7
    .line 8
    invoke-direct {p1, p0}, Landroidx/compose/foundation/content/internal/DynamicReceiveContentConfiguration;-><init>(Landroidx/compose/foundation/content/ReceiveContentNode;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Landroidx/compose/foundation/content/ReceiveContentNode;->receiveContentConfiguration:Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;

    .line 12
    .line 13
    invoke-static {}, Landroidx/compose/foundation/content/internal/ReceiveContentConfigurationKt;->getModifierLocalReceiveContent()Landroidx/compose/ui/modifier/ProvidableModifierLocal;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0, p1}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Landroidx/compose/ui/modifier/ModifierLocalModifierNodeKt;->modifierLocalMapOf(Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Landroidx/compose/foundation/content/ReceiveContentNode;->providedValues:Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 26
    .line 27
    new-instance v0, Landroidx/compose/foundation/content/ReceiveContentNode$1;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Landroidx/compose/foundation/content/ReceiveContentNode$1;-><init>(Landroidx/compose/foundation/content/ReceiveContentNode;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v0}, Landroidx/compose/foundation/content/internal/ReceiveContentDragAndDropNode_androidKt;->ReceiveContentDragAndDropNode(Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lhd/l;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 37
    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public getProvidedValues()Landroidx/compose/ui/modifier/ModifierLocalMap;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/content/ReceiveContentNode;->providedValues:Landroidx/compose/ui/modifier/ModifierLocalMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReceiveContentListener()Landroidx/compose/foundation/content/ReceiveContentListener;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/content/ReceiveContentNode;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setReceiveContentListener(Landroidx/compose/foundation/content/ReceiveContentListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/content/ReceiveContentNode;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    .line 2
    .line 3
    return-void
.end method

.method public final updateNode(Landroidx/compose/foundation/content/ReceiveContentListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/content/ReceiveContentNode;->receiveContentListener:Landroidx/compose/foundation/content/ReceiveContentListener;

    .line 2
    .line 3
    return-void
.end method
