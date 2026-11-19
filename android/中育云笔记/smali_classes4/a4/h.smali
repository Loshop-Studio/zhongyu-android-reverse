.class public final synthetic La4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/h;->c:Ljava/util/List;

    iput-object p2, p0, La4/h;->d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, La4/h;->c:Ljava/util/List;

    iget-object v1, p0, La4/h;->d:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    invoke-static {v0, v1, p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->t(Ljava/util/List;Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Landroid/view/View;)V

    return-void
.end method
