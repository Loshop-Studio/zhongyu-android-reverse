.class public final synthetic Lcom/zykj/view/board/board/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/board/d;->a:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/d;->a:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardFragment$initExtraClickListener$3$5$1$1;->a(Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
