.class public final synthetic Lcom/zykj/sketch/core/record/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx7/a;

.field public final synthetic b:Lcom/zykj/sketch/core/record/SketchRecorderView;


# direct methods
.method public synthetic constructor <init>(Lx7/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/record/i;->a:Lx7/a;

    iput-object p2, p0, Lcom/zykj/sketch/core/record/i;->b:Lcom/zykj/sketch/core/record/SketchRecorderView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/i;->a:Lx7/a;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/i;->b:Lcom/zykj/sketch/core/record/SketchRecorderView;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->h(Lx7/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void
.end method
