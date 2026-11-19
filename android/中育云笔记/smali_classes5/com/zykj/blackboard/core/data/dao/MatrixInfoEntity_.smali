.class public final Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/Class;

.field public static final d:Lkc/b;

.field public static final e:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

.field public static final f:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;

.field public static final g:Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/Property;

.field public static final j:Lio/objectbox/Property;

.field public static final k:Lio/objectbox/Property;

.field public static final l:Lio/objectbox/Property;

.field public static final m:Lio/objectbox/Property;

.field public static final n:Lio/objectbox/Property;

.field public static final o:Lio/objectbox/Property;

.field public static final p:Lio/objectbox/Property;

.field public static final q:Lio/objectbox/Property;

.field public static final r:Lio/objectbox/Property;

.field public static final s:[Lio/objectbox/Property;

.field public static final t:Lio/objectbox/Property;

.field public static final u:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 18

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->c:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->d:Lkc/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->f:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;

    .line 25
    .line 26
    new-instance v1, Lio/objectbox/Property;

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const-string v8, "id"

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    const-string v6, "id"

    .line 36
    .line 37
    invoke-direct/range {v1 .. v8}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v1

    .line 41
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->g:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    const-string v6, "eventTime"

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v8, v1

    .line 53
    move-object v7, v5

    .line 54
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->h:Lio/objectbox/Property;

    .line 55
    .line 56
    new-instance v1, Lio/objectbox/Property;

    .line 57
    .line 58
    const-string v6, "scaleX"

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    const/4 v4, 0x3

    .line 62
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 63
    .line 64
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object v9, v1

    .line 68
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->i:Lio/objectbox/Property;

    .line 69
    .line 70
    new-instance v1, Lio/objectbox/Property;

    .line 71
    .line 72
    const/4 v4, 0x4

    .line 73
    const-string v6, "skewX"

    .line 74
    .line 75
    const/4 v3, 0x3

    .line 76
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move-object v10, v1

    .line 80
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->j:Lio/objectbox/Property;

    .line 81
    .line 82
    new-instance v1, Lio/objectbox/Property;

    .line 83
    .line 84
    const/4 v4, 0x5

    .line 85
    const-string v6, "transX"

    .line 86
    .line 87
    const/4 v3, 0x4

    .line 88
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object v11, v1

    .line 92
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->k:Lio/objectbox/Property;

    .line 93
    .line 94
    new-instance v1, Lio/objectbox/Property;

    .line 95
    .line 96
    const/4 v4, 0x6

    .line 97
    const-string v6, "skewY"

    .line 98
    .line 99
    const/4 v3, 0x5

    .line 100
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    move-object v12, v8

    .line 104
    move-object v8, v1

    .line 105
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->l:Lio/objectbox/Property;

    .line 106
    .line 107
    new-instance v1, Lio/objectbox/Property;

    .line 108
    .line 109
    const/4 v4, 0x7

    .line 110
    const-string v6, "scaleY"

    .line 111
    .line 112
    const/4 v3, 0x6

    .line 113
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    move-object v13, v9

    .line 117
    move-object v9, v1

    .line 118
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->m:Lio/objectbox/Property;

    .line 119
    .line 120
    new-instance v1, Lio/objectbox/Property;

    .line 121
    .line 122
    const/16 v4, 0x8

    .line 123
    .line 124
    const-string v6, "transY"

    .line 125
    .line 126
    const/4 v3, 0x7

    .line 127
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    move-object v14, v10

    .line 131
    move-object v10, v1

    .line 132
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->n:Lio/objectbox/Property;

    .line 133
    .line 134
    new-instance v1, Lio/objectbox/Property;

    .line 135
    .line 136
    const/16 v4, 0x9

    .line 137
    .line 138
    const-string v6, "perSp0"

    .line 139
    .line 140
    const/16 v3, 0x8

    .line 141
    .line 142
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    move-object v15, v11

    .line 146
    move-object v11, v1

    .line 147
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->o:Lio/objectbox/Property;

    .line 148
    .line 149
    new-instance v1, Lio/objectbox/Property;

    .line 150
    .line 151
    const/16 v4, 0xa

    .line 152
    .line 153
    const-string v6, "perSp1"

    .line 154
    .line 155
    const/16 v3, 0x9

    .line 156
    .line 157
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    move-object/from16 v16, v12

    .line 161
    .line 162
    move-object v12, v1

    .line 163
    sput-object v12, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->p:Lio/objectbox/Property;

    .line 164
    .line 165
    new-instance v1, Lio/objectbox/Property;

    .line 166
    .line 167
    const/16 v4, 0xb

    .line 168
    .line 169
    const-string v6, "perSp2"

    .line 170
    .line 171
    const/16 v3, 0xa

    .line 172
    .line 173
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    move-object/from16 v17, v13

    .line 177
    .line 178
    move-object v13, v1

    .line 179
    sput-object v13, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->q:Lio/objectbox/Property;

    .line 180
    .line 181
    new-instance v1, Lio/objectbox/Property;

    .line 182
    .line 183
    const-string v6, "recordId"

    .line 184
    .line 185
    move-object v5, v7

    .line 186
    const/4 v7, 0x1

    .line 187
    const/16 v3, 0xb

    .line 188
    .line 189
    const/16 v4, 0xc

    .line 190
    .line 191
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->r:Lio/objectbox/Property;

    .line 195
    .line 196
    move-object v3, v0

    .line 197
    move-object v6, v14

    .line 198
    move-object v7, v15

    .line 199
    move-object/from16 v4, v16

    .line 200
    .line 201
    move-object/from16 v5, v17

    .line 202
    .line 203
    move-object v14, v1

    .line 204
    filled-new-array/range {v3 .. v14}, [Lio/objectbox/Property;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    move-object v1, v3

    .line 209
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->s:[Lio/objectbox/Property;

    .line 210
    .line 211
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->t:Lio/objectbox/Property;

    .line 212
    .line 213
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 214
    .line 215
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->f:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;

    .line 216
    .line 217
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$1;

    .line 218
    .line 219
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$1;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-direct {v0, v2, v1, v14, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 223
    .line 224
    .line 225
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->u:Lio/objectbox/relation/RelationInfo;

    .line 226
    .line 227
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public B()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MatrixInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public h()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->s:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->c:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Lkc/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->d:Lkc/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public q()I
    .locals 1

    .line 1
    const/16 v0, 0x9

    return v0
.end method

.method public s()Lkc/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MatrixInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method
