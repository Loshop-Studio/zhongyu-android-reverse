.class public final Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_$a;

.field public static final k:I

.field public static final l:I

.field public static final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->c:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->f:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->k:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->g:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->l:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->h:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->m:I

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;->d:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->s(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->t(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final r(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final t(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)J
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->record:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->b()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v10, :cond_1

    .line 39
    .line 40
    sget v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->k:I

    .line 41
    .line 42
    move v9, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v9, v2

    .line 45
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->d()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    if-eqz v12, :cond_2

    .line 50
    .line 51
    sget v2, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->l:I

    .line 52
    .line 53
    :cond_2
    move v11, v2

    .line 54
    iget-wide v4, v1, Lio/objectbox/Cursor;->b:J

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->c()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    sget v17, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->m:I

    .line 61
    .line 62
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->record:Lio/objectbox/relation/ToOne;

    .line 63
    .line 64
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->n()J

    .line 65
    .line 66
    .line 67
    move-result-wide v18

    .line 68
    const/16 v34, 0x0

    .line 69
    .line 70
    const-wide/16 v35, 0x0

    .line 71
    .line 72
    const/4 v8, 0x3

    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v14, 0x0

    .line 75
    const/4 v15, 0x0

    .line 76
    const/16 v16, 0x0

    .line 77
    .line 78
    const/16 v20, 0x0

    .line 79
    .line 80
    const-wide/16 v21, 0x0

    .line 81
    .line 82
    const/16 v23, 0x0

    .line 83
    .line 84
    const-wide/16 v24, 0x0

    .line 85
    .line 86
    const/16 v26, 0x0

    .line 87
    .line 88
    const/16 v27, 0x0

    .line 89
    .line 90
    const/16 v28, 0x0

    .line 91
    .line 92
    const/16 v29, 0x0

    .line 93
    .line 94
    const/16 v30, 0x0

    .line 95
    .line 96
    const/16 v31, 0x0

    .line 97
    .line 98
    const/16 v32, 0x0

    .line 99
    .line 100
    const/16 v33, 0x0

    .line 101
    .line 102
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->f(J)V

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntityCursor;->r(Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;)V

    .line 110
    .line 111
    .line 112
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->fileInfoEntity:Lio/objectbox/relation/ToMany;

    .line 113
    .line 114
    const-class v4, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 115
    .line 116
    invoke-virtual {v1, v0, v4}, Lio/objectbox/Cursor;->a(Ljava/util/List;Ljava/lang/Class;)V

    .line 117
    .line 118
    .line 119
    return-wide v2
.end method
