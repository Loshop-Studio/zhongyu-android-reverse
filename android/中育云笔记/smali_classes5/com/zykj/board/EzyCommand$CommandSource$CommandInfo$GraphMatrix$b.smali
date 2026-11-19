# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:Ljava/util/List;

.field public e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public f:Lcom/zykj/board/EzyMatrix$Matrix;

.field public g:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public h:Lcom/zykj/board/EzyMatrix$Matrix;

.field public i:Lcom/google/protobuf/SingleFieldBuilderV3;

.field public j:Ljava/lang/Object;

.field public k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 5
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j:Ljava/lang/Object;

    .line 6
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 8
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 9
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j:Ljava/lang/Object;

    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyCommand$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;-><init>()V

    return-void
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->o()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->u()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->r()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private r()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->p()Lcom/zykj/board/EzyMatrix$Matrix;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private u()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->s()Lcom/zykj/board/EzyMatrix$Matrix;

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
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method


# virtual methods
.method public final A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public B(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public C(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public D(Ljava/lang/String;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j:Ljava/lang/Object;

    .line 5
    .line 6
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 7
    .line 8
    or-int/lit8 p1, p1, 0x8

    .line 9
    .line 10
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public E(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->k:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final F(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/Iterable;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->m()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->k(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->k(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->k(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->l()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->l()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->l()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->l()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->l()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->l()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->isInitialized()Z

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

.method public f()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyCommand$a;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final g(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

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
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->e(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;

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
    and-int/lit8 v2, v0, 0x4

    .line 27
    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

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
    invoke-static {p1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->f(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 44
    .line 45
    .line 46
    or-int/lit8 v1, v1, 0x2

    .line 47
    .line 48
    :cond_3
    and-int/lit8 v2, v0, 0x8

    .line 49
    .line 50
    if-eqz v2, :cond_4

    .line 51
    .line 52
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-static {p1, v2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->k(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    :cond_4
    and-int/lit8 v0, v0, 0x10

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->k:I

    .line 62
    .line 63
    invoke-static {p1, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->m(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;I)I

    .line 64
    .line 65
    .line 66
    :cond_5
    invoke-static {p1, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->n(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;I)I

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->n()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->n()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->j()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final h(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x2

    .line 22
    .line 23
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->d(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p1, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->d(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public i()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 23
    .line 24
    and-int/lit8 v1, v1, -0x2

    .line 25
    .line 26
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 27
    .line 28
    iput-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 35
    .line 36
    .line 37
    iput-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 38
    .line 39
    :cond_1
    iput-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 49
    .line 50
    :cond_2
    const-string v1, ""

    .line 51
    .line 52
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j:Ljava/lang/Object;

    .line 53
    .line 54
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->k:I

    .line 55
    .line 56
    return-object p0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand;->l()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

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

.method public j(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public k(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public l()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public final m()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->v(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->w(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->v(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->v(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->w(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->v(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public n()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final o()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    and-int/2addr v2, v3

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v3, 0x0

    .line 17
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->isClean()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v0, v1, v3, v2, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 34
    .line 35
    return-object v0
.end method

.method public p()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

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

.method public q()Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->r()Lcom/google/protobuf/SingleFieldBuilderV3;

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

.method public s()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

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

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->B(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->B(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->C(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->C(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->F(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->F(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    move-result-object p1

    return-object p1
.end method

.method public t()Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->u()Lcom/google/protobuf/SingleFieldBuilderV3;

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

.method public v(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
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
    if-eq v1, v3, :cond_6

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    if-eq v1, v3, :cond_5

    .line 21
    .line 22
    const/16 v3, 0x1a

    .line 23
    .line 24
    if-eq v1, v3, :cond_4

    .line 25
    .line 26
    const/16 v3, 0x22

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    const/16 v3, 0x28

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
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->k:I

    .line 51
    .line 52
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 53
    .line 54
    or-int/lit8 v1, v1, 0x10

    .line 55
    .line 56
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j:Ljava/lang/Object;

    .line 64
    .line 65
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 66
    .line 67
    or-int/lit8 v1, v1, 0x8

    .line 68
    .line 69
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->r()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 81
    .line 82
    .line 83
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 84
    .line 85
    or-int/lit8 v1, v1, 0x4

    .line 86
    .line 87
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    invoke-direct {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->u()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 99
    .line 100
    .line 101
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 102
    .line 103
    or-int/lit8 v1, v1, 0x2

    .line 104
    .line 105
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_6
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parser()Lcom/google/protobuf/Parser;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    check-cast v1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 117
    .line 118
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 119
    .line 120
    if-nez v2, :cond_7

    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->m()V

    .line 123
    .line 124
    .line 125
    iget-object v2, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 126
    .line 127
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_7
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 132
    .line 133
    .line 134
    goto/16 :goto_0

    .line 135
    .line 136
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :cond_8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 146
    .line 147
    .line 148
    return-object p0
.end method

.method public w(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->x(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

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

.method public x(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

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
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_5

    .line 21
    .line 22
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 35
    .line 36
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, -0x2

    .line 39
    .line 40
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->m()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-nez v0, :cond_5

    .line 68
    .line 69
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->d:Ljava/util/List;

    .line 90
    .line 91
    iget v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 92
    .line 93
    and-int/lit8 v1, v1, -0x2

    .line 94
    .line 95
    iput v1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 96
    .line 97
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->o()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->o()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_3
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->e:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 111
    .line 112
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Ljava/util/List;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 117
    .line 118
    .line 119
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->D()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->y()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->z(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->C()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_7

    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->v()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->y(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 143
    .line 144
    .line 145
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->z()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_8

    .line 154
    .line 155
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->g(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    iput-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->j:Ljava/lang/Object;

    .line 160
    .line 161
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 162
    .line 163
    or-int/lit8 v0, v0, 0x8

    .line 164
    .line 165
    iput v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 168
    .line 169
    .line 170
    :cond_8
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->A()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_9

    .line 175
    .line 176
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->A()I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->E(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 181
    .line 182
    .line 183
    :cond_9
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 191
    .line 192
    .line 193
    return-object p0
.end method

.method public y(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->i:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x4

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->q()Lcom/zykj/board/EzyMatrix$Matrix$b;

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
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

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
    iget-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->h:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x4

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public z(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->g:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->t()Lcom/zykj/board/EzyMatrix$Matrix$b;

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
    iput-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

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
    iget-object p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->f:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x2

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix$b;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method
