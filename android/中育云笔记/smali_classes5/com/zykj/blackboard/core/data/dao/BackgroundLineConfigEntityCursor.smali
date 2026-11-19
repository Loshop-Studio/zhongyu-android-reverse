.class public final Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$a;

.field public static final n:I

.field public static final o:I

.field public static final p:I

.field public static final q:I


# instance fields
.field public final l:Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->e:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$a;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->m:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$a;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->h:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->n:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->i:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->o:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->j:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->p:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->k:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->e:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->q:I

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->f:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;

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
    new-instance p1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic i(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->u(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J

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
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->v(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final u(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->m:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$a;->b(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final v(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->d()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->p:I

    .line 10
    .line 11
    :goto_0
    move v11, v2

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    iget-wide v3, v0, Lio/objectbox/Cursor;->d:J

    .line 16
    .line 17
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->a()J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    sget v8, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->n:I

    .line 22
    .line 23
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->b()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    int-to-long v9, v2

    .line 28
    if-eqz v11, :cond_1

    .line 29
    .line 30
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->l:Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;

    .line 31
    .line 32
    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;->convertToDatabaseValue(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    int-to-long v1, v1

    .line 41
    :goto_2
    move-wide v12, v1

    .line 42
    goto :goto_3

    .line 43
    :cond_1
    const-wide/16 v1, 0x0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :goto_3
    sget v14, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->o:I

    .line 47
    .line 48
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->c()F

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    sget v16, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->q:I

    .line 53
    .line 54
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->e()F

    .line 55
    .line 56
    .line 57
    move-result v17

    .line 58
    const/16 v26, 0x0

    .line 59
    .line 60
    const-wide/16 v27, 0x0

    .line 61
    .line 62
    const/4 v7, 0x3

    .line 63
    const/16 v18, 0x0

    .line 64
    .line 65
    const/16 v19, 0x0

    .line 66
    .line 67
    const/16 v20, 0x0

    .line 68
    .line 69
    const-wide/16 v21, 0x0

    .line 70
    .line 71
    const/16 v23, 0x0

    .line 72
    .line 73
    const-wide/16 v24, 0x0

    .line 74
    .line 75
    invoke-static/range {v3 .. v28}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    move-object/from16 v3, p1

    .line 80
    .line 81
    invoke-virtual {v3, v1, v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->g(J)V

    .line 82
    .line 83
    .line 84
    return-wide v1
.end method
