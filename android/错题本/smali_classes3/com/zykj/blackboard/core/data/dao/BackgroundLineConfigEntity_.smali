.class public final Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
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

.field public static final __DB_NAME:Ljava/lang/String; = "BackgroundLineConfigEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0x18

.field public static final __ENTITY_NAME:Ljava/lang/String; = "BackgroundLineConfigEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation
.end field

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final lineColor:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final lineSpace:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final lineType:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final lineWidth:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->id:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const-string v6, "lineColor"

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    const/4 v4, 0x2

    .line 49
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    move-object v11, v1

    .line 55
    move-object v7, v5

    .line 56
    sput-object v11, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineColor:Lio/objectbox/Property;

    .line 57
    .line 58
    new-instance v1, Lio/objectbox/Property;

    .line 59
    .line 60
    const-string v6, "lineSpace"

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    const/4 v4, 0x3

    .line 64
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object v12, v1

    .line 70
    move-object v13, v5

    .line 71
    sput-object v12, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineSpace:Lio/objectbox/Property;

    .line 72
    .line 73
    new-instance v1, Lio/objectbox/Property;

    .line 74
    .line 75
    const-class v9, Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;

    .line 76
    .line 77
    const-class v10, Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 78
    .line 79
    const/4 v3, 0x3

    .line 80
    const/4 v4, 0x4

    .line 81
    const-string v6, "lineType"

    .line 82
    .line 83
    move-object v5, v7

    .line 84
    const/4 v7, 0x0

    .line 85
    const-string v8, "lineType"

    .line 86
    .line 87
    invoke-direct/range {v1 .. v10}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 88
    .line 89
    .line 90
    move-object v7, v1

    .line 91
    sput-object v7, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineType:Lio/objectbox/Property;

    .line 92
    .line 93
    new-instance v1, Lio/objectbox/Property;

    .line 94
    .line 95
    const/4 v4, 0x5

    .line 96
    const-string v6, "lineWidth"

    .line 97
    .line 98
    const/4 v3, 0x4

    .line 99
    move-object v5, v13

    .line 100
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineWidth:Lio/objectbox/Property;

    .line 104
    .line 105
    filled-new-array {v0, v11, v12, v7, v1}, [Lio/objectbox/Property;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 110
    .line 111
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 112
    .line 113
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
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BackgroundLineConfigEntity"

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
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/16 v0, 0x18

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BackgroundLineConfigEntity"

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;

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
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
