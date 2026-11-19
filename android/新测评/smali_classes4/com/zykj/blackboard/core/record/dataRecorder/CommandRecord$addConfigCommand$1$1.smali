.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->I(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/protobuf/Message;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/google/protobuf/Message;",
        "a",
        "()Lcom/google/protobuf/Message;"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field public final synthetic d:Lcom/zykj/blackboard/bean/BackgroundLineConfig;


# direct methods
.method public constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 0

    iput p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->a:I

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->b:I

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/protobuf/Message;
    .locals 2

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->y()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->a:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->B(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->b:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->z(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->c:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 16
    .line 17
    invoke-static {v1}, Le5/f;->g(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->C(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->d:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 25
    .line 26
    invoke-static {v1}, Le5/f;->g(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->A(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->c()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "builder.build()"

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->a()Lcom/google/protobuf/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
