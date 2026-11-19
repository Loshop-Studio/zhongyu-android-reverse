.class Lcom/google/protobuf/DebugFormat$LazyDebugOutput;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/DebugFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LazyDebugOutput"
.end annotation


# instance fields
.field private final fields:Lcom/google/protobuf/UnknownFieldSet;

.field private final format:Lcom/google/protobuf/DebugFormat;

.field private final message:Lcom/google/protobuf/MessageOrBuilder;


# direct methods
.method public constructor <init>(Lcom/google/protobuf/MessageOrBuilder;Lcom/google/protobuf/DebugFormat;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->message:Lcom/google/protobuf/MessageOrBuilder;

    const/4 p1, 0x0

    .line 3
    iput-object p1, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->fields:Lcom/google/protobuf/UnknownFieldSet;

    .line 4
    iput-object p2, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->format:Lcom/google/protobuf/DebugFormat;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/UnknownFieldSet;Lcom/google/protobuf/DebugFormat;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->message:Lcom/google/protobuf/MessageOrBuilder;

    .line 7
    iput-object p1, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->fields:Lcom/google/protobuf/UnknownFieldSet;

    .line 8
    iput-object p2, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->format:Lcom/google/protobuf/DebugFormat;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->message:Lcom/google/protobuf/MessageOrBuilder;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->format:Lcom/google/protobuf/DebugFormat;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Lcom/google/protobuf/DebugFormat;->toString(Lcom/google/protobuf/MessageOrBuilder;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->format:Lcom/google/protobuf/DebugFormat;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/google/protobuf/DebugFormat$LazyDebugOutput;->fields:Lcom/google/protobuf/UnknownFieldSet;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/google/protobuf/DebugFormat;->toString(Lcom/google/protobuf/UnknownFieldSet;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
