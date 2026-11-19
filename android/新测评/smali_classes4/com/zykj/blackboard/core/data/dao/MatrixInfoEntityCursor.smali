.class public final Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

.field public static final k:I

.field public static final l:I

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I

.field public static final r:I

.field public static final s:I

.field public static final t:I

.field public static final u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->c:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->f:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->k:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->g:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->l:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->h:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->m:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->i:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->n:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->j:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->o:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->k:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->p:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->l:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->q:I

    .line 46
    .line 47
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->m:Lio/objectbox/Property;

    .line 48
    .line 49
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 50
    .line 51
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->r:I

    .line 52
    .line 53
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->n:Lio/objectbox/Property;

    .line 54
    .line 55
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 56
    .line 57
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->s:I

    .line 58
    .line 59
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->o:Lio/objectbox/Property;

    .line 60
    .line 61
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 62
    .line 63
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->t:I

    .line 64
    .line 65
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->p:Lio/objectbox/Property;

    .line 66
    .line 67
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 68
    .line 69
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->u:I

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->d:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->s(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->t(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final r(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final t(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J
    .locals 56

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->r()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    .line 16
    .line 17
    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->l(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    :try_start_0
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->q(Lio/objectbox/Cursor;)V
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
    sget v9, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->k:I

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->a()J

    .line 38
    .line 39
    .line 40
    move-result-wide v10

    .line 41
    sget v12, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->u:I

    .line 42
    .line 43
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 44
    .line 45
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->m()J

    .line 46
    .line 47
    .line 48
    move-result-wide v13

    .line 49
    sget v15, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->l:I

    .line 50
    .line 51
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->g()F

    .line 52
    .line 53
    .line 54
    move-result v16

    .line 55
    sget v17, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->m:I

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->i()F

    .line 58
    .line 59
    .line 60
    move-result v18

    .line 61
    sget v19, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->n:I

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->k()F

    .line 64
    .line 65
    .line 66
    move-result v20

    .line 67
    const/16 v27, 0x0

    .line 68
    .line 69
    const-wide/16 v28, 0x0

    .line 70
    .line 71
    const-wide/16 v6, 0x0

    .line 72
    .line 73
    const/4 v8, 0x1

    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const-wide/16 v22, 0x0

    .line 77
    .line 78
    const/16 v24, 0x0

    .line 79
    .line 80
    const-wide/16 v25, 0x0

    .line 81
    .line 82
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 83
    .line 84
    .line 85
    iget-wide v2, v1, Lio/objectbox/Cursor;->b:J

    .line 86
    .line 87
    sget v41, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->o:I

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->j()F

    .line 90
    .line 91
    .line 92
    move-result v42

    .line 93
    sget v43, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->p:I

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->h()F

    .line 96
    .line 97
    .line 98
    move-result v44

    .line 99
    sget v45, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->q:I

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->l()F

    .line 102
    .line 103
    .line 104
    move-result v46

    .line 105
    const/16 v53, 0x0

    .line 106
    .line 107
    const-wide/16 v54, 0x0

    .line 108
    .line 109
    const-wide/16 v32, 0x0

    .line 110
    .line 111
    const/16 v34, 0x0

    .line 112
    .line 113
    const/16 v35, 0x0

    .line 114
    .line 115
    const-wide/16 v36, 0x0

    .line 116
    .line 117
    const/16 v38, 0x0

    .line 118
    .line 119
    const-wide/16 v39, 0x0

    .line 120
    .line 121
    const/16 v47, 0x0

    .line 122
    .line 123
    const-wide/16 v48, 0x0

    .line 124
    .line 125
    const/16 v50, 0x0

    .line 126
    .line 127
    const-wide/16 v51, 0x0

    .line 128
    .line 129
    move-wide/from16 v30, v2

    .line 130
    .line 131
    invoke-static/range {v30 .. v55}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 132
    .line 133
    .line 134
    iget-wide v4, v1, Lio/objectbox/Cursor;->b:J

    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->b()J

    .line 137
    .line 138
    .line 139
    move-result-wide v6

    .line 140
    sget v15, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->r:I

    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->c()F

    .line 143
    .line 144
    .line 145
    move-result v16

    .line 146
    sget v17, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->s:I

    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->d()F

    .line 149
    .line 150
    .line 151
    move-result v18

    .line 152
    sget v19, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->t:I

    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->e()F

    .line 155
    .line 156
    .line 157
    move-result v20

    .line 158
    const/4 v8, 0x2

    .line 159
    const/4 v9, 0x0

    .line 160
    const-wide/16 v10, 0x0

    .line 161
    .line 162
    const/4 v12, 0x0

    .line 163
    const-wide/16 v13, 0x0

    .line 164
    .line 165
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 166
    .line 167
    .line 168
    move-result-wide v2

    .line 169
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->n(J)V

    .line 170
    .line 171
    .line 172
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->r(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)V

    .line 173
    .line 174
    .line 175
    return-wide v2
.end method
