.class public final Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Lc8/b;

.field public static final c:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

.field public static final d:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;

.field public static final e:Lio/objectbox/Property;

.field public static final f:Lio/objectbox/Property;

.field public static final g:Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:[Lio/objectbox/Property;

.field public static final j:Lio/objectbox/Property;

.field public static final k:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->a:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->b:Lc8/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->c:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->d:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->e:Lio/objectbox/Property;

    .line 43
    .line 44
    new-instance v1, Lio/objectbox/Property;

    .line 45
    .line 46
    const-string v6, "x"

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
    sput-object v8, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->f:Lio/objectbox/Property;

    .line 57
    .line 58
    new-instance v1, Lio/objectbox/Property;

    .line 59
    .line 60
    const/4 v4, 0x3

    .line 61
    const-string v6, "y"

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
    sput-object v9, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->g:Lio/objectbox/Property;

    .line 69
    .line 70
    new-instance v1, Lio/objectbox/Property;

    .line 71
    .line 72
    const-string v6, "recordId"

    .line 73
    .line 74
    move-object v5, v7

    .line 75
    const/4 v7, 0x1

    .line 76
    const/4 v3, 0x3

    .line 77
    const/4 v4, 0x4

    .line 78
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 79
    .line 80
    .line 81
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->h:Lio/objectbox/Property;

    .line 82
    .line 83
    filled-new-array {v0, v8, v9, v1}, [Lio/objectbox/Property;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    sput-object v3, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->i:[Lio/objectbox/Property;

    .line 88
    .line 89
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->j:Lio/objectbox/Property;

    .line 90
    .line 91
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 92
    .line 93
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->d:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;

    .line 94
    .line 95
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$1;

    .line 96
    .line 97
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$1;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-direct {v0, v2, v3, v1, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 101
    .line 102
    .line 103
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->k:Lio/objectbox/relation/RelationInfo;

    .line 104
    .line 105
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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->i:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Lc8/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->b:Lc8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public j()I
    .locals 1

    .line 1
    const/16 v0, 0x17

    return v0
.end method

.method public l()Lc8/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->c:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "GeometryPointFEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "GeometryPointFEntity"

    .line 2
    .line 3
    return-object v0
.end method
