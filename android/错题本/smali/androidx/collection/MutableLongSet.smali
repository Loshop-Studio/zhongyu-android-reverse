.class public final Landroidx/collection/MutableLongSet;
.super Landroidx/collection/LongSet;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0016\n\u0002\u0008\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0086\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001fJ\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0001H\u0086\u0002\u00a2\u0006\u0004\u0008\u0018\u0010 J\u0015\u0010!\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008!\u0010\u0017J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0086\u0002\u00a2\u0006\u0004\u0008\"\u0010\u0019J\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008#\u0010\u001dJ\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0086\u0002\u00a2\u0006\u0004\u0008\"\u0010\u001eJ\u0015\u0010#\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0001\u00a2\u0006\u0004\u0008#\u0010\u001fJ\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0001H\u0086\u0002\u00a2\u0006\u0004\u0008\"\u0010 J\r\u0010$\u001a\u00020\u0006\u00a2\u0006\u0004\u0008$\u0010\u000bJ\u000f\u0010%\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010(\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\'\u0010\u000bJ\u000f\u0010*\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008)\u0010\u000bJ\u0017\u0010-\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008,\u0010\u0005R\u0016\u0010.\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/\u00a8\u00060"
    }
    d2 = {
        "Landroidx/collection/MutableLongSet;",
        "Landroidx/collection/LongSet;",
        "",
        "initialCapacity",
        "<init>",
        "(I)V",
        "Ld6/s;",
        "initializeStorage",
        "capacity",
        "initializeMetadata",
        "initializeGrowth",
        "()V",
        "index",
        "removeElementAt",
        "",
        "element",
        "findAbsoluteInsertIndex",
        "(J)I",
        "hash1",
        "findFirstAvailableSlot",
        "(I)I",
        "",
        "add",
        "(J)Z",
        "plusAssign",
        "(J)V",
        "",
        "elements",
        "addAll",
        "([J)Z",
        "([J)V",
        "(Landroidx/collection/LongSet;)Z",
        "(Landroidx/collection/LongSet;)V",
        "remove",
        "minusAssign",
        "removeAll",
        "clear",
        "trim",
        "()I",
        "adjustStorage$collection",
        "adjustStorage",
        "dropDeletes$collection",
        "dropDeletes",
        "newCapacity",
        "resizeStorage$collection",
        "resizeStorage",
        "growthLimit",
        "I",
        "collection"
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
        "SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 LongSet.kt\nandroidx/collection/LongSet\n+ 7 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,885:1\n59#2,5:886\n1#3:891\n1254#4,6:892\n1399#4:911\n1270#4:915\n1179#4:931\n1175#4:934\n1372#4,3:938\n1386#4,3:942\n1312#4:946\n1303#4:948\n1297#4:949\n1309#4:954\n1393#4:956\n1179#4:970\n1175#4:973\n1372#4,3:977\n1386#4,3:981\n1312#4:985\n1303#4:987\n1297#4:988\n1309#4:993\n1393#4:995\n1399#4:1017\n1270#4:1021\n1230#4:1032\n1254#4,6:1033\n1242#4:1039\n1241#4,4:1040\n1254#4,6:1044\n1175#4:1053\n1179#4:1054\n1372#4,3:1055\n1386#4,3:1058\n1312#4:1061\n1303#4:1062\n1297#4:1063\n1309#4:1064\n1393#4:1065\n1265#4:1066\n1220#4:1067\n1262#4:1068\n1220#4:1069\n1230#4:1070\n1254#4,6:1071\n1242#4:1077\n1241#4,4:1078\n1372#4,3:1082\n1399#4:1085\n1297#4:1086\n1144#4,14:1087\n1220#4:1101\n1175#4:1105\n1179#4:1106\n1254#4,6:1107\n1220#4:1113\n1179#4:1114\n1254#4,6:1115\n1254#4,6:1121\n1179#4:1127\n1254#4,6:1128\n1268#4:1134\n1220#4:1135\n1175#4:1139\n1179#4:1140\n1230#4:1141\n1254#4,6:1142\n1242#4:1148\n1241#4,4:1149\n13337#5,2:898\n13337#5,2:1004\n256#6,4:900\n226#6,7:904\n237#6,3:912\n240#6,9:916\n260#6:925\n426#6:926\n427#6:930\n429#6,2:932\n431#6,3:935\n434#6:941\n435#6:945\n436#6:947\n437#6,4:950\n443#6:955\n444#6,8:957\n426#6:965\n427#6:969\n429#6,2:971\n431#6,3:974\n434#6:980\n435#6:984\n436#6:986\n437#6,4:989\n443#6:994\n444#6,8:996\n256#6,4:1006\n226#6,7:1010\n237#6,3:1018\n240#6,9:1022\n260#6:1031\n881#7,3:927\n881#7,3:966\n881#7,3:1050\n881#7,3:1102\n881#7,3:1136\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n*L\n478#1:886,5\n505#1:892,6\n578#1:911\n578#1:915\n589#1:931\n589#1:934\n589#1:938,3\n589#1:942,3\n589#1:946\n589#1:948\n589#1:949\n589#1:954\n589#1:956\n603#1:970\n603#1:973\n603#1:977,3\n603#1:981,3\n603#1:985\n603#1:987\n603#1:988\n603#1:993\n603#1:995\n648#1:1017\n648#1:1021\n656#1:1032\n656#1:1033,6\n656#1:1039\n656#1:1040,4\n664#1:1044,6\n677#1:1053\n678#1:1054\n685#1:1055,3\n686#1:1058,3\n687#1:1061\n688#1:1062\n688#1:1063\n692#1:1064\n695#1:1065\n704#1:1066\n704#1:1067\n710#1:1068\n710#1:1069\n711#1:1070\n711#1:1071,6\n711#1:1077\n711#1:1078,4\n725#1:1082,3\n726#1:1085\n728#1:1086\n774#1:1087,14\n780#1:1101\n795#1:1105\n806#1:1106\n807#1:1107,6\n817#1:1113\n820#1:1114\n821#1:1115,6\n822#1:1121,6\n829#1:1127\n830#1:1128,6\n863#1:1134\n863#1:1135\n866#1:1139\n868#1:1140\n868#1:1141\n868#1:1142,6\n868#1:1148\n868#1:1149,4\n556#1:898,2\n627#1:1004,2\n578#1:900,4\n578#1:904,7\n578#1:912,3\n578#1:916,9\n578#1:925\n589#1:926\n589#1:930\n589#1:932,2\n589#1:935,3\n589#1:941\n589#1:945\n589#1:947\n589#1:950,4\n589#1:955\n589#1:957,8\n603#1:965\n603#1:969\n603#1:971,2\n603#1:974,3\n603#1:980\n603#1:984\n603#1:986\n603#1:989,4\n603#1:994\n603#1:996,8\n648#1:1006,4\n648#1:1010,7\n648#1:1018,3\n648#1:1022,9\n648#1:1031\n589#1:927,3\n603#1:966,3\n676#1:1050,3\n794#1:1102,3\n865#1:1136,3\n*E\n"
    }
