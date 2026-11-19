.class final Landroidx/compose/foundation/gestures/AndroidConfig;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/gestures/ScrollConfig;


# instance fields
.field private final viewConfiguration:Landroid/view/ViewConfiguration;


# direct methods
.method public constructor <init>(Landroid/view/ViewConfiguration;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AndroidConfig;->viewConfiguration:Landroid/view/ViewConfiguration;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public calculateMouseWheelScroll-8xgXZGE(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/input/pointer/PointerEvent;J)J
    .locals 7

    .line 1
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 p4, 0x40

    .line 4
    .line 5
    const/16 v0, 0x1a

    .line 6
    .line 7
    if-le p3, v0, :cond_0

    .line 8
    .line 9
    sget-object v1, Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;->INSTANCE:Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/foundation/gestures/AndroidConfig;->viewConfiguration:Landroid/view/ViewConfiguration;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;->getVerticalScrollFactor(Landroid/view/ViewConfiguration;)F

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    :goto_0
    neg-float v1, v1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    int-to-float v1, p4

    .line 20
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-interface {p1, v1}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    goto :goto_0

    .line 29
    :goto_1
    if-le p3, v0, :cond_1

    .line 30
    .line 31
    sget-object p1, Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;->INSTANCE:Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;

    .line 32
    .line 33
    iget-object p3, p0, Landroidx/compose/foundation/gestures/AndroidConfig;->viewConfiguration:Landroid/view/ViewConfiguration;

    .line 34
    .line 35
    invoke-virtual {p1, p3}, Landroidx/compose/foundation/gestures/ViewConfigurationApi26Impl;->getHorizontalScrollFactor(Landroid/view/ViewConfiguration;)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    :goto_2
    neg-float p1, p1

    .line 40
    goto :goto_3

    .line 41
    :cond_1
    int-to-float p3, p4

    .line 42
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 43
    .line 44
    .line 45
    move-result p3

    .line 46
    invoke-interface {p1, p3}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    goto :goto_2

    .line 51
    :goto_3
    invoke-virtual {p2}, Landroidx/compose/ui/input/pointer/PointerEvent;->getChanges()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    sget-object p3, Landroidx/compose/ui/geometry/Offset;->Companion:Landroidx/compose/ui/geometry/Offset$Companion;

    .line 56
    .line 57
    invoke-virtual {p3}, Landroidx/compose/ui/geometry/Offset$Companion;->getZero-F1C5BW0()J

    .line 58
    .line 59
    .line 60
    move-result-wide p3

    .line 61
    invoke-static {p3, p4}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    move-object p4, p2

    .line 66
    check-cast p4, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-interface {p4}, Ljava/util/Collection;->size()I

    .line 69
    .line 70
    .line 71
    move-result p4

    .line 72
    const/4 v0, 0x0

    .line 73
    :goto_4
    if-ge v0, p4, :cond_2

    .line 74
    .line 75
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Landroidx/compose/ui/input/pointer/PointerInputChange;

    .line 80
    .line 81
    invoke-virtual {p3}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 82
    .line 83
    .line 84
    move-result-wide v3

    .line 85
    invoke-virtual {v2}, Landroidx/compose/ui/input/pointer/PointerInputChange;->getScrollDelta-F1C5BW0()J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/ui/geometry/Offset;->plus-MK-Hz9U(JJ)J

    .line 90
    .line 91
    .line 92
    move-result-wide v2

    .line 93
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    add-int/lit8 v0, v0, 0x1

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_2
    invoke-virtual {p3}, Landroidx/compose/ui/geometry/Offset;->unbox-impl()J

    .line 101
    .line 102
    .line 103
    move-result-wide p2

    .line 104
    const/16 p4, 0x20

    .line 105
    .line 106
    shr-long v2, p2, p4

    .line 107
    .line 108
    long-to-int v0, v2

    .line 109
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    mul-float/2addr v0, p1

    .line 114
    const-wide v2, 0xffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    and-long p1, p2, v2

    .line 120
    .line 121
    long-to-int p1, p1

    .line 122
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result p1

    .line 126
    mul-float/2addr p1, v1

    .line 127
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    int-to-long p2, p2

    .line 132
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    int-to-long v0, p1

    .line 137
    shl-long p1, p2, p4

    .line 138
    .line 139
    and-long p3, v0, v2

    .line 140
    .line 141
    or-long/2addr p1, p3

    .line 142
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 143
    .line 144
    .line 145
    move-result-wide p1

    .line 146
    return-wide p1
.end method

.method public final getViewConfiguration()Landroid/view/ViewConfiguration;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AndroidConfig;->viewConfiguration:Landroid/view/ViewConfiguration;

    .line 2
    .line 3
    return-object v0
.end method
