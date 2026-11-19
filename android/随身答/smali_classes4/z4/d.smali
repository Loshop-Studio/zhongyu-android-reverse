.class public final synthetic Lz4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lkotlin/jvm/functions/Function3;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/d;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iput-object p2, p0, Lz4/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lz4/d;->c:Lkotlin/jvm/functions/Function3;

    iput-object p4, p0, Lz4/d;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lz4/d;->a:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    iget-object v1, p0, Lz4/d;->b:Ljava/lang/String;

    iget-object v2, p0, Lz4/d;->c:Lkotlin/jvm/functions/Function3;

    iget-object v3, p0, Lz4/d;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->a(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
