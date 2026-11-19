# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyRectF$RectF$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyRectF$RectF;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:F

.field public e:F

.field public f:F

.field public g:F


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

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyRectF$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyRectF$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyRectF$RectF$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->d()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->d()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->e()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->e()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->g()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->g()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->g()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->g()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->j()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->j()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->j()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->j()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->j()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->j()Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyRectF$RectF;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->e()Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyRectF$RectF;->isInitialized()Z

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

.method public e()Lcom/zykj/board/EzyRectF$RectF;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyRectF$RectF;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyRectF$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRectF$RectF$b;->f(Lcom/zykj/board/EzyRectF$RectF;)V

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

.method public final f(Lcom/zykj/board/EzyRectF$RectF;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->d:F

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyRectF$RectF;->a(Lcom/zykj/board/EzyRectF$RectF;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->e:F

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyRectF$RectF;->c(Lcom/zykj/board/EzyRectF$RectF;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->f:F

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyRectF$RectF;->d(Lcom/zykj/board/EzyRectF$RectF;F)F

    .line 28
    .line 29
    .line 30
    :cond_2
    and-int/lit8 v0, v0, 0x8

    .line 31
    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    iget v0, p0, Lcom/zykj/board/EzyRectF$RectF$b;->g:F

    .line 35
    .line 36
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRectF$RectF;->e(Lcom/zykj/board/EzyRectF$RectF;F)F

    .line 37
    .line 38
    .line 39
    :cond_3
    return-void
.end method

.method public g()Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lcom/zykj/board/EzyRectF$RectF$b;->d:F

    .line 9
    .line 10
    iput v0, p0, Lcom/zykj/board/EzyRectF$RectF$b;->e:F

    .line 11
    .line 12
    iput v0, p0, Lcom/zykj/board/EzyRectF$RectF$b;->f:F

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/board/EzyRectF$RectF$b;->g:F

    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->k()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRectF$RectF$b;->k()Lcom/zykj/board/EzyRectF$RectF;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRectF;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRectF;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyRectF$RectF;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyRectF$RectF$b;

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

.method public j()Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyRectF$RectF;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->f()Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRectF$RectF$b;
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
    if-nez v0, :cond_6

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
    const/16 v3, 0xd

    .line 15
    .line 16
    if-eq v1, v3, :cond_5

    .line 17
    .line 18
    const/16 v3, 0x15

    .line 19
    .line 20
    if-eq v1, v3, :cond_4

    .line 21
    .line 22
    const/16 v3, 0x1d

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    const/16 v3, 0x25

    .line 27
    .line 28
    if-eq v1, v3, :cond_2

    .line 29
    .line 30
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_0

    .line 35
    .line 36
    :cond_1
    move v0, v2

    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception p1

    .line 39
    goto :goto_2

    .line 40
    :catch_0
    move-exception p1

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->g:F

    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 49
    .line 50
    or-int/lit8 v1, v1, 0x8

    .line 51
    .line 52
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->f:F

    .line 60
    .line 61
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 62
    .line 63
    or-int/lit8 v1, v1, 0x4

    .line 64
    .line 65
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->e:F

    .line 73
    .line 74
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 75
    .line 76
    or-int/lit8 v1, v1, 0x2

    .line 77
    .line 78
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->d:F

    .line 86
    .line 87
    iget v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 88
    .line 89
    or-int/2addr v1, v2

    .line 90
    iput v1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 103
    .line 104
    .line 105
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->n(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF$b;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->f()Lcom/zykj/board/EzyRectF$RectF;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getLeft()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getLeft()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRectF$RectF$b;->r(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getTop()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    cmpl-float v0, v0, v1

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getTop()F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRectF$RectF$b;->u(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getRight()F

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    cmpl-float v0, v0, v1

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getRight()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRectF$RectF$b;->t(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getBottom()F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    cmpl-float v0, v0, v1

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/zykj/board/EzyRectF$RectF;->getBottom()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRectF$RectF$b;->p(F)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 67
    .line 68
    .line 69
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 77
    .line 78
    .line 79
    return-object p0
.end method

.method public final o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public p(F)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->g:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public r(F)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->d:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public s(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRectF$RectF$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyRectF$RectF$b;->s(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyRectF$RectF$b;->s(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->v(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRectF$RectF$b;->v(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;

    move-result-object p1

    return-object p1
.end method

.method public t(F)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->f:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public u(F)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->e:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyRectF$RectF$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final v(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRectF$RectF$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRectF$RectF$b;

    .line 6
    .line 7
    return-object p1
.end method
