# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/paint/Actions$NewPolylineData$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/Actions$NewPolylineDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/Actions$NewPolylineData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/paint/Actions$NewPolylineData$Builder;",
        ">;",
        "Lcom/zykj/paint/Actions$NewPolylineDataOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/paint/Actions$EzyColor;",
            "Lcom/zykj/paint/Actions$EzyColor$Builder;",
            "Lcom/zykj/paint/Actions$EzyColorOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private color_:Lcom/zykj/paint/Actions$EzyColor;

.field private pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            "Lcom/zykj/paint/Actions$EzyPoint$Builder;",
            "Lcom/zykj/paint/Actions$EzyPointOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private points_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;"
        }
    .end annotation
.end field

.field private stickyGraphId_:I

.field private width_:D


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 6
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 10
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;-><init>()V

    return-void
.end method

.method private ensurePointsIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private getColorFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/paint/Actions$EzyColor;",
            "Lcom/zykj/paint/Actions$EzyColor$Builder;",
            "Lcom/zykj/paint/Actions$EzyColorOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$7000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            "Lcom/zykj/paint/Actions$EzyPoint$Builder;",
            "Lcom/zykj/paint/Actions$EzyPointOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    and-int/2addr v2, v3

    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v0, v1, v3, v2, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 34
    .line 35
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7400()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllPoints(Ljava/lang/Iterable;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;)",
            "Lcom/zykj/paint/Actions$NewPolylineData$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

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

