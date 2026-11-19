.class public final synthetic Lcom/zykj/study/data/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/data/q;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/study/data/q;->b:Ljava/lang/String;

    iput p3, p0, Lcom/zykj/study/data/q;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/data/q;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/zykj/study/data/q;->b:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/data/q;->c:I

    check-cast p1, Landroidx/sqlite/SQLiteConnection;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/data/CatalogEntityDao_Impl;->f(Ljava/lang/String;Ljava/lang/String;ILandroidx/sqlite/SQLiteConnection;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
