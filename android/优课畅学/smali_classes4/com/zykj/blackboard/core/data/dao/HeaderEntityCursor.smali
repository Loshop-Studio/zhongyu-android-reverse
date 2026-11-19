.class public final Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/objectbox/Cursor<",
        "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
        ">;"
    }
.end annotation


# static fields
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;

.field private static final __ID_authorId:I

.field private static final __ID_convertUrl:I

.field private static final __ID_createDate:I

.field private static final __ID_defaultBackgroundColor:I

.field private static final __ID_defaultBackgroundLineConfigId:I

.field private static final __ID_duration:I

.field private static final __ID_height:I

.field private static final __ID_lastBackgroundColor:I

.field private static final __ID_lastBackgroundLineConfigId:I

.field private static final __ID_moveConfigId:I

.field private static final __ID_pageId:I

.field private static final __ID_updateDate:I

.field private static final __ID_version:I

.field private static final __ID_width:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->version:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_version:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->width:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_width:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->height:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_height:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->createDate:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_createDate:I

    .line 28
    .line 29
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->updateDate:Lio/objectbox/Property;

    .line 30
    .line 31
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 32
    .line 33
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_updateDate:I

    .line 34
    .line 35
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->duration:Lio/objectbox/Property;

    .line 36
    .line 37
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 38
    .line 39
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_duration:I

    .line 40
    .line 41
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->convertUrl:Lio/objectbox/Property;

    .line 42
    .line 43
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 44
    .line 45
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_convertUrl:I

    .line 46
    .line 47
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->defaultBackgroundColor:Lio/objectbox/Property;

    .line 48
    .line 49
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 50
    .line 51
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_defaultBackgroundColor:I

    .line 52
    .line 53
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->lastBackgroundColor:Lio/objectbox/Property;

    .line 54
    .line 55
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 56
    .line 57
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_lastBackgroundColor:I

    .line 58
    .line 59
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->pageId:Lio/objectbox/Property;

    .line 60
    .line 61
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 62
    .line 63
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_pageId:I

    .line 64
    .line 65
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->defaultBackgroundLineConfigId:Lio/objectbox/Property;

    .line 66
    .line 67
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 68
    .line 69
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_defaultBackgroundLineConfigId:I

    .line 70
    .line 71
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->lastBackgroundLineConfigId:Lio/objectbox/Property;

    .line 72
    .line 73
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 74
    .line 75
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_lastBackgroundLineConfigId:I

    .line 76
    .line 77
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->authorId:Lio/objectbox/Property;

    .line 78
    .line 79
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 80
    .line 81
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_authorId:I

    .line 82
    .line 83
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->moveConfigId:Lio/objectbox/Property;

    .line 84
    .line 85
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 86
    .line 87
    sput v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_moveConfigId:I

    .line 88
    .line 89
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$HeaderEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)J
    .locals 71

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 2
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->page:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_0

    .line 3
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 4
    const-class v3, Lcom/zykj/blackboard/core/data/dao/PageEntity;

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
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->defaultBackgroundLineConfig:Lio/objectbox/relation/ToOne;

    .line 9
    const-class v3, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 10
    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v4

    .line 11
    :try_start_1
    invoke-virtual {v2, v4}, Lio/objectbox/relation/ToOne;->h(Lio/objectbox/Cursor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    invoke-virtual {v4}, Lio/objectbox/Cursor;->close()V

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v4}, Lio/objectbox/Cursor;->close()V

    .line 13
    throw v0

    .line 14
    :cond_1
    :goto_1
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->lastBackgroundLineConfig:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_2

    .line 15
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 16
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
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->author:Lio/objectbox/relation/ToOne;

    .line 21
    const-class v3, Lcom/zykj/blackboard/core/data/dao/AuthorEntity;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 22
    invoke-virtual {v1, v3}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v4

    .line 23
    :try_start_3
    invoke-virtual {v2, v4}, Lio/objectbox/relation/ToOne;->h(Lio/objectbox/Cursor;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 24
    invoke-virtual {v4}, Lio/objectbox/Cursor;->close()V

    goto :goto_3

    :catchall_3
    move-exception v0

    invoke-virtual {v4}, Lio/objectbox/Cursor;->close()V

    .line 25
    throw v0

    .line 26
    :cond_3
    :goto_3
    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->moveConfig:Lio/objectbox/relation/ToOne;

    if-eqz v2, :cond_4

    .line 27
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->i()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 28
    const-class v4, Lcom/zykj/blackboard/core/data/dao/MoveConfigEntity;

    invoke-virtual {v1, v4}, Lio/objectbox/Cursor;->getRelationTargetCursor(Ljava/lang/Class;)Lio/objectbox/Cursor;

    move-result-object v4

    .line 29
    :try_start_4
    invoke-virtual {v2, v4}, Lio/objectbox/relation/ToOne;->h(Lio/objectbox/Cursor;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 30
    invoke-virtual {v4}, Lio/objectbox/Cursor;->close()V

    goto :goto_4

    :catchall_4
    move-exception v0

    invoke-virtual {v4}, Lio/objectbox/Cursor;->close()V

    .line 31
    throw v0

    .line 32
    :cond_4
    :goto_4
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getConvertUrl()Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_5

    .line 33
    sget v2, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_convertUrl:I

    :goto_5
    move v10, v2

    goto :goto_6

    :cond_5
    const/4 v2, 0x0

    goto :goto_5

    .line 34
    :goto_6
    iget-wide v5, v1, Lio/objectbox/Cursor;->cursor:J

    sget v18, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_createDate:I

    .line 35
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getCreateDate()J

    move-result-wide v19

    sget v21, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_updateDate:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getUpdateDate()J

    move-result-wide v22

    sget v24, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_duration:I

    .line 36
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDuration()J

    move-result-wide v25

    sget v27, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_version:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getVersion()I

    move-result v28

    sget v29, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_width:I

    .line 37
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getWidth()I

    move-result v30

    sget v31, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_height:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getHeight()I

    move-result v32

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    .line 38
    invoke-static/range {v5 .. v37}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 39
    iget-wide v4, v1, Lio/objectbox/Cursor;->cursor:J

    sget v51, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_pageId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->page:Lio/objectbox/relation/ToOne;

    .line 40
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v52

    sget v54, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_defaultBackgroundLineConfigId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->defaultBackgroundLineConfig:Lio/objectbox/relation/ToOne;

    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v55

    sget v57, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_lastBackgroundLineConfigId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->lastBackgroundLineConfig:Lio/objectbox/relation/ToOne;

    .line 41
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v58

    sget v60, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_defaultBackgroundColor:I

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundColor()I

    move-result v61

    sget v62, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_lastBackgroundColor:I

    .line 42
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundColor()I

    move-result v63

    const/16 v68, 0x0

    const-wide/16 v69, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    move-wide/from16 v38, v4

    .line 43
    invoke-static/range {v38 .. v70}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    .line 44
    iget-wide v6, v1, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getId()J

    move-result-wide v8

    sget v19, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_authorId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->author:Lio/objectbox/relation/ToOne;

    .line 45
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v20

    sget v22, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->__ID_moveConfigId:I

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->moveConfig:Lio/objectbox/relation/ToOne;

    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->e()J

    move-result-wide v23

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    .line 46
    invoke-static/range {v6 .. v38}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v4

    .line 47
    invoke-virtual {v0, v4, v5}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setId(J)V

    .line 48
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)V

    .line 49
    iget-object v0, v0, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->provider:Lio/objectbox/relation/ToMany;

    invoke-virtual {v1, v0, v3}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    return-wide v4
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)J

    move-result-wide v0

    return-wide v0
.end method
