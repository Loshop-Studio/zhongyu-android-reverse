.class public final Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

.field public static final k:I

.field public static final l:I

.field public static final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->c:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->f:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->k:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->g:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->l:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->h:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->m:I

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;->d:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p1

    .line 5
    move-wide v2, p2

    .line 6
    move-object v5, p4

    .line 7
    invoke-direct/range {v0 .. v5}, Lio/objectbox/Cursor;-><init>(Lio/objectbox/Transaction;JLio/objectbox/EntityInfo;Lio/objectbox/BoxStore;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->s(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public bridge synthetic p(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->t(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final r(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final t(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)J
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->record:Lio/objectbox/relation/ToOne;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->u()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    const-class v3, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->l(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->t(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_0
    :goto_0
    iget-wide v4, v1, Lio/objectbox/Cursor;->b:J

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    sget v9, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->m:I

    .line 40
    .line 41
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->record:Lio/objectbox/relation/ToOne;

    .line 42
    .line 43
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->n()J

    .line 44
    .line 45
    .line 46
    move-result-wide v10

    .line 47
    sget v15, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->k:I

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->c()F

    .line 50
    .line 51
    .line 52
    move-result v16

    .line 53
    sget v17, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->l:I

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->d()F

    .line 56
    .line 57
    .line 58
    move-result v18

    .line 59
    const/16 v27, 0x0

    .line 60
    .line 61
    const-wide/16 v28, 0x0

    .line 62
    .line 63
    const/4 v8, 0x3

    .line 64
    const/4 v12, 0x0

    .line 65
    const-wide/16 v13, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const-wide/16 v22, 0x0

    .line 74
    .line 75
    const/16 v24, 0x0

    .line 76
    .line 77
    const-wide/16 v25, 0x0

    .line 78
    .line 79
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 80
    .line 81
    .line 82
    move-result-wide v2

    .line 83
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;->f(J)V

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntityCursor;->r(Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;)V

    .line 87
    .line 88
    .line 89
    return-wide v2
.end method
