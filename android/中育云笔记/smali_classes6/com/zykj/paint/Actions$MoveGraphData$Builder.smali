# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/paint/Actions$MoveGraphData$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/paint/Actions$MoveGraphDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/paint/Actions$MoveGraphData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/paint/Actions$MoveGraphData$Builder;",
        ">;",
        "Lcom/zykj/paint/Actions$MoveGraphDataOrBuilder;"
    }
.end annotation


# instance fields
.field private vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/paint/Actions$EzyVector;",
            "Lcom/zykj/paint/Actions$EzyVector$Builder;",
            "Lcom/zykj/paint/Actions$EzyVectorOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private vector_:Lcom/zykj/paint/Actions$EzyVector;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 5
    invoke-direct {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 8
    invoke-direct {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/paint/Actions$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$3100()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private getVectorFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/paint/Actions$EzyVector;",
            "Lcom/zykj/paint/Actions$EzyVector$Builder;",
            "Lcom/zykj/paint/Actions$EzyVectorOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->getVector()Lcom/zykj/paint/Actions$EzyVector;

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
    iput-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions$MoveGraphData;->access$3500()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->build()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->build()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/paint/Actions$MoveGraphData;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->buildPartial()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/paint/Actions$MoveGraphData;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->buildPartial()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->buildPartial()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/paint/Actions$MoveGraphData;
    .locals 2

    .line 3
    new-instance v0, Lcom/zykj/paint/Actions$MoveGraphData;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/paint/Actions$MoveGraphData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/paint/Actions$1;)V

    .line 4
    iget-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$MoveGraphData;->access$3702(Lcom/zykj/paint/Actions$MoveGraphData;Lcom/zykj/paint/Actions$EzyVector;)Lcom/zykj/paint/Actions$EzyVector;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/zykj/paint/Actions$EzyVector;

    invoke-static {v0, v1}, Lcom/zykj/paint/Actions$MoveGraphData;->access$3702(Lcom/zykj/paint/Actions$MoveGraphData;Lcom/zykj/paint/Actions$EzyVector;)Lcom/zykj/paint/Actions$EzyVector;

    .line 7
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clear()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clear()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clear()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clear()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 2

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 6
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 7
    iput-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    return-object p0

    .line 8
    :cond_0
    iput-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 9
    iput-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    return-object p1
.end method

.method public clearVector()Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clone()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clone()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clone()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clone()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clone()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->clone()Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->getDefaultInstanceForType()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/paint/Actions$MoveGraphData;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/paint/Actions$MoveGraphData;->getDefaultInstance()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/paint/Actions;->access$3100()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getVector()Lcom/zykj/paint/Actions$EzyVector;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/paint/Actions$EzyVector;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyVector;

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
    check-cast v0, Lcom/zykj/paint/Actions$EzyVector;

    .line 19
    .line 20
    return-object v0
.end method

.method public getVectorBuilder()Lcom/zykj/paint/Actions$EzyVector$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->getVectorFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/paint/Actions$EzyVector$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getVectorOrBuilder()Lcom/zykj/paint/Actions$EzyVectorOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/paint/Actions$EzyVectorOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/paint/Actions$EzyVector;->getDefaultInstance()Lcom/zykj/paint/Actions$EzyVector;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public hasVector()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

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
    invoke-static {}, Lcom/zykj/paint/Actions;->access$3200()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/paint/Actions$MoveGraphData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/paint/Actions$MoveGraphData$Builder;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 2

    const/4 v0, 0x0

    .line 14
    :try_start_0
    invoke-static {}, Lcom/zykj/paint/Actions$MoveGraphData;->access$3800()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$MoveGraphData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 15
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$MoveGraphData;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 16
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/paint/Actions$MoveGraphData;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
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

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$MoveGraphData;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    .line 19
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/paint/Actions$MoveGraphData;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/paint/Actions$MoveGraphData;

    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeFrom(Lcom/zykj/paint/Actions$MoveGraphData;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/paint/Actions$MoveGraphData;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 1

    .line 10
    invoke-static {}, Lcom/zykj/paint/Actions$MoveGraphData;->getDefaultInstance()Lcom/zykj/paint/Actions$MoveGraphData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$MoveGraphData;->hasVector()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$MoveGraphData;->getVector()Lcom/zykj/paint/Actions$EzyVector;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeVector(Lcom/zykj/paint/Actions$EzyVector;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public mergeVector(Lcom/zykj/paint/Actions$EzyVector;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/paint/Actions$EzyVector;->newBuilder(Lcom/zykj/paint/Actions$EzyVector;)Lcom/zykj/paint/Actions$EzyVector$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/paint/Actions$EzyVector$Builder;->mergeFrom(Lcom/zykj/paint/Actions$EzyVector;)Lcom/zykj/paint/Actions$EzyVector$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyVector$Builder;->buildPartial()Lcom/zykj/paint/Actions$EzyVector;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

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

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public setVector(Lcom/zykj/paint/Actions$EzyVector$Builder;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyVector$Builder;->build()Lcom/zykj/paint/Actions$EzyVector;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/paint/Actions$EzyVector$Builder;->build()Lcom/zykj/paint/Actions$EzyVector;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setVector(Lcom/zykj/paint/Actions$EzyVector;)Lcom/zykj/paint/Actions$MoveGraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vectorBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/paint/Actions$MoveGraphData$Builder;->vector_:Lcom/zykj/paint/Actions$EzyVector;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method
