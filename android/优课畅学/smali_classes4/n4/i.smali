.class public final synthetic Ln4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/CatalogGradeAdapter;

.field public final synthetic b:Lcom/zykj/study/bean/SelectModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/CatalogGradeAdapter;Lcom/zykj/study/bean/SelectModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/i;->a:Lcom/zykj/study/adapter/CatalogGradeAdapter;

    iput-object p2, p0, Ln4/i;->b:Lcom/zykj/study/bean/SelectModel;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/i;->a:Lcom/zykj/study/adapter/CatalogGradeAdapter;

    iget-object v1, p0, Ln4/i;->b:Lcom/zykj/study/bean/SelectModel;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/CatalogGradeAdapter;->c(Lcom/zykj/study/adapter/CatalogGradeAdapter;Lcom/zykj/study/bean/SelectModel;Landroid/view/View;)V

    return-void
.end method
