.class public final Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

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
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->e:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->m:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->n:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->o:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->p:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->l:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->q:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->m:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->r:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->n:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->s:I

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->f:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-wide v1, v0, Lio/objectbox/Cursor;->d:J

    .line 4
    .line 5
    sget v6, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->r:I

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->c()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    int-to-long v7, v3

    .line 12
    sget v9, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->s:I

    .line 13
    .line 14
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->d()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    int-to-long v10, v3

    .line 19
    sget v12, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->m:I

    .line 20
    .line 21
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->h()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const-wide/16 v18, 0x0

    .line 26
    .line 27
    const-wide/16 v20, 0x1

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    move-wide/from16 v13, v20

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move-wide/from16 v13, v18

    .line 35
    .line 36
    :goto_0
    sget v15, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->n:I

    .line 37
    .line 38
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->g()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_1

    .line 43
    .line 44
    move-wide/from16 v16, v20

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-wide/from16 v16, v18

    .line 48
    .line 49
    :goto_1
    const-wide/16 v3, 0x0

    .line 50
    .line 51
    const/4 v5, 0x1

    .line 52
    invoke-static/range {v1 .. v17}, Lio/objectbox/Cursor;->collect004000(JJIIJIJIJIJ)J

    .line 53
    .line 54
    .line 55
    iget-wide v1, v0, Lio/objectbox/Cursor;->d:J

    .line 56
    .line 57
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->b()J

    .line 58
    .line 59
    .line 60
    move-result-wide v24

    .line 61
    sget v27, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->o:I

    .line 62
    .line 63
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->a()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    move-wide/from16 v28, v20

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    move-wide/from16 v28, v18

    .line 73
    .line 74
    :goto_2
    sget v30, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->p:I

    .line 75
    .line 76
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->f()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    move-wide/from16 v31, v20

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    move-wide/from16 v31, v18

    .line 86
    .line 87
    :goto_3
    sget v33, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->q:I

    .line 88
    .line 89
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->e()Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_4

    .line 94
    .line 95
    move-wide/from16 v34, v20

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_4
    move-wide/from16 v34, v18

    .line 99
    .line 100
    :goto_4
    const/16 v36, 0x0

    .line 101
    .line 102
    const-wide/16 v37, 0x0

    .line 103
    .line 104
    const/16 v26, 0x2

    .line 105
    .line 106
    move-wide/from16 v22, v1

    .line 107
    .line 108
    invoke-static/range {v22 .. v38}, Lio/objectbox/Cursor;->collect004000(JJIIJIJIJIJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide v1

    .line 112
    move-object/from16 v3, p1

    .line 113
    .line 114
    invoke-virtual {v3, v1, v2}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->k(J)V

    .line 115
    .line 116
    .line 117
    return-wide v1
.end method
