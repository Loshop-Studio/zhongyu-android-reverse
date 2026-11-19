.class public final synthetic Lp4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/CatalogDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/dialog/CatalogDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/c;->a:Lcom/zykj/study/dialog/CatalogDialog;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/c;->a:Lcom/zykj/study/dialog/CatalogDialog;

    check-cast p1, Ljava/lang/Integer;

    invoke-static {v0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->h(Lcom/zykj/study/dialog/CatalogDialog;Ljava/lang/Integer;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
