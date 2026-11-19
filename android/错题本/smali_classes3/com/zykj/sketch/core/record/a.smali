.class public final synthetic Lcom/zykj/sketch/core/record/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/sketch/core/record/RecordControl;

.field public final synthetic d:Lr6/c;


# direct methods
.method public synthetic constructor <init>(IILcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/sketch/core/record/a;->a:I

    iput p2, p0, Lcom/zykj/sketch/core/record/a;->b:I

    iput-object p3, p0, Lcom/zykj/sketch/core/record/a;->c:Lcom/zykj/sketch/core/record/RecordControl;

    iput-object p4, p0, Lcom/zykj/sketch/core/record/a;->d:Lr6/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/a;->c:Lcom/zykj/sketch/core/record/RecordControl;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/a;->d:Lr6/c;

    iget v2, p0, Lcom/zykj/sketch/core/record/a;->a:I

    iget v3, p0, Lcom/zykj/sketch/core/record/a;->b:I

    invoke-static {v2, v3, v0, v1}, Lcom/zykj/sketch/core/record/RecordControl;->b(IILcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V

    return-void
.end method
