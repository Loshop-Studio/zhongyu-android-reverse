.class public final synthetic Lcom/zykj/sketch/core/record/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Lcom/zykj/sketch/core/record/RecordControl;

.field public final synthetic f:Lhd/l;


# direct methods
.method public synthetic constructor <init>(IILcom/zykj/sketch/core/record/RecordControl;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/sketch/core/record/b;->c:I

    iput p2, p0, Lcom/zykj/sketch/core/record/b;->d:I

    iput-object p3, p0, Lcom/zykj/sketch/core/record/b;->e:Lcom/zykj/sketch/core/record/RecordControl;

    iput-object p4, p0, Lcom/zykj/sketch/core/record/b;->f:Lhd/l;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/record/b;->c:I

    iget v1, p0, Lcom/zykj/sketch/core/record/b;->d:I

    iget-object v2, p0, Lcom/zykj/sketch/core/record/b;->e:Lcom/zykj/sketch/core/record/RecordControl;

    iget-object v3, p0, Lcom/zykj/sketch/core/record/b;->f:Lhd/l;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/RecordControl;->b(IILcom/zykj/sketch/core/record/RecordControl;Lhd/l;)V

    return-void
.end method
