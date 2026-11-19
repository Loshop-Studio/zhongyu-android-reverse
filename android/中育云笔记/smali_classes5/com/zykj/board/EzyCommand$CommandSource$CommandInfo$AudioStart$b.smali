# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:Ljava/lang/Object;

.field public e:J

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d:Ljava/lang/Object;

    .line 5
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->isInitialized()Z

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

.method public e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyCommand$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)V

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

.method public final f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e:J

    .line 17
    .line 18
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->d(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;J)J

    .line 19
    .line 20
    .line 21
    :cond_1
    and-int/lit8 v0, v0, 0x4

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    :cond_2
    return-void
.end method

.method public g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e:J

    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->f:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->q()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->r()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

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

.method public j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    :cond_0
    :goto_0
    if-nez v0, :cond_5

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
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eq v1, v3, :cond_4

    .line 17
    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    if-eq v1, v3, :cond_3

    .line 21
    .line 22
    const/16 v3, 0x1a

    .line 23
    .line 24
    if-eq v1, v3, :cond_2

    .line 25
    .line 26
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    :cond_1
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :catch_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->f:Ljava/lang/Object;

    .line 43
    .line 44
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x4

    .line 47
    .line 48
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    iput-wide v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e:J

    .line 56
    .line 57
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 58
    .line 59
    or-int/lit8 v1, v1, 0x2

    .line 60
    .line 61
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d:Ljava/lang/Object;

    .line 69
    .line 70
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 71
    .line 72
    or-int/2addr v1, v2

    .line 73
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 81
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 86
    .line 87
    .line 88
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->n(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d:Ljava/lang/Object;

    .line 23
    .line 24
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 25
    .line 26
    or-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->m()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    cmp-long v0, v0, v2

    .line 40
    .line 41
    if-eqz v0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->m()J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->p(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->n()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_3

    .line 59
    .line 60
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->e(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->f:Ljava/lang/Object;

    .line 65
    .line 66
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 67
    .line 68
    or-int/lit8 v0, v0, 0x4

    .line 69
    .line 70
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method

.method public final o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public p(J)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->e:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public r(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public s(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->s(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->s(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;->t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    move-result-object p1

    return-object p1
.end method

.method public final t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart$b;

    .line 6
    .line 7
    return-object p1
.end method
