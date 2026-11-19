.class public final synthetic Lcom/zykj/sketch/core/record/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/sketch/core/record/SketchRecorderView;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lhd/l;

.field public final synthetic f:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lhd/l;Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/record/e;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    iput-object p2, p0, Lcom/zykj/sketch/core/record/e;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/sketch/core/record/e;->e:Lhd/l;

    iput-object p4, p0, Lcom/zykj/sketch/core/record/e;->f:Lhd/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/e;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/e;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/sketch/core/record/e;->e:Lhd/l;

    iget-object v3, p0, Lcom/zykj/sketch/core/record/e;->f:Lhd/a;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->b(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lhd/l;Lhd/a;)V

    return-void
.end method
