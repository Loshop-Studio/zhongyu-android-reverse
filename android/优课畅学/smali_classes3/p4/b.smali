.class public final synthetic Lp4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/dialog/CatalogDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/dialog/CatalogDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp4/b;->a:Lcom/zykj/study/dialog/CatalogDialog;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lp4/b;->a:Lcom/zykj/study/dialog/CatalogDialog;

    invoke-static {v0, p1}, Lcom/zykj/study/dialog/CatalogDialog;->g(Lcom/zykj/study/dialog/CatalogDialog;Landroid/view/View;)V

    return-void
.end method
