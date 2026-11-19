.class public final Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
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

.field public static final __DB_NAME:Ljava/lang/String; = "BlackBoardEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0xc

.field public static final __ENTITY_NAME:Ljava/lang/String; = "BlackBoardEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;

.field public static final dir:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final pages:Lio/objectbox/relation/RelationInfo;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/relation/RelationInfo<",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__CURSOR_FACTORY:Ln6/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->id:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const-class v5, Ljava/lang/String;

    .line 46
    .line 47
    const-string v6, "dir"

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    const/4 v4, 0x2

    .line 51
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 55
    .line 56
    filled-new-array {v0, v1}, [Lio/objectbox/Property;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 61
    .line 62
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 63
    .line 64
    new-instance v1, Lio/objectbox/relation/RelationInfo;

    .line 65
    .line 66
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

    .line 67
    .line 68
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$1;

    .line 69
    .line 70
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$1;-><init>()V

    .line 71
    .line 72
    .line 73
    sget-object v5, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->blackBoardEntityId:Lio/objectbox/Property;

    .line 74
    .line 75
    new-instance v6, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$2;

    .line 76
    .line 77
    invoke-direct {v6}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$2;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-direct/range {v1 .. v6}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 81
    .line 82
    .line 83
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->pages:Lio/objectbox/relation/RelationInfo;

    .line 84
    .line 85
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
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__CURSOR_FACTORY:Ln6/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BlackBoardEntity"

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
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "BlackBoardEntity"

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

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
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
