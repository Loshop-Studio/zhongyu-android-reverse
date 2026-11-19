.class public final Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$a;

.field public static final l:I

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I


# instance fields
.field public final j:Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->c:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->k:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->f:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->l:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->g:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->m:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->h:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->n:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->i:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->o:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->j:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->p:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->k:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->q:I

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->d:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;

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
    new-instance p1, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->s(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->t(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final r(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->k:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final t(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->record:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->b()[B

    .line 34
    .line 35
    .line 36
    move-result-object v16

    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v16, :cond_1

    .line 39
    .line 40
    sget v3, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->p:I

    .line 41
    .line 42
    move v15, v3

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move v15, v2

    .line 45
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->a()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    sget v4, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->o:I

    .line 52
    .line 53
    move/from16 v26, v4

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move/from16 v26, v2

    .line 57
    .line 58
    :goto_2
    iget-wide v4, v1, Lio/objectbox/Cursor;->b:J

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->e()J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    sget v17, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->l:I

    .line 65
    .line 66
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->c()J

    .line 67
    .line 68
    .line 69
    move-result-wide v18

    .line 70
    sget v20, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->m:I

    .line 71
    .line 72
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->d()J

    .line 73
    .line 74
    .line 75
    move-result-wide v21

    .line 76
    sget v23, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->q:I

    .line 77
    .line 78
    iget-object v8, v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 79
    .line 80
    invoke-virtual {v8}, Lio/objectbox/relation/ToOne;->n()J

    .line 81
    .line 82
    .line 83
    move-result-wide v24

    .line 84
    if-eqz v26, :cond_3

    .line 85
    .line 86
    iget-object v2, v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;->convertToDatabaseValue(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    :cond_3
    move/from16 v27, v2

    .line 97
    .line 98
    sget v28, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->n:I

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->g()Z

    .line 101
    .line 102
    .line 103
    move-result v29

    .line 104
    const/16 v34, 0x0

    .line 105
    .line 106
    const-wide/16 v35, 0x0

    .line 107
    .line 108
    const/4 v8, 0x3

    .line 109
    const/4 v9, 0x0

    .line 110
    const/4 v10, 0x0

    .line 111
    const/4 v11, 0x0

    .line 112
    const/4 v12, 0x0

    .line 113
    const/4 v13, 0x0

    .line 114
    const/4 v14, 0x0

    .line 115
    const/16 v30, 0x0

    .line 116
    .line 117
    const/16 v31, 0x0

    .line 118
    .line 119
    const/16 v32, 0x0

    .line 120
    .line 121
    const/16 v33, 0x0

    .line 122
    .line 123
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 124
    .line 125
    .line 126
    move-result-wide v2

    .line 127
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->i(J)V

    .line 128
    .line 129
    .line 130
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->r(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    .line 131
    .line 132
    .line 133
    return-wide v2
.end method
