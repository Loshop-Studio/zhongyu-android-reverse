.class public final Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor$Factory;
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
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

.field private static final __ID_dir:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->dir:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->__ID_dir:I

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;

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

.method private attachEntity(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/objectbox/Cursor;->boxStoreForEntities:Lio/objectbox/BoxStore;

    .line 2
    .line 3
    iput-object v0, p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->__boxStore:Lio/objectbox/BoxStore;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$BlackBoardEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 2
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getDir()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 3
    sget v2, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->__ID_dir:I

    :goto_0
    move v7, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 4
    :goto_1
    iget-wide v2, v0, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->getId()J

    move-result-wide v4

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/4 v6, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v2 .. v34}, Lio/objectbox/Cursor;->collect313311(JJIILjava/lang/String;ILjava/lang/String;ILjava/lang/String;I[BIJIJIJIIIIIIIFID)J

    move-result-wide v2

    .line 5
    invoke-virtual {v1, v2, v3}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->setId(J)V

    .line 6
    invoke-direct/range {p0 .. p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->attachEntity(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)V

    .line 7
    iget-object v1, v1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->pages:Lio/objectbox/relation/ToMany;

    const-class v4, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    invoke-virtual {v0, v1, v4}, Lio/objectbox/Cursor;->checkApplyToManyToDb(Ljava/util/List;Ljava/lang/Class;)V

    return-wide v2
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)J

    move-result-wide v0

    return-wide v0
.end method