.method public addPoints(ILcom/zykj/paint/Actions$EzyPoint$Builder;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 19
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 20
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->build()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->build()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPoints(ILcom/zykj/paint/Actions$EzyPoint;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 10
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 12
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPoints(Lcom/zykj/paint/Actions$EzyPoint$Builder;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 14
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 15
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->build()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->build()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPoints(Lcom/zykj/paint/Actions$EzyPoint;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addPointsBuilder()Lcom/zykj/paint/Actions$EzyPoint$Builder;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/zykj/paint/Actions$EzyPoint;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/paint/Actions$EzyPoint$Builder;

    return-object v0
.end method

.method public addPointsBuilder(I)Lcom/zykj/paint/Actions$EzyPoint$Builder;
    .locals 2

    .line 4
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/paint/Actions$EzyPoint;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object v1

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$EzyPoint$Builder;

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->build()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->build()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->buildPartial()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$NewPolylineData;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->buildPartial()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->buildPartial()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 3

    .line 3
    new-instance v0, Lcom/zykj/paint/Actions$NewPolylineData;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/paint/Actions$NewPolylineData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/paint/Actions$1;)V

    .line 4
    iget v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 5
    iget-object v2, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v2, :cond_1

    const/4 v2, 0x1

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    .line 6
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 7
    iget v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 8
    :cond_0
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7602(Lcom/zykj/paint/Actions$NewPolylineData;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 9
    :cond_1
    invoke-virtual {v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7602(Lcom/zykj/paint/Actions$NewPolylineData;Ljava/util/List;)Ljava/util/List;

    .line 10
    :goto_0
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_2

    .line 11
    iget-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7702(Lcom/zykj/paint/Actions$NewPolylineData;Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$EzyColor;

    goto :goto_1

    .line 12
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/zykj/paint/Actions$EzyColor;

    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7702(Lcom/zykj/paint/Actions$NewPolylineData;Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$EzyColor;

    .line 13
    :goto_1
    iget-wide v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->width_:D

    invoke-static {v0, v1, v2}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7802(Lcom/zykj/paint/Actions$NewPolylineData;D)D

    .line 14
    iget v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->stickyGraphId_:I

    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7902(Lcom/zykj/paint/Actions$NewPolylineData;I)I

    const/4 v1, 0x0

    .line 15
    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$8002(Lcom/zykj/paint/Actions$NewPolylineData;I)I

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clear()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clear()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clear()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clear()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 2

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 6
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 8
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 11
    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    goto :goto_1

    .line 12
    :cond_1
    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 13
    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    :goto_1
    const-wide/16 v0, 0x0

    .line 14
    iput-wide v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->width_:D

    const/4 v0, 0x0

    .line 15
    iput v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->stickyGraphId_:I

    return-object p0
.end method

.method public clearColor()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    return-object p1
.end method

.method public clearPoints()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x2

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

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

.method public clearStickyGraphId()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->stickyGraphId_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearWidth()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->width_:D

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clone()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clone()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clone()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clone()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clone()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->clone()Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getColor()Lcom/zykj/paint/Actions$EzyColor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/paint/Actions$EzyColor;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyColor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessage()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/paint/Actions$EzyColor;

    .line 19
    .line 20
    return-object v0
.end method

.method public getColorBuilder()Lcom/zykj/paint/Actions$EzyColor$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getColorFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getColorOrBuilder()Lcom/zykj/paint/Actions$EzyColorOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/paint/Actions$EzyColorOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/paint/Actions$EzyColor;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyColor;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/paint/Actions$NewPolylineData;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->getDefaultInstance()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$7000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getPoints(I)Lcom/zykj/paint/Actions$EzyPoint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/paint/Actions$EzyPoint;

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
    check-cast p1, Lcom/zykj/paint/Actions$EzyPoint;

    .line 19
    .line 20
    return-object p1
.end method

.method public getPointsBuilder(I)Lcom/zykj/paint/Actions$EzyPoint$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

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
    check-cast p1, Lcom/zykj/paint/Actions$EzyPoint$Builder;

    .line 10
    .line 11
    return-object p1
.end method

.method public getPointsBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint$Builder;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

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

.method public getPointsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

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

.method public getPointsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/paint/Actions$EzyPoint;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

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

.method public getPointsOrBuilder(I)Lcom/zykj/paint/Actions$EzyPointOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/paint/Actions$EzyPointOrBuilder;

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
    check-cast p1, Lcom/zykj/paint/Actions$EzyPointOrBuilder;

    .line 19
    .line 20
    return-object p1
.end method

.method public getPointsOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/paint/Actions$EzyPointOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

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
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

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

.method public getStickyGraphId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->stickyGraphId_:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->width_:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public hasColor()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$7100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$NewPolylineData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

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

.method public mergeColor(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/paint/Actions$EzyColor;->newBuilder(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyColor$Builder;->mergeFrom(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$EzyColor$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyColor$Builder;->buildPartial()Lcom/zykj/paint/Actions$EzyColor;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 2

    const/4 v0, 0x0

    .line 35
    :try_start_0
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->access$8200()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 36
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$NewPolylineData;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 37
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/paint/Actions$NewPolylineData;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
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

    .line 39
    invoke-virtual {p0, v0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$NewPolylineData;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 40
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/paint/Actions$NewPolylineData;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData;

    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$NewPolylineData;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/paint/Actions$NewPolylineData;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 4

    .line 10
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->getDefaultInstance()Lcom/zykj/paint/Actions$NewPolylineData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_2

    .line 12
    invoke-static {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7600(Lcom/zykj/paint/Actions$NewPolylineData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 13
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 14
    invoke-static {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7600(Lcom/zykj/paint/Actions$NewPolylineData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 15
    iget v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    goto :goto_0

    .line 16
    :cond_1
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 17
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-static {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7600(Lcom/zykj/paint/Actions$NewPolylineData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    goto :goto_1

    .line 19
    :cond_2
    invoke-static {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7600(Lcom/zykj/paint/Actions$NewPolylineData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 20
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 21
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 23
    invoke-static {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7600(Lcom/zykj/paint/Actions$NewPolylineData;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    .line 24
    iget v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x2

    iput v1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->bitField0_:I

    .line 25
    invoke-static {}, Lcom/zykj/paint/Actions$NewPolylineData;->access$8100()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 26
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->getPointsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    :cond_3
    iput-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    goto :goto_1

    .line 27
    :cond_4
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-static {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->access$7600(Lcom/zykj/paint/Actions$NewPolylineData;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 28
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->hasColor()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 29
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getColor()Lcom/zykj/paint/Actions$EzyColor;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeColor(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 30
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v0, v0, v2

    if-eqz v0, :cond_7

    .line 31
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getWidth()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setWidth(D)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 32
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    move-result v0

    if-eqz v0, :cond_8

    .line 33
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$NewPolylineData;->getStickyGraphId()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setStickyGraphId(I)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    .line 34
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public removePoints(I)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

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

.method public setColor(Lcom/zykj/paint/Actions$EzyColor$Builder;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyColor$Builder;->build()Lcom/zykj/paint/Actions$EzyColor;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyColor$Builder;->build()Lcom/zykj/paint/Actions$EzyColor;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setColor(Lcom/zykj/paint/Actions$EzyColor;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->colorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->color_:Lcom/zykj/paint/Actions$EzyColor;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    return-object p1
.end method

.method public setPoints(ILcom/zykj/paint/Actions$EzyPoint$Builder;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 9
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->build()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/paint/Actions$EzyPoint$Builder;->build()Lcom/zykj/paint/Actions$EzyPoint;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public setPoints(ILcom/zykj/paint/Actions$EzyPoint;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->pointsBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->ensurePointsIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->points_:Ljava/util/List;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    return-object p1
.end method

.method public setStickyGraphId(I)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->stickyGraphId_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public setWidth(D)Lcom/zykj/paint/Actions$NewPolylineData$Builder;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/paint/Actions$NewPolylineData$Builder;->width_:D

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
