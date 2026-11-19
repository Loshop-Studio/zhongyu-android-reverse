.class final Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $action:Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

.field final synthetic $eventListener:Lcom/zykj/sketch/core/listener/EventListener;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iput-object p2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;->$action:Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iget-object v1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1$parseEventAsTask$20;->$action:Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;

    const-string v2, "action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/EventListener;->onAudioStartRecord(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V

    return-void
.end method
