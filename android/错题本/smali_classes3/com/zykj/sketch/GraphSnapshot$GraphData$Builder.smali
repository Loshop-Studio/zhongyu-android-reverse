# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
.super Lcom/google/protobuf/GeneratedMessageV3$Builder;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/GraphSnapshot$GraphData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;",
        ">;",
        "Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;"
    }
.end annotation


# instance fields
.field private bitField0_:I

.field private childExtendMatrix_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private childGraph_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            ">;"
        }
    .end annotation
.end field

.field private color_:I

.field private extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/google/protobuf/Any;",
            "Lcom/google/protobuf/Any$Builder;",
            "Lcom/google/protobuf/AnyOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private extra_:Lcom/google/protobuf/Any;

.field private graphType_:I

.field private isSelect_:Z

.field private matrix_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private name_:Ljava/lang/Object;

.field private outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$RectF;",
            "Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$RectFOrBuilder;",
            ">;"
        }
    .end annotation
.end field

.field private outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

.field private showDelete_:Z

.field private width_:F


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 3
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 6
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 7
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 9
    const-string v1, ""

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 10
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 11
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V
    .locals 1

    .line 12
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 14
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 15
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 16
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    const/4 p1, 0x0

    .line 17
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 19
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 20
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->maybeForceBuilderInitialization()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/GraphSnapshot$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/sketch/GraphSnapshot$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;-><init>()V

    return-void
.end method

.method private ensureChildExtendMatrixIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    .line 11
    .line 12
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    .line 16
    .line 17
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 18
    .line 19
    or-int/2addr v0, v1

    .line 20
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method private ensureChildGraphIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private ensureMatrixIsMutable()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

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
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 10
    .line 11
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 15
    .line 16
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 17
    .line 18
    or-int/2addr v0, v1

    .line 19
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method private getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/RepeatedFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 8
    .line 9
    iget v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 10
    .line 11
    const/4 v3, 0x2

    .line 12
    and-int/2addr v2, v3

    .line 13
    if-ne v2, v3, :cond_0

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
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 35
    .line 36
    return-object v0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->access$000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private getExtraFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/google/protobuf/Any;",
            "Lcom/google/protobuf/Any$Builder;",
            "Lcom/google/protobuf/AnyOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getExtra()Lcom/google/protobuf/Any;

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
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/SingleFieldBuilderV3<",
            "Lcom/zykj/sketch/GraphSnapshot$RectF;",
            "Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;",
            "Lcom/zykj/sketch/GraphSnapshot$RectFOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

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
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 28
    .line 29
    return-object v0
.end method

