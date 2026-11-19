.class public final synthetic Lw4/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/study/bean/exercise/MicroBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/p0;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    iput p2, p0, Lw4/p0;->b:I

    iput-object p3, p0, Lw4/p0;->c:Ljava/lang/String;

    iput-object p4, p0, Lw4/p0;->d:Lcom/zykj/study/bean/exercise/MicroBean;

    return-void
.end method


# virtual methods
.method public final a(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lw4/p0;->a:Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;

    iget v1, p0, Lw4/p0;->b:I

    iget-object v2, p0, Lw4/p0;->c:Ljava/lang/String;

    iget-object v3, p0, Lw4/p0;->d:Lcom/zykj/study/bean/exercise/MicroBean;

    move-object v4, p1

    move-object v5, p2

    invoke-static/range {v0 .. v5}, Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;->u(Lcom/zykj/study/ui/home/exercise/ExerciseViewerFragment;ILjava/lang/String;Lcom/zykj/study/bean/exercise/MicroBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method
