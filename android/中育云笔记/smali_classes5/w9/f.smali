.class public final synthetic Lw9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/canvas/view/MaskView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/view/MaskView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw9/f;->c:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw9/f;->c:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    invoke-static {v0}, Lcom/zykj/blackboard/core/canvas/view/MaskView;->b(Lcom/zykj/blackboard/core/canvas/view/MaskView;)V

    return-void
.end method
