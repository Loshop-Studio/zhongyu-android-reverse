.class public final Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/core/version/ITaskParse;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$WhenMappings;
    }
.end annotation


# instance fields
.field private countTime:J

.field private flag:I

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

.method private final addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lcom/zykj/sketch/core/data/RenderTask;",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/sketch/core/data/GraphTask;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTaskStartTime(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    new-instance v4, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;

    .line 8
    .line 9
    invoke-direct {v4, p3, p4, p6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;-><init>(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lx7/a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$3;

    .line 17
    .line 18
    invoke-direct {v6, p4, p3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$3;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    .line 19
    .line 20
    .line 21
    move-object v3, p3

    .line 22
    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p5}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-virtual {p5, v0}, Lcom/zykj/sketch/core/data/RenderTask;->setLastSnapshot(Lcom/zykj/sketch/core/data/GraphTask;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public static synthetic addGraphTask$default(Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;ILjava/lang/Object;)V
    .locals 7

    .line 1
    and-int/lit8 p7, p7, 0x10

    .line 2
    .line 3
    if-eqz p7, :cond_0

    .line 4
    .line 5
    sget-object p6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$1;->INSTANCE:Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$1;

    .line 6
    .line 7
    :cond_0
    move-object v0, p0

    .line 8
    move-wide v1, p1

    .line 9
    move-object v3, p3

    .line 10
    move-object v4, p4

    .line 11
    move-object v5, p5

    .line 12
    move-object v6, p6

    .line 13
    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final countTaskStartTime(J)J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->playStartTime:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v2, v0, v2

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    iget-wide p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTime:J

    .line 10
    .line 11
    return-wide p1

    .line 12
    :cond_0
    iget-wide v2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTime:J

    .line 13
    .line 14
    sub-long/2addr p1, v0

    .line 15
    add-long/2addr v2, p1

    .line 16
    return-wide v2
.end method

.method private final deleteSnapShot(Ljava/util/List;)Ljava/lang/Iterable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;)",
            "Ljava/lang/Iterable<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->flag:I

    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 24
    .line 25
    invoke-direct {p0, v1, v0}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-object v0
.end method

.method private final parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/l;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lcom/zykj/sketch/core/data/RenderTask;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    .line 1
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    packed-switch v0, :pswitch_data_0

    :cond_1
    move-object/from16 v12, p0

    goto/16 :goto_3

    .line 2
    :pswitch_0
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 3
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$10;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$10;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    return-void

    .line 4
    :pswitch_1
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AudioControl ACTION_AUDIO_START ACTION_AUDIO_STOP "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$9;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$9;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    .line 7
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;->getStartTime()J

    move-result-wide v1

    .line 8
    iget-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTime:J

    iget-wide v5, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->playStartTime:J

    sub-long/2addr v1, v5

    add-long/2addr v3, v1

    iput-wide v3, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTime:J

    const-wide/16 v1, 0x0

    .line 9
    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->playStartTime:J

    .line 10
    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->playEndTime:J

    return-void

    :pswitch_2
    move-object/from16 v0, p0

    .line 11
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AudioControl ACTION_AUDIO_START ACTION_AUDIO_START "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$8;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$8;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    .line 14
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->playStartTime:J

    .line 15
    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getStartTime()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->playEndTime:J

    .line 16
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/sketch/core/data/RenderTask;->getAudioTaskList()Ljava/util/List;

    move-result-object v1

    new-instance v8, Lcom/zykj/sketch/core/data/AudioTask;

    iget-wide v9, v0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTime:J

    invoke-virtual {v7}, Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;->getFileName()Ljava/lang/String;

    move-result-object v11

    const-string v2, "action.fileName"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v8 .. v15}, Lcom/zykj/sketch/core/data/AudioTask;-><init>(JLjava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/n;)V

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_3
    move-object/from16 v0, p0

    .line 17
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;

    .line 18
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$7;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$7;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    return-void

    .line 19
    :pswitch_4
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;

    .line 20
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$6;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$6;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    return-void

    .line 21
    :pswitch_5
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;

    .line 22
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$5;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$5;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    return-void

    .line 23
    :pswitch_6
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    .line 24
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$4;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$4;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    return-void

    .line 25
    :pswitch_7
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    .line 26
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$3;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$3;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    return-void

    .line 27
    :pswitch_8
    invoke-virtual {v3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;

    .line 28
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;->getStartTime()J

    move-result-wide v1

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$2;

    invoke-direct {v6, v4, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$2;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    return-void

    .line 29
    :pswitch_9
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    invoke-virtual {v0, v1}, Lcom/google/protobuf/Any;->unpack(Ljava/lang/Class;)Lcom/google/protobuf/Message;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;

    .line 30
    invoke-virtual {v9}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->getTouchEventList()Ljava/util/List;

    move-result-object v0

    const-string v1, "action.touchEventList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v11, v0, 0x1

    if-gez v0, :cond_2

    invoke-static {}, Li7/v;->w()V

    :cond_2
    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    .line 32
    invoke-virtual {v9}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent;->getTouchEventCount()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v0, v2, :cond_3

    .line 33
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v2

    new-instance v6, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$1$1;

    invoke-direct {v6, v4, v1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$1$1;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    move-object/from16 v0, p0

    move-object/from16 v5, p3

    move-wide v1, v2

    move-object/from16 v3, p1

    invoke-direct/range {v0 .. v6}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/a;)V

    move-object v12, v0

    move-object v13, v4

    goto :goto_2

    :cond_3
    move-object/from16 v12, p0

    move-object/from16 v3, p1

    move-object v13, v4

    if-nez v0, :cond_4

    .line 34
    new-instance v0, Lcom/zykj/sketch/core/data/GraphTask;

    .line 35
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v4

    invoke-direct {v12, v4, v5}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTaskStartTime(J)J

    move-result-wide v4

    move-wide v5, v4

    .line 36
    new-instance v4, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$1$2;

    invoke-direct {v4, v13, v3, v1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$1$2;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    move-wide v1, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 37
    invoke-direct/range {v0 .. v8}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;ILkotlin/jvm/internal/n;)V

    .line 38
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 39
    :cond_4
    new-instance v0, Lcom/zykj/sketch/core/data/GraphTask;

    .line 40
    invoke-virtual {v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v2

    invoke-direct {v12, v2, v3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTaskStartTime(J)J

    move-result-wide v2

    .line 41
    new-instance v4, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$1$4;

    invoke-direct {v4, v13, v1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$parseEventAsTask$1$4;-><init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-wide v1, v2

    move-object/from16 v3, p1

    .line 42
    invoke-direct/range {v0 .. v8}, Lcom/zykj/sketch/core/data/GraphTask;-><init>(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lx7/a;ZLx7/a;ILkotlin/jvm/internal/n;)V

    .line 43
    invoke-virtual/range {p3 .. p3}, Lcom/zykj/sketch/core/data/RenderTask;->getGraphTask()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    move v0, v11

    move-object v4, v13

    goto :goto_1

    :goto_3
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

.method private final parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;)V"
        }
    .end annotation

    .line 44
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->newBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    .line 45
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 46
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 47
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->flag:I

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    move-result-object v1

    sget-object v2, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->ACTION_TOUCH:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    if-eq v1, v2, :cond_1

    .line 48
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->hasGraphSnapshot()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->flag:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "   "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 49
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 50
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 51
    iget p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->flag:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->flag:I

    .line 52
    :cond_1
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object p1

    const-string v0, "builder.build()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final getFlag()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->flag:I

    .line 2
    .line 3
    return v0
.end method

.method public parse(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lx7/l;)Lcom/zykj/sketch/core/data/RenderTask;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lx7/l;",
            ")",
            "Lcom/zykj/sketch/core/data/RenderTask;"
        }
    .end annotation

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventListener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "viewBack"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    invoke-direct/range {v1 .. v8}, Lcom/zykj/sketch/core/data/RenderTask;-><init>(Ljava/util/List;Ljava/util/List;Lcom/zykj/sketch/core/data/GraphTask;JILkotlin/jvm/internal/n;)V

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
    invoke-direct {p0, v0, p2, v1, p3}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lx7/l;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-wide p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->countTime:J

    .line 58
    .line 59
    invoke-virtual {v1, p1, p2}, Lcom/zykj/sketch/core/data/RenderTask;->setProgress(J)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public final setFlag(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->flag:I

    .line 2
    .line 3
    return-void
.end method
