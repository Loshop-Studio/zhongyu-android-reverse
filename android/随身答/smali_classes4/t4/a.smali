.class public final synthetic Lt4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic a:Lcom/zykj/base/event/SingleLiveEvent;

.field public final synthetic b:Landroidx/lifecycle/Observer;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/base/event/SingleLiveEvent;Landroidx/lifecycle/Observer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/a;->a:Lcom/zykj/base/event/SingleLiveEvent;

    iput-object p2, p0, Lt4/a;->b:Landroidx/lifecycle/Observer;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt4/a;->a:Lcom/zykj/base/event/SingleLiveEvent;

    iget-object v1, p0, Lt4/a;->b:Landroidx/lifecycle/Observer;

    invoke-static {v0, v1, p1}, Lcom/zykj/base/event/SingleLiveEvent;->a(Lcom/zykj/base/event/SingleLiveEvent;Landroidx/lifecycle/Observer;Ljava/lang/Object;)V

    return-void
.end method
