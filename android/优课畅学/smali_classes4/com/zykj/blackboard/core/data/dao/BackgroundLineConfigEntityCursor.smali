.class public final Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;
.super Lio/objectbox/Cursor;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor$Factory;
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
.field private static final ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;

.field private static final __ID_lineColor:I

.field private static final __ID_lineSpace:I

.field private static final __ID_lineType:I

.field private static final __ID_lineWidth:I


# instance fields
.field private final lineTypeConverter:Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;

    .line 2
    .line 3
    sput-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;

    .line 4
    .line 5
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineColor:Lio/objectbox/Property;

    .line 6
    .line 7
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 8
    .line 9
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineColor:I

    .line 10
    .line 11
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineSpace:Lio/objectbox/Property;

    .line 12
    .line 13
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 14
    .line 15
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineSpace:I

    .line 16
    .line 17
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineType:Lio/objectbox/Property;

    .line 18
    .line 19
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 20
    .line 21
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineType:I

    .line 22
    .line 23
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->lineWidth:Lio/objectbox/Property;

    .line 24
    .line 25
    iget v0, v0, Lio/objectbox/Property;->c:I

    .line 26
    .line 27
    sput v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineWidth:I

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lio/objectbox/Transaction;JLio/objectbox/BoxStore;)V
    .locals 6

    .line 1
    sget-object v4, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;->__INSTANCE:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_;

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
    iput-object p1, v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->lineTypeConverter:Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final getId(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->ID_GETTER:Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;

    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity_$BackgroundLineConfigEntityIdGetter;->getId(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic getId(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->getId(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final put(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J
    .locals 29

    move-object/from16 v0, p0

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineType()Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 3
    sget v2, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineType:I

    :goto_0
    move v11, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    .line 4
    :goto_1
    iget-wide v3, v0, Lio/objectbox/Cursor;->cursor:J

    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getId()J

    move-result-wide v5

    sget v8, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineColor:I

    .line 5
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineColor()I

    move-result v2

    int-to-long v9, v2

    if-eqz v11, :cond_1

    iget-object v2, v0, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->lineTypeConverter:Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;

    invoke-virtual {v2, v1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineTypeEnumConverter;->convertToDatabaseValue(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    :goto_2
    move-wide v12, v1

    goto :goto_3

    :cond_1
    const-wide/16 v1, 0x0

    goto :goto_2

    :goto_3
    sget v14, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineSpace:I

    .line 6
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineSpace()F

    move-result v15

    sget v16, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->__ID_lineWidth:I

    invoke-virtual/range {p1 .. p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->getLineWidth()F

    move-result v17

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/4 v7, 0x3

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    .line 7
    invoke-static/range {v3 .. v28}, Lio/objectbox/Cursor;->collect002033(JJIIJIJIFIFIFIDIDID)J

    move-result-wide v1

    move-object/from16 v3, p1

    .line 8
    invoke-virtual {v3, v1, v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->setId(J)V

    return-wide v1
.end method

.method public bridge synthetic put(Ljava/lang/Object;)J
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntityCursor;->put(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)J

    move-result-wide v0

    return-wide v0
.end method
