.class public final synthetic Lcom/zykj/sketch/core/record/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/sketch/core/record/SketchRecorderView;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/sketch/core/config/SketchConfig;

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/record/j;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    iput-object p2, p0, Lcom/zykj/sketch/core/record/j;->d:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/sketch/core/record/j;->e:Lcom/zykj/sketch/core/config/SketchConfig;

    iput-object p4, p0, Lcom/zykj/sketch/core/record/j;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/j;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/j;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/sketch/core/record/j;->e:Lcom/zykj/sketch/core/config/SketchConfig;

    iget-object v3, p0, Lcom/zykj/sketch/core/record/j;->f:Lhd/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->c(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lcom/zykj/sketch/core/config/SketchConfig;Lhd/l;)V

    return-void
.end method
