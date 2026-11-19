.class public final Landroidx/compose/ui/focus/FocusInvalidationManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0000\u0018\u00002\u00020\u0001BM\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0010\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\r*\u0008\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0015\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\r*\u0008\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010\u000f\u001a\u00028\u0000H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0013J\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0010\u0010\u001aJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u0010\u0010\u001cJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u0010\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u001f\u0010\u0013J\r\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008!\u0010\"R&\u0010\u0005\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010$R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010$R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010$R\u001a\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001a\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010&R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010)R\u001a\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010)R\u001a\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010)R\u0016\u0010-\u001a\u00020 8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u0006/"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "onRequestApplyChangesListener",
        "invalidateOwnerFocusState",
        "Landroidx/compose/ui/focus/FocusState;",
        "rootFocusStateFetcher",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "activeFocusTargetNodeFetcher",
        "<init>",
        "(Lr6/c;Lr6/a;Lr6/a;Lr6/a;)V",
        "T",
        "Landroidx/collection/MutableScatterSet;",
        "node",
        "scheduleInvalidation",
        "(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V",
        "setUpOnRequestApplyChangesListener",
        "()V",
        "",
        "scheduleInvalidationLegacy",
        "(Ljava/util/List;Ljava/lang/Object;)V",
        "invalidateNodes",
        "invalidateNodesOptimized",
        "invalidateNodesLegacy",
        "(Landroidx/compose/ui/focus/FocusTargetNode;)V",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V",
        "scheduleInvalidationForOwner",
        "",
        "hasPendingInvalidation",
        "()Z",
        "Lr6/c;",
        "Lr6/a;",
        "focusTargetNodes",
        "Landroidx/collection/MutableScatterSet;",
        "focusEventNodes",
        "focusTargetNodesLegacy",
        "Ljava/util/List;",
        "focusEventNodesLegacy",
        "focusPropertiesNodesLegacy",
        "focusTargetsWithInvalidatedFocusEventsLegacy",
        "isInvalidationScheduled",
        "Z",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 12 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n231#2,3:276\n200#2,7:279\n211#2,3:287\n214#2,9:291\n234#2:300\n231#2,3:334\n200#2,7:337\n211#2,3:345\n214#2,9:349\n234#2:358\n1399#3:286\n1270#3:290\n1399#3:344\n1270#3:348\n119#4,9:301\n119#4:325\n119#4:375\n119#4:497\n55#5:310\n90#6:311\n91#6,8:317\n100#6,7:327\n289#6,6:376\n437#6,6:382\n447#6,2:389\n449#6,8:394\n457#6,9:405\n466#6,8:417\n295#6:425\n148#6:426\n149#6,4:432\n153#6:437\n154#6,9:439\n437#6,37:448\n163#6,6:485\n296#6:491\n289#6,6:498\n437#6,6:504\n447#6,2:511\n449#6,8:516\n457#6,9:527\n466#6,8:539\n295#6:547\n148#6:548\n149#6,4:554\n153#6:559\n154#6,9:561\n437#6,37:570\n163#6,6:607\n296#6:613\n56#7,5:312\n56#7,5:427\n56#7,5:549\n56#7,5:621\n56#7,5:626\n56#7,5:631\n246#8:326\n246#8:388\n246#8:510\n34#9,6:359\n34#9,6:365\n34#9,4:371\n39#9:492\n34#9,4:493\n39#9:614\n34#9,6:615\n240#10,3:391\n243#10,3:414\n240#10,3:513\n243#10,3:536\n1101#11:402\n1083#11,2:403\n1101#11:524\n1083#11,2:525\n519#12:436\n44#12:438\n519#12:558\n44#12:560\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n124#1:276,3\n124#1:279,7\n124#1:287,3\n124#1:291,9\n124#1:300\n161#1:334,3\n161#1:337,7\n161#1:345,3\n161#1:349,9\n161#1:358\n124#1:286\n124#1:290\n161#1:344\n161#1:348\n133#1:301,9\n139#1:325\n193#1:375\n214#1:497\n133#1:310\n132#1:311\n132#1:317,8\n132#1:327,7\n193#1:376,6\n193#1:382,6\n193#1:389,2\n193#1:394,8\n193#1:405,9\n193#1:417,8\n193#1:425\n193#1:426\n193#1:432,4\n193#1:437\n193#1:439,9\n193#1:448,37\n193#1:485,6\n193#1:491\n214#1:498,6\n214#1:504,6\n214#1:511,2\n214#1:516,8\n214#1:527,9\n214#1:539,8\n214#1:547\n214#1:548\n214#1:554,4\n214#1:559\n214#1:561,9\n214#1:570,37\n214#1:607,6\n214#1:613\n132#1:312,5\n193#1:427,5\n214#1:549,5\n268#1:621,5\n271#1:626,5\n272#1:631,5\n139#1:326\n193#1:388\n214#1:510\n173#1:359,6\n174#1:365,6\n188#1:371,4\n188#1:492\n200#1:493,4\n200#1:614\n248#1:615,6\n193#1:391,3\n193#1:414,3\n214#1:513,3\n214#1:536,3\n193#1:402\n193#1:403,2\n214#1:524\n214#1:525,2\n193#1:436\n193#1:438\n214#1:558\n214#1:560\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final activeFocusTargetNodeFetcher:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusEventNodes:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/ui/focus/FocusEventModifierNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusEventNodesLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusEventModifierNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusPropertiesNodesLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusTargetNodes:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusTargetNodesLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final invalidateOwnerFocusState:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isInvalidationScheduled:Z

