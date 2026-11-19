# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$ActionZoomOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;",
        ">;",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionZoomOrBuilder;"
    }
.end annotation


# instance fields
.field private centerX_:F

.field private centerY_:F

.field private keep_:Z

.field private scaleX_:F

.field private scaleY_:F

.field private startTime_:J

.field private type_:I


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 6
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;-><init>()V

    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$25400()Lcom/google/protobuf/Descriptors$Descriptor;

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
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$25800()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 3

    .line 3
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    .line 4
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->type_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26002(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;I)I

    .line 5
    iget-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->startTime_:J

    invoke-static {v0, v1, v2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26102(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;J)J

    .line 6
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleX_:F

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26202(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F

    .line 7
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleY_:F

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26302(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F

    .line 8
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerX_:F

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26402(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F

    .line 9
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerY_:F

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26502(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;F)F

    .line 10
    iget-boolean v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->keep_:Z

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26602(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;Z)Z

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 3

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->type_:I

    const-wide/16 v1, 0x0

    .line 7
    iput-wide v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->startTime_:J

    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleX_:F

    .line 9
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleY_:F

    .line 10
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerX_:F

    .line 11
    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerY_:F

    .line 12
    iput-boolean v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->keep_:Z

    return-object p0
.end method

.method public clearCenterX()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerX_:F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearCenterY()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerY_:F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    return-object p1
.end method

.method public clearKeep()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->keep_:Z

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
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    return-object p1
.end method

.method public clearScaleX()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleX_:F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearScaleY()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleY_:F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearStartTime()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->startTime_:J

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public clearType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->type_:I

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
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getCenterX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerX_:F

    .line 2
    .line 3
    return v0
.end method

.method public getCenterY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerY_:F

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$25400()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getKeep()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->keep_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getScaleX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleX_:F

    .line 2
    .line 3
    return v0
.end method

.method public getScaleY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleY_:F

    .line 2
    .line 3
    return v0
.end method

.method public getStartTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->startTime_:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->type_:I

    .line 2
    .line 3
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$25500()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 2

    const/4 v0, 0x0

    .line 26
    :try_start_0
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->access$26700()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 27
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 28
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
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

    .line 30
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 31
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 4

    .line 10
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getType()I

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getType()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setType(I)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 13
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getStartTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getStartTime()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 15
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleX()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setScaleX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 17
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleY()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    .line 18
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getScaleY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setScaleY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 19
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterX()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_5

    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterX()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setCenterX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 21
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterY()F

    move-result v0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    .line 22
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getCenterY()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setCenterY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 23
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getKeep()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 24
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;->getKeep()Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setKeep(Z)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    .line 25
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public setCenterX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerX_:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setCenterY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->centerY_:F

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    return-object p1
.end method

.method public setKeep(Z)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->keep_:Z

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    return-object p1
.end method

.method public setScaleX(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleX_:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setScaleY(F)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->scaleY_:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setStartTime(J)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->startTime_:J

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setType(I)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->type_:I

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
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$ActionZoom$Builder;
    .locals 0

    .line 1
    return-object p0
.end method
