# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/sketch/GraphSnapshot$GraphData;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/GraphSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GraphData"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    }
.end annotation


# static fields
.field public static final CHILDEXTENDMATRIX_FIELD_NUMBER:I = 0x4

.field public static final CHILDGRAPH_FIELD_NUMBER:I = 0x2

.field public static final COLOR_FIELD_NUMBER:I = 0x7

.field private static final DEFAULT_INSTANCE:Lcom/zykj/sketch/GraphSnapshot$GraphData;

.field public static final EXTRA_FIELD_NUMBER:I = 0xa

.field public static final GRAPHTYPE_FIELD_NUMBER:I = 0x1

.field public static final ISSELECT_FIELD_NUMBER:I = 0x8

.field public static final MATRIX_FIELD_NUMBER:I = 0x3

.field public static final NAME_FIELD_NUMBER:I = 0xb

.field public static final OUTRECT_FIELD_NUMBER:I = 0xc

.field private static final PARSER:Lcom/google/protobuf/Parser;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            ">;"
        }
    .end annotation
.end field

.field public static final SHOWDELETE_FIELD_NUMBER:I = 0x9

.field public static final WIDTH_FIELD_NUMBER:I = 0x6

.field private static final serialVersionUID:J


# instance fields
.field private bitField0_:I

.field private childExtendMatrixMemoizedSerializedSize:I

.field private childExtendMatrix_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
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

.field private extra_:Lcom/google/protobuf/Any;

.field private graphType_:I

.field private isSelect_:Z

.field private matrixMemoizedSerializedSize:I

.field private matrix_:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private memoizedIsInitialized:B

.field private volatile name_:Ljava/lang/Object;

.field private outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

.field private showDelete_:Z

