# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyTouchEvent$TouchEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:J

.field public c:I

.field public d:F

.field public e:F

.field public f:I

.field public g:Ljava/util/List;

.field public h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

.field public i:Ljava/util/List;

.field public j:Lcom/google/protobuf/RepeatedFieldBuilderV3;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 5
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    .line 7
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyTouchEvent$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyTouchEvent$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->d:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->e:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Iterable;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->ensurePointerCoordsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

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

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->l(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->l(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/Iterable;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->ensurePointerPropertiesIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

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

.method public final ensurePointerCoordsIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x40

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x40

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final ensurePointerPropertiesIsMutable()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x20

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 17
    .line 18
    or-int/lit8 v0, v0, 0x20

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public f(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public g()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->o()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->o()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x40

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public getPointerCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 10
    .line 11
    and-int/lit8 v2, v2, 0x20

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v2, 0x0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->getParentForChildren()Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->isClean()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/protobuf/RepeatedFieldBuilderV3;-><init>(Ljava/util/List;ZLcom/google/protobuf/AbstractMessage$BuilderParent;Z)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public getX()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->d:F

    .line 2
    .line 3
    return v0
.end method

.method public getY()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->e:F

    .line 2
    .line 3
    return v0
.end method

.method public h()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyTouchEvent$a;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

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

.method public final i(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->b:J

    .line 8
    .line 9
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)J

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
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->c:I

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->g(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I

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
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->d:F

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->h(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->e:F

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->i(Lcom/zykj/board/EzyTouchEvent$TouchEvent;F)F

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
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f:I

    .line 44
    .line 45
    invoke-static {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;I)I

    .line 46
    .line 47
    .line 48
    :cond_4
    return-void
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

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

.method public final j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0x20

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 18
    .line 19
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, -0x21

    .line 22
    .line 23
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 26
    .line 27
    invoke-static {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->b(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 39
    .line 40
    if-nez v0, :cond_3

    .line 41
    .line 42
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 43
    .line 44
    and-int/lit8 v0, v0, 0x40

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 55
    .line 56
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 57
    .line 58
    and-int/lit8 v0, v0, -0x41

    .line 59
    .line 60
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 61
    .line 62
    :cond_2
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {p1, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Ljava/util/List;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public k()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    iput-wide v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->b:J

    .line 10
    .line 11
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->c:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->d:F

    .line 15
    .line 16
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->e:F

    .line 17
    .line 18
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f:I

    .line 19
    .line 20
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iput-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 33
    .line 34
    .line 35
    :goto_0
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 36
    .line 37
    and-int/lit8 v0, v0, -0x21

    .line 38
    .line 39
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 40
    .line 41
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iput-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 53
    .line 54
    .line 55
    :goto_1
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 56
    .line 57
    and-int/lit8 v0, v0, -0x41

    .line 58
    .line 59
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 60
    .line 61
    return-object p0
.end method

.method public l(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public m(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->q(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->r(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->q(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->q(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->r(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->q(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public n()Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public o()Lcom/zykj/board/EzyTouchEvent$TouchEvent;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->l()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public p(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessage(I)Lcom/google/protobuf/AbstractMessage;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 19
    .line 20
    return-object p1
.end method

.method public q(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
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
    if-nez v0, :cond_b

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
    if-eq v1, v3, :cond_a

    .line 17
    .line 18
    const/16 v4, 0x10

    .line 19
    .line 20
    if-eq v1, v4, :cond_9

    .line 21
    .line 22
    const/16 v5, 0x1d

    .line 23
    .line 24
    if-eq v1, v5, :cond_8

    .line 25
    .line 26
    const/16 v5, 0x25

    .line 27
    .line 28
    if-eq v1, v5, :cond_7

    .line 29
    .line 30
    const/16 v3, 0x28

    .line 31
    .line 32
    if-eq v1, v3, :cond_6

    .line 33
    .line 34
    const/16 v3, 0x32

    .line 35
    .line 36
    if-eq v1, v3, :cond_4

    .line 37
    .line 38
    const/16 v3, 0x3a

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

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
    goto/16 :goto_2

    .line 52
    .line 53
    :catch_0
    move-exception p1

    .line 54
    goto/16 :goto_1

    .line 55
    .line 56
    :cond_2
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;->parser()Lcom/google/protobuf/Parser;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 65
    .line 66
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 67
    .line 68
    if-nez v2, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->ensurePointerCoordsIsMutable()V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 74
    .line 75
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->parser()Lcom/google/protobuf/Parser;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p1, v1, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 92
    .line 93
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 94
    .line 95
    if-nez v2, :cond_5

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->ensurePointerPropertiesIsMutable()V

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_5
    invoke-virtual {v2, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f:I

    .line 115
    .line 116
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 117
    .line 118
    or-int/2addr v1, v4

    .line 119
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->e:F

    .line 127
    .line 128
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 129
    .line 130
    or-int/2addr v1, v3

    .line 131
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 132
    .line 133
    goto/16 :goto_0

    .line 134
    .line 135
    :cond_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->d:F

    .line 140
    .line 141
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 142
    .line 143
    or-int/lit8 v1, v1, 0x4

    .line 144
    .line 145
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 146
    .line 147
    goto/16 :goto_0

    .line 148
    .line 149
    :cond_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->c:I

    .line 154
    .line 155
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 156
    .line 157
    or-int/lit8 v1, v1, 0x2

    .line 158
    .line 159
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    iput-wide v3, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->b:J

    .line 168
    .line 169
    iget v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 170
    .line 171
    or-int/2addr v1, v2

    .line 172
    iput v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 173
    .line 174
    goto/16 :goto_0

    .line 175
    .line 176
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 182
    .line 183
    .line 184
    throw p1

    .line 185
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 186
    .line 187
    .line 188
    return-object p0
.end method

.method public r(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->s(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

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

.method public s(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->l()Lcom/zykj/board/EzyTouchEvent$TouchEvent;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getEventTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->v(J)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getAction()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->u(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 36
    .line 37
    .line 38
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x0

    .line 43
    cmpl-float v0, v0, v1

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getX()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->B(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 52
    .line 53
    .line 54
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getY()F

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->C(F)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 67
    .line 68
    .line 69
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerCount()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->y(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 80
    .line 81
    .line 82
    :cond_5
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 83
    .line 84
    const/4 v1, 0x0

    .line 85
    if-nez v0, :cond_7

    .line 86
    .line 87
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    if-nez v0, :cond_a

    .line 96
    .line 97
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 98
    .line 99
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 110
    .line 111
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 112
    .line 113
    and-int/lit8 v0, v0, -0x21

    .line 114
    .line 115
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->ensurePointerPropertiesIsMutable()V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 122
    .line 123
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 128
    .line 129
    .line 130
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_7
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_a

    .line 143
    .line 144
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 155
    .line 156
    .line 157
    iput-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 158
    .line 159
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->g:Ljava/util/List;

    .line 164
    .line 165
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 166
    .line 167
    and-int/lit8 v0, v0, -0x21

    .line 168
    .line 169
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 170
    .line 171
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->access$2600()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->getPointerPropertiesFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto :goto_1

    .line 182
    :cond_8
    move-object v0, v1

    .line 183
    :goto_1
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_9
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->h:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 187
    .line 188
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 189
    .line 190
    .line 191
    move-result-object v2

    .line 192
    invoke-virtual {v0, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 193
    .line 194
    .line 195
    :cond_a
    :goto_2
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 196
    .line 197
    if-nez v0, :cond_c

    .line 198
    .line 199
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-nez v0, :cond_f

    .line 208
    .line 209
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 210
    .line 211
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_b

    .line 216
    .line 217
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 222
    .line 223
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 224
    .line 225
    and-int/lit8 v0, v0, -0x41

    .line 226
    .line 227
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->ensurePointerCoordsIsMutable()V

    .line 231
    .line 232
    .line 233
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 234
    .line 235
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 240
    .line 241
    .line 242
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_c
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-nez v0, :cond_f

    .line 255
    .line 256
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 257
    .line 258
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v0

    .line 262
    if-eqz v0, :cond_e

    .line 263
    .line 264
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 265
    .line 266
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    .line 267
    .line 268
    .line 269
    iput-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 270
    .line 271
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iput-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 276
    .line 277
    iget v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 278
    .line 279
    and-int/lit8 v0, v0, -0x41

    .line 280
    .line 281
    iput v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 282
    .line 283
    invoke-static {}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->k()Z

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    if-eqz v0, :cond_d

    .line 288
    .line 289
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->getPointerCoordsFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    :cond_d
    iput-object v1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_e
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 297
    .line 298
    invoke-static {p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 303
    .line 304
    .line 305
    :cond_f
    :goto_4
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 313
    .line 314
    .line 315
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->w(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->w(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->z(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->z(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->A(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    move-result-object p1

    return-object p1
.end method

.method public final t(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public u(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->c:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public v(J)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->b:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public w(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public x(ILcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->j:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->ensurePointerCoordsIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->i:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords$b;->e()Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerCoords;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 26
    .line 27
    .line 28
    return-object p0
.end method

.method public y(I)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->f:I

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;->a:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public z(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyTouchEvent$TouchEvent$b;

    .line 6
    .line 7
    return-object p1
.end method