.field private final onRequestApplyChangesListener:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rootFocusStateFetcher:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr6/c;Lr6/a;Lr6/a;Lr6/a;)V
    .locals 0
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lr6/a;",
            "Lr6/a;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lr6/c;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lr6/a;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->rootFocusStateFetcher:Lr6/a;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->activeFocusTargetNodeFetcher:Lr6/a;

    .line 11
    .line 12
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    .line 17
    .line 18
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .line 30
    .line 31
    new-instance p1, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .line 37
    .line 38
    new-instance p1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    .line 51
    .line 52
    return-void
.end method

.method public static final synthetic access$invalidateNodes(Landroidx/compose/ui/focus/FocusInvalidationManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodes()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final invalidateNodes()V
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodesOptimized()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateNodesLegacy()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private final invalidateNodesLegacy()V
    .locals 19

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->rootFocusStateFetcher:Lr6/a;

    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/compose/ui/focus/FocusState;

    invoke-interface {v1}, Landroidx/compose/ui/focus/FocusState;->getHasFocus()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    .line 2
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .line 3
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_0

    .line 4
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 5
    check-cast v5, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 6
    sget-object v6, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-interface {v5, v6}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_0
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .line 8
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    :goto_1
    if-ge v2, v3, :cond_2

    .line 9
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 10
    check-cast v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 11
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Landroidx/compose/ui/focus/FocusTargetNode;->isInitialized$ui_release()Z

    move-result v5

    if-nez v5, :cond_1

    .line 12
    sget-object v5, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {v4, v5}, Landroidx/compose/ui/focus/FocusTargetNode;->initializeFocusState$ui_release(Landroidx/compose/ui/focus/FocusStateImpl;)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 13
    :cond_2
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 14
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 15
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 16
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 17
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lr6/a;

    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    return-void

    .line 18
    :cond_3
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    .line 19
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v2

    :goto_2
    const-string/jumbo v5, "visitChildren called on an unattached node"

    const/16 v6, 0x400

    const/16 v7, 0x10

    const/4 v9, 0x1

    if-ge v4, v3, :cond_19

    .line 20
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 21
    check-cast v10, Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 22
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v11

    if-eqz v11, :cond_18

    .line 23
    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v6

    .line 24
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    const/4 v12, 0x0

    :goto_3
    if-eqz v11, :cond_b

    .line 25
    instance-of v13, v11, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v13, :cond_4

    .line 26
    check-cast v11, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 27
    iget-object v13, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v13, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 28
    :cond_4
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v13

    and-int/2addr v13, v6

    if-eqz v13, :cond_a

    .line 29
    instance-of v13, v11, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v13, :cond_a

    .line 30
    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 31
    invoke-virtual {v13}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v13

    move v14, v2

    :goto_4
    if-eqz v13, :cond_9

    .line 32
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v15

    and-int/2addr v15, v6

    if-eqz v15, :cond_8

    add-int/lit8 v14, v14, 0x1

    if-ne v14, v9, :cond_5

    move-object v11, v13

    goto :goto_5

    :cond_5
    if-nez v12, :cond_6

    .line 33
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    new-array v15, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v12, v15, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_6
    if-eqz v11, :cond_7

    .line 34
    invoke-virtual {v12, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    const/4 v11, 0x0

    .line 35
    :cond_7
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 36
    :cond_8
    :goto_5
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v13

    goto :goto_4

    :cond_9
    if-ne v14, v9, :cond_a

    goto :goto_3

    .line 37
    :cond_a
    :goto_6
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    goto :goto_3

    .line 38
    :cond_b
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v11

    if-nez v11, :cond_c

    .line 39
    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 40
    :cond_c
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    new-array v11, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v5, v11, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 41
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    if-nez v11, :cond_d

    .line 42
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    invoke-static {v5, v10, v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    goto :goto_7

    :cond_d
    invoke-virtual {v5, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 43
    :cond_e
    :goto_7
    invoke-virtual {v5}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v10

    if-eqz v10, :cond_18

    .line 44
    invoke-static {v5, v9}, Landroidx/compose/material3/c;->j(Landroidx/compose/runtime/collection/MutableVector;I)Ljava/lang/Object;

    move-result-object v10

    .line 45
    check-cast v10, Landroidx/compose/ui/Modifier$Node;

    .line 46
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v11

    and-int/2addr v11, v6

    if-nez v11, :cond_f

    .line 47
    invoke-static {v5, v10, v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    goto :goto_7

    :cond_f
    :goto_8
    if-eqz v10, :cond_e

    .line 48
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int/2addr v11, v6

    if-eqz v11, :cond_17

    const/4 v11, 0x0

    :goto_9
    if-eqz v10, :cond_e

    .line 49
    instance-of v12, v10, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v12, :cond_10

    .line 50
    check-cast v10, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 51
    iget-object v12, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v12, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 52
    :cond_10
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v12

    and-int/2addr v12, v6

    if-eqz v12, :cond_16

    .line 53
    instance-of v12, v10, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v12, :cond_16

    .line 54
    move-object v12, v10

    check-cast v12, Landroidx/compose/ui/node/DelegatingNode;

    .line 55
    invoke-virtual {v12}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move v13, v2

    :goto_a
    if-eqz v12, :cond_15

    .line 56
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v14

    and-int/2addr v14, v6

    if-eqz v14, :cond_14

    add-int/lit8 v13, v13, 0x1

    if-ne v13, v9, :cond_11

    move-object v10, v12

    goto :goto_b

    :cond_11
    if-nez v11, :cond_12

    .line 57
    new-instance v11, Landroidx/compose/runtime/collection/MutableVector;

    new-array v14, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v11, v14, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_12
    if-eqz v10, :cond_13

    .line 58
    invoke-virtual {v11, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    const/4 v10, 0x0

    .line 59
    :cond_13
    invoke-virtual {v11, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 60
    :cond_14
    :goto_b
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    goto :goto_a

    :cond_15
    if-ne v13, v9, :cond_16

    goto :goto_9

    .line 61
    :cond_16
    :goto_c
    invoke-static {v11}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    goto :goto_9

    .line 62
    :cond_17
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    goto :goto_8

    :cond_18
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_2

    .line 63
    :cond_19
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 64
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .line 65
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v2

    :goto_d
    if-ge v4, v3, :cond_3a

    .line 66
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 67
    check-cast v10, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 68
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v11

    if-nez v11, :cond_1a

    .line 69
    sget-object v11, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-interface {v10, v11}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    move v7, v2

    move v2, v9

    goto/16 :goto_1e

    .line 70
    :cond_1a
    invoke-static {v6}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v11

    .line 71
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move/from16 v16, v2

    move v15, v9

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_e
    if-eqz v12, :cond_24

    .line 72
    instance-of v6, v12, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v6, :cond_1d

    .line 73
    check-cast v12, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v13, :cond_1b

    move/from16 v16, v9

    .line 74
    :cond_1b
    iget-object v6, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v6, v12}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1c

    .line 75
    iget-object v6, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v15, v2

    :cond_1c
    move-object v13, v12

    goto :goto_11

    .line 76
    :cond_1d
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, v11

    if-eqz v6, :cond_23

    .line 77
    instance-of v6, v12, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_23

    .line 78
    move-object v6, v12

    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 79
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move v8, v2

    :goto_f
    if-eqz v6, :cond_22

    .line 80
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v11

    if-eqz v17, :cond_21

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v9, :cond_1e

    move-object v12, v6

    goto :goto_10

    :cond_1e
    if-nez v14, :cond_1f

    .line 81
    new-instance v14, Landroidx/compose/runtime/collection/MutableVector;

    new-array v9, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v14, v9, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_1f
    if-eqz v12, :cond_20

    .line 82
    invoke-virtual {v14, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x0

    .line 83
    :cond_20
    invoke-virtual {v14, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_21
    :goto_10
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    const/4 v9, 0x1

    goto :goto_f

    :cond_22
    move v6, v9

    if-ne v8, v6, :cond_23

    move v9, v6

    const/16 v6, 0x400

    goto :goto_e

    .line 85
    :cond_23
    :goto_11
    invoke-static {v14}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    const/16 v6, 0x400

    const/4 v9, 0x1

    goto :goto_e

    .line 86
    :cond_24
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v6

    if-nez v6, :cond_25

    .line 87
    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 88
    :cond_25
    new-instance v6, Landroidx/compose/runtime/collection/MutableVector;

    new-array v8, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v6, v8, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 89
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    if-nez v8, :cond_26

    .line 90
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    invoke-static {v6, v8, v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    goto :goto_12

    :cond_26
    invoke-virtual {v6, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 91
    :goto_12
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    move-result v8

    if-eqz v8, :cond_35

    const/4 v8, 0x1

    .line 92
    invoke-static {v6, v8}, Landroidx/compose/material3/c;->j(Landroidx/compose/runtime/collection/MutableVector;I)Ljava/lang/Object;

    move-result-object v9

    .line 93
    check-cast v9, Landroidx/compose/ui/Modifier$Node;

    .line 94
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v8

    and-int/2addr v8, v11

    if-nez v8, :cond_28

    .line 95
    invoke-static {v6, v9, v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$addLayoutNodeChildren(Landroidx/compose/runtime/collection/MutableVector;Landroidx/compose/ui/Modifier$Node;Z)V

    :cond_27
    move v7, v2

    const/4 v2, 0x1

    goto/16 :goto_1c

    :cond_28
    :goto_13
    if-eqz v9, :cond_27

    .line 96
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v8

    and-int/2addr v8, v11

    if-eqz v8, :cond_34

    const/4 v8, 0x0

    :goto_14
    if-eqz v9, :cond_33

    .line 97
    instance-of v12, v9, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v12, :cond_2b

    .line 98
    check-cast v9, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v13, :cond_29

    const/16 v16, 0x1

    .line 99
    :cond_29
    iget-object v12, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v12, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2a

    .line 100
    iget-object v12, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v15, v2

    :cond_2a
    move v7, v2

    move-object v13, v9

    :goto_15
    const/4 v2, 0x1

    goto :goto_1a

    .line 101
    :cond_2b
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v12

    and-int/2addr v12, v11

    if-eqz v12, :cond_31

    .line 102
    instance-of v12, v9, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v12, :cond_31

    .line 103
    move-object v12, v9

    check-cast v12, Landroidx/compose/ui/node/DelegatingNode;

    .line 104
    invoke-virtual {v12}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move v14, v2

    :goto_16
    if-eqz v12, :cond_30

    .line 105
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v18

    and-int v18, v18, v11

    if-eqz v18, :cond_2f

    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x1

    if-ne v14, v2, :cond_2c

    move-object v9, v12

    const/4 v7, 0x0

    goto :goto_18

    :cond_2c
    if-nez v8, :cond_2d

    .line 106
    new-instance v8, Landroidx/compose/runtime/collection/MutableVector;

    new-array v2, v7, [Landroidx/compose/ui/Modifier$Node;

    const/4 v7, 0x0

    invoke-direct {v8, v2, v7}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    goto :goto_17

    :cond_2d
    const/4 v7, 0x0

    :goto_17
    if-eqz v9, :cond_2e

    .line 107
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x0

    .line 108
    :cond_2e
    invoke-virtual {v8, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_2f
    move v7, v2

    .line 109
    :goto_18
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move v2, v7

    const/16 v7, 0x10

    goto :goto_16

    :cond_30
    move v7, v2

    const/4 v2, 0x1

    if-ne v14, v2, :cond_32

    :goto_19
    move v2, v7

    const/16 v7, 0x10

    goto :goto_14

    :cond_31
    move v7, v2

    goto :goto_15

    .line 110
    :cond_32
    :goto_1a
    invoke-static {v8}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    goto :goto_19

    :cond_33
    move v7, v2

    :goto_1b
    const/16 v7, 0x10

    goto/16 :goto_12

    :cond_34
    move v7, v2

    const/4 v2, 0x1

    .line 111
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    move v2, v7

    const/16 v7, 0x10

    goto/16 :goto_13

    :goto_1c
    move v2, v7

    goto :goto_1b

    :cond_35
    move v7, v2

    const/4 v2, 0x1

    if-eqz v15, :cond_39

    if-eqz v16, :cond_36

    .line 112
    invoke-static {v10}, Landroidx/compose/ui/focus/FocusEventModifierNodeKt;->getFocusState(Landroidx/compose/ui/focus/FocusEventModifierNode;)Landroidx/compose/ui/focus/FocusState;

    move-result-object v6

    goto :goto_1d

    :cond_36
    if-eqz v13, :cond_37

    .line 113
    invoke-virtual {v13}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v6

    if-nez v6, :cond_38

    :cond_37
    sget-object v6, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 114
    :cond_38
    :goto_1d
    invoke-interface {v10, v6}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    :cond_39
    :goto_1e
    add-int/lit8 v4, v4, 0x1

    move v9, v2

    move v2, v7

    const/16 v6, 0x400

    const/16 v7, 0x10

    goto/16 :goto_d

    :cond_3a
    move v7, v2

    .line 115
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 116
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .line 117
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_1f
    if-ge v7, v2, :cond_3d

    .line 118
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    .line 119
    check-cast v3, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 120
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v4

    if-eqz v4, :cond_3c

    .line 121
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v4

    .line 122
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->invalidateFocus$ui_release()V

    .line 123
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v5

    if-ne v4, v5, :cond_3b

    .line 124
    iget-object v4, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3c

    .line 125
    :cond_3b
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release()V

    :cond_3c
    add-int/lit8 v7, v7, 0x1

    goto :goto_1f

    .line 126
    :cond_3d
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 127
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetsWithInvalidatedFocusEventsLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 128
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lr6/a;

    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 129
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3e

    .line 130
    const-string v1, "Unprocessed FocusProperties nodes"

    .line 131
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 132
    :cond_3e
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3f

    const-string v1, "Unprocessed FocusEvent nodes"

    .line 133
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 134
    :cond_3f
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_40

    const-string v1, "Unprocessed FocusTarget nodes"

    .line 135
    invoke-static {v1}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    :cond_40
    return-void
.end method

.method private final invalidateNodesOptimized()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->activeFocusTargetNodeFetcher:Lr6/a;

    .line 4
    .line 5
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 10
    .line 11
    const-wide/16 v4, 0xff

    .line 12
    .line 13
    const/4 v6, 0x7

    .line 14
    const-wide v7, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    const/16 v9, 0x8

    .line 20
    .line 21
    const/4 v10, 0x0

    .line 22
    if-nez v1, :cond_3

    .line 23
    .line 24
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    .line 25
    .line 26
    iget-object v11, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 29
    .line 30
    array-length v12, v1

    .line 31
    add-int/lit8 v12, v12, -0x2

    .line 32
    .line 33
    if-ltz v12, :cond_10

    .line 34
    .line 35
    move v13, v10

    .line 36
    :goto_0
    aget-wide v14, v1, v13

    .line 37
    .line 38
    const-wide/16 v16, 0x80

    .line 39
    .line 40
    not-long v2, v14

    .line 41
    shl-long/2addr v2, v6

    .line 42
    and-long/2addr v2, v14

    .line 43
    and-long/2addr v2, v7

    .line 44
    cmp-long v2, v2, v7

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    sub-int v2, v13, v12

    .line 49
    .line 50
    not-int v2, v2

    .line 51
    ushr-int/lit8 v2, v2, 0x1f

    .line 52
    .line 53
    rsub-int/lit8 v2, v2, 0x8

    .line 54
    .line 55
    move v3, v10

    .line 56
    :goto_1
    if-ge v3, v2, :cond_1

    .line 57
    .line 58
    and-long v18, v14, v4

    .line 59
    .line 60
    cmp-long v18, v18, v16

    .line 61
    .line 62
    if-gez v18, :cond_0

    .line 63
    .line 64
    shl-int/lit8 v18, v13, 0x3

    .line 65
    .line 66
    add-int v18, v18, v3

    .line 67
    .line 68
    aget-object v18, v11, v18

    .line 69
    .line 70
    move-wide/from16 v19, v4

    .line 71
    .line 72
    move-object/from16 v4, v18

    .line 73
    .line 74
    check-cast v4, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 75
    .line 76
    sget-object v5, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 77
    .line 78
    invoke-interface {v4, v5}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 79
    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_0
    move-wide/from16 v19, v4

    .line 83
    .line 84
    :goto_2
    shr-long/2addr v14, v9

    .line 85
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    move-wide/from16 v4, v19

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    move-wide/from16 v19, v4

    .line 91
    .line 92
    if-ne v2, v9, :cond_10

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_2
    move-wide/from16 v19, v4

    .line 96
    .line 97
    :goto_3
    if-eq v13, v12, :cond_10

    .line 98
    .line 99
    add-int/lit8 v13, v13, 0x1

    .line 100
    .line 101
    move-wide/from16 v4, v19

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_3
    move-wide/from16 v19, v4

    .line 105
    .line 106
    const-wide/16 v16, 0x80

    .line 107
    .line 108
    invoke-virtual {v1}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_10

    .line 113
    .line 114
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    .line 115
    .line 116
    invoke-virtual {v2, v1}, Landroidx/collection/ScatterSet;->contains(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-eqz v2, :cond_4

    .line 121
    .line 122
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->invalidateFocus$ui_release()V

    .line 123
    .line 124
    .line 125
    :cond_4
    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const/16 v3, 0x400

    .line 130
    .line 131
    invoke-static {v3}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 132
    .line 133
    .line 134
    move-result v4

    .line 135
    const/16 v5, 0x1000

    .line 136
    .line 137
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    or-int/2addr v4, v5

    .line 142
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    if-nez v5, :cond_5

    .line 151
    .line 152
    const-string/jumbo v5, "visitAncestors called on an unattached node"

    .line 153
    .line 154
    .line 155
    invoke-static {v5}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    :cond_5
    invoke-interface {v1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    invoke-static {v1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    move v11, v10

    .line 167
    :goto_4
    if-eqz v1, :cond_c

    .line 168
    .line 169
    invoke-static {v1}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    .line 170
    .line 171
    .line 172
    move-result v12

    .line 173
    and-int/2addr v12, v4

    .line 174
    if-eqz v12, :cond_a

    .line 175
    .line 176
    :goto_5
    if-eqz v5, :cond_a

    .line 177
    .line 178
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 179
    .line 180
    .line 181
    move-result v12

    .line 182
    and-int/2addr v12, v4

    .line 183
    if-eqz v12, :cond_9

    .line 184
    .line 185
    invoke-static {v3}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 186
    .line 187
    .line 188
    move-result v12

    .line 189
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    and-int/2addr v12, v13

    .line 194
    if-eqz v12, :cond_6

    .line 195
    .line 196
    add-int/lit8 v11, v11, 0x1

    .line 197
    .line 198
    :cond_6
    instance-of v12, v5, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 199
    .line 200
    if-eqz v12, :cond_9

    .line 201
    .line 202
    iget-object v12, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    .line 203
    .line 204
    invoke-virtual {v12, v5}, Landroidx/collection/ScatterSet;->contains(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v12

    .line 208
    if-nez v12, :cond_7

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_7
    const/4 v12, 0x1

    .line 212
    if-gt v11, v12, :cond_8

    .line 213
    .line 214
    move-object v12, v5

    .line 215
    check-cast v12, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 216
    .line 217
    invoke-interface {v12, v2}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 218
    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_8
    move-object v12, v5

    .line 222
    check-cast v12, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 223
    .line 224
    sget-object v13, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 225
    .line 226
    invoke-interface {v12, v13}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 227
    .line 228
    .line 229
    :goto_6
    iget-object v12, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    .line 230
    .line 231
    invoke-virtual {v12, v5}, Landroidx/collection/MutableScatterSet;->remove(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    :cond_9
    :goto_7
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    goto :goto_5

    .line 239
    :cond_a
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    if-eqz v1, :cond_b

    .line 244
    .line 245
    invoke-virtual {v1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 246
    .line 247
    .line 248
    move-result-object v5

    .line 249
    if-eqz v5, :cond_b

    .line 250
    .line 251
    invoke-virtual {v5}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    goto :goto_4

    .line 256
    :cond_b
    const/4 v5, 0x0

    .line 257
    goto :goto_4

    .line 258
    :cond_c
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    .line 259
    .line 260
    iget-object v2, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 261
    .line 262
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 263
    .line 264
    array-length v3, v1

    .line 265
    add-int/lit8 v3, v3, -0x2

    .line 266
    .line 267
    if-ltz v3, :cond_10

    .line 268
    .line 269
    move v4, v10

    .line 270
    :goto_8
    aget-wide v11, v1, v4

    .line 271
    .line 272
    not-long v13, v11

    .line 273
    shl-long/2addr v13, v6

    .line 274
    and-long/2addr v13, v11

    .line 275
    and-long/2addr v13, v7

    .line 276
    cmp-long v5, v13, v7

    .line 277
    .line 278
    if-eqz v5, :cond_f

    .line 279
    .line 280
    sub-int v5, v4, v3

    .line 281
    .line 282
    not-int v5, v5

    .line 283
    ushr-int/lit8 v5, v5, 0x1f

    .line 284
    .line 285
    rsub-int/lit8 v5, v5, 0x8

    .line 286
    .line 287
    move v13, v10

    .line 288
    :goto_9
    if-ge v13, v5, :cond_e

    .line 289
    .line 290
    and-long v14, v11, v19

    .line 291
    .line 292
    cmp-long v14, v14, v16

    .line 293
    .line 294
    if-gez v14, :cond_d

    .line 295
    .line 296
    shl-int/lit8 v14, v4, 0x3

    .line 297
    .line 298
    add-int/2addr v14, v13

    .line 299
    aget-object v14, v2, v14

    .line 300
    .line 301
    check-cast v14, Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 302
    .line 303
    sget-object v15, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 304
    .line 305
    invoke-interface {v14, v15}, Landroidx/compose/ui/focus/FocusEventModifierNode;->onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V

    .line 306
    .line 307
    .line 308
    :cond_d
    shr-long/2addr v11, v9

    .line 309
    add-int/lit8 v13, v13, 0x1

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_e
    if-ne v5, v9, :cond_10

    .line 313
    .line 314
    :cond_f
    if-eq v4, v3, :cond_10

    .line 315
    .line 316
    add-int/lit8 v4, v4, 0x1

    .line 317
    .line 318
    goto :goto_8

    .line 319
    :cond_10
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->invalidateOwnerFocusState:Lr6/a;

    .line 320
    .line 321
    invoke-interface {v1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    .line 325
    .line 326
    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 327
    .line 328
    .line 329
    iget-object v1, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    .line 330
    .line 331
    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 332
    .line 333
    .line 334
    iput-boolean v10, v0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    .line 335
    .line 336
    return-void
.end method

.method private final scheduleInvalidation(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/collection/MutableScatterSet<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 8
    invoke-virtual {p1, p2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 9
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->setUpOnRequestApplyChangesListener()V

    :cond_0
    return-void
.end method

.method private final scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;TT;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    iget-object p2, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    add-int/2addr p2, p1

    .line 20
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/2addr p1, p2

    .line 27
    const/4 p2, 0x1

    .line 28
    if-ne p1, p2, :cond_0

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lr6/c;

    .line 31
    .line 32
    new-instance p2, Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidationLegacy$1;

    .line 33
    .line 34
    invoke-direct {p2, p0}, Landroidx/compose/ui/focus/FocusInvalidationManager$scheduleInvalidationLegacy$1;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method private final setUpOnRequestApplyChangesListener()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->onRequestApplyChangesListener:Lr6/c;

    .line 6
    .line 7
    new-instance v1, Landroidx/compose/ui/focus/FocusInvalidationManager$setUpOnRequestApplyChangesListener$1;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Landroidx/compose/ui/focus/FocusInvalidationManager$setUpOnRequestApplyChangesListener$1;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public final hasPendingInvalidation()Z
    .locals 1

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->isInvalidationScheduled:Z

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    return v0

    .line 35
    :cond_2
    :goto_0
    const/4 v0, 0x1

    .line 36
    return v0
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusEventModifierNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 4
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodes:Landroidx/collection/MutableScatterSet;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V

    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusEventNodesLegacy:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V

    return-void
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 7
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusPropertiesNodesLegacy:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V

    return-void
.end method

.method public final scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodes:Landroidx/collection/MutableScatterSet;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/collection/MutableScatterSet;Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusInvalidationManager;->focusTargetNodesLegacy:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationLegacy(Ljava/util/List;Ljava/lang/Object;)V

    return-void
.end method

.method public final scheduleInvalidationForOwner()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->setUpOnRequestApplyChangesListener()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
