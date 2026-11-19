.class public final synthetic Lcom/zykj/study/data/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/data/AppDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/data/AppDatabase_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/j;->a:Lcom/zykj/study/data/AppDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/j;->a:Lcom/zykj/study/data/AppDatabase_Impl;

    invoke-static {v0}, Lcom/zykj/study/data/AppDatabase_Impl;->i(Lcom/zykj/study/data/AppDatabase_Impl;)Lcom/zykj/study/data/PdfDao_Impl;

    move-result-object v0

    return-object v0
.end method
