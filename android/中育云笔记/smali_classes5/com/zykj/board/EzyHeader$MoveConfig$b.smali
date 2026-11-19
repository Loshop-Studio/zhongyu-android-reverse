# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyHeader$MoveConfig$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyHeader$MoveConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyHeader$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->d()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->d()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j()Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->isInitialized()Z

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

.method public e()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyHeader$MoveConfig;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyHeader$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->f(Lcom/zykj/board/EzyHeader$MoveConfig;)V

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

.method public final f(Lcom/zykj/board/EzyHeader$MoveConfig;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->d:Z

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$MoveConfig;->a(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z

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
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e:Z

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$MoveConfig;->c(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z

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
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->f:Z

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$MoveConfig;->d(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z

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
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g:Z

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$MoveConfig;->e(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z

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
    iget-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->h:Z

    .line 44
    .line 45
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$MoveConfig;->f(Lcom/zykj/board/EzyHeader$MoveConfig;Z)Z

    .line 46
    .line 47
    .line 48
    :cond_4
    and-int/lit8 v1, v0, 0x20

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->i:I

    .line 53
    .line 54
    invoke-static {p1, v1}, Lcom/zykj/board/EzyHeader$MoveConfig;->g(Lcom/zykj/board/EzyHeader$MoveConfig;I)I

    .line 55
    .line 56
    .line 57
    :cond_5
    and-int/lit8 v0, v0, 0x40

    .line 58
    .line 59
    if-eqz v0, :cond_6

    .line 60
    .line 61
    iget v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j:I

    .line 62
    .line 63
    invoke-static {p1, v0}, Lcom/zykj/board/EzyHeader$MoveConfig;->k(Lcom/zykj/board/EzyHeader$MoveConfig;I)I

    .line 64
    .line 65
    .line 66
    :cond_6
    return-void
.end method

.method public g()Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->d:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->f:Z

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g:Z

    .line 14
    .line 15
    iput-boolean v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->h:Z

    .line 16
    .line 17
    iput v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->i:I

    .line 18
    .line 19
    iput v0, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j:I

    .line 20
    .line 21
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->k()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->k()Lcom/zykj/board/EzyHeader$MoveConfig;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->c()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader;->d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyHeader$MoveConfig$b;

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

.method public j()Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyHeader$MoveConfig;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->m()Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
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
    const/16 v4, 0x10

    .line 19
    .line 20
    if-eq v1, v4, :cond_7

    .line 21
    .line 22
    const/16 v5, 0x18

    .line 23
    .line 24
    if-eq v1, v5, :cond_6

    .line 25
    .line 26
    const/16 v5, 0x20

    .line 27
    .line 28
    if-eq v1, v5, :cond_5

    .line 29
    .line 30
    const/16 v3, 0x28

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
    const/16 v3, 0x38

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
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j:I

    .line 59
    .line 60
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 61
    .line 62
    or-int/lit8 v1, v1, 0x40

    .line 63
    .line 64
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

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
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->i:I

    .line 72
    .line 73
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 74
    .line 75
    or-int/2addr v1, v5

    .line 76
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iput-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->h:Z

    .line 84
    .line 85
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 86
    .line 87
    or-int/2addr v1, v4

    .line 88
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    iput-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g:Z

    .line 96
    .line 97
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 98
    .line 99
    or-int/2addr v1, v3

    .line 100
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    iput-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->f:Z

    .line 108
    .line 109
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 110
    .line 111
    or-int/lit8 v1, v1, 0x4

    .line 112
    .line 113
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    iput-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e:Z

    .line 121
    .line 122
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 123
    .line 124
    or-int/lit8 v1, v1, 0x2

    .line 125
    .line 126
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    iput-boolean v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->d:Z

    .line 134
    .line 135
    iget v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 136
    .line 137
    or-int/2addr v1, v2

    .line 138
    iput v1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    .line 140
    goto/16 :goto_0

    .line 141
    .line 142
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 147
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 152
    .line 153
    .line 154
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->n(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyHeader$MoveConfig;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$MoveConfig;->m()Lcom/zykj/board/EzyHeader$MoveConfig;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->p()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->r(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->y()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->y(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->o()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->o()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->q(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->v()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->w(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->u()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->v(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 71
    .line 72
    .line 73
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->r()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->r()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->s(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 84
    .line 85
    .line 86
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_7

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/board/EzyHeader$MoveConfig;->t()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->t(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 97
    .line 98
    .line 99
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 107
    .line 108
    .line 109
    return-object p0
.end method

.method public final o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public p(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public q(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->f:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public r(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->d:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public s(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->i:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->p(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->p(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyHeader$MoveConfig$b;->x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;

    move-result-object p1

    return-object p1
.end method

.method public t(I)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->j:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x40

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public u(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public v(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->h:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public w(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->g:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyHeader$MoveConfig$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public y(Z)Lcom/zykj/board/EzyHeader$MoveConfig$b;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->e:Z

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyHeader$MoveConfig$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
