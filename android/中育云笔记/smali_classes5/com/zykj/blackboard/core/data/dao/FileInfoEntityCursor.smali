.class public final Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->m:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->n:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->o:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->p:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->l:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->q:I

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;->f:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->w(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->f:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)J
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->record:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->a()Ljava/lang/String;

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
    sget v3, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->m:I

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->e()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v12

    .line 49
    if-eqz v12, :cond_2

    .line 50
    .line 51
    sget v2, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->p:I

    .line 52
    .line 53
    :cond_2
    move v11, v2

    .line 54
    iget-wide v4, v1, Lio/objectbox/Cursor;->d:J

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->c()J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    sget v17, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->q:I

    .line 61
    .line 62
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 63
    .line 64
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->f()J

    .line 65
    .line 66
    .line 67
    move-result-wide v18

    .line 68
    sget v20, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->n:I

    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->f()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    int-to-long v2, v2

    .line 75
    sget v23, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->o:I

    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->b()I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    int-to-long v13, v8

    .line 82
    const/16 v34, 0x0

    .line 83
    .line 84
    const-wide/16 v35, 0x0

    .line 85
    .line 86
    const/4 v8, 0x3

    .line 87
    move-wide/from16 v24, v13

    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const/4 v14, 0x0

    .line 91
    const/4 v15, 0x0

    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    const/16 v26, 0x0

    .line 95
    .line 96
    const/16 v27, 0x0

    .line 97
    .line 98
    const/16 v28, 0x0

    .line 99
    .line 100
    const/16 v29, 0x0

    .line 101
    .line 102
    const/16 v30, 0x0

    .line 103
    .line 104
    const/16 v31, 0x0

    .line 105
    .line 106
    const/16 v32, 0x0

    .line 107
    .line 108
    const/16 v33, 0x0

    .line 109
    .line 110
    move-wide/from16 v21, v2

    .line 111
    .line 112
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 113
    .line 114
    .line 115
    move-result-wide v2

    .line 116
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->h(J)V

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;)V

    .line 120
    .line 121
    .line 122
    return-wide v2
.end method
