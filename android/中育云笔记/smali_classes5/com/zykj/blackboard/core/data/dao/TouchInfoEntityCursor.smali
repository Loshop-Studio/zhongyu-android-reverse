.class public final Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

.field public static final m:I

.field public static final n:I

.field public static final o:I

.field public static final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->e:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->m:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->n:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->o:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->p:I

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;->f:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->w(Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->f:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;)J
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->record:Lio/objectbox/relation/ToOne;

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
    const-class v3, Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;

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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->b()J

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    sget v9, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->m:I

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->a()J

    .line 42
    .line 43
    .line 44
    move-result-wide v10

    .line 45
    sget v12, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->p:I

    .line 46
    .line 47
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 48
    .line 49
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->f()J

    .line 50
    .line 51
    .line 52
    move-result-wide v13

    .line 53
    sget v15, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->n:I

    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->d()F

    .line 56
    .line 57
    .line 58
    move-result v16

    .line 59
    sget v17, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->o:I

    .line 60
    .line 61
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->e()F

    .line 62
    .line 63
    .line 64
    move-result v18

    .line 65
    const/16 v27, 0x0

    .line 66
    .line 67
    const-wide/16 v28, 0x0

    .line 68
    .line 69
    const/4 v8, 0x3

    .line 70
    const/16 v19, 0x0

    .line 71
    .line 72
    const/16 v20, 0x0

    .line 73
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
    move-result-wide v2

    .line 86
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;->g(J)V

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/TouchInfoEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/TouchInfoEntity;)V

    .line 90
    .line 91
    .line 92
    return-wide v2
.end method
