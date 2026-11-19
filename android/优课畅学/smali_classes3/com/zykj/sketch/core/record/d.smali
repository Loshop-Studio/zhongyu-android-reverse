.class public final synthetic Lcom/zykj/sketch/core/record/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/core/record/SketchRecorderView;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lx7/l;

.field public final synthetic d:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lx7/l;Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/record/d;->a:Lcom/zykj/sketch/core/record/SketchRecorderView;

    iput-object p2, p0, Lcom/zykj/sketch/core/record/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/sketch/core/record/d;->c:Lx7/l;

    iput-object p4, p0, Lcom/zykj/sketch/core/record/d;->d:Lx7/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/d;->a:Lcom/zykj/sketch/core/record/SketchRecorderView;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/sketch/core/record/d;->c:Lx7/l;

    iget-object v3, p0, Lcom/zykj/sketch/core/record/d;->d:Lx7/a;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/SketchRecorderView;->g(Lcom/zykj/sketch/core/record/SketchRecorderView;Ljava/lang/String;Lx7/l;Lx7/a;)V

    return-void
.end method
