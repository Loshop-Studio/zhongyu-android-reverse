.class public final synthetic Lf5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/view/KnowledgeProgressView;

.field public final synthetic b:Lcom/zykj/study/bean/course/CatalogBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/view/KnowledgeProgressView;Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/l;->a:Lcom/zykj/study/view/KnowledgeProgressView;

    iput-object p2, p0, Lf5/l;->b:Lcom/zykj/study/bean/course/CatalogBean;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf5/l;->a:Lcom/zykj/study/view/KnowledgeProgressView;

    iget-object v1, p0, Lf5/l;->b:Lcom/zykj/study/bean/course/CatalogBean;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/view/KnowledgeProgressView;->a(Lcom/zykj/study/view/KnowledgeProgressView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)V

    return-void
.end method