.method private maybeForceBuilderInitialization()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$400()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public addAllChildExtendMatrix(Ljava/lang/Iterable;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildExtendMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

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

.method public addAllChildGraph(Ljava/lang/Iterable;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            ">;)",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

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

.method public addAllMatrix(Ljava/lang/Iterable;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/lang/Float;",
            ">;)",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

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

.method public addChildExtendMatrix(F)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildExtendMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

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

.method public addChildGraph(ILcom/zykj/sketch/GraphSnapshot$GraphData$Builder;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 19
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 20
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 21
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addChildGraph(ILcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 10
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 12
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addChildGraph(Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 14
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 15
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addChildGraph(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public addChildGraphBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 2
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    return-object v0
.end method

.method public addChildGraphBuilder(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2

    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v1

    .line 6
    invoke-virtual {v0, p1, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addBuilder(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/AbstractMessage$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    return-object p1
.end method

.method public addMatrix(F)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->addRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    return-object p1
.end method

.method public bridge synthetic build()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic build()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 2

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    .line 4
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->isInitialized()Z

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
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic buildPartial()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public buildPartial()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 3

    .line 3
    new-instance v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/GraphSnapshot$1;)V

    .line 4
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$602(Lcom/zykj/sketch/GraphSnapshot$GraphData;I)I

    .line 5
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v1, :cond_1

    .line 6
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    const/4 v2, 0x2

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    .line 7
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 8
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$702(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->build()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$702(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/util/List;)Ljava/util/List;

    .line 11
    :goto_0
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    const/4 v2, 0x4

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_2

    .line 12
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 13
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x5

    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 14
    :cond_2
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$802(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/util/List;)Ljava/util/List;

    .line 15
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    const/16 v2, 0x8

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_3

    .line 16
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    .line 17
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x9

    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 18
    :cond_3
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$902(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/util/List;)Ljava/util/List;

    .line 19
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->width_:F

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1002(Lcom/zykj/sketch/GraphSnapshot$GraphData;F)F

    .line 20
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->color_:I

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1102(Lcom/zykj/sketch/GraphSnapshot$GraphData;I)I

    .line 21
    iget-boolean v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->isSelect_:Z

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1202(Lcom/zykj/sketch/GraphSnapshot$GraphData;Z)Z

    .line 22
    iget-boolean v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->showDelete_:Z

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1302(Lcom/zykj/sketch/GraphSnapshot$GraphData;Z)Z

    .line 23
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_4

    .line 24
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1402(Lcom/zykj/sketch/GraphSnapshot$GraphData;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;

    goto :goto_1

    .line 25
    :cond_4
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/google/protobuf/Any;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1402(Lcom/zykj/sketch/GraphSnapshot$GraphData;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;

    .line 26
    :goto_1
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1502(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v1, :cond_5

    .line 28
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1602(Lcom/zykj/sketch/GraphSnapshot$GraphData;Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$RectF;

    goto :goto_2

    .line 29
    :cond_5
    invoke-virtual {v1}, Lcom/google/protobuf/SingleFieldBuilderV3;->build()Lcom/google/protobuf/AbstractMessage;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$RectF;

    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1602(Lcom/zykj/sketch/GraphSnapshot$GraphData;Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$RectF;

    :goto_2
    const/4 v1, 0x0

    .line 30
    invoke-static {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1702(Lcom/zykj/sketch/GraphSnapshot$GraphData;I)I

    .line 31
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onBuilt()V

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clear()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clear()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clear()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clear()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clear()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 3

    .line 5
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clear()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    const/4 v0, 0x0

    .line 6
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 7
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v1, :cond_0

    .line 8
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 9
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 11
    :goto_0
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 12
    iget v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 13
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    and-int/lit8 v1, v2, -0xd

    .line 14
    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    const/4 v1, 0x0

    .line 15
    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->width_:F

    .line 16
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->color_:I

    .line 17
    iput-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->isSelect_:Z

    .line 18
    iput-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->showDelete_:Z

    .line 19
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    .line 20
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    goto :goto_1

    .line 21
    :cond_1
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 22
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 23
    :goto_1
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 24
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_2

    .line 25
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    return-object p0

    .line 26
    :cond_2
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 27
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public clearChildExtendMatrix()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, -0x9

    .line 8
    .line 9
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public clearChildGraph()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 8
    .line 9
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 10
    .line 11
    and-int/lit8 v0, v0, -0x3

    .line 12
    .line 13
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 16
    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->clear()V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public clearColor()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->color_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearExtra()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearField(Lcom/google/protobuf/Descriptors$FieldDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    return-object p1
.end method

.method public clearGraphType()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearIsSelect()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->isSelect_:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearMatrix()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 4
    .line 5
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, -0x5

    .line 8
    .line 9
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public clearName()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 4
    invoke-super {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clearOneof(Lcom/google/protobuf/Descriptors$OneofDescriptor;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    return-object p1
.end method

.method public clearOutRect()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 9
    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 13
    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 15
    .line 16
    return-object p0
.end method

.method public clearShowDelete()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->showDelete_:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public clearWidth()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->width_:F

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clone()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/AbstractMessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clone()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clone()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clone()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clone()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public clone()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 7
    invoke-super {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->clone()Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object v0

    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

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
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->clone()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public getChildExtendMatrix(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

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

.method public getChildExtendMatrixCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

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

.method public getChildExtendMatrixList()Ljava/util/List;
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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

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

.method public getChildGraph(I)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

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
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 19
    .line 20
    return-object p1
.end method

.method public getChildGraphBuilder(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilder(I)Lcom/google/protobuf/AbstractMessage$Builder;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 10
    .line 11
    return-object p1
.end method

.method public getChildGraphBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getBuilderList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getChildGraphCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getCount()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public getChildGraphList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 6
    .line 7
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageList()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getChildGraphOrBuilder(I)Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilder(I)Lcom/google/protobuf/MessageOrBuilder;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;

    .line 19
    .line 20
    return-object p1
.end method

.method public getChildGraphOrBuilderList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->getMessageOrBuilderList()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->color_:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getDefaultInstanceForType()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1

    .line 3
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->access$000()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getExtra()Lcom/google/protobuf/Any;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

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
    check-cast v0, Lcom/google/protobuf/Any;

    .line 19
    .line 20
    return-object v0
.end method

.method public getExtraBuilder()Lcom/google/protobuf/Any$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getExtraFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/google/protobuf/Any$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getExtraOrBuilder()Lcom/google/protobuf/AnyOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/google/protobuf/AnyOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public getGraphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphType;->valueOf(I)Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphType;->UNRECOGNIZED:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public getGraphTypeValue()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 2
    .line 3
    return v0
.end method

.method public getIsSelect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->isSelect_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getMatrix(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

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

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/ByteString;->copyFromUtf8(Ljava/lang/String;)Lcom/google/protobuf/ByteString;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 17
    .line 18
    return-object v0
.end method

.method public getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$RectF;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 19
    .line 20
    return-object v0
.end method

.method public getOutRectBuilder()Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getOutRectFieldBuilder()Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 13
    .line 14
    return-object v0
.end method

.method public getOutRectOrBuilder()Lcom/zykj/sketch/GraphSnapshot$RectFOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

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
    check-cast v0, Lcom/zykj/sketch/GraphSnapshot$RectFOrBuilder;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 13
    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    return-object v0
.end method

.method public getShowDelete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->showDelete_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->width_:F

    .line 2
    .line 3
    return v0
.end method

.method public hasExtra()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

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

.method public hasOutRect()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

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
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot;->access$100()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

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

.method public mergeExtra(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/Any;->newBuilder(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/google/protobuf/Any$Builder;->mergeFrom(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->buildPartial()Lcom/google/protobuf/Any;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

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

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 5
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

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
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public mergeFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 60
    :try_start_0
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1900()Lcom/google/protobuf/Parser;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/google/protobuf/Parser;->parsePartialFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    .line 61
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    :cond_0
    return-object p0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 62
    :try_start_1
    invoke-virtual {p1}, Lcom/google/protobuf/InvalidProtocolBufferException;->getUnfinishedMessage()Lcom/google/protobuf/MessageLite;

    move-result-object p2

    check-cast p2, Lcom/zykj/sketch/GraphSnapshot$GraphData;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
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

    .line 64
    invoke-virtual {p0, v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 65
    :cond_1
    throw p1
.end method

.method public mergeFrom(Lcom/google/protobuf/Message;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 7
    instance-of v0, p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    if-eqz v0, :cond_0

    .line 8
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage$Builder;->mergeFrom(Lcom/google/protobuf/Message;)Lcom/google/protobuf/AbstractMessage$Builder;

    return-object p0
.end method

.method public mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2

    .line 10
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p0

    .line 11
    :cond_0
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$600(Lcom/zykj/sketch/GraphSnapshot$GraphData;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getGraphTypeValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setGraphTypeValue(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_3

    .line 14
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$700(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 15
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 16
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$700(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 17
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x3

    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    goto :goto_0

    .line 18
    :cond_2
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 19
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$700(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    goto :goto_1

    .line 21
    :cond_3
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$700(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    .line 22
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 23
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-virtual {v0}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->dispose()V

    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 25
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$700(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 26
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v1, v1, -0x3

    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    .line 27
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1800()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 28
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->getChildGraphFieldBuilder()Lcom/google/protobuf/RepeatedFieldBuilderV3;

    move-result-object v0

    :cond_4
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    goto :goto_1

    .line 29
    :cond_5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$700(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addAllMessages(Ljava/lang/Iterable;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 30
    :cond_6
    :goto_1
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$800(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 31
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 32
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$800(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    .line 33
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x5

    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    goto :goto_2

    .line 34
    :cond_7
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureMatrixIsMutable()V

    .line 35
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$800(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 36
    :goto_2
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 37
    :cond_8
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$900(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_a

    .line 38
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 39
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$900(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    .line 40
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    and-int/lit8 v0, v0, -0x9

    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->bitField0_:I

    goto :goto_3

    .line 41
    :cond_9
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildExtendMatrixIsMutable()V

    .line 42
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$900(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 43
    :goto_3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 44
    :cond_a
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getWidth()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_b

    .line 45
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getWidth()F

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setWidth(F)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 46
    :cond_b
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getColor()I

    move-result v0

    if-eqz v0, :cond_c

    .line 47
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getColor()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setColor(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 48
    :cond_c
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getIsSelect()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 49
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getIsSelect()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setIsSelect(Z)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 50
    :cond_d
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getShowDelete()Z

    move-result v0

    if-eqz v0, :cond_e

    .line 51
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getShowDelete()Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setShowDelete(Z)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 52
    :cond_e
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasExtra()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 53
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeExtra(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 54
    :cond_f
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_10

    .line 55
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$1500(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 56
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 57
    :cond_10
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasOutRect()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 58
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeOutRect(Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 59
    :cond_11
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0
.end method

.method public mergeOutRect(Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/zykj/sketch/GraphSnapshot$RectF;->newBuilder(Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

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
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final mergeUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public removeChildGraph(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

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
    invoke-virtual {v0, p1}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->remove(I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public setChildExtendMatrix(IF)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildExtendMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childExtendMatrix_:Ljava/util/List;

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

.method public setChildGraph(ILcom/zykj/sketch/GraphSnapshot$GraphData$Builder;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 8
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 9
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public setChildGraph(ILcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraphBuilder_:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureChildGraphIsMutable()V

    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->childGraph_:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 6
    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->setMessage(ILcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    return-object p0
.end method

.method public setColor(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->color_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setExtra(Lcom/google/protobuf/Any$Builder;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setExtra(Lcom/google/protobuf/Any;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extraBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->extra_:Lcom/google/protobuf/Any;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setField(Lcom/google/protobuf/Descriptors$FieldDescriptor;Ljava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    return-object p1
.end method

.method public setGraphType(Lcom/zykj/sketch/GraphSnapshot$GraphType;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphType;->getNumber()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public setGraphTypeValue(I)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->graphType_:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setIsSelect(Z)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->isSelect_:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public setMatrix(IF)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->ensureMatrixIsMutable()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->matrix_:Ljava/util/List;

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

.method public setName(Ljava/lang/String;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 7
    .line 8
    .line 9
    return-object p0
.end method

.method public setNameBytes(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->access$2000(Lcom/google/protobuf/ByteString;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->name_:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 10
    .line 11
    .line 12
    return-object p0
.end method

.method public setOutRect(Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$RectF;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 8
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 9
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$RectF;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public setOutRect(Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRectBuilder_:Lcom/google/protobuf/SingleFieldBuilderV3;

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 4
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    return-object p0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Lcom/google/protobuf/SingleFieldBuilderV3;->setMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/SingleFieldBuilderV3;

    return-object p0
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->setRepeatedField(Lcom/google/protobuf/Descriptors$FieldDescriptor;ILjava/lang/Object;)Lcom/google/protobuf/GeneratedMessageV3$Builder;

    move-result-object p1

    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    return-object p1
.end method

.method public setShowDelete(Z)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->showDelete_:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/GeneratedMessageV3$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public final setUnknownFields(Lcom/google/protobuf/UnknownFieldSet;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    return-object p0
.end method

.method public setWidth(F)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->width_:F

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
