.class public final Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\u001a,\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002\u001a2\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00082\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016\u001a1\u0010\u0017\u001a\u00020\u0013*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0002\u00a2\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"
    }
    d2 = {
        "AssumePointerMoveStoppedMilliseconds",
        "",
        "DefaultWeight",
        "",
        "HistorySize",
        "HorizonMilliseconds",
        "calculateImpulseVelocity",
        "dataPoints",
        "",
        "time",
        "isDataDifferential",
        "",
        "kineticEnergyToVelocity",
        "kineticEnergy",
        "polyFitLeastSquares",
        "x",
        "y",
        "degree",
        "addPointerInputChange",
        "",
        "Landroidx/compose/ui/input/pointer/util/VelocityTracker;",
        "event",
        "Landroidx/compose/ui/input/pointer/PointerInputChange;",
        "set",
        "",
        "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;",
        "index",
        "",
        "dataPoint",
        "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n33#2,6:600\n1#3:606\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTrackerKt\n*L\n297#1:600,6\n*E\n"
    }
.end annotation


# static fields
.field private static final AssumePointerMoveStoppedMilliseconds:I = 0x28

.field private static final DefaultWeight:F = 1.0f

.field private static final HistorySize:I = 0x14

.field private static final HorizonMilliseconds:I = 0x64


# direct methods
.method public static final synthetic access$calculateImpulseVelocity(Ljava/util/List;Ljava/util/List;Z)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->calculateImpulseVelocity(Ljava/util/List;Ljava/util/List;Z)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final addPointerInputChange(Landroidx/compose/ui/input/pointer/util/VelocityTracker;Landroidx/compose/ui/input/pointer/PointerInputChange;)V
    .locals 10

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/PointerEventKt;->changedToDownIgnoreConsumed(Landroidx/compose/ui/input/pointer/PointerInputChange;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->resetTracking()V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPreviousPosition-F1C5BW0()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getHistorical()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    const/4 v4, 0x0

    .line 40
    :goto_0
    if-ge v4, v3, :cond_1

    .line 41
    .line 42
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Landroidx/compose/ui/input/pointer/HistoricalChange;

    .line 47
    .line 48
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getPosition-F1C5BW0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    invoke-static {v6, v7, v0, v1}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getPosition-F1C5BW0()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 61
    .line 62
    .line 63
    move-result-wide v8

    .line 64
    invoke-static {v8, v9, v0, v1}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v0

    .line 68
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5}, Landroidx/compose/ui/input/pointer/HistoricalChange;->getUptimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 76
    .line 77
    .line 78
    move-result-wide v8

    .line 79
    invoke-virtual {p0, v0, v1, v8, v9}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v4, v4, 0x1

    .line 83
    .line 84
    move-wide v0, v6

    .line 85
    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getPosition-F1C5BW0()J

    .line 87
    .line 88
    .line 89
    move-result-wide v2

    .line 90
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/ui/geometry/Offset;->minus-MK-Hz9U(JJ)J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    invoke-virtual {p0, v0, v1}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release(J)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getUptimeMillis()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->getCurrentPointerPositionAccumulator-F1C5BW0$ui_release()J

    .line 110
    .line 111
    .line 112
    move-result-wide v2

    .line 113
    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/compose/ui/input/pointer/util/VelocityTracker;->addPosition-Uv8p0NA(JJ)V

    .line 114
    .line 115
    .line 116
    return-void
.end method

