# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:I

.field public e:Ljava/lang/Object;

.field public f:Lcom/zykj/board/EzyRectF$RectF;

.field public g:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public k:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d:I

    .line 5
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e:Ljava/lang/Object;

    .line 6
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h:Ljava/lang/Object;

    .line 7
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i:Ljava/lang/Object;

    .line 8
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

    .line 9
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 11
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d:I

    .line 12
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e:Ljava/lang/Object;

    .line 13
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h:Ljava/lang/Object;

    .line 14
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i:Ljava/lang/Object;

    .line 15
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

    .line 16
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;-><init>()V

    return-void
.end method

.method private getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->m()Lcom/zykj/board/EzyRectF$RectF;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->u()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public A(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public B(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x10

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public C(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final D(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->isInitialized()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    throw v0
.end method

.method public e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyCommand$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d:I

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;I)I

    .line 10
    .line 11
    .line 12
    :cond_0
    and-int/lit8 v1, v0, 0x2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->e(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_1
    and-int/lit8 v1, v0, 0x4

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lcom/zykj/board/EzyRectF$RectF;

    .line 37
    .line 38
    :goto_0
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF;

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    goto :goto_1

    .line 43
    :cond_3
    const/4 v1, 0x0

    .line 44
    :goto_1
    and-int/lit8 v2, v0, 0x8

    .line 45
    .line 46
    if-eqz v2, :cond_4

    .line 47
    .line 48
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h:Ljava/lang/Object;

    .line 49
    .line 50
    invoke-static {p1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->k(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    :cond_4
    and-int/lit8 v2, v0, 0x10

    .line 54
    .line 55
    if-eqz v2, :cond_5

    .line 56
    .line 57
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i:Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {p1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->n(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    :cond_5
    and-int/lit8 v2, v0, 0x20

    .line 63
    .line 64
    if-eqz v2, :cond_6

    .line 65
    .line 66
    iget v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j:I

    .line 67
    .line 68
    invoke-static {p1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->o(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;I)I

    .line 69
    .line 70
    .line 71
    :cond_6
    and-int/lit8 v0, v0, 0x40

    .line 72
    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {p1, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->r(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_7
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->t(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;I)I

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 6
    .line 7
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d:I

    .line 8
    .line 9
    const-string v1, ""

    .line 10
    .line 11
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    invoke-virtual {v3}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 24
    .line 25
    :cond_0
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i:Ljava/lang/Object;

    .line 28
    .line 29
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j:I

    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

    .line 32
    .line 33
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->m()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->p()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

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

.method public j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

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

.method public m()Lcom/zykj/board/EzyRectF$RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->f()Lcom/zykj/board/EzyRectF$RectF;

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
    check-cast v0, Lcom/zykj/board/EzyRectF$RectF;

    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->o(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->p(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->o(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->o(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->p(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->o(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public n()Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public o(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 5

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_9

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    const/16 v3, 0x8

    .line 15
    .line 16
    if-eq v1, v3, :cond_8

    .line 17
    .line 18
    const/16 v4, 0x12

    .line 19
    .line 20
    if-eq v1, v4, :cond_7

    .line 21
    .line 22
    const/16 v4, 0x1a

    .line 23
    .line 24
    if-eq v1, v4, :cond_6

    .line 25
    .line 26
    const/16 v4, 0x22

    .line 27
    .line 28
    if-eq v1, v4, :cond_5

    .line 29
    .line 30
    const/16 v3, 0x2a

    .line 31
    .line 32
    if-eq v1, v3, :cond_4

    .line 33
    .line 34
    const/16 v3, 0x30

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    const/16 v3, 0x3a

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    :cond_1
    move v0, v2

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_2

    .line 52
    :catch_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

    .line 59
    .line 60
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 61
    .line 62
    or-int/lit8 v1, v1, 0x40

    .line 63
    .line 64
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->j:I

    .line 72
    .line 73
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 74
    .line 75
    or-int/lit8 v1, v1, 0x20

    .line 76
    .line 77
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i:Ljava/lang/Object;

    .line 85
    .line 86
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 87
    .line 88
    or-int/lit8 v1, v1, 0x10

    .line 89
    .line 90
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h:Ljava/lang/Object;

    .line 98
    .line 99
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 100
    .line 101
    or-int/2addr v1, v3

    .line 102
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 114
    .line 115
    .line 116
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 117
    .line 118
    or-int/lit8 v1, v1, 0x4

    .line 119
    .line 120
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e:Ljava/lang/Object;

    .line 128
    .line 129
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 130
    .line 131
    or-int/lit8 v1, v1, 0x2

    .line 132
    .line 133
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 134
    .line 135
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d:I

    .line 142
    .line 143
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 144
    .line 145
    or-int/2addr v1, v2

    .line 146
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 156
    .line 157
    .line 158
    throw p1

    .line 159
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 160
    .line 161
    .line 162
    return-object p0
.end method

.method public p(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->q(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public q(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->v()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->C()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->w(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->D()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->d(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e:Ljava/lang/Object;

    .line 36
    .line 37
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 38
    .line 39
    or-int/lit8 v0, v0, 0x2

    .line 40
    .line 41
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->hasOutRect()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->E()Lcom/zykj/board/EzyRectF$RectF;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->r(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->F()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->g(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h:Ljava/lang/Object;

    .line 74
    .line 75
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 76
    .line 77
    or-int/lit8 v0, v0, 0x8

    .line 78
    .line 79
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 82
    .line 83
    .line 84
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->G()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_5

    .line 93
    .line 94
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->m(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->i:Ljava/lang/Object;

    .line 99
    .line 100
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 101
    .line 102
    or-int/lit8 v0, v0, 0x10

    .line 103
    .line 104
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 107
    .line 108
    .line 109
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->H()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->H()I

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->C(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 120
    .line 121
    .line 122
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->z()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-nez v0, :cond_7

    .line 131
    .line 132
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->p(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

    .line 137
    .line 138
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 139
    .line 140
    or-int/lit8 v0, v0, 0x40

    .line 141
    .line 142
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 143
    .line 144
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 155
    .line 156
    .line 157
    return-object p0
.end method

.method public r(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->f()Lcom/zykj/board/EzyRectF$RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->n()Lcom/zykj/board/EzyRectF$RectF$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->n(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 33
    .line 34
    .line 35
    :goto_0
    iget-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x4

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public final s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->A(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->A(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->D(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->D(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x40

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public u(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public v(Lcom/zykj/board/EzyGraphEnum$GraphEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x1

    .line 7
    .line 8
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public w(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->d:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public x(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public y(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->f:Lcom/zykj/board/EzyRectF$RectF;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 12
    .line 13
    .line 14
    :goto_0
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x4

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public z(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x8

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method
