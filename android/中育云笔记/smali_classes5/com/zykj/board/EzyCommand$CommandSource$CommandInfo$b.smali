# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:J

.field public e:J

.field public f:Z

.field public g:I

.field public h:Lcom/google/protobuf/ByteString;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g:I

    .line 5
    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g:I

    .line 8
    sget-object p1, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h:Lcom/google/protobuf/ByteString;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->isInitialized()Z

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

.method public e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyCommand$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

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

.method public final f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->d:J

    .line 8
    .line 9
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)J

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
    iget-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e:J

    .line 17
    .line 18
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)J

    .line 19
    .line 20
    .line 21
    :cond_1
    and-int/lit8 v1, v0, 0x4

    .line 22
    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-boolean v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->f:Z

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->d(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;Z)Z

    .line 28
    .line 29
    .line 30
    :cond_2
    and-int/lit8 v1, v0, 0x8

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g:I

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;I)I

    .line 37
    .line 38
    .line 39
    :cond_3
    and-int/lit8 v0, v0, 0x10

    .line 40
    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h:Lcom/google/protobuf/ByteString;

    .line 44
    .line 45
    invoke-static {p1, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->g(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;Lcom/google/protobuf/ByteString;)Lcom/google/protobuf/ByteString;

    .line 46
    .line 47
    .line 48
    :cond_4
    return-void
.end method

.method public g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->d:J

    .line 10
    .line 11
    iput-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e:J

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->f:Z

    .line 14
    .line 15
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g:I

    .line 16
    .line 17
    sget-object v0, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 18
    .line 19
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h:Lcom/google/protobuf/ByteString;

    .line 20
    .line 21
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->g()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->k()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

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

.method public j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->o()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_7

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
    if-eq v1, v3, :cond_6

    .line 17
    .line 18
    const/16 v4, 0x10

    .line 19
    .line 20
    if-eq v1, v4, :cond_5

    .line 21
    .line 22
    const/16 v5, 0x18

    .line 23
    .line 24
    if-eq v1, v5, :cond_4

    .line 25
    .line 26
    const/16 v5, 0x20

    .line 27
    .line 28
    if-eq v1, v5, :cond_3

    .line 29
    .line 30
    const/16 v3, 0x2a

    .line 31
    .line 32
    if-eq v1, v3, :cond_2

    .line 33
    .line 34
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_0

    .line 39
    .line 40
    :cond_1
    move v0, v2

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    goto :goto_2

    .line 44
    :catch_0
    move-exception p1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBytes()Lcom/google/protobuf/ByteString;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h:Lcom/google/protobuf/ByteString;

    .line 51
    .line 52
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 53
    .line 54
    or-int/2addr v1, v4

    .line 55
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g:I

    .line 63
    .line 64
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 65
    .line 66
    or-int/2addr v1, v3

    .line 67
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    iput-boolean v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->f:Z

    .line 75
    .line 76
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 77
    .line 78
    or-int/lit8 v1, v1, 0x4

    .line 79
    .line 80
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    iput-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e:J

    .line 88
    .line 89
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 90
    .line 91
    or-int/lit8 v1, v1, 0x2

    .line 92
    .line 93
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    iput-wide v3, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->d:J

    .line 101
    .line 102
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 103
    .line 104
    or-int/2addr v1, v2

    .line 105
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 114
    .line 115
    .line 116
    throw p1

    .line 117
    :cond_7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 118
    .line 119
    .line 120
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->n(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

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

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->o()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const-wide/16 v2, 0x0

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->r()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->s(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    cmp-long v0, v0, v2

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->t()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->t(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->u()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->u()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->v(Z)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->e(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->m()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->q(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    sget-object v1, Lcom/google/protobuf/ByteString;->EMPTY:Lcom/google/protobuf/ByteString;

    .line 71
    .line 72
    if-eq v0, v1, :cond_5

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;->n()Lcom/google/protobuf/ByteString;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->r(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 79
    .line 80
    .line 81
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 89
    .line 90
    .line 91
    return-object p0
.end method

.method public final o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public p(Lcom/zykj/board/EzyCommandEnum$CommandEnum;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x8

    .line 7
    .line 8
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->getNumber()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g:I

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method public q(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->g:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public r(Lcom/google/protobuf/ByteString;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->h:Lcom/google/protobuf/ByteString;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x10

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public s(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->d:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->w(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->w(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public t(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->e:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public u(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public v(Z)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->f:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public w(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public final x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$b;

    .line 6
    .line 7
    return-object p1
.end method
