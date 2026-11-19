.class public final synthetic Ln4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/a;

.field public final synthetic b:Lr0/b;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/a;Lr0/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/o;->a:Lcom/zykj/study/adapter/a;

    iput-object p2, p0, Ln4/o;->b:Lr0/b;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/o;->a:Lcom/zykj/study/adapter/a;

    iget-object v1, p0, Ln4/o;->b:Lr0/b;

    invoke-static {v0, v1, p1}, Lcom/zykj/study/adapter/a;->u(Lcom/zykj/study/adapter/a;Lr0/b;Landroid/view/View;)V

    return-void
.end method
