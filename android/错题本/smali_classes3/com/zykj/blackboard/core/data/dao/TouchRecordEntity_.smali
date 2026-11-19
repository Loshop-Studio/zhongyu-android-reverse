.class public final Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$TouchRecordEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
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

.field public static final __DB_NAME:Ljava/lang/String; = "TouchRecordEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0xa

.field public static final __ENTITY_NAME:Ljava/lang/String; = "TouchRecordEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$TouchRecordEntityIdGetter;
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation
.end field

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;

.field public static final fileName:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final record:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final recordId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final touchEventList:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final validate:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$TouchRecordEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$TouchRecordEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$TouchRecordEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->id:Lio/objectbox/Property;

    .line 43
    .line 44
    new-instance v1, Lio/objectbox/Property;

    .line 45
    .line 46
    const-class v5, Ljava/lang/String;

    .line 47
    .line 48
    const-string v6, "fileName"

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
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->fileName:Lio/objectbox/Property;

    .line 57
    .line 58
    new-instance v1, Lio/objectbox/Property;

    .line 59
    .line 60
    const-class v5, Ljava/lang/String;

    .line 61
    .line 62
    const-string v6, "validate"

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
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->validate:Lio/objectbox/Property;

    .line 71
    .line 72
    new-instance v1, Lio/objectbox/Property;

    .line 73
    .line 74
    const-string v6, "recordId"

    .line 75
    .line 76
    move-object v5, v7

    .line 77
    const/4 v7, 0x1

    .line 78
    const/4 v3, 0x3

    .line 79
    const/4 v4, 0x4

    .line 80
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 81
    .line 82
    .line 83
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->recordId:Lio/objectbox/Property;

    .line 84
    .line 85
    filled-new-array {v0, v8, v9, v1}, [Lio/objectbox/Property;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    sput-object v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 90
    .line 91
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 92
    .line 93
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 94
    .line 95
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/RecordEntity_;

    .line 96
    .line 97
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$1;

    .line 98
    .line 99
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$1;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-direct {v0, v2, v3, v1, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 103
    .line 104
    .line 105
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->record:Lio/objectbox/relation/RelationInfo;

    .line 106
    .line 107
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 108
    .line 109
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

    .line 110
    .line 111
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$2;

    .line 112
    .line 113
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$2;-><init>()V

    .line 114
    .line 115
    .line 116
    const/4 v4, 0x4

    .line 117
    invoke-direct {v0, v2, v1, v3, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;I)V

    .line 118
    .line 119
    .line 120
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->touchEventList:Lio/objectbox/relation/RelationInfo;

    .line 121
    .line 122
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
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TouchRecordEntity"

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
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/16 v0, 0xa

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TouchRecordEntity"

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_$TouchRecordEntityIdGetter;

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
            "Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
