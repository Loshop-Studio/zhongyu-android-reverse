# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;",
        ">;",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContentOrBuilder;"
    }
.end annotation


# instance fields
.field private actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/google/protobuf/Any;",
            "Lcom/google/protobuf/Any$Builder;",
            "Lcom/google/protobuf/AnyOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private action_:Lcom/google/protobuf/Any;

.field private graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

.field private resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

.field private type_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 6
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 7
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 8
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 10
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 12
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 13
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 14
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;-><init>()V

    return-void
.end method

.method private getActionFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/google/protobuf/Any;",
            "Lcom/google/protobuf/Any$Builder;",
            "Lcom/google/protobuf/AnyOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getAction()Lcom/google/protobuf/Any;

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
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$5600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private getGraphSnapshotFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

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
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private getResetDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;",
            "Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

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
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6000()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 2

    .line 3
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    .line 4
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6202(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;I)I

    .line 5
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_0

    .line 6
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6302(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/Any;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6302(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;

    .line 8
    :goto_0
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_1

    .line 9
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6402(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData;

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6402(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 11
    :goto_1
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_2

    .line 12
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6502(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    goto :goto_2

    .line 13
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6502(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 14
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 2

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 8
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    goto :goto_0

    .line 9
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 10
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    :goto_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 12
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    goto :goto_1

    .line 13
    :cond_1
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    :goto_1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_2

    .line 16
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    return-object p0

    .line 17
    :cond_2
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 18
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public clearAction()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    return-object p1
.end method

.method public clearGraphSnapshot()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    return-object p1
.end method

.method public clearResetData()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public clearType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getAction()Lcom/google/protobuf/Any;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

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
    check-cast v0, Lcom/google/protobuf/Any;

    .line 19
    .line 20
    return-object v0
.end method

.method public getActionBuilder()Lcom/google/protobuf/Any$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getActionFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/google/protobuf/Any$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getActionOrBuilder()Lcom/google/protobuf/AnyOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/google/protobuf/AnyOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$5600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 19
    .line 20
    return-object v0
.end method

.method public getGraphSnapshotBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getGraphSnapshotFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getGraphSnapshotOrBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

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
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 19
    .line 20
    return-object v0
.end method

.method public getResetDataBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->getResetDataFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getResetDataOrBuilder()Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$GraphResetDataOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public getType()Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->valueOf(I)Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->UNRECOGNIZED:Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getTypeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

    .line 2
    .line 3
    return v0
.end method

.method public hasAction()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

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

.method public hasGraphSnapshot()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

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

.method public hasResetData()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

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
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$5700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

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

.method public mergeAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/Any;->newBuilder(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/google/protobuf/Any$Builder;->mergeFrom(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->buildPartial()Lcom/google/protobuf/Any;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 2

    const/4 v0, 0x0

    .line 20
    :try_start_0
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6600()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 21
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 22
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
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

    .line 24
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 25
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 10
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->access$6200(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getTypeValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setTypeValue(I)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 13
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasAction()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getAction()Lcom/google/protobuf/Any;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 15
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getGraphSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 17
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasResetData()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 18
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->getResetData()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    .line 19
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0
.end method

.method public mergeGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->newBuilder(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

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

.method public mergeResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;->newBuilder(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

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

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public setAction(Lcom/google/protobuf/Any$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setAction(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->actionBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->action_:Lcom/google/protobuf/Any;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    return-object p1
.end method

.method public setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setGraphSnapshot(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshotBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->graphSnapshot_:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    return-object p1
.end method

.method public setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$GraphResetData$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setResetData(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetDataBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->resetData_:Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setType(Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionEnum;->getNumber()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setTypeValue(I)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->type_:I

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
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionContent$Builder;
    .locals 0

    .line 1
    return-object p0
.end method
