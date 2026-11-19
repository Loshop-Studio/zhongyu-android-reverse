.class final Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$addGraphTask$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/version/GraphTaskParseVersion4;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lhd/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $content:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

.field final synthetic $eventListener:Lcom/zykj/sketch/core/listener/EventListener;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$addGraphTask$3;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iput-object p2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$addGraphTask$3;->$content:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$addGraphTask$3;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$addGraphTask$3;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iget-object v1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4$addGraphTask$3;->$content:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/zykj/sketch/core/listener/EventListener$DefaultImpls;->graphSnapShot$default(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;ZILjava/lang/Object;)V

    return-void
.end method
