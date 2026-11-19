.class public final synthetic Lw9/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/canvas/view/FixView;

.field public final synthetic d:Landroid/graphics/Bitmap;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/view/FixView;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw9/d;->c:Lcom/zykj/blackboard/core/canvas/view/FixView;

    iput-object p2, p0, Lw9/d;->d:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw9/d;->c:Lcom/zykj/blackboard/core/canvas/view/FixView;

    iget-object v1, p0, Lw9/d;->d:Landroid/graphics/Bitmap;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/canvas/view/FixView;->c(Lcom/zykj/blackboard/core/canvas/view/FixView;Landroid/graphics/Bitmap;)V

    return-void
.end method
