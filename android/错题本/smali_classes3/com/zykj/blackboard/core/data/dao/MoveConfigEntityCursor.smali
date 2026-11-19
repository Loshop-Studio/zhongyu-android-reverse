.class public final Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor$Factory;
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
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$MoveConfigEntityIdGetter;

.field private static final __ID_horizontalTranslate:I

.field private static final __ID_isEnable:I

.field private static final __ID_maxHeightTimes:I

.field private static final __ID_maxWidthTimes:I

.field private static final __ID_rotate:I

.field private static final __ID_scale:I

.field private static final __ID_verticalTranslate:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$MoveConfigEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$MoveConfigEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->isEnable:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_isEnable:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->verticalTranslate:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_verticalTranslate:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->horizontalTranslate:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_horizontalTranslate:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->scale:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_scale:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->rotate:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_rotate:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->maxHeightTimes:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_maxHeightTimes:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->maxWidthTimes:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_maxWidthTimes:I

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_;

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
.method public final getId(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$MoveConfigEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity_$MoveConfigEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J
    .locals 39

    move-object/from16 v0, p0

    .line 2
    iget-wide v1, v0, Lio/objectbox/Cursor;->cursor:J

    sget v6, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_maxHeightTimes:I

    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxHeightTimes()I

    move-result v3

    int-to-long v7, v3

    sget v9, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_maxWidthTimes:I

    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getMaxWidthTimes()I

    move-result v3

    int-to-long v10, v3

    sget v12, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_isEnable:I

    .line 4
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->isEnable()Z

    move-result v3

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x1

    if-eqz v3, :cond_0

    move-wide/from16 v13, v20

    goto :goto_0

    :cond_0
    move-wide/from16 v13, v18

    :goto_0
    sget v15, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_verticalTranslate:I

    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getVerticalTranslate()Z

    move-result v3

    if-eqz v3, :cond_1

    move-wide/from16 v16, v20

    goto :goto_1

    :cond_1
    move-wide/from16 v16, v18

    :goto_1
    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    .line 5
    invoke-static/range {v1 .. v17}, Lio/objectbox/Cursor;->collect004000(JJIIJIJIJIJ)J

    .line 6
    iget-wide v1, v0, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getId()J

    move-result-wide v24

    sget v27, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_horizontalTranslate:I

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getHorizontalTranslate()Z

    move-result v3

    if-eqz v3, :cond_2

    move-wide/from16 v28, v20

    goto :goto_2

    :cond_2
    move-wide/from16 v28, v18

    :goto_2
    sget v30, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_scale:I

    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getScale()Z

    move-result v3

    if-eqz v3, :cond_3

    move-wide/from16 v31, v20

    goto :goto_3

    :cond_3
    move-wide/from16 v31, v18

    :goto_3
    sget v33, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->__ID_rotate:I

    .line 8
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->getRotate()Z

    move-result v3

    if-eqz v3, :cond_4

    move-wide/from16 v34, v20

    goto :goto_4

    :cond_4
    move-wide/from16 v34, v18

    :goto_4
    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v26, 0x2

    move-wide/from16 v22, v1

    .line 9
    invoke-static/range {v22 .. v38}, Lio/objectbox/Cursor;->collect004000(JJIIJIJIJIJ)J

    move-result-wide v1

    move-object/from16 v3, p1

    .line 10
    invoke-virtual {v3, v1, v2}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;->setId(J)V

    return-wide v1
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;)J

    move-result-wide v0

    return-wide v0
.end method
