# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyPaint$Paint$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyPaint$Paint;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:F

.field public c:I

.field public d:F

.field public e:F

.field public f:I

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

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyPaint$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyPaint$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyPaint$Paint$b;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->c()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->c()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->d()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->d()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/zykj/board/EzyPaint$Paint;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->d()Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyPaint$Paint;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->f()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->f()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->f()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->f()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->g(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->g(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->i()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->i()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->i()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->i()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->i()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->i()Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyPaint$Paint;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyPaint$Paint;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyPaint$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPaint$Paint$b;->e(Lcom/zykj/board/EzyPaint$Paint;)V

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

.method public final e(Lcom/zykj/board/EzyPaint$Paint;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->b:F

    .line 8
    .line 9
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPaint$Paint;->f(Lcom/zykj/board/EzyPaint$Paint;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->c:I

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPaint$Paint;->j(Lcom/zykj/board/EzyPaint$Paint;I)I

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
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->d:F

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPaint$Paint;->k(Lcom/zykj/board/EzyPaint$Paint;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->e:F

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPaint$Paint;->m(Lcom/zykj/board/EzyPaint$Paint;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->f:I

    .line 44
    .line 45
    invoke-static {p1, v1}, Lcom/zykj/board/EzyPaint$Paint;->o(Lcom/zykj/board/EzyPaint$Paint;I)I

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
    iget v0, p0, Lcom/zykj/board/EzyPaint$Paint$b;->g:F

    .line 53
    .line 54
    invoke-static {p1, v0}, Lcom/zykj/board/EzyPaint$Paint;->a(Lcom/zykj/board/EzyPaint$Paint;F)F

    .line 55
    .line 56
    .line 57
    :cond_5
    return-void
.end method

.method public f()Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->b:F

    .line 9
    .line 10
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint$b;->c:I

    .line 11
    .line 12
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->d:F

    .line 13
    .line 14
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->e:F

    .line 15
    .line 16
    iput v0, p0, Lcom/zykj/board/EzyPaint$Paint$b;->f:I

    .line 17
    .line 18
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->g:F

    .line 19
    .line 20
    return-object p0
.end method

.method public g(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->k()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPaint$Paint$b;->k()Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPaint;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i()Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPaint;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyPaint$Paint$b;

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

.method public k()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->q()Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPaint$Paint$b;
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
    const/16 v3, 0xd

    .line 15
    .line 16
    if-eq v1, v3, :cond_7

    .line 17
    .line 18
    const/16 v3, 0x10

    .line 19
    .line 20
    if-eq v1, v3, :cond_6

    .line 21
    .line 22
    const/16 v4, 0x1d

    .line 23
    .line 24
    if-eq v1, v4, :cond_5

    .line 25
    .line 26
    const/16 v4, 0x25

    .line 27
    .line 28
    if-eq v1, v4, :cond_4

    .line 29
    .line 30
    const/16 v4, 0x28

    .line 31
    .line 32
    if-eq v1, v4, :cond_3

    .line 33
    .line 34
    const/16 v3, 0x35

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

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
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->g:F

    .line 55
    .line 56
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 57
    .line 58
    or-int/lit8 v1, v1, 0x20

    .line 59
    .line 60
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->f:I

    .line 68
    .line 69
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 70
    .line 71
    or-int/2addr v1, v3

    .line 72
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->e:F

    .line 80
    .line 81
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 82
    .line 83
    or-int/lit8 v1, v1, 0x8

    .line 84
    .line 85
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->d:F

    .line 93
    .line 94
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 95
    .line 96
    or-int/lit8 v1, v1, 0x4

    .line 97
    .line 98
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->c:I

    .line 106
    .line 107
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 108
    .line 109
    or-int/lit8 v1, v1, 0x2

    .line 110
    .line 111
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->b:F

    .line 119
    .line 120
    iget v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 121
    .line 122
    or-int/2addr v1, v2

    .line 123
    iput v1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 132
    .line 133
    .line 134
    throw p1

    .line 135
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 136
    .line 137
    .line 138
    return-object p0
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->n(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint$b;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->q()Lcom/zykj/board/EzyPaint$Paint;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->getWidth()F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPaint$Paint$b;->y(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->getColor()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPaint$Paint$b;->q(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->t()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    cmpl-float v0, v0, v1

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->t()F

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPaint$Paint$b;->u(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 50
    .line 51
    .line 52
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->s()F

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    cmpl-float v0, v0, v1

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->s()F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPaint$Paint$b;->s(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 65
    .line 66
    .line 67
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->u()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->u()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPaint$Paint$b;->v(I)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 78
    .line 79
    .line 80
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->v()F

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    cmpl-float v0, v0, v1

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/zykj/board/EzyPaint$Paint;->v()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyPaint$Paint$b;->w(F)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 93
    .line 94
    .line 95
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 103
    .line 104
    .line 105
    return-object p0
.end method

.method public final p(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public q(I)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->c:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public r(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public s(F)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->e:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->r(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyPaint$Paint$b;->r(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyPaint$Paint$b;->t(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyPaint$Paint$b;->t(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;

    move-result-object p1

    return-object p1
.end method

.method public t(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public u(F)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->d:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public v(I)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->f:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public w(F)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->g:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final x(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public y(F)Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->b:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyPaint$Paint$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
