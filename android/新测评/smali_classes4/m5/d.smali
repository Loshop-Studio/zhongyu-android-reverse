.class public final synthetic Lm5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/di/AppDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/di/AppDatabase_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm5/d;->a:Lcom/zykj/evaluation/di/AppDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm5/d;->a:Lcom/zykj/evaluation/di/AppDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/evaluation/di/AppDatabase_Impl;->m(Lcom/zykj/evaluation/di/AppDatabase_Impl;)Lcom/zykj/evaluation/di/entity/SubmitTaskDao_Impl;

    move-result-object v0

    return-object v0
.end method
