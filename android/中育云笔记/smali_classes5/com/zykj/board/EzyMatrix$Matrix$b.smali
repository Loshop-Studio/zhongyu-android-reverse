# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyMatrix$Matrix$b;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyMatrix$Matrix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public c:I

.field public d:J

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F


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

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyMatrix$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/board/EzyMatrix$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;-><init>()V

    return-void
.end method


# virtual methods
.method public A(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->j:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x40

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public final B(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->d()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->d()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->g()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->g()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->g()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->g()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->j()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->j()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->j()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->j()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->j()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->j()Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->e()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->isInitialized()Z

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

.method public e()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Lcom/zykj/board/EzyMatrix$Matrix;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyMatrix$a;)V

    .line 5
    .line 6
    .line 7
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->f(Lcom/zykj/board/EzyMatrix$Matrix;)V

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

.method public final f(Lcom/zykj/board/EzyMatrix$Matrix;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-wide v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->d:J

    .line 8
    .line 9
    invoke-static {p1, v1, v2}, Lcom/zykj/board/EzyMatrix$Matrix;->g(Lcom/zykj/board/EzyMatrix$Matrix;J)J

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
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->e:F

    .line 17
    .line 18
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->k(Lcom/zykj/board/EzyMatrix$Matrix;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->f:F

    .line 26
    .line 27
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->m(Lcom/zykj/board/EzyMatrix$Matrix;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->g:F

    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->n(Lcom/zykj/board/EzyMatrix$Matrix;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->h:F

    .line 44
    .line 45
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->o(Lcom/zykj/board/EzyMatrix$Matrix;F)F

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
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->i:F

    .line 53
    .line 54
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->a(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 55
    .line 56
    .line 57
    :cond_5
    and-int/lit8 v1, v0, 0x40

    .line 58
    .line 59
    if-eqz v1, :cond_6

    .line 60
    .line 61
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->j:F

    .line 62
    .line 63
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->c(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 64
    .line 65
    .line 66
    :cond_6
    and-int/lit16 v1, v0, 0x80

    .line 67
    .line 68
    if-eqz v1, :cond_7

    .line 69
    .line 70
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->k:F

    .line 71
    .line 72
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->d(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 73
    .line 74
    .line 75
    :cond_7
    and-int/lit16 v1, v0, 0x100

    .line 76
    .line 77
    if-eqz v1, :cond_8

    .line 78
    .line 79
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->l:F

    .line 80
    .line 81
    invoke-static {p1, v1}, Lcom/zykj/board/EzyMatrix$Matrix;->e(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 82
    .line 83
    .line 84
    :cond_8
    and-int/lit16 v0, v0, 0x200

    .line 85
    .line 86
    if-eqz v0, :cond_9

    .line 87
    .line 88
    iget v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->m:F

    .line 89
    .line 90
    invoke-static {p1, v0}, Lcom/zykj/board/EzyMatrix$Matrix;->f(Lcom/zykj/board/EzyMatrix$Matrix;F)F

    .line 91
    .line 92
    .line 93
    :cond_9
    return-void
.end method

.method public g()Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->d:J

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->e:F

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->f:F

    .line 15
    .line 16
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->g:F

    .line 17
    .line 18
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->h:F

    .line 19
    .line 20
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->i:F

    .line 21
    .line 22
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->j:F

    .line 23
    .line 24
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->k:F

    .line 25
    .line 26
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->l:F

    .line 27
    .line 28
    iput v0, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->m:F

    .line 29
    .line 30
    return-object p0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->k()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->k()Lcom/zykj/board/EzyMatrix$Matrix;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->a()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public h(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public i(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyMatrix;->b()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyMatrix$Matrix$b;

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

.method public j()Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object v0
.end method

.method public k()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix$b;
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
    if-nez v0, :cond_1

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
    sparse-switch v1, :sswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1, p2, v1}, Lcom/google/protobuf/GeneratedMessage$ExtendableBuilder;->parseUnknownField(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;I)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    :sswitch_0
    move v0, v2

    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto/16 :goto_2

    .line 25
    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto/16 :goto_1

    .line 28
    .line 29
    :sswitch_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->m:F

    .line 34
    .line 35
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 36
    .line 37
    or-int/lit16 v1, v1, 0x200

    .line 38
    .line 39
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->l:F

    .line 47
    .line 48
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 49
    .line 50
    or-int/lit16 v1, v1, 0x100

    .line 51
    .line 52
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :sswitch_3
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->k:F

    .line 60
    .line 61
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 62
    .line 63
    or-int/lit16 v1, v1, 0x80

    .line 64
    .line 65
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->j:F

    .line 73
    .line 74
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 75
    .line 76
    or-int/lit8 v1, v1, 0x40

    .line 77
    .line 78
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->i:F

    .line 86
    .line 87
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 88
    .line 89
    or-int/lit8 v1, v1, 0x20

    .line 90
    .line 91
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->h:F

    .line 99
    .line 100
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 101
    .line 102
    or-int/lit8 v1, v1, 0x10

    .line 103
    .line 104
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->g:F

    .line 112
    .line 113
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 114
    .line 115
    or-int/lit8 v1, v1, 0x8

    .line 116
    .line 117
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :sswitch_8
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->f:F

    .line 125
    .line 126
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 127
    .line 128
    or-int/lit8 v1, v1, 0x4

    .line 129
    .line 130
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->e:F

    .line 138
    .line 139
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 140
    .line 141
    or-int/lit8 v1, v1, 0x2

    .line 142
    .line 143
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 144
    .line 145
    goto/16 :goto_0

    .line 146
    .line 147
    :sswitch_a
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt64()J

    .line 148
    .line 149
    .line 150
    move-result-wide v3

    .line 151
    iput-wide v3, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->d:J

    .line 152
    .line 153
    iget v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 154
    .line 155
    or-int/2addr v1, v2

    .line 156
    iput v1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :goto_1
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 166
    .line 167
    .line 168
    throw p1

    .line 169
    :cond_1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 170
    .line 171
    .line 172
    return-object p0

    .line 173
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_a
        0x15 -> :sswitch_9
        0x1d -> :sswitch_8
        0x25 -> :sswitch_7
        0x2d -> :sswitch_6
        0x35 -> :sswitch_5
        0x3d -> :sswitch_4
        0x45 -> :sswitch_3
        0x4d -> :sswitch_2
        0x55 -> :sswitch_1
    .end sparse-switch
.end method

.method public m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->n(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix$b;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->m(Lcom/google/protobuf/Message;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->l(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public n(Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 4

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->p()Lcom/zykj/board/EzyMatrix$Matrix;

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

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
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getEventTime()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->p(J)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    cmpl-float v0, v0, v1

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleX()F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->v(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 39
    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    cmpl-float v0, v0, v1

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->y()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->x(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 54
    .line 55
    .line 56
    :cond_3
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    cmpl-float v0, v0, v1

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->A()F

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->z(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 69
    .line 70
    .line 71
    :cond_4
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    cmpl-float v0, v0, v1

    .line 76
    .line 77
    if-eqz v0, :cond_5

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->z()F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->y(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 84
    .line 85
    .line 86
    :cond_5
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    cmpl-float v0, v0, v1

    .line 91
    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->getScaleY()F

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->w(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 99
    .line 100
    .line 101
    :cond_6
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    cmpl-float v0, v0, v1

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->C()F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->A(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 114
    .line 115
    .line 116
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    cmpl-float v0, v0, v1

    .line 121
    .line 122
    if-eqz v0, :cond_8

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->t()F

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->r(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 129
    .line 130
    .line 131
    :cond_8
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->u()F

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    cmpl-float v0, v0, v1

    .line 136
    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->u()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->s(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 144
    .line 145
    .line 146
    :cond_9
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->v()F

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    cmpl-float v0, v0, v1

    .line 151
    .line 152
    if-eqz v0, :cond_a

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/zykj/board/EzyMatrix$Matrix;->v()F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {p0, v0}, Lcom/zykj/board/EzyMatrix$Matrix$b;->t(F)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 159
    .line 160
    .line 161
    :cond_a
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessage;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 169
    .line 170
    .line 171
    return-object p0
.end method

.method public final o(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public p(J)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->d:J

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public r(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->k:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x80

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public s(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->l:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x100

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/board/EzyMatrix$Matrix$b;->q(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/board/EzyMatrix$Matrix$b;->u(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->B(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyMatrix$Matrix$b;->B(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/board/EzyMatrix$Matrix$b;

    move-result-object p1

    return-object p1
.end method

.method public t(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->m:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit16 p1, p1, 0x200

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public u(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/board/EzyMatrix$Matrix$b;

    .line 6
    .line 7
    return-object p1
.end method

.method public v(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->e:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x2

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public w(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->i:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x20

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public x(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->f:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x4

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public y(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->h:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x10

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public z(F)Lcom/zykj/board/EzyMatrix$Matrix$b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->g:F

    .line 2
    .line 3
    iget p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 4
    .line 5
    or-int/lit8 p1, p1, 0x8

    .line 6
    .line 7
    iput p1, p0, Lcom/zykj/board/EzyMatrix$Matrix$b;->c:I

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessage$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method
