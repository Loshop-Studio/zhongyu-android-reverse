.class public final Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/PageEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final j:Lcom/zykj/blackboard/core/data/dao/PageEntity_$a;

.field public static final k:I

.field public static final l:I

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->c:Lcom/zykj/blackboard/core/data/dao/PageEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/PageEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->f:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->k:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->g:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->l:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->h:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->m:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->i:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->n:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->j:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->o:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->k:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->p:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->l:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->q:I

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->d:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->s(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->t(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final r(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->d:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/PageEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final s(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->j:Lcom/zykj/blackboard/core/data/dao/PageEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final t(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->blackBoardEntity:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

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
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->recordEntity:Lio/objectbox/relation/ToOne;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->u()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_1

    .line 42
    .line 43
    const-class v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 44
    .line 45
    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->l(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    :try_start_1
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->t(Lio/objectbox/Cursor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :catchall_1
    move-exception v0

    .line 57
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    :goto_1
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->headerEntity:Lio/objectbox/relation/ToOne;

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->u()Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_2

    .line 70
    .line 71
    const-class v3, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 72
    .line 73
    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->l(Ljava/lang/Class;)Lio/objectbox/Cursor;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    :try_start_2
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->t(Lio/objectbox/Cursor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :catchall_2
    move-exception v0

    .line 85
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 86
    .line 87
    .line 88
    throw v0

    .line 89
    :cond_2
    :goto_2
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->d()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    const/4 v2, 0x0

    .line 94
    if-eqz v10, :cond_3

    .line 95
    .line 96
    sget v3, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->k:I

    .line 97
    .line 98
    move v9, v3

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    move v9, v2

    .line 101
    :goto_3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->b()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    if-eqz v12, :cond_4

    .line 106
    .line 107
    sget v2, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->m:I

    .line 108
    .line 109
    :cond_4
    move v11, v2

    .line 110
    iget-wide v4, v1, Lio/objectbox/Cursor;->b:J

    .line 111
    .line 112
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->f()J

    .line 113
    .line 114
    .line 115
    move-result-wide v6

    .line 116
    sget v17, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->o:I

    .line 117
    .line 118
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->blackBoardEntity:Lio/objectbox/relation/ToOne;

    .line 119
    .line 120
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->n()J

    .line 121
    .line 122
    .line 123
    move-result-wide v18

    .line 124
    sget v20, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->p:I

    .line 125
    .line 126
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->recordEntity:Lio/objectbox/relation/ToOne;

    .line 127
    .line 128
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->n()J

    .line 129
    .line 130
    .line 131
    move-result-wide v21

    .line 132
    sget v23, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->q:I

    .line 133
    .line 134
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->headerEntity:Lio/objectbox/relation/ToOne;

    .line 135
    .line 136
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->n()J

    .line 137
    .line 138
    .line 139
    move-result-wide v24

    .line 140
    sget v26, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->n:I

    .line 141
    .line 142
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->c()I

    .line 143
    .line 144
    .line 145
    move-result v27

    .line 146
    sget v28, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->l:I

    .line 147
    .line 148
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->h()Z

    .line 149
    .line 150
    .line 151
    move-result v29

    .line 152
    const/16 v34, 0x0

    .line 153
    .line 154
    const-wide/16 v35, 0x0

    .line 155
    .line 156
    const/4 v8, 0x3

    .line 157
    const/4 v13, 0x0

    .line 158
    const/4 v14, 0x0

    .line 159
    const/4 v15, 0x0

    .line 160
    const/16 v16, 0x0

    .line 161
    .line 162
    const/16 v30, 0x0

    .line 163
    .line 164
    const/16 v31, 0x0

    .line 165
    .line 166
    const/16 v32, 0x0

    .line 167
    .line 168
    const/16 v33, 0x0

    .line 169
    .line 170
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 171
    .line 172
    .line 173
    move-result-wide v2

    .line 174
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->m(J)V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->r(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 178
    .line 179
    .line 180
    return-wide v2
.end method
