.class public final synthetic Lkb/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardFragment;

.field public final synthetic d:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/l;->c:Lcom/zykj/view/board/board/BoardFragment;

    iput-object p2, p0, Lkb/l;->d:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lkb/l;->c:Lcom/zykj/view/board/board/BoardFragment;

    iget-object v1, p0, Lkb/l;->d:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment;->G(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method
