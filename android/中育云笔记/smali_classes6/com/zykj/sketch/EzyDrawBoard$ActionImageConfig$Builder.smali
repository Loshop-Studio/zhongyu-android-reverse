# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfigOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;",
        ">;",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfigOrBuilder;"
    }
.end annotation


# instance fields
.field private height_:I

.field private path_:Ljava/lang/Object;

.field private positionFlag_:I

.field private startTime_:J

.field private type_:I

.field private viewHeight_:I

.field private viewWidth_:I

.field private width_:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 5
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 8
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$12000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$12400()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
    .locals 3

    .line 3
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    .line 4
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->type_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$12602(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;I)I

    .line 5
    iget-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->startTime_:J

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$12702(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;J)J

    .line 6
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$12802(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->width_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$12902(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;I)I

    .line 8
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->height_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$13002(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;I)I

    .line 9
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewWidth_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$13102(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;I)I

    .line 10
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewHeight_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$13202(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;I)I

    .line 11
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->positionFlag_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$13302(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;I)I

    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 3

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->type_:I

    const-wide/16 v1, 0x0

    .line 7
    iput-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->startTime_:J

    .line 8
    const-string v1, ""

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 9
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->width_:I

    .line 10
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->height_:I

    .line 11
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewWidth_:I

    .line 12
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewHeight_:I

    .line 13
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->positionFlag_:I

    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    return-object p1
.end method

.method public clearHeight()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->height_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    return-object p1
.end method

.method public clearPath()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getPath()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public clearPositionFlag()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->positionFlag_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearStartTime()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->startTime_:J

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public clearType()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->type_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearViewHeight()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewHeight_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearViewWidth()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewWidth_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearWidth()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->width_:I

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$12000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->height_:I

    .line 2
    .line 3
    return v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    return-object v0
.end method

.method public getPathBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getPositionFlag()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->positionFlag_:I

    .line 2
    .line 3
    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->startTime_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->type_:I

    .line 2
    .line 3
    return v0
.end method

.method public getViewHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewHeight_:I

    .line 2
    .line 3
    return v0
.end method

.method public getViewWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewWidth_:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->width_:I

    .line 2
    .line 3
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$12100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 2

    const/4 v0, 0x0

    .line 29
    :try_start_0
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$13400()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 30
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 31
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
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

    .line 33
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 34
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 4

    .line 10
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getType()I

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setType(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 13
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 15
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 16
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$12800(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 18
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getWidth()I

    move-result v0

    if-eqz v0, :cond_4

    .line 19
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getWidth()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 20
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getHeight()I

    move-result v0

    if-eqz v0, :cond_5

    .line 21
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getHeight()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 22
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getViewWidth()I

    move-result v0

    if-eqz v0, :cond_6

    .line 23
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getViewWidth()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setViewWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 24
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getViewHeight()I

    move-result v0

    if-eqz v0, :cond_7

    .line 25
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getViewHeight()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setViewHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 26
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getPositionFlag()I

    move-result v0

    if-eqz v0, :cond_8

    .line 27
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->getPositionFlag()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setPositionFlag(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    .line 28
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    return-object p1
.end method

.method public setHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->height_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setPath(Ljava/lang/String;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public setPathBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;->access$13500(Lcom/google/protobuf/ByteString;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->path_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setPositionFlag(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->positionFlag_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    return-object p1
.end method

.method public setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->startTime_:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setType(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->type_:I

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
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public setViewHeight(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewHeight_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setViewWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->viewWidth_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setWidth(I)Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig$Builder;->width_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