.method private static final calculateImpulseVelocity(Ljava/util/List;Ljava/util/List;Z)F
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;Z)F"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    if-ge v0, v2, :cond_0

    .line 8
    .line 9
    return v1

    .line 10
    :cond_0
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x1

    .line 12
    if-ne v0, v2, :cond_4

    .line 13
    .line 14
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Number;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    cmpg-float v0, v0, v2

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    move v0, v4

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move v0, v3

    .line 41
    :goto_0
    if-eqz v0, :cond_2

    .line 42
    .line 43
    return v1

    .line 44
    :cond_2
    if-eqz p2, :cond_3

    .line 45
    .line 46
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    check-cast p2, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    check-cast p0, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    sub-float p0, p2, p0

    .line 78
    .line 79
    :goto_1
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    sub-float/2addr p2, p1

    .line 100
    div-float/2addr p0, p2

    .line 101
    return p0

    .line 102
    :cond_4
    sub-int/2addr v0, v4

    .line 103
    move v2, v0

    .line 104
    :goto_2
    if-lez v2, :cond_9

    .line 105
    .line 106
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    check-cast v5, Ljava/lang/Number;

    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 113
    .line 114
    .line 115
    move-result v5

    .line 116
    add-int/lit8 v6, v2, -0x1

    .line 117
    .line 118
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    check-cast v7, Ljava/lang/Number;

    .line 123
    .line 124
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    cmpg-float v5, v5, v7

    .line 129
    .line 130
    if-nez v5, :cond_5

    .line 131
    .line 132
    move v5, v4

    .line 133
    goto :goto_3

    .line 134
    :cond_5
    move v5, v3

    .line 135
    :goto_3
    if-eqz v5, :cond_6

    .line 136
    .line 137
    goto :goto_5

    .line 138
    :cond_6
    invoke-static {v1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->kineticEnergyToVelocity(F)F

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    if-eqz p2, :cond_7

    .line 143
    .line 144
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    check-cast v7, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    neg-float v7, v7

    .line 155
    goto :goto_4

    .line 156
    :cond_7
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    check-cast v7, Ljava/lang/Number;

    .line 161
    .line 162
    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    check-cast v8, Ljava/lang/Number;

    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result v8

    .line 176
    sub-float/2addr v7, v8

    .line 177
    :goto_4
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    check-cast v8, Ljava/lang/Number;

    .line 182
    .line 183
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 184
    .line 185
    .line 186
    move-result v8

    .line 187
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    check-cast v6, Ljava/lang/Number;

    .line 192
    .line 193
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    sub-float/2addr v8, v6

    .line 198
    div-float/2addr v7, v8

    .line 199
    sub-float v5, v7, v5

    .line 200
    .line 201
    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    mul-float/2addr v5, v6

    .line 206
    add-float/2addr v1, v5

    .line 207
    if-ne v2, v0, :cond_8

    .line 208
    .line 209
    const/high16 v5, 0x3f000000    # 0.5f

    .line 210
    .line 211
    mul-float/2addr v1, v5

    .line 212
    :cond_8
    :goto_5
    add-int/lit8 v2, v2, -0x1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_9
    invoke-static {v1}, Landroidx/compose/ui/input/pointer/util/VelocityTrackerKt;->kineticEnergyToVelocity(F)F

    .line 216
    .line 217
    .line 218
    move-result p0

    .line 219
    return p0
.end method

.method private static final kineticEnergyToVelocity(F)F
    .locals 3

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->signum(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    int-to-float v1, v1

    .line 7
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    mul-float/2addr v1, p0

    .line 12
    float-to-double v1, v1

    .line 13
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    double-to-float p0, v1

    .line 18
    mul-float/2addr v0, p0

    .line 19
    return v0
.end method

.method public static final polyFitLeastSquares(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;I)",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    const-string/jumbo v3, "x"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string/jumbo v3, "y"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    if-lt v2, v3, :cond_11

    .line 21
    .line 22
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    if-ne v4, v5, :cond_10

    .line 31
    .line 32
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_f

    .line 37
    .line 38
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-lt v2, v4, :cond_0

    .line 43
    .line 44
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    sub-int/2addr v4, v3

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v4, v2

    .line 51
    :goto_0
    add-int/2addr v2, v3

    .line 52
    new-instance v5, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    move v7, v6

    .line 59
    :goto_1
    const/4 v8, 0x0

    .line 60
    if-ge v7, v2, :cond_1

    .line 61
    .line 62
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    add-int/lit8 v7, v7, 0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/2addr v4, v3

    .line 77
    new-instance v7, Landroidx/compose/ui/input/pointer/util/Matrix;

    .line 78
    .line 79
    invoke-direct {v7, v4, v2}, Landroidx/compose/ui/input/pointer/util/Matrix;-><init>(II)V

    .line 80
    .line 81
    .line 82
    move v9, v6

    .line 83
    :goto_2
    const/high16 v10, 0x3f800000    # 1.0f

    .line 84
    .line 85
    if-ge v9, v2, :cond_3

    .line 86
    .line 87
    invoke-virtual {v7, v6, v9, v10}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    .line 88
    .line 89
    .line 90
    move v10, v3

    .line 91
    :goto_3
    if-ge v10, v4, :cond_2

    .line 92
    .line 93
    add-int/lit8 v11, v10, -0x1

    .line 94
    .line 95
    invoke-virtual {v7, v11, v9}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    check-cast v12, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    .line 106
    .line 107
    .line 108
    move-result v12

    .line 109
    mul-float/2addr v11, v12

    .line 110
    invoke-virtual {v7, v10, v9, v11}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    .line 111
    .line 112
    .line 113
    add-int/lit8 v10, v10, 0x1

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_2
    add-int/lit8 v9, v9, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    new-instance v0, Landroidx/compose/ui/input/pointer/util/Matrix;

    .line 120
    .line 121
    invoke-direct {v0, v4, v2}, Landroidx/compose/ui/input/pointer/util/Matrix;-><init>(II)V

    .line 122
    .line 123
    .line 124
    new-instance v9, Landroidx/compose/ui/input/pointer/util/Matrix;

    .line 125
    .line 126
    invoke-direct {v9, v4, v4}, Landroidx/compose/ui/input/pointer/util/Matrix;-><init>(II)V

    .line 127
    .line 128
    .line 129
    move v11, v6

    .line 130
    :goto_4
    if-ge v11, v4, :cond_b

    .line 131
    .line 132
    move v12, v6

    .line 133
    :goto_5
    if-ge v12, v2, :cond_4

    .line 134
    .line 135
    invoke-virtual {v7, v11, v12}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    invoke-virtual {v0, v11, v12, v13}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    .line 140
    .line 141
    .line 142
    add-int/lit8 v12, v12, 0x1

    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_4
    move v12, v6

    .line 146
    :goto_6
    if-ge v12, v11, :cond_6

    .line 147
    .line 148
    invoke-virtual {v0, v11}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    invoke-virtual {v0, v12}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    .line 153
    .line 154
    .line 155
    move-result-object v14

    .line 156
    invoke-virtual {v13, v14}, Landroidx/compose/ui/input/pointer/util/Vector;->times(Landroidx/compose/ui/input/pointer/util/Vector;)F

    .line 157
    .line 158
    .line 159
    move-result v13

    .line 160
    move v14, v6

    .line 161
    :goto_7
    if-ge v14, v2, :cond_5

    .line 162
    .line 163
    invoke-virtual {v0, v11, v14}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    .line 164
    .line 165
    .line 166
    move-result v15

    .line 167
    invoke-virtual {v0, v12, v14}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    .line 168
    .line 169
    .line 170
    move-result v16

    .line 171
    mul-float v16, v16, v13

    .line 172
    .line 173
    sub-float v15, v15, v16

    .line 174
    .line 175
    invoke-virtual {v0, v11, v14, v15}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    .line 176
    .line 177
    .line 178
    add-int/lit8 v14, v14, 0x1

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :cond_5
    add-int/lit8 v12, v12, 0x1

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_6
    invoke-virtual {v0, v11}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    invoke-virtual {v12}, Landroidx/compose/ui/input/pointer/util/Vector;->norm()F

    .line 189
    .line 190
    .line 191
    move-result v12

    .line 192
    float-to-double v13, v12

    .line 193
    const-wide v15, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    cmpg-double v13, v13, v15

    .line 199
    .line 200
    if-ltz v13, :cond_a

    .line 201
    .line 202
    div-float v12, v10, v12

    .line 203
    .line 204
    move v13, v6

    .line 205
    :goto_8
    if-ge v13, v2, :cond_7

    .line 206
    .line 207
    invoke-virtual {v0, v11, v13}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    .line 208
    .line 209
    .line 210
    move-result v14

    .line 211
    mul-float/2addr v14, v12

    .line 212
    invoke-virtual {v0, v11, v13, v14}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    .line 213
    .line 214
    .line 215
    add-int/lit8 v13, v13, 0x1

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_7
    move v12, v6

    .line 219
    :goto_9
    if-ge v12, v4, :cond_9

    .line 220
    .line 221
    if-ge v12, v11, :cond_8

    .line 222
    .line 223
    move v13, v8

    .line 224
    goto :goto_a

    .line 225
    :cond_8
    invoke-virtual {v0, v11}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    .line 226
    .line 227
    .line 228
    move-result-object v13

    .line 229
    invoke-virtual {v7, v12}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    invoke-virtual {v13, v14}, Landroidx/compose/ui/input/pointer/util/Vector;->times(Landroidx/compose/ui/input/pointer/util/Vector;)F

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    :goto_a
    invoke-virtual {v9, v11, v12, v13}, Landroidx/compose/ui/input/pointer/util/Matrix;->set(IIF)V

    .line 238
    .line 239
    .line 240
    add-int/lit8 v12, v12, 0x1

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 247
    .line 248
    const-string v1, "Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means"

    .line 249
    .line 250
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    throw v0

    .line 254
    :cond_b
    new-instance v7, Landroidx/compose/ui/input/pointer/util/Vector;

    .line 255
    .line 256
    invoke-direct {v7, v2}, Landroidx/compose/ui/input/pointer/util/Vector;-><init>(I)V

    .line 257
    .line 258
    .line 259
    :goto_b
    if-ge v6, v2, :cond_c

    .line 260
    .line 261
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v8

    .line 265
    check-cast v8, Ljava/lang/Number;

    .line 266
    .line 267
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 268
    .line 269
    .line 270
    move-result v8

    .line 271
    mul-float/2addr v8, v10

    .line 272
    invoke-virtual {v7, v6, v8}, Landroidx/compose/ui/input/pointer/util/Vector;->set(IF)V

    .line 273
    .line 274
    .line 275
    add-int/lit8 v6, v6, 0x1

    .line 276
    .line 277
    goto :goto_b

    .line 278
    :cond_c
    sub-int/2addr v4, v3

    .line 279
    move v1, v4

    .line 280
    :goto_c
    const/4 v2, -0x1

    .line 281
    if-ge v2, v1, :cond_e

    .line 282
    .line 283
    invoke-virtual {v0, v1}, Landroidx/compose/ui/input/pointer/util/Matrix;->getRow(I)Landroidx/compose/ui/input/pointer/util/Vector;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-virtual {v2, v7}, Landroidx/compose/ui/input/pointer/util/Vector;->times(Landroidx/compose/ui/input/pointer/util/Vector;)F

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    invoke-interface {v5, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    add-int/lit8 v2, v1, 0x1

    .line 299
    .line 300
    if-gt v2, v4, :cond_d

    .line 301
    .line 302
    move v3, v4

    .line 303
    :goto_d
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    check-cast v6, Ljava/lang/Number;

    .line 308
    .line 309
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 310
    .line 311
    .line 312
    move-result v6

    .line 313
    invoke-virtual {v9, v1, v3}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    .line 314
    .line 315
    .line 316
    move-result v8

    .line 317
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    check-cast v10, Ljava/lang/Number;

    .line 322
    .line 323
    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    mul-float/2addr v8, v10

    .line 328
    sub-float/2addr v6, v8

    .line 329
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    invoke-interface {v5, v1, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    if-eq v3, v2, :cond_d

    .line 337
    .line 338
    add-int/lit8 v3, v3, -0x1

    .line 339
    .line 340
    goto :goto_d

    .line 341
    :cond_d
    invoke-interface {v5, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    check-cast v2, Ljava/lang/Number;

    .line 346
    .line 347
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 348
    .line 349
    .line 350
    move-result v2

    .line 351
    invoke-virtual {v9, v1, v1}, Landroidx/compose/ui/input/pointer/util/Matrix;->get(II)F

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    div-float/2addr v2, v3

    .line 356
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-interface {v5, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    add-int/lit8 v1, v1, -0x1

    .line 364
    .line 365
    goto :goto_c

    .line 366
    :cond_e
    return-object v5

    .line 367
    :cond_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 368
    .line 369
    const-string v1, "At least one point must be provided"

    .line 370
    .line 371
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    throw v0

    .line 375
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 376
    .line 377
    const-string/jumbo v1, "x and y must be the same length"

    .line 378
    .line 379
    .line 380
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    throw v0

    .line 384
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 385
    .line 386
    const-string v1, "The degree must be at positive integer"

    .line 387
    .line 388
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 389
    .line 390
    .line 391
    throw v0
.end method

.method private static final set([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V
    .locals 1

    .line 1
    aget-object v0, p0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;

    .line 6
    .line 7
    invoke-direct {v0, p2, p3, p4}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;-><init>(JF)V

    .line 8
    .line 9
    .line 10
    aput-object v0, p0, p1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p2, p3}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;->setTime(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p4}, Landroidx/compose/ui/input/pointer/util/DataPointAtTime;->setDataPoint(F)V

    .line 17
    .line 18
    .line 19
    :goto_0
    return-void
.end method
