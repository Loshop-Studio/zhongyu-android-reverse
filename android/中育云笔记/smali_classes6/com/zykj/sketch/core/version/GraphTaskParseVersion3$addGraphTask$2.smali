.class final Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;->addGraphTask(JLcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/core/data/RenderTask;Lhd/a;)V
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
.field final synthetic $callBack:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $content:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

.field final synthetic $eventListener:Lcom/zykj/sketch/core/listener/EventListener;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Lcom/zykj/sketch/core/listener/EventListener;Lhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->$content:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->$callBack:Lhd/a;

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

    .line 4
    invoke-virtual {p0}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->$content:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    invoke-virtual {v0}, Lcom/zykj/sketch/EzyDrawBoard$ActionContent;->hasGraphSnapshot()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->$eventListener:Lcom/zykj/sketch/core/listener/EventListener;

    iget-object v1, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->$content:Lcom/zykj/sketch/EzyDrawBoard$ActionContent;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/zykj/sketch/core/listener/EventListener$DefaultImpls;->graphSnapShot$default(Lcom/zykj/sketch/core/listener/EventListener;Lcom/zykj/sketch/EzyDrawBoard$ActionContent;ZILjava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3$addGraphTask$2;->$callBack:Lhd/a;

    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    return-void
.end method
