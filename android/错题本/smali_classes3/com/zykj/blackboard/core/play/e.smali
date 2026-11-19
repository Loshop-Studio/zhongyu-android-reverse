.class public final synthetic Lcom/zykj/blackboard/core/play/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr6/a;


# direct methods
.method public synthetic constructor <init>(Lr6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/e;->a:Lr6/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/e;->a:Lr6/a;

    invoke-static {v0}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->b(Lr6/a;)V

    return-void
.end method
