.class public final Lcom/zykj/blackboard/core/data/dao/PageEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __CURSOR_FACTORY:Ln6/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln6/b;"
        }
    .end annotation
.end field

.field public static final __DB_NAME:Ljava/lang/String; = "PageEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0xe

.field public static final __ENTITY_NAME:Ljava/lang/String; = "PageEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

.field public static final blackBoardEntity:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final blackBoardEntityId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final commandFileName:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final commandIndex:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final dirName:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final headerEntity:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final headerEntityId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final isChange:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final recordEntity:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final recordEntityId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__CURSOR_FACTORY:Ln6/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/PageEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->id:Lio/objectbox/Property;

    .line 43
    .line 44
    new-instance v1, Lio/objectbox/Property;

    .line 45
    .line 46
    const-class v5, Ljava/lang/String;

    .line 47
    .line 48
    const-string v6, "dirName"

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    const/4 v4, 0x2

    .line 52
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v8, v1

    .line 56
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->dirName:Lio/objectbox/Property;

    .line 57
    .line 58
    new-instance v1, Lio/objectbox/Property;

    .line 59
    .line 60
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    const-string v6, "isChange"

    .line 63
    .line 64
    const/4 v3, 0x2

    .line 65
    const/4 v4, 0x3

    .line 66
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object v9, v1

    .line 70
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->isChange:Lio/objectbox/Property;

    .line 71
    .line 72
    new-instance v1, Lio/objectbox/Property;

    .line 73
    .line 74
    const-class v5, Ljava/lang/String;

    .line 75
    .line 76
    const-string v6, "commandFileName"

    .line 77
    .line 78
    const/4 v3, 0x3

    .line 79
    const/4 v4, 0x4

    .line 80
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    move-object v10, v1

    .line 84
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->commandFileName:Lio/objectbox/Property;

    .line 85
    .line 86
    new-instance v1, Lio/objectbox/Property;

    .line 87
    .line 88
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    const-string v6, "commandIndex"

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    const/4 v4, 0x5

    .line 94
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v11, v1

    .line 98
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->commandIndex:Lio/objectbox/Property;

    .line 99
    .line 100
    new-instance v1, Lio/objectbox/Property;

    .line 101
    .line 102
    const-string v6, "blackBoardEntityId"

    .line 103
    .line 104
    move-object v5, v7

    .line 105
    const/4 v7, 0x1

    .line 106
    const/4 v3, 0x5

    .line 107
    const/4 v4, 0x6

    .line 108
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    move-object v12, v8

    .line 112
    move-object v8, v1

    .line 113
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->blackBoardEntityId:Lio/objectbox/Property;

    .line 114
    .line 115
    new-instance v1, Lio/objectbox/Property;

    .line 116
    .line 117
    const-string v6, "recordEntityId"

    .line 118
    .line 119
    const/4 v3, 0x6

    .line 120
    const/4 v4, 0x7

    .line 121
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 122
    .line 123
    .line 124
    move-object v13, v9

    .line 125
    move-object v9, v1

    .line 126
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->recordEntityId:Lio/objectbox/Property;

    .line 127
    .line 128
    new-instance v1, Lio/objectbox/Property;

    .line 129
    .line 130
    const-string v6, "headerEntityId"

    .line 131
    .line 132
    const/4 v3, 0x7

    .line 133
    const/16 v4, 0x8

    .line 134
    .line 135
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 136
    .line 137
    .line 138
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->headerEntityId:Lio/objectbox/Property;

    .line 139
    .line 140
    move-object v3, v0

    .line 141
    move-object v6, v10

    .line 142
    move-object v7, v11

    .line 143
    move-object v4, v12

    .line 144
    move-object v5, v13

    .line 145
    move-object v10, v1

    .line 146
    filled-new-array/range {v3 .. v10}, [Lio/objectbox/Property;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    move-object v1, v3

    .line 151
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 152
    .line 153
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 154
    .line 155
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 156
    .line 157
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;

    .line 158
    .line 159
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/PageEntity_$1;

    .line 160
    .line 161
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity_$1;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-direct {v0, v2, v1, v8, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->blackBoardEntity:Lio/objectbox/relation/RelationInfo;

    .line 168
    .line 169
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 170
    .line 171
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/RecordEntity_;

    .line 172
    .line 173
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/PageEntity_$2;

    .line 174
    .line 175
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity_$2;-><init>()V

    .line 176
    .line 177
    .line 178
    invoke-direct {v0, v2, v1, v9, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 179
    .line 180
    .line 181
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->recordEntity:Lio/objectbox/relation/RelationInfo;

    .line 182
    .line 183
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 184
    .line 185
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;

    .line 186
    .line 187
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/PageEntity_$3;

    .line 188
    .line 189
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity_$3;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-direct {v0, v2, v1, v10, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 193
    .line 194
    .line 195
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->headerEntity:Lio/objectbox/relation/RelationInfo;

    .line 196
    .line 197
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
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCursorFactory()Ln6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln6/b;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__CURSOR_FACTORY:Ln6/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "PageEntity"

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
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/16 v0, 0xe

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "PageEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public getIdGetter()Ln6/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln6/c;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

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
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
