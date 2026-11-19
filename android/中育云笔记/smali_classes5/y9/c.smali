.class public final synthetic Ly9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/edit/BasePageControl;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/c;->c:Lcom/zykj/blackboard/core/edit/BasePageControl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly9/c;->c:Lcom/zykj/blackboard/core/edit/BasePageControl;

    invoke-static {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->H(Lcom/zykj/blackboard/core/edit/BasePageControl;)V

    return-void
.end method
