.class public final Landroidx/compose/runtime/snapshots/SnapshotIdSet;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lid/a;


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Long;",
        ">;",
        "Lid/a;"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;

.field private static final EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;


# instance fields
.field private final belowBound:[J

.field private final lowerBound:J

.field private final lowerSet:J

.field private final upperSet:J


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->Companion:Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;

    .line 8
    .line 9
    new-instance v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 10
    .line 11
    const-wide/16 v7, 0x0

    .line 12
    .line 13
    const/4 v9, 0x0

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    const-wide/16 v5, 0x0

    .line 17
    .line 18
    invoke-direct/range {v2 .. v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 19
    .line 20
    .line 21
    sput-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 22
    .line 23
    return-void
.end method

.method private constructor <init>(JJJ[J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 5
    .line 6
    iput-wide p3, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 7
    .line 8
    iput-wide p5, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 9
    .line 10
    iput-object p7, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getEMPTY$cp()Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 2
    .line 3
    return-wide v0
.end method

.method private final fastFold(Landroidx/compose/runtime/snapshots/SnapshotIdSet;Lhd/p;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/snapshots/SnapshotIdSet;",
            "Lhd/p;",
            ")",
            "Landroidx/compose/runtime/snapshots/SnapshotIdSet;"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v2, v0

    .line 9
    move v3, v1

    .line 10
    :goto_0
    if-ge v3, v2, :cond_0

    .line 11
    .line 12
    aget-wide v4, v0, v3

    .line 13
    .line 14
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-interface {p2, p1, v4}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    add-int/lit8 v3, v3, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    const-wide/16 v4, 0x0

    .line 30
    .line 31
    cmp-long v0, v2, v4

    .line 32
    .line 33
    const-wide/16 v2, 0x1

    .line 34
    .line 35
    const/16 v6, 0x40

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    move v0, v1

    .line 40
    :goto_1
    if-ge v0, v6, :cond_2

    .line 41
    .line 42
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    shl-long v9, v2, v0

    .line 47
    .line 48
    and-long/2addr v7, v9

    .line 49
    cmp-long v7, v7, v4

    .line 50
    .line 51
    if-eqz v7, :cond_1

    .line 52
    .line 53
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 54
    .line 55
    .line 56
    move-result-wide v7

    .line 57
    int-to-long v9, v0

    .line 58
    add-long/2addr v7, v9

    .line 59
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-interface {p2, p1, v7}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 71
    .line 72
    .line 73
    move-result-wide v7

    .line 74
    cmp-long v0, v7, v4

    .line 75
    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    :goto_2
    if-ge v1, v6, :cond_4

    .line 79
    .line 80
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    shl-long v9, v2, v1

    .line 85
    .line 86
    and-long/2addr v7, v9

    .line 87
    cmp-long v0, v7, v4

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    int-to-long v9, v1

    .line 96
    add-long/2addr v7, v9

    .line 97
    int-to-long v9, v6

    .line 98
    add-long/2addr v7, v9

    .line 99
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {p2, p1, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    check-cast p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 111
    .line 112
    return-object p1
.end method


# virtual methods
.method public final and(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    :goto_0
    move-object v3, v2

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    iget-wide v3, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 23
    .line 24
    iget-wide v10, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 25
    .line 26
    cmp-long v3, v3, v10

    .line 27
    .line 28
    if-nez v3, :cond_3

    .line 29
    .line 30
    iget-object v3, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 31
    .line 32
    iget-object v12, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 33
    .line 34
    if-ne v3, v12, :cond_3

    .line 35
    .line 36
    iget-wide v6, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 37
    .line 38
    iget-wide v8, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 39
    .line 40
    and-long v13, v6, v8

    .line 41
    .line 42
    const-wide/16 v15, 0x0

    .line 43
    .line 44
    iget-wide v4, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 45
    .line 46
    move-object v3, v2

    .line 47
    iget-wide v1, v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 48
    .line 49
    and-long v17, v4, v1

    .line 50
    .line 51
    cmp-long v13, v13, v15

    .line 52
    .line 53
    if-nez v13, :cond_2

    .line 54
    .line 55
    cmp-long v13, v17, v15

    .line 56
    .line 57
    if-nez v13, :cond_2

    .line 58
    .line 59
    if-nez v12, :cond_2

    .line 60
    .line 61
    :goto_1
    return-object v3

    .line 62
    :cond_2
    move-wide v3, v4

    .line 63
    new-instance v5, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 64
    .line 65
    and-long/2addr v6, v8

    .line 66
    and-long v8, v3, v1

    .line 67
    .line 68
    invoke-direct/range {v5 .. v12}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 69
    .line 70
    .line 71
    return-object v5

    .line 72
    :cond_3
    move-object v3, v2

    .line 73
    const-wide/16 v15, 0x0

    .line 74
    .line 75
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 76
    .line 77
    const-wide/16 v4, 0x1

    .line 78
    .line 79
    const/16 v6, 0x40

    .line 80
    .line 81
    const/4 v7, 0x0

    .line 82
    if-nez v2, :cond_a

    .line 83
    .line 84
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    if-eqz v2, :cond_5

    .line 89
    .line 90
    array-length v8, v2

    .line 91
    move v9, v7

    .line 92
    :goto_2
    if-ge v9, v8, :cond_5

    .line 93
    .line 94
    aget-wide v10, v2, v9

    .line 95
    .line 96
    invoke-virtual {v1, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    .line 97
    .line 98
    .line 99
    move-result v12

    .line 100
    if-eqz v12, :cond_4

    .line 101
    .line 102
    invoke-virtual {v3, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    :cond_4
    add-int/lit8 v9, v9, 0x1

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_5
    move-object v2, v3

    .line 110
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v8

    .line 114
    cmp-long v3, v8, v15

    .line 115
    .line 116
    if-eqz v3, :cond_7

    .line 117
    .line 118
    move v3, v7

    .line 119
    :goto_3
    if-ge v3, v6, :cond_7

    .line 120
    .line 121
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 122
    .line 123
    .line 124
    move-result-wide v8

    .line 125
    shl-long v10, v4, v3

    .line 126
    .line 127
    and-long/2addr v8, v10

    .line 128
    cmp-long v8, v8, v15

    .line 129
    .line 130
    if-eqz v8, :cond_6

    .line 131
    .line 132
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 133
    .line 134
    .line 135
    move-result-wide v8

    .line 136
    int-to-long v10, v3

    .line 137
    add-long/2addr v8, v10

    .line 138
    invoke-virtual {v1, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-eqz v10, :cond_6

    .line 143
    .line 144
    invoke-virtual {v2, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_7
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 152
    .line 153
    .line 154
    move-result-wide v8

    .line 155
    cmp-long v3, v8, v15

    .line 156
    .line 157
    if-eqz v3, :cond_9

    .line 158
    .line 159
    :goto_4
    if-ge v7, v6, :cond_9

    .line 160
    .line 161
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v8

    .line 165
    shl-long v10, v4, v7

    .line 166
    .line 167
    and-long/2addr v8, v10

    .line 168
    cmp-long v3, v8, v15

    .line 169
    .line 170
    if-eqz v3, :cond_8

    .line 171
    .line 172
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 173
    .line 174
    .line 175
    move-result-wide v8

    .line 176
    int-to-long v10, v7

    .line 177
    add-long/2addr v8, v10

    .line 178
    int-to-long v10, v6

    .line 179
    add-long/2addr v8, v10

    .line 180
    invoke-virtual {v1, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    .line 181
    .line 182
    .line 183
    move-result v3

    .line 184
    if-eqz v3, :cond_8

    .line 185
    .line 186
    invoke-virtual {v2, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    :cond_8
    add-int/lit8 v7, v7, 0x1

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_9
    return-object v2

    .line 194
    :cond_a
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    if-eqz v2, :cond_c

    .line 199
    .line 200
    array-length v8, v2

    .line 201
    move v9, v7

    .line 202
    :goto_5
    if-ge v9, v8, :cond_c

    .line 203
    .line 204
    aget-wide v10, v2, v9

    .line 205
    .line 206
    invoke-virtual {v0, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    .line 207
    .line 208
    .line 209
    move-result v12

    .line 210
    if-eqz v12, :cond_b

    .line 211
    .line 212
    invoke-virtual {v3, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_c
    move-object v2, v3

    .line 220
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 221
    .line 222
    .line 223
    move-result-wide v8

    .line 224
    cmp-long v3, v8, v15

    .line 225
    .line 226
    if-eqz v3, :cond_e

    .line 227
    .line 228
    move v3, v7

    .line 229
    :goto_6
    if-ge v3, v6, :cond_e

    .line 230
    .line 231
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 232
    .line 233
    .line 234
    move-result-wide v8

    .line 235
    shl-long v10, v4, v3

    .line 236
    .line 237
    and-long/2addr v8, v10

    .line 238
    cmp-long v8, v8, v15

    .line 239
    .line 240
    if-eqz v8, :cond_d

    .line 241
    .line 242
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 243
    .line 244
    .line 245
    move-result-wide v8

    .line 246
    int-to-long v10, v3

    .line 247
    add-long/2addr v8, v10

    .line 248
    invoke-virtual {v0, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    .line 249
    .line 250
    .line 251
    move-result v10

    .line 252
    if-eqz v10, :cond_d

    .line 253
    .line 254
    invoke-virtual {v2, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    :cond_d
    add-int/lit8 v3, v3, 0x1

    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_e
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 262
    .line 263
    .line 264
    move-result-wide v8

    .line 265
    cmp-long v3, v8, v15

    .line 266
    .line 267
    if-eqz v3, :cond_10

    .line 268
    .line 269
    :goto_7
    if-ge v7, v6, :cond_10

    .line 270
    .line 271
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 272
    .line 273
    .line 274
    move-result-wide v8

    .line 275
    shl-long v10, v4, v7

    .line 276
    .line 277
    and-long/2addr v8, v10

    .line 278
    cmp-long v3, v8, v15

    .line 279
    .line 280
    if-eqz v3, :cond_f

    .line 281
    .line 282
    invoke-static {v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 283
    .line 284
    .line 285
    move-result-wide v8

    .line 286
    int-to-long v10, v7

    .line 287
    add-long/2addr v8, v10

    .line 288
    int-to-long v10, v6

    .line 289
    add-long/2addr v8, v10

    .line 290
    invoke-virtual {v0, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    if-eqz v3, :cond_f

    .line 295
    .line 296
    invoke-virtual {v2, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    :cond_f
    add-int/lit8 v7, v7, 0x1

    .line 301
    .line 302
    goto :goto_7

    .line 303
    :cond_10
    return-object v2
.end method

.method public final andNot(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 12

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_1
    iget-wide v0, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 10
    .line 11
    iget-wide v7, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 12
    .line 13
    cmp-long v0, v0, v7

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 18
    .line 19
    iget-object v9, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 20
    .line 21
    if-ne v0, v9, :cond_2

    .line 22
    .line 23
    new-instance v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 24
    .line 25
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 26
    .line 27
    iget-wide v3, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 28
    .line 29
    not-long v3, v3

    .line 30
    and-long/2addr v3, v0

    .line 31
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 32
    .line 33
    iget-wide v5, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 34
    .line 35
    not-long v5, v5

    .line 36
    and-long/2addr v5, v0

    .line 37
    invoke-direct/range {v2 .. v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_2
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const/4 v1, 0x0

    .line 46
    if-eqz v0, :cond_3

    .line 47
    .line 48
    array-length v2, v0

    .line 49
    move-object v4, p0

    .line 50
    move v3, v1

    .line 51
    :goto_0
    if-ge v3, v2, :cond_4

    .line 52
    .line 53
    aget-wide v5, v0, v3

    .line 54
    .line 55
    invoke-virtual {v4, v5, v6}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move-object v4, p0

    .line 63
    :cond_4
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    const-wide/16 v5, 0x0

    .line 68
    .line 69
    cmp-long v0, v2, v5

    .line 70
    .line 71
    const-wide/16 v2, 0x1

    .line 72
    .line 73
    const/16 v7, 0x40

    .line 74
    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    move v0, v1

    .line 78
    :goto_1
    if-ge v0, v7, :cond_6

    .line 79
    .line 80
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v8

    .line 84
    shl-long v10, v2, v0

    .line 85
    .line 86
    and-long/2addr v8, v10

    .line 87
    cmp-long v8, v8, v5

    .line 88
    .line 89
    if-eqz v8, :cond_5

    .line 90
    .line 91
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v8

    .line 95
    int-to-long v10, v0

    .line 96
    add-long/2addr v8, v10

    .line 97
    invoke-virtual {v4, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    cmp-long v0, v8, v5

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    :goto_2
    if-ge v1, v7, :cond_8

    .line 113
    .line 114
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v8

    .line 118
    shl-long v10, v2, v1

    .line 119
    .line 120
    and-long/2addr v8, v10

    .line 121
    cmp-long v0, v8, v5

    .line 122
    .line 123
    if-eqz v0, :cond_7

    .line 124
    .line 125
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    int-to-long v10, v1

    .line 130
    add-long/2addr v8, v10

    .line 131
    int-to-long v10, v7

    .line 132
    add-long/2addr v8, v10

    .line 133
    invoke-virtual {v4, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    move-object v4, v0

    .line 138
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_8
    return-object v4
.end method

.method public final clear(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 12

    .line 1
    iget-wide v5, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 2
    .line 3
    sub-long v0, p1, v5

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    const-wide/16 v7, 0x1

    .line 10
    .line 11
    const-wide/16 v9, 0x40

    .line 12
    .line 13
    if-ltz v4, :cond_0

    .line 14
    .line 15
    cmp-long v11, v0, v9

    .line 16
    .line 17
    if-gez v11, :cond_0

    .line 18
    .line 19
    long-to-int p1, v0

    .line 20
    shl-long p1, v7, p1

    .line 21
    .line 22
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 23
    .line 24
    and-long v7, v0, p1

    .line 25
    .line 26
    cmp-long v2, v7, v2

    .line 27
    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    move-wide v1, v0

    .line 31
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 32
    .line 33
    move-wide v3, v1

    .line 34
    iget-wide v1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 35
    .line 36
    not-long p1, p1

    .line 37
    and-long/2addr v3, p1

    .line 38
    iget-object v7, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 39
    .line 40
    invoke-direct/range {v0 .. v7}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    cmp-long v9, v0, v9

    .line 45
    .line 46
    if-ltz v9, :cond_1

    .line 47
    .line 48
    const-wide/16 v9, 0x80

    .line 49
    .line 50
    cmp-long v9, v0, v9

    .line 51
    .line 52
    if-gez v9, :cond_1

    .line 53
    .line 54
    long-to-int p1, v0

    .line 55
    add-int/lit8 p1, p1, -0x40

    .line 56
    .line 57
    shl-long p1, v7, p1

    .line 58
    .line 59
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 60
    .line 61
    and-long v7, v0, p1

    .line 62
    .line 63
    cmp-long v2, v7, v2

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    move-wide v1, v0

    .line 68
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 69
    .line 70
    not-long p1, p1

    .line 71
    and-long/2addr v1, p1

    .line 72
    iget-wide v3, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 73
    .line 74
    iget-object v7, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 75
    .line 76
    invoke-direct/range {v0 .. v7}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_1
    if-gez v4, :cond_2

    .line 81
    .line 82
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-static {v0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->binarySearch([JJ)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-ltz p1, :cond_2

    .line 91
    .line 92
    new-instance v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 93
    .line 94
    iget-wide v2, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 95
    .line 96
    iget-wide v4, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 97
    .line 98
    iget-wide v6, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 99
    .line 100
    invoke-static {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->withIdRemovedAt([JI)[J

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-direct/range {v1 .. v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    :cond_2
    return-object p0
.end method

.method public final fastForEach(Lhd/l;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    array-length v2, v0

    .line 9
    move v3, v1

    .line 10
    :goto_0
    if-ge v3, v2, :cond_0

    .line 11
    .line 12
    aget-wide v4, v0, v3

    .line 13
    .line 14
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-interface {p1, v4}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    cmp-long v0, v2, v4

    .line 31
    .line 32
    const-wide/16 v2, 0x1

    .line 33
    .line 34
    const/16 v6, 0x40

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    move v0, v1

    .line 39
    :goto_1
    if-ge v0, v6, :cond_2

    .line 40
    .line 41
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v7

    .line 45
    shl-long v9, v2, v0

    .line 46
    .line 47
    and-long/2addr v7, v9

    .line 48
    cmp-long v7, v7, v4

    .line 49
    .line 50
    if-eqz v7, :cond_1

    .line 51
    .line 52
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v7

    .line 56
    int-to-long v9, v0

    .line 57
    add-long/2addr v7, v9

    .line 58
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    invoke-interface {p1, v7}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 69
    .line 70
    .line 71
    move-result-wide v7

    .line 72
    cmp-long v0, v7, v4

    .line 73
    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    :goto_2
    if-ge v1, v6, :cond_4

    .line 77
    .line 78
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 79
    .line 80
    .line 81
    move-result-wide v7

    .line 82
    shl-long v9, v2, v1

    .line 83
    .line 84
    and-long/2addr v7, v9

    .line 85
    cmp-long v0, v7, v4

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 90
    .line 91
    .line 92
    move-result-wide v7

    .line 93
    int-to-long v9, v1

    .line 94
    add-long/2addr v7, v9

    .line 95
    int-to-long v9, v6

    .line 96
    add-long/2addr v7, v9

    .line 97
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {p1, v0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    return-void
.end method

.method public final get(J)Z
    .locals 12

    .line 1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 2
    .line 3
    sub-long v0, p1, v0

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    const-wide/16 v5, 0x1

    .line 10
    .line 11
    const-wide/16 v7, 0x40

    .line 12
    .line 13
    const/4 v9, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    if-ltz v4, :cond_1

    .line 16
    .line 17
    cmp-long v11, v0, v7

    .line 18
    .line 19
    if-gez v11, :cond_1

    .line 20
    .line 21
    long-to-int p1, v0

    .line 22
    shl-long p1, v5, p1

    .line 23
    .line 24
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 25
    .line 26
    and-long/2addr p1, v0

    .line 27
    cmp-long p1, p1, v2

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    return v9

    .line 32
    :cond_0
    return v10

    .line 33
    :cond_1
    cmp-long v7, v0, v7

    .line 34
    .line 35
    if-ltz v7, :cond_3

    .line 36
    .line 37
    const-wide/16 v7, 0x80

    .line 38
    .line 39
    cmp-long v7, v0, v7

    .line 40
    .line 41
    if-gez v7, :cond_3

    .line 42
    .line 43
    long-to-int p1, v0

    .line 44
    add-int/lit8 p1, p1, -0x40

    .line 45
    .line 46
    shl-long p1, v5, p1

    .line 47
    .line 48
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 49
    .line 50
    and-long/2addr p1, v0

    .line 51
    cmp-long p1, p1, v2

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    return v9

    .line 56
    :cond_2
    return v10

    .line 57
    :cond_3
    if-lez v4, :cond_4

    .line 58
    .line 59
    return v10

    .line 60
    :cond_4
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 61
    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    invoke-static {v0, p1, p2}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->binarySearch([JJ)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-ltz p1, :cond_5

    .line 69
    .line 70
    return v9

    .line 71
    :cond_5
    return v10
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet$iterator$1;-><init>(Landroidx/compose/runtime/snapshots/SnapshotIdSet;Lvc/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lpd/j;->b(Lhd/p;)Lpd/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Lpd/g;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final lowest(J)J
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    aget-wide p1, v0, p1

    .line 7
    .line 8
    return-wide p1

    .line 9
    :cond_0
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v4, v0, v2

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    iget-wide p1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 18
    .line 19
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v0, v0

    .line 24
    add-long/2addr p1, v0

    .line 25
    return-wide p1

    .line 26
    :cond_1
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 27
    .line 28
    cmp-long v2, v0, v2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    iget-wide p1, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 33
    .line 34
    const/16 v2, 0x40

    .line 35
    .line 36
    int-to-long v2, v2

    .line 37
    add-long/2addr p1, v2

    .line 38
    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    int-to-long v0, v0

    .line 43
    add-long/2addr p1, v0

    .line 44
    :cond_2
    return-wide p1
.end method

.method public final or(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 12

    .line 1
    sget-object v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->EMPTY:Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_1
    iget-wide v0, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 10
    .line 11
    iget-wide v7, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 12
    .line 13
    cmp-long v0, v0, v7

    .line 14
    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 18
    .line 19
    iget-object v9, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 20
    .line 21
    if-ne v0, v9, :cond_2

    .line 22
    .line 23
    new-instance v2, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 24
    .line 25
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 26
    .line 27
    iget-wide v3, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 28
    .line 29
    or-long/2addr v3, v0

    .line 30
    iget-wide v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 31
    .line 32
    iget-wide v5, p1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 33
    .line 34
    or-long/2addr v5, v0

    .line 35
    invoke-direct/range {v2 .. v9}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 36
    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_2
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 40
    .line 41
    const-wide/16 v1, 0x1

    .line 42
    .line 43
    const/16 v3, 0x40

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    const-wide/16 v5, 0x0

    .line 47
    .line 48
    if-nez v0, :cond_8

    .line 49
    .line 50
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    array-length v7, v0

    .line 57
    move v8, v4

    .line 58
    :goto_0
    if-ge v8, v7, :cond_3

    .line 59
    .line 60
    aget-wide v9, v0, v8

    .line 61
    .line 62
    invoke-virtual {p1, v9, v10}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    add-int/lit8 v8, v8, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 70
    .line 71
    .line 72
    move-result-wide v7

    .line 73
    cmp-long v0, v7, v5

    .line 74
    .line 75
    if-eqz v0, :cond_5

    .line 76
    .line 77
    move v0, v4

    .line 78
    :goto_1
    if-ge v0, v3, :cond_5

    .line 79
    .line 80
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    shl-long v9, v1, v0

    .line 85
    .line 86
    and-long/2addr v7, v9

    .line 87
    cmp-long v7, v7, v5

    .line 88
    .line 89
    if-eqz v7, :cond_4

    .line 90
    .line 91
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v7

    .line 95
    int-to-long v9, v0

    .line 96
    add-long/2addr v7, v9

    .line 97
    invoke-virtual {p1, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 105
    .line 106
    .line 107
    move-result-wide v7

    .line 108
    cmp-long v0, v7, v5

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    :goto_2
    if-ge v4, v3, :cond_7

    .line 113
    .line 114
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 115
    .line 116
    .line 117
    move-result-wide v7

    .line 118
    shl-long v9, v1, v4

    .line 119
    .line 120
    and-long/2addr v7, v9

    .line 121
    cmp-long v0, v7, v5

    .line 122
    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-static {p0}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 126
    .line 127
    .line 128
    move-result-wide v7

    .line 129
    int-to-long v9, v4

    .line 130
    add-long/2addr v7, v9

    .line 131
    int-to-long v9, v3

    .line 132
    add-long/2addr v7, v9

    .line 133
    invoke-virtual {p1, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_7
    return-object p1

    .line 141
    :cond_8
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getBelowBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)[J

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-eqz v0, :cond_9

    .line 146
    .line 147
    array-length v7, v0

    .line 148
    move-object v9, p0

    .line 149
    move v8, v4

    .line 150
    :goto_3
    if-ge v8, v7, :cond_a

    .line 151
    .line 152
    aget-wide v10, v0, v8

    .line 153
    .line 154
    invoke-virtual {v9, v10, v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    add-int/lit8 v8, v8, 0x1

    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_9
    move-object v9, p0

    .line 162
    :cond_a
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 163
    .line 164
    .line 165
    move-result-wide v7

    .line 166
    cmp-long v0, v7, v5

    .line 167
    .line 168
    if-eqz v0, :cond_c

    .line 169
    .line 170
    move v0, v4

    .line 171
    :goto_4
    if-ge v0, v3, :cond_c

    .line 172
    .line 173
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 174
    .line 175
    .line 176
    move-result-wide v7

    .line 177
    shl-long v10, v1, v0

    .line 178
    .line 179
    and-long/2addr v7, v10

    .line 180
    cmp-long v7, v7, v5

    .line 181
    .line 182
    if-eqz v7, :cond_b

    .line 183
    .line 184
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 185
    .line 186
    .line 187
    move-result-wide v7

    .line 188
    int-to-long v10, v0

    .line 189
    add-long/2addr v7, v10

    .line 190
    invoke-virtual {v9, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    move-object v9, v7

    .line 195
    :cond_b
    add-int/lit8 v0, v0, 0x1

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_c
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    cmp-long v0, v7, v5

    .line 203
    .line 204
    if-eqz v0, :cond_e

    .line 205
    .line 206
    :goto_5
    if-ge v4, v3, :cond_e

    .line 207
    .line 208
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getUpperSet$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 209
    .line 210
    .line 211
    move-result-wide v7

    .line 212
    shl-long v10, v1, v4

    .line 213
    .line 214
    and-long/2addr v7, v10

    .line 215
    cmp-long v0, v7, v5

    .line 216
    .line 217
    if-eqz v0, :cond_d

    .line 218
    .line 219
    invoke-static {p1}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->access$getLowerBound$p(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)J

    .line 220
    .line 221
    .line 222
    move-result-wide v7

    .line 223
    int-to-long v10, v4

    .line 224
    add-long/2addr v7, v10

    .line 225
    int-to-long v10, v3

    .line 226
    add-long/2addr v7, v10

    .line 227
    invoke-virtual {v9, v7, v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    move-object v9, v0

    .line 232
    :cond_d
    add-int/lit8 v4, v4, 0x1

    .line 233
    .line 234
    goto :goto_5

    .line 235
    :cond_e
    return-object v9
.end method

.method public final set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    iget-wide v6, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 6
    .line 7
    sub-long v3, v1, v6

    .line 8
    .line 9
    const-wide/16 v8, 0x0

    .line 10
    .line 11
    cmp-long v5, v3, v8

    .line 12
    .line 13
    const-wide/16 v10, 0x40

    .line 14
    .line 15
    const-wide/16 v12, 0x1

    .line 16
    .line 17
    if-ltz v5, :cond_0

    .line 18
    .line 19
    cmp-long v5, v3, v10

    .line 20
    .line 21
    if-gez v5, :cond_0

    .line 22
    .line 23
    long-to-int v1, v3

    .line 24
    shl-long v1, v12, v1

    .line 25
    .line 26
    iget-wide v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 27
    .line 28
    and-long v10, v3, v1

    .line 29
    .line 30
    cmp-long v5, v10, v8

    .line 31
    .line 32
    if-nez v5, :cond_c

    .line 33
    .line 34
    move-wide v8, v1

    .line 35
    new-instance v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 36
    .line 37
    move-wide v4, v3

    .line 38
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 39
    .line 40
    or-long/2addr v4, v8

    .line 41
    iget-object v8, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 42
    .line 43
    invoke-direct/range {v1 .. v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_0
    cmp-long v5, v3, v10

    .line 48
    .line 49
    const-wide/16 v10, 0x80

    .line 50
    .line 51
    const/16 v14, 0x40

    .line 52
    .line 53
    if-ltz v5, :cond_1

    .line 54
    .line 55
    cmp-long v5, v3, v10

    .line 56
    .line 57
    if-gez v5, :cond_1

    .line 58
    .line 59
    long-to-int v1, v3

    .line 60
    sub-int/2addr v1, v14

    .line 61
    shl-long v1, v12, v1

    .line 62
    .line 63
    iget-wide v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 64
    .line 65
    and-long v10, v3, v1

    .line 66
    .line 67
    cmp-long v5, v10, v8

    .line 68
    .line 69
    if-nez v5, :cond_c

    .line 70
    .line 71
    move-wide v8, v1

    .line 72
    new-instance v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 73
    .line 74
    or-long v2, v3, v8

    .line 75
    .line 76
    iget-wide v4, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 77
    .line 78
    iget-object v8, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 79
    .line 80
    invoke-direct/range {v1 .. v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 81
    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_1
    cmp-long v3, v3, v10

    .line 85
    .line 86
    if-ltz v3, :cond_a

    .line 87
    .line 88
    invoke-virtual/range {p0 .. p2}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->get(J)Z

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-nez v3, :cond_c

    .line 93
    .line 94
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 95
    .line 96
    iget-wide v10, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 97
    .line 98
    move-wide v15, v5

    .line 99
    const/4 v3, 0x0

    .line 100
    iget-wide v4, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 101
    .line 102
    add-long v6, v1, v12

    .line 103
    .line 104
    move/from16 v17, v3

    .line 105
    .line 106
    move-wide/from16 v18, v4

    .line 107
    .line 108
    int-to-long v3, v14

    .line 109
    div-long/2addr v6, v3

    .line 110
    mul-long/2addr v6, v3

    .line 111
    cmp-long v5, v6, v8

    .line 112
    .line 113
    if-gez v5, :cond_2

    .line 114
    .line 115
    const-wide v6, 0x7fffffffffffff80L

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    :cond_2
    const/4 v5, 0x0

    .line 121
    move-wide/from16 v21, v15

    .line 122
    .line 123
    :goto_0
    cmp-long v15, v18, v6

    .line 124
    .line 125
    if-gez v15, :cond_7

    .line 126
    .line 127
    cmp-long v15, v10, v8

    .line 128
    .line 129
    if-eqz v15, :cond_5

    .line 130
    .line 131
    if-nez v5, :cond_3

    .line 132
    .line 133
    new-instance v5, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;

    .line 134
    .line 135
    iget-object v15, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 136
    .line 137
    invoke-direct {v5, v15}, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;-><init>([J)V

    .line 138
    .line 139
    .line 140
    :cond_3
    move/from16 v15, v17

    .line 141
    .line 142
    :goto_1
    if-ge v15, v14, :cond_5

    .line 143
    .line 144
    shl-long v23, v12, v15

    .line 145
    .line 146
    and-long v23, v10, v23

    .line 147
    .line 148
    cmp-long v16, v23, v8

    .line 149
    .line 150
    move-wide/from16 v23, v8

    .line 151
    .line 152
    if-eqz v16, :cond_4

    .line 153
    .line 154
    int-to-long v8, v15

    .line 155
    add-long v8, v18, v8

    .line 156
    .line 157
    invoke-virtual {v5, v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;->add(J)V

    .line 158
    .line 159
    .line 160
    :cond_4
    add-int/lit8 v15, v15, 0x1

    .line 161
    .line 162
    move-wide/from16 v8, v23

    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_5
    move-wide/from16 v23, v8

    .line 166
    .line 167
    cmp-long v8, v21, v23

    .line 168
    .line 169
    if-nez v8, :cond_6

    .line 170
    .line 171
    move-wide/from16 v25, v6

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_6
    add-long v18, v18, v3

    .line 175
    .line 176
    move-wide/from16 v10, v21

    .line 177
    .line 178
    move-wide/from16 v8, v23

    .line 179
    .line 180
    move-wide/from16 v21, v8

    .line 181
    .line 182
    goto :goto_0

    .line 183
    :cond_7
    move-wide/from16 v23, v10

    .line 184
    .line 185
    move-wide/from16 v25, v18

    .line 186
    .line 187
    :goto_2
    new-instance v20, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 188
    .line 189
    if-eqz v5, :cond_9

    .line 190
    .line 191
    invoke-virtual {v5}, Landroidx/compose/runtime/snapshots/SnapshotIdArrayBuilder;->toArray()[J

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    if-nez v3, :cond_8

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :cond_8
    :goto_3
    move-object/from16 v27, v3

    .line 199
    .line 200
    goto :goto_5

    .line 201
    :cond_9
    :goto_4
    iget-object v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :goto_5
    invoke-direct/range {v20 .. v27}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 205
    .line 206
    .line 207
    move-object/from16 v3, v20

    .line 208
    .line 209
    invoke-virtual {v3, v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->set(J)Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    return-object v1

    .line 214
    :cond_a
    const/16 v17, 0x0

    .line 215
    .line 216
    iget-object v3, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->belowBound:[J

    .line 217
    .line 218
    const/4 v4, 0x1

    .line 219
    if-nez v3, :cond_b

    .line 220
    .line 221
    new-instance v1, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 222
    .line 223
    iget-wide v2, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 224
    .line 225
    iget-wide v10, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 226
    .line 227
    move-wide/from16 v12, p1

    .line 228
    .line 229
    new-array v8, v4, [J

    .line 230
    .line 231
    aput-wide v12, v8, v17

    .line 232
    .line 233
    move-wide v4, v10

    .line 234
    invoke-direct/range {v1 .. v8}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 235
    .line 236
    .line 237
    return-object v1

    .line 238
    :cond_b
    move-wide v12, v1

    .line 239
    invoke-static {v3, v12, v13}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->binarySearch([JJ)I

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-gez v1, :cond_c

    .line 244
    .line 245
    add-int/2addr v1, v4

    .line 246
    neg-int v1, v1

    .line 247
    invoke-static {v3, v1, v12, v13}, Landroidx/compose/runtime/snapshots/SnapshotId_jvmKt;->withIdInsertedAt([JIJ)[J

    .line 248
    .line 249
    .line 250
    move-result-object v11

    .line 251
    new-instance v4, Landroidx/compose/runtime/snapshots/SnapshotIdSet;

    .line 252
    .line 253
    iget-wide v5, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->upperSet:J

    .line 254
    .line 255
    iget-wide v7, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerSet:J

    .line 256
    .line 257
    iget-wide v9, v0, Landroidx/compose/runtime/snapshots/SnapshotIdSet;->lowerBound:J

    .line 258
    .line 259
    invoke-direct/range {v4 .. v11}, Landroidx/compose/runtime/snapshots/SnapshotIdSet;-><init>(JJJ[J)V

    .line 260
    .line 261
    .line 262
    return-object v4

    .line 263
    :cond_c
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " ["

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v1, 0xa

    .line 21
    .line 22
    invoke-static {p0, v1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/16 v9, 0x3f

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    const/4 v8, 0x0

    .line 66
    invoke-static/range {v2 .. v10}, Landroidx/compose/runtime/snapshots/ListUtilsKt;->fastJoinToString$default(Ljava/util/List;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v1, 0x5d

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method
