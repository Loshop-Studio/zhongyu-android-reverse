.class public final synthetic Lc3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/record/TimeRecord;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/record/TimeRecord;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc3/a;->a:Lcom/zykj/blackboard/core/record/TimeRecord;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc3/a;->a:Lcom/zykj/blackboard/core/record/TimeRecord;

    invoke-static {v0}, Lcom/zykj/blackboard/core/record/TimeRecord;->a(Lcom/zykj/blackboard/core/record/TimeRecord;)V

    return-void
.end method
