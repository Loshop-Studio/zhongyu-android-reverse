.class public final synthetic Lt5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Le7/o0;

.field public final synthetic b:Z

.field public final synthetic c:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/o;->a:Le7/o0;

    iput-boolean p2, p0, Lt5/o;->b:Z

    iput-object p3, p0, Lt5/o;->c:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    iput-object p4, p0, Lt5/o;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lt5/o;->a:Le7/o0;

    iget-boolean v1, p0, Lt5/o;->b:Z

    iget-object v2, p0, Lt5/o;->c:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    iget-object v3, p0, Lt5/o;->d:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroid/webkit/WebView;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->h(Le7/o0;ZLcom/zykj/evaluation/ui/board/SketchDraftFragment;Lkotlin/jvm/functions/Function1;Landroid/webkit/WebView;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
