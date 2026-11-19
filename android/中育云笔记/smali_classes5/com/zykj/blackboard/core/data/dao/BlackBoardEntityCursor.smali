.class public final Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$a;

.field public static final m:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->e:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->m:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->f:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->w(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->f:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final w(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    if-eqz v8, :cond_0

    .line 10
    .line 11
    sget v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->m:I

    .line 12
    .line 13
    :goto_0
    move v7, v2

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    const/4 v2, 0x0

    .line 16
    goto :goto_0

    .line 17
    :goto_1
    iget-wide v2, v0, Lio/objectbox/Cursor;->d:J

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->b()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    const/16 v32, 0x0

    .line 24
    .line 25
    const-wide/16 v33, 0x0

    .line 26
    .line 27
    const/4 v6, 0x3

    .line 28
    const/4 v9, 0x0

    .line 29
    const/4 v10, 0x0

    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v14, 0x0

    .line 34
    const/4 v15, 0x0

    .line 35
    const-wide/16 v16, 0x0

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    const-wide/16 v19, 0x0

    .line 40
    .line 41
    const/16 v21, 0x0

    .line 42
    .line 43
    const-wide/16 v22, 0x0

    .line 44
    .line 45
    const/16 v24, 0x0

    .line 46
    .line 47
    const/16 v25, 0x0

    .line 48
    .line 49
    const/16 v26, 0x0

    .line 50
    .line 51
    const/16 v27, 0x0

    .line 52
    .line 53
    const/16 v28, 0x0

    .line 54
    .line 55
    const/16 v29, 0x0

    .line 56
    .line 57
    const/16 v30, 0x0

    .line 58
    .line 59
    const/16 v31, 0x0

    .line 60
    .line 61
    invoke-static/range {v2 .. v34}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    invoke-virtual {v1, v2, v3}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->f(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->pages:Lio/objectbox/relation/ToMany;

    .line 72
    .line 73
    const-class v4, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 74
    .line 75
    invoke-virtual {v0, v1, v4}, Lio/objectbox/Cursor;->a(Ljava/util/List;Ljava/lang/Class;)V

    .line 76
    .line 77
    .line 78
    return-wide v2
.end method
