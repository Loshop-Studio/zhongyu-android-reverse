.class public final synthetic Ln5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;

.field public final synthetic b:Ln5/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;Ln5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln5/e;->a:Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;

    iput-object p2, p0, Ln5/e;->b:Ln5/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln5/e;->a:Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;

    iget-object v1, p0, Ln5/e;->b:Ln5/a;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;->g(Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;Ln5/a;Landroidx/sqlite/SQLiteConnection;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
