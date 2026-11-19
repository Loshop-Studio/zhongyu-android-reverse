.class public final Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/AuthorEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$a;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->e:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->m:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->n:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->o:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->p:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->l:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->q:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->m:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->r:I

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;->f:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/AuthorEntity;)J
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    const/4 v14, 0x0

    .line 8
    if-eqz v7, :cond_0

    .line 9
    .line 10
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->m:I

    .line 11
    .line 12
    move v6, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v6, v14

    .line 15
    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->a()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v9

    .line 19
    if-eqz v9, :cond_1

    .line 20
    .line 21
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->n:I

    .line 22
    .line 23
    move v8, v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v8, v14

    .line 26
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->e()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v11

    .line 30
    if-eqz v11, :cond_2

    .line 31
    .line 32
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->o:I

    .line 33
    .line 34
    move v10, v1

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v10, v14

    .line 37
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->g()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v13

    .line 41
    if-eqz v13, :cond_3

    .line 42
    .line 43
    sget v1, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->p:I

    .line 44
    .line 45
    move v12, v1

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move v12, v14

    .line 48
    :goto_3
    iget-wide v1, v0, Lio/objectbox/Cursor;->d:J

    .line 49
    .line 50
    const-wide/16 v3, 0x0

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    invoke-static/range {v1 .. v13}, Lio/objectbox/Cursor;->collect400000(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)J

    .line 54
    .line 55
    .line 56
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->f()Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    if-eqz v1, :cond_4

    .line 61
    .line 62
    sget v2, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->q:I

    .line 63
    .line 64
    move/from16 v20, v2

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_4
    move/from16 v20, v14

    .line 68
    .line 69
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->c()Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    sget v14, Lcom/zykj/blackboard/core/data/dao/AuthorEntityCursor;->r:I

    .line 76
    .line 77
    :cond_5
    move/from16 v23, v14

    .line 78
    .line 79
    iget-wide v3, v0, Lio/objectbox/Cursor;->d:J

    .line 80
    .line 81
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->d()J

    .line 82
    .line 83
    .line 84
    move-result-wide v17

    .line 85
    const-wide/16 v5, 0x0

    .line 86
    .line 87
    if-eqz v20, :cond_6

    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v7

    .line 93
    move-wide/from16 v21, v7

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_6
    move-wide/from16 v21, v5

    .line 97
    .line 98
    :goto_5
    if-eqz v23, :cond_7

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v5

    .line 104
    :cond_7
    move-wide/from16 v24, v5

    .line 105
    .line 106
    const/16 v29, 0x0

    .line 107
    .line 108
    const-wide/16 v30, 0x0

    .line 109
    .line 110
    const/16 v19, 0x2

    .line 111
    .line 112
    const/16 v26, 0x0

    .line 113
    .line 114
    const-wide/16 v27, 0x0

    .line 115
    .line 116
    move-wide v15, v3

    .line 117
    invoke-static/range {v15 .. v31}, Lio/objectbox/Cursor;->collect004000(JJIIJIJIJIJ)J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    move-object/from16 v3, p1

    .line 122
    .line 123
    invoke-virtual {v3, v1, v2}, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;->i(J)V

    .line 124
    .line 125
    .line 126
    return-wide v1
.end method
