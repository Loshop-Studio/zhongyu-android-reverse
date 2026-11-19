.class public final Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I

.field public static final r:I

.field public static final s:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->e:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->m:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->n:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->o:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->p:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->l:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->q:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->m:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->r:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->n:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->s:I

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;->f:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->w(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->f:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)J
    .locals 63

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->record:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

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
    sget v9, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->s:I

    .line 36
    .line 37
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->record:Lio/objectbox/relation/ToOne;

    .line 38
    .line 39
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->f()J

    .line 40
    .line 41
    .line 42
    move-result-wide v10

    .line 43
    sget v12, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->n:I

    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->a()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-long v13, v2

    .line 50
    sget v15, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->m:I

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->i()F

    .line 53
    .line 54
    .line 55
    move-result v16

    .line 56
    sget v17, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->o:I

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->e()F

    .line 59
    .line 60
    .line 61
    move-result v18

    .line 62
    sget v19, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->p:I

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->c()F

    .line 65
    .line 66
    .line 67
    move-result v20

    .line 68
    const/16 v27, 0x0

    .line 69
    .line 70
    const-wide/16 v28, 0x0

    .line 71
    .line 72
    const-wide/16 v6, 0x0

    .line 73
    .line 74
    const/4 v8, 0x1

    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    const-wide/16 v22, 0x0

    .line 78
    .line 79
    const/16 v24, 0x0

    .line 80
    .line 81
    const-wide/16 v25, 0x0

    .line 82
    .line 83
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 84
    .line 85
    .line 86
    iget-wide v2, v1, Lio/objectbox/Cursor;->d:J

    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->b()J

    .line 89
    .line 90
    .line 91
    move-result-wide v32

    .line 92
    sget v43, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->q:I

    .line 93
    .line 94
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->f()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    int-to-long v4, v4

    .line 99
    sget v58, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->r:I

    .line 100
    .line 101
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->g()F

    .line 102
    .line 103
    .line 104
    move-result v59

    .line 105
    const/16 v60, 0x0

    .line 106
    .line 107
    const-wide/16 v61, 0x0

    .line 108
    .line 109
    const/16 v34, 0x2

    .line 110
    .line 111
    const/16 v35, 0x0

    .line 112
    .line 113
    const/16 v36, 0x0

    .line 114
    .line 115
    const/16 v37, 0x0

    .line 116
    .line 117
    const/16 v38, 0x0

    .line 118
    .line 119
    const/16 v39, 0x0

    .line 120
    .line 121
    const/16 v40, 0x0

    .line 122
    .line 123
    const/16 v41, 0x0

    .line 124
    .line 125
    const/16 v42, 0x0

    .line 126
    .line 127
    const/16 v46, 0x0

    .line 128
    .line 129
    const-wide/16 v47, 0x0

    .line 130
    .line 131
    const/16 v49, 0x0

    .line 132
    .line 133
    const-wide/16 v50, 0x0

    .line 134
    .line 135
    const/16 v52, 0x0

    .line 136
    .line 137
    const/16 v53, 0x0

    .line 138
    .line 139
    const/16 v54, 0x0

    .line 140
    .line 141
    const/16 v55, 0x0

    .line 142
    .line 143
    const/16 v56, 0x0

    .line 144
    .line 145
    const/16 v57, 0x0

    .line 146
    .line 147
    move-wide/from16 v30, v2

    .line 148
    .line 149
    move-wide/from16 v44, v4

    .line 150
    .line 151
    invoke-static/range {v30 .. v62}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 152
    .line 153
    .line 154
    move-result-wide v2

    .line 155
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->k(J)V

    .line 156
    .line 157
    .line 158
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/TouchEventEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;->touchInfoList:Lio/objectbox/relation/ToMany;

    .line 162
    .line 163
    const-class v4, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 164
    .line 165
    invoke-virtual {v1, v0, v4}, Lio/objectbox/Cursor;->a(Ljava/util/List;Ljava/lang/Class;)V

    .line 166
    .line 167
    .line 168
    return-wide v2
.end method
