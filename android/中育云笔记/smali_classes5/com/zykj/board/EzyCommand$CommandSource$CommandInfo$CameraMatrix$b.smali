# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:Lcom/zykj/board/EzyMatrix$Matrix;

.field public e:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public f:Lcom/zykj/board/EzyMatrix$Matrix;

.field public g:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public h:Ljava/lang/Object;

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h:Ljava/lang/Object;

    .line 5
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h:Ljava/lang/Object;

    .line 8
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;-><init>()V

    return-void
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->access$7600()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->q()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->n()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private n()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->l()Lcom/zykj/board/EzyMatrix$Matrix;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private q()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->o()Lcom/zykj/board/EzyMatrix$Matrix;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method


# virtual methods
.method public A(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public B(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x4

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public C(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->i:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final D(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->isInitialized()Z

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

.method public e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyCommand$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V

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

.method public final f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 19
    .line 20
    :goto_0
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_1
    and-int/lit8 v2, v0, 0x2

    .line 27
    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 42
    .line 43
    :goto_2
    invoke-static {p1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    :cond_3
    and-int/lit8 v2, v0, 0x4

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {p1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->e(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_4
    and-int/lit8 v0, v0, 0x8

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->i:I

    .line 62
    .line 63
    invoke-static {p1, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;I)I

    .line 64
    .line 65
    .line 66
    :cond_5
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->g(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;I)I

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public g()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 18
    .line 19
    :cond_0
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 29
    .line 30
    :cond_1
    const-string v1, ""

    .line 31
    .line 32
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h:Ljava/lang/Object;

    .line 33
    .line 34
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->i:I

    .line 35
    .line 36
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->s()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->t()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

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

.method public j()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

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
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 19
    .line 20
    return-object v0
.end method

.method public m()Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->n()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->r(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->s(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->r(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->r(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->s(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->r(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public o()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

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
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 19
    .line 20
    return-object v0
.end method

.method public p()Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->q()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public r(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
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
    const/16 v3, 0xa

    .line 15
    .line 16
    if-eq v1, v3, :cond_5

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    if-eq v1, v3, :cond_4

    .line 21
    .line 22
    const/16 v3, 0x1a

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    const/16 v3, 0x20

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
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->i:I

    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 49
    .line 50
    or-int/lit8 v1, v1, 0x8

    .line 51
    .line 52
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h:Ljava/lang/Object;

    .line 60
    .line 61
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 62
    .line 63
    or-int/lit8 v1, v1, 0x4

    .line 64
    .line 65
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_4
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->n()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 77
    .line 78
    .line 79
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 80
    .line 81
    or-int/lit8 v1, v1, 0x2

    .line 82
    .line 83
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->q()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 95
    .line 96
    .line 97
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 98
    .line 99
    or-int/2addr v1, v2

    .line 100
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 113
    .line 114
    .line 115
    return-object p0
.end method

.method public s(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->t(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

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

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->x(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->x(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->A(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->A(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->D(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->D(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public t(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->k()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->u()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->o()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->v(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->t()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->n()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->u(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->p()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->d(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->h:Ljava/lang/Object;

    .line 49
    .line 50
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 51
    .line 52
    or-int/lit8 v0, v0, 0x4

    .line 53
    .line 54
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->r()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->r()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->C(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 70
    .line 71
    .line 72
    :cond_4
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 80
    .line 81
    .line 82
    return-object p0
.end method

.method public u(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->m()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->n(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

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
    iget-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x2

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public v(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->p()Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->n(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

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
    iget-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x1

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public final w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public x(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public y(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

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
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public z(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->d:Lcom/zykj/board/EzyMatrix$Matrix;

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
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix$b;->c:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method
