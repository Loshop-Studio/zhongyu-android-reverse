.class final Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/PageControl;->turnOnMicro()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "fileName",
        "Ld6/s;",
        "invoke",
        "(Ljava/lang/String;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/blackboard/core/edit/PageControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/PageControl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;->this$0:Lcom/zykj/blackboard/core/edit/PageControl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;->invoke(Ljava/lang/String;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Ljava/lang/String;)V
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "fileName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/PageControl$turnOnMicro$1;->this$0:Lcom/zykj/blackboard/core/edit/PageControl;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getRouterRecord()Lcom/zykj/blackboard/core/record/SourceRouterRecord;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->getAudioRecord()Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;

    move-result-object v1

    const-wide/16 v3, 0x0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    move-object v2, p1

    .line 4
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;->addAudio(Ljava/lang/String;JJ)Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    return-void
.end method
