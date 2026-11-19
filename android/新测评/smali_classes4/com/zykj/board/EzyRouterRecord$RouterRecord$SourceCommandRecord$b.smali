# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b:Ljava/lang/Object;

    .line 5
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b:Ljava/lang/Object;

    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyRouterRecord$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyRouterRecord$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->d()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->isInitialized()Z

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

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->f()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->f()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->f()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->f()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->g(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->g(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyRouterRecord$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->e(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final e(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->f(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    and-int/lit8 v0, v0, 0x2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, v0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->k(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public f()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p0
.end method

.method public g(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord;->c()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord;->d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

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

.method public k()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->m()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
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
    if-nez v0, :cond_4

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
    if-eq v1, v3, :cond_3

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    if-eq v1, v3, :cond_2

    .line 21
    .line 22
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    :cond_1
    move v0, v2

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_2

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c:Ljava/lang/Object;

    .line 39
    .line 40
    iget v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 41
    .line 42
    or-int/lit8 v1, v1, 0x2

    .line 43
    .line 44
    iput v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iput-object v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iget v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 54
    .line 55
    or-int/2addr v1, v2

    .line 56
    iput v1, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 69
    .line 70
    .line 71
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->n(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->m()Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->getFileName()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->a(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->b:Ljava/lang/Object;

    .line 23
    .line 24
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 25
    .line 26
    or-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->q()Ljava/lang/String;

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
    invoke-static {p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;->j(Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->c:Ljava/lang/Object;

    .line 48
    .line 49
    iget v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 50
    .line 51
    or-int/lit8 v0, v0, 0x2

    .line 52
    .line 53
    iput v0, p0, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->a:I

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 56
    .line 57
    .line 58
    :cond_2
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 66
    .line 67
    .line 68
    return-object p0
.end method

.method public final p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public r(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public final s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->r(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;->s(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyRouterRecord$RouterRecord$SourceCommandRecord$b;

    move-result-object p1

    return-object p1
.end method
