.class public final Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
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

.field public static final __DB_NAME:Ljava/lang/String; = "CommandInfoEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0x5

.field public static final __ENTITY_NAME:Ljava/lang/String; = "CommandInfoEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation
.end field

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;

.field public static final commandEnum:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final data:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final delayTime:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final duration:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final isPlay:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final record:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            "Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final recordId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->id:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const/4 v4, 0x2

    .line 46
    const-string v6, "delayTime"

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    move-object v11, v1

    .line 53
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->delayTime:Lio/objectbox/Property;

    .line 54
    .line 55
    new-instance v1, Lio/objectbox/Property;

    .line 56
    .line 57
    const/4 v4, 0x3

    .line 58
    const-string v6, "duration"

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    move-object v12, v1

    .line 65
    move-object v13, v5

    .line 66
    sput-object v12, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->duration:Lio/objectbox/Property;

    .line 67
    .line 68
    new-instance v1, Lio/objectbox/Property;

    .line 69
    .line 70
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    const-string v6, "isPlay"

    .line 73
    .line 74
    const/4 v3, 0x3

    .line 75
    const/4 v4, 0x4

    .line 76
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    move-object v14, v1

    .line 80
    sput-object v14, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->isPlay:Lio/objectbox/Property;

    .line 81
    .line 82
    new-instance v1, Lio/objectbox/Property;

    .line 83
    .line 84
    const-class v9, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;

    .line 85
    .line 86
    const-class v10, Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 87
    .line 88
    const/4 v3, 0x4

    .line 89
    const/4 v4, 0x5

    .line 90
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    const-string v6, "commandEnum"

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    const-string v8, "commandEnum"

    .line 96
    .line 97
    invoke-direct/range {v1 .. v10}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    move-object v8, v1

    .line 101
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->commandEnum:Lio/objectbox/Property;

    .line 102
    .line 103
    new-instance v1, Lio/objectbox/Property;

    .line 104
    .line 105
    const-class v5, [B

    .line 106
    .line 107
    const-string v6, "data"

    .line 108
    .line 109
    const/4 v3, 0x5

    .line 110
    const/4 v4, 0x6

    .line 111
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    move-object v9, v8

    .line 115
    move-object v8, v1

    .line 116
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->data:Lio/objectbox/Property;

    .line 117
    .line 118
    new-instance v1, Lio/objectbox/Property;

    .line 119
    .line 120
    const-string v6, "recordId"

    .line 121
    .line 122
    const/4 v7, 0x1

    .line 123
    const/4 v3, 0x6

    .line 124
    const/4 v4, 0x7

    .line 125
    move-object v5, v13

    .line 126
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->recordId:Lio/objectbox/Property;

    .line 130
    .line 131
    move-object v3, v0

    .line 132
    move-object v7, v9

    .line 133
    move-object v4, v11

    .line 134
    move-object v5, v12

    .line 135
    move-object v6, v14

    .line 136
    move-object v9, v1

    .line 137
    filled-new-array/range {v3 .. v9}, [Lio/objectbox/Property;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object v1, v3

    .line 142
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 143
    .line 144
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 145
    .line 146
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 147
    .line 148
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity_;

    .line 149
    .line 150
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$1;

    .line 151
    .line 152
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$1;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-direct {v0, v2, v1, v9, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 156
    .line 157
    .line 158
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->record:Lio/objectbox/relation/RelationInfo;

    .line 159
    .line 160
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
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "CommandInfoEntity"

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
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "CommandInfoEntity"

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;

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
            "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
