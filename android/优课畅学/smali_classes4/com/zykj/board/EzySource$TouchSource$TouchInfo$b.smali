# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/util/List;

.field public c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public d:Lcom/zykj/board/EzyPaint$Paint;

.field public e:Lcom/google/protobuf/SingleFieldBuilderV3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 5
    invoke-direct {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 8
    invoke-direct {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzySource$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzySource$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;-><init>()V

    return-void
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->getTouchEventFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->r()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method private r()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->p()Lcom/zykj/board/EzyPaint$Paint;

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-direct {v0, v1, v2, v3}, Lcom/google/protobuf/SingleFieldBuilderV3;-><init>(Lcom/google/protobuf/AbstractMessage;Lcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method


# virtual methods
.method public final A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->g()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->g()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->h()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->h()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->k()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->k()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->k()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->k()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->l(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->l(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->n()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->n()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->n()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->n()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->n()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->n()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->ensureTouchEventIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public final ensureTouchEventIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

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
    iget-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public f(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->ensureTouchEventIsMutable()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 17
    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public g()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->h()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->isInitialized()Z

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

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->o()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->o()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource;->f()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getTouchEventFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    invoke-direct {v0, v1, v3, v2, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 34
    .line 35
    return-object v0
.end method

.method public h()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzySource$a;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->j(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->i(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final i(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/board/EzyPaint$Paint;

    .line 19
    .line 20
    :goto_0
    invoke-static {p1, v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->g(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    const/4 v0, 0x0

    .line 26
    :goto_1
    invoke-static {p1, v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->a(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;I)I

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource;->h()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

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

.method public final j(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x2

    .line 22
    .line 23
    iput v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->e(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;Ljava/util/List;)Ljava/util/List;

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
    invoke-static {p1, v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->e(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public k()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iput-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 23
    .line 24
    and-int/lit8 v0, v0, -0x2

    .line 25
    .line 26
    iput v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 27
    .line 28
    iput-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

    .line 29
    .line 30
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->dispose()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 38
    .line 39
    :cond_1
    return-object p0
.end method

.method public l(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->s(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->t(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->s(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->s(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->t(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->s(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public n()Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public o()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->h()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public p()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->h()Lcom/zykj/board/EzyPaint$Paint;

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
    check-cast v0, Lcom/zykj/board/EzyPaint$Paint;

    .line 19
    .line 20
    return-object v0
.end method

.method public q()Lcom/zykj/board/EzyPaint$Paint$b;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iput v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->r()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/board/EzyPaint$Paint$b;

    .line 19
    .line 20
    return-object v0
.end method

.method public s(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
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
    invoke-direct {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->r()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/MessageLite$Builder;Lcom/google/protobuf/ExtensionRegistryLite;)V

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x2

    .line 48
    .line 49
    iput v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->parser()Lcom/google/protobuf/Parser;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 63
    .line 64
    if-nez v2, :cond_4

    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->ensureTouchEventIsMutable()V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_4
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 85
    .line 86
    .line 87
    throw p1

    .line 88
    :cond_5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 89
    .line 90
    .line 91
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->x(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->x(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->z(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->z(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    move-result-object p1

    return-object p1
.end method

.method public t(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->u(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

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

.method public u(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->h()Lcom/zykj/board/EzySource$TouchSource$TouchInfo;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 9
    .line 10
    if-nez v0, :cond_2

    .line 11
    .line 12
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

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
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 35
    .line 36
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, -0x2

    .line 39
    .line 40
    iput v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->ensureTouchEventIsMutable()V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Ljava/util/List;

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
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

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
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 78
    .line 79
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 84
    .line 85
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->b:Ljava/util/List;

    .line 90
    .line 91
    iget v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 92
    .line 93
    and-int/lit8 v1, v1, -0x2

    .line 94
    .line 95
    iput v1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 96
    .line 97
    invoke-static {}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->b()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->getTouchEventFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :cond_3
    iput-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->c:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 111
    .line 112
    invoke-static {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->d(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;)Ljava/util/List;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->k()Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo;->j()Lcom/zykj/board/EzyPaint$Paint;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->v(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 140
    .line 141
    .line 142
    return-object p0
.end method

.method public v(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->h()Lcom/zykj/board/EzyPaint$Paint;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->q()Lcom/zykj/board/EzyPaint$Paint$b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyPaint$Paint$b;->o(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint$b;

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iput-object p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

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
    iget-object p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    iget p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 40
    .line 41
    or-int/lit8 p1, p1, 0x2

    .line 42
    .line 43
    iput p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-object p0
.end method

.method public final w(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public x(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public y(Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->e:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->d:Lcom/zykj/board/EzyPaint$Paint;

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
    iget p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    iput p1, p0, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;->a:I

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 21
    .line 22
    .line 23
    return-object p0
.end method

.method public z(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzySource$TouchSource$TouchInfo$b;

    .line 6
    .line 7
    return-object p1
.end method
