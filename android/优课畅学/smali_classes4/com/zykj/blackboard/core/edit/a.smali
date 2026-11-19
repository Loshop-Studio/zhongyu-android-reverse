.class public final synthetic Lcom/zykj/blackboard/core/edit/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/edit/BasePageControl;

.field public final synthetic b:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BasePageControl;Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/a;->a:Lcom/zykj/blackboard/core/edit/BasePageControl;

    iput-object p2, p0, Lcom/zykj/blackboard/core/edit/a;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/a;->a:Lcom/zykj/blackboard/core/edit/BasePageControl;

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/a;->b:Lx7/a;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->a(Lcom/zykj/blackboard/core/edit/BasePageControl;Lx7/a;)V

    return-void
.end method
