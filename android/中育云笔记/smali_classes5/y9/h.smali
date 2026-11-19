.class public final synthetic Ly9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly9/h;->c:Ljava/util/ArrayList;

    iput-boolean p2, p0, Ly9/h;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly9/h;->c:Ljava/util/ArrayList;

    iget-boolean v1, p0, Ly9/h;->d:Z

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/edit/BoardControl;->i(Ljava/util/ArrayList;Z)V

    return-void
.end method
