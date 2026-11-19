.class public final synthetic Lp4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/ExerciseFinishDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/o;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    return-void
.end method


# virtual methods
.method public final onConfigureTab(Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/o;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->f(Lcom/zykj/study/dialog/ExerciseFinishDialog;Lcom/google/android/material/tabs/TabLayout$Tab;I)V

    return-void
.end method
