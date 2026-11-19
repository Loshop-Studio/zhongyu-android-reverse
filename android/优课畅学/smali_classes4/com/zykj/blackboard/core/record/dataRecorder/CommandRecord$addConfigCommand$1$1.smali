.class final Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;->addConfigCommand$lambda-19(Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;JIILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $lastBackgroundColor:I

.field final synthetic $lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field final synthetic $originBackgroundColor:I

.field final synthetic $originBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;


# direct methods
.method public constructor <init>(IILcom/zykj/blackboard/bean/BackgroundLineConfig;Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 0

    iput p1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundColor:I

    iput p2, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundColor:I

    iput-object p3, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    iput-object p4, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Lcom/google/protobuf/Message;
    .locals 2

    .line 2
    invoke-static {}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;->p()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    move-result-object v0

    .line 3
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundColor:I

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->B(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 4
    iget v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundColor:I

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->z(I)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$originBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->C(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 6
    iget-object v1, p0, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->$lastBackgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/board/EzyHeader$BackgroundLineConfig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->A(Lcom/zykj/board/EzyHeader$BackgroundLineConfig;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;

    .line 7
    invoke-virtual {v0}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config$b;->e()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Config;

    move-result-object v0

    const-string v1, "builder.build()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord$addConfigCommand$1$1;->invoke()Lcom/google/protobuf/Message;

    move-result-object v0

    return-object v0
.end method
