.class public final Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/PageEntityCursor$Factory;
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
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

.field private static final __ID_blackBoardEntityId:I

.field private static final __ID_commandFileName:I

.field private static final __ID_commandIndex:I

.field private static final __ID_dirName:I

.field private static final __ID_headerEntityId:I

.field private static final __ID_isChange:I

.field private static final __ID_recordEntityId:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->dirName:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_dirName:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->isChange:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_isChange:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->commandFileName:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_commandFileName:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->commandIndex:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_commandIndex:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->blackBoardEntityId:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_blackBoardEntityId:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->recordEntityId:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_recordEntityId:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->headerEntityId:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_headerEntityId:I

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/PageEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/PageEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/PageEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity_$PageEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->blackBoardEntity:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

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
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->recordEntity:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_1

    .line 9
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 10
    const-class v3, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v3

    .line 11
    :try_start_1
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->h(Lio/objectbox/Cursor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 13
    throw v0

    .line 14
    :cond_1
    :goto_1
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->headerEntity:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_2

    .line 15
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 16
    const-class v3, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v3

    .line 17
    :try_start_2
    invoke-virtual {v2, v3}, Lio/objectbox/relation/ToOne;->h(Lio/objectbox/Cursor;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 18
    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    goto :goto_2

    :catchall_2
    move-exception v0

    invoke-virtual {v3}, Lio/objectbox/Cursor;->close()V

    .line 19
    throw v0

    .line 20
    :cond_2
    :goto_2
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getDirName()Ljava/lang/String;

    move-result-object v10

    const/4 v2, 0x0

    if-eqz v10, :cond_3

    .line 21
    sget v3, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_dirName:I

    move v9, v3

    goto :goto_3

    :cond_3
    move v9, v2

    .line 22
    :goto_3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getCommandFileName()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_4

    .line 23
    sget v2, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_commandFileName:I

    :cond_4
    move v11, v2

    .line 24
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getId()J

    move-result-wide v6

    sget v17, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_blackBoardEntityId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->blackBoardEntity:Lio/objectbox/relation/ToOne;

    .line 25
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v18

    sget v20, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_recordEntityId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->recordEntity:Lio/objectbox/relation/ToOne;

    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v21

    sget v23, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_headerEntityId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/PageEntity;->headerEntity:Lio/objectbox/relation/ToOne;

    .line 26
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v24

    sget v26, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_commandIndex:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getCommandIndex()I

    move-result v27

    sget v28, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->__ID_isChange:I

    .line 27
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->isChange()Z

    move-result v29

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/4 v8, 0x3

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    .line 28
    invoke-static/range {v4 .. v36}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v2

    .line 29
    invoke-virtual {v0, v2, v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setId(J)V

    .line 30
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/PageEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/PageEntity;)J

    move-result-wide v0

    return-wide v0
.end method
