.class public final synthetic La4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/d;->c:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    iput-boolean p2, p0, La4/d;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, La4/d;->c:Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;

    iget-boolean v1, p0, La4/d;->d:Z

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, v1, p1}, Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;->v(Lcom/friday/paint/dialog/ObjectiveHomeworkSubmitDialog;ZLjava/lang/Boolean;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
