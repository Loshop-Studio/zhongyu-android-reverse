.class public final synthetic Lcom/zykj/sketch/core/record/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/sketch/core/record/RecordControl;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(IILcom/zykj/sketch/core/record/RecordControl;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/sketch/core/record/b;->a:I

    iput p2, p0, Lcom/zykj/sketch/core/record/b;->b:I

    iput-object p3, p0, Lcom/zykj/sketch/core/record/b;->c:Lcom/zykj/sketch/core/record/RecordControl;

    iput-object p4, p0, Lcom/zykj/sketch/core/record/b;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/zykj/sketch/core/record/b;->a:I

    iget v1, p0, Lcom/zykj/sketch/core/record/b;->b:I

    iget-object v2, p0, Lcom/zykj/sketch/core/record/b;->c:Lcom/zykj/sketch/core/record/RecordControl;

    iget-object v3, p0, Lcom/zykj/sketch/core/record/b;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/sketch/core/record/RecordControl;->b(IILcom/zykj/sketch/core/record/RecordControl;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