.end annotation


# instance fields
.field private growthLimit:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Landroidx/collection/MutableLongSet;-><init>(IILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/collection/LongSet;-><init>(Lkotlin/jvm/internal/e;)V

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 3
    const-string v0, "Capacity must be a positive value."

    .line 4
    invoke-static {v0}, Landroidx/collection/internal/RuntimeHelpersKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 5
    :cond_1
    invoke-static {p1}, Landroidx/collection/ScatterMapKt;->unloadedCapacity(I)I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/collection/MutableLongSet;->initializeStorage(I)V

    return-void
.end method

.method public synthetic constructor <init>(IILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x6

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Landroidx/collection/MutableLongSet;-><init>(I)V

    return-void
.end method

.method private final findAbsoluteInsertIndex(J)I
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, -0x3361d2af    # -8.293031E7f

    .line 8
    .line 9
    .line 10
    mul-int/2addr v1, v2

    .line 11
    shl-int/lit8 v2, v1, 0x10

    .line 12
    .line 13
    xor-int/2addr v1, v2

    .line 14
    ushr-int/lit8 v2, v1, 0x7

    .line 15
    .line 16
    and-int/lit8 v1, v1, 0x7f

    .line 17
    .line 18
    iget v3, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 19
    .line 20
    and-int v4, v2, v3

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    :goto_0
    iget-object v7, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 24
    .line 25
    shr-int/lit8 v8, v4, 0x3

    .line 26
    .line 27
    and-int/lit8 v9, v4, 0x7

    .line 28
    .line 29
    shl-int/lit8 v9, v9, 0x3

    .line 30
    .line 31
    aget-wide v10, v7, v8

    .line 32
    .line 33
    ushr-long/2addr v10, v9

    .line 34
    const/4 v12, 0x1

    .line 35
    add-int/2addr v8, v12

    .line 36
    aget-wide v13, v7, v8

    .line 37
    .line 38
    rsub-int/lit8 v7, v9, 0x40

    .line 39
    .line 40
    shl-long v7, v13, v7

    .line 41
    .line 42
    int-to-long v13, v9

    .line 43
    neg-long v13, v13

    .line 44
    const/16 v9, 0x3f

    .line 45
    .line 46
    shr-long/2addr v13, v9

    .line 47
    and-long/2addr v7, v13

    .line 48
    or-long/2addr v7, v10

    .line 49
    int-to-long v9, v1

    .line 50
    const-wide v13, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long v15, v9, v13

    .line 56
    .line 57
    move/from16 v17, v6

    .line 58
    .line 59
    xor-long v5, v7, v15

    .line 60
    .line 61
    sub-long v13, v5, v13

    .line 62
    .line 63
    not-long v5, v5

    .line 64
    and-long/2addr v5, v13

    .line 65
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v5, v13

    .line 71
    :goto_1
    const-wide/16 v15, 0x0

    .line 72
    .line 73
    cmp-long v18, v5, v15

    .line 74
    .line 75
    if-eqz v18, :cond_1

    .line 76
    .line 77
    invoke-static {v5, v6}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 78
    .line 79
    .line 80
    move-result v15

    .line 81
    shr-int/lit8 v15, v15, 0x3

    .line 82
    .line 83
    add-int/2addr v15, v4

    .line 84
    and-int/2addr v15, v3

    .line 85
    iget-object v11, v0, Landroidx/collection/LongSet;->elements:[J

    .line 86
    .line 87
    aget-wide v19, v11, v15

    .line 88
    .line 89
    cmp-long v11, v19, p1

    .line 90
    .line 91
    if-nez v11, :cond_0

    .line 92
    .line 93
    return v15

    .line 94
    :cond_0
    const-wide/16 v15, 0x1

    .line 95
    .line 96
    sub-long v15, v5, v15

    .line 97
    .line 98
    and-long/2addr v5, v15

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    not-long v5, v7

    .line 101
    const/4 v11, 0x6

    .line 102
    shl-long/2addr v5, v11

    .line 103
    and-long/2addr v5, v7

    .line 104
    and-long/2addr v5, v13

    .line 105
    cmp-long v5, v5, v15

    .line 106
    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    invoke-direct {v0, v2}, Landroidx/collection/MutableLongSet;->findFirstAvailableSlot(I)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    iget v3, v0, Landroidx/collection/MutableLongSet;->growthLimit:I

    .line 114
    .line 115
    const-wide/16 v4, 0xff

    .line 116
    .line 117
    if-nez v3, :cond_3

    .line 118
    .line 119
    iget-object v3, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 120
    .line 121
    shr-int/lit8 v6, v1, 0x3

    .line 122
    .line 123
    aget-wide v6, v3, v6

    .line 124
    .line 125
    and-int/lit8 v3, v1, 0x7

    .line 126
    .line 127
    shl-int/lit8 v3, v3, 0x3

    .line 128
    .line 129
    shr-long/2addr v6, v3

    .line 130
    and-long/2addr v6, v4

    .line 131
    const-wide/16 v13, 0xfe

    .line 132
    .line 133
    cmp-long v3, v6, v13

    .line 134
    .line 135
    if-nez v3, :cond_2

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    invoke-virtual {v0}, Landroidx/collection/MutableLongSet;->adjustStorage$collection()V

    .line 139
    .line 140
    .line 141
    invoke-direct {v0, v2}, Landroidx/collection/MutableLongSet;->findFirstAvailableSlot(I)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    :cond_3
    :goto_2
    iget v2, v0, Landroidx/collection/LongSet;->_size:I

    .line 146
    .line 147
    add-int/2addr v2, v12

    .line 148
    iput v2, v0, Landroidx/collection/LongSet;->_size:I

    .line 149
    .line 150
    iget v2, v0, Landroidx/collection/MutableLongSet;->growthLimit:I

    .line 151
    .line 152
    iget-object v3, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 153
    .line 154
    shr-int/lit8 v6, v1, 0x3

    .line 155
    .line 156
    aget-wide v7, v3, v6

    .line 157
    .line 158
    and-int/lit8 v11, v1, 0x7

    .line 159
    .line 160
    shl-int/lit8 v11, v11, 0x3

    .line 161
    .line 162
    shr-long v13, v7, v11

    .line 163
    .line 164
    and-long/2addr v13, v4

    .line 165
    const-wide/16 v15, 0x80

    .line 166
    .line 167
    cmp-long v13, v13, v15

    .line 168
    .line 169
    if-nez v13, :cond_4

    .line 170
    .line 171
    move/from16 v18, v12

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_4
    const/16 v18, 0x0

    .line 175
    .line 176
    :goto_3
    sub-int v2, v2, v18

    .line 177
    .line 178
    iput v2, v0, Landroidx/collection/MutableLongSet;->growthLimit:I

    .line 179
    .line 180
    iget v2, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 181
    .line 182
    shl-long/2addr v4, v11

    .line 183
    not-long v4, v4

    .line 184
    and-long/2addr v4, v7

    .line 185
    shl-long v7, v9, v11

    .line 186
    .line 187
    or-long/2addr v4, v7

    .line 188
    aput-wide v4, v3, v6

    .line 189
    .line 190
    add-int/lit8 v6, v1, -0x7

    .line 191
    .line 192
    and-int/2addr v6, v2

    .line 193
    and-int/lit8 v2, v2, 0x7

    .line 194
    .line 195
    add-int/2addr v6, v2

    .line 196
    shr-int/lit8 v2, v6, 0x3

    .line 197
    .line 198
    aput-wide v4, v3, v2

    .line 199
    .line 200
    return v1

    .line 201
    :cond_5
    add-int/lit8 v6, v17, 0x8

    .line 202
    .line 203
    add-int/2addr v4, v6

    .line 204
    and-int/2addr v4, v3

    .line 205
    goto/16 :goto_0
.end method

.method private final findFirstAvailableSlot(I)I
    .locals 9

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    shr-int/lit8 v1, v1, 0x3

    .line 52
    .line 53
    add-int/2addr p1, v1

    .line 54
    and-int/2addr p1, v0

    .line 55
    return p1

    .line 56
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 57
    .line 58
    add-int/2addr p1, v1

    .line 59
    and-int/2addr p1, v0

    .line 60
    goto :goto_0
.end method

.method private final initializeGrowth()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/collection/LongSet;->getCapacity()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Landroidx/collection/ScatterMapKt;->loadedCapacity(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Landroidx/collection/LongSet;->_size:I

    .line 10
    .line 11
    sub-int/2addr v0, v1

    .line 12
    iput v0, p0, Landroidx/collection/MutableLongSet;->growthLimit:I

    .line 13
    .line 14
    return-void
.end method

.method private final initializeMetadata(I)V
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object v0, Landroidx/collection/ScatterMapKt;->EmptyGroup:[J

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    add-int/lit8 v0, p1, 0xf

    .line 7
    .line 8
    and-int/lit8 v0, v0, -0x8

    .line 9
    .line 10
    shr-int/lit8 v0, v0, 0x3

    .line 11
    .line 12
    new-array v0, v0, [J

    .line 13
    .line 14
    const-wide v1, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, v2}, Lkotlin/collections/q;->O([JJ)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iput-object v0, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 23
    .line 24
    shr-int/lit8 v1, p1, 0x3

    .line 25
    .line 26
    and-int/lit8 p1, p1, 0x7

    .line 27
    .line 28
    shl-int/lit8 p1, p1, 0x3

    .line 29
    .line 30
    aget-wide v2, v0, v1

    .line 31
    .line 32
    const-wide/16 v4, 0xff

    .line 33
    .line 34
    shl-long/2addr v4, p1

    .line 35
    not-long v6, v4

    .line 36
    and-long/2addr v2, v6

    .line 37
    or-long/2addr v2, v4

    .line 38
    aput-wide v2, v0, v1

    .line 39
    .line 40
    invoke-direct {p0}, Landroidx/collection/MutableLongSet;->initializeGrowth()V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method private final initializeStorage(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    invoke-static {p1}, Landroidx/collection/ScatterMapKt;->normalizeCapacity(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    :goto_0
    iput p1, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 15
    .line 16
    invoke-direct {p0, p1}, Landroidx/collection/MutableLongSet;->initializeMetadata(I)V

    .line 17
    .line 18
    .line 19
    new-array p1, p1, [J

    .line 20
    .line 21
    iput-object p1, p0, Landroidx/collection/LongSet;->elements:[J

    .line 22
    .line 23
    return-void
.end method

.method private final removeElementAt(I)V
    .locals 8

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 8
    .line 9
    iget v1, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 10
    .line 11
    shr-int/lit8 v2, p1, 0x3

    .line 12
    .line 13
    and-int/lit8 v3, p1, 0x7

    .line 14
    .line 15
    shl-int/lit8 v3, v3, 0x3

    .line 16
    .line 17
    aget-wide v4, v0, v2

    .line 18
    .line 19
    const-wide/16 v6, 0xff

    .line 20
    .line 21
    shl-long/2addr v6, v3

    .line 22
    not-long v6, v6

    .line 23
    and-long/2addr v4, v6

    .line 24
    const-wide/16 v6, 0xfe

    .line 25
    .line 26
    shl-long/2addr v6, v3

    .line 27
    or-long v3, v4, v6

    .line 28
    .line 29
    aput-wide v3, v0, v2

    .line 30
    .line 31
    add-int/lit8 p1, p1, -0x7

    .line 32
    .line 33
    and-int/2addr p1, v1

    .line 34
    and-int/lit8 v1, v1, 0x7

    .line 35
    .line 36
    add-int/2addr p1, v1

    .line 37
    shr-int/lit8 p1, p1, 0x3

    .line 38
    .line 39
    aput-wide v3, v0, p1

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final add(J)Z
    .locals 3

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/collection/MutableLongSet;->findAbsoluteInsertIndex(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, Landroidx/collection/LongSet;->elements:[J

    .line 8
    .line 9
    aput-wide p1, v2, v1

    .line 10
    .line 11
    iget p1, p0, Landroidx/collection/LongSet;->_size:I

    .line 12
    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final addAll(Landroidx/collection/LongSet;)Z
    .locals 1
    .param p1    # Landroidx/collection/LongSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 5
    invoke-virtual {p0, p1}, Landroidx/collection/MutableLongSet;->plusAssign(Landroidx/collection/LongSet;)V

    .line 6
    iget p1, p0, Landroidx/collection/LongSet;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final addAll([J)Z
    .locals 1
    .param p1    # [J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 2
    invoke-virtual {p0, p1}, Landroidx/collection/MutableLongSet;->plusAssign([J)V

    .line 3
    iget p1, p0, Landroidx/collection/LongSet;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final adjustStorage$collection()V
    .locals 7

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    if-le v0, v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Landroidx/collection/LongSet;->_size:I

    .line 8
    .line 9
    int-to-long v1, v1

    .line 10
    const-wide/16 v3, 0x20

    .line 11
    .line 12
    mul-long/2addr v1, v3

    .line 13
    int-to-long v3, v0

    .line 14
    const-wide/16 v5, 0x19

    .line 15
    .line 16
    mul-long/2addr v3, v5

    .line 17
    const-wide/high16 v5, -0x8000000000000000L

    .line 18
    .line 19
    xor-long v0, v1, v5

    .line 20
    .line 21
    xor-long v2, v3, v5

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Long;->compare(JJ)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-gtz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/collection/MutableLongSet;->dropDeletes$collection()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget v0, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 34
    .line 35
    invoke-static {v0}, Landroidx/collection/ScatterMapKt;->nextCapacity(I)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p0, v0}, Landroidx/collection/MutableLongSet;->resizeStorage$collection(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final clear()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 5
    .line 6
    sget-object v1, Landroidx/collection/ScatterMapKt;->EmptyGroup:[J

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2}, Lkotlin/collections/q;->O([JJ)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/collection/LongSet;->metadata:[J

    .line 19
    .line 20
    iget v1, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 21
    .line 22
    shr-int/lit8 v2, v1, 0x3

    .line 23
    .line 24
    and-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    shl-int/lit8 v1, v1, 0x3

    .line 27
    .line 28
    aget-wide v3, v0, v2

    .line 29
    .line 30
    const-wide/16 v5, 0xff

    .line 31
    .line 32
    shl-long/2addr v5, v1

    .line 33
    not-long v7, v5

    .line 34
    and-long/2addr v3, v7

    .line 35
    or-long/2addr v3, v5

    .line 36
    aput-wide v3, v0, v2

    .line 37
    .line 38
    :cond_0
    invoke-direct {p0}, Landroidx/collection/MutableLongSet;->initializeGrowth()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final dropDeletes$collection()V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 4
    .line 5
    iget v2, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/collection/LongSet;->elements:[J

    .line 8
    .line 9
    add-int/lit8 v4, v2, 0x7

    .line 10
    .line 11
    shr-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    move v6, v5

    .line 15
    :goto_0
    if-ge v6, v4, :cond_0

    .line 16
    .line 17
    aget-wide v7, v1, v6

    .line 18
    .line 19
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v7, v9

    .line 25
    not-long v9, v7

    .line 26
    const/4 v11, 0x7

    .line 27
    ushr-long/2addr v7, v11

    .line 28
    add-long/2addr v9, v7

    .line 29
    const-wide v7, -0x101010101010102L

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v7, v9

    .line 35
    aput-wide v7, v1, v6

    .line 36
    .line 37
    add-int/lit8 v6, v6, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-static {v1}, Lkotlin/collections/q;->T([J)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    add-int/lit8 v6, v4, -0x1

    .line 45
    .line 46
    aget-wide v7, v1, v6

    .line 47
    .line 48
    const-wide v9, 0xffffffffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long/2addr v7, v9

    .line 54
    const-wide/high16 v11, -0x100000000000000L

    .line 55
    .line 56
    or-long/2addr v7, v11

    .line 57
    aput-wide v7, v1, v6

    .line 58
    .line 59
    aget-wide v6, v1, v5

    .line 60
    .line 61
    aput-wide v6, v1, v4

    .line 62
    .line 63
    move v4, v5

    .line 64
    :goto_1
    if-eq v4, v2, :cond_5

    .line 65
    .line 66
    shr-int/lit8 v6, v4, 0x3

    .line 67
    .line 68
    aget-wide v7, v1, v6

    .line 69
    .line 70
    and-int/lit8 v11, v4, 0x7

    .line 71
    .line 72
    shl-int/lit8 v11, v11, 0x3

    .line 73
    .line 74
    shr-long/2addr v7, v11

    .line 75
    const-wide/16 v12, 0xff

    .line 76
    .line 77
    and-long/2addr v7, v12

    .line 78
    const-wide/16 v14, 0x80

    .line 79
    .line 80
    cmp-long v16, v7, v14

    .line 81
    .line 82
    if-nez v16, :cond_1

    .line 83
    .line 84
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    const-wide/16 v16, 0xfe

    .line 88
    .line 89
    cmp-long v7, v7, v16

    .line 90
    .line 91
    if-eqz v7, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    aget-wide v7, v3, v4

    .line 95
    .line 96
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    const v8, -0x3361d2af    # -8.293031E7f

    .line 101
    .line 102
    .line 103
    mul-int/2addr v7, v8

    .line 104
    shl-int/lit8 v8, v7, 0x10

    .line 105
    .line 106
    xor-int/2addr v7, v8

    .line 107
    ushr-int/lit8 v8, v7, 0x7

    .line 108
    .line 109
    invoke-direct {v0, v8}, Landroidx/collection/MutableLongSet;->findFirstAvailableSlot(I)I

    .line 110
    .line 111
    .line 112
    move-result v16

    .line 113
    and-int/2addr v8, v2

    .line 114
    sub-int v17, v16, v8

    .line 115
    .line 116
    and-int v17, v17, v2

    .line 117
    .line 118
    move/from16 v18, v5

    .line 119
    .line 120
    div-int/lit8 v5, v17, 0x8

    .line 121
    .line 122
    sub-int v8, v4, v8

    .line 123
    .line 124
    and-int/2addr v8, v2

    .line 125
    div-int/lit8 v8, v8, 0x8

    .line 126
    .line 127
    const-wide/high16 v19, -0x8000000000000000L

    .line 128
    .line 129
    if-ne v5, v8, :cond_3

    .line 130
    .line 131
    and-int/lit8 v5, v7, 0x7f

    .line 132
    .line 133
    int-to-long v7, v5

    .line 134
    aget-wide v14, v1, v6

    .line 135
    .line 136
    shl-long/2addr v12, v11

    .line 137
    not-long v12, v12

    .line 138
    and-long/2addr v12, v14

    .line 139
    shl-long/2addr v7, v11

    .line 140
    or-long/2addr v7, v12

    .line 141
    aput-wide v7, v1, v6

    .line 142
    .line 143
    array-length v5, v1

    .line 144
    add-int/lit8 v5, v5, -0x1

    .line 145
    .line 146
    aget-wide v6, v1, v18

    .line 147
    .line 148
    and-long/2addr v6, v9

    .line 149
    or-long v6, v6, v19

    .line 150
    .line 151
    aput-wide v6, v1, v5

    .line 152
    .line 153
    add-int/lit8 v4, v4, 0x1

    .line 154
    .line 155
    move/from16 v5, v18

    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_3
    shr-int/lit8 v5, v16, 0x3

    .line 159
    .line 160
    aget-wide v21, v1, v5

    .line 161
    .line 162
    and-int/lit8 v8, v16, 0x7

    .line 163
    .line 164
    shl-int/lit8 v8, v8, 0x3

    .line 165
    .line 166
    shr-long v23, v21, v8

    .line 167
    .line 168
    and-long v23, v23, v12

    .line 169
    .line 170
    cmp-long v17, v23, v14

    .line 171
    .line 172
    if-nez v17, :cond_4

    .line 173
    .line 174
    and-int/lit8 v7, v7, 0x7f

    .line 175
    .line 176
    move-wide/from16 v23, v9

    .line 177
    .line 178
    int-to-long v9, v7

    .line 179
    move-wide/from16 v25, v12

    .line 180
    .line 181
    shl-long v12, v25, v8

    .line 182
    .line 183
    not-long v12, v12

    .line 184
    and-long v12, v21, v12

    .line 185
    .line 186
    shl-long v7, v9, v8

    .line 187
    .line 188
    or-long/2addr v7, v12

    .line 189
    aput-wide v7, v1, v5

    .line 190
    .line 191
    aget-wide v7, v1, v6

    .line 192
    .line 193
    shl-long v9, v25, v11

    .line 194
    .line 195
    not-long v9, v9

    .line 196
    and-long/2addr v7, v9

    .line 197
    shl-long v9, v14, v11

    .line 198
    .line 199
    or-long/2addr v7, v9

    .line 200
    aput-wide v7, v1, v6

    .line 201
    .line 202
    aget-wide v5, v3, v4

    .line 203
    .line 204
    aput-wide v5, v3, v16

    .line 205
    .line 206
    const-wide/16 v5, 0x0

    .line 207
    .line 208
    aput-wide v5, v3, v4

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_4
    move-wide/from16 v23, v9

    .line 212
    .line 213
    move-wide/from16 v25, v12

    .line 214
    .line 215
    and-int/lit8 v6, v7, 0x7f

    .line 216
    .line 217
    int-to-long v6, v6

    .line 218
    shl-long v9, v25, v8

    .line 219
    .line 220
    not-long v9, v9

    .line 221
    and-long v9, v21, v9

    .line 222
    .line 223
    shl-long/2addr v6, v8

    .line 224
    or-long/2addr v6, v9

    .line 225
    aput-wide v6, v1, v5

    .line 226
    .line 227
    aget-wide v5, v3, v16

    .line 228
    .line 229
    aget-wide v7, v3, v4

    .line 230
    .line 231
    aput-wide v7, v3, v16

    .line 232
    .line 233
    aput-wide v5, v3, v4

    .line 234
    .line 235
    add-int/lit8 v4, v4, -0x1

    .line 236
    .line 237
    :goto_3
    array-length v5, v1

    .line 238
    add-int/lit8 v5, v5, -0x1

    .line 239
    .line 240
    aget-wide v6, v1, v18

    .line 241
    .line 242
    and-long v6, v6, v23

    .line 243
    .line 244
    or-long v6, v6, v19

    .line 245
    .line 246
    aput-wide v6, v1, v5

    .line 247
    .line 248
    add-int/lit8 v4, v4, 0x1

    .line 249
    .line 250
    move/from16 v5, v18

    .line 251
    .line 252
    move-wide/from16 v9, v23

    .line 253
    .line 254
    goto/16 :goto_1

    .line 255
    .line 256
    :cond_5
    invoke-direct {v0}, Landroidx/collection/MutableLongSet;->initializeGrowth()V

    .line 257
    .line 258
    .line 259
    return-void
.end method

.method public final minusAssign(J)V
    .locals 14

    .line 1
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const v1, -0x3361d2af    # -8.293031E7f

    mul-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x10

    xor-int/2addr v0, v1

    and-int/lit8 v1, v0, 0x7f

    .line 2
    iget v2, p0, Landroidx/collection/LongSet;->_capacity:I

    ushr-int/lit8 v0, v0, 0x7

    and-int/2addr v0, v2

    const/4 v3, 0x0

    .line 3
    :goto_0
    iget-object v4, p0, Landroidx/collection/LongSet;->metadata:[J

    shr-int/lit8 v5, v0, 0x3

    and-int/lit8 v6, v0, 0x7

    shl-int/lit8 v6, v6, 0x3

    .line 4
    aget-wide v7, v4, v5

    ushr-long/2addr v7, v6

    add-int/lit8 v5, v5, 0x1

    aget-wide v9, v4, v5

    rsub-int/lit8 v4, v6, 0x40

    shl-long v4, v9, v4

    int-to-long v9, v6

    neg-long v9, v9

    const/16 v6, 0x3f

    shr-long/2addr v9, v6

    and-long/2addr v4, v9

    or-long/2addr v4, v7

    int-to-long v6, v1

    const-wide v8, 0x101010101010101L

    mul-long/2addr v6, v8

    xor-long/2addr v6, v4

    sub-long v8, v6, v8

    not-long v6, v6

    and-long/2addr v6, v8

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    :goto_1
    const-wide/16 v10, 0x0

    cmp-long v12, v6, v10

    if-eqz v12, :cond_1

    .line 5
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v10

    shr-int/lit8 v10, v10, 0x3

    add-int/2addr v10, v0

    and-int/2addr v10, v2

    .line 6
    iget-object v11, p0, Landroidx/collection/LongSet;->elements:[J

    aget-wide v12, v11, v10

    cmp-long v11, v12, p1

    if-nez v11, :cond_0

    goto :goto_2

    :cond_0
    const-wide/16 v10, 0x1

    sub-long v10, v6, v10

    and-long/2addr v6, v10

    goto :goto_1

    :cond_1
    not-long v6, v4

    const/4 v12, 0x6

    shl-long/2addr v6, v12

    and-long/2addr v4, v6

    and-long/2addr v4, v8

    cmp-long v4, v4, v10

    if-eqz v4, :cond_3

    const/4 v10, -0x1

    :goto_2
    if-ltz v10, :cond_2

    .line 7
    invoke-direct {p0, v10}, Landroidx/collection/MutableLongSet;->removeElementAt(I)V

    :cond_2
    return-void

    :cond_3
    add-int/lit8 v3, v3, 0x8

    add-int/2addr v0, v3

    and-int/2addr v0, v2

    goto :goto_0
.end method

.method public final minusAssign(Landroidx/collection/LongSet;)V
    .locals 13
    .param p1    # Landroidx/collection/LongSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p1, Landroidx/collection/LongSet;->elements:[J

    .line 11
    iget-object p1, p1, Landroidx/collection/LongSet;->metadata:[J

    .line 12
    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_3

    const/4 v2, 0x0

    move v3, v2

    .line 13
    :goto_0
    aget-wide v4, p1, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_2

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_1

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_0

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    .line 14
    aget-wide v9, v0, v9

    .line 15
    invoke-virtual {p0, v9, v10}, Landroidx/collection/MutableLongSet;->minusAssign(J)V

    :cond_0
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    if-ne v6, v7, :cond_3

    :cond_2
    if-eq v3, v1, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final minusAssign([J)V
    .locals 4
    .param p1    # [J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-wide v2, p1, v1

    .line 9
    invoke-virtual {p0, v2, v3}, Landroidx/collection/MutableLongSet;->minusAssign(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final plusAssign(J)V
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/collection/MutableLongSet;->findAbsoluteInsertIndex(J)I

    move-result v0

    .line 2
    iget-object v1, p0, Landroidx/collection/LongSet;->elements:[J

    aput-wide p1, v1, v0

    return-void
.end method

.method public final plusAssign(Landroidx/collection/LongSet;)V
    .locals 13
    .param p1    # Landroidx/collection/LongSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    iget-object v0, p1, Landroidx/collection/LongSet;->elements:[J

    .line 6
    iget-object p1, p1, Landroidx/collection/LongSet;->metadata:[J

    .line 7
    array-length v1, p1

    add-int/lit8 v1, v1, -0x2

    if-ltz v1, :cond_3

    const/4 v2, 0x0

    move v3, v2

    .line 8
    :goto_0
    aget-wide v4, p1, v3

    not-long v6, v4

    const/4 v8, 0x7

    shl-long/2addr v6, v8

    and-long/2addr v6, v4

    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v6, v8

    cmp-long v6, v6, v8

    if-eqz v6, :cond_2

    sub-int v6, v3, v1

    not-int v6, v6

    ushr-int/lit8 v6, v6, 0x1f

    const/16 v7, 0x8

    rsub-int/lit8 v6, v6, 0x8

    move v8, v2

    :goto_1
    if-ge v8, v6, :cond_1

    const-wide/16 v9, 0xff

    and-long/2addr v9, v4

    const-wide/16 v11, 0x80

    cmp-long v9, v9, v11

    if-gez v9, :cond_0

    shl-int/lit8 v9, v3, 0x3

    add-int/2addr v9, v8

    .line 9
    aget-wide v9, v0, v9

    .line 10
    invoke-virtual {p0, v9, v10}, Landroidx/collection/MutableLongSet;->plusAssign(J)V

    :cond_0
    shr-long/2addr v4, v7

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    if-ne v6, v7, :cond_3

    :cond_2
    if-eq v3, v1, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final plusAssign([J)V
    .locals 4
    .param p1    # [J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-wide v2, p1, v1

    .line 4
    invoke-virtual {p0, v2, v3}, Landroidx/collection/MutableLongSet;->plusAssign(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final remove(J)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const v2, -0x3361d2af    # -8.293031E7f

    .line 8
    .line 9
    .line 10
    mul-int/2addr v1, v2

    .line 11
    shl-int/lit8 v2, v1, 0x10

    .line 12
    .line 13
    xor-int/2addr v1, v2

    .line 14
    and-int/lit8 v2, v1, 0x7f

    .line 15
    .line 16
    iget v3, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 17
    .line 18
    ushr-int/lit8 v1, v1, 0x7

    .line 19
    .line 20
    and-int/2addr v1, v3

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    iget-object v6, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 24
    .line 25
    shr-int/lit8 v7, v1, 0x3

    .line 26
    .line 27
    and-int/lit8 v8, v1, 0x7

    .line 28
    .line 29
    shl-int/lit8 v8, v8, 0x3

    .line 30
    .line 31
    aget-wide v9, v6, v7

    .line 32
    .line 33
    ushr-long/2addr v9, v8

    .line 34
    const/4 v11, 0x1

    .line 35
    add-int/2addr v7, v11

    .line 36
    aget-wide v12, v6, v7

    .line 37
    .line 38
    rsub-int/lit8 v6, v8, 0x40

    .line 39
    .line 40
    shl-long v6, v12, v6

    .line 41
    .line 42
    int-to-long v12, v8

    .line 43
    neg-long v12, v12

    .line 44
    const/16 v8, 0x3f

    .line 45
    .line 46
    shr-long/2addr v12, v8

    .line 47
    and-long/2addr v6, v12

    .line 48
    or-long/2addr v6, v9

    .line 49
    int-to-long v8, v2

    .line 50
    const-wide v12, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long/2addr v8, v12

    .line 56
    xor-long/2addr v8, v6

    .line 57
    sub-long v12, v8, v12

    .line 58
    .line 59
    not-long v8, v8

    .line 60
    and-long/2addr v8, v12

    .line 61
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v8, v12

    .line 67
    :goto_1
    const-wide/16 v14, 0x0

    .line 68
    .line 69
    cmp-long v10, v8, v14

    .line 70
    .line 71
    if-eqz v10, :cond_1

    .line 72
    .line 73
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    shr-int/lit8 v10, v10, 0x3

    .line 78
    .line 79
    add-int/2addr v10, v1

    .line 80
    and-int/2addr v10, v3

    .line 81
    iget-object v14, v0, Landroidx/collection/LongSet;->elements:[J

    .line 82
    .line 83
    aget-wide v15, v14, v10

    .line 84
    .line 85
    cmp-long v14, v15, p1

    .line 86
    .line 87
    if-nez v14, :cond_0

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_0
    const-wide/16 v14, 0x1

    .line 91
    .line 92
    sub-long v14, v8, v14

    .line 93
    .line 94
    and-long/2addr v8, v14

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    not-long v8, v6

    .line 97
    const/4 v10, 0x6

    .line 98
    shl-long/2addr v8, v10

    .line 99
    and-long/2addr v6, v8

    .line 100
    and-long/2addr v6, v12

    .line 101
    cmp-long v6, v6, v14

    .line 102
    .line 103
    if-eqz v6, :cond_4

    .line 104
    .line 105
    const/4 v10, -0x1

    .line 106
    :goto_2
    if-ltz v10, :cond_2

    .line 107
    .line 108
    move v4, v11

    .line 109
    :cond_2
    if-eqz v4, :cond_3

    .line 110
    .line 111
    invoke-direct {v0, v10}, Landroidx/collection/MutableLongSet;->removeElementAt(I)V

    .line 112
    .line 113
    .line 114
    :cond_3
    return v4

    .line 115
    :cond_4
    add-int/lit8 v5, v5, 0x8

    .line 116
    .line 117
    add-int/2addr v1, v5

    .line 118
    and-int/2addr v1, v3

    .line 119
    goto :goto_0
.end method

.method public final removeAll(Landroidx/collection/LongSet;)Z
    .locals 1
    .param p1    # Landroidx/collection/LongSet;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 5
    invoke-virtual {p0, p1}, Landroidx/collection/MutableLongSet;->minusAssign(Landroidx/collection/LongSet;)V

    .line 6
    iget p1, p0, Landroidx/collection/LongSet;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final removeAll([J)Z
    .locals 1
    .param p1    # [J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_size:I

    .line 2
    invoke-virtual {p0, p1}, Landroidx/collection/MutableLongSet;->minusAssign([J)V

    .line 3
    iget p1, p0, Landroidx/collection/LongSet;->_size:I

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final resizeStorage$collection(I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/collection/LongSet;->elements:[J

    .line 6
    .line 7
    iget v3, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 8
    .line 9
    invoke-direct/range {p0 .. p1}, Landroidx/collection/MutableLongSet;->initializeStorage(I)V

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Landroidx/collection/LongSet;->metadata:[J

    .line 13
    .line 14
    iget-object v5, v0, Landroidx/collection/LongSet;->elements:[J

    .line 15
    .line 16
    iget v6, v0, Landroidx/collection/LongSet;->_capacity:I

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    :goto_0
    if-ge v7, v3, :cond_1

    .line 20
    .line 21
    shr-int/lit8 v8, v7, 0x3

    .line 22
    .line 23
    aget-wide v8, v1, v8

    .line 24
    .line 25
    and-int/lit8 v10, v7, 0x7

    .line 26
    .line 27
    shl-int/lit8 v10, v10, 0x3

    .line 28
    .line 29
    shr-long/2addr v8, v10

    .line 30
    const-wide/16 v10, 0xff

    .line 31
    .line 32
    and-long/2addr v8, v10

    .line 33
    const-wide/16 v12, 0x80

    .line 34
    .line 35
    cmp-long v8, v8, v12

    .line 36
    .line 37
    if-gez v8, :cond_0

    .line 38
    .line 39
    aget-wide v8, v2, v7

    .line 40
    .line 41
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 42
    .line 43
    .line 44
    move-result v12

    .line 45
    const v13, -0x3361d2af    # -8.293031E7f

    .line 46
    .line 47
    .line 48
    mul-int/2addr v12, v13

    .line 49
    shl-int/lit8 v13, v12, 0x10

    .line 50
    .line 51
    xor-int/2addr v12, v13

    .line 52
    ushr-int/lit8 v13, v12, 0x7

    .line 53
    .line 54
    invoke-direct {v0, v13}, Landroidx/collection/MutableLongSet;->findFirstAvailableSlot(I)I

    .line 55
    .line 56
    .line 57
    move-result v13

    .line 58
    and-int/lit8 v12, v12, 0x7f

    .line 59
    .line 60
    int-to-long v14, v12

    .line 61
    shr-int/lit8 v12, v13, 0x3

    .line 62
    .line 63
    and-int/lit8 v16, v13, 0x7

    .line 64
    .line 65
    shl-int/lit8 v16, v16, 0x3

    .line 66
    .line 67
    aget-wide v17, v4, v12

    .line 68
    .line 69
    shl-long v10, v10, v16

    .line 70
    .line 71
    not-long v10, v10

    .line 72
    and-long v10, v17, v10

    .line 73
    .line 74
    shl-long v14, v14, v16

    .line 75
    .line 76
    or-long/2addr v10, v14

    .line 77
    aput-wide v10, v4, v12

    .line 78
    .line 79
    add-int/lit8 v12, v13, -0x7

    .line 80
    .line 81
    and-int/2addr v12, v6

    .line 82
    and-int/lit8 v14, v6, 0x7

    .line 83
    .line 84
    add-int/2addr v12, v14

    .line 85
    shr-int/lit8 v12, v12, 0x3

    .line 86
    .line 87
    aput-wide v10, v4, v12

    .line 88
    .line 89
    aput-wide v8, v5, v13

    .line 90
    .line 91
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    return-void
.end method

.method public final trim()I
    .locals 2
    .annotation build Landroidx/annotation/IntRange;
        from = 0x0L
    .end annotation

    .line 1
    iget v0, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 2
    .line 3
    iget v1, p0, Landroidx/collection/LongSet;->_size:I

    .line 4
    .line 5
    invoke-static {v1}, Landroidx/collection/ScatterMapKt;->unloadedCapacity(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Landroidx/collection/ScatterMapKt;->normalizeCapacity(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v1, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroidx/collection/MutableLongSet;->resizeStorage$collection(I)V

    .line 16
    .line 17
    .line 18
    iget v1, p0, Landroidx/collection/LongSet;->_capacity:I

    .line 19
    .line 20
    sub-int/2addr v0, v1

    .line 21
    return v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return v0
.end method
