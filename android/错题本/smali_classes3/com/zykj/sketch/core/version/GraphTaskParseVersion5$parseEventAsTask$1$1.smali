.class final Lcom/zykj/sketch/core/version/GraphTaskParseVersion5$parseEventAsTask$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/version/GraphTaskParseVersion5;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lr6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ld6/s;",
        "invoke",
        "()V",
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
.field final synthetic $eventListener:Lcom/zykj/sketch/core/listener/EventListener;

.field final synthetic $touchEvent:Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion5$parseEventAsTask$1$1;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iput-object p2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion5$parseEventAsTask$1$1;->$touchEvent:Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion5$parseEventAsTask$1$1;->invoke()V

    sget-object v0, Ld6/s;->a:Ld6/s;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion5$parseEventAsTask$1$1;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iget-object v1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion5$parseEventAsTask$1$1;->$touchEvent:Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;

    const-string v2, "touchEvent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/zykj/sketch/core/listener/EventListener;->onTouchEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V

    return-void
.end method
