.class public final Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->m:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->n:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->o:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->p:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->l:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->q:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->m:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->r:I

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;->f:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->w(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->f:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)J
    .locals 70

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->record:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

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
    sget v17, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->r:I

    .line 36
    .line 37
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 38
    .line 39
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->f()J

    .line 40
    .line 41
    .line 42
    move-result-wide v18

    .line 43
    sget v20, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->n:I

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->a()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-long v2, v2

    .line 50
    sget v23, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->p:I

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->f()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    int-to-long v6, v6

    .line 57
    sget v26, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->q:I

    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->b()I

    .line 60
    .line 61
    .line 62
    move-result v27

    .line 63
    sget v32, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->m:I

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->h()F

    .line 66
    .line 67
    .line 68
    move-result v33

    .line 69
    const/16 v34, 0x0

    .line 70
    .line 71
    const-wide/16 v35, 0x0

    .line 72
    .line 73
    move-wide/from16 v24, v6

    .line 74
    .line 75
    const-wide/16 v6, 0x0

    .line 76
    .line 77
    const/4 v8, 0x1

    .line 78
    const/4 v9, 0x0

    .line 79
    const/4 v10, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v12, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    const/4 v14, 0x0

    .line 84
    const/4 v15, 0x0

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const/16 v28, 0x0

    .line 88
    .line 89
    const/16 v29, 0x0

    .line 90
    .line 91
    const/16 v30, 0x0

    .line 92
    .line 93
    const/16 v31, 0x0

    .line 94
    .line 95
    move-wide/from16 v21, v2

    .line 96
    .line 97
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 98
    .line 99
    .line 100
    iget-wide v2, v1, Lio/objectbox/Cursor;->d:J

    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->c()J

    .line 103
    .line 104
    .line 105
    move-result-wide v39

    .line 106
    sget v65, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->o:I

    .line 107
    .line 108
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->g()F

    .line 109
    .line 110
    .line 111
    move-result v66

    .line 112
    const/16 v67, 0x0

    .line 113
    .line 114
    const-wide/16 v68, 0x0

    .line 115
    .line 116
    const/16 v41, 0x2

    .line 117
    .line 118
    const/16 v42, 0x0

    .line 119
    .line 120
    const/16 v43, 0x0

    .line 121
    .line 122
    const/16 v44, 0x0

    .line 123
    .line 124
    const/16 v45, 0x0

    .line 125
    .line 126
    const/16 v46, 0x0

    .line 127
    .line 128
    const/16 v47, 0x0

    .line 129
    .line 130
    const/16 v48, 0x0

    .line 131
    .line 132
    const/16 v49, 0x0

    .line 133
    .line 134
    const/16 v50, 0x0

    .line 135
    .line 136
    const-wide/16 v51, 0x0

    .line 137
    .line 138
    const/16 v53, 0x0

    .line 139
    .line 140
    const-wide/16 v54, 0x0

    .line 141
    .line 142
    const/16 v56, 0x0

    .line 143
    .line 144
    const-wide/16 v57, 0x0

    .line 145
    .line 146
    const/16 v59, 0x0

    .line 147
    .line 148
    const/16 v60, 0x0

    .line 149
    .line 150
    const/16 v61, 0x0

    .line 151
    .line 152
    const/16 v62, 0x0

    .line 153
    .line 154
    const/16 v63, 0x0

    .line 155
    .line 156
    const/16 v64, 0x0

    .line 157
    .line 158
    move-wide/from16 v37, v2

    .line 159
    .line 160
    invoke-static/range {v37 .. v69}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->j(J)V

    .line 165
    .line 166
    .line 167
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;)V

    .line 168
    .line 169
    .line 170
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;->pointList:Lio/objectbox/relation/ToMany;

    .line 171
    .line 172
    const-class v4, Lcom/zykj/blackboard/core/data/dao/GeometryPointFEntity;

    .line 173
    .line 174
    invoke-virtual {v1, v0, v4}, Lio/objectbox/Cursor;->a(Ljava/util/List;Ljava/lang/Class;)V

    .line 175
    .line 176
    .line 177
    return-wide v2
.end method
