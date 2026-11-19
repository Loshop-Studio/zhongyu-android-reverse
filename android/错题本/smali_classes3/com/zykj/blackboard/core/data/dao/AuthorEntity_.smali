.class public final Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final __ALL_PROPERTIES:[Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
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

.field public static final __DB_NAME:Ljava/lang/String; = "AuthorEntity"

.field public static final __ENTITY_CLASS:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __ENTITY_ID:I = 0x13

.field public static final __ENTITY_NAME:Ljava/lang/String; = "AuthorEntity"

.field static final __ID_GETTER:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;
    .annotation build Lio/objectbox/annotation/apihint/Internal;
    .end annotation
.end field

.field public static final __ID_PROPERTY:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final __INSTANCE:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;

.field public static final authorId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final authorName:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final duration:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final id:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final schoolId:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final startTime:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field

.field public static final url:Lio/objectbox/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/objectbox/Property<",
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor$Factory;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor$Factory;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->id:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const-class v5, Ljava/lang/String;

    .line 46
    .line 47
    const-string v6, "authorName"

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
    move-object v7, v1

    .line 55
    sput-object v7, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->authorName:Lio/objectbox/Property;

    .line 56
    .line 57
    new-instance v1, Lio/objectbox/Property;

    .line 58
    .line 59
    const-class v5, Ljava/lang/String;

    .line 60
    .line 61
    const-string v6, "authorId"

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    const/4 v4, 0x3

    .line 65
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    move-object v8, v1

    .line 69
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->authorId:Lio/objectbox/Property;

    .line 70
    .line 71
    new-instance v1, Lio/objectbox/Property;

    .line 72
    .line 73
    const-class v5, Ljava/lang/String;

    .line 74
    .line 75
    const-string v6, "schoolId"

    .line 76
    .line 77
    const/4 v3, 0x3

    .line 78
    const/4 v4, 0x4

    .line 79
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    move-object v9, v1

    .line 83
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->schoolId:Lio/objectbox/Property;

    .line 84
    .line 85
    new-instance v1, Lio/objectbox/Property;

    .line 86
    .line 87
    const-class v5, Ljava/lang/String;

    .line 88
    .line 89
    const-string v6, "url"

    .line 90
    .line 91
    const/4 v3, 0x4

    .line 92
    const/4 v4, 0x5

    .line 93
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    move-object v10, v7

    .line 97
    move-object v7, v1

    .line 98
    sput-object v7, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->url:Lio/objectbox/Property;

    .line 99
    .line 100
    new-instance v1, Lio/objectbox/Property;

    .line 101
    .line 102
    const-class v5, Ljava/lang/Long;

    .line 103
    .line 104
    const-string v6, "startTime"

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
    move-object v11, v8

    .line 112
    move-object v8, v1

    .line 113
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->startTime:Lio/objectbox/Property;

    .line 114
    .line 115
    new-instance v1, Lio/objectbox/Property;

    .line 116
    .line 117
    const-class v5, Ljava/lang/Long;

    .line 118
    .line 119
    const-string v6, "duration"

    .line 120
    .line 121
    const/4 v3, 0x6

    .line 122
    const/16 v4, 0x8

    .line 123
    .line 124
    invoke-direct/range {v1 .. v6}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->duration:Lio/objectbox/Property;

    .line 128
    .line 129
    move-object v3, v0

    .line 130
    move-object v6, v9

    .line 131
    move-object v4, v10

    .line 132
    move-object v5, v11

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

    .line 140
    .line 141
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 142
    .line 143
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
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ALL_PROPERTIES:[Lio/objectbox/Property;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__CURSOR_FACTORY:Lm5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDbName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "AuthorEntity"

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
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ENTITY_CLASS:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEntityId()I
    .locals 1

    const/16 v0, 0x13

    return v0
.end method

.method public getEntityName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "AuthorEntity"

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$AuthorEntityIdGetter;

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
            "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->__ID_PROPERTY:Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method
