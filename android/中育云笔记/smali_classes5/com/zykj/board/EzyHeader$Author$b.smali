# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$Author$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyHeader$Author;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:J

.field public i:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->d:Ljava/lang/Object;

    .line 5
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->e:Ljava/lang/Object;

    .line 6
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->f:Ljava/lang/Object;

    .line 7
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 9
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->d:Ljava/lang/Object;

    .line 10
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->e:Ljava/lang/Object;

    .line 11
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->f:Ljava/lang/Object;

    .line 12
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->g:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$Author$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->d()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->d()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->e()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->e()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->g()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->g()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->g()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->g()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->j()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->j()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->j()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->j()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->j()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->j()Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyHeader$Author;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->e()Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Author;->isInitialized()Z

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

.method public e()Lcom/zykj/board/EzyHeader$Author;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyHeader$Author;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyHeader$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$Author$b;->f(Lcom/zykj/board/EzyHeader$Author;)V

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

.method public final f(Lcom/zykj/board/EzyHeader$Author;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Author;->c(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->e:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Author;->e(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->f:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Author;->g(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->g:Ljava/lang/Object;

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$Author;->m(Lcom/zykj/board/EzyHeader$Author;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_3
    and-int/lit8 v1, v0, 0x10

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    iget-wide v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->h:J

    .line 44
    .line 45
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyHeader$Author;->n(Lcom/zykj/board/EzyHeader$Author;J)J

    .line 46
    .line 47
    .line 48
    :cond_4
    and-int/lit8 v0, v0, 0x20

    .line 49
    .line 50
    if-eqz v0, :cond_5

    .line 51
    .line 52
    iget-wide v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->i:J

    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Lcom/zykj/board/EzyHeader$Author;->o(Lcom/zykj/board/EzyHeader$Author;J)J

    .line 55
    .line 56
    .line 57
    :cond_5
    return-void
.end method

.method public g()Lcom/zykj/board/EzyHeader$Author$b;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->e:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->f:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->g:Ljava/lang/Object;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->h:J

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->i:J

    .line 22
    .line 23
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->k()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$Author$b;->k()Lcom/zykj/board/EzyHeader$Author;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->g()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->h()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyHeader$Author;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyHeader$Author$b;

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

.method public j()Lcom/zykj/board/EzyHeader$Author$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyHeader$Author;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->t()Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Author$b;
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
    if-nez v0, :cond_8

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
    if-eq v1, v3, :cond_7

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    if-eq v1, v3, :cond_6

    .line 21
    .line 22
    const/16 v3, 0x1a

    .line 23
    .line 24
    if-eq v1, v3, :cond_5

    .line 25
    .line 26
    const/16 v3, 0x22

    .line 27
    .line 28
    if-eq v1, v3, :cond_4

    .line 29
    .line 30
    const/16 v3, 0x28

    .line 31
    .line 32
    if-eq v1, v3, :cond_3

    .line 33
    .line 34
    const/16 v3, 0x30

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_0

    .line 43
    .line 44
    :cond_1
    move v0, v2

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->i:J

    .line 55
    .line 56
    iget v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 57
    .line 58
    or-int/lit8 v1, v1, 0x20

    .line 59
    .line 60
    iput v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 64
    .line 65
    .line 66
    move-result-wide v1

    .line 67
    iput-wide v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->h:J

    .line 68
    .line 69
    iget v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 70
    .line 71
    or-int/lit8 v1, v1, 0x10

    .line 72
    .line 73
    iput v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->g:Ljava/lang/Object;

    .line 81
    .line 82
    iget v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 83
    .line 84
    or-int/lit8 v1, v1, 0x8

    .line 85
    .line 86
    iput v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->f:Ljava/lang/Object;

    .line 94
    .line 95
    iget v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 96
    .line 97
    or-int/lit8 v1, v1, 0x4

    .line 98
    .line 99
    iput v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->e:Ljava/lang/Object;

    .line 107
    .line 108
    iget v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 109
    .line 110
    or-int/lit8 v1, v1, 0x2

    .line 111
    .line 112
    iput v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    iput-object v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->d:Ljava/lang/Object;

    .line 120
    .line 121
    iget v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 122
    .line 123
    or-int/2addr v1, v2

    .line 124
    iput v1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 132
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 137
    .line 138
    .line 139
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyHeader$Author;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->n(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Author$b;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Author;->t()Lcom/zykj/board/EzyHeader$Author;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->r()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Author;->a(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->d:Ljava/lang/Object;

    .line 23
    .line 24
    iget v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 25
    .line 26
    or-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->y()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Author;->d(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->e:Ljava/lang/Object;

    .line 48
    .line 49
    iget v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 50
    .line 51
    or-int/lit8 v0, v0, 0x2

    .line 52
    .line 53
    iput v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->p()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Author;->f(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->f:Ljava/lang/Object;

    .line 73
    .line 74
    iget v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 75
    .line 76
    or-int/lit8 v0, v0, 0x4

    .line 77
    .line 78
    iput v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->z()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_4

    .line 92
    .line 93
    invoke-static {p1}, Lcom/zykj/board/EzyHeader$Author;->k(Lcom/zykj/board/EzyHeader$Author;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->g:Ljava/lang/Object;

    .line 98
    .line 99
    iget v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 100
    .line 101
    or-int/lit8 v0, v0, 0x8

    .line 102
    .line 103
    iput v0, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->getStartTime()J

    .line 109
    .line 110
    .line 111
    move-result-wide v0

    .line 112
    const-wide/16 v2, 0x0

    .line 113
    .line 114
    cmp-long v0, v0, v2

    .line 115
    .line 116
    if-eqz v0, :cond_5

    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->getStartTime()J

    .line 119
    .line 120
    .line 121
    move-result-wide v0

    .line 122
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;->v(J)Lcom/zykj/board/EzyHeader$Author$b;

    .line 123
    .line 124
    .line 125
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->v()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    cmp-long v0, v0, v2

    .line 130
    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$Author;->v()J

    .line 134
    .line 135
    .line 136
    move-result-wide v0

    .line 137
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyHeader$Author$b;->r(J)Lcom/zykj/board/EzyHeader$Author$b;

    .line 138
    .line 139
    .line 140
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 148
    .line 149
    .line 150
    return-object p0
.end method

.method public final o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public p(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->f:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x4

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public q(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->d:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public r(J)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->i:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public s(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->s(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$Author$b;->s(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyHeader$Author$b;->t(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyHeader$Author$b;->t(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$Author$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;

    move-result-object p1

    return-object p1
.end method

.method public t(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public u(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->e:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public v(J)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->h:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$Author$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public x(Ljava/lang/String;)Lcom/zykj/board/EzyHeader$Author$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->g:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x8

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyHeader$Author$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method
