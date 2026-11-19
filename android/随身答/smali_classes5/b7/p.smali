.class public final synthetic Lb7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardFragment;

.field public final synthetic b:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/p;->a:Lcom/zykj/view/board/board/BoardFragment;

    iput-object p2, p0, Lb7/p;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lb7/p;->a:Lcom/zykj/view/board/board/BoardFragment;

    iget-object v1, p0, Lb7/p;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment;->B(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroid/view/View;)V

    return-void
.end method
