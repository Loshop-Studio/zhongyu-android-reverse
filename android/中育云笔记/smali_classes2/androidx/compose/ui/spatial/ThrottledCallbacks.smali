.class public final Landroidx/compose/ui/spatial/ThrottledCallbacks;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

.field private minDebounceDeadline:J

.field private final rectChangedMap:Landroidx/collection/MutableIntObjectMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;"
        }
    .end annotation
.end field

.field private screenOffset:J

.field private viewToWindowMatrix:[F

.field private windowOffset:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Landroidx/collection/IntObjectMapKt;->mutableIntObjectMapOf()Landroidx/collection/MutableIntObjectMap;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 9
    .line 10
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    iput-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 13
    .line 14
    sget-object v0, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iput-wide v1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 27
    .line 28
    return-void
.end method

.method public static final synthetic access$multiRemove(Landroidx/compose/ui/spatial/ThrottledCallbacks;Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->multiRemove(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$removeFromGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks;Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->removeFromGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final addToGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 7
    .line 8
    return-void
.end method

.method private final debounceEntry-b8qMvQI(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J
    .locals 12

    .line 1
    move-wide/from16 v1, p7

    .line 2
    .line 3
    move-wide/from16 v10, p9

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    const-wide/16 v5, 0x0

    .line 10
    .line 11
    cmp-long v3, v3, v5

    .line 12
    .line 13
    if-lez v3, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastUninvokedFireMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    cmp-long v3, v3, v5

    .line 20
    .line 21
    if-lez v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastUninvokedFireMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    sub-long v3, v1, v3

    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    cmp-long v3, v3, v5

    .line 34
    .line 35
    if-lez v3, :cond_0

    .line 36
    .line 37
    invoke-virtual {p1, v1, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastInvokeMillis(J)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v1, -0x1

    .line 41
    .line 42
    invoke-virtual {p1, v1, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getTopLeft()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getBottomRight()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    move-object v0, p1

    .line 54
    move-wide v5, p2

    .line 55
    move-wide/from16 v7, p4

    .line 56
    .line 57
    move-object/from16 v9, p6

    .line 58
    .line 59
    invoke-virtual/range {v0 .. v9}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->fire-9b-9wPM(JJJJ[F)V

    .line 60
    .line 61
    .line 62
    return-wide v10

    .line 63
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastUninvokedFireMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    .line 68
    .line 69
    .line 70
    move-result-wide v2

    .line 71
    add-long/2addr v0, v2

    .line 72
    invoke-static {v10, v11, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    return-wide v0

    .line 77
    :cond_1
    return-wide v10
.end method

.method private final fire-WY9HvpM(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v11, p7

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastInvokeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v2

    .line 11
    sub-long v2, v11, v2

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getThrottleMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v4

    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-lez v2, :cond_0

    .line 22
    .line 23
    move v2, v4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v2, v3

    .line 26
    :goto_0
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    .line 27
    .line 28
    .line 29
    move-result-wide v5

    .line 30
    const-wide/16 v13, 0x0

    .line 31
    .line 32
    cmp-long v5, v5, v13

    .line 33
    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    move v15, v4

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v15, v3

    .line 39
    :goto_1
    invoke-virtual {v1, v11, v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 40
    .line 41
    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    if-eqz v15, :cond_2

    .line 45
    .line 46
    invoke-virtual {v1, v11, v12}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastInvokeMillis(J)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getTopLeft()J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getBottomRight()J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    move-wide/from16 v6, p2

    .line 58
    .line 59
    move-wide/from16 v8, p4

    .line 60
    .line 61
    move-object/from16 v10, p6

    .line 62
    .line 63
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->fire-9b-9wPM(JJJJ[F)V

    .line 64
    .line 65
    .line 66
    :cond_2
    if-nez v15, :cond_3

    .line 67
    .line 68
    iget-wide v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 69
    .line 70
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    .line 71
    .line 72
    .line 73
    move-result-wide v3

    .line 74
    add-long/2addr v3, v11

    .line 75
    cmp-long v5, v1, v13

    .line 76
    .line 77
    if-lez v5, :cond_3

    .line 78
    .line 79
    cmp-long v3, v3, v1

    .line 80
    .line 81
    if-gez v3, :cond_3

    .line 82
    .line 83
    iput-wide v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 84
    .line 85
    :cond_3
    return-void
.end method

.method private final fireWithUpdatedRect(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p6

    .line 6
    .line 7
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getLastInvokeMillis()J

    .line 8
    .line 9
    .line 10
    move-result-wide v4

    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getThrottleMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v6

    .line 15
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getDebounceMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v8

    .line 19
    sub-long v4, v2, v4

    .line 20
    .line 21
    cmp-long v4, v4, v6

    .line 22
    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v10, 0x1

    .line 25
    if-ltz v4, :cond_0

    .line 26
    .line 27
    move v4, v10

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v5

    .line 30
    :goto_0
    const-wide/16 v11, 0x0

    .line 31
    .line 32
    cmp-long v13, v8, v11

    .line 33
    .line 34
    if-nez v13, :cond_1

    .line 35
    .line 36
    move v13, v10

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v13, v5

    .line 39
    :goto_1
    cmp-long v6, v6, v11

    .line 40
    .line 41
    if-nez v6, :cond_2

    .line 42
    .line 43
    move v6, v10

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v6, v5

    .line 46
    :goto_2
    invoke-virtual/range {p1 .. p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setTopLeft(J)V

    .line 47
    .line 48
    .line 49
    move-wide/from16 v14, p4

    .line 50
    .line 51
    invoke-virtual {v1, v14, v15}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setBottomRight(J)V

    .line 52
    .line 53
    .line 54
    if-nez v13, :cond_3

    .line 55
    .line 56
    if-eqz v6, :cond_4

    .line 57
    .line 58
    :cond_3
    if-eqz v13, :cond_5

    .line 59
    .line 60
    :cond_4
    move v5, v10

    .line 61
    :cond_5
    if-eqz v4, :cond_6

    .line 62
    .line 63
    if-eqz v5, :cond_6

    .line 64
    .line 65
    const-wide/16 v4, -0x1

    .line 66
    .line 67
    invoke-virtual {v1, v4, v5}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2, v3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastInvokeMillis(J)V

    .line 71
    .line 72
    .line 73
    iget-wide v6, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 74
    .line 75
    iget-wide v8, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 76
    .line 77
    iget-object v10, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 78
    .line 79
    move-wide/from16 v2, p2

    .line 80
    .line 81
    move-wide v4, v14

    .line 82
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->fire-9b-9wPM(JJJJ[F)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_6
    if-nez v13, :cond_7

    .line 87
    .line 88
    invoke-virtual {v1, v2, v3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setLastUninvokedFireMillis(J)V

    .line 89
    .line 90
    .line 91
    iget-wide v4, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 92
    .line 93
    add-long v1, v2, v8

    .line 94
    .line 95
    cmp-long v3, v4, v11

    .line 96
    .line 97
    if-lez v3, :cond_7

    .line 98
    .line 99
    cmp-long v1, v1, v4

    .line 100
    .line 101
    if-gez v1, :cond_7

    .line 102
    .line 103
    iput-wide v4, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 104
    .line 105
    :cond_7
    return-void
.end method

.method private final linkedForEach(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    :goto_0
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p2, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    return-void
.end method

.method private final multiForEach(Landroidx/collection/MutableIntObjectMap;Lhd/l;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p1, p1, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 4
    .line 5
    array-length v1, p1

    .line 6
    add-int/lit8 v1, v1, -0x2

    .line 7
    .line 8
    if-ltz v1, :cond_3

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    aget-wide v4, p1, v3

    .line 13
    .line 14
    not-long v6, v4

    .line 15
    const/4 v8, 0x7

    .line 16
    shl-long/2addr v6, v8

    .line 17
    and-long/2addr v6, v4

    .line 18
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr v6, v8

    .line 24
    cmp-long v6, v6, v8

    .line 25
    .line 26
    if-eqz v6, :cond_2

    .line 27
    .line 28
    sub-int v6, v3, v1

    .line 29
    .line 30
    not-int v6, v6

    .line 31
    ushr-int/lit8 v6, v6, 0x1f

    .line 32
    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    rsub-int/lit8 v6, v6, 0x8

    .line 36
    .line 37
    move v8, v2

    .line 38
    :goto_1
    if-ge v8, v6, :cond_1

    .line 39
    .line 40
    const-wide/16 v9, 0xff

    .line 41
    .line 42
    and-long/2addr v9, v4

    .line 43
    const-wide/16 v11, 0x80

    .line 44
    .line 45
    cmp-long v9, v9, v11

    .line 46
    .line 47
    if-gez v9, :cond_0

    .line 48
    .line 49
    shl-int/lit8 v9, v3, 0x3

    .line 50
    .line 51
    add-int/2addr v9, v8

    .line 52
    aget-object v9, v0, v9

    .line 53
    .line 54
    check-cast v9, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 55
    .line 56
    :goto_2
    if-eqz v9, :cond_0

    .line 57
    .line 58
    invoke-interface {p2, v9}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v9}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    goto :goto_2

    .line 66
    :cond_0
    shr-long/2addr v4, v7

    .line 67
    add-int/lit8 v8, v8, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    if-ne v6, v7, :cond_3

    .line 71
    .line 72
    :cond_2
    if-eq v3, v1, :cond_3

    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_3
    return-void
.end method

.method private final multiPut(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;I",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ")",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p2, p3}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    move-object v0, p3

    .line 11
    :cond_0
    check-cast v0, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 12
    .line 13
    if-eq v0, p3, :cond_2

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0, p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 30
    .line 31
    .line 32
    :cond_2
    return-object p3
.end method

.method private final multiRemove(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;I",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroidx/collection/MutableIntObjectMap;->remove(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-static {v0, p3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-eqz v2, :cond_2

    .line 18
    .line 19
    invoke-virtual {p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p3, v4}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, p2, v0}, Landroidx/collection/MutableIntObjectMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1
    return v3

    .line 32
    :cond_2
    invoke-virtual {p1, p2, v0}, Landroidx/collection/MutableIntObjectMap;->put(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :goto_0
    if-eqz v0, :cond_5

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    return v1

    .line 44
    :cond_3
    if-ne p1, p3, :cond_4

    .line 45
    .line 46
    invoke-virtual {p3}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v0, p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3, v4}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_0

    .line 62
    :cond_5
    :goto_1
    return v3
.end method

.method private final removeFromGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 12
    .line 13
    invoke-virtual {p1, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 14
    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v3, v2

    .line 25
    :goto_0
    move-object v4, v3

    .line 26
    move-object v3, v0

    .line 27
    move-object v0, v4

    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    if-ne v0, p1, :cond_3

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v3, v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-virtual {p1, v2}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setNext(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 43
    .line 44
    .line 45
    return v1

    .line 46
    :cond_3
    invoke-virtual {v0}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    goto :goto_0

    .line 51
    :cond_4
    const/4 p1, 0x0

    .line 52
    return p1
.end method

.method private final roundDownToMultipleOf8(J)J
    .locals 1

    const/4 v0, 0x3

    shr-long/2addr p1, v0

    shl-long/2addr p1, v0

    return-wide p1
.end method

.method private final runFor(Landroidx/collection/MutableIntObjectMap;ILhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;I",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1, p2}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 6
    .line 7
    :goto_0
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-interface {p3, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public final fireGlobalChangeEntries(J)V
    .locals 14

    .line 1
    iget-wide v2, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 2
    .line 3
    iget-wide v4, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 4
    .line 5
    iget-object v6, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v1, v0

    .line 12
    :goto_0
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNode()Landroidx/compose/ui/node/DelegatableNode;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getOffsetFromRoot-nOcc-ac$ui_release()J

    .line 23
    .line 24
    .line 25
    move-result-wide v7

    .line 26
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getLastSize-YbymL2g$ui_release()J

    .line 27
    .line 28
    .line 29
    move-result-wide v9

    .line 30
    invoke-virtual {v1, v7, v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setTopLeft(J)V

    .line 31
    .line 32
    .line 33
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntOffset;->getX-impl(J)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v11, 0x20

    .line 38
    .line 39
    shr-long v12, v9, v11

    .line 40
    .line 41
    long-to-int v12, v12

    .line 42
    add-int/2addr v0, v12

    .line 43
    invoke-static {v7, v8}, Landroidx/compose/ui/unit/IntOffset;->getY-impl(J)I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    const-wide v12, 0xffffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    and-long v8, v9, v12

    .line 53
    .line 54
    long-to-int v8, v8

    .line 55
    add-int/2addr v7, v8

    .line 56
    int-to-long v8, v0

    .line 57
    shl-long/2addr v8, v11

    .line 58
    int-to-long v10, v7

    .line 59
    and-long/2addr v10, v12

    .line 60
    or-long v7, v8, v10

    .line 61
    .line 62
    invoke-virtual {v1, v7, v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->setBottomRight(J)V

    .line 63
    .line 64
    .line 65
    move-object v0, p0

    .line 66
    move-wide v7, p1

    .line 67
    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fire-WY9HvpM(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-void
.end method

.method public final fireOnRectChangedEntries(J)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v2, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 4
    .line 5
    iget-wide v4, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 6
    .line 7
    iget-object v6, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 8
    .line 9
    iget-object v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 10
    .line 11
    iget-object v9, v1, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v10, v1, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 14
    .line 15
    array-length v1, v10

    .line 16
    add-int/lit8 v11, v1, -0x2

    .line 17
    .line 18
    if-ltz v11, :cond_3

    .line 19
    .line 20
    const/4 v12, 0x0

    .line 21
    move v13, v12

    .line 22
    :goto_0
    aget-wide v7, v10, v13

    .line 23
    .line 24
    not-long v14, v7

    .line 25
    const/4 v1, 0x7

    .line 26
    shl-long/2addr v14, v1

    .line 27
    and-long/2addr v14, v7

    .line 28
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long v14, v14, v16

    .line 34
    .line 35
    cmp-long v1, v14, v16

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    sub-int v1, v13, v11

    .line 40
    .line 41
    not-int v1, v1

    .line 42
    ushr-int/lit8 v1, v1, 0x1f

    .line 43
    .line 44
    const/16 v14, 0x8

    .line 45
    .line 46
    rsub-int/lit8 v15, v1, 0x8

    .line 47
    .line 48
    move-wide/from16 v16, v7

    .line 49
    .line 50
    move v1, v12

    .line 51
    :goto_1
    if-ge v1, v15, :cond_1

    .line 52
    .line 53
    const-wide/16 v7, 0xff

    .line 54
    .line 55
    and-long v7, v16, v7

    .line 56
    .line 57
    const-wide/16 v18, 0x80

    .line 58
    .line 59
    cmp-long v7, v7, v18

    .line 60
    .line 61
    if-gez v7, :cond_0

    .line 62
    .line 63
    shl-int/lit8 v7, v13, 0x3

    .line 64
    .line 65
    add-int/2addr v7, v1

    .line 66
    aget-object v7, v9, v7

    .line 67
    .line 68
    check-cast v7, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 69
    .line 70
    :goto_2
    if-eqz v7, :cond_0

    .line 71
    .line 72
    move/from16 v18, v1

    .line 73
    .line 74
    move-object v1, v7

    .line 75
    move-wide/from16 v7, p1

    .line 76
    .line 77
    invoke-direct/range {v0 .. v8}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fire-WY9HvpM(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    move-object/from16 v0, p0

    .line 85
    .line 86
    move/from16 v1, v18

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_0
    move/from16 v18, v1

    .line 90
    .line 91
    shr-long v16, v16, v14

    .line 92
    .line 93
    add-int/lit8 v1, v18, 0x1

    .line 94
    .line 95
    move-object/from16 v0, p0

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_1
    if-ne v15, v14, :cond_3

    .line 99
    .line 100
    :cond_2
    if-eq v13, v11, :cond_3

    .line 101
    .line 102
    add-int/lit8 v13, v13, 0x1

    .line 103
    .line 104
    move-object/from16 v0, p0

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    return-void
.end method

.method public final fireOnUpdatedRect(IJJJ)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    :goto_0
    if-eqz v1, :cond_0

    .line 11
    .line 12
    move-object v0, p0

    .line 13
    move-wide v2, p2

    .line 14
    move-wide v4, p4

    .line 15
    move-wide v6, p6

    .line 16
    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->fireWithUpdatedRect(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-void
.end method

.method public final getGlobalChangeEntries()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMinDebounceDeadline()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRectChangedMap()Landroidx/collection/MutableIntObjectMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableIntObjectMap<",
            "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getScreenOffset-nOcc-ac()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getViewToWindowMatrix-3i98HWw()[F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWindowOffset-nOcc-ac()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final registerOnGlobalChange(IJJLandroidx/compose/ui/node/DelegatableNode;Lhd/l;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p4, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-wide v6, p2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v6, p4

    .line 10
    :goto_0
    new-instance v1, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 11
    .line 12
    move-object v2, p0

    .line 13
    move v3, p1

    .line 14
    move-wide v4, p2

    .line 15
    move-object/from16 v8, p6

    .line 16
    .line 17
    move-object/from16 v9, p7

    .line 18
    .line 19
    invoke-direct/range {v1 .. v9}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;-><init>(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lhd/l;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0, v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->addToGlobalEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V

    .line 23
    .line 24
    .line 25
    return-object v1
.end method

.method public final registerOnRectChanged(IJJLandroidx/compose/ui/node/DelegatableNode;Lhd/l;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJ",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "Lhd/l;",
            ")",
            "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;"
        }
    .end annotation

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p4, v0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    move-wide v6, p2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide v6, p4

    .line 10
    :goto_0
    iget-object p4, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 11
    .line 12
    new-instance v1, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 13
    .line 14
    move-object v2, p0

    .line 15
    move v3, p1

    .line 16
    move-wide v4, p2

    .line 17
    move-object/from16 v8, p6

    .line 18
    .line 19
    move-object/from16 v9, p7

    .line 20
    .line 21
    invoke-direct/range {v1 .. v9}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;-><init>(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lhd/l;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0, p4, p1, v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->multiPut(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public final setGlobalChangeEntries(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 2
    .line 3
    return-void
.end method

.method public final setMinDebounceDeadline(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 2
    .line 3
    return-void
.end method

.method public final setScreenOffset--gyyYBs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 2
    .line 3
    return-void
.end method

.method public final setViewToWindowMatrix-Q8lPUPs([F)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 2
    .line 3
    return-void
.end method

.method public final setWindowOffset--gyyYBs(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 2
    .line 3
    return-void
.end method

.method public final triggerDebounced(J)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 4
    .line 5
    cmp-long v1, v1, p1

    .line 6
    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-wide v2, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 11
    .line 12
    iget-wide v4, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 13
    .line 14
    iget-object v6, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 15
    .line 16
    iget-object v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->rectChangedMap:Landroidx/collection/MutableIntObjectMap;

    .line 17
    .line 18
    iget-object v11, v1, Landroidx/collection/IntObjectMap;->values:[Ljava/lang/Object;

    .line 19
    .line 20
    iget-object v12, v1, Landroidx/collection/IntObjectMap;->metadata:[J

    .line 21
    .line 22
    array-length v1, v12

    .line 23
    add-int/lit8 v13, v1, -0x2

    .line 24
    .line 25
    if-ltz v13, :cond_5

    .line 26
    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    move/from16 v1, v16

    .line 30
    .line 31
    const-wide v7, 0x7fffffffffffffffL

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    :goto_0
    aget-wide v9, v12, v1

    .line 37
    .line 38
    const-wide v17, 0x7fffffffffffffffL

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    not-long v14, v9

    .line 44
    const/16 v19, 0x7

    .line 45
    .line 46
    shl-long v14, v14, v19

    .line 47
    .line 48
    and-long/2addr v14, v9

    .line 49
    const-wide v19, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long v14, v14, v19

    .line 55
    .line 56
    cmp-long v14, v14, v19

    .line 57
    .line 58
    if-eqz v14, :cond_4

    .line 59
    .line 60
    sub-int v14, v1, v13

    .line 61
    .line 62
    not-int v14, v14

    .line 63
    ushr-int/lit8 v14, v14, 0x1f

    .line 64
    .line 65
    const/16 v15, 0x8

    .line 66
    .line 67
    rsub-int/lit8 v14, v14, 0x8

    .line 68
    .line 69
    move-wide/from16 v19, v9

    .line 70
    .line 71
    move/from16 v9, v16

    .line 72
    .line 73
    :goto_1
    if-ge v9, v14, :cond_3

    .line 74
    .line 75
    const-wide/16 v21, 0xff

    .line 76
    .line 77
    and-long v21, v19, v21

    .line 78
    .line 79
    const-wide/16 v23, 0x80

    .line 80
    .line 81
    cmp-long v10, v21, v23

    .line 82
    .line 83
    if-gez v10, :cond_2

    .line 84
    .line 85
    shl-int/lit8 v10, v1, 0x3

    .line 86
    .line 87
    add-int/2addr v10, v9

    .line 88
    aget-object v10, v11, v10

    .line 89
    .line 90
    check-cast v10, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 91
    .line 92
    :goto_2
    if-eqz v10, :cond_1

    .line 93
    .line 94
    move/from16 v25, v1

    .line 95
    .line 96
    move/from16 v21, v9

    .line 97
    .line 98
    move-object v1, v10

    .line 99
    move-wide v9, v7

    .line 100
    move-wide/from16 v7, p1

    .line 101
    .line 102
    invoke-direct/range {v0 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->debounceEntry-b8qMvQI(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide v9

    .line 106
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    move-wide v7, v9

    .line 111
    move/from16 v9, v21

    .line 112
    .line 113
    move-object v10, v1

    .line 114
    move/from16 v1, v25

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_1
    move/from16 v21, v9

    .line 118
    .line 119
    move-wide v9, v7

    .line 120
    :goto_3
    move/from16 v25, v1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_2
    move/from16 v21, v9

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :goto_4
    shr-long v19, v19, v15

    .line 127
    .line 128
    add-int/lit8 v9, v21, 0x1

    .line 129
    .line 130
    move/from16 v1, v25

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_3
    move/from16 v25, v1

    .line 134
    .line 135
    if-ne v14, v15, :cond_6

    .line 136
    .line 137
    move/from16 v1, v25

    .line 138
    .line 139
    :cond_4
    if-eq v1, v13, :cond_6

    .line 140
    .line 141
    add-int/lit8 v1, v1, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_5
    const-wide v17, 0x7fffffffffffffffL

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    move-wide/from16 v7, v17

    .line 150
    .line 151
    :cond_6
    iget-object v1, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->globalChangeEntries:Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 152
    .line 153
    if-eqz v1, :cond_8

    .line 154
    .line 155
    move-wide v9, v7

    .line 156
    :goto_5
    if-eqz v1, :cond_7

    .line 157
    .line 158
    move-wide/from16 v7, p1

    .line 159
    .line 160
    invoke-direct/range {v0 .. v10}, Landroidx/compose/ui/spatial/ThrottledCallbacks;->debounceEntry-b8qMvQI(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J

    .line 161
    .line 162
    .line 163
    move-result-wide v9

    .line 164
    invoke-virtual {v1}, Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;->getNext()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    goto :goto_5

    .line 169
    :cond_7
    move-wide v7, v9

    .line 170
    :cond_8
    cmp-long v1, v7, v17

    .line 171
    .line 172
    if-nez v1, :cond_9

    .line 173
    .line 174
    const-wide/16 v7, -0x1

    .line 175
    .line 176
    :cond_9
    iput-wide v7, v0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->minDebounceDeadline:J

    .line 177
    .line 178
    return-void
.end method

.method public final updateOffsets-bT0EZQs(JJ[F)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 2
    .line 3
    invoke-static {p3, p4, v0, v1}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-wide p3, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->windowOffset:J

    .line 11
    .line 12
    move p3, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p3, 0x0

    .line 15
    :goto_0
    iget-wide v2, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 16
    .line 17
    invoke-static {p1, p2, v2, v3}, Landroidx/compose/ui/unit/IntOffset;->equals-impl0(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p4

    .line 21
    if-nez p4, :cond_1

    .line 22
    .line 23
    iput-wide p1, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->screenOffset:J

    .line 24
    .line 25
    move p3, v1

    .line 26
    :cond_1
    if-eqz p5, :cond_2

    .line 27
    .line 28
    iput-object p5, p0, Landroidx/compose/ui/spatial/ThrottledCallbacks;->viewToWindowMatrix:[F

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    return p3
.end method
