.class public final synthetic Ln4/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/a;

.field public final synthetic b:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

.field public final synthetic c:Lr0/b;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/a;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/p;->a:Lcom/zykj/study/adapter/a;

    iput-object p2, p0, Ln4/p;->b:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    iput-object p3, p0, Ln4/p;->c:Lr0/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Ln4/p;->a:Lcom/zykj/study/adapter/a;

    iget-object v1, p0, Ln4/p;->b:Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    iget-object v2, p0, Ln4/p;->c:Lr0/b;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/study/adapter/a;->v(Lcom/zykj/study/adapter/a;Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lr0/b;Landroid/view/View;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
