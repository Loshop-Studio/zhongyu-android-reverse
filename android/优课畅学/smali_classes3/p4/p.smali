.class public final synthetic Lp4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/ExerciseFinishDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/p;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/p;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->i(Lcom/zykj/study/dialog/ExerciseFinishDialog;Landroid/view/View;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
