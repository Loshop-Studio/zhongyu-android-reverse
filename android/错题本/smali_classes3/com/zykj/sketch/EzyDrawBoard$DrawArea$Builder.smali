# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/EzyDrawBoard$DrawAreaOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;",
        ">;",
        "Lcom/zykj/sketch/EzyDrawBoard$DrawAreaOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$PointF;",
            "Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

.field private matrix_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$PointF;",
            "Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 5
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 7
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 10
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 11
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 12
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/EzyDrawBoard$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;-><init>()V

    return-void
.end method

.method private ensureMatrixIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$18600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private getLeftTopPointFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$PointF;",
            "Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

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
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private getRightBottomPointFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$PointF;",
            "Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

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
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19000()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addAllMatrix(Ljava/lang/Iterable;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->ensureMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lcom/google/protobuf/AbstractMessageLite$Builder;->addAll(Ljava/lang/Iterable;Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public addMatrix(F)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->ensureMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->build()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->isInitialized()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 5
    :cond_0
    invoke-static {v0}, Lcom/google/protobuf/AbstractMessage$Builder;->newUninitializedMessageException(Lcom/google/protobuf/Message;)Lcom/google/protobuf/UninitializedMessageException;

    move-result-object v0

    throw v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->buildPartial()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 3

    .line 3
    new-instance v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/EzyDrawBoard$1;)V

    .line 4
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_0

    .line 5
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19202(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$PointF;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19202(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 7
    :goto_0
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_1

    .line 8
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19302(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF;

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$PointF;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19302(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 10
    :goto_1
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    .line 11
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 12
    iget v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    .line 13
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19402(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;Ljava/util/List;)Ljava/util/List;

    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19502(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;I)I

    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clear()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 2

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 7
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    goto :goto_0

    .line 8
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 9
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 10
    :goto_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_1

    .line 11
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    goto :goto_1

    .line 12
    :cond_1
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 13
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 14
    :goto_1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 15
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    return-object p1
.end method

.method public clearLeftTopPoint()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public clearMatrix()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, -0x5

    .line 8
    .line 9
    iput v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    return-object p1
.end method

.method public clearRightBottomPoint()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 6
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->clone()Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$18600()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$PointF;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 19
    .line 20
    return-object v0
.end method

.method public getLeftTopPointBuilder()Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->getLeftTopPointFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getLeftTopPointOrBuilder()Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public getMatrix(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Float;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public getMatrixCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getMatrixList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$PointF;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 19
    .line 20
    return-object v0
.end method

.method public getRightBottomPointBuilder()Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->getRightBottomPointFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getBuilder()Lcom/google/protobuf/AbstractMessage$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getRightBottomPointOrBuilder()Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/SingleFieldBuilderV3;->getMessageOrBuilder()Lcom/google/protobuf/MessageOrBuilder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$PointFOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public hasLeftTopPoint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method public hasRightBottomPoint()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard;->access$18700()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

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

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 23
    :try_start_0
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19600()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 24
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 25
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    :try_start_2
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->unwrapIOException()Ljava/io/IOException;

    move-result-object p1

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    move-object v0, p2

    :goto_0
    if-eqz v0, :cond_1

    .line 27
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 28
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 10
    invoke-static {}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getDefaultInstance()Lcom/zykj/sketch/EzyDrawBoard$DrawArea;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasLeftTopPoint()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getLeftTopPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeLeftTopPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 13
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->hasRightBottomPoint()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->getRightBottomPoint()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeRightBottomPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    .line 15
    :cond_2
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19400(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 16
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 17
    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19400(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 18
    iget p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    and-int/lit8 p1, p1, -0x5

    iput p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->bitField0_:I

    goto :goto_0

    .line 19
    :cond_3
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->ensureMatrixIsMutable()V

    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    invoke-static {p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea;->access$19400(Lcom/zykj/sketch/EzyDrawBoard$DrawArea;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 21
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 22
    :cond_4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0
.end method

.method public mergeLeftTopPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF;->newBuilder(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public mergeRightBottomPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/sketch/GraphSnapshot$PointF;->newBuilder(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 25
    .line 26
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->mergeFrom(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 31
    .line 32
    .line 33
    return-object p0
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    return-object p1
.end method

.method public setLeftTopPoint(Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setLeftTopPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->leftTopPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setMatrix(IF)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->ensureMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->matrix_:Ljava/util/List;

    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 14
    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    return-object p1
.end method

.method public setRightBottomPoint(Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$PointF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$PointF;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setRightBottomPoint(Lcom/zykj/sketch/GraphSnapshot$PointF;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPointBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->rightBottomPoint_:Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/EzyDrawBoard$DrawArea$Builder;
    .locals 0

    .line 1
    return-object p0
.end method
