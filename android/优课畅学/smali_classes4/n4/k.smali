.class public final synthetic Ln4/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/bean/SelectModel;

.field public final synthetic b:Lcom/zykj/study/adapter/CatalogProgressAdapter;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/k;->a:Lcom/zykj/study/bean/SelectModel;

    iput-object p2, p0, Ln4/k;->b:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    iput p3, p0, Ln4/k;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ln4/k;->a:Lcom/zykj/study/bean/SelectModel;

    iget-object v1, p0, Ln4/k;->b:Lcom/zykj/study/adapter/CatalogProgressAdapter;

    iget v2, p0, Ln4/k;->c:I

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/adapter/CatalogProgressAdapter;->c(Lcom/zykj/study/bean/SelectModel;Lcom/zykj/study/adapter/CatalogProgressAdapter;ILandroid/view/View;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
