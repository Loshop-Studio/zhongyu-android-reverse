.class public final Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;,
        Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final disappearingItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;",
            ">;"
        }
    .end annotation
.end field

.field private displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

.field private firstVisibleIndex:I

.field private keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

.field private final keyToItemInfoMap:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "TT;>.ItemInfo;>;"
        }
    .end annotation
.end field

.field private final modifier:Landroidx/compose/ui/Modifier;

.field private final movingAwayKeys:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final movingAwayToEndBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final movingAwayToStartBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final movingInFromEndBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final movingInFromStartBound:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/collection/ScatterMapKt;->mutableScatterMapOf()Landroidx/collection/MutableScatterMap;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 9
    .line 10
    invoke-static {}, Landroidx/collection/ScatterSetKt;->mutableScatterSetOf()Landroidx/collection/MutableScatterSet;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    .line 29
    .line 30
    new-instance v0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    .line 36
    .line 37
    new-instance v0, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    .line 43
    .line 44
    new-instance v0, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    .line 50
    .line 51
    new-instance v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->modifier:Landroidx/compose/ui/Modifier;

    .line 57
    .line 58
    return-void
.end method

.method public static final synthetic access$getCrossAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getCrossAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$getDisappearingItems$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDisplayingNode$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)Landroidx/compose/ui/node/DrawModifierNode;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setDisplayingNode$p(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/ui/node/DrawModifierNode;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    .line 2
    .line 3
    return-void
.end method

.method private final getCrossAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method private final getHasAnimations(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getPlaceablesCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-interface {p1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getParentData(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-static {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimatorKt;->access$getSpecs(Ljava/lang/Object;)Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimationSpecsNode;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    return v1
.end method

.method private final getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1
.end method

.method private final initializeAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator<",
            "TT;>.ItemInfo;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    .line 3
    .line 4
    .line 5
    move-result-wide v1

    .line 6
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, p2

    .line 16
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/IntOffset;->copy-iSbpLlY$default(JIIILjava/lang/Object;)J

    .line 17
    .line 18
    .line 19
    move-result-wide v3

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v3, p2

    .line 22
    const/4 v5, 0x2

    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Landroidx/compose/ui/unit/IntOffset;->copy-iSbpLlY$default(JIIILjava/lang/Object;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v3

    .line 29
    :goto_0
    invoke-virtual {p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    array-length p3, p2

    .line 34
    move v5, v0

    .line 35
    :goto_1
    if-ge v0, p3, :cond_2

    .line 36
    .line 37
    aget-object v6, p2, v0

    .line 38
    .line 39
    add-int/lit8 v7, v5, 0x1

    .line 40
    .line 41
    if-eqz v6, :cond_1

    .line 42
    .line 43
    invoke-interface {p1, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    .line 44
    .line 45
    .line 46
    move-result-wide v8

    .line 47
    invoke-static {v8, v9, v1, v2}, Landroidx/compose/ui/unit/IntOffset;->minus-qkQi6aY(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v8

    .line 51
    invoke-static {v3, v4, v8, v9}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v8

    .line 55
    invoke-virtual {v6, v8, v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    .line 56
    .line 57
    .line 58
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    move v5, v7

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    return-void
.end method

.method public static synthetic initializeAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 6
    .line 7
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p4

    .line 11
    invoke-virtual {p3, p4}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    invoke-static {p3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    check-cast p3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 19
    .line 20
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private final releaseAnimations()V
    .locals 14

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/collection/ScatterMap;->isNotEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 10
    .line 11
    iget-object v1, v0, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/collection/ScatterMap;->metadata:[J

    .line 14
    .line 15
    array-length v2, v0

    .line 16
    add-int/lit8 v2, v2, -0x2

    .line 17
    .line 18
    if-ltz v2, :cond_4

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    aget-wide v5, v0, v4

    .line 23
    .line 24
    not-long v7, v5

    .line 25
    const/4 v9, 0x7

    .line 26
    shl-long/2addr v7, v9

    .line 27
    and-long/2addr v7, v5

    .line 28
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v7, v9

    .line 34
    cmp-long v7, v7, v9

    .line 35
    .line 36
    if-eqz v7, :cond_3

    .line 37
    .line 38
    sub-int v7, v4, v2

    .line 39
    .line 40
    not-int v7, v7

    .line 41
    ushr-int/lit8 v7, v7, 0x1f

    .line 42
    .line 43
    const/16 v8, 0x8

    .line 44
    .line 45
    rsub-int/lit8 v7, v7, 0x8

    .line 46
    .line 47
    move v9, v3

    .line 48
    :goto_1
    if-ge v9, v7, :cond_2

    .line 49
    .line 50
    const-wide/16 v10, 0xff

    .line 51
    .line 52
    and-long/2addr v10, v5

    .line 53
    const-wide/16 v12, 0x80

    .line 54
    .line 55
    cmp-long v10, v10, v12

    .line 56
    .line 57
    if-gez v10, :cond_1

    .line 58
    .line 59
    shl-int/lit8 v10, v4, 0x3

    .line 60
    .line 61
    add-int/2addr v10, v9

    .line 62
    aget-object v10, v1, v10

    .line 63
    .line 64
    check-cast v10, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 65
    .line 66
    invoke-virtual {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    array-length v11, v10

    .line 71
    move v12, v3

    .line 72
    :goto_2
    if-ge v12, v11, :cond_1

    .line 73
    .line 74
    aget-object v13, v10, v12

    .line 75
    .line 76
    if-eqz v13, :cond_0

    .line 77
    .line 78
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 79
    .line 80
    .line 81
    :cond_0
    add-int/lit8 v12, v12, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    shr-long/2addr v5, v8

    .line 85
    add-int/lit8 v9, v9, 0x1

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    if-ne v7, v8, :cond_4

    .line 89
    .line 90
    :cond_3
    if-eq v4, v2, :cond_4

    .line 91
    .line 92
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 96
    .line 97
    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 98
    .line 99
    .line 100
    :cond_5
    return-void
.end method

.method private final removeInfoForKey(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    array-length v0, p1

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_1

    .line 20
    .line 21
    aget-object v2, p1, v1

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 26
    .line 27
    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void
.end method

.method private final startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    check-cast v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    array-length v1, v0

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    if-ge v2, v1, :cond_2

    .line 24
    .line 25
    aget-object v4, v0, v2

    .line 26
    .line 27
    add-int/lit8 v5, v3, 0x1

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-interface {p1, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    .line 32
    .line 33
    .line 34
    move-result-wide v6

    .line 35
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    .line 36
    .line 37
    .line 38
    move-result-wide v8

    .line 39
    sget-object v3, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;

    .line 40
    .line 41
    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;->getNotInitialized-nOcc-ac()J

    .line 42
    .line 43
    .line 44
    move-result-wide v10

    .line 45
    invoke-static {v8, v9, v10, v11}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-nez v3, :cond_0

    .line 50
    .line 51
    invoke-static {v8, v9, v6, v7}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    invoke-static {v6, v7, v8, v9}, Landroidx/compose/ui/unit/IntOffset;->minus-qkQi6aY(JJ)J

    .line 58
    .line 59
    .line 60
    move-result-wide v8

    .line 61
    invoke-virtual {v4, v8, v9, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animatePlacementDelta-ar5cAso(JZ)V

    .line 62
    .line 63
    .line 64
    :cond_0
    invoke-virtual {v4, v6, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    .line 65
    .line 66
    .line 67
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 68
    .line 69
    move v3, v5

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    return-void
.end method

.method public static synthetic startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([ITT;)I"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getLane()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getSpan()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    aget v3, p1, v0

    .line 14
    .line 15
    invoke-interface {p2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/2addr v3, v4

    .line 20
    aput v3, p1, v0

    .line 21
    .line 22
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return v2
.end method


# virtual methods
.method public final getAnimation(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    aget-object p1, p1, p2

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return-object p1
.end method

.method public final getMinSizeToFitDisappearingItems-YbymL2g()J
    .locals 13

    .line 1
    sget-object v0, Landroidx/compose/ui/unit/IntSize;->Companion:Landroidx/compose/ui/unit/IntSize$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntSize$Companion;->getZero-YbymL2g()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    .line 8
    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Ljava/util/Collection;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x0

    .line 17
    :goto_0
    if-ge v4, v3, :cond_1

    .line 18
    .line 19
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    .line 24
    .line 25
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    const/16 v7, 0x20

    .line 32
    .line 33
    shr-long v8, v0, v7

    .line 34
    .line 35
    long-to-int v8, v8

    .line 36
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    invoke-static {v9, v10}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->getSize-YbymL2g()J

    .line 45
    .line 46
    .line 47
    move-result-wide v10

    .line 48
    shr-long/2addr v10, v7

    .line 49
    long-to-int v10, v10

    .line 50
    add-int/2addr v9, v10

    .line 51
    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    const-wide v9, 0xffffffffL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    and-long/2addr v0, v9

    .line 61
    long-to-int v0, v0

    .line 62
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    .line 63
    .line 64
    .line 65
    move-result-wide v11

    .line 66
    invoke-static {v11, v12}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/layer/GraphicsLayer;->getSize-YbymL2g()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    and-long/2addr v5, v9

    .line 75
    long-to-int v5, v5

    .line 76
    add-int/2addr v1, v5

    .line 77
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    int-to-long v5, v8

    .line 82
    shl-long/2addr v5, v7

    .line 83
    int-to-long v0, v0

    .line 84
    and-long/2addr v0, v9

    .line 85
    or-long/2addr v0, v5

    .line 86
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/IntSize;->constructor-impl(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v0

    .line 90
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_1
    return-wide v0
.end method

.method public final getModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->modifier:Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final onMeasured(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILsd/i0;Landroidx/compose/ui/graphics/GraphicsContext;)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/List<",
            "TT;>;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider<",
            "TT;>;ZZIZII",
            "Lsd/i0;",
            "Landroidx/compose/ui/graphics/GraphicsContext;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p9

    .line 1
    iget-object v11, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    .line 2
    iput-object v9, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    .line 3
    move-object v2, v8

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    const/4 v12, 0x0

    move v4, v12

    :goto_0
    if-ge v4, v3, :cond_1

    .line 4
    invoke-interface {v8, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 5
    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 6
    invoke-direct {v0, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getHasAnimations(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 7
    :cond_1
    iget-object v3, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v3}, Landroidx/collection/ScatterMap;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 8
    invoke-direct {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->releaseAnimations()V

    return-void

    .line 9
    :cond_2
    :goto_1
    iget v3, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    .line 10
    invoke-static {v8}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    if-eqz v4, :cond_3

    invoke-interface {v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v4

    goto :goto_2

    :cond_3
    move v4, v12

    :goto_2
    iput v4, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    const/16 v13, 0x20

    if-eqz p7, :cond_4

    int-to-long v14, v12

    shl-long v13, v14, v13

    const-wide v15, 0xffffffffL

    int-to-long v4, v1

    and-long/2addr v4, v15

    or-long/2addr v4, v13

    .line 11
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v4

    goto :goto_3

    :cond_4
    const-wide v15, 0xffffffffL

    int-to-long v4, v1

    shl-long/2addr v4, v13

    int-to-long v13, v12

    and-long/2addr v13, v15

    or-long/2addr v4, v13

    .line 12
    invoke-static {v4, v5}, Landroidx/compose/ui/unit/IntOffset;->constructor-impl(J)J

    move-result-wide v4

    :goto_3
    if-nez p8, :cond_6

    if-nez p10, :cond_5

    goto :goto_4

    :cond_5
    move v14, v12

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v14, 0x1

    .line 13
    :goto_5
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    .line 14
    iget-object v15, v1, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 15
    iget-object v1, v1, Landroidx/collection/ScatterMap;->metadata:[J

    .line 16
    array-length v13, v1

    const/4 v12, 0x2

    sub-int/2addr v13, v12

    const-wide/16 v17, 0x80

    const-wide/16 v19, 0xff

    const/16 v21, 0x7

    const-wide v22, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    if-ltz v13, :cond_a

    move/from16 v24, v14

    move-object/from16 v25, v15

    const/4 v12, 0x0

    :goto_6
    const/16 p10, 0x8

    .line 17
    aget-wide v14, v1, v12

    move-object/from16 v27, v1

    move-object/from16 v26, v2

    not-long v1, v14

    shl-long v1, v1, v21

    and-long/2addr v1, v14

    and-long v1, v1, v22

    cmp-long v1, v1, v22

    if-eqz v1, :cond_9

    sub-int v1, v12, v13

    not-int v1, v1

    ushr-int/lit8 v1, v1, 0x1f

    rsub-int/lit8 v1, v1, 0x8

    const/4 v2, 0x0

    :goto_7
    if-ge v2, v1, :cond_8

    and-long v28, v14, v19

    cmp-long v28, v28, v17

    if-gez v28, :cond_7

    shl-int/lit8 v28, v12, 0x3

    add-int v28, v28, v2

    move/from16 v29, v2

    .line 18
    aget-object v2, v25, v28

    move-wide/from16 v30, v14

    .line 19
    iget-object v14, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v14, v2}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_7
    move/from16 v29, v2

    move-wide/from16 v30, v14

    :goto_8
    shr-long v14, v30, p10

    add-int/lit8 v2, v29, 0x1

    goto :goto_7

    :cond_8
    move/from16 v2, p10

    if-ne v1, v2, :cond_b

    :cond_9
    if-eq v12, v13, :cond_b

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, v26

    move-object/from16 v1, v27

    goto :goto_6

    :cond_a
    move-object/from16 v26, v2

    move/from16 v24, v14

    .line 20
    :cond_b
    invoke-interface/range {v26 .. v26}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_9
    const/4 v12, -0x1

    if-ge v2, v1, :cond_1a

    .line 21
    invoke-interface {v8, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    .line 22
    check-cast v14, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 23
    iget-object v15, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    invoke-interface {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v15, v13}, Landroidx/collection/MutableScatterSet;->remove(Ljava/lang/Object;)Z

    .line 24
    invoke-direct {v0, v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getHasAnimations(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z

    move-result v13

    if-eqz v13, :cond_18

    .line 25
    iget-object v13, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-interface {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v13, v15}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v25, v13

    check-cast v25, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    if-eqz v11, :cond_c

    .line 26
    invoke-interface {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v11, v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;->getIndex(Ljava/lang/Object;)I

    move-result v13

    goto :goto_a

    :cond_c
    move v13, v12

    :goto_a
    if-ne v13, v12, :cond_d

    if-eqz v11, :cond_d

    const/4 v15, 0x1

    goto :goto_b

    :cond_d
    const/4 v15, 0x0

    :goto_b
    if-nez v25, :cond_12

    .line 27
    new-instance v12, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    invoke-direct {v12, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V

    const/16 v32, 0x20

    const/16 v33, 0x0

    const/16 v31, 0x0

    move/from16 v29, p11

    move/from16 v30, p12

    move-object/from16 v27, p13

    move-object/from16 v28, p14

    move-object/from16 v25, v12

    move-object/from16 v26, v14

    .line 28
    invoke-static/range {v25 .. v33}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->updateAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lsd/i0;Landroidx/compose/ui/graphics/GraphicsContext;IIIILjava/lang/Object;)V

    move/from16 v35, v1

    .line 29
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    move/from16 v36, v2

    invoke-interface {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2, v12}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    invoke-interface {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getIndex()I

    move-result v1

    if-eq v1, v13, :cond_f

    const/4 v1, -0x1

    if-eq v13, v1, :cond_f

    if-ge v13, v3, :cond_e

    .line 31
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    .line 32
    :cond_e
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_10

    :cond_f
    const/4 v1, 0x0

    .line 33
    invoke-interface {v14, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getOffset-Bjo55l4(I)J

    move-result-wide v25

    invoke-interface {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->isVertical()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static/range {v25 .. v26}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    move-result v1

    goto :goto_c

    :cond_10
    invoke-static/range {v25 .. v26}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    move-result v1

    .line 34
    :goto_c
    invoke-direct {v0, v14, v1, v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V

    if-eqz v15, :cond_19

    .line 35
    invoke-virtual {v12}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v1

    .line 36
    array-length v2, v1

    const/4 v12, 0x0

    :goto_d
    if-ge v12, v2, :cond_19

    aget-object v13, v1, v12

    if-eqz v13, :cond_11

    .line 37
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animateAppearance()V

    sget-object v13, Lqc/q;->a:Lqc/q;

    :cond_11
    add-int/lit8 v12, v12, 0x1

    goto :goto_d

    :cond_12
    move/from16 v35, v1

    move/from16 v36, v2

    if-eqz v24, :cond_19

    const/16 v32, 0x20

    const/16 v33, 0x0

    const/16 v31, 0x0

    move/from16 v29, p11

    move/from16 v30, p12

    move-object/from16 v27, p13

    move-object/from16 v28, p14

    move-object/from16 v26, v14

    .line 38
    invoke-static/range {v25 .. v33}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->updateAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lsd/i0;Landroidx/compose/ui/graphics/GraphicsContext;IIIILjava/lang/Object;)V

    .line 39
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v1

    .line 40
    array-length v2, v1

    const/4 v12, 0x0

    :goto_e
    if-ge v12, v2, :cond_14

    aget-object v13, v1, v12

    move-object/from16 v26, v1

    move/from16 v27, v2

    if-eqz v13, :cond_13

    .line 41
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v1

    sget-object v28, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->Companion:Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;

    invoke-virtual/range {v28 .. v28}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;->getNotInitialized-nOcc-ac()J

    move-result-wide v6

    invoke-static {v1, v2, v6, v7}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_13

    .line 42
    invoke-virtual {v13}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getRawOffset-nOcc-ac()J

    move-result-wide v1

    invoke-static {v1, v2, v4, v5}, Landroidx/compose/ui/unit/IntOffset;->plus-qkQi6aY(JJ)J

    move-result-wide v1

    invoke-virtual {v13, v1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->setRawOffset--gyyYBs(J)V

    :cond_13
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, v26

    move/from16 v2, v27

    goto :goto_e

    :cond_14
    if-eqz v15, :cond_17

    .line 43
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v1

    .line 44
    array-length v2, v1

    const/4 v6, 0x0

    :goto_f
    if-ge v6, v2, :cond_17

    aget-object v7, v1, v6

    if-eqz v7, :cond_16

    .line 45
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationInProgress()Z

    move-result v12

    if-eqz v12, :cond_15

    .line 46
    iget-object v12, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    invoke-interface {v12, v7}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 47
    iget-object v12, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    if-eqz v12, :cond_15

    invoke-static {v12}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    sget-object v12, Lqc/q;->a:Lqc/q;

    .line 48
    :cond_15
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animateAppearance()V

    :cond_16
    add-int/lit8 v6, v6, 0x1

    goto :goto_f

    :cond_17
    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v6, 0x0

    .line 49
    invoke-static {v0, v14, v6, v2, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V

    goto :goto_10

    :cond_18
    move/from16 v35, v1

    move/from16 v36, v2

    .line 50
    invoke-interface {v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->removeInfoForKey(Ljava/lang/Object;)V

    :cond_19
    :goto_10
    add-int/lit8 v2, v36, 0x1

    move/from16 v1, v35

    goto/16 :goto_9

    .line 51
    :cond_1a
    new-array v6, v10, [I

    if-eqz v24, :cond_20

    if-eqz v11, :cond_20

    .line 52
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1d

    .line 53
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    .line 54
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1b

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1;

    invoke-direct {v2, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    invoke-static {v1, v2}, Lrc/a0;->A(Ljava/util/List;Ljava/util/Comparator;)V

    .line 55
    :cond_1b
    iget-object v7, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    .line 56
    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_11
    if-ge v13, v12, :cond_1c

    .line 57
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 58
    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 59
    invoke-direct {v0, v6, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v2

    sub-int v2, p11, v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 60
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;ILjava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 61
    invoke-static {v0, v1, v4, v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_11

    :cond_1c
    const/16 v29, 0x6

    const/16 v30, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v6

    .line 62
    invoke-static/range {v25 .. v30}, Lrc/p;->D([IIIIILjava/lang/Object;)V

    .line 63
    :cond_1d
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_20

    .line 64
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    .line 65
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_1e

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1;

    invoke-direct {v2, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    invoke-static {v1, v2}, Lrc/a0;->A(Ljava/util/List;Ljava/util/Comparator;)V

    .line 66
    :cond_1e
    iget-object v7, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    .line 67
    move-object v1, v7

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v12

    const/4 v13, 0x0

    :goto_12
    if-ge v13, v12, :cond_1f

    .line 68
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 69
    check-cast v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 70
    invoke-direct {v0, v6, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v2

    add-int v2, p12, v2

    .line 71
    invoke-interface {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v3

    sub-int/2addr v2, v3

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    .line 72
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->initializeAnimation$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;ILjava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    .line 73
    invoke-static {v0, v1, v4, v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ZILjava/lang/Object;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_12

    :cond_1f
    const/16 v29, 0x6

    const/16 v30, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v6

    .line 74
    invoke-static/range {v25 .. v30}, Lrc/p;->D([IIIIILjava/lang/Object;)V

    .line 75
    :cond_20
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    .line 76
    iget-object v2, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 77
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 78
    array-length v3, v1

    const/4 v4, 0x2

    sub-int/2addr v3, v4

    if-ltz v3, :cond_34

    const/4 v4, 0x0

    .line 79
    :goto_13
    aget-wide v12, v1, v4

    not-long v14, v12

    shl-long v14, v14, v21

    and-long/2addr v14, v12

    and-long v14, v14, v22

    cmp-long v5, v14, v22

    if-eqz v5, :cond_33

    sub-int v5, v4, v3

    not-int v5, v5

    ushr-int/lit8 v5, v5, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v5, v5, 0x8

    const/4 v7, 0x0

    :goto_14
    if-ge v7, v5, :cond_32

    and-long v14, v12, v19

    cmp-long v14, v14, v17

    if-gez v14, :cond_31

    shl-int/lit8 v14, v4, 0x3

    add-int/2addr v14, v7

    .line 80
    aget-object v14, v2, v14

    .line 81
    iget-object v15, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v15, v14}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    if-nez v15, :cond_21

    goto/16 :goto_1c

    :cond_21
    move-object/from16 v31, v1

    .line 82
    invoke-interface {v9, v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;->getIndex(Ljava/lang/Object;)I

    move-result v1

    move-object/from16 v32, v2

    .line 83
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getSpan()I

    move-result v2

    invoke-static {v10, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v15, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->setSpan(I)V

    .line 84
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getSpan()I

    move-result v2

    sub-int v2, v10, v2

    move/from16 v33, v7

    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLane()I

    move-result v7

    invoke-static {v2, v7}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v15, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->setLane(I)V

    const/4 v2, -0x1

    if-ne v1, v2, :cond_2a

    .line 85
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v1

    .line 86
    array-length v7, v1

    const/4 v2, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    :goto_15
    if-ge v2, v7, :cond_29

    move-object/from16 p7, v1

    aget-object v1, p7, v2

    add-int/lit8 v27, v26, 0x1

    if-eqz v1, :cond_28

    .line 87
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationInProgress()Z

    move-result v28

    if-eqz v28, :cond_24

    move/from16 v28, v2

    :cond_22
    :goto_16
    const/16 v25, 0x1

    :cond_23
    :goto_17
    const/16 v34, 0x0

    goto :goto_18

    .line 88
    :cond_24
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationFinished()Z

    move-result v28

    if-eqz v28, :cond_25

    .line 89
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 90
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v28

    const/16 v34, 0x0

    aput-object v34, v28, v26

    move/from16 v28, v2

    .line 91
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 92
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    if-eqz v1, :cond_23

    invoke-static {v1}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    sget-object v1, Lqc/q;->a:Lqc/q;

    goto :goto_17

    :cond_25
    move/from16 v28, v2

    .line 93
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->getLayer()Landroidx/compose/ui/graphics/layer/GraphicsLayer;

    move-result-object v2

    if-eqz v2, :cond_26

    .line 94
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->animateDisappearance()V

    .line 95
    :cond_26
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isDisappearanceAnimationInProgress()Z

    move-result v2

    if-eqz v2, :cond_27

    .line 96
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->disappearingItems:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->displayingNode:Landroidx/compose/ui/node/DrawModifierNode;

    if-eqz v1, :cond_22

    invoke-static {v1}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    sget-object v1, Lqc/q;->a:Lqc/q;

    goto :goto_16

    .line 98
    :cond_27
    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->release()V

    .line 99
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v1

    const/16 v34, 0x0

    aput-object v34, v1, v26

    goto :goto_18

    :cond_28
    move/from16 v28, v2

    goto :goto_17

    :goto_18
    add-int/lit8 v2, v28, 0x1

    move-object/from16 v1, p7

    move/from16 v26, v27

    goto :goto_15

    :cond_29
    const/16 v34, 0x0

    if-nez v25, :cond_30

    .line 100
    invoke-direct {v0, v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->removeInfoForKey(Ljava/lang/Object;)V

    goto/16 :goto_1b

    :cond_2a
    const/16 v34, 0x0

    .line 101
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getConstraints-DWUhwKw()Landroidx/compose/ui/unit/Constraints;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroidx/compose/ui/unit/Constraints;->unbox-impl()J

    move-result-wide v29

    .line 102
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLane()I

    move-result v27

    .line 103
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getSpan()I

    move-result v28

    move-object/from16 v25, p6

    move/from16 v26, v1

    .line 104
    invoke-interface/range {v25 .. v30}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;->getAndMeasure--hBUhpc(IIIJ)Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    move-result-object v1

    move/from16 v2, v26

    const/4 v7, 0x1

    .line 105
    invoke-interface {v1, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->setNonScrollableItem(Z)V

    .line 106
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getAnimations()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;

    move-result-object v7

    move-object/from16 v36, v1

    .line 107
    array-length v1, v7

    move-object/from16 p7, v7

    const/4 v7, 0x0

    :goto_19
    if-ge v7, v1, :cond_2d

    aget-object v25, p7, v7

    move/from16 v26, v1

    if-eqz v25, :cond_2b

    .line 108
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;->isPlacementAnimationInProgress()Z

    move-result v1

    move/from16 v25, v7

    const/4 v7, 0x1

    if-ne v1, v7, :cond_2c

    goto :goto_1a

    :cond_2b
    move/from16 v25, v7

    :cond_2c
    add-int/lit8 v7, v25, 0x1

    move/from16 v1, v26

    goto :goto_19

    :cond_2d
    if-eqz v11, :cond_2e

    .line 109
    invoke-interface {v11, v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;->getIndex(Ljava/lang/Object;)I

    move-result v1

    if-ne v2, v1, :cond_2e

    .line 110
    invoke-direct {v0, v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->removeInfoForKey(Ljava/lang/Object;)V

    goto :goto_1b

    .line 111
    :cond_2e
    :goto_1a
    invoke-virtual {v15}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getCrossAxisOffset()I

    move-result v41

    move/from16 v39, p11

    move/from16 v40, p12

    move-object/from16 v37, p13

    move-object/from16 v38, p14

    move-object/from16 v35, v15

    .line 112
    invoke-virtual/range {v35 .. v41}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->updateAnimation(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lsd/i0;Landroidx/compose/ui/graphics/GraphicsContext;III)V

    move-object/from16 v1, v36

    .line 113
    iget v7, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    if-ge v2, v7, :cond_2f

    .line 114
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    .line 115
    :cond_2f
    iget-object v2, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_30
    :goto_1b
    const/16 v2, 0x8

    goto :goto_1d

    :cond_31
    :goto_1c
    move-object/from16 v31, v1

    move-object/from16 v32, v2

    move/from16 v33, v7

    const/16 v34, 0x0

    goto :goto_1b

    :goto_1d
    shr-long/2addr v12, v2

    add-int/lit8 v7, v33, 0x1

    move-object/from16 v1, v31

    move-object/from16 v2, v32

    goto/16 :goto_14

    :cond_32
    move-object/from16 v31, v1

    move-object/from16 v32, v2

    const/16 v2, 0x8

    const/16 v34, 0x0

    if-ne v5, v2, :cond_34

    goto :goto_1e

    :cond_33
    move-object/from16 v31, v1

    move-object/from16 v32, v2

    const/16 v2, 0x8

    const/16 v34, 0x0

    :goto_1e
    if-eq v4, v3, :cond_34

    add-int/lit8 v4, v4, 0x1

    move-object/from16 v1, v31

    move-object/from16 v2, v32

    goto/16 :goto_13

    .line 116
    :cond_34
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_39

    .line 117
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    .line 118
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_35

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2;

    invoke-direct {v2, v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    invoke-static {v1, v2}, Lrc/a0;->A(Ljava/util/List;Ljava/util/Comparator;)V

    .line 119
    :cond_35
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    .line 120
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_1f
    if-ge v3, v2, :cond_38

    .line 121
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 122
    check-cast v4, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 123
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-interface {v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 124
    invoke-direct {v0, v6, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v7

    if-eqz p8, :cond_36

    .line 125
    invoke-static {v8}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    invoke-direct {v0, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v10

    goto :goto_20

    .line 126
    :cond_36
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLayoutMinOffset()I

    move-result v10

    :goto_20
    sub-int/2addr v10, v7

    .line 127
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getCrossAxisOffset()I

    move-result v5

    move/from16 v7, p2

    move/from16 v11, p3

    .line 128
    invoke-interface {v4, v10, v5, v7, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->position(IIII)V

    if-eqz v24, :cond_37

    const/4 v5, 0x1

    .line 129
    invoke-direct {v0, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V

    :cond_37
    add-int/lit8 v3, v3, 0x1

    goto :goto_1f

    :cond_38
    move/from16 v7, p2

    move/from16 v11, p3

    const/16 v29, 0x6

    const/16 v30, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v6

    .line 130
    invoke-static/range {v25 .. v30}, Lrc/p;->D([IIIIILjava/lang/Object;)V

    goto :goto_21

    :cond_39
    move/from16 v7, p2

    move/from16 v11, p3

    .line 131
    :goto_21
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3d

    .line 132
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    .line 133
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_3a

    new-instance v2, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2;

    invoke-direct {v2, v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2;-><init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;)V

    invoke-static {v1, v2}, Lrc/a0;->A(Ljava/util/List;Ljava/util/Comparator;)V

    .line 134
    :cond_3a
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    .line 135
    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_22
    if-ge v3, v2, :cond_3d

    .line 136
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    .line 137
    check-cast v4, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 138
    iget-object v5, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyToItemInfoMap:Landroidx/collection/MutableScatterMap;

    invoke-interface {v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v5, v9}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;

    .line 139
    invoke-direct {v0, v6, v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->updateAndReturnOffsetFor([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v9

    if-eqz p8, :cond_3b

    .line 140
    invoke-static {v8}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;

    .line 141
    invoke-direct {v0, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->getMainAxisOffset(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I

    move-result v12

    invoke-interface {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v10

    add-int/2addr v12, v10

    goto :goto_23

    .line 142
    :cond_3b
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getLayoutMaxOffset()I

    move-result v12

    .line 143
    :goto_23
    invoke-interface {v4}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->getMainAxisSizeWithSpacings()I

    move-result v10

    sub-int/2addr v12, v10

    add-int/2addr v12, v9

    .line 144
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;->getCrossAxisOffset()I

    move-result v5

    .line 145
    invoke-interface {v4, v12, v5, v7, v11}, Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;->position(IIII)V

    const/4 v5, 0x1

    if-eqz v24, :cond_3c

    .line 146
    invoke-direct {v0, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->startPlacementAnimationsIfNeeded(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V

    :cond_3c
    add-int/lit8 v3, v3, 0x1

    goto :goto_22

    .line 147
    :cond_3d
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    invoke-static {v1}, Lrc/d0;->a0(Ljava/util/List;)V

    sget-object v2, Lqc/q;->a:Lqc/q;

    check-cast v1, Ljava/util/Collection;

    const/4 v4, 0x0

    invoke-interface {v8, v4, v1}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 148
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v8, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 149
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromStartBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 150
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingInFromEndBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 151
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToStartBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 152
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayToEndBound:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 153
    iget-object v1, v0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->movingAwayKeys:Landroidx/collection/MutableScatterSet;

    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->clear()V

    return-void
.end method

.method public final reset()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->releaseAnimations()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->keyIndexMap:Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iput v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;->firstVisibleIndex:I

    .line 9
    .line 10
    return-void
.end method
