.class final Lcom/zykj/blackboard/core/action/WriteBeelineAction$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/WriteBeelineAction;-><init>()V
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
.field final synthetic this$0:Lcom/zykj/blackboard/core/action/WriteBeelineAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/WriteBeelineAction;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/WriteBeelineAction$1;->this$0:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/WriteBeelineAction$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/WriteBeelineAction$1;->this$0:Lcom/zykj/blackboard/core/action/WriteBeelineAction;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->setForceNeedNewGroup(Z)V

    return-void
.end method
