.class public final Lcom/google/protobuf/ProtobufToStringOutput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;
    }
.end annotation


# static fields
.field private static final outputMode:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/protobuf/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/protobuf/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/emoji2/text/flatbuffer/b;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Landroidx/emoji2/text/flatbuffer/b;-><init>(Ljava/util/function/Supplier;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Lcom/google/protobuf/ProtobufToStringOutput;->outputMode:Ljava/lang/ThreadLocal;

    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;->TEXT_FORMAT:Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public static callWithDebugFormat(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;->DEBUG_FORMAT:Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/google/protobuf/ProtobufToStringOutput;->callWithSpecificFormat(Ljava/lang/Runnable;Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static callWithSpecificFormat(Ljava/lang/Runnable;Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/protobuf/ProtobufToStringOutput;->setOutputMode(Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;)Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/google/protobuf/ProtobufToStringOutput;->setOutputMode(Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;)Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    invoke-static {p1}, Lcom/google/protobuf/ProtobufToStringOutput;->setOutputMode(Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;)Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 14
    .line 15
    .line 16
    throw p0
.end method

.method public static callWithTextFormat(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;->TEXT_FORMAT:Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/google/protobuf/ProtobufToStringOutput;->callWithSpecificFormat(Ljava/lang/Runnable;Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static setOutputMode(Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;)Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/ProtobufToStringOutput;->outputMode:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method

.method public static shouldOutputDebugFormat()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/google/protobuf/ProtobufToStringOutput;->outputMode:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;->DEBUG_FORMAT:Lcom/google/protobuf/ProtobufToStringOutput$OutputMode;

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method
