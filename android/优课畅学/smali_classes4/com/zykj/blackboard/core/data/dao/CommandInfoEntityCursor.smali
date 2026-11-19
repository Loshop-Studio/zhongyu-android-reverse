.class public final Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;

.field private static final __ID_commandEnum:I

.field private static final __ID_data:I

.field private static final __ID_delayTime:I

.field private static final __ID_duration:I

.field private static final __ID_isPlay:I

.field private static final __ID_recordId:I


# instance fields
.field private final commandEnumConverter:Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->delayTime:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_delayTime:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->duration:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_duration:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->isPlay:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_isPlay:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->commandEnum:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_commandEnum:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->data:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_data:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->recordId:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_recordId:I

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_;

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
    new-instance p1, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;

    .line 11
    .line 12
    invoke-direct {p1}, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->commandEnumConverter:Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;

    .line 16
    .line 17
    return-void
.end method

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity_$CommandInfoEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->record:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v3

    .line 5
    :try_start_0
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->h(Lio/objectbox/Cursor;)V
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
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    move-result-object v16

    const/4 v2, 0x0

    if-eqz v16, :cond_1

    .line 9
    sget v3, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_data:I

    move v15, v3

    goto :goto_1

    :cond_1
    move v15, v2

    .line 10
    :goto_1
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 11
    sget v4, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_commandEnum:I

    move/from16 v26, v4

    goto :goto_2

    :cond_2
    move/from16 v26, v2

    .line 12
    :goto_2
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getId()J

    move-result-wide v6

    sget v17, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_delayTime:I

    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDelayTime()J

    move-result-wide v18

    sget v20, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_duration:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDuration()J

    move-result-wide v21

    sget v23, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_recordId:I

    iget-object v8, v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->record:Lio/objectbox/relation/ToOne;

    .line 14
    invoke-virtual {v8}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v24

    if-eqz v26, :cond_3

    iget-object v2, v1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->commandEnumConverter:Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;

    invoke-virtual {v2, v3}, Lcom/zykj/blackboard/core/data/dao/CommandEnumConverter;->convertToDatabaseValue(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_3
    move/from16 v27, v2

    sget v28, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->__ID_isPlay:I

    .line 15
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->isPlay()Z

    move-result v29

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    .line 16
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v2

    .line 17
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->setId(J)V

    .line 18
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)J

    move-result-wide v0

    return-wide v0
.end method
