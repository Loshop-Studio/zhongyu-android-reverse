.class public final synthetic Lc4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/StudentPaintFragment;

.field public final synthetic d:Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/g;->c:Lcom/friday/paint/view/StudentPaintFragment;

    iput-object p2, p0, Lc4/g;->d:Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc4/g;->c:Lcom/friday/paint/view/StudentPaintFragment;

    iget-object v1, p0, Lc4/g;->d:Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;

    invoke-static {v0, v1}, Lcom/friday/paint/view/StudentPaintFragment;->o1(Lcom/friday/paint/view/StudentPaintFragment;Lcom/friday/paint/dialog/HomeworkSubmitConfirmDialog;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
