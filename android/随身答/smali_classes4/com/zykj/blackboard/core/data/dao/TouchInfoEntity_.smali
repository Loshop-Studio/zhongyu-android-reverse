.class public final Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Lc8/b;

.field public static final c:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

.field public static final d:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;

.field public static final e:Lio/objectbox/Property;

.field public static final f:Lio/objectbox/Property;

.field public static final g:Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/Property;

.field public static final j:[Lio/objectbox/Property;

.field public static final k:Lio/objectbox/Property;

.field public static final l:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->a:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->b:Lc8/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->c:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->d:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->e:Lio/objectbox/Property;

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
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->f:Lio/objectbox/Property;

    .line 55
    .line 56
    new-instance v1, Lio/objectbox/Property;

    .line 57
    .line 58
    const-string v6, "x"

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
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->g:Lio/objectbox/Property;

    .line 69
    .line 70
    new-instance v1, Lio/objectbox/Property;

    .line 71
    .line 72
    const/4 v4, 0x4

    .line 73
    const-string v6, "y"

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
    sput-object v10, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->h:Lio/objectbox/Property;

    .line 81
    .line 82
    new-instance v1, Lio/objectbox/Property;

    .line 83
    .line 84
    const-string v6, "recordId"

    .line 85
    .line 86
    move-object v5, v7

    .line 87
    const/4 v7, 0x1

    .line 88
    const/4 v3, 0x4

    .line 89
    const/4 v4, 0x6

    .line 90
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 91
    .line 92
    .line 93
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->i:Lio/objectbox/Property;

    .line 94
    .line 95
    filled-new-array {v0, v8, v9, v10, v1}, [Lio/objectbox/Property;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    sput-object v3, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->j:[Lio/objectbox/Property;

    .line 100
    .line 101
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->k:Lio/objectbox/Property;

    .line 102
    .line 103
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 104
    .line 105
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->d:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

    .line 106
    .line 107
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$1;

    .line 108
    .line 109
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$1;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-direct {v0, v2, v3, v1, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 113
    .line 114
    .line 115
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->l:Lio/objectbox/relation/RelationInfo;

    .line 116
    .line 117
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
.method public d()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->j:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lc8/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->b:Lc8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    const/16 v0, 0xd

    return v0
.end method

.method public l()Lc8/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->c:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TouchInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TouchInfoEntity"

    .line 2
    .line 3
    return-object v0
.end method
