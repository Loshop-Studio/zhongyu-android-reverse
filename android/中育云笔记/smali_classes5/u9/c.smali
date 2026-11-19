.class public final synthetic Lu9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lhd/q;

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lhd/q;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu9/c;->c:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iput-object p2, p0, Lu9/c;->d:Ljava/lang/String;

    iput-object p3, p0, Lu9/c;->e:Lhd/q;

    iput-object p4, p0, Lu9/c;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu9/c;->c:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iget-object v1, p0, Lu9/c;->d:Ljava/lang/String;

    iget-object v2, p0, Lu9/c;->e:Lhd/q;

    iget-object v3, p0, Lu9/c;->f:Lhd/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->a(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lhd/q;Lhd/l;)V

    return-void
.end method
