.class public final Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/EntityInfo;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/EntityInfo<",
        "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/Class;

.field public static final b:Lr8/b;

.field public static final c:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

.field public static final d:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;

.field public static final e:Lio/objectbox/Property;

.field public static final f:Lio/objectbox/Property;

.field public static final g:[Lio/objectbox/Property;

.field public static final h:Lio/objectbox/Property;

.field public static final i:Lio/objectbox/relation/RelationInfo;

.field public static final j:Lio/objectbox/relation/RelationInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-class v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->a:Ljava/lang/Class;

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->b:Lr8/b;

    .line 11
    .line 12
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

    .line 13
    .line 14
    invoke-direct {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->c:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

    .line 18
    .line 19
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;

    .line 20
    .line 21
    invoke-direct {v2}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v2, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->d:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;

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
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->e:Lio/objectbox/Property;

    .line 42
    .line 43
    new-instance v1, Lio/objectbox/Property;

    .line 44
    .line 45
    const-string v6, "recordId"

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    const/4 v4, 0x2

    .line 49
    invoke-direct/range {v1 .. v7}, Lio/objectbox/Property;-><init>(Lio/objectbox/EntityInfo;IILjava/lang/Class;Ljava/lang/String;Z)V

    .line 50
    .line 51
    .line 52
    sput-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->f:Lio/objectbox/Property;

    .line 53
    .line 54
    filled-new-array {v0, v1}, [Lio/objectbox/Property;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    sput-object v3, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->g:[Lio/objectbox/Property;

    .line 59
    .line 60
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->h:Lio/objectbox/Property;

    .line 61
    .line 62
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 63
    .line 64
    sget-object v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity_;

    .line 65
    .line 66
    new-instance v4, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$1;

    .line 67
    .line 68
    invoke-direct {v4}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$1;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v2, v3, v1, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/Property;Lio/objectbox/internal/ToOneGetter;)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->i:Lio/objectbox/relation/RelationInfo;

    .line 75
    .line 76
    new-instance v0, Lio/objectbox/relation/RelationInfo;

    .line 77
    .line 78
    sget-object v1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->d:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;

    .line 79
    .line 80
    new-instance v3, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$2;

    .line 81
    .line 82
    invoke-direct {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$2;-><init>()V

    .line 83
    .line 84
    .line 85
    const/4 v4, 0x5

    .line 86
    invoke-direct {v0, v2, v1, v3, v4}, Lio/objectbox/relation/RelationInfo;-><init>(Lio/objectbox/EntityInfo;Lio/objectbox/EntityInfo;Lio/objectbox/internal/ToManyGetter;I)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->j:Lio/objectbox/relation/RelationInfo;

    .line 90
    .line 91
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
.method public c()[Lio/objectbox/Property;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->g:[Lio/objectbox/Property;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()Ljava/lang/Class;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->a:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Lr8/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->b:Lr8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()I
    .locals 1

    .line 1
    const/16 v0, 0xf

    return v0
.end method

.method public i()Lr8/c;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->c:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MatrixEventEntity"

    .line 2
    .line 3
    return-object v0
.end method

.method public p()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "MatrixEventEntity"

    .line 2
    .line 3
    return-object v0
.end method
