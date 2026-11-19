.class final Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/version/GraphTaskParseVersion4;->parseEventAsTask(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lr6/c;)V
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
.field final synthetic $action:Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

.field final synthetic $eventListener:Lcom/zykj/sketch/core/listener/EventListener;

.field final synthetic $viewBack:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;->$action:Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;->$viewBack:Lr6/c;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;->invoke()V

    sget-object v0, Ld6/s;->a:Ld6/s;

    return-object v0
.end method

.method public final invoke()V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iget-object v1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;->$action:Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;

    const-string v2, "action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$parseEventAsTask$5;->$viewBack:Lr6/c;

    invoke-interface {v0, v1, v2}, Lcom/zykj/sketch/core/listener/EventListener;->onAddPPTEvent(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V

    return-void
.end method
