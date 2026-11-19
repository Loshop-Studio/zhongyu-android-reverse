.class public final synthetic Lcom/zykj/study/data/h1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/h1;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/study/data/h1;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/study/data/h1;->c:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/h1;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/study/data/h1;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/study/data/h1;->c:Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;->e(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/data/SearchHistoryEntityDao_Impl;Landroidx/sqlite/SQLiteConnection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
