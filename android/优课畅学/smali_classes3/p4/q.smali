.class public final synthetic Lp4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/ExerciseFinishDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/q;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/q;->a:Lcom/zykj/study/dialog/ExerciseFinishDialog;

    invoke-static {v0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->h(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
