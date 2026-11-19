# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEventOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;",
        ">;",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEventOrBuilder;"
    }
.end annotation


# instance fields
.field private action_:I

.field private bitField0_:I

.field private eventTime_:J

.field private pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private pointerCoords_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;",
            ">;"
        }
    .end annotation
.end field

.field private pointerCount_:I

.field private pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private pointerProperties_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation
.end field

.field private x_:F

.field private y_:F


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 5
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 6
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 10
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;-><init>()V

    return-void
.end method

.method private ensurePointerCoordsIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private ensurePointerPropertiesIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$7000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 10
    .line 11
    const/16 v3, 0x10

    .line 12
    .line 13
    and-int/2addr v2, v3

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 36
    .line 37
    return-object v0
.end method

.method private getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 10
    .line 11
    const/16 v3, 0x8

    .line 12
    .line 13
    and-int/2addr v2, v3

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 34
    .line 35
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 36
    .line 37
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9400()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllPointerCoords(Ljava/lang/Iterable;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;",
            ">;)",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public addAllPointerProperties(Ljava/lang/Iterable;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;",
            ">;)",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public addPointerCoords(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 19
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerCoords(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 10
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 12
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerCoords(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 14
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 15
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerCoords(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerCoordsBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    return-object v0
.end method

.method public addPointerCoordsBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;
    .locals 2

    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object v1

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    return-object p1
.end method

.method public addPointerProperties(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 19
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerProperties(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 10
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 12
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerProperties(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 14
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 15
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerProperties(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointerPropertiesBuilder()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;

    return-object v0
.end method

.method public addPointerPropertiesBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;
    .locals 2

    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object v1

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 5
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
    .locals 3

    .line 3
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    .line 4
    iget-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->eventTime_:J

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9602(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;J)J

    .line 5
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->action_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9702(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;I)I

    .line 6
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCount_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9802(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;I)I

    .line 7
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v1, :cond_1

    .line 8
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    .line 9
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 10
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9902(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9902(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 13
    :goto_0
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v1, :cond_3

    .line 14
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    const/16 v2, 0x10

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    .line 15
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 16
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x11

    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 17
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10002(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    goto :goto_1

    .line 18
    :cond_3
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10002(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 19
    :goto_1
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->x_:F

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10102(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;F)F

    .line 20
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->y_:F

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10202(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;F)F

    const/4 v1, 0x0

    .line 21
    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10302(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;I)I

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 2

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    const-wide/16 v0, 0x0

    .line 6
    iput-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->eventTime_:J

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->action_:I

    .line 8
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCount_:I

    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 10
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 11
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 13
    :goto_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_1

    .line 14
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 15
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    :goto_1
    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->x_:F

    .line 18
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->y_:F

    return-object p0
.end method

.method public clearAction()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->action_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearEventTime()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->eventTime_:J

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    return-object p1
.end method

.method public clearPointerCoords()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x11

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearPointerCount()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCount_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearPointerProperties()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x9

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearX()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->x_:F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearY()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->y_:F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAction()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->action_:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$7000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getEventTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->eventTime_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getPointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(I)Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    .line 19
    .line 20
    return-object p1
.end method

.method public getPointerCoordsBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilder(I)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;

    .line 10
    .line 11
    return-object p1
.end method

.method public getPointerCoordsBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilderList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPointerCoordsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public getPointerCoordsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getPointerCoordsOrBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;

    .line 19
    .line 20
    return-object p1
.end method

.method public getPointerCoordsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoordsOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilderList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getPointerCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCount_:I

    .line 2
    .line 3
    return v0
.end method

.method public getPointerProperties(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(I)Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    .line 19
    .line 20
    return-object p1
.end method

.method public getPointerPropertiesBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilder(I)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;

    .line 10
    .line 11
    return-object p1
.end method

.method public getPointerPropertiesBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilderList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getPointerPropertiesCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public getPointerPropertiesList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getPointerPropertiesOrBuilder(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;

    .line 19
    .line 20
    return-object p1
.end method

.method public getPointerPropertiesOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerPropertiesOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilderList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->x_:F

    .line 2
    .line 3
    return v0
.end method

.method public getY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->y_:F

    .line 2
    .line 3
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$7100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 2

    const/4 v0, 0x0

    .line 56
    :try_start_0
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10600()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 57
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 58
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 59
    :try_start_2
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    .line 60
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 61
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 4

    .line 10
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getEventTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setEventTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 13
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getAction()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setAction(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 15
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCount()I

    move-result v0

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getPointerCount()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setPointerCount(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 17
    :cond_3
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    .line 18
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9900(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 19
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 20
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9900(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 21
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    goto :goto_0

    .line 22
    :cond_4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 23
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9900(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 24
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    goto :goto_2

    .line 25
    :cond_5
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9900(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 26
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 27
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 28
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 29
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9900(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 30
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 31
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10400()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 32
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    goto :goto_1

    :cond_6
    move-object v0, v1

    :goto_1
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    goto :goto_2

    .line 33
    :cond_7
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$9900(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 34
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_a

    .line 35
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10000(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 36
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 37
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10000(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 38
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    goto :goto_3

    .line 39
    :cond_9
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 40
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10000(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 41
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    goto :goto_4

    .line 42
    :cond_a
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10000(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 43
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 44
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 45
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 46
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10000(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 47
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->bitField0_:I

    .line 48
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10500()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 49
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v1

    :cond_b
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    goto :goto_4

    .line 50
    :cond_c
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->access$10000(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 51
    :cond_d
    :goto_4
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_e

    .line 52
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 53
    :cond_e
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_f

    .line 54
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;->getY()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    .line 55
    :cond_f
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public removePointerCoords(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->remove(I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public removePointerProperties(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->remove(I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public setAction(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->action_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setEventTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->eventTime_:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    return-object p1
.end method

.method public setPointerCoords(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public setPointerCoords(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerCoords;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoordsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerCoordsIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCoords_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public setPointerCount(I)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerCount_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setPointerProperties(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public setPointerProperties(ILcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$PointerProperties;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerPropertiesBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->ensurePointerPropertiesIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->pointerProperties_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public setX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->x_:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent$Builder;->y_:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
