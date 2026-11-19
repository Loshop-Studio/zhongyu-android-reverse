.class final Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/BoardControl;->loadDir$lambda-14(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lx7/p;Lx7/l;)V
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
.field final synthetic $callback:Lx7/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/p;"
        }
    .end annotation
.end field

.field final synthetic $haveCache:Z

.field final synthetic this$0:Lcom/zykj/blackboard/core/edit/BoardControl;


# direct methods
.method public constructor <init>(Lx7/p;ZLcom/zykj/blackboard/core/edit/BoardControl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/p;",
            "Z",
            "Lcom/zykj/blackboard/core/edit/BoardControl;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;->$callback:Lx7/p;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;->$haveCache:Z

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;->this$0:Lcom/zykj/blackboard/core/edit/BoardControl;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;->$callback:Lx7/p;

    iget-boolean v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;->$haveCache:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$2;->this$0:Lcom/zykj/blackboard/core/edit/BoardControl;

    invoke-static {v2}, Lcom/zykj/blackboard/core/edit/BoardControl;->access$getPageList$p(Lcom/zykj/blackboard/core/edit/BoardControl;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/blackboard/core/edit/IEditPageControl;

    invoke-interface {v2}, Lcom/zykj/blackboard/core/edit/IEditPageControl;->duration()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lx7/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
