.class public final Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __CURSOR_FACTORY:Lm5/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm5/a;"
        }
    .end annotation
.end field

.field public static final __DB_NAME:Ljava/lang/String; = "HeaderEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0x6

.field public static final __ENTITY_NAME:Ljava/lang/String; = "HeaderEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation
.end field

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;

.field public static final author:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final authorId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final convertUrl:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final createDate:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final defaultBackgroundColor:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final defaultBackgroundLineConfig:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final defaultBackgroundLineConfigId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final duration:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final height:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final lastBackgroundColor:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final lastBackgroundLineConfig:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final lastBackgroundLineConfigId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final moveConfig:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final moveConfigId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final page:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final pageId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final provider:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final updateDate:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final version:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final width:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 21

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;

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
    move-object v7, v5

    .line 42
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->id:Lio/objectbox/Property;

    .line 43
    .line 44
    new-instance v1, Lio/objectbox/Property;

    .line 45
    .line 46
    const-string v6, "version"

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v4, 0x2

    .line 50
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v8, v1

    .line 56
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->version:Lio/objectbox/Property;

    .line 57
    .line 58
    new-instance v1, Lio/objectbox/Property;

    .line 59
    .line 60
    const/4 v4, 0x3

    .line 61
    const-string v6, "width"

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    move-object v9, v1

    .line 68
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->width:Lio/objectbox/Property;

    .line 69
    .line 70
    new-instance v1, Lio/objectbox/Property;

    .line 71
    .line 72
    const/4 v4, 0x4

    .line 73
    const-string v6, "height"

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
    move-object v11, v5

    .line 81
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->height:Lio/objectbox/Property;

    .line 82
    .line 83
    new-instance v1, Lio/objectbox/Property;

    .line 84
    .line 85
    const/4 v4, 0x5

    .line 86
    const-string v6, "createDate"

    .line 87
    .line 88
    const/4 v3, 0x4

    .line 89
    move-object v5, v7

    .line 90
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    move-object v12, v1

    .line 94
    sput-object v12, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->createDate:Lio/objectbox/Property;

    .line 95
    .line 96
    new-instance v1, Lio/objectbox/Property;

    .line 97
    .line 98
    const/4 v4, 0x6

    .line 99
    const-string v6, "updateDate"

    .line 100
    .line 101
    const/4 v3, 0x5

    .line 102
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    move-object v13, v8

    .line 106
    move-object v8, v1

    .line 107
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->updateDate:Lio/objectbox/Property;

    .line 108
    .line 109
    new-instance v1, Lio/objectbox/Property;

    .line 110
    .line 111
    const/4 v4, 0x7

    .line 112
    const-string v6, "duration"

    .line 113
    .line 114
    const/4 v3, 0x6

    .line 115
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    move-object v14, v9

    .line 119
    move-object v9, v1

    .line 120
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->duration:Lio/objectbox/Property;

    .line 121
    .line 122
    new-instance v1, Lio/objectbox/Property;

    .line 123
    .line 124
    const-class v5, Ljava/lang/String;

    .line 125
    .line 126
    const-string v6, "convertUrl"

    .line 127
    .line 128
    const/4 v3, 0x7

    .line 129
    const/16 v4, 0xb

    .line 130
    .line 131
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    move-object v15, v10

    .line 135
    move-object v10, v1

    .line 136
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->convertUrl:Lio/objectbox/Property;

    .line 137
    .line 138
    new-instance v1, Lio/objectbox/Property;

    .line 139
    .line 140
    const/16 v4, 0xc

    .line 141
    .line 142
    const-string v6, "defaultBackgroundColor"

    .line 143
    .line 144
    const/16 v3, 0x8

    .line 145
    .line 146
    move-object v5, v11

    .line 147
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    move-object v11, v1

    .line 151
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->defaultBackgroundColor:Lio/objectbox/Property;

    .line 152
    .line 153
    new-instance v1, Lio/objectbox/Property;

    .line 154
    .line 155
    const/16 v4, 0xd

    .line 156
    .line 157
    const-string v6, "lastBackgroundColor"

    .line 158
    .line 159
    const/16 v3, 0x9

    .line 160
    .line 161
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    move-object/from16 v16, v12

    .line 165
    .line 166
    move-object v12, v1

    .line 167
    sput-object v12, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->lastBackgroundColor:Lio/objectbox/Property;

    .line 168
    .line 169
    new-instance v1, Lio/objectbox/Property;

    .line 170
    .line 171
    const-string v6, "pageId"

    .line 172
    .line 173
    move-object v5, v7

    .line 174
    const/4 v7, 0x1

    .line 175
    const/16 v3, 0xa

    .line 176
    .line 177
    const/16 v4, 0x9

    .line 178
    .line 179
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 180
    .line 181
    .line 182
    move-object/from16 v17, v13

    .line 183
    .line 184
    move-object v13, v1

    .line 185
    sput-object v13, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->pageId:Lio/objectbox/Property;

    .line 186
    .line 187
    new-instance v1, Lio/objectbox/Property;

    .line 188
    .line 189
    const-string v6, "defaultBackgroundLineConfigId"

    .line 190
    .line 191
    const/16 v3, 0xb

    .line 192
    .line 193
    const/16 v4, 0xf

    .line 194
    .line 195
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 196
    .line 197
    .line 198
    move-object/from16 v18, v14

    .line 199
    .line 200
    move-object v14, v1

    .line 201
    sput-object v14, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->defaultBackgroundLineConfigId:Lio/objectbox/Property;

    .line 202
    .line 203
    new-instance v1, Lio/objectbox/Property;

    .line 204
    .line 205
    const-string v6, "lastBackgroundLineConfigId"

    .line 206
    .line 207
    const/16 v3, 0xc

    .line 208
    .line 209
    const/16 v4, 0x10

    .line 210
    .line 211
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 212
    .line 213
    .line 214
    move-object/from16 v19, v15

    .line 215
    .line 216
    move-object v15, v1

    .line 217
    sput-object v15, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->lastBackgroundLineConfigId:Lio/objectbox/Property;

    .line 218
    .line 219
    new-instance v1, Lio/objectbox/Property;

    .line 220
    .line 221
    const-string v6, "authorId"

    .line 222
    .line 223
    const/16 v3, 0xd

    .line 224
    .line 225
    const/16 v4, 0xa

    .line 226
    .line 227
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 228
    .line 229
    .line 230
    move-object/from16 v20, v16

    .line 231
    .line 232
    move-object/from16 v16, v1

    .line 233
    .line 234
    sput-object v16, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->authorId:Lio/objectbox/Property;

    .line 235
    .line 236
    new-instance v1, Lio/objectbox/Property;

    .line 237
    .line 238
    const-string v6, "moveConfigId"

    .line 239
    .line 240
    const/16 v3, 0xe

    .line 241
    .line 242
    const/16 v4, 0xe

    .line 243
    .line 244
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 245
    .line 246
    .line 247
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->moveConfigId:Lio/objectbox/Property;

    .line 248
    .line 249
    move-object v3, v0

    .line 250
    move-object/from16 v4, v17

    .line 251
    .line 252
    move-object/from16 v5, v18

    .line 253
    .line 254
    move-object/from16 v6, v19

    .line 255
    .line 256
    move-object/from16 v7, v20

    .line 257
    .line 258
    move-object/from16 v17, v1

    .line 259
    .line 260
    filled-new-array/range {v3 .. v17}, [Lio/objectbox/Property;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    move-object v1, v3

    .line 265
    move-object/from16 v3, v16

    .line 266
    .line 267
    move-object/from16 v4, v17

    .line 268
    .line 269
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 270
    .line 271
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 272
    .line 273
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 274
    .line 275
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

    .line 276
    .line 277
    new-instance v5, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$1;

    .line 278
    .line 279
    invoke-direct {v5}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$1;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-direct {v0, v2, v1, v13, v5}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 283
    .line 284
    .line 285
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->page:Lio/objectbox/relation/RelationInfo;

    .line 286
    .line 287
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 288
    .line 289
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;

    .line 290
    .line 291
    new-instance v5, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$2;

    .line 292
    .line 293
    invoke-direct {v5}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$2;-><init>()V

    .line 294
    .line 295
    .line 296
    invoke-direct {v0, v2, v1, v14, v5}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 297
    .line 298
    .line 299
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->defaultBackgroundLineConfig:Lio/objectbox/relation/RelationInfo;

    .line 300
    .line 301
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 302
    .line 303
    new-instance v5, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$3;

    .line 304
    .line 305
    invoke-direct {v5}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$3;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-direct {v0, v2, v1, v15, v5}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 309
    .line 310
    .line 311
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->lastBackgroundLineConfig:Lio/objectbox/relation/RelationInfo;

    .line 312
    .line 313
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 314
    .line 315
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;

    .line 316
    .line 317
    new-instance v5, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$4;

    .line 318
    .line 319
    invoke-direct {v5}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$4;-><init>()V

    .line 320
    .line 321
    .line 322
    invoke-direct {v0, v2, v1, v3, v5}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 323
    .line 324
    .line 325
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->author:Lio/objectbox/relation/RelationInfo;

    .line 326
    .line 327
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 328
    .line 329
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;

    .line 330
    .line 331
    new-instance v5, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$5;

    .line 332
    .line 333
    invoke-direct {v5}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$5;-><init>()V

    .line 334
    .line 335
    .line 336
    invoke-direct {v0, v2, v3, v4, v5}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 337
    .line 338
    .line 339
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->moveConfig:Lio/objectbox/relation/RelationInfo;

    .line 340
    .line 341
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 342
    .line 343
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$6;

    .line 344
    .line 345
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$6;-><init>()V

    .line 346
    .line 347
    .line 348
    const/16 v4, 0x9

    .line 349
    .line 350
    invoke-direct {v0, v2, v1, v3, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;I)V

    .line 351
    .line 352
    .line 353
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->provider:Lio/objectbox/relation/RelationInfo;

    .line 354
    .line 355
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
.method public getAllProperties()[Lio/objectbox/Property;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCursorFactory()Lm5/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm5/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "HeaderEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/4 v0, 0x6

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "HeaderEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public getIdGetter()Lm5/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lm5/b;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIdProperty()Lio/objectbox/Property;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
