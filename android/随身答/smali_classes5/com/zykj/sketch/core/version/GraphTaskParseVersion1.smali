.class public Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/version/ITaskParse;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0016J4\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00082\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;",
        "Lcom/zykj/sketch/core/version/ITaskParse;",
        "()V",
        "countTime",
        "",
        "playEndTime",
        "playStartTime",
        "parse",
        "Lcom/zykj/sketch/core/data/RenderTask;",
        "content",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "eventListener",
        "Lcom/zykj/sketch/core/listener/EventListener;",
        "viewBack",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "",
        "parseEventAsTask",
        "task",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private countTime:J

.field private playEndTime:J

.field private playStartTime:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lkotlin/jvm/functions/Function1;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lcom/zykj/sketch/core/data/RenderTask;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/listener/ViewControl;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_0
    const-wide/16 v12, 0x0

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_e

    .line 2
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 3
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v9

    .line 4
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 5
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v2, v2, v12

    if-nez v2, :cond_1

    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_1

    :cond_1
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->getStartTime()J

    move-result-wide v4

    iget-wide v6, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v4, v6

    add-long/2addr v2, v4

    .line 6
    :goto_1
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$22;

    invoke-direct {v5, v10, v8}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$22;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V

    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 8
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$23;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$23;

    move-object/from16 v4, p1

    .line 9
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 10
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->getStartTime()J

    move-result-wide v1

    .line 12
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v1, v5

    add-long/2addr v3, v1

    iput-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 13
    iput-wide v12, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 14
    iput-wide v12, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playEndTime:J

    return-void

    .line 15
    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    .line 16
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    .line 17
    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playEndTime:J

    .line 18
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v9

    .line 19
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 20
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v2, v2, v12

    if-nez v2, :cond_2

    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_2

    :cond_2
    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    move-result-wide v4

    iget-wide v6, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v4, v6

    add-long/2addr v2, v4

    .line 21
    :goto_2
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;

    invoke-direct {v5, v10, v8}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V

    .line 22
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 23
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$21;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$21;

    move-object/from16 v4, p1

    .line 24
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 25
    invoke-interface {v9, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getAudioTaskList()Ljava/util/List;

    move-result-object v1

    new-instance v9, Lcom/zykj/sketch/core/data/AudioTask;

    iget-wide v10, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v8}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getFileName()Ljava/lang/String;

    move-result-object v12

    const-string v2, "action.fileName"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v15, 0xc

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Lcom/zykj/sketch/core/data/AudioTask;-><init>(JLjava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_2
    move-object/from16 v4, p1

    .line 27
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    move-object v2, v1

    .line 28
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 29
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v5, v12

    if-nez v3, :cond_3

    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_3

    :cond_3
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;->getStartTime()J

    move-result-wide v2

    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v2, v7

    add-long/2addr v2, v5

    .line 30
    :goto_3
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$17;

    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$17;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 31
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 32
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$18;

    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$18;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 33
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 34
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    return-void

    :pswitch_3
    move-object/from16 v4, p1

    .line 36
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    move-object v2, v1

    .line 37
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 38
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v5, v12

    if-nez v3, :cond_4

    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_4

    :cond_4
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;->getStartTime()J

    move-result-wide v2

    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v2, v7

    add-long/2addr v2, v5

    .line 39
    :goto_4
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$14;

    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$14;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 40
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 41
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$15;

    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$15;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 42
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 43
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    return-void

    :pswitch_4
    move-object/from16 v4, p1

    .line 45
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    move-object v2, v1

    .line 46
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 47
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v5, v12

    if-nez v3, :cond_5

    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_5

    :cond_5
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;->getStartTime()J

    move-result-wide v2

    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v2, v7

    add-long/2addr v2, v5

    .line 48
    :goto_5
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$11;

    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$11;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 49
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 50
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$12;

    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$12;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 51
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 52
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 53
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    return-void

    :pswitch_5
    move-object/from16 v4, p1

    .line 54
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-object v2, v1

    .line 55
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 56
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v5, v12

    if-nez v3, :cond_6

    iget-wide v2, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_6

    :cond_6
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getStartTime()J

    move-result-wide v2

    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v2, v7

    add-long/2addr v2, v5

    .line 57
    :goto_6
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$8;

    invoke-direct {v5, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$8;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 58
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 59
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$9;

    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$9;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 60
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 61
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 62
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    return-void

    :pswitch_6
    move-object/from16 v4, p1

    .line 63
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    .line 64
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v8

    .line 65
    new-instance v2, Lcom/zykj/sketch/core/data/GraphTask;

    .line 66
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v5, v12

    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    if-nez v3, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getStartTime()J

    move-result-wide v11

    iget-wide v13, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v11, v13

    add-long/2addr v5, v11

    .line 67
    :goto_7
    new-instance v3, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$6;

    move-object/from16 v7, p4

    invoke-direct {v3, v10, v1, v7}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$6;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lkotlin/jvm/functions/Function1;)V

    move-object v1, v2

    move-wide/from16 v19, v5

    move-object v5, v3

    move-wide/from16 v2, v19

    .line 68
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 69
    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$7;

    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$7;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 70
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 71
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 72
    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;

    .line 73
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v8

    .line 74
    new-instance v2, Lcom/zykj/sketch/core/data/GraphTask;

    .line 75
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v3, v12

    if-nez v3, :cond_8

    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_8

    :cond_8
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;->getStartTime()J

    move-result-wide v5

    iget-wide v11, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v5, v11

    add-long/2addr v3, v5

    .line 76
    :goto_8
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$4;

    invoke-direct {v5, v10, v1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$4;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V

    .line 77
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 78
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$5;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$5;

    move-object v1, v2

    move-wide v2, v3

    move-object/from16 v4, p1

    .line 79
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 80
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 81
    :pswitch_8
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;

    .line 82
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v8

    .line 83
    new-instance v2, Lcom/zykj/sketch/core/data/GraphTask;

    .line 84
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v3, v12

    if-nez v3, :cond_9

    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_9

    :cond_9
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;->getStartTime()J

    move-result-wide v5

    iget-wide v11, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v5, v11

    add-long/2addr v3, v5

    .line 85
    :goto_9
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$2;

    invoke-direct {v5, v10, v1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$2;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V

    .line 86
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v6

    .line 87
    sget-object v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$3;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$3;

    move-object v1, v2

    move-wide v2, v3

    move-object/from16 v4, p1

    .line 88
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 89
    invoke-interface {v8, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_9
    move-object/from16 v4, p1

    .line 90
    invoke-virtual {v4}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 91
    invoke-virtual {v14}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->getTouchEventList()Ljava/util/List;

    move-result-object v1

    const-string v2, "action.touchEventList"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    const/4 v1, 0x0

    :goto_a
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v16, v1, 0x1

    if-gez v1, :cond_a

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_a
    check-cast v2, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    .line 93
    invoke-virtual {v14}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->getTouchEventCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ne v1, v3, :cond_c

    .line 94
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 95
    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v5, v12

    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    if-nez v3, :cond_b

    move-wide/from16 v17, v12

    goto :goto_b

    :cond_b
    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v7

    move-wide/from16 v17, v12

    iget-wide v12, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v7, v12

    add-long/2addr v5, v7

    .line 96
    :goto_b
    new-instance v3, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$1;

    invoke-direct {v3, v10, v2, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$1;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    new-instance v7, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$2;

    invoke-direct {v7, v10, v4}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$2;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-wide/from16 v19, v5

    move-object v5, v3

    move-wide/from16 v2, v19

    const/4 v6, 0x1

    .line 97
    invoke-direct/range {v1 .. v7}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;)V

    .line 98
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    invoke-virtual {v11, v1}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    .line 100
    iget-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v11, v1, v2}, Lcom/zykj/sketch/core/data/RenderTask;->setProgress(J)V

    goto :goto_d

    :cond_c
    move-wide/from16 v17, v12

    .line 101
    invoke-virtual {v11}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v12

    .line 102
    new-instance v1, Lcom/zykj/sketch/core/data/GraphTask;

    .line 103
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    cmp-long v3, v3, v17

    if-nez v3, :cond_d

    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    goto :goto_c

    :cond_d
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    invoke-virtual {v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v5

    iget-wide v7, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->playStartTime:J

    sub-long/2addr v5, v7

    add-long/2addr v3, v5

    .line 104
    :goto_c
    new-instance v5, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$4;

    invoke-direct {v5, v10, v2}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$1$4;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide v2, v3

    move-object/from16 v4, p1

    .line 105
    invoke-direct/range {v1 .. v9}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 106
    invoke-interface {v12, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_d
    move-object/from16 v4, p1

    move/from16 v1, v16

    move-wide/from16 v12, v17

    goto/16 :goto_a

    :cond_e
    :goto_e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public parse(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lkotlin/jvm/functions/Function1;)Lcom/zykj/sketch/core/data/RenderTask;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/listener/ViewControl;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/zykj/sketch/core/data/RenderTask;"
        }
    .end annotation

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "viewBack"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/zykj/sketch/core/data/RenderTask;

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    const/16 v7, 0x8

    .line 29
    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    const-wide/16 v5, 0x0

    .line 33
    .line 34
    invoke-direct/range {v1 .. v8}, Lcom/zykj/sketch/core/data/RenderTask;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;JILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 52
    .line 53
    invoke-direct {p0, v0, p2, v1, p3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-wide p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->countTime:J

    .line 58
    .line 59
    invoke-virtual {v1, p1, p2}, Lcom/zykj/sketch/core/data/RenderTask;->setProgress(J)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method