.field private width_:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/sketch/GraphSnapshot$GraphData$1;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$1;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 7
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    const/4 v0, -0x1

    .line 8
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrixMemoizedSerializedSize:I

    .line 9
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrixMemoizedSerializedSize:I

    .line 10
    iput-byte v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->memoizedIsInitialized:B

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 12
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 13
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    .line 14
    iput-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    const/4 v1, 0x0

    .line 15
    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->width_:F

    .line 16
    iput v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->color_:I

    .line 17
    iput-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->isSelect_:Z

    .line 18
    iput-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->showDelete_:Z

    .line 19
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;-><init>()V

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    const/4 v2, 0x2

    const/4 v3, 0x4

    const/16 v4, 0x8

    if-nez v0, :cond_d

    .line 21
    :try_start_0
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readTag()I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    sparse-switch v5, :sswitch_data_0

    .line 22
    invoke-virtual {p1, v5}, Lcom/google/protobuf/CodedInputStream;->skipField(I)Z

    move-result v2

    if-nez v2, :cond_0

    :sswitch_0
    move v0, v6

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    move-exception p1

    goto/16 :goto_3

    :catch_1
    move-exception p1

    goto/16 :goto_4

    .line 23
    :sswitch_1
    iget-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    if-eqz v5, :cond_1

    .line 24
    invoke-virtual {v5}, Lcom/zykj/sketch/GraphSnapshot$RectF;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    move-result-object v7

    .line 25
    :cond_1
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$RectF;->parser()Lcom/google/protobuf/Parser;

    move-result-object v5

    invoke-virtual {p1, v5, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v5

    check-cast v5, Lcom/zykj/sketch/GraphSnapshot$RectF;

    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    if-eqz v7, :cond_0

    .line 26
    invoke-virtual {v7, v5}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;

    .line 27
    invoke-virtual {v7}, Lcom/zykj/sketch/GraphSnapshot$RectF$Builder;->buildPartial()Lcom/zykj/sketch/GraphSnapshot$RectF;

    move-result-object v5

    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    goto :goto_0

    .line 28
    :sswitch_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readStringRequireUtf8()Ljava/lang/String;

    move-result-object v5

    .line 29
    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

    goto :goto_0

    .line 30
    :sswitch_3
    iget-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    if-eqz v5, :cond_2

    .line 31
    invoke-virtual {v5}, Lcom/google/protobuf/Any;->toBuilder()Lcom/google/protobuf/Any$Builder;

    move-result-object v7

    .line 32
    :cond_2
    invoke-static {}, Lcom/google/protobuf/Any;->parser()Lcom/google/protobuf/Parser;

    move-result-object v5

    invoke-virtual {p1, v5, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v5

    check-cast v5, Lcom/google/protobuf/Any;

    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    if-eqz v7, :cond_0

    .line 33
    invoke-virtual {v7, v5}, Lcom/google/protobuf/Any$Builder;->mergeFrom(Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any$Builder;

    .line 34
    invoke-virtual {v7}, Lcom/google/protobuf/Any$Builder;->buildPartial()Lcom/google/protobuf/Any;

    move-result-object v5

    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    goto :goto_0

    .line 35
    :sswitch_4
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    move-result v5

    iput-boolean v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->showDelete_:Z

    goto :goto_0

    .line 36
    :sswitch_5
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readBool()Z

    move-result v5

    iput-boolean v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->isSelect_:Z

    goto :goto_0

    .line 37
    :sswitch_6
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readInt32()I

    move-result v5

    iput v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->color_:I

    goto :goto_0

    .line 38
    :sswitch_7
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v5

    iput v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->width_:F

    goto/16 :goto_0

    :sswitch_8
    and-int/lit8 v5, v1, 0x8

    if-eq v5, v4, :cond_3

    .line 39
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    or-int/lit8 v1, v1, 0x8

    .line 40
    :cond_3
    iget-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 41
    :sswitch_9
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v5

    .line 42
    invoke-virtual {p1, v5}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v5

    and-int/lit8 v6, v1, 0x8

    if-eq v6, v4, :cond_4

    .line 43
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v6

    if-lez v6, :cond_4

    .line 44
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    or-int/lit8 v1, v1, 0x8

    .line 45
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v6

    if-lez v6, :cond_5

    .line 46
    iget-object v6, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 47
    :cond_5
    invoke-virtual {p1, v5}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V

    goto/16 :goto_0

    :sswitch_a
    and-int/lit8 v5, v1, 0x4

    if-eq v5, v3, :cond_6

    .line 48
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    or-int/lit8 v1, v1, 0x4

    .line 49
    :cond_6
    iget-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 50
    :sswitch_b
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readRawVarint32()I

    move-result v5

    .line 51
    invoke-virtual {p1, v5}, Lcom/google/protobuf/CodedInputStream;->pushLimit(I)I

    move-result v5

    and-int/lit8 v6, v1, 0x4

    if-eq v6, v3, :cond_7

    .line 52
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v6

    if-lez v6, :cond_7

    .line 53
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    or-int/lit8 v1, v1, 0x4

    .line 54
    :cond_7
    :goto_2
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->getBytesUntilLimit()I

    move-result v6

    if-lez v6, :cond_8

    .line 55
    iget-object v6, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readFloat()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 56
    :cond_8
    invoke-virtual {p1, v5}, Lcom/google/protobuf/CodedInputStream;->popLimit(I)V

    goto/16 :goto_0

    :sswitch_c
    and-int/lit8 v5, v1, 0x2

    if-eq v5, v2, :cond_9

    .line 57
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    or-int/lit8 v1, v1, 0x2

    .line 58
    :cond_9
    iget-object v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 59
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->parser()Lcom/google/protobuf/Parser;

    move-result-object v6

    invoke-virtual {p1, v6, p2}, Lcom/google/protobuf/CodedInputStream;->readMessage(Lcom/google/protobuf/Parser;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/MessageLite;

    move-result-object v6

    check-cast v6, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 60
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 61
    :sswitch_d
    invoke-virtual {p1}, Lcom/google/protobuf/CodedInputStream;->readEnum()I

    move-result v5

    .line 62
    iput v5, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I
    :try_end_0
    .catch Lcom/google/protobuf/InvalidProtocolBufferException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_0

    .line 63
    :goto_3
    :try_start_1
    new-instance p2, Lcom/google/protobuf/InvalidProtocolBufferException;

    invoke-direct {p2, p1}, Lcom/google/protobuf/InvalidProtocolBufferException;-><init>(Ljava/io/IOException;)V

    .line 64
    invoke-virtual {p2, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    .line 65
    :goto_4
    invoke-virtual {p1, p0}, Lcom/google/protobuf/InvalidProtocolBufferException;->setUnfinishedMessage(Lcom/google/protobuf/MessageLite;)Lcom/google/protobuf/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    and-int/lit8 p2, v1, 0x2

    if-ne p2, v2, :cond_a

    .line 66
    iget-object p2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    :cond_a
    and-int/lit8 p2, v1, 0x4

    if-ne p2, v3, :cond_b

    .line 67
    iget-object p2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    :cond_b
    and-int/lit8 p2, v1, 0x8

    if-ne p2, v4, :cond_c

    .line 68
    iget-object p2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    iput-object p2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    .line 69
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->makeExtensionsImmutable()V

    .line 70
    throw p1

    :cond_d
    and-int/lit8 p1, v1, 0x2

    if-ne p1, v2, :cond_e

    .line 71
    iget-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    :cond_e
    and-int/lit8 p1, v1, 0x4

    if-ne p1, v3, :cond_f

    .line 72
    iget-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    :cond_f
    and-int/lit8 p1, v1, 0x8

    if-ne p1, v4, :cond_10

    .line 73
    iget-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    .line 74
    :cond_10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->makeExtensionsImmutable()V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_d
        0x12 -> :sswitch_c
        0x1a -> :sswitch_b
        0x1d -> :sswitch_a
        0x22 -> :sswitch_9
        0x25 -> :sswitch_8
        0x35 -> :sswitch_7
        0x38 -> :sswitch_6
        0x40 -> :sswitch_5
        0x48 -> :sswitch_4
        0x52 -> :sswitch_3
        0x5a -> :sswitch_2
        0x62 -> :sswitch_1
    .end sparse-switch
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;Lcom/zykj/sketch/GraphSnapshot$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/sketch/GraphSnapshot$GraphData;-><init>(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)V

    return-void
.end method

.method private constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/protobuf/GeneratedMessageV3$Builder<",
            "*>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrixMemoizedSerializedSize:I

    .line 5
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrixMemoizedSerializedSize:I

    .line 6
    iput-byte p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->memoizedIsInitialized:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/sketch/GraphSnapshot$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic access$1002(Lcom/zykj/sketch/GraphSnapshot$GraphData;F)F
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->width_:F

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1102(Lcom/zykj/sketch/GraphSnapshot$GraphData;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->color_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1202(Lcom/zykj/sketch/GraphSnapshot$GraphData;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->isSelect_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1302(Lcom/zykj/sketch/GraphSnapshot$GraphData;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->showDelete_:Z

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1402(Lcom/zykj/sketch/GraphSnapshot$GraphData;Lcom/google/protobuf/Any;)Lcom/google/protobuf/Any;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1500(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$1502(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1602(Lcom/zykj/sketch/GraphSnapshot$GraphData;Lcom/zykj/sketch/GraphSnapshot$RectF;)Lcom/zykj/sketch/GraphSnapshot$RectF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$1702(Lcom/zykj/sketch/GraphSnapshot$GraphData;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->bitField0_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$1800()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$1900()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic access$2000(Lcom/google/protobuf/ByteString;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/google/protobuf/AbstractMessageLite;->checkByteStringIsUtf8(Lcom/google/protobuf/ByteString;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$400()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic access$600(Lcom/zykj/sketch/GraphSnapshot$GraphData;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$602(Lcom/zykj/sketch/GraphSnapshot$GraphData;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic access$700(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$702(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$800(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$802(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$900(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$902(Lcom/zykj/sketch/GraphSnapshot$GraphData;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 2
    .line 3
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

.method public static newBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static newBuilder(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 2
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p0

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseDelimitedFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 4
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseDelimitedWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 9
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 10
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom(Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 11
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 12
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Lcom/google/protobuf/CodedInputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 6
    invoke-static {v0, p0}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom(Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 7
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 8
    invoke-static {v0, p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;->parseWithIOException(Lcom/google/protobuf/Parser;Ljava/io/InputStream;Lcom/google/protobuf/ExtensionRegistryLite;)Lcom/google/protobuf/Message;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom([B)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 3
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0}, Lcom/google/protobuf/Parser;->parseFrom([B)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/protobuf/InvalidProtocolBufferException;
        }
    .end annotation

    .line 4
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    invoke-interface {v0, p0, p1}, Lcom/google/protobuf/Parser;->parseFrom([BLcom/google/protobuf/ExtensionRegistryLite;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object p0
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_1
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 15
    .line 16
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 17
    .line 18
    iget v2, p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    if-ne v1, v2, :cond_2

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildGraphList()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildGraphList()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v1, v2}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getWidth()F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getWidth()F

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-ne v1, v2, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getColor()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getColor()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-ne v1, v2, :cond_2

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getIsSelect()Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getIsSelect()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-ne v1, v2, :cond_2

    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getShowDelete()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getShowDelete()Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-ne v1, v2, :cond_2

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasExtra()Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasExtra()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-ne v1, v2, :cond_2

    .line 122
    .line 123
    move v1, v0

    .line 124
    goto :goto_0

    .line 125
    :cond_2
    move v1, v3

    .line 126
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasExtra()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_4

    .line 131
    .line 132
    if-eqz v1, :cond_3

    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v1, v2}, Lcom/google/protobuf/Any;->equals(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_3

    .line 147
    .line 148
    move v1, v0

    .line 149
    goto :goto_1

    .line 150
    :cond_3
    move v1, v3

    .line 151
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getName()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    if-eqz v1, :cond_5

    .line 166
    .line 167
    move v1, v0

    .line 168
    goto :goto_2

    .line 169
    :cond_5
    move v1, v3

    .line 170
    :goto_2
    if-eqz v1, :cond_6

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasOutRect()Z

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasOutRect()Z

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    if-ne v1, v2, :cond_6

    .line 181
    .line 182
    move v1, v0

    .line 183
    goto :goto_3

    .line 184
    :cond_6
    move v1, v3

    .line 185
    :goto_3
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasOutRect()Z

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    if-eqz v2, :cond_8

    .line 190
    .line 191
    if-eqz v1, :cond_7

    .line 192
    .line 193
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/GraphSnapshot$RectF;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_7

    .line 206
    .line 207
    return v0

    .line 208
    :cond_7
    return v3

    .line 209
    :cond_8
    return v1
.end method

.method public getChildExtendMatrix(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getChildGraph(I)Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 8
    .line 9
    return-object p1
.end method

.method public getChildGraphCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getChildGraphOrBuilder(I)Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/zykj/sketch/GraphSnapshot$GraphDataOrBuilder;

    .line 8
    .line 9
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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->color_:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstanceForType()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getDefaultInstanceForType()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultInstanceForType()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 1

    .line 3
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    return-object v0
.end method

.method public getExtra()Lcom/google/protobuf/Any;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/google/protobuf/Any;->getDefaultInstance()Lcom/google/protobuf/Any;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getExtraOrBuilder()Lcom/google/protobuf/AnyOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getGraphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

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
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 2
    .line 3
    return v0
.end method

.method public getIsSelect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->isSelect_:Z

    .line 2
    .line 3
    return v0
.end method

.method public getMatrix(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

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
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public getNameBytes()Lcom/google/protobuf/ByteString;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

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
    iput-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

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
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$RectF;->getDefaultInstance()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public getOutRectOrBuilder()Lcom/zykj/sketch/GraphSnapshot$RectFOrBuilder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Parser<",
            "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->PARSER:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 8
    .line 9
    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->UNBOUNDED_CONTAINER_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$GraphType;->getNumber()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    .line 18
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-static {v1, v0}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move v0, v2

    .line 27
    :goto_0
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ge v2, v1, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 42
    .line 43
    const/4 v3, 0x2

    .line 44
    invoke-static {v3, v1}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    add-int/2addr v0, v1

    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    mul-int/lit8 v1, v1, 0x4

    .line 61
    .line 62
    add-int/2addr v0, v1

    .line 63
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-nez v2, :cond_3

    .line 72
    .line 73
    add-int/lit8 v0, v0, 0x1

    .line 74
    .line 75
    invoke-static {v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    add-int/2addr v0, v2

    .line 80
    :cond_3
    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrixMemoizedSerializedSize:I

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    mul-int/lit8 v1, v1, 0x4

    .line 91
    .line 92
    add-int/2addr v0, v1

    .line 93
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-nez v2, :cond_4

    .line 102
    .line 103
    add-int/lit8 v0, v0, 0x1

    .line 104
    .line 105
    invoke-static {v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32SizeNoTag(I)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    add-int/2addr v0, v2

    .line 110
    :cond_4
    iput v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrixMemoizedSerializedSize:I

    .line 111
    .line 112
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->width_:F

    .line 113
    .line 114
    const/4 v2, 0x0

    .line 115
    cmpl-float v2, v1, v2

    .line 116
    .line 117
    if-eqz v2, :cond_5

    .line 118
    .line 119
    const/4 v2, 0x6

    .line 120
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeFloatSize(IF)I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    add-int/2addr v0, v1

    .line 125
    :cond_5
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->color_:I

    .line 126
    .line 127
    if-eqz v1, :cond_6

    .line 128
    .line 129
    const/4 v2, 0x7

    .line 130
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    add-int/2addr v0, v1

    .line 135
    :cond_6
    iget-boolean v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->isSelect_:Z

    .line 136
    .line 137
    if-eqz v1, :cond_7

    .line 138
    .line 139
    const/16 v2, 0x8

    .line 140
    .line 141
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    add-int/2addr v0, v1

    .line 146
    :cond_7
    iget-boolean v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->showDelete_:Z

    .line 147
    .line 148
    if-eqz v1, :cond_8

    .line 149
    .line 150
    const/16 v2, 0x9

    .line 151
    .line 152
    invoke-static {v2, v1}, Lcom/google/protobuf/CodedOutputStream;->computeBoolSize(IZ)I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    add-int/2addr v0, v1

    .line 157
    :cond_8
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    .line 158
    .line 159
    if-eqz v1, :cond_9

    .line 160
    .line 161
    const/16 v1, 0xa

    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    add-int/2addr v0, v1

    .line 172
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getNameBytes()Lcom/google/protobuf/ByteString;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-nez v1, :cond_a

    .line 181
    .line 182
    const/16 v1, 0xb

    .line 183
    .line 184
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

    .line 185
    .line 186
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    add-int/2addr v0, v1

    .line 191
    :cond_a
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 192
    .line 193
    if-eqz v1, :cond_b

    .line 194
    .line 195
    const/16 v1, 0xc

    .line 196
    .line 197
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-static {v1, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    add-int/2addr v0, v1

    .line 206
    :cond_b
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 207
    .line 208
    return v0
.end method

.method public getShowDelete()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->showDelete_:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;
    .locals 1

    .line 1
    invoke-static {}, Lcom/google/protobuf/UnknownFieldSet;->getDefaultInstance()Lcom/google/protobuf/UnknownFieldSet;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getWidth()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->width_:F

    .line 2
    .line 3
    return v0
.end method

.method public hasExtra()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hasOutRect()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getDescriptorForType()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/lit16 v0, v0, 0x30b

    .line 15
    .line 16
    const/16 v1, 0x25

    .line 17
    .line 18
    mul-int/2addr v0, v1

    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    const/16 v2, 0x35

    .line 22
    .line 23
    mul-int/2addr v0, v2

    .line 24
    iget v3, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildGraphCount()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-lez v3, :cond_1

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildGraphList()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/2addr v0, v3

    .line 47
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixCount()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-lez v3, :cond_2

    .line 52
    .line 53
    const/4 v3, 0x3

    .line 54
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-int/2addr v0, v3

    .line 67
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixCount()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-lez v3, :cond_3

    .line 72
    .line 73
    const/4 v3, 0x4

    .line 74
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-interface {v3}, Ljava/util/List;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    add-int/2addr v0, v3

    .line 87
    :cond_3
    const/4 v3, 0x6

    .line 88
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getWidth()F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    add-int/2addr v3, v0

    .line 101
    mul-int/2addr v3, v1

    .line 102
    add-int/lit8 v3, v3, 0x7

    .line 103
    .line 104
    mul-int/2addr v3, v2

    .line 105
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getColor()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    add-int/2addr v0, v3

    .line 110
    mul-int/2addr v0, v1

    .line 111
    add-int/lit8 v0, v0, 0x8

    .line 112
    .line 113
    mul-int/2addr v0, v2

    .line 114
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getIsSelect()Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    invoke-static {v3}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    add-int/2addr v3, v0

    .line 123
    mul-int/2addr v3, v1

    .line 124
    add-int/lit8 v3, v3, 0x9

    .line 125
    .line 126
    mul-int/2addr v3, v2

    .line 127
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getShowDelete()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    invoke-static {v0}, Lcom/google/protobuf/Internal;->hashBoolean(Z)I

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    add-int/2addr v0, v3

    .line 136
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasExtra()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_4

    .line 141
    .line 142
    const/16 v3, 0xa

    .line 143
    .line 144
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-virtual {v3}, Lcom/google/protobuf/Any;->hashCode()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    add-int/2addr v0, v3

    .line 157
    :cond_4
    const/16 v3, 0xb

    .line 158
    .line 159
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    add-int/2addr v3, v0

    .line 172
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->hasOutRect()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_5

    .line 177
    .line 178
    const/16 v0, 0xc

    .line 179
    .line 180
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/material3/c;->b(IIII)I

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$RectF;->hashCode()I

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    add-int v3, v1, v0

    .line 193
    .line 194
    :cond_5
    mul-int/lit8 v3, v3, 0x1d

    .line 195
    .line 196
    iget-object v0, p0, Lcom/google/protobuf/GeneratedMessageV3;->unknownFields:Lcom/google/protobuf/UnknownFieldSet;

    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    add-int/2addr v0, v3

    .line 203
    iput v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 204
    .line 205
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
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->memoizedIsInitialized:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->memoizedIsInitialized:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->newBuilderForType()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->newBuilderForType()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 1

    .line 4
    invoke-static {}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->newBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2

    .line 5
    new-instance v0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/sketch/GraphSnapshot$1;)V

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->toBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public toBuilder()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;
    .locals 2

    .line 3
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->DEFAULT_INSTANCE:Lcom/zykj/sketch/GraphSnapshot$GraphData;

    const/4 v1, 0x0

    if-ne p0, v0, :cond_0

    .line 4
    new-instance v0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;-><init>(Lcom/zykj/sketch/GraphSnapshot$1;)V

    return-object v0

    :cond_0
    new-instance v0, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    invoke-direct {v0, v1}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;-><init>(Lcom/zykj/sketch/GraphSnapshot$1;)V

    invoke-virtual {v0, p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->mergeFrom(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getSerializedSize()I

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 5
    .line 6
    sget-object v1, Lcom/zykj/sketch/GraphSnapshot$GraphType;->UNBOUNDED_CONTAINER_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$GraphType;->getNumber()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->graphType_:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 18
    .line 19
    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    move v1, v0

    .line 22
    :goto_0
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-ge v1, v2, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childGraph_:Ljava/util/List;

    .line 31
    .line 32
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getMatrixList()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-lez v1, :cond_2

    .line 54
    .line 55
    const/16 v1, 0x1a

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 58
    .line 59
    .line 60
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrixMemoizedSerializedSize:I

    .line 61
    .line 62
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 63
    .line 64
    .line 65
    :cond_2
    move v1, v0

    .line 66
    :goto_1
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-ge v1, v2, :cond_3

    .line 73
    .line 74
    iget-object v2, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->matrix_:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    check-cast v2, Ljava/lang/Float;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-virtual {p1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeFloatNoTag(F)V

    .line 87
    .line 88
    .line 89
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getChildExtendMatrixList()Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-lez v1, :cond_4

    .line 101
    .line 102
    const/16 v1, 0x22

    .line 103
    .line 104
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 105
    .line 106
    .line 107
    iget v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrixMemoizedSerializedSize:I

    .line 108
    .line 109
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedOutputStream;->writeUInt32NoTag(I)V

    .line 110
    .line 111
    .line 112
    :cond_4
    :goto_2
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    .line 113
    .line 114
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-ge v0, v1, :cond_5

    .line 119
    .line 120
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->childExtendMatrix_:Ljava/util/List;

    .line 121
    .line 122
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Ljava/lang/Float;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-virtual {p1, v1}, Lcom/google/protobuf/CodedOutputStream;->writeFloatNoTag(F)V

    .line 133
    .line 134
    .line 135
    add-int/lit8 v0, v0, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->width_:F

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    cmpl-float v1, v0, v1

    .line 142
    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    const/4 v1, 0x6

    .line 146
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeFloat(IF)V

    .line 147
    .line 148
    .line 149
    :cond_6
    iget v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->color_:I

    .line 150
    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    const/4 v1, 0x7

    .line 154
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 155
    .line 156
    .line 157
    :cond_7
    iget-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->isSelect_:Z

    .line 158
    .line 159
    if-eqz v0, :cond_8

    .line 160
    .line 161
    const/16 v1, 0x8

    .line 162
    .line 163
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 164
    .line 165
    .line 166
    :cond_8
    iget-boolean v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->showDelete_:Z

    .line 167
    .line 168
    if-eqz v0, :cond_9

    .line 169
    .line 170
    const/16 v1, 0x9

    .line 171
    .line 172
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeBool(IZ)V

    .line 173
    .line 174
    .line 175
    :cond_9
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->extra_:Lcom/google/protobuf/Any;

    .line 176
    .line 177
    if-eqz v0, :cond_a

    .line 178
    .line 179
    const/16 v0, 0xa

    .line 180
    .line 181
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getExtra()Lcom/google/protobuf/Any;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 186
    .line 187
    .line 188
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getNameBytes()Lcom/google/protobuf/ByteString;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->isEmpty()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-nez v0, :cond_b

    .line 197
    .line 198
    const/16 v0, 0xb

    .line 199
    .line 200
    iget-object v1, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->name_:Ljava/lang/Object;

    .line 201
    .line 202
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    :cond_b
    iget-object v0, p0, Lcom/zykj/sketch/GraphSnapshot$GraphData;->outRect_:Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 206
    .line 207
    if-eqz v0, :cond_c

    .line 208
    .line 209
    const/16 v0, 0xc

    .line 210
    .line 211
    invoke-virtual {p0}, Lcom/zykj/sketch/GraphSnapshot$GraphData;->getOutRect()Lcom/zykj/sketch/GraphSnapshot$RectF;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 216
    .line 217
    .line 218
    :cond_c
    return-void
.end method
