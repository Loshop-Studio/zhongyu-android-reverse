.class public final synthetic Lf5/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/view/KnowledgeView;

.field public final synthetic b:Lcom/zykj/study/bean/course/CatalogBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/view/KnowledgeView;Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf5/m;->a:Lcom/zykj/study/view/KnowledgeView;

    iput-object p2, p0, Lf5/m;->b:Lcom/zykj/study/bean/course/CatalogBean;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lf5/m;->a:Lcom/zykj/study/view/KnowledgeView;

    iget-object v1, p0, Lf5/m;->b:Lcom/zykj/study/bean/course/CatalogBean;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/view/KnowledgeView;->a(Lcom/zykj/study/view/KnowledgeView;Lcom/zykj/study/bean/course/CatalogBean;Landroid/view/View;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
