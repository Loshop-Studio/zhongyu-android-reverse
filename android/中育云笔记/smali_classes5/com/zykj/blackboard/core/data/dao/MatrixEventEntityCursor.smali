.class public final Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

.field public static final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->e:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;->m:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;->f:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public bridge synthetic s(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;->w(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->f:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)J
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->record:Lio/objectbox/relation/ToOne;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->m()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->l(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->k(Lio/objectbox/Cursor;)V
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
    iget-wide v4, v1, Lio/objectbox/Cursor;->d:J

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->a()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    sget v17, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;->m:I

    .line 40
    .line 41
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->record:Lio/objectbox/relation/ToOne;

    .line 42
    .line 43
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->f()J

    .line 44
    .line 45
    .line 46
    move-result-wide v18

    .line 47
    const/16 v34, 0x0

    .line 48
    .line 49
    const-wide/16 v35, 0x0

    .line 50
    .line 51
    const/4 v8, 0x3

    .line 52
    const/4 v9, 0x0

    .line 53
    const/4 v10, 0x0

    .line 54
    const/4 v11, 0x0

    .line 55
    const/4 v12, 0x0

    .line 56
    const/4 v13, 0x0

    .line 57
    const/4 v14, 0x0

    .line 58
    const/4 v15, 0x0

    .line 59
    const/16 v16, 0x0

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    .line 63
    const-wide/16 v21, 0x0

    .line 64
    .line 65
    const/16 v23, 0x0

    .line 66
    .line 67
    const-wide/16 v24, 0x0

    .line 68
    .line 69
    const/16 v26, 0x0

    .line 70
    .line 71
    const/16 v27, 0x0

    .line 72
    .line 73
    const/16 v28, 0x0

    .line 74
    .line 75
    const/16 v29, 0x0

    .line 76
    .line 77
    const/16 v30, 0x0

    .line 78
    .line 79
    const/16 v31, 0x0

    .line 80
    .line 81
    const/16 v32, 0x0

    .line 82
    .line 83
    const/16 v33, 0x0

    .line 84
    .line 85
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->e(J)V

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;->matrixInfo:Lio/objectbox/relation/ToMany;

    .line 96
    .line 97
    const-class v4, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 98
    .line 99
    invoke-virtual {v1, v0, v4}, Lio/objectbox/Cursor;->a(Ljava/util/List;Ljava/lang/Class;)V

    .line 100
    .line 101
    .line 102
    return-wide v2
.end method
