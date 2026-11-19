.class public final Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$MatrixInfoEntityIdGetter;

.field private static final __ID_eventTime:I

.field private static final __ID_perSp0:I

.field private static final __ID_perSp1:I

.field private static final __ID_perSp2:I

.field private static final __ID_recordId:I

.field private static final __ID_scaleX:I

.field private static final __ID_scaleY:I

.field private static final __ID_skewX:I

.field private static final __ID_skewY:I

.field private static final __ID_transX:I

.field private static final __ID_transY:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$MatrixInfoEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$MatrixInfoEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->eventTime:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_eventTime:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->scaleX:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_scaleX:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->skewX:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_skewX:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->transX:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_transX:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->skewY:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_skewY:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->scaleY:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_scaleY:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->transY:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_transY:I

    .line 46
    .line 47
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->perSp0:Lio/objectbox/Property;

    .line 48
    .line 49
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 50
    .line 51
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_perSp0:I

    .line 52
    .line 53
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->perSp1:Lio/objectbox/Property;

    .line 54
    .line 55
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 56
    .line 57
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_perSp1:I

    .line 58
    .line 59
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->perSp2:Lio/objectbox/Property;

    .line 60
    .line 61
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 62
    .line 63
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_perSp2:I

    .line 64
    .line 65
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->recordId:Lio/objectbox/Property;

    .line 66
    .line 67
    iget v0, v0, Lio/objectbox/Property;->id:I

    .line 68
    .line 69
    sput v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_recordId:I

    .line 70
    .line 71
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$MatrixInfoEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity_$MatrixInfoEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J
    .locals 56

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->record:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->internalRequiresPutTarget()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;

    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v3

    .line 5
    :try_start_0
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->internalPutTarget(Lio/objectbox/Cursor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 7
    throw v0

    .line 8
    :cond_0
    :goto_0
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    sget v9, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_eventTime:I

    .line 9
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getEventTime()J

    move-result-wide v10

    sget v12, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_recordId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->record:Lio/objectbox/relation/ToOne;

    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTargetId()J

    move-result-wide v13

    sget v15, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_scaleX:I

    .line 10
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleX()F

    move-result v16

    sget v17, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_skewX:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewX()F

    move-result v18

    sget v19, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_transX:I

    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransX()F

    move-result v20

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x1

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    .line 12
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 13
    iget-wide v2, v1, Lio/objectbox/Cursor;->cursor:J

    sget v41, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_skewY:I

    .line 14
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getSkewY()F

    move-result v42

    sget v43, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_scaleY:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getScaleY()F

    move-result v44

    sget v45, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_transY:I

    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getTransY()F

    move-result v46

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v47, 0x0

    const-wide/16 v48, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    move-wide/from16 v30, v2

    .line 16
    invoke-static/range {v30 .. v55}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    .line 17
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getId()J

    move-result-wide v6

    sget v15, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_perSp0:I

    .line 18
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp0()F

    move-result v16

    sget v17, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_perSp1:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp1()F

    move-result v18

    sget v19, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->__ID_perSp2:I

    .line 19
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->getPerSp2()F

    move-result v20

    const/4 v8, 0x2

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    .line 20
    invoke-static/range {v4 .. v29}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    move-result-wide v2

    .line 21
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;->setId(J)V

    .line 22
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/MatrixInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method
