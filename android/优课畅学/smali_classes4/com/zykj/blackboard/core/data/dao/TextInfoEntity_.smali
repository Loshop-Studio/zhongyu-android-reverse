.class public final Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
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

.field public static final __DB_NAME:Ljava/lang/String; = "TextInfoEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0xb

.field public static final __ENTITY_NAME:Ljava/lang/String; = "TextInfoEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;

.field public static final color:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final content:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final record:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final recordId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final style:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final textSize:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final width:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__CURSOR_FACTORY:Ln6/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->id:Lio/objectbox/Property;

    .line 43
    .line 44
    new-instance v1, Lio/objectbox/Property;

    .line 45
    .line 46
    const-string v6, "width"

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    const/4 v4, 0x2

    .line 50
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    move-object v8, v1

    .line 56
    move-object v9, v5

    .line 57
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->width:Lio/objectbox/Property;

    .line 58
    .line 59
    new-instance v1, Lio/objectbox/Property;

    .line 60
    .line 61
    const-string v6, "color"

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    const/4 v4, 0x3

    .line 65
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    move-object v10, v1

    .line 71
    move-object v11, v5

    .line 72
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->color:Lio/objectbox/Property;

    .line 73
    .line 74
    new-instance v1, Lio/objectbox/Property;

    .line 75
    .line 76
    const/4 v4, 0x4

    .line 77
    const-string v6, "textSize"

    .line 78
    .line 79
    const/4 v3, 0x3

    .line 80
    move-object v5, v9

    .line 81
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    move-object v9, v1

    .line 85
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->textSize:Lio/objectbox/Property;

    .line 86
    .line 87
    new-instance v1, Lio/objectbox/Property;

    .line 88
    .line 89
    const/4 v4, 0x5

    .line 90
    const-string v6, "style"

    .line 91
    .line 92
    const/4 v3, 0x4

    .line 93
    move-object v5, v11

    .line 94
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    move-object v11, v1

    .line 98
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->style:Lio/objectbox/Property;

    .line 99
    .line 100
    new-instance v1, Lio/objectbox/Property;

    .line 101
    .line 102
    const-class v5, Ljava/lang/String;

    .line 103
    .line 104
    const-string v6, "content"

    .line 105
    .line 106
    const/4 v3, 0x5

    .line 107
    const/4 v4, 0x6

    .line 108
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    move-object v12, v8

    .line 112
    move-object v8, v1

    .line 113
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->content:Lio/objectbox/Property;

    .line 114
    .line 115
    new-instance v1, Lio/objectbox/Property;

    .line 116
    .line 117
    const-string v6, "recordId"

    .line 118
    .line 119
    move-object v5, v7

    .line 120
    const/4 v7, 0x1

    .line 121
    const/4 v3, 0x6

    .line 122
    const/4 v4, 0x7

    .line 123
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 124
    .line 125
    .line 126
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->recordId:Lio/objectbox/Property;

    .line 127
    .line 128
    move-object v3, v0

    .line 129
    move-object v6, v9

    .line 130
    move-object v5, v10

    .line 131
    move-object v7, v11

    .line 132
    move-object v4, v12

    .line 133
    move-object v9, v1

    .line 134
    filled-new-array/range {v3 .. v9}, [Lio/objectbox/Property;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    move-object v1, v3

    .line 139
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 140
    .line 141
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 142
    .line 143
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 144
    .line 145
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TextRecordEntity_;

    .line 146
    .line 147
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$1;

    .line 148
    .line 149
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$1;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-direct {v0, v2, v1, v9, v3}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 153
    .line 154
    .line 155
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->record:Lio/objectbox/relation/RelationInfo;

    .line 156
    .line 157
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
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__CURSOR_FACTORY:Ln6/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextInfoEntity"

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
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/16 v0, 0xb

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextInfoEntity"

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$TextInfoEntityIdGetter;

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
            "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
