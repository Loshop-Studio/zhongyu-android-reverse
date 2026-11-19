.class public final synthetic Lcom/zykj/sketch/core/record/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/a;

.field public final synthetic c:Lcom/zykj/sketch/core/record/SketchRecorderView;


# direct methods
.method public synthetic constructor <init>(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/sketch/core/record/c;->a:I

    iput-object p1, p0, Lcom/zykj/sketch/core/record/c;->b:Lr6/a;

    iput-object p2, p0, Lcom/zykj/sketch/core/record/c;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/record/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/sketch/core/record/c;->b:Lr6/a;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/c;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->h(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/sketch/core/record/c;->b:Lr6/a;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/c;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->d(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/c;->b:Lr6/a;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/c;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->f(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/zykj/sketch/core/record/c;->b:Lr6/a;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/c;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    invoke-static {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->e(Lr6/a;Lcom/zykj/sketch/core/record/SketchRecorderView;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
