.class public final synthetic Ln5/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;

.field public final synthetic b:Ln5/o;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Ln5/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/r;->a:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;

    iput-object p2, p0, Ln5/r;->b:Ln5/o;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln5/r;->a:Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;

    iget-object v1, p0, Ln5/r;->b:Ln5/o;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;->h(Lcom/zykj/evaluation/di/entity/UploadCorrectSelfQuestionDao_Impl;Ln5/o;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
