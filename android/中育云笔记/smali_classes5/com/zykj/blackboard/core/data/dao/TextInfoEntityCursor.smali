.class public final Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$a;

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I

.field public static final r:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->m:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->n:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->o:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->p:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->l:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->q:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->m:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->r:I

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;->f:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->w(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->f:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)J
    .locals 70

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->record:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->b()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    if-eqz v10, :cond_1

    .line 38
    .line 39
    sget v2, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->q:I

    .line 40
    .line 41
    :goto_1
    move v9, v2

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    const/4 v2, 0x0

    .line 44
    goto :goto_1

    .line 45
    :goto_2
    iget-wide v4, v1, Lio/objectbox/Cursor;->d:J

    .line 46
    .line 47
    sget v17, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->r:I

    .line 48
    .line 49
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 50
    .line 51
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->f()J

    .line 52
    .line 53
    .line 54
    move-result-wide v18

    .line 55
    sget v20, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->n:I

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->a()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    int-to-long v2, v2

    .line 62
    sget v23, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->p:I

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->e()I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    int-to-long v6, v6

    .line 69
    sget v32, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->m:I

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->g()F

    .line 72
    .line 73
    .line 74
    move-result v33

    .line 75
    const/16 v34, 0x0

    .line 76
    .line 77
    const-wide/16 v35, 0x0

    .line 78
    .line 79
    move-wide/from16 v24, v6

    .line 80
    .line 81
    const-wide/16 v6, 0x0

    .line 82
    .line 83
    const/4 v8, 0x1

    .line 84
    const/4 v11, 0x0

    .line 85
    const/4 v12, 0x0

    .line 86
    const/4 v13, 0x0

    .line 87
    const/4 v14, 0x0

    .line 88
    const/4 v15, 0x0

    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const/16 v26, 0x0

    .line 92
    .line 93
    const/16 v27, 0x0

    .line 94
    .line 95
    const/16 v28, 0x0

    .line 96
    .line 97
    const/16 v29, 0x0

    .line 98
    .line 99
    const/16 v30, 0x0

    .line 100
    .line 101
    const/16 v31, 0x0

    .line 102
    .line 103
    move-wide/from16 v21, v2

    .line 104
    .line 105
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 106
    .line 107
    .line 108
    iget-wide v2, v1, Lio/objectbox/Cursor;->d:J

    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->c()J

    .line 111
    .line 112
    .line 113
    move-result-wide v39

    .line 114
    sget v65, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->o:I

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->f()F

    .line 117
    .line 118
    .line 119
    move-result v66

    .line 120
    const/16 v67, 0x0

    .line 121
    .line 122
    const-wide/16 v68, 0x0

    .line 123
    .line 124
    const/16 v41, 0x2

    .line 125
    .line 126
    const/16 v42, 0x0

    .line 127
    .line 128
    const/16 v43, 0x0

    .line 129
    .line 130
    const/16 v44, 0x0

    .line 131
    .line 132
    const/16 v45, 0x0

    .line 133
    .line 134
    const/16 v46, 0x0

    .line 135
    .line 136
    const/16 v47, 0x0

    .line 137
    .line 138
    const/16 v48, 0x0

    .line 139
    .line 140
    const/16 v49, 0x0

    .line 141
    .line 142
    const/16 v50, 0x0

    .line 143
    .line 144
    const-wide/16 v51, 0x0

    .line 145
    .line 146
    const/16 v53, 0x0

    .line 147
    .line 148
    const-wide/16 v54, 0x0

    .line 149
    .line 150
    const/16 v56, 0x0

    .line 151
    .line 152
    const-wide/16 v57, 0x0

    .line 153
    .line 154
    const/16 v59, 0x0

    .line 155
    .line 156
    const/16 v60, 0x0

    .line 157
    .line 158
    const/16 v61, 0x0

    .line 159
    .line 160
    const/16 v62, 0x0

    .line 161
    .line 162
    const/16 v63, 0x0

    .line 163
    .line 164
    const/16 v64, 0x0

    .line 165
    .line 166
    move-wide/from16 v37, v2

    .line 167
    .line 168
    invoke-static/range {v37 .. v69}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 169
    .line 170
    .line 171
    move-result-wide v2

    .line 172
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;->i(J)V

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/TextInfoEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;)V

    .line 176
    .line 177
    .line 178
    return-wide v2
.end method
